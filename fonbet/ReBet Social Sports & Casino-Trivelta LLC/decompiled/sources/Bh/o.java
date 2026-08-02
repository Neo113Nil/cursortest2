package Bh;

import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import ph.AbstractC6073d;
import rh.EnumC6295m;
import rh.InterfaceC6290h;
import rh.InterfaceC6291i;
import rh.InterfaceC6292j;
import rh.InterfaceC6297o;
import uh.InterfaceC6579c;
import yh.AbstractC6897f;
import zh.C6995c;

/* loaded from: classes3.dex */
public class o implements InterfaceC6291i {

    /* renamed from: a, reason: collision with root package name */
    public final String f970a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC6897f f971b;

    /* renamed from: c, reason: collision with root package name */
    public final z f972c;

    /* renamed from: d, reason: collision with root package name */
    public final v f973d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC6579c f974e;

    /* renamed from: g, reason: collision with root package name */
    public C6995c f976g;

    /* renamed from: h, reason: collision with root package name */
    public List f977h;

    /* renamed from: f, reason: collision with root package name */
    public EnumC6295m f975f = EnumC6295m.INTERNAL;

    /* renamed from: i, reason: collision with root package name */
    public int f978i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f979j = 0;

    public o(String str, AbstractC6897f abstractC6897f, z zVar, v vVar) {
        this.f970a = str;
        this.f971b = abstractC6897f;
        this.f972c = zVar;
        this.f973d = vVar;
    }

    public static boolean d(Fh.h hVar) {
        return Fh.h.RECORD_ONLY.equals(hVar) || Fh.h.RECORD_AND_SAMPLE.equals(hVar);
    }

    public static boolean e(Fh.h hVar) {
        return Fh.h.RECORD_AND_SAMPLE.equals(hVar);
    }

    @Override // rh.InterfaceC6291i
    public InterfaceC6290h a() {
        InterfaceC6579c interfaceC6579c = this.f974e;
        if (interfaceC6579c == null) {
            interfaceC6579c = InterfaceC6579c.current();
        }
        InterfaceC6579c interfaceC6579c2 = interfaceC6579c;
        InterfaceC6290h f10 = InterfaceC6290h.f(interfaceC6579c2);
        InterfaceC6292j a10 = f10.a();
        f c10 = this.f972c.c();
        String b10 = c10.b();
        String c11 = !a10.isValid() ? c10.c() : a10.d();
        List list = this.f977h;
        List unmodifiableList = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.f977h = null;
        oh.g gVar = this.f976g;
        if (gVar == null) {
            gVar = oh.g.empty();
        }
        Fh.i b11 = this.f972c.e().b(interfaceC6579c2, c11, this.f970a, this.f975f, gVar, unmodifiableList);
        Fh.h b12 = b11.b();
        InterfaceC6292j h10 = AbstractC6073d.h(c11, b10, e(b12) ? InterfaceC6297o.c() : InterfaceC6297o.getDefault(), b11.a(a10.f()), false, this.f972c.h());
        if (!d(b12)) {
            return InterfaceC6290h.i(h10);
        }
        oh.g attributes = b11.getAttributes();
        if (!attributes.isEmpty()) {
            attributes.forEach(new BiConsumer() { // from class: Bh.n
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    o.this.c().g((oh.e) obj, obj2);
                }
            });
        }
        C6995c c6995c = this.f976g;
        this.f976g = null;
        return m.v(h10, this.f970a, this.f971b, this.f975f, f10, interfaceC6579c2, this.f973d, this.f972c.a(), this.f972c.b(), this.f972c.d(), c6995c, list, this.f978i, this.f979j);
    }

    public final C6995c c() {
        C6995c c6995c = this.f976g;
        if (c6995c != null) {
            return c6995c;
        }
        C6995c d10 = C6995c.d(this.f973d.d(), this.f973d.c());
        this.f976g = d10;
        return d10;
    }
}
