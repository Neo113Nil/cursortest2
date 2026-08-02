package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ie extends de {
    public final /* synthetic */ int a;
    public final /* synthetic */ je b;
    public final /* synthetic */ String c;
    public final /* synthetic */ yd d;

    public /* synthetic */ ie(je jeVar, String str, yd ydVar, int i) {
        this.a = i;
        this.b = jeVar;
        this.c = str;
        this.d = ydVar;
    }

    @Override // defpackage.de
    public final void a(Object obj, ok3 ok3Var) {
        int i = this.a;
        yd ydVar = this.d;
        String str = this.c;
        je jeVar = this.b;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = jeVar.b;
                ArrayList arrayList = jeVar.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    i3c.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", ydVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    jeVar.b(intValue, ydVar, obj, ok3Var);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = jeVar.d;
                Object obj3 = jeVar.b.get(str);
                if (obj3 == null) {
                    i3c.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", ydVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    jeVar.b(intValue2, ydVar, obj, ok3Var);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    public void b() {
        this.b.f(this.c);
    }
}
