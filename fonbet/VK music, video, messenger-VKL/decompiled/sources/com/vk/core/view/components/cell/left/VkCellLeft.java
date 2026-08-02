package com.vk.core.view.components.cell.left;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cpy;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fva0;
import xsna.gpo0;
import xsna.hbh0;
import xsna.izs;
import xsna.k1u0;
import xsna.l44;
import xsna.og8;
import xsna.s3q0;
import xsna.tlo0;
import xsna.too0;

/* compiled from: VkCellLeft.kt */
/* loaded from: classes17.dex */
public final class VkCellLeft extends LinearLayout implements too0 {
    public static final /* synthetic */ int r = 0;
    public Pair<? extends WeakReference<View>, ? extends izs<? super Rect, s3q0>> b;
    public final VkCellLeft c;
    public FrameLayout d;
    public AppCompatImageView e;
    public AppCompatImageView f;
    public VkCheckbox g;
    public FrameLayout h;
    public FrameLayout i;
    public FrameLayout j;
    public FrameLayout k;
    public AppCompatImageView l;
    public VkCell.d m;
    public VkCell.d n;
    public VkCell.d o;
    public VkCell.Left.b p;
    public final FrameLayout.LayoutParams q;

    public VkCellLeft(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final ViewGroup getRootWrapper() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    private final void setLeftExtraCheck(VkCell.Left.c.a aVar) {
        b().setVisibility(0);
        VkCheckbox vkCheckbox = this.g;
        if (vkCheckbox == null) {
            VkCheckbox vkCheckbox2 = new VkCheckbox(getContext(), null, 0, 0, 14);
            vkCheckbox2.setId(R.id.ds_internal_cell_left_extra_check);
            vkCheckbox2.setType(VkCheckbox.Type.Circle);
            this.g = vkCheckbox2;
            FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
            a.gravity = 16;
            b().addView(vkCheckbox2, 0, a);
            vkCheckbox = vkCheckbox2;
        }
        vkCheckbox.setVisibility(0);
        vkCheckbox.setChecked(aVar.a);
        vkCheckbox.setEnabled(aVar.c);
        vkCheckbox.setOnClickListener(new og8(aVar, 11));
    }

    private final void setLeftExtraClose(VkCell.Left.c.b bVar) {
        b().setVisibility(0);
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(R.id.ds_internal_cell_left_extra_close);
            appCompatImageView.setImageResource(R.drawable.vk_icon_cancel_24);
            this.e = appCompatImageView;
            FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
            a.gravity = 16;
            b().addView(appCompatImageView, a);
        }
        appCompatImageView.setVisibility(0);
        k1u0 k1u0Var = bVar.c;
        appCompatImageView.getContext();
        gpo0.h(appCompatImageView, k1u0Var, Integer.valueOf(R.attr.vk_ui_icon_accent));
        b().setOnClickListener(new l44(bVar, 15));
    }

