package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzagb;
import com.google.android.gms.internal.ads.zzagd;
import com.google.android.gms.internal.ads.zzagh;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzdjk;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhek;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhgd;
import com.google.android.gms.internal.ads.zzhgj;
import com.google.android.gms.internal.ads.zzhgm;
import com.google.android.gms.internal.ads.zzhjg;
import com.google.android.gms.internal.ads.zzhjh;
import com.google.android.gms.internal.ads.zzhjt;
import com.google.android.gms.internal.ads.zzhla;
import com.google.android.gms.internal.ads.zzhlk;
import com.google.android.gms.internal.ads.zzhmu;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhne;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhor;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhru;
import com.google.android.gms.internal.ads.zzhtg;
import com.google.android.gms.internal.ads.zzhth;
import com.google.android.gms.internal.ads.zzhtj;
import com.google.android.gms.internal.ads.zzhvk;
import com.google.android.gms.internal.ads.zzhvl;
import com.google.android.gms.internal.ads.zzhvm;
import com.google.android.gms.internal.ads.zzhvn;
import com.google.android.gms.internal.ads.zzhwi;
import com.google.android.gms.internal.ads.zzhwo;
import com.google.android.gms.internal.ads.zzhzi;
import com.google.android.gms.internal.ads.zzich;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.cast.zzhg;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzmf;
import com.google.android.gms.internal.measurement.zzmg;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzmi;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class jle implements fug, zzagb, don, zzhcv, zzdjm, e4o, fon, Continuation, zzhoj, zzhmw, zzhoc, zzhmz, zzeb, zzhg {
    public static final /* synthetic */ jle b = new jle(7);
    public static final /* synthetic */ jle c = new jle(12);
    public static final /* synthetic */ jle d = new jle(13);
    public static final /* synthetic */ jle e = new jle(14);
    public static final /* synthetic */ jle f = new jle(16);
    public static final /* synthetic */ jle g = new jle(17);
    public static final /* synthetic */ jle h = new jle(18);
    public static final /* synthetic */ jle i = new jle(19);
    public static final /* synthetic */ jle j = new jle(20);
    public static final /* synthetic */ jle k = new jle(21);
    public static final /* synthetic */ jle l = new jle(23);
    public static final /* synthetic */ jle m = new jle(28);
    public final /* synthetic */ int a;

    public /* synthetic */ jle(int i2) {
        this.a = i2;
    }

    public static Intent d(Context context, int i2, int i3, Integer num, zxe zxeVar, boolean z, Integer num2, Intent intent, wk2 wk2Var) {
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) PlayerActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("PLAYER_ID", i2);
        intent2.putExtra("TOURNAMENT_UNIQUE_ID", i3);
        intent2.putExtra("SCROLL_TO_TRANSFERS", z);
        intent2.putExtra("SEASON_ID", num);
        intent2.putExtra("SELECT_TAB", zxeVar);
        intent2.putExtra("POSITION_ON_FANTASY", num2);
        intent2.putExtra("PRESELECTED_COMPETITION_TYPE", wk2Var);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static Intent e(Context context, int i2, t4j t4jVar, Intent intent, Integer num, Integer num2, String str) {
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) TeamActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("TEAM_ID", i2);
        intent2.putExtra("INITIAL_TAB", t4jVar);
        intent2.putExtra("STATISTICS_TOURNAMENT_ID", num);
        intent2.putExtra("MATCHES_TOURNAMENT_ID", num2);
        intent2.putExtra("SCROLL_TO_STATISTIC", str);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static void i(int i2) {
        synchronized (UnmanagedSessionReceiver.a) {
            if (UnmanagedSessionReceiver.b.get(Integer.valueOf(i2)) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static g8l j(String str) {
        Object obj;
        str.getClass();
        Iterator<E> it = g8l.m.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((g8l) obj).name(), str)) {
                break;
            }
        }
        g8l g8lVar = (g8l) obj;
        return g8lVar == null ? g8l.f : g8lVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static g8l k(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 530056609) {
                switch (hashCode) {
                    case -678739312:
                        if (str.equals("period1")) {
                            return g8l.g;
                        }
                        break;
                    case -678739311:
                        if (str.equals("period2")) {
                            return g8l.h;
                        }
                        break;
                    case -678739310:
                        if (str.equals("period3")) {
                            return g8l.i;
                        }
                        break;
                    case -678739309:
                        if (str.equals("period4")) {
                            return g8l.j;
                        }
                        break;
                }
            } else if (str.equals("overtime")) {
                return g8l.k;
            }
        }
        return g8l.f;
    }

    public static void q(Context context, int i2, int i3, Integer num, zxe zxeVar, boolean z, Integer num2, wk2 wk2Var, int i4) {
        int i5 = PlayerActivity.Z;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            num = null;
        }
        if ((i4 & 16) != 0) {
            zxeVar = null;
        }
        if ((i4 & 32) != 0) {
            z = false;
        }
        if ((i4 & 64) != 0) {
            num2 = null;
        }
        wk2 wk2Var2 = (i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : wk2Var;
        context.getClass();
        context.startActivity(d(context, i2, i3, num, zxeVar, z, num2, null, wk2Var2));
    }

    public static void r(Context context, int i2, t4j t4jVar, Integer num, String str, int i3) {
        int i4 = TeamActivity.Z;
        t4j t4jVar2 = (i3 & 4) != 0 ? null : t4jVar;
        Integer num2 = (i3 & 16) != 0 ? null : num;
        String str2 = (i3 & 64) != 0 ? null : str;
        context.getClass();
        context.startActivity(e(context, i2, t4jVar2, null, num2, null, str2));
    }

    @Override // defpackage.e4o, defpackage.eqo
    public boolean a(Class cls) {
        return false;
    }

    @Override // defpackage.e4o
    /* renamed from: b */
    public m6o mo783b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public String c(Method method, int i2) {
        return "parameter #" + (i2 + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhwi zzhwiVar = (zzhwi) zzhesVar;
        jno jnoVar = zzhzi.a;
        zzhtg H = zzhth.H();
        zzhtj c2 = zzhzi.c(zzhwiVar.a);
        H.n();
        ((zzhth) H.b).K(c2);
        byte[] b2 = zzhwiVar.b.a.b();
        mpo B = zziei.B(0, b2.length, b2);
        H.n();
        ((zzhth) H.b).J(B);
        zziei e2 = ((zzhth) H.o()).e();
        zzhwo zzhwoVar = zzhwiVar.a;
        return zzhos.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", e2, zzhfl.d, zzhzi.a(zzhwoVar.a.a), zzhwoVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        zzhfm zzhfmVar;
        zzhjh zzhjhVar = (zzhjh) zzhfjVar;
        jno jnoVar = zzhlk.a;
        zzhjg zzhjgVar = zzhjhVar.a;
        if (zzhjgVar == zzhjg.b) {
            zzhfmVar = zzhfm.c;
        } else {
            if (zzhjgVar != zzhjg.c) {
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhjgVar.a));
            }
            zzhfmVar = zzhfm.e;
        }
        zzhvk G = zzhvl.G();
        zzhvm E = zzhvn.E();
        int i2 = zzhjhVar.b;
        E.n();
        ((zzhvn) E.b).G(i2);
        zzhvn zzhvnVar = (zzhvn) E.o();
        G.n();
        ((zzhvl) G.b).H(zzhvnVar);
        return zzhot.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", zzhfmVar, (mpo) ((zzhvl) G.o()).e());
    }

    public Object m(Class cls, Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        jno jnoVar = zzhjt.a;
        if (!zzhosVar.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            a70.p("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhru G = zzhru.G(zzieiVar, zziew.c);
            if (G.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (G.E().D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (G.F().D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            int i3 = 0;
            zzhgj zzhgjVar = new zzhgj(i3);
            zzhgjVar.a(G.E().F().o());
            zzhgjVar.b(G.F().F().o());
            zzhgjVar.c(G.E().E().D());
            zzhgjVar.d(G.F().E().E());
            zzhgjVar.e = zzhjt.c(G.F().E().D());
            zzhgjVar.f = zzhjt.b(zzhosVar.e);
            zzhgm e2 = zzhgjVar.e();
            zzhgd zzhgdVar = new zzhgd(i3);
            zzhgdVar.a = e2;
            zzhgdVar.b = new zzicj(zzich.a(G.E().F().d()));
            zzhgdVar.c = new zzicj(zzich.a(G.F().F().d()));
            zzhgdVar.d = zzhosVar.f;
            return zzhgdVar.a();
        } catch (zzige unused) {
            zzl.x("Parsing AesCtrHmacAeadKey failed");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        zzhne zzhneVar = (zzhne) zzhesVar;
        zzhfr zzhfrVar = zzhfr.a;
        zzhos zzhosVar = zzhneVar.a;
        zzhfl zzhflVar = zzhosVar.d;
        return new zzhla((zzhek) zzhmu.d.b(zzhek.class, zzhosVar.a).a(zzhosVar.c), zzhor.a(zzhosVar.e, zzhneVar.a.f).b());
    }

    public boolean p(Method method) {
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        zzadu m2;
        switch (this.a) {
            case 18:
                return new Boolean(task.isSuccessful());
            default:
                zzjh zzjhVar = (zzjh) task.getResult();
                zzmf E = zzmg.E();
                String str = zzjhVar.a;
                E.k();
                ((zzmg) E.b).F(str);
                String str2 = zzjhVar.c;
                E.k();
                ((zzmg) E.b).H(str2);
                boolean z = zzjhVar.f;
                E.k();
                ((zzmg) E.b).K(z);
                long j2 = zzjhVar.g;
                E.k();
                ((zzmg) E.b).L(j2);
                byte[] bArr = zzjhVar.b;
                if (bArr != null) {
                    a9n q = zzacr.q(0, bArr.length, bArr);
                    E.k();
                    ((zzmg) E.b).G(q);
                }
                for (zzjf zzjfVar : zzjhVar.d) {
                    for (zzjo zzjoVar : zzjfVar.b) {
                        int i2 = zzjoVar.g;
                        String str3 = zzjoVar.a;
                        if (i2 == 1) {
                            zzmh E2 = zzmi.E();
                            E2.p(str3);
                            if (i2 != 1) {
                                a70.p("Not a long type");
                                return null;
                            }
                            long j3 = zzjoVar.b;
                            E2.k();
                            ((zzmi) E2.b).H(j3);
                            m2 = E2.m();
                        } else if (i2 == 2) {
                            zzmh E3 = zzmi.E();
                            E3.p(str3);
                            if (i2 != 2) {
                                a70.p("Not a boolean type");
                                return null;
                            }
                            boolean z2 = zzjoVar.c;
                            E3.k();
                            ((zzmi) E3.b).I(z2);
                            m2 = E3.m();
                        } else if (i2 == 3) {
                            zzmh E4 = zzmi.E();
                            E4.p(str3);
                            if (i2 != 3) {
                                a70.p("Not a double type");
                                return null;
                            }
                            double d2 = zzjoVar.d;
                            E4.k();
                            ((zzmi) E4.b).J(d2);
                            m2 = E4.m();
                        } else if (i2 == 4) {
                            zzmh E5 = zzmi.E();
                            E5.p(str3);
                            if (i2 != 4) {
                                a70.p("Not a String type");
                                return null;
                            }
                            String str4 = zzjoVar.e;
                            Preconditions.i(str4);
                            E5.k();
                            ((zzmi) E5.b).K(str4);
                            m2 = E5.m();
                        } else {
                            if (i2 != 5) {
                                a70.p(me4.g(i2, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i2).length() + 24)));
                                return null;
                            }
                            zzmh E6 = zzmi.E();
                            E6.p(str3);
                            if (i2 != 5) {
                                a70.p("Not a bytes type");
                                return null;
                            }
                            byte[] bArr2 = zzjoVar.f;
                            Preconditions.i(bArr2);
                            a9n q2 = zzacr.q(0, bArr2.length, bArr2);
                            E6.k();
                            ((zzmi) E6.b).L(q2);
                            m2 = E6.m();
                        }
                        E.k();
                        ((zzmg) E.b).I((zzmi) m2);
                    }
                    String[] strArr = zzjfVar.c;
                    if (strArr != null) {
                        for (String str5 : strArr) {
                            E.k();
                            ((zzmg) E.b).J(str5);
                        }
                    }
                }
                return (zzmg) E.m();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 16:
                List list = zzfy.a;
                return Boolean.valueOf(zzags.b.get().zzc());
            case 17:
                List list2 = zzfy.a;
                return Boolean.valueOf(zzaif.b.get().zze());
            default:
                Logger logger = m4n.v;
                Logger logger2 = CastContext.l;
                Preconditions.e("Must be called from the main thread.");
                CastContext castContext = CastContext.n;
                Preconditions.i(castContext);
                Preconditions.e("Must be called from the main thread.");
                return castContext.e.a;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public /* synthetic */ void zzb(Object obj) {
        ((zzcyl) obj).zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 12:
                ((zzr) obj).zzdp();
                break;
            case 13:
                ((zzdjk) obj).zza();
                break;
            case 14:
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
                break;
            case 26:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagb, defpackage.fon
    /* renamed from: zza */
    public /* synthetic */ Constructor mo792zza() {
        int[] iArr = zzagd.c;
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzagh.class).getConstructor(null);
    }

    @Override // defpackage.fug
    public void onScrollLimit(int i2, int i3, int i4, boolean z) {
    }

    @Override // defpackage.fug
    public void onScrollProgress(int i2, int i3, int i4, int i5) {
    }
}
