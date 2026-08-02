package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple;

import B0.C2454a;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010%R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b\u000b\u0010'\"\u0004\b(\u0010)R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010-R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/CoupleCardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "topItem", "bottomItem", "", "widgetBackgroundColor", "", "isCompactSize", "", "spanIndex", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "widgetTokenizedEvent", "<init>", "(JLru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;Ljava/lang/String;ZILWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "getTopItem", "()Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/couple/ItemVO;", "getBottomItem", "Ljava/lang/String;", "getWidgetBackgroundColor", "setWidgetBackgroundColor", "(Ljava/lang/String;)V", "Z", "()Z", "setCompactSize", "(Z)V", "I", "getSpanIndex", "setSpanIndex", "(I)V", "LWZ/t;", "getWidgetTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CoupleCardVO implements c {

    @NotNull
    private final ItemVO bottomItem;
    private final long id;
    private boolean isCompactSize;
    private int spanIndex;

    @NotNull
    private final ItemVO topItem;
    private String widgetBackgroundColor;
    private final t widgetTokenizedEvent;

    public CoupleCardVO(long j11, @NotNull ItemVO topItem, @NotNull ItemVO bottomItem, String str, boolean z11, int i11, t tVar) {
        Intrinsics.checkNotNullParameter(topItem, "topItem");
        Intrinsics.checkNotNullParameter(bottomItem, "bottomItem");
        this.id = j11;
        this.topItem = topItem;
        this.bottomItem = bottomItem;
        this.widgetBackgroundColor = str;
        this.isCompactSize = z11;
        this.spanIndex = i11;
        this.widgetTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoupleCardVO)) {
            return false;
        }
        CoupleCardVO coupleCardVO = (CoupleCardVO) other;
        return this.id == coupleCardVO.id && Intrinsics.d(this.topItem, coupleCardVO.topItem) && Intrinsics.d(this.bottomItem, coupleCardVO.bottomItem) && Intrinsics.d(this.widgetBackgroundColor, coupleCardVO.widgetBackgroundColor) && this.isCompactSize == coupleCardVO.isCompactSize && this.spanIndex == coupleCardVO.spanIndex && Intrinsics.d(this.widgetTokenizedEvent, coupleCardVO.widgetTokenizedEvent);
    }

    @NotNull
    public final ItemVO getBottomItem() {
        return this.bottomItem;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSpanIndex() {
        return this.spanIndex;
    }

    @NotNull
    public final ItemVO getTopItem() {
        return this.topItem;
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
        int hashCode = (this.bottomItem.hashCode() + ((this.topItem.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
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
        ItemVO itemVO = this.topItem;
        ItemVO itemVO2 = this.bottomItem;
        String str = this.widgetBackgroundColor;
        boolean z11 = this.isCompactSize;
        int i11 = this.spanIndex;
        t tVar = this.widgetTokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CoupleCardVO(id=");
        sb2.append(j11);
        sb2.append(", topItem=");
        sb2.append(itemVO);
        sb2.append(", bottomItem=");
        sb2.append(itemVO2);
        sb2.append(", widgetBackgroundColor=");
        sb2.append(str);
        sb2.append(", isCompactSize=");
        sb2.append(z11);
        sb2.append(", spanIndex=");
        sb2.append(i11);
        return a.b(sb2, ", widgetTokenizedEvent=", tVar, ")");
    }
}
