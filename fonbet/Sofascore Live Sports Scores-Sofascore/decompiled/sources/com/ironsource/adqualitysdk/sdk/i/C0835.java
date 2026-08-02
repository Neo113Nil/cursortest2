package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵅ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0835 extends VideoAdListener implements InterfaceC0873 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0833 f2774;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0683 f2775;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final VideoAdListener f2776;

    public C0835(C0833 c0833, VideoAdListener videoAdListener, C0683 c0683) {
        this.f2774 = c0833;
        this.f2776 = videoAdListener;
        this.f2775 = c0683;
    }

    public final void onAdClicked() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("9BIK3fpf4fLLCBrd+3v3kM0VL9zWcuzdyR4K\n", "ontuuJUehb4=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdClicked();
        }
    }

    public final void onAdCustomEndCardFound() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("GelyN1M2VPcm82I3UhJClSDuVzZ/AkPPIO1TPFg0UckrxnknUhM=\n", "T4AWUjx3MLs=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdCustomEndCardFound();
        }
    }

    public final void onAdDidReachEnd() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("sMcByPaAlZSP3RHI96SD9onAJMndqJWKg88GxdyvlQ==\n", "5q5lrZnB8dg=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdDidReachEnd();
        }
    }

    public final void onAdDismissed(int i) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("LS61TNgdg0sSNKVM2TmVKRQpkE3zNZRqEjSiTNMLjnMTF6NG0C6CdAg=\n", "e0fRKbdc5wc=\n"), Integer.valueOf(i));
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdDismissed(i);
        }
    }

    public final void onAdExpired() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("Hiu5HEHN3uwhMakcQOnIjicsnB1r9MrJOie5\n", "SELdeS6MuqA=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdExpired();
        }
    }

    public final void onAdLoadFail(PlayerInfo playerInfo) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("peJrlWIJHVSa+HuVYy0LNpzlTpRBJxh8tepmnA==\n", "84sP8A1IeRg=\n"), playerInfo);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadFail(playerInfo);
        }
    }

    public final void onAdLoadSuccess() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("1XSzpH/YIBvqbqOkfvw2eexzlqVc9iUz0Gi0onXqNw==\n", "gx3XwRCZRFc=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadSuccess();
        }
    }

    public final void onAdSkipped() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("opP+wU45K3mdie7BTx09G5uU28ByEyZFhJ/+\n", "9PqapCF4TzU=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdSkipped();
        }
    }

    public final void onAdStarted() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("SAjvRLePMIV3Ev9Etqsm53EPykWLujW7agTv\n", "HmGLIdjOVMk=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdStarted();
        }
    }

    public final void onCustomCTACLick(boolean z) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("tFQSpZQYfqqLTgKllTxoyI1TNbWILXWLoWk3g7cweY0=\n", "4j12wPtZGuY=\n"), Boolean.valueOf(z));
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTACLick(z);
        }
    }

    public final void onCustomCTALoadFail() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("FwgPyABeEUYoEh/IAXoHJC4PKNgcaxpnAjUq4QB+EUwgCAc=\n", "QWFrrW8fdQo=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTALoadFail();
        }
    }

    public final void onCustomCTAShow() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("pGfOBQZABlObfd4FB2QQMZ1g6RUadQ1ysVrrMwFuFQ==\n", "8g6qYGkBYh8=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTAShow();
        }
    }

    public final void onCustomEndCardClick(String str) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("k87STQfun4Ws1MJNBsqJ56rJ9V0b25SkgMnSawndn4qpztVD\n", "xae2KGiv+8k=\n"), str);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardClick(str);
        }
    }

    public final void onCustomEndCardShow(String str) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("mpazvMPcvtmljKO8wviou6ORlKzf6bX4iZGzms3vvsakkKA=\n", "zP/X2ayd2pU=\n"), str);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardShow(str);
        }
    }

    public final void onDefaultEndCardClick(String str) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("UGMm0fZjCtZveTbR90cctGlkBtH/Qxv2ck8s0NpDHP5FZivX8g==\n", "BgpCtJkibpo=\n"), str);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardClick(str);
        }
    }

    public final void onDefaultEndCardShow(String str) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("j0u12U/aFzWwUaXZTv4BV7ZMldlG+gYVrWe/2GP6AR2KSr7L\n", "2SLRvCCbc3k=\n"), str);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardShow(str);
        }
    }

    public final void onEndCardClosed(Boolean bool) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("3ROEuXr2sSPiCZS5e9KnQeQUpbJx9LQd7zmMs2bSsQ==\n", "i3rg3BW31W8=\n"), bool);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onEndCardClosed(bool);
        }
    }

    public final void onEndCardLoadFail(Boolean bool) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("AT0lNeLuwc0+JzU148rXrzg6BD7p7MTzMxguMenpxOg7\n", "V1RBUI2vpYE=\n"), bool);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadFail(bool);
        }
    }

    public final void onEndCardLoadSuccess(Boolean bool) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("/1ZUekrFWW7ATER6S+FPDMZRdXFBx1xQzXNffkHXSEHKWkNs\n", "qT8wHyWEPSI=\n"), bool);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadSuccess(bool);
        }
    }

    public final void onEndCardSkipped(Boolean bool) {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("32DNm4fpa8rget2bhs19qOZn7JCM62707VrCl5jYauI=\n", "iQmp/uioD4Y=\n"), bool);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onEndCardSkipped(bool);
        }
    }

    public final void onLeaveApp() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("Gs66gc0J3Bsl1KqBzC3KeSPJkoHDPt0WPNc=\n", "TKfe5KJIuFc=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onLeaveApp();
        }
    }

    public final void onReplay() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("t1ZuhkWzSFyITH6GRJdePo5RWIZank1p\n", "4T8K4yryLBA=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onReplay();
        }
    }

    public final void onReplayFinish() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("yashcMf0f9n2sTFwxtBpu/CsF3DY2Xrs2asrfNvd\n", "n8JFFai1G5U=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onReplayFinish();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0873
    /* renamed from: ﾒ */
    public final Object mo127() {
        return this.f2776;
    }

    public final void onAdDismissed() {
        this.f2774.m270(this, this.f2775, StringFog.decrypt("wlF14hmKssX9S2XiGK6kp/tWUOMyoqXk/Uti4hI=\n", "lDgRh3bL1ok=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2776;
        if (videoAdListener != null) {
            videoAdListener.onAdDismissed();
        }
    }
}
