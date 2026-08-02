package com.imagepicker;

import android.media.MediaMetadataRetriever;

/* loaded from: classes3.dex */
public class a extends MediaMetadataRetriever implements AutoCloseable {
    @Override // android.media.MediaMetadataRetriever, java.lang.AutoCloseable
    public void close() {
        release();
    }
}
