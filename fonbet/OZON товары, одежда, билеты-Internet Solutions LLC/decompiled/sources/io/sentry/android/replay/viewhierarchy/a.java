package io.sentry.android.replay.viewhierarchy;

import B1.B;
import B1.C;
import B1.b0;
import D1.H;
import D1.x0;
import I1.C3222a;
import I1.l;
import I1.m;
import K1.J;
import K1.K;
import K1.T;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.e;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.P2;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import io.sentry.android.replay.u;
import io.sentry.android.replay.viewhierarchy.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import k1.C7460f;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l1.C7807Z;
import l1.C7811b0;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@SuppressLint({"UseRequiresApi"})
@TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f67710a = k.b(C1109a.f67713b);

    /* renamed from: b, reason: collision with root package name */
    private static boolean f67711b;

    /* renamed from: c, reason: collision with root package name */
    private static WeakReference<B> f67712c;

    /* renamed from: io.sentry.android.replay.viewhierarchy.a$a, reason: collision with other inner class name */
    static final class C1109a extends AbstractC7737t implements Function0<Method> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1109a f67713b = new C1109a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Method invoke() {
            try {
                Method declaredMethod = H.class.getDeclaredMethod("getSemanticsConfiguration", new Class[0]);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(@NotNull View view, b bVar, @NotNull P2 options, @NotNull ILogger logger) {
        H f40548l;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(logger, "logger");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (h.t(name, "AndroidComposeView", false)) {
            try {
                x0 x0Var = view instanceof x0 ? (x0) view : null;
                if (x0Var != null && (f40548l = x0Var.getF40548l()) != null) {
                    c(f40548l, bVar, true, options, logger);
                    return true;
                }
            } catch (Throwable th2) {
                logger.b(I2.ERROR, th2, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                return false;
            }
        }
        return false;
    }

    private static boolean b(l lVar, boolean z11, P2 p22) {
        String str;
        String str2 = lVar != null ? (String) m.a(lVar, u.a()) : null;
        if (Intrinsics.d(str2, "unmask")) {
            p22.f();
            return false;
        }
        if (Intrinsics.d(str2, FormPageDTO.Field.FIELD_TYPE_MASK)) {
            p22.f();
            return true;
        }
        if (z11) {
            str = "android.widget.ImageView";
        } else {
            if (lVar != null) {
                int i11 = I1.u.f11751H;
                if (lVar.e(I1.u.B()) || lVar.e(I1.k.y()) || lVar.e(I1.u.e())) {
                    str = "android.widget.TextView";
                }
            }
            str = "android.view.View";
        }
        if (p22.c().contains(str)) {
            return false;
        }
        return p22.b().contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0298, code lost:
    
        if (r10 == r12) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01b9, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018b, code lost:
    
        if (r0.e(I1.u.l()) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a7, code lost:
    
        if (r0.e(I1.k.y()) == true) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b7, code lost:
    
        if (r0.e(I1.u.e()) == r7) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c8, code lost:
    
        if (r0.e(I1.u.B()) == r7) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(H h11, b bVar, boolean z11, P2 p22, ILogger iLogger) {
        List<H> list;
        int i11;
        b bVar2;
        Rect rect;
        b c1110b;
        l B11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        AbstractC8972b abstractC8972b;
        boolean z16;
        Object obj;
        ArrayList arrayList;
        int size;
        int i12;
        C7807Z m11;
        long j11;
        J k11;
        T i13;
        long j12;
        J k12;
        T i14;
        C3222a c3222a;
        Function1 function1;
        boolean z17 = true;
        List<H> A11 = h11.A();
        if (A11.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(A11.size());
        int size2 = A11.size();
        int i15 = 0;
        while (i15 < size2) {
            H node = A11.get(i15);
            if (node.B0() && node.z0()) {
                if (z11) {
                    f67712c = new WeakReference<>(C.c(node.D()));
                }
                B D11 = node.D();
                WeakReference<B> weakReference = f67712c;
                B b11 = weakReference != null ? weakReference.get() : null;
                Intrinsics.checkNotNullParameter(D11, "<this>");
                if (b11 == null) {
                    b11 = C.c(D11);
                }
                float a11 = (int) (b11.a() >> 32);
                float a12 = (int) (b11.a() & 4294967295L);
                C7460f K11 = b11.K(D11, z17);
                float n11 = K11.n();
                if (n11 < 0.0f) {
                    n11 = 0.0f;
                }
                if (n11 > a11) {
                    n11 = a11;
                }
                float q11 = K11.q();
                if (q11 < 0.0f) {
                    q11 = 0.0f;
                }
                float f7 = q11 > a12 ? a12 : q11;
                float o11 = K11.o();
                if (o11 < 0.0f) {
                    o11 = 0.0f;
                }
                if (o11 <= a11) {
                    a11 = o11;
                }
                float h12 = K11.h();
                float f11 = h12 >= 0.0f ? h12 : 0.0f;
                if (f11 <= a12) {
                    a12 = f11;
                }
                if (n11 == a11 || f7 == a12) {
                    rect = new Rect();
                    list = A11;
                    i11 = i15;
                } else {
                    list = A11;
                    long u11 = b11.u(P9.a.a(n11, f7));
                    i11 = i15;
                    long u12 = b11.u(P9.a.a(a11, f7));
                    long u13 = b11.u(P9.a.a(a11, a12));
                    long u14 = b11.u(P9.a.a(n11, a12));
                    float g10 = C7459e.g(u11);
                    float g11 = C7459e.g(u12);
                    float g12 = C7459e.g(u14);
                    float g13 = C7459e.g(u13);
                    float min = Math.min(g10, Math.min(g11, Math.min(g12, g13)));
                    float max = Math.max(g10, Math.max(g11, Math.max(g12, g13)));
                    float h13 = C7459e.h(u11);
                    float h14 = C7459e.h(u12);
                    float h15 = C7459e.h(u14);
                    float h16 = C7459e.h(u13);
                    rect = new Rect((int) min, (int) Math.min(h13, Math.min(h14, Math.min(h15, h16))), (int) max, (int) Math.max(h13, Math.max(h14, Math.max(h15, h16))));
                }
                try {
                    Intrinsics.checkNotNullParameter(node, "node");
                    Method method = (Method) f67710a.getValue();
                    B11 = method != null ? (l) method.invoke(node, new Object[0]) : node.B();
                } catch (Throwable th2) {
                    if (!f67711b) {
                        f67711b = true;
                        iLogger.b(I2.ERROR, th2, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
                    }
                    int l02 = node.l0();
                    int I11 = node.I();
                    float a13 = bVar.a();
                    if (!node.e0().n2() && rect.height() > 0) {
                        rect.width();
                    }
                    c1110b = new b.C1110b(l02, I11, a13, bVar, true, rect);
                }
                if (!node.e0().n2()) {
                    if (B11 != null) {
                        int i16 = I1.u.f11751H;
                    }
                    if (rect.height() > 0 && rect.width() > 0) {
                        z12 = true;
                        if (B11 == null) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (B11 != null) {
                            int i17 = I1.u.f11751H;
                        }
                        z14 = false;
                        if (B11 != null) {
                            int i18 = I1.u.f11751H;
                        }
                        if (!z14) {
                            Intrinsics.checkNotNullParameter(node, "<this>");
                            List<b0> a02 = node.a0();
                            int size3 = a02.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size3) {
                                    z15 = true;
                                    abstractC8972b = null;
                                    break;
                                }
                                e a14 = a02.get(i19).a();
                                String name = a14.getClass().getName();
                                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                if (h.t(name, "Painter", false)) {
                                    try {
                                        Field declaredField = a14.getClass().getDeclaredField("painter");
                                        declaredField.setAccessible(true);
                                        obj = declaredField.get(a14);
                                    } catch (Throwable unused) {
                                    }
                                    if (obj instanceof AbstractC8972b) {
                                        abstractC8972b = (AbstractC8972b) obj;
                                        z15 = true;
                                    }
                                    abstractC8972b = null;
                                    z15 = true;
                                } else {
                                    i19++;
                                }
                            }
                            if (abstractC8972b != null) {
                                boolean z18 = z12 && b(B11, z15, p22);
                                int l03 = node.l0();
                                int I12 = node.I();
                                float a15 = bVar.a();
                                if (z18) {
                                    Intrinsics.checkNotNullParameter(abstractC8972b, "<this>");
                                    String name2 = abstractC8972b.getClass().getName();
                                    if (!h.t(name2, "Vector", false) && !h.t(name2, "Color", false) && !h.t(name2, "Brush", false)) {
                                        z16 = true;
                                        c1110b = new b.c(l03, I12, a15, bVar, z16, rect);
                                    }
                                }
                                z16 = false;
                                c1110b = new b.c(l03, I12, a15, bVar, z16, rect);
                            } else {
                                c1110b = new b.C1110b(node.l0(), node.I(), bVar.a(), bVar, z12 && b(B11, false, p22), rect);
                            }
                            bVar2 = c1110b;
                        }
                        boolean z19 = !z12 && b(B11, false, p22);
                        arrayList = new ArrayList();
                        if (B11 != null && (c3222a = (C3222a) m.a(B11, I1.k.i())) != null && (function1 = (Function1) c3222a.a()) != null) {
                        }
                        Intrinsics.checkNotNullParameter(node, "<this>");
                        List<b0> a03 = node.a0();
                        size = a03.size();
                        boolean z21 = false;
                        C7807Z c7807z = null;
                        for (i12 = 0; i12 < size; i12++) {
                            e a16 = a03.get(i12).a();
                            String name3 = a16.getClass().getName();
                            if (h.t(name3, "Text", false)) {
                                try {
                                    Field declaredField2 = a16.getClass().getDeclaredField("color");
                                    declaredField2.setAccessible(true);
                                    Object obj2 = declaredField2.get(a16);
                                    InterfaceC7813c0 interfaceC7813c0 = obj2 instanceof InterfaceC7813c0 ? (InterfaceC7813c0) obj2 : null;
                                    if (interfaceC7813c0 != null) {
                                        c7807z = C7807Z.m(interfaceC7813c0.mo7invoke0d7_KjU());
                                    }
                                } catch (Throwable unused2) {
                                }
                                c7807z = null;
                            } else if (h.t(name3, "Fill", false)) {
                                z21 = true;
                            }
                        }
                        io.sentry.android.replay.util.l lVar = new io.sentry.android.replay.util.l(c7807z, z21);
                        C7807Z a17 = lVar.a();
                        boolean b12 = lVar.b();
                        K k13 = (K) C7714v.M(arrayList);
                        m11 = (k13 != null || (k12 = k13.k()) == null || (i14 = k12.i()) == null) ? null : C7807Z.m(i14.f());
                        if (m11 != null) {
                            long w11 = m11.w();
                            j12 = C7807Z.f72259m;
                        }
                        a17 = m11;
                        Z1.u b13 = (k13 != null || (k11 = k13.k()) == null || (i13 = k11.i()) == null) ? null : Z1.u.b(i13.i());
                        j11 = Z1.u.f35334c;
                        c1110b = new b.d((k13 != null || z14 || (b13 != null ? false : Z1.u.c(b13.g(), j11))) ? null : new io.sentry.android.replay.util.b(k13, b12), a17 == null ? Integer.valueOf(C7811b0.i(a17.w()) | (-16777216)) : null, 0, 0, node.l0(), node.I(), bVar.a(), bVar, z19, rect);
                        bVar2 = c1110b;
                    }
                }
                z12 = false;
                if (B11 == null) {
                }
                if (B11 != null) {
                }
                z14 = false;
                if (B11 != null) {
                }
                if (!z14) {
                }
                if (z12) {
                }
                arrayList = new ArrayList();
                if (B11 != null) {
                }
                Intrinsics.checkNotNullParameter(node, "<this>");
                List<b0> a032 = node.a0();
                size = a032.size();
                boolean z212 = false;
                C7807Z c7807z2 = null;
                while (i12 < size) {
                }
                io.sentry.android.replay.util.l lVar2 = new io.sentry.android.replay.util.l(c7807z2, z212);
                C7807Z a172 = lVar2.a();
                boolean b122 = lVar2.b();
                K k132 = (K) C7714v.M(arrayList);
                if (k132 != null) {
                }
                if (m11 != null) {
                }
                a172 = m11;
                if (k132 != null) {
                }
                j11 = Z1.u.f35334c;
                c1110b = new b.d((k132 != null || z14 || (b13 != null ? false : Z1.u.c(b13.g(), j11))) ? null : new io.sentry.android.replay.util.b(k132, b122), a172 == null ? Integer.valueOf(C7811b0.i(a172.w()) | (-16777216)) : null, 0, 0, node.l0(), node.I(), bVar.a(), bVar, z19, rect);
                bVar2 = c1110b;
            } else {
                list = A11;
                i11 = i15;
                bVar2 = null;
            }
            if (bVar2 != null) {
                arrayList2.add(bVar2);
                c(node, bVar2, false, p22, iLogger);
            }
            i15 = i11 + 1;
            z17 = true;
            A11 = list;
        }
        bVar.f(arrayList2);
    }
}
