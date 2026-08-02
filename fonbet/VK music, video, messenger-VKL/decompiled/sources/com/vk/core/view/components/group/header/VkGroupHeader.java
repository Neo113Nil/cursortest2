package com.vk.core.view.components.group.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.GapLinearLayout;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.core.view.components.group.header.a;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bt;
import xsna.cut0;
import xsna.e3m;
import xsna.epx;
import xsna.ey2;
import xsna.f4m;
import xsna.gko;
import xsna.gpo0;
import xsna.gzs;
import xsna.hxu0;
import xsna.jq;
import xsna.krv0;
import xsna.msy;
import xsna.oq;
import xsna.rqs0;
import xsna.s3q0;
import xsna.sf3;
import xsna.sgt0;
import xsna.shy;
import xsna.tlo0;
import xsna.tn;
import xsna.too0;
import xsna.u11;
import xsna.uf3;
import xsna.uyq0;
import xsna.x1z;
import xsna.x7g;
import xsna.yqd0;
import xsna.zrp;

/* compiled from: VkGroupHeader.kt */
/* loaded from: classes17.dex */
public class VkGroupHeader extends FrameLayout implements too0 {
    public final VkDivider A;
    public Size b;
    public d c;
    public c d;
    public a e;
    public Right f;
    public boolean g;
    public ViewGroup h;
    public final ConstraintLayout i;
    public final ViewGroup j;
    public final ImageView k;
    public final TextView l;
    public final VkFadeText m;
    public final TextView n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final VkCounter r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final VkContentBadge v;
    public final GapLinearLayout w;
    public final ImageView x;
    public final b y;
    public final ImageView z;

    /* compiled from: VkGroupHeader.kt */
    public static final class Right {
        public final ExtraContent a;
        public final b b;
        public final a c;

        /* compiled from: VkGroupHeader.kt */
        public interface a {

            /* compiled from: VkGroupHeader.kt */
            /* renamed from: com.vk.core.view.components.group.header.VkGroupHeader$Right$a$a, reason: collision with other inner class name */
            public static final class C0841a implements a {
                public final gzs<s3q0> a;
                public final tlo0 b;

                public C0841a() {
                    this(3, (gzs) null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0841a)) {
                        return false;
                    }
                    C0841a c0841a = (C0841a) obj;
                    return epx.f(this.a, c0841a.a) && epx.f(this.b, c0841a.b);
                }

                public final int hashCode() {
                    gzs<s3q0> gzsVar = this.a;
                    int hashCode = (gzsVar == null ? 0 : gzsVar.hashCode()) * 31;
                    tlo0 tlo0Var = this.b;
                    return hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Chevron(onClick=");
                    sb.append(this.a);
                    sb.append(", contentDescription=");
                    return bt.a(sb, this.b, ')');
                }

                public /* synthetic */ C0841a(int i, gzs gzsVar) {
                    this((gzs<s3q0>) ((i & 1) != 0 ? null : gzsVar), (tlo0) null);
                }

                public C0841a(gzs<s3q0> gzsVar, tlo0 tlo0Var) {
                    this.a = gzsVar;
                    this.b = tlo0Var;
                }
            }

            /* compiled from: VkGroupHeader.kt */
            public static final class b implements a {
                public final gzs<s3q0> a;
                public final tlo0 b;

                public b() {
                    this(3, (gzs) null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                }

                public final int hashCode() {
                    gzs<s3q0> gzsVar = this.a;
                    int hashCode = (gzsVar == null ? 0 : gzsVar.hashCode()) * 31;
                    tlo0 tlo0Var = this.b;
                    return hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Dismiss(onClick=");
                    sb.append(this.a);
                    sb.append(", contentDescription=");
                    return bt.a(sb, this.b, ')');
                }

                public /* synthetic */ b(int i, gzs gzsVar) {
                    this((gzs<s3q0>) ((i & 1) != 0 ? null : gzsVar), (tlo0) null);
                }

                public b(gzs<s3q0> gzsVar, tlo0 tlo0Var) {
                    this.a = gzsVar;
                    this.b = tlo0Var;
                }

                public b(gzs<s3q0> gzsVar, String str) {
                    this(gzsVar, oq.d(tlo0.Companion, str));
                }
            }
        }

        /* compiled from: VkGroupHeader.kt */
        public static final class b {
            public final gko a;
            public final cut0 b;
            public final tlo0 c;
            public final gzs<s3q0> d;

