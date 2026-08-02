package ef;

import Ij.C3261b;
import We.A;
import We.C4868j;
import We.C4873o;
import We.InterfaceC4875q;
import We.L;
import We.z;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;

/* renamed from: ef.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6355e {

    /* renamed from: a, reason: collision with root package name */
    private static final C9684j f62221a;

    /* renamed from: b, reason: collision with root package name */
    private static final C9684j f62222b;

    static {
        C9684j c9684j = C9684j.f98719d;
        f62221a = C9684j.a.c("\"\\");
        f62222b = C9684j.a.c("\t ,=");
    }

    @NotNull
    public static final ArrayList a(@NotNull z parseChallenges, @NotNull String headerName) {
        p002if.j jVar;
        Intrinsics.checkNotNullParameter(parseChallenges, "$this$parseChallenges");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (headerName.equalsIgnoreCase(parseChallenges.e(i11))) {
                C9681g c9681g = new C9681g();
                c9681g.H0(parseChallenges.k(i11));
                try {
                    c(c9681g, arrayList);
                } catch (EOFException e11) {
                    p002if.j.f66400c.getClass();
                    jVar = p002if.j.f66398a;
                    jVar.getClass();
                    p002if.j.j(5, "Unable to parse challenge", e11);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(@NotNull L promisesBody) {
        Intrinsics.checkNotNullParameter(promisesBody, "$this$promisesBody");
        if (Intrinsics.d(promisesBody.L().h(), "HEAD")) {
            return false;
        }
        int m11 = promisesBody.m();
        return (((m11 >= 100 && m11 < 200) || m11 == 204 || m11 == 304) && Ye.b.m(promisesBody) == -1 && !"chunked".equalsIgnoreCase(L.q(promisesBody, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0088, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void c(C9681g c9681g, ArrayList arrayList) throws EOFException {
        String d11;
        int w11;
        String d12;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    f(c9681g);
                    str = d(c9681g);
                    if (str == null) {
                        return;
                    }
                }
                boolean f7 = f(c9681g);
                d11 = d(c9681g);
                if (d11 == null) {
                    if (c9681g.m()) {
                        arrayList.add(new C4868j(str, U.c()));
                        return;
                    }
                    return;
                }
                byte b11 = (byte) 61;
                w11 = Ye.b.w(c9681g, b11);
                boolean f11 = f(c9681g);
                if (f7 || (!f11 && !c9681g.m())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int w12 = Ye.b.w(c9681g, b11) + w11;
                    while (true) {
                        if (d11 == null) {
                            d11 = d(c9681g);
                            if (f(c9681g)) {
                                break;
                            } else {
                                w12 = Ye.b.w(c9681g, b11);
                            }
                        }
                        if (w12 == 0) {
                            break;
                        }
                        if (w12 > 1 || f(c9681g)) {
                            return;
                        }
                        byte b12 = (byte) 34;
                        if (c9681g.m() || c9681g.o(0L) != b12) {
                            d12 = d(c9681g);
                        } else {
                            if (c9681g.readByte() != b12) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            C9681g c9681g2 = new C9681g();
                            while (true) {
                                long F02 = c9681g.F0(f62221a);
                                if (F02 == -1) {
                                    break;
                                }
                                if (c9681g.o(F02) == b12) {
                                    c9681g2.z0(c9681g, F02);
                                    c9681g.readByte();
                                    d12 = c9681g2.G0();
                                    break;
                                } else {
                                    if (c9681g.size() == F02 + 1) {
                                        break;
                                    }
                                    c9681g2.z0(c9681g, F02);
                                    c9681g.readByte();
                                    c9681g2.z0(c9681g, 1L);
                                }
                            }
                        }
                        if (d12 == null || ((String) linkedHashMap.put(d11, d12)) != null) {
                            return;
                        }
                        if (!f(c9681g) && !c9681g.m()) {
                            return;
                        } else {
                            d11 = null;
                        }
                    }
                    arrayList.add(new C4868j(str, linkedHashMap));
                    str = d11;
                }
            }
            StringBuilder e11 = C3261b.e(d11);
            e11.append(kotlin.text.h.W(w11, "="));
            Map singletonMap = Collections.singletonMap(null, e11.toString());
            Intrinsics.checkNotNullExpressionValue(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            arrayList.add(new C4868j(str, singletonMap));
        }
    }

    private static final String d(C9681g c9681g) {
        long F02 = c9681g.F0(f62222b);
        if (F02 == -1) {
            F02 = c9681g.size();
        }
        if (F02 != 0) {
            return c9681g.I(F02, Charsets.UTF_8);
        }
        return null;
    }

    public static final void e(@NotNull InterfaceC4875q receiveHeaders, @NotNull A url, @NotNull z headers) {
        Intrinsics.checkNotNullParameter(receiveHeaders, "$this$receiveHeaders");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (receiveHeaders == InterfaceC4875q.f33801a) {
            return;
        }
        C4873o.f33786n.getClass();
        List<C4873o> b11 = C4873o.b.b(url, headers);
        if (b11.isEmpty()) {
            return;
        }
        receiveHeaders.saveFromResponse(url, b11);
    }

    private static final boolean f(C9681g c9681g) {
        boolean z11 = false;
        while (!c9681g.m()) {
            byte o11 = c9681g.o(0L);
            if (o11 == 9 || o11 == 32) {
                c9681g.readByte();
            } else {
                if (o11 != 44) {
                    break;
                }
                c9681g.readByte();
                z11 = true;
            }
        }
        return z11;
    }
}
