package defpackage;

import com.mbridge.msdk.foundation.download.Command;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class t14 extends ot8 implements ct8 {
    public static final t14 b = new t14(3, v14.class, "fireCronetRequest", "fireCronetRequest-4bQFXqg(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = ((k38) obj).a;
        Map map = (Map) obj2;
        CronetEngine cronetEngine = v14.a;
        lj2 lj2Var = new lj2(1, z9a.b((rq3) obj3));
        lj2Var.t();
        qtj qtjVar = new qtj(lj2Var);
        CronetEngine cronetEngine2 = v14.a;
        if (cronetEngine2 == null) {
            Intrinsics.i("cronetEngine");
            throw null;
        }
        Object value = v14.c.getValue();
        value.getClass();
        UrlRequest.Builder newUrlRequestBuilder = cronetEngine2.newUrlRequestBuilder(str, qtjVar, (Executor) value);
        for (Map.Entry entry : map.entrySet()) {
            newUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        iie iieVar = iie.a;
        newUrlRequestBuilder.addHeader(Command.HTTP_HEADER_USER_AGENT, iie.b());
        newUrlRequestBuilder.disableCache();
        newUrlRequestBuilder.build().start();
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }
}
