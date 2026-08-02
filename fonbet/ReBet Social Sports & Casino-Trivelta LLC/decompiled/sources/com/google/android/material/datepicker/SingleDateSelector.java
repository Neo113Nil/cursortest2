package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import sa.AbstractC6344a;

/* loaded from: classes3.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f35282a;

    /* renamed from: b, reason: collision with root package name */
    public Long f35283b;

    /* renamed from: c, reason: collision with root package name */
    public SimpleDateFormat f35284c;

    public class a extends e {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s f35285i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f35286j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, s sVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f35285i = sVar;
            this.f35286j = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.e
        public void d() {
            SingleDateSelector.this.f35282a = this.f35286j.getError();
            this.f35285i.a();
        }

        @Override // com.google.android.material.datepicker.e
        public void e(Long l10) {
            if (l10 == null) {
                SingleDateSelector.this.d();
            } else {
                SingleDateSelector.this.c0(l10.longValue());
            }
            SingleDateSelector.this.f35282a = null;
            this.f35285i.b(SingleDateSelector.this.W());
        }
    }

    public class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f35283b = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String F(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f35283b;
        if (l10 == null) {
            return resources.getString(ia.k.f48501G);
        }
        return resources.getString(ia.k.f48499E, h.k(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection G() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, s sVar) {
        View inflate = layoutInflater.inflate(ia.i.f48467D, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(ia.g.f48410R);
        EditText editText = textInputLayout.getEditText();
        Integer f10 = AbstractC6344a.f(inflate.getContext(), ia.c.f48252p);
        if (f10 != null) {
            editText.setHintTextColor(f10.intValue());
        }
        if (xa.e.b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = this.f35284c;
        boolean z10 = simpleDateFormat != null;
        if (!z10) {
            simpleDateFormat = w.f();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        String pattern = z10 ? simpleDateFormat2.toPattern() : w.g(inflate.getResources(), simpleDateFormat2);
        textInputLayout.setPlaceholderText(pattern);
        Long l10 = this.f35283b;
        if (l10 != null) {
            editText.setText(simpleDateFormat2.format(l10));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat2, textInputLayout, calendarConstraints, sVar, textInputLayout));
        if (!DateSelector.D(inflate.getContext())) {
            DateSelector.M(editText);
        }
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean S() {
        return this.f35283b != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection T() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.f35283b;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void c0(long j10) {
        this.f35283b = Long.valueOf(j10);
    }

    public final void d() {
        this.f35283b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long W() {
        return this.f35283b;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void H(Long l10) {
        this.f35283b = l10 == null ? null : Long.valueOf(w.a(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int t() {
        return ia.k.f48500F;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f35283b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String x(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.f35283b;
        return resources.getString(ia.k.f48497C, l10 == null ? resources.getString(ia.k.f48498D) : h.k(l10.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int z(Context context) {
        return Ca.b.f(context, ia.c.f48206K, n.class.getCanonicalName());
    }
}
