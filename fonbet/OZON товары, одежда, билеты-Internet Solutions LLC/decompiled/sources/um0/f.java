package um0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f100841a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f100842b;

    public f(@NotNull c deviceIdProvider) {
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f100841a = deviceIdProvider;
        this.f100842b = "";
    }

    @NotNull
    public final String a() {
        if (this.f100842b.length() == 0) {
            this.f100842b = ym0.b.a() + ' ' + this.f100841a.getDeviceId();
        }
        return this.f100842b;
    }
}
