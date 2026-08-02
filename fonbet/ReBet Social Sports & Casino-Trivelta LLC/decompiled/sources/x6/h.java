package x6;

import C6.c;
import D6.n;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import v6.InterfaceC6644a;
import w6.InterfaceC6710a;
import x6.f;

/* loaded from: classes2.dex */
public class h implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final Class f67933f = h.class;

    /* renamed from: a, reason: collision with root package name */
    public final int f67934a;

    /* renamed from: b, reason: collision with root package name */
    public final n f67935b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67936c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6710a f67937d;

    /* renamed from: e, reason: collision with root package name */
    public volatile a f67938e = new a(null, null);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final f f67939a;

        /* renamed from: b, reason: collision with root package name */
        public final File f67940b;

        public a(File file, f fVar) {
            this.f67939a = fVar;
            this.f67940b = file;
        }
    }

    public h(int i10, n nVar, String str, InterfaceC6710a interfaceC6710a) {
        this.f67934a = i10;
        this.f67937d = interfaceC6710a;
        this.f67935b = nVar;
        this.f67936c = str;
    }

    @Override // x6.f
    public void a() {
        l().a();
    }

    @Override // x6.f
    public void b() {
        try {
            l().b();
        } catch (IOException e10) {
            E6.a.j(f67933f, "purgeUnexpectedResources", e10);
        }
    }

    @Override // x6.f
    public long c(f.a aVar) {
        return l().c(aVar);
    }

    @Override // x6.f
    public boolean d(String str, Object obj) {
        return l().d(str, obj);
    }

    @Override // x6.f
    public f.b e(String str, Object obj) {
        return l().e(str, obj);
    }

    @Override // x6.f
    public boolean f(String str, Object obj) {
        return l().f(str, obj);
    }

    @Override // x6.f
    public InterfaceC6644a g(String str, Object obj) {
        return l().g(str, obj);
    }

    @Override // x6.f
    public Collection h() {
        return l().h();
    }

    public void i(File file) {
        try {
            C6.c.a(file);
            E6.a.a(f67933f, "Created cache directory %s", file.getAbsolutePath());
        } catch (c.a e10) {
            this.f67937d.a(InterfaceC6710a.EnumC0954a.WRITE_CREATE_DIR, f67933f, "createRootDirectoryIfNecessary", e10);
            throw e10;
        }
    }

    @Override // x6.f
    public boolean isExternal() {
        try {
            return l().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    public final void j() {
        File file = new File((File) this.f67935b.get(), this.f67936c);
        i(file);
        this.f67938e = new a(file, new C6801a(file, this.f67934a, this.f67937d));
    }

    public void k() {
        if (this.f67938e.f67939a == null || this.f67938e.f67940b == null) {
            return;
        }
        C6.a.b(this.f67938e.f67940b);
    }

    public synchronized f l() {
        try {
            if (m()) {
                k();
                j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (f) D6.k.g(this.f67938e.f67939a);
    }

    public final boolean m() {
        File file;
        a aVar = this.f67938e;
        return aVar.f67939a == null || (file = aVar.f67940b) == null || !file.exists();
    }

    @Override // x6.f
    public long remove(String str) {
        return l().remove(str);
    }
}
