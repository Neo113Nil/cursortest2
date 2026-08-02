package wg;

import java.util.Hashtable;

/* renamed from: wg.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6754i extends AbstractC6749d {

    /* renamed from: k, reason: collision with root package name */
    public String f67737k;

    /* renamed from: l, reason: collision with root package name */
    public String f67738l;

    public C6754i(C6755j c6755j, Hashtable hashtable) {
        super(1, hashtable);
        this.f67738l = c6755j.toString();
        this.f67737k = "teg@RS:" + c6755j;
    }

    @Override // wg.AbstractC6749d
    public String f() {
        return this.f67737k;
    }
}
