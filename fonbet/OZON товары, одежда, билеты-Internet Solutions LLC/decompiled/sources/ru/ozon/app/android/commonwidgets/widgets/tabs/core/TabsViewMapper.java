package ru.ozon.app.android.commonwidgets.widgets.tabs.core;

import T7.E;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.tabs.data.TabsDTO;
import ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsVO;
import ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\u00060\nj\u0002`\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/data/TabsDTO;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsMapper;", "tabsMapper", "<init>", "(Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsMapper;)V", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO;Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO;)Ljava/lang/Object;", "mapper", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsMapper;", "getMapper", "()Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/widgets/base/StickyConfig;", "widgetStickyConfig", "Ljava/lang/String;", "getWidgetStickyConfig-H4O2Is4", "()Ljava/lang/String;", "TabsPayload", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabsViewMapper extends WidgetViewMapper<TabsDTO, TabsVO> {

    @NotNull
    private final Function2<View, ComposerReferences, TabsViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final TabsMapper mapper;

    @NotNull
    private final String widgetStickyConfig;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload;", "", "<init>", "()V", "tabIndex", "", "getTabIndex", "()I", "Title", "Badge", "BadgeColor", "Selection", "Deeplink", "ScrollingMode", "MinWidth", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$Badge;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$BadgeColor;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$Deeplink;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$MinWidth;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$ScrollingMode;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$Selection;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$Title;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static abstract class TabsPayload {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$Badge;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload;", "", "tabIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabIndex", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Badge extends TabsPayload {
            private final int tabIndex;

            public Badge(int i11) {
                super(null);
                this.tabIndex = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Badge) && this.tabIndex == ((Badge) other).tabIndex;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper.TabsPayload
            public int getTabIndex() {
                return this.tabIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.tabIndex);
            }

            @NotNull
            public String toString() {
                return E.a(this.tabIndex, "Badge(tabIndex=", ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$BadgeColor;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload;", "", "tabIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabIndex", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BadgeColor extends TabsPayload {
            private final int tabIndex;

            public BadgeColor(int i11) {
                super(null);
                this.tabIndex = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BadgeColor) && this.tabIndex == ((BadgeColor) other).tabIndex;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper.TabsPayload
            public int getTabIndex() {
                return this.tabIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.tabIndex);
            }

            @NotNull
            public String toString() {
                return E.a(this.tabIndex, "BadgeColor(tabIndex=", ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$Deeplink;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload;", "", "tabIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabIndex", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Deeplink extends TabsPayload {
            private final int tabIndex;

            public Deeplink(int i11) {
                super(null);
                this.tabIndex = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Deeplink) && this.tabIndex == ((Deeplink) other).tabIndex;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper.TabsPayload
            public int getTabIndex() {
                return this.tabIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.tabIndex);
            }

            @NotNull
            public String toString() {
                return E.a(this.tabIndex, "Deeplink(tabIndex=", ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$MinWidth;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload;", "", "tabIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabIndex", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MinWidth extends TabsPayload {
            private final int tabIndex;

            public MinWidth(int i11) {
                super(null);
                this.tabIndex = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MinWidth) && this.tabIndex == ((MinWidth) other).tabIndex;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper.TabsPayload
            public int getTabIndex() {
                return this.tabIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.tabIndex);
            }

            @NotNull
            public String toString() {
                return E.a(this.tabIndex, "MinWidth(tabIndex=", ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$ScrollingMode;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload;", "", "tabIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabIndex", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ScrollingMode extends TabsPayload {
            private final int tabIndex;

            public ScrollingMode(int i11) {
                super(null);
                this.tabIndex = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ScrollingMode) && this.tabIndex == ((ScrollingMode) other).tabIndex;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper.TabsPayload
            public int getTabIndex() {
                return this.tabIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.tabIndex);
            }

            @NotNull
            public String toString() {
                return E.a(this.tabIndex, "ScrollingMode(tabIndex=", ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$Selection;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload;", "", "tabIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabIndex", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Selection extends TabsPayload {
            private final int tabIndex;

            public Selection(int i11) {
                super(null);
                this.tabIndex = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Selection) && this.tabIndex == ((Selection) other).tabIndex;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper.TabsPayload
            public int getTabIndex() {
                return this.tabIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.tabIndex);
            }

            @NotNull
            public String toString() {
                return E.a(this.tabIndex, "Selection(tabIndex=", ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload$Title;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/core/TabsViewMapper$TabsPayload;", "", "tabIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTabIndex", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Title extends TabsPayload {
            private final int tabIndex;

            public Title(int i11) {
                super(null);
                this.tabIndex = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Title) && this.tabIndex == ((Title) other).tabIndex;
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper.TabsPayload
            public int getTabIndex() {
                return this.tabIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.tabIndex);
            }

            @NotNull
            public String toString() {
                return E.a(this.tabIndex, "Title(tabIndex=", ")");
            }
        }

        public /* synthetic */ TabsPayload(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getTabIndex();

        private TabsPayload() {
        }
    }

    public TabsViewMapper(@NotNull TabsMapper tabsMapper) {
        Intrinsics.checkNotNullParameter(tabsMapper, "tabsMapper");
        this.mapper = tabsMapper;
        this.layout = R$layout.widget_common_tabs;
        this.holderProducer = TabsViewMapper$holderProducer$1.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("TabsViewMapper", "getSimpleName(...)");
        Intrinsics.checkNotNullParameter("TabsViewMapper", "tag");
        this.widgetStickyConfig = "TabsViewMapper";
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TabsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: getWidgetStickyConfig-H4O2Is4, reason: not valid java name and from getter */
    public String getWidgetStickyConfig() {
        return this.widgetStickyConfig;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TabsDTO, d, List<TabsVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull TabsVO oldItem, @NotNull TabsVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getTabs().size() != newItem.getTabs().size()) {
            return null;
        }
        ArrayList b12 = C7714v.b1(oldItem.getTabs(), newItem.getTabs());
        ArrayList arrayList = new ArrayList();
        Iterator it = b12.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            Pair pair = (Pair) next;
            TabsVO.TabsItemVO tabsItemVO = (TabsVO.TabsItemVO) pair.a();
            TabsVO.TabsItemVO tabsItemVO2 = (TabsVO.TabsItemVO) pair.b();
            if (!Intrinsics.d(tabsItemVO.getTitle(), tabsItemVO2.getTitle())) {
                arrayList.add(new TabsPayload.Title(i11));
            }
            if (!Intrinsics.d(tabsItemVO.getBadge(), tabsItemVO2.getBadge())) {
                arrayList.add(new TabsPayload.Badge(i11));
            }
            if (tabsItemVO.getBadgeColor() != tabsItemVO2.getBadgeColor()) {
                arrayList.add(new TabsPayload.BadgeColor(i11));
            }
            if (tabsItemVO.getIsSelected() != tabsItemVO2.getIsSelected()) {
                arrayList.add(new TabsPayload.Selection(i11));
            }
            if (!Intrinsics.d(tabsItemVO.getDeeplink(), tabsItemVO2.getDeeplink())) {
                arrayList.add(new TabsPayload.Deeplink(i11));
            }
            if (oldItem.getIsScrollable() != newItem.getIsScrollable()) {
                arrayList.add(new TabsPayload.ScrollingMode(i11));
            }
            if (!Intrinsics.d(oldItem.getScrollableMinWidth(), newItem.getScrollableMinWidth())) {
                arrayList.add(new TabsPayload.MinWidth(i11));
            }
            i11 = i12;
        }
        return arrayList;
    }
}
