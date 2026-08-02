package ru.ozon.app.android.storefront.widgets.cms.navtitle;

import Ak.C2436a;
import G.g;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavTitleCenteredInterface;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleCenterVO;", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleVO;", "Lru/ozon/app/android/storefront/navBar/NavTitleCenteredInterface;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "titleColor", "subtitleColor", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "align", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "getTitleColor", "getSubtitleColor", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "getAlign", "()Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavTitleCenterVO implements NavTitleVO, NavTitleCenteredInterface {

    @NotNull
    private final NavTitleAlign align;
    private final long id;
    private final String subtitle;
    private final String subtitleColor;

    @NotNull
    private final String title;
    private final String titleColor;

    public NavTitleCenterVO(long j11, @NotNull String title, String str, String str2, String str3, @NotNull NavTitleAlign align) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(align, "align");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.titleColor = str2;
        this.subtitleColor = str3;
        this.align = align;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavTitleCenterVO)) {
            return false;
        }
        NavTitleCenterVO navTitleCenterVO = (NavTitleCenterVO) other;
        return this.id == navTitleCenterVO.id && Intrinsics.d(this.title, navTitleCenterVO.title) && Intrinsics.d(this.subtitle, navTitleCenterVO.subtitle) && Intrinsics.d(this.titleColor, navTitleCenterVO.titleColor) && Intrinsics.d(this.subtitleColor, navTitleCenterVO.subtitleColor) && this.align == navTitleCenterVO.align;
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleVO
    @NotNull
    public NavTitleAlign getAlign() {
        return this.align;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return NavTitleVO.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleVO
    public String getSubtitle() {
        return this.subtitle;
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleVO
    public String getSubtitleColor() {
        return this.subtitleColor;
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleVO
    @NotNull
    public String getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleVO
    public String getTitleColor() {
        return this.titleColor;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return NavTitleVO.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitleColor;
        return this.align.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.titleColor;
        String str4 = this.subtitleColor;
        NavTitleAlign navTitleAlign = this.align;
        StringBuilder c11 = C2436a.c(j11, "NavTitleCenterVO(id=", ", title=", str);
        a.h(c11, ", subtitle=", str2, ", titleColor=", str3);
        c11.append(", subtitleColor=");
        c11.append(str4);
        c11.append(", align=");
        c11.append(navTitleAlign);
        c11.append(")");
        return c11.toString();
    }
}
