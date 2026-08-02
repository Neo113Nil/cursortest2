package com.vk.im.ui.components.msg_search.analytics;

import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.Peer;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ImSearchLoggingInfo.kt */
/* loaded from: classes2.dex */
public abstract class ImSearchItemLoggingInfo implements Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImSearchLoggingInfo.kt */
    public static final class ClickDocType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickDocType[] $VALUES;
        public static final ClickDocType CHANNEL;
        public static final ClickDocType CHAT;
        public static final ClickDocType CLICK_ITEM;
        public static final ClickDocType CONTACT;
        public static final a Companion;
        public static final ClickDocType DIALOG;
        public static final ClickDocType EMAIL;
        public static final ClickDocType GROUP;
        public static final ClickDocType USER;

        /* compiled from: ImSearchLoggingInfo.kt */
        public static final class a {

            /* compiled from: ImSearchLoggingInfo.kt */
            /* renamed from: com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo$ClickDocType$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1151a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Peer.Type.values().length];
                    try {
                        iArr[Peer.Type.UNKNOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Peer.Type.USER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Peer.Type.EMAIL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Peer.Type.GROUP.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Peer.Type.CHAT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[Peer.Type.CONTACT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[Peer.Type.CHANNEL.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public static ClickDocType a(Peer.Type type) {
                switch (C1151a.$EnumSwitchMapping$0[type.ordinal()]) {
                    case 1:
                        return ClickDocType.CLICK_ITEM;
                    case 2:
                        return ClickDocType.USER;
                    case 3:
                        return ClickDocType.EMAIL;
                    case 4:
                        return ClickDocType.GROUP;
                    case 5:
                        return ClickDocType.CHAT;
                    case 6:
                        return ClickDocType.CONTACT;
                    case 7:
                        return ClickDocType.CHANNEL;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        static {
            ClickDocType clickDocType = new ClickDocType("DIALOG", 0);
            DIALOG = clickDocType;
            ClickDocType clickDocType2 = new ClickDocType("CONTACT", 1);
            CONTACT = clickDocType2;
            ClickDocType clickDocType3 = new ClickDocType("USER", 2);
            USER = clickDocType3;
            ClickDocType clickDocType4 = new ClickDocType("GROUP", 3);
            GROUP = clickDocType4;
            ClickDocType clickDocType5 = new ClickDocType(CommonConstant.RETKEY.EMAIL, 4);
            EMAIL = clickDocType5;
            ClickDocType clickDocType6 = new ClickDocType("CLICK_ITEM", 5);
            CLICK_ITEM = clickDocType6;
            ClickDocType clickDocType7 = new ClickDocType("CHAT", 6);
            CHAT = clickDocType7;
            ClickDocType clickDocType8 = new ClickDocType("CHANNEL", 7);
            CHANNEL = clickDocType8;
            ClickDocType[] clickDocTypeArr = {clickDocType, clickDocType2, clickDocType3, clickDocType4, clickDocType5, clickDocType6, clickDocType7, clickDocType8};
            $VALUES = clickDocTypeArr;
            $ENTRIES = new asp(clickDocTypeArr);
            Companion = new a();
        }

        public ClickDocType() {
            throw null;
        }

        public static ClickDocType valueOf(String str) {
            return (ClickDocType) Enum.valueOf(ClickDocType.class, str);
        }

        public static ClickDocType[] values() {
            return (ClickDocType[]) $VALUES.clone();
        }
    }

    public ImSearchItemLoggingInfo(ClickDocType clickDocType, zcl zclVar) {
    }
}
