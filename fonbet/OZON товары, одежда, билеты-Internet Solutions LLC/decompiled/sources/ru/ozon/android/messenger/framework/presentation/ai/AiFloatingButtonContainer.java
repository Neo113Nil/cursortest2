package ru.ozon.android.messenger.framework.presentation.ai;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c3.C5739a;
import c3.C5741c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$dimen;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/ai/AiFloatingButtonContainer;", "Landroid/widget/FrameLayout;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AiFloatingButtonContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ViewPropertyAnimator f89210a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5741c f89211b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5739a f89212c;

    /* renamed from: d, reason: collision with root package name */
    private Q0 f89213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiFloatingButtonContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f89211b = new C5741c();
        this.f89212c = new C5739a();
    }

    public static void b(AiFloatingButtonContainer aiFloatingButtonContainer) {
        Q0 q02 = aiFloatingButtonContainer.f89213d;
        Q0 q03 = Q0.HIDDEN;
        if (q02 == q03) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = aiFloatingButtonContainer.f89210a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            aiFloatingButtonContainer.clearAnimation();
        }
        aiFloatingButtonContainer.f89210a = aiFloatingButtonContainer.animate().translationY(aiFloatingButtonContainer.getResources().getDimensionPixelSize(R$dimen.m_scroll_btn_translation_y)).alpha(0.0f).setInterpolator(aiFloatingButtonContainer.f89212c).setDuration(175L).setListener(new I0(aiFloatingButtonContainer));
        aiFloatingButtonContainer.f89213d = q03;
    }

    public final void c() {
        Q0 q02 = this.f89213d;
        Q0 q03 = Q0.SHOWN;
        if (q02 == q03) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f89210a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            clearAnimation();
        }
        this.f89210a = animate().translationY(0).alpha(1.0f).setInterpolator(this.f89211b).setDuration(225L).setListener(new I0(this));
        this.f89213d = q03;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f89213d = null;
        this.f89210a = null;
        super.onDetachedFromWindow();
    }
}
