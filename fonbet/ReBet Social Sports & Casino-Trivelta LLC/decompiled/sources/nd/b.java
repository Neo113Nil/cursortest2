package nd;

import java.util.Hashtable;
import pg.C6069a;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f57268a = new Hashtable();

    /* renamed from: b, reason: collision with root package name */
    public C6069a.b f57269b = null;

    public String a(int i10) {
        return (String) this.f57268a.get(Integer.valueOf(i10));
    }

    public void b(C6069a.b bVar) {
        this.f57269b = bVar;
    }

    public void c(int i10, String str) {
        this.f57268a.put(Integer.valueOf(i10), str);
    }
}
