package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class lj9 {
    public static final Set a = ph0.a0(new Character[]{'/', '?', '#', '@'});
    public static final int b;

    static {
        List list = m7b.b;
        b = 6;
        List j = b.j("HTTP/1.0", "HTTP/1.1");
        j.getClass();
        ww9.t(j, new dt(20), new hd3((byte) 0, 3));
    }

    public static final void a(CharSequence charSequence, char c) {
        throw new kx2("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) charSequence), 4);
    }

    public static final int b(oo2 oo2Var, uif uifVar) {
        int i = uifVar.c;
        for (int i2 = uifVar.b; i2 < i; i2++) {
            char charAt = oo2Var.charAt(i2);
            if (charAt == ':' && i2 != uifVar.b) {
                uifVar.b = i2 + 1;
                return i2;
            }
            if (Intrinsics.d(charAt, 32) <= 0 || StringsKt.K("\"(),/:;<=>?@[\\]{}", charAt)) {
                int i3 = uifVar.b;
                if (charAt == ':') {
                    throw new kx2("Empty header names are not allowed as per RFC7230.", 4);
                }
                if (i2 == i3) {
                    throw new kx2("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", 4);
                }
                a(oo2Var, charAt);
                throw null;
            }
        }
        throw new kx2("No colon in HTTP header in " + oo2Var.subSequence(uifVar.b, uifVar.c).toString() + " in builder: \n" + ((Object) oo2Var), 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        a(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        throw r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x006f, B:16:0x0077, B:19:0x007f, B:22:0x008a, B:25:0x0096, B:58:0x00a2, B:30:0x00a7, B:31:0x00da, B:32:0x0057, B:38:0x00b1, B:51:0x00c7, B:52:0x00ca, B:48:0x00cb, B:56:0x00d2, B:61:0x00e8, B:62:0x00ef, B:63:0x00f0, B:65:0x00fa), top: B:13:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x006f, B:16:0x0077, B:19:0x007f, B:22:0x008a, B:25:0x0096, B:58:0x00a2, B:30:0x00a7, B:31:0x00da, B:32:0x0057, B:38:0x00b1, B:51:0x00c7, B:52:0x00ca, B:48:0x00cb, B:56:0x00d2, B:61:0x00e8, B:62:0x00ef, B:63:0x00f0, B:65:0x00fa), top: B:13:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x006a -> B:13:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(db2 db2Var, oo2 oo2Var, uif uifVar, sq3 sq3Var) {
        kj9 kj9Var;
        int i;
        oo2 oo2Var2;
        aj9 aj9Var;
        kj9 kj9Var2;
        db2 db2Var2;
        uif uifVar2;
        Throwable th;
        Object R;
        Throwable th2;
        if (sq3Var instanceof kj9) {
            kj9Var = (kj9) sq3Var;
            int i2 = kj9Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kj9Var.w = i2 - Integer.MIN_VALUE;
                Object obj = kj9Var.v;
                lu3 lu3Var = lu3.a;
                i = kj9Var.w;
                Throwable th3 = null;
                int i3 = 8192;
                if (i != 0) {
                    y6a.M(obj);
                    oo2Var2 = oo2Var;
                    aj9Var = new aj9(oo2Var2);
                    kj9Var2 = kj9Var;
                    db2Var2 = db2Var;
                    uifVar2 = uifVar;
                    int i4 = b;
                    kj9Var2.r = db2Var2;
                    kj9Var2.s = oo2Var2;
                    kj9Var2.t = uifVar2;
                    kj9Var2.u = aj9Var;
                    kj9Var2.w = 1;
                    R = l6g.R(db2Var2, oo2Var2, i3, i4, kj9Var2);
                    if (R != lu3Var) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aj9 aj9Var2 = kj9Var.u;
                    uif uifVar3 = kj9Var.t;
                    oo2 oo2Var3 = kj9Var.s;
                    db2 db2Var3 = kj9Var.r;
                    try {
                        y6a.M(obj);
                        kj9Var2 = kj9Var;
                        uifVar2 = uifVar3;
                        aj9Var = aj9Var2;
                        oo2Var2 = oo2Var3;
                        try {
                            if (((Boolean) obj).booleanValue()) {
                                aj9Var.d();
                                return th3;
                            }
                            int i5 = oo2Var2.g;
                            uifVar2.c = i5;
                            int i6 = uifVar2.b;
                            int i7 = i5 - i6;
                            if (i7 == 0) {
                                List list = zi9.a;
                                mo2 a2 = aj9Var.a("Host");
                                if (a2 != null) {
                                    d(a2);
                                }
                                return aj9Var;
                            }
                            if (i7 >= i3) {
                                throw new IllegalStateException("Header line length limit exceeded");
                            }
                            int b2 = b(oo2Var2, uifVar2);
                            int i8 = uifVar2.c;
                            int i9 = uifVar2.b;
                            while (i9 < i8) {
                                char charAt = oo2Var2.charAt(i9);
                                if (!CharsKt.b(charAt) && charAt != '\t') {
                                    break;
                                }
                                i9++;
                            }
                            if (i9 >= i8) {
                                uifVar2.b = i8;
                                th2 = th3;
                                i9 = i8;
                            } else {
                                int i10 = i9;
                                int i11 = i10;
                                while (i10 < i8) {
                                    Throwable th4 = th3;
                                    char charAt2 = oo2Var2.charAt(i10);
                                    if (charAt2 != '\t') {
                                        if (charAt2 == '\n' || charAt2 == '\r') {
                                            break;
                                        }
                                        if (charAt2 != ' ') {
                                            i11 = i10;
                                        }
                                    }
                                    i10++;
                                    th3 = th4;
                                }
                                th2 = th3;
                                uifVar2.b = i9;
                                uifVar2.c = i11 + 1;
                            }
                            int i12 = uifVar2.c;
                            uifVar2.b = i8;
                            aj9Var.c(i6, b2, i9, i12);
                            th3 = th2;
                            db2Var2 = db2Var3;
                            i3 = 8192;
                            int i42 = b;
                            kj9Var2.r = db2Var2;
                            kj9Var2.s = oo2Var2;
                            kj9Var2.t = uifVar2;
                            kj9Var2.u = aj9Var;
                            kj9Var2.w = 1;
                            R = l6g.R(db2Var2, oo2Var2, i3, i42, kj9Var2);
                            if (R != lu3Var) {
                                return lu3Var;
                            }
                            db2Var3 = db2Var2;
                            obj = R;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            aj9Var2 = aj9Var;
                            aj9Var2.d();
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        aj9Var2.d();
                        throw th;
                    }
                }
            }
        }
        kj9Var = new kj9(sq3Var);
        Object obj2 = kj9Var.v;
        lu3 lu3Var2 = lu3.a;
        i = kj9Var.w;
        Throwable th32 = null;
        int i32 = 8192;
        if (i != 0) {
        }
    }

    public static final void d(mo2 mo2Var) {
        if (StringsKt.M(mo2Var, ":")) {
            throw new kx2("Host header with ':' should contains port: " + ((Object) mo2Var), 4);
        }
        for (int i = 0; i < mo2Var.length(); i++) {
            Character valueOf = Character.valueOf(mo2Var.charAt(i));
            Set set = a;
            if (set.contains(valueOf)) {
                throw new kx2("Host cannot contain any of the following symbols: " + set, 4);
            }
        }
    }
}
