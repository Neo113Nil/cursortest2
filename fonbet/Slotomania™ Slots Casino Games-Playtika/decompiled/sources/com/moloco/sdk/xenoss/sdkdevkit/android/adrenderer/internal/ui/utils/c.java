package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import android.content.res.Resources;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSize;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c {
    public static final c a = new c();
    public static final int b = 0;

    public final float a(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public final a.AbstractC0383a.g b(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new a.AbstractC0383a.g(a(IntSize.m4610getWidthimpl(layoutCoordinates.mo3390getSizeYbymL2g())), a(IntSize.m4609getHeightimpl(layoutCoordinates.mo3390getSizeYbymL2g())));
    }

    public final a.AbstractC0383a.f a(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new a.AbstractC0383a.f(a((int) Offset.m1871getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))), a((int) Offset.m1872getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))));
    }

    public final a.AbstractC0383a.f a(long j) {
        return new a.AbstractC0383a.f(a((int) Offset.m1871getXimpl(j)), a((int) Offset.m1872getYimpl(j)));
    }

    public final a.AbstractC0383a.c a(LayoutCoordinates layoutCoordinates, a.AbstractC0383a.c.EnumC0385a buttonType) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        return new a.AbstractC0383a.c(buttonType, a(layoutCoordinates), b(layoutCoordinates));
    }

    public final boolean a(a.AbstractC0383a.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.f().c() > 0.0f && cVar.f().d() > 0.0f;
    }
}
