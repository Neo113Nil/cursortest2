package com.ironsource;

/* renamed from: com.ironsource.o8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2578o8 {

    /* renamed from: com.ironsource.o8$a */
    public enum a {
        None,
        Device,
        Controller
    }

    /* renamed from: com.ironsource.o8$b */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* renamed from: com.ironsource.o8$c */
    public enum c {
        Web,
        Native,
        None
    }

    /* renamed from: com.ironsource.o8$d */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);

        private int a;

        d(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    /* renamed from: com.ironsource.o8$e */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
