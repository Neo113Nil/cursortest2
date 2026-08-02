package ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import ru.ozon.android.messenger.framework.presentation.common.popupmenu.layout.c;
import ru.ozon.android.messenger.utils.view.s;

/* loaded from: classes10.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.screenshot.a f90946a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LinearLayout f90947b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c.a f90948c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.screenshot.a f90949d;

    public d(ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar, LinearLayout linearLayout, c.a aVar2, ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar3) {
        this.f90946a = aVar;
        this.f90947b = linearLayout;
        this.f90948c = aVar2;
        this.f90949d = aVar3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar = this.f90946a;
        if (aVar.getMeasuredWidth() <= 0 || aVar.getMeasuredHeight() <= 0) {
            return;
        }
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        c.a aVar2 = this.f90948c;
        ru.ozon.android.messenger.framework.presentation.common.screenshot.a aVar3 = this.f90949d;
        LinearLayout linearLayout = this.f90947b;
        s.f(linearLayout, new e(aVar2, aVar3, linearLayout));
    }
}
