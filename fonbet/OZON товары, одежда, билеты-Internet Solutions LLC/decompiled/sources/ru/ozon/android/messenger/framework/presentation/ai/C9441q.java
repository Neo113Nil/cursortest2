package ru.ozon.android.messenger.framework.presentation.ai;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9441q implements S0.M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9413c f89666a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC9439p f89667b;

    public C9441q(C9413c c9413c, ViewTreeObserverOnGlobalLayoutListenerC9439p viewTreeObserverOnGlobalLayoutListenerC9439p) {
        this.f89666a = c9413c;
        this.f89667b = viewTreeObserverOnGlobalLayoutListenerC9439p;
    }

    @Override // S0.M
    public final void dispose() {
        C9413c.y(this.f89666a).getConstraintLayout().getViewTreeObserver().removeOnGlobalLayoutListener(this.f89667b);
    }
}
