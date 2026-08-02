package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.data;

import G.g;
import Ih.a;
import Kk.C3532b;
import Pk0.c;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0081\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010-J\t\u0010B\u001a\u00020\u0012HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\t\u0010G\u001a\u00020\u001aHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001cHÆ\u0003J¾\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u001a2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\u0010HÖ\u0001J\t\u0010N\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006O"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTO;", "", "priceText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "deliveryText", "deliveryInfoIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/Spacers;", "contentSpacers", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/ContentSpacers;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "widgetUpdatePeriod", "", "progress", "", "progressGradient", "", "borderColor", "eclipseColor", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "shouldHideProgressBar", "", "timerDeadline", "Lorg/joda/time/DateTime;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/Spacers;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/ContentSpacers;Lru/ozon/uni/atoms/data/AtomActionDTO;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLorg/joda/time/DateTime;)V", "getPriceText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDeliveryText", "getDeliveryInfoIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/Spacers;", "getContentSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/ContentSpacers;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getWidgetUpdatePeriod", "()J", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgressGradient", "()Ljava/lang/String;", "getBorderColor", "getEclipseColor", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "getShouldHideProgressBar", "()Z", "getTimerDeadline", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/Spacers;Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/ContentSpacers;Lru/ozon/uni/atoms/data/AtomActionDTO;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLorg/joda/time/DateTime;)Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v3/data/DeliveryWidgetV3DTO;", "equals", "other", "hashCode", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DeliveryWidgetV3DTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final String borderColor;

    @NotNull
    private final ContentSpacers contentSpacers;

    @NotNull
    private final CommonAtomIconDTO deliveryInfoIcon;
    private final TextDTO deliveryText;
    private final String eclipseColor;

    @NotNull
    private final TextDTO priceText;
    private final Integer progress;

    @NotNull
    private final String progressGradient;
    private final boolean shouldHideProgressBar;

    @NotNull
    private final Spacers spacers;
    private final DateTime timerDeadline;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final long widgetUpdatePeriod;

    public DeliveryWidgetV3DTO(@NotNull TextDTO priceText, TextDTO textDTO, @NotNull CommonAtomIconDTO deliveryInfoIcon, @NotNull Spacers spacers, @NotNull ContentSpacers contentSpacers, @NotNull AtomActionDTO action, long j11, Integer num, @NotNull String progressGradient, String str, String str2, String str3, Map<String, TokenizedTrackingInfo> map, boolean z11, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(deliveryInfoIcon, "deliveryInfoIcon");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(contentSpacers, "contentSpacers");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(progressGradient, "progressGradient");
        this.priceText = priceText;
        this.deliveryText = textDTO;
        this.deliveryInfoIcon = deliveryInfoIcon;
        this.spacers = spacers;
        this.contentSpacers = contentSpacers;
        this.action = action;
        this.widgetUpdatePeriod = j11;
        this.progress = num;
        this.progressGradient = progressGradient;
        this.borderColor = str;
        this.eclipseColor = str2;
        this.backgroundColor = str3;
        this.trackingInfo = map;
        this.shouldHideProgressBar = z11;
        this.timerDeadline = dateTime;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getPriceText() {
        return this.priceText;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component11, reason: from getter */
    public final String getEclipseColor() {
        return this.eclipseColor;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.trackingInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShouldHideProgressBar() {
        return this.shouldHideProgressBar;
    }

    /* renamed from: component15, reason: from getter */
    public final DateTime getTimerDeadline() {
        return this.timerDeadline;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getDeliveryText() {
        return this.deliveryText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonAtomIconDTO getDeliveryInfoIcon() {
        return this.deliveryInfoIcon;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ContentSpacers getContentSpacers() {
        return this.contentSpacers;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getProgress() {
        return this.progress;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getProgressGradient() {
        return this.progressGradient;
    }

    @NotNull
    public final DeliveryWidgetV3DTO copy(@NotNull TextDTO priceText, TextDTO deliveryText, @NotNull CommonAtomIconDTO deliveryInfoIcon, @NotNull Spacers spacers, @NotNull ContentSpacers contentSpacers, @NotNull AtomActionDTO action, long widgetUpdatePeriod, Integer progress, @NotNull String progressGradient, String borderColor, String eclipseColor, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, boolean shouldHideProgressBar, DateTime timerDeadline) {
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        Intrinsics.checkNotNullParameter(deliveryInfoIcon, "deliveryInfoIcon");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(contentSpacers, "contentSpacers");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(progressGradient, "progressGradient");
        return new DeliveryWidgetV3DTO(priceText, deliveryText, deliveryInfoIcon, spacers, contentSpacers, action, widgetUpdatePeriod, progress, progressGradient, borderColor, eclipseColor, backgroundColor, trackingInfo, shouldHideProgressBar, timerDeadline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryWidgetV3DTO)) {
            return false;
        }
        DeliveryWidgetV3DTO deliveryWidgetV3DTO = (DeliveryWidgetV3DTO) other;
        return Intrinsics.d(this.priceText, deliveryWidgetV3DTO.priceText) && Intrinsics.d(this.deliveryText, deliveryWidgetV3DTO.deliveryText) && Intrinsics.d(this.deliveryInfoIcon, deliveryWidgetV3DTO.deliveryInfoIcon) && Intrinsics.d(this.spacers, deliveryWidgetV3DTO.spacers) && Intrinsics.d(this.contentSpacers, deliveryWidgetV3DTO.contentSpacers) && Intrinsics.d(this.action, deliveryWidgetV3DTO.action) && this.widgetUpdatePeriod == deliveryWidgetV3DTO.widgetUpdatePeriod && Intrinsics.d(this.progress, deliveryWidgetV3DTO.progress) && Intrinsics.d(this.progressGradient, deliveryWidgetV3DTO.progressGradient) && Intrinsics.d(this.borderColor, deliveryWidgetV3DTO.borderColor) && Intrinsics.d(this.eclipseColor, deliveryWidgetV3DTO.eclipseColor) && Intrinsics.d(this.backgroundColor, deliveryWidgetV3DTO.backgroundColor) && Intrinsics.d(this.trackingInfo, deliveryWidgetV3DTO.trackingInfo) && this.shouldHideProgressBar == deliveryWidgetV3DTO.shouldHideProgressBar && Intrinsics.d(this.timerDeadline, deliveryWidgetV3DTO.timerDeadline);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final ContentSpacers getContentSpacers() {
        return this.contentSpacers;
    }

    @NotNull
    public final CommonAtomIconDTO getDeliveryInfoIcon() {
        return this.deliveryInfoIcon;
    }

    public final TextDTO getDeliveryText() {
        return this.deliveryText;
    }

    public final String getEclipseColor() {
        return this.eclipseColor;
    }

    @NotNull
    public final TextDTO getPriceText() {
        return this.priceText;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getProgressGradient() {
        return this.progressGradient;
    }

    public final boolean getShouldHideProgressBar() {
        return this.shouldHideProgressBar;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final DateTime getTimerDeadline() {
        return this.timerDeadline;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final long getWidgetUpdatePeriod() {
        return this.widgetUpdatePeriod;
    }

    public int hashCode() {
        int hashCode = this.priceText.hashCode() * 31;
        TextDTO textDTO = this.deliveryText;
        int a11 = c.a(a.b(this.action, (this.contentSpacers.hashCode() + ((this.spacers.hashCode() + ((this.deliveryInfoIcon.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31, this.widgetUpdatePeriod);
        Integer num = this.progress;
        int a12 = g.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.progressGradient);
        String str = this.borderColor;
        int hashCode2 = (a12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eclipseColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int a13 = C3532b.a((hashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31, this.shouldHideProgressBar);
        DateTime dateTime = this.timerDeadline;
        return a13 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.priceText;
        TextDTO textDTO2 = this.deliveryText;
        CommonAtomIconDTO commonAtomIconDTO = this.deliveryInfoIcon;
        Spacers spacers = this.spacers;
        ContentSpacers contentSpacers = this.contentSpacers;
        AtomActionDTO atomActionDTO = this.action;
        long j11 = this.widgetUpdatePeriod;
        Integer num = this.progress;
        String str = this.progressGradient;
        String str2 = this.borderColor;
        String str3 = this.eclipseColor;
        String str4 = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        boolean z11 = this.shouldHideProgressBar;
        DateTime dateTime = this.timerDeadline;
        StringBuilder g10 = D3.g.g("DeliveryWidgetV3DTO(priceText=", textDTO, ", deliveryText=", textDTO2, ", deliveryInfoIcon=");
        g10.append(commonAtomIconDTO);
        g10.append(", spacers=");
        g10.append(spacers);
        g10.append(", contentSpacers=");
        g10.append(contentSpacers);
        g10.append(", action=");
        g10.append(atomActionDTO);
        g10.append(", widgetUpdatePeriod=");
        g10.append(j11);
        g10.append(", progress=");
        g10.append(num);
        Nh.a.h(g10, ", progressGradient=", str, ", borderColor=", str2);
        Nh.a.h(g10, ", eclipseColor=", str3, ", backgroundColor=", str4);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(", shouldHideProgressBar=");
        g10.append(z11);
        g10.append(", timerDeadline=");
        g10.append(dateTime);
        g10.append(")");
        return g10.toString();
    }
}
