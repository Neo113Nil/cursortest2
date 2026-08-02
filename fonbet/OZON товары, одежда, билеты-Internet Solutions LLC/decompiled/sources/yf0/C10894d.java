package yf0;

import Cf0.J;
import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import pf0.m;
import zf0.k;

/* renamed from: yf0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C10894d extends AbstractC7737t implements Function0<k> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10896f f106592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10894d(C10896f c10896f) {
        super(0);
        this.f106592b = c10896f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final k invoke() {
        C10896f c10896f = this.f106592b;
        InterfaceC4008j b11 = Sc.k.b(new C10892b(0, c10896f, C10896f.class, "getHttpClient", "getHttpClient()Lru/ozon/network/domain/reachability/data/HttpNetworkClient;", 0));
        InterfaceC4008j b12 = Sc.k.b(new C10893c(0, c10896f, C10896f.class, "getTcpClient", "getTcpClient()Lru/ozon/network/domain/reachability/data/TcpNetworkClient;", 0));
        J j11 = m.f80514a;
        if (j11 != null) {
            return new k(b11, b12, j11.p(), C10896f.a(c10896f).b().a(), C10896f.a(c10896f).a().a(), C10896f.e(c10896f));
        }
        throw new RuntimeException("NetworkDi must be initialized.");
    }
}
