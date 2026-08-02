package com.blaze.blazesdk.analytics.props;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.ThumbnailFormat;
import com.blaze.blazesdk.analytics.enums.ThumbnailType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import defpackage.b6a;
import defpackage.b6h;
import defpackage.dmi;
import defpackage.w1l;
import defpackage.w3a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\u0017\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0017\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003Jà\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u00020\bJ\u0013\u0010H\u001a\u00020\u00162\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\bHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\u0016\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/¨\u0006R"}, d2 = {"Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;", "Landroid/os/Parcelable;", "widget_id", "", "widget_type", "Lcom/blaze/blazesdk/analytics/enums/WidgetType;", "widget_size", "widget_content_count", "", "content_id", "content_type", "Lcom/blaze/blazesdk/analytics/enums/ContentType;", "content_index", "thumbnail_size", "thumbnail_aspect_ratio", "thumbnail_type", "Lcom/blaze/blazesdk/analytics/enums/ThumbnailType;", "widget_content_list", "", "content_extra_info", "", "animated_thumbnail_enabled", "", "thumbnail_format", "Lcom/blaze/blazesdk/analytics/enums/ThumbnailFormat;", "localization", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/WidgetType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/ContentType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/ThumbnailType;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Lcom/blaze/blazesdk/analytics/enums/ThumbnailFormat;Ljava/util/Map;)V", "getWidget_id", "()Ljava/lang/String;", "getWidget_type", "()Lcom/blaze/blazesdk/analytics/enums/WidgetType;", "getWidget_size", "getWidget_content_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent_id", "getContent_type", "()Lcom/blaze/blazesdk/analytics/enums/ContentType;", "getContent_index", "getThumbnail_size", "getThumbnail_aspect_ratio", "getThumbnail_type", "()Lcom/blaze/blazesdk/analytics/enums/ThumbnailType;", "getWidget_content_list", "()Ljava/util/List;", "getContent_extra_info", "()Ljava/util/Map;", "getAnimated_thumbnail_enabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getThumbnail_format", "()Lcom/blaze/blazesdk/analytics/enums/ThumbnailFormat;", "getLocalization", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/WidgetType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/ContentType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/analytics/enums/ThumbnailType;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Lcom/blaze/blazesdk/analytics/enums/ThumbnailFormat;Ljava/util/Map;)Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsWidget;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPropsWidget implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPropsWidget> CREATOR = new a();

    @b6h("animated_thumbnail_enabled")
    @Nullable
    private final Boolean animated_thumbnail_enabled;

    @b6h("content_extra_info")
    @Nullable
    private final Map<String, String> content_extra_info;

    @b6h("content_id")
    @Nullable
    private final String content_id;

    @b6h("content_index")
    @Nullable
    private final Integer content_index;

    @b6h("content_type")
    @Nullable
    private final ContentType content_type;

    @b6h("localization")
    @Nullable
    private final Map<String, String> localization;

    @b6h("thumbnail_aspect_ratio")
    @Nullable
    private final String thumbnail_aspect_ratio;

    @b6h("thumbnail_format")
    @Nullable
    private final ThumbnailFormat thumbnail_format;

    @b6h("thumbnail_size")
    @Nullable
    private final String thumbnail_size;

    @b6h("thumbnail_type")
    @Nullable
    private final ThumbnailType thumbnail_type;

    @b6h("widget_content_count")
    @Nullable
    private final Integer widget_content_count;

    @b6h("widget_content_list")
    @Nullable
    private final List<String> widget_content_list;

    @b6h("widget_id")
    @Nullable
    private final String widget_id;

    @b6h("widget_size")
    @Nullable
    private final String widget_size;

    @b6h("widget_type")
    @Nullable
    private final WidgetType widget_type;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ThumbnailFormat thumbnailFormat;
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            String readString = parcel.readString();
            WidgetType createFromParcel = parcel.readInt() == 0 ? null : WidgetType.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            ContentType createFromParcel2 = parcel.readInt() == 0 ? null : ContentType.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            Integer num = valueOf2;
            Integer num2 = valueOf3;
            String readString5 = parcel.readString();
            ThumbnailType createFromParcel3 = parcel.readInt() == 0 ? null : ThumbnailType.CREATOR.createFromParcel(parcel);
            LinkedHashMap linkedHashMap2 = null;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = w1l.a(parcel, linkedHashMap2, parcel.readString(), i, 1);
                    readString = readString;
                }
            }
            String str = readString;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ThumbnailFormat createFromParcel4 = parcel.readInt() == 0 ? null : ThumbnailFormat.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                thumbnailFormat = createFromParcel4;
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt2);
                thumbnailFormat = createFromParcel4;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = w1l.a(parcel, linkedHashMap3, parcel.readString(), i2, 1);
                    createFromParcel = createFromParcel;
                    readString2 = readString2;
                }
                linkedHashMap = linkedHashMap3;
            }
            return new AnalyticsPropsWidget(str, createFromParcel, readString2, num, readString3, createFromParcel2, num2, readString4, readString5, createFromParcel3, createStringArrayList, linkedHashMap2, valueOf, thumbnailFormat, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPropsWidget[i];
        }
    }

    public /* synthetic */ AnalyticsPropsWidget(String str, WidgetType widgetType, String str2, Integer num, String str3, ContentType contentType, Integer num2, String str4, String str5, ThumbnailType thumbnailType, List list, Map map, Boolean bool, ThumbnailFormat thumbnailFormat, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : widgetType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : contentType, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str4, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str5, (i & 512) != 0 ? null : thumbnailType, (i & 1024) != 0 ? null : list, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? null : map, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : thumbnailFormat, (i & 16384) != 0 ? null : map2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getWidget_id() {
        return this.widget_id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final ThumbnailType getThumbnail_type() {
        return this.thumbnail_type;
    }

    @Nullable
    public final List<String> component11() {
        return this.widget_content_list;
    }

    @Nullable
    public final Map<String, String> component12() {
        return this.content_extra_info;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Boolean getAnimated_thumbnail_enabled() {
        return this.animated_thumbnail_enabled;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final ThumbnailFormat getThumbnail_format() {
        return this.thumbnail_format;
    }

    @Nullable
    public final Map<String, String> component15() {
        return this.localization;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final WidgetType getWidget_type() {
        return this.widget_type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getWidget_size() {
        return this.widget_size;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getWidget_content_count() {
        return this.widget_content_count;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getContent_id() {
        return this.content_id;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ContentType getContent_type() {
        return this.content_type;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getContent_index() {
        return this.content_index;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getThumbnail_size() {
        return this.thumbnail_size;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getThumbnail_aspect_ratio() {
        return this.thumbnail_aspect_ratio;
    }

    @NotNull
    public final AnalyticsPropsWidget copy(@Nullable String widget_id, @Nullable WidgetType widget_type, @Nullable String widget_size, @Nullable Integer widget_content_count, @Nullable String content_id, @Nullable ContentType content_type, @Nullable Integer content_index, @Nullable String thumbnail_size, @Nullable String thumbnail_aspect_ratio, @Nullable ThumbnailType thumbnail_type, @Nullable List<String> widget_content_list, @Nullable Map<String, String> content_extra_info, @Nullable Boolean animated_thumbnail_enabled, @Nullable ThumbnailFormat thumbnail_format, @Nullable Map<String, String> localization) {
        return new AnalyticsPropsWidget(widget_id, widget_type, widget_size, widget_content_count, content_id, content_type, content_index, thumbnail_size, thumbnail_aspect_ratio, thumbnail_type, widget_content_list, content_extra_info, animated_thumbnail_enabled, thumbnail_format, localization);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPropsWidget)) {
            return false;
        }
        AnalyticsPropsWidget analyticsPropsWidget = (AnalyticsPropsWidget) other;
        return Intrinsics.c(this.widget_id, analyticsPropsWidget.widget_id) && this.widget_type == analyticsPropsWidget.widget_type && Intrinsics.c(this.widget_size, analyticsPropsWidget.widget_size) && Intrinsics.c(this.widget_content_count, analyticsPropsWidget.widget_content_count) && Intrinsics.c(this.content_id, analyticsPropsWidget.content_id) && this.content_type == analyticsPropsWidget.content_type && Intrinsics.c(this.content_index, analyticsPropsWidget.content_index) && Intrinsics.c(this.thumbnail_size, analyticsPropsWidget.thumbnail_size) && Intrinsics.c(this.thumbnail_aspect_ratio, analyticsPropsWidget.thumbnail_aspect_ratio) && this.thumbnail_type == analyticsPropsWidget.thumbnail_type && Intrinsics.c(this.widget_content_list, analyticsPropsWidget.widget_content_list) && Intrinsics.c(this.content_extra_info, analyticsPropsWidget.content_extra_info) && Intrinsics.c(this.animated_thumbnail_enabled, analyticsPropsWidget.animated_thumbnail_enabled) && this.thumbnail_format == analyticsPropsWidget.thumbnail_format && Intrinsics.c(this.localization, analyticsPropsWidget.localization);
    }

    @Nullable
    public final Boolean getAnimated_thumbnail_enabled() {
        return this.animated_thumbnail_enabled;
    }

    @Nullable
    public final Map<String, String> getContent_extra_info() {
        return this.content_extra_info;
    }

    @Nullable
    public final String getContent_id() {
        return this.content_id;
    }

    @Nullable
    public final Integer getContent_index() {
        return this.content_index;
    }

    @Nullable
    public final ContentType getContent_type() {
        return this.content_type;
    }

    @Nullable
    public final Map<String, String> getLocalization() {
        return this.localization;
    }

    @Nullable
    public final String getThumbnail_aspect_ratio() {
        return this.thumbnail_aspect_ratio;
    }

    @Nullable
    public final ThumbnailFormat getThumbnail_format() {
        return this.thumbnail_format;
    }

    @Nullable
    public final String getThumbnail_size() {
        return this.thumbnail_size;
    }

    @Nullable
    public final ThumbnailType getThumbnail_type() {
        return this.thumbnail_type;
    }

    @Nullable
    public final Integer getWidget_content_count() {
        return this.widget_content_count;
    }

    @Nullable
    public final List<String> getWidget_content_list() {
        return this.widget_content_list;
    }

    @Nullable
    public final String getWidget_id() {
        return this.widget_id;
    }

    @Nullable
    public final String getWidget_size() {
        return this.widget_size;
    }

    @Nullable
    public final WidgetType getWidget_type() {
        return this.widget_type;
    }

    public int hashCode() {
        String str = this.widget_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        WidgetType widgetType = this.widget_type;
        int hashCode2 = (hashCode + (widgetType == null ? 0 : widgetType.hashCode())) * 31;
        String str2 = this.widget_size;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.widget_content_count;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.content_id;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ContentType contentType = this.content_type;
        int hashCode6 = (hashCode5 + (contentType == null ? 0 : contentType.hashCode())) * 31;
        Integer num2 = this.content_index;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.thumbnail_size;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thumbnail_aspect_ratio;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ThumbnailType thumbnailType = this.thumbnail_type;
        int hashCode10 = (hashCode9 + (thumbnailType == null ? 0 : thumbnailType.hashCode())) * 31;
        List<String> list = this.widget_content_list;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.content_extra_info;
        int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.animated_thumbnail_enabled;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        ThumbnailFormat thumbnailFormat = this.thumbnail_format;
        int hashCode14 = (hashCode13 + (thumbnailFormat == null ? 0 : thumbnailFormat.hashCode())) * 31;
        Map<String, String> map2 = this.localization;
        return hashCode14 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsPropsWidget(widget_id=");
        sb.append(this.widget_id);
        sb.append(", widget_type=");
        sb.append(this.widget_type);
        sb.append(", widget_size=");
        sb.append(this.widget_size);
        sb.append(", widget_content_count=");
        sb.append(this.widget_content_count);
        sb.append(", content_id=");
        sb.append(this.content_id);
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.append(", content_index=");
        sb.append(this.content_index);
        sb.append(", thumbnail_size=");
        sb.append(this.thumbnail_size);
        sb.append(", thumbnail_aspect_ratio=");
        sb.append(this.thumbnail_aspect_ratio);
        sb.append(", thumbnail_type=");
        sb.append(this.thumbnail_type);
        sb.append(", widget_content_list=");
        sb.append(this.widget_content_list);
        sb.append(", content_extra_info=");
        sb.append(this.content_extra_info);
        sb.append(", animated_thumbnail_enabled=");
        sb.append(this.animated_thumbnail_enabled);
        sb.append(", thumbnail_format=");
        sb.append(this.thumbnail_format);
        sb.append(", localization=");
        return dmi.s(sb, this.localization, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.widget_id);
        WidgetType widgetType = this.widget_type;
        if (widgetType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            widgetType.writeToParcel(dest, flags);
        }
        dest.writeString(this.widget_size);
        Integer num = this.widget_content_count;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        dest.writeString(this.content_id);
        ContentType contentType = this.content_type;
        if (contentType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contentType.writeToParcel(dest, flags);
        }
        Integer num2 = this.content_index;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num2);
        }
        dest.writeString(this.thumbnail_size);
        dest.writeString(this.thumbnail_aspect_ratio);
        ThumbnailType thumbnailType = this.thumbnail_type;
        if (thumbnailType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            thumbnailType.writeToParcel(dest, flags);
        }
        dest.writeStringList(this.widget_content_list);
        Map<String, String> map = this.content_extra_info;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator k = w3a.k(dest, map);
            while (k.hasNext()) {
                Map.Entry entry = (Map.Entry) k.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        Boolean bool = this.animated_thumbnail_enabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ThumbnailFormat thumbnailFormat = this.thumbnail_format;
        if (thumbnailFormat == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            thumbnailFormat.writeToParcel(dest, flags);
        }
        Map<String, String> map2 = this.localization;
        if (map2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator k2 = w3a.k(dest, map2);
        while (k2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) k2.next();
            dest.writeString((String) entry2.getKey());
            dest.writeString((String) entry2.getValue());
        }
    }

    public AnalyticsPropsWidget(@Nullable String str, @Nullable WidgetType widgetType, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable ContentType contentType, @Nullable Integer num2, @Nullable String str4, @Nullable String str5, @Nullable ThumbnailType thumbnailType, @Nullable List<String> list, @Nullable Map<String, String> map, @Nullable Boolean bool, @Nullable ThumbnailFormat thumbnailFormat, @Nullable Map<String, String> map2) {
        this.widget_id = str;
        this.widget_type = widgetType;
        this.widget_size = str2;
        this.widget_content_count = num;
        this.content_id = str3;
        this.content_type = contentType;
        this.content_index = num2;
        this.thumbnail_size = str4;
        this.thumbnail_aspect_ratio = str5;
        this.thumbnail_type = thumbnailType;
        this.widget_content_list = list;
        this.content_extra_info = map;
        this.animated_thumbnail_enabled = bool;
        this.thumbnail_format = thumbnailFormat;
        this.localization = map2;
    }

    public AnalyticsPropsWidget() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
