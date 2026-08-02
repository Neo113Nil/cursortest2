package f5;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9464a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.a f9465b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.a f9466c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9467d;

    public b(Context context, n5.a aVar, n5.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f9464a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f9465b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f9466c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f9467d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f9464a.equals(bVar.f9464a) && this.f9465b.equals(bVar.f9465b) && this.f9466c.equals(bVar.f9466c) && this.f9467d.equals(bVar.f9467d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f9464a.hashCode() ^ 1000003) * 1000003) ^ this.f9465b.hashCode()) * 1000003) ^ this.f9466c.hashCode()) * 1000003) ^ this.f9467d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f9464a);
        sb2.append(", wallClock=");
        sb2.append(this.f9465b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f9466c);
        sb2.append(", backendName=");
        return d9.e.l(sb2, this.f9467d, "}");
    }
}
