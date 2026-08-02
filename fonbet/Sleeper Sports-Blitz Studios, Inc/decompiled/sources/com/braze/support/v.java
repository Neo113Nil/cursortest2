package com.braze.support;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class v implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f794a;

    public v(JSONObject jSONObject) {
        this.f794a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object opt = this.f794a.opt((String) obj);
        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
        return Boolean.valueOf(opt instanceof Object);
    }
}
