package uh0;

import fh0.C6568c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qh0.C9057a;
import ru.ozon.push.sdk.external.service.RemoteMessage;

/* renamed from: uh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10059a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9057a f100796a;

    public C10059a(@NotNull C9057a deduplicationHelper) {
        Intrinsics.checkNotNullParameter(deduplicationHelper, "deduplicationHelper");
        this.f100796a = deduplicationHelper;
    }

    @NotNull
    public final C6568c a(@NotNull RemoteMessage source) {
        Intrinsics.checkNotNullParameter(source, "source");
        String str = source.b().get("message_id");
        C6568c.a aVar = new C6568c.a(str != null ? str.hashCode() : 0, source);
        aVar.d(this.f100796a.f(source));
        return aVar.a();
    }
}
