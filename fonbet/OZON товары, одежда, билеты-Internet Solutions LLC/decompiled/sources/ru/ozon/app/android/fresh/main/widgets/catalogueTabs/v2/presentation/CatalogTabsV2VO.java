package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation;

import Am.C2438a;
import B0.C2454a;
import Cm.e;
import G.g;
import J0.P;
import Kk.C3532b;
import Tl.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollTabAnchor;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b \b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003<=>Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0084\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b\u0006\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b;\u0010\u001e¨\u0006?"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isExpanded", "", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", DynamicElementDTO.TABS, "", "backgroundColor", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$TabPaddings;", "paddings", "", "maxRows", "moreTab", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;", "stickyRoundedCorners", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "selectedTabIndex", "<init>", "(JZLjava/util/List;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$TabPaddings;ILru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;LWZ/t;I)V", "copy", "(JZLjava/util/List;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$TabPaddings;ILru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;LWZ/t;I)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$TabPaddings;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$TabPaddings;", "I", "getMaxRows", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "getMoreTab", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;", "getStickyRoundedCorners", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "getSelectedTabIndex", "TabPaddings", "Tab", "StickyRoundedCorners", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogTabsV2VO implements c {

    @NotNull
    private final String backgroundColor;
    private final long id;
    private final boolean isExpanded;
    private final int maxRows;
    private final Tab moreTab;

    @NotNull
    private final TabPaddings paddings;
    private final int selectedTabIndex;

    @NotNull
    private final StickyRoundedCorners stickyRoundedCorners;

    @NotNull
    private final List<Tab> tabs;
    private final t trackingInfo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$StickyRoundedCorners;", "", "", "top", "bottom", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyRoundedCorners {
        private final int bottom;
        private final int top;

        public StickyRoundedCorners(int i11, int i12) {
            this.top = i11;
            this.bottom = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyRoundedCorners)) {
                return false;
            }
            StickyRoundedCorners stickyRoundedCorners = (StickyRoundedCorners) other;
            return this.top == stickyRoundedCorners.top && this.bottom == stickyRoundedCorners.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + (Integer.hashCode(this.top) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("StickyRoundedCorners(top=", this.top, ", bottom=", ")", this.bottom);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/scroll/ScrollTabAnchor;", "", "widgetScrollKey", "", "isMoreTab", "tagRadius", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tagButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(IZILru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;LWZ/t;)V", "copy", "(IZILru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;LWZ/t;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$Tab;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getWidgetScrollKey", "Z", "()Z", "getTagRadius", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab implements ScrollTabAnchor {
        private final boolean isMoreTab;

        @NotNull
        private final TagButtonDTO tagButton;
        private final int tagRadius;
        private final t trackingInfo;
        private final int widgetScrollKey;

        public Tab(int i11, boolean z11, int i12, @NotNull TagButtonDTO tagButton, t tVar) {
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            this.widgetScrollKey = i11;
            this.isMoreTab = z11;
            this.tagRadius = i12;
            this.tagButton = tagButton;
            this.trackingInfo = tVar;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, int i11, boolean z11, int i12, TagButtonDTO tagButtonDTO, t tVar, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = tab.widgetScrollKey;
            }
            if ((i13 & 2) != 0) {
                z11 = tab.isMoreTab;
            }
            if ((i13 & 4) != 0) {
                i12 = tab.tagRadius;
            }
            if ((i13 & 8) != 0) {
                tagButtonDTO = tab.tagButton;
            }
            if ((i13 & 16) != 0) {
                tVar = tab.trackingInfo;
            }
            t tVar2 = tVar;
            int i14 = i12;
            return tab.copy(i11, z11, i14, tagButtonDTO, tVar2);
        }

        @NotNull
        public final Tab copy(int widgetScrollKey, boolean isMoreTab, int tagRadius, @NotNull TagButtonDTO tagButton, t trackingInfo) {
            Intrinsics.checkNotNullParameter(tagButton, "tagButton");
            return new Tab(widgetScrollKey, isMoreTab, tagRadius, tagButton, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return this.widgetScrollKey == tab.widgetScrollKey && this.isMoreTab == tab.isMoreTab && this.tagRadius == tab.tagRadius && Intrinsics.d(this.tagButton, tab.tagButton) && Intrinsics.d(this.trackingInfo, tab.trackingInfo);
        }

        @NotNull
        public final TagButtonDTO getTagButton() {
            return this.tagButton;
        }

        public final int getTagRadius() {
            return this.tagRadius;
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        @Override // ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll.ScrollTabAnchor
        public int getWidgetScrollKey() {
            return this.widgetScrollKey;
        }

        public int hashCode() {
            int hashCode = (this.tagButton.hashCode() + C2454a.a(this.tagRadius, C3532b.a(Integer.hashCode(this.widgetScrollKey) * 31, 31, this.isMoreTab), 31)) * 31;
            t tVar = this.trackingInfo;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        /* renamed from: isMoreTab, reason: from getter */
        public final boolean getIsMoreTab() {
            return this.isMoreTab;
        }

        @NotNull
        public String toString() {
            int i11 = this.widgetScrollKey;
            boolean z11 = this.isMoreTab;
            int i12 = this.tagRadius;
            TagButtonDTO tagButtonDTO = this.tagButton;
            t tVar = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("Tab(widgetScrollKey=");
            sb2.append(i11);
            sb2.append(", isMoreTab=");
            sb2.append(z11);
            sb2.append(", tagRadius=");
            sb2.append(i12);
            sb2.append(", tagButton=");
            sb2.append(tagButtonDTO);
            sb2.append(", trackingInfo=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/CatalogTabsV2VO$TabPaddings;", "", "", "top", "horizontal", "between", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getHorizontal", "getBetween", "getBottom", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabPaddings {
        private final int between;
        private final int bottom;
        private final int horizontal;
        private final int top;

        public TabPaddings(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.horizontal = i12;
            this.between = i13;
            this.bottom = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabPaddings)) {
                return false;
            }
            TabPaddings tabPaddings = (TabPaddings) other;
            return this.top == tabPaddings.top && this.horizontal == tabPaddings.horizontal && this.between == tabPaddings.between && this.bottom == tabPaddings.bottom;
        }

        public final int getBetween() {
            return this.between;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getHorizontal() {
            return this.horizontal;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.between, C2454a.a(this.horizontal, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.between, this.bottom, ", bottom=", ")", C2438a.a("TabPaddings(top=", this.top, ", horizontal=", ", between=", this.horizontal));
        }
    }

    public CatalogTabsV2VO(long j11, boolean z11, @NotNull List<Tab> tabs, @NotNull String backgroundColor, @NotNull TabPaddings paddings, int i11, Tab tab, @NotNull StickyRoundedCorners stickyRoundedCorners, t tVar, int i12) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(stickyRoundedCorners, "stickyRoundedCorners");
        this.id = j11;
        this.isExpanded = z11;
        this.tabs = tabs;
        this.backgroundColor = backgroundColor;
        this.paddings = paddings;
        this.maxRows = i11;
        this.moreTab = tab;
        this.stickyRoundedCorners = stickyRoundedCorners;
        this.trackingInfo = tVar;
        this.selectedTabIndex = i12;
    }

    public static /* synthetic */ CatalogTabsV2VO copy$default(CatalogTabsV2VO catalogTabsV2VO, long j11, boolean z11, List list, String str, TabPaddings tabPaddings, int i11, Tab tab, StickyRoundedCorners stickyRoundedCorners, t tVar, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = catalogTabsV2VO.id;
        }
        long j12 = j11;
        if ((i13 & 2) != 0) {
            z11 = catalogTabsV2VO.isExpanded;
        }
        return catalogTabsV2VO.copy(j12, z11, (i13 & 4) != 0 ? catalogTabsV2VO.tabs : list, (i13 & 8) != 0 ? catalogTabsV2VO.backgroundColor : str, (i13 & 16) != 0 ? catalogTabsV2VO.paddings : tabPaddings, (i13 & 32) != 0 ? catalogTabsV2VO.maxRows : i11, (i13 & 64) != 0 ? catalogTabsV2VO.moreTab : tab, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? catalogTabsV2VO.stickyRoundedCorners : stickyRoundedCorners, (i13 & 256) != 0 ? catalogTabsV2VO.trackingInfo : tVar, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? catalogTabsV2VO.selectedTabIndex : i12);
    }

    @NotNull
    public final CatalogTabsV2VO copy(long id2, boolean isExpanded, @NotNull List<Tab> tabs, @NotNull String backgroundColor, @NotNull TabPaddings paddings, int maxRows, Tab moreTab, @NotNull StickyRoundedCorners stickyRoundedCorners, t trackingInfo, int selectedTabIndex) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(stickyRoundedCorners, "stickyRoundedCorners");
        return new CatalogTabsV2VO(id2, isExpanded, tabs, backgroundColor, paddings, maxRows, moreTab, stickyRoundedCorners, trackingInfo, selectedTabIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogTabsV2VO)) {
            return false;
        }
        CatalogTabsV2VO catalogTabsV2VO = (CatalogTabsV2VO) other;
        return this.id == catalogTabsV2VO.id && this.isExpanded == catalogTabsV2VO.isExpanded && Intrinsics.d(this.tabs, catalogTabsV2VO.tabs) && Intrinsics.d(this.backgroundColor, catalogTabsV2VO.backgroundColor) && Intrinsics.d(this.paddings, catalogTabsV2VO.paddings) && this.maxRows == catalogTabsV2VO.maxRows && Intrinsics.d(this.moreTab, catalogTabsV2VO.moreTab) && Intrinsics.d(this.stickyRoundedCorners, catalogTabsV2VO.stickyRoundedCorners) && Intrinsics.d(this.trackingInfo, catalogTabsV2VO.trackingInfo) && this.selectedTabIndex == catalogTabsV2VO.selectedTabIndex;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMaxRows() {
        return this.maxRows;
    }

    public final Tab getMoreTab() {
        return this.moreTab;
    }

    @NotNull
    public final TabPaddings getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    @NotNull
    public final StickyRoundedCorners getStickyRoundedCorners() {
        return this.stickyRoundedCorners;
    }

    @NotNull
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.maxRows, (this.paddings.hashCode() + g.a(g.b(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isExpanded), 31, this.tabs), 31, this.backgroundColor)) * 31, 31);
        Tab tab = this.moreTab;
        int hashCode = (this.stickyRoundedCorners.hashCode() + ((a11 + (tab == null ? 0 : tab.hashCode())) * 31)) * 31;
        t tVar = this.trackingInfo;
        return Integer.hashCode(this.selectedTabIndex) + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isExpanded;
        List<Tab> list = this.tabs;
        String str = this.backgroundColor;
        TabPaddings tabPaddings = this.paddings;
        int i11 = this.maxRows;
        Tab tab = this.moreTab;
        StickyRoundedCorners stickyRoundedCorners = this.stickyRoundedCorners;
        t tVar = this.trackingInfo;
        int i12 = this.selectedTabIndex;
        StringBuilder c11 = Bl.b.c(j11, "CatalogTabsV2VO(id=", ", isExpanded=", z11);
        c11.append(", tabs=");
        c11.append(list);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(", paddings=");
        c11.append(tabPaddings);
        c11.append(", maxRows=");
        c11.append(i11);
        c11.append(", moreTab=");
        c11.append(tab);
        c11.append(", stickyRoundedCorners=");
        c11.append(stickyRoundedCorners);
        c11.append(", trackingInfo=");
        c11.append(tVar);
        c11.append(", selectedTabIndex=");
        c11.append(i12);
        c11.append(")");
        return c11.toString();
    }
}
