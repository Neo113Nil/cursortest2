package oi;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class v implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f21346b;

    public /* synthetic */ v(d dVar, int i5) {
        this.f21345a = i5;
        this.f21346b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21345a) {
            case 0:
                this.f21346b.cancel();
                break;
            case 1:
                this.f21346b.cancel();
                break;
            default:
                this.f21346b.cancel();
                break;
        }
        return Unit.f19194a;
    }
}
