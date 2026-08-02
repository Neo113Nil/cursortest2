package com.vk.ecomm.verifiedseller.impl.screens.obtainverification;

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
import xsna.as70;
import xsna.bs70;
import xsna.cs70;
import xsna.epx;
import xsna.es70;
import xsna.fpf0;
import xsna.ho8;
import xsna.km50;
import xsna.ko00;
import xsna.ks70;
import xsna.lo10;
import xsna.mk50;
import xsna.mr70;
import xsna.msy;
import xsna.nf3;
import xsna.oz50;
import xsna.p5e;
import xsna.qcy;
import xsna.qs70;
import xsna.unr0;
import xsna.vk50;
import xsna.w8i;
import xsna.xn50;
import xsna.ym1;
import xsna.znk0;

/* compiled from: ObtainVerificationFragment.kt */
/* loaded from: classes18.dex */
public final class ObtainVerificationFragment extends MviImplFragment<as70, qs70, mr70> implements w8i {
    public static final /* synthetic */ qcy<Object>[] T;
    public final nf3 Q = new nf3();
    public final Object R;
    public final Object S;

    /* compiled from: ObtainVerificationFragment.kt */
    public static final class ObtainVerificationArgs implements Parcelable {
        public static final Parcelable.Creator<ObtainVerificationArgs> CREATOR = new a();
        public final UserId b;
        public final String c;

        /* compiled from: ObtainVerificationFragment.kt */
        public static final class a implements Parcelable.Creator<ObtainVerificationArgs> {
            @Override // android.os.Parcelable.Creator
            public final ObtainVerificationArgs createFromParcel(Parcel parcel) {
                return new ObtainVerificationArgs((UserId) parcel.readParcelable(ObtainVerificationArgs.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ObtainVerificationArgs[] newArray(int i) {
                return new ObtainVerificationArgs[i];
            }
        }

        public ObtainVerificationArgs(UserId userId, String str) {
            this.b = userId;
            this.c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ObtainVerificationArgs)) {
                return false;
            }
            ObtainVerificationArgs obtainVerificationArgs = (ObtainVerificationArgs) obj;
            return epx.f(this.b, obtainVerificationArgs.b) && epx.f(this.c, obtainVerificationArgs.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ObtainVerificationArgs(groupId=");
            sb.append(this.b);
            sb.append(", verificationType=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: ObtainVerificationFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, String str) {
            super(ObtainVerificationFragment.class, null, null);
            this.j.putParcelable(fpf0.a(ObtainVerificationArgs.class).l(), new ObtainVerificationArgs(userId, str));
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ObtainVerificationFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/verifiedseller/impl/screens/obtainverification/ui/ObtainVerificationMviView;", 0);
        fpf0.a.getClass();
        T = new qcy[]{mutablePropertyReference1Impl};
    }

    public ObtainVerificationFragment() {
        lo10 lo10Var = new lo10(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, lo10Var);
        this.S = msy.a(lazyThreadSafetyMode, new ko00(this, 12));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        cs70 cs70Var = new cs70(requireContext(), this);
        qcy<Object> qcyVar = T[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = cs70Var;
        return new mk50.c(((cs70) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((cs70) this.Q.getValue(this, T[0])).f((qs70) ao50Var, new ym1(1, this, ObtainVerificationFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 10));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((as70) vk50Var).j.a(new p5e(1, this, ObtainVerificationFragment.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/verifiedseller/impl/screens/obtainverification/presentation/ObtainVerificationEvent;)V", 0, 6), this);
    }

    public final ObtainVerificationArgs fo() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        String l = fpf0.a(ObtainVerificationArgs.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable(l, ObtainVerificationArgs.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable(l);
            if (!(parcelable3 instanceof ObtainVerificationArgs)) {
                parcelable3 = null;
            }
            parcelable = (ObtainVerificationArgs) parcelable3;
        }
        return (ObtainVerificationArgs) parcelable;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        xn50.a.c(this, mr70.i.b);
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        mr70.b bVar = mr70.b.b;
        es70 es70Var = new es70(bs70.d.b);
        ObtainVerificationArgs fo = fo();
        UserId userId = fo != null ? fo.b : null;
        if (userId == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ObtainVerificationArgs fo2 = fo();
        String str = fo2 != null ? fo2.c : null;
        if (str != null) {
            return new as70(bVar, es70Var, new ks70(new znk0()), userId, str, (unr0) this.S.getValue());
        }
        throw new IllegalStateException("Required value was null.");
    }
}
