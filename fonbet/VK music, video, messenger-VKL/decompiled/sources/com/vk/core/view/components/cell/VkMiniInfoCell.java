package com.vk.core.view.components.cell;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.cell.g;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ayv0;
import xsna.cut0;
import xsna.dko;
import xsna.e3m;
import xsna.epx;
import xsna.fy20;
import xsna.gpo0;
import xsna.gzs;
import xsna.hbh0;
import xsna.qoy;
import xsna.s3q0;
import xsna.tlo0;
import xsna.x7g;
import xsna.xk;
import xsna.zh0;
import xsna.zrp;

/* compiled from: VkMiniInfoCell.kt */
/* loaded from: classes17.dex */
public final class VkMiniInfoCell extends FrameLayout {
    public static final b o = new b(true);
    public final ImageView b;
    public final TextView c;
    public final FrameLayout d;
    public VkLinkedText e;
    public VkExpandableText f;
    public final ImageView g;
    public final FrameLayout h;
    public VkUserStack i;
    public Mode j;
    public d k;
    public e l;
    public f m;
    public a n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkMiniInfoCell.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode AddInfo;
        public static final Mode Base;
        public static final Mode BaseAccent;
        public static final Mode Link;
        public static final Mode MoreInfo;

        static {
            Mode mode = new Mode("Base", 0);
            Base = mode;
            Mode mode2 = new Mode("BaseAccent", 1);
            BaseAccent = mode2;
            Mode mode3 = new Mode("Link", 2);
            Link = mode3;
            Mode mode4 = new Mode("AddInfo", 3);
            AddInfo = mode4;
            Mode mode5 = new Mode("MoreInfo", 4);
            MoreInfo = mode5;
            Mode[] modeArr = {mode, mode2, mode3, mode4, mode5};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: VkMiniInfoCell.kt */
    public interface a {
        cut0 a(Mode mode);

        x7g b(Mode mode);

        int c(Mode mode);

        cut0 d(Mode mode);
    }

    /* compiled from: VkMiniInfoCell.kt */
    public static class b implements a {
        public final boolean a;

        /* compiled from: VkMiniInfoCell.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[Mode.MoreInfo.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Mode.Base.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Mode.BaseAccent.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Mode.Link.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Mode.AddInfo.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(boolean z) {
            this.a = z;
        }

        @Override // com.vk.core.view.components.cell.VkMiniInfoCell.a
        public cut0 a(Mode mode) {
            if (!this.a) {
                return null;
            }
            int i = a.$EnumSwitchMapping$0[mode.ordinal()];
            int i2 = R.attr.vk_ui_icon_accent;
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    i2 = R.attr.vk_ui_icon_secondary;
                } else if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new x7g(i2);
        }

        @Override // com.vk.core.view.components.cell.VkMiniInfoCell.a
        public final x7g b(Mode mode) {
            int i = a.$EnumSwitchMapping$0[mode.ordinal()];
            int i2 = R.attr.vk_ui_icon_accent;
            if (i != 1) {
                if (i == 2) {
                    i2 = R.attr.vk_ui_icon_secondary;
                } else if (i == 3) {
                    i2 = R.attr.vk_ui_icon_medium;
                } else if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new x7g(i2);
        }

        @Override // com.vk.core.view.components.cell.VkMiniInfoCell.a
        public int c(Mode mode) {
            return a.$EnumSwitchMapping$0[mode.ordinal()] == 1 ? R.attr.vk_ui_typography_headline2 : R.attr.vk_ui_typography_paragraph;
        }

        @Override // com.vk.core.view.components.cell.VkMiniInfoCell.a
        public cut0 d(Mode mode) {
            int i = a.$EnumSwitchMapping$0[mode.ordinal()];
            int i2 = R.attr.vk_ui_text_link;
            if (i != 1) {
                if (i == 2) {
                    i2 = R.attr.vk_ui_text_subhead;
                } else if (i == 3) {
                    i2 = R.attr.vk_ui_text_primary;
                } else if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new x7g(i2);
        }
    }

    /* compiled from: VkMiniInfoCell.kt */
    public static final class c {
        public final VkExpandableText.a a;
        public final int b;

        public c(VkExpandableText.a aVar, int i) {
            int i2 = (i & 4) != 0 ? 3 : 4;
            this.a = aVar;
            this.b = i2;
        }
    }

    /* compiled from: VkMiniInfoCell.kt */
    public static final class d {
        public final dko a;
        public final tlo0 b;
        public final Integer c;

        public d(dko dkoVar, tlo0.h hVar, int i) {
            hVar = (i & 2) != 0 ? null : hVar;
            Integer num = (i & 4) != 0 ? null : 16;
            this.a = dkoVar;
            this.b = hVar;
            this.c = num;
        }
    }

    /* compiled from: VkMiniInfoCell.kt */
    public static final class e {
        public final tlo0 a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final c f;

        public e(tlo0 tlo0Var, boolean z, boolean z2, boolean z3, boolean z4, c cVar, int i) {
            z = (i & 2) != 0 ? false : z;
            z2 = (i & 4) != 0 ? false : z2;
            z3 = (i & 8) != 0 ? false : z3;
            z4 = (i & 16) != 0 ? false : z4;
            cVar = (i & 32) != 0 ? null : cVar;
            this.a = tlo0Var;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && epx.f(this.f, eVar.f);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            c cVar = this.f;
            return b + (cVar == null ? 0 : cVar.hashCode());
        }

        public final String toString() {
            return "Middle(text=" + this.a + ", multiline=" + this.b + ", chevron=" + this.c + ", isTextSelectable=" + this.d + ", isLinkedText=" + this.e + ", expandable=" + this.f + ')';
        }
    }

    /* compiled from: VkMiniInfoCell.kt */
    public static final class f {
        public final List<ayv0> a;
        public final Integer b;
        public final gzs<s3q0> c;

        public f() {
            throw null;
        }

        public f(List list, xk xkVar, int i) {
            Integer num = (i & 2) != 0 ? null : 3;
            xkVar = (i & 4) != 0 ? null : xkVar;
            this.a = list;
            this.b = num;
            this.c = xkVar;
        }
    }

    public VkMiniInfoCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a(e eVar) {
        VkExpandableText vkExpandableText;
        getContext();
        ImageView imageView = this.g;
        TextView textView = this.c;
        FrameLayout frameLayout = this.d;
        if (eVar == null) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            VkExpandableText vkExpandableText2 = this.f;
            if (vkExpandableText2 != null) {
                vkExpandableText2.setVisibility(8);
            }
            VkLinkedText vkLinkedText = this.e;
            if (vkLinkedText != null) {
                vkLinkedText.setVisibility(8);
                return;
            }
            return;
        }
        boolean z = eVar.e;
        c cVar = eVar.f;
        int i = 0;
        boolean z2 = z || cVar != null;
        if (textView != null) {
            textView.setVisibility(!z2 ? 0 : 8);
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(z2 ? 0 : 8);
        }
        int i2 = 6;
        AttributeSet attributeSet = null;
        TextView textView2 = textView;
        if (cVar != null) {
            VkExpandableText vkExpandableText3 = this.f;
            textView2 = vkExpandableText3;
            if (vkExpandableText3 == null) {
                VkExpandableText vkExpandableText4 = new VkExpandableText(getContext(), null, 6, 0);
                vkExpandableText4.setTextAppearance(this.n.c(this.j));
                vkExpandableText4.setTextColor(this.n.d(this.j).b(getContext()));
                if (frameLayout != null) {
                    frameLayout.addView(vkExpandableText4, new ViewGroup.LayoutParams(-1, -2));
                }
                this.f = vkExpandableText4;
                textView2 = vkExpandableText4;
            }
        } else if (z) {
            VkLinkedText vkLinkedText2 = this.e;
            textView2 = vkLinkedText2;
            if (vkLinkedText2 == null) {
                VkLinkedText vkLinkedText3 = new VkLinkedText(getContext(), attributeSet, i2, i);
                vkLinkedText3.setId(R.id.ds_internal_mini_info_cell_middle_linked_title);
                vkLinkedText3.setTextAppearance(this.n.c(this.j));
                vkLinkedText3.setTextColor(this.n.d(this.j).b(getContext()));
                vkLinkedText3.setEllipsize(TextUtils.TruncateAt.END);
                vkLinkedText3.setMaxLines(1);
                if (frameLayout != null) {
                    frameLayout.addView(vkLinkedText3, new ViewGroup.LayoutParams(-2, -2));
                }
                this.e = vkLinkedText3;
                textView2 = vkLinkedText3;
            }
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setText(eVar.a.a(getContext()));
        }
        if (textView2 != null) {
            textView2.setMaxLines(eVar.b ? Integer.MAX_VALUE : 1);
        }
        if (textView2 != null) {
            textView2.setTextIsSelectable(eVar.d);
        }
        if (imageView != null) {
            imageView.setVisibility(eVar.c ? 0 : 8);
        }
        if (cVar == null || (vkExpandableText = this.f) == null) {
            return;
        }
        vkExpandableText.setExpandButton(cVar.a);
        vkExpandableText.setMaxCollapsedLines(cVar.b);
        vkExpandableText.o();
    }

    public final void b(Mode mode) {
        getContext();
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(this.n.c(mode));
        }
        if (textView != null) {
            textView.setTextColor(this.n.d(mode).b(getContext()));
        }
        VkLinkedText vkLinkedText = this.e;
        if (vkLinkedText != null) {
            vkLinkedText.setTextAppearance(this.n.c(mode));
        }
        VkLinkedText vkLinkedText2 = this.e;
        if (vkLinkedText2 != null) {
            vkLinkedText2.setTextColor(this.n.d(mode).b(getContext()));
        }
        VkExpandableText vkExpandableText = this.f;
        if (vkExpandableText != null) {
            vkExpandableText.setTextAppearance(this.n.c(mode));
        }
        VkExpandableText vkExpandableText2 = this.f;
        if (vkExpandableText2 != null) {
            vkExpandableText2.setTextColor(this.n.d(mode).b(getContext()));
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            gpo0.g(imageView, this.n.a(mode));
        }
        ImageView imageView2 = this.g;
        if (imageView2 != null) {
            gpo0.g(imageView2, this.n.b(mode));
        }
    }

