package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzxf;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlr;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzom;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pcp implements zzdu, fwo {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pcp(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // defpackage.fwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        zzlr zzlrVar;
        AtomicReference atomicReference;
        zzlj zzljVar = (zzlj) this.a;
        zzljVar.Q();
        zzom zzomVar = (zzom) this.c;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            zzgu zzguVar = ((zzic) zzljVar.b).f;
            zzic.m(zzguVar);
            zzguVar.j.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.a), Integer.valueOf(i), th);
            zzlrVar = !Arrays.asList(((String) zzfy.u.a(null)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)).contains(String.valueOf(i)) ? zzlr.BACKOFF : zzlr.FAILURE;
            atomicReference = (AtomicReference) this.b;
            zznl o = ((zzic) zzljVar.b).o();
            long j = zzomVar.a;
            zzaf zzafVar = new zzaf(j, zzlrVar.a, zzomVar.f);
            o.Q();
            o.R();
            o.e0(new jgo(13, o, o.g0(true), zzafVar));
            zzgu zzguVar2 = ((zzic) zzljVar.b).f;
            zzic.m(zzguVar2);
            zzguVar2.o.c(Long.valueOf(j), zzlrVar, "[sgtm] Updated status for row_id");
            synchronized (atomicReference) {
                atomicReference.set(zzlrVar);
                atomicReference.notifyAll();
            }
            return;
        }
        if (th == null) {
            zzgu zzguVar3 = ((zzic) zzljVar.b).f;
            zzic.m(zzguVar3);
            zzguVar3.o.b(Long.valueOf(zzomVar.a), "[sgtm] Upload succeeded for row_id");
            zzlrVar = zzlr.SUCCESS;
            atomicReference = (AtomicReference) this.b;
            zznl o2 = ((zzic) zzljVar.b).o();
            long j2 = zzomVar.a;
            zzaf zzafVar2 = new zzaf(j2, zzlrVar.a, zzomVar.f);
            o2.Q();
            o2.R();
            o2.e0(new jgo(13, o2, o2.g0(true), zzafVar2));
            zzgu zzguVar22 = ((zzic) zzljVar.b).f;
            zzic.m(zzguVar22);
            zzguVar22.o.c(Long.valueOf(j2), zzlrVar, "[sgtm] Updated status for row_id");
            synchronized (atomicReference) {
            }
        }
        zzgu zzguVar4 = ((zzic) zzljVar.b).f;
        zzic.m(zzguVar4);
        zzguVar4.j.d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar.a), Integer.valueOf(i), th);
        if (!Arrays.asList(((String) zzfy.u.a(null)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)).contains(String.valueOf(i))) {
        }
        atomicReference = (AtomicReference) this.b;
        zznl o22 = ((zzic) zzljVar.b).o();
        long j22 = zzomVar.a;
        zzaf zzafVar22 = new zzaf(j22, zzlrVar.a, zzomVar.f);
        o22.Q();
        o22.R();
        o22.e0(new jgo(13, o22, o22.g0(true), zzafVar22));
        zzgu zzguVar222 = ((zzic) zzljVar.b).f;
        zzic.m(zzguVar222);
        zzguVar222.o.c(Long.valueOf(j22), zzlrVar, "[sgtm] Updated status for row_id");
        synchronized (atomicReference) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzxz) obj).l(0, ((zzxy) this.a).a, (zzxf) this.b, (zzxk) this.c);
    }
}