            public /* synthetic */ b(gko gkoVar, x7g x7gVar, gzs gzsVar, int i) {
                this(gkoVar, (i & 2) != 0 ? null : x7gVar, (tlo0) null, gzsVar);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a.a) * 31;
                cut0 cut0Var = this.b;
                int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
                tlo0 tlo0Var = this.c;
                int hashCode3 = (hashCode2 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
                gzs<s3q0> gzsVar = this.d;
                return hashCode3 + (gzsVar != null ? gzsVar.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("IconButton(icon=");
                sb.append(this.a);
                sb.append(", iconTint=");
                sb.append(this.b);
                sb.append(", iconDescription=");
                sb.append(this.c);
                sb.append(", onClick=");
                return uf3.d(sb, this.d, ')');
            }

            public b(gko gkoVar, cut0 cut0Var, tlo0 tlo0Var, gzs gzsVar) {
                this.a = gkoVar;
                this.b = cut0Var;
                this.c = tlo0Var;
                this.d = gzsVar;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Right() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Right)) {
                return false;
            }
            Right right = (Right) obj;
            return epx.f(this.a, right.a) && epx.f(this.b, right.b) && epx.f(this.c, right.c);
        }

        public final int hashCode() {
            ExtraContent extraContent = this.a;
            int hashCode = (extraContent == null ? 0 : extraContent.hashCode()) * 31;
            b bVar = this.b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            a aVar = this.c;
            return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "Right(extraContent=" + this.a + ", iconButton=" + this.b + ", circleButton=" + this.c + ')';
        }

        public Right(ExtraContent extraContent, b bVar, a aVar) {
            this.a = extraContent;
            this.b = bVar;
            this.c = aVar;
        }

        public /* synthetic */ Right(ExtraContent extraContent, b bVar, a aVar, int i) {
            this((i & 1) != 0 ? null : extraContent, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : aVar);
        }

        /* compiled from: VkGroupHeader.kt */
        public interface ExtraContent {

            /* compiled from: VkGroupHeader.kt */
            public static final class Dropdown implements ExtraContent {
                public final tlo0.h a;
                public final gzs<s3q0> b;
                public final Appearance c;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: VkGroupHeader.kt */
                public static final class Appearance {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Appearance[] $VALUES;
                    public static final Appearance Accent;
                    public static final Appearance Neutral;

                    static {
                        Appearance appearance = new Appearance("Accent", 0);
                        Accent = appearance;
                        Appearance appearance2 = new Appearance("Neutral", 1);
                        Neutral = appearance2;
                        Appearance[] appearanceArr = {appearance, appearance2};
                        $VALUES = appearanceArr;
                        $ENTRIES = new asp(appearanceArr);
                    }

                    public Appearance() {
                        throw null;
                    }

                    public static Appearance valueOf(String str) {
                        return (Appearance) Enum.valueOf(Appearance.class, str);
                    }

                    public static Appearance[] values() {
                        return (Appearance[]) $VALUES.clone();
                    }
                }

                public Dropdown() {
                    throw null;
                }

                public Dropdown(String str, gzs<s3q0> gzsVar) {
                    tlo0.h d = oq.d(tlo0.Companion, str);
                    Appearance appearance = Appearance.Neutral;
                    this.a = d;
                    this.b = gzsVar;
                    this.c = appearance;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Dropdown)) {
                        return false;
                    }
                    Dropdown dropdown = (Dropdown) obj;
                    return epx.f(this.a, dropdown.a) && epx.f(this.b, dropdown.b) && this.c == dropdown.c;
                }

                public final int hashCode() {
                    return this.c.hashCode() + sf3.a(this.a.a.hashCode() * 31, 31, this.b);
                }

                public final String toString() {
                    return "Dropdown(text=" + this.a + ", onClick=" + this.b + ", appearance=" + this.c + ')';
                }
            }

            /* compiled from: VkGroupHeader.kt */
            public static final class b implements ExtraContent {
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
                    return jq.c(new StringBuilder("Detail(text="), this.a, ')');
                }
            }

            /* compiled from: VkGroupHeader.kt */
            public static final class c implements ExtraContent {
                public final gzs<s3q0> a;
                public final tlo0 b;

                public c() {
                    this(3, (gzs) null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
                }

                public final int hashCode() {
                    gzs<s3q0> gzsVar = this.a;
                    int hashCode = (gzsVar == null ? 0 : gzsVar.hashCode()) * 31;
                    tlo0 tlo0Var = this.b;
                    return hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("More(onClick=");
                    sb.append(this.a);
                    sb.append(", contentDescription=");
                    return bt.a(sb, this.b, ')');
                }

                public /* synthetic */ c(int i, gzs gzsVar) {
                    this((i & 1) != 0 ? null : gzsVar, (tlo0.f) null);
                }

                public c(gzs gzsVar, tlo0.f fVar) {
                    this.a = gzsVar;
                    this.b = fVar;
                }
            }

