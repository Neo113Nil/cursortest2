package nh;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20970a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f20971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f20973d;

    public /* synthetic */ l(q qVar, int i5, List list) {
        this.f20971b = qVar;
        this.f20972c = i5;
        this.f20973d = list;
    }

    private final Object a() {
        q qVar = this.f20971b;
        int i5 = this.f20972c;
        List requestHeaders = this.f20973d;
        qVar.f20990k.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        try {
            qVar.f21001w.y(i5, b.f20921h);
            synchronized (qVar) {
                qVar.f21003y.remove(Integer.valueOf(i5));
                Unit unit = Unit.f19194a;
            }
        } catch (IOException unused) {
        }
        return Unit.f19194a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20970a) {
            case 0:
                return a();
            default:
                q qVar = this.f20971b;
                int i5 = this.f20972c;
                List responseHeaders = this.f20973d;
                qVar.f20990k.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                try {
                    qVar.f21001w.y(i5, b.f20921h);
                    synchronized (qVar) {
                        qVar.f21003y.remove(Integer.valueOf(i5));
                        Unit unit = Unit.f19194a;
                    }
                } catch (IOException unused) {
                }
                return Unit.f19194a;
        }
    }

    public /* synthetic */ l(q qVar, int i5, List list, boolean z5) {
        this.f20971b = qVar;
        this.f20972c = i5;
        this.f20973d = list;
    }
}
