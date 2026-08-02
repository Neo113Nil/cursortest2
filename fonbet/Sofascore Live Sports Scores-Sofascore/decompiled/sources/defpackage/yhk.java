package defpackage;

import android.view.View;
import com.bykv.vk.openvk.preload.geckox.b.b;
import com.mbridge.msdk.config.component.common.metrics.a;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class yhk implements jwk, ql6, kt8, f, puk {
    public static /* synthetic */ void d() {
        throw new NoSuchElementException();
    }

    public static void e(int i) {
        throw new vbk(ljg.j(i, "An unknown field for index "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void g(int i, String str) {
        throw new ParserException(str + i);
    }

    public static /* synthetic */ void h(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new ParserException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, long j, Object obj2, Throwable th) {
        throw new b(str + obj + ((Object) ", pkg id:") + j + ((Object) ", caused by:") + obj2, th);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Throwable th) {
        throw new IOException(str + obj + obj2 + obj3, th);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Throwable th) {
        throw new RuntimeException(str + obj + obj2, th);
    }

    public static /* synthetic */ void p(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void q(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void s(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3) {
        throw new IOException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new SSLPeerUnverifiedException(str + obj);
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    @Override // defpackage.jwk
    public gwj a(q80 q80Var) {
        return new gwj(q80Var, mnd.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v1 tbl, still in use, count: 2, list:
          (r5v1 tbl) from 0x006d: MOVE (r28v0 tbl) = (r5v1 tbl) (LINE:110)
          (r5v1 tbl) from 0x0063: MOVE (r28v2 tbl) = (r5v1 tbl) (LINE:100)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.kt8
    public java.lang.Object apply(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhk.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ql6
    public ll6[] createExtractors() {
        return new ll6[]{new yzk()};
    }

    @Override // defpackage.puk
    public void j(View view, float f) {
        int i = syl.C;
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) {
        boolean a;
        a = a.a(eVar);
        return a;
    }
}
