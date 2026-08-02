package ru.ozon.uni.android.notificationbar;

import B90.W;
import android.os.Handler;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.notificationbar.NotificationBar;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"ru/ozon/uni/android/notificationbar/NotificationBar$onAttachStateChangeListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "view", "Landroid/view/View;", "onViewDetachedFromWindow", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBar$onAttachStateChangeListener$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ NotificationBar this$0;

    NotificationBar$onAttachStateChangeListener$1(NotificationBar notificationBar) {
        this.this$0 = notificationBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewDetachedFromWindow$lambda$0(NotificationBar notificationBar) {
        notificationBar.onViewHidden(NotificationBar.DismissReason.MANUAL);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.this$0.containerView.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler;
        Intrinsics.checkNotNullParameter(view, "view");
        if (NotificationBarManager.INSTANCE.isCurrentOrNext$uni_release(this.this$0)) {
            handler = NotificationBar.handler;
            handler.post(new W(this.this$0, 1));
        }
    }
}
