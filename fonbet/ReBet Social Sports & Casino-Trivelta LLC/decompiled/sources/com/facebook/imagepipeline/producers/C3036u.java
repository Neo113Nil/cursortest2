package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.b;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3036u {

    /* renamed from: a, reason: collision with root package name */
    public static final C3036u f30889a = new C3036u();

    /* renamed from: com.facebook.imagepipeline.producers.u$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static final A7.j a(com.facebook.imagepipeline.request.b imageRequest, A7.j jVar, A7.j jVar2, Map map) {
        String diskCacheId;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.getCacheChoice() == b.EnumC0484b.SMALL) {
            return jVar;
        }
        if (imageRequest.getCacheChoice() == b.EnumC0484b.DEFAULT) {
            return jVar2;
        }
        if (imageRequest.getCacheChoice() != b.EnumC0484b.DYNAMIC || map == null || (diskCacheId = imageRequest.getDiskCacheId()) == null) {
            return null;
        }
        return (A7.j) map.get(diskCacheId);
    }
}
