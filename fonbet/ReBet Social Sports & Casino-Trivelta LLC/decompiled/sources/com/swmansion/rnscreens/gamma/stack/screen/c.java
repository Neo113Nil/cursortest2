package com.swmansion.rnscreens.gamma.stack.screen;

import Vc.e;
import Vc.f;
import Vc.g;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends Pc.a implements Pc.c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f41857e = new a(null);

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

    @Override // Pc.c
    public void a() {
        e().dispatchEvent(new g(f(), g()));
    }

    @Override // Pc.c
    public void b() {
        e().dispatchEvent(new Vc.b(f(), g()));
    }

    @Override // Pc.c
    public void c() {
        e().dispatchEvent(new Vc.a(f(), g()));
    }

    @Override // Pc.c
    public void d() {
        e().dispatchEvent(new f(f(), g()));
    }

    public final void h(boolean z10) {
        e().dispatchEvent(new Vc.c(f(), g(), z10));
    }

    public final void i() {
        e().dispatchEvent(new e(f(), g()));
    }
}
