package com.vk.core.view.components.cell;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.cell.h;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.cut0;
import xsna.e3m;
import xsna.f4m;
import xsna.fy20;
import xsna.gpo0;
import xsna.gzs;
import xsna.hbh0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.vr6;
import xsna.x7g;

/* compiled from: VkMiniInfoSexyCell.kt */
/* loaded from: classes17.dex */
public final class g extends FrameLayout {
    public h b;
    public VkMiniInfoCell.Mode c;
    public VkMiniInfoCell.d d;
    public VkMiniInfoCell.e e;
    public VkMiniInfoCell.f f;
    public a g;
    public d h;
    public e i;
    public c j;

    /* compiled from: VkMiniInfoSexyCell.kt */
    public interface a {
        x7g a(VkMiniInfoCell.Mode mode);

        x7g b(VkMiniInfoCell.Mode mode);

        int c(VkMiniInfoCell.Mode mode);

        x7g d(VkMiniInfoCell.Mode mode);
    }

    /* compiled from: VkMiniInfoSexyCell.kt */
    public static final class b implements a {
        public final gzs<Context> a;
        public final boolean b = true;

        /* compiled from: VkMiniInfoSexyCell.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VkMiniInfoCell.Mode.values().length];
                try {
                    iArr[VkMiniInfoCell.Mode.MoreInfo.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VkMiniInfoCell.Mode.Base.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VkMiniInfoCell.Mode.BaseAccent.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VkMiniInfoCell.Mode.Link.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[VkMiniInfoCell.Mode.AddInfo.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(gzs gzsVar) {
            this.a = gzsVar;
        }

        @Override // com.vk.core.view.components.cell.g.a
        public final x7g a(VkMiniInfoCell.Mode mode) {
            if (!this.b) {
                return null;
            }
            int i = a.$EnumSwitchMapping$0[mode.ordinal()];
            int i2 = R.attr.vk_ui_icon_accent;
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    i2 = R.attr.vk_ui_icon_primary;
                } else if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new x7g(i2);
        }

        @Override // com.vk.core.view.components.cell.g.a
        public final x7g b(VkMiniInfoCell.Mode mode) {
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

        @Override // com.vk.core.view.components.cell.g.a
        public final int c(VkMiniInfoCell.Mode mode) {
            int i = a.$EnumSwitchMapping$0[mode.ordinal()];
            gzs<Context> gzsVar = this.a;
            return i == 1 ? e3m.g(R.attr.vk_ui_typography_headline2, gzsVar.invoke()) : e3m.g(R.attr.vk_ui_typography_text_semi_bold, gzsVar.invoke());
        }

        @Override // com.vk.core.view.components.cell.g.a
        public final x7g d(VkMiniInfoCell.Mode mode) {
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

    private final void setAfterSlot(c cVar) {
        h hVar = this.b;
        if (cVar != null) {
            hVar.setAfter(new h.a(Collections.singletonList(cVar)));
        } else {
            hVar.setAfter(null);
        }
        this.j = cVar;
    }

    private final void setBeforeSlot(d dVar) {
        h hVar = this.b;
        if (dVar != null) {
            hVar.setBefore(new h.b(Collections.singletonList(dVar)));
        } else {
            hVar.setBefore(null);
        }
        this.h = dVar;
    }

    private final void setMiddleSlot(e eVar) {
        h hVar = this.b;
        if (eVar != null) {
            View inflate = e3m.b(getContext()).inflate(R.layout.ds_internal_mini_info_cell_middle_title, (ViewGroup) this, false);
            VkMiniInfoCell.Mode mode = VkMiniInfoCell.Mode.Base;
            hVar.setMiddle(new h.c(eVar, null, null));
        } else {
            hVar.setMiddle(null);
        }
        this.i = eVar;
    }

    public final void a(VkMiniInfoCell.e eVar) {
        VkExpandableText vkExpandableText;
        e eVar2 = this.i;
        if (eVar2 == null) {
            eVar2 = new e(getContext(), this);
            setMiddleSlot(eVar2);
        }
        TextView textView = eVar2.e;
        FrameLayout frameLayout = eVar2.f;
        if (eVar == null) {
            f4m.j(eVar2.b);
            return;
        }
        boolean z = eVar.e;
        VkMiniInfoCell.c cVar = eVar.f;
        boolean z2 = z || cVar != null;
        textView.setVisibility(!z2 ? 0 : 8);
        if (frameLayout != null) {
            frameLayout.setVisibility(z2 ? 0 : 8);
        }
        int i = 6;
        AttributeSet attributeSet = null;
        TextView textView2 = textView;
        if (cVar != null) {
            VkExpandableText vkExpandableText2 = eVar2.h;
            textView2 = vkExpandableText2;
            if (vkExpandableText2 == null) {
                VkExpandableText vkExpandableText3 = new VkExpandableText(eVar2.a(), null, 6, 0);
                vkExpandableText3.setTextAppearance(eVar2.d.c(eVar2.c));
                vkExpandableText3.setTextColor(cut0.a.a(eVar2.d.d(eVar2.c), eVar2.a()));
                frameLayout.addView(vkExpandableText3, new ViewGroup.LayoutParams(-1, -2));
                eVar2.h = vkExpandableText3;
                textView2 = vkExpandableText3;
            }
        } else if (z) {
            VkLinkedText vkLinkedText = eVar2.g;
            textView2 = vkLinkedText;
            if (vkLinkedText == null) {
                VkLinkedText vkLinkedText2 = new VkLinkedText(eVar2.a(), attributeSet, i, r5);
                vkLinkedText2.setId(R.id.ds_internal_mini_info_cell_middle_linked_title);
                vkLinkedText2.setTextAppearance(eVar2.d.c(eVar2.c));
                vkLinkedText2.setTextColor(cut0.a.a(eVar2.d.d(eVar2.c), eVar2.a()));
                vkLinkedText2.setEllipsize(TextUtils.TruncateAt.END);
                vkLinkedText2.setMaxLines(1);
                frameLayout.addView(vkLinkedText2, new ViewGroup.LayoutParams(-2, -2));
                eVar2.g = vkLinkedText2;
                textView2 = vkLinkedText2;
            }
        }
        textView2.setVisibility(0);
        textView2.setText(eVar.a.a(eVar2.a()));
        textView2.setMaxLines(eVar.b ? Integer.MAX_VALUE : 1);
        textView2.setTextIsSelectable(eVar.d);
        eVar2.i.setVisibility(eVar.c ? 0 : 8);
        if (cVar == null || (vkExpandableText = eVar2.h) == null) {
            return;
        }
        vkExpandableText.setExpandButton(cVar.a);
        vkExpandableText.setMaxCollapsedLines(cVar.b);
        vkExpandableText.o();
    }

    public final void b(VkMiniInfoCell.Mode mode) {
        d dVar = this.h;
        if (dVar == null) {
            dVar = new d(getContext());
            setBeforeSlot(dVar);
        }
        gpo0.g(dVar.b, this.g.a(mode));
        e eVar = this.i;
        if (eVar == null) {
            eVar = new e(getContext(), this);
            setMiddleSlot(eVar);
        }
        a aVar = this.g;
        eVar.d = aVar;
        eVar.c = mode;
        TextView textView = eVar.e;
        textView.setTextAppearance(aVar.c(mode));
        textView.setTextColor(cut0.a.a(aVar.d(mode), eVar.a()));
        VkLinkedText vkLinkedText = eVar.g;
        if (vkLinkedText != null) {
            vkLinkedText.setTextAppearance(aVar.c(mode));
        }
        VkLinkedText vkLinkedText2 = eVar.g;
        if (vkLinkedText2 != null) {
            vkLinkedText2.setTextColor(cut0.a.a(aVar.d(mode), eVar.a()));
        }
        VkExpandableText vkExpandableText = eVar.h;
        if (vkExpandableText != null) {
            vkExpandableText.setTextAppearance(aVar.c(mode));
        }
        VkExpandableText vkExpandableText2 = eVar.h;
        if (vkExpandableText2 != null) {
            vkExpandableText2.setTextColor(cut0.a.a(aVar.d(mode), eVar.a()));
        }
        gpo0.g(eVar.i, aVar.b(mode));
    }

    public final a getDecorator() {
        return this.g;
    }

    public final VkMiniInfoCell.d getIcon() {
        return this.d;
    }

    public final VkMiniInfoCell.e getMiddle() {
        return this.e;
    }

    public final VkMiniInfoCell.Mode getMode() {
        return this.c;
    }

    public final VkMiniInfoCell.f getUserStack() {
        return this.f;
    }

    public final void setDecorator(a aVar) {
        this.g = aVar;
        b(this.c);
        a(this.e);
    }

    public final void setIcon(VkMiniInfoCell.d dVar) {
        this.d = dVar;
        d dVar2 = this.h;
        if (dVar2 == null) {
            dVar2 = new d(getContext());
            setBeforeSlot(dVar2);
        }
        ImageView imageView = dVar2.b;
        if (dVar == null) {
            f4m.j(imageView);
            return;
        }
        Integer num = dVar.c;
        imageView.setVisibility(0);
        imageView.setImageDrawable(dVar.a.a(dVar2.getView().getContext()));
        tlo0 tlo0Var = dVar.b;
        imageView.setContentDescription(tlo0Var != null ? tlo0Var.a(dVar2.getView().getContext()) : null);
        if (num != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = num.intValue();
                layoutParams2.topMargin = num.intValue() != 16 ? hbh0.b(6, dVar2.getView().getContext()) : 0;
                imageView.setLayoutParams(layoutParams2);
            }
        }
    }

    public final void setMiddle(VkMiniInfoCell.e eVar) {
        this.e = eVar;
        a(eVar);
    }

    public final void setMode(VkMiniInfoCell.Mode mode) {
        this.c = mode;
        b(mode);
    }

    public final void setUserStack(VkMiniInfoCell.f fVar) {
        this.f = fVar;
        c cVar = this.j;
        if (cVar == null) {
            cVar = new c(getContext());
            setAfterSlot(cVar);
        }
        FrameLayout frameLayout = cVar.b;
        VkUserStack vkUserStack = cVar.c;
        if (fVar != null) {
            frameLayout.setVisibility(0);
            if (vkUserStack != null) {
                vkUserStack.setAvatars(fVar.a);
            }
            if (vkUserStack != null) {
                vkUserStack.setCounter(fVar.b);
            }
            s3q0 s3q0Var = null;
            if (vkUserStack != null) {
                vkUserStack.setOnClickListener(fVar.c != null ? new vr6(fVar, 10) : null);
                s3q0Var = s3q0.a;
            }
            if (s3q0Var != null) {
                return;
            }
        }
        f4m.j(frameLayout);
    }

    /* compiled from: VkMiniInfoSexyCell.kt */
    public static final class c implements Slot<Object> {
        public final FrameLayout b;
        public final VkUserStack c;

