package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f51828b;

    /* renamed from: c, reason: collision with root package name */
    public static a f51829c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f51827a = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final int f51830d = 8;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f51831a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f51832b;

        public a(Method method, Method method2) {
            this.f51831a = method;
            this.f51832b = method2;
        }

        public final Method a() {
            return this.f51831a;
        }

        public final Method b() {
            return this.f51832b;
        }
    }

    public final List a(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Boolean bool = f51828b;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.areEqual(bool, bool2)) {
            return node.getChildren$ui();
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            Method a10 = b().a();
            Intrinsics.checkNotNull(a10);
            Object invoke = a10.invoke(node, null);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.node.LayoutNode>");
            return (List) invoke;
        }
        if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            List children$ui = node.getChildren$ui();
            f51828b = bool2;
            return children$ui;
        } catch (NoSuchMethodError unused) {
            f51828b = Boolean.TRUE;
            Method a11 = b().a();
            Intrinsics.checkNotNull(a11);
            Object invoke2 = a11.invoke(node, null);
            Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.node.LayoutNode>");
            return (List) invoke2;
        }
    }

    public final a b() {
        a aVar = f51829c;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(d(LayoutNode.class, "getChildren$ui_release"), d(LayoutNode.class, "getOuterCoordinator$ui_release"));
        f51829c = aVar2;
        return aVar2;
    }

    public final boolean c(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Boolean bool = f51828b;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.areEqual(bool, bool2)) {
            return node.getOuterCoordinator$ui().I();
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            Method b10 = b().b();
            Intrinsics.checkNotNull(b10);
            Object invoke = b10.invoke(node, null);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return ((NodeCoordinator) invoke).I();
        }
        if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            boolean I10 = node.getOuterCoordinator$ui().I();
            f51828b = bool2;
            return I10;
        } catch (NoSuchMethodError unused) {
            f51828b = Boolean.TRUE;
            Method b11 = b().b();
            Intrinsics.checkNotNull(b11);
            Object invoke2 = b11.invoke(node, null);
            Intrinsics.checkNotNull(invoke2, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return ((NodeCoordinator) invoke2).I();
        }
    }

    public final Method d(Class cls, String str) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
