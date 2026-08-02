package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import xsna.gs2;
import xsna.i1l;
import xsna.jl10;
import xsna.l2r0;
import xsna.lvo0;
import xsna.otj0;
import xsna.vm10;

/* loaded from: classes13.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new a();

    @Nullable
    public Long b;

    public class a implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void B8(long j) {
        this.b = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final String T4(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.b;
        if (l == null) {
            return resources.getString(R$string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R$string.mtrl_picker_date_header_selected, i1l.a(l.longValue()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if ((r0 != null ? r0.toLowerCase(java.util.Locale.ENGLISH) : "").equals("samsung") != false) goto L13;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View e3(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, CalendarConstraints calendarConstraints, @NonNull vm10.a aVar) {
        View inflate = layoutInflater.inflate(R$layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R$id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        String str = Build.MANUFACTURER;
        if (!(str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
        }
        editText.setInputType(17);
        AtomicReference<lvo0> atomicReference = l2r0.a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        Resources resources = inflate.getResources();
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R$string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R$string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R$string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        String replace = pattern.replace("d", string3).replace("M", string2).replace("y", string);
        textInputLayout.setPlaceholderText(replace);
        Long l = this.b;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
        }
        editText.addTextChangedListener(new otj0(this, replace, simpleDateFormat, textInputLayout, calendarConstraints, aVar, textInputLayout));
        final EditText[] editTextArr = {editText};
        editTextArr[0].setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.f1l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                for (EditText editText2 : editTextArr) {
                    if (editText2.hasFocus()) {
                        return;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        });
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new gs2(editText2, 8), 100L);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int g2(Context context) {
        return jl10.c(context, R$attr.materialCalendarTheme, g.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final ArrayList ia() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean j8() {
        return this.b != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final String q4(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.b;
        return resources.getString(R$string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R$string.mtrl_picker_announce_current_selection_none) : i1l.a(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public final Long q8() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public final ArrayList x3() {
        ArrayList arrayList = new ArrayList();
        Long l = this.b;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }
}
