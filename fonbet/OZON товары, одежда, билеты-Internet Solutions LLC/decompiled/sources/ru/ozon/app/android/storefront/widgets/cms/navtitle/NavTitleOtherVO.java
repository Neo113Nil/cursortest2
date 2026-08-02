package ru.ozon.app.android.storefront.widgets.cms.navtitle;

import Ak.C2436a;
import G.g;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleOtherVO;", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleVO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "titleColor", "subtitleColor", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "align", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getSubtitle", "getTitleColor", "getSubtitleColor", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "getAlign", "()Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleAlign;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavTitleOtherVO implements NavTitleVO {

    @NotNull
    private final NavTitleAlign align;
    private final long id;
    private final String subtitle;
    private final String subtitleColor;

    @NotNull
    private final String title;
    private final String titleColor;

    public NavTitleOtherVO(long j11, @NotNull String title, String str, String str2, String str3, @NotNull NavTitleAlign align) {
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
        if (!(other instanceof NavTitleOtherVO)) {
            return false;
        }
        NavTitleOtherVO navTitleOtherVO = (NavTitleOtherVO) other;
        return this.id == navTitleOtherVO.id && Intrinsics.d(this.title, navTitleOtherVO.title) && Intrinsics.d(this.subtitle, navTitleOtherVO.subtitle) && Intrinsics.d(this.titleColor, navTitleOtherVO.titleColor) && Intrinsics.d(this.subtitleColor, navTitleOtherVO.subtitleColor) && this.align == navTitleOtherVO.align;
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
        StringBuilder c11 = C2436a.c(j11, "NavTitleOtherVO(id=", ", title=", str);
        a.h(c11, ", subtitle=", str2, ", titleColor=", str3);
        c11.append(", subtitleColor=");
        c11.append(str4);
        c11.append(", align=");
        c11.append(navTitleAlign);
        c11.append(")");
        return c11.toString();
    }
}
