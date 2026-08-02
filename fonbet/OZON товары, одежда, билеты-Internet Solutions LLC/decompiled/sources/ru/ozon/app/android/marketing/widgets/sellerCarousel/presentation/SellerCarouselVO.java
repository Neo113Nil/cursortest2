package ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation;

import Ak.C2436a;
import B3.p;
import G.g;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b'\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleDeeplink", "", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;", "items", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "titleTokenizedEvent", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getTitleDeeplink", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "LWZ/t;", "getTitleTokenizedEvent", "()LWZ/t;", "getTokenizedEvent", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerCarouselVO implements c {
    private final long id;

    @NotNull
    private final List<SellerVO> items;
    private final String title;
    private final String titleDeeplink;
    private final t titleTokenizedEvent;
    private final t tokenizedEvent;

    public SellerCarouselVO(long j11, String str, String str2, @NotNull List<SellerVO> items, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.title = str;
        this.titleDeeplink = str2;
        this.items = items;
        this.titleTokenizedEvent = tVar;
        this.tokenizedEvent = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerCarouselVO)) {
            return false;
        }
        SellerCarouselVO sellerCarouselVO = (SellerCarouselVO) other;
        return this.id == sellerCarouselVO.id && Intrinsics.d(this.title, sellerCarouselVO.title) && Intrinsics.d(this.titleDeeplink, sellerCarouselVO.titleDeeplink) && Intrinsics.d(this.items, sellerCarouselVO.items) && Intrinsics.d(this.titleTokenizedEvent, sellerCarouselVO.titleTokenizedEvent) && Intrinsics.d(this.tokenizedEvent, sellerCarouselVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<SellerVO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleDeeplink() {
        return this.titleDeeplink;
    }

    public final t getTitleTokenizedEvent() {
        return this.titleTokenizedEvent;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleDeeplink;
        int b11 = g.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.items);
        t tVar = this.titleTokenizedEvent;
        int hashCode3 = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.tokenizedEvent;
        return hashCode3 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.titleDeeplink;
        List<SellerVO> list = this.items;
        t tVar = this.titleTokenizedEvent;
        t tVar2 = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SellerCarouselVO(id=", ", title=", str);
        a.g(", titleDeeplink=", str2, ", items=", c11, list);
        p.d(c11, ", titleTokenizedEvent=", tVar, ", tokenizedEvent=", tVar2);
        c11.append(")");
        return c11.toString();
    }
}
