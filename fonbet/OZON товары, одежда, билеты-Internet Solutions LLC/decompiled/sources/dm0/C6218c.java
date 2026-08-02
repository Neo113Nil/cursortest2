package dm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC7913b;

/* renamed from: dm0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6218c extends AbstractC7737t implements Function2<Cb.b, InterfaceC7913b, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f61670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C6222g f61671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6218c(String str, C6222g c6222g) {
        super(2);
        this.f61670b = str;
        this.f61671c = c6222g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Cb.b bVar, InterfaceC7913b interfaceC7913b) {
        Cb.b service = bVar;
        InterfaceC7913b callback = interfaceC7913b;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(callback, "callback");
        service.x(this.f61670b, this.f61671c.f61675m, callback);
        return Unit.f71690a;
    }
}
