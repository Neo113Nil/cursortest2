package com.vk.core.view.components.placeholder.main;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.tool.view.GapLinearLayout;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.placeholder.ButtonArrangement;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vkontakte.android.R;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.b8g;
import xsna.cut0;
import xsna.cvk;
import xsna.dko;
import xsna.dsa0;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.ey2;
import xsna.f4m;
import xsna.gko;
import xsna.gpo0;
import xsna.gzs;
import xsna.hbh0;
import xsna.ho8;
import xsna.jjc;
import xsna.kxt0;
import xsna.m4w;
import xsna.mdk0;
import xsna.psa0;
import xsna.qhv0;
import xsna.qoy;
import xsna.rlw;
import xsna.s3q0;
import xsna.sf3;
import xsna.shy;
import xsna.tlo0;
import xsna.too0;
import xsna.uf3;
import xsna.vu5;
import xsna.x7g;
import xsna.z7g;
import xsna.zrp;

/* compiled from: VkPlaceholder.kt */
/* loaded from: classes17.dex */
public class VkPlaceholder extends FrameLayout implements too0 {
    public static final /* synthetic */ int A = 0;
    public c b;
    public b c;
    public a d;
    public Mode e;
    public Size f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final LinearLayout j;
    public final FrameLayout k;
    public final ViewGroup l;
    public final LinearLayout m;
    public final FrameLayout n;
    public final GapLinearLayout o;
    public final ImageView p;
    public final VKReplacerView q;
    public final VKReplacerView r;
    public final VKReplacerView s;
    public final TextView t;
    public final VkLinkedText u;
    public VkFadeText v;
    public VkFadeText w;
    public final View x;
    public final View y;
    public final View z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPlaceholder.kt */
    public static final class Alignment {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment Center;
        public static final Alignment Start;

