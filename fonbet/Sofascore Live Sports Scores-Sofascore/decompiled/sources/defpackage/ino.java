package defpackage;

import android.os.ConditionVariable;
import android.os.RemoteException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ino {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile u0p d = null;
    public static volatile Random e = null;
    public final zro a;
    public volatile Boolean b;

    public ino(zro zroVar) {
        this.a = zroVar;
        zroVar.b.execute(new dno(this, 0));
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            lyo s = w3p.s();
            String packageName = this.a.a.getPackageName();
            s.b();
            ((w3p) s.b).t(packageName);
            s.b();
            ((w3p) s.b).u(j);
            if (str != null) {
                s.b();
                ((w3p) s.b).x(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                s.b();
                ((w3p) s.b).v(stringWriter2);
                String name = exc.getClass().getName();
                s.b();
                ((w3p) s.b).w(name);
            }
            u0p u0pVar = d;
            byte[] b = ((w3p) s.c()).b();
            u0pVar.getClass();
            if (i2 == -1) {
                i2 = 0;
            }
            if (u0pVar.b) {
                x0p x0pVar = u0pVar.a;
                x0pVar.y(b);
                x0pVar.g(i2);
                x0pVar.h(i);
                x0pVar.g3();
                x0pVar.v();
            }
        } catch (RemoteException | Exception unused) {
        }
    }
}
