package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.Model.CBError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺣ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1105 extends ChartboostDelegate implements InterfaceC0873 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1097 f3483;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0683 f3484;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ChartboostDelegate f3485;

    public C1105(C1097 c1097, ChartboostDelegate chartboostDelegate, C0683 c0683) {
        this.f3483 = c1097;
        this.f3485 = chartboostDelegate;
        this.f3484 = c0683;
    }

    public final void didCacheInPlay(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("6aDNxFWWyN7ZvOjTTZHA0N6tgtJIkOTQyaDJ/0+ky9DT\n", "qsistiH0p7E=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheInPlay(str);
        }
    }

    public final void didCacheInterstitial(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("8OIbFSsU1cHA/j4CMxPdz8fvVAM2EvnP0OIfLjEC39zA/hMTNhfW\n", "s4p6Z192uq4=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheInterstitial(str);
        }
    }

    public final void didCacheMoreApps(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("+YgrR5RZCZzJlA5QjF4Bks6FZFGJXyWS2YgveI9JA7LKkDk=\n", "uuBKNeA7ZvM=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheMoreApps(str);
        }
    }

    public final void didCacheRewardedVideo(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("OTigBO/kKwUJJIUT9+MjCw417xLy4gcLGTikJP7xJRgeNaUg8uIhBQ==\n", "elDBdpuGRGo=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheRewardedVideo(str);
        }
    }

    public final void didClickInterstitial(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("qWz0e1/Q98OZcNFsR9f/zZ5hu21C1tvAg2f+QEXG/d6ZcPx9QtP0\n", "6gSVCSuymKw=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickInterstitial(str);
        }
    }

    public final void didClickMoreApps(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("bZxN/nZml+ZdgGjpbmGf6FqRAuhrYLvlR5dHwW12nchehF8=\n", "LvQsjAIE+Ik=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickMoreApps(str);
        }
    }

    public final void didClickRewardedVideo(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("uD2jpd1LC6KIIYayxUwDrI8w7LPATSehkjaphcxeBb+fMKaBwE0Bog==\n", "+1XC16kpZM0=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickRewardedVideo(str);
        }
    }

    public final void didCloseInterstitial(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("nKbYcWxLyXasuv1mdEzBeKurl2dxTeV1sL3cSnZdw2usutB3cUjK\n", "3865Axgpphk=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseInterstitial(str);
        }
    }

    public final void didCloseMoreApps(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("Jbu2K+4KBpcVp5M89g0OmRK2+T3zDCqUCaCyFPUaDLkWo6Q=\n", "ZtPXWZpoafg=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseMoreApps(str);
        }
    }

    public final void didCloseRewardedVideo(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("B9np+0Yf+ls3xczsXhjyVTDUpu1bGdZYK8Lt21cK9EYg1OzfWxnwWw==\n", "RLGIiTJ9lTQ=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseRewardedVideo(str);
        }
    }

    public final void didCompleteInterstitial(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("d08jMckTw4NHUwYm0RTLjUBCbCfUFe+DWVcuJskU5YJAQjAwyRjYhVVL\n", "NCdCQ71xrOw=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCompleteInterstitial(str);
        }
    }

    public final void didCompleteRewardedVideo(String str, int i) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("catWIzf00RdBt3M0L/PZGUamGTUq8v0XX7NbNDfz7B1FokU1JvLoEVamWA==\n", "MsM3UUOWvng=\n"), str, Integer.valueOf(i));
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCompleteRewardedVideo(str, i);
        }
    }

    public final void didDismissInterstitial(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("ogZrGnyjvbKSGk4NZKS1vJULJAxhpZa0kgNjG3uIvKmEHHkcYbW7vI0=\n", "4W4KaAjB0t0=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissInterstitial(str);
        }
    }

    public final void didDismissMoreApps(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("L4Ixq7FoA9UfnhS8qW8L2xiPfr2sbijTH4c5qrZHA8gJqyCptg==\n", "bOpQ2cUKbLo=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissMoreApps(str);
        }
    }

    public final void didDismissRewardedVideo(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("tEa/eB0KNx6EWppvBQ0/EINL8G4ADBwYhEO3eRo6PQaWXLpvDT4xFZJB\n", "9y7eCmloWHE=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissRewardedVideo(str);
        }
    }

    public final void didDisplayInterstitial(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("KJ/9e5Hk/QYYg9hsieP1CB+Ssm2M4tYAGIfwaJzP/B0Ohe99jPL7CAc=\n", "a/ecCeWGkmk=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayInterstitial(str);
        }
    }

    public final void didDisplayMoreApps(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("C2CI/+80PYs7fK3o9zM1hTxtx+nyMhaNO3iF7OIbPZYtSZn96A==\n", "SAjpjZtWUuQ=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayMoreApps(str);
        }
    }

    public final void didDisplayRewardedVideo(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("48OUo0VFLk7T37G0XUImQNTO27VYQwVI09uZsEh1JFbB2ZG0VXEoRcXE\n", "oKv10TEnQSE=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayRewardedVideo(str);
        }
    }

    public final void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("oc+mXkT8BOqR04NJXPsM5JbC6UhZ+i3ki8uTQ3zxCuGryZdAUec=\n", "4qfHLDCea4U=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
        }
    }

    public final void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("q0xdTdkNCXybUHhawQoBcpxBElvECyBygUhoUOEAB3ehSkha3xwSepxNXVM=\n", "6CQ8P61vZhM=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
        }
    }

    public final void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("OOGI8uIRz/oI/a3l+hbH9A/sx+T/F+b0EuW979ocwfE25pvl1wPQ5g==\n", "e4npgJZzoJU=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
        }
    }

    public final void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("8nuzYV6mpGbCZ5Z2RqGsaMV2/HdDoI1o2H+GfGarqm3jdqVyWKCubed6tnZF\n", "sRPSEyrEywk=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
        }
    }

    public final void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("S5bot1CnN2J7is2gSKA/bHybp6FNoR5sYZLdqnagO2J6msqpTaYz\n", "CP6JxSTFWA0=\n"), str, cBClickError);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToRecordClick(str, cBClickError);
        }
    }

    public final void didInitialize() {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("Xjt4eghJBx9uJ11tEE4PEWk2N2wVTyEedCdwaRBCEhU=\n", "HVMZCHwraHA=\n"), new Object[0]);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.didInitialize();
        }
    }

    public final void didPauseClickForConfirmation(Activity activity) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("vWrpBGzCL12NdswTdMUnU4pnphJxxBBTi3HtNXTJI1m4bfo1d84mW4xv6QJxzy4=\n", "/gKIdhigQDI=\n"), activity);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            try {
                chartboostDelegate.getClass().getDeclaredMethod(StringFog.decrypt("DCV8SI61f8krIHF7hIZj3isjdn6GsmHNHCV3dg==\n", "aEwYGO/ADKw=\n"), Activity.class).invoke(this.f3485, activity);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean shouldDisplayInterstitial(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("lBixCg1CccqkBJQdFUV5xKMV/gsRT2vJszS5CwlMf9yeHqQdC1NqzKMZsRQ=\n", "13DQeHkgHqU=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayInterstitial(str);
        }
        return false;
    }

    public final boolean shouldDisplayMoreApps(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("Qh3oobcDvzlyAc22rwS3N3UQp6CrDqU6ZTHgoLMNsS9MGvu2ghGgJQ==\n", "AXWJ08Nh0FY=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayMoreApps(str);
        }
        return false;
    }

    public final boolean shouldDisplayRewardedVideo(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("IB79FwA6rQEQAtgAGD2lDxcTshYcN7cCBzL1FgQ0oxcxE+sEBjynCjUf+AAb\n", "Y3acZXRYwm4=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayRewardedVideo(str);
        }
        return false;
    }

    public final boolean shouldRequestInterstitial(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("Q6XpHPJoDMBzucwL6m8EznSoph3uZRbDZJ/tH/NvENtJo/wL9HkXxnSk6QI=\n", "AM2IboYKY68=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldRequestInterstitial(str);
        }
        return false;
    }

    public final boolean shouldRequestMoreApps(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("1Z/Y67EMhYvlg/38qQuNheKSl+qtAZ+I8qXc6LALmZDbmMv8hB6alw==\n", "lve5mcVu6uQ=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldRequestMoreApps(str);
        }
        return false;
    }

    public final void willDisplayVideo(String str) {
        this.f3483.m270(this, this.f3484, StringFog.decrypt("a8xOOSbpcu9b0GsuPu564VzBATw753HEQddfJzPyS+lMwUA=\n", "KKQvS1KLHYA=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3485;
        if (chartboostDelegate != null) {
            chartboostDelegate.willDisplayVideo(str);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this.f3485;
    }
}
