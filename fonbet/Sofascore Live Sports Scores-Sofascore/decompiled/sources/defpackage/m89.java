package defpackage;

import com.ironsource.C4094gc;
import com.unity3d.services.core.network.model.HttpRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class m89 {
    public static final x79 a;
    public static final x79 b;
    public static final x79 c;
    public static final x79 d;
    public static final x79 e;
    public static final x79 f;

    static {
        gc2 gc2Var = x79.g;
        a = new x79(HttpRequest.DEFAULT_SCHEME, gc2Var);
        b = new x79("http", gc2Var);
        gc2 gc2Var2 = x79.e;
        c = new x79(C4094gc.b, gc2Var2);
        d = new x79(C4094gc.a, gc2Var2);
        e = new x79(n49.i.a, "application/grpc");
        f = new x79("te", "trailers");
    }
}
