package com.facebook.react.views.scroll;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C2075a;
import com.facebook.react.R;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y0.z;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewAccessibilityDelegate;", "Landroidx/core/view/a;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityEvent;", "event", "", "onInitializeAccessibilityEventInternal", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "Ly0/z;", "info", "onInitializeAccessibilityNodeInfoInternal", "(Landroid/view/View;Ly0/z;)V", "host", "onInitializeAccessibilityEvent", "onInitializeAccessibilityNodeInfo", "", "TAG", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReactScrollViewAccessibilityDelegate extends C2075a {

    @NotNull
    private final String TAG;

    public ReactScrollViewAccessibilityDelegate() {
        String simpleName = ReactScrollViewAccessibilityDelegate.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.TAG = simpleName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onInitializeAccessibilityEventInternal(View view, AccessibilityEvent event) {
        Object tag = view.getTag(R.id.accessibility_collection);
        Integer num = null;
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap == null) {
            return;
        }
        event.setItemCount(readableMap.getInt("itemCount"));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup2 == null) {
            return;
        }
        int childCount = viewGroup2.getChildCount();
        Integer num2 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = viewGroup2.getChildAt(i10);
            if (!(view instanceof ReactAccessibleScrollView)) {
                return;
            }
            Intrinsics.checkNotNull(childAt2);
            boolean isPartiallyScrolledInView = ((ReactAccessibleScrollView) view).isPartiallyScrolledInView(childAt2);
            Object tag2 = childAt2.getTag(R.id.accessibility_collection_item);
            Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
            ReadableMap readableMap2 = (ReadableMap) tag2;
            if (!(childAt2 instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) childAt2).getChildCount();
            if (isPartiallyScrolledInView) {
                if (num == null) {
                    num = Integer.valueOf(readableMap2.getInt("itemIndex"));
                }
                num2 = Integer.valueOf(readableMap2.getInt("itemIndex"));
            }
            if (num != null && num2 != null) {
                event.setFromIndex(num.intValue());
                event.setToIndex(num2.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onInitializeAccessibilityNodeInfoInternal(View view, z info) {
        ReactAccessibilityDelegate.AccessibilityRole fromViewTag = ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.fromViewTag(view);
        if (fromViewTag != null) {
            ReactAccessibilityDelegate.Companion companion = ReactAccessibilityDelegate.INSTANCE;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            companion.setRole(info, fromViewTag, context);
        }
        Object tag = view.getTag(R.id.accessibility_collection);
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap != null) {
            info.y0(z.f.a(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof ReactAccessibleScrollView) {
            info.T0(((ReactAccessibleScrollView) view).getScrollEnabled());
        }
    }

    @Override // androidx.core.view.C2075a
    public void onInitializeAccessibilityEvent(@NotNull View host, @NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        if (host instanceof ReactAccessibleScrollView) {
            onInitializeAccessibilityEventInternal(host, event);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.TAG, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: " + host.getClass().getSimpleName()));
    }

    @Override // androidx.core.view.C2075a
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull z info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        if (host instanceof ReactAccessibleScrollView) {
            onInitializeAccessibilityNodeInfoInternal(host, info);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.TAG, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: " + host.getClass().getSimpleName()));
    }
}
