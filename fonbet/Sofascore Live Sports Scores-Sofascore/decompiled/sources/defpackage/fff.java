package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzddp;
import com.google.android.gms.internal.ads.zzdgl;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdlw;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhes;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfl;
import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhhe;
import com.google.android.gms.internal.ads.zzhhk;
import com.google.android.gms.internal.ads.zzhhm;
import com.google.android.gms.internal.ads.zzhic;
import com.google.android.gms.internal.ads.zzhkm;
import com.google.android.gms.internal.ads.zzhma;
import com.google.android.gms.internal.ads.zzhmw;
import com.google.android.gms.internal.ads.zzhmz;
import com.google.android.gms.internal.ads.zzhne;
import com.google.android.gms.internal.ads.zzhnz;
import com.google.android.gms.internal.ads.zzhoc;
import com.google.android.gms.internal.ads.zzhoj;
import com.google.android.gms.internal.ads.zzhor;
import com.google.android.gms.internal.ads.zzhos;
import com.google.android.gms.internal.ads.zzhot;
import com.google.android.gms.internal.ads.zzhqz;
import com.google.android.gms.internal.ads.zzhso;
import com.google.android.gms.internal.ads.zzhsw;
import com.google.android.gms.internal.ads.zzhtw;
import com.google.android.gms.internal.ads.zzhuj;
import com.google.android.gms.internal.ads.zzhuk;
import com.google.android.gms.internal.ads.zzhve;
import com.google.android.gms.internal.ads.zzhvf;
import com.google.android.gms.internal.ads.zzhvh;
import com.google.android.gms.internal.ads.zzhvs;
import com.google.android.gms.internal.ads.zzhye;
import com.google.android.gms.internal.ads.zzhyg;
import com.google.android.gms.internal.ads.zzhyz;
import com.google.android.gms.internal.ads.zziac;
import com.google.android.gms.internal.ads.zzich;
import com.google.android.gms.internal.ads.zzicj;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzqx;
import com.google.android.gms.internal.measurement.zzags;
import com.google.android.gms.internal.measurement.zzaja;
import com.google.android.gms.internal.measurement.zzajb;
import com.google.android.gms.internal.pal.zzgi;
import com.google.android.gms.internal.pal.zzgp;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.List;
import kotlin.text.CharsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fff implements o2c, ky3, SuccessContinuation, zzq, zzbus, fon, zzdjm, zzhcv, zzgp, zzhoc, zzhmw, zzhoj, zzhnz, zzhmz, zzeb {
    public static final /* synthetic */ fff b = new fff(6);
    public static final /* synthetic */ fff c = new fff(7);
    public static final /* synthetic */ fff d = new fff(8);
    public static final /* synthetic */ fff e = new fff(9);
    public static final /* synthetic */ fff f = new fff(10);
    public static final /* synthetic */ fff g = new fff(11);
    public static final /* synthetic */ fff h = new fff(12);
    public static final /* synthetic */ fff i = new fff(13);
    public static final /* synthetic */ fff j = new fff(15);
    public static final /* synthetic */ fff k = new fff(16);
    public static final /* synthetic */ fff l = new fff(17);
    public static final /* synthetic */ fff m = new fff(19);
    public static final /* synthetic */ fff n = new fff(20);
    public static final /* synthetic */ fff o = new fff(21);
    public static final /* synthetic */ fff p = new fff(22);
    public static final /* synthetic */ fff q = new fff(23);
    public static final /* synthetic */ fff r = new fff(27);
    public final /* synthetic */ int a;

    public /* synthetic */ fff(int i2, int i3) {
        this.a = 24;
    }

    public static mgg b(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? mgg.UNKNOWN : mgg.AD_RESPONSE : mgg.BIDDING_WIN : mgg.MEDIATION : mgg.RTB : mgg.DIRECT : mgg.NOAD;
    }

    public static MediaCodec c(n2c n2cVar) {
        n2cVar.a.getClass();
        String str = n2cVar.a.a;
        q5a.y("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        q5a.B();
        return createByCodecName;
    }

    public static Intent e(Context context, int i2, o4i o4iVar, Intent intent) {
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) StageDetailsActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("OPEN_STAGE_ID", i2);
        intent2.putExtra("INITIAL_TAB", o4iVar);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static void i(fff fffVar, Context context, int i2) {
        context.getClass();
        context.startActivity(e(context, i2, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public /* synthetic */ Object a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }

    @Override // defpackage.o2c
    public q2c d(n2c n2cVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = c(n2cVar);
            q5a.y("configureCodec");
            mediaCodec.configure(n2cVar.b, n2cVar.d, n2cVar.e, 0);
            q5a.B();
            q5a.y("startCodec");
            mediaCodec.start();
            q5a.B();
            return new hcc(mediaCodec);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhnz
    public zzhfj f(zzhot zzhotVar) {
        jno jnoVar = zzhyz.a;
        zzhtw zzhtwVar = zzhotVar.b;
        if (!zzhtwVar.D().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            a70.p("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(zzhtwVar.D())));
            return null;
        }
        try {
            zziei E = zzhtwVar.E();
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhsw E2 = zzhsw.E(E, zziew.c);
            zzhvs zzhvsVar = new zzhvs(0);
            zzhvsVar.c = zzhyz.b(E2.D().D());
            zzhvsVar.a = zzhyz.h(E2.D().I());
            zzhvsVar.b = zzhyz.g(E2.D().H());
            zzhvsVar.d = zzhyz.c(zzhotVar.c);
            return zzhvsVar.a();
        } catch (zzige e2) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e2);
        }
    }

    public void g(Context context, Stage stage, Integer num) {
        context.getClass();
        stage.getClass();
        if (stage.getType() != ServerType.EVENT) {
            i(this, context, stage.getId());
            return;
        }
        Intent e2 = e(context, stage.getId(), null, null);
        e2.putExtra("CHAT_INTERFACE_OBJECT", stage);
        if (num != null) {
            e2.putExtra("SUB_STAGE_ID", num.intValue());
        }
        context.startActivity(e2);
    }

    @Override // com.google.android.gms.internal.ads.zzhmz
    public zzhos h(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhye zzhyeVar = (zzhye) zzhesVar;
        jno jnoVar = zziac.a;
        zzhve M = zzhvf.M();
        M.n();
        ((zzhvf) M.b).O();
        zzhvh d2 = zziac.d(zzhyeVar.a);
        M.n();
        ((zzhvf) M.b).P(d2);
        byte[] a = zzhma.a(zzhyeVar.b.a);
        mpo mpoVar = zziei.b;
        mpo B = zziei.B(0, a.length, a);
        M.n();
        ((zzhvf) M.b).Q(B);
        byte[] a2 = zzhma.a(zzhyeVar.c.a);
        mpo B2 = zziei.B(0, a2.length, a2);
        M.n();
        ((zzhvf) M.b).R(B2);
        byte[] a3 = zzhma.a(zzhyeVar.d.a);
        mpo B3 = zziei.B(0, a3.length, a3);
        M.n();
        ((zzhvf) M.b).S(B3);
        byte[] a4 = zzhma.a(zzhyeVar.e.a);
        mpo B4 = zziei.B(0, a4.length, a4);
        M.n();
        ((zzhvf) M.b).U(B4);
        byte[] a5 = zzhma.a(zzhyeVar.f.a);
        mpo B5 = zziei.B(0, a5.length, a5);
        M.n();
        ((zzhvf) M.b).V(B5);
        byte[] a6 = zzhma.a(zzhyeVar.g.a);
        mpo B6 = zziei.B(0, a6.length, a6);
        M.n();
        ((zzhvf) M.b).W(B6);
        zziei e2 = ((zzhvf) M.o()).e();
        zzhyg zzhygVar = zzhyeVar.a;
        return zzhos.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", e2, zzhfl.d, zziac.a(zzhygVar.a.c), zzhygVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzhoc
    public zzhot l(zzhfj zzhfjVar) {
        zzhic zzhicVar = (zzhic) zzhfjVar;
        jno jnoVar = nmo.a;
        zzhfm a = nmo.a(zzhicVar.b);
        zzhuj F = zzhuk.F();
        String str = zzhicVar.a;
        F.n();
        ((zzhuk) F.b).H(str);
        return zzhot.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", a, (mpo) ((zzhuk) F.o()).e());
    }

    @Override // com.google.android.gms.internal.ads.zzhmw
    public zzhes n(zzhos zzhosVar, zzhfr zzhfrVar) {
        jno jnoVar = zzhkm.a;
        if (!zzhosVar.a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            a70.p("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
            return null;
        }
        try {
            zziei zzieiVar = zzhosVar.c;
            zziew zziewVar = zziew.b;
            int i2 = dpo.a;
            zzhso F = zzhso.F(zzieiVar, zziew.c);
            if (F.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            int i3 = 0;
            zzhhk zzhhkVar = new zzhhk(i3);
            zzhhkVar.a(F.E().o());
            zzhhkVar.b = zzhkm.b(zzhosVar.e);
            zzhhm b2 = zzhhkVar.b();
            zzhhe zzhheVar = new zzhhe(i3);
            zzhheVar.a = b2;
            zzhheVar.b = new zzicj(zzich.a(F.E().d()));
            zzhheVar.c = zzhosVar.f;
            return zzhheVar.a();
        } catch (zzige unused) {
            zzl.x("Parsing AesGcmSivKey failed");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhoj
    public Object o(zzhes zzhesVar) {
        zzhne zzhneVar = (zzhne) zzhesVar;
        zzhfr zzhfrVar = zzhfr.a;
        zzhos zzhosVar = zzhneVar.a;
        zzhfl zzhflVar = zzhosVar.d;
        zzhfm zzhfmVar = zzhosVar.e;
        zzhor.e(zzhfmVar);
        zzhor.a(zzhfmVar, zzhneVar.a.f).b();
        return new zzhqz();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = Rpc.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                num.getClass();
                return bf3.k("CreationExtras.Key@", num, "<", duf.a.getOrCreateKotlinClass(Application.class).getSimpleName(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.fon
    /* renamed from: zza */
    public Object mo792zza() {
        switch (this.a) {
            case 9:
                List list = zzfy.a;
                return Long.valueOf(zzags.b.get().a());
            case 10:
                List list2 = zzfy.a;
                return Long.valueOf(zzags.b.get().f());
            case 15:
                List list3 = zzfy.a;
                return Integer.valueOf((int) zzags.b.get().k());
            case 16:
                List list4 = zzfy.a;
                return Boolean.valueOf(((zzajb) zzaja.b.a.a).zzb());
            default:
                List list5 = zzfy.a;
                return Long.valueOf(zzags.b.get().zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public /* synthetic */ void zzb(Object obj) {
        ((zzclm) obj).destroy();
    }

    public /* synthetic */ fff(int i2) {
        this.a = i2;
    }

    public fff(zzgi zzgiVar) {
        this.a = 18;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 11:
                ((zzddp) obj).L();
                break;
            case 12:
                ((zzdgl) obj).b();
                break;
            case 13:
                ((zzdlw) obj).M();
                break;
            case 24:
                int i2 = cwo.Z;
                ((zzaz) obj).zzu();
                break;
            case 25:
                break;
            case 26:
                break;
            default:
                ((zzqx) obj).zzb();
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    /* renamed from: zza */
    public Object mo910zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i2 = zzbfb.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof zzbfc) {
            return (zzbfc) queryLocalInterface;
        }
        return new zzbfa(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }
}
