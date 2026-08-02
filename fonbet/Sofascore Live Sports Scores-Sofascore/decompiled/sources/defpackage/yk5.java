package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yk5 implements mk5 {
    public int a;
    public final boolean b;
    public final ArrayList c;

    public yk5(int i) {
        int i2 = (i & 1) != 0 ? Integer.MAX_VALUE : 50;
        boolean z = (i & 2) == 0;
        this.a = i2;
        this.b = z;
        this.c = new ArrayList();
    }

    public final String c() {
        return dii.b(CollectionsKt.f0(this.c, ",\n", null, null, null, 62), "  ");
    }
}
