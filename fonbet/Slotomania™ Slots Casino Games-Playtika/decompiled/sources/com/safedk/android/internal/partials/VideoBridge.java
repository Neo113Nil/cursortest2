package com.safedk.android.internal.partials;

import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;

/* loaded from: classes9.dex */
public class VideoBridge {
    private static final String a = "VideoBridge";
    private static final String b = "";

    /* renamed from: com.safedk.android.internal.partials.VideoBridge$1, reason: invalid class name */
    static class AnonymousClass1 implements Runnable {
        final /* synthetic */ VideoContentListener a;

        AnonymousClass1(VideoContentListener videoContentListener) {
            this.a = videoContentListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoBridge.b(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(VideoContentListener videoContentListener) {
        if (SafeDK.ad()) {
            try {
                Logger.d(a, "fyberOnVideoCompleted triggered ", ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a("", (String) null, true, "api-event");
            } catch (Throwable th) {
                Logger.e(a, "Exception in fyberOnVideoCompleted", th);
            }
        }
    }
}
