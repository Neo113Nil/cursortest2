package com.vk.stickers.bonus.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.v;
import com.vk.stickers.bonus.utils.BonusCatalogScrollHelper;
import xsna.lhg;

/* compiled from: BonusCatalogScrollHelper.kt */
/* loaded from: classes5.dex */
public final class a extends v {
    public final /* synthetic */ BonusCatalogScrollHelper.Speed a;
    public final /* synthetic */ BonusCatalogScrollHelper.Snap b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, BonusCatalogScrollHelper.Speed speed, BonusCatalogScrollHelper.Snap snap, int i) {
        super(context);
        this.a = speed;
        this.b = snap;
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.v
    public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        int i6 = this.c;
        if (i5 == -1) {
            return (i3 - i) + i6;
        }
        if (i5 == 1) {
            return (i4 - i2) - i6;
        }
        throw new UnsupportedOperationException(lhg.a(i5, "Unsupported snapPreference: "));
    }

    @Override // androidx.recyclerview.widget.v
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return this.a.h() / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.v
    public final int getHorizontalSnapPreference() {
        return this.b == BonusCatalogScrollHelper.Snap.START ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.v
    public final int getVerticalSnapPreference() {
        return this.b == BonusCatalogScrollHelper.Snap.START ? -1 : 1;
    }
}
