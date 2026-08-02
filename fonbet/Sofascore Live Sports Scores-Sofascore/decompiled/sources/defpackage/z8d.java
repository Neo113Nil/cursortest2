package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z8d {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(y8d y8dVar) {
        y8dVar.getClass();
        String o = haa.o(y8dVar.getClass());
        if (o.length() <= 0) {
            a70.p("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        y8d y8dVar2 = (y8d) linkedHashMap.get(o);
        if (Intrinsics.c(y8dVar2, y8dVar)) {
            return;
        }
        if (y8dVar2 != null && y8dVar2.b) {
            a70.n("Navigator ", y8dVar, " is replacing an already attached ", y8dVar2);
        } else if (y8dVar.b) {
            vp2.b(y8dVar, " is already attached to another NavController", "Navigator ");
        }
    }

    public final y8d b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            a70.p("navigator name cannot be an empty string");
            return null;
        }
        y8d y8dVar = (y8d) this.a.get(str);
        if (y8dVar != null) {
            return y8dVar;
        }
        a70.r(lnb.o("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
