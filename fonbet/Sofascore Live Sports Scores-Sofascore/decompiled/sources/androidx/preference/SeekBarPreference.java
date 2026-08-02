package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import com.sofascore.results.R;
import defpackage.abc;
import defpackage.c5f;
import defpackage.jjf;
import defpackage.xzg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public SeekBar R;
    public TextView S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final abc W;
    public final xzg X;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();
        public int a;
        public int b;
        public int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.W = new abc(this, 1);
        this.X = new xzg(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jjf.k, R.attr.seekBarPreferenceStyle, 0);
        this.N = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.N;
        i = i < i2 ? i2 : i;
        if (i != this.O) {
            this.O = i;
            g();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.P) {
            this.P = Math.min(this.O - this.N, Math.abs(i3));
            g();
        }
        this.T = obtainStyledAttributes.getBoolean(2, true);
        this.U = obtainStyledAttributes.getBoolean(5, false);
        this.V = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void k(c5f c5fVar) {
        super.k(c5fVar);
        c5fVar.itemView.setOnKeyListener(this.X);
        this.R = (SeekBar) c5fVar.a(R.id.seekbar);
        TextView textView = (TextView) c5fVar.a(R.id.seekbar_value);
        this.S = textView;
        if (this.U) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.S = null;
        }
        SeekBar seekBar = this.R;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.W);
        this.R.setMax(this.O - this.N);
        int i = this.P;
        SeekBar seekBar2 = this.R;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.P = seekBar2.getKeyProgressIncrement();
        }
        this.R.setProgress(this.M - this.N);
        int i2 = this.M;
        TextView textView2 = this.S;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.R.setEnabled(f());
    }

    @Override // androidx.preference.Preference
    public final Object n(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.o(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.o(savedState.getSuperState());
        this.M = savedState.a;
        this.N = savedState.b;
        this.O = savedState.c;
        g();
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
        savedState.b = this.N;
        savedState.c = this.O;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void q(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (x()) {
            intValue = this.b.g().getInt(this.k, intValue);
        }
        z(intValue, true);
    }

    public final void z(int i, boolean z) {
        int i2 = this.N;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.O;
        if (i > i3) {
            i = i3;
        }
        if (i != this.M) {
            this.M = i;
            TextView textView = this.S;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (x()) {
                int i4 = ~i;
                boolean x = x();
                String str = this.k;
                if (x) {
                    i4 = this.b.g().getInt(str, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor f = this.b.f();
                    f.putInt(str, i);
                    if (!this.b.a) {
                        f.apply();
                    }
                }
            }
            if (z) {
                g();
            }
        }
    }
}
