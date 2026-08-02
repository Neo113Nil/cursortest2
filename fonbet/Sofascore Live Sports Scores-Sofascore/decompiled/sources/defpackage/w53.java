package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w53 implements Comparator {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public w53(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xkk xkkVar = (xkk) obj;
        xkkVar.getClass();
        int i = xkkVar.h;
        int i2 = xkkVar.i;
        float f = this.a;
        float abs = Math.abs((i / i2) - f);
        float f2 = this.b;
        float f3 = this.c;
        Float valueOf = Float.valueOf((Math.abs(i2 - r7) / f3) + (Math.abs(i - r3) / f2) + abs);
        xkk xkkVar2 = (xkk) obj2;
        xkkVar2.getClass();
        return valueOf.compareTo(Float.valueOf((Math.abs(r9 - r7) / f3) + (Math.abs(r0 - r3) / f2) + Math.abs((xkkVar2.h / xkkVar2.i) - f)));
    }
}
