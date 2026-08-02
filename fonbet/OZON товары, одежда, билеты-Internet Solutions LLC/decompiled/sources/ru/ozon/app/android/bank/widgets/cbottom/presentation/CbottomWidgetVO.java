package ru.ozon.app.android.bank.widgets.cbottom.presentation;

import De.C2860c;
import G.g;
import Lh.b;
import Nh.a;
import WZ.t;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0014R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b$\u0010!R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b%\u0010!R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010!R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "cbottomItems", "", "backgroundColor", "", "widgetPadding", "backgroundRadius", "widgetMargin", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCbottomItems", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "getWidgetPadding", "getBackgroundRadius", "getWidgetMargin", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CbottomWidgetVO implements c {
    private final String backgroundColor;
    private final List<Integer> backgroundRadius;

    @NotNull
    private final List<RecyclerItem> cbottomItems;
    private final long id;
    private final t tokenizedEvent;
    private final List<Integer> widgetMargin;
    private final List<Integer> widgetPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public CbottomWidgetVO(long j11, @NotNull List<? extends RecyclerItem> cbottomItems, String str, List<Integer> list, List<Integer> list2, List<Integer> list3, t tVar) {
        Intrinsics.checkNotNullParameter(cbottomItems, "cbottomItems");
        this.id = j11;
        this.cbottomItems = cbottomItems;
        this.backgroundColor = str;
        this.widgetPadding = list;
        this.backgroundRadius = list2;
        this.widgetMargin = list3;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CbottomWidgetVO)) {
            return false;
        }
        CbottomWidgetVO cbottomWidgetVO = (CbottomWidgetVO) other;
        return this.id == cbottomWidgetVO.id && Intrinsics.d(this.cbottomItems, cbottomWidgetVO.cbottomItems) && Intrinsics.d(this.backgroundColor, cbottomWidgetVO.backgroundColor) && Intrinsics.d(this.widgetPadding, cbottomWidgetVO.widgetPadding) && Intrinsics.d(this.backgroundRadius, cbottomWidgetVO.backgroundRadius) && Intrinsics.d(this.widgetMargin, cbottomWidgetVO.widgetMargin) && Intrinsics.d(this.tokenizedEvent, cbottomWidgetVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<Integer> getBackgroundRadius() {
        return this.backgroundRadius;
    }

    @NotNull
    public final List<RecyclerItem> getCbottomItems() {
        return this.cbottomItems;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final List<Integer> getWidgetMargin() {
        return this.widgetMargin;
    }

    public final List<Integer> getWidgetPadding() {
        return this.widgetPadding;
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.cbottomItems);
        String str = this.backgroundColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.widgetPadding;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.backgroundRadius;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.widgetMargin;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<RecyclerItem> list = this.cbottomItems;
        String str = this.backgroundColor;
        List<Integer> list2 = this.widgetPadding;
        List<Integer> list3 = this.backgroundRadius;
        List<Integer> list4 = this.widgetMargin;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "CbottomWidgetVO(id=", ", cbottomItems=", list);
        a.g(", backgroundColor=", str, ", widgetPadding=", b11, list2);
        C2860c.g(", backgroundRadius=", ", widgetMargin=", b11, list3, list4);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
