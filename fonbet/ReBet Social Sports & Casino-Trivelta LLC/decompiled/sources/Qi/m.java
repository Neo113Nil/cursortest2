package Qi;

import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes5.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f9829a = new Hashtable();

    /* renamed from: b, reason: collision with root package name */
    public Vector f9830b = new Vector();

    public l a() {
        k[] kVarArr = new k[this.f9830b.size()];
        for (int i10 = 0; i10 != this.f9830b.size(); i10++) {
            kVarArr[i10] = (k) this.f9829a.get(this.f9830b.elementAt(i10));
        }
        return new l(kVarArr);
    }
}
