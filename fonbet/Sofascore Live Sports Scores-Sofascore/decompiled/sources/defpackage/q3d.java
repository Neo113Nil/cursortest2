package defpackage;

import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class q3d implements oz7 {
    public final wck a;
    public final List b;
    public final String c;

    public q3d(wck wckVar, List list, String str) {
        wckVar.getClass();
        list.getClass();
        this.a = wckVar;
        this.b = list;
        this.c = str;
        int size = list.size();
        int i = wckVar.c;
        int i2 = wckVar.b;
        if (size == (i - i2) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + list.size() + ") in " + list + " does not match the range of the field (" + ((i - i2) + 1) + ')').toString());
    }

    @Override // defpackage.oz7
    public final wm8 a() {
        return new ph3();
    }

    @Override // defpackage.oz7
    public final v9e b() {
        e3c e3cVar = new e3c(this, 3);
        StringBuilder sb = new StringBuilder("one of ");
        List list = this.b;
        sb.append(list);
        sb.append(" for ");
        sb.append(this.c);
        return new v9e(a.c(new whi(list, e3cVar, sb.toString())), km5.a);
    }

    @Override // defpackage.oz7
    public final /* bridge */ /* synthetic */ l3 c() {
        return this.a;
    }
}
