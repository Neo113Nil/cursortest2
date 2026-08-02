package org.chromium.net.impl;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.impl.CronetUploadDataStream;

/* loaded from: classes10.dex */
class CronetUploadDataStreamJni implements CronetUploadDataStream.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    CronetUploadDataStreamJni() {
    }

    public static CronetUploadDataStream.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (CronetUploadDataStream.Natives) jniTestInstanceHolder.value;
        }
        return new CronetUploadDataStreamJni();
    }

    public static void setInstanceForTesting(CronetUploadDataStream.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long attachUploadDataToRequest(CronetUploadDataStream caller, long urlRequestAdapter, long length) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(caller, urlRequestAdapter, length);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createAdapterForTesting(CronetUploadDataStream caller) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(caller);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createUploadDataStreamForTesting(CronetUploadDataStream caller, long length, long adapter) {
        return GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(caller, length, adapter);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void destroy(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_destroy(nativePtr);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onReadSucceeded(long nativePtr, int bytesRead, boolean finalChunk) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(nativePtr, bytesRead, finalChunk);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onRewindSucceeded(long nativePtr) {
        GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(nativePtr);
    }
}
