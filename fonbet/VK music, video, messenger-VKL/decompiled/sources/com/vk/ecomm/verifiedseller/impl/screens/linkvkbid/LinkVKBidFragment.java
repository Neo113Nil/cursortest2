package com.vk.ecomm.verifiedseller.impl.screens.linkvkbid;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.j;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.b1h;
import xsna.dcz;
import xsna.epx;
import xsna.fpf0;
import xsna.g5z;
import xsna.gp;
import xsna.hbz;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.nbz;
import xsna.nf3;
import xsna.obz;
import xsna.oz50;
import xsna.pbz;
import xsna.qcy;
import xsna.rbz;
import xsna.vbz;
import xsna.vk50;
import xsna.w8i;
import xsna.wv2;
import xsna.xn50;
import xsna.xv2;
import xsna.zqu;

/* compiled from: LinkVKBidFragment.kt */
/* loaded from: classes18.dex */
public final class LinkVKBidFragment extends MviImplFragment<nbz, dcz, hbz> implements w8i {
    public static final /* synthetic */ qcy<Object>[] S;
    public final nf3 Q = new nf3();
    public final Object R = msy.a(LazyThreadSafetyMode.NONE, new b1h(this, 26));

    /* compiled from: LinkVKBidFragment.kt */
    public static final class LinkVKBidArgs implements Parcelable {
        public static final Parcelable.Creator<LinkVKBidArgs> CREATOR = new a();
        public final UserId b;

        /* compiled from: LinkVKBidFragment.kt */
        public static final class a implements Parcelable.Creator<LinkVKBidArgs> {
            @Override // android.os.Parcelable.Creator
            public final LinkVKBidArgs createFromParcel(Parcel parcel) {
                return new LinkVKBidArgs((UserId) parcel.readParcelable(LinkVKBidArgs.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final LinkVKBidArgs[] newArray(int i) {
                return new LinkVKBidArgs[i];
            }
        }

        public LinkVKBidArgs(UserId userId) {
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
            return (obj instanceof LinkVKBidArgs) && epx.f(this.b, ((LinkVKBidArgs) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("LinkVKBidArgs(groupId="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    /* compiled from: LinkVKBidFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(LinkVKBidFragment.class, null, null);
            this.j.putParcelable(fpf0.a(LinkVKBidArgs.class).l(), new LinkVKBidArgs(userId));
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(LinkVKBidFragment.class, "contentView", "getContentView()Lcom/vk/ecomm/verifiedseller/impl/screens/linkvkbid/ui/LinkVKBidMviView;", 0);
        fpf0.a.getClass();
        S = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        pbz pbzVar = new pbz(requireContext(), this);
        qcy<Object> qcyVar = S[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = pbzVar;
        return new mk50.c(((pbz) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((pbz) this.Q.getValue(this, S[0])).f((dcz) ao50Var, new xv2(1, this, LinkVKBidFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 12));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((nbz) vk50Var).i.a(new wv2(1, this, LinkVKBidFragment.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/verifiedseller/impl/screens/linkvkbid/presentation/LinkVKBidEvent;)V", 0, 6), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, hbz.e.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        hbz.b bVar = hbz.b.b;
        rbz rbzVar = new rbz(obz.d.b);
        j a2 = g5z.a(this);
        Bundle requireArguments = requireArguments();
        String l = fpf0.a(LinkVKBidArgs.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable(l, LinkVKBidArgs.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable(l);
            if (!(parcelable3 instanceof LinkVKBidArgs)) {
                parcelable3 = null;
            }
            parcelable = (LinkVKBidArgs) parcelable3;
        }
        LinkVKBidArgs linkVKBidArgs = (LinkVKBidArgs) parcelable;
        UserId userId = linkVKBidArgs != null ? linkVKBidArgs.b : null;
        if (userId != null) {
            return new nbz(bVar, rbzVar, a2, new vbz(new zqu()), userId);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
