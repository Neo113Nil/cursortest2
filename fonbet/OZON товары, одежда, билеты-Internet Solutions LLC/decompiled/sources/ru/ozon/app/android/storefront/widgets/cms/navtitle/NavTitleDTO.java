package ru.ozon.app.android.storefront.widgets.cms.navtitle;

import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "titleColor", "subtitleColor", "align", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTitleColor", "getSubtitleColor", "getAlign", "()Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavTitleDTO {
    public static final int $stable = 0;
    private final NavTitleAlign align;
    private final String subtitle;
    private final String subtitleColor;

    @NotNull
    private final String title;
    private final String titleColor;

    public NavTitleDTO(@NotNull String title, String str, String str2, String str3, NavTitleAlign navTitleAlign) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.titleColor = str2;
        this.subtitleColor = str3;
        this.align = navTitleAlign;
    }

    public static /* synthetic */ NavTitleDTO copy$default(NavTitleDTO navTitleDTO, String str, String str2, String str3, String str4, NavTitleAlign navTitleAlign, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navTitleDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = navTitleDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = navTitleDTO.titleColor;
        }
        if ((i11 & 8) != 0) {
            str4 = navTitleDTO.subtitleColor;
        }
        if ((i11 & 16) != 0) {
            navTitleAlign = navTitleDTO.align;
        }
        NavTitleAlign navTitleAlign2 = navTitleAlign;
        String str5 = str3;
        return navTitleDTO.copy(str, str2, str5, str4, navTitleAlign2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: component5, reason: from getter */
    public final NavTitleAlign getAlign() {
        return this.align;
    }

    @NotNull
    public final NavTitleDTO copy(@NotNull String title, String subtitle, String titleColor, String subtitleColor, NavTitleAlign align) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new NavTitleDTO(title, subtitle, titleColor, subtitleColor, align);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavTitleDTO)) {
            return false;
        }
        NavTitleDTO navTitleDTO = (NavTitleDTO) other;
        return Intrinsics.d(this.title, navTitleDTO.title) && Intrinsics.d(this.subtitle, navTitleDTO.subtitle) && Intrinsics.d(this.titleColor, navTitleDTO.titleColor) && Intrinsics.d(this.subtitleColor, navTitleDTO.subtitleColor) && this.align == navTitleDTO.align;
    }

    public final NavTitleAlign getAlign() {
        return this.align;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitleColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        NavTitleAlign navTitleAlign = this.align;
        return hashCode4 + (navTitleAlign != null ? navTitleAlign.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.titleColor;
        String str4 = this.subtitleColor;
        NavTitleAlign navTitleAlign = this.align;
        StringBuilder d11 = C3660k.d("NavTitleDTO(title=", str, ", subtitle=", str2, ", titleColor=");
        a.h(d11, str3, ", subtitleColor=", str4, ", align=");
        d11.append(navTitleAlign);
        d11.append(")");
        return d11.toString();
    }
}
