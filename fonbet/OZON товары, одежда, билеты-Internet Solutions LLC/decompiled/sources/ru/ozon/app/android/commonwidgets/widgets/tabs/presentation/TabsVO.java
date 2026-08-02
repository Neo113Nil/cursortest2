package ru.ozon.app.android.commonwidgets.widgets.tabs.presentation;

import B0.C2454a;
import G.g;
import J0.P;
import Kk.C3532b;
import Lh.b;
import WZ.t;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010\u0011¨\u0006&"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO$TabsItemVO;", DynamicElementDTO.TABS, "", "isScrollable", "", "scrollableMinWidth", "", "selectedDeeplink", "<init>", "(JLjava/util/List;ZLjava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Z", "()Z", "Ljava/lang/Integer;", "getScrollableMinWidth", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getSelectedDeeplink", "TabsItemVO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TabsVO implements c {
    private final long id;
    private final boolean isScrollable;
    private final Integer scrollableMinWidth;

    @NotNull
    private final String selectedDeeplink;

    @NotNull
    private final List<TabsItemVO> tabs;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001f\u0010\u0010R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO$TabsItemVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "badge", "badgeColor", "", "isSelected", "deeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;IZLjava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/lang/Integer;", "getBadge", "()Ljava/lang/Integer;", "I", "getBadgeColor", "Z", "()Z", "getDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabsItemVO {
        private final Integer badge;
        private final int badgeColor;

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String title;
        private final t tokenizedEvent;

        public TabsItemVO(@NotNull String title, Integer num, int i11, boolean z11, @NotNull String deeplink, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.badge = num;
            this.badgeColor = i11;
            this.isSelected = z11;
            this.deeplink = deeplink;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabsItemVO)) {
                return false;
            }
            TabsItemVO tabsItemVO = (TabsItemVO) other;
            return Intrinsics.d(this.title, tabsItemVO.title) && Intrinsics.d(this.badge, tabsItemVO.badge) && this.badgeColor == tabsItemVO.badgeColor && this.isSelected == tabsItemVO.isSelected && Intrinsics.d(this.deeplink, tabsItemVO.deeplink) && Intrinsics.d(this.tokenizedEvent, tabsItemVO.tokenizedEvent);
        }

        public final Integer getBadge() {
            return this.badge;
        }

        public final int getBadgeColor() {
            return this.badgeColor;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Integer num = this.badge;
            int a11 = g.a(C3532b.a(C2454a.a(this.badgeColor, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.isSelected), 31, this.deeplink);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            Integer num = this.badge;
            int i11 = this.badgeColor;
            boolean z11 = this.isSelected;
            String str2 = this.deeplink;
            t tVar = this.tokenizedEvent;
            StringBuilder b11 = P.b("TabsItemVO(title=", str, num, ", badge=", ", badgeColor=");
            Ql.c.d(b11, i11, ", isSelected=", z11, ", deeplink=");
            b11.append(str2);
            b11.append(", tokenizedEvent=");
            b11.append(tVar);
            b11.append(")");
            return b11.toString();
        }
    }

    public TabsVO(long j11, @NotNull List<TabsItemVO> tabs, boolean z11, Integer num, @NotNull String selectedDeeplink) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedDeeplink, "selectedDeeplink");
        this.id = j11;
        this.tabs = tabs;
        this.isScrollable = z11;
        this.scrollableMinWidth = num;
        this.selectedDeeplink = selectedDeeplink;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabsVO)) {
            return false;
        }
        TabsVO tabsVO = (TabsVO) other;
        return this.id == tabsVO.id && Intrinsics.d(this.tabs, tabsVO.tabs) && this.isScrollable == tabsVO.isScrollable && Intrinsics.d(this.scrollableMinWidth, tabsVO.scrollableMinWidth) && Intrinsics.d(this.selectedDeeplink, tabsVO.selectedDeeplink);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getScrollableMinWidth() {
        return this.scrollableMinWidth;
    }

    @NotNull
    public final String getSelectedDeeplink() {
        return this.selectedDeeplink;
    }

    @NotNull
    public final List<TabsItemVO> getTabs() {
        return this.tabs;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.tabs), 31, this.isScrollable);
        Integer num = this.scrollableMinWidth;
        return this.selectedDeeplink.hashCode() + ((a11 + (num == null ? 0 : num.hashCode())) * 31);
    }

    /* renamed from: isScrollable, reason: from getter */
    public final boolean getIsScrollable() {
        return this.isScrollable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TabsItemVO> list = this.tabs;
        boolean z11 = this.isScrollable;
        Integer num = this.scrollableMinWidth;
        String str = this.selectedDeeplink;
        StringBuilder b11 = b.b(j11, "TabsVO(id=", ", tabs=", list);
        b11.append(", isScrollable=");
        b11.append(z11);
        b11.append(", scrollableMinWidth=");
        b11.append(num);
        return C6594f.a(", selectedDeeplink=", str, ")", b11);
    }
}
