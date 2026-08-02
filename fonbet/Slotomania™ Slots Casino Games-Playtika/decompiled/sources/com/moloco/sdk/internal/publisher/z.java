package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.MolocoAd;

/* loaded from: classes6.dex */
public interface z {

    public static final class a {
        public static void a(z zVar) {
        }

        public static /* synthetic */ void a(z zVar, MolocoAd molocoAd, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAdShowSuccess");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            zVar.a(molocoAd, str);
        }
    }

    void a();

    void a(com.moloco.sdk.internal.s sVar);

    void a(MolocoAd molocoAd, String str);

    void onAdClicked(MolocoAd molocoAd);

    void onAdHidden(MolocoAd molocoAd);
}
