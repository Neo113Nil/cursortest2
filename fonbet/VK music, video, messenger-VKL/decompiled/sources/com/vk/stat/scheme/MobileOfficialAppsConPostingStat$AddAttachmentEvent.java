package com.vk.stat.scheme;

import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$AddAttachmentEvent {

    @pmi0("add_attachment_event_type")
    private final AddAttachmentEventType addAttachmentEventType;

    @pmi0("attachments_info")
    private final List<MobileOfficialAppsConPostingStat$AttachmentInfo> attachmentsInfo;

    @pmi0("photo_additional_info")
    private final MobileOfficialAppsConPostingStat$PhotoAdditionalInfo photoAdditionalInfo;

    @pmi0("vk_ticket")
    private final MobileOfficialAppsConPostingStat$VkTicket vkTicket;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class AddAttachmentEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AddAttachmentEventType[] $VALUES;

        @pmi0("attach_action_button")
        public static final AddAttachmentEventType ATTACH_ACTION_BUTTON;

        @pmi0("attach_album")
        public static final AddAttachmentEventType ATTACH_ALBUM;

        @pmi0("attach_article")
        public static final AddAttachmentEventType ATTACH_ARTICLE;

        @pmi0("attach_clip")
        public static final AddAttachmentEventType ATTACH_CLIP;

        @pmi0("attach_doc")
        public static final AddAttachmentEventType ATTACH_DOC;

        @pmi0("attach_file")
        public static final AddAttachmentEventType ATTACH_FILE;

        @pmi0("attach_link")
        public static final AddAttachmentEventType ATTACH_LINK;

        @pmi0("attach_market_link")
        public static final AddAttachmentEventType ATTACH_MARKET_LINK;

        @pmi0("attach_message_to_bc")
        public static final AddAttachmentEventType ATTACH_MESSAGE_TO_BC;

        @pmi0("attach_music")
        public static final AddAttachmentEventType ATTACH_MUSIC;

        @pmi0("attach_my_photo")
        public static final AddAttachmentEventType ATTACH_MY_PHOTO;

        @pmi0("attach_my_video")
        public static final AddAttachmentEventType ATTACH_MY_VIDEO;

        @pmi0("attach_online_booking")
        public static final AddAttachmentEventType ATTACH_ONLINE_BOOKING;

        @pmi0("attach_photo")
        public static final AddAttachmentEventType ATTACH_PHOTO;

        @pmi0("attach_place")
        public static final AddAttachmentEventType ATTACH_PLACE;

        @pmi0("attach_place_recom")
        public static final AddAttachmentEventType ATTACH_PLACE_RECOM;

        @pmi0("attach_playlists")
        public static final AddAttachmentEventType ATTACH_PLAYLISTS;

        @pmi0("attach_poll")
        public static final AddAttachmentEventType ATTACH_POLL;

        @pmi0("attach_product")
        public static final AddAttachmentEventType ATTACH_PRODUCT;

        @pmi0("attach_stereo_room")
        public static final AddAttachmentEventType ATTACH_STEREO_ROOM;

        @pmi0("attach_video")
        public static final AddAttachmentEventType ATTACH_VIDEO;

        @pmi0("delete_action_button")
        public static final AddAttachmentEventType DELETE_ACTION_BUTTON;

        @pmi0("delete_attach")
        public static final AddAttachmentEventType DELETE_ATTACH;

        @pmi0("delete_attach_album")
        public static final AddAttachmentEventType DELETE_ATTACH_ALBUM;

        @pmi0("delete_attach_file")
        public static final AddAttachmentEventType DELETE_ATTACH_FILE;

        @pmi0("delete_attach_music")
        public static final AddAttachmentEventType DELETE_ATTACH_MUSIC;

        @pmi0("delete_attach_my_photo")
        public static final AddAttachmentEventType DELETE_ATTACH_MY_PHOTO;

        @pmi0("delete_attach_my_video")
        public static final AddAttachmentEventType DELETE_ATTACH_MY_VIDEO;

        @pmi0("delete_attach_photo")
        public static final AddAttachmentEventType DELETE_ATTACH_PHOTO;

        @pmi0("delete_attach_place")
        public static final AddAttachmentEventType DELETE_ATTACH_PLACE;

        @pmi0("delete_attach_poll")
        public static final AddAttachmentEventType DELETE_ATTACH_POLL;

        @pmi0("delete_attach_video")
        public static final AddAttachmentEventType DELETE_ATTACH_VIDEO;

        @pmi0("product_delete")
        public static final AddAttachmentEventType PRODUCT_DELETE;

        @pmi0("product_select")
        public static final AddAttachmentEventType PRODUCT_SELECT;

        @pmi0("remember_for_future_posts_attach")
        public static final AddAttachmentEventType REMEMBER_FOR_FUTURE_POSTS_ATTACH;

        @pmi0("remember_for_future_posts_delete")
        public static final AddAttachmentEventType REMEMBER_FOR_FUTURE_POSTS_DELETE;

        @pmi0("retry_upload_album")
        public static final AddAttachmentEventType RETRY_UPLOAD_ALBUM;

        @pmi0("retry_upload_clip")
        public static final AddAttachmentEventType RETRY_UPLOAD_CLIP;

        @pmi0("retry_upload_photo")
        public static final AddAttachmentEventType RETRY_UPLOAD_PHOTO;

        @pmi0("retry_upload_video")
        public static final AddAttachmentEventType RETRY_UPLOAD_VIDEO;

        static {
            AddAttachmentEventType addAttachmentEventType = new AddAttachmentEventType("DELETE_ATTACH", 0);
            DELETE_ATTACH = addAttachmentEventType;
            AddAttachmentEventType addAttachmentEventType2 = new AddAttachmentEventType("ATTACH_PHOTO", 1);
            ATTACH_PHOTO = addAttachmentEventType2;
            AddAttachmentEventType addAttachmentEventType3 = new AddAttachmentEventType("ATTACH_VIDEO", 2);
            ATTACH_VIDEO = addAttachmentEventType3;
            AddAttachmentEventType addAttachmentEventType4 = new AddAttachmentEventType("ATTACH_MUSIC", 3);
            ATTACH_MUSIC = addAttachmentEventType4;
            AddAttachmentEventType addAttachmentEventType5 = new AddAttachmentEventType("ATTACH_MY_PHOTO", 4);
            ATTACH_MY_PHOTO = addAttachmentEventType5;
            AddAttachmentEventType addAttachmentEventType6 = new AddAttachmentEventType("ATTACH_MY_VIDEO", 5);
            ATTACH_MY_VIDEO = addAttachmentEventType6;
            AddAttachmentEventType addAttachmentEventType7 = new AddAttachmentEventType("ATTACH_PLAYLISTS", 6);
            ATTACH_PLAYLISTS = addAttachmentEventType7;
            AddAttachmentEventType addAttachmentEventType8 = new AddAttachmentEventType("ATTACH_DOC", 7);
            ATTACH_DOC = addAttachmentEventType8;
            AddAttachmentEventType addAttachmentEventType9 = new AddAttachmentEventType("ATTACH_POLL", 8);
            ATTACH_POLL = addAttachmentEventType9;
            AddAttachmentEventType addAttachmentEventType10 = new AddAttachmentEventType("ATTACH_PRODUCT", 9);
            ATTACH_PRODUCT = addAttachmentEventType10;
            AddAttachmentEventType addAttachmentEventType11 = new AddAttachmentEventType("ATTACH_ALBUM", 10);
            ATTACH_ALBUM = addAttachmentEventType11;
            AddAttachmentEventType addAttachmentEventType12 = new AddAttachmentEventType("ATTACH_ARTICLE", 11);
            ATTACH_ARTICLE = addAttachmentEventType12;
            AddAttachmentEventType addAttachmentEventType13 = new AddAttachmentEventType("ATTACH_PLACE", 12);
            ATTACH_PLACE = addAttachmentEventType13;
            AddAttachmentEventType addAttachmentEventType14 = new AddAttachmentEventType("ATTACH_LINK", 13);
            ATTACH_LINK = addAttachmentEventType14;
            AddAttachmentEventType addAttachmentEventType15 = new AddAttachmentEventType("ATTACH_STEREO_ROOM", 14);
            ATTACH_STEREO_ROOM = addAttachmentEventType15;
            AddAttachmentEventType addAttachmentEventType16 = new AddAttachmentEventType("ATTACH_ONLINE_BOOKING", 15);
            ATTACH_ONLINE_BOOKING = addAttachmentEventType16;
            AddAttachmentEventType addAttachmentEventType17 = new AddAttachmentEventType("ATTACH_MARKET_LINK", 16);
            ATTACH_MARKET_LINK = addAttachmentEventType17;
            AddAttachmentEventType addAttachmentEventType18 = new AddAttachmentEventType("ATTACH_MESSAGE_TO_BC", 17);
            ATTACH_MESSAGE_TO_BC = addAttachmentEventType18;
            AddAttachmentEventType addAttachmentEventType19 = new AddAttachmentEventType("ATTACH_CLIP", 18);
            ATTACH_CLIP = addAttachmentEventType19;
            AddAttachmentEventType addAttachmentEventType20 = new AddAttachmentEventType("ATTACH_ACTION_BUTTON", 19);
            ATTACH_ACTION_BUTTON = addAttachmentEventType20;
            AddAttachmentEventType addAttachmentEventType21 = new AddAttachmentEventType("DELETE_ACTION_BUTTON", 20);
            DELETE_ACTION_BUTTON = addAttachmentEventType21;
            AddAttachmentEventType addAttachmentEventType22 = new AddAttachmentEventType("REMEMBER_FOR_FUTURE_POSTS_ATTACH", 21);
            REMEMBER_FOR_FUTURE_POSTS_ATTACH = addAttachmentEventType22;
            AddAttachmentEventType addAttachmentEventType23 = new AddAttachmentEventType("REMEMBER_FOR_FUTURE_POSTS_DELETE", 22);
            REMEMBER_FOR_FUTURE_POSTS_DELETE = addAttachmentEventType23;
            AddAttachmentEventType addAttachmentEventType24 = new AddAttachmentEventType("RETRY_UPLOAD_PHOTO", 23);
            RETRY_UPLOAD_PHOTO = addAttachmentEventType24;
            AddAttachmentEventType addAttachmentEventType25 = new AddAttachmentEventType("RETRY_UPLOAD_VIDEO", 24);
            RETRY_UPLOAD_VIDEO = addAttachmentEventType25;
            AddAttachmentEventType addAttachmentEventType26 = new AddAttachmentEventType("RETRY_UPLOAD_ALBUM", 25);
            RETRY_UPLOAD_ALBUM = addAttachmentEventType26;
            AddAttachmentEventType addAttachmentEventType27 = new AddAttachmentEventType("RETRY_UPLOAD_CLIP", 26);
            RETRY_UPLOAD_CLIP = addAttachmentEventType27;
            AddAttachmentEventType addAttachmentEventType28 = new AddAttachmentEventType("DELETE_ATTACH_PHOTO", 27);
            DELETE_ATTACH_PHOTO = addAttachmentEventType28;
            AddAttachmentEventType addAttachmentEventType29 = new AddAttachmentEventType("DELETE_ATTACH_ALBUM", 28);
            DELETE_ATTACH_ALBUM = addAttachmentEventType29;
            AddAttachmentEventType addAttachmentEventType30 = new AddAttachmentEventType("DELETE_ATTACH_MY_VIDEO", 29);
            DELETE_ATTACH_MY_VIDEO = addAttachmentEventType30;
            AddAttachmentEventType addAttachmentEventType31 = new AddAttachmentEventType("ATTACH_PLACE_RECOM", 30);
            ATTACH_PLACE_RECOM = addAttachmentEventType31;
            AddAttachmentEventType addAttachmentEventType32 = new AddAttachmentEventType("DELETE_ATTACH_PLACE", 31);
            DELETE_ATTACH_PLACE = addAttachmentEventType32;
            AddAttachmentEventType addAttachmentEventType33 = new AddAttachmentEventType("DELETE_ATTACH_MUSIC", 32);
            DELETE_ATTACH_MUSIC = addAttachmentEventType33;
            AddAttachmentEventType addAttachmentEventType34 = new AddAttachmentEventType("DELETE_ATTACH_POLL", 33);
            DELETE_ATTACH_POLL = addAttachmentEventType34;
            AddAttachmentEventType addAttachmentEventType35 = new AddAttachmentEventType("PRODUCT_SELECT", 34);
            PRODUCT_SELECT = addAttachmentEventType35;
            AddAttachmentEventType addAttachmentEventType36 = new AddAttachmentEventType("PRODUCT_DELETE", 35);
            PRODUCT_DELETE = addAttachmentEventType36;
            AddAttachmentEventType addAttachmentEventType37 = new AddAttachmentEventType("ATTACH_FILE", 36);
            ATTACH_FILE = addAttachmentEventType37;
            AddAttachmentEventType addAttachmentEventType38 = new AddAttachmentEventType("DELETE_ATTACH_FILE", 37);
            DELETE_ATTACH_FILE = addAttachmentEventType38;
            AddAttachmentEventType addAttachmentEventType39 = new AddAttachmentEventType("DELETE_ATTACH_VIDEO", 38);
            DELETE_ATTACH_VIDEO = addAttachmentEventType39;
            AddAttachmentEventType addAttachmentEventType40 = new AddAttachmentEventType("DELETE_ATTACH_MY_PHOTO", 39);
            DELETE_ATTACH_MY_PHOTO = addAttachmentEventType40;
            AddAttachmentEventType[] addAttachmentEventTypeArr = {addAttachmentEventType, addAttachmentEventType2, addAttachmentEventType3, addAttachmentEventType4, addAttachmentEventType5, addAttachmentEventType6, addAttachmentEventType7, addAttachmentEventType8, addAttachmentEventType9, addAttachmentEventType10, addAttachmentEventType11, addAttachmentEventType12, addAttachmentEventType13, addAttachmentEventType14, addAttachmentEventType15, addAttachmentEventType16, addAttachmentEventType17, addAttachmentEventType18, addAttachmentEventType19, addAttachmentEventType20, addAttachmentEventType21, addAttachmentEventType22, addAttachmentEventType23, addAttachmentEventType24, addAttachmentEventType25, addAttachmentEventType26, addAttachmentEventType27, addAttachmentEventType28, addAttachmentEventType29, addAttachmentEventType30, addAttachmentEventType31, addAttachmentEventType32, addAttachmentEventType33, addAttachmentEventType34, addAttachmentEventType35, addAttachmentEventType36, addAttachmentEventType37, addAttachmentEventType38, addAttachmentEventType39, addAttachmentEventType40};
            $VALUES = addAttachmentEventTypeArr;
            $ENTRIES = new asp(addAttachmentEventTypeArr);
        }

        private AddAttachmentEventType(String str, int i) {
        }

        public static AddAttachmentEventType valueOf(String str) {
            return (AddAttachmentEventType) Enum.valueOf(AddAttachmentEventType.class, str);
        }

        public static AddAttachmentEventType[] values() {
            return (AddAttachmentEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConPostingStat$AddAttachmentEvent() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$AddAttachmentEvent)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$AddAttachmentEvent mobileOfficialAppsConPostingStat$AddAttachmentEvent = (MobileOfficialAppsConPostingStat$AddAttachmentEvent) obj;
        return this.addAttachmentEventType == mobileOfficialAppsConPostingStat$AddAttachmentEvent.addAttachmentEventType && epx.f(this.vkTicket, mobileOfficialAppsConPostingStat$AddAttachmentEvent.vkTicket) && epx.f(this.attachmentsInfo, mobileOfficialAppsConPostingStat$AddAttachmentEvent.attachmentsInfo) && epx.f(this.photoAdditionalInfo, mobileOfficialAppsConPostingStat$AddAttachmentEvent.photoAdditionalInfo);
    }

    public final int hashCode() {
        AddAttachmentEventType addAttachmentEventType = this.addAttachmentEventType;
        int hashCode = (addAttachmentEventType == null ? 0 : addAttachmentEventType.hashCode()) * 31;
        MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket = this.vkTicket;
        int hashCode2 = (hashCode + (mobileOfficialAppsConPostingStat$VkTicket == null ? 0 : mobileOfficialAppsConPostingStat$VkTicket.hashCode())) * 31;
        List<MobileOfficialAppsConPostingStat$AttachmentInfo> list = this.attachmentsInfo;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo = this.photoAdditionalInfo;
        return hashCode3 + (mobileOfficialAppsConPostingStat$PhotoAdditionalInfo != null ? mobileOfficialAppsConPostingStat$PhotoAdditionalInfo.hashCode() : 0);
    }

    public final String toString() {
        return "AddAttachmentEvent(addAttachmentEventType=" + this.addAttachmentEventType + ", vkTicket=" + this.vkTicket + ", attachmentsInfo=" + this.attachmentsInfo + ", photoAdditionalInfo=" + this.photoAdditionalInfo + ')';
    }

    public MobileOfficialAppsConPostingStat$AddAttachmentEvent(AddAttachmentEventType addAttachmentEventType, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket, List<MobileOfficialAppsConPostingStat$AttachmentInfo> list, MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo) {
        this.addAttachmentEventType = addAttachmentEventType;
        this.vkTicket = mobileOfficialAppsConPostingStat$VkTicket;
        this.attachmentsInfo = list;
        this.photoAdditionalInfo = mobileOfficialAppsConPostingStat$PhotoAdditionalInfo;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$AddAttachmentEvent(AddAttachmentEventType addAttachmentEventType, MobileOfficialAppsConPostingStat$VkTicket mobileOfficialAppsConPostingStat$VkTicket, List list, MobileOfficialAppsConPostingStat$PhotoAdditionalInfo mobileOfficialAppsConPostingStat$PhotoAdditionalInfo, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : addAttachmentEventType, (i & 2) != 0 ? null : mobileOfficialAppsConPostingStat$VkTicket, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : mobileOfficialAppsConPostingStat$PhotoAdditionalInfo);
    }
}
