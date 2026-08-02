package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import lh.C5466a;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public io.ktor.utils.io.a f49486a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f49487b;

    /* renamed from: c, reason: collision with root package name */
    public C5466a f49488c;

    /* renamed from: d, reason: collision with root package name */
    public h f49489d;

    public j(io.ktor.utils.io.a channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f49486a = channel.j0();
        C5466a.e eVar = C5466a.f55859j;
        this.f49487b = eVar.a().g();
        this.f49488c = eVar.a();
        this.f49489d = this.f49486a.K().f49467b;
    }
}
