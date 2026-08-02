package com.vk.fave.entities;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.qsq;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveType.kt */
/* loaded from: classes18.dex */
public final class FaveType implements qsq {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveType[] $VALUES;
    public static final FaveType ARTICLE;
    public static final FaveType CLIP;
    public static final a Companion;
    public static final FaveType LINK;
    public static final FaveType NARRATIVE;
    public static final FaveType PODCAST;
    public static final FaveType POST;
    public static final FaveType PRODUCT;
    public static final FaveType VIDEO;
    private final MobileOfficialAppsCoreNavStat$EventScreen screen;
    private final String serverName;

    /* compiled from: FaveType.kt */
    public static final class a {
    }

    static {
        FaveType faveType = new FaveType("POST", 0, "post", MobileOfficialAppsCoreNavStat$EventScreen.FAVE_POSTS);
        POST = faveType;
        FaveType faveType2 = new FaveType("ARTICLE", 1, "article", MobileOfficialAppsCoreNavStat$EventScreen.FAVE_ARTICLES);
        ARTICLE = faveType2;
        FaveType faveType3 = new FaveType("LINK", 2, "link", MobileOfficialAppsCoreNavStat$EventScreen.FAVE_LINKS);
        LINK = faveType3;
        FaveType faveType4 = new FaveType("PODCAST", 3, "podcast", MobileOfficialAppsCoreNavStat$EventScreen.FAVE_PODCASTS);
        PODCAST = faveType4;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.FAVE_VIDEO;
        FaveType faveType5 = new FaveType(SignalingProtocol.MEDIA_OPTION_VIDEO, 4, "video", mobileOfficialAppsCoreNavStat$EventScreen);
        VIDEO = faveType5;
        FaveType faveType6 = new FaveType("CLIP", 5, "clip", mobileOfficialAppsCoreNavStat$EventScreen);
        CLIP = faveType6;
        FaveType faveType7 = new FaveType("PRODUCT", 6, "product", MobileOfficialAppsCoreNavStat$EventScreen.FAVE_PRODUCTS);
        PRODUCT = faveType7;
        FaveType faveType8 = new FaveType("NARRATIVE", 7, "narrative", MobileOfficialAppsCoreNavStat$EventScreen.FAVE_NARRATIVES);
        NARRATIVE = faveType8;
        FaveType[] faveTypeArr = {faveType, faveType2, faveType3, faveType4, faveType5, faveType6, faveType7, faveType8};
        $VALUES = faveTypeArr;
        $ENTRIES = new asp(faveTypeArr);
        Companion = new a();
    }

    public FaveType(String str, int i, String str2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.serverName = str2;
        this.screen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public static FaveType valueOf(String str) {
        return (FaveType) Enum.valueOf(FaveType.class, str);
    }

    public static FaveType[] values() {
        return (FaveType[]) $VALUES.clone();
    }

    @Override // xsna.qsq
    public final String h() {
        return this.serverName;
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen i() {
        return this.screen;
    }
}
