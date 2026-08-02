package com.vk.stat.scheme;

import com.coremedia.iso.boxes.FreeSpaceBox;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoPushesAdClick implements SchemeStat$TypeClick.b {

    @pmi0("button_type")
    private final ButtonType buttonType;

    @pmi0("label_type")
    private final LabelType labelType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ButtonType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;

        @pmi0("allow")
        public static final ButtonType ALLOW;

        @pmi0(FreeSpaceBox.TYPE)
        public static final ButtonType SKIP;

        static {
            ButtonType buttonType = new ButtonType("ALLOW", 0);
            ALLOW = buttonType;
            ButtonType buttonType2 = new ButtonType(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 1);
            SKIP = buttonType2;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2};
            $VALUES = buttonTypeArr;
            $ENTRIES = new asp(buttonTypeArr);
        }

        private ButtonType(String str, int i) {
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class LabelType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LabelType[] $VALUES;

        @pmi0("all")
        public static final LabelType ALL;

        @pmi0("no_marketing")
        public static final LabelType NO_MARKETING;

        static {
            LabelType labelType = new LabelType("ALL", 0);
            ALL = labelType;
            LabelType labelType2 = new LabelType("NO_MARKETING", 1);
            NO_MARKETING = labelType2;
            LabelType[] labelTypeArr = {labelType, labelType2};
            $VALUES = labelTypeArr;
            $ENTRIES = new asp(labelTypeArr);
        }

        private LabelType(String str, int i) {
        }

        public static LabelType valueOf(String str) {
            return (LabelType) Enum.valueOf(LabelType.class, str);
        }

        public static LabelType[] values() {
            return (LabelType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoPushesAdClick(ButtonType buttonType, LabelType labelType) {
        this.buttonType = buttonType;
        this.labelType = labelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoPushesAdClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoPushesAdClick mobileOfficialAppsVideoStat$TypeVideoPushesAdClick = (MobileOfficialAppsVideoStat$TypeVideoPushesAdClick) obj;
        return this.buttonType == mobileOfficialAppsVideoStat$TypeVideoPushesAdClick.buttonType && this.labelType == mobileOfficialAppsVideoStat$TypeVideoPushesAdClick.labelType;
    }

    public final int hashCode() {
        return this.labelType.hashCode() + (this.buttonType.hashCode() * 31);
    }

    public final String toString() {
        return "TypeVideoPushesAdClick(buttonType=" + this.buttonType + ", labelType=" + this.labelType + ')';
    }
}
