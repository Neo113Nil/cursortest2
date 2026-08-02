package wg;

import X9.m;
import java.util.Hashtable;

/* renamed from: wg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6748c {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f67709a;

    /* renamed from: b, reason: collision with root package name */
    public int f67710b;

    /* renamed from: c, reason: collision with root package name */
    public String f67711c;

    public C6748c(Hashtable hashtable) {
        this.f67709a = new Hashtable();
        this.f67710b = Integer.parseInt("" + hashtable.get("c"));
        this.f67711c = (String) hashtable.get(m.f13664a);
        hashtable.remove("c");
        hashtable.remove(m.f13664a);
        this.f67709a = hashtable;
    }
}
