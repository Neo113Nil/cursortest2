package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b\"\f\b\u0000\u0010\u0004*\u00020\u0002*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrod;", "Llb3;", "Lvcd;", "Lpcd;", "T", "Lucd;", "request", "callback", "", "a", "(Lucd;Lvcd;)V", "request_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class rod implements lb3 {
    public final zdc d;
    public final jod e;

    public rod() {
        iod iodVar = new iod();
        Regex regex = zdc.e;
        zdc v = bea.v("application/json; charset=utf-8");
        this.d = v;
        iodVar.c.add(new x49(v));
        this.e = new jod(iodVar);
    }

    public final <T extends vcd & pcd> void a(@NotNull ucd request, @NotNull T callback) {
        String b;
        request.getClass();
        callback.getClass();
        rod rodVar = i0g.a;
        pv1 pv1Var = request.a;
        Pair pair = new Pair("x-openrtb-version", "2.5");
        iie iieVar = iie.a;
        Pair pair2 = new Pair("Nimbus-Instance-Id", (String) iie.f.getValue());
        String str = request.f;
        if (str == null) {
            Intrinsics.i("apiKey");
            throw null;
        }
        Pair pair3 = new Pair("Nimbus-Api-Key", str);
        Pair pair4 = new Pair("Nimbus-Sdkv", "2.37.0");
        t05 t05Var = pv1Var.c;
        if (t05Var == null || (b = t05Var.a) == null) {
            b = iie.b();
        }
        Map h = tub.h(pair, pair2, pair3, pair4, new Pair(Command.HTTP_HEADER_USER_AGENT, b));
        Collection values = h.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((String) it.next()).length() <= 0) {
                    h = null;
                    break;
                }
            }
        }
        if (h == null) {
            callback.onError(new qcd(1, "Nimbus not initialized", null));
            return;
        }
        pzf pzfVar = new pzf();
        pzfVar.f(request.d);
        q89 q89Var = q89.b;
        pzfVar.c = vha.k(ktm.E(h));
        xzf xzfVar = yzf.Companion;
        ov1 ov1Var = pv1.Companion;
        bga bgaVar = pv1.n;
        ov1Var.getClass();
        bgaVar.getClass();
        String c = bgaVar.c(ov1Var.serializer(), pv1Var);
        xzfVar.getClass();
        pzfVar.e(C4094gc.b, xzf.b(c, this.d));
        FirebasePerfOkHttpClient.enqueue(new pof(this.e, new qzf(pzfVar)), new k1d(this, callback, request));
    }

    @Override // defpackage.lb3
    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet = o0g.a;
        i0g.a = this;
    }
}
