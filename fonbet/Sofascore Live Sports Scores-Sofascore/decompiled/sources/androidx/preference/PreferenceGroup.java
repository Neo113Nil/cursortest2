package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import defpackage.a70;
import defpackage.fhh;
import defpackage.jjf;
import defpackage.kac;
import defpackage.y4f;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final fhh M;
    public final Handler N;
    public final ArrayList O;
    public boolean P;
    public int Q;
    public boolean R;
    public int S;
    public final kac T;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.M = new fhh(0);
        this.N = new Handler(Looper.getMainLooper());
        this.P = true;
        this.Q = 0;
        this.R = false;
        this.S = Integer.MAX_VALUE;
        this.T = new kac(this, 9);
        this.O = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jjf.i, i, 0);
        this.P = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.k);
            }
            this.S = i3;
        }
        obtainStyledAttributes.recycle();
    }

    public final Preference A(int i) {
        return (Preference) this.O.get(i);
    }

    public final void B(Preference preference) {
        synchronized (this) {
            try {
                preference.y();
                if (preference.H == this) {
                    preference.H = null;
                }
                if (this.O.remove(preference)) {
                    String str = preference.k;
                    if (str != null) {
                        this.M.put(str, Long.valueOf(preference.c()));
                        this.N.removeCallbacks(this.T);
                        this.N.post(this.T);
                    }
                    if (this.R) {
                        preference.m();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y4f y4fVar = this.F;
        if (y4fVar != null) {
            Handler handler = y4fVar.e;
            kac kacVar = y4fVar.f;
            handler.removeCallbacks(kacVar);
            handler.post(kacVar);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(Bundle bundle) {
        super.a(bundle);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            A(i).a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            A(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void h(boolean z) {
        super.h(z);
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            Preference A = A(i);
            if (A.u == z) {
                A.u = !z;
                A.h(A.w());
                A.g();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void i() {
        super.i();
        this.R = true;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            A(i).i();
        }
    }

    @Override // androidx.preference.Preference
    public final void m() {
        y();
        this.R = false;
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            A(i).m();
        }
    }

    @Override // androidx.preference.Preference
    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.o(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.S = savedState.a;
        super.o(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable p() {
        super.p();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new SavedState(this.S);
    }

    public final Preference z(CharSequence charSequence) {
        Preference z;
        if (charSequence == null) {
            a70.p("Key cannot be null");
            return null;
        }
        if (TextUtils.equals(this.k, charSequence)) {
            return this;
        }
        int size = this.O.size();
        for (int i = 0; i < size; i++) {
            Preference A = A(i);
            if (TextUtils.equals(A.k, charSequence)) {
                return A;
            }
            if ((A instanceof PreferenceGroup) && (z = ((PreferenceGroup) A).z(charSequence)) != null) {
                return z;
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();
        public final int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(int i) {
            super(AbsSavedState.EMPTY_STATE);
            this.a = i;
        }
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
