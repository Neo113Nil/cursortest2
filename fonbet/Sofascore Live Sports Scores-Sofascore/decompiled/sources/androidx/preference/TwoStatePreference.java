package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean M;
    public CharSequence N;
    public CharSequence O;
    public boolean P;
    public boolean Q;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();
        public boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(View view) {
        boolean z;
        int i;
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (this.M && !TextUtils.isEmpty(this.N)) {
            textView.setText(this.N);
        } else {
            if (this.M || TextUtils.isEmpty(this.O)) {
                z = true;
                if (z) {
                    CharSequence e = e();
                    if (!TextUtils.isEmpty(e)) {
                        textView.setText(e);
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
            textView.setText(this.O);
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
    public final void l() {
        z(!this.M);
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
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
        savedState.a = this.M;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void q(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (x()) {
            booleanValue = this.b.g().getBoolean(this.k, booleanValue);
        }
        z(booleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean w() {
        boolean z = this.Q;
        boolean z2 = this.M;
        if (!z) {
            z2 = !z2;
        }
        return z2 || super.w();
    }

    public final void z(boolean z) {
        boolean z2 = this.M != z;
        if (z2 || !this.P) {
            this.M = z;
            this.P = true;
            if (x()) {
                boolean z3 = !z;
                boolean x = x();
                String str = this.k;
                if (x) {
                    z3 = this.b.g().getBoolean(str, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor f = this.b.f();
                    f.putBoolean(str, z);
                    if (!this.b.a) {
                        f.apply();
                    }
                }
            }
            if (z2) {
                h(w());
                g();
            }
        }
    }
}
