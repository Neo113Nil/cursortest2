package com.vk.auth.passport;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.List;
import java.util.ListIterator;
import xsna.a06;
import xsna.adu0;
import xsna.biq;
import xsna.bju0;
import xsna.dhg;
import xsna.dnp0;
import xsna.e370;
import xsna.e3m;
import xsna.ehg;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.gnj;
import xsna.gzs;
import xsna.hnj;
import xsna.ho8;
import xsna.iah0;
import xsna.ifx0;
import xsna.ilq;
import xsna.itk;
import xsna.izs;
import xsna.lgr0;
import xsna.m33;
import xsna.ozl;
import xsna.par0;
import xsna.prw;
import xsna.q0o0;
import xsna.q3s0;
import xsna.qeu0;
import xsna.r0r0;
import xsna.reu0;
import xsna.s01;
import xsna.s3q0;
import xsna.seu0;
import xsna.shy;
import xsna.sjo;
import xsna.u01;
import xsna.urd0;
import xsna.v01;
import xsna.wcl;
import xsna.wra;
import xsna.xav0;
import xsna.zmp0;

/* compiled from: VkPassportView.kt */
/* loaded from: classes15.dex */
public final class VkPassportView extends FrameLayout implements dhg {
    public static final /* synthetic */ int A = 0;
    public final TextView b;
    public final TextView c;
    public final TextViewEllipsizeEnd d;
    public final ImageView e;
    public final View f;
    public final com.vk.core.ui.image.a<? extends View> g;
    public final ImageView h;
    public final ImageView i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;
    public final View n;
    public final View o;
    public final ShimmerFrameLayout p;
    public final FrameLayout q;
    public View r;
    public int s;
    public final a t;
    public final b u;
    public final dnp0 v;
    public boolean w;
    public int x;
    public seu0 y;
    public reu0 z;

    /* compiled from: VkPassportView.kt */
    public static final class a {
        public final Typeface a;
        public final Typeface b;
        public final Typeface c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final float h;
        public final float i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;
        public final Drawable q;
        public final int r;
        public final int s;
        public final Drawable t;
        public final int u;
        public final String v;
        public final String w;

        public a(Typeface typeface, Typeface typeface2, Typeface typeface3, int i, int i2, int i3, float f, float f2, float f3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Drawable drawable, int i11, int i12, Drawable drawable2, int i13, String str, String str2) {
            this.a = typeface;
            this.b = typeface2;
            this.c = typeface3;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = f;
            this.h = f2;
            this.i = f3;
            this.j = i4;
            this.k = i5;
            this.l = i6;
            this.m = i7;
            this.n = i8;
            this.o = i9;
            this.p = i10;
            this.q = drawable;
            this.r = i11;
            this.s = i12;
            this.t = drawable2;
            this.u = i13;
            this.v = str;
            this.w = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && Float.compare(this.g, aVar.g) == 0 && Float.compare(this.h, aVar.h) == 0 && Float.compare(this.i, aVar.i) == 0 && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && epx.f(this.q, aVar.q) && this.r == aVar.r && this.s == aVar.s && epx.f(this.t, aVar.t) && this.u == aVar.u && epx.f(this.v, aVar.v) && epx.f(this.w, aVar.w);
        }

