package i1;

import java.io.File;
import java.io.IOException;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4517a {

    /* renamed from: i1.a$a, reason: collision with other inner class name */
    public static class C0721a extends IOException {
        public C0721a(String str) {
            super(str);
        }

        public C0721a(Throwable th2) {
            super(th2);
        }

        public C0721a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: i1.a$b */
    public interface b {
        void a(InterfaceC4517a interfaceC4517a, i iVar);

        void b(InterfaceC4517a interfaceC4517a, i iVar);

        void e(InterfaceC4517a interfaceC4517a, i iVar, i iVar2);
    }

    File a(String str, long j10, long j11);

    l b(String str);

    void c(i iVar);

    i d(String str, long j10, long j11);

    void e(String str, m mVar);

    i f(String str, long j10, long j11);

    void g(i iVar);

    void h(File file, long j10);
}