        public c(Context context) {
            FrameLayout frameLayout = new FrameLayout(context);
            VkUserStack vkUserStack = new VkUserStack(context, null, 6);
            vkUserStack.setId(R.id.user_stack);
            frameLayout.addView(vkUserStack);
            f4m.j(frameLayout);
            this.b = frameLayout;
            this.c = (VkUserStack) frameLayout.findViewById(R.id.user_stack);
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final View getView() {
            return this.b;
        }

        @Override // xsna.too0
        public final void Ng() {
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final void Ad(Slot.Size size) {
        }
    }

    /* compiled from: VkMiniInfoSexyCell.kt */
    public static final class d implements Slot<Object> {
        public final ImageView b;

        public d(Context context) {
            this.b = new ImageView(context);
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final View getView() {
            return this.b;
        }

        @Override // xsna.too0
        public final void Ng() {
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final void Ad(Slot.Size size) {
        }
    }

    /* compiled from: VkMiniInfoSexyCell.kt */
    public static final class e implements Slot<Object> {
        public final View b;
        public VkMiniInfoCell.Mode c;
        public a d;
        public final TextView e;
        public final FrameLayout f;
        public VkLinkedText g;
        public VkExpandableText h;
        public final ImageView i;

        public e(Context context, g gVar) {
            View inflate = e3m.b(context).inflate(R.layout.ds_internal_mini_info_cell_middle_title, (ViewGroup) gVar, false);
            this.b = inflate;
            this.c = VkMiniInfoCell.Mode.Base;
            this.d = new b(new fy20(context, 2));
            this.e = (TextView) inflate.findViewById(R.id.mic_title);
            this.f = (FrameLayout) inflate.findViewById(R.id.mic_title_container);
            this.i = (ImageView) inflate.findViewById(R.id.mic_chevron);
        }

        public final Context a() {
            return getView().getContext();
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final View getView() {
            return this.b;
        }

        @Override // xsna.too0
        public final void Ng() {
        }

        @Override // com.vk.core.view.components.cell.slot.Slot
        public final void Ad(Slot.Size size) {
        }
    }
}
