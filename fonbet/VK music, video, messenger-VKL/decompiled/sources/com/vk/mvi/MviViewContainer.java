package com.vk.mvi;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.f5z;
import xsna.gm50;
import xsna.kj50;
import xsna.km50;
import xsna.mk50;
import xsna.nhl;
import xsna.quk0;
import xsna.vk50;
import xsna.xn50;
import xsna.zyw;

/* compiled from: MviViewContainer.kt */
/* loaded from: classes3.dex */
public abstract class MviViewContainer<F extends vk50<VS, A>, VS extends ao50, A extends kj50> extends FrameLayout implements gm50, xn50<F, VS, A>, quk0<km50> {
    public F b;
    public final View c;
    public final a d;
    public final b e;

    /* compiled from: MviViewContainer.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public Parcelable b;

        /* compiled from: MviViewContainer.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.b, i);
        }

        public State(Parcel parcel) {
            super(parcel);
            Parcelable parcelable;
            try {
                parcelable = parcel.readParcelable(Parcelable.class.getClassLoader());
            } catch (Throwable unused) {
                parcelable = null;
            }
            this.b = parcelable;
        }
    }

    /* compiled from: MviViewContainer.kt */
    public static final class a implements f5z {
        public m b;

        public final void a() {
            if (this.b.d.a(Lifecycle.State.RESUMED)) {
                return;
            }
            if (!this.b.d.a(Lifecycle.State.INITIALIZED)) {
                this.b = new m(this, true);
            }
            this.b.e(Lifecycle.State.CREATED);
        }

        @Override // xsna.f5z
        public final Lifecycle getLifecycle() {
            return this.b;
        }
    }

    public MviViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // xsna.xn50
    public final void e2(A a2) {
        xn50.a.c(this, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        if (this.b != null) {
            return;
        }
        this.d.a();
        getViewOwner().getLifecycle().addObserver(this.e);
        F f = (F) x8(new Bundle(), null);
        this.b = f;
        if (f != null) {
            R4(f);
            zyw zywVar = f instanceof zyw ? (zyw) f : null;
            if (zywVar != null) {
                zywVar.A();
            }
        }
        F f2 = this.b;
        if (f2 != null) {
            Jh(f2.g(), this.c);
        }
    }

    public final View getContentView() {
        return this.c;
    }

    @Override // xsna.xn50
    public F getFeature() {
        g();
        return this.b;
    }

    @Override // xsna.gm50
    public f5z getViewOwner() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.b.e(Lifecycle.State.RESUMED);
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.b.e(Lifecycle.State.CREATED);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof State)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(((State) parcelable).getSuperState());
            g();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        State state = new State(super.onSaveInstanceState());
        state.b = null;
        return state;
    }

    @Override // xsna.quk0
    public final /* bridge */ /* synthetic */ Object sf(Parcelable parcelable) {
        return null;
    }

    @Override // xsna.quk0
    public final Parcelable vb() {
        return null;
    }

    public /* synthetic */ MviViewContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public MviViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        View frameLayout;
        mk50 Fl = Fl();
        if (Fl instanceof mk50.c) {
            frameLayout = ((mk50.c) Fl).a;
        } else if (Fl instanceof mk50.b) {
            frameLayout = LayoutInflater.from(context).inflate(((mk50.b) Fl).a, (ViewGroup) null, false);
        } else {
            if (!(Fl instanceof mk50.a)) {
                throw new NoWhenBranchMatchedException();
            }
            frameLayout = new FrameLayout(context);
        }
        addView(frameLayout);
        this.c = frameLayout;
        a aVar = new a();
        aVar.b = new m(aVar, true);
        this.d = aVar;
        this.e = new b(this);
        aVar.a();
    }

    /* compiled from: MviViewContainer.kt */
    public static final class b implements nhl {
        public final /* synthetic */ MviViewContainer<F, VS, A> b;

        public b(MviViewContainer<F, VS, A> mviViewContainer) {
            this.b = mviViewContainer;
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
            MviViewContainer<F, VS, A> mviViewContainer = this.b;
            F f = mviViewContainer.b;
            if (f != null) {
                f.onDestroy();
            }
            mviViewContainer.b = null;
            f5zVar.getLifecycle().removeObserver(this);
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
        }
    }

    @Override // xsna.xn50
    public void R4(F f) {
    }
}
