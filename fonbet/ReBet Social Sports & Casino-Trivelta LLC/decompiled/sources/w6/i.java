package w6;

import D6.k;
import android.net.Uri;

/* loaded from: classes2.dex */
public class i implements InterfaceC6713d {

    /* renamed from: a, reason: collision with root package name */
    public final String f67483a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67484b;

    public i(String str) {
        this(str, false);
    }

    @Override // w6.InterfaceC6713d
    public String a() {
        return this.f67483a;
    }

    @Override // w6.InterfaceC6713d
    public boolean b(Uri uri) {
        return this.f67483a.contains(uri.toString());
    }

    @Override // w6.InterfaceC6713d
    public boolean c() {
        return this.f67484b;
    }

    @Override // w6.InterfaceC6713d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f67483a.equals(((i) obj).f67483a);
        }
        return false;
    }

    @Override // w6.InterfaceC6713d
    public int hashCode() {
        return this.f67483a.hashCode();
    }

    public String toString() {
        return this.f67483a;
    }

    public i(String str, boolean z10) {
        this.f67483a = (String) k.g(str);
        this.f67484b = z10;
    }
}
