package k60;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70936c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f70934a = i11;
        this.f70935b = obj;
        this.f70936c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f70934a) {
            case 0:
                return g.f((MirPayWalletException) this.f70935b, (g) this.f70936c, (MirPayWalletException) obj);
            default:
                l40.d dVar = (l40.d) this.f70935b;
                dVar.f72772f = (J7.b) obj;
                ze.u uVar = (ze.u) this.f70936c;
                if (!uVar.g()) {
                    uVar.b(Boolean.valueOf(l40.d.h(dVar)));
                    uVar.l(null);
                }
                return Unit.f71690a;
        }
    }
}
