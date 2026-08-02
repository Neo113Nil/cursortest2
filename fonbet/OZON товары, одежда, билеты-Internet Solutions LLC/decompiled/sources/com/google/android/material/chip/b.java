package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class b extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Chip f58148a;

    b(Chip chip) {
        this.f58148a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        Chip chip = this.f58148a;
        if (chip.f58121e != null) {
            chip.f58121e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
