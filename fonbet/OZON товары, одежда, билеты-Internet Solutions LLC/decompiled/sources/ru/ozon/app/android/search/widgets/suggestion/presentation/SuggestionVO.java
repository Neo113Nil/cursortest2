package ru.ozon.app.android.search.widgets.suggestion.presentation;

import B3.p;
import G.g;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B§\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b0\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b1\u0010)R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b\u0013\u0010/R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b;\u0010:R\u001f\u0010\u0018\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\u0019\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b=\u0010/¨\u0006>"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "deeplink", "", "shouldPrefetch", "image", "breadcrumb", "queryText", "priceText", "removeQueryActionName", "", "typeImageResId", "isPromotedProduct", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "searchTokenizedEvent", "removeTokenizedEvent", "showDivider", "<init>", "(JLjava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLWZ/t;LWZ/t;LWZ/t;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "Ljava/lang/String;", "getSubtitle", "getDeeplink", "Z", "getShouldPrefetch", "()Z", "getImage", "getBreadcrumb", "getQueryText", "getPriceText", "getRemoveQueryActionName", "Ljava/lang/Integer;", "getTypeImageResId", "()Ljava/lang/Integer;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getSearchTokenizedEvent", "getRemoveTokenizedEvent", "getShowDivider", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SuggestionVO implements c {

    @NotNull
    private final CharSequence breadcrumb;

    @NotNull
    private final String deeplink;
    private final long id;

    @NotNull
    private final String image;
    private final boolean isPromotedProduct;

    @NotNull
    private final String priceText;

    @NotNull
    private final String queryText;
    private final String removeQueryActionName;
    private final t removeTokenizedEvent;
    private final t searchTokenizedEvent;
    private final boolean shouldPrefetch;
    private final boolean showDivider;

    @NotNull
    private final String subtitle;

    @NotNull
    private final CharSequence title;
    private final t tokenizedEvent;
    private final Integer typeImageResId;

    public SuggestionVO(long j11, @NotNull CharSequence title, @NotNull String subtitle, @NotNull String deeplink, boolean z11, @NotNull String image, @NotNull CharSequence breadcrumb, @NotNull String queryText, @NotNull String priceText, String str, Integer num, boolean z12, t tVar, t tVar2, t tVar3, boolean z13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        Intrinsics.checkNotNullParameter(queryText, "queryText");
        Intrinsics.checkNotNullParameter(priceText, "priceText");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.deeplink = deeplink;
        this.shouldPrefetch = z11;
        this.image = image;
        this.breadcrumb = breadcrumb;
        this.queryText = queryText;
        this.priceText = priceText;
        this.removeQueryActionName = str;
        this.typeImageResId = num;
        this.isPromotedProduct = z12;
        this.tokenizedEvent = tVar;
        this.searchTokenizedEvent = tVar2;
        this.removeTokenizedEvent = tVar3;
        this.showDivider = z13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionVO)) {
            return false;
        }
        SuggestionVO suggestionVO = (SuggestionVO) other;
        return this.id == suggestionVO.id && Intrinsics.d(this.title, suggestionVO.title) && Intrinsics.d(this.subtitle, suggestionVO.subtitle) && Intrinsics.d(this.deeplink, suggestionVO.deeplink) && this.shouldPrefetch == suggestionVO.shouldPrefetch && Intrinsics.d(this.image, suggestionVO.image) && Intrinsics.d(this.breadcrumb, suggestionVO.breadcrumb) && Intrinsics.d(this.queryText, suggestionVO.queryText) && Intrinsics.d(this.priceText, suggestionVO.priceText) && Intrinsics.d(this.removeQueryActionName, suggestionVO.removeQueryActionName) && Intrinsics.d(this.typeImageResId, suggestionVO.typeImageResId) && this.isPromotedProduct == suggestionVO.isPromotedProduct && Intrinsics.d(this.tokenizedEvent, suggestionVO.tokenizedEvent) && Intrinsics.d(this.searchTokenizedEvent, suggestionVO.searchTokenizedEvent) && Intrinsics.d(this.removeTokenizedEvent, suggestionVO.removeTokenizedEvent) && this.showDivider == suggestionVO.showDivider;
    }

    @NotNull
    public final CharSequence getBreadcrumb() {
        return this.breadcrumb;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getPriceText() {
        return this.priceText;
    }

    public final String getRemoveQueryActionName() {
        return this.removeQueryActionName;
    }

    public final t getRemoveTokenizedEvent() {
        return this.removeTokenizedEvent;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getSearchTokenizedEvent() {
        return this.searchTokenizedEvent;
    }

    public final boolean getShouldPrefetch() {
        return this.shouldPrefetch;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final CharSequence getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Integer getTypeImageResId() {
        return this.typeImageResId;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a((this.breadcrumb.hashCode() + g.a(C3532b.a(g.a(g.a((this.title.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.subtitle), 31, this.deeplink), 31, this.shouldPrefetch), 31, this.image)) * 31, 31, this.queryText), 31, this.priceText);
        String str = this.removeQueryActionName;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.typeImageResId;
        int a12 = C3532b.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.isPromotedProduct);
        t tVar = this.tokenizedEvent;
        int hashCode2 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.searchTokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.removeTokenizedEvent;
        return Boolean.hashCode(this.showDivider) + ((hashCode3 + (tVar3 != null ? tVar3.hashCode() : 0)) * 31);
    }

    /* renamed from: isPromotedProduct, reason: from getter */
    public final boolean getIsPromotedProduct() {
        return this.isPromotedProduct;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CharSequence charSequence = this.title;
        String str = this.subtitle;
        String str2 = this.deeplink;
        boolean z11 = this.shouldPrefetch;
        String str3 = this.image;
        CharSequence charSequence2 = this.breadcrumb;
        String str4 = this.queryText;
        String str5 = this.priceText;
        String str6 = this.removeQueryActionName;
        Integer num = this.typeImageResId;
        boolean z12 = this.isPromotedProduct;
        t tVar = this.tokenizedEvent;
        t tVar2 = this.searchTokenizedEvent;
        t tVar3 = this.removeTokenizedEvent;
        boolean z13 = this.showDivider;
        StringBuilder sb2 = new StringBuilder("SuggestionVO(id=");
        sb2.append(j11);
        sb2.append(", title=");
        sb2.append((Object) charSequence);
        a.h(sb2, ", subtitle=", str, ", deeplink=", str2);
        sb2.append(", shouldPrefetch=");
        sb2.append(z11);
        sb2.append(", image=");
        sb2.append(str3);
        sb2.append(", breadcrumb=");
        sb2.append((Object) charSequence2);
        sb2.append(", queryText=");
        sb2.append(str4);
        a.h(sb2, ", priceText=", str5, ", removeQueryActionName=", str6);
        sb2.append(", typeImageResId=");
        sb2.append(num);
        sb2.append(", isPromotedProduct=");
        sb2.append(z12);
        p.d(sb2, ", tokenizedEvent=", tVar, ", searchTokenizedEvent=", tVar2);
        sb2.append(", removeTokenizedEvent=");
        sb2.append(tVar3);
        sb2.append(", showDivider=");
        sb2.append(z13);
        sb2.append(")");
        return sb2.toString();
    }
}
