package com.vk.mvi;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import xsna.ao50;
import xsna.bpn0;
import xsna.cf00;
import xsna.f5z;
import xsna.gm50;
import xsna.i0q0;
import xsna.kj50;
import xsna.km50;
import xsna.ol50;
import xsna.quk0;
import xsna.vk50;
import xsna.xn50;
import xsna.zyw;

/* compiled from: MviLazyViewContainer.kt */
/* loaded from: classes3.dex */
public abstract class MviLazyViewContainer<F extends vk50<VS, A>, VS extends ao50, A extends kj50> extends FrameLayout implements gm50, xn50<F, VS, A>, quk0<km50> {
    public final Context b;
    public F c;
    public final bpn0 d;
    public final a e;
    public final ol50 f;

    /* compiled from: MviLazyViewContainer.kt */
    public static final class State extends View.BaseSavedState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public Parcelable b;

        /* compiled from: MviLazyViewContainer.kt */
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

    /* compiled from: MviLazyViewContainer.kt */
    public static final class a implements f5z {
        public final boolean b;
        public m c = new m(this, false);

        public a(boolean z) {
            this.b = z;
        }

        public final void a(boolean z) {
            if (this.c.d.a(Lifecycle.State.RESUMED)) {
                return;
            }
            if (!this.c.d.a(Lifecycle.State.INITIALIZED)) {
                this.c = new m(this, false);
            }
            b(Lifecycle.State.CREATED, z);
        }

        public final void b(Lifecycle.State state, boolean z) {
            if (z && !i0q0.b()) {
                throw new IllegalStateException("Method setCurrentState must be called on the main thread");
            }
            try {
                this.c.e(state);
            } catch (IllegalStateException e) {
                Log.e("MviLazyViewContainer", "Unexpected lifecycle state transition", e);
                if (this.b) {
                    throw e;
                }
            }
        }

        @Override // xsna.f5z
        public final Lifecycle getLifecycle() {
            return this.c;
        }
    }

    public MviLazyViewContainer(Context context) {
        super(context, null, 0);
        this.b = context;
        this.d = new bpn0(new cf00(this, 7));
        a aVar = new a((context.getApplicationInfo().flags & 2) != 0);
        this.e = aVar;
        this.f = new ol50(this);
        aVar.a(false);
    }

    public final void b() {
        getContentView();
    }

    @Override // xsna.xn50
    public final void e2(A a2) {
        xn50.a.c(this, a2);
    }

    public final View getContentView() {
        return (View) this.d.getValue();
    }

    @Override // xsna.xn50
    public F getFeature() {
        j();
        return this.c;
    }

    @Override // xsna.gm50
    public f5z getViewOwner() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        if (this.c != null) {
            return;
        }
        this.e.a(true);
        getViewOwner().getLifecycle().addObserver(this.f);
        F f = (F) x8(new Bundle(), null);
        this.c = f;
        if (f != null) {
            R4(f);
            zyw zywVar = f instanceof zyw ? (zyw) f : null;
            if (zywVar != null) {
                zywVar.A();
            }
        }
        F f2 = this.c;
        if (f2 != null) {
            Jh(f2.g(), getContentView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.e;
        aVar.getClass();
        aVar.b(Lifecycle.State.RESUMED, true);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.e;
        aVar.getClass();
        aVar.b(Lifecycle.State.CREATED, true);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof State)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(((State) parcelable).getSuperState());
            j();
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

    public void R4(F f) {
    }
}
