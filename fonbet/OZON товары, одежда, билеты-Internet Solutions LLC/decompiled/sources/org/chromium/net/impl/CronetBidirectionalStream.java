package org.chromium.net.impl;

import internal.org.jni_zero.CalledByNative;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes10.dex */
public final class CronetBidirectionalStream extends org.chromium.net.h {

    /* renamed from: a, reason: collision with root package name */
    private c0 f78714a;

    private static void d() {
        vf.c.c("CronetBidirectionalStream#postTaskToExecutor failWithException");
        throw null;
    }

    private static ArrayList<Map.Entry<String, String>> e(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i11 = 0; i11 < strArr.length; i11 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i11], strArr[i11 + 1]));
        }
        return arrayList;
    }

    @CalledByNative
    private void onCanceled() {
        vf.c.c("CronetBidirectionalStream#postTaskToExecutor onCanceled");
        throw null;
    }

    @CalledByNative
    private void onError(int i11, int i12, int i13, int i14, String str, long j11) {
        this.f78714a.i(j11);
        if (i11 == 10 || i13 != 0) {
            new Y(Nk.a.b("Exception in BidirectionalStream: ", str), i11, i12, i13, i14);
            d();
            throw null;
        }
        new B(Nk.a.b("Exception in BidirectionalStream: ", str), i11, i12);
        d();
        throw null;
    }

    @CalledByNative
    private void onMetricsCollected(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, boolean z11, long j25, long j26, boolean z12, boolean z13) {
        throw new IllegalStateException("Metrics collection should only happen once.");
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i11, int i12, int i13, long j11) {
        int i14;
        this.f78714a.i(j11);
        if (byteBuffer.position() != i12 || byteBuffer.limit() != i13) {
            new F("ByteBuffer modified externally during read", (Throwable) null);
            d();
            throw null;
        }
        if (i11 >= 0 && (i14 = i12 + i11) <= i13) {
            throw null;
        }
        new F("Invalid number of bytes read", (Throwable) null);
        d();
        throw null;
    }

    @CalledByNative
    private void onResponseHeadersReceived(int i11, String str, String[] strArr, long j11) {
        try {
            this.f78714a = new c0(Arrays.asList(null), i11, "", e(strArr), false, str, null, j11);
            vf.c.c("CronetBidirectionalStream#postTaskToExecutor onResponseHeadersReceived");
            throw null;
        } catch (Exception unused) {
            new F("Cannot prepare ResponseInfo", (Throwable) null);
            d();
            throw null;
        }
    }

    @CalledByNative
    private void onResponseTrailersReceived(String[] strArr) {
        e(strArr);
        vf.c.c("CronetBidirectionalStream#postTaskToExecutor onResponseTrailersReceived");
        throw null;
    }

    @CalledByNative
    private void onStreamReady(boolean z11) {
        vf.c.c("CronetBidirectionalStream#postTaskToExecutor onStreamReady");
        throw null;
    }

    @CalledByNative
    private void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z11) {
        throw null;
    }
}
