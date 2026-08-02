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
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import xsna.ytp0;

/* loaded from: classes12.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] W;
    public CharSequence[] X;
    public final HashSet Y;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public HashSet b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                int readInt = parcel.readInt();
                savedState.b = new HashSet();
                String[] strArr = new String[readInt];
                parcel.readStringArray(strArr);
                Collections.addAll(savedState.b, strArr);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b.size());
            HashSet hashSet = this.b;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Y = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f, i, i2);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.W = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.X = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
    }

    public final void O(Set<String> set) {
        HashSet hashSet = this.Y;
        hashSet.clear();
        hashSet.addAll(set);
        if (M()) {
            if (!set.equals(M() ? this.c.b().getStringSet(this.n, null) : null)) {
                SharedPreferences.Editor a = this.c.a();
                a.putStringSet(this.n, set);
                if (!this.c.e) {
                    a.apply();
                }
            }
        }
        o();
    }

    @Override // androidx.preference.Preference
    @Nullable
    public final Object v(@NonNull TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void w(@Nullable Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.w(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.w(savedState.getSuperState());
        O(savedState.b);
    }

    @Override // androidx.preference.Preference
    @Nullable
    public final Parcelable x() {
        super.x();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.u) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.b = this.Y;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        Set<String> set = (Set) obj;
        if (M()) {
            set = this.c.b().getStringSet(this.n, set);
        }
        O(set);
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ytp0.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context));
    }

    public MultiSelectListPreference(@NonNull Context context) {
        this(context, null);
    }
}
