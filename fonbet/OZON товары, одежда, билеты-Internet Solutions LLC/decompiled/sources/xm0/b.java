package xm0;

import Pe.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qm0.C9085a;
import wm0.c;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9085a f105621a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Am0.a f105622b;

    public b(@NotNull C9085a settings, @NotNull Am0.a networkClient) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        this.f105621a = settings;
        this.f105622b = networkClient;
    }

    public final Unit a(@NotNull c cVar) {
        b.a aVar = Pe.b.f22280c;
        aVar.getClass();
        String a11 = aVar.a(c.Companion.serializer(), cVar);
        int a12 = this.f105622b.a(this.f105621a.b(), a11);
        if (200 > a12 || a12 >= 207) {
            Intrinsics.checkNotNullParameter("NetworkDelegate", "tag");
            Intrinsics.checkNotNullParameter("Data not sent", "message");
        } else {
            Intrinsics.checkNotNullParameter("NetworkDelegate", "tag");
            Intrinsics.checkNotNullParameter("Data sent successfully", "message");
        }
        return Unit.f71690a;
    }
}
