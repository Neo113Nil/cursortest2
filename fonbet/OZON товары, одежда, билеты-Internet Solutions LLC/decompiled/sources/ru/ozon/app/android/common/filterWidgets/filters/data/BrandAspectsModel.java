package ru.ozon.app.android.common.filterWidgets.filters.data;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Ql.c;
import T7.P;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b%\b\u0080\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b1\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b6\u00105R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/data/BrandAspectsModel;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "rightButton", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "rightIcon", "", "scrollEnabled", "", "Lru/ozon/app/android/common/filterWidgets/filters/data/FiltersDTO$Section$Filter$AspectBrandFilter$AspectBrand;", "aspects", "originalUrl", "showSeparator", "", "maxRowsCount", "totalValuesCount", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/icon/IconDTO;ZLjava/util/List;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Z", "getScrollEnabled", "()Z", "Ljava/util/List;", "getAspects", "()Ljava/util/List;", "getOriginalUrl", "getShowSeparator", "Ljava/lang/Integer;", "getMaxRowsCount", "()Ljava/lang/Integer;", "getTotalValuesCount", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandAspectsModel {
    private final AtomActionDTO action;

    @NotNull
    private final List<FiltersDTO.Section.Filter.AspectBrandFilter.AspectBrand> aspects;
    private final Integer maxRowsCount;

    @NotNull
    private final String originalUrl;
    private final ButtonV3DTO rightButton;
    private final IconDTO rightIcon;
    private final boolean scrollEnabled;
    private final boolean showSeparator;
    private final String title;
    private final Integer totalValuesCount;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BrandAspectsModel(String str, AtomActionDTO atomActionDTO, ButtonV3DTO buttonV3DTO, IconDTO iconDTO, boolean z11, @NotNull List<FiltersDTO.Section.Filter.AspectBrandFilter.AspectBrand> aspects, @NotNull String originalUrl, boolean z12, Integer num, Integer num2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(aspects, "aspects");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.title = str;
        this.action = atomActionDTO;
        this.rightButton = buttonV3DTO;
        this.rightIcon = iconDTO;
        this.scrollEnabled = z11;
        this.aspects = aspects;
        this.originalUrl = originalUrl;
        this.showSeparator = z12;
        this.maxRowsCount = num;
        this.totalValuesCount = num2;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandAspectsModel)) {
            return false;
        }
        BrandAspectsModel brandAspectsModel = (BrandAspectsModel) other;
        return Intrinsics.d(this.title, brandAspectsModel.title) && Intrinsics.d(this.action, brandAspectsModel.action) && Intrinsics.d(this.rightButton, brandAspectsModel.rightButton) && Intrinsics.d(this.rightIcon, brandAspectsModel.rightIcon) && this.scrollEnabled == brandAspectsModel.scrollEnabled && Intrinsics.d(this.aspects, brandAspectsModel.aspects) && Intrinsics.d(this.originalUrl, brandAspectsModel.originalUrl) && this.showSeparator == brandAspectsModel.showSeparator && Intrinsics.d(this.maxRowsCount, brandAspectsModel.maxRowsCount) && Intrinsics.d(this.totalValuesCount, brandAspectsModel.totalValuesCount) && Intrinsics.d(this.trackingInfo, brandAspectsModel.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final List<FiltersDTO.Section.Filter.AspectBrandFilter.AspectBrand> getAspects() {
        return this.aspects;
    }

    public final Integer getMaxRowsCount() {
        return this.maxRowsCount;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final ButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    public final IconDTO getRightIcon() {
        return this.rightIcon;
    }

    public final boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    public final boolean getShowSeparator() {
        return this.showSeparator;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotalValuesCount() {
        return this.totalValuesCount;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.rightButton;
        int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        IconDTO iconDTO = this.rightIcon;
        int a11 = C3532b.a(g.a(g.b(C3532b.a((hashCode3 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.scrollEnabled), 31, this.aspects), 31, this.originalUrl), 31, this.showSeparator);
        Integer num = this.maxRowsCount;
        int hashCode4 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalValuesCount;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        AtomActionDTO atomActionDTO = this.action;
        ButtonV3DTO buttonV3DTO = this.rightButton;
        IconDTO iconDTO = this.rightIcon;
        boolean z11 = this.scrollEnabled;
        List<FiltersDTO.Section.Filter.AspectBrandFilter.AspectBrand> list = this.aspects;
        String str2 = this.originalUrl;
        boolean z12 = this.showSeparator;
        Integer num = this.maxRowsCount;
        Integer num2 = this.totalValuesCount;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = c.c("BrandAspectsModel(title=", str, ", action=", atomActionDTO, ", rightButton=");
        c11.append(buttonV3DTO);
        c11.append(", rightIcon=");
        c11.append(iconDTO);
        c11.append(", scrollEnabled=");
        c11.append(z11);
        c11.append(", aspects=");
        c11.append(list);
        c11.append(", originalUrl=");
        C2880a.c(str2, ", showSeparator=", ", maxRowsCount=", c11, z12);
        Ef0.c.e(c11, num, ", totalValuesCount=", num2, ", trackingInfo=");
        return P.f(c11, map, ")");
    }
}
