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
import defpackage.hjg;
import defpackage.jjf;
import defpackage.r4a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String S;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int w = r4a.w(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jjf.d, w, 0);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            hjg hjgVar = hjg.p;
            if (hjgVar == null) {
                hjgVar = new hjg();
                hjg.p = hjgVar;
            }
            this.K = hjgVar;
            g();
        }
        obtainStyledAttributes.recycle();
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
        z(savedState.a);
    }

    @Override // androidx.preference.Preference
    public final Parcelable p() {
        super.p();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.q) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.a = this.S;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void q(Object obj) {
        z(d((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        return TextUtils.isEmpty(this.S) || super.w();
    }

    public final void z(String str) {
        boolean w = w();
        this.S = str;
        s(str);
        boolean w2 = w();
        if (w2 != w) {
            h(w2);
        }
        g();
    }
}
