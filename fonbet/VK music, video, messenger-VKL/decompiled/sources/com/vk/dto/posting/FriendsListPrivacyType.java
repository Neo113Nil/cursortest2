package com.vk.dto.posting;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsListPrivacyType.kt */
/* loaded from: classes18.dex */
public final class FriendsListPrivacyType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsListPrivacyType[] $VALUES;
    public static final FriendsListPrivacyType CLIP;
    public static final a Companion;
    public static final FriendsListPrivacyType LIVE;
    public static final FriendsListPrivacyType POST;
    public static final FriendsListPrivacyType STORY;
    public static final FriendsListPrivacyType UNKNOWN;
    public static final FriendsListPrivacyType VIDEO;
    private final int id;

    /* compiled from: FriendsListPrivacyType.kt */
    public static final class a {
        public static FriendsListPrivacyType a(int i) {
            FriendsListPrivacyType friendsListPrivacyType;
            FriendsListPrivacyType[] values = FriendsListPrivacyType.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    friendsListPrivacyType = null;
                    break;
                }
                friendsListPrivacyType = values[i2];
                if (friendsListPrivacyType.h() == i) {
                    break;
                }
                i2++;
            }
            return friendsListPrivacyType == null ? FriendsListPrivacyType.UNKNOWN : friendsListPrivacyType;
        }
    }

    static {
        FriendsListPrivacyType friendsListPrivacyType = new FriendsListPrivacyType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        UNKNOWN = friendsListPrivacyType;
        FriendsListPrivacyType friendsListPrivacyType2 = new FriendsListPrivacyType("POST", 1, 1);
        POST = friendsListPrivacyType2;
        FriendsListPrivacyType friendsListPrivacyType3 = new FriendsListPrivacyType("STORY", 2, 2);
        STORY = friendsListPrivacyType3;
        FriendsListPrivacyType friendsListPrivacyType4 = new FriendsListPrivacyType("CLIP", 3, 3);
        CLIP = friendsListPrivacyType4;
        FriendsListPrivacyType friendsListPrivacyType5 = new FriendsListPrivacyType("LIVE", 4, 4);
        LIVE = friendsListPrivacyType5;
        FriendsListPrivacyType friendsListPrivacyType6 = new FriendsListPrivacyType(SignalingProtocol.MEDIA_OPTION_VIDEO, 5, 5);
        VIDEO = friendsListPrivacyType6;
        FriendsListPrivacyType[] friendsListPrivacyTypeArr = {friendsListPrivacyType, friendsListPrivacyType2, friendsListPrivacyType3, friendsListPrivacyType4, friendsListPrivacyType5, friendsListPrivacyType6};
        $VALUES = friendsListPrivacyTypeArr;
        $ENTRIES = new asp(friendsListPrivacyTypeArr);
        Companion = new a();
    }

    public FriendsListPrivacyType(String str, int i, int i2) {
        this.id = i2;
    }

    public static FriendsListPrivacyType valueOf(String str) {
        return (FriendsListPrivacyType) Enum.valueOf(FriendsListPrivacyType.class, str);
    }

    public static FriendsListPrivacyType[] values() {
        return (FriendsListPrivacyType[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
