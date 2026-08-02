package com.reactnativecompressor.Video.VideoCompressor;

import kotlin.Metadata;

/* compiled from: CompressionInterface.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/reactnativecompressor/Video/VideoCompressor/CompressionProgressListener;", "", "onProgressChanged", "", "index", "", "percent", "", "onProgressCancelled", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CompressionProgressListener {
    void onProgressCancelled(int index);

    void onProgressChanged(int index, float percent);
}
