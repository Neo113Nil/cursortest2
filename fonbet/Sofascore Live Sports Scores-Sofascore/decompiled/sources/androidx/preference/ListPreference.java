package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import com.sofascore.results.R;
import defpackage.jjf;
import defpackage.k03;
import defpackage.m4f;
import defpackage.r4a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] S;
    public final CharSequence[] T;
    public String U;
    public String V;
    public boolean W;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();
        public String a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jjf.e, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.S = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.T = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            k03 k03Var = k03.s;
            if (k03Var == null) {
                k03Var = new k03();
                k03.s = k03Var;
            }
            this.K = k03Var;
            g();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, jjf.g, i, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.V = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    public final void A(String str) {
        boolean equals = TextUtils.equals(this.U, str);
        if (equals && this.W) {
            return;
        }
        this.U = str;
        this.W = true;
        s(str);
        if (equals) {
            return;
        }
        g();
    }

    @Override // androidx.preference.Preference
    public final CharSequence e() {
        CharSequence[] charSequenceArr;
        m4f m4fVar = this.K;
        if (m4fVar != null) {
            return m4fVar.c(this);
        }
        int z = z(this.U);
        CharSequence charSequence = (z < 0 || (charSequenceArr = this.S) == null) ? null : charSequenceArr[z];
        CharSequence e = super.e();
        String str = this.V;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String format = String.format(str, charSequence);
            if (!TextUtils.equals(format, e)) {
                return format;
            }
        }
        return e;
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.o(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.o(savedState.getSuperState());
        A(savedState.a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable p() {
        super.p();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.q) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.a = this.U;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void q(Object obj) {
        A(d((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void u(CharSequence charSequence) {
        super.u(charSequence);
        if (charSequence == null) {
            this.V = null;
        } else {
            this.V = ((String) charSequence).toString();
        }
    }

    public final int z(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.T) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, r4a.w(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
