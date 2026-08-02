package com.vk.imageloader.blur.view;

import com.vk.imageloader.blur.view.BlurBubbleView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.yzs;

/* compiled from: BlurBubbleView.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements yzs<Float, Float, Float, Float> {
    @Override // xsna.yzs
    public final Float invoke(Float f, Float f2, Float f3) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        float floatValue3 = f3.floatValue();
        ((BlurBubbleView.b) this.receiver).getClass();
        return Float.valueOf((floatValue2 * floatValue3) + ((1.0f - floatValue3) * floatValue));
    }
}
