package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getRecShelfAction", "Lru/ozon/composer/ui/widget/l;", "skuScrollViewItem", "<init>", "(JLru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/composer/ui/widget/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getGetRecShelfAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "Lru/ozon/composer/ui/widget/l;", "getSkuScrollViewItem", "()Lru/ozon/composer/ui/widget/l;", "setSkuScrollViewItem", "(Lru/ozon/composer/ui/widget/l;)V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RecShelfVO implements c {

    @NotNull
    private final AtomAction.Click getRecShelfAction;
    private final long id;
    private l skuScrollViewItem;

    public RecShelfVO(long j11, @NotNull AtomAction.Click getRecShelfAction, l lVar) {
        Intrinsics.checkNotNullParameter(getRecShelfAction, "getRecShelfAction");
        this.id = j11;
        this.getRecShelfAction = getRecShelfAction;
        this.skuScrollViewItem = lVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecShelfVO)) {
            return false;
        }
        RecShelfVO recShelfVO = (RecShelfVO) other;
        return this.id == recShelfVO.id && Intrinsics.d(this.getRecShelfAction, recShelfVO.getRecShelfAction) && Intrinsics.d(this.skuScrollViewItem, recShelfVO.skuScrollViewItem);
    }

    @NotNull
    public final AtomAction.Click getGetRecShelfAction() {
        return this.getRecShelfAction;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final l getSkuScrollViewItem() {
        return this.skuScrollViewItem;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.getRecShelfAction.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        l lVar = this.skuScrollViewItem;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final void setSkuScrollViewItem(l lVar) {
        this.skuScrollViewItem = lVar;
    }

    @NotNull
    public String toString() {
        return "RecShelfVO(id=" + this.id + ", getRecShelfAction=" + this.getRecShelfAction + ", skuScrollViewItem=" + this.skuScrollViewItem + ")";
    }

    public /* synthetic */ RecShelfVO(long j11, AtomAction.Click click, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, click, (i11 & 4) != 0 ? null : lVar);
    }
}
