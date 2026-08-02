package com.vk.core.view.components.cell.rich.middle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.tool.view.GapLinearLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.core.view.tools.VkViewStub;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.ey2;
import xsna.f4m;
import xsna.gko;
import xsna.hbh0;
import xsna.hvr0;
import xsna.jcf0;
import xsna.ogv0;
import xsna.pgv0;
import xsna.qgv0;
import xsna.rgv0;
import xsna.sgv0;
import xsna.tfm0;
import xsna.tgv0;
import xsna.tlo0;
import xsna.too0;
import xsna.ugv0;
import xsna.uhs0;
import xsna.vgv0;
import xsna.y01;

/* compiled from: VkRichCellMiddle.kt */
/* loaded from: classes17.dex */
public final class VkRichCellMiddle extends FrameLayout implements too0 {
    public static final /* synthetic */ int p = 0;
    public final GapLinearLayout b;
    public final GapLinearLayout c;
    public final VkRichCellMiddleText d;
    public final VkRichCellMiddleText e;
    public final VkRichCellMiddleText f;
    public final VkRichCellMiddleText g;
    public final GapLinearLayout h;
    public final TextView i;
    public final TextView j;
    public final VkViewStub k;
    public final GapLinearLayout l;
    public final VkViewStub m;
    public final VkViewStub n;
    public final VkViewStub o;

