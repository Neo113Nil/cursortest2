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
import android.util.Log;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.c;
import java.util.ArrayList;
import java.util.Collections;
import xsna.dpj0;

/* loaded from: classes12.dex */
public abstract class PreferenceGroup extends Preference {
    public final dpj0<String, Long> Q;
    public final Handler R;
    public final ArrayList S;
    public boolean T;
    public int U;
    public boolean V;
    public int W;
    public final a X;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.b = parcel.readInt();
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
            parcel.writeInt(this.b);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                PreferenceGroup.this.Q.clear();
            }
        }
    }

    public interface b {
        int O(@NonNull Preference preference);

        int f0(@NonNull String str);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Q = new dpj0<>();
        this.R = new Handler(Looper.getMainLooper());
        this.T = true;
        this.U = 0;
        this.V = false;
        this.W = Integer.MAX_VALUE;
        this.X = new a();
        this.S = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.i, i, i2);
        this.T = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && TextUtils.isEmpty(this.n)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.W = i3;
        }
        obtainStyledAttributes.recycle();
    }

    public final void O(@NonNull Preference preference) {
        long j;
        if (this.S.contains(preference)) {
            return;
        }
        if (preference.n != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.L;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.n;
            if (preferenceGroup.P(str) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        int i = preference.h;
        if (i == Integer.MAX_VALUE) {
            if (this.T) {
                int i2 = this.U;
                this.U = i2 + 1;
                if (i2 != i) {
                    preference.h = i2;
                    c cVar = preference.J;
                    if (cVar != null) {
                        Handler handler = cVar.g;
                        c.a aVar = cVar.h;
                        handler.removeCallbacks(aVar);
                        handler.post(aVar);
                    }
                }
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).T = this.T;
            }
        }
        int binarySearch = Collections.binarySearch(this.S, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        boolean L = L();
        if (preference.y == L) {
            preference.y = !L;
            preference.p(preference.L());
            preference.o();
        }
        synchronized (this) {
            this.S.add(binarySearch, preference);
        }
        e eVar = this.c;
        String str2 = preference.n;
        if (str2 == null || !this.Q.containsKey(str2)) {
            synchronized (eVar) {
                j = eVar.b;
                eVar.b = 1 + j;
            }
        } else {
            j = this.Q.get(str2).longValue();
            this.Q.remove(str2);
        }
        preference.d = j;
        preference.e = true;
        try {
            preference.r(eVar);
            preference.e = false;
            if (preference.L != null) {
                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
            }
            preference.L = this;
            if (this.V) {
                preference.q();
            }
            c cVar2 = this.J;
            if (cVar2 != null) {
                Handler handler2 = cVar2.g;
                c.a aVar2 = cVar2.h;
                handler2.removeCallbacks(aVar2);
                handler2.post(aVar2);
            }
        } catch (Throwable th) {
            preference.e = false;
            throw th;
        }
    }

    @Nullable
    public final <T extends Preference> T P(@NonNull CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.n, charSequence)) {
            return this;
        }
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            PreferenceGroup preferenceGroup = (T) Q(i);
            if (TextUtils.equals(preferenceGroup.n, charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.P(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    public final Preference Q(int i) {
        return (Preference) this.S.get(i);
    }

    public final void R(@NonNull Preference preference) {
        S(preference);
        c cVar = this.J;
        if (cVar != null) {
            Handler handler = cVar.g;
            c.a aVar = cVar.h;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public final boolean S(@NonNull Preference preference) {
        boolean remove;
        synchronized (this) {
            try {
                preference.N();
                if (preference.L == this) {
                    preference.L = null;
                }
                remove = this.S.remove(preference);
                if (remove) {
                    String str = preference.n;
                    if (str != null) {
                        this.Q.put(str, Long.valueOf(preference.getId()));
                        this.R.removeCallbacks(this.X);
                        this.R.post(this.X);
                    }
                    if (this.V) {
                        preference.u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    @Override // androidx.preference.Preference
    public final void b(@NonNull Bundle bundle) {
        super.b(bundle);
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            Q(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(@NonNull Bundle bundle) {
        super.c(bundle);
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            Q(i).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void p(boolean z) {
        super.p(z);
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            Preference Q = Q(i);
            if (Q.y == z) {
                Q.y = !z;
                Q.p(Q.L());
                Q.o();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void q() {
        super.q();
        this.V = true;
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            Q(i).q();
        }
    }

    @Override // androidx.preference.Preference
    public final void u() {
        N();
        this.V = false;
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            Q(i).u();
        }
    }

    @Override // androidx.preference.Preference
    public final void w(@Nullable Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.w(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.W = savedState.b;
        super.w(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    @NonNull
    public final Parcelable x() {
        super.x();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        int i = this.W;
        SavedState savedState = new SavedState(absSavedState);
        savedState.b = i;
        return savedState;
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
