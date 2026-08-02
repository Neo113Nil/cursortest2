package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* loaded from: classes10.dex */
class CronetBidirectionalStreamJni implements CronetBidirectionalStream.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CronetBidirectionalStreamJni() {
    }

    public static CronetBidirectionalStream.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (CronetBidirectionalStream.Natives) jniTestInstanceHolder.value;
        }
        return new CronetBidirectionalStreamJni();
    }

    public static void setInstanceForTesting(CronetBidirectionalStream.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public long createBidirectionalStream(CronetBidirectionalStream self, long urlRequestContextAdapter, boolean sendRequestHeadersAutomatically, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, long networkHandle) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_createBidirectionalStream(self, urlRequestContextAdapter, sendRequestHeadersAutomatically, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid, networkHandle);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void destroy(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_destroy(nativePtr);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean readData(long nativePtr, ByteBuffer byteBuffer, int position, int limit) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_readData(nativePtr, byteBuffer, position, limit);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void sendRequestHeaders(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_sendRequestHeaders(nativePtr);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public int start(long nativePtr, String url, int priority, String method, String[] headers, boolean endOfStream) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_start(nativePtr, url, priority, method, headers, endOfStream);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean writevData(long nativePtr, ByteBuffer[] buffers, int[] positions, int[] limits, boolean endOfStream) {
        return GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_writevData(nativePtr, buffers, positions, limits, endOfStream);
    }
}
