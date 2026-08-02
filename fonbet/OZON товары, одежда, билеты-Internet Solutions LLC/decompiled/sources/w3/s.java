package w3;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.AbstractC5881z;
import j3.C7266h;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import m3.N;
import p3.i;
import p3.k;
import w3.o;

/* loaded from: classes8.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    private final k.a f103497a;

    /* renamed from: b, reason: collision with root package name */
    private final String f103498b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f103499c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f103500d;

    public s(String str, boolean z11, k.a aVar) {
        G10.a.c((z11 && TextUtils.isEmpty(str)) ? false : true);
        this.f103497a = aVar;
        this.f103498b = str;
        this.f103499c = z11;
        this.f103500d = new HashMap();
    }

    public final byte[] a(UUID uuid, o.a aVar) throws v {
        String b11 = aVar.b();
        if (this.f103499c || TextUtils.isEmpty(b11)) {
            b11 = this.f103498b;
        }
        if (TextUtils.isEmpty(b11)) {
            i.a aVar2 = new i.a();
            Uri uri = Uri.EMPTY;
            aVar2.i(uri);
            throw new v(aVar2.a(), uri, AbstractC5881z.p(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = C7266h.f69065e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C7266h.f69063c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f103500d) {
            hashMap.putAll(this.f103500d);
        }
        return l.a(this.f103497a.createDataSource(), b11, aVar.a(), hashMap);
    }

    public final byte[] b(o.c cVar) throws v {
        return l.a(this.f103497a.createDataSource(), cVar.b() + "&signedRequest=" + N.r(cVar.a()), null, Collections.EMPTY_MAP);
    }

    public final void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f103500d) {
            this.f103500d.put(str, str2);
        }
    }
}
