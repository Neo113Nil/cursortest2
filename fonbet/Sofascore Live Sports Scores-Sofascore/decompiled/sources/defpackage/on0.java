package defpackage;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class on0 implements tmi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ on0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.tmi
    public final Object get() {
        sn4 sn4Var;
        tn4 tn4Var;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return un0.y(context);
            case 1:
                return new fp4(context);
            case 2:
                return new gr4(new z41(context, 27), new gp4());
            case 3:
                return new hu4(context);
            case 4:
                return new zr4(context);
            case 5:
                return new hr4(new eo4(context), new hp4());
            case 6:
                vvf vvfVar = sn4.n;
                synchronized (sn4.class) {
                    sn4Var = sn4.t;
                    if (sn4Var == null) {
                        z41 z41Var = new z41(context, 23);
                        sn4 sn4Var2 = new sn4((Context) z41Var.b, (HashMap) z41Var.c);
                        sn4.t = sn4Var2;
                        sn4Var = sn4Var2;
                    }
                }
                return sn4Var;
            case 7:
                return new iu4(context);
            default:
                vvf vvfVar2 = tn4.p;
                synchronized (tn4.class) {
                    tn4Var = tn4.v;
                    if (tn4Var == null) {
                        Long valueOf = Long.valueOf(C.TIME_UNSET);
                        Context applicationContext = context == null ? null : context.getApplicationContext();
                        HashMap hashMap = new HashMap(8);
                        hashMap.put(0, 1000000L);
                        hashMap.put(2, valueOf);
                        hashMap.put(3, valueOf);
                        hashMap.put(4, valueOf);
                        hashMap.put(5, valueOf);
                        hashMap.put(10, valueOf);
                        hashMap.put(9, valueOf);
                        hashMap.put(7, valueOf);
                        tn4Var = new tn4(applicationContext, hashMap);
                        tn4.v = tn4Var;
                    }
                }
                return tn4Var;
        }
    }
}