    public final a getDecorator() {
        return this.n;
    }

    public final d getIcon() {
        return this.k;
    }

    public final e getMiddle() {
        return this.l;
    }

    public final Mode getMode() {
        return this.j;
    }

    public final f getUserStack() {
        return this.m;
    }

    public final void setDecorator(a aVar) {
        this.n = aVar;
        b(this.j);
        a(this.l);
    }

    public final void setIcon(d dVar) {
        this.k = dVar;
        getContext();
        ImageView imageView = this.b;
        if (dVar == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setImageDrawable(dVar.a.a(getContext()));
        }
        if (imageView != null) {
            tlo0 tlo0Var = dVar.b;
            imageView.setContentDescription(tlo0Var != null ? tlo0Var.a(getContext()) : null);
        }
        Integer num = dVar.c;
        if (num != null) {
            int intValue = num.intValue();
            Object layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = intValue;
                layoutParams2.topMargin = intValue != 16 ? hbh0.b(6, getContext()) : 0;
                if (imageView != null) {
                    imageView.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void setMiddle(e eVar) {
        this.l = eVar;
        a(eVar);
    }

    public final void setMode(Mode mode) {
        this.j = mode;
        b(mode);
    }

    public final void setUserStack(f fVar) {
        this.m = fVar;
        getContext();
        FrameLayout frameLayout = this.h;
        if (fVar == null) {
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (this.i == null) {
            VkUserStack vkUserStack = new VkUserStack(getContext(), null, 6);
            if (frameLayout != null) {
                frameLayout.addView(vkUserStack);
            }
            this.i = vkUserStack;
        }
        VkUserStack vkUserStack2 = this.i;
        if (vkUserStack2 != null) {
            vkUserStack2.setAvatars(fVar.a);
        }
        VkUserStack vkUserStack3 = this.i;
        if (vkUserStack3 != null) {
            vkUserStack3.setCounter(fVar.b);
        }
        VkUserStack vkUserStack4 = this.i;
        if (vkUserStack4 != null) {
            vkUserStack4.setOnClickListener(fVar.c != null ? new zh0(fVar, 11) : null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkMiniInfoCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        g gVar = new g(context, attributeSet, 0);
        h hVar = new h(context);
        hVar.setId(R.id.ds_internal_sexy_cell);
        hVar.setSize(Slot.Size.S);
        hVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        gVar.addView(hVar);
        gVar.b = hVar;
        Mode mode = Mode.Base;
        gVar.c = mode;
        gVar.g = new g.b(new fy20(context, 2));
        gVar.b(mode);
        gVar.setBackground(e3m.e(R.attr.selectableItemBackground, context));
        this.j = mode;
        this.n = o;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_mini_info_cell, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.icon);
        this.c = (TextView) findViewById(R.id.title);
        this.d = (FrameLayout) findViewById(R.id.linkedTitleWrapper);
        this.g = (ImageView) findViewById(R.id.chevron);
        this.h = (FrameLayout) findViewById(R.id.userStackSlot);
        b(this.j);
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
    }

    private static /* synthetic */ void getSexyInfoCell$annotations() {
    }
}
