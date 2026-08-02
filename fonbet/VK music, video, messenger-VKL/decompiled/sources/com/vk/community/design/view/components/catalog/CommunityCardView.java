package com.vk.community.design.view.components.catalog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.c5g;
import xsna.dko;
import xsna.e3m;
import xsna.eko;
import xsna.epx;
import xsna.f4m;
import xsna.gzs;
import xsna.iah0;
import xsna.itj0;
import xsna.jjc;
import xsna.jq;
import xsna.s3q0;
import xsna.sf3;
import xsna.t1e;
import xsna.tlo0;
import xsna.uqi;
import xsna.zrp;

/* compiled from: CommunityCardView.kt */
/* loaded from: classes17.dex */
public final class CommunityCardView extends ConstraintLayout {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final VkSimpleButton D;
    public final ImageView E;
    public final ViewGroup F;
    public final ViewGroup G;
    public d t;
    public c u;
    public e v;
    public a w;
    public b x;
    public final VkImage y;
    public final VkUserStack z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityCardView.kt */
    public static final class ImageCornersRoundingStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageCornersRoundingStyle[] $VALUES;
        public static final ImageCornersRoundingStyle ALL;
        public static final ImageCornersRoundingStyle TOP;

        static {
            ImageCornersRoundingStyle imageCornersRoundingStyle = new ImageCornersRoundingStyle("ALL", 0);
            ALL = imageCornersRoundingStyle;
            ImageCornersRoundingStyle imageCornersRoundingStyle2 = new ImageCornersRoundingStyle("TOP", 1);
            TOP = imageCornersRoundingStyle2;
            ImageCornersRoundingStyle[] imageCornersRoundingStyleArr = {imageCornersRoundingStyle, imageCornersRoundingStyle2};
            $VALUES = imageCornersRoundingStyleArr;
            $ENTRIES = new asp(imageCornersRoundingStyleArr);
        }

        public ImageCornersRoundingStyle() {
            throw null;
        }

        public static ImageCornersRoundingStyle valueOf(String str) {
            return (ImageCornersRoundingStyle) Enum.valueOf(ImageCornersRoundingStyle.class, str);
        }

