package com.vk.channels.impl.channel_screen.footer;

import android.content.Context;
import android.os.Bundle;
import com.vk.channels.impl.channel_screen.footer.b;
import com.vk.im.mvicomponent.MviComponentFragment;
import defpackage.q0;
import xsna.epx;
import xsna.h9k0;
import xsna.ixa;
import xsna.kkm;
import xsna.lxa;
import xsna.mg8;
import xsna.mh;
import xsna.mxv;
import xsna.ucb;
import xsna.yj50;
import xsna.z4;

/* compiled from: ChannelFooterComponent.kt */
/* loaded from: classes16.dex */
public final class c extends yj50<d, k, com.vk.channels.impl.channel_screen.footer.b, com.vk.channels.impl.channel_screen.footer.a, j, g, h> {
    public final MviComponentFragment n;
    public final a o;
    public final b p;

    /* compiled from: ChannelFooterComponent.kt */
    public static final class a {
        public final ixa a;
        public final f b;
        public final h9k0 c;
        public final mxv d;
        public final io.reactivex.rxjava3.disposables.b e;
        public final kkm f;

        public a(lxa lxaVar, f fVar, ucb ucbVar, mxv mxvVar, io.reactivex.rxjava3.disposables.b bVar, kkm kkmVar) {
            this.a = lxaVar;
            this.b = fVar;
            this.c = ucbVar;
            this.d = mxvVar;
            this.e = bVar;
            this.f = kkmVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Deps(channelDataSource=" + this.a + ", channelFooterInteractor=" + this.b + ", snackbarViewer=" + this.c + ", imBridge=" + this.d + ", lifecycleDisposable=" + this.e + ", themeBinder=" + this.f + ')';
        }
    }

    /* compiled from: ChannelFooterComponent.kt */
    public static final class b {
        public final z4 a;
        public final mh b;
        public final defpackage.f c;
        public final boolean d;

        public b(z4 z4Var, mh mhVar, defpackage.f fVar, boolean z) {
            this.a = z4Var;
            this.b = mhVar;
            this.c = fVar;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(isClosedChannel=");
            sb.append(this.a);
            sb.append(", isInCommunity=");
            sb.append(this.b);
            sb.append(", isPersonalChannel=");
            sb.append(this.c);
            sb.append(", isChannelsToCommunitiesRenamed=");
            return q0.a(sb, this.d, ')');
        }
    }

    public c(mg8 mg8Var, MviComponentFragment mviComponentFragment, a aVar, b bVar) {
        super(mviComponentFragment, mg8Var, com.vk.channels.impl.channel_screen.footer.b.class, false);
        this.n = mviComponentFragment;
        this.o = aVar;
        this.p = bVar;
        mviComponentFragment.requireContext();
    }

    @Override // xsna.yj50
    public final d a(Bundle bundle) {
        a aVar = this.o;
        return new d(aVar.a, aVar.b, this.p.d);
    }

    @Override // xsna.yj50
    public final h b() {
        a aVar = this.o;
        return new h(this.n, aVar.d, aVar.e);
    }

    @Override // xsna.yj50
    public final com.vk.channels.impl.channel_screen.footer.a d() {
        Context requireContext = this.n.requireContext();
        a aVar = this.o;
        h9k0 h9k0Var = aVar.c;
        kkm kkmVar = aVar.f;
        b bVar = this.p;
        return new i(requireContext, h9k0Var, kkmVar, bVar.a, bVar.b, bVar.c);
    }

    public final void m(boolean z) {
        getFeature().C(new b.a(z));
    }
}
