package ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation;

import Ak.C2436a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.deliveryreview.deliveryReviewHeader.presentation.photos.HeaderItem;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/DeliveryReviewHeaderVO;", "Ll20/c;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/presentation/photos/HeaderItem;", "headerItems", "info", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getHeaderItems", "()Ljava/util/List;", "getInfo", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryReviewHeaderVO implements c {
    private final List<HeaderItem> headerItems;
    private final long id;
    private final String info;

    @NotNull
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryReviewHeaderVO(long j11, @NotNull String title, List<? extends HeaderItem> list, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.headerItems = list;
        this.info = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryReviewHeaderVO)) {
            return false;
        }
        DeliveryReviewHeaderVO deliveryReviewHeaderVO = (DeliveryReviewHeaderVO) other;
        return this.id == deliveryReviewHeaderVO.id && Intrinsics.d(this.title, deliveryReviewHeaderVO.title) && Intrinsics.d(this.headerItems, deliveryReviewHeaderVO.headerItems) && Intrinsics.d(this.info, deliveryReviewHeaderVO.info);
    }

    public final List<HeaderItem> getHeaderItems() {
        return this.headerItems;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getInfo() {
        return this.info;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.title);
        List<HeaderItem> list = this.headerItems;
        int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.info;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        List<HeaderItem> list = this.headerItems;
        String str2 = this.info;
        StringBuilder c11 = C2436a.c(j11, "DeliveryReviewHeaderVO(id=", ", title=", str);
        c11.append(", headerItems=");
        c11.append(list);
        c11.append(", info=");
        c11.append(str2);
        c11.append(")");
        return c11.toString();
    }
}
