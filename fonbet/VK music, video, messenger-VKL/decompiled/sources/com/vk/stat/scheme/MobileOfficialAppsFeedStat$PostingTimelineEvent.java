package com.vk.stat.scheme;

import com.vungle.ads.internal.protos.Sdk;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$PostingTimelineEvent {

    @pmi0("error")
    private final MobileOfficialAppsFeedStat$PostingError error;

    @pmi0("file_uploading")
    private final MobileOfficialAppsFeedStat$PostingFileUploading fileUploading;

    @pmi0("file_uploading_error")
    private final MobileOfficialAppsFeedStat$PostingFileUploadingError fileUploadingError;

    @pmi0("picker_attachment_attaching")
    private final MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching pickerAttachmentAttaching;

    @pmi0("picker_opening")
    private final MobileOfficialAppsFeedStat$PostingPickerOpening pickerOpening;

    @pmi0("post_publishing_error")
    private final MobileOfficialAppsFeedStat$PostingPostPublishingError postPublishingError;

    @pmi0("post_publishing_time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange postPublishingTimeRange;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("error")
        public static final Type ERROR;

        @pmi0("file_uploading")
        public static final Type FILE_UPLOADING;

        @pmi0("file_uploading_error")
        public static final Type FILE_UPLOADING_ERROR;

        @pmi0("picker_attachment_attaching")
        public static final Type PICKER_ATTACHMENT_ATTACHING;

        @pmi0("picker_opening")
        public static final Type PICKER_OPENING;

        @pmi0("post_publishing_error")
        public static final Type POST_PUBLISHING_ERROR;

        @pmi0("post_publishing_time_range")
        public static final Type POST_PUBLISHING_TIME_RANGE;

        static {
            Type type = new Type("FILE_UPLOADING", 0);
            FILE_UPLOADING = type;
            Type type2 = new Type("FILE_UPLOADING_ERROR", 1);
            FILE_UPLOADING_ERROR = type2;
            Type type3 = new Type("PICKER_OPENING", 2);
            PICKER_OPENING = type3;
            Type type4 = new Type("PICKER_ATTACHMENT_ATTACHING", 3);
            PICKER_ATTACHMENT_ATTACHING = type4;
            Type type5 = new Type("POST_PUBLISHING_TIME_RANGE", 4);
            POST_PUBLISHING_TIME_RANGE = type5;
            Type type6 = new Type("POST_PUBLISHING_ERROR", 5);
            POST_PUBLISHING_ERROR = type6;
            Type type7 = new Type("ERROR", 6);
            ERROR = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class a {
        public static MobileOfficialAppsFeedStat$PostingTimelineEvent a(b bVar) {
            if (bVar instanceof MobileOfficialAppsFeedStat$PostingFileUploading) {
                return new MobileOfficialAppsFeedStat$PostingTimelineEvent(Type.FILE_UPLOADING, (MobileOfficialAppsFeedStat$PostingFileUploading) bVar, null, null, null, null, null, null, 252, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$PostingFileUploadingError) {
                return new MobileOfficialAppsFeedStat$PostingTimelineEvent(Type.FILE_UPLOADING_ERROR, null, (MobileOfficialAppsFeedStat$PostingFileUploadingError) bVar, null, null, null, null, null, 250, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$PostingPickerOpening) {
                return new MobileOfficialAppsFeedStat$PostingTimelineEvent(Type.PICKER_OPENING, null, null, (MobileOfficialAppsFeedStat$PostingPickerOpening) bVar, null, null, null, null, 246, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching) {
                return new MobileOfficialAppsFeedStat$PostingTimelineEvent(Type.PICKER_ATTACHMENT_ATTACHING, null, null, null, (MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching) bVar, null, null, null, 238, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$FeedTimeRange) {
                return new MobileOfficialAppsFeedStat$PostingTimelineEvent(Type.POST_PUBLISHING_TIME_RANGE, null, null, null, null, (MobileOfficialAppsFeedStat$FeedTimeRange) bVar, null, null, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, null);
            }
            if (bVar instanceof MobileOfficialAppsFeedStat$PostingPostPublishingError) {
                return new MobileOfficialAppsFeedStat$PostingTimelineEvent(Type.POST_PUBLISHING_ERROR, null, null, null, null, null, (MobileOfficialAppsFeedStat$PostingPostPublishingError) bVar, null, 190, null);
            }
            if (!(bVar instanceof MobileOfficialAppsFeedStat$PostingError)) {
                throw new IllegalArgumentException("payload must be one of(PostingFileUploading, PostingFileUploadingError, PostingPickerOpening, PostingPickerAttachmentAttaching, FeedTimeRange, PostingPostPublishingError, PostingError)");
            }
            return new MobileOfficialAppsFeedStat$PostingTimelineEvent(Type.ERROR, null, null, null, null, null, null, (MobileOfficialAppsFeedStat$PostingError) bVar, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
        }
    }

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public interface b {
    }

    private MobileOfficialAppsFeedStat$PostingTimelineEvent(Type type, MobileOfficialAppsFeedStat$PostingFileUploading mobileOfficialAppsFeedStat$PostingFileUploading, MobileOfficialAppsFeedStat$PostingFileUploadingError mobileOfficialAppsFeedStat$PostingFileUploadingError, MobileOfficialAppsFeedStat$PostingPickerOpening mobileOfficialAppsFeedStat$PostingPickerOpening, MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching mobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching, MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, MobileOfficialAppsFeedStat$PostingPostPublishingError mobileOfficialAppsFeedStat$PostingPostPublishingError, MobileOfficialAppsFeedStat$PostingError mobileOfficialAppsFeedStat$PostingError) {
        this.type = type;
        this.fileUploading = mobileOfficialAppsFeedStat$PostingFileUploading;
        this.fileUploadingError = mobileOfficialAppsFeedStat$PostingFileUploadingError;
        this.pickerOpening = mobileOfficialAppsFeedStat$PostingPickerOpening;
        this.pickerAttachmentAttaching = mobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching;
        this.postPublishingTimeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.postPublishingError = mobileOfficialAppsFeedStat$PostingPostPublishingError;
        this.error = mobileOfficialAppsFeedStat$PostingError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$PostingTimelineEvent)) {
            return false;
        }
        MobileOfficialAppsFeedStat$PostingTimelineEvent mobileOfficialAppsFeedStat$PostingTimelineEvent = (MobileOfficialAppsFeedStat$PostingTimelineEvent) obj;
        return this.type == mobileOfficialAppsFeedStat$PostingTimelineEvent.type && epx.f(this.fileUploading, mobileOfficialAppsFeedStat$PostingTimelineEvent.fileUploading) && epx.f(this.fileUploadingError, mobileOfficialAppsFeedStat$PostingTimelineEvent.fileUploadingError) && epx.f(this.pickerOpening, mobileOfficialAppsFeedStat$PostingTimelineEvent.pickerOpening) && epx.f(this.pickerAttachmentAttaching, mobileOfficialAppsFeedStat$PostingTimelineEvent.pickerAttachmentAttaching) && epx.f(this.postPublishingTimeRange, mobileOfficialAppsFeedStat$PostingTimelineEvent.postPublishingTimeRange) && epx.f(this.postPublishingError, mobileOfficialAppsFeedStat$PostingTimelineEvent.postPublishingError) && epx.f(this.error, mobileOfficialAppsFeedStat$PostingTimelineEvent.error);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MobileOfficialAppsFeedStat$PostingFileUploading mobileOfficialAppsFeedStat$PostingFileUploading = this.fileUploading;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$PostingFileUploading == null ? 0 : mobileOfficialAppsFeedStat$PostingFileUploading.hashCode())) * 31;
        MobileOfficialAppsFeedStat$PostingFileUploadingError mobileOfficialAppsFeedStat$PostingFileUploadingError = this.fileUploadingError;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsFeedStat$PostingFileUploadingError == null ? 0 : mobileOfficialAppsFeedStat$PostingFileUploadingError.hashCode())) * 31;
        MobileOfficialAppsFeedStat$PostingPickerOpening mobileOfficialAppsFeedStat$PostingPickerOpening = this.pickerOpening;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsFeedStat$PostingPickerOpening == null ? 0 : mobileOfficialAppsFeedStat$PostingPickerOpening.hashCode())) * 31;
        MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching mobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching = this.pickerAttachmentAttaching;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching == null ? 0 : mobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching.hashCode())) * 31;
        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = this.postPublishingTimeRange;
        int hashCode6 = (hashCode5 + (mobileOfficialAppsFeedStat$FeedTimeRange == null ? 0 : mobileOfficialAppsFeedStat$FeedTimeRange.hashCode())) * 31;
        MobileOfficialAppsFeedStat$PostingPostPublishingError mobileOfficialAppsFeedStat$PostingPostPublishingError = this.postPublishingError;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsFeedStat$PostingPostPublishingError == null ? 0 : mobileOfficialAppsFeedStat$PostingPostPublishingError.hashCode())) * 31;
        MobileOfficialAppsFeedStat$PostingError mobileOfficialAppsFeedStat$PostingError = this.error;
        return hashCode7 + (mobileOfficialAppsFeedStat$PostingError != null ? mobileOfficialAppsFeedStat$PostingError.hashCode() : 0);
    }

    public final String toString() {
        return "PostingTimelineEvent(type=" + this.type + ", fileUploading=" + this.fileUploading + ", fileUploadingError=" + this.fileUploadingError + ", pickerOpening=" + this.pickerOpening + ", pickerAttachmentAttaching=" + this.pickerAttachmentAttaching + ", postPublishingTimeRange=" + this.postPublishingTimeRange + ", postPublishingError=" + this.postPublishingError + ", error=" + this.error + ')';
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$PostingTimelineEvent(Type type, MobileOfficialAppsFeedStat$PostingFileUploading mobileOfficialAppsFeedStat$PostingFileUploading, MobileOfficialAppsFeedStat$PostingFileUploadingError mobileOfficialAppsFeedStat$PostingFileUploadingError, MobileOfficialAppsFeedStat$PostingPickerOpening mobileOfficialAppsFeedStat$PostingPickerOpening, MobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching mobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching, MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, MobileOfficialAppsFeedStat$PostingPostPublishingError mobileOfficialAppsFeedStat$PostingPostPublishingError, MobileOfficialAppsFeedStat$PostingError mobileOfficialAppsFeedStat$PostingError, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$PostingFileUploading, (i & 4) != 0 ? null : mobileOfficialAppsFeedStat$PostingFileUploadingError, (i & 8) != 0 ? null : mobileOfficialAppsFeedStat$PostingPickerOpening, (i & 16) != 0 ? null : mobileOfficialAppsFeedStat$PostingPickerAttachmentAttaching, (i & 32) != 0 ? null : mobileOfficialAppsFeedStat$FeedTimeRange, (i & 64) != 0 ? null : mobileOfficialAppsFeedStat$PostingPostPublishingError, (i & 128) != 0 ? null : mobileOfficialAppsFeedStat$PostingError);
    }
}
