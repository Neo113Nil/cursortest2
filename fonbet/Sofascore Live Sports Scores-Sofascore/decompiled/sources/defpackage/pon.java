package defpackage;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pon {
    public final TreeSet a;
    public final qrn b;
    public final String c;
    public long d = 0;
    public rqk e = new rqk(0, 0);

    public pon(mqn mqnVar, SortedSet sortedSet, String str) {
        TreeSet treeSet = new TreeSet();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            if (((Float) it.next()) != null) {
                treeSet.add(Long.valueOf((long) Math.floor(r1.floatValue() * 1000.0f)));
            }
        }
        this.a = treeSet;
        this.b = mqnVar;
        this.c = str;
    }
}
