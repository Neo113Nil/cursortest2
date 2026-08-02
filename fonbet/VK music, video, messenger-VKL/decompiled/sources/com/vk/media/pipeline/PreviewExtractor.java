package com.vk.media.pipeline;

import android.graphics.Bitmap;
import android.util.Size;

/* compiled from: PreviewExtractor.kt */
/* loaded from: classes3.dex */
public interface PreviewExtractor {

    /* compiled from: PreviewExtractor.kt */
    public static final class PreviewExtractionException extends RuntimeException {
    }

    Bitmap a(long j, Size size) throws PreviewExtractionException;
}
