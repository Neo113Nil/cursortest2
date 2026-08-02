package com.fyber.inneractive.sdk.config.global.features;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v extends i {
    public static final u e = u.NONE;

    public v() {
        super("video_player");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        v vVar = new v();
        a(vVar);
        return vVar;
    }

    public final u c() {
        String a = a("click_action", e.mKey);
        for (u uVar : u.values()) {
            if (a.equalsIgnoreCase(uVar.mKey)) {
                return uVar;
            }
        }
        return u.NONE;
    }
}
