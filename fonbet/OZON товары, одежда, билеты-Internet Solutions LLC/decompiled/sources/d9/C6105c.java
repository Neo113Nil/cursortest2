package d9;

import a9.C4962a;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import b9.C5589d;
import c9.C5769a;
import c9.InterfaceC5771c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzep;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zznw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzue;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import java.util.concurrent.Executor;

/* renamed from: d9.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6105c extends com.google.mlkit.common.sdkinternal.f<C5769a, C4962a> {

    /* renamed from: i, reason: collision with root package name */
    static boolean f61341i = true;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final n f61343d;

    /* renamed from: e, reason: collision with root package name */
    private final zzuc f61344e;

    /* renamed from: f, reason: collision with root package name */
    private final zzue f61345f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC5771c f61346g;

    /* renamed from: j, reason: collision with root package name */
    private static final C5589d f61342j = C5589d.b();

    /* renamed from: h, reason: collision with root package name */
    @KeepForSdk
    private static final com.google.mlkit.common.sdkinternal.n f61340h = new com.google.mlkit.common.sdkinternal.n();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6105c(@NonNull zzuc zzucVar, @NonNull n nVar, @NonNull InterfaceC5771c interfaceC5771c) {
        super(f61340h);
        interfaceC5771c.getClass();
        this.f61344e = zzucVar;
        this.f61343d = nVar;
        this.f61345f = zzue.zza(com.google.mlkit.common.sdkinternal.h.c().b());
        this.f61346g = interfaceC5771c;
    }

    private final void k(long j11, final C4962a c4962a, final zzou zzouVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j11;
        this.f61344e.zzf(new zzub() { // from class: d9.r
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
            public final zztr zza() {
                return C6105c.this.i(elapsedRealtime, c4962a, zzouVar);
            }
        }, zzov.ON_DEVICE_TEXT_DETECT);
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzouVar);
        zzeqVar.zzb(Boolean.valueOf(f61341i));
        zzsa zzsaVar = new zzsa();
        InterfaceC5771c interfaceC5771c = this.f61346g;
        interfaceC5771c.getClass();
        zzsaVar.zza(C6103a.a(1));
        zzeqVar.zzc(zzsaVar.zzc());
        final zzes zzd = zzeqVar.zzd();
        final s sVar = new s(this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor c11 = com.google.mlkit.common.sdkinternal.g.c();
        final zzuc zzucVar = this.f61344e;
        c11.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzua
            @Override // java.lang.Runnable
            public final void run() {
                zzuc.this.zzh(zzovVar, zzd, elapsedRealtime, sVar);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        int d11 = interfaceC5771c.d();
        int zza = zzouVar.zza();
        this.f61345f.zzc(d11, zza, currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.j
    public final synchronized void b() throws R8.a {
        this.f61343d.zzb();
    }

    @Override // com.google.mlkit.common.sdkinternal.j
    public final synchronized void d() {
        f61341i = true;
        this.f61343d.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.f
    @NonNull
    public final Object h(@NonNull C4962a c4962a) throws R8.a {
        C5769a a11;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a11 = this.f61343d.a(c4962a);
                k(elapsedRealtime, c4962a, zzou.NO_ERROR);
                f61341i = false;
            } catch (R8.a e11) {
                k(elapsedRealtime, c4962a, e11.a() == 14 ? zzou.MODEL_NOT_DOWNLOADED : zzou.UNKNOWN_ERROR);
                throw e11;
            }
        }
        return a11;
    }

    final zztr i(long j11, C4962a c4962a, zzou zzouVar) {
        zzrx zzrxVar = new zzrx();
        zzoh zzohVar = new zzoh();
        zzohVar.zzc(Long.valueOf(j11));
        zzohVar.zzd(zzouVar);
        zzohVar.zze(Boolean.valueOf(f61341i));
        Boolean bool = Boolean.TRUE;
        zzohVar.zza(bool);
        zzohVar.zzb(bool);
        zzrxVar.zzd(zzohVar.zzf());
        f61342j.getClass();
        int c11 = c4962a.c();
        int c12 = C5589d.c(c4962a);
        zzoa zzoaVar = new zzoa();
        zzoaVar.zza(c11 != -1 ? c11 != 35 ? c11 != 842094169 ? c11 != 16 ? c11 != 17 ? zzob.UNKNOWN_FORMAT : zzob.NV21 : zzob.NV16 : zzob.YV12 : zzob.YUV_420_888 : zzob.BITMAP);
        zzoaVar.zzb(Integer.valueOf(c12));
        zzrxVar.zzc(zzoaVar.zzd());
        zzsa zzsaVar = new zzsa();
        InterfaceC5771c interfaceC5771c = this.f61346g;
        interfaceC5771c.getClass();
        zzsaVar.zza(C6103a.a(1));
        zzrxVar.zze(zzsaVar.zzc());
        zzrz zzf = zzrxVar.zzf();
        zzow zzowVar = new zzow();
        zzowVar.zze(interfaceC5771c.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzowVar.zzh(zzf);
        return zzuf.zzf(zzowVar);
    }

    final /* synthetic */ zztr j(zzes zzesVar, int i11, zznw zznwVar) {
        zzow zzowVar = new zzow();
        zzowVar.zze(this.f61346g.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzep zzepVar = new zzep();
        zzepVar.zza(Integer.valueOf(i11));
        zzepVar.zzc(zzesVar);
        zzepVar.zzb(zznwVar);
        zzowVar.zzd(zzepVar.zze());
        return zzuf.zzf(zzowVar);
    }
}
