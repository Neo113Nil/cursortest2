package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface eqm {
    default boolean a() {
        return b() == frm.AVAILABLE_ON;
    }

    default frm b() {
        List x = getX();
        Object obj = null;
        if (x != null) {
            Iterator it = x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((gbm) next).a() != null) {
                    obj = next;
                    break;
                }
            }
            obj = (gbm) obj;
        }
        return obj != null ? pc2.b != null ? frm.AVAILABLE_ON : frm.AVAILABLE_OFF : frm.UNAVAILABLE;
    }

    default boolean d() {
        return b() != frm.UNAVAILABLE;
    }

    default String e() {
        Object obj;
        rql a;
        e eVar = pc2.b;
        List x = getX();
        if (x != null) {
            Iterator it = x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((gbm) obj).b, eVar)) {
                    break;
                }
            }
            gbm gbmVar = (gbm) obj;
            if (gbmVar != null && (a = gbmVar.a()) != null) {
                return a.a;
            }
        }
        return null;
    }

    /* renamed from: h */
    List getX();
}
