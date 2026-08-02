package com.vk.core.view.components.cell.right;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.p003switch.VkSwitch;
import kotlin.NoWhenBranchMatchedException;
import xsna.bg0;
import xsna.cpy;
import xsna.e3m;
import xsna.ep6;
import xsna.f4m;
import xsna.gpo0;
import xsna.hbh0;
import xsna.i1f;
import xsna.izs;
import xsna.k1u0;
import xsna.myc0;
import xsna.pt00;
import xsna.rg0;
import xsna.s3q0;
import xsna.sg0;
import xsna.tlo0;
import xsna.too0;
import xsna.ybq;
import xsna.yg1;

/* compiled from: VkCellRight.kt */
/* loaded from: classes17.dex */
public final class VkCellRight extends LinearLayout implements too0 {
    public static final /* synthetic */ int z = 0;
    public final VkCellRight b;
    public FrameLayout c;
    public AppCompatTextView d;
    public VkBadge e;
    public VkCounter f;
    public VkSwitch g;
    public VkButton h;
    public FrameLayout i;
    public FrameLayout j;
    public AppCompatImageView k;
    public VkCell.d l;
    public LinearLayout m;
    public VkCellRightExtraActionsWrapper n;
    public FrameLayout o;
    public LinearLayout p;
    public AppCompatTextView q;
    public AppCompatImageView r;
    public AppCompatImageView s;
    public VkCell.d t;
    public VkCheckbox u;
    public AppCompatImageView v;
    public AppCompatImageView w;
    public VkCell.Right.d x;
    public final FrameLayout.LayoutParams y;

