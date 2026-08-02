package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ii6 extends yy9 {
    public LinkedHashMap p;

    public ii6(Context context, Gender gender) {
        super(context, gender);
        this.p = new LinkedHashMap();
    }

    public static xbb K(LinkedHashMap linkedHashMap) {
        xbb b = a.b();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            b.add(entry.getKey());
            if (((fz9) entry.getKey()).j) {
                b.addAll(((hi6) entry.getValue()).a);
            }
        }
        xbb a = a.a(b);
        ListIterator listIterator = a.listIterator(0);
        while (true) {
            hc9 hc9Var = (hc9) listIterator;
            if (!hc9Var.hasNext()) {
                break;
            }
            iz9 iz9Var = (iz9) hc9Var.next();
            iz9Var.a = false;
            iz9Var.b = false;
        }
        iz9 iz9Var2 = (iz9) CollectionsKt.firstOrNull(a);
        if (iz9Var2 != null) {
            iz9Var2.a = true;
        }
        iz9 iz9Var3 = (iz9) CollectionsKt.j0(a);
        if (iz9Var3 != null) {
            iz9Var3.b = true;
        }
        return a;
    }

    @Override // defpackage.yy9, defpackage.ysk
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final boolean j(int i, iz9 iz9Var) {
        return (iz9Var instanceof fz9) || super.j(i, iz9Var);
    }

    public abstract LinkedHashMap L(ArrayList arrayList, Event event);
}
