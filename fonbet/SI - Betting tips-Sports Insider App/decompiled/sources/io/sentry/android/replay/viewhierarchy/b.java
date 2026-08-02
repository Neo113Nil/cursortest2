package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import gf.k;
import gf.t;
import io.sentry.android.replay.x;
import io.sentry.b5;
import io.sentry.b6;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final t f16156a = k.b(a.f16155e);

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16157b;

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f16158c;

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        if (kotlin.text.StringsKt.A(r0, "Brush", false) == false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(LayoutNode layoutNode, f fVar, boolean z5, b6 b6Var) {
        TextLayoutInput layoutInput;
        TextStyle style;
        TextLayoutInput layoutInput2;
        TextStyle style2;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z5) {
            f16158c = new WeakReference(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference weakReference = f16158c;
        Rect a7 = io.sentry.android.replay.util.e.a(coordinates, weakReference != null ? (LayoutCoordinates) weakReference.get() : null);
        try {
            SemanticsConfiguration d10 = d(layoutNode);
            boolean z7 = !layoutNode.getOuterCoordinator$ui_release().isTransparent() && (d10 == null || !d10.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && a7.height() > 0 && a7.width() > 0;
            boolean z10 = (d10 != null && d10.contains(SemanticsActions.INSTANCE.getSetText())) || (d10 != null && d10.contains(SemanticsProperties.INSTANCE.getEditableText()));
            if ((d10 == null || !d10.contains(SemanticsProperties.INSTANCE.getText())) && !z10) {
                Painter b10 = io.sentry.android.replay.util.e.b(layoutNode);
                if (b10 == null) {
                    return new c(layoutNode.getWidth(), layoutNode.getHeight(), fVar.f16164c, fVar, z7 && e(d10, false, b6Var), a7);
                }
                boolean z11 = z7 && e(d10, true, b6Var);
                int width = layoutNode.getWidth();
                int height = layoutNode.getHeight();
                float f6 = fVar.f16164c;
                if (z11) {
                    Intrinsics.checkNotNullParameter(b10, "<this>");
                    String name = b10.getClass().getName();
                    Intrinsics.checkNotNull(name);
                    if (!StringsKt.A(name, "Vector", false)) {
                        if (!StringsKt.A(name, "Color", false)) {
                        }
                    }
                }
                r5 = false;
                return new d(width, height, f6, fVar, r5, a7);
            }
            boolean z12 = z7 && e(d10, false, b6Var);
            ArrayList arrayList = new ArrayList();
            if (d10 != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(d10, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
            }
            io.sentry.android.replay.util.k c2 = io.sentry.android.replay.util.e.c(layoutNode);
            Color color = c2.f16135a;
            boolean z13 = c2.f16136b;
            TextLayoutResult textLayoutResult = (TextLayoutResult) CollectionsKt.firstOrNull(arrayList);
            Color color2 = (textLayoutResult == null || (layoutInput2 = textLayoutResult.getLayoutInput()) == null || (style2 = layoutInput2.getStyle()) == null) ? null : Color.box-impl(style2.getColor-0d7_KjU());
            if (color2 == null || color2.unbox-impl() != Color.Companion.getUnspecified-0d7_KjU()) {
                color = color2;
            }
            TextUnit textUnit = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : TextUnit.box-impl(style.getFontSize-XSAIIZE());
            return new e((textLayoutResult == null || z10 || (textUnit != null ? TextUnit.equals-impl0(textUnit.unbox-impl(), TextUnit.Companion.getUnspecified-XSAIIZE()) : false)) ? null : new io.sentry.android.replay.util.a(textLayoutResult, z13), color != null ? Integer.valueOf(ColorKt.toArgb-8_81llA(color.unbox-impl()) | (-16777216)) : null, 0, 0, layoutNode.getWidth(), layoutNode.getHeight(), fVar.f16164c, fVar, z12, a7);
        } catch (Throwable th2) {
            if (!f16157b) {
                f16157b = true;
                b6Var.getLogger().b(b5.ERROR, th2, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[0]);
            }
            int width2 = layoutNode.getWidth();
            int height2 = layoutNode.getHeight();
            float f10 = fVar.f16164c;
            if (!layoutNode.getOuterCoordinator$ui_release().isTransparent() && a7.height() > 0) {
                a7.width();
            }
            return new c(width2, height2, f10, fVar, true, a7);
        }
    }

    public static boolean b(View view, f fVar, b6 options) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        StringsKt.A(name, "AndroidComposeView", false);
        return false;
    }

    public static String c(boolean z5, SemanticsConfiguration semanticsConfiguration) {
        return z5 ? "android.widget.ImageView" : semanticsConfiguration != null ? (semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getText()) || semanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText()) || semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText())) ? "android.widget.TextView" : "android.view.View" : "android.view.View";
    }

    public static final SemanticsConfiguration d(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Method method = (Method) f16156a.getValue();
        return method != null ? (SemanticsConfiguration) method.invoke(node, null) : node.getCollapsedSemantics$ui_release();
    }

    public static boolean e(SemanticsConfiguration semanticsConfiguration, boolean z5, b6 b6Var) {
        String str = semanticsConfiguration != null ? (String) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, x.f16169a) : null;
        if (Intrinsics.areEqual(str, "unmask")) {
            return false;
        }
        if (Intrinsics.areEqual(str, "mask")) {
            return true;
        }
        String c2 = c(z5, semanticsConfiguration);
        if (b6Var.getSessionReplay().f16403d.contains(c2)) {
            return false;
        }
        return b6Var.getSessionReplay().f16402c.contains(c2);
    }

    public static void f(LayoutNode layoutNode, f fVar, boolean z5, b6 b6Var) {
        List children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i5);
            f a7 = a(layoutNode2, fVar, z5, b6Var);
            if (a7 != null) {
                arrayList.add(a7);
                f(layoutNode2, a7, false, b6Var);
            }
        }
        fVar.f16167f = arrayList;
    }
}