        public final int hashCode() {
            Typeface typeface = this.a;
            int hashCode = (typeface == null ? 0 : typeface.hashCode()) * 31;
            Typeface typeface2 = this.b;
            int hashCode2 = (hashCode + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
            Typeface typeface3 = this.c;
            int a = shy.a(this.p, shy.a(this.o, shy.a(this.n, shy.a(this.m, shy.a(this.l, shy.a(this.k, shy.a(this.j, io.reactivex.rxjava3.subjects.b.a(this.i, io.reactivex.rxjava3.subjects.b.a(this.h, io.reactivex.rxjava3.subjects.b.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, (hashCode2 + (typeface3 == null ? 0 : typeface3.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            Drawable drawable = this.q;
            int a2 = shy.a(this.s, shy.a(this.r, (a + (drawable == null ? 0 : drawable.hashCode())) * 31, 31), 31);
            Drawable drawable2 = this.t;
            return this.w.hashCode() + urd0.a(shy.a(this.u, (a2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31, 31), 31, this.v);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PassportCustomization(titleFontFamily=");
            sb.append(this.a);
            sb.append(", subtitleFontFamily=");
            sb.append(this.b);
            sb.append(", actionFontFamily=");
            sb.append(this.c);
            sb.append(", titleTextColor=");
            sb.append(this.d);
            sb.append(", subtitleTextColor=");
            sb.append(this.e);
            sb.append(", actionTextColor=");
            sb.append(this.f);
            sb.append(", titleFontSize=");
            sb.append(this.g);
            sb.append(", subtitleFontSize=");
            sb.append(this.h);
            sb.append(", actionFontSize=");
            sb.append(this.i);
            sb.append(", avatarSize=");
            sb.append(this.j);
            sb.append(", avatarMarginEnd=");
            sb.append(this.k);
            sb.append(", subtitleMarginTop=");
            sb.append(this.l);
            sb.append(", actionMarginTop=");
            sb.append(this.m);
            sb.append(", containerMarginSide=");
            sb.append(this.n);
            sb.append(", containerMarginTopBottom=");
            sb.append(this.o);
            sb.append(", actionBgPadding=");
            sb.append(this.p);
            sb.append(", actionBg=");
            sb.append(this.q);
            sb.append(", subtitleLoadingMarginTop=");
            sb.append(this.r);
            sb.append(", actionLoadingMarginTop=");
            sb.append(this.s);
            sb.append(", endIcon=");
            sb.append(this.t);
            sb.append(", endIconColor=");
            sb.append(this.u);
            sb.append(", actionText=");
            sb.append(this.v);
            sb.append(", actionTextShort=");
            return ho8.a(sb, this.w, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkPassportView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        f5z f5zVar;
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        f5z f5zVar2;
        dnp0 dnp0Var = new dnp0();
        dnp0Var.c(new wra());
        dnp0Var.c(new biq());
        dnp0Var.e(300L);
        dnp0Var.g(0);
        dnp0Var.setInterpolator(new ilq());
        this.v = dnp0Var;
        this.w = true;
        seu0 seu0Var = new seu0();
        this.y = seu0Var;
        this.z = new reu0(this, seu0Var);
        Activity b = gnj.b(getContext());
        FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (f = supportFragmentManager.c.f()) == null) {
            f5zVar = null;
        } else {
            ListIterator<Fragment> listIterator = f.listIterator(f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    f5zVar2 = null;
                    break;
                } else {
                    f5zVar2 = listIterator.previous();
                    if (((Fragment) f5zVar2).isVisible()) {
                        break;
                    }
                }
            }
            f5zVar = (Fragment) f5zVar2;
        }
        f5z f5zVar3 = f5zVar != null ? f5zVar : fragmentActivity;
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        String tag = q0o0Var != null ? q0o0Var.tag() : "VkSdkView";
        String str = f5zVar != null ? "(parent is fragment)" : fragmentActivity != null ? "(parent is activity)" : null;
        if (f5zVar3 != null) {
            prw.h(f5zVar3, tag, str);
        } else {
            par0 par0Var = par0.a;
            String concat = "VkSdkUiListenerImpl: null lifecycle owner of ".concat(tag);
            par0Var.getClass();
            par0.e(concat);
        }
        setClipChildren(false);
        setClipToPadding(false);
        Context a2 = hnj.a(context);
        LayoutInflater.from(a2).inflate(R.layout.vk_passport_view_layout, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = a2.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            Typeface b2 = adu0.b(a2, obtainStyledAttributes, 26);
            Typeface b3 = adu0.b(a2, obtainStyledAttributes, 21);
            Typeface b4 = adu0.b(a2, obtainStyledAttributes, 2);
            int color = obtainStyledAttributes.getColor(28, e3m.f(R.attr.vk_ui_text_primary, a2));
            int color2 = obtainStyledAttributes.getColor(25, e3m.f(R.attr.vk_ui_text_secondary, a2));
            int color3 = obtainStyledAttributes.getColor(7, e3m.f(R.attr.vk_ui_text_accent, a2));
            float dimension = obtainStyledAttributes.getDimension(27, (int) iah0.y(r14));
            float f2 = 14;
            float dimension2 = obtainStyledAttributes.getDimension(22, (int) iah0.y(f2));
            float dimension3 = obtainStyledAttributes.getDimension(3, (int) iah0.y(f2));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, iah0.a(72));
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(9, iah0.a(12));
            float f3 = 3;
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(24, iah0.a(f3));
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(5, iah0.a(f3));
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(11, iah0.a(16));
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(12, iah0.a(8));
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(1, iah0.a(2));
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            float f4 = 11;
            int dimensionPixelSize8 = obtainStyledAttributes.getDimensionPixelSize(23, iah0.a(f4));
            int dimensionPixelSize9 = obtainStyledAttributes.getDimensionPixelSize(4, iah0.a(f4));
            String string = obtainStyledAttributes.getString(6);
            String string2 = obtainStyledAttributes.getString(8);
            if (string == null) {
                string = a2.getString(R.string.vk_auth_passport_manage_account_long_vkid);
                if (string2 == null) {
                    string2 = a2.getString(R.string.vk_auth_passport_manage_account_short_vkid);
                }
            } else if (string2 == null) {
                string2 = string;
            }
            String str2 = string2;
            Drawable drawable2 = obtainStyledAttributes.getDrawable(19);
            Drawable a3 = drawable2 == null ? m33.a(R.drawable.vk_icon_chevron_right_outline_20, a2) : drawable2;
            int color4 = obtainStyledAttributes.getColor(20, 0);
            this.s = (obtainStyledAttributes.getBoolean(13, false) ? 1 : 0) | ((obtainStyledAttributes.getBoolean(17, false) ? 1 : 0) << 1) | ((obtainStyledAttributes.getBoolean(16, false) ? 1 : 0) << 2) | ((obtainStyledAttributes.getBoolean(18, false) ? 1 : 0) << 3) | ((obtainStyledAttributes.getBoolean(15, true) ? 1 : 0) << 4) | ((obtainStyledAttributes.getBoolean(14, true) ? 1 : 0) << 5);
            obtainStyledAttributes.recycle();
            String str3 = string;
            a aVar = new a(b2, b3, b4, color, color2, color3, dimension, dimension2, dimension3, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize7, drawable, dimensionPixelSize8, dimensionPixelSize9, a3, color4, str3, str2);
            this.t = aVar;
            View findViewById = findViewById(R.id.vk_passport_view_content);
            this.o = findViewById;
            f4m.j(findViewById);
            View view = this.o;
            this.b = (TextView) (view == null ? null : view).findViewById(R.id.vk_passport_title);
            View view2 = this.o;
            this.c = (TextView) (view2 == null ? null : view2).findViewById(R.id.vk_passport_subtitle);
            View view3 = this.o;
            this.d = (TextViewEllipsizeEnd) (view3 == null ? null : view3).findViewById(R.id.vk_passport_action);
            View view4 = this.o;
            VKReplacerView vKReplacerView = (VKReplacerView) findViewById(R.id.vk_passport_avatar_view);
            this.f = findViewById(R.id.vk_passport_texts_container);
            ifx0 ifx0Var = e370.c;
            lgr0 create = (ifx0Var == null ? null : ifx0Var).a().create(getContext());
            this.g = create;
            vKReplacerView.a(create.getView());
            View view5 = this.o;
            this.i = (ImageView) (view5 == null ? null : view5).findViewById(R.id.vk_passport_action_icon);
            View view6 = this.o;
            this.h = (ImageView) (view6 == null ? null : view6).findViewById(R.id.vk_passport_start_icon);
            this.e = (ImageView) findViewById(R.id.vk_passport_end_icon);
            this.j = findViewById(R.id.vk_passport_loading_title);
            this.k = findViewById(R.id.vk_passport_loading_subtitle);
            this.l = findViewById(R.id.vk_passport_loading_action);
            this.m = findViewById(R.id.vk_passport_loading_texts_container);
            this.n = findViewById(R.id.vk_passport_loading_avatar);
            this.p = (ShimmerFrameLayout) findViewById(R.id.vk_passport_view_loading);
            this.q = (FrameLayout) findViewById(R.id.vk_passport_view_shimmer_frame);
            View findViewById2 = findViewById(R.id.vk_passport_view_error);
            this.r = findViewById2;
            findViewById2.setVisibility(8);
            TextViewEllipsizeEnd textViewEllipsizeEnd = this.d;
            (textViewEllipsizeEnd == null ? null : textViewEllipsizeEnd).b(str3, str2, false, true);
            com.vk.core.ui.image.a<? extends View> aVar2 = this.g;
            aVar2 = aVar2 == null ? null : aVar2;
            int i = this.s;
            itk itkVar = new itk();
            itkVar.a = i;
            b bVar = new b(this, aVar2, itkVar);
            this.u = bVar;
            bVar.a(aVar);
            q3s0 q3s0Var = new q3s0(this, 5);
            View view7 = this.o;
            (view7 == null ? null : view7).setOnClickListener(new u01(q3s0Var, 17));
            TextViewEllipsizeEnd textViewEllipsizeEnd2 = this.d;
            (textViewEllipsizeEnd2 == null ? null : textViewEllipsizeEnd2).setOnClickListener(new v01(q3s0Var, 13));
            ImageView imageView = this.e;
            (imageView == null ? null : imageView).setOnClickListener(new a06(q3s0Var, 16));
            ShimmerFrameLayout shimmerFrameLayout = this.p;
            shimmerFrameLayout = shimmerFrameLayout == null ? null : shimmerFrameLayout;
            b bVar2 = this.u;
            bVar2 = bVar2 == null ? null : bVar2;
            Context context2 = getContext();
            bVar2.getClass();
            Shimmer.c cVar = (Shimmer.c) new Shimmer.c().c(false).j();
            cVar.a.d = e3m.f(R.attr.vk_ui_transparent_active, context2);
            Shimmer.c e = ((Shimmer.c) cVar.h(0.08f).i()).e(800L);
            e.a.q = b.E;
            e.k(e3m.f(R.attr.vk_ui_transparent_hover, context2));
            shimmerFrameLayout.b(e.d(0.08f).a());
            View view8 = this.r;
            (view8 == null ? null : view8).setOnClickListener(new s01(this, 13));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setDashboardOptions(int i) {
        this.s = i;
        b bVar = this.u;
        if (bVar == null) {
            bVar = null;
        }
        bVar.c.a = i;
        bVar.a(this.t);
        xav0 xav0Var = bVar.d;
        if (xav0Var != null) {
            xav0Var.a();
        }
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(getContext());
    }

    public final void a(int i, int i2, int i3) {
        setClickable(i2 == 0);
        ShimmerFrameLayout shimmerFrameLayout = this.p;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        if (shimmerFrameLayout.getVisibility() == i) {
            View view = this.o;
            if (view == null) {
                view = null;
            }
            if (view.getVisibility() == i2) {
                View view2 = this.r;
                if (view2 == null) {
                    view2 = null;
                }
                if (view2.getVisibility() == i3) {
                    return;
                }
            }
        }
        zmp0.a(this, this.v);
        FrameLayout frameLayout = this.q;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setVisibility(i);
        ShimmerFrameLayout shimmerFrameLayout2 = this.p;
        if (shimmerFrameLayout2 == null) {
            shimmerFrameLayout2 = null;
        }
        shimmerFrameLayout2.setVisibility(i);
        View view3 = this.o;
        if (view3 == null) {
            view3 = null;
        }
        view3.setVisibility(i2);
        View view4 = this.r;
        if (view4 == null) {
            view4 = null;
        }
        view4.setVisibility(i3);
        if (i == 0) {
            ShimmerFrameLayout shimmerFrameLayout3 = this.p;
            (shimmerFrameLayout3 != null ? shimmerFrameLayout3 : null).c();
        } else {
            ShimmerFrameLayout shimmerFrameLayout4 = this.p;
            (shimmerFrameLayout4 != null ? shimmerFrameLayout4 : null).d();
        }
    }

    public final void b() {
        int i;
        ImageView imageView = this.e;
        if (imageView == null) {
            imageView = null;
        }
        if (f4m.h(imageView)) {
            ImageView imageView2 = this.e;
            if (imageView2 == null) {
                imageView2 = null;
            }
            f4m.r(this.x, imageView2);
            i = 0;
        } else {
            i = this.x;
        }
        View view = this.f;
        f4m.w(i, view != null ? view : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        reu0 reu0Var = this.z;
        reu0Var.d(false, true);
        reu0Var.d = bju0.a.a.subscribe(new qeu0(new r0r0(reu0Var, 12), 0));
        b bVar = this.u;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d = this.z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        reu0 reu0Var = this.z;
        io.reactivex.rxjava3.disposables.c cVar = reu0Var.c;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = reu0Var.d;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = reu0Var.e;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        super.onDetachedFromWindow();
    }

    public final void setActionBackground(Drawable drawable) {
        TextViewEllipsizeEnd textViewEllipsizeEnd = this.d;
        if (textViewEllipsizeEnd == null) {
            textViewEllipsizeEnd = null;
        }
        textViewEllipsizeEnd.setBackground(drawable);
        this.w = false;
    }

    public final void setActionBgPadding(int i) {
        TextViewEllipsizeEnd textViewEllipsizeEnd = this.d;
        if (textViewEllipsizeEnd == null) {
            textViewEllipsizeEnd = null;
        }
        int paddingTop = textViewEllipsizeEnd.getPaddingTop();
        TextViewEllipsizeEnd textViewEllipsizeEnd2 = this.d;
        if (textViewEllipsizeEnd2 == null) {
            textViewEllipsizeEnd2 = null;
        }
        int i2 = ((ViewGroup.MarginLayoutParams) textViewEllipsizeEnd2.getLayoutParams()).topMargin + paddingTop;
        TextViewEllipsizeEnd textViewEllipsizeEnd3 = this.d;
        (textViewEllipsizeEnd3 != null ? textViewEllipsizeEnd3 : null).setPadding(i, i, i, i);
        setActionMarginTop(i2);
    }

    public final void setActionFontFamily(Typeface typeface) {
        TextViewEllipsizeEnd textViewEllipsizeEnd = this.d;
        if (textViewEllipsizeEnd == null) {
            textViewEllipsizeEnd = null;
        }
        textViewEllipsizeEnd.setTypeface(typeface);
    }

    public final void setActionFontSize(float f) {
        TextViewEllipsizeEnd textViewEllipsizeEnd = this.d;
        if (textViewEllipsizeEnd == null) {
            textViewEllipsizeEnd = null;
        }
        textViewEllipsizeEnd.setTextSize(0, f);
        View view = this.l;
        f4m.n((int) Math.floor(f), view != null ? view : null);
    }

    public final void setActionForVkCombo(izs<? super Boolean, Boolean> izsVar) {
        this.z.j = izsVar;
    }

    public final void setActionForVkLk(gzs<Boolean> gzsVar) {
        this.z.h = gzsVar;
    }

    public final void setActionForVkPay(izs<? super Boolean, Boolean> izsVar) {
        this.z.i = izsVar;
    }

    public final void setActionIcon(Drawable drawable) {
        ImageView imageView = this.i;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void setActionIconColor(int i) {
        ImageView imageView = this.i;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void setActionLoadingMarginTop(int i) {
        View view = this.l;
        if (view == null) {
            view = null;
        }
        f4m.t(i, view);
    }

    public final void setActionMarginTop(int i) {
        TextViewEllipsizeEnd textViewEllipsizeEnd = this.d;
        if (textViewEllipsizeEnd == null) {
            textViewEllipsizeEnd = null;
        }
        int paddingTop = textViewEllipsizeEnd.getPaddingTop();
        TextViewEllipsizeEnd textViewEllipsizeEnd2 = this.d;
        TextViewEllipsizeEnd textViewEllipsizeEnd3 = textViewEllipsizeEnd2 != null ? textViewEllipsizeEnd2 : null;
        int i2 = -paddingTop;
        f4m.u(textViewEllipsizeEnd3, i2, i - paddingTop, i2, i2);
    }

    public final void setActionText(String str) {
        TextViewEllipsizeEnd textViewEllipsizeEnd = this.d;
        if (textViewEllipsizeEnd == null) {
            textViewEllipsizeEnd = null;
        }
        textViewEllipsizeEnd.b(str, str, false, true);
    }

    public final void setActionTextColor(int i) {
        TextViewEllipsizeEnd textViewEllipsizeEnd = this.d;
        (textViewEllipsizeEnd == null ? null : textViewEllipsizeEnd).setTextColor(i);
        if (this.w) {
            this.w = true;
            Context context = getContext();
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(R.drawable.vk_auth_bg_passport_action, context);
            if (!(a2 instanceof RippleDrawable)) {
                (textViewEllipsizeEnd != null ? textViewEllipsizeEnd : null).setBackground(a2);
                return;
            }
            int defaultColor = (textViewEllipsizeEnd == null ? null : textViewEllipsizeEnd).getTextColors().getDefaultColor();
            RippleDrawable rippleDrawable = (RippleDrawable) ((RippleDrawable) a2).mutate();
            rippleDrawable.setColor(ColorStateList.valueOf(defaultColor));
            (textViewEllipsizeEnd != null ? textViewEllipsizeEnd : null).setBackground(rippleDrawable);
        }
    }

    public final void setAvatarMarginEnd(int i) {
        View view = this.f;
        if (view == null) {
            view = null;
        }
        f4m.x(i, view);
        s3q0 s3q0Var = s3q0.a;
        View view2 = this.m;
        f4m.x(i, view2 != null ? view2 : null);
        s3q0 s3q0Var2 = s3q0.a;
    }

    public final void setAvatarSize(int i) {
        com.vk.core.ui.image.a<? extends View> aVar = this.g;
        if (aVar == null) {
            aVar = null;
        }
        aVar.setAvatarSize(i);
        View view = this.n;
        f4m.o(i, i, view != null ? view : null);
        s3q0 s3q0Var = s3q0.a;
    }

    public final void setContainerMarginSide(int i) {
        this.x = i;
        com.vk.core.ui.image.a<? extends View> aVar = this.g;
        if (aVar == null) {
            aVar = null;
        }
        aVar.e(i);
        View view = this.n;
        f4m.s(i, view != null ? view : null);
        s3q0 s3q0Var = s3q0.a;
        b();
    }

    public final void setContainerMarginTopBottom(int i) {
        com.vk.core.ui.image.a<? extends View> aVar = this.g;
        (aVar == null ? null : aVar).b(i);
        if (aVar == null) {
            aVar = null;
        }
        aVar.i(i);
        View view = this.n;
        if (view == null) {
            view = null;
        }
        f4m.q(i, view);
        f4m.t(i, view);
        s3q0 s3q0Var = s3q0.a;
        View view2 = this.f;
        (view2 == null ? null : view2).setPaddingRelative((view2 == null ? null : view2).getPaddingStart(), i, (view2 == null ? null : view2).getPaddingEnd(), i);
        s3q0 s3q0Var2 = s3q0.a;
        View view3 = this.m;
        if (view3 == null) {
            view3 = null;
        }
        view3.setPaddingRelative((view2 == null ? null : view2).getPaddingStart(), i, (view2 != null ? view2 : null).getPaddingEnd(), i);
        s3q0 s3q0Var3 = s3q0.a;
    }

    public final void setEndIcon(Drawable drawable) {
        ImageView imageView = this.e;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
        if (drawable != null) {
            ImageView imageView2 = this.e;
            (imageView2 != null ? imageView2 : null).setVisibility(0);
        } else {
            ImageView imageView3 = this.e;
            f4m.j(imageView3 != null ? imageView3 : null);
        }
        b();
    }

    public final void setEndIconColor(int i) {
        ImageView imageView = this.e;
        if (imageView == null) {
            imageView = null;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            sjo.b(drawable, i, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void setErrorView(View view) {
        View view2 = this.r;
        if (view2 == null) {
            view2 = null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        int indexOfChild = indexOfChild(view2);
        if (indexOfChild != -1) {
            removeViewAt(indexOfChild);
            addView(view, indexOfChild, layoutParams);
        } else {
            addView(view, layoutParams);
        }
        view.setVisibility(view2.getVisibility());
        view.setOnClickListener(new s01(this, 13));
        this.r = view;
    }

    public final void setFlowServiceName(String str) {
        this.y.a.a = str;
    }

    public final void setFlowTypeField(String str) {
        this.y.a.b = str;
    }

    @ozl
    public final void setNameFontFamily(Typeface typeface) {
        setTitleFontFamily(typeface);
    }

    @ozl
    public final void setPhoneFontFamily(Typeface typeface) {
        setSubtitleFontFamily(typeface);
    }

    public final void setPresenter(reu0 reu0Var) {
        this.z = reu0Var;
    }

    public final void setRouter(seu0 seu0Var) {
        this.y = seu0Var;
    }

    public final void setStartIcon(Drawable drawable) {
        ImageView imageView = this.h;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void setStartIconColor(int i) {
        ImageView imageView = this.h;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void setSubtitleFontFamily(Typeface typeface) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setTypeface(typeface);
    }

    public final void setSubtitleFontSize(float f) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setTextSize(0, f);
        View view = this.k;
        f4m.n((int) Math.floor(f), view != null ? view : null);
    }

    public final void setSubtitleLoadingMarginTop(int i) {
        View view = this.k;
        if (view == null) {
            view = null;
        }
        f4m.t(i, view);
    }

    public final void setSubtitleMarginTop(int i) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        f4m.t(i, textView);
    }

    public final void setSubtitleTextColor(int i) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
    }

    public final void setTitleFontFamily(Typeface typeface) {
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setTypeface(typeface);
    }

    public final void setTitleFontSize(float f) {
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setTextSize(0, f);
        View view = this.j;
        f4m.n((int) Math.floor(f), view != null ? view : null);
    }

    public final void setTitleTextColor(int i) {
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
    }
}
