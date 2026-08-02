package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mtl implements ye2 {
    public static final List a;
    public static final List b;
    public static final d1m c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        a = b.j(".m3u8", ".m3u");
        b = kotlin.collections.a.c(".mpd");
        c = d1m.a;
    }

    @Override // defpackage.ye2
    public final String a(xe4 xe4Var) {
        xe4Var.getClass();
        String uri = xe4Var.a.toString();
        uri.getClass();
        String str = xe4Var.h;
        if (str == null) {
            str = uri;
        }
        List list = a;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.J(uri, (String) it.next(), true)) {
                    break;
                }
            }
        }
        List list2 = b;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (StringsKt.J(uri, (String) it2.next(), true)) {
                    d1m d1mVar = d1m.a;
                    d1m d1mVar2 = c;
                    if (Intrinsics.c(d1mVar2, d1mVar)) {
                        return uri;
                    }
                    if (!Intrinsics.c(d1mVar2, dxl.a)) {
                        zzl.b();
                        return null;
                    }
                    return "no-cache-" + uri + '#' + System.currentTimeMillis();
                }
            }
        }
        return str;
    }
}
