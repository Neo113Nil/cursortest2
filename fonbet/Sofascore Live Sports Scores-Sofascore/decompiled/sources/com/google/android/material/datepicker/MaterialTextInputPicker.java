package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import defpackage.jr2;
import defpackage.lhk;
import defpackage.o3a;
import defpackage.rj4;
import defpackage.vhh;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int b;
    public DateSelector c;
    public CalendarConstraints d;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if ((r14 != null ? r14.toLowerCase(java.util.Locale.ENGLISH) : "").equals(com.appsflyer.sdk_base.referrer.Payload.SOURCE_SAMSUNG) != false) goto L16;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.b));
        DateSelector dateSelector = this.c;
        CalendarConstraints calendarConstraints = this.d;
        i iVar = new i(this);
        SingleDateSelector singleDateSelector = (SingleDateSelector) dateSelector;
        singleDateSelector.getClass();
        View inflate = cloneInContext.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer v = o3a.v(R.attr.colorOnSurfaceVariant, inflate.getContext());
        if (v != null) {
            editText.setHintTextColor(v.intValue());
        }
        String str = Build.MANUFACTURER;
        if (!(str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
        }
        editText.setInputType(17);
        AtomicReference atomicReference = lhk.a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        Resources resources = inflate.getResources();
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", PlayerKt.FOOTBALL_MIDFIELDER).replaceAll("y+", "y");
        }
        String replace = pattern.replace("d", string3).replace(PlayerKt.FOOTBALL_MIDFIELDER, string2).replace("y", string);
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.setPlaceholderText(spannableString);
        Long l = singleDateSelector.a;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
        editText.addTextChangedListener(new vhh(singleDateSelector, replace, simpleDateFormat, textInputLayout, calendarConstraints, iVar, textInputLayout));
        AccessibilityManager accessibilityManager = (AccessibilityManager) inflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return inflate;
        }
        EditText[] editTextArr = {editText};
        editTextArr[0].setOnFocusChangeListener(new jr2(editTextArr, 2));
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new rj4(0, editText2), 100L);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
    }
}
