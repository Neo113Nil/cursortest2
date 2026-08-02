package ru.ozon.android.messenger.blocks.notification;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes10.dex */
public final class g extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f85917a;

    g(h hVar) {
        this.f85917a = hVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i11;
        int i12;
        if (view == null || outline == null) {
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        h hVar = this.f85917a;
        i11 = hVar.f85925b;
        int i13 = i11 + height;
        i12 = hVar.f85925b;
        outline.setRoundRect(0, 0, width, i13, i12);
    }
}
