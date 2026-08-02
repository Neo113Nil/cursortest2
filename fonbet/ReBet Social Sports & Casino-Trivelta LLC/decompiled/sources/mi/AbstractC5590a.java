package mi;

import java.util.Locale;
import ni.AbstractC5738a;
import oi.F;
import oi.InterfaceC5908d;
import oi.u;
import oi.x;
import oi.y;

/* renamed from: mi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5590a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Class f56614a;

    public AbstractC5590a(Class cls) {
        this.f56614a = cls;
    }

    @Override // oi.u
    public F b() {
        return F.f61255a;
    }

    @Override // oi.u
    public x d() {
        return null;
    }

    @Override // oi.u
    public int h() {
        return 100;
    }

    @Override // oi.u
    public String n(y yVar, Locale locale) {
        return AbstractC5738a.a("chinese", yVar, locale);
    }

    @Override // oi.u
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oi.o i(d dVar, InterfaceC5908d interfaceC5908d) {
        return dVar;
    }
}
