package ru.ozon.app.android.orderdetails.dateselector.presentation;

import Ak.C2436a;
import D40.a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/orderdetails/dateselector/presentation/DateSelectorVO;", "Ll20/c;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "", "isSelected", "<init>", "(JLjava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getDeeplink", "Z", "()Z", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DateSelectorVO implements c {

    @NotNull
    private final String deeplink;
    private final long id;
    private final boolean isSelected;

    @NotNull
    private final String title;

    public DateSelectorVO(long j11, @NotNull String title, @NotNull String deeplink, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.id = j11;
        this.title = title;
        this.deeplink = deeplink;
        this.isSelected = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateSelectorVO)) {
            return false;
        }
        DateSelectorVO dateSelectorVO = (DateSelectorVO) other;
        return this.id == dateSelectorVO.id && Intrinsics.d(this.title, dateSelectorVO.title) && Intrinsics.d(this.deeplink, dateSelectorVO.deeplink) && this.isSelected == dateSelectorVO.isSelected;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        return Boolean.hashCode(this.isSelected) + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.title), 31, this.deeplink);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        String str2 = this.deeplink;
        boolean z11 = this.isSelected;
        StringBuilder c11 = C2436a.c(j11, "DateSelectorVO(id=", ", title=", str);
        a.g(", deeplink=", str2, ", isSelected=", c11, z11);
        c11.append(")");
        return c11.toString();
    }
}
