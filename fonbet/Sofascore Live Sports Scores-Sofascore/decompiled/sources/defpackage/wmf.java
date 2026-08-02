package defpackage;

import android.content.Context;
import com.google.protobuf.Internal;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wmf {
    public final oi3 a;
    public final double b;
    public final double c;
    public final vmf d;
    public final vmf e;

    public wmf(Context context, dy9 dy9Var) {
        wxf wxfVar = new wxf(18);
        double nextDouble = new Random().nextDouble();
        double nextDouble2 = new Random().nextDouble();
        oi3 e = oi3.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(0.0d <= nextDouble && nextDouble < 1.0d)) {
            a70.p("Sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        if (0.0d <= nextDouble2 && nextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            a70.p("Fragment sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        this.b = nextDouble;
        this.c = nextDouble2;
        this.a = e;
        this.d = new vmf(dy9Var, wxfVar, e, "Trace");
        this.e = new vmf(dy9Var, wxfVar, e, AndroidInitializeBoldSDK.MSG_NETWORK);
        b0a.K(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Internal.ProtobufList protobufList) {
        return protobufList.size() > 0 && ((sde) protobufList.get(0)).j() > 0 && ((sde) protobufList.get(0)).i() == u8h.GAUGES_AND_SYSTEM_EVENTS;
    }
}
