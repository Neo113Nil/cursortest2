package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.single;

import B0.C2454a;
import D40.a;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple.ItemVO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010'R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/single/SingleCardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "item", "", "widgetBackgroundColor", "", "isCompactSize", "", "spanIndex", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "widgetTokenizedEvent", "<init>", "(JLru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;Ljava/lang/String;ZILWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "getItem", "()Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "Ljava/lang/String;", "getWidgetBackgroundColor", "Z", "()Z", "I", "getSpanIndex", "setSpanIndex", "(I)V", "LWZ/t;", "getWidgetTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleCardVO implements c {
    private final long id;
    private final boolean isCompactSize;

    @NotNull
    private final ItemVO item;
    private int spanIndex;
    private final String widgetBackgroundColor;
    private final t widgetTokenizedEvent;

    public SingleCardVO(long j11, @NotNull ItemVO item, String str, boolean z11, int i11, t tVar) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.id = j11;
        this.item = item;
        this.widgetBackgroundColor = str;
        this.isCompactSize = z11;
        this.spanIndex = i11;
        this.widgetTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleCardVO)) {
            return false;
        }
        SingleCardVO singleCardVO = (SingleCardVO) other;
        return this.id == singleCardVO.id && Intrinsics.d(this.item, singleCardVO.item) && Intrinsics.d(this.widgetBackgroundColor, singleCardVO.widgetBackgroundColor) && this.isCompactSize == singleCardVO.isCompactSize && this.spanIndex == singleCardVO.spanIndex && Intrinsics.d(this.widgetTokenizedEvent, singleCardVO.widgetTokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ItemVO getItem() {
        return this.item;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSpanIndex() {
        return this.spanIndex;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public final t getWidgetTokenizedEvent() {
        return this.widgetTokenizedEvent;
    }

    public int hashCode() {
        int hashCode = (this.item.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.widgetBackgroundColor;
        int a11 = C2454a.a(this.spanIndex, C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCompactSize), 31);
        t tVar = this.widgetTokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isCompactSize, reason: from getter */
    public final boolean getIsCompactSize() {
        return this.isCompactSize;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ItemVO itemVO = this.item;
        String str = this.widgetBackgroundColor;
        boolean z11 = this.isCompactSize;
        int i11 = this.spanIndex;
        t tVar = this.widgetTokenizedEvent;
        StringBuilder sb2 = new StringBuilder("SingleCardVO(id=");
        sb2.append(j11);
        sb2.append(", item=");
        sb2.append(itemVO);
        a.g(", widgetBackgroundColor=", str, ", isCompactSize=", sb2, z11);
        sb2.append(", spanIndex=");
        sb2.append(i11);
        sb2.append(", widgetTokenizedEvent=");
        sb2.append(tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
