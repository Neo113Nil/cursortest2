package p20;

import Od0.a;
import Od0.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q20.InterfaceC8978a;

/* renamed from: p20.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8838c extends Od0.d<InterfaceC8978a> implements Od0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.d f80030a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f80031b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Class<? extends InterfaceC8978a> f80032c;

    /* renamed from: p20.c$a */
    static final class a extends AbstractC7737t implements Function0<C8836a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f80033b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C8836a invoke() {
            return new C8836a();
        }
    }

    public C8838c(@NotNull Ld0.d globalConfig) {
        Intrinsics.checkNotNullParameter(globalConfig, "globalConfig");
        this.f80030a = globalConfig;
        this.f80031b = k.b(a.f80033b);
        this.f80032c = InterfaceC8978a.class;
    }

    @Override // Od0.b
    public final void beforeHandleDeeplink(@NotNull Ld0.c store, @NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (deeplink instanceof c.a) {
            C8836a c8836a = (C8836a) this.f80031b.getValue();
            Intent intent = ((c.a) deeplink).b();
            c8836a.getClass();
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (Intrinsics.d(intent.getStringExtra("TEST_USER"), "ENABLED")) {
                C8839d.b();
            }
        }
    }

    @Override // Od0.b
    public final boolean canHandle(@NotNull Od0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return false;
    }

    @Override // Od0.d
    public final InterfaceC8978a create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new C8837b(store, this.f80030a.b());
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends InterfaceC8978a> getKey() {
        return this.f80032c;
    }

    @Override // Od0.b
    @NotNull
    public final Od0.a handleDeeplink(@NotNull Ld0.c store, @NotNull Od0.c deeplink, @NotNull Context activityContext) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        return new a.c();
    }
}
