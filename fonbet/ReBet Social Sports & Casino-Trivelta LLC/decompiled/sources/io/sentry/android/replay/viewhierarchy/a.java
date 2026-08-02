package io.sentry.android.replay.viewhierarchy;

import M.f;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.d;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import e0.l;
import io.sentry.AbstractC4842u3;
import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.android.replay.t;
import io.sentry.android.replay.util.j;
import io.sentry.android.replay.util.o;
import io.sentry.android.replay.viewhierarchy.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f51823c;

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f51824d;

    /* renamed from: a, reason: collision with root package name */
    public static final a f51821a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f51822b = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C0761a.f51826d);

    /* renamed from: e, reason: collision with root package name */
    public static final int f51825e = 8;

    /* renamed from: io.sentry.android.replay.viewhierarchy.a$a, reason: collision with other inner class name */
    public static final class C0761a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0761a f51826d = new C0761a();

        public C0761a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Method invoke() {
            try {
                Method declaredMethod = LayoutNode.class.getDeclaredMethod("getCollapsedSemantics$ui_release", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static final SemanticsConfiguration e(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        try {
            return node.getSemanticsConfiguration();
        } catch (Throwable th2) {
            if (f51821a.c() == null) {
                throw th2;
            }
            Method c10 = f51821a.c();
            Intrinsics.checkNotNull(c10);
            return (SemanticsConfiguration) c10.invoke(node, null);
        }
    }

    public final c a(LayoutNode layoutNode, c cVar, int i10, boolean z10, AbstractC4842u3 abstractC4842u3, ILogger iLogger) {
        f fVar;
        float f10;
        Z.a aVar;
        Function1 function1;
        if (!layoutNode.B() || !layoutNode.A()) {
            return null;
        }
        if (z10) {
            f51824d = new WeakReference(V.b.a(layoutNode.d()));
        }
        V.a d10 = layoutNode.d();
        WeakReference weakReference = f51824d;
        f a10 = j.a(d10, weakReference != null ? (V.a) weakReference.get() : null);
        boolean z11 = false;
        try {
            SemanticsConfiguration e10 = e(layoutNode);
            boolean z12 = !b.f51827a.c(layoutNode) && (e10 == null || !e10.a(Z.f.f14384a.b())) && a10.b() - a10.e() > 0.0f && a10.d() - a10.c() > 0.0f;
            boolean z13 = (e10 != null && e10.a(Z.b.f14355a.b())) || (e10 != null && e10.a(Z.f.f14384a.a()));
            if ((e10 != null && e10.a(Z.f.f14384a.c())) || z13) {
                boolean z14 = z12 && f(e10, false, abstractC4842u3);
                if (cVar != null) {
                    cVar.h(true);
                }
                ArrayList arrayList = new ArrayList();
                if (e10 != null && (aVar = (Z.a) Z.c.a(e10, Z.b.f14355a.a())) != null && (function1 = (Function1) aVar.a()) != null) {
                }
                android.support.v4.media.session.b.a(CollectionsKt.firstOrNull((List) arrayList));
                l.f45458a.a();
                return new c.e(null, null, 0, 0, a10.c(), a10.e(), layoutNode.v(), layoutNode.g(), cVar != null ? cVar.a() : 0.0f, i10, cVar, z14, true, z12, j.c(a10), 12, null);
            }
            j.b(layoutNode);
            if (z12 && f(e10, false, abstractC4842u3)) {
                z11 = true;
            }
            float c10 = a10.c();
            float e11 = a10.e();
            boolean z15 = z11;
            int v10 = layoutNode.v();
            int g10 = layoutNode.g();
            if (cVar != null) {
                fVar = a10;
                f10 = cVar.a();
            } else {
                fVar = a10;
                f10 = 0.0f;
            }
            return new c.b(c10, e11, v10, g10, f10, i10, cVar, z15, false, z12, j.c(fVar));
        } catch (Throwable th2) {
            if (!f51823c) {
                f51823c = true;
                iLogger.a(EnumC4788n3.ERROR, th2, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            if (o.f51788a.a()) {
                throw th2;
            }
            return new c.b(a10.c(), a10.e(), layoutNode.v(), layoutNode.g(), cVar != null ? cVar.a() : 0.0f, i10, cVar, true, false, !b.f51827a.c(layoutNode) && a10.b() - a10.e() > 0.0f && a10.d() - a10.c() > 0.0f, j.c(a10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(View view, c cVar, AbstractC4842u3 options, ILogger logger) {
        ILogger iLogger;
        Throwable th2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(logger, "logger");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        d dVar = null;
        if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "AndroidComposeView", false, 2, (Object) null) || cVar == null) {
            return false;
        }
        try {
            if (view instanceof d) {
                try {
                    dVar = (d) view;
                } catch (Throwable th3) {
                    th2 = th3;
                    iLogger = logger;
                    iLogger.a(EnumC4788n3.ERROR, th2, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                    if (o.f51788a.a()) {
                        return false;
                    }
                    throw th2;
                }
            }
            if (dVar != null) {
                LayoutNode root = dVar.getRoot();
                if (root != null) {
                    iLogger = logger;
                    try {
                        g(root, cVar, true, options, iLogger);
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        iLogger.a(EnumC4788n3.ERROR, th2, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                        if (o.f51788a.a()) {
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th5) {
            th = th5;
            iLogger = logger;
        }
    }

    public final Method c() {
        return (Method) f51822b.getValue();
    }

    public final String d(boolean z10, SemanticsConfiguration semanticsConfiguration) {
        if (z10) {
            return "android.widget.ImageView";
        }
        if (semanticsConfiguration == null) {
            return "android.view.View";
        }
        Z.f fVar = Z.f.f14384a;
        return (semanticsConfiguration.a(fVar.c()) || semanticsConfiguration.a(Z.b.f14355a.b()) || semanticsConfiguration.a(fVar.a())) ? "android.widget.TextView" : "android.view.View";
    }

    public final boolean f(SemanticsConfiguration semanticsConfiguration, boolean z10, AbstractC4842u3 abstractC4842u3) {
        String str = semanticsConfiguration != null ? (String) Z.c.a(semanticsConfiguration, t.f51751a.a()) : null;
        if (Intrinsics.areEqual(str, "unmask")) {
            abstractC4842u3.k();
            return false;
        }
        if (Intrinsics.areEqual(str, "mask")) {
            abstractC4842u3.k();
            return true;
        }
        String d10 = d(z10, semanticsConfiguration);
        if (abstractC4842u3.e().contains(d10)) {
            return false;
        }
        return abstractC4842u3.c().contains(d10);
    }

    public final void g(LayoutNode layoutNode, c cVar, boolean z10, AbstractC4842u3 abstractC4842u3, ILogger iLogger) {
        List a10 = b.f51827a.a(layoutNode);
        if (a10.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(a10.size());
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = (LayoutNode) a10.get(i10);
            c a11 = a(layoutNode2, cVar, i10, z10, abstractC4842u3, iLogger);
            if (a11 != null) {
                arrayList.add(a11);
                g(layoutNode2, a11, false, abstractC4842u3, iLogger);
            }
        }
        cVar.g(arrayList);
    }
}
