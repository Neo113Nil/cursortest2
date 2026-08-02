package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs;

import G.g;
import Lh.b;
import Nh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001 B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsVO$TabModel;", DynamicElementDTO.TABS, "", "tabBackgroundColor", "activeTabBackgroundColor", "<init>", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Ljava/lang/String;", "getTabBackgroundColor", "getActiveTabBackgroundColor", "TabModel", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaDetailedInfoV3TabsVO implements c {
    private final String activeTabBackgroundColor;
    private final long id;
    private final String tabBackgroundColor;

    @NotNull
    private final List<TabModel> tabs;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/tabs/AviaDetailedInfoV3TabsVO$TabModel;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "isSelected", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabModel {
        private final boolean isSelected;

        @NotNull
        private final TextDTO text;

        public TabModel(@NotNull TextDTO text, boolean z11) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isSelected = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabModel)) {
                return false;
            }
            TabModel tabModel = (TabModel) other;
            return Intrinsics.d(this.text, tabModel.text) && this.isSelected == tabModel.isSelected;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected) + (this.text.hashCode() * 31);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "TabModel(text=" + this.text + ", isSelected=" + this.isSelected + ")";
        }
    }

    public AviaDetailedInfoV3TabsVO(long j11, @NotNull List<TabModel> tabs, String str, String str2) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.tabs = tabs;
        this.tabBackgroundColor = str;
        this.activeTabBackgroundColor = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaDetailedInfoV3TabsVO)) {
            return false;
        }
        AviaDetailedInfoV3TabsVO aviaDetailedInfoV3TabsVO = (AviaDetailedInfoV3TabsVO) other;
        return this.id == aviaDetailedInfoV3TabsVO.id && Intrinsics.d(this.tabs, aviaDetailedInfoV3TabsVO.tabs) && Intrinsics.d(this.tabBackgroundColor, aviaDetailedInfoV3TabsVO.tabBackgroundColor) && Intrinsics.d(this.activeTabBackgroundColor, aviaDetailedInfoV3TabsVO.activeTabBackgroundColor);
    }

    public final String getActiveTabBackgroundColor() {
        return this.activeTabBackgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getTabBackgroundColor() {
        return this.tabBackgroundColor;
    }

    @NotNull
    public final List<TabModel> getTabs() {
        return this.tabs;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.tabs);
        String str = this.tabBackgroundColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.activeTabBackgroundColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TabModel> list = this.tabs;
        String str = this.tabBackgroundColor;
        String str2 = this.activeTabBackgroundColor;
        StringBuilder b11 = b.b(j11, "AviaDetailedInfoV3TabsVO(id=", ", tabs=", list);
        a.h(b11, ", tabBackgroundColor=", str, ", activeTabBackgroundColor=", str2);
        b11.append(")");
        return b11.toString();
    }
}