            /* compiled from: VkGroupHeader.kt */
            public static final class a implements ExtraContent {
                public final tlo0 a;
                public final gzs<s3q0> b;
                public final VkButton.Size c;
                public final VkButton.Mode d;
                public final VkButton.Appearance e;
                public final C0840a f;

                /* compiled from: VkGroupHeader.kt */
                /* renamed from: com.vk.core.view.components.group.header.VkGroupHeader$Right$ExtraContent$a$a, reason: collision with other inner class name */
                public static final class C0840a {
                    public final gko a;
                    public final Integer b;
                    public final x7g c;

                    public C0840a(gko gkoVar, Integer num, x7g x7gVar) {
                        this.a = gkoVar;
                        this.b = num;
                        this.c = x7gVar;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0840a)) {
                            return false;
                        }
                        C0840a c0840a = (C0840a) obj;
                        return this.a.equals(c0840a.a) && this.b.equals(c0840a.b) && this.c.equals(c0840a.c);
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.c.a) + ((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31);
                    }

                    public final String toString() {
                        return "Icon(icon=" + this.a + ", iconSize=" + this.b + ", iconTint=" + this.c + ')';
                    }
                }

                public a() {
                    throw null;
                }

                public a(tlo0 tlo0Var, gzs gzsVar, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, C0840a c0840a, int i) {
                    size = (i & 4) != 0 ? VkButton.Size.Medium : size;
                    mode = (i & 8) != 0 ? VkButton.Mode.Link : mode;
                    appearance = (i & 16) != 0 ? null : appearance;
                    c0840a = (i & 32) != 0 ? null : c0840a;
                    this.a = tlo0Var;
                    this.b = gzsVar;
                    this.c = size;
                    this.d = mode;
                    this.e = appearance;
                    this.f = c0840a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
                }

