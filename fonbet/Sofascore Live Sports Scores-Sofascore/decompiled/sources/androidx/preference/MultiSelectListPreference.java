package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import com.sofascore.results.R;
import defpackage.jjf;
import defpackage.r4a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] S;
    public final CharSequence[] T;
    public final HashSet U;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new c();
        public HashSet a;

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.a = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.a, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.size());
            HashSet hashSet = this.a;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int w = r4a.w(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        this.U = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jjf.f, w, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.S = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.T = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
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
        savedState.a = this.U;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void q(Object obj) {
        Set<String> set = (Set) obj;
        if (x()) {
            set = this.b.g().getStringSet(this.k, set);
        }
        z(set);
    }

    public final void z(Set set) {
        HashSet hashSet = this.U;
        hashSet.clear();
        hashSet.addAll(set);
        if (x()) {
            boolean x = x();
            String str = this.k;
            if (!set.equals(x ? this.b.g().getStringSet(str, null) : null)) {
                SharedPreferences.Editor f = this.b.f();
                f.putStringSet(str, set);
                if (!this.b.a) {
                    f.apply();
                }
            }
        }
        g();
    }
}
