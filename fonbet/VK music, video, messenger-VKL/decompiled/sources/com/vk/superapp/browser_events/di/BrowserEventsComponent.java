package com.vk.superapp.browser_events.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.i9;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: BrowserEventsComponent.kt */
/* loaded from: classes11.dex */
public final class BrowserEventsComponent implements DiScopedComponent<pwj0> {
    public static final a b;
    public static final /* synthetic */ qcy<Object>[] c;
    public final nwy a = new nwy(new i9(6));

    /* compiled from: BrowserEventsComponent.kt */
    public static final class a {
        public final BrowserEventsComponent getSTUB() {
            return new BrowserEventsComponent();
        }
    }

    /* compiled from: BrowserEventsComponent.kt */
    /* loaded from: classes6.dex */
    public static final class b implements c8m<BrowserEventsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new BrowserEventsComponent();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(BrowserEventsComponent.class, "vkAppEventBus", "getVkAppEventBus()Lcom/vk/superapp/browser_events/VkAppEventBus;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
        b = new a();
    }
}
