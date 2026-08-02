package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMarusiaStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarusiaStat$TypeMessageItem {

    @pmi0("communication_type")
    private final CommunicationType communicationType;

    @pmi0("message_direction")
    private final MessageDirection messageDirection;

    @pmi0("player_type")
    private final PlayerType playerType;

    @pmi0("text_length")
    private final int textLength;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class CommunicationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CommunicationType[] $VALUES;

        @pmi0("button")
        public static final CommunicationType BUTTON;

        @pmi0("kws")
        public static final CommunicationType KWS;

        @pmi0("suggest")
        public static final CommunicationType SUGGEST;

        static {
            CommunicationType communicationType = new CommunicationType("KWS", 0);
            KWS = communicationType;
            CommunicationType communicationType2 = new CommunicationType("SUGGEST", 1);
            SUGGEST = communicationType2;
            CommunicationType communicationType3 = new CommunicationType("BUTTON", 2);
            BUTTON = communicationType3;
            CommunicationType[] communicationTypeArr = {communicationType, communicationType2, communicationType3};
            $VALUES = communicationTypeArr;
            $ENTRIES = new asp(communicationTypeArr);
        }

        private CommunicationType(String str, int i) {
        }

        public static CommunicationType valueOf(String str) {
            return (CommunicationType) Enum.valueOf(CommunicationType.class, str);
        }

        public static CommunicationType[] values() {
            return (CommunicationType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class MessageDirection {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MessageDirection[] $VALUES;

        @pmi0("incoming")
        public static final MessageDirection INCOMING;

        @pmi0("outgoing")
        public static final MessageDirection OUTGOING;

        static {
            MessageDirection messageDirection = new MessageDirection("INCOMING", 0);
            INCOMING = messageDirection;
            MessageDirection messageDirection2 = new MessageDirection("OUTGOING", 1);
            OUTGOING = messageDirection2;
            MessageDirection[] messageDirectionArr = {messageDirection, messageDirection2};
            $VALUES = messageDirectionArr;
            $ENTRIES = new asp(messageDirectionArr);
        }

        private MessageDirection(String str, int i) {
        }

        public static MessageDirection valueOf(String str) {
            return (MessageDirection) Enum.valueOf(MessageDirection.class, str);
        }

        public static MessageDirection[] values() {
            return (MessageDirection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMarusiaStat.kt */
    public static final class PlayerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PlayerType[] $VALUES;

        @pmi0("player")
        public static final PlayerType PLAYER;

        @pmi0("serp")
        public static final PlayerType SERP;

        static {
            PlayerType playerType = new PlayerType("SERP", 0);
            SERP = playerType;
            PlayerType playerType2 = new PlayerType("PLAYER", 1);
            PLAYER = playerType2;
            PlayerType[] playerTypeArr = {playerType, playerType2};
            $VALUES = playerTypeArr;
            $ENTRIES = new asp(playerTypeArr);
        }

        private PlayerType(String str, int i) {
        }

        public static PlayerType valueOf(String str) {
            return (PlayerType) Enum.valueOf(PlayerType.class, str);
        }

        public static PlayerType[] values() {
            return (PlayerType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsMarusiaStat$TypeMessageItem(MessageDirection messageDirection, int i, CommunicationType communicationType, PlayerType playerType) {
        this.messageDirection = messageDirection;
        this.textLength = i;
        this.communicationType = communicationType;
        this.playerType = playerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarusiaStat$TypeMessageItem)) {
            return false;
        }
        MobileOfficialAppsMarusiaStat$TypeMessageItem mobileOfficialAppsMarusiaStat$TypeMessageItem = (MobileOfficialAppsMarusiaStat$TypeMessageItem) obj;
        return this.messageDirection == mobileOfficialAppsMarusiaStat$TypeMessageItem.messageDirection && this.textLength == mobileOfficialAppsMarusiaStat$TypeMessageItem.textLength && this.communicationType == mobileOfficialAppsMarusiaStat$TypeMessageItem.communicationType && this.playerType == mobileOfficialAppsMarusiaStat$TypeMessageItem.playerType;
    }

    public final int hashCode() {
        int hashCode = (this.communicationType.hashCode() + shy.a(this.textLength, this.messageDirection.hashCode() * 31, 31)) * 31;
        PlayerType playerType = this.playerType;
        return hashCode + (playerType == null ? 0 : playerType.hashCode());
    }

    public final String toString() {
        return "TypeMessageItem(messageDirection=" + this.messageDirection + ", textLength=" + this.textLength + ", communicationType=" + this.communicationType + ", playerType=" + this.playerType + ')';
    }

    public /* synthetic */ MobileOfficialAppsMarusiaStat$TypeMessageItem(MessageDirection messageDirection, int i, CommunicationType communicationType, PlayerType playerType, int i2, zcl zclVar) {
        this(messageDirection, i, communicationType, (i2 & 8) != 0 ? null : playerType);
    }
}
