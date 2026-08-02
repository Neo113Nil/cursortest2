package Wc;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.AbstractC2094j0;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.PixelUtil;
import dd.AbstractC4055b;
import ia.e;
import ia.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l.AbstractC5335a;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13224c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ma.c f13225a;

    /* renamed from: b, reason: collision with root package name */
    public final int[][] f13226b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(ma.c bottomNavigationView) {
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        this.f13225a = bottomNavigationView;
        this.f13226b = new int[][]{new int[]{-16842910}, new int[]{R.attr.state_selected}, new int[]{R.attr.state_focused}, new int[0]};
    }

    public final void a(Context context, MenuItem menuItem, com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen, b bVar) {
        Integer h10;
        Integer i10;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        int itemId = menuItem.getItemId();
        String badgeValue = tabsScreen.getBadgeValue();
        if (badgeValue == null) {
            com.google.android.material.badge.a d10 = this.f13225a.d(itemId);
            if (d10 != null) {
                d10.X(false);
                return;
            }
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull(badgeValue);
        com.google.android.material.badge.a e10 = this.f13225a.e(itemId);
        Intrinsics.checkNotNullExpressionValue(e10, "getOrCreateBadge(...)");
        e10.X(true);
        e10.f();
        e10.e();
        if (intOrNull != null) {
            e10.V(intOrNull.intValue());
        } else if (!Intrinsics.areEqual(badgeValue, "")) {
            e10.W(badgeValue);
        }
        e10.U((bVar == null || (i10 = bVar.i()) == null) ? AbstractC4055b.b(context, ia.c.f48246m, 0, 4, null) : i10.intValue());
        e10.S((bVar == null || (h10 = bVar.h()) == null) ? AbstractC4055b.b(context, AbstractC5335a.f55007v, 0, 4, null) : h10.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Context context, b bVar) {
        String n10;
        Integer intOrNull;
        String str;
        float dimension;
        float dimension2;
        Float o10;
        Float p10;
        Intrinsics.checkNotNullParameter(context, "context");
        View childAt = this.f13225a.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view : AbstractC2094j0.a((ViewGroup) childAt)) {
            TextView textView = (TextView) view.findViewById(g.f48418Z);
            TextView textView2 = (TextView) view.findViewById(g.f48420a0);
            boolean areEqual = Intrinsics.areEqual(bVar != null ? bVar.m() : null, "italic");
            int intValue = Intrinsics.areEqual(bVar != null ? bVar.n() : null, "bold") ? ReactFontManager.TypefaceStyle.BOLD : (bVar == null || (n10 = bVar.n()) == null || (intOrNull = StringsKt.toIntOrNull(n10)) == null) ? 400 : intOrNull.intValue();
            ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
            if (bVar == null || (str = bVar.l()) == null) {
                str = "";
            }
            Typeface typeface = companion.getTypeface(str, intValue, areEqual, context.getAssets());
            if (bVar != null && (p10 = bVar.p()) != null) {
                if (p10.floatValue() <= 0.0f) {
                    p10 = null;
                }
                if (p10 != null) {
                    dimension = PixelUtil.toPixelFromSP$default(p10.floatValue(), 0.0f, 2, null);
                    if (bVar != null && (o10 = bVar.o()) != null) {
                        if (o10.floatValue() <= 0.0f) {
                            o10 = null;
                        }
                        if (o10 != null) {
                            dimension2 = PixelUtil.toPixelFromSP$default(o10.floatValue(), 0.0f, 2, null);
                            textView2.setTextSize(0, dimension);
                            textView2.setTypeface(typeface);
                            textView.setTextSize(0, dimension2);
                            textView.setTypeface(typeface);
                        }
                    }
                    dimension2 = context.getResources().getDimension(e.f48346i);
                    textView2.setTextSize(0, dimension);
                    textView2.setTypeface(typeface);
                    textView.setTextSize(0, dimension2);
                    textView.setTypeface(typeface);
                }
            }
            dimension = context.getResources().getDimension(e.f48346i);
            if (bVar != null) {
                if (o10.floatValue() <= 0.0f) {
                }
                if (o10 != null) {
                }
            }
            dimension2 = context.getResources().getDimension(e.f48346i);
            textView2.setTextSize(0, dimension);
            textView2.setTypeface(typeface);
            textView.setTextSize(0, dimension2);
            textView.setTypeface(typeface);
        }
    }

    public final void c(MenuItem menuItem, com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        if (!Intrinsics.areEqual(menuItem.getTitle(), tabsScreen.getTabTitle())) {
            menuItem.setTitle(tabsScreen.getTabTitle());
        }
        if (tabsScreen.getSelectedIcon() == null || tabsScreen.getIcon() == null) {
            drawable = tabsScreen.getIcon();
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            int[] iArr = {R.attr.state_checked};
            Drawable selectedIcon = tabsScreen.getSelectedIcon();
            stateListDrawable.addState(iArr, selectedIcon != null ? selectedIcon.mutate() : null);
            int[] iArr2 = new int[0];
            Drawable icon = tabsScreen.getIcon();
            stateListDrawable.addState(iArr2, icon != null ? icon.mutate() : null);
            drawable = stateListDrawable;
        }
        if (Intrinsics.areEqual(menuItem.getIcon(), drawable)) {
            return;
        }
        menuItem.setIcon(drawable);
    }

    public final void d(Context context, b bVar, boolean z10) {
        int i10;
        Boolean g10;
        Integer f10;
        Integer k10;
        Wc.a c10;
        Integer a10;
        Wc.a d10;
        Integer a11;
        Wc.a b10;
        Integer a12;
        Wc.a a13;
        Integer a14;
        Wc.a c11;
        Integer b11;
        Wc.a d11;
        Integer b12;
        Wc.a b13;
        Integer b14;
        Wc.a a15;
        Integer b15;
        Integer e10;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13225a.setVisibility(!z10 ? 0 : 8);
        this.f13225a.setBackgroundColor((bVar == null || (e10 = bVar.e()) == null) ? AbstractC4055b.b(context, ia.c.f48262u, 0, 4, null) : e10.intValue());
        this.f13225a.setItemTextColor(new ColorStateList(this.f13226b, new int[]{(bVar == null || (a15 = bVar.a()) == null || (b15 = a15.b()) == null) ? AbstractC4055b.b(context, ia.c.f48252p, 0, 4, null) : b15.intValue(), (bVar == null || (d11 = bVar.d()) == null || (b12 = d11.b()) == null) ? AbstractC4055b.b(context, ia.c.f48250o, 0, 4, null) : b12.intValue(), (bVar == null || (b13 = bVar.b()) == null || (b14 = b13.b()) == null) ? AbstractC4055b.b(context, ia.c.f48252p, 0, 4, null) : b14.intValue(), (bVar == null || (c11 = bVar.c()) == null || (b11 = c11.b()) == null) ? AbstractC4055b.b(context, ia.c.f48256r, 0, 4, null) : b11.intValue()}));
        this.f13225a.setItemIconTintList(new ColorStateList(this.f13226b, new int[]{(bVar == null || (a13 = bVar.a()) == null || (a14 = a13.a()) == null) ? AbstractC4055b.b(context, ia.c.f48252p, 0, 4, null) : a14.intValue(), (bVar == null || (d10 = bVar.d()) == null || (a11 = d10.a()) == null) ? AbstractC4055b.b(context, ia.c.f48248n, 0, 4, null) : a11.intValue(), (bVar == null || (b10 = bVar.b()) == null || (a12 = b10.a()) == null) ? AbstractC4055b.b(context, ia.c.f48252p, 0, 4, null) : a12.intValue(), (bVar == null || (c10 = bVar.c()) == null || (a10 = c10.a()) == null) ? AbstractC4055b.b(context, ia.c.f48252p, 0, 4, null) : a10.intValue()}));
        String j10 = bVar != null ? bVar.j() : null;
        boolean z11 = true;
        if (j10 != null) {
            int hashCode = j10.hashCode();
            if (hashCode != -63201645) {
                if (hashCode != 1191572123) {
                    if (hashCode == 1648599514 && j10.equals("unlabeled")) {
                        i10 = 2;
                    }
                } else if (j10.equals("selected")) {
                    i10 = 0;
                }
            } else if (j10.equals("labeled")) {
                i10 = 1;
            }
            this.f13225a.setLabelVisibilityMode(i10);
            this.f13225a.setItemRippleColor(ColorStateList.valueOf((bVar != null || (k10 = bVar.k()) == null) ? AbstractC4055b.b(context, ia.c.f48199D, 0, 4, null) : k10.intValue()));
            int b16 = (bVar != null || (f10 = bVar.f()) == null) ? AbstractC4055b.b(context, ia.c.f48258s, 0, 4, null) : f10.intValue();
            ma.c cVar = this.f13225a;
            if (bVar != null && (g10 = bVar.g()) != null) {
                z11 = g10.booleanValue();
            }
            cVar.setItemActiveIndicatorEnabled(z11);
            this.f13225a.setItemActiveIndicatorColor(ColorStateList.valueOf(b16));
        }
        i10 = -1;
        this.f13225a.setLabelVisibilityMode(i10);
        this.f13225a.setItemRippleColor(ColorStateList.valueOf((bVar != null || (k10 = bVar.k()) == null) ? AbstractC4055b.b(context, ia.c.f48199D, 0, 4, null) : k10.intValue()));
        if (bVar != null) {
        }
        ma.c cVar2 = this.f13225a;
        if (bVar != null) {
            z11 = g10.booleanValue();
        }
        cVar2.setItemActiveIndicatorEnabled(z11);
        this.f13225a.setItemActiveIndicatorColor(ColorStateList.valueOf(b16));
    }
}
