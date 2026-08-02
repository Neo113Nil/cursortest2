package ch;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ch.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5833d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f57183a;

    public C5833d(@NotNull Map<String, String> rawPushData) {
        Intrinsics.checkNotNullParameter(rawPushData, "rawPushData");
        this.f57183a = rawPushData;
    }
}