                public final int hashCode() {
                    int hashCode = (this.d.hashCode() + ((this.c.hashCode() + sf3.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
                    VkButton.Appearance appearance = this.e;
                    int hashCode2 = (hashCode + (appearance == null ? 0 : appearance.hashCode())) * 31;
                    C0840a c0840a = this.f;
                    return (hashCode2 + (c0840a != null ? c0840a.hashCode() : 0)) * 29791;
                }

                public final String toString() {
                    return "Button(text=" + this.a + ", onClick=" + this.b + ", buttonSize=" + this.c + ", buttonMode=" + this.d + ", buttonAppearance=" + this.e + ", icon=" + this.f + ", trailingIcon=null, count=null, onClickLabel=null)";
                }

                public a(String str, gzs<s3q0> gzsVar) {
                    this(oq.d(tlo0.Companion, str), gzsVar, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkGroupHeader.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size ExtraLarge;
        public static final Size Large;
        public static final Size Medium;
        public static final Size Small;

        static {
            Size size = new Size("ExtraLarge", 0);
            ExtraLarge = size;
            Size size2 = new Size("Large", 1);
            Large = size2;
            Size size3 = new Size("Medium", 2);
            Medium = size3;
            Size size4 = new Size("Small", 3);
            Small = size4;
            Size[] sizeArr = {size, size2, size3, size4};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: VkGroupHeader.kt */
    public interface a {

        /* compiled from: VkGroupHeader.kt */
        /* renamed from: com.vk.core.view.components.group.header.VkGroupHeader$a$a, reason: collision with other inner class name */
        public static final class C0842a implements a {
            public final gko a;
            public final cut0 b;

            public C0842a(gko gkoVar, x7g x7gVar, int i) {
                x7gVar = (i & 2) != 0 ? null : x7gVar;
                this.a = gkoVar;
                this.b = x7gVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0842a)) {
                    return false;
                }
                C0842a c0842a = (C0842a) obj;
                return this.a.equals(c0842a.a) && epx.f(this.b, c0842a.b);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a.a) * 31;
                cut0 cut0Var = this.b;
                return (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconDescription=null)";
            }
        }
    }

    /* compiled from: VkGroupHeader.kt */
    public static final class b {
        public final ViewGroup a;
        public final Context b;
        public final Object c;
        public final Object d;
        public final Object e;
        public final Object f;

        public b(ViewGroup viewGroup) {
            this.a = viewGroup;
            this.b = viewGroup.getContext();
            Size size = Size.ExtraLarge;
            yqd0 yqd0Var = new yqd0(this, 23);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.c = msy.a(lazyThreadSafetyMode, yqd0Var);
            this.d = msy.a(lazyThreadSafetyMode, new uyq0(this, 9));
            this.e = msy.a(lazyThreadSafetyMode, new rqs0(this, 6));
            this.f = msy.a(lazyThreadSafetyMode, new sgt0(this, 5));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
        public final void a(Right.ExtraContent extraContent) {
            ImageView imageView;
            ViewGroup viewGroup = this.a;
            if (extraContent == null) {
                viewGroup.removeAllViews();
                f4m.j(viewGroup);
                return;
            }
            viewGroup.setVisibility(0);
            View childAt = viewGroup.getChildAt(0);
            if (extraContent instanceof Right.ExtraContent.a) {
                Right.ExtraContent.a aVar = (Right.ExtraContent.a) extraContent;
                VkButton vkButton = (VkButton) this.c.getValue();
                vkButton.setText(aVar.a.a(vkButton.getContext()));
                hxu0.a(vkButton, aVar.b, false);
                Right.ExtraContent.a.C0840a c0840a = aVar.f;
                if (c0840a != null) {
                    Drawable b = gko.b(c0840a.a.a, vkButton.getContext());
                    if (b != null) {
                        vkButton.Z4(b, false);
                    }
                    vkButton.setIconTint(cut0.a.b(c0840a.c, vkButton.getContext()));
                    vkButton.setIconSize(Integer.valueOf(c0840a.b.intValue()));
                }
                vkButton.setSize(aVar.c);
                vkButton.setMode(aVar.d);
                VkButton.Appearance appearance = aVar.e;
                if (appearance == null) {
                    appearance = VkButton.Appearance.Neutral;
                }
                vkButton.setAppearance(appearance);
                vkButton.setCount(null);
                vkButton.setContentDescription(null);
                imageView = vkButton;
            } else if (extraContent instanceof Right.ExtraContent.b) {
                TextView textView = (TextView) this.d.getValue();
                int a = e3m.a(R.dimen.vk_ui_spacing_size_m, textView.getContext());
                ey2.h(textView, ((Right.ExtraContent.b) extraContent).a);
                textView.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text, textView.getContext()));
                gpo0.i(textView, R.attr.vk_ui_text_secondary);
                textView.setPadding(textView.getPaddingLeft(), a, textView.getPaddingRight(), a);
                imageView = textView;
            } else if (extraContent instanceof Right.ExtraContent.Dropdown) {
                Right.ExtraContent.Dropdown dropdown = (Right.ExtraContent.Dropdown) extraContent;
                VkButton vkButton2 = (VkButton) this.e.getValue();
                tlo0.h hVar = dropdown.a;
                Context context = vkButton2.getContext();
                hVar.getClass();
                vkButton2.setText(tlo0.b.a(hVar, context));
                hxu0.a(vkButton2, dropdown.b, false);
                vkButton2.d5(Integer.valueOf(R.drawable.vk_icon_dropdown_outline_16));
                vkButton2.setIconTint(R.attr.vk_ui_icon_secondary);
                vkButton2.setSize(VkButton.Size.Small);
                vkButton2.setMode(VkButton.Mode.Link);
                vkButton2.setAppearance(VkButton.Appearance.Neutral);
                imageView = vkButton2;
            } else {
                if (!(extraContent instanceof Right.ExtraContent.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                Right.ExtraContent.c cVar = (Right.ExtraContent.c) extraContent;
                ImageView imageView2 = (ImageView) this.f.getValue();
                imageView2.getContext();
                imageView2.setImageResource(R.drawable.vk_icon_more_vertical_24);
                gpo0.f(imageView2, Integer.valueOf(R.attr.vk_ui_icon_secondary));
                tlo0 tlo0Var = cVar.b;
                imageView2.setContentDescription(tlo0Var != null ? tlo0Var.a(imageView2.getContext()) : null);
                hxu0.a(imageView2, cVar.a, false);
                imageView2.setBackgroundResource(R.drawable.vk_highlight_unbounded);
                imageView = imageView2;
            }
            if (imageView.equals(childAt)) {
                return;
            }
            viewGroup.removeAllViews();
            if (childAt != null && childAt.hasOnClickListeners()) {
                hxu0.a(childAt, null, false);
            }
            viewGroup.addView(imageView);
        }
    }

    public VkGroupHeader(Context context) {
        this(context, null, 6);
    }

    @Override // xsna.too0
    public final void Ng() {
        d();
        h();
        b();
        g();
        f();
        e();
        c();
    }

    public final void a() {
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        int a3 = e3m.a(R.dimen.vk_ui_spacing_size_s, getContext());
        e3m.a(R.dimen.vk_ui_spacing_size_m, getContext());
        getContext();
        int[] iArr = {R.id.ds_internal_group_header_title, R.id.ds_internal_group_header_title_icon, R.id.ds_internal_group_header_counter, R.id.ds_internal_group_header_number, R.id.ds_internal_group_header_title_badge};
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        ConstraintLayout constraintLayout = this.i;
        bVar.i(constraintLayout);
        bVar.s(R.id.ds_internal_group_header_left_layout, 7, R.id.ds_internal_group_header_right_layout, 6, iArr);
        bVar.G(R.id.ds_internal_group_header_title_icon, 6, a2);
        bVar.G(R.id.ds_internal_group_header_counter, 6, a2);
        bVar.G(R.id.ds_internal_group_header_number, 6, a3);
        bVar.G(R.id.ds_internal_group_header_title_secondary_separator, 6, a2);
        bVar.G(R.id.ds_internal_group_header_title_secondary_text, 6, a2);
        getContext();
        bVar.G(R.id.ds_internal_group_header_title_badge, 6, a2);
        bVar.b(constraintLayout);
    }

    public final void b() {
        a aVar = this.e;
        boolean z = aVar instanceof a.C0842a;
        ViewGroup viewGroup = this.j;
        ImageView imageView = this.k;
        if (z) {
            imageView.setVisibility(0);
            viewGroup.setVisibility(0);
            a.C0842a c0842a = (a.C0842a) aVar;
            gpo0.g(imageView, c0842a.b);
            imageView.setImageDrawable(gko.b(c0842a.a.a, getContext()));
            imageView.setContentDescription(null);
        } else {
            f4m.j(imageView);
            f4m.j(viewGroup);
            imageView.setImageDrawable(null);
            imageView.setContentDescription(null);
        }
        View view = this.h;
        if (view == null) {
            view = this.l;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMarginStart(viewGroup.getVisibility() == 0 ? e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext()) : 0);
        view.setLayoutParams(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        s3q0 s3q0Var;
        Right right = this.f;
        b bVar = this.y;
        GapLinearLayout gapLinearLayout = this.w;
        if (right == null) {
            f4m.j(gapLinearLayout);
            bVar.a(null);
            return;
        }
        gapLinearLayout.setVisibility(0);
        gapLinearLayout.setGap(e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext()));
        ViewGroup.LayoutParams layoutParams = gapLinearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
        bVar2.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext()));
        gapLinearLayout.setLayoutParams(bVar2);
        Right.b bVar3 = right.b;
        ImageView imageView = this.x;
        if (bVar3 != null) {
            imageView.setVisibility(0);
            gpo0.g(imageView, bVar3.b);
            hxu0.a(imageView, bVar3.d, true);
            tlo0 tlo0Var = bVar3.c;
            imageView.setContentDescription(tlo0Var != null ? tlo0Var.a(getContext()) : null);
            Drawable b2 = gko.b(bVar3.a.a, getContext());
            if (b2 != null) {
                imageView.setImageDrawable(b2);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
        }
        f4m.j(imageView);
        Right.a aVar = right.c;
        ImageView imageView2 = this.z;
        if (aVar != null) {
            getContext();
            imageView2.setVisibility(0);
            getContext();
            gpo0.f(imageView2, Integer.valueOf(R.attr.vk_ui_icon_medium));
            f4m.z(-2, -2, imageView2);
            if (aVar instanceof Right.a.C0841a) {
                Right.a.C0841a c0841a = (Right.a.C0841a) aVar;
                hxu0.a(imageView2, c0841a.a, true);
                tlo0 tlo0Var2 = c0841a.b;
                imageView2.setContentDescription(tlo0Var2 != null ? tlo0Var2.a(getContext()) : null);
                getContext();
                imageView2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                getContext();
                LinkedHashMap linkedHashMap = x1z.a;
                imageView2.getContext();
                imageView2.setImageResource(R.drawable.vk_icon_chevron_right_circle_28);
            } else {
                if (!(aVar instanceof Right.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Right.a.b bVar4 = (Right.a.b) aVar;
                hxu0.a(imageView2, bVar4.a, true);
                tlo0 tlo0Var3 = bVar4.b;
                imageView2.setContentDescription(tlo0Var3 != null ? tlo0Var3.a(getContext()) : null);
                getContext();
                imageView2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Context context = getContext();
                getContext();
                imageView2.setImageDrawable(krv0.e(R.drawable.vk_icon_dismiss_28, context));
            }
        } else {
            f4m.j(imageView2);
        }
        bVar.a(right.a);
    }

    public final void d() {
        VkCounter.Size size;
        TextView textView = this.l;
        textView.setAllCaps(false);
        textView.setTextAppearance(com.vk.core.view.components.group.header.a.b(getContext(), this.b));
        getContext();
        gpo0.i(textView, com.vk.core.view.components.group.header.a.a(this.b));
        VkFadeText vkFadeText = this.m;
        vkFadeText.setAllCaps(false);
        vkFadeText.setTextAppearance(com.vk.core.view.components.group.header.a.b(getContext(), this.b));
        getContext();
        gpo0.i(vkFadeText, com.vk.core.view.components.group.header.a.a(this.b));
        Context context = getContext();
        Size size2 = this.b;
        int[] iArr = a.C0845a.$EnumSwitchMapping$0;
        int i = iArr[size2.ordinal()];
        int i2 = R.attr.vk_ui_typography_subhead;
        if (i != 1 && i != 2) {
            i2 = R.attr.vk_ui_typography_caption1;
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.n.setTextAppearance(e3m.g(i2, context));
        Context context2 = getContext();
        int i3 = iArr[this.b.ordinal()];
        if (i3 == 1) {
            size = VkCounter.Size.Large;
        } else if (i3 == 2) {
            size = VkCounter.Size.Large;
        } else if (i3 == 3) {
            size = VkCounter.Size.Medium;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            size = VkCounter.Size.Small;
        }
        this.s.setTextAppearance(com.vk.core.view.components.counter.a.e(context2, VkCounter.Mode.Tertiary, size));
        f();
        this.y.getClass();
        if (this.f != null) {
            c();
        }
    }

    public final void e() {
        c cVar = this.d;
        int i = 0;
        ImageView imageView = this.q;
        ImageView imageView2 = this.p;
        TextView textView = this.n;
        if (cVar == null) {
            f4m.j(textView);
            f4m.j(imageView2);
            f4m.j(imageView);
        } else {
            textView.setVisibility(0);
            ey2.h(textView, cVar.a);
            textView.setMaxLines(cVar.d);
            i(cVar.b, imageView2);
            i(cVar.c, imageView);
        }
        View view = this.h;
        if (view == null) {
            view = this.l;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        if (textView.getVisibility() == 0) {
            getContext();
        } else {
            i = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        }
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i;
        view.setLayoutParams(bVar);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        textView.setLayoutParams(bVar2);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), e3m.a(R.dimen.vk_ui_spacing_size_s, getContext()));
    }

    public final void f() {
        f4m.j(this.t);
        f4m.j(this.u);
        a();
    }

    public final void g() {
        d dVar = this.c;
        getContext();
        d.a aVar = dVar.f;
        int i = dVar.e;
        TextView textView = this.l;
        textView.setMaxLines(i);
        ey2.h(textView, dVar.a);
        getContext();
        this.m.setVisibility(4);
        textView.setVisibility(0);
        getContext();
        com.vk.core.view.components.group.header.d dVar2 = dVar.b;
        ImageView imageView = this.o;
        if (dVar2 != null) {
            imageView.setVisibility(0);
            gko gkoVar = dVar2.a;
            imageView.setImageDrawable(gko.b(gkoVar.a, getContext()));
            gpo0.g(imageView, dVar2.b);
            imageView.setContentDescription(null);
        } else {
            f4m.j(imageView);
        }
        com.vk.core.view.components.group.header.c cVar = dVar.c;
        TextView textView2 = this.s;
        VkCounter vkCounter = this.r;
        if (cVar != null) {
            int i2 = cVar.a;
            vkCounter.setMode(cVar.c);
            vkCounter.setSize(cVar.d);
            VkCounter.CounterAppearance counterAppearance = cVar.b;
            if (counterAppearance == null) {
                counterAppearance = VkCounter.CounterAppearance.Appearance.AccentRed;
            }
            vkCounter.setAppearance(counterAppearance);
            if (vkCounter.getVisibility() == 0) {
                vkCounter.setCounterWithAnimation(i2);
            } else {
                vkCounter.setCounterWithoutAnimation(i2);
                vkCounter.setVisibility(0);
            }
            f4m.j(textView2);
        } else {
            e eVar = dVar.d;
            if (eVar != null) {
                textView2.setText(eVar.a);
                textView2.setVisibility(0);
                f4m.j(vkCounter);
            } else {
                f4m.j(vkCounter);
                f4m.j(textView2);
            }
        }
        f4m.j(this.v);
        a();
    }

    public final ViewGroup getHighlighter() {
        return this.h;
    }

    @Override // android.view.View
    public final a getLeft() {
        return this.e;
    }

    @Override // android.view.View
    public final Right getRight() {
        return this.f;
    }

    public final boolean getShowTopDivider() {
        return this.g;
    }

    public final Size getSize() {
        return this.b;
    }

    public final c getSubtitle() {
        return this.d;
    }

    public final d getTitle() {
        return this.c;
    }

    public final d.b getTitleSecondary() {
        return null;
    }

    public final void h() {
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_s, getContext());
        VkDivider.Alignment alignment = VkDivider.Alignment.Top;
        VkDivider vkDivider = this.A;
        vkDivider.setAlignment(alignment);
        f4m.D(vkDivider, this.g);
        f4m.k(a2, vkDivider);
        vkDivider.setDividerHeight(getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_border2x));
        ConstraintLayout constraintLayout = this.i;
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), a2, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
    }

    public final void i(c.a aVar, ImageView imageView) {
        if (!(aVar instanceof c.a.C0843a)) {
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setImageDrawable(null);
            f4m.j(imageView);
            return;
        }
        imageView.setVisibility(0);
        c.a.C0843a c0843a = (c.a.C0843a) aVar;
        gko gkoVar = c0843a.a;
        imageView.setImageDrawable(gko.b(gkoVar.a, getContext()));
        gpo0.g(imageView, c0843a.b);
        imageView.setContentDescription(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.ViewGroup] */
    public final void setHighlighter(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.h;
        this.h = viewGroup;
        if (epx.f(viewGroup2, viewGroup)) {
            return;
        }
        ?? r1 = this.l;
        if (viewGroup2 == null || viewGroup == null) {
            if (viewGroup != null) {
                viewGroup2 = r1;
            } else if (viewGroup2 == null) {
                return;
            } else {
                viewGroup = r1;
            }
        }
        ConstraintLayout constraintLayout = this.i;
        int indexOfChild = constraintLayout.indexOfChild(viewGroup2);
        if (viewGroup2 instanceof ViewGroup) {
            viewGroup2.removeView(r1);
        }
        constraintLayout.removeViewAt(indexOfChild);
        viewGroup.setId(viewGroup2.getId());
        viewGroup.setLayoutParams(viewGroup2.getLayoutParams());
        viewGroup2.setId(-1);
        u11.h(-2, -2, viewGroup2);
        if (viewGroup instanceof ViewGroup) {
            viewGroup.addView(r1);
        }
        constraintLayout.addView(viewGroup, indexOfChild);
    }

    public final void setLeft(a aVar) {
        this.e = aVar;
        b();
    }

    public final void setRight(Right right) {
        this.f = right;
        c();
    }

    public final void setShowTopDivider(boolean z) {
        this.g = z;
        h();
    }

    public final void setSize(Size size) {
        this.b = size;
        d();
    }

    public final void setSubtitle(c cVar) {
        this.d = cVar;
        e();
    }

    public final void setTitle(d dVar) {
        this.c = dVar;
        g();
    }

    public final void setTitleSecondary(d.b bVar) {
        f();
    }

    public VkGroupHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public VkGroupHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = Size.Large;
        tlo0.Companion.getClass();
        this.c = new d(tlo0.c.a, null, null, null, 0, 510);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_group_header, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.i = (ConstraintLayout) findViewById(R.id.ds_internal_group_header_root);
        this.k = (ImageView) findViewById(R.id.ds_internal_group_header_left_icon);
        this.j = (ViewGroup) findViewById(R.id.ds_internal_group_header_left_layout);
        this.l = (TextView) findViewById(R.id.ds_internal_group_header_title);
        this.m = (VkFadeText) findViewById(R.id.ds_internal_group_header_title_fade);
        this.n = (TextView) findViewById(R.id.ds_internal_group_header_subtitle);
        this.o = (ImageView) findViewById(R.id.ds_internal_group_header_title_icon);
        this.p = (ImageView) findViewById(R.id.ds_internal_group_header_subtitle_left_icon);
        this.q = (ImageView) findViewById(R.id.ds_internal_group_header_subtitle_right_icon);
        this.r = (VkCounter) findViewById(R.id.ds_internal_group_header_counter);
        this.s = (TextView) findViewById(R.id.ds_internal_group_header_number);
        this.t = (TextView) findViewById(R.id.ds_internal_group_header_title_secondary_separator);
        this.u = (TextView) findViewById(R.id.ds_internal_group_header_title_secondary_text);
        this.v = (VkContentBadge) findViewById(R.id.ds_internal_group_header_title_badge);
        this.w = (GapLinearLayout) findViewById(R.id.ds_internal_group_header_right_layout);
        this.x = (ImageView) findViewById(R.id.ds_internal_group_header_right_icon_button);
        this.y = new b((ViewGroup) findViewById(R.id.ds_internal_group_header_right_extra_content));
        this.z = (ImageView) findViewById(R.id.ds_internal_group_header_right_circle_button);
        this.A = (VkDivider) findViewById(R.id.ds_internal_group_header_divider);
        d();
        g();
        f();
        e();
        b();
        c();
        h();
    }

    /* compiled from: VkGroupHeader.kt */
    public static final class c {
        public final tlo0 a;
        public final a b;
        public final a c;
        public final int d;

        /* compiled from: VkGroupHeader.kt */
        public interface a {

            /* compiled from: VkGroupHeader.kt */
            /* renamed from: com.vk.core.view.components.group.header.VkGroupHeader$c$a$a, reason: collision with other inner class name */
            public static final class C0843a implements a {
                public final gko a;
                public final x7g b;

                public C0843a(gko gkoVar, x7g x7gVar) {
                    this.a = gkoVar;
                    this.b = x7gVar;
                }
            }
        }

        public c(tlo0 tlo0Var, a aVar, a aVar2) {
            this.a = tlo0Var;
            this.b = aVar;
            this.c = aVar2;
            this.d = Integer.MAX_VALUE;
        }

        public c(String str, a.C0843a c0843a, a.C0843a c0843a2, int i) {
            this(oq.d(tlo0.Companion, str), (i & 2) != 0 ? null : c0843a, (i & 4) != 0 ? null : c0843a2);
        }
    }

    /* compiled from: VkGroupHeader.kt */
    public static final class d {
        public final tlo0 a;
        public final com.vk.core.view.components.group.header.d b;
        public final com.vk.core.view.components.group.header.c c;
        public final e d;
        public final int e;
        public final a f;
        public final Boolean g;

        /* compiled from: VkGroupHeader.kt */
        public interface a {

            /* compiled from: VkGroupHeader.kt */
            /* renamed from: com.vk.core.view.components.group.header.VkGroupHeader$d$a$a, reason: collision with other inner class name */
            public static final class C0844a implements a {
                public static final C0844a a = new C0844a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0844a);
                }

                public final int hashCode() {
                    return -2098941020;
                }

                public final String toString() {
                    return "OneLine";
                }
            }
        }

        /* compiled from: VkGroupHeader.kt */
        public static final class b {
        }

        public d(tlo0 tlo0Var, com.vk.core.view.components.group.header.d dVar, com.vk.core.view.components.group.header.c cVar, e eVar, com.vk.core.view.components.group.header.b bVar, b bVar2, int i, a aVar, Boolean bool) {
            this.a = tlo0Var;
            this.b = dVar;
            this.c = cVar;
            this.d = eVar;
            this.e = i;
            this.f = aVar;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(null, null) && epx.f(null, null) && this.e == dVar.e && epx.f(this.f, dVar.f) && epx.f(this.g, dVar.g);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            com.vk.core.view.components.group.header.d dVar = this.b;
            int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.vk.core.view.components.group.header.c cVar = this.c;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            e eVar = this.d;
            int a2 = shy.a(this.e, (((((hashCode3 + (eVar == null ? 0 : eVar.a.hashCode())) * 31) + 0) * 31) + 0) * 31, 31);
            a aVar = this.f;
            int hashCode4 = (a2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Boolean bool = this.g;
            return hashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Title(title=");
            sb.append(this.a);
            sb.append(", icon=");
            sb.append(this.b);
            sb.append(", counter=");
            sb.append(this.c);
            sb.append(", number=");
            sb.append(this.d);
            sb.append(", badge=");
            sb.append((Object) null);
            sb.append(", titleSecondary=");
            sb.append((Object) null);
            sb.append(", maxLines=");
            sb.append(this.e);
            sb.append(", multilineTitle=");
            sb.append(this.f);
            sb.append(", fade=");
            return tn.a(sb, this.g, ')');
        }

        public /* synthetic */ d(tlo0 tlo0Var, com.vk.core.view.components.group.header.c cVar, e eVar, com.vk.core.view.components.group.header.b bVar, int i, int i2) {
            this(tlo0Var, null, (i2 & 4) != 0 ? null : cVar, (i2 & 8) != 0 ? null : eVar, (i2 & 16) != 0 ? null : bVar, null, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, a.C0844a.a, Boolean.FALSE);
        }

        public d(String str, com.vk.core.view.components.group.header.d dVar, com.vk.core.view.components.group.header.c cVar, com.vk.core.view.components.group.header.b bVar, int i, a aVar, int i2) {
            this(oq.d(tlo0.Companion, str), (i2 & 2) != 0 ? null : dVar, (i2 & 4) != 0 ? null : cVar, null, (i2 & 16) != 0 ? null : bVar, null, (i2 & 64) != 0 ? Integer.MAX_VALUE : i, (i2 & 128) != 0 ? a.C0844a.a : aVar, false);
        }
    }
}
