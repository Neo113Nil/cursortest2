package nh;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20964c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20965d;

    public /* synthetic */ j(int i5, String str, sg.u uVar) {
        this.f20962a = 2;
        this.f20964c = i5;
        this.f20963b = str;
        this.f20965d = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        qg.h d10;
        switch (this.f20962a) {
            case 0:
                q qVar = (q) this.f20963b;
                int i5 = this.f20964c;
                b statusCode = (b) this.f20965d;
                try {
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    qVar.f21001w.y(i5, statusCode);
                } catch (IOException e7) {
                    b bVar = b.f20917d;
                    qVar.c(bVar, bVar, e7);
                }
                return Unit.f19194a;
            case 1:
                q qVar2 = (q) this.f20963b;
                int i10 = this.f20964c;
                b errorCode = (b) this.f20965d;
                qVar2.f20990k.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (qVar2) {
                    qVar2.f21003y.remove(Integer.valueOf(i10));
                }
                return Unit.f19194a;
            default:
                int i11 = this.f20964c;
                String str = (String) this.f20963b;
                sg.u uVar = (sg.u) this.f20965d;
                qg.g[] gVarArr = new qg.g[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    d10 = y4.a.d(str + '.' + uVar.f23704e[i12], qg.k.f22181h, new qg.g[0], new k2.d0(16));
                    gVarArr[i12] = d10;
                }
                return gVarArr;
        }
    }

    public /* synthetic */ j(q qVar, int i5, b bVar, int i10) {
        this.f20962a = i10;
        this.f20963b = qVar;
        this.f20964c = i5;
        this.f20965d = bVar;
    }
}
