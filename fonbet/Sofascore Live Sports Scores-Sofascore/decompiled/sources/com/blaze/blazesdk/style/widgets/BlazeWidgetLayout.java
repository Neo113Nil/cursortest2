package com.blaze.blazesdk.style.widgets;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.style.shared.models.BlazeObjectXPosition;
import com.blaze.blazesdk.style.shared.models.BlazeObjectYPosition;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemDurationElementStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemEventTimeElementStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageGradientOverlayStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStateStyle;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.b6a;
import defpackage.cnb;
import defpackage.g7a;
import defpackage.l1m;
import defpackage.l4a;
import defpackage.llf;
import defpackage.lxl;
import defpackage.s6a;
import defpackage.uaa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001HBC\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\t\u00108\u001a\u00020\rHÆ\u0003JV\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010:J\u0006\u0010;\u001a\u00020\nJ\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\nHÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u0010+\u001a\u00020\n8F¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001fR\u0017\u0010/\u001a\u00020\n8F¢\u0006\f\u0012\u0004\b0\u0010-\u001a\u0004\b1\u0010\u001f¨\u0006I"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "horizontalItemsSpacing", "Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "verticalItemsSpacing", "itemRatio", "", "margins", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "columns", "", "maxDisplayItemsCount", "widgetItemStyle", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;FLcom/blaze/blazesdk/style/shared/models/BlazeInsets;ILjava/lang/Integer;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;)V", "getHorizontalItemsSpacing", "()Lcom/blaze/blazesdk/style/shared/models/BlazeDp;", "setHorizontalItemsSpacing", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;)V", "getVerticalItemsSpacing", "setVerticalItemsSpacing", "getItemRatio", "()F", "setItemRatio", "(F)V", "getMargins", "()Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "setMargins", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "getColumns", "()I", "setColumns", "(I)V", "getMaxDisplayItemsCount", "()Ljava/lang/Integer;", "setMaxDisplayItemsCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWidgetItemStyle", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;", "setWidgetItemStyle", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;)V", "maxDisplayItemsCountForSkeletons", "getMaxDisplayItemsCountForSkeletons$annotations", "()V", "getMaxDisplayItemsCountForSkeletons", "updatedColumns", "getUpdatedColumns$annotations", "getUpdatedColumns", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/blaze/blazesdk/style/shared/models/BlazeDp;Lcom/blaze/blazesdk/style/shared/models/BlazeDp;FLcom/blaze/blazesdk/style/shared/models/BlazeInsets;ILjava/lang/Integer;Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyle;)Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Presets", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeWidgetLayout implements BlazeParcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazeWidgetLayout> CREATOR = new a();
    private int columns;

    @NotNull
    private BlazeDp horizontalItemsSpacing;
    private float itemRatio;

    @NotNull
    private BlazeInsets margins;

    @Nullable
    private Integer maxDisplayItemsCount;

    @NotNull
    private BlazeDp verticalItemsSpacing;

    @NotNull
    private BlazeWidgetItemStyle widgetItemStyle;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets;", "", "<init>", "()V", "StoriesWidget", "MomentsWidget", "VideosWidget", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Presets {
        public static final int $stable = 0;

        @NotNull
        public static final Presets INSTANCE = new Presets();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$MomentsWidget;", "", "<init>", "()V", "Row", "Grid", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MomentsWidget {
            public static final int $stable = 0;

            @NotNull
            public static final MomentsWidget INSTANCE = new MomentsWidget();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Keep
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$MomentsWidget$Grid;", "", "<init>", "()V", "oneColumnHorizontalRectangles", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getOneColumnHorizontalRectangles", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "twoColumnsVerticalRectangles", "getTwoColumnsVerticalRectangles", "twoColumnsHorizontalRectangles", "getTwoColumnsHorizontalRectangles", "threeColumnsVerticalRectangles", "getThreeColumnsVerticalRectangles", "threeColumnsHorizontalRectangles", "getThreeColumnsHorizontalRectangles", "singleItemVerticalRectangle", "getSingleItemVerticalRectangle", "singleItemHorizontalRectangle", "getSingleItemHorizontalRectangle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Grid {
                public static final int $stable = 0;

                @NotNull
                public static final Grid INSTANCE = new Grid();

                private Grid() {
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getOneColumnHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(1);
                    uaa.l(a);
                    a.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemHorizontalRectangle() {
                    BlazeWidgetLayout c = lxl.c();
                    c.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return c;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemVerticalRectangle() {
                    BlazeWidgetLayout d = lxl.d();
                    d.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return d;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getThreeColumnsHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(3);
                    uaa.l(a);
                    a.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getThreeColumnsVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.setColumns(3);
                    uaa.l(b);
                    b.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return b;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getTwoColumnsHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(2);
                    uaa.l(a);
                    a.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getTwoColumnsVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.setColumns(2);
                    uaa.l(b);
                    b.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return b;
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Keep
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$MomentsWidget$Row;", "", "<init>", "()V", "verticalRectangles", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getVerticalRectangles", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "horizontalRectangles", "getHorizontalRectangles", "verticalAnimatedThumbnailsRectangles", "getVerticalAnimatedThumbnailsRectangles", "singleItemVerticalRectangle", "getSingleItemVerticalRectangle", "singleItemHorizontalRectangle", "getSingleItemHorizontalRectangle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Row {
                public static final int $stable = 0;

                @NotNull
                public static final Row INSTANCE = new Row();

                private Row() {
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    uaa.l(a);
                    a.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemHorizontalRectangle() {
                    BlazeWidgetLayout c = lxl.c();
                    c.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return c;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemVerticalRectangle() {
                    BlazeWidgetLayout d = lxl.d();
                    d.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return d;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getVerticalAnimatedThumbnailsRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.setItemRatio(0.5625f);
                    BlazeWidgetItemImageStyle image = b.getWidgetItemStyle().getImage();
                    image.setRatio(Float.valueOf(0.5625f));
                    image.getAnimatedThumbnail().setEnabled(true);
                    BlazeWidgetItemImageAnimatedThumbnailStyle animatedThumbnail = image.getAnimatedThumbnail();
                    Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                    animatedThumbnail.setHorizontalAnimationTriggerPercentage((application$blazesdk_release == null || !cnb.i(application$blazesdk_release)) ? 0.3f : 0.15f);
                    b.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return b;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    uaa.l(b);
                    b.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return b;
                }
            }

            private MomentsWidget() {
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$StoriesWidget;", "", "<init>", "()V", "Row", "Grid", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StoriesWidget {
            public static final int $stable = 0;

            @NotNull
            public static final StoriesWidget INSTANCE = new StoriesWidget();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Keep
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$StoriesWidget$Grid;", "", "<init>", "()V", "oneColumnHorizontalRectangles", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getOneColumnHorizontalRectangles", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "twoColumnsVerticalRectangles", "getTwoColumnsVerticalRectangles", "twoColumnsHorizontalRectangles", "getTwoColumnsHorizontalRectangles", "threeColumnsVerticalRectangles", "getThreeColumnsVerticalRectangles", "threeColumnsHorizontalRectangles", "getThreeColumnsHorizontalRectangles", "singleItemVerticalRectangle", "getSingleItemVerticalRectangle", "singleItemHorizontalRectangle", "getSingleItemHorizontalRectangle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Grid {
                public static final int $stable = 0;

                @NotNull
                public static final Grid INSTANCE = new Grid();

                private Grid() {
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getOneColumnHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(1);
                    a.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemHorizontalRectangle() {
                    BlazeWidgetLayout c = lxl.c();
                    c.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return c;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemVerticalRectangle() {
                    BlazeWidgetLayout d = lxl.d();
                    d.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return d;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getThreeColumnsHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(3);
                    a.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getThreeColumnsVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.setColumns(3);
                    b.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return b;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getTwoColumnsHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(2);
                    a.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getTwoColumnsVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.setColumns(2);
                    b.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return b;
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Keep
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$StoriesWidget$Row;", "", "<init>", "()V", "circles", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getCircles", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "verticalRectangles", "getVerticalRectangles", "horizontalRectangles", "getHorizontalRectangles", "singleItemVerticalRectangle", "getSingleItemVerticalRectangle", "singleItemHorizontalRectangle", "getSingleItemHorizontalRectangle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Row {
                public static final int $stable = 0;

                @NotNull
                public static final Row INSTANCE = new Row();

                private Row() {
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getCircles() {
                    Float valueOf = Float.valueOf(0.5f);
                    BlazeWidgetItemImageContainerBorderStateStyle.INSTANCE.getClass();
                    BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle = new BlazeWidgetItemImageContainerBorderStateStyle(true, 0, new BlazeDp(4), new BlazeDp(2));
                    int i = l1m.d;
                    blazeWidgetItemImageContainerBorderStateStyle.setColor(i);
                    BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle2 = new BlazeWidgetItemImageContainerBorderStateStyle(true, 0, new BlazeDp(4), new BlazeDp(2));
                    int i2 = l1m.b;
                    blazeWidgetItemImageContainerBorderStateStyle2.setColor(i2);
                    BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle3 = new BlazeWidgetItemImageContainerBorderStateStyle(true, 0, new BlazeDp(4), new BlazeDp(2));
                    int i3 = l1m.a;
                    blazeWidgetItemImageContainerBorderStateStyle3.setColor(i3);
                    BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle4 = new BlazeWidgetItemImageContainerBorderStateStyle(true, 0, new BlazeDp(4), new BlazeDp(2));
                    blazeWidgetItemImageContainerBorderStateStyle4.setColor(l1m.e);
                    BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle = new BlazeWidgetItemImageContainerBorderStyle(true, blazeWidgetItemImageContainerBorderStateStyle2, blazeWidgetItemImageContainerBorderStateStyle, blazeWidgetItemImageContainerBorderStateStyle4, blazeWidgetItemImageContainerBorderStateStyle3);
                    BlazeWidgetItemImageStyle.BlazeImagePosition blazeImagePosition = BlazeWidgetItemImageStyle.BlazeImagePosition.TopCenter;
                    BlazeDp blazeDp = new BlazeDp(0);
                    BlazeInsets blazeInsets = new BlazeInsets(new BlazeDp(2), new BlazeDp(2), new BlazeDp(2), new BlazeDp(2));
                    BlazeWidgetItemImageStyle.BlazeThumbnailType blazeThumbnailType = BlazeWidgetItemImageStyle.BlazeThumbnailType.SQUARE_ICON;
                    BlazeWidgetItemImageGradientOverlayStyle blazeWidgetItemImageGradientOverlayStyle = new BlazeWidgetItemImageGradientOverlayStyle(false, ((int) (llf.b(0.8f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f)) << 24, -1, BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition.BOTTOM);
                    Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                    BlazeWidgetItemImageStyle blazeWidgetItemImageStyle = new BlazeWidgetItemImageStyle(blazeImagePosition, null, null, Float.valueOf(1.0f), blazeWidgetItemImageContainerBorderStyle, blazeThumbnailType, blazeDp, valueOf, blazeInsets, blazeWidgetItemImageGradientOverlayStyle, new BlazeWidgetItemImageAnimatedThumbnailStyle(false, (application$blazesdk_release == null || !cnb.i(application$blazesdk_release)) ? 0.3f : 0.15f));
                    BlazeWidgetItemTextStyle blazeWidgetItemTextStyle = new BlazeWidgetItemTextStyle(null, null, l1m.f, 12.0f, null, 2, 17);
                    BlazeInsets blazeInsets2 = new BlazeInsets(new BlazeDp(4), new BlazeDp(12), new BlazeDp(4), new BlazeDp(4));
                    BlazeWidgetItemTextStyle blazeWidgetItemTextStyle2 = (BlazeWidgetItemTextStyle) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetItemTextStyle);
                    BlazeWidgetItemTextStyle blazeWidgetItemTextStyle3 = (BlazeWidgetItemTextStyle) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetItemTextStyle);
                    BlazeObjectXPosition blazeObjectXPosition = BlazeObjectXPosition.CENTER_X;
                    BlazeWidgetItemTitleStyle blazeWidgetItemTitleStyle = new BlazeWidgetItemTitleStyle(true, new BlazeObjectPositioning(blazeObjectXPosition, BlazeObjectYPosition.TOP_TO_BOTTOM), blazeInsets2, blazeWidgetItemTextStyle3, blazeWidgetItemTextStyle2);
                    BlazeObjectYPosition blazeObjectYPosition = BlazeObjectYPosition.CENTER_TO_BOTTOM;
                    BlazeObjectPositioning blazeObjectPositioning = new BlazeObjectPositioning(blazeObjectXPosition, blazeObjectYPosition);
                    BlazeInsets blazeInsets3 = new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0));
                    BlazeInsets blazeInsets4 = new BlazeInsets(new BlazeDp(8), new BlazeDp(3), new BlazeDp(8), new BlazeDp(3));
                    BlazeWidgetItemStatusIndicatorStateStyle.INSTANCE.getClass();
                    BlazeWidgetItemStatusIndicatorStateStyle a = BlazeWidgetItemStatusIndicatorStateStyle.Companion.a();
                    a.setBackgroundColor(i3);
                    a.setText("NEW");
                    a.setVisible(false);
                    BlazeWidgetItemStatusIndicatorStateStyle a2 = BlazeWidgetItemStatusIndicatorStateStyle.Companion.a();
                    a2.setBackgroundColor(l1m.h);
                    a2.setText("");
                    a2.setVisible(false);
                    BlazeWidgetItemStatusIndicatorStateStyle a3 = BlazeWidgetItemStatusIndicatorStateStyle.Companion.a();
                    a3.setBackgroundColor(i);
                    a3.setText("LIVE");
                    BlazeWidgetItemStatusIndicatorStateStyle a4 = BlazeWidgetItemStatusIndicatorStateStyle.Companion.a();
                    a4.setBackgroundColor(i2);
                    a4.setText("LIVE");
                    BlazeLiveStreamStatus blazeLiveStreamStatus = BlazeLiveStreamStatus.UPCOMING;
                    BlazeWidgetItemStatusIndicatorStateStyle b = BlazeWidgetItemStatusIndicatorStateStyle.Companion.b(blazeLiveStreamStatus);
                    BlazeLiveStreamStatus blazeLiveStreamStatus2 = BlazeLiveStreamStatus.LIVE;
                    BlazeWidgetItemStatusIndicatorStateStyle b2 = BlazeWidgetItemStatusIndicatorStateStyle.Companion.b(blazeLiveStreamStatus2);
                    BlazeLiveStreamStatus blazeLiveStreamStatus3 = BlazeLiveStreamStatus.ENDED;
                    BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle = new BlazeWidgetItemStatusIndicatorStyle(blazeObjectPositioning, true, blazeInsets3, blazeInsets4, a4, a3, a, a2, new BlazeWidgetItemStatusIndicatorStreamStatesStyle(b, b2, BlazeWidgetItemStatusIndicatorStateStyle.Companion.b(blazeLiveStreamStatus3)));
                    BlazeObjectPositioning blazeObjectPositioning2 = new BlazeObjectPositioning(BlazeObjectXPosition.START_TO_START, BlazeObjectYPosition.TOP_TO_TOP);
                    BlazeInsets blazeInsets5 = new BlazeInsets(new BlazeDp(6), new BlazeDp(4), new BlazeDp(6), new BlazeDp(4));
                    BlazeInsets blazeInsets6 = new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0));
                    BlazeWidgetItemBadgeStateStyle.INSTANCE.getClass();
                    BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle = new BlazeWidgetItemBadgeStyle(false, blazeObjectPositioning2, blazeInsets6, blazeInsets5, BlazeWidgetItemBadgeStateStyle.Companion.a(), BlazeWidgetItemBadgeStateStyle.Companion.a(), BlazeWidgetItemBadgeStateStyle.Companion.a(), BlazeWidgetItemBadgeStateStyle.Companion.a());
                    BlazeObjectPositioning blazeObjectPositioning3 = new BlazeObjectPositioning(blazeObjectXPosition, blazeObjectYPosition);
                    BlazeInsets blazeInsets7 = new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0));
                    BlazeInsets blazeInsets8 = new BlazeInsets(new BlazeDp(8), new BlazeDp(3), new BlazeDp(8), new BlazeDp(3));
                    BlazeWidgetItemDurationElementStateStyle.INSTANCE.getClass();
                    BlazeWidgetItemDurationElementStyle blazeWidgetItemDurationElementStyle = new BlazeWidgetItemDurationElementStyle(false, blazeObjectPositioning3, blazeInsets7, blazeInsets8, null, BlazeWidgetItemDurationElementStateStyle.Companion.a(), BlazeWidgetItemDurationElementStateStyle.Companion.a(), BlazeWidgetItemDurationElementStateStyle.Companion.a(), BlazeWidgetItemDurationElementStateStyle.Companion.a());
                    BlazeObjectPositioning blazeObjectPositioning4 = new BlazeObjectPositioning(blazeObjectXPosition, blazeObjectYPosition);
                    BlazeInsets blazeInsets9 = new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0));
                    BlazeInsets blazeInsets10 = new BlazeInsets(new BlazeDp(8), new BlazeDp(3), new BlazeDp(8), new BlazeDp(3));
                    BlazeWidgetItemEventTimeElementStateStyle.INSTANCE.getClass();
                    return new BlazeWidgetLayout(new BlazeDp(16), new BlazeDp(16), 0.6666667f, new BlazeInsets(new BlazeDp(10), new BlazeDp(0), new BlazeDp(10), new BlazeDp(0)), 0, null, new BlazeWidgetItemStyle(blazeWidgetItemTitleStyle, blazeWidgetItemStatusIndicatorStyle, 0, new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0)), new BlazeDp(0), valueOf, blazeWidgetItemImageStyle, blazeWidgetItemBadgeStyle, blazeWidgetItemDurationElementStyle, new BlazeWidgetItemEventTimeElementStyle(false, blazeObjectPositioning4, blazeInsets9, blazeInsets10, null, new BlazeWidgetItemEventTimeElementStreamStatesStyle(BlazeWidgetItemEventTimeElementStateStyle.Companion.a(blazeLiveStreamStatus), BlazeWidgetItemEventTimeElementStateStyle.Companion.a(blazeLiveStreamStatus2), BlazeWidgetItemEventTimeElementStateStyle.Companion.a(blazeLiveStreamStatus3)))));
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemHorizontalRectangle() {
                    BlazeWidgetLayout c = lxl.c();
                    c.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return c;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemVerticalRectangle() {
                    BlazeWidgetLayout d = lxl.d();
                    d.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return d;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.getWidgetItemStyle().getDurationElement().setVisible(false);
                    return b;
                }
            }

            private StoriesWidget() {
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$VideosWidget;", "", "<init>", "()V", "Row", "Grid", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VideosWidget {
            public static final int $stable = 0;

            @NotNull
            public static final VideosWidget INSTANCE = new VideosWidget();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Keep
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$VideosWidget$Grid;", "", "<init>", "()V", "oneColumnHorizontalRectangles", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getOneColumnHorizontalRectangles", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "twoColumnsVerticalRectangles", "getTwoColumnsVerticalRectangles", "twoColumnsHorizontalRectangles", "getTwoColumnsHorizontalRectangles", "threeColumnsVerticalRectangles", "getThreeColumnsVerticalRectangles", "threeColumnsHorizontalRectangles", "getThreeColumnsHorizontalRectangles", "singleItemVerticalRectangle", "getSingleItemVerticalRectangle", "singleItemHorizontalRectangle", "getSingleItemHorizontalRectangle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Grid {
                public static final int $stable = 0;

                @NotNull
                public static final Grid INSTANCE = new Grid();

                private Grid() {
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getOneColumnHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(1);
                    uaa.l(a);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemHorizontalRectangle() {
                    return lxl.c();
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemVerticalRectangle() {
                    return lxl.d();
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getThreeColumnsHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(3);
                    uaa.l(a);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getThreeColumnsVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.setColumns(3);
                    uaa.l(b);
                    return b;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getTwoColumnsHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    a.setColumns(2);
                    uaa.l(a);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getTwoColumnsVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.setColumns(2);
                    uaa.l(b);
                    return b;
                }
            }

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Keep
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout$Presets$VideosWidget$Row;", "", "<init>", "()V", "verticalRectangles", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getVerticalRectangles", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "horizontalRectangles", "getHorizontalRectangles", "verticalAnimatedThumbnailsRectangles", "getVerticalAnimatedThumbnailsRectangles", "singleItemVerticalRectangle", "getSingleItemVerticalRectangle", "singleItemHorizontalRectangle", "getSingleItemHorizontalRectangle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Row {
                public static final int $stable = 0;

                @NotNull
                public static final Row INSTANCE = new Row();

                private Row() {
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getHorizontalRectangles() {
                    BlazeWidgetLayout a = lxl.a();
                    uaa.l(a);
                    return a;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemHorizontalRectangle() {
                    return lxl.c();
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getSingleItemVerticalRectangle() {
                    return lxl.d();
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getVerticalAnimatedThumbnailsRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    b.setItemRatio(0.5625f);
                    BlazeWidgetItemImageStyle image = b.getWidgetItemStyle().getImage();
                    image.setRatio(Float.valueOf(0.5625f));
                    image.getAnimatedThumbnail().setEnabled(true);
                    BlazeWidgetItemImageAnimatedThumbnailStyle animatedThumbnail = image.getAnimatedThumbnail();
                    Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                    animatedThumbnail.setHorizontalAnimationTriggerPercentage((application$blazesdk_release == null || !cnb.i(application$blazesdk_release)) ? 0.3f : 0.15f);
                    return b;
                }

                @Keep
                @NotNull
                public final BlazeWidgetLayout getVerticalRectangles() {
                    BlazeWidgetLayout b = lxl.b();
                    uaa.l(b);
                    return b;
                }
            }

            private VideosWidget() {
            }
        }

        private Presets() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<BlazeDp> creator = BlazeDp.CREATOR;
            return new BlazeWidgetLayout(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readFloat(), BlazeInsets.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), BlazeWidgetItemStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazeWidgetLayout[i];
        }
    }

    public BlazeWidgetLayout(@NotNull BlazeDp blazeDp, @NotNull BlazeDp blazeDp2, float f, @NotNull BlazeInsets blazeInsets, int i, @Nullable Integer num, @NotNull BlazeWidgetItemStyle blazeWidgetItemStyle) {
        blazeDp.getClass();
        blazeDp2.getClass();
        blazeInsets.getClass();
        blazeWidgetItemStyle.getClass();
        this.horizontalItemsSpacing = blazeDp;
        this.verticalItemsSpacing = blazeDp2;
        this.itemRatio = f;
        this.margins = blazeInsets;
        this.columns = i;
        this.maxDisplayItemsCount = num;
        this.widgetItemStyle = blazeWidgetItemStyle;
    }

    public static /* synthetic */ BlazeWidgetLayout copy$default(BlazeWidgetLayout blazeWidgetLayout, BlazeDp blazeDp, BlazeDp blazeDp2, float f, BlazeInsets blazeInsets, int i, Integer num, BlazeWidgetItemStyle blazeWidgetItemStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            blazeDp = blazeWidgetLayout.horizontalItemsSpacing;
        }
        if ((i2 & 2) != 0) {
            blazeDp2 = blazeWidgetLayout.verticalItemsSpacing;
        }
        if ((i2 & 4) != 0) {
            f = blazeWidgetLayout.itemRatio;
        }
        if ((i2 & 8) != 0) {
            blazeInsets = blazeWidgetLayout.margins;
        }
        if ((i2 & 16) != 0) {
            i = blazeWidgetLayout.columns;
        }
        if ((i2 & 32) != 0) {
            num = blazeWidgetLayout.maxDisplayItemsCount;
        }
        if ((i2 & 64) != 0) {
            blazeWidgetItemStyle = blazeWidgetLayout.widgetItemStyle;
        }
        Integer num2 = num;
        BlazeWidgetItemStyle blazeWidgetItemStyle2 = blazeWidgetItemStyle;
        int i3 = i;
        float f2 = f;
        return blazeWidgetLayout.copy(blazeDp, blazeDp2, f2, blazeInsets, i3, num2, blazeWidgetItemStyle2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeDp getHorizontalItemsSpacing() {
        return this.horizontalItemsSpacing;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeDp getVerticalItemsSpacing() {
        return this.verticalItemsSpacing;
    }

    /* renamed from: component3, reason: from getter */
    public final float getItemRatio() {
        return this.itemRatio;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    /* renamed from: component5, reason: from getter */
    public final int getColumns() {
        return this.columns;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getMaxDisplayItemsCount() {
        return this.maxDisplayItemsCount;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BlazeWidgetItemStyle getWidgetItemStyle() {
        return this.widgetItemStyle;
    }

    @NotNull
    public final BlazeWidgetLayout copy(@NotNull BlazeDp horizontalItemsSpacing, @NotNull BlazeDp verticalItemsSpacing, float itemRatio, @NotNull BlazeInsets margins, int columns, @Nullable Integer maxDisplayItemsCount, @NotNull BlazeWidgetItemStyle widgetItemStyle) {
        horizontalItemsSpacing.getClass();
        verticalItemsSpacing.getClass();
        margins.getClass();
        widgetItemStyle.getClass();
        return new BlazeWidgetLayout(horizontalItemsSpacing, verticalItemsSpacing, itemRatio, margins, columns, maxDisplayItemsCount, widgetItemStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeWidgetLayout)) {
            return false;
        }
        BlazeWidgetLayout blazeWidgetLayout = (BlazeWidgetLayout) other;
        return Intrinsics.c(this.horizontalItemsSpacing, blazeWidgetLayout.horizontalItemsSpacing) && Intrinsics.c(this.verticalItemsSpacing, blazeWidgetLayout.verticalItemsSpacing) && Float.compare(this.itemRatio, blazeWidgetLayout.itemRatio) == 0 && Intrinsics.c(this.margins, blazeWidgetLayout.margins) && this.columns == blazeWidgetLayout.columns && Intrinsics.c(this.maxDisplayItemsCount, blazeWidgetLayout.maxDisplayItemsCount) && Intrinsics.c(this.widgetItemStyle, blazeWidgetLayout.widgetItemStyle);
    }

    public final int getColumns() {
        return this.columns;
    }

    @NotNull
    public final BlazeDp getHorizontalItemsSpacing() {
        return this.horizontalItemsSpacing;
    }

    public final float getItemRatio() {
        return this.itemRatio;
    }

    @NotNull
    public final BlazeInsets getMargins() {
        return this.margins;
    }

    @Nullable
    public final Integer getMaxDisplayItemsCount() {
        return this.maxDisplayItemsCount;
    }

    public final int getMaxDisplayItemsCountForSkeletons() {
        Integer num = this.maxDisplayItemsCount;
        if (num == null) {
            return 15;
        }
        return Math.min(15, Math.max(num.intValue(), 0));
    }

    public final int getUpdatedColumns() {
        Integer num = this.maxDisplayItemsCount;
        if (num != null && num.intValue() == 1) {
            return 1;
        }
        return this.columns;
    }

    @NotNull
    public final BlazeDp getVerticalItemsSpacing() {
        return this.verticalItemsSpacing;
    }

    @NotNull
    public final BlazeWidgetItemStyle getWidgetItemStyle() {
        return this.widgetItemStyle;
    }

    public int hashCode() {
        int e = l4a.e(this.columns, (this.margins.hashCode() + g7a.o(this.itemRatio, s6a.n(this.verticalItemsSpacing, this.horizontalItemsSpacing.hashCode() * 31))) * 31);
        Integer num = this.maxDisplayItemsCount;
        return this.widgetItemStyle.hashCode() + ((e + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final void setColumns(int i) {
        this.columns = i;
    }

    public final void setHorizontalItemsSpacing(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.horizontalItemsSpacing = blazeDp;
    }

    public final void setItemRatio(float f) {
        this.itemRatio = f;
    }

    public final void setMargins(@NotNull BlazeInsets blazeInsets) {
        blazeInsets.getClass();
        this.margins = blazeInsets;
    }

    public final void setMaxDisplayItemsCount(@Nullable Integer num) {
        this.maxDisplayItemsCount = num;
    }

    public final void setVerticalItemsSpacing(@NotNull BlazeDp blazeDp) {
        blazeDp.getClass();
        this.verticalItemsSpacing = blazeDp;
    }

    public final void setWidgetItemStyle(@NotNull BlazeWidgetItemStyle blazeWidgetItemStyle) {
        blazeWidgetItemStyle.getClass();
        this.widgetItemStyle = blazeWidgetItemStyle;
    }

    @NotNull
    public String toString() {
        return "BlazeWidgetLayout(horizontalItemsSpacing=" + this.horizontalItemsSpacing + ", verticalItemsSpacing=" + this.verticalItemsSpacing + ", itemRatio=" + this.itemRatio + ", margins=" + this.margins + ", columns=" + this.columns + ", maxDisplayItemsCount=" + this.maxDisplayItemsCount + ", widgetItemStyle=" + this.widgetItemStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.horizontalItemsSpacing.writeToParcel(dest, flags);
        this.verticalItemsSpacing.writeToParcel(dest, flags);
        dest.writeFloat(this.itemRatio);
        this.margins.writeToParcel(dest, flags);
        dest.writeInt(this.columns);
        Integer num = this.maxDisplayItemsCount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            b6a.h(dest, num);
        }
        this.widgetItemStyle.writeToParcel(dest, flags);
    }

    public static /* synthetic */ void getMaxDisplayItemsCountForSkeletons$annotations() {
    }

    public static /* synthetic */ void getUpdatedColumns$annotations() {
    }
}
