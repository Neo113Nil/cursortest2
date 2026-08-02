package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzaz extends AdListener {
    public final Object a = new Object();
    public AdListener b;

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized (this.a) {
            try {
                AdListener adListener = this.b;
                if (adListener != null) {
                    adListener.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.a) {
            try {
                AdListener adListener = this.b;
                if (adListener != null) {
                    adListener.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.a) {
            try {
                AdListener adListener = this.b;
                if (adListener != null) {
                    adListener.onAdFailedToLoad(loadAdError);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.a) {
            try {
                AdListener adListener = this.b;
                if (adListener != null) {
                    adListener.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.a) {
            try {
                AdListener adListener = this.b;
                if (adListener != null) {
                    adListener.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.a) {
            try {
                AdListener adListener = this.b;
                if (adListener != null) {
                    adListener.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.a) {
            this.b = adListener;
        }
    }
}
