package com.braze.support;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f779a = new g();

    public static String a() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return "Unsupported type for map deserialization: " + Reflection.getOrCreateKotlinClass(Object.class).getSimpleName();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
