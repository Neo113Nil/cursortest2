package com.moloco.sdk.publisher.bidrequest;

import com.moloco.sdk.c2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/moloco/sdk/c2;", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "toGeo", "(Lcom/moloco/sdk/c2;)Lcom/moloco/sdk/publisher/bidrequest/Geo;", "moloco-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeoKt {
    @NotNull
    public static final Geo toGeo(@NotNull c2 c2Var) {
        c2Var.getClass();
        return new Geo(c2Var.h(), c2Var.j(), c2Var.i(), c2Var.m(), Float.valueOf(c2Var.k()), Float.valueOf(c2Var.l()));
    }
}
