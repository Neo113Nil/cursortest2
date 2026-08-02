package ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c;
import ru.ozon.android.messenger.utils.view.s;

/* loaded from: classes10.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.screenshot.a f90953a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LinearLayout f90954b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c.b f90955c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.screenshot.a f90956d;

    public f(ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar, LinearLayout linearLayout, c.b bVar, ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar2) {
        this.f90953a = aVar;
        this.f90954b = linearLayout;
        this.f90955c = bVar;
        this.f90956d = aVar2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z11;
        ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar = this.f90953a;
        if (aVar.getMeasuredWidth() <= 0 || aVar.getMeasuredHeight() <= 0) {
            return;
        }
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        LinearLayout linearLayout = this.f90954b;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        c.b bVar = this.f90955c;
        z11 = bVar.f90942a;
        layoutParams2.gravity = z11 ? 8388613 : 8388611;
        linearLayout.setLayoutParams(layoutParams2);
        s.f(linearLayout, new g(this.f90956d, bVar));
    }
}
