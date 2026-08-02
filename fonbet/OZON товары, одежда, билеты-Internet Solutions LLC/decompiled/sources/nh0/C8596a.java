package nh0;

import Ih0.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

/* renamed from: nh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8596a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f77152a;

    public C8596a(@NotNull d pushStatusProcessor) {
        Intrinsics.checkNotNullParameter(pushStatusProcessor, "pushStatusProcessor");
        this.f77152a = pushStatusProcessor;
    }

    public final void a(@NotNull RemoteMessage message, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f77152a.b(message, bool);
    }

    public final void b(@NotNull String str) {
        this.f77152a.c(str);
    }

    public final void c(@NotNull RemoteMessage message, long j11, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f77152a.d(message, j11, str, bool);
    }
}
