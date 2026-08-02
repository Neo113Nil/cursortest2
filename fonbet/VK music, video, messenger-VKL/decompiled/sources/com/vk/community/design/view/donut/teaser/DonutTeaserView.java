package com.vk.community.design.view.donut.teaser;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.abg0;
import xsna.awt0;
import xsna.dhr0;
import xsna.epx;
import xsna.f4m;
import xsna.gzs;
import xsna.ho8;
import xsna.jtc0;
import xsna.s3q0;
import xsna.u11;
import xsna.uf3;
import xsna.v3o;

/* compiled from: DonutTeaserView.kt */
/* loaded from: classes17.dex */
public final class DonutTeaserView extends FrameLayout {
    public final VkImage b;
    public final VkText c;
    public final VkButton d;
    public final View e;
    public gzs<s3q0> f;
    public b g;
    public a h;

    /* compiled from: DonutTeaserView.kt */
    public interface a {

        /* compiled from: DonutTeaserView.kt */
        /* renamed from: com.vk.community.design.view.donut.teaser.DonutTeaserView$a$a, reason: collision with other inner class name */
        public static final class C0724a implements a {
            public final String a;

            public C0724a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0724a) && epx.f(this.a, ((C0724a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Text(text="), this.a, ')');
            }
        }

        /* compiled from: DonutTeaserView.kt */
        public static final class b implements a {
            public final String a;
            public final CharSequence b;
            public final gzs<s3q0> c;

            public b(String str, CharSequence charSequence, gzs<s3q0> gzsVar) {
                this.a = str;
                this.b = charSequence;
                this.c = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + u11.c(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TextWithButton(text=");
                sb.append(this.a);
                sb.append(", buttonText=");
                sb.append((Object) this.b);
                sb.append(", onButtonClick=");
                return uf3.d(sb, this.c, ')');
            }
        }
    }

    /* compiled from: DonutTeaserView.kt */
    public interface b {

        /* compiled from: DonutTeaserView.kt */
        public static final class a implements b {
            public final String a;
            public final jtc0 b;

            public a(String str, jtc0 jtc0Var) {
                this.a = str;
                this.b = jtc0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                jtc0 jtc0Var = this.b;
                return hashCode + (jtc0Var != null ? jtc0Var.hashCode() : 0);
            }

            public final String toString() {
                return "Image(imageUrl=" + this.a + ", postprocessor=" + this.b + ')';
            }
        }
    }

    public DonutTeaserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.pds_donut_teaser, (ViewGroup) this, true);
        VkImage vkImage = (VkImage) findViewById(R.id.donut_teaser_cover);
        this.b = vkImage;
        this.c = (VkText) findViewById(R.id.donut_teaser_text);
        VkButton vkButton = (VkButton) findViewById(R.id.donut_teaser_button);
        this.d = vkButton;
        this.e = findViewById(R.id.donut_teaser_content_container);
        setUpCover(vkImage);
        setUpButton(vkButton);
    }

    private final void setUpButton(VkButton vkButton) {
        vkButton.setOnClickListener(new v3o(this, 0));
    }

    private final void setUpCover(VkImage vkImage) {
        abg0 abg0Var = dhr0.t;
        int c = abg0Var.c(R.attr.vk_ui_image_placeholder);
        ColorDrawable colorDrawable = new ColorDrawable(abg0Var.c(R.attr.vk_ui_overlay_secondary));
        vkImage.setPlaceholderColor(c);
        vkImage.setOverlayImage(colorDrawable);
    }

    public final a getContent() {
        return this.h;
    }

    public final b getCover() {
        return this.g;
    }

    public final void setContent(a aVar) {
        this.h = aVar;
        awt0.v(this.e, aVar != null);
        VkText vkText = this.c;
        f4m.j(vkText);
        VkButton vkButton = this.d;
        f4m.j(vkButton);
        if (aVar instanceof a.C0724a) {
            vkText.setVisibility(0);
            vkText.setText(((a.C0724a) aVar).a);
        } else {
            if (!(aVar instanceof a.b)) {
                if (aVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            vkText.setVisibility(0);
            vkButton.setVisibility(0);
            a.b bVar = (a.b) aVar;
            vkText.setText(bVar.a);
            vkButton.setText(bVar.b);
            this.f = bVar.c;
        }
    }

    public final void setCover(b bVar) {
        this.g = bVar;
        VkImage vkImage = this.b;
        f4m.j(vkImage);
        if (!(bVar instanceof b.a)) {
            if (bVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            vkImage.setVisibility(0);
            b.a aVar = (b.a) bVar;
            vkImage.o0(aVar.a, null);
            vkImage.setVkPostprocessor(aVar.b);
        }
    }
}
