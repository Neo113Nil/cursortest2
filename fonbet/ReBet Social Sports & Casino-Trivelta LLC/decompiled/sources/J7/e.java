package J7;

import com.facebook.imagepipeline.producers.h0;

/* loaded from: classes2.dex */
public interface e extends h0 {
    void onRequestCancellation(String str);

    void onRequestFailure(com.facebook.imagepipeline.request.b bVar, String str, Throwable th2, boolean z10);

    void onRequestStart(com.facebook.imagepipeline.request.b bVar, Object obj, String str, boolean z10);

    void onRequestSuccess(com.facebook.imagepipeline.request.b bVar, String str, boolean z10);
}
