package defpackage;

import android.app.LocaleManager;
import android.content.pm.ApkChecksum;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzhpc;
import com.google.android.gms.internal.ads.zzigd;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.measurement.zzaeh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hbo {
    public static /* bridge */ /* synthetic */ LocaleManager b(Object obj) {
        return (LocaleManager) obj;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum c(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return LocaleManager.class;
    }

    public static /* synthetic */ void e() {
        throw new zzigd();
    }

    public static /* synthetic */ void f(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Length too large: ");
        sb.append(i2);
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void g(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "Source subfield ");
        sb.append(i2);
        sb.append((Object) " is present but null: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void h(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + ((Object) obj.toString()));
    }

    public static /* synthetic */ void i(String str) {
        throw new zzige(str);
    }

    public static /* synthetic */ void j(Throwable th) {
        throw new zzhpc(th);
    }

    public static /* synthetic */ void k() {
        throw new InterruptedException();
    }

    public static /* synthetic */ void l(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new lan(str);
    }

    public static /* synthetic */ void n() {
        throw new RemoteException();
    }

    public static /* synthetic */ void o(String str) {
        throw new zzaeh(str);
    }
}
