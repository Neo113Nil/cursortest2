package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;

/* loaded from: classes12.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean Q;
    public CharSequence R;
    public CharSequence S;
    public boolean T;
    public boolean U;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.b = parcel.readInt() == 1;
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
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public final boolean L() {
        return (this.U ? this.Q : !this.Q) || super.L();
    }

    public final void O(boolean z) {
        boolean z2 = this.Q != z;
        if (z2 || !this.T) {
            this.Q = z;
            this.T = true;
            C(z);
            if (z2) {
                p(L());
                o();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(View view) {
        boolean z;
        int i;
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (this.Q && !TextUtils.isEmpty(this.R)) {
            textView.setText(this.R);
        } else {
            if (this.Q || TextUtils.isEmpty(this.S)) {
                z = true;
                if (z) {
                    CharSequence m = m();
                    if (!TextUtils.isEmpty(m)) {
                        textView.setText(m);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i == textView.getVisibility()) {
                    textView.setVisibility(i);
                    return;
                }
                return;
            }
            textView.setText(this.S);
        }
        z = false;
        if (z) {
        }
        if (z) {
        }
        if (i == textView.getVisibility()) {
        }
    }

    @Override // androidx.preference.Preference
    public final void t() {
        boolean z = !this.Q;
        if (a(Boolean.valueOf(z))) {
            O(z);
        }
    }

    @Override // androidx.preference.Preference
    @Nullable
    public final Object v(@NonNull TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
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
        savedState.b = this.Q;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        O(i(((Boolean) obj).booleanValue()));
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(@NonNull Context context) {
        this(context, null);
    }
}