        public static ImageCornersRoundingStyle[] values() {
            return (ImageCornersRoundingStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: CommunityCardView.kt */
    public static final class a {
        public final tlo0.h a;
        public final gzs<s3q0> b;
        public final tlo0 c;
        public final VkButton.Size d;
        public final VkButton.Appearance e;
        public final VkButton.Mode f;
        public final Integer g;

        public a() {
            throw null;
        }

        public a(tlo0.h hVar, gzs gzsVar, tlo0.h hVar2, Integer num, int i) {
            hVar2 = (i & 4) != 0 ? hVar : hVar2;
            VkButton.Size size = VkButton.Size.Small;
            VkButton.Appearance appearance = VkButton.Appearance.Overlay;
            VkButton.Mode mode = VkButton.Mode.Primary;
            this.a = hVar;
            this.b = gzsVar;
            this.c = hVar2;
            this.d = size;
            this.e = appearance;
            this.f = mode;
            this.g = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.vk.movika.sdk.base.model.history.b.a(sf3.a(this.a.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31;
            Integer num = this.g;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionButton(text=");
            sb.append(this.a);
            sb.append(", onClick=");
            sb.append(this.b);
            sb.append(", contentDescription=");
            sb.append(this.c);
            sb.append(", buttonSize=");
            sb.append(this.d);
            sb.append(", buttonAppearance=");
            sb.append(this.e);
            sb.append(", buttonMode=");
            sb.append(this.f);
            sb.append(", textTintColorRes=");
            return uqi.b(sb, this.g, ')');
        }
    }

    /* compiled from: CommunityCardView.kt */
    public static final class b {
        public final String a;
        public final ImageCornersRoundingStyle b;

        public b(String str) {
            ImageCornersRoundingStyle imageCornersRoundingStyle = ImageCornersRoundingStyle.TOP;
            this.a = str;
            this.b = imageCornersRoundingStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CardImage(imageUrl=" + this.a + ", cornersStyle=" + this.b + ')';
        }
    }

    /* compiled from: CommunityCardView.kt */
    public static final class c {
        public final tlo0.h a;

        public c(tlo0.h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }

        public final String toString() {
            return jq.c(new StringBuilder("Subtitle(text="), this.a, ')');
        }
    }

    /* compiled from: CommunityCardView.kt */
    public static final class d {
        public final tlo0.h a;
        public final dko b;

        public d(tlo0.h hVar, eko ekoVar) {
            this.a = hVar;
            this.b = ekoVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.a.hashCode() * 31;
            dko dkoVar = this.b;
            return hashCode + (dkoVar == null ? 0 : dkoVar.hashCode());
        }

        public final String toString() {
            return "Title(text=" + this.a + ", icon=" + this.b + ')';
        }
    }

    /* compiled from: CommunityCardView.kt */
    public static final class e {
        public final List<String> a;
        public final tlo0.h b;

        public e(List list, tlo0.h hVar) {
            this.a = list;
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b.equals(eVar.b);
        }

        public final int hashCode() {
            List<String> list = this.a;
            return this.b.a.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserStackBadge(userAvatarsUrls=");
            sb.append(this.a);
            sb.append(", text=");
            return jq.c(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityCardView.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCornersRoundingStyle.values().length];
            try {
                iArr[ImageCornersRoundingStyle.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCornersRoundingStyle.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommunityCardView(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.pds_community_card, this);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setId(R.id.card_container);
        setBackgroundResource(R.drawable.bg_community_recommendations_card);
        this.y = (VkImage) findViewById(R.id.card_image);
        this.z = (VkUserStack) findViewById(R.id.badge_user_stack);
        this.A = (TextView) findViewById(R.id.badge_text);
        this.B = (TextView) findViewById(R.id.title);
        this.C = (TextView) findViewById(R.id.subtitle);
        this.D = (VkSimpleButton) findViewById(R.id.action_button);
        this.E = (ImageView) findViewById(R.id.title_icon);
        this.F = (ViewGroup) findViewById(R.id.title_container);
        this.G = (ViewGroup) findViewById(R.id.badge_container);
    }

    public final boolean P4(int i) {
        return this.D.performHapticFeedback(i);
    }

    public final a getActionButton() {
        return this.w;
    }

    public final View getAnchorView() {
        return this.D;
    }

    public final b getCardImage() {
        return this.x;
    }

    public final c getSubtitle() {
        return this.u;
    }

    public final d getTitle() {
        return this.t;
    }

    public final e getUserStackBadge() {
        return this.v;
    }

    public final void setActionButton(a aVar) {
        this.w = aVar;
        boolean z = aVar != null;
        VkSimpleButton vkSimpleButton = this.D;
        bwt0.p0(vkSimpleButton, z);
        if (aVar == null) {
            return;
        }
        Integer num = aVar.g;
        if (num == null) {
            vkSimpleButton.setTextColorful(true);
        } else {
            vkSimpleButton.setTextTint(num.intValue());
        }
        jjc.g(vkSimpleButton, new t1e(aVar, 5));
        vkSimpleButton.setContentDescription(aVar.c.a(getContext()));
        vkSimpleButton.setSize(aVar.d);
        vkSimpleButton.setAppearance(aVar.e);
        vkSimpleButton.setMode(aVar.f);
        tlo0.h hVar = aVar.a;
        Context context = getContext();
        hVar.getClass();
        vkSimpleButton.setText(tlo0.b.a(hVar, context));
    }

    public final void setCardImage(b bVar) {
        float b2;
        String str;
        this.x = bVar;
        float b3 = iah0.b(12.0f);
        ImageCornersRoundingStyle imageCornersRoundingStyle = bVar != null ? bVar.b : null;
        int i = imageCornersRoundingStyle == null ? -1 : f.$EnumSwitchMapping$0[imageCornersRoundingStyle.ordinal()];
        if (i == -1) {
            b2 = iah0.b(2.0f);
        } else if (i == 1) {
            b2 = b3;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = iah0.b(2.0f);
        }
        VkImage vkImage = this.y;
        vkImage.z0(b3, b3, b2, b2);
        vkImage.y0(iah0.b(0.5f), e3m.f(R.attr.vk_ui_image_border_alpha, getContext()));
        vkImage.setPaintFilterBitmap(true);
        vkImage.setPlaceholderColor(e3m.f(R.attr.vk_ui_image_placeholder, getContext()));
        if (bVar == null || (str = bVar.a) == null) {
            return;
        }
        vkImage.o0(str, null);
    }

    public final void setSubtitle(c cVar) {
        this.u = cVar;
        boolean z = cVar != null;
        TextView textView = this.C;
        bwt0.p0(textView, z);
        textView.setText(cVar != null ? tlo0.b.a(cVar.a, getContext()) : null);
    }

    public final void setTitle(d dVar) {
        dko dkoVar;
        this.t = dVar;
        Drawable drawable = null;
        this.B.setText(dVar != null ? tlo0.b.a(dVar.a, getContext()) : null);
        boolean z = (dVar != null ? dVar.b : null) != null;
        ImageView imageView = this.E;
        bwt0.p0(imageView, z);
        if (dVar != null && (dkoVar = dVar.b) != null) {
            drawable = dkoVar.a(getContext());
        }
        imageView.setImageDrawable(drawable);
        f4m.w(e3m.a(bwt0.K(imageView) ? R.dimen.vk_ui_spacing_size_s : R.dimen.vk_ui_spacing_size_xl, getContext()), this.F);
    }

    public final void setUserStackBadge(e eVar) {
        this.v = eVar;
        bwt0.p0(this.G, eVar != null);
        if (eVar == null) {
            return;
        }
        List<String> list = eVar.a;
        List<String> list2 = list;
        VkUserStack vkUserStack = this.z;
        TextView textView = this.A;
        if (list2 == null || list2.isEmpty()) {
            f4m.s(iah0.a(8), textView);
            f4m.j(vkUserStack);
        } else {
            f4m.s(iah0.a(4), textView);
            vkUserStack.setVisibility(0);
            List<String> list3 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                itj0.d((String) it.next(), arrayList);
            }
            vkUserStack.setAvatars(arrayList);
        }
        textView.setText(tlo0.b.a(eVar.b, getContext()));
    }
}
