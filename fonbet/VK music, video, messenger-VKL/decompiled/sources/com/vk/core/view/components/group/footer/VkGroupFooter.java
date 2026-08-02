package com.vk.core.view.components.group.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cpy;
import xsna.e3m;
import xsna.f4m;
import xsna.gko;
import xsna.gpo0;
import xsna.hbh0;
import xsna.jq;
import xsna.tlo0;

/* compiled from: VkGroupFooter.kt */
/* loaded from: classes17.dex */
public final class VkGroupFooter extends FrameLayout {
    public a b;
    public VkText c;
    public VkText d;
    public VkSpinner e;
    public VkImageSimple f;

    /* compiled from: VkGroupFooter.kt */
    public interface a {

        /* compiled from: VkGroupFooter.kt */
        /* renamed from: com.vk.core.view.components.group.footer.VkGroupFooter$a$a, reason: collision with other inner class name */
        public static final class C0839a implements a {
            public final tlo0.h a;

            public C0839a(tlo0.h hVar) {
                this.a = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0839a) && this.a.equals(((C0839a) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return jq.c(new StringBuilder("GroupDescription(text="), this.a, ')');
            }
        }

        /* compiled from: VkGroupFooter.kt */
        public static final class b implements a {
            public final tlo0.h a;

            public b(tlo0.h hVar) {
                this.a = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return jq.c(new StringBuilder("ListFooter(text="), this.a, ')');
            }
        }
    }

    public VkGroupFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final void setGroupDescription(a.C0839a c0839a) {
        VkText vkText = this.c;
        if (vkText == null) {
            vkText = new VkText(getContext(), null, 6, 0);
            vkText.setId(R.id.ds_internal_group_footer_description);
            vkText.setTextAppearance(e3m.g(R.attr.vk_ui_typography_footnote, getContext()));
            vkText.setIncludeFontPadding(false);
            gpo0.i(vkText, R.attr.vk_ui_text_secondary);
            this.c = vkText;
            addView(vkText, cpy.a(-1, 0, e3m.a(R.dimen.vk_ui_base_padding_horizontal, getContext()), e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext()), e3m.a(R.dimen.vk_ui_spacing_size4_xl, getContext()), e3m.a(R.dimen.vk_ui_base_padding_horizontal, getContext()), 2));
        }
        vkText.setVisibility(0);
        vkText.setText(tlo0.b.a(c0839a.a, vkText.getContext()));
    }

    private final void setListFooter(a.b bVar) {
        VkText vkText = this.d;
        if (vkText == null) {
            vkText = new VkText(getContext(), null, 6, 0);
            vkText.setId(R.id.ds_internal_group_footer_list_footer_text);
            vkText.setTextAppearance(e3m.g(R.attr.vk_ui_typography_footnote, getContext()));
            vkText.setIncludeFontPadding(false);
            gpo0.i(vkText, R.attr.vk_ui_text_secondary);
            vkText.setGravity(17);
            this.d = vkText;
            addView(vkText, cpy.a(-1, 0, e3m.a(R.dimen.vk_ui_base_padding_horizontal, getContext()), e3m.a(R.dimen.vk_ui_spacing_size4_xl, getContext()), e3m.a(R.dimen.vk_ui_spacing_size4_xl, getContext()), e3m.a(R.dimen.vk_ui_base_padding_horizontal, getContext()), 2));
        }
        vkText.setVisibility(0);
        vkText.setText(tlo0.b.a(bVar.a, vkText.getContext()));
    }

    private final void setLoaderIcon(b bVar) {
        int b;
        VkImageSimple vkImageSimple = this.f;
        if (vkImageSimple == null) {
            vkImageSimple = new VkImageSimple(getContext(), null, 6, 0);
            vkImageSimple.setId(R.id.ds_internal_group_footer_loader_icon);
            this.f = vkImageSimple;
            FrameLayout.LayoutParams a2 = cpy.a(0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size4_xl, getContext()), e3m.a(R.dimen.vk_ui_spacing_size4_xl, getContext()), 0, 39);
            a2.gravity = 17;
            addView(vkImageSimple, a2);
        }
        vkImageSimple.setVisibility(0);
        gko gkoVar = bVar.a;
        vkImageSimple.setImageDrawable(gko.b(gkoVar.a, vkImageSimple.getContext()));
        gpo0.g(vkImageSimple, null);
        Context context = vkImageSimple.getContext();
        int i = com.vk.core.view.components.group.footer.a.$EnumSwitchMapping$0[bVar.b.ordinal()];
        if (i == 1) {
            b = hbh0.b(16, context);
        } else if (i == 2) {
            b = hbh0.b(24, context);
        } else if (i == 3) {
            b = hbh0.b(32, context);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            b = hbh0.b(44, context);
        }
        f4m.z(b, b, vkImageSimple);
    }

    private final void setLoaderSpinner(c cVar) {
        VkSpinner.SpinnerSize spinnerSize;
        VkSpinner vkSpinner = this.e;
        if (vkSpinner == null) {
            vkSpinner = new VkSpinner(getContext(), null, 6, 0);
            vkSpinner.setId(R.id.ds_internal_group_footer_loader_spinner);
            this.e = vkSpinner;
            FrameLayout.LayoutParams a2 = cpy.a(0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size4_xl, getContext()), e3m.a(R.dimen.vk_ui_spacing_size4_xl, getContext()), 0, 39);
            a2.gravity = 17;
            addView(vkSpinner, a2);
        }
        vkSpinner.setVisibility(0);
        int i = com.vk.core.view.components.group.footer.a.$EnumSwitchMapping$0[cVar.a.ordinal()];
        if (i == 1) {
            spinnerSize = VkSpinner.SpinnerSize.Size16;
        } else if (i == 2) {
            spinnerSize = VkSpinner.SpinnerSize.Size24;
        } else if (i == 3) {
            spinnerSize = VkSpinner.SpinnerSize.Size36;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            spinnerSize = VkSpinner.SpinnerSize.Size56;
        }
        vkSpinner.setSpinnerSize(spinnerSize);
    }

    public final a getContent() {
        return this.b;
    }

    public final void setContent(a aVar) {
        this.b = aVar;
        VkText vkText = this.c;
        if (vkText != null) {
            f4m.j(vkText);
        }
        VkText vkText2 = this.d;
        if (vkText2 != null) {
            f4m.j(vkText2);
        }
        VkSpinner vkSpinner = this.e;
        if (vkSpinner != null) {
            f4m.j(vkSpinner);
        }
        VkImageSimple vkImageSimple = this.f;
        if (vkImageSimple != null) {
            f4m.j(vkImageSimple);
        }
        if (aVar == null) {
            return;
        }
        if (aVar instanceof a.C0839a) {
            setGroupDescription((a.C0839a) aVar);
            return;
        }
        if (aVar instanceof a.b) {
            setListFooter((a.b) aVar);
        } else if (aVar instanceof c) {
            setLoaderSpinner((c) aVar);
        } else {
            if (!(aVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            setLoaderIcon((b) aVar);
        }
    }

    public VkGroupFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
