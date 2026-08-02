package defpackage;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tdj extends xka implements Function2 {
    public static final tdj j;
    public static final tdj k;
    public static final tdj l;
    public static final tdj m;
    public static final tdj n;
    public static final tdj o;
    public static final tdj p;
    public final /* synthetic */ int i;

    static {
        int i = 2;
        j = new tdj(i, 0);
        k = new tdj(i, 1);
        l = new tdj(i, 2);
        m = new tdj(i, 3);
        n = new tdj(i, 4);
        o = new tdj(i, 5);
        p = new tdj(i, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdj(int i) {
        super(2);
        this.i = 7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                ((xk5) obj).b = (cfj) obj2;
                return Unit.a;
            case 1:
                ((xk5) obj).c = ((Number) obj2).intValue();
                return Unit.a;
            case 2:
                Context context = (Context) obj;
                hr4 hr4Var = (hr4) obj2;
                context.getClass();
                hr4Var.getClass();
                wf6 wf6Var = new wf6(context.getApplicationContext());
                wf6Var.b(hr4Var);
                HashMap hashMap = new HashMap();
                hashMap.put(cse.c.a, 144179200);
                yq4.a(TTAdConstant.STYLE_SIZE_RADIO_3_2, 0, "bufferForPlaybackMs", "0");
                yq4.a(7500, 0, "bufferForPlaybackAfterRebufferMs", "0");
                yq4.a(7500, TTAdConstant.STYLE_SIZE_RADIO_3_2, "minBufferMs", "bufferForPlaybackMs");
                yq4.a(7500, 7500, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                yq4.a(60000, 7500, "maxBufferMs", "minBufferMs");
                yq4 yq4Var = new yq4(new zz0(5), 7500, 7500, 60000, 60000, TTAdConstant.STYLE_SIZE_RADIO_3_2, TTAdConstant.STYLE_SIZE_RADIO_3_2, 7500, 7500, false, false, 0, false, hashMap);
                z1a.E(!wf6Var.p);
                wf6Var.e = new uf6(yq4Var, 0);
                return wf6Var.a();
            case 3:
                uy8 uy8Var = (uy8) obj2;
                return uy8Var instanceof ic ? uy8Var : obj;
            case 4:
                return obj;
            case 5:
                uy8 uy8Var2 = (uy8) obj2;
                return uy8Var2 instanceof a8l ? uy8Var2 : obj;
            case 6:
                uy8 uy8Var3 = (uy8) obj2;
                return uy8Var3 instanceof q99 ? uy8Var3 : obj;
            default:
                ((Number) obj2).intValue();
                fqj.n(1, (of3) obj);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tdj(int i, int i2) {
        super(i);
        this.i = i2;
    }
}
