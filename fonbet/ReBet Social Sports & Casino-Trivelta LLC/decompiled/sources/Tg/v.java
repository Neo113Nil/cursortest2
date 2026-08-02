package Tg;

import Tg.u;
import fh.AbstractC4283a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC7015a f11987a = AbstractC4283a.a("io.ktor.client.plugins.HttpTimeout");

    public static final Sg.a a(Wg.d request, Throwable th2) {
        Object obj;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(request.h());
        sb2.append(", connect_timeout=");
        u.a aVar = (u.a) request.c(u.f11967d);
        if (aVar == null || (obj = aVar.c()) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append(" ms]");
        return new Sg.a(sb2.toString(), th2);
    }

    public static final Sg.b b(Wg.d request, Throwable th2) {
        Object obj;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Socket timeout has expired [url=");
        sb2.append(request.h());
        sb2.append(", socket_timeout=");
        u.a aVar = (u.a) request.c(u.f11967d);
        if (aVar == null || (obj = aVar.e()) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append("] ms");
        return new Sg.b(sb2.toString(), th2);
    }

    public static final long d(long j10) {
        if (j10 == LongCompanionObject.MAX_VALUE) {
            return 0L;
        }
        return j10;
    }
}
