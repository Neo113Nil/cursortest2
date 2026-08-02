package com.android.billingclient.api;

import bet.prediction.response.Http4XX;
import bet.prediction.response.MHttpException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements v, r, t, oi.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4010a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ eg.r f4011b;

    public void a(k kVar) {
        eg.r deferred = this.f4011b;
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(kVar);
        deferred.Q(kVar);
    }

    @Override // oi.g
    public void b(oi.d call, Throwable t3) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t3, "t");
        this.f4011b.h0(t3);
    }

    public void c(k kVar, String str) {
        eg.r deferred = this.f4011b;
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(kVar);
        deferred.Q(new l(kVar, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[Catch: all -> 0x0018, TryCatch #2 {all -> 0x0018, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x001b, B:9:0x0023, B:10:0x0028, B:13:0x002c, B:17:0x0036, B:22:0x0041, B:23:0x0050, B:26:0x0055, B:31:0x005c), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // oi.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(oi.d call, oi.s0 response) {
        String str;
        v3.a aVar;
        gh.r0 r0Var;
        gh.o0 o0Var = response.f21334a;
        eg.r rVar = this.f4011b;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            try {
                r0Var = response.f21336c;
            } catch (Exception unused) {
            }
            if (r0Var != null) {
                str = r0Var.r();
                Object obj = response.f21335b;
                if (!o0Var.f10287p) {
                    if (obj == null) {
                        obj = new r3.a(response);
                    }
                    rVar.Q(obj);
                    return;
                }
                int i5 = o0Var.f10276d;
                if (400 > i5 || i5 >= 600) {
                    rVar.h0(new oi.q(response));
                    return;
                }
                Intrinsics.checkNotNullParameter(response, "response");
                int i10 = o0Var.f10276d;
                if (400 <= i10 && i10 < 500) {
                    try {
                        aVar = (v3.a) new com.google.gson.j().b(Http4XX.class, str);
                    } catch (Exception unused2) {
                    }
                    rVar.h0(new MHttpException(response, aVar, aVar == null ? str : null));
                    return;
                }
                aVar = null;
                rVar.h0(new MHttpException(response, aVar, aVar == null ? str : null));
                return;
            }
            str = null;
            Object obj2 = response.f21335b;
            if (!o0Var.f10287p) {
            }
        } catch (Throwable th2) {
            rVar.h0(th2);
        }
    }

    public void e(k kVar, List list) {
        eg.r deferred = this.f4011b;
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(kVar);
        deferred.Q(new a0(kVar, list));
    }

    @Override // com.android.billingclient.api.r
    public void onProductDetailsResponse(k kVar, List list) {
        eg.r deferred = this.f4011b;
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(kVar);
        deferred.Q(new s(kVar, (ArrayList) list));
    }

    @Override // com.android.billingclient.api.t
    public void onPurchaseHistoryResponse(k kVar, List list) {
        switch (this.f4010a) {
            case 6:
                eg.r deferred = this.f4011b;
                Intrinsics.checkNotNullParameter(deferred, "$deferred");
                Intrinsics.checkNotNull(kVar);
                deferred.Q(new u(kVar, list));
                break;
            default:
                eg.r deferred2 = this.f4011b;
                Intrinsics.checkNotNullParameter(deferred2, "$deferred");
                Intrinsics.checkNotNull(kVar);
                deferred2.Q(new u(kVar, list));
                break;
        }
    }

    @Override // com.android.billingclient.api.v
    public void onQueryPurchasesResponse(k kVar, List list) {
        switch (this.f4010a) {
            case 0:
                eg.r deferred = this.f4011b;
                Intrinsics.checkNotNullParameter(deferred, "$deferred");
                Intrinsics.checkNotNull(kVar);
                Intrinsics.checkNotNull(list);
                deferred.Q(new w(kVar, list));
                break;
            default:
                eg.r deferred2 = this.f4011b;
                Intrinsics.checkNotNullParameter(deferred2, "$deferred");
                Intrinsics.checkNotNull(kVar);
                Intrinsics.checkNotNull(list);
                deferred2.Q(new w(kVar, list));
                break;
        }
    }

    public e(eg.r rVar) {
        this.f4010a = 8;
        this.f4011b = rVar;
    }
}
