package ru.ozon.app.android.cabinet.tabSelector.presentation;

import C.o0;
import G.g;
import K1.G;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO$TabSelectorItemVO;", DynamicElementDTO.TABS, "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "TabSelectorItemVO", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TabSelectorVO implements c {
    private final long id;

    @NotNull
    private final List<TabSelectorItemVO> tabs;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorVO$TabSelectorItemVO;", "", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getTitle", "getDeeplink", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabSelectorItemVO {

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String title;

        public TabSelectorItemVO(boolean z11, @NotNull String title, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isSelected = z11;
            this.title = title;
            this.deeplink = deeplink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabSelectorItemVO)) {
                return false;
            }
            TabSelectorItemVO tabSelectorItemVO = (TabSelectorItemVO) other;
            return this.isSelected == tabSelectorItemVO.isSelected && Intrinsics.d(this.title, tabSelectorItemVO.title) && Intrinsics.d(this.deeplink, tabSelectorItemVO.deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + g.a(Boolean.hashCode(this.isSelected) * 31, 31, this.title);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.title;
            return o0.c(G.d("TabSelectorItemVO(isSelected=", ", title=", str, ", deeplink=", z11), this.deeplink, ")");
        }
    }

    public TabSelectorVO(long j11, @NotNull List<TabSelectorItemVO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.tabs = tabs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabSelectorVO)) {
            return false;
        }
        TabSelectorVO tabSelectorVO = (TabSelectorVO) other;
        return this.id == tabSelectorVO.id && Intrinsics.d(this.tabs, tabSelectorVO.tabs);
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
    public final List<TabSelectorItemVO> getTabs() {
        return this.tabs;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.tabs.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "TabSelectorVO(id=", ", tabs=", this.tabs);
        b11.append(")");
        return b11.toString();
    }
}
