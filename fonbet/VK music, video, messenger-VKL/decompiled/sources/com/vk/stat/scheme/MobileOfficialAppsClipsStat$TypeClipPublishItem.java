package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipPublishItem implements SchemeStat$TypeAction.b {

    @pmi0("cancel_publish")
    private final MobileOfficialAppsClipsStat$CancelPublish cancelPublish;

    @pmi0("change_author")
    private final MobileOfficialAppsClipsStat$ChangeAuthor changeAuthor;

    @pmi0("change_preview")
    private final MobileOfficialAppsClipsStat$ChangePreview changePreview;

    @pmi0("change_story")
    private final MobileOfficialAppsClipsStat$ChangeStory changeStory;

    @pmi0("change_video_attachment")
    private final MobileOfficialAppsClipsStat$ChangeVideoAttachment changeVideoAttachment;

    @pmi0("clips_create_context")
    private final MobileOfficialAppsClipsStat$ClipsCreateContext clipsCreateContext;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("filters")
    private final List<String> filters;

    @pmi0("market_items")
    private final List<MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem> marketItems;

    @pmi0("type_clip_preview")
    private final MobileOfficialAppsClipsStat$TypeClipPreview typeClipPreview;

    @pmi0("upload_item")
    private final MobileOfficialAppsClipsStat$TypeClipUploadItem uploadItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("cancel_publish")
        public static final EventType CANCEL_PUBLISH;

        @pmi0("change_author")
        public static final EventType CHANGE_AUTHOR;

        @pmi0("change_preview")
        public static final EventType CHANGE_PREVIEW;

        @pmi0("change_story")
        public static final EventType CHANGE_STORY;

        @pmi0("change_video_attachment")
        public static final EventType CHANGE_VIDEO_ATTACHMENT;

        @pmi0("deepfake_templates_apply")
        public static final EventType DEEPFAKE_TEMPLATES_APPLY;

        @pmi0("enter_drafts")
        public static final EventType ENTER_DRAFTS;

        @pmi0("enter_template")
        public static final EventType ENTER_TEMPLATE;

        @pmi0("enter_trends")
        public static final EventType ENTER_TRENDS;

        @pmi0("open_product")
        public static final EventType OPEN_PRODUCT;

        @pmi0("product_select")
        public static final EventType PRODUCT_SELECT;

        @pmi0("select_hashtag_trend_hint")
        public static final EventType SELECT_HASHTAG_TREND_HINT;

        @pmi0("type_clip_preview")
        public static final EventType TYPE_CLIP_PREVIEW;

        static {
            EventType eventType = new EventType("DEEPFAKE_TEMPLATES_APPLY", 0);
            DEEPFAKE_TEMPLATES_APPLY = eventType;
            EventType eventType2 = new EventType("CANCEL_PUBLISH", 1);
            CANCEL_PUBLISH = eventType2;
            EventType eventType3 = new EventType("CHANGE_AUTHOR", 2);
            CHANGE_AUTHOR = eventType3;
            EventType eventType4 = new EventType("CHANGE_PREVIEW", 3);
            CHANGE_PREVIEW = eventType4;
            EventType eventType5 = new EventType("CHANGE_VIDEO_ATTACHMENT", 4);
            CHANGE_VIDEO_ATTACHMENT = eventType5;
            EventType eventType6 = new EventType("TYPE_CLIP_PREVIEW", 5);
            TYPE_CLIP_PREVIEW = eventType6;
            EventType eventType7 = new EventType("SELECT_HASHTAG_TREND_HINT", 6);
            SELECT_HASHTAG_TREND_HINT = eventType7;
            EventType eventType8 = new EventType("CHANGE_STORY", 7);
            CHANGE_STORY = eventType8;
            EventType eventType9 = new EventType("ENTER_TEMPLATE", 8);
            ENTER_TEMPLATE = eventType9;
            EventType eventType10 = new EventType("ENTER_TRENDS", 9);
            ENTER_TRENDS = eventType10;
            EventType eventType11 = new EventType("ENTER_DRAFTS", 10);
            ENTER_DRAFTS = eventType11;
            EventType eventType12 = new EventType("OPEN_PRODUCT", 11);
            OPEN_PRODUCT = eventType12;
            EventType eventType13 = new EventType("PRODUCT_SELECT", 12);
            PRODUCT_SELECT = eventType13;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsClipsStat$TypeClipPublishItem(EventType eventType, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$ChangeStory mobileOfficialAppsClipsStat$ChangeStory, MobileOfficialAppsClipsStat$CancelPublish mobileOfficialAppsClipsStat$CancelPublish, MobileOfficialAppsClipsStat$ChangePreview mobileOfficialAppsClipsStat$ChangePreview, List<String> list, MobileOfficialAppsClipsStat$ChangeAuthor mobileOfficialAppsClipsStat$ChangeAuthor, MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem, MobileOfficialAppsClipsStat$ChangeVideoAttachment mobileOfficialAppsClipsStat$ChangeVideoAttachment, MobileOfficialAppsClipsStat$TypeClipPreview mobileOfficialAppsClipsStat$TypeClipPreview, List<MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem> list2) {
        this.eventType = eventType;
        this.clipsCreateContext = mobileOfficialAppsClipsStat$ClipsCreateContext;
        this.changeStory = mobileOfficialAppsClipsStat$ChangeStory;
        this.cancelPublish = mobileOfficialAppsClipsStat$CancelPublish;
        this.changePreview = mobileOfficialAppsClipsStat$ChangePreview;
        this.filters = list;
        this.changeAuthor = mobileOfficialAppsClipsStat$ChangeAuthor;
        this.uploadItem = mobileOfficialAppsClipsStat$TypeClipUploadItem;
        this.changeVideoAttachment = mobileOfficialAppsClipsStat$ChangeVideoAttachment;
        this.typeClipPreview = mobileOfficialAppsClipsStat$TypeClipPreview;
        this.marketItems = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipPublishItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipPublishItem mobileOfficialAppsClipsStat$TypeClipPublishItem = (MobileOfficialAppsClipsStat$TypeClipPublishItem) obj;
        return this.eventType == mobileOfficialAppsClipsStat$TypeClipPublishItem.eventType && epx.f(this.clipsCreateContext, mobileOfficialAppsClipsStat$TypeClipPublishItem.clipsCreateContext) && epx.f(this.changeStory, mobileOfficialAppsClipsStat$TypeClipPublishItem.changeStory) && epx.f(this.cancelPublish, mobileOfficialAppsClipsStat$TypeClipPublishItem.cancelPublish) && epx.f(this.changePreview, mobileOfficialAppsClipsStat$TypeClipPublishItem.changePreview) && epx.f(this.filters, mobileOfficialAppsClipsStat$TypeClipPublishItem.filters) && epx.f(this.changeAuthor, mobileOfficialAppsClipsStat$TypeClipPublishItem.changeAuthor) && epx.f(this.uploadItem, mobileOfficialAppsClipsStat$TypeClipPublishItem.uploadItem) && epx.f(this.changeVideoAttachment, mobileOfficialAppsClipsStat$TypeClipPublishItem.changeVideoAttachment) && epx.f(this.typeClipPreview, mobileOfficialAppsClipsStat$TypeClipPublishItem.typeClipPreview) && epx.f(this.marketItems, mobileOfficialAppsClipsStat$TypeClipPublishItem.marketItems);
    }

    public final int hashCode() {
        int hashCode = (this.clipsCreateContext.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        MobileOfficialAppsClipsStat$ChangeStory mobileOfficialAppsClipsStat$ChangeStory = this.changeStory;
        int hashCode2 = (hashCode + (mobileOfficialAppsClipsStat$ChangeStory == null ? 0 : mobileOfficialAppsClipsStat$ChangeStory.hashCode())) * 31;
        MobileOfficialAppsClipsStat$CancelPublish mobileOfficialAppsClipsStat$CancelPublish = this.cancelPublish;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsClipsStat$CancelPublish == null ? 0 : mobileOfficialAppsClipsStat$CancelPublish.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ChangePreview mobileOfficialAppsClipsStat$ChangePreview = this.changePreview;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsClipsStat$ChangePreview == null ? 0 : mobileOfficialAppsClipsStat$ChangePreview.hashCode())) * 31;
        List<String> list = this.filters;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ChangeAuthor mobileOfficialAppsClipsStat$ChangeAuthor = this.changeAuthor;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsClipsStat$ChangeAuthor == null ? 0 : mobileOfficialAppsClipsStat$ChangeAuthor.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem = this.uploadItem;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsClipsStat$TypeClipUploadItem == null ? 0 : mobileOfficialAppsClipsStat$TypeClipUploadItem.hashCode())) * 31;
        MobileOfficialAppsClipsStat$ChangeVideoAttachment mobileOfficialAppsClipsStat$ChangeVideoAttachment = this.changeVideoAttachment;
        int hashCode8 = (hashCode7 + (mobileOfficialAppsClipsStat$ChangeVideoAttachment == null ? 0 : mobileOfficialAppsClipsStat$ChangeVideoAttachment.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeClipPreview mobileOfficialAppsClipsStat$TypeClipPreview = this.typeClipPreview;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsClipsStat$TypeClipPreview == null ? 0 : mobileOfficialAppsClipsStat$TypeClipPreview.hashCode())) * 31;
        List<MobileOfficialAppsClipsStat$ClipUploadClickableStickerItem> list2 = this.marketItems;
        return hashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipPublishItem(eventType=");
        sb.append(this.eventType);
        sb.append(", clipsCreateContext=");
        sb.append(this.clipsCreateContext);
        sb.append(", changeStory=");
        sb.append(this.changeStory);
        sb.append(", cancelPublish=");
        sb.append(this.cancelPublish);
        sb.append(", changePreview=");
        sb.append(this.changePreview);
        sb.append(", filters=");
        sb.append(this.filters);
        sb.append(", changeAuthor=");
        sb.append(this.changeAuthor);
        sb.append(", uploadItem=");
        sb.append(this.uploadItem);
        sb.append(", changeVideoAttachment=");
        sb.append(this.changeVideoAttachment);
        sb.append(", typeClipPreview=");
        sb.append(this.typeClipPreview);
        sb.append(", marketItems=");
        return ms9.a(')', sb, this.marketItems);
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipPublishItem(EventType eventType, MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, MobileOfficialAppsClipsStat$ChangeStory mobileOfficialAppsClipsStat$ChangeStory, MobileOfficialAppsClipsStat$CancelPublish mobileOfficialAppsClipsStat$CancelPublish, MobileOfficialAppsClipsStat$ChangePreview mobileOfficialAppsClipsStat$ChangePreview, List list, MobileOfficialAppsClipsStat$ChangeAuthor mobileOfficialAppsClipsStat$ChangeAuthor, MobileOfficialAppsClipsStat$TypeClipUploadItem mobileOfficialAppsClipsStat$TypeClipUploadItem, MobileOfficialAppsClipsStat$ChangeVideoAttachment mobileOfficialAppsClipsStat$ChangeVideoAttachment, MobileOfficialAppsClipsStat$TypeClipPreview mobileOfficialAppsClipsStat$TypeClipPreview, List list2, int i, zcl zclVar) {
        this(eventType, mobileOfficialAppsClipsStat$ClipsCreateContext, (i & 4) != 0 ? null : mobileOfficialAppsClipsStat$ChangeStory, (i & 8) != 0 ? null : mobileOfficialAppsClipsStat$CancelPublish, (i & 16) != 0 ? null : mobileOfficialAppsClipsStat$ChangePreview, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : mobileOfficialAppsClipsStat$ChangeAuthor, (i & 128) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipUploadItem, (i & 256) != 0 ? null : mobileOfficialAppsClipsStat$ChangeVideoAttachment, (i & 512) != 0 ? null : mobileOfficialAppsClipsStat$TypeClipPreview, (i & 1024) != 0 ? null : list2);
    }
}
