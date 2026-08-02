package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$EditAttachmentEvent {

    @pmi0("edit_attachment_event_type")
    private final EditAttachmentEventType editAttachmentEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class EditAttachmentEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EditAttachmentEventType[] $VALUES;

        @pmi0("edit_photo")
        public static final EditAttachmentEventType EDIT_PHOTO;

        @pmi0("open_editor")
        public static final EditAttachmentEventType OPEN_EDITOR;

        static {
            EditAttachmentEventType editAttachmentEventType = new EditAttachmentEventType("EDIT_PHOTO", 0);
            EDIT_PHOTO = editAttachmentEventType;
            EditAttachmentEventType editAttachmentEventType2 = new EditAttachmentEventType("OPEN_EDITOR", 1);
            OPEN_EDITOR = editAttachmentEventType2;
            EditAttachmentEventType[] editAttachmentEventTypeArr = {editAttachmentEventType, editAttachmentEventType2};
            $VALUES = editAttachmentEventTypeArr;
            $ENTRIES = new asp(editAttachmentEventTypeArr);
        }

        private EditAttachmentEventType(String str, int i) {
        }

        public static EditAttachmentEventType valueOf(String str) {
            return (EditAttachmentEventType) Enum.valueOf(EditAttachmentEventType.class, str);
        }

        public static EditAttachmentEventType[] values() {
            return (EditAttachmentEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$EditAttachmentEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPostingStat$EditAttachmentEvent) && this.editAttachmentEventType == ((MobileOfficialAppsConPostingStat$EditAttachmentEvent) obj).editAttachmentEventType;
    }

    public final int hashCode() {
        EditAttachmentEventType editAttachmentEventType = this.editAttachmentEventType;
        if (editAttachmentEventType == null) {
            return 0;
        }
        return editAttachmentEventType.hashCode();
    }

    public final String toString() {
        return "EditAttachmentEvent(editAttachmentEventType=" + this.editAttachmentEventType + ')';
    }

    public MobileOfficialAppsConPostingStat$EditAttachmentEvent(EditAttachmentEventType editAttachmentEventType) {
        this.editAttachmentEventType = editAttachmentEventType;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$EditAttachmentEvent(EditAttachmentEventType editAttachmentEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : editAttachmentEventType);
    }
}
