package com.vk.feed.settings.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.feed.settings.api.di.NewsfeedSettingsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ep;
import xsna.ez60;
import xsna.fp;
import xsna.fpf0;
import xsna.fz60;
import xsna.g8m;
import xsna.hpf0;
import xsna.hy2;
import xsna.iz60;
import xsna.nwy;
import xsna.om60;
import xsna.pwj0;
import xsna.qcy;
import xsna.vo50;
import xsna.ysg0;

/* compiled from: NewsfeedSettingsComponentImpl.kt */
/* loaded from: classes18.dex */
public final class NewsfeedSettingsComponentImpl implements NewsfeedSettingsComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new vo50(4));
    public final nwy b = new nwy(new hy2(25));
    public final nwy c = new nwy(new om60(1));

    /* compiled from: NewsfeedSettingsComponentImpl.kt */
    public static final class a implements c8m<NewsfeedSettingsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new NewsfeedSettingsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NewsfeedSettingsComponentImpl.class, "newsfeedSettingsInteractor", "getNewsfeedSettingsInteractor()Lcom/vk/feed/settings/api/domain/interactor/NewsfeedSettingsInteractor;", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, NewsfeedSettingsComponentImpl.class, "newsfeedSettingsRouter", "getNewsfeedSettingsRouter()Lcom/vk/feed/settings/impl/presentation/util/NewsfeedSettingsRouterImpl;", hpf0Var), ep.a(0, NewsfeedSettingsComponentImpl.class, "newsfeedSettingsEventBus", "getNewsfeedSettingsEventBus()Lcom/vk/rx/RxBus;", hpf0Var)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.feed.settings.api.di.NewsfeedSettingsComponent
    public final ysg0<ez60> Da() {
        qcy<Object> qcyVar = d[2];
        return (ysg0) this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.feed.settings.api.di.NewsfeedSettingsComponent
    public final iz60 R9() {
        qcy<Object> qcyVar = d[1];
        return (iz60) this.b.c();
    }

    @Override // com.vk.feed.settings.api.di.NewsfeedSettingsComponent
    public final fz60 j0() {
        qcy<Object> qcyVar = d[0];
        return (fz60) this.a.c();
    }
}