    private final void setLeftExtraIcon(VkCell.Left.c.d dVar) {
        f().setVisibility(0);
        AppCompatImageView appCompatImageView = this.f;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(R.id.ds_internal_cell_left_extra_icon1);
            this.f = appCompatImageView;
            FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
            a.gravity = 16;
            b().addView(appCompatImageView, a);
        }
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageDrawable(dVar.a.a(appCompatImageView.getContext()));
        tlo0 tlo0Var = dVar.e;
        appCompatImageView.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatImageView.getContext()) : null);
        k1u0 k1u0Var = dVar.b;
        appCompatImageView.getContext();
        gpo0.h(appCompatImageView, k1u0Var, Integer.valueOf(R.attr.vk_ui_icon_accent));
    }

    private final void setLeftMainAvatar(VkCell.Left.Main.a aVar) {
        f().setVisibility(0);
        c().setVisibility(0);
        VkCell.d dVar = this.n;
        if (dVar != null) {
            int b = hbh0.b(aVar.b, getContext());
            View view = dVar.getView();
            ViewGroup.LayoutParams layoutParams = dVar.getView().getLayoutParams();
            layoutParams.width = b;
            layoutParams.height = b;
            view.setLayoutParams(layoutParams);
            dVar.a(aVar.a);
            izs<Rect, s3q0> izsVar = aVar.c;
            if (izsVar != null) {
                View view2 = dVar.getView();
                Pair<? extends WeakReference<View>, ? extends izs<? super Rect, s3q0>> pair = this.b;
                if (pair != null) {
                    WeakReference<View> d = pair.d();
                    izs<? super Rect, s3q0> g = pair.g();
                    if (epx.f(d.get(), view2) && epx.f(g, izsVar)) {
                        return;
                    }
                }
                f4m.a(view2, new fva0(1, view2, izsVar));
                this.b = new Pair<>(new WeakReference(view2), izsVar);
            }
        }
    }

    private final void setLeftMainIcon(VkCell.Left.Main.c cVar) {
        int b;
        f().setVisibility(0);
        AppCompatImageView appCompatImageView = this.l;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(R.id.ds_internal_cell_left_main_icon);
            this.l = appCompatImageView;
            FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
            a.gravity = 16;
            f().addView(appCompatImageView, a);
        }
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageDrawable(cVar.a.a(appCompatImageView.getContext()));
        tlo0 tlo0Var = cVar.d;
        appCompatImageView.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatImageView.getContext()) : null);
        k1u0 k1u0Var = cVar.c;
        appCompatImageView.getContext();
        gpo0.h(appCompatImageView, k1u0Var, Integer.valueOf(R.attr.vk_ui_icon_accent));
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        VkCell.Left.Main.Size size = cVar.b;
        Context context = getContext();
        size.getClass();
        int i = VkCell.Left.Main.Size.b.$EnumSwitchMapping$0[size.ordinal()];
        if (i == 1 || i == 2) {
            b = hbh0.b(24, context);
        } else if (i == 3) {
            b = hbh0.b(28, context);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            b = hbh0.b(32, context);
        }
        layoutParams.width = b;
        layoutParams.height = b;
        appCompatImageView.setLayoutParams(layoutParams);
    }

    private final void setLeftMainPicture(VkCell.Left.Main.d dVar) {
        f().setVisibility(0);
        d().setVisibility(0);
        VkCell.d dVar2 = this.m;
        if (dVar2 != null) {
            int k = dVar.b.k(getContext());
            View view = dVar2.getView();
            ViewGroup.LayoutParams layoutParams = dVar2.getView().getLayoutParams();
            layoutParams.width = k;
            layoutParams.height = k;
            view.setLayoutParams(layoutParams);
            dVar2.a(dVar.a);
        }
    }

    private final void setLeftMainView(VkCell.Left.Main.e eVar) {
        f().setVisibility(0);
        e().setVisibility(0);
        VkCell.d dVar = this.o;
        if (dVar != null) {
            Size size = eVar.b;
            View view = dVar.getView();
            ViewGroup.LayoutParams layoutParams = dVar.getView().getLayoutParams();
            layoutParams.width = size.getWidth();
            layoutParams.height = size.getHeight();
            view.setLayoutParams(layoutParams);
            dVar.a(eVar.a);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        a(this.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(VkCell.Left.b bVar) {
        boolean z;
        VkCell.Left.Main main;
        VkCell.Left.c cVar;
        this.p = bVar;
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.d;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(null);
        }
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        VkCheckbox vkCheckbox = this.g;
        if (vkCheckbox != null) {
            vkCheckbox.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = this.f;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(8);
        }
        FrameLayout frameLayout3 = this.h;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = this.l;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(8);
        }
        FrameLayout frameLayout4 = this.i;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(8);
        }
        FrameLayout frameLayout5 = this.j;
        if (frameLayout5 != null) {
            frameLayout5.setVisibility(8);
        }
        FrameLayout frameLayout6 = this.k;
        if (frameLayout6 != null) {
            frameLayout6.setVisibility(8);
        }
        if ((bVar != null ? bVar.b : null) == null) {
            if ((bVar != null ? bVar.a : null) == null) {
                z = false;
                setVisibility(z ? 0 : 8);
                if (bVar != null && (cVar = bVar.b) != null) {
                    if (!(cVar instanceof VkCell.Left.c.a)) {
                        setLeftExtraCheck((VkCell.Left.c.a) cVar);
                    } else if (cVar instanceof VkCell.Left.c.b) {
                        setLeftExtraClose((VkCell.Left.c.b) cVar);
                    } else {
                        if (!(cVar instanceof VkCell.Left.c.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        setLeftExtraIcon((VkCell.Left.c.d) cVar);
                    }
                }
                if (bVar != null || (main = bVar.a) == null) {
                }
                if (main instanceof VkCell.Left.Main.c) {
                    setLeftMainIcon((VkCell.Left.Main.c) main);
                    return;
                }
                if (main instanceof VkCell.Left.Main.d) {
                    setLeftMainPicture((VkCell.Left.Main.d) main);
                    return;
                } else if (main instanceof VkCell.Left.Main.a) {
                    setLeftMainAvatar((VkCell.Left.Main.a) main);
                    return;
                } else {
                    if (!(main instanceof VkCell.Left.Main.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setLeftMainView((VkCell.Left.Main.e) main);
                    return;
                }
            }
        }
        z = true;
        setVisibility(z ? 0 : 8);
        if (bVar != null) {
            if (!(cVar instanceof VkCell.Left.c.a)) {
            }
        }
        if (bVar != null) {
        }
    }

    public final FrameLayout b() {
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.ds_internal_cell_left_extra_wrapper);
        int a = e3m.a(R.dimen.vk_ui_spacing_size_m, getContext());
        f4m.l(a, a, frameLayout2);
        frameLayout2.setVisibility(8);
        LinearLayout.LayoutParams b = cpy.b(0, 0, -e3m.a(R.dimen.vk_ui_spacing_size_m, getContext()), 0, 0, e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext()), 27);
        this.d = frameLayout2;
        this.c.addView(frameLayout2, 0, b);
        return frameLayout2;
    }

    public final FrameLayout c() {
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.ds_internal_cell_left_main_avatar_slot);
        frameLayout2.setVisibility(8);
        frameLayout2.setClipChildren(false);
        this.j = frameLayout2;
        f().addView(frameLayout2, this.q);
        return frameLayout2;
    }

    public final FrameLayout d() {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.ds_internal_cell_left_main_picture_slot);
        frameLayout2.setVisibility(8);
        this.i = frameLayout2;
        f().addView(frameLayout2, this.q);
        return frameLayout2;
    }

    public final FrameLayout e() {
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.ds_internal_cell_left_main_view_slot);
        frameLayout2.setVisibility(8);
        this.k = frameLayout2;
        f().addView(frameLayout2, this.q);
        return frameLayout2;
    }

    public final FrameLayout f() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.ds_internal_cell_left_main_wrapper);
        frameLayout2.setVisibility(8);
        frameLayout2.setClipChildren(false);
        this.h = frameLayout2;
        this.c.addView(frameLayout2, cpy.b(0, 0, 0, 0, 0, 0, 63));
        return frameLayout2;
    }

    public final void setLeftMainAvatarController(VkCell.e eVar) {
        FrameLayout c = c();
        if (eVar == null) {
            c.removeAllViews();
            this.n = null;
            s3q0 s3q0Var = s3q0.a;
        } else {
            VkCell.d create = eVar.create(c.getContext());
            this.n = create;
            s3q0 s3q0Var2 = s3q0.a;
            c.removeAllViews();
            c.addView(create.getView());
        }
    }

    public final void setLeftMainPictureController(VkCell.e eVar) {
        FrameLayout d = d();
        if (eVar == null) {
            d.removeAllViews();
            this.m = null;
            s3q0 s3q0Var = s3q0.a;
        } else {
            VkCell.d create = eVar.create(d.getContext());
            this.m = create;
            s3q0 s3q0Var2 = s3q0.a;
            d.removeAllViews();
            d.addView(create.getView());
        }
    }

    public final void setLeftMainViewController(VkCell.e eVar) {
        FrameLayout e = e();
        if (eVar == null) {
            e.removeAllViews();
            this.o = null;
            s3q0 s3q0Var = s3q0.a;
        } else {
            VkCell.d create = eVar.create(e.getContext());
            this.o = create;
            s3q0 s3q0Var2 = s3q0.a;
            e.removeAllViews();
            e.addView(create.getView());
        }
    }

    public VkCellLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.c = this;
        setOrientation(0);
        setGravity(16);
        setClipChildren(false);
        this.q = cpy.a(0, 0, 0, 0, 0, 0, 63);
    }
}
