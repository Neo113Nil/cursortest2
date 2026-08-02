package j00;

import k00.C7451d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import n00.C8406a;
import org.jetbrains.annotations.NotNull;
import p00.C8829e;

/* renamed from: j00.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7235b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n00.c f68714a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8406a f68715b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7451d f68716c;

    public C7235b(@NotNull n00.c memoryStorage, @NotNull C8406a diskStorage, @NotNull C7451d cookieDelegate) {
        Intrinsics.checkNotNullParameter(memoryStorage, "memoryStorage");
        Intrinsics.checkNotNullParameter(diskStorage, "diskStorage");
        Intrinsics.checkNotNullParameter(cookieDelegate, "cookieDelegate");
        this.f68714a = memoryStorage;
        this.f68715b = diskStorage;
        this.f68716c = cookieDelegate;
    }

    public final void a() {
        C8829e c8829e = C8829e.f80013b;
        C8406a c8406a = this.f68715b;
        String str = (String) c8406a.c(c8829e);
        boolean K11 = h.K(str);
        C7451d c7451d = this.f68716c;
        if (K11) {
            c7451d.e();
        } else if (c8406a.b()) {
            c8406a.g(c8829e.getName());
            c7451d.e();
        } else {
            c8406a.e("SHOULD_DELETE_X03_COMPOSE_DEBUG_TOKEN", true);
            c7451d.f(str);
        }
    }

    public final void b(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        C8829e c8829e = C8829e.f80013b;
        C8406a c8406a = this.f68715b;
        c8406a.f(c8829e, token);
        c8406a.e("SHOULD_DELETE_X03_COMPOSE_DEBUG_TOKEN", false);
        this.f68714a.f(c8829e, token);
    }
}
