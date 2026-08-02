package ru.ozon.app.android.tabbar.data;

import G.g;
import N3.C3660k;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "icon", "behavior", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", ImagesContract.URL, "longTapLink", "animation", "Lru/ozon/app/android/tabbar/data/TabConfigAnimations;", "staticIndicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/tabbar/data/TabConfigAnimations;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "getBehavior", "()Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "getUrl", "getLongTapLink", "getAnimation", "()Lru/ozon/app/android/tabbar/data/TabConfigAnimations;", "getStaticIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TabConfigDTO {
    private final TabConfigAnimations animation;

    @NotNull
    private final BottomNavigationBehavior behavior;

    @NotNull
    private final String icon;
    private final String longTapLink;
    private final IndicatorDTO staticIndicator;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    public TabConfigDTO(@NotNull String title, @NotNull String icon, @NotNull BottomNavigationBehavior behavior, @NotNull String url, String str, TabConfigAnimations tabConfigAnimations, IndicatorDTO indicatorDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(url, "url");
        this.title = title;
        this.icon = icon;
        this.behavior = behavior;
        this.url = url;
        this.longTapLink = str;
        this.animation = tabConfigAnimations;
        this.staticIndicator = indicatorDTO;
    }

    public static /* synthetic */ TabConfigDTO copy$default(TabConfigDTO tabConfigDTO, String str, String str2, BottomNavigationBehavior bottomNavigationBehavior, String str3, String str4, TabConfigAnimations tabConfigAnimations, IndicatorDTO indicatorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabConfigDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = tabConfigDTO.icon;
        }
        if ((i11 & 4) != 0) {
            bottomNavigationBehavior = tabConfigDTO.behavior;
        }
        if ((i11 & 8) != 0) {
            str3 = tabConfigDTO.url;
        }
        if ((i11 & 16) != 0) {
            str4 = tabConfigDTO.longTapLink;
        }
        if ((i11 & 32) != 0) {
            tabConfigAnimations = tabConfigDTO.animation;
        }
        if ((i11 & 64) != 0) {
            indicatorDTO = tabConfigDTO.staticIndicator;
        }
        TabConfigAnimations tabConfigAnimations2 = tabConfigAnimations;
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        String str5 = str4;
        BottomNavigationBehavior bottomNavigationBehavior2 = bottomNavigationBehavior;
        return tabConfigDTO.copy(str, str2, bottomNavigationBehavior2, str3, str5, tabConfigAnimations2, indicatorDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BottomNavigationBehavior getBehavior() {
        return this.behavior;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLongTapLink() {
        return this.longTapLink;
    }

    /* renamed from: component6, reason: from getter */
    public final TabConfigAnimations getAnimation() {
        return this.animation;
    }

    /* renamed from: component7, reason: from getter */
    public final IndicatorDTO getStaticIndicator() {
        return this.staticIndicator;
    }

    @NotNull
    public final TabConfigDTO copy(@NotNull String title, @NotNull String icon, @NotNull BottomNavigationBehavior behavior, @NotNull String url, String longTapLink, TabConfigAnimations animation, IndicatorDTO staticIndicator) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(url, "url");
        return new TabConfigDTO(title, icon, behavior, url, longTapLink, animation, staticIndicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabConfigDTO)) {
            return false;
        }
        TabConfigDTO tabConfigDTO = (TabConfigDTO) other;
        return Intrinsics.d(this.title, tabConfigDTO.title) && Intrinsics.d(this.icon, tabConfigDTO.icon) && this.behavior == tabConfigDTO.behavior && Intrinsics.d(this.url, tabConfigDTO.url) && Intrinsics.d(this.longTapLink, tabConfigDTO.longTapLink) && this.animation == tabConfigDTO.animation && Intrinsics.d(this.staticIndicator, tabConfigDTO.staticIndicator);
    }

    public final TabConfigAnimations getAnimation() {
        return this.animation;
    }

    @NotNull
    public final BottomNavigationBehavior getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final String getLongTapLink() {
        return this.longTapLink;
    }

    public final IndicatorDTO getStaticIndicator() {
        return this.staticIndicator;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int a11 = g.a((this.behavior.hashCode() + g.a(this.title.hashCode() * 31, 31, this.icon)) * 31, 31, this.url);
        String str = this.longTapLink;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        TabConfigAnimations tabConfigAnimations = this.animation;
        int hashCode2 = (hashCode + (tabConfigAnimations == null ? 0 : tabConfigAnimations.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.staticIndicator;
        return hashCode2 + (indicatorDTO != null ? indicatorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.icon;
        BottomNavigationBehavior bottomNavigationBehavior = this.behavior;
        String str3 = this.url;
        String str4 = this.longTapLink;
        TabConfigAnimations tabConfigAnimations = this.animation;
        IndicatorDTO indicatorDTO = this.staticIndicator;
        StringBuilder d11 = C3660k.d("TabConfigDTO(title=", str, ", icon=", str2, ", behavior=");
        d11.append(bottomNavigationBehavior);
        d11.append(", url=");
        d11.append(str3);
        d11.append(", longTapLink=");
        d11.append(str4);
        d11.append(", animation=");
        d11.append(tabConfigAnimations);
        d11.append(", staticIndicator=");
        d11.append(indicatorDTO);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ TabConfigDTO(String str, String str2, BottomNavigationBehavior bottomNavigationBehavior, String str3, String str4, TabConfigAnimations tabConfigAnimations, IndicatorDTO indicatorDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bottomNavigationBehavior, str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : tabConfigAnimations, (i11 & 64) != 0 ? null : indicatorDTO);
    }
}
