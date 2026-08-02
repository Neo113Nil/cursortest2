package com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.b8i0;
import xsna.d8i0;
import xsna.epx;
import xsna.fpf0;
import xsna.g8i0;
import xsna.gp;
import xsna.j7i0;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.nf3;
import xsna.ofc0;
import xsna.oz50;
import xsna.p8i0;
import xsna.qcy;
import xsna.r8;
import xsna.s8;
import xsna.unr0;
import xsna.v7i0;
import xsna.vk50;
import xsna.w8i;
import xsna.x750;
import xsna.x7i0;
import xsna.yu60;
import xsna.znk0;

/* compiled from: SelectGroupVerificationFragment.kt */
/* loaded from: classes18.dex */
public final class SelectGroupVerificationFragment extends MviImplFragment<v7i0, p8i0, j7i0> implements w8i {
    public static final /* synthetic */ qcy<Object>[] U;
    public final nf3 Q = new nf3();
    public final Object R;
    public final Object S;
    public final Object T;

    /* compiled from: SelectGroupVerificationFragment.kt */
    public static final class SelectGroupVerificationArgs implements Parcelable {
        public static final Parcelable.Creator<SelectGroupVerificationArgs> CREATOR = new a();
        public final UserId b;

        /* compiled from: SelectGroupVerificationFragment.kt */
        public static final class a implements Parcelable.Creator<SelectGroupVerificationArgs> {
            @Override // android.os.Parcelable.Creator
            public final SelectGroupVerificationArgs createFromParcel(Parcel parcel) {
                return new SelectGroupVerificationArgs((UserId) parcel.readParcelable(SelectGroupVerificationArgs.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SelectGroupVerificationArgs[] newArray(int i) {
                return new SelectGroupVerificationArgs[i];
            }
        }

        public SelectGroupVerificationArgs(UserId userId) {
            this.b = userId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectGroupVerificationArgs) && epx.f(this.b, ((SelectGroupVerificationArgs) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("SelectGroupVerificationArgs(groupId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: SelectGroupVerificationFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(SelectGroupVerificationFragment.class, null, null);
            this.j.putParcelable(fpf0.a(SelectGroupVerificationArgs.class).l(), new SelectGroupVerificationArgs(userId));
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SelectGroupVerificationFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/verifiedseller/impl/screens/selectgroupverification/ui/SelectGroupVerificationMviView;", 0);
        fpf0.a.getClass();
        U = new qcy[]{mutablePropertyReference1Impl};
    }

    public SelectGroupVerificationFragment() {
        yu60 yu60Var = new yu60(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, yu60Var);
        this.S = msy.a(lazyThreadSafetyMode, new ofc0(this, 5));
        this.T = msy.a(lazyThreadSafetyMode, new x750(this, 21));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        b8i0 b8i0Var = new b8i0(requireContext(), this);
        qcy<Object> qcyVar = U[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = b8i0Var;
        return new mk50.c(((b8i0) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((b8i0) this.Q.getValue(this, U[0])).f((p8i0) ao50Var, new s8(1, this, SelectGroupVerificationFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 15));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((v7i0) vk50Var).i.a(new r8(1, this, SelectGroupVerificationFragment.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/verifiedseller/impl/screens/selectgroupverification/presentation/SelectGroupVerificationEvent;)V", 0, 10), this);
    }

    public final SelectGroupVerificationArgs fo() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        String l = fpf0.a(SelectGroupVerificationArgs.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable(l, SelectGroupVerificationArgs.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable(l);
            if (!(parcelable3 instanceof SelectGroupVerificationArgs)) {
                parcelable3 = null;
            }
            parcelable = (SelectGroupVerificationArgs) parcelable3;
        }
        return (SelectGroupVerificationArgs) parcelable;
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        j7i0.a aVar = j7i0.a.b;
        d8i0 d8i0Var = new d8i0(x7i0.c.b);
        SelectGroupVerificationArgs fo = fo();
        UserId userId = fo != null ? fo.b : null;
        if (userId != null) {
            return new v7i0(aVar, d8i0Var, new g8i0(new znk0()), userId, (unr0) this.T.getValue());
        }
        throw new IllegalStateException("Required value was null.");
    }
}
