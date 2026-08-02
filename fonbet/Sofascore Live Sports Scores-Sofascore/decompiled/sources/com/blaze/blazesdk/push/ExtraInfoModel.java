package com.blaze.blazesdk.push;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/push/ExtraInfoModel;", "Landroid/os/Parcelable;", "id", "", "type", "Lcom/blaze/blazesdk/push/ExtraInfoModel$ContentType;", "pageId", "label", "eventId", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/push/ExtraInfoModel$ContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "()Lcom/blaze/blazesdk/push/ExtraInfoModel$ContentType;", "getPageId", "getLabel", "getEventId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ContentType", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExtraInfoModel implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ExtraInfoModel> CREATOR = new a();

    @b6h("EventId")
    @Nullable
    private final String eventId;

    @b6h("Id")
    @NotNull
    private final String id;

    @b6h("Label")
    @Nullable
    private final String label;

    @b6h("PageId")
    @Nullable
    private final String pageId;

    @b6h("Type")
    @Nullable
    private final ContentType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/blaze/blazesdk/push/ExtraInfoModel$ContentType;", "Landroid/os/Parcelable;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "STORY", "MOMENT", "VIDEO", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContentType implements Parcelable {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<ContentType> CREATOR;

        @NotNull
        private final String value;

        @b6h("Story")
        public static final ContentType STORY = new ContentType("STORY", 0, "Story");

        @b6h("Moment")
        public static final ContentType MOMENT = new ContentType("MOMENT", 1, "Moment");

        @b6h("Video")
        public static final ContentType VIDEO = new ContentType("VIDEO", 2, "Video");

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return ContentType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContentType[i];
            }
        }

        private static final /* synthetic */ ContentType[] $values() {
            return new ContentType[]{STORY, MOMENT, VIDEO};
        }

        static {
            ContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
            CREATOR = new a();
        }

        private ContentType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(name());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ExtraInfoModel(parcel.readString(), parcel.readInt() == 0 ? null : ContentType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExtraInfoModel[i];
        }
    }

    public /* synthetic */ ExtraInfoModel(String str, ContentType contentType, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, contentType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ ExtraInfoModel copy$default(ExtraInfoModel extraInfoModel, String str, ContentType contentType, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extraInfoModel.id;
        }
        if ((i & 2) != 0) {
            contentType = extraInfoModel.type;
        }
        if ((i & 4) != 0) {
            str2 = extraInfoModel.pageId;
        }
        if ((i & 8) != 0) {
            str3 = extraInfoModel.label;
        }
        if ((i & 16) != 0) {
            str4 = extraInfoModel.eventId;
        }
        String str5 = str4;
        String str6 = str2;
        return extraInfoModel.copy(str, contentType, str6, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ContentType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final ExtraInfoModel copy(@NotNull String id, @Nullable ContentType type, @Nullable String pageId, @Nullable String label, @Nullable String eventId) {
        id.getClass();
        return new ExtraInfoModel(id, type, pageId, label, eventId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraInfoModel)) {
            return false;
        }
        ExtraInfoModel extraInfoModel = (ExtraInfoModel) other;
        return Intrinsics.c(this.id, extraInfoModel.id) && this.type == extraInfoModel.type && Intrinsics.c(this.pageId, extraInfoModel.pageId) && Intrinsics.c(this.label, extraInfoModel.label) && Intrinsics.c(this.eventId, extraInfoModel.eventId);
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final ContentType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        ContentType contentType = this.type;
        int hashCode2 = (hashCode + (contentType == null ? 0 : contentType.hashCode())) * 31;
        String str = this.pageId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventId;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ExtraInfoModel(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", pageId=");
        sb.append(this.pageId);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", eventId=");
        return lnb.q(sb, this.eventId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        ContentType contentType = this.type;
        if (contentType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contentType.writeToParcel(dest, flags);
        }
        dest.writeString(this.pageId);
        dest.writeString(this.label);
        dest.writeString(this.eventId);
    }

    public ExtraInfoModel(@NotNull String str, @Nullable ContentType contentType, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        str.getClass();
        this.id = str;
        this.type = contentType;
        this.pageId = str2;
        this.label = str3;
        this.eventId = str4;
    }
}
