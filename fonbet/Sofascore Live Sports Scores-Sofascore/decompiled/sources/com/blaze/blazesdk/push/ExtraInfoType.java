package com.blaze.blazesdk.push;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.o6a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/push/ExtraInfoType;", "Landroid/os/Parcelable;", "<init>", "()V", "Moment", "Video", "StoryPage", "Story", "Lcom/blaze/blazesdk/push/ExtraInfoType$Moment;", "Lcom/blaze/blazesdk/push/ExtraInfoType$Story;", "Lcom/blaze/blazesdk/push/ExtraInfoType$StoryPage;", "Lcom/blaze/blazesdk/push/ExtraInfoType$Video;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ExtraInfoType implements Parcelable {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/blaze/blazesdk/push/ExtraInfoType$Moment;", "Lcom/blaze/blazesdk/push/ExtraInfoType;", "momentId", "", "eventId", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMomentId", "()Ljava/lang/String;", "getEventId", "getLabel", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Moment extends ExtraInfoType {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Moment> CREATOR = new a();

        @Nullable
        private final String eventId;

        @Nullable
        private final String label;

        @NotNull
        private final String momentId;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Moment(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Moment[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Moment(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            super(null);
            str.getClass();
            this.momentId = str;
            this.eventId = str2;
            this.label = str3;
        }

        public static /* synthetic */ Moment copy$default(Moment moment, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = moment.momentId;
            }
            if ((i & 2) != 0) {
                str2 = moment.eventId;
            }
            if ((i & 4) != 0) {
                str3 = moment.label;
            }
            return moment.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMomentId() {
            return this.momentId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Moment copy(@NotNull String momentId, @Nullable String eventId, @Nullable String label) {
            momentId.getClass();
            return new Moment(momentId, eventId, label);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Moment)) {
                return false;
            }
            Moment moment = (Moment) other;
            return Intrinsics.c(this.momentId, moment.momentId) && Intrinsics.c(this.eventId, moment.eventId) && Intrinsics.c(this.label, moment.label);
        }

        @Nullable
        public final String getEventId() {
            return this.eventId;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getMomentId() {
            return this.momentId;
        }

        public int hashCode() {
            int hashCode = this.momentId.hashCode() * 31;
            String str = this.eventId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Moment(momentId=");
            sb.append(this.momentId);
            sb.append(", eventId=");
            sb.append(this.eventId);
            sb.append(", label=");
            return lnb.q(sb, this.label, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.momentId);
            dest.writeString(this.eventId);
            dest.writeString(this.label);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/blaze/blazesdk/push/ExtraInfoType$Story;", "Lcom/blaze/blazesdk/push/ExtraInfoType;", "storyId", "", "eventId", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStoryId", "()Ljava/lang/String;", "getEventId", "getLabel", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Story extends ExtraInfoType {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Story> CREATOR = new a();

        @Nullable
        private final String eventId;

        @Nullable
        private final String label;

        @NotNull
        private final String storyId;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Story(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Story[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Story(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            super(null);
            str.getClass();
            this.storyId = str;
            this.eventId = str2;
            this.label = str3;
        }

        public static /* synthetic */ Story copy$default(Story story, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = story.storyId;
            }
            if ((i & 2) != 0) {
                str2 = story.eventId;
            }
            if ((i & 4) != 0) {
                str3 = story.label;
            }
            return story.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Story copy(@NotNull String storyId, @Nullable String eventId, @Nullable String label) {
            storyId.getClass();
            return new Story(storyId, eventId, label);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Story)) {
                return false;
            }
            Story story = (Story) other;
            return Intrinsics.c(this.storyId, story.storyId) && Intrinsics.c(this.eventId, story.eventId) && Intrinsics.c(this.label, story.label);
        }

        @Nullable
        public final String getEventId() {
            return this.eventId;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            int hashCode = this.storyId.hashCode() * 31;
            String str = this.eventId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Story(storyId=");
            sb.append(this.storyId);
            sb.append(", eventId=");
            sb.append(this.eventId);
            sb.append(", label=");
            return lnb.q(sb, this.label, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.storyId);
            dest.writeString(this.eventId);
            dest.writeString(this.label);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/blaze/blazesdk/push/ExtraInfoType$StoryPage;", "Lcom/blaze/blazesdk/push/ExtraInfoType;", "storyId", "", "pageId", "eventId", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStoryId", "()Ljava/lang/String;", "getPageId", "getEventId", "getLabel", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StoryPage extends ExtraInfoType {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<StoryPage> CREATOR = new a();

        @Nullable
        private final String eventId;

        @Nullable
        private final String label;

        @NotNull
        private final String pageId;

        @NotNull
        private final String storyId;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new StoryPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoryPage[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoryPage(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
            super(null);
            str.getClass();
            str2.getClass();
            this.storyId = str;
            this.pageId = str2;
            this.eventId = str3;
            this.label = str4;
        }

        public static /* synthetic */ StoryPage copy$default(StoryPage storyPage, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = storyPage.storyId;
            }
            if ((i & 2) != 0) {
                str2 = storyPage.pageId;
            }
            if ((i & 4) != 0) {
                str3 = storyPage.eventId;
            }
            if ((i & 8) != 0) {
                str4 = storyPage.label;
            }
            return storyPage.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStoryId() {
            return this.storyId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPageId() {
            return this.pageId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final StoryPage copy(@NotNull String storyId, @NotNull String pageId, @Nullable String eventId, @Nullable String label) {
            storyId.getClass();
            pageId.getClass();
            return new StoryPage(storyId, pageId, eventId, label);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoryPage)) {
                return false;
            }
            StoryPage storyPage = (StoryPage) other;
            return Intrinsics.c(this.storyId, storyPage.storyId) && Intrinsics.c(this.pageId, storyPage.pageId) && Intrinsics.c(this.eventId, storyPage.eventId) && Intrinsics.c(this.label, storyPage.label);
        }

        @Nullable
        public final String getEventId() {
            return this.eventId;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getPageId() {
            return this.pageId;
        }

        @NotNull
        public final String getStoryId() {
            return this.storyId;
        }

        public int hashCode() {
            int k = o6a.k(this.pageId, this.storyId.hashCode() * 31);
            String str = this.eventId;
            int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("StoryPage(storyId=");
            sb.append(this.storyId);
            sb.append(", pageId=");
            sb.append(this.pageId);
            sb.append(", eventId=");
            sb.append(this.eventId);
            sb.append(", label=");
            return lnb.q(sb, this.label, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.storyId);
            dest.writeString(this.pageId);
            dest.writeString(this.eventId);
            dest.writeString(this.label);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/blaze/blazesdk/push/ExtraInfoType$Video;", "Lcom/blaze/blazesdk/push/ExtraInfoType;", "videoId", "", "eventId", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVideoId", "()Ljava/lang/String;", "getEventId", "getLabel", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video extends ExtraInfoType {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Video> CREATOR = new a();

        @Nullable
        private final String eventId;

        @Nullable
        private final String label;

        @NotNull
        private final String videoId;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Video(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Video[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Video(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            super(null);
            str.getClass();
            this.videoId = str;
            this.eventId = str2;
            this.label = str3;
        }

        public static /* synthetic */ Video copy$default(Video video, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = video.videoId;
            }
            if ((i & 2) != 0) {
                str2 = video.eventId;
            }
            if ((i & 4) != 0) {
                str3 = video.label;
            }
            return video.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getVideoId() {
            return this.videoId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Video copy(@NotNull String videoId, @Nullable String eventId, @Nullable String label) {
            videoId.getClass();
            return new Video(videoId, eventId, label);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return Intrinsics.c(this.videoId, video.videoId) && Intrinsics.c(this.eventId, video.eventId) && Intrinsics.c(this.label, video.label);
        }

        @Nullable
        public final String getEventId() {
            return this.eventId;
        }

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final String getVideoId() {
            return this.videoId;
        }

        public int hashCode() {
            int hashCode = this.videoId.hashCode() * 31;
            String str = this.eventId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Video(videoId=");
            sb.append(this.videoId);
            sb.append(", eventId=");
            sb.append(this.eventId);
            sb.append(", label=");
            return lnb.q(sb, this.label, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.videoId);
            dest.writeString(this.eventId);
            dest.writeString(this.label);
        }
    }

    public /* synthetic */ ExtraInfoType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ExtraInfoType() {
    }
}
