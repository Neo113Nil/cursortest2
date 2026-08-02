package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.sofascore.model.firebase.AdType;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g4d extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ h4d t;
    public final /* synthetic */ Context u;
    public final /* synthetic */ AdType.Native v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4d(String str, h4d h4dVar, Context context, AdType.Native r4, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = str;
        this.t = h4dVar;
        this.u = context;
        this.v = r4;
        this.w = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new g4d(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g4d) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object q;
        Object value3;
        h4d h4dVar = this.t;
        fdi fdiVar = h4dVar.d;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        Object obj2 = tg.a;
        int i2 = this.w;
        if (i == 0) {
            y6a.M(obj);
            if (this.s == null) {
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, ((tee) value).b(new Integer(i2), obj2)));
                return Unit.a;
            }
            do {
                value2 = fdiVar.getValue();
            } while (!fdiVar.k(value2, ((tee) value2).b(new Integer(i2), vg.a)));
            Context applicationContext = this.u.getApplicationContext();
            applicationContext.getClass();
            int i3 = i2 + 1;
            this.r = 1;
            lj2 lj2Var = new lj2(1, z9a.b(this));
            lj2Var.t();
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            fsf fsfVar = new fsf();
            f4d f4dVar = new f4d(lj2Var);
            String str = this.s;
            AdLoader.Builder builder = new AdLoader.Builder(applicationContext, str);
            AdType.Native r7 = this.v;
            AdLoader build = builder.forNativeAd(new d4d(h4dVar, lj2Var, f4dVar, fsfVar, applicationContext, uuid, r7, str, i3)).withAdListener(new e4d(applicationContext, uuid, r7, str, i3, lj2Var, f4dVar, fsfVar)).withAdManagerAdViewOptions(new AdManagerAdViewOptions.Builder().build()).withNativeAdOptions(new NativeAdOptions.Builder().setRequestCustomMuteThisAd(true).setMediaAspectRatio(3).build()).build();
            build.getClass();
            nv.f(applicationContext, uuid, r7, ru.GOOGLE, str, new Integer(i3), 32);
            AdManagerAdRequest.Builder builder2 = new AdManagerAdRequest.Builder();
            for (Map.Entry entry : h4dVar.c.entrySet()) {
                builder2.addCustomTargeting((String) entry.getKey(), (String) entry.getValue());
            }
            builder2.addCustomTargeting("tid", uuid);
            builder2.addCustomTargeting("plcmttype", "1");
            builder2.addCustomTargeting("context", "1");
            pk.a(builder2, applicationContext);
            build.loadAd(builder2.build());
            q = lj2Var.q();
            lu3 lu3Var2 = lu3.a;
            if (q == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            q = obj;
        }
        NativeAd nativeAd = (NativeAd) q;
        if (nativeAd != null) {
            obj2 = new ug(nativeAd);
        }
        Object obj3 = obj2;
        do {
            value3 = fdiVar.getValue();
        } while (!fdiVar.k(value3, ((tee) value3).b(new Integer(i2), obj3)));
        return Unit.a;
    }
}
