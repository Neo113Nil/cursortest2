package defpackage;

import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum t0 {
    STANDARD(AdType.Banner.MainScreenSmall, AdType.Banner.MainScreenBig),
    FANTASY(AdType.Banner.FantasySmall, AdType.Banner.FantasyBig);

    public final AdType.Banner a;
    public final AdType.Banner b;

    t0(AdType.Banner banner, AdType.Banner banner2) {
        this.a = banner;
        this.b = banner2;
    }
}
