package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$ChangePreview {

    @pmi0("preview_type")
    private final PreviewType previewType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class PreviewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PreviewType[] $VALUES;

        @pmi0("first_frame")
        public static final PreviewType FIRST_FRAME;

        @pmi0("gallery")
        public static final PreviewType GALLERY;

        @pmi0("original")
        public static final PreviewType ORIGINAL;

        static {
            PreviewType previewType = new PreviewType("FIRST_FRAME", 0);
            FIRST_FRAME = previewType;
            PreviewType previewType2 = new PreviewType("ORIGINAL", 1);
            ORIGINAL = previewType2;
            PreviewType previewType3 = new PreviewType("GALLERY", 2);
            GALLERY = previewType3;
            PreviewType[] previewTypeArr = {previewType, previewType2, previewType3};
            $VALUES = previewTypeArr;
            $ENTRIES = new asp(previewTypeArr);
        }

        private PreviewType(String str, int i) {
        }

        public static PreviewType valueOf(String str) {
            return (PreviewType) Enum.valueOf(PreviewType.class, str);
        }

        public static PreviewType[] values() {
            return (PreviewType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$ChangePreview() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$ChangePreview) && this.previewType == ((MobileOfficialAppsClipsStat$ChangePreview) obj).previewType;
    }

    public final int hashCode() {
        PreviewType previewType = this.previewType;
        if (previewType == null) {
            return 0;
        }
        return previewType.hashCode();
    }

    public final String toString() {
        return "ChangePreview(previewType=" + this.previewType + ')';
    }

    public MobileOfficialAppsClipsStat$ChangePreview(PreviewType previewType) {
        this.previewType = previewType;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$ChangePreview(PreviewType previewType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : previewType);
    }
}
