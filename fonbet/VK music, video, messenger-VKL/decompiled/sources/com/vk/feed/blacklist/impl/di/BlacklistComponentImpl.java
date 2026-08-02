package com.vk.feed.blacklist.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.feed.blacklist.api.di.BlacklistComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c13;
import xsna.c8m;
import xsna.ee7;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.ie7;
import xsna.je7;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.sq6;

/* compiled from: BlacklistComponentImpl.kt */
/* loaded from: classes.dex */
public final class BlacklistComponentImpl implements BlacklistComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(BlacklistComponentImpl.class, "blacklistInteractor", "getBlacklistInteractor()Lcom/vk/feed/blacklist/api/domain/interactor/BlacklistInteractor;", 0), fp.c(0, BlacklistComponentImpl.class, "blacklistRouter", "getBlacklistRouter()Lcom/vk/feed/blacklist/impl/presentation/util/BlacklistRouterImpl;", fpf0.a)};
    public final nwy a = new nwy(new sq6(1));
    public final nwy b = new nwy(new c13(1));

    /* compiled from: BlacklistComponentImpl.kt */
    public static final class a implements c8m<BlacklistComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new BlacklistComponentImpl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.feed.blacklist.api.di.BlacklistComponent
    public final ie7 B5() {
        qcy<Object> qcyVar = c[1];
        return (je7) this.b.c();
    }

    @Override // com.vk.feed.blacklist.api.di.BlacklistComponent
    public final ee7 E3() {
        qcy<Object> qcyVar = c[0];
        return (ee7) this.a.c();
    }
}