    public VkCellRight(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getRightMinimumHeight() {
        getContext();
        return hbh0.b(48, getContext());
    }

    public static void i(AppCompatImageView appCompatImageView, VkCell.Right.e.b bVar) {
        TypedValue typedValue = new TypedValue();
        appCompatImageView.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        appCompatImageView.setBackgroundResource(typedValue.resourceId);
        tlo0 tlo0Var = bVar.d;
        boolean z2 = bVar.e;
        appCompatImageView.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatImageView.getContext()) : null);
        appCompatImageView.setImageDrawable(bVar.a.a(appCompatImageView.getContext()));
        k1u0 k1u0Var = bVar.b;
        appCompatImageView.getContext();
        gpo0.h(appCompatImageView, k1u0Var, Integer.valueOf(com.vkontakte.android.R.attr.vk_ui_icon_accent));
        appCompatImageView.setAlpha(z2 ? 1.0f : 0.64f);
        appCompatImageView.setEnabled(z2);
        appCompatImageView.setOnClickListener(new i1f(bVar, 11));
    }

    private final void setRightActionBadge(VkCell.Right.a.C0822a c0822a) {
        c().setVisibility(0);
        VkBadge vkBadge = this.e;
        if (vkBadge == null) {
            vkBadge = new VkBadge(getContext(), null, 6);
            vkBadge.setId(com.vkontakte.android.R.id.ds_internal_cell_right_action_badge);
            this.e = vkBadge;
            c().addView(vkBadge, this.y);
        }
        vkBadge.setVisibility(0);
        vkBadge.setAppearance(c0822a.a);
    }

    private final void setRightActionButton(VkCell.Right.a.b bVar) {
        int i = 0;
        c().setVisibility(0);
        VkButton vkButton = this.h;
        AttributeSet attributeSet = null;
        if (vkButton == null) {
            vkButton = new VkButton(getContext(), attributeSet, 6, i);
            vkButton.setId(com.vkontakte.android.R.id.ds_internal_cell_right_action_button);
            c().addView(vkButton, this.y);
            this.h = vkButton;
        }
        vkButton.setVisibility(0);
        tlo0 tlo0Var = bVar.a;
        vkButton.setText(tlo0Var != null ? tlo0Var.a(vkButton.getContext()) : null);
        vkButton.setAppearance(bVar.c);
        tlo0 tlo0Var2 = bVar.g;
        vkButton.setContentDescription(tlo0Var2 != null ? tlo0Var2.a(vkButton.getContext()) : null);
        vkButton.setMode(bVar.d);
        vkButton.setSize(bVar.e);
        vkButton.setLoading(bVar.h);
        vkButton.setCount(bVar.j);
        vkButton.setOnClickListener(new yg1(bVar, 11));
        VkCell.Right.a.b.c cVar = bVar.f;
        if (cVar != null) {
            Drawable a = cVar.a.a(vkButton.getContext());
            if (a != null) {
                vkButton.Z4(a, false);
            }
            Integer num = cVar.b;
            if (num != null) {
                vkButton.setIconSize(Integer.valueOf(num.intValue()));
            }
            Integer num2 = cVar.c;
            if (num2 != null) {
                vkButton.setIconTint(num2.intValue());
            }
        } else {
            vkButton.a5(true, null);
        }
        VkCell.Right.a.b.c cVar2 = bVar.i;
        if (cVar2 == null) {
            vkButton.d5(null);
            return;
        }
        Drawable a2 = cVar2.a.a(vkButton.getContext());
        if (a2 != null) {
            vkButton.c5(a2, false);
        }
        Integer num3 = cVar2.b;
        if (num3 != null) {
            vkButton.setTrailingIconSize(Integer.valueOf(num3.intValue()));
        }
        Integer num4 = cVar2.c;
        if (num4 != null) {
            vkButton.setTrailingIconTint(num4.intValue());
        }
    }

    private final void setRightActionCounter(VkCell.Right.a.d dVar) {
        c().setVisibility(0);
        VkCounter vkCounter = this.f;
        if (vkCounter == null) {
            vkCounter = new VkCounter(getContext(), null);
            vkCounter.setId(com.vkontakte.android.R.id.ds_internal_cell_right_action_counter);
            vkCounter.setSize(VkCounter.Size.Medium);
            this.f = vkCounter;
            c().addView(vkCounter, this.y);
        }
        vkCounter.setVisibility(0);
        vkCounter.setAppearance(dVar.b);
        vkCounter.setMode(dVar.c);
        vkCounter.setCounterWithoutAnimation(dVar.a);
    }

    private final void setRightActionDetail(VkCell.Right.a.e eVar) {
        c().setVisibility(0);
        AppCompatTextView appCompatTextView = this.d;
        if (appCompatTextView == null) {
            appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setId(com.vkontakte.android.R.id.ds_internal_cell_right_action_detail);
            appCompatTextView.setTextAppearance(e3m.g(com.vkontakte.android.R.attr.vk_ui_typography_text, getContext()));
            gpo0.i(appCompatTextView, com.vkontakte.android.R.attr.vk_ui_text_secondary);
            appCompatTextView.setVisibility(8);
            this.d = appCompatTextView;
            c().addView(appCompatTextView, this.y);
        }
        appCompatTextView.setVisibility(0);
        appCompatTextView.setText(eVar.a.a(appCompatTextView.getContext()));
        tlo0 tlo0Var = eVar.b;
        appCompatTextView.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatTextView.getContext()) : null);
        gpo0.i(appCompatTextView, com.vkontakte.android.R.attr.vk_ui_text_secondary);
    }

    private final void setRightActionSwitch(VkCell.Right.a.f fVar) {
        c().setVisibility(0);
        VkSwitch vkSwitch = this.g;
        if (vkSwitch == null) {
            vkSwitch = new VkSwitch(getContext(), null, 6);
            vkSwitch.setId(com.vkontakte.android.R.id.ds_internal_cell_right_action_switch);
            this.g = vkSwitch;
            c().addView(vkSwitch, this.y);
        }
        vkSwitch.setVisibility(0);
        vkSwitch.setChecked(fVar.a);
        vkSwitch.setEnabled(fVar.c);
        vkSwitch.setOnClickListener(new rg0(fVar, 15));
    }

    private final void setRightExtraActionCheck(VkCell.Right.ExtraAction.a aVar) {
        f().setVisibility(0);
        VkCheckbox vkCheckbox = this.u;
        if (vkCheckbox == null) {
            VkCheckbox vkCheckbox2 = new VkCheckbox(getContext(), null, 0, 0, 14);
            vkCheckbox2.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_check);
            vkCheckbox2.setType(VkCheckbox.Type.Circle);
            this.u = vkCheckbox2;
            f().addView(vkCheckbox2, this.y);
            vkCheckbox = vkCheckbox2;
        }
        vkCheckbox.setVisibility(0);
        vkCheckbox.setChecked(aVar.a);
        vkCheckbox.setEnabled(aVar.c);
        vkCheckbox.setOnClickListener(new ep6(aVar, 10));
        vkCheckbox.setClickable(aVar.b != null);
    }

    private final void setRightExtraActionDropdown(VkCell.Right.ExtraAction.c cVar) {
        f().setVisibility(0);
        LinearLayout d = d();
        d.setVisibility(0);
        d.setOnClickListener(new ybq(cVar, 10));
        AppCompatImageView appCompatImageView = this.r;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_action_dropdown);
            appCompatImageView.setImageResource(com.vkontakte.android.R.drawable.vk_icon_dropdown_16);
            this.r = appCompatImageView;
            d().addView(appCompatImageView, this.y);
        }
        CharSequence a = cVar.a.a(getContext());
        AppCompatTextView appCompatTextView = this.q;
        if (appCompatTextView == null) {
            appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_action_dropdown_title);
            appCompatTextView.setTextAppearance(e3m.g(com.vkontakte.android.R.attr.vk_ui_typography_subhead, getContext()));
            gpo0.i(appCompatTextView, com.vkontakte.android.R.attr.vk_ui_text_secondary);
            appCompatTextView.setVisibility(8);
            this.q = appCompatTextView;
            LinearLayout.LayoutParams b = cpy.b(0, 0, 0, 0, 0, 0, 63);
            b.setMarginEnd(e3m.a(com.vkontakte.android.R.dimen.vk_ui_spacing_size_xs, getContext()));
            d().addView(appCompatTextView, 0, b);
        }
        appCompatTextView.setVisibility(myc0.f(a) ? 0 : 8);
        appCompatTextView.setText(a);
        gpo0.i(appCompatTextView, com.vkontakte.android.R.attr.vk_ui_text_secondary);
        k1u0 k1u0Var = cVar.d;
        getContext();
        gpo0.h(appCompatImageView, k1u0Var, Integer.valueOf(com.vkontakte.android.R.attr.vk_ui_icon_secondary));
    }

    private final void setRightExtraActionMore(VkCell.Right.ExtraAction.d dVar) {
        FrameLayout f = f();
        f.setVisibility(0);
        f.setOnClickListener(new bg0(dVar, 15));
        AppCompatImageView appCompatImageView = this.s;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_action_more);
            appCompatImageView.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_action_more);
            appCompatImageView.setImageResource(com.vkontakte.android.R.drawable.vk_icon_more_vertical_16);
            f4m.x(e3m.a(com.vkontakte.android.R.dimen.vk_ui_spacing_size_m, getContext()), appCompatImageView);
            this.s = appCompatImageView;
            f().addView(appCompatImageView, this.y);
        }
        appCompatImageView.setVisibility(0);
        tlo0 tlo0Var = dVar.b;
        appCompatImageView.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatImageView.getContext()) : null);
        k1u0 k1u0Var = dVar.c;
        appCompatImageView.getContext();
        gpo0.h(appCompatImageView, k1u0Var, Integer.valueOf(com.vkontakte.android.R.attr.vk_ui_icon_secondary));
    }

    private final void setRightExtraActionPicture(VkCell.Right.ExtraAction.e eVar) {
        f().setVisibility(0);
        e().setVisibility(0);
        VkCell.d dVar = this.t;
        if (dVar != null) {
            Integer num = eVar.b;
            int intValue = num != null ? num.intValue() : hbh0.b(40, getContext());
            View view = dVar.getView();
            ViewGroup.LayoutParams layoutParams = dVar.getView().getLayoutParams();
            layoutParams.width = intValue;
            layoutParams.height = intValue;
            view.setLayoutParams(layoutParams);
            dVar.a(eVar.a);
        }
    }

    private final void setRightExtraIcon(VkCell.Right.e.b bVar) {
        FrameLayout h = h();
        h.setVisibility(0);
        h.setAlpha(bVar.e ? 1.0f : 0.64f);
        h.setOnClickListener(new sg0(bVar, 20));
        AppCompatImageView appCompatImageView = this.k;
        if (appCompatImageView == null) {
            appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_icon);
            this.k = appCompatImageView;
            h().addView(appCompatImageView, this.y);
        }
        appCompatImageView.setVisibility(0);
        appCompatImageView.setEnabled(bVar.e);
        TypedValue typedValue = new TypedValue();
        appCompatImageView.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        appCompatImageView.setBackgroundResource(typedValue.resourceId);
        appCompatImageView.setImageDrawable(bVar.a.a(appCompatImageView.getContext()));
        k1u0 k1u0Var = bVar.b;
        appCompatImageView.getContext();
        gpo0.h(appCompatImageView, k1u0Var, Integer.valueOf(com.vkontakte.android.R.attr.vk_ui_icon_accent));
        tlo0 tlo0Var = bVar.d;
        appCompatImageView.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatImageView.getContext()) : null);
    }

    private final void setRightExtraPair(VkCell.Right.e.c cVar) {
        h().setVisibility(0);
        LinearLayout linearLayout = this.m;
        if (linearLayout == null) {
            linearLayout = new LinearLayout(getContext());
            linearLayout.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_pair_slot);
            linearLayout.setVisibility(8);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_pair_slot_first);
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
            appCompatImageView2.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_pair_slot_second);
            View view = new View(getContext());
            view.setLayoutParams(new FrameLayout.LayoutParams(hbh0.b(8, view.getContext()), hbh0.b(48, view.getContext())));
            linearLayout.addView(appCompatImageView);
            linearLayout.addView(view);
            linearLayout.addView(appCompatImageView2);
            this.m = linearLayout;
            h().addView(linearLayout, this.y);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) linearLayout.findViewById(com.vkontakte.android.R.id.ds_internal_cell_right_extra_pair_slot_first);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) linearLayout.findViewById(com.vkontakte.android.R.id.ds_internal_cell_right_extra_pair_slot_second);
        linearLayout.setVisibility(0);
        i(appCompatImageView3, cVar.a);
        i(appCompatImageView4, cVar.b);
    }

    private final void setRightExtraView(VkCell.Right.e.d dVar) {
        h().setVisibility(0);
        g().setVisibility(0);
        VkCell.d dVar2 = this.l;
        if (dVar2 != null) {
            Size size = dVar.b;
            View view = dVar2.getView();
            ViewGroup.LayoutParams layoutParams = dVar2.getView().getLayoutParams();
            layoutParams.width = size.getWidth();
            layoutParams.height = size.getHeight();
            view.setLayoutParams(layoutParams);
            dVar2.a(dVar.a);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        a(this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c3, code lost:
    
        if ((r20 != null ? r20.e : null) != null) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(VkCell.Right.d dVar) {
        VkCell.Right.f fVar;
        VkCell.Right.b bVar;
        VkCell.Right.ExtraAction extraAction;
        VkCell.Right.e eVar;
        VkCell.Right.a aVar;
        Integer valueOf = Integer.valueOf(com.vkontakte.android.R.attr.vk_ui_icon_secondary);
        this.x = dVar;
        FrameLayout frameLayout = this.c;
        int i = 8;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        VkButton vkButton = this.h;
        if (vkButton != null) {
            vkButton.setVisibility(8);
        }
        VkSwitch vkSwitch = this.g;
        if (vkSwitch != null) {
            vkSwitch.setVisibility(8);
        }
        VkCounter vkCounter = this.f;
        if (vkCounter != null) {
            vkCounter.setVisibility(8);
        }
        VkBadge vkBadge = this.e;
        if (vkBadge != null) {
            vkBadge.setVisibility(8);
        }
        AppCompatTextView appCompatTextView = this.d;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.i;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        FrameLayout frameLayout3 = this.i;
        if (frameLayout3 != null) {
            frameLayout3.setOnClickListener(null);
        }
        AppCompatImageView appCompatImageView = this.k;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        FrameLayout frameLayout4 = this.j;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(8);
        }
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        VkCellRightExtraActionsWrapper vkCellRightExtraActionsWrapper = this.n;
        if (vkCellRightExtraActionsWrapper != null) {
            vkCellRightExtraActionsWrapper.setOnClickListener(null);
        }
        VkCellRightExtraActionsWrapper vkCellRightExtraActionsWrapper2 = this.n;
        if (vkCellRightExtraActionsWrapper2 != null) {
            vkCellRightExtraActionsWrapper2.setClickable(false);
        }
        VkCellRightExtraActionsWrapper vkCellRightExtraActionsWrapper3 = this.n;
        if (vkCellRightExtraActionsWrapper3 != null) {
            vkCellRightExtraActionsWrapper3.setVisibility(8);
        }
        VkCheckbox vkCheckbox = this.u;
        if (vkCheckbox != null) {
            vkCheckbox.setVisibility(8);
        }
        FrameLayout frameLayout5 = this.o;
        if (frameLayout5 != null) {
            frameLayout5.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.p;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        AppCompatImageView appCompatImageView2 = this.s;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = this.v;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(8);
        }
        AppCompatImageView appCompatImageView4 = this.w;
        if (appCompatImageView4 != null) {
            appCompatImageView4.setVisibility(8);
        }
        if ((dVar != null ? dVar.a : null) == null) {
            if ((dVar != null ? dVar.b : null) == null) {
                if ((dVar != null ? dVar.c : null) == null) {
                    if ((dVar != null ? dVar.d : null) == null) {
                    }
                }
            }
        }
        i = 0;
        setVisibility(i);
        if (dVar != null && (aVar = dVar.a) != null) {
            if (aVar instanceof VkCell.Right.a.b) {
                setRightActionButton((VkCell.Right.a.b) aVar);
            } else if (aVar instanceof VkCell.Right.a.C0822a) {
                setRightActionBadge((VkCell.Right.a.C0822a) aVar);
            } else if (aVar instanceof VkCell.Right.a.f) {
                setRightActionSwitch((VkCell.Right.a.f) aVar);
            } else if (aVar instanceof VkCell.Right.a.d) {
                setRightActionCounter((VkCell.Right.a.d) aVar);
            } else {
                if (!(aVar instanceof VkCell.Right.a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                setRightActionDetail((VkCell.Right.a.e) aVar);
            }
        }
        if (dVar != null && (eVar = dVar.b) != null) {
            if (eVar instanceof VkCell.Right.e.b) {
                setRightExtraIcon((VkCell.Right.e.b) eVar);
            } else if (eVar instanceof VkCell.Right.e.d) {
                setRightExtraView((VkCell.Right.e.d) eVar);
            } else {
                if (!(eVar instanceof VkCell.Right.e.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                setRightExtraPair((VkCell.Right.e.c) eVar);
            }
        }
        if (dVar != null && (extraAction = dVar.c) != null) {
            if (extraAction instanceof VkCell.Right.ExtraAction.a) {
                setRightExtraActionCheck((VkCell.Right.ExtraAction.a) extraAction);
            } else if (extraAction instanceof VkCell.Right.ExtraAction.c) {
                setRightExtraActionDropdown((VkCell.Right.ExtraAction.c) extraAction);
            } else if (extraAction instanceof VkCell.Right.ExtraAction.d) {
                setRightExtraActionMore((VkCell.Right.ExtraAction.d) extraAction);
            } else {
                if (!(extraAction instanceof VkCell.Right.ExtraAction.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                setRightExtraActionPicture((VkCell.Right.ExtraAction.e) extraAction);
            }
        }
        VkCellRight vkCellRight = this.b;
        if (dVar != null && (bVar = dVar.d) != null) {
            izs<View, s3q0> izsVar = bVar.a;
            AppCompatImageView appCompatImageView5 = this.v;
            if (appCompatImageView5 == null) {
                appCompatImageView5 = new AppCompatImageView(getContext());
                appCompatImageView5.setId(com.vkontakte.android.R.id.ds_internal_cell_chevron);
                getContext();
                appCompatImageView5.setImageResource(com.vkontakte.android.R.drawable.vk_icon_chevron_compact_right_24);
                int a = e3m.a(com.vkontakte.android.R.dimen.vk_ui_spacing_size_s, getContext());
                f4m.B(a, a, appCompatImageView5);
                this.v = appCompatImageView5;
                int childCount = vkCellRight.getChildCount();
                if (childCount == 0) {
                    childCount = 0;
                } else if (this.w != null) {
                    childCount--;
                }
                vkCellRight.addView(appCompatImageView5, childCount, cpy.b(0, 0, e3m.a(com.vkontakte.android.R.dimen.vk_ui_spacing_size_xl, getContext()), 0, 0, 0, 59));
            }
            appCompatImageView5.setVisibility(0);
            appCompatImageView5.setOnClickListener(izsVar != null ? new pt00(izsVar, 1) : null);
            appCompatImageView5.setClickable(izsVar != null);
            tlo0 tlo0Var = bVar.b;
            appCompatImageView5.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatImageView5.getContext()) : null);
            k1u0 k1u0Var = bVar.c;
            appCompatImageView5.getContext();
            gpo0.h(appCompatImageView5, k1u0Var, valueOf);
        }
        if (dVar == null || (fVar = dVar.e) == null) {
            return;
        }
        AppCompatImageView appCompatImageView6 = this.w;
        if (appCompatImageView6 == null) {
            appCompatImageView6 = new AppCompatImageView(getContext());
            appCompatImageView6.setId(com.vkontakte.android.R.id.ds_internal_cell_reorder);
            appCompatImageView6.setImageResource(com.vkontakte.android.R.drawable.vk_icon_reorder_24);
            this.w = appCompatImageView6;
            LinearLayout.LayoutParams b = cpy.b(0, 0, e3m.a(com.vkontakte.android.R.dimen.vk_ui_spacing_size_xl, getContext()), 0, 0, 0, 59);
            b.gravity = 17;
            vkCellRight.addView(appCompatImageView6, vkCellRight.getChildCount(), b);
        }
        appCompatImageView6.setVisibility(0);
        tlo0 tlo0Var2 = fVar.b;
        appCompatImageView6.setContentDescription(tlo0Var2 != null ? tlo0Var2.a(appCompatImageView6.getContext()) : null);
        k1u0 k1u0Var2 = fVar.c;
        appCompatImageView6.getContext();
        gpo0.h(appCompatImageView6, k1u0Var2, valueOf);
    }

    public final LinearLayout.LayoutParams b() {
        return cpy.b(0, 0, e3m.a(com.vkontakte.android.R.dimen.vk_ui_spacing_size_m, getContext()), 0, 0, 0, 59);
    }

    public final ViewGroup c() {
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(com.vkontakte.android.R.id.ds_internal_cell_right_actions_wrapper);
        frameLayout2.setMinimumHeight(getRightMinimumHeight());
        frameLayout2.setVisibility(8);
        this.c = frameLayout2;
        this.b.addView(frameLayout2, 0, b());
        return frameLayout2;
    }

    public final LinearLayout d() {
        LinearLayout linearLayout = this.p;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_action_dropdown_wrapper);
        linearLayout2.setGravity(17);
        linearLayout2.setVisibility(8);
        linearLayout2.setOrientation(0);
        this.p = linearLayout2;
        f().addView(linearLayout2, 0, this.y);
        return linearLayout2;
    }

    public final FrameLayout e() {
        FrameLayout frameLayout = this.o;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_action_picture_slot);
        frameLayout2.setVisibility(8);
        this.o = frameLayout2;
        FrameLayout.LayoutParams a = cpy.a(0, 0, 0, e3m.a(com.vkontakte.android.R.dimen.vk_ui_spacing_size_xs, getContext()), e3m.a(com.vkontakte.android.R.dimen.vk_ui_spacing_size_xs, getContext()), 0, 39);
        a.gravity = 16;
        f().addView(frameLayout2, 0, a);
        return frameLayout2;
    }

    public final FrameLayout f() {
        VkCellRightExtraActionsWrapper vkCellRightExtraActionsWrapper = this.n;
        if (vkCellRightExtraActionsWrapper != null) {
            return vkCellRightExtraActionsWrapper;
        }
        VkCellRightExtraActionsWrapper vkCellRightExtraActionsWrapper2 = new VkCellRightExtraActionsWrapper(getContext(), null, 0, 14, 0);
        vkCellRightExtraActionsWrapper2.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_actions_wrapper);
        vkCellRightExtraActionsWrapper2.setMinimumHeight(getRightMinimumHeight());
        vkCellRightExtraActionsWrapper2.setVisibility(8);
        this.n = vkCellRightExtraActionsWrapper2;
        FrameLayout frameLayout = this.c;
        VkCellRight vkCellRight = this.b;
        int max = Math.max(vkCellRight.indexOfChild(frameLayout), vkCellRight.indexOfChild(this.i));
        vkCellRight.addView(vkCellRightExtraActionsWrapper2, max != 0 ? 1 + max : 1, b());
        return vkCellRightExtraActionsWrapper2;
    }

    public final FrameLayout g() {
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_view_slot);
        frameLayout2.setVisibility(8);
        this.j = frameLayout2;
        FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
        a.gravity = 16;
        h().addView(frameLayout2, 0, a);
        return frameLayout2;
    }

    public final FrameLayout h() {
        FrameLayout frameLayout = this.i;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(getContext());
            frameLayout.setId(com.vkontakte.android.R.id.ds_internal_cell_right_extra_wrapper);
            frameLayout.setMinimumHeight(getRightMinimumHeight());
            frameLayout.setVisibility(8);
            this.i = frameLayout;
            FrameLayout frameLayout2 = this.c;
            VkCellRight vkCellRight = this.b;
            int indexOfChild = vkCellRight.indexOfChild(frameLayout2);
            vkCellRight.addView(frameLayout, indexOfChild == -1 ? 0 : indexOfChild + 1, b());
        }
        return frameLayout;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getChildAt(0).getLayoutParams();
        int marginStart = marginLayoutParams.getMarginStart();
        marginLayoutParams.setMarginStart(0);
        super.onMeasure(i, i2);
        marginLayoutParams.setMarginStart(marginStart);
    }

    public final void setRightExtraActionPictureController(VkCell.e eVar) {
        if (eVar == null) {
            e().removeAllViews();
            this.t = null;
            return;
        }
        VkCell.d create = eVar.create(getContext());
        FrameLayout e = e();
        e.removeAllViews();
        e.addView(create.getView());
        this.t = create;
    }

    public final void setRightExtraViewController(VkCell.e eVar) {
        if (eVar == null) {
            g().removeAllViews();
            this.l = null;
            return;
        }
        VkCell.d create = eVar.create(getContext());
        FrameLayout g = g();
        g.removeAllViews();
        g.addView(create.getView());
        this.l = create;
    }

    public VkCellRight(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = this;
        setOrientation(0);
        setGravity(16);
        FrameLayout.LayoutParams a = cpy.a(0, 0, 0, 0, 0, 0, 63);
        a.gravity = 17;
        this.y = a;
    }
}
