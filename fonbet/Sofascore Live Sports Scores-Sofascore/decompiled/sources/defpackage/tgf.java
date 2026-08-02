package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tgf {
    public static final gc2 b;
    public static final List c;
    public static final tgf d;
    public final vng a;

    static {
        gc2 gc2Var = gc2.d;
        b = q1f.r(42);
        c = a.c("*");
        vng vngVar = new vng();
        vngVar.a = new AtomicBoolean(false);
        vngVar.b = new CountDownLatch(1);
        vngVar.f = "PublicSuffixDatabase.list";
        d = new tgf(vngVar);
    }

    public tgf(vng vngVar) {
        this.a = vngVar;
    }

    public static List b(String str) {
        List Y = StringsKt.Y(str, new char[]{'.'});
        return Intrinsics.c(CollectionsKt.h0(Y), "") ? CollectionsKt.T(Y) : Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r1 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r5 = (defpackage.gc2[]) r2.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r10 >= r9) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        r5[r10] = defpackage.tgf.b;
        r11 = (defpackage.gc2) r12.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r11 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        r11 = defpackage.i2a.s(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r11 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        r1 = r1 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r5 >= r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        r6 = (defpackage.gc2) r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r6 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r6 = defpackage.i2a.s(r6, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r6 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        r12 = kotlin.text.StringsKt.Y("!".concat(r6), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (r0.size() != r12.size()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        if (((java.lang.String) r12.get(0)).charAt(0) == '!') goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0135, code lost:
    
        if (((java.lang.String) r12.get(0)).charAt(0) != '!') goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0137, code lost:
    
        r0 = r0.size();
        r12 = r12.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015d, code lost:
    
        return defpackage.i5h.l(defpackage.i5h.f(kotlin.collections.CollectionsKt.N(b(r13)), r0 - r12), ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        r0 = r0.size();
        r12 = r12.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e4, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
    
        if (r11 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:
    
        r12 = defpackage.tgf.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ed, code lost:
    
        r1 = kotlin.text.StringsKt.Y(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f5, code lost:
    
        if (r1 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        if (r11 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fb, code lost:
    
        r12 = kotlin.text.StringsKt.Y(r11, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0103, code lost:
    
        if (r12 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010f, code lost:
    
        if (r1.size() <= r12.size()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0105, code lost:
    
        r12 = defpackage.km5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f7, code lost:
    
        r1 = defpackage.km5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ca, code lost:
    
        kotlin.jvm.internal.Intrinsics.i("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00af, code lost:
    
        kotlin.jvm.internal.Intrinsics.i("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00b3, code lost:
    
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List b2 = b(unicode);
        vng vngVar = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) vngVar.a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) vngVar.b).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        vngVar.c0();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        vngVar.e = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((gc2) vngVar.c) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(vngVar.f);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) vngVar.e);
            throw illegalStateException;
        }
        int size = b2.size();
        gc2[] gc2VarArr = new gc2[size];
        for (int i = 0; i < size; i++) {
            gc2 gc2Var = gc2.d;
            gc2VarArr[i] = q1f.o((String) b2.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str2 = null;
                break;
            }
            gc2 gc2Var2 = (gc2) vngVar.c;
            if (gc2Var2 == null) {
                Intrinsics.i("bytes");
                throw null;
            }
            str2 = i2a.s(gc2Var2, gc2VarArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
    }
}
