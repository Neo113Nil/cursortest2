package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import w6.InterfaceC6713d;
import z7.AbstractC6940d;

/* loaded from: classes2.dex */
public interface d {
    String getName();

    InterfaceC6713d getPostprocessorCacheKey();

    H6.a process(Bitmap bitmap, AbstractC6940d abstractC6940d);
}
