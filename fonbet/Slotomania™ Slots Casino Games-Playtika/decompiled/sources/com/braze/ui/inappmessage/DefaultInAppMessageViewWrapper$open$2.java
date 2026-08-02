package com.braze.ui.inappmessage;

import android.view.View;
import android.view.ViewGroup;
import com.braze.support.BrazeLogger;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultInAppMessageViewWrapper.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$2", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "left", "", "top", TtmlNode.RIGHT, "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultInAppMessageViewWrapper$open$2 implements View.OnLayoutChangeListener {
    final /* synthetic */ ViewGroup $parentViewGroup;
    final /* synthetic */ DefaultInAppMessageViewWrapper this$0;

    DefaultInAppMessageViewWrapper$open$2(ViewGroup viewGroup, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
        this.$parentViewGroup = viewGroup;
        this.this$0 = defaultInAppMessageViewWrapper;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, final int top, int right, final int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$parentViewGroup.removeOnLayoutChangeListener(this);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2$onLayoutChange$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Detected (bottom - top) of " + (bottom - top) + " in OnLayoutChangeListener";
            }
        }, 3, (Object) null);
        this.$parentViewGroup.removeView(this.this$0.getInAppMessageView());
        final ViewGroup viewGroup = this.$parentViewGroup;
        final DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = this.this$0;
        viewGroup.post(new Runnable() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DefaultInAppMessageViewWrapper$open$2.m5222onLayoutChange$lambda0(DefaultInAppMessageViewWrapper.this, viewGroup);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLayoutChange$lambda-0, reason: not valid java name */
    public static final void m5222onLayoutChange$lambda0(DefaultInAppMessageViewWrapper this$0, ViewGroup parentViewGroup) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentViewGroup, "$parentViewGroup");
        this$0.addInAppMessageViewToViewGroup(parentViewGroup, this$0.getInAppMessage(), this$0.getInAppMessageView(), this$0.getInAppMessageViewLifecycleListener());
    }
}
