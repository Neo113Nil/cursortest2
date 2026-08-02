package q1;

import android.net.Uri;
import android.text.TextUtils;
import b1.AbstractC2356j;
import e1.AbstractC4134a;
import e1.Z;
import h1.C4418n;
import h1.InterfaceC4411g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import q1.InterfaceC6089A;

/* loaded from: classes.dex */
public final class K implements M {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4411g.a f63239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63241c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f63242d;

    public K(String str, InterfaceC4411g.a aVar) {
        this(str, false, aVar);
    }

    @Override // q1.M
    public byte[] a(UUID uuid, InterfaceC6089A.d dVar) {
        return x.a(this.f63239a.a(), dVar.b() + "&signedRequest=" + Z.H(dVar.a()), null, Collections.EMPTY_MAP);
    }

    @Override // q1.M
    public byte[] b(UUID uuid, InterfaceC6089A.a aVar) {
        String b10 = aVar.b();
        if (this.f63241c || TextUtils.isEmpty(b10)) {
            b10 = this.f63240b;
        }
        if (TextUtils.isEmpty(b10)) {
            C4418n.b bVar = new C4418n.b();
            Uri uri = Uri.EMPTY;
            throw new N(bVar.i(uri).a(), uri, com.google.common.collect.B.m(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = AbstractC2356j.f24595e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC2356j.f24593c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f63242d) {
            hashMap.putAll(this.f63242d);
        }
        return x.a(this.f63239a.a(), b10, aVar.a(), hashMap);
    }

    public void c(String str, String str2) {
        AbstractC4134a.e(str);
        AbstractC4134a.e(str2);
        synchronized (this.f63242d) {
            this.f63242d.put(str, str2);
        }
    }

    public K(String str, boolean z10, InterfaceC4411g.a aVar) {
        AbstractC4134a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f63239a = aVar;
        this.f63240b = str;
        this.f63241c = z10;
        this.f63242d = new HashMap();
    }
}
