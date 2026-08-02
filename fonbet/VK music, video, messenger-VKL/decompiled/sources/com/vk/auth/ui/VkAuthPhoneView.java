package com.vk.auth.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.auth.common.R$styleable;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.auth.utils.VkAuthPhone;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.core.serialize.Serializer;
import com.vkontakte.android.R;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import xsna.alj0;
import xsna.drm0;
import xsna.f3a0;
import xsna.f4m;
import xsna.gzs;
import xsna.hnj;
import xsna.jjc;
import xsna.lzl0;
import xsna.m2l0;
import xsna.o060;
import xsna.qno0;
import xsna.s3q0;
import xsna.tx;

/* compiled from: VkAuthPhoneView.kt */
/* loaded from: classes15.dex */
public class VkAuthPhoneView extends FrameLayout {
    public static final Regex q = new Regex("[7-8][0-9]{10}");
    public static final Regex r = new Regex("[7-8]");
    public boolean b;
    public final TextView c;
    public final View d;
    public final TextView e;
    public final EditText f;
    public final VkAuthExtendedEditText g;
    public final View h;
    public tx i;
    public final ArrayList j;
    public Country k;
    public final f l;
    public final b m;
    public final io.michaelrocks.libphonenumber.android.a n;
    public boolean o;
    public boolean p;

    /* compiled from: VkAuthPhoneView.kt */
    public final class a implements TextWatcher {
        public final TextWatcher b;

        public a(TextWatcher textWatcher) {
            this.b = textWatcher;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (VkAuthPhoneView.this.o) {
                return;
            }
            this.b.afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (VkAuthPhoneView.this.o) {
                return;
            }
            this.b.beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (VkAuthPhoneView.this.o) {
                return;
            }
            this.b.onTextChanged(charSequence, i, i2, i3);
        }
    }

    public VkAuthPhoneView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        this.j = new ArrayList();
        this.k = Country.f;
        this.l = new f();
        this.m = new b();
        this.n = new io.michaelrocks.libphonenumber.android.a(f3a0.a.a(getContext()), "");
        LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_country_phone_layout, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.choose_country);
        this.c = textView;
        this.d = findViewById(R.id.phone_container);
        TextView textView2 = (TextView) findViewById(R.id.phone_code);
        this.e = textView2;
        EditText editText = (EditText) findViewById(R.id.phone_edit_text);
        this.f = editText;
        this.h = findViewById(R.id.separator);
        this.g = (VkAuthExtendedEditText) findViewById(R.id.parent_phone_edit_text);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
        try {
            setHideCountryField(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
            c(false);
            editText.setImeOptions(33554432);
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.tcu0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    Regex regex = VkAuthPhoneView.q;
                    VkAuthPhoneView vkAuthPhoneView = VkAuthPhoneView.this;
                    vkAuthPhoneView.c(z);
                    vkAuthPhoneView.g.a(z);
                    Iterator it = vkAuthPhoneView.j.iterator();
                    while (it.hasNext()) {
                        ((izs) it.next()).invoke(Boolean.valueOf(z));
                    }
                }
            });
            jjc.g(textView2, new lzl0(this, 15));
            jjc.g(textView, new alj0(this, 27));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setCountry(Country country) {
        this.k = country;
        this.l.onNext(country);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.String] */
    public final void a() {
        if (this.o) {
            return;
        }
        EditText editText = this.f;
        int selectionStart = editText.getSelectionStart();
        if (selectionStart == 0 || selectionStart == editText.getText().length()) {
            String phoneWithCode = getPhoneWithCode();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = VkPhoneFormatUtils.a(getContext(), phoneWithCode, this.n, null, 16);
            String str = this.k.c;
            int i = 0;
            int i2 = 0;
            while (i < ((String) ref$ObjectRef.element).length() && i2 < str.length()) {
                int i3 = i + 1;
                if (((String) ref$ObjectRef.element).charAt(i) == str.charAt(i2)) {
                    i2++;
                }
                i = i3;
            }
            ref$ObjectRef.element = drm0.p0(((String) ref$ObjectRef.element).substring(i)).toString();
            this.o = true;
            try {
                editText.setText((CharSequence) ref$ObjectRef.element);
                editText.setSelection(editText.getText().length());
                s3q0 s3q0Var = s3q0.a;
            } finally {
                this.o = false;
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void b(Country country) {
        setCountry(country);
        this.c.setText(country.e);
        String str = "+" + country.c;
        TextView textView = this.e;
        textView.setText(str);
        textView.setContentDescription(getContext().getString(R.string.vk_auth_sign_up_country_code_content_description, str));
        a();
    }

    public final void c(boolean z) {
        this.d.setBackgroundResource(this.p ? R.drawable.vk_auth_bg_edittext_error : !this.b ? R.drawable.vk_auth_bg_edittext_bottom : z ? R.drawable.vk_auth_bg_edittext_focused : R.drawable.vk_auth_bg_edittext);
    }

    public final Country getCountry() {
        return this.k;
    }

    public final boolean getHideCountryField() {
        return this.b;
    }

    public final VkAuthPhone getPhone() {
        return new VkAuthPhone(getCountry(), getPhoneWithoutCode());
    }

    public final String getPhoneWithCode() {
        Serializer.c<VkAuthPhone> cVar = VkAuthPhone.CREATOR;
        Country country = getCountry();
        return "+".concat(country.c) + getPhoneWithoutCode();
    }

    public final String getPhoneWithoutCode() {
        return PhoneNumberUtil.q(this.f.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m.b(new qno0(this.f).subscribe(new o060(new m2l0(this, 21), 22)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.m.e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        CustomState customState = (CustomState) parcelable;
        super.onRestoreInstanceState(customState.getSuperState());
        setCountry(customState.b);
        b(this.k);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CustomState customState = new CustomState(super.onSaveInstanceState());
        customState.b = this.k;
        return customState;
    }

    public final void setChooseCountryClickListener(gzs<s3q0> gzsVar) {
        this.i = new tx(23, this, gzsVar);
    }

    public final void setChooseCountryEnable(boolean z) {
        float f = z ? 1.0f : 0.4f;
        TextView textView = this.e;
        textView.setAlpha(f);
        textView.setEnabled(z);
        TextView textView2 = this.c;
        textView2.setAlpha(f);
        textView2.setEnabled(z);
    }

    public final void setHideCountryField(boolean z) {
        View view = this.h;
        TextView textView = this.c;
        if (z) {
            f4m.j(textView);
            f4m.j(view);
        } else {
            textView.setVisibility(0);
            view.setVisibility(0);
        }
        this.b = z;
    }

    /* compiled from: VkAuthPhoneView.kt */
    public static final class CustomState extends View.BaseSavedState {
        public static final Parcelable.Creator<CustomState> CREATOR = new a();
        public Country b;

        /* compiled from: VkAuthPhoneView.kt */
        public static final class a implements Parcelable.Creator<CustomState> {
            @Override // android.os.Parcelable.Creator
            public final CustomState createFromParcel(Parcel parcel) {
                return new CustomState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomState[] newArray(int i) {
                return new CustomState[i];
            }
        }

        public CustomState(Parcelable parcelable) {
            super(parcelable);
            Parcelable.Creator<Country> creator = Country.CREATOR;
            this.b = Country.f;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.b, 0);
        }

        public CustomState(Parcel parcel) {
            super(parcel);
            Parcelable.Creator<Country> creator = Country.CREATOR;
            this.b = Country.f;
            this.b = (Country) parcel.readParcelable(Country.class.getClassLoader());
        }
    }
}
