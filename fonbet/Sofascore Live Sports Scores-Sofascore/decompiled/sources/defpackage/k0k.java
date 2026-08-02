package defpackage;

import android.app.Application;
import com.sofascore.model.DateSection;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk0k;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class k0k extends q8 {
    public final vyh e;
    public final yzc f;
    public final lec g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0k(Application application, vyh vyhVar) {
        super(application);
        vyhVar.getClass();
        this.e = vyhVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = waa.w(yzcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [m5i] */
    /* JADX WARN: Type inference failed for: r5v6, types: [nak] */
    /* JADX WARN: Type inference failed for: r5v7, types: [lrj] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [y21] */
    public final ArrayList k(xbb xbbVar) {
        ArrayList arrayList = new ArrayList(k13.r(xbbVar, 10));
        ListIterator listIterator = xbbVar.listIterator(0);
        int i = 0;
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                return arrayList;
            }
            ?? next = hc9Var.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            boolean z = true;
            boolean z2 = i > 0 && (xbbVar.get(i + (-1)) instanceof DateSection);
            if ((i >= xbbVar.size() - 1 || (!(xbbVar.get(i2) instanceof DateSection) && xbbVar.get(i2) != pzh.d)) && i != xbbVar.size() - 1) {
                z = false;
            }
            if (next instanceof Event) {
                next = s9a.J((Event) next, i(), false, false, null, 30);
                next.M = z2;
                next.n = z;
                next.k = wu.TRENDING;
            } else if (next instanceof Tournament) {
                next = w3a.R((Tournament) next, i(), false, false, true, false, false, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                next.k = z2;
                next.l = z;
                next.b = !z2;
                next.g = wu.TRENDING;
            } else if (next instanceof UniqueStage) {
                next = g7a.E(i(), (UniqueStage) next);
                next.e = z2;
                next.f = z;
                next.d = wu.TRENDING;
            } else if (next instanceof Stage) {
                next = i2a.J(i(), (Stage) next);
                next.g = z2;
                next.h = z;
                next.f = wu.TRENDING;
            }
            arrayList.add(next);
            i = i2;
        }
    }
}
