package ru.ozon.app.android.travel.molecules.utils;

import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ShapeDrawableWithBorder$setBorderColor$1 extends C7735q implements Function1<ShapeDrawable.ShaderFactory, Unit> {
    ShapeDrawableWithBorder$setBorderColor$1(Object obj) {
        super(1, obj, ShapeDrawableWithBorder.class, "setShaderFactory", "setShaderFactory(Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ShapeDrawable.ShaderFactory shaderFactory) {
        invoke2(shaderFactory);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ShapeDrawable.ShaderFactory shaderFactory) {
        ((ShapeDrawableWithBorder) this.receiver).setShaderFactory(shaderFactory);
    }
}
