package x1;

import D1.o;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6778b implements o.a {

    /* renamed from: a, reason: collision with root package name */
    public final o.a f67820a;

    /* renamed from: b, reason: collision with root package name */
    public final List f67821b;

    public C6778b(o.a aVar, List list) {
        this.f67820a = aVar;
        this.f67821b = list;
    }

    @Override // D1.o.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC6777a a(Uri uri, InputStream inputStream) {
        InterfaceC6777a interfaceC6777a = (InterfaceC6777a) this.f67820a.a(uri, inputStream);
        List list = this.f67821b;
        return (list == null || list.isEmpty()) ? interfaceC6777a : (InterfaceC6777a) interfaceC6777a.a(this.f67821b);
    }
}
