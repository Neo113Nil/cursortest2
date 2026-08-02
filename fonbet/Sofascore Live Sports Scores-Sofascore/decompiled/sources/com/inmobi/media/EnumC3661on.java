package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.jp5;
import defpackage.kp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.on, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3661on {
    public static final /* synthetic */ EnumC3661on[] b;
    public static final /* synthetic */ jp5 c;
    public final String a;

    static {
        EnumC3661on[] enumC3661onArr = {new EnumC3661on("SHOW_VIDEO", 0, "show"), new EnumC3661on("HIDE_VIDEO", 1, "hide"), new EnumC3661on("PLAY_VIDEO", 2, CampaignEx.JSON_NATIVE_VIDEO_RESUME), new EnumC3661on("PAUSE_VIDEO", 3, CampaignEx.JSON_NATIVE_VIDEO_PAUSE), new EnumC3661on("MUTE_VIDEO", 4, CampaignEx.JSON_NATIVE_VIDEO_MUTE), new EnumC3661on("UNMUTE_VIDEO", 5, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE), new EnumC3661on("SKIP_VIDEO", 6, "skip")};
        b = enumC3661onArr;
        c = new kp5(enumC3661onArr);
    }

    public EnumC3661on(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC3661on valueOf(String str) {
        return (EnumC3661on) Enum.valueOf(EnumC3661on.class, str);
    }

    public static EnumC3661on[] values() {
        return (EnumC3661on[]) b.clone();
    }
}
