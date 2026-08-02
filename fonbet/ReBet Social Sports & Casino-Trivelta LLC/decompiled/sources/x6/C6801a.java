package x6;

import C6.c;
import android.os.Environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import v6.C6645b;
import v6.InterfaceC6644a;
import w6.InterfaceC6710a;
import x6.f;

/* renamed from: x6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6801a implements x6.f {

    /* renamed from: f, reason: collision with root package name */
    public static final Class f67860f = C6801a.class;

    /* renamed from: g, reason: collision with root package name */
    public static final long f67861g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final File f67862a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67863b;

    /* renamed from: c, reason: collision with root package name */
    public final File f67864c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6710a f67865d;

    /* renamed from: e, reason: collision with root package name */
    public final K6.a f67866e;

    /* renamed from: x6.a$a, reason: collision with other inner class name */
    public class C0966a implements C6.b {

        /* renamed from: a, reason: collision with root package name */
        public final List f67867a;

        @Override // C6.b
        public void b(File file) {
            c u10 = C6801a.this.u(file);
            if (u10 == null || u10.f67873a != ".cnt") {
                return;
            }
            this.f67867a.add(new b(u10.f67874b, file));
        }

        public List d() {
            return Collections.unmodifiableList(this.f67867a);
        }

        public C0966a() {
            this.f67867a = new ArrayList();
        }

        @Override // C6.b
        public void a(File file) {
        }

        @Override // C6.b
        public void c(File file) {
        }
    }

    /* renamed from: x6.a$b */
    public static class b implements f.a {

        /* renamed from: a, reason: collision with root package name */
        public final String f67869a;

        /* renamed from: b, reason: collision with root package name */
        public final C6645b f67870b;

        /* renamed from: c, reason: collision with root package name */
        public long f67871c;

        /* renamed from: d, reason: collision with root package name */
        public long f67872d;

        @Override // x6.f.a
        public long a() {
            if (this.f67872d < 0) {
                this.f67872d = this.f67870b.d().lastModified();
            }
            return this.f67872d;
        }

        public C6645b b() {
            return this.f67870b;
        }

        @Override // x6.f.a
        public String getId() {
            return this.f67869a;
        }

        @Override // x6.f.a
        public long getSize() {
            if (this.f67871c < 0) {
                this.f67871c = this.f67870b.size();
            }
            return this.f67871c;
        }

        public b(String str, File file) {
            D6.k.g(file);
            this.f67869a = (String) D6.k.g(str);
            this.f67870b = C6645b.b(file);
            this.f67871c = -1L;
            this.f67872d = -1L;
        }
    }

    /* renamed from: x6.a$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f67873a;

        /* renamed from: b, reason: collision with root package name */
        public final String f67874b;

        public static c b(File file) {
            String s10;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (s10 = C6801a.s(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (s10.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new c(s10, substring);
        }

        public File a(File file) {
            return File.createTempFile(this.f67874b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f67874b + this.f67873a;
        }

        public String toString() {
            return this.f67873a + "(" + this.f67874b + ")";
        }

        public c(String str, String str2) {
            this.f67873a = str;
            this.f67874b = str2;
        }
    }

    /* renamed from: x6.a$d */
    public static class d extends IOException {
        public d(long j10, long j11) {
            super("File was not written completely. Expected: " + j10 + ", found: " + j11);
        }
    }

    /* renamed from: x6.a$e */
    public class e implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final String f67875a;

        /* renamed from: b, reason: collision with root package name */
        public final File f67876b;

        public e(String str, File file) {
            this.f67875a = str;
            this.f67876b = file;
        }

        @Override // x6.f.b
        public InterfaceC6644a a(Object obj) {
            return c(obj, C6801a.this.f67866e.now());
        }

        @Override // x6.f.b
        public void b(w6.j jVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f67876b);
                try {
                    D6.c cVar = new D6.c(fileOutputStream);
                    jVar.a(cVar);
                    cVar.flush();
                    long d10 = cVar.d();
                    fileOutputStream.close();
                    if (this.f67876b.length() != d10) {
                        throw new d(d10, this.f67876b.length());
                    }
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                C6801a.this.f67865d.a(InterfaceC6710a.EnumC0954a.WRITE_UPDATE_FILE_NOT_FOUND, C6801a.f67860f, "updateResource", e10);
                throw e10;
            }
        }

        public InterfaceC6644a c(Object obj, long j10) {
            File q10 = C6801a.this.q(this.f67875a);
            try {
                C6.c.b(this.f67876b, q10);
                if (q10.exists()) {
                    q10.setLastModified(j10);
                }
                return C6645b.b(q10);
            } catch (c.d e10) {
                Throwable cause = e10.getCause();
                C6801a.this.f67865d.a(cause != null ? !(cause instanceof c.C0032c) ? cause instanceof FileNotFoundException ? InterfaceC6710a.EnumC0954a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : InterfaceC6710a.EnumC0954a.WRITE_RENAME_FILE_OTHER : InterfaceC6710a.EnumC0954a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND : InterfaceC6710a.EnumC0954a.WRITE_RENAME_FILE_OTHER, C6801a.f67860f, "commit", e10);
                throw e10;
            }
        }

        @Override // x6.f.b
        public boolean f() {
            return !this.f67876b.exists() || this.f67876b.delete();
        }
    }

    /* renamed from: x6.a$f */
    public class f implements C6.b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f67878a;

        @Override // C6.b
        public void a(File file) {
            if (!C6801a.this.f67862a.equals(file) && !this.f67878a) {
                file.delete();
            }
            if (this.f67878a && file.equals(C6801a.this.f67864c)) {
                this.f67878a = false;
            }
        }

        @Override // C6.b
        public void b(File file) {
            if (this.f67878a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // C6.b
        public void c(File file) {
            if (this.f67878a || !file.equals(C6801a.this.f67864c)) {
                return;
            }
            this.f67878a = true;
        }

        public final boolean d(File file) {
            c u10 = C6801a.this.u(file);
            if (u10 == null) {
                return false;
            }
            String str = u10.f67873a;
            if (str == ".tmp") {
                return e(file);
            }
            D6.k.i(str == ".cnt");
            return true;
        }

        public final boolean e(File file) {
            return file.lastModified() > C6801a.this.f67866e.now() - C6801a.f67861g;
        }

        public f() {
        }
    }

    public C6801a(File file, int i10, InterfaceC6710a interfaceC6710a) {
        D6.k.g(file);
        this.f67862a = file;
        this.f67863b = y(file, interfaceC6710a);
        this.f67864c = new File(file, x(i10));
        this.f67865d = interfaceC6710a;
        B();
        this.f67866e = K6.d.a();
    }

    public static String s(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    public static String x(int i10) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i10));
    }

    public static boolean y(File file, InterfaceC6710a interfaceC6710a) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
            } catch (IOException e10) {
                e = e10;
                str = null;
            }
            try {
                return str.contains(file2);
            } catch (IOException e11) {
                e = e11;
                interfaceC6710a.a(InterfaceC6710a.EnumC0954a.OTHER, f67860f, "failed to read folder to check if external: " + str, e);
                return false;
            }
        } catch (Exception e12) {
            interfaceC6710a.a(InterfaceC6710a.EnumC0954a.OTHER, f67860f, "failed to get the external storage directory!", e12);
            return false;
        }
    }

    public final boolean A(String str, boolean z10) {
        File q10 = q(str);
        boolean exists = q10.exists();
        if (z10 && exists) {
            q10.setLastModified(this.f67866e.now());
        }
        return exists;
    }

    public final void B() {
        if (this.f67862a.exists()) {
            if (this.f67864c.exists()) {
                return;
            } else {
                C6.a.b(this.f67862a);
            }
        }
        try {
            C6.c.a(this.f67864c);
        } catch (c.a unused) {
            this.f67865d.a(InterfaceC6710a.EnumC0954a.WRITE_CREATE_DIR, f67860f, "version directory could not be created: " + this.f67864c, null);
        }
    }

    @Override // x6.f
    public void a() {
        C6.a.a(this.f67862a);
    }

    @Override // x6.f
    public void b() {
        C6.a.c(this.f67862a, new f());
    }

    @Override // x6.f
    public long c(f.a aVar) {
        return p(((b) aVar).b().d());
    }

    @Override // x6.f
    public boolean d(String str, Object obj) {
        return A(str, true);
    }

    @Override // x6.f
    public f.b e(String str, Object obj) {
        c cVar = new c(".tmp", str);
        File v10 = v(cVar.f67874b);
        if (!v10.exists()) {
            z(v10, "insert");
        }
        try {
            return new e(str, cVar.a(v10));
        } catch (IOException e10) {
            this.f67865d.a(InterfaceC6710a.EnumC0954a.WRITE_CREATE_TEMPFILE, f67860f, "insert", e10);
            throw e10;
        }
    }

    @Override // x6.f
    public boolean f(String str, Object obj) {
        return A(str, false);
    }

    @Override // x6.f
    public InterfaceC6644a g(String str, Object obj) {
        File q10 = q(str);
        if (!q10.exists()) {
            return null;
        }
        q10.setLastModified(this.f67866e.now());
        return C6645b.c(q10);
    }

    @Override // x6.f
    public boolean isExternal() {
        return this.f67863b;
    }

    public final long p(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    public File q(String str) {
        return new File(t(str));
    }

    @Override // x6.f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public List h() {
        C0966a c0966a = new C0966a();
        C6.a.c(this.f67864c, c0966a);
        return c0966a.d();
    }

    @Override // x6.f
    public long remove(String str) {
        return p(q(str));
    }

    public final String t(String str) {
        c cVar = new c(".cnt", str);
        return cVar.c(w(cVar.f67874b));
    }

    public final c u(File file) {
        c b10 = c.b(file);
        if (b10 != null && v(b10.f67874b).equals(file.getParentFile())) {
            return b10;
        }
        return null;
    }

    public final File v(String str) {
        return new File(w(str));
    }

    public final String w(String str) {
        return this.f67864c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    public final void z(File file, String str) {
        try {
            C6.c.a(file);
        } catch (c.a e10) {
            this.f67865d.a(InterfaceC6710a.EnumC0954a.WRITE_CREATE_DIR, f67860f, str, e10);
            throw e10;
        }
    }
}
