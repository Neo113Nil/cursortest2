package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioTapPopupEventItem implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final CommonAudioStat$TypeAudioDomainEventItem event;

    @pmi0("popup_type")
    private final PopupType popupType;

    @pmi0("tap_event")
    private final CommonAudioStat$AudioDomainTapEvent tapEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class PopupType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PopupType[] $VALUES;

        @pmi0("notice")
        public static final PopupType NOTICE;

        @pmi0("system")
        public static final PopupType SYSTEM;

        static {
            PopupType popupType = new PopupType("SYSTEM", 0);
            SYSTEM = popupType;
            PopupType popupType2 = new PopupType("NOTICE", 1);
            NOTICE = popupType2;
            PopupType[] popupTypeArr = {popupType, popupType2};
            $VALUES = popupTypeArr;
            $ENTRIES = new asp(popupTypeArr);
        }

        private PopupType(String str, int i) {
        }

        public static PopupType valueOf(String str) {
            return (PopupType) Enum.valueOf(PopupType.class, str);
        }

        public static PopupType[] values() {
            return (PopupType[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioTapPopupEventItem(CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem, CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent, PopupType popupType) {
        this.event = commonAudioStat$TypeAudioDomainEventItem;
        this.tapEvent = commonAudioStat$AudioDomainTapEvent;
        this.popupType = popupType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioTapPopupEventItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioTapPopupEventItem commonAudioStat$TypeAudioTapPopupEventItem = (CommonAudioStat$TypeAudioTapPopupEventItem) obj;
        return epx.f(this.event, commonAudioStat$TypeAudioTapPopupEventItem.event) && epx.f(this.tapEvent, commonAudioStat$TypeAudioTapPopupEventItem.tapEvent) && this.popupType == commonAudioStat$TypeAudioTapPopupEventItem.popupType;
    }

    public final int hashCode() {
        return this.popupType.hashCode() + ((this.tapEvent.hashCode() + (this.event.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeAudioTapPopupEventItem(event=" + this.event + ", tapEvent=" + this.tapEvent + ", popupType=" + this.popupType + ')';
    }
}
