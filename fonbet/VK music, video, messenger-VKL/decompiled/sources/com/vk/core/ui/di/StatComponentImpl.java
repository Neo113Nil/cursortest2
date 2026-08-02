package com.vk.core.ui.di;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.di.component.DiScopedComponent;
import com.vk.stat.di.StatComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fdh0;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.xa3;

/* compiled from: StatComponentImpl.kt */
/* loaded from: classes.dex */
public final class StatComponentImpl implements StatComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new xa3(6));

    /* compiled from: StatComponentImpl.kt */
    public static final class a implements c8m<StatComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StatComponentImpl();
        }
    }

    /* compiled from: StatComponentImpl.kt */
    public static final class b implements fdh0 {
        @Override // xsna.fdh0
        public final void a() {
            UiTracker.j.d(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.AUTH_PASSWORD), true);
        }

        @Override // xsna.fdh0
        public final void b() {
            UiTracker.j.d(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.AUTH_START_WITH_PHONE), true);
        }

        @Override // xsna.fdh0
        public final void c() {
            UiTracker.j.d(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.AUTH), true);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StatComponentImpl.class, "screenTracker", "getScreenTracker()Lcom/vk/stat/tracking/ScreenTracker;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.stat.di.StatComponent
    public final fdh0 z4() {
        qcy<Object> qcyVar = b[0];
        return (fdh0) this.a.c();
    }
}
