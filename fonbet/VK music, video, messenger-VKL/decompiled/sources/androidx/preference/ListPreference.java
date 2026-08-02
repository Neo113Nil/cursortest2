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
public class ListPreference extends DialogPreference {
    public CharSequence[] W;
    public CharSequence[] X;
    public String Y;
    public String Z;
    public boolean a0;

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
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.b);
        }
    }

    public static final class a implements Preference.e<ListPreference> {
        public static a a;

        @Override // androidx.preference.Preference.e
        @Nullable
        public final CharSequence a(@NonNull ListPreference listPreference) {
            ListPreference listPreference2 = listPreference;
            return TextUtils.isEmpty(listPreference2.P()) ? listPreference2.b.getString(R.string.not_set) : listPreference2.P();
        }
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e, i, i2);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.W = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.X = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (a.a == null) {
                a.a = new a();
            }
            this.O = a.a;
            o();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.g, i, i2);
        String string = obtainStyledAttributes2.getString(33);
        this.Z = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final void I(@Nullable CharSequence charSequence) {
        super.I(charSequence);
        if (charSequence == null) {
            this.Z = null;
        } else {
            this.Z = charSequence.toString();
        }
    }

    public final int O(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.X) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.X[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Nullable
    public final CharSequence P() {
        CharSequence[] charSequenceArr;
        int O = O(this.Y);
        if (O < 0 || (charSequenceArr = this.W) == null) {
            return null;
        }
        return charSequenceArr[O];
    }

    public void Q(CharSequence[] charSequenceArr) {
        this.W = charSequenceArr;
    }

    public void R(String str) {
        boolean equals = TextUtils.equals(this.Y, str);
        if (equals && this.a0) {
            return;
        }
        this.Y = str;
        this.a0 = true;
        E(str);
        if (equals) {
            return;
        }
        o();
    }

    @Override // androidx.preference.Preference
    @Nullable
    public final CharSequence m() {
        Preference.e eVar = this.O;
        if (eVar != null) {
            return eVar.a(this);
        }
        CharSequence P = P();
        CharSequence m = super.m();
        String str = this.Z;
        if (str != null) {
            if (P == null) {
                P = "";
            }
            String format = String.format(str, P);
            if (!TextUtils.equals(format, m)) {
                return format;
            }
        }
        return m;
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
        R(savedState.b);
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
    public void y(Object obj) {
        R(k((String) obj));
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ytp0.a(R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle, context));
    }

    public ListPreference(@NonNull Context context) {
        this(context, null);
    }
}
