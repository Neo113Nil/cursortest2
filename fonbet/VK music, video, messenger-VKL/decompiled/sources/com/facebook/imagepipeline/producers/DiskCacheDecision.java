package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import xsna.ym8;

/* compiled from: DiskCacheDecision.kt */
/* loaded from: classes12.dex */
public final class DiskCacheDecision {

    /* compiled from: DiskCacheDecision.kt */
    public static final class DiskCacheDecisionNoDiskCacheChosenException extends Exception {
    }

    public static final ym8 a(ImageRequest imageRequest, ym8 ym8Var, ym8 ym8Var2, ImmutableMap immutableMap) {
        ImageRequest.CacheChoice cacheChoice = imageRequest.a;
        if (cacheChoice == ImageRequest.CacheChoice.SMALL) {
            return ym8Var;
        }
        if (cacheChoice == ImageRequest.CacheChoice.DEFAULT) {
            return ym8Var2;
        }
        return null;
    }
}
