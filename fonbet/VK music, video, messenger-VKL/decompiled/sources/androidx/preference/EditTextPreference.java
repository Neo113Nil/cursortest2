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
import com.vkontakte.android.R;
import xsna.ytp0;

/* loaded from: classes12.dex */
public class EditTextPreference extends DialogPreference {
    public String W;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.b = parcel.readString();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.b);
        }
    }

    public static final class a implements Preference.e<EditTextPreference> {
        public static a a;

        @Override // androidx.preference.Preference.e
        @Nullable
        public final CharSequence a(@NonNull EditTextPreference editTextPreference) {
            EditTextPreference editTextPreference2 = editTextPreference;
            return TextUtils.isEmpty(editTextPreference2.W) ? editTextPreference2.b.getString(R.string.not_set) : editTextPreference2.W;
        }
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, i, i2);
        if (obtainStyledAttributes.getBoolean(0, obtainStyledAttributes.getBoolean(0, false))) {
            if (a.a == null) {
                a.a = new a();
            }
            this.O = a.a;
            o();
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final boolean L() {
        return TextUtils.isEmpty(this.W) || super.L();
    }

    public final void O(@Nullable String str) {
        boolean L = L();
        this.W = str;
        E(str);
        boolean L2 = L();
        if (L2 != L) {
            p(L2);
        }
        o();
    }

    @Override // androidx.preference.Preference
    public final Object v(@NonNull TypedArray typedArray, int i) {
        return typedArray.getString(i);
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
        savedState.b = this.W;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        O(k((String) obj));
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ytp0.a(R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle, context));
    }

    public EditTextPreference(@NonNull Context context) {
        this(context, null);
    }
}
