package com.vk.music.view.vkmix.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.vk.music.view.vkmix.models.MusicMixMood;
import xsna.utk0;
import xsna.vtk0;
import xsna.yn40;

/* compiled from: MusicMixAnimationView.kt */
/* loaded from: classes3.dex */
public final class MusicMixAnimationView extends ViewGroup {
    public yn40 b;
    public final utk0 c;

    public MusicMixAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = vtk0.a(MusicMixMood.Idle);
        setFitsSystemWindows(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        yn40 yn40Var = this.b;
        if (yn40Var != null) {
            yn40Var.layout(i, i2, i3, i4);
        }
    }

    public final void setMood(MusicMixMood musicMixMood) {
        this.c.setValue(musicMixMood);
    }
}
