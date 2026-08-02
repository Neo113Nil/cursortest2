package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.SentryReplayModifiers;
import io.sentry.android.replay.util.ComposeTextLayout;
import io.sentry.android.replay.util.NodesKt;
import io.sentry.android.replay.util.TextAttributes;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ComposeViewHierarchyNode.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J$\u0010\u0018\u001a\u00020\u0019*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/ComposeViewHierarchyNode;", "", "()V", "_rootCoordinates", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "fromComposeNode", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "node", "Landroidx/compose/ui/node/LayoutNode;", "parent", "distance", "", "isComposeRoot", "", "options", "Lio/sentry/SentryOptions;", "fromView", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getProxyClassName", "", "isImage", "shouldMask", "traverse", "", "parentNode", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeViewHierarchyNode {
    public static final ComposeViewHierarchyNode INSTANCE = new ComposeViewHierarchyNode();
    private static WeakReference<LayoutCoordinates> _rootCoordinates;

    private ComposeViewHierarchyNode() {
    }

    private final String getProxyClassName(LayoutNode layoutNode, boolean z) {
        if (z) {
            return SentryReplayOptions.IMAGE_VIEW_CLASS_NAME;
        }
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getText())) {
            return "android.widget.TextView";
        }
        SemanticsConfiguration collapsedSemantics$ui_release2 = layoutNode.getCollapsedSemantics$ui_release();
        return (collapsedSemantics$ui_release2 == null || !collapsedSemantics$ui_release2.contains(SemanticsActions.INSTANCE.getSetText())) ? AndroidComposeViewAccessibilityDelegateCompat.ClassName : "android.widget.TextView";
    }

    private final boolean shouldMask(LayoutNode layoutNode, boolean z, SentryOptions sentryOptions) {
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        String str = collapsedSemantics$ui_release != null ? (String) SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SentryReplayModifiers.INSTANCE.getSentryPrivacy()) : null;
        if (Intrinsics.areEqual(str, "unmask")) {
            return false;
        }
        if (Intrinsics.areEqual(str, "mask")) {
            return true;
        }
        String proxyClassName = getProxyClassName(layoutNode, z);
        if (sentryOptions.getSessionReplay().getUnmaskViewClasses().contains(proxyClassName)) {
            return false;
        }
        return sentryOptions.getSessionReplay().getMaskViewClasses().contains(proxyClassName);
    }

    private final ViewHierarchyNode fromComposeNode(LayoutNode node, ViewHierarchyNode parent, int distance, boolean isComposeRoot, SentryOptions options) {
        TextLayoutInput layoutInput;
        TextStyle style;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        if (!node.isPlaced() || !node.isAttached()) {
            return null;
        }
        if (isComposeRoot) {
            _rootCoordinates = new WeakReference<>(LayoutCoordinatesKt.findRootCoordinates(node.getCoordinates()));
        }
        SemanticsConfiguration collapsedSemantics$ui_release = node.getCollapsedSemantics$ui_release();
        LayoutCoordinates coordinates = node.getCoordinates();
        WeakReference<LayoutCoordinates> weakReference = _rootCoordinates;
        Rect boundsInWindow = NodesKt.boundsInWindow(coordinates, weakReference != null ? weakReference.get() : null);
        boolean z = false;
        boolean z2 = !node.getOuterCoordinator$ui_release().isTransparent() && (collapsedSemantics$ui_release == null || !collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && boundsInWindow.height() > 0 && boundsInWindow.width() > 0;
        boolean z3 = collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText());
        if ((collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getText())) || z3) {
            boolean z4 = z2 && shouldMask(node, false, options);
            if (parent != null) {
                parent.setImportantForCaptureToAncestors(true);
            }
            ArrayList arrayList = new ArrayList();
            if (collapsedSemantics$ui_release != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
            }
            TextAttributes findTextAttributes = NodesKt.findTextAttributes(node);
            Color color = findTextAttributes.getColor();
            boolean hasFillModifier = findTextAttributes.getHasFillModifier();
            TextLayoutResult textLayoutResult = (TextLayoutResult) CollectionsKt.firstOrNull((List) arrayList);
            Color m2102boximpl = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : Color.m2102boximpl(style.m3969getColor0d7_KjU());
            if (m2102boximpl == null || m2102boximpl.m2122unboximpl() != Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                color = m2102boximpl;
            }
            ComposeTextLayout composeTextLayout = (arrayList.isEmpty() || z3) ? null : new ComposeTextLayout((TextLayoutResult) CollectionsKt.first((List) arrayList), hasFillModifier);
            Integer valueOf = color != null ? Integer.valueOf(ViewsKt.toOpaque(ColorKt.m2166toArgb8_81llA(color.m2122unboximpl()))) : null;
            float f = boundsInWindow.left;
            float f2 = boundsInWindow.top;
            int width = node.getWidth();
            float f3 = 0.0f;
            int height = node.getHeight();
            if (parent != null) {
                f3 = parent.getElevation();
            }
            return new ViewHierarchyNode.TextViewHierarchyNode(composeTextLayout, valueOf, 0, 0, f, f2, width, height, f3, distance, parent, z4, true, z2, boundsInWindow, 12, null);
        }
        Painter findPainter = NodesKt.findPainter(node);
        if (findPainter != null) {
            boolean z5 = z2 && shouldMask(node, true, options);
            if (parent != null) {
                parent.setImportantForCaptureToAncestors(true);
            }
            float f4 = boundsInWindow.left;
            float f5 = boundsInWindow.top;
            float f6 = 0.0f;
            int width2 = node.getWidth();
            boolean z6 = z5;
            int height2 = node.getHeight();
            if (parent != null) {
                f6 = parent.getElevation();
            }
            if (z6 && NodesKt.isMaskable(findPainter)) {
                z = true;
            }
            return new ViewHierarchyNode.ImageViewHierarchyNode(f4, f5, width2, height2, f6, distance, parent, z, true, z2, boundsInWindow);
        }
        float f7 = 0.0f;
        if (z2 && shouldMask(node, false, options)) {
            z = true;
        }
        float f8 = boundsInWindow.left;
        float f9 = boundsInWindow.top;
        int width3 = node.getWidth();
        int height3 = node.getHeight();
        if (parent != null) {
            f7 = parent.getElevation();
        }
        return new ViewHierarchyNode.GenericViewHierarchyNode(f8, f9, width3, height3, f7, distance, parent, z, false, z2, boundsInWindow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean fromView(View view, ViewHierarchyNode parent, SentryOptions options) {
        LayoutNode root;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "view::class.java.name");
        if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "AndroidComposeView", false, 2, (Object) null) || parent == null) {
            return false;
        }
        try {
            Owner owner = view instanceof Owner ? (Owner) view : null;
            if (owner != null && (root = owner.getRoot()) != null) {
                traverse(root, parent, true, options);
                return true;
            }
            return false;
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
            return false;
        }
    }

    private final void traverse(LayoutNode layoutNode, ViewHierarchyNode viewHierarchyNode, boolean z, SentryOptions sentryOptions) {
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        int i = 0;
        while (i < size) {
            LayoutNode layoutNode2 = children$ui_release.get(i);
            ViewHierarchyNode viewHierarchyNode2 = viewHierarchyNode;
            boolean z2 = z;
            SentryOptions sentryOptions2 = sentryOptions;
            ViewHierarchyNode fromComposeNode = fromComposeNode(layoutNode2, viewHierarchyNode2, i, z2, sentryOptions2);
            if (fromComposeNode != null) {
                arrayList.add(fromComposeNode);
                traverse(layoutNode2, fromComposeNode, false, sentryOptions2);
            }
            i++;
            viewHierarchyNode = viewHierarchyNode2;
            z = z2;
            sentryOptions = sentryOptions2;
        }
        viewHierarchyNode.setChildren(arrayList);
    }
}
