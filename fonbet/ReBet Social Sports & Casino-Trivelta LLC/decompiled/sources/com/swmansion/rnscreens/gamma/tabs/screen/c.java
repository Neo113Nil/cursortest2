package com.swmansion.rnscreens.gamma.tabs.screen;

import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends Pc.a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f41962e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReactContext reactContext, int i10) {
        super(reactContext, i10);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public final void a() {
        d.b(g(), "onWillDisappear");
        e().dispatchEvent(new Yc.d(f(), g()));
    }

    public final void b() {
        d.b(g(), "onDidDisappear");
        e().dispatchEvent(new Yc.b(f(), g()));
    }

    public final void c() {
        d.b(g(), "onDidAppear");
        e().dispatchEvent(new Yc.a(f(), g()));
    }

    public final void d() {
        d.b(g(), "onWillAppear");
        e().dispatchEvent(new Yc.c(f(), g()));
    }
}