    public VkRichCellMiddle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_richcell_middle, (ViewGroup) this, true);
        this.b = (GapLinearLayout) findViewById(R.id.middle_text_container);
        this.c = (GapLinearLayout) findViewById(R.id.lines_column);
        this.d = (VkRichCellMiddleText) findViewById(R.id.overtitle_wrapper);
        this.e = (VkRichCellMiddleText) findViewById(R.id.title_wrapper);
        this.f = (VkRichCellMiddleText) findViewById(R.id.subtitle_wrapper);
        this.g = (VkRichCellMiddleText) findViewById(R.id.extra_subtitle_wrapper);
        this.h = (GapLinearLayout) findViewById(R.id.meta_wrapper);
        this.i = (TextView) findViewById(R.id.meta_title);
        this.j = (TextView) findViewById(R.id.meta_subtitle);
        VkViewStub vkViewStub = (VkViewStub) findViewById(R.id.user_stack);
        this.k = vkViewStub;
        this.l = (GapLinearLayout) findViewById(R.id.buttons_group);
        VkViewStub vkViewStub2 = (VkViewStub) findViewById(R.id.buttons_group_first_button);
        this.m = vkViewStub2;
        VkViewStub vkViewStub3 = (VkViewStub) findViewById(R.id.buttons_group_second_button);
        this.n = vkViewStub3;
        VkViewStub vkViewStub4 = (VkViewStub) findViewById(R.id.buttons_group_third_button);
        this.o = vkViewStub4;
        vkViewStub.setViewFactory(new jcf0(this, 25));
        vkViewStub2.setViewFactory(new uhs0(this, 10));
        vkViewStub3.setViewFactory(new tfm0(this, 25));
        vkViewStub4.setViewFactory(new hvr0(this, 17));
        Ng();
    }

    public static void b(VkViewStub vkViewStub, ogv0 ogv0Var) {
        f4m.E(vkViewStub.getView(), ogv0Var != null);
        if (ogv0Var != null) {
            vkViewStub.a();
            View view = vkViewStub.getView();
            VkButton vkButton = view instanceof VkButton ? (VkButton) view : null;
            if (vkButton != null) {
                vkButton.setText(ogv0Var.a.a(vkButton.getContext()));
                vkButton.setCount(ogv0Var.e);
                vkButton.setSize(ogv0Var.f);
                vkButton.setMode(ogv0Var.g);
                vkButton.setAppearance(ogv0Var.h);
                vkButton.setOnClickListener(new y01(ogv0Var, 14));
                ogv0.a aVar = ogv0Var.c;
                if (aVar != null) {
                    Drawable b = gko.b(aVar.a.a, vkButton.getContext());
                    if (b != null) {
                        vkButton.Z4(b, true);
                    }
                    vkButton.setIconSize(null);
                } else {
                    vkButton.a5(true, null);
                }
                ogv0.a aVar2 = ogv0Var.d;
                if (aVar2 != null) {
                    Drawable b2 = gko.b(aVar2.a.a, vkButton.getContext());
                    if (b2 != null) {
                        vkButton.c5(b2, true);
                    }
                    vkButton.setTrailingIconSize(null);
                } else {
                    vkButton.d5(null);
                }
                vkButton.setEnabled(ogv0Var.i);
                vkButton.setHideContentOnLoading(true);
                vkButton.setLoading(ogv0Var.j);
            }
        }
    }

    private final void setExtraSubtitle(qgv0 qgv0Var) {
        boolean z = qgv0Var != null;
        VkRichCellMiddleText vkRichCellMiddleText = this.g;
        f4m.E(vkRichCellMiddleText, z);
        if (qgv0Var != null) {
            vkRichCellMiddleText.setTextOrHide(qgv0Var.a.a(getContext()));
            vkRichCellMiddleText.setMaxLines(qgv0Var.d);
            vkRichCellMiddleText.setEllipsize(qgv0Var.e);
            vkRichCellMiddleText.setBeforeForSubtitle(qgv0Var.b);
            vkRichCellMiddleText.setAfterForSubtitle(qgv0Var.c);
        }
    }

    private final void setMeta(rgv0 rgv0Var) {
        f4m.E(this.h, rgv0Var != null);
        if (rgv0Var != null) {
            ey2.i(this.i, tlo0.b.a(rgv0Var.a, getContext()));
            ey2.i(this.j, tlo0.b.a(rgv0Var.b, getContext()));
        }
    }

    private final void setOvertitle(sgv0 sgv0Var) {
        boolean z = sgv0Var != null;
        VkRichCellMiddleText vkRichCellMiddleText = this.d;
        f4m.E(vkRichCellMiddleText, z);
        if (sgv0Var != null) {
            vkRichCellMiddleText.setTextOrHide(sgv0Var.a.a(getContext()));
            vkRichCellMiddleText.setMaxLines(sgv0Var.d);
            vkRichCellMiddleText.setEllipsize(sgv0Var.e);
        }
    }

    private final void setSlot(tgv0 tgv0Var) {
        boolean z = tgv0Var instanceof tgv0.a;
        VkViewStub vkViewStub = this.k;
        if (!z) {
            if (tgv0Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(vkViewStub.getView());
            return;
        }
        tgv0.a aVar = (tgv0.a) tgv0Var;
        vkViewStub.a();
        View view = vkViewStub.getView();
        VkUserStack vkUserStack = view instanceof VkUserStack ? (VkUserStack) view : null;
        if (vkUserStack != null) {
            vkUserStack.setVisibility(0);
            vkUserStack.setCounter(aVar.b);
            vkUserStack.setSize(aVar.f);
            vkUserStack.setText(aVar.c);
            vkUserStack.setMaxLines(aVar.d);
            vkUserStack.setOverflow(aVar.e);
            vkUserStack.setAvatarsPosition(aVar.g);
            vkUserStack.setAvatars(aVar.a);
        }
    }

    private final void setSubtitle(ugv0 ugv0Var) {
        boolean z = ugv0Var != null;
        VkRichCellMiddleText vkRichCellMiddleText = this.f;
        f4m.E(vkRichCellMiddleText, z);
        if (ugv0Var != null) {
            vkRichCellMiddleText.setTextOrHide(ugv0Var.a.a(getContext()));
            vkRichCellMiddleText.setMaxLines(ugv0Var.d);
            vkRichCellMiddleText.setEllipsize(ugv0Var.e);
            vkRichCellMiddleText.setTextClickListener(ugv0Var.f);
            vkRichCellMiddleText.setBeforeForSubtitle(ugv0Var.b);
            vkRichCellMiddleText.setAfterForSubtitle(ugv0Var.c);
        }
    }

    private final void setTitle(vgv0 vgv0Var) {
        boolean z = vgv0Var != null;
        VkRichCellMiddleText vkRichCellMiddleText = this.e;
        f4m.E(vkRichCellMiddleText, z);
        if (vgv0Var != null) {
            vkRichCellMiddleText.setTextOrHide(vgv0Var.a.a(getContext()));
            vkRichCellMiddleText.setMaxLines(vgv0Var.d);
            vkRichCellMiddleText.setEllipsize(vgv0Var.e);
            vkRichCellMiddleText.setBeforeForTitle(vgv0Var.b);
            vkRichCellMiddleText.setAfterForTitle(vgv0Var.c);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.setGap(e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext()));
        getContext();
        this.c.setGap(0);
        this.h.setGap(hbh0.b(2, getContext()));
        int a = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        VkRichCellMiddleText vkRichCellMiddleText = this.d;
        vkRichCellMiddleText.setGap(a);
        vkRichCellMiddleText.setTextAppearance(e3m.g(R.attr.vk_ui_typography_subhead, getContext()));
        vkRichCellMiddleText.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, getContext()));
        f4m.q(e3m.a(R.dimen.vk_ui_spacing_size2_xs, getContext()), vkRichCellMiddleText);
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        VkRichCellMiddleText vkRichCellMiddleText2 = this.e;
        vkRichCellMiddleText2.setGap(a2);
        vkRichCellMiddleText2.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text, getContext()));
        vkRichCellMiddleText2.setTextColor(e3m.f(R.attr.vk_ui_text_primary, getContext()));
        int a3 = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        VkRichCellMiddleText vkRichCellMiddleText3 = this.f;
        vkRichCellMiddleText3.setGap(a3);
        vkRichCellMiddleText3.setTextAppearance(e3m.g(R.attr.vk_ui_typography_paragraph, getContext()));
        vkRichCellMiddleText3.setTextColor(e3m.f(R.attr.vk_ui_text_primary, getContext()));
        int a4 = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        VkRichCellMiddleText vkRichCellMiddleText4 = this.g;
        vkRichCellMiddleText4.setGap(a4);
        vkRichCellMiddleText4.setTextAppearance(e3m.g(R.attr.vk_ui_typography_subhead, getContext()));
        vkRichCellMiddleText4.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, getContext()));
        f4m.t(e3m.a(R.dimen.vk_ui_spacing_size2_xs, getContext()), vkRichCellMiddleText4);
        int g = e3m.g(R.attr.vk_ui_typography_headline2, getContext());
        TextView textView = this.i;
        textView.setTextAppearance(g);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, getContext()));
        int g2 = e3m.g(R.attr.vk_ui_typography_footnote, getContext());
        TextView textView2 = this.j;
        textView2.setTextAppearance(g2);
        textView2.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, getContext()));
        f4m.t(e3m.a(R.dimen.vk_ui_spacing_size_s, getContext()), this.k.getView());
        int a5 = e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext());
        GapLinearLayout gapLinearLayout = this.l;
        gapLinearLayout.setGap(a5);
        f4m.t(e3m.a(R.dimen.vk_ui_spacing_size_m, getContext()), gapLinearLayout);
    }

    public final void a(pgv0 pgv0Var) {
        if (pgv0Var == null) {
            return;
        }
        setTitle(pgv0Var.a);
        setSubtitle(pgv0Var.b);
        setExtraSubtitle(pgv0Var.c);
        setOvertitle(pgv0Var.d);
        setSlot(pgv0Var.e);
        setMeta(pgv0Var.f);
        ogv0 ogv0Var = pgv0Var.g;
        ogv0 ogv0Var2 = pgv0Var.h;
        ogv0 ogv0Var3 = pgv0Var.i;
        b(this.m, ogv0Var);
        b(this.n, ogv0Var2);
        b(this.o, ogv0Var3);
        this.l.setVisibility((ogv0Var == null && ogv0Var2 == null && ogv0Var3 == null) ? 8 : 0);
    }
}
