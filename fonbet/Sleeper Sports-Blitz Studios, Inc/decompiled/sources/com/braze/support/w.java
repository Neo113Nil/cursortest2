package com.braze.support;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class w implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f795a;

    public w(JSONObject jSONObject) {
        this.f795a = jSONObject;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f795a.get((String) obj);
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return obj2;
    }
}
