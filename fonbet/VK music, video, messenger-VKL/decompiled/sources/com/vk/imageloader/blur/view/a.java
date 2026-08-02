package com.vk.imageloader.blur.view;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.l8g;
import xsna.yzs;

/* compiled from: BlurBubbleView.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements yzs<Integer, Integer, Float, Integer> {
    public static final a b = new a(3, l8g.class, "blendColors", "blendColors(IIF)I", 0);

    @Override // xsna.yzs
    public final Integer invoke(Integer num, Integer num2, Float f) {
        return Integer.valueOf(l8g.a(f.floatValue(), num.intValue(), num2.intValue()));
    }
}
