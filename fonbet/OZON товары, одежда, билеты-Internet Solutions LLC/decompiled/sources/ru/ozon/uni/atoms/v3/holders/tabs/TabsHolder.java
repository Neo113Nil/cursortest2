package ru.ozon.uni.atoms.v3.holders.tabs;

import Nx.ViewOnClickListenerC3676a;
import Sc.o;
import android.content.Context;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.tabs.TabView;
import ru.ozon.uni.android.atom.tabs.TabsView;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0016\u0010\u000f\u001a\u00020\r*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u001d*\u0004\u0018\u00010\u001d2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0002¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/tabs/TabsHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Lru/ozon/uni/android/atom/tabs/TabsView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/tabs/TabsView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "setOnClick", "Lru/ozon/uni/android/atom/tabs/TabView;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "mapStyle", "", "style", "Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;", "toTabBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "toTabIndicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "tabsStyle", "resolveIndicatorStyle", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO$Style;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabsHolder extends AtomV3<TabsDTO, TabsView> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TabsDTO.Style.values().length];
            try {
                iArr[TabsDTO.Style.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TabsDTO.Style.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TabsDTO.Style.ACCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsHolder(@NotNull TabsView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final int mapStyle(TabsDTO.Style style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i11 == -1 || i11 == 1 || i11 == 2) {
            return R$style.Tab_Base;
        }
        if (i11 == 3) {
            return R$style.Tab_Accent;
        }
        throw new o();
    }

    private final IndicatorDTO.Style resolveIndicatorStyle(IndicatorDTO.Style style, TabsDTO.Style style2) {
        int i11 = style2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style2.ordinal()];
        if (i11 == -1 || i11 == 1 || i11 == 2) {
            if (style != IndicatorDTO.Style.ACCENT) {
                return IndicatorDTO.Style.NEUTRAL;
            }
        } else {
            if (i11 != 3) {
                throw new o();
            }
            if (style != IndicatorDTO.Style.ACCENT) {
                return IndicatorDTO.Style.NEUTRAL_ON_DARK;
            }
        }
        return style;
    }

    private final void setOnClick(TabView tabView, CommonControlSettings commonControlSettings) {
        tabView.setOnClickListener(new ViewOnClickListenerC3676a(4, commonControlSettings, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClick$lambda$8(CommonControlSettings commonControlSettings, TabsHolder tabsHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        if (commonControlSettings == null || (action = commonControlSettings.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo())) == null) {
            return;
        }
        tabsHolder.handleAction(atomAction);
    }

    private final BadgeDTO toTabBadge(BadgeDTO badgeDTO) {
        BadgeDTO.BadgeSize badgeSize = BadgeDTO.BadgeSize.SIZE_300;
        BadgeDTO.Style styleType = badgeDTO.getStyleType();
        if (styleType == null && (styleType = badgeDTO.getStyle()) == null) {
            styleType = BadgeDTO.Style.POSITIVE_SECONDARY;
        }
        return BadgeDTO.copy$default(badgeDTO, null, null, badgeSize, null, null, null, null, Boolean.TRUE, styleType, null, null, null, 3705, null);
    }

    private final IndicatorDTO toTabIndicator(IndicatorDTO indicatorDTO, TabsDTO.Style style) {
        String text = indicatorDTO.getText();
        IndicatorDTO.IndicatorSize indicatorSize = (text == null || text.length() == 0) ? IndicatorDTO.IndicatorSize.SIZE_400 : IndicatorDTO.IndicatorSize.SIZE_500;
        IndicatorDTO.Style styleType = indicatorDTO.getStyleType();
        if (styleType == null) {
            styleType = indicatorDTO.getStyle();
        }
        return IndicatorDTO.copy$default(indicatorDTO, null, null, indicatorSize, null, null, null, null, null, null, resolveIndicatorStyle(styleType, style), null, 1529, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabsHolder(@NotNull Context context, String str) {
        this(new TabsView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r8 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c9  */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBind(@NotNull TabsDTO item) {
        boolean roundCornersFlag;
        Color color;
        List<TabsDTO.TabDTO> tabs;
        Iterator<T> it;
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((TabsHolder) item);
        TabsView containerView = getContainerView();
        Rounds round = item.getRound();
        if (round != null) {
            roundCornersFlag = round.getRoundCorners();
        } else {
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag(context);
        }
        containerView.setRoundCorners$uni_release(roundCornersFlag);
        boolean z11 = true;
        if (item.getTabs().size() < containerView.getChildCount()) {
            containerView.removeViewAt(containerView.getChildCount() - 1);
        } else {
            int size = item.getTabs().size() - containerView.getChildCount();
            for (int i12 = 0; i12 < size; i12++) {
                containerView.addTab$uni_release();
            }
        }
        String backgroundColor = item.getBackgroundColor();
        if (backgroundColor != null) {
            if (!(item.getTabStyle() == TabsDTO.Style.CUSTOM)) {
                backgroundColor = null;
            }
            if (backgroundColor != null) {
                UniGradient gradientByToken = TokensExtKt.getGradientByToken(backgroundColor);
                if (gradientByToken != null) {
                    Context context2 = containerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    color = TokensExtKt.toGradient(gradientByToken, context2);
                }
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context3 = containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Integer parseColor = styleParser.parseColor(context3, backgroundColor);
                if (parseColor != null) {
                    color = new Color.Solid(parseColor.intValue());
                    containerView.setBackgroundColor(color);
                    tabs = item.getTabs();
                    if ((tabs instanceof Collection) || !tabs.isEmpty()) {
                        it = tabs.iterator();
                        i11 = 0;
                        while (it.hasNext()) {
                            String subtitle = ((TabsDTO.TabDTO) it.next()).getSubtitle();
                            if (!(subtitle == null || subtitle.length() == 0) && (i11 = i11 + 1) < 0) {
                                C7714v.N0();
                                throw null;
                            }
                        }
                    } else {
                        i11 = 0;
                    }
                    boolean z12 = i11 != item.getTabs().size();
                    int mapStyle = mapStyle(item.getTabStyle());
                    int i13 = 0;
                    for (Object obj : item.getTabs()) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        TabsDTO.TabDTO tabDTO = (TabsDTO.TabDTO) obj;
                        View childAt = containerView.getChildAt(i13);
                        TabView tabView = childAt instanceof TabView ? (TabView) childAt : null;
                        if (tabView != null) {
                            setOnClick(tabView, tabDTO.getCommon());
                            tabView.setRoundCorners$uni_release(getContainerView().getRoundCorners());
                            tabView.setTabSelected(i13 == item.getSelectedTabIndex() ? z11 : false);
                            tabView.setHideSubtitle((Intrinsics.d(item.getHideSubtitle(), Boolean.TRUE) || !z12) ? z11 : false);
                            TabsHolder$onBind$1$4$1$setCustomColors$1 tabsHolder$onBind$1$4$1$setCustomColors$1 = new TabsHolder$onBind$1$4$1$setCustomColors$1(tabDTO, tabView, item);
                            tabsHolder$onBind$1$4$1$setCustomColors$1.invoke();
                            tabView.setStyle(mapStyle);
                            tabsHolder$onBind$1$4$1$setCustomColors$1.invoke();
                            tabView.setHasIndicator$uni_release(tabDTO.getIndicator() != null ? z11 : false);
                            tabView.setHasBadge$uni_release(tabDTO.getBadge() != null ? z11 : false);
                            BadgeView badgeView = tabView.getBadgeView();
                            if (badgeView != null) {
                                BadgeDTO badge = tabDTO.getBadge();
                                BadgeHolderKt.bindOrGone$default(badgeView, badge != null ? toTabBadge(badge) : null, (Function1) null, 2, (Object) null);
                            }
                            IndicatorView indicatorView = tabView.getIndicatorView();
                            if (indicatorView != null) {
                                IndicatorDTO indicator = tabDTO.getIndicator();
                                IndicatorHolderKt.bindOrGone$default(indicatorView, indicator != null ? toTabIndicator(indicator, item.getTabStyle()) : null, null, 2, null);
                            }
                            DrawableResource.Companion companion = DrawableResource.INSTANCE;
                            CommonAtomIconDTO icon = tabDTO.getIcon();
                            tabView.setIcon(companion.fromToken(icon != null ? icon.getIcon() : null));
                            StyleParser styleParser2 = StyleParser.INSTANCE;
                            Context context4 = tabView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                            CommonAtomIconDTO icon2 = tabDTO.getIcon();
                            tabView.setIconColor(styleParser2.parseColor(context4, icon2 != null ? icon2.getTintColor() : null));
                            Boolean isSelectionDisabled = tabDTO.isSelectionDisabled();
                            tabView.setSelectionDisabled$uni_release(isSelectionDisabled != null ? isSelectionDisabled.booleanValue() : false);
                        }
                        i13 = i14;
                        z11 = true;
                    }
                }
            }
        }
        color = null;
        containerView.setBackgroundColor(color);
        tabs = item.getTabs();
        if (tabs instanceof Collection) {
        }
        it = tabs.iterator();
        i11 = 0;
        while (it.hasNext()) {
        }
        if (i11 != item.getTabs().size()) {
        }
        int mapStyle2 = mapStyle(item.getTabStyle());
        int i132 = 0;
        while (r9.hasNext()) {
        }
    }
}
