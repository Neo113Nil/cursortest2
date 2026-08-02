package defpackage;

import android.content.Context;
import com.ironsource.C4094gc;
import com.vungle.ads.internal.network.VungleApiClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class t3g implements q7a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t3g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                epf epfVar = (epf) p7aVar;
                qzf qzfVar = epfVar.e;
                pzf b = qzfVar.b();
                b.f(StringsKt.W(qzfVar.a.i, "/"));
                if (waa.D((Context) obj)) {
                    b.c("Cache-Control", "max-age=0");
                    return epfVar.b(new qzf(b));
                }
                b.c("Cache-Control", "max-stale=604800");
                return epfVar.b(new qzf(b));
            case 1:
                y3g y3gVar = (y3g) obj;
                epf epfVar2 = (epf) p7aVar;
                qzf qzfVar2 = epfVar2.e;
                d2g b2 = epfVar2.b(qzfVar2);
                boolean c = Intrinsics.c(qzfVar2.b, C4094gc.a);
                boolean z = b2.q;
                if (!c && !z && b2.d == 401) {
                    try {
                        y3gVar.w();
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable unused) {
                    }
                }
                return b2;
            case 2:
                bka bkaVar = (bka) obj;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                epf epfVar3 = (epf) p7aVar;
                d2g b3 = epfVar3.b(epfVar3.e);
                synchronized (bkaVar) {
                    try {
                        String a = b3.f.a("Date");
                        if (a == null) {
                            a = null;
                        }
                        if (a != null) {
                            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                            long j = currentTimeMillis2 - currentTimeMillis;
                            try {
                                SimpleDateFormat simpleDateFormat = (SimpleDateFormat) bkaVar.b;
                                simpleDateFormat.applyPattern("EEE, dd MMM yyyy HH:mm:ss zzz");
                                int time = (int) (((simpleDateFormat.parse(a).getTime() / 1000) - currentTimeMillis2) - j);
                                if (Math.abs(xe6.c().b - time) < 10) {
                                    if (xe6.c().a) {
                                    }
                                }
                                xe6 c2 = xe6.c();
                                c2.b = time;
                                c2.a = false;
                            } catch (ParseException e2) {
                                e2.printStackTrace();
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return b3;
            default:
                return VungleApiClient.a((VungleApiClient) obj, p7aVar);
        }
    }
}
