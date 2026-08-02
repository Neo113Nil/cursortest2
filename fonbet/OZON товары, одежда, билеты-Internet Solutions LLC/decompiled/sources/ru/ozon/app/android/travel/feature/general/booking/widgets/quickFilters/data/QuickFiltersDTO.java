package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data;

import B0.A0;
import G.g;
import Kk.C3532b;
import Pk0.f;
import Sc.InterfaceC3999a;
import V.e;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IconChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.IndicatorLabelChipDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0081\b\u0018\u00002\u00020\u0001:\u0004HIJKB\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0019HÆ\u0003J´\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0012HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001c\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010(R\u001c\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010-\u001a\u0004\b\u0014\u0010(R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b0\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006L"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;", "", "backgroundColor", "", "progressBarColor", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$BarColor;", "viewTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "skeletonsSettings", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$SkeletonsSettings;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "items", "", "isProgressBarShown", "", "autoScrollIndex", "", "shouldHideFiltersOnScroll", "isDynamicSticky", "bottomPadding", "stickyBehavior", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;", "asyncBehavior", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$BarColor;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$SkeletonsSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ZLjava/lang/Integer;ZZLjava/lang/Integer;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getProgressBarColor", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$BarColor;", "getViewTrackingInfo", "()Ljava/util/Map;", "getSkeletonsSettings", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$SkeletonsSettings;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getItems", "()Ljava/util/List;", "()Z", "getAutoScrollIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShouldHideFiltersOnScroll$annotations", "()V", "getShouldHideFiltersOnScroll", "isDynamicSticky$annotations", "getBottomPadding", "getStickyBehavior", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;", "getAsyncBehavior", "()Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$BarColor;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$SkeletonsSettings;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ZLjava/lang/Integer;ZZLjava/lang/Integer;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;", "equals", "other", "hashCode", "toString", "Divider", "BarColor", "SkeletonsSettings", "StickyBehavior", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QuickFiltersDTO {
    private final AsyncActionDTO asyncBehavior;
    private final Integer autoScrollIndex;
    private final String backgroundColor;
    private final Integer bottomPadding;
    private final boolean isDynamicSticky;
    private final boolean isProgressBarShown;

    @NotNull
    private final List<Object> items;
    private final BarColor progressBarColor;
    private final boolean shouldHideFiltersOnScroll;
    private final SkeletonsSettings skeletonsSettings;

    @EnumNullFallback
    private final StickyBehavior stickyBehavior;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$BarColor;", "", "solidColor", "", "gradientAccentColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSolidColor", "()Ljava/lang/String;", "getGradientAccentColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BarColor {
        private final String gradientAccentColor;
        private final String solidColor;

        public BarColor(String str, String str2) {
            this.solidColor = str;
            this.gradientAccentColor = str2;
        }

        public static /* synthetic */ BarColor copy$default(BarColor barColor, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = barColor.solidColor;
            }
            if ((i11 & 2) != 0) {
                str2 = barColor.gradientAccentColor;
            }
            return barColor.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSolidColor() {
            return this.solidColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGradientAccentColor() {
            return this.gradientAccentColor;
        }

        @NotNull
        public final BarColor copy(String solidColor, String gradientAccentColor) {
            return new BarColor(solidColor, gradientAccentColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BarColor)) {
                return false;
            }
            BarColor barColor = (BarColor) other;
            return Intrinsics.d(this.solidColor, barColor.solidColor) && Intrinsics.d(this.gradientAccentColor, barColor.gradientAccentColor);
        }

        public final String getGradientAccentColor() {
            return this.gradientAccentColor;
        }

        public final String getSolidColor() {
            return this.solidColor;
        }

        public int hashCode() {
            String str = this.solidColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.gradientAccentColor;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("BarColor(solidColor=", this.solidColor, ", gradientAccentColor=", this.gradientAccentColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$Divider;", "", "color", "", "<init>", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Divider {

        @NotNull
        private final String color;

        public Divider(@NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
        }

        public static /* synthetic */ Divider copy$default(Divider divider, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = divider.color;
            }
            return divider.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final Divider copy(@NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new Divider(color);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Divider) && Intrinsics.d(this.color, ((Divider) other).color);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public int hashCode() {
            return this.color.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Divider(color=", this.color, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$SkeletonsSettings;", "", "height", "", "widthPatterns", "", "<init>", "(Ljava/lang/Integer;[I)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidthPatterns", "()[I", "equals", "", "other", "hashCode", "component1", "component2", "copy", "(Ljava/lang/Integer;[I)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$SkeletonsSettings;", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SkeletonsSettings {
        private final Integer height;
        private final int[] widthPatterns;

        public SkeletonsSettings(Integer num, int[] iArr) {
            this.height = num;
            this.widthPatterns = iArr;
        }

        public static /* synthetic */ SkeletonsSettings copy$default(SkeletonsSettings skeletonsSettings, Integer num, int[] iArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = skeletonsSettings.height;
            }
            if ((i11 & 2) != 0) {
                iArr = skeletonsSettings.widthPatterns;
            }
            return skeletonsSettings.copy(num, iArr);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        /* renamed from: component2, reason: from getter */
        public final int[] getWidthPatterns() {
            return this.widthPatterns;
        }

        @NotNull
        public final SkeletonsSettings copy(Integer height, int[] widthPatterns) {
            return new SkeletonsSettings(height, widthPatterns);
        }

        public boolean equals(Object other) {
            if (other == null || !other.getClass().equals(SkeletonsSettings.class)) {
                return false;
            }
            SkeletonsSettings skeletonsSettings = (SkeletonsSettings) other;
            return Intrinsics.d(this.height, skeletonsSettings.height) && Arrays.equals(this.widthPatterns, skeletonsSettings.widthPatterns);
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final int[] getWidthPatterns() {
            return this.widthPatterns;
        }

        public int hashCode() {
            Integer num = this.height;
            return Arrays.hashCode(this.widthPatterns) + ((155 + (num != null ? num.intValue() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "SkeletonsSettings(height=" + this.height + ", widthPatterns=" + Arrays.toString(this.widthPatterns) + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "STATIC_HEADER", "STATIC_STICKY", "DYNAMIC_STICKY", "NOT_STICKY", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StickyBehavior {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StickyBehavior[] $VALUES;

        @i(name = "STATIC_HEADER")
        public static final StickyBehavior STATIC_HEADER = new StickyBehavior("STATIC_HEADER", 0);

        @i(name = "STATIC_STICKY")
        public static final StickyBehavior STATIC_STICKY = new StickyBehavior("STATIC_STICKY", 1);

        @i(name = "DYNAMIC_STICKY")
        public static final StickyBehavior DYNAMIC_STICKY = new StickyBehavior("DYNAMIC_STICKY", 2);

        @i(name = "NOT_STICKY")
        public static final StickyBehavior NOT_STICKY = new StickyBehavior("NOT_STICKY", 3);

        private static final /* synthetic */ StickyBehavior[] $values() {
            return new StickyBehavior[]{STATIC_HEADER, STATIC_STICKY, DYNAMIC_STICKY, NOT_STICKY};
        }

        static {
            StickyBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StickyBehavior(String str, int i11) {
        }

        public static StickyBehavior valueOf(String str) {
            return (StickyBehavior) Enum.valueOf(StickyBehavior.class, str);
        }

        public static StickyBehavior[] values() {
            return (StickyBehavior[]) $VALUES.clone();
        }
    }

    public QuickFiltersDTO(String str, BarColor barColor, Map<String, TokenizedTrackingInfo> map, SkeletonsSettings skeletonsSettings, TextDTO textDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "chip", type = ChipDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "indicatorChip", type = IndicatorLabelChipDTO.class), @ProtoOneOfSignature(name = "iconChip", type = IconChipDTO.class), @ProtoOneOfSignature(name = "divider", type = Divider.class), @ProtoOneOfSignature(name = "tagButton", type = TagButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, boolean z11, Integer num, boolean z12, boolean z13, Integer num2, StickyBehavior stickyBehavior, AsyncActionDTO asyncActionDTO) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.backgroundColor = str;
        this.progressBarColor = barColor;
        this.viewTrackingInfo = map;
        this.skeletonsSettings = skeletonsSettings;
        this.title = textDTO;
        this.items = items;
        this.isProgressBarShown = z11;
        this.autoScrollIndex = num;
        this.shouldHideFiltersOnScroll = z12;
        this.isDynamicSticky = z13;
        this.bottomPadding = num2;
        this.stickyBehavior = stickyBehavior;
        this.asyncBehavior = asyncActionDTO;
    }

    public static /* synthetic */ QuickFiltersDTO copy$default(QuickFiltersDTO quickFiltersDTO, String str, BarColor barColor, Map map, SkeletonsSettings skeletonsSettings, TextDTO textDTO, List list, boolean z11, Integer num, boolean z12, boolean z13, Integer num2, StickyBehavior stickyBehavior, AsyncActionDTO asyncActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = quickFiltersDTO.backgroundColor;
        }
        return quickFiltersDTO.copy(str, (i11 & 2) != 0 ? quickFiltersDTO.progressBarColor : barColor, (i11 & 4) != 0 ? quickFiltersDTO.viewTrackingInfo : map, (i11 & 8) != 0 ? quickFiltersDTO.skeletonsSettings : skeletonsSettings, (i11 & 16) != 0 ? quickFiltersDTO.title : textDTO, (i11 & 32) != 0 ? quickFiltersDTO.items : list, (i11 & 64) != 0 ? quickFiltersDTO.isProgressBarShown : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? quickFiltersDTO.autoScrollIndex : num, (i11 & 256) != 0 ? quickFiltersDTO.shouldHideFiltersOnScroll : z12, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? quickFiltersDTO.isDynamicSticky : z13, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? quickFiltersDTO.bottomPadding : num2, (i11 & 2048) != 0 ? quickFiltersDTO.stickyBehavior : stickyBehavior, (i11 & 4096) != 0 ? quickFiltersDTO.asyncBehavior : asyncActionDTO);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getShouldHideFiltersOnScroll$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void isDynamicSticky$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsDynamicSticky() {
        return this.isDynamicSticky;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component12, reason: from getter */
    public final StickyBehavior getStickyBehavior() {
        return this.stickyBehavior;
    }

    /* renamed from: component13, reason: from getter */
    public final AsyncActionDTO getAsyncBehavior() {
        return this.asyncBehavior;
    }

    /* renamed from: component2, reason: from getter */
    public final BarColor getProgressBarColor() {
        return this.progressBarColor;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.viewTrackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final SkeletonsSettings getSkeletonsSettings() {
        return this.skeletonsSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Object> component6() {
        return this.items;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsProgressBarShown() {
        return this.isProgressBarShown;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getAutoScrollIndex() {
        return this.autoScrollIndex;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShouldHideFiltersOnScroll() {
        return this.shouldHideFiltersOnScroll;
    }

    @NotNull
    public final QuickFiltersDTO copy(String backgroundColor, BarColor progressBarColor, Map<String, TokenizedTrackingInfo> viewTrackingInfo, SkeletonsSettings skeletonsSettings, TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "chip", type = ChipDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "indicatorChip", type = IndicatorLabelChipDTO.class), @ProtoOneOfSignature(name = "iconChip", type = IconChipDTO.class), @ProtoOneOfSignature(name = "divider", type = Divider.class), @ProtoOneOfSignature(name = "tagButton", type = TagButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, boolean isProgressBarShown, Integer autoScrollIndex, boolean shouldHideFiltersOnScroll, boolean isDynamicSticky, Integer bottomPadding, StickyBehavior stickyBehavior, AsyncActionDTO asyncBehavior) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new QuickFiltersDTO(backgroundColor, progressBarColor, viewTrackingInfo, skeletonsSettings, title, items, isProgressBarShown, autoScrollIndex, shouldHideFiltersOnScroll, isDynamicSticky, bottomPadding, stickyBehavior, asyncBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickFiltersDTO)) {
            return false;
        }
        QuickFiltersDTO quickFiltersDTO = (QuickFiltersDTO) other;
        return Intrinsics.d(this.backgroundColor, quickFiltersDTO.backgroundColor) && Intrinsics.d(this.progressBarColor, quickFiltersDTO.progressBarColor) && Intrinsics.d(this.viewTrackingInfo, quickFiltersDTO.viewTrackingInfo) && Intrinsics.d(this.skeletonsSettings, quickFiltersDTO.skeletonsSettings) && Intrinsics.d(this.title, quickFiltersDTO.title) && Intrinsics.d(this.items, quickFiltersDTO.items) && this.isProgressBarShown == quickFiltersDTO.isProgressBarShown && Intrinsics.d(this.autoScrollIndex, quickFiltersDTO.autoScrollIndex) && this.shouldHideFiltersOnScroll == quickFiltersDTO.shouldHideFiltersOnScroll && this.isDynamicSticky == quickFiltersDTO.isDynamicSticky && Intrinsics.d(this.bottomPadding, quickFiltersDTO.bottomPadding) && this.stickyBehavior == quickFiltersDTO.stickyBehavior && Intrinsics.d(this.asyncBehavior, quickFiltersDTO.asyncBehavior);
    }

    public final AsyncActionDTO getAsyncBehavior() {
        return this.asyncBehavior;
    }

    public final Integer getAutoScrollIndex() {
        return this.autoScrollIndex;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final BarColor getProgressBarColor() {
        return this.progressBarColor;
    }

    public final boolean getShouldHideFiltersOnScroll() {
        return this.shouldHideFiltersOnScroll;
    }

    public final SkeletonsSettings getSkeletonsSettings() {
        return this.skeletonsSettings;
    }

    public final StickyBehavior getStickyBehavior() {
        return this.stickyBehavior;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
        return this.viewTrackingInfo;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BarColor barColor = this.progressBarColor;
        int hashCode2 = (hashCode + (barColor == null ? 0 : barColor.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        SkeletonsSettings skeletonsSettings = this.skeletonsSettings;
        int hashCode4 = (hashCode3 + (skeletonsSettings == null ? 0 : skeletonsSettings.hashCode())) * 31;
        TextDTO textDTO = this.title;
        int a11 = C3532b.a(g.b((hashCode4 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.items), 31, this.isProgressBarShown);
        Integer num = this.autoScrollIndex;
        int a12 = C3532b.a(C3532b.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.shouldHideFiltersOnScroll), 31, this.isDynamicSticky);
        Integer num2 = this.bottomPadding;
        int hashCode5 = (a12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        StickyBehavior stickyBehavior = this.stickyBehavior;
        int hashCode6 = (hashCode5 + (stickyBehavior == null ? 0 : stickyBehavior.hashCode())) * 31;
        AsyncActionDTO asyncActionDTO = this.asyncBehavior;
        return hashCode6 + (asyncActionDTO != null ? asyncActionDTO.hashCode() : 0);
    }

    public final boolean isDynamicSticky() {
        return this.isDynamicSticky;
    }

    public final boolean isProgressBarShown() {
        return this.isProgressBarShown;
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        BarColor barColor = this.progressBarColor;
        Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
        SkeletonsSettings skeletonsSettings = this.skeletonsSettings;
        TextDTO textDTO = this.title;
        List<Object> list = this.items;
        boolean z11 = this.isProgressBarShown;
        Integer num = this.autoScrollIndex;
        boolean z12 = this.shouldHideFiltersOnScroll;
        boolean z13 = this.isDynamicSticky;
        Integer num2 = this.bottomPadding;
        StickyBehavior stickyBehavior = this.stickyBehavior;
        AsyncActionDTO asyncActionDTO = this.asyncBehavior;
        StringBuilder sb2 = new StringBuilder("QuickFiltersDTO(backgroundColor=");
        sb2.append(str);
        sb2.append(", progressBarColor=");
        sb2.append(barColor);
        sb2.append(", viewTrackingInfo=");
        sb2.append(map);
        sb2.append(", skeletonsSettings=");
        sb2.append(skeletonsSettings);
        sb2.append(", title=");
        Tl.a.e(sb2, textDTO, ", items=", list, ", isProgressBarShown=");
        sb2.append(z11);
        sb2.append(", autoScrollIndex=");
        sb2.append(num);
        sb2.append(", shouldHideFiltersOnScroll=");
        f.c(", isDynamicSticky=", ", bottomPadding=", sb2, z12, z13);
        sb2.append(num2);
        sb2.append(", stickyBehavior=");
        sb2.append(stickyBehavior);
        sb2.append(", asyncBehavior=");
        sb2.append(asyncActionDTO);
        sb2.append(")");
        return sb2.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public QuickFiltersDTO(java.lang.String r17, ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO.BarColor r18, java.util.Map r19, ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO.SkeletonsSettings r20, ru.ozon.uni.atoms.data.text.TextDTO r21, java.util.List r22, boolean r23, java.lang.Integer r24, boolean r25, boolean r26, java.lang.Integer r27, ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO.StickyBehavior r28, ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 32
            if (r1 == 0) goto La
            kotlin.collections.K r1 = kotlin.collections.K.f71697a
            r8 = r1
            goto Lc
        La:
            r8 = r22
        Lc:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L13
            r9 = r2
            goto L15
        L13:
            r9 = r23
        L15:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L1b
            r11 = r2
            goto L1d
        L1b:
            r11 = r25
        L1d:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L37
            r12 = r2
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r10 = r24
            r13 = r27
            r14 = r28
            r15 = r29
            r2 = r16
            goto L4d
        L37:
            r12 = r26
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r10 = r24
            r13 = r27
            r14 = r28
            r15 = r29
        L4d:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO.<init>(java.lang.String, ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO$BarColor, java.util.Map, ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO$SkeletonsSettings, ru.ozon.uni.atoms.data.text.TextDTO, java.util.List, boolean, java.lang.Integer, boolean, boolean, java.lang.Integer, ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO$StickyBehavior, ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
