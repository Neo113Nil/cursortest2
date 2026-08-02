package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes10.dex */
class CronetUrlRequestJni implements CronetUrlRequest.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CronetUrlRequestJni() {
    }

    public static CronetUrlRequest.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (CronetUrlRequest.Natives) jniTestInstanceHolder.value;
        }
        return new CronetUrlRequestJni();
    }

    public static void setInstanceForTesting(CronetUrlRequest.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean addRequestHeader(long nativePtr, String name, String value) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_addRequestHeader(nativePtr, name, value);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public long createRequestAdapter(CronetUrlRequest self, long urlRequestContextAdapter, String url, int priority, boolean disableCache, boolean disableConnectionMigration, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, int idempotency, byte[] dictionarySha256Hash, ByteBuffer dictionary, int dictionaryPosition, int dictionaryCapacity, String dictionaryId, long networkHandle) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(self, urlRequestContextAdapter, url, priority, disableCache, disableConnectionMigration, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid, idempotency, dictionarySha256Hash, dictionary, dictionaryPosition, dictionaryCapacity, dictionaryId, networkHandle);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void destroy(long nativePtr, boolean sendOnCanceled) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_destroy(nativePtr, sendOnCanceled);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void followDeferredRedirect(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(nativePtr);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void getStatus(long nativePtr, VersionSafeCallbacks.UrlRequestStatusListener listener) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_getStatus(nativePtr, listener);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean readData(long nativePtr, ByteBuffer byteBuffer, int position, int capacity) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_readData(nativePtr, byteBuffer, position, capacity);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean setHttpMethod(long nativePtr, String method) {
        return GEN_JNI.org_chromium_net_impl_CronetUrlRequest_setHttpMethod(nativePtr, method);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void start(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetUrlRequest_start(nativePtr);
    }
}
