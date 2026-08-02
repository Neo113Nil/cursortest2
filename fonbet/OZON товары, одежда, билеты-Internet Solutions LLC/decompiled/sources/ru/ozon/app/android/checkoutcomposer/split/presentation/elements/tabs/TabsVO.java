package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tabs;

import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tabs/TabsVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", DynamicElementDTO.TABS, "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "paddings", "", "shouldDisableShadow", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;Ljava/lang/Boolean;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "Ljava/lang/Boolean;", "getShouldDisableShadow", "()Ljava/lang/Boolean;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TabsVO implements c {
    private final long id;
    private final Paddings paddings;
    private final Boolean shouldDisableShadow;

    @NotNull
    private final TabsDTO tabs;
    private final t tokenizedEvent;

    public TabsVO(long j11, @NotNull TabsDTO tabs, Paddings paddings, Boolean bool, t tVar) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.tabs = tabs;
        this.paddings = paddings;
        this.shouldDisableShadow = bool;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabsVO)) {
            return false;
        }
        TabsVO tabsVO = (TabsVO) other;
        return this.id == tabsVO.id && Intrinsics.d(this.tabs, tabsVO.tabs) && Intrinsics.d(this.paddings, tabsVO.paddings) && Intrinsics.d(this.shouldDisableShadow, tabsVO.shouldDisableShadow) && Intrinsics.d(this.tokenizedEvent, tabsVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Boolean getShouldDisableShadow() {
        return this.shouldDisableShadow;
    }

    @NotNull
    public final TabsDTO getTabs() {
        return this.tabs;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.tabs.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        Paddings paddings = this.paddings;
        int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Boolean bool = this.shouldDisableShadow;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TabsDTO tabsDTO = this.tabs;
        Paddings paddings = this.paddings;
        Boolean bool = this.shouldDisableShadow;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("TabsVO(id=");
        sb2.append(j11);
        sb2.append(", tabs=");
        sb2.append(tabsDTO);
        sb2.append(", paddings=");
        sb2.append(paddings);
        sb2.append(", shouldDisableShadow=");
        sb2.append(bool);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
