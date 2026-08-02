package w6;

import D6.k;
import android.net.Uri;
import java.util.List;

/* renamed from: w6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6715f implements InterfaceC6713d {

    /* renamed from: a, reason: collision with root package name */
    public final List f67480a;

    public C6715f(List list) {
        this.f67480a = (List) k.g(list);
    }

    @Override // w6.InterfaceC6713d
    public String a() {
        return ((InterfaceC6713d) this.f67480a.get(0)).a();
    }

    @Override // w6.InterfaceC6713d
    public boolean b(Uri uri) {
        for (int i10 = 0; i10 < this.f67480a.size(); i10++) {
            if (((InterfaceC6713d) this.f67480a.get(i10)).b(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // w6.InterfaceC6713d
    public boolean c() {
        return false;
    }

    public List d() {
        return this.f67480a;
    }

    @Override // w6.InterfaceC6713d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6715f) {
            return this.f67480a.equals(((C6715f) obj).f67480a);
        }
        return false;
    }

    @Override // w6.InterfaceC6713d
    public int hashCode() {
        return this.f67480a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f67480a.toString();
    }
}
