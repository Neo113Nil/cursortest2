package ru.ozon.app.android.storefront.stories.story.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"requestApplyInsetsWhenAttached", "", "Landroid/view/View;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewExtKt {
    public static final void requestApplyInsetsWhenAttached(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.storefront.stories.story.presentation.ViewExtKt$requestApplyInsetsWhenAttached$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v11) {
                    Intrinsics.checkNotNullParameter(v11, "v");
                    v11.removeOnAttachStateChangeListener(this);
                    v11.requestApplyInsets();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v11) {
                    Intrinsics.checkNotNullParameter(v11, "v");
                }
            });
        }
    }
}