        static {
            Alignment alignment = new Alignment("Center", 0);
            Center = alignment;
            Alignment alignment2 = new Alignment("Start", 1);
            Start = alignment2;
            Alignment[] alignmentArr = {alignment, alignment2};
            $VALUES = alignmentArr;
            $ENTRIES = new asp(alignmentArr);
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPlaceholder.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode Neutral;
        public static final Mode Overlay;
        public static final Mode Primary;

        static {
            Mode mode = new Mode("Primary", 0);
            Primary = mode;
            Mode mode2 = new Mode("Overlay", 1);
            Overlay = mode2;
            Mode mode3 = new Mode("Neutral", 2);
            Neutral = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static zrp<Mode> h() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPlaceholder.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size Medium;
        public static final Size Small;

        static {
            Size size = new Size("Large", 0);
            Large = size;
            Size size2 = new Size("Medium", 1);
            Medium = size2;
            Size size3 = new Size("Small", 2);
            Small = size3;
            Size[] sizeArr = {size, size2, size3};
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

    /* compiled from: VkPlaceholder.kt */
    public static final class b {
        public final c a;
        public final C0859b b;

        /* compiled from: VkPlaceholder.kt */
        public static final class a {
            public static b a(tlo0.f fVar) {
                return new b(new c(2, (tlo0) null), new C0859b(14, fVar));
            }
        }

        /* compiled from: VkPlaceholder.kt */
        /* renamed from: com.vk.core.view.components.placeholder.main.VkPlaceholder$b$b, reason: collision with other inner class name */
        public static final class C0859b {
            public final tlo0 a;
            public final Float b;
            public final boolean c;
            public final int d;

            public C0859b() {
                this(15, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0859b)) {
                    return false;
                }
                C0859b c0859b = (C0859b) obj;
                return epx.f(this.a, c0859b.a) && epx.f(this.b, c0859b.b) && this.c == c0859b.c && this.d == c0859b.d;
            }

            public final int hashCode() {
                tlo0 tlo0Var = this.a;
                int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
                Float f = this.b;
                return Integer.hashCode(this.d) + qoy.b((hashCode + (f != null ? f.hashCode() : 0)) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Description(description=");
                sb.append(this.a);
                sb.append(", highlightCornerRadius=");
                sb.append(this.b);
                sb.append(", drawHighlightInBackground=");
                sb.append(this.c);
                sb.append(", maxLines=");
                return vu5.b(sb, this.d, ')');
            }

            public /* synthetic */ C0859b(int i, tlo0 tlo0Var) {
                this((i & 1) != 0 ? null : tlo0Var, null, false, Integer.MAX_VALUE);
            }

            public C0859b(tlo0 tlo0Var, Float f, boolean z, int i) {
                this.a = tlo0Var;
                this.b = f;
                this.c = z;
                this.d = i;
            }
        }

        /* compiled from: VkPlaceholder.kt */
        public static final class c {
            public final tlo0 a;
            public final gzs<s3q0> b;

            public c() {
                this(3, (tlo0) null);
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
                tlo0 tlo0Var = this.a;
                int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
                gzs<s3q0> gzsVar = this.b;
                return hashCode + (gzsVar != null ? gzsVar.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Title(title=");
                sb.append(this.a);
                sb.append(", onClick=");
                return uf3.d(sb, this.b, ')');
            }

            public /* synthetic */ c(int i, tlo0 tlo0Var) {
                this((gzs) null, (i & 1) != 0 ? null : tlo0Var);
            }

            public c(gzs gzsVar, tlo0 tlo0Var) {
                this.a = tlo0Var;
                this.b = gzsVar;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3);
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
            c cVar = this.a;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            C0859b c0859b = this.b;
            return hashCode + (c0859b != null ? c0859b.hashCode() : 0);
        }

        public final String toString() {
            return "Middle(title=" + this.a + ", description=" + this.b + ')';
        }

        public b(c cVar, C0859b c0859b) {
            this.a = cVar;
            this.b = c0859b;
        }

        public /* synthetic */ b(c cVar, C0859b c0859b, int i) {
            this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : c0859b);
        }
    }

    /* compiled from: VkPlaceholder.kt */
    public interface c {

        /* compiled from: VkPlaceholder.kt */
        public static final class a implements c {
            public final c.d a;
            public final int b;
            public final gzs<s3q0> c;

            public a() {
                throw null;
            }

            public a(c.d dVar, int i, gzs gzsVar, int i2) {
                if ((i2 & 2) != 0) {
                    Context context = e43.a;
                    i = hbh0.b(56, context == null ? null : context);
                }
                gzsVar = (i2 & 4) != 0 ? null : gzsVar;
                this.a = dVar;
                this.b = i;
                this.c = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int a = shy.a(this.b, this.a.hashCode() * 31, 31);
                gzs<s3q0> gzsVar = this.c;
                return (a + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
            }

            public final String toString() {
                return "Avatar(content=" + this.a + ", size=" + this.b + ", onClick=" + this.c + ", contentDescription=null)";
            }
        }

        /* compiled from: VkPlaceholder.kt */
        public static final class b implements c {
            public final dko a;
            public final cut0 b;
            public final android.util.Size c;
            public final String d;

            public b(dko dkoVar, cut0 cut0Var, android.util.Size size, int i) {
                cut0Var = (i & 2) != 0 ? null : cut0Var;
                size = (i & 4) != 0 ? null : size;
                this.a = dkoVar;
                this.b = cut0Var;
                this.c = size;
                this.d = null;
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
                int hashCode = this.a.hashCode() * 31;
                cut0 cut0Var = this.b;
                int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
                android.util.Size size = this.c;
                int hashCode3 = (hashCode2 + (size == null ? 0 : size.hashCode())) * 31;
                String str = this.d;
                return hashCode3 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(icon=");
                sb.append(this.a);
                sb.append(", iconTint=");
                sb.append(this.b);
                sb.append(", iconSize=");
                sb.append(this.c);
                sb.append(", iconDescription=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: VkPlaceholder.kt */
        /* renamed from: com.vk.core.view.components.placeholder.main.VkPlaceholder$c$c, reason: collision with other inner class name */
        public static final class C0860c implements c {
            public final rlw a;
            public final android.util.Size b;
            public final cut0 c;
            public final qhv0 d;

            public C0860c(rlw rlwVar, android.util.Size size, x7g x7gVar, qhv0 qhv0Var, int i) {
                size = (i & 2) != 0 ? null : size;
                x7gVar = (i & 4) != 0 ? null : x7gVar;
                qhv0Var = (i & 16) != 0 ? null : qhv0Var;
                this.a = rlwVar;
                this.b = size;
                this.c = x7gVar;
                this.d = qhv0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0860c)) {
                    return false;
                }
                C0860c c0860c = (C0860c) obj;
                return this.a.equals(c0860c.a) && epx.f(this.b, c0860c.b) && epx.f(this.c, c0860c.c) && epx.f(this.d, c0860c.d);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                android.util.Size size = this.b;
                int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
                cut0 cut0Var = this.c;
                int hashCode3 = (hashCode2 + (cut0Var == null ? 0 : cut0Var.hashCode())) * 961;
                qhv0 qhv0Var = this.d;
                return hashCode3 + (qhv0Var != null ? qhv0Var.hashCode() : 0);
            }

            public final String toString() {
                return "Image(source=" + this.a + ", size=" + this.b + ", imageTint=" + this.c + ", contentDescription=null, scaleType=" + this.d + ')';
            }
        }

        /* compiled from: VkPlaceholder.kt */
        public static final class d implements c {
            public final com.vk.core.view.components.picture.c a;
            public final int b;

            public d() {
                this(null, 0, 15);
            }

            public d(com.vk.core.view.components.picture.c cVar, int i, int i2) {
                cVar = (i2 & 1) != 0 ? null : cVar;
                if ((i2 & 2) != 0) {
                    Context context = e43.a;
                    i = hbh0.b(56, context == null ? null : context);
                }
                if ((i2 & 4) != 0) {
                    Context context2 = e43.a;
                    hbh0.a(context2 != null ? context2 : null, 4.0f);
                }
                this.a = cVar;
                this.b = i;
            }
        }
    }

    /* compiled from: VkPlaceholder.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.Start.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Size.values().length];
            try {
                iArr2[Size.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public VkPlaceholder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static void e(View view, gzs gzsVar) {
        if (gzsVar != null) {
            view.setOnClickListener(new m4w(gzsVar, 5));
        } else {
            view.setOnClickListener(null);
            view.setClickable(false);
        }
    }

    public static void g(VkPlaceholder vkPlaceholder, LinearLayout linearLayout, kxt0 kxt0Var, a.C0857a c0857a) {
        if (c0857a == null) {
            return;
        }
        Object next = kxt0Var.hasNext() ? kxt0Var.next() : null;
        VkButton vkButton = next instanceof VkButton ? (VkButton) next : null;
        if (vkButton == null) {
            return;
        }
        vkPlaceholder.getContext();
        boolean z = c0857a.i;
        int i = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z) {
            if (linearLayout.getOrientation() == 0) {
                layoutParams.weight = 1.0f;
                i = 0;
            } else {
                i = -1;
            }
        }
        layoutParams.width = i;
        vkButton.setLayoutParams(layoutParams);
        vkButton.setText(c0857a.a.a(vkPlaceholder.getContext()));
        vkButton.setCount(c0857a.e);
        vkButton.setSize(c0857a.f);
        vkButton.setMode(c0857a.g);
        VkButton.Appearance appearance = c0857a.h;
        if (appearance == null) {
            vkPlaceholder.getContext();
            int i2 = dsa0.$EnumSwitchMapping$1[vkPlaceholder.e.ordinal()];
            appearance = i2 != 1 ? i2 != 2 ? VkButton.Appearance.Accent : VkButton.Appearance.Overlay : VkButton.Appearance.Accent;
        }
        vkButton.setAppearance(appearance);
        jjc.g(vkButton, new mdk0(c0857a, 22));
        a.C0857a.C0858a c0858a = c0857a.c;
        if (c0858a != null) {
            cut0 cut0Var = c0858a.c;
            Drawable b2 = gko.b(c0858a.a.a, vkPlaceholder.getContext());
            if (b2 != null) {
                vkButton.Z4(b2, cut0Var == null);
            }
            if (cut0Var != null) {
                if (cut0Var instanceof x7g) {
                    vkButton.setIconTint(((x7g) cut0Var).a);
                } else if (cut0Var instanceof z7g) {
                    vkButton.setIconTint(vkPlaceholder.getContext().getColorStateList(((z7g) cut0Var).a));
                } else {
                    if (!(cut0Var instanceof b8g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkButton.setIconTint(ColorStateList.valueOf(((b8g) cut0Var).a));
                }
            }
            vkButton.setIconSize(c0858a.b);
        }
        a.C0857a.C0858a c0858a2 = c0857a.d;
        if (c0858a2 != null) {
            cut0 cut0Var2 = c0858a2.c;
            Drawable b3 = gko.b(c0858a2.a.a, vkPlaceholder.getContext());
            if (b3 != null) {
                vkButton.c5(b3, cut0Var2 == null);
            }
            if (cut0Var2 != null) {
                if (cut0Var2 instanceof x7g) {
                    vkButton.setTrailingIconTint(((x7g) cut0Var2).a);
                } else if (cut0Var2 instanceof z7g) {
                    vkButton.setTrailingIconTint(vkPlaceholder.getContext().getColorStateList(((z7g) cut0Var2).a));
                } else {
                    if (!(cut0Var2 instanceof b8g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkButton.setTrailingIconTint(ColorStateList.valueOf(((b8g) cut0Var2).a));
                }
            }
            vkButton.setTrailingIconSize(c0858a2.b);
        }
    }

    private final TextView getCurrentMiddleDescriptionView() {
        getContext();
        return this.u;
    }

    private final TextView getCurrentMiddleTitleView() {
        getContext();
        return this.t;
    }

    private final void setLegoDescription(b.C0859b c0859b) {
        VkFadeText vkFadeText;
        tlo0 tlo0Var;
        VkFadeText vkFadeText2 = this.w;
        if (vkFadeText2 != null) {
            ey2.i(vkFadeText2, (c0859b == null || (tlo0Var = c0859b.a) == null) ? null : tlo0Var.a(getContext()));
        }
        if (c0859b == null || (vkFadeText = this.w) == null) {
            return;
        }
        vkFadeText.setMaxTextLines(3);
    }

    private final void setLegoTitle(b.c cVar) {
        tlo0 tlo0Var;
        VkFadeText vkFadeText = this.v;
        if (vkFadeText != null) {
            ey2.i(vkFadeText, (cVar == null || (tlo0Var = cVar.a) == null) ? null : tlo0Var.a(getContext()));
        }
        if (cVar != null) {
            VkFadeText vkFadeText2 = this.v;
            if (vkFadeText2 != null) {
                e(vkFadeText2, cVar.b);
            }
            VkFadeText vkFadeText3 = this.v;
            if (vkFadeText3 != null) {
                vkFadeText3.setMaxTextLines(2);
            }
        }
    }

    private final void setMilkshakeDescription(b.C0859b c0859b) {
        tlo0 tlo0Var;
        CharSequence a2 = (c0859b == null || (tlo0Var = c0859b.a) == null) ? null : tlo0Var.a(getContext());
        VkLinkedText vkLinkedText = this.u;
        ey2.i(vkLinkedText, a2);
        if (c0859b != null) {
            Float f = c0859b.b;
            vkLinkedText.setHighlightCornerRadius(f != null ? f.floatValue() : hbh0.a(getContext(), 3.0f));
            vkLinkedText.setDrawHighlightInBackground(c0859b.c);
            vkLinkedText.setMaxLines(c0859b.d);
        }
    }

    private final void setMilkshakeTitle(b.c cVar) {
        tlo0 tlo0Var;
        CharSequence a2 = (cVar == null || (tlo0Var = cVar.a) == null) ? null : tlo0Var.a(getContext());
        TextView textView = this.t;
        ey2.i(textView, a2);
        if (cVar != null) {
            e(textView, cVar.b);
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        b();
        a(this.c);
        k();
        m();
        l(this.e);
    }

    public final void a(b bVar) {
        TextView currentMiddleDescriptionView;
        boolean z = false;
        boolean z2 = bVar != null;
        LinearLayout linearLayout = this.m;
        f4m.E(linearLayout, z2);
        getContext();
        VkFadeText vkFadeText = this.v;
        if (vkFadeText != null) {
            linearLayout.removeView(vkFadeText);
        }
        VkFadeText vkFadeText2 = this.w;
        if (vkFadeText2 != null) {
            linearLayout.removeView(vkFadeText2);
        }
        this.v = null;
        this.w = null;
        if (bVar != null) {
            setMilkshakeTitle(bVar.a);
            setMilkshakeDescription(bVar.b);
            Context context = getContext();
            getContext();
            this.u.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text, context));
        }
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_s, getContext());
        View view = this.x;
        f4m.k(a2, view);
        TextView currentMiddleTitleView = getCurrentMiddleTitleView();
        if (currentMiddleTitleView != null && currentMiddleTitleView.getVisibility() == 0 && (currentMiddleDescriptionView = getCurrentMiddleDescriptionView()) != null && currentMiddleDescriptionView.getVisibility() == 0) {
            z = true;
        }
        f4m.E(view, z);
        j();
        i();
    }

    public final void b() {
        int i = 0;
        f4m.E(this.l, this.b != null);
        ImageView imageView = this.p;
        f4m.j(imageView);
        VKReplacerView vKReplacerView = this.r;
        f4m.j(vKReplacerView.getView());
        VKReplacerView vKReplacerView2 = this.q;
        f4m.j(vKReplacerView2.getView());
        VKReplacerView vKReplacerView3 = this.s;
        f4m.j(vKReplacerView3.getView());
        c cVar = this.b;
        if (cVar != null) {
            if (cVar instanceof c.b) {
                c.b bVar = (c.b) cVar;
                imageView.setVisibility(0);
                imageView.setImageDrawable(bVar.a.a(imageView.getContext()));
                cut0 cut0Var = bVar.b;
                if (cut0Var == null) {
                    imageView.getContext();
                    int i2 = dsa0.$EnumSwitchMapping$1[this.e.ordinal()];
                    int i3 = R.attr.vk_ui_icon_accent;
                    if (i2 != 1 && i2 == 2) {
                        i3 = R.attr.vk_ui_icon_contrast;
                    }
                    cut0Var = new x7g(i3);
                }
                gpo0.g(imageView, cut0Var);
                imageView.setContentDescription(bVar.d);
                android.util.Size size = bVar.c;
                if (size != null) {
                    imageView.getLayoutParams().width = size.getWidth();
                    imageView.getLayoutParams().height = size.getHeight();
                }
            } else {
                int i4 = 6;
                AttributeSet attributeSet = null;
                if (cVar instanceof c.a) {
                    c.a aVar = (c.a) cVar;
                    vKReplacerView2.getView().setVisibility(0);
                    View view = vKReplacerView2.getView();
                    VkAvatar vkAvatar = view instanceof VkAvatar ? (VkAvatar) view : null;
                    if (vkAvatar == null) {
                        vkAvatar = new VkAvatar(vKReplacerView2.getContext(), attributeSet, i4, i);
                        vKReplacerView2.a(vkAvatar);
                    }
                    int i5 = aVar.b;
                    f4m.z(i5, i5, vkAvatar);
                    vkAvatar.setContent(aVar.a);
                    e(vkAvatar, aVar.c);
                    vkAvatar.setContentDescription(null);
                } else if (cVar instanceof c.d) {
                    c.d dVar = (c.d) cVar;
                    vKReplacerView.getView().setVisibility(0);
                    View view2 = vKReplacerView.getView();
                    VkPicture vkPicture = view2 instanceof VkPicture ? (VkPicture) view2 : null;
                    if (vkPicture == null) {
                        vkPicture = new VkPicture(vKReplacerView.getContext(), null, 6, 0);
                        vKReplacerView.a(vkPicture);
                    }
                    int i6 = dVar.b;
                    f4m.z(i6, i6, vkPicture);
                    vkPicture.setContent(dVar.a);
                    vkPicture.setContentDescription(null);
                } else {
                    if (!(cVar instanceof c.C0860c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.C0860c c0860c = (c.C0860c) cVar;
                    vKReplacerView3.getView().setVisibility(0);
                    View view3 = vKReplacerView3.getView();
                    VkImage vkImage = view3 instanceof VkImage ? (VkImage) view3 : null;
                    if (vkImage == null) {
                        vkImage = new VkImage(vKReplacerView3.getContext(), null, 6, 0);
                        vKReplacerView3.a(vkImage);
                    }
                    android.util.Size size2 = c0860c.b;
                    if (size2 != null) {
                        f4m.A(vkImage, size2);
                    }
                    vkImage.p0(c0860c.a);
                    qhv0 qhv0Var = c0860c.d;
                    if (qhv0Var != null) {
                        vkImage.setVkScaleType(qhv0Var);
                    }
                    cut0 cut0Var2 = c0860c.c;
                    vkImage.setColorFilter(cut0Var2 != null ? new PorterDuffColorFilter(cut0Var2.b(vKReplacerView3.getContext()), PorterDuff.Mode.SRC_ATOP) : null);
                    vkImage.setContentDescription(null);
                }
            }
        }
        j();
        i();
    }

    public final void c() {
        this.j.setGravity(17);
        this.m.setGravity(17);
        this.o.setGravity(17);
        TextView currentMiddleTitleView = getCurrentMiddleTitleView();
        if (currentMiddleTitleView != null) {
            currentMiddleTitleView.setTextAlignment(4);
        }
        TextView currentMiddleDescriptionView = getCurrentMiddleDescriptionView();
        if (currentMiddleDescriptionView != null) {
            currentMiddleDescriptionView.setTextAlignment(4);
        }
    }

    public final void d(GapLinearLayout gapLinearLayout, a.C0857a c0857a) {
        if (c0857a == null) {
            return;
        }
        gapLinearLayout.addView(new VkButton(getContext(), null, 6, 0));
    }

    public final void f() {
        a aVar = this.d;
        getContext();
        if (aVar == null ? true : aVar instanceof a.b) {
            boolean z = aVar != null;
            GapLinearLayout gapLinearLayout = this.o;
            f4m.E(gapLinearLayout, z);
            a.b bVar = (a.b) aVar;
            gapLinearLayout.setGap(e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext()));
            kxt0 kxt0Var = new kxt0(gapLinearLayout);
            g(this, gapLinearLayout, kxt0Var, bVar != null ? bVar.a : null);
            g(this, gapLinearLayout, kxt0Var, bVar != null ? bVar.b : null);
            g(this, gapLinearLayout, kxt0Var, bVar != null ? bVar.c : null);
        }
        i();
    }

    @Override // android.view.View
    public final a getBottom() {
        return this.d;
    }

    public final b getMiddle() {
        return this.c;
    }

    public final Mode getMode() {
        return this.e;
    }

    public final Size getSize() {
        return this.f;
    }

    @Override // android.view.View
    public final c getTop() {
        return this.b;
    }

    public final boolean getWithHorizontalPaddings() {
        return this.g;
    }

    public final boolean getWithPaddings() {
        return this.g && this.h;
    }

    public final boolean getWithVerticalPaddings() {
        return this.h;
    }

    public final void h() {
        boolean z = this.i;
        LinearLayout linearLayout = this.m;
        LinearLayout linearLayout2 = this.j;
        if (z) {
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            linearLayout2.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            linearLayout.setLayoutParams(layoutParams2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        linearLayout2.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -2;
        linearLayout.setLayoutParams(layoutParams4);
    }

    public final void i() {
        getContext();
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size2_xl, getContext());
        View view = this.z;
        f4m.k(a2, view);
        f4m.E(view, (this.m.getVisibility() == 0 || this.l.getVisibility() == 0) && this.o.getVisibility() == 0);
    }

    public final void j() {
        getContext();
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext());
        View view = this.y;
        f4m.k(a2, view);
        f4m.E(view, (this.k.getVisibility() == 0 || this.l.getVisibility() == 0) && this.m.getVisibility() == 0);
    }

    public final void k() {
        int a2 = this.g ? e3m.a(R.dimen.ds_placeholder_horizontal_padding, getContext()) : 0;
        LinearLayout linearLayout = this.j;
        linearLayout.setPaddingRelative(a2, linearLayout.getPaddingTop(), a2, linearLayout.getPaddingBottom());
    }

    public final void l(Mode mode) {
        c cVar = this.b;
        if (cVar instanceof c.b) {
            cut0 cut0Var = ((c.b) cVar).b;
            if (cut0Var == null) {
                getContext();
                int i = dsa0.$EnumSwitchMapping$1[mode.ordinal()];
                int i2 = R.attr.vk_ui_icon_accent;
                if (i != 1 && i == 2) {
                    i2 = R.attr.vk_ui_icon_contrast;
                }
                cut0Var = new x7g(i2);
            }
            gpo0.g(this.p, cut0Var);
        }
        TextView currentMiddleTitleView = getCurrentMiddleTitleView();
        int i3 = R.attr.vk_ui_text_contrast;
        if (currentMiddleTitleView != null) {
            getContext();
            int i4 = dsa0.$EnumSwitchMapping$1[mode.ordinal()];
            int i5 = R.attr.vk_ui_text_primary;
            if (i4 != 1 && i4 == 2) {
                i5 = R.attr.vk_ui_text_contrast;
            }
            gpo0.i(currentMiddleTitleView, i5);
        }
        TextView currentMiddleDescriptionView = getCurrentMiddleDescriptionView();
        if (currentMiddleDescriptionView != null) {
            getContext();
            int i6 = dsa0.$EnumSwitchMapping$1[mode.ordinal()];
            if (i6 == 1 || i6 != 2) {
                i3 = R.attr.vk_ui_text_secondary;
            }
            gpo0.i(currentMiddleDescriptionView, i3);
        }
        f();
    }

    public final void m() {
        int a2 = this.h ? e3m.a(R.dimen.ds_placeholder_vertical_padding, getContext()) : 0;
        LinearLayout linearLayout = this.j;
        linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), a2, linearLayout.getPaddingEnd(), a2);
    }

    public final void setAlignment(Alignment alignment) {
        Alignment alignment2 = Alignment.Center;
        if (d.$EnumSwitchMapping$1[this.f.ordinal()] != 1) {
            c();
            return;
        }
        int i = d.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i == 1) {
            c();
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.j.setGravity(8388611);
        this.m.setGravity(8388611);
        this.o.setGravity(8388611);
        TextView currentMiddleTitleView = getCurrentMiddleTitleView();
        if (currentMiddleTitleView != null) {
            currentMiddleTitleView.setTextAlignment(5);
        }
        TextView currentMiddleDescriptionView = getCurrentMiddleDescriptionView();
        if (currentMiddleDescriptionView != null) {
            currentMiddleDescriptionView.setTextAlignment(5);
        }
    }

    public final void setBottom(a aVar) {
        this.d = aVar;
        a.b bVar = aVar instanceof a.b ? (a.b) aVar : null;
        if (bVar != null) {
            getContext();
            GapLinearLayout gapLinearLayout = this.o;
            gapLinearLayout.removeAllViews();
            gapLinearLayout.setOrientation(1);
            d(gapLinearLayout, bVar.a);
            d(gapLinearLayout, bVar.b);
            d(gapLinearLayout, bVar.c);
        }
        f();
    }

    public final void setBottomSlot(psa0 psa0Var) {
        Context context = getContext();
        FrameLayout frameLayout = this.n;
        if (psa0Var == null) {
            frameLayout.removeAllViews();
            f4m.j(frameLayout);
            s3q0 s3q0Var = s3q0.a;
        } else {
            cvk create = psa0Var.create(context);
            s3q0 s3q0Var2 = s3q0.a;
            frameLayout.removeAllViews();
            create.getClass();
            frameLayout.addView((View) null, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.setVisibility(0);
        }
        i();
    }

    public final void setMiddle(b bVar) {
        this.c = bVar;
        a(bVar);
    }

    public final void setMode(Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            l(mode);
        }
    }

    public final void setSize(Size size) {
        if (this.f != size) {
            this.f = size;
            h();
            a(this.c);
            f();
        }
    }

    public final void setTop(c cVar) {
        this.b = cVar;
        b();
    }

    public final void setTopSlot(psa0 psa0Var) {
        Context context = getContext();
        FrameLayout frameLayout = this.k;
        if (psa0Var == null) {
            frameLayout.removeAllViews();
            f4m.j(frameLayout);
            s3q0 s3q0Var = s3q0.a;
        } else {
            cvk create = psa0Var.create(context);
            s3q0 s3q0Var2 = s3q0.a;
            frameLayout.removeAllViews();
            create.getClass();
            frameLayout.addView((View) null, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.setVisibility(0);
        }
        j();
        i();
    }

    public final void setWithHorizontalPaddings(boolean z) {
        this.g = z;
        k();
    }

    public final void setWithPaddings(boolean z) {
        setWithHorizontalPaddings(z);
        setWithVerticalPaddings(z);
    }

    public final void setWithVerticalPaddings(boolean z) {
        this.h = z;
        m();
    }

    public final void setWrapContent(boolean z) {
        this.i = z;
        h();
    }

    public /* synthetic */ VkPlaceholder(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.e = Mode.Primary;
        this.f = Size.Large;
        this.g = true;
        this.h = true;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_placeholder, (ViewGroup) this, true);
        this.j = (LinearLayout) findViewById(R.id.root);
        this.k = (FrameLayout) findViewById(R.id.top_slot_container);
        this.l = (ViewGroup) findViewById(R.id.top);
        this.m = (LinearLayout) findViewById(R.id.middle);
        this.n = (FrameLayout) findViewById(R.id.bottom_slot_container);
        this.o = (GapLinearLayout) findViewById(R.id.bottom);
        this.p = (ImageView) findViewById(R.id.top_icon);
        this.q = (VKReplacerView) findViewById(R.id.top_avatar_view);
        this.s = (VKReplacerView) findViewById(R.id.top_image_view);
        this.r = (VKReplacerView) findViewById(R.id.top_picture_view);
        this.t = (TextView) findViewById(R.id.middle_title);
        this.u = (VkLinkedText) findViewById(R.id.middle_description);
        this.x = findViewById(R.id.gap_title_description);
        this.y = findViewById(R.id.gap_top_middle);
        this.z = findViewById(R.id.gap_middle_bottom);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.u, 0, 0);
        setMode((Mode) Mode.h().get(obtainStyledAttributes.getInteger(0, 0)));
        obtainStyledAttributes.recycle();
        k();
        m();
    }

    /* compiled from: VkPlaceholder.kt */
    public static abstract class a {

        /* compiled from: VkPlaceholder.kt */
        public static final class c {
            public static b a(C0857a c0857a) {
                return new b(c0857a, null, null, null, 8);
            }
        }

        /* compiled from: VkPlaceholder.kt */
        public static final class b extends a {
            public final C0857a a;
            public final C0857a b;
            public final C0857a c;
            public final ButtonArrangement d;

            public b(C0857a c0857a, C0857a c0857a2, C0857a c0857a3, ButtonArrangement buttonArrangement) {
                this.a = c0857a;
                this.b = c0857a2;
                this.c = c0857a3;
                this.d = buttonArrangement;
            }

            public static b a(b bVar, C0857a c0857a, C0857a c0857a2, int i) {
                if ((i & 1) != 0) {
                    c0857a = bVar.a;
                }
                if ((i & 2) != 0) {
                    c0857a2 = bVar.b;
                }
                return new b(c0857a, c0857a2, bVar.c, bVar.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                C0857a c0857a = this.b;
                int hashCode2 = (hashCode + (c0857a == null ? 0 : c0857a.hashCode())) * 31;
                C0857a c0857a2 = this.c;
                return this.d.hashCode() + ((hashCode2 + (c0857a2 != null ? c0857a2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "ButtonsRow(firstButton=" + this.a + ", secondButton=" + this.b + ", thirdButton=" + this.c + ", arrangement=" + this.d + ')';
            }

            public /* synthetic */ b(C0857a c0857a, C0857a c0857a2, C0857a c0857a3, ButtonArrangement buttonArrangement, int i) {
                this(c0857a, (i & 2) != 0 ? null : c0857a2, (i & 4) != 0 ? null : c0857a3, (i & 8) != 0 ? ButtonArrangement.VerticalFilled : buttonArrangement);
            }
        }

        /* compiled from: VkPlaceholder.kt */
        /* renamed from: com.vk.core.view.components.placeholder.main.VkPlaceholder$a$a, reason: collision with other inner class name */
        public static final class C0857a {
            public final tlo0 a;
            public final gzs<s3q0> b;
            public final C0858a c;
            public final C0858a d;
            public final Integer e;
            public final VkButton.Size f;
            public final VkButton.Mode g;
            public final VkButton.Appearance h;
            public final boolean i;

            /* compiled from: VkPlaceholder.kt */
            /* renamed from: com.vk.core.view.components.placeholder.main.VkPlaceholder$a$a$a, reason: collision with other inner class name */
            public static final class C0858a {
                public final gko a;
                public final Integer b;
                public final cut0 c;

                public C0858a(gko gkoVar, Integer num, x7g x7gVar) {
                    this.a = gkoVar;
                    this.b = num;
                    this.c = x7gVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0858a)) {
                        return false;
                    }
                    C0858a c0858a = (C0858a) obj;
                    return epx.f(this.a, c0858a.a) && epx.f(this.b, c0858a.b) && epx.f(this.c, c0858a.c);
                }

                public final int hashCode() {
                    int hashCode = Integer.hashCode(this.a.a) * 31;
                    Integer num = this.b;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    cut0 cut0Var = this.c;
                    return hashCode2 + (cut0Var != null ? cut0Var.hashCode() : 0);
                }

                public final String toString() {
                    return "Icon(icon=" + this.a + ", iconSize=" + this.b + ", iconTint=" + this.c + ')';
                }
            }

            public C0857a(tlo0 tlo0Var, gzs<s3q0> gzsVar, C0858a c0858a, C0858a c0858a2, Integer num, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, boolean z) {
                this.a = tlo0Var;
                this.b = gzsVar;
                this.c = c0858a;
                this.d = c0858a2;
                this.e = num;
                this.f = size;
                this.g = mode;
                this.h = appearance;
                this.i = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0857a)) {
                    return false;
                }
                C0857a c0857a = (C0857a) obj;
                return epx.f(this.a, c0857a.a) && epx.f(this.b, c0857a.b) && epx.f(this.c, c0857a.c) && epx.f(this.d, c0857a.d) && epx.f(this.e, c0857a.e) && this.f == c0857a.f && this.g == c0857a.g && this.h == c0857a.h && this.i == c0857a.i;
            }

            public final int hashCode() {
                int a = sf3.a(this.a.hashCode() * 31, 31, this.b);
                C0858a c0858a = this.c;
                int hashCode = (a + (c0858a == null ? 0 : c0858a.hashCode())) * 31;
                C0858a c0858a2 = this.d;
                int hashCode2 = (hashCode + (c0858a2 == null ? 0 : c0858a2.hashCode())) * 31;
                Integer num = this.e;
                int hashCode3 = (this.g.hashCode() + ((this.f.hashCode() + ((hashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31;
                VkButton.Appearance appearance = this.h;
                return Boolean.hashCode(this.i) + ((hashCode3 + (appearance != null ? appearance.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Button(text=");
                sb.append(this.a);
                sb.append(", onClick=");
                sb.append(this.b);
                sb.append(", icon=");
                sb.append(this.c);
                sb.append(", trailingIcon=");
                sb.append(this.d);
                sb.append(", count=");
                sb.append(this.e);
                sb.append(", buttonSize=");
                sb.append(this.f);
                sb.append(", buttonMode=");
                sb.append(this.g);
                sb.append(", buttonAppearance=");
                sb.append(this.h);
                sb.append(", stretched=");
                return q0.a(sb, this.i, ')');
            }

            public /* synthetic */ C0857a(tlo0 tlo0Var, gzs gzsVar, C0858a c0858a, C0858a c0858a2, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, boolean z, int i) {
                this(tlo0Var, (gzs<s3q0>) gzsVar, (i & 4) != 0 ? null : c0858a, (i & 8) != 0 ? null : c0858a2, (Integer) null, (i & 32) != 0 ? VkButton.Size.Medium : size, (i & 64) != 0 ? VkButton.Mode.Primary : mode, (i & 128) != 0 ? null : appearance, (i & 256) != 0 ? false : z);
            }
        }
    }

    public static /* synthetic */ void getSize$annotations() {
    }
}
