package com.vk.im.engine.models.education;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EduMaxTransitionBannerLocalState.kt */
/* loaded from: classes2.dex */
public final class EduMaxTransitionBannerLocalState$EntryPoint {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EduMaxTransitionBannerLocalState$EntryPoint[] $VALUES;
    public static final EduMaxTransitionBannerLocalState$EntryPoint CHATS;
    public static final a Companion;
    public static final EduMaxTransitionBannerLocalState$EntryPoint GROUP_CHAT;

    /* compiled from: EduMaxTransitionBannerLocalState.kt */
    public static final class a {
    }

    static {
        EduMaxTransitionBannerLocalState$EntryPoint eduMaxTransitionBannerLocalState$EntryPoint = new EduMaxTransitionBannerLocalState$EntryPoint("CHATS", 0);
        CHATS = eduMaxTransitionBannerLocalState$EntryPoint;
        EduMaxTransitionBannerLocalState$EntryPoint eduMaxTransitionBannerLocalState$EntryPoint2 = new EduMaxTransitionBannerLocalState$EntryPoint("GROUP_CHAT", 1);
        GROUP_CHAT = eduMaxTransitionBannerLocalState$EntryPoint2;
        EduMaxTransitionBannerLocalState$EntryPoint[] eduMaxTransitionBannerLocalState$EntryPointArr = {eduMaxTransitionBannerLocalState$EntryPoint, eduMaxTransitionBannerLocalState$EntryPoint2};
        $VALUES = eduMaxTransitionBannerLocalState$EntryPointArr;
        $ENTRIES = new asp(eduMaxTransitionBannerLocalState$EntryPointArr);
        Companion = new a();
    }

    public EduMaxTransitionBannerLocalState$EntryPoint() {
        throw null;
    }

    public static EduMaxTransitionBannerLocalState$EntryPoint valueOf(String str) {
        return (EduMaxTransitionBannerLocalState$EntryPoint) Enum.valueOf(EduMaxTransitionBannerLocalState$EntryPoint.class, str);
    }

    public static EduMaxTransitionBannerLocalState$EntryPoint[] values() {
        return (EduMaxTransitionBannerLocalState$EntryPoint[]) $VALUES.clone();
    }
}
