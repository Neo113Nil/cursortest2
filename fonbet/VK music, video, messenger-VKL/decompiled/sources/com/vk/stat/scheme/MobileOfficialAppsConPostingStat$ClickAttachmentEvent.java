package com.vk.stat.scheme;

import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$ClickAttachmentEvent {

    @pmi0("attachments_info")
    private final List<MobileOfficialAppsConPostingStat$AttachmentInfo> attachmentsInfo;

    @pmi0("click_attachment_event_type")
    private final ClickAttachmentEventType clickAttachmentEventType;

    @pmi0("vk_ticket")
    private final MobileOfficialAppsConPostingStat$VkTicket vkTicket;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class ClickAttachmentEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickAttachmentEventType[] $VALUES;

        @pmi0("change_directory")
        public static final ClickAttachmentEventType CHANGE_DIRECTORY;

        @pmi0("click_to_add_file")
        public static final ClickAttachmentEventType CLICK_TO_ADD_FILE;

        @pmi0("click_to_article")
        public static final ClickAttachmentEventType CLICK_TO_ARTICLE;

        @pmi0("expand_text")
        public static final ClickAttachmentEventType EXPAND_TEXT;

        @pmi0("make_photo_from_gallery")
        public static final ClickAttachmentEventType MAKE_PHOTO_FROM_GALLERY;

        @pmi0("make_video_from_gallery")
        public static final ClickAttachmentEventType MAKE_VIDEO_FROM_GALLERY;

        @pmi0("music_preview")
        public static final ClickAttachmentEventType MUSIC_PREVIEW;

        @pmi0("open_action_button")
        public static final ClickAttachmentEventType OPEN_ACTION_BUTTON;

        @pmi0("open_album")
        public static final ClickAttachmentEventType OPEN_ALBUM;

        @pmi0("open_camera_from_gallery")
        public static final ClickAttachmentEventType OPEN_CAMERA_FROM_GALLERY;

        @pmi0("open_doc")
        public static final ClickAttachmentEventType OPEN_DOC;

        @pmi0("open_file")
        public static final ClickAttachmentEventType OPEN_FILE;

        @pmi0("open_gallery")
        public static final ClickAttachmentEventType OPEN_GALLERY;

        @pmi0("open_marks_all")
        public static final ClickAttachmentEventType OPEN_MARKS_ALL;

        @pmi0("open_music")
        public static final ClickAttachmentEventType OPEN_MUSIC;

        @pmi0("open_my_photo")
        public static final ClickAttachmentEventType OPEN_MY_PHOTO;

        @pmi0("open_my_video")
        public static final ClickAttachmentEventType OPEN_MY_VIDEO;

        @pmi0("open_photo")
        public static final ClickAttachmentEventType OPEN_PHOTO;

        @pmi0("open_picker")
        public static final ClickAttachmentEventType OPEN_PICKER;

        @pmi0("open_place")
        public static final ClickAttachmentEventType OPEN_PLACE;

        @pmi0("open_playlists")
        public static final ClickAttachmentEventType OPEN_PLAYLISTS;

        @pmi0("open_poll")
        public static final ClickAttachmentEventType OPEN_POLL;

        @pmi0("open_product")
        public static final ClickAttachmentEventType OPEN_PRODUCT;

        @pmi0("open_service")
        public static final ClickAttachmentEventType OPEN_SERVICE;

        @pmi0("product_photo_select")
        public static final ClickAttachmentEventType PRODUCT_PHOTO_SELECT;

        @pmi0("product_photo_swipe")
        public static final ClickAttachmentEventType PRODUCT_PHOTO_SWIPE;

        @pmi0("selection_mode_community")
        public static final ClickAttachmentEventType SELECTION_MODE_COMMUNITY;

        @pmi0("selection_mode_profile")
        public static final ClickAttachmentEventType SELECTION_MODE_PROFILE;

        @pmi0("select_photo")
        public static final ClickAttachmentEventType SELECT_PHOTO;

        @pmi0("select_photo_card")
        public static final ClickAttachmentEventType SELECT_PHOTO_CARD;

        @pmi0("select_video")
        public static final ClickAttachmentEventType SELECT_VIDEO;

        @pmi0("select_video_card")
        public static final ClickAttachmentEventType SELECT_VIDEO_CARD;

        @pmi0("show_music_error_msg")
        public static final ClickAttachmentEventType SHOW_MUSIC_ERROR_MSG;

        @pmi0("show_product_error_msg")
        public static final ClickAttachmentEventType SHOW_PRODUCT_ERROR_MSG;

        @pmi0("transition_to_button_details")
        public static final ClickAttachmentEventType TRANSITION_TO_BUTTON_DETAILS;

        static {
            ClickAttachmentEventType clickAttachmentEventType = new ClickAttachmentEventType("OPEN_GALLERY", 0);
            OPEN_GALLERY = clickAttachmentEventType;
            ClickAttachmentEventType clickAttachmentEventType2 = new ClickAttachmentEventType("CHANGE_DIRECTORY", 1);
            CHANGE_DIRECTORY = clickAttachmentEventType2;
            ClickAttachmentEventType clickAttachmentEventType3 = new ClickAttachmentEventType("SELECT_PHOTO", 2);
            SELECT_PHOTO = clickAttachmentEventType3;
            ClickAttachmentEventType clickAttachmentEventType4 = new ClickAttachmentEventType("SELECT_VIDEO", 3);
            SELECT_VIDEO = clickAttachmentEventType4;
            ClickAttachmentEventType clickAttachmentEventType5 = new ClickAttachmentEventType("OPEN_CAMERA_FROM_GALLERY", 4);
            OPEN_CAMERA_FROM_GALLERY = clickAttachmentEventType5;
            ClickAttachmentEventType clickAttachmentEventType6 = new ClickAttachmentEventType("MAKE_PHOTO_FROM_GALLERY", 5);
            MAKE_PHOTO_FROM_GALLERY = clickAttachmentEventType6;
            ClickAttachmentEventType clickAttachmentEventType7 = new ClickAttachmentEventType("MAKE_VIDEO_FROM_GALLERY", 6);
            MAKE_VIDEO_FROM_GALLERY = clickAttachmentEventType7;
            ClickAttachmentEventType clickAttachmentEventType8 = new ClickAttachmentEventType("OPEN_MUSIC", 7);
            OPEN_MUSIC = clickAttachmentEventType8;
            ClickAttachmentEventType clickAttachmentEventType9 = new ClickAttachmentEventType("OPEN_MY_PHOTO", 8);
            OPEN_MY_PHOTO = clickAttachmentEventType9;
            ClickAttachmentEventType clickAttachmentEventType10 = new ClickAttachmentEventType("OPEN_ALBUM", 9);
            OPEN_ALBUM = clickAttachmentEventType10;
            ClickAttachmentEventType clickAttachmentEventType11 = new ClickAttachmentEventType("OPEN_MARKS_ALL", 10);
            OPEN_MARKS_ALL = clickAttachmentEventType11;
            ClickAttachmentEventType clickAttachmentEventType12 = new ClickAttachmentEventType("OPEN_MY_VIDEO", 11);
            OPEN_MY_VIDEO = clickAttachmentEventType12;
            ClickAttachmentEventType clickAttachmentEventType13 = new ClickAttachmentEventType("OPEN_PLAYLISTS", 12);
            OPEN_PLAYLISTS = clickAttachmentEventType13;
            ClickAttachmentEventType clickAttachmentEventType14 = new ClickAttachmentEventType("OPEN_DOC", 13);
            OPEN_DOC = clickAttachmentEventType14;
            ClickAttachmentEventType clickAttachmentEventType15 = new ClickAttachmentEventType("OPEN_POLL", 14);
            OPEN_POLL = clickAttachmentEventType15;
            ClickAttachmentEventType clickAttachmentEventType16 = new ClickAttachmentEventType("OPEN_PRODUCT", 15);
            OPEN_PRODUCT = clickAttachmentEventType16;
            ClickAttachmentEventType clickAttachmentEventType17 = new ClickAttachmentEventType("OPEN_PLACE", 16);
            OPEN_PLACE = clickAttachmentEventType17;
            ClickAttachmentEventType clickAttachmentEventType18 = new ClickAttachmentEventType("SELECT_PHOTO_CARD", 17);
            SELECT_PHOTO_CARD = clickAttachmentEventType18;
            ClickAttachmentEventType clickAttachmentEventType19 = new ClickAttachmentEventType("OPEN_SERVICE", 18);
            OPEN_SERVICE = clickAttachmentEventType19;
            ClickAttachmentEventType clickAttachmentEventType20 = new ClickAttachmentEventType("SELECTION_MODE_PROFILE", 19);
            SELECTION_MODE_PROFILE = clickAttachmentEventType20;
            ClickAttachmentEventType clickAttachmentEventType21 = new ClickAttachmentEventType("SELECTION_MODE_COMMUNITY", 20);
            SELECTION_MODE_COMMUNITY = clickAttachmentEventType21;
            ClickAttachmentEventType clickAttachmentEventType22 = new ClickAttachmentEventType("CLICK_TO_ARTICLE", 21);
            CLICK_TO_ARTICLE = clickAttachmentEventType22;
            ClickAttachmentEventType clickAttachmentEventType23 = new ClickAttachmentEventType("SELECT_VIDEO_CARD", 22);
            SELECT_VIDEO_CARD = clickAttachmentEventType23;
            ClickAttachmentEventType clickAttachmentEventType24 = new ClickAttachmentEventType("OPEN_PICKER", 23);
            OPEN_PICKER = clickAttachmentEventType24;
            ClickAttachmentEventType clickAttachmentEventType25 = new ClickAttachmentEventType("EXPAND_TEXT", 24);
            EXPAND_TEXT = clickAttachmentEventType25;
            ClickAttachmentEventType clickAttachmentEventType26 = new ClickAttachmentEventType("OPEN_PHOTO", 25);
            OPEN_PHOTO = clickAttachmentEventType26;
            ClickAttachmentEventType clickAttachmentEventType27 = new ClickAttachmentEventType("MUSIC_PREVIEW", 26);
            MUSIC_PREVIEW = clickAttachmentEventType27;
            ClickAttachmentEventType clickAttachmentEventType28 = new ClickAttachmentEventType("PRODUCT_PHOTO_SELECT", 27);
            PRODUCT_PHOTO_SELECT = clickAttachmentEventType28;
            ClickAttachmentEventType clickAttachmentEventType29 = new ClickAttachmentEventType("PRODUCT_PHOTO_SWIPE", 28);
            PRODUCT_PHOTO_SWIPE = clickAttachmentEventType29;
            ClickAttachmentEventType clickAttachmentEventType30 = new ClickAttachmentEventType("OPEN_ACTION_BUTTON", 29);
            OPEN_ACTION_BUTTON = clickAttachmentEventType30;
            ClickAttachmentEventType clickAttachmentEventType31 = new ClickAttachmentEventType("OPEN_FILE", 30);
            OPEN_FILE = clickAttachmentEventType31;
            ClickAttachmentEventType clickAttachmentEventType32 = new ClickAttachmentEventType("CLICK_TO_ADD_FILE", 31);
            CLICK_TO_ADD_FILE = clickAttachmentEventType32;
            ClickAttachmentEventType clickAttachmentEventType33 = new ClickAttachmentEventType("SHOW_PRODUCT_ERROR_MSG", 32);
            SHOW_PRODUCT_ERROR_MSG = clickAttachmentEventType33;
            ClickAttachmentEventType clickAttachmentEventType34 = new ClickAttachmentEventType("SHOW_MUSIC_ERROR_MSG", 33);
            SHOW_MUSIC_ERROR_MSG = clickAttachmentEventType34;
            ClickAttachmentEventType clickAttachmentEventType35 = new ClickAttachmentEventType("TRANSITION_TO_BUTTON_DETAILS", 34);
            TRANSITION_TO_BUTTON_DETAILS = clickAttachmentEventType35;
            ClickAttachmentEventType[] clickAttachmentEventTypeArr = {clickAttachmentEventType, clickAttachmentEventType2, clickAttachmentEventType3, clickAttachmentEventType4, clickAttachmentEventType5, clickAttachmentEventType6, clickAttachmentEventType7, clickAttachmentEventType8, clickAttachmentEventType9, clickAttachmentEventType10, clickAttachmentEventType11, clickAttachmentEventType12, clickAttachmentEventType13, clickAttachmentEventType14, clickAttachmentEventType15, clickAttachmentEventType16, clickAttachmentEventType17, clickAttachmentEventType18, clickAttachmentEventType19, clickAttachmentEventType20, clickAttachmentEventType21, clickAttachmentEventType22, clickAttachmentEventType23, clickAttachmentEventType24, clickAttachmentEventType25, clickAttachmentEventType26, clickAttachmentEventType27, clickAttachmentEventType28, clickAttachmentEventType29, clickAttachmentEventType30, clickAttachmentEventType31, clickAttachmentEventType32, clickAttachmentEventType33, clickAttachmentEventType34, clickAttachmentEventType35};
            $VALUES = clickAttachmentEventTypeArr;
            $ENTRIES = new asp(clickAttachmentEventTypeArr);
        }

        private ClickAttachmentEventType(String str, int i) {
        }

        public static ClickAttachmentEventType valueOf(String str) {
            return (ClickAttachmentEventType) Enum.valueOf(ClickAttachmentEventType.class, str);
        }

        public static ClickAttachmentEventType[] values() {
            return (ClickAttachmentEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPostingStat$ClickAttachmentEvent() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$ClickAttachmentEvent)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$ClickAttachmentEvent mobileOfficialAppsConPostingStat$ClickAttachmentEvent = (MobileOfficialAppsConPostingStat$ClickAttachmentEvent) obj;
        return this.clickAttachmentEventType == mobileOfficialAppsConPostingStat$ClickAttachmentEvent.clickAttachmentEventType && epx.f(this.vkTicket, mobileOfficialAppsConPostingStat$ClickAttachmentEvent.vkTicket) && epx.f(this.attachmentsInfo, mobileOfficialAppsConPostingStat$ClickAttachmentEvent.attachmentsInfo);
    }

    public final int hashCode() {
        ClickAttachmentEventType clickAttachmentEventType = this.clickAttachmentEventType;
        int hashCode = (clickAttachmentEventType == null ? 0 : clickAttachmentEventType.hashCode()) * 31;
        MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket = this.vkTicket;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPostingStat$VkTicket == null ? 0 : mobileOfficialAppsConPostingStat$VkTicket.hashCode())) * 31;
        List<MobileOfficialAppsConPostingStat$AttachmentInfo> list = this.attachmentsInfo;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickAttachmentEvent(clickAttachmentEventType=");
        sb.append(this.clickAttachmentEventType);
        sb.append(", vkTicket=");
        sb.append(this.vkTicket);
        sb.append(", attachmentsInfo=");
        return ms9.a(')', sb, this.attachmentsInfo);
    }

    public MobileOfficialAppsConPostingStat$ClickAttachmentEvent(ClickAttachmentEventType clickAttachmentEventType, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket, List<MobileOfficialAppsConPostingStat$AttachmentInfo> list) {
        this.clickAttachmentEventType = clickAttachmentEventType;
        this.vkTicket = mobileOfficialAppsConPostingStat$VkTicket;
        this.attachmentsInfo = list;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$ClickAttachmentEvent(ClickAttachmentEventType clickAttachmentEventType, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : clickAttachmentEventType, (i & 2) != 0 ? null : mobileOfficialAppsConPostingStat$VkTicket, (i & 4) != 0 ? null : list);
    }
}
