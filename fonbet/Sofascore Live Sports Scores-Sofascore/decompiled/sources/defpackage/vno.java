package defpackage;

import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import java.lang.Thread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vno implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ zzhz b;

    public vno(zzhz zzhzVar, String str) {
        this.b = zzhzVar;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        zzgu zzguVar = ((zzic) this.b.b).f;
        zzic.m(zzguVar);
        zzguVar.g.b(th, this.a);
    }
}
