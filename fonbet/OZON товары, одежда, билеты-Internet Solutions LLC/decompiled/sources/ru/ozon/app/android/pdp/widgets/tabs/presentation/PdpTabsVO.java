package ru.ozon.app.android.pdp.widgets.tabs.presentation;

import D3.h;
import G.g;
import K00.b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002()B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;", DynamicElementDTO.TABS, "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "", "containerHeight", "<init>", "(JLjava/util/List;Ljava/lang/String;LWZ/t;I)V", "copy", "(JLjava/util/List;Ljava/lang/String;LWZ/t;I)Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getContainerHeight", "Tab", "TabsStyle", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PdpTabsVO implements c {

    @NotNull
    private final String backgroundColor;
    private final int containerHeight;
    private final long id;

    @NotNull
    private final List<Tab> tabs;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\f\u0010#R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010\u0016¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "groupId", "LWZ/t;", "tokenizedEvent", "", "isHidden", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;", "tabStyle", "isSelected", "", "horizontalPadding", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;LWZ/t;ZLru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;ZI)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;LWZ/t;ZLru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;ZI)Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$Tab;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getGroupId", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;", "getTabStyle", "()Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;", "I", "getHorizontalPadding", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {

        @NotNull
        private final String groupId;
        private final int horizontalPadding;
        private final boolean isHidden;
        private final boolean isSelected;

        @NotNull
        private final TabsStyle tabStyle;

        @NotNull
        private final TextDTO text;
        private final t tokenizedEvent;

        public Tab(@NotNull TextDTO text, @NotNull String groupId, t tVar, boolean z11, @NotNull TabsStyle tabStyle, boolean z12, int i11) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(tabStyle, "tabStyle");
            this.text = text;
            this.groupId = groupId;
            this.tokenizedEvent = tVar;
            this.isHidden = z11;
            this.tabStyle = tabStyle;
            this.isSelected = z12;
            this.horizontalPadding = i11;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, TextDTO textDTO, String str, t tVar, boolean z11, TabsStyle tabsStyle, boolean z12, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textDTO = tab.text;
            }
            if ((i12 & 2) != 0) {
                str = tab.groupId;
            }
            if ((i12 & 4) != 0) {
                tVar = tab.tokenizedEvent;
            }
            if ((i12 & 8) != 0) {
                z11 = tab.isHidden;
            }
            if ((i12 & 16) != 0) {
                tabsStyle = tab.tabStyle;
            }
            if ((i12 & 32) != 0) {
                z12 = tab.isSelected;
            }
            if ((i12 & 64) != 0) {
                i11 = tab.horizontalPadding;
            }
            boolean z13 = z12;
            int i13 = i11;
            TabsStyle tabsStyle2 = tabsStyle;
            t tVar2 = tVar;
            return tab.copy(textDTO, str, tVar2, z11, tabsStyle2, z13, i13);
        }

        @NotNull
        public final Tab copy(@NotNull TextDTO text, @NotNull String groupId, t tokenizedEvent, boolean isHidden, @NotNull TabsStyle tabStyle, boolean isSelected, int horizontalPadding) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(tabStyle, "tabStyle");
            return new Tab(text, groupId, tokenizedEvent, isHidden, tabStyle, isSelected, horizontalPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return Intrinsics.d(this.text, tab.text) && Intrinsics.d(this.groupId, tab.groupId) && Intrinsics.d(this.tokenizedEvent, tab.tokenizedEvent) && this.isHidden == tab.isHidden && Intrinsics.d(this.tabStyle, tab.tabStyle) && this.isSelected == tab.isSelected && this.horizontalPadding == tab.horizontalPadding;
        }

        @NotNull
        public final String getGroupId() {
            return this.groupId;
        }

        public final int getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @NotNull
        public final TabsStyle getTabStyle() {
            return this.tabStyle;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = g.a(this.text.hashCode() * 31, 31, this.groupId);
            t tVar = this.tokenizedEvent;
            return Integer.hashCode(this.horizontalPadding) + C3532b.a((this.tabStyle.hashCode() + C3532b.a((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.isHidden)) * 31, 31, this.isSelected);
        }

        /* renamed from: isHidden, reason: from getter */
        public final boolean getIsHidden() {
            return this.isHidden;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.groupId;
            t tVar = this.tokenizedEvent;
            boolean z11 = this.isHidden;
            TabsStyle tabsStyle = this.tabStyle;
            boolean z12 = this.isSelected;
            int i11 = this.horizontalPadding;
            StringBuilder f7 = D3.g.f("Tab(text=", textDTO, ", groupId=", str, ", tokenizedEvent=");
            f7.append(tVar);
            f7.append(", isHidden=");
            f7.append(z11);
            f7.append(", tabStyle=");
            f7.append(tabsStyle);
            f7.append(", isSelected=");
            f7.append(z12);
            f7.append(", horizontalPadding=");
            return b.e(i11, ")", f7);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;", "", "", "backgroundColor", "selectedBackgroundColor", "textColor", "selectedTextColor", "", "cornerRadius", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO$TabsStyle;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getSelectedBackgroundColor", "getTextColor", "getSelectedTextColor", "I", "getCornerRadius", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabsStyle {

        @NotNull
        private final String backgroundColor;
        private final int cornerRadius;

        @NotNull
        private final String selectedBackgroundColor;

        @NotNull
        private final String selectedTextColor;

        @NotNull
        private final String textColor;

        public TabsStyle(@NotNull String backgroundColor, @NotNull String selectedBackgroundColor, @NotNull String textColor, @NotNull String selectedTextColor, int i11) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(selectedBackgroundColor, "selectedBackgroundColor");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(selectedTextColor, "selectedTextColor");
            this.backgroundColor = backgroundColor;
            this.selectedBackgroundColor = selectedBackgroundColor;
            this.textColor = textColor;
            this.selectedTextColor = selectedTextColor;
            this.cornerRadius = i11;
        }

        public static /* synthetic */ TabsStyle copy$default(TabsStyle tabsStyle, String str, String str2, String str3, String str4, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tabsStyle.backgroundColor;
            }
            if ((i12 & 2) != 0) {
                str2 = tabsStyle.selectedBackgroundColor;
            }
            if ((i12 & 4) != 0) {
                str3 = tabsStyle.textColor;
            }
            if ((i12 & 8) != 0) {
                str4 = tabsStyle.selectedTextColor;
            }
            if ((i12 & 16) != 0) {
                i11 = tabsStyle.cornerRadius;
            }
            int i13 = i11;
            String str5 = str3;
            return tabsStyle.copy(str, str2, str5, str4, i13);
        }

        @NotNull
        public final TabsStyle copy(@NotNull String backgroundColor, @NotNull String selectedBackgroundColor, @NotNull String textColor, @NotNull String selectedTextColor, int cornerRadius) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(selectedBackgroundColor, "selectedBackgroundColor");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(selectedTextColor, "selectedTextColor");
            return new TabsStyle(backgroundColor, selectedBackgroundColor, textColor, selectedTextColor, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabsStyle)) {
                return false;
            }
            TabsStyle tabsStyle = (TabsStyle) other;
            return Intrinsics.d(this.backgroundColor, tabsStyle.backgroundColor) && Intrinsics.d(this.selectedBackgroundColor, tabsStyle.selectedBackgroundColor) && Intrinsics.d(this.textColor, tabsStyle.textColor) && Intrinsics.d(this.selectedTextColor, tabsStyle.selectedTextColor) && this.cornerRadius == tabsStyle.cornerRadius;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final String getSelectedBackgroundColor() {
            return this.selectedBackgroundColor;
        }

        @NotNull
        public final String getSelectedTextColor() {
            return this.selectedTextColor;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.cornerRadius) + g.a(g.a(g.a(this.backgroundColor.hashCode() * 31, 31, this.selectedBackgroundColor), 31, this.textColor), 31, this.selectedTextColor);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.selectedBackgroundColor;
            String str3 = this.textColor;
            String str4 = this.selectedTextColor;
            int i11 = this.cornerRadius;
            StringBuilder d11 = C3660k.d("TabsStyle(backgroundColor=", str, ", selectedBackgroundColor=", str2, ", textColor=");
            a.h(d11, str3, ", selectedTextColor=", str4, ", cornerRadius=");
            return b.e(i11, ")", d11);
        }
    }

    public PdpTabsVO(long j11, @NotNull List<Tab> tabs, @NotNull String backgroundColor, t tVar, int i11) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.tabs = tabs;
        this.backgroundColor = backgroundColor;
        this.tokenizedEvent = tVar;
        this.containerHeight = i11;
    }

    public static /* synthetic */ PdpTabsVO copy$default(PdpTabsVO pdpTabsVO, long j11, List list, String str, t tVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = pdpTabsVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = pdpTabsVO.tabs;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            str = pdpTabsVO.backgroundColor;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            tVar = pdpTabsVO.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i12 & 16) != 0) {
            i11 = pdpTabsVO.containerHeight;
        }
        return pdpTabsVO.copy(j12, list2, str2, tVar2, i11);
    }

    @NotNull
    public final PdpTabsVO copy(long id2, @NotNull List<Tab> tabs, @NotNull String backgroundColor, t tokenizedEvent, int containerHeight) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new PdpTabsVO(id2, tabs, backgroundColor, tokenizedEvent, containerHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpTabsVO)) {
            return false;
        }
        PdpTabsVO pdpTabsVO = (PdpTabsVO) other;
        return this.id == pdpTabsVO.id && Intrinsics.d(this.tabs, pdpTabsVO.tabs) && Intrinsics.d(this.backgroundColor, pdpTabsVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, pdpTabsVO.tokenizedEvent) && this.containerHeight == pdpTabsVO.containerHeight;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getContainerHeight() {
        return this.containerHeight;
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
    public final List<Tab> getTabs() {
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
        int a11 = g.a(g.b(Long.hashCode(this.id) * 31, 31, this.tabs), 31, this.backgroundColor);
        t tVar = this.tokenizedEvent;
        return Integer.hashCode(this.containerHeight) + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Tab> list = this.tabs;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        int i11 = this.containerHeight;
        StringBuilder b11 = Lh.b.b(j11, "PdpTabsVO(id=", ", tabs=", list);
        Bi.a.f(b11, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        return h.b(b11, ", containerHeight=", i11, ")");
    }
}
