package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import com.vkontakte.android.R;
import xsna.tyc0;

/* loaded from: classes12.dex */
public class SeekBarPreference extends Preference {
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public SeekBar V;
    public TextView W;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final a a0;
    public final b b0;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;
        public int c;
        public int d;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.b = parcel.readInt();
                savedState.c = parcel.readInt();
                savedState.d = parcel.readInt();
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
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
        }
    }

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (z && (seekBarPreference.Z || !seekBarPreference.U)) {
                seekBarPreference.P(seekBar);
                return;
            }
            int i2 = i + seekBarPreference.R;
            TextView textView = seekBarPreference.W;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.U = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            seekBarPreference.U = false;
            if (seekBar.getProgress() + seekBarPreference.R != seekBarPreference.Q) {
                seekBarPreference.P(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.X && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.V;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a0 = new a();
        this.b0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.k, i, i2);
        this.R = obtainStyledAttributes.getInt(3, 0);
        int i3 = obtainStyledAttributes.getInt(1, 100);
        int i4 = this.R;
        i3 = i3 < i4 ? i4 : i3;
        if (i3 != this.S) {
            this.S = i3;
            o();
        }
        int i5 = obtainStyledAttributes.getInt(4, 0);
        if (i5 != this.T) {
            this.T = Math.min(this.S - this.R, Math.abs(i5));
            o();
        }
        this.X = obtainStyledAttributes.getBoolean(2, true);
        this.Y = obtainStyledAttributes.getBoolean(5, false);
        this.Z = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void O(int i, boolean z) {
        int i2 = this.R;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.S;
        if (i > i3) {
            i = i3;
        }
        if (i != this.Q) {
            this.Q = i;
            TextView textView = this.W;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            D(i);
            if (z) {
                o();
            }
        }
    }

    public final void P(@NonNull SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.R;
        if (progress != this.Q) {
            if (a(Integer.valueOf(progress))) {
                O(progress, false);
                return;
            }
            seekBar.setProgress(this.Q - this.R);
            int i = this.Q;
            TextView textView = this.W;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void s(@NonNull tyc0 tyc0Var) {
        super.s(tyc0Var);
        tyc0Var.itemView.setOnKeyListener(this.b0);
        this.V = (SeekBar) tyc0Var.V5(R.id.seekbar);
        TextView textView = (TextView) tyc0Var.V5(R.id.seekbar_value);
        this.W = textView;
        if (this.Y) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.W = null;
        }
        SeekBar seekBar = this.V;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.a0);
        this.V.setMax(this.S - this.R);
        int i = this.T;
        if (i != 0) {
            this.V.setKeyProgressIncrement(i);
        } else {
            this.T = this.V.getKeyProgressIncrement();
        }
        this.V.setProgress(this.Q - this.R);
        int i2 = this.Q;
        TextView textView2 = this.W;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.V.setEnabled(n());
    }

    @Override // androidx.preference.Preference
    @Nullable
    public final Object v(@NonNull TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void w(@Nullable Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.w(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.w(savedState.getSuperState());
        this.Q = savedState.b;
        this.R = savedState.c;
        this.S = savedState.d;
        o();
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
        savedState.c = this.R;
        savedState.d = this.S;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        O(j(((Integer) obj).intValue()), true);
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarPreferenceStyle);
    }

    public SeekBarPreference(@NonNull Context context) {
        this(context, null);
    }
}
