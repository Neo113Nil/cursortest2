package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzefb;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzevp;
import com.google.android.gms.internal.ads.zzeww;
import com.google.android.gms.internal.ads.zzfed;
import com.google.android.gms.internal.ads.zzfes;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzije;
import com.google.android.gms.internal.ads.zzijf;
import com.google.android.gms.internal.ads.zzijg;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class yvn implements zzhcg {
    public static final /* synthetic */ yvn b = new yvn(0);
    public static final /* synthetic */ yvn c = new yvn(2);
    public static final /* synthetic */ yvn d = new yvn(3);
    public static final /* synthetic */ yvn e = new yvn(4);
    public static final /* synthetic */ yvn f = new yvn(5);
    public static final /* synthetic */ yvn g = new yvn(6);
    public static final /* synthetic */ yvn h = new yvn(8);
    public static final /* synthetic */ yvn i = new yvn(9);
    public static final /* synthetic */ yvn j = new yvn(10);
    public static final /* synthetic */ yvn k = new yvn(11);
    public static final /* synthetic */ yvn l = new yvn(12);
    public static final /* synthetic */ yvn m = new yvn(13);
    public static final /* synthetic */ yvn n = new yvn(15);
    public final /* synthetic */ int a;

    public /* synthetic */ yvn(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) zzba.zzc().a(zzbjg.bc)).booleanValue()) {
                    zzt.zzh().f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    zzt.zzh().e("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                mio mioVar = zzgxm.b;
                return zzhcy.a(new tx8(s.e));
            case 1:
                zze.zzb("Error during loading assets.", (Exception) obj);
                return xlo.b;
            case 2:
                Throwable th2 = (ExecutionException) obj;
                if (th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                return zzhcy.b(th2);
            case 3:
                return zzhcy.b(new zzefb(5));
            case 4:
                return zzhcy.a(((zzehq) obj).a);
            case 5:
                return xlo.b;
            case 6:
                Throwable th3 = (ExecutionException) obj;
                if (th3.getCause() != null) {
                    th3 = th3.getCause();
                }
                return zzhcy.b(th3);
            case 7:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                zzcgj.a.execute(new bnn(19, (InputStream) obj, createPipe[1]));
                return zzhcy.a(parcelFileDescriptor);
            case 8:
                return ((Throwable) obj) instanceof TimeoutException ? zzhcy.a(new zzevp(Integer.toString(17))) : zzhcy.a(new zzevp(null));
            case 9:
                return zzhcy.a(new zzevp((String) obj));
            case 10:
                AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                return appSetIdInfo == null ? zzhcy.a(new zzeww(null, -1)) : zzhcy.a(new zzeww(appSetIdInfo.getId(), appSetIdInfo.getScope()));
            case 11:
                tx8 tx8Var = (tx8) obj;
                if (tx8Var == null) {
                    return zzhcy.a(new zzfed("", 1));
                }
                zzijf D = zzijg.D();
                Iterator it = tx8Var.a.iterator();
                if (!it.hasNext()) {
                    return zzhcy.a(new zzfed(Base64.encodeToString(((zzijg) D.o()).d(), 1), 1));
                }
                if (it.next() != null) {
                    pvd.j();
                    return null;
                }
                zzije.D();
                throw null;
            case 12:
                AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                return appSetIdInfo2 == null ? zzhcy.a(new zzfes(null, -1)) : zzhcy.a(new zzfes(appSetIdInfo2.getId(), appSetIdInfo2.getScope()));
            case 13:
                return xlo.b;
            case 14:
                return zzhcy.a("");
            default:
                zzggu zzgguVar = (zzggu) obj;
                return zzhcy.i(zzgguVar.zzb(), new lrn(zzgguVar, 8), slo.a);
        }
    }
}
