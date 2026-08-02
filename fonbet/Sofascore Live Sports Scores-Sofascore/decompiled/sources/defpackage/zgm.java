package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.delegates.BlazePlayerContainerTabsDelegate;
import com.blaze.blazesdk.features.moments.container.tabs.models.BlazeMomentsContainerTabItem;
import com.blaze.blazesdk.features.moments.inline.BlazeMomentsInlinePlayer;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.BlazePlayerButtonCustomImageStates;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.players.tabs.BlazePlayerTabItemStyle;
import com.blaze.blazesdk.style.players.tabs.BlazePlayerTabsGradientStyle;
import com.blaze.blazesdk.style.players.tabs.BlazePlayerTabsStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.google.android.material.tabs.TabLayout;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.hzl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zgm extends ConstraintLayout {
    public static final /* synthetic */ int m = 0;
    public final u6b a;
    public final ttk b;
    public final eum c;
    public hzl d;
    public tbm e;
    public g9m f;
    public BlazePlayerContainerTabsDelegate g;
    public String h;
    public boolean i;
    public osi j;
    public crl k;
    public final mqi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgm(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        super(context, attributeSet, i);
        context.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
        this.a = u6bVar;
        this.b = ttkVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_tabs, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.blaze_playerContainerMockup;
        if (nq8.B(R.id.blaze_playerContainerMockup, inflate) != null) {
            i2 = R.id.blaze_tabItemsRV;
            ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.blaze_tabItemsRV, inflate);
            if (viewPager2 != null) {
                i2 = R.id.blaze_tabItemsTabLayout;
                TabLayout tabLayout = (TabLayout) nq8.B(R.id.blaze_tabItemsTabLayout, inflate);
                if (tabLayout != null) {
                    i2 = R.id.blaze_tabsGradient;
                    View B = nq8.B(R.id.blaze_tabsGradient, inflate);
                    if (B != null) {
                        this.c = new eum((ConstraintLayout) inflate, viewPager2, tabLayout, B);
                        this.l = ypa.b(new vem(this, 2));
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BlazeMomentsContainerTabItem> getTabItems() {
        crl crlVar = this.k;
        List visibleTabs = crlVar != null ? ((brl) crlVar).a.getVisibleTabs() : null;
        if (visibleTabs == null) {
            visibleTabs = km5.a;
        }
        return CollectionsKt.S0(visibleTabs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BlazePlayerTabsStyle getTabsStyle() {
        BlazePlayerTabsStyle blazePlayerTabsStyle;
        crl crlVar = this.k;
        if (crlVar == null) {
            return null;
        }
        blazePlayerTabsStyle = ((brl) crlVar).a.tabsStyle;
        return blazePlayerTabsStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yim getTabsViewModel() {
        return (yim) this.l.getValue();
    }

    public static void k(jsi jsiVar, BlazeMomentsContainerTabItem blazeMomentsContainerTabItem, BlazePlayerTabsStyle blazePlayerTabsStyle, Boolean bool) {
        boolean booleanValue = bool != null ? bool.booleanValue() : jsiVar.a();
        BlazePlayerTabItemStyle selectedTabState = booleanValue ? blazePlayerTabsStyle.getSelectedTabState() : blazePlayerTabsStyle.getUnselectedTabState();
        Context context = jsiVar.e.getContext();
        context.getClass();
        String title = blazeMomentsContainerTabItem != null ? blazeMomentsContainerTabItem.getTitle() : null;
        if (title == null) {
            title = "";
        }
        BlazeTextWithIconButton blazeTextWithIconButton = new BlazeTextWithIconButton(context, null, 0, 6, null);
        blazeTextWithIconButton.setText(title);
        blazeTextWithIconButton.setTextSize(selectedTabState.getTextSize());
        blazeTextWithIconButton.setTextColor(selectedTabState.getTextColor());
        BlazeTextWithIconButton.setTypefaceFromResource$default(blazeTextWithIconButton, selectedTabState.getFontResId(), null, null, 6, null);
        blazeTextWithIconButton.setLetterSpacing(selectedTabState.getLetterSpacing());
        BlazeDp lineHeight = selectedTabState.getLineHeight();
        blazeTextWithIconButton.setLineHeight(lineHeight != null ? Integer.valueOf(lineHeight.getToPx$blazesdk_release()) : null);
        boolean z = false;
        blazeTextWithIconButton.setCardBackgroundColor(0);
        blazeTextWithIconButton.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        blazeTextWithIconButton.setRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        blazeTextWithIconButton.setClickable(false);
        blazeTextWithIconButton.setFocusable(false);
        l(blazeTextWithIconButton, booleanValue, blazeMomentsContainerTabItem, blazePlayerTabsStyle.getIcon());
        jsiVar.c = blazeTextWithIconButton;
        lsi lsiVar = jsiVar.e;
        if (lsiVar != null) {
            lsiVar.e();
            jsi jsiVar2 = lsiVar.a;
            if (jsiVar2 != null && jsiVar2.a()) {
                z = true;
            }
            lsiVar.setSelected(z);
        }
    }

    public static void l(BlazeTextWithIconButton blazeTextWithIconButton, boolean z, BlazeMomentsContainerTabItem blazeMomentsContainerTabItem, BlazePlayerTabsStyle.BlazePlayerTabItemIconStyle blazePlayerTabItemIconStyle) {
        BlazePlayerButtonCustomImageStates icon;
        BlazePlayerButtonCustomImageStates icon2;
        if (blazePlayerTabItemIconStyle != null) {
            if (h6m.a[blazePlayerTabItemIconStyle.getIconPositioning().ordinal()] != 1) {
                zzl.b();
                return;
            }
            Integer imageSelectedPathResId = (blazeMomentsContainerTabItem == null || (icon2 = blazeMomentsContainerTabItem.getIcon()) == null) ? null : icon2.getImageSelectedPathResId();
            Integer valueOf = (blazeMomentsContainerTabItem == null || (icon = blazeMomentsContainerTabItem.getIcon()) == null) ? null : Integer.valueOf(icon.getImageUnselectedPathResId());
            if (!z || imageSelectedPathResId == null) {
                imageSelectedPathResId = valueOf;
            }
            if (imageSelectedPathResId != null) {
                blazeTextWithIconButton.setDrawableStart(imageSelectedPathResId.intValue());
            }
            Integer iconTint = blazePlayerTabItemIconStyle.getIconTint();
            if (iconTint != null) {
                blazeTextWithIconButton.setDrawableStartTintColor(iconTint.intValue());
            } else {
                blazeTextWithIconButton.setDrawableStartTintColor(blazeTextWithIconButton.g.getCurrentTextColor());
            }
            BlazeDp padding = blazePlayerTabItemIconStyle.getPadding();
            BlazeTextWithIconButton.setDrawablePadding$default(blazeTextWithIconButton, padding != null ? Integer.valueOf(padding.getToPx$blazesdk_release()) : null, null, 2, null);
        }
    }

    public static final void o(zgm zgmVar, List list, int i) {
        hzl hzlVar = zgmVar.d;
        eum eumVar = zgmVar.c;
        if (hzlVar != null) {
            hzlVar.p(list);
        }
        if (!list.isEmpty()) {
            eumVar.b.c(llf.c(i, 0, list.size() - 1), false);
        }
        osi osiVar = zgmVar.j;
        if (osiVar != null) {
            osiVar.a();
        }
        ViewPager2 viewPager2 = eumVar.b;
        TabLayout tabLayout = eumVar.c;
        jsi h = tabLayout.h(viewPager2.getCurrentItem());
        if (h != null) {
            tabLayout.l(h, true);
        }
        BlazePlayerTabsStyle tabsStyle = zgmVar.getTabsStyle();
        if (tabsStyle != null) {
            zgmVar.n(tabsStyle);
        }
        int tabCount = tabLayout.getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            jsi h2 = tabLayout.h(i2);
            if (h2 != null) {
                lsi lsiVar = h2.e;
                lsiVar.getClass();
                lsiVar.setOnTouchListener(new f6(zgmVar, 6));
            }
        }
    }

    public static final void p(zgm zgmVar, eum eumVar, jsi jsiVar, int i) {
        BlazePlayerTabsStyle tabsStyle = zgmVar.getTabsStyle();
        if (tabsStyle == null) {
            return;
        }
        k(jsiVar, (BlazeMomentsContainerTabItem) CollectionsKt.a0(i, zgmVar.getTabItems()), tabsStyle, Boolean.valueOf(i == eumVar.b.getCurrentItem()));
    }

    public static /* synthetic */ void setup$default(zgm zgmVar, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, String str, crl crlVar, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, int i, Object obj) {
        if ((i & 16) != 0) {
            blazeMomentsPlaybackConfiguration = null;
        }
        zgmVar.m(blazeMomentsPlayerStyle, blazePlayerContainerTabsDelegate, str, crlVar, blazeMomentsPlaybackConfiguration);
    }

    private final void setupTabsGradient(BlazePlayerTabsStyle blazePlayerTabsStyle) {
        View view = this.c.d;
        view.getClass();
        BlazePlayerTabsGradientStyle gradient = blazePlayerTabsStyle.getGradient();
        if (gradient.isVisible()) {
            evl.applyGradient$default(view, b.j(Integer.valueOf(gradient.getStartColor()), Integer.valueOf(gradient.getMiddleColor()), Integer.valueOf(gradient.getEndColor())), null, null, 6, null);
        }
    }

    public final void j(int i) {
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer;
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer2;
        hzl hzlVar = this.d;
        if (hzlVar != null) {
            LinkedHashMap linkedHashMap = hzlVar.j;
            Integer num = hzlVar.k;
            if (num != null && num.intValue() == i) {
                return;
            }
            hzl.b bVar = (hzl.b) linkedHashMap.get(hzlVar.k);
            if (bVar != null && (blazeMomentsInlinePlayer2 = bVar.c) != null) {
                blazeMomentsInlinePlayer2.embedPlaceholder();
            }
            hzlVar.k = Integer.valueOf(i);
            hzl.b bVar2 = (hzl.b) linkedHashMap.get(Integer.valueOf(i));
            if (bVar2 == null || (blazeMomentsInlinePlayer = bVar2.c) == null) {
                return;
            }
            blazeMomentsInlinePlayer.embedPlayer(true);
        }
    }

    public final void m(BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, String str, crl crlVar, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        blazeMomentsPlayerStyle.getClass();
        blazePlayerContainerTabsDelegate.getClass();
        str.getClass();
        crlVar.getClass();
        this.d = null;
        this.g = null;
        this.h = null;
        this.k = null;
        osi osiVar = this.j;
        if (osiVar != null) {
            osiVar.b();
        }
        this.j = null;
        tbm tbmVar = this.e;
        eum eumVar = this.c;
        if (tbmVar != null) {
            eumVar.c.L.remove(tbmVar);
            this.e = null;
        }
        g9m g9mVar = this.f;
        if (g9mVar != null) {
            eumVar.b.e(g9mVar);
            this.f = null;
        }
        this.g = blazePlayerContainerTabsDelegate;
        this.h = str;
        this.k = crlVar;
        ViewPager2 viewPager2 = eumVar.b;
        TabLayout tabLayout = eumVar.c;
        ViewPager2 viewPager22 = eumVar.b;
        int i = 0;
        viewPager2.setUserInputEnabled(false);
        hzl hzlVar = new hzl(blazeMomentsPlayerStyle, blazePlayerContainerTabsDelegate, new vem(this, i), new vem(this, 1), new iol(this, 9), this.a, this.b, blazeMomentsPlaybackConfiguration);
        this.d = hzlVar;
        viewPager22.setAdapter(hzlVar);
        viewPager22.setOffscreenPageLimit(1);
        RecyclerView o = evl.o(viewPager22);
        if (o != null) {
            try {
                o.setNestedScrollingEnabled(false);
                o.setOverScrollMode(2);
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
        tabLayout.getClass();
        tabLayout.setVisibility(4);
        View view = eumVar.d;
        view.getClass();
        view.setVisibility(4);
        tabLayout.setBackground(null);
        tabLayout.setTabRippleColor(null);
        tabLayout.setSelectedTabIndicator((Drawable) null);
        this.j = new osi(tabLayout, viewPager22, new ow9(20, this, eumVar));
        BlazePlayerTabsStyle tabsStyle = getTabsStyle();
        if (tabsStyle != null) {
            tabLayout.setPadding(tabsStyle.getPadding().getStart().getToPx$blazesdk_release(), tabsStyle.getPadding().getTop().getToPx$blazesdk_release(), tabsStyle.getPadding().getEnd().getToPx$blazesdk_release(), tabsStyle.getPadding().getBottom().getToPx$blazesdk_release());
            setupTabsGradient(tabsStyle);
        }
        tabLayout.post(new wem(i, blazeMomentsPlayerStyle, this));
    }

    public final void n(BlazePlayerTabsStyle blazePlayerTabsStyle) {
        TabLayout tabLayout = this.c.c;
        tabLayout.getClass();
        List<BlazeMomentsContainerTabItem> tabItems = getTabItems();
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            jsi h = tabLayout.h(i);
            if (h != null) {
                BlazeMomentsContainerTabItem blazeMomentsContainerTabItem = (BlazeMomentsContainerTabItem) CollectionsKt.a0(i, tabItems);
                View view = h.c;
                BlazeTextWithIconButton blazeTextWithIconButton = view instanceof BlazeTextWithIconButton ? (BlazeTextWithIconButton) view : null;
                if (blazeTextWithIconButton != null) {
                    boolean a = h.a();
                    BlazePlayerTabItemStyle selectedTabState = a ? blazePlayerTabsStyle.getSelectedTabState() : blazePlayerTabsStyle.getUnselectedTabState();
                    blazeTextWithIconButton.setTextSize(selectedTabState.getTextSize());
                    blazeTextWithIconButton.setTextColor(selectedTabState.getTextColor());
                    BlazeTextWithIconButton.setTypefaceFromResource$default(blazeTextWithIconButton, selectedTabState.getFontResId(), null, null, 6, null);
                    blazeTextWithIconButton.setLetterSpacing(selectedTabState.getLetterSpacing());
                    BlazeDp lineHeight = selectedTabState.getLineHeight();
                    blazeTextWithIconButton.setLineHeight(lineHeight != null ? Integer.valueOf(lineHeight.getToPx$blazesdk_release()) : null);
                    l(blazeTextWithIconButton, a, blazeMomentsContainerTabItem, blazePlayerTabsStyle.getIcon());
                } else {
                    k(h, blazeMomentsContainerTabItem, blazePlayerTabsStyle, null);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eum eumVar = this.c;
        tbm tbmVar = new tbm(eumVar);
        this.e = tbmVar;
        eumVar.c.a(tbmVar);
        g9m g9mVar = new g9m(this, new fsf());
        this.f = g9mVar;
        eumVar.b.a(g9mVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tbm tbmVar = this.e;
        eum eumVar = this.c;
        if (tbmVar != null) {
            eumVar.c.L.remove(tbmVar);
            this.e = null;
        }
        g9m g9mVar = this.f;
        if (g9mVar != null) {
            eumVar.b.e(g9mVar);
            this.f = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r1 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r3 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r4.c.c.post(new defpackage.pn0(r4, r3.intValue(), 19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(String str) {
        str.getClass();
        Iterator<T> it = getTabItems().iterator();
        int i = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                b.q();
                throw null;
            }
            if (Intrinsics.c(((BlazeMomentsContainerTabItem) next).getContainerId(), str)) {
                break;
            } else {
                i++;
            }
        }
    }

    public final void s(int i) {
        List<BlazeMomentsContainerTabItem> tabItems = getTabItems();
        if (i < 0 || i >= tabItems.size()) {
            return;
        }
        q(tabItems.get(i).getContainerId());
    }

    public final void u() {
        BlazePlayerTabsStyle tabsStyle = getTabsStyle();
        if (tabsStyle == null) {
            return;
        }
        this.c.c.setPadding(tabsStyle.getPadding().getStart().getToPx$blazesdk_release(), tabsStyle.getPadding().getTop().getToPx$blazesdk_release(), tabsStyle.getPadding().getEnd().getToPx$blazesdk_release(), tabsStyle.getPadding().getBottom().getToPx$blazesdk_release());
        setupTabsGradient(tabsStyle);
        n(tabsStyle);
    }

    public final void v(int i) {
        this.c.c.post(new uu1(this, getTabItems(), i, 12));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zgm(@NotNull Context context, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        this(context, null, 0, u6bVar, ttkVar, 6, null);
        context.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
    }

    public /* synthetic */ zgm(Context context, AttributeSet attributeSet, int i, u6b u6bVar, ttk ttkVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, u6bVar, ttkVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zgm(@NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        this(context, attributeSet, 0, u6bVar, ttkVar, 4, null);
        context.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
    }
}
