package com.vk.core.view.components.tile;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.tool.view.GapLinearLayout;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.bsv0;
import xsna.bt;
import xsna.csv0;
import xsna.dko;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fw3;
import xsna.gko;
import xsna.gpo0;
import xsna.hdu0;
import xsna.jq;
import xsna.k1u0;
import xsna.msy;
import xsna.myc0;
import xsna.nl1;
import xsna.ol1;
import xsna.rl3;
import xsna.shy;
import xsna.tlo0;
import xsna.too0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: VkTile.kt */
/* loaded from: classes17.dex */
public final class VkTile extends LinearLayout implements too0 {
    public static final /* synthetic */ int C = 0;
    public final Object A;
    public g B;
    public TextAlignment b;
    public TextSize c;
    public boolean d;
    public f e;
    public VisualContentType f;
    public c g;
    public e h;
    public d i;
    public b j;
    public h k;
    public a l;
    public final ConstraintLayout m;
    public final VkFadeText n;
    public final GapLinearLayout o;
    public final VkFadeText p;
    public final TextView q;
    public final ImageView r;
    public final ImageView s;
    public final ImageView t;
    public final GapLinearLayout u;
    public final VkFadeText v;
    public final ImageView w;
    public final ImageView x;
    public final VkFadeText y;
    public final Object z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTile.kt */
    public static final class BottomPaddingPreset {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BottomPaddingPreset[] $VALUES;
        public static final BottomPaddingPreset Default;
        public static final BottomPaddingPreset Grid2Columns;
        public static final BottomPaddingPreset Grid3Columns;

        static {
            BottomPaddingPreset bottomPaddingPreset = new BottomPaddingPreset("Default", 0);
            Default = bottomPaddingPreset;
            BottomPaddingPreset bottomPaddingPreset2 = new BottomPaddingPreset("Grid3Columns", 1);
            Grid3Columns = bottomPaddingPreset2;
            BottomPaddingPreset bottomPaddingPreset3 = new BottomPaddingPreset("Grid2Columns", 2);
            Grid2Columns = bottomPaddingPreset3;
            BottomPaddingPreset[] bottomPaddingPresetArr = {bottomPaddingPreset, bottomPaddingPreset2, bottomPaddingPreset3};
            $VALUES = bottomPaddingPresetArr;
            $ENTRIES = new asp(bottomPaddingPresetArr);
        }

        public BottomPaddingPreset() {
            throw null;
        }

        public static BottomPaddingPreset valueOf(String str) {
            return (BottomPaddingPreset) Enum.valueOf(BottomPaddingPreset.class, str);
        }

        public static BottomPaddingPreset[] values() {
            return (BottomPaddingPreset[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTile.kt */
    public static final class TextAlignment {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TextAlignment[] $VALUES;
        public static final TextAlignment Center;
        public static final TextAlignment Start;

        static {
            TextAlignment textAlignment = new TextAlignment("Start", 0);
            Start = textAlignment;
            TextAlignment textAlignment2 = new TextAlignment("Center", 1);
            Center = textAlignment2;
            TextAlignment[] textAlignmentArr = {textAlignment, textAlignment2};
            $VALUES = textAlignmentArr;
            $ENTRIES = new asp(textAlignmentArr);
        }

        public TextAlignment() {
            throw null;
        }

        public static TextAlignment valueOf(String str) {
            return (TextAlignment) Enum.valueOf(TextAlignment.class, str);
        }

        public static TextAlignment[] values() {
            return (TextAlignment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTile.kt */
    public static final class TextSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TextSize[] $VALUES;
        public static final TextSize Medium;
        public static final TextSize Small;

        static {
            TextSize textSize = new TextSize("Small", 0);
            Small = textSize;
            TextSize textSize2 = new TextSize("Medium", 1);
            Medium = textSize2;
            TextSize[] textSizeArr = {textSize, textSize2};
            $VALUES = textSizeArr;
            $ENTRIES = new asp(textSizeArr);
        }

        public TextSize() {
            throw null;
        }

        public static TextSize valueOf(String str) {
            return (TextSize) Enum.valueOf(TextSize.class, str);
        }

        public static TextSize[] values() {
            return (TextSize[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTile.kt */
    public static final class VisualAndTextGap {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VisualAndTextGap[] $VALUES;
        public static final VisualAndTextGap Default;
        public static final VisualAndTextGap Grid2Or3Columns;

        static {
            VisualAndTextGap visualAndTextGap = new VisualAndTextGap("Default", 0);
            Default = visualAndTextGap;
            VisualAndTextGap visualAndTextGap2 = new VisualAndTextGap("Grid2Or3Columns", 1);
            Grid2Or3Columns = visualAndTextGap2;
            VisualAndTextGap[] visualAndTextGapArr = {visualAndTextGap, visualAndTextGap2};
            $VALUES = visualAndTextGapArr;
            $ENTRIES = new asp(visualAndTextGapArr);
        }

        public VisualAndTextGap() {
            throw null;
        }

        public static VisualAndTextGap valueOf(String str) {
            return (VisualAndTextGap) Enum.valueOf(VisualAndTextGap.class, str);
        }

        public static VisualAndTextGap[] values() {
            return (VisualAndTextGap[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTile.kt */
    public static final class VisualContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VisualContentType[] $VALUES;
        public static final VisualContentType Avatar;
        public static final VisualContentType Other;

        static {
            VisualContentType visualContentType = new VisualContentType("Avatar", 0);
            Avatar = visualContentType;
            VisualContentType visualContentType2 = new VisualContentType("Other", 1);
            Other = visualContentType2;
            VisualContentType[] visualContentTypeArr = {visualContentType, visualContentType2};
            $VALUES = visualContentTypeArr;
            $ENTRIES = new asp(visualContentTypeArr);
        }

        public VisualContentType() {
            throw null;
        }

        public static VisualContentType valueOf(String str) {
            return (VisualContentType) Enum.valueOf(VisualContentType.class, str);
        }

        public static VisualContentType[] values() {
            return (VisualContentType[]) $VALUES.clone();
        }
    }

    /* compiled from: VkTile.kt */
    public static class a {
        public int a(VkTile vkTile) {
            Context context = vkTile.getContext();
            int i = com.vk.core.view.components.tile.a.$EnumSwitchMapping$0[vkTile.getVisualContentType().ordinal()];
            if (i == 1) {
                return e3m.a(R.dimen.vk_ui_spacing_size_xs, context);
            }
            if (i == 2) {
                return e3m.a(R.dimen.vk_ui_spacing_size_s, context);
            }
            throw new NoWhenBranchMatchedException();
        }

        public int b(VkTile vkTile) {
            int i;
            Context context = vkTile.getContext();
            TextAlignment textAlignment = vkTile.getTextAlignment();
            vkTile.getTextSize();
            int i2 = com.vk.core.view.components.tile.a.$EnumSwitchMapping$4[textAlignment.ordinal()];
            if (i2 == 1) {
                i = R.attr.vk_ui_typography_footnote;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.attr.vk_ui_typography_caption2;
            }
            return e3m.g(i, context);
        }

        public int c(VkTile vkTile) {
            int i;
            Context context = vkTile.getContext();
            TextAlignment textAlignment = vkTile.getTextAlignment();
            vkTile.getTextSize();
            int i2 = com.vk.core.view.components.tile.a.$EnumSwitchMapping$4[textAlignment.ordinal()];
            if (i2 == 1) {
                i = R.attr.vk_ui_typography_subhead;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.attr.vk_ui_typography_caption1;
            }
            return e3m.g(i, context);
        }
    }

    /* compiled from: VkTile.kt */
    public static final class b {
        public final tlo0 a;

        public b(tlo0.h hVar) {
            this.a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            tlo0 tlo0Var = this.a;
            if (tlo0Var == null) {
                return 0;
            }
            return tlo0Var.hashCode();
        }

        public final String toString() {
            return bt.a(new StringBuilder("ExtraSubtitle(text="), this.a, ')');
        }
    }

    /* compiled from: VkTile.kt */
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
            return jq.c(new StringBuilder("Overtitle(text="), this.a, ')');
        }
    }

    /* compiled from: VkTile.kt */
    public static final class d {
        public final tlo0 a;
        public final int b;
        public final dko c;
        public final k1u0 d;
        public final dko e;
        public final k1u0 f;

        public d(tlo0 tlo0Var, int i, gko gkoVar, k1u0.a aVar, gko gkoVar2, k1u0.a aVar2, int i2) {
            i = (i2 & 2) != 0 ? 1 : i;
            gkoVar = (i2 & 4) != 0 ? null : gkoVar;
            k1u0 k1u0Var = (i2 & 8) != 0 ? k1u0.b.a : aVar;
            gkoVar2 = (i2 & 16) != 0 ? null : gkoVar2;
            k1u0 k1u0Var2 = (i2 & 32) != 0 ? k1u0.b.a : aVar2;
            this.a = tlo0Var;
            this.b = i;
            this.c = gkoVar;
            this.d = k1u0Var;
            this.e = gkoVar2;
            this.f = k1u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f);
        }

        public final int hashCode() {
            tlo0 tlo0Var = this.a;
            int a = shy.a(this.b, (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31, 31);
            dko dkoVar = this.c;
            int hashCode = (this.d.hashCode() + ((a + (dkoVar == null ? 0 : dkoVar.hashCode())) * 31)) * 31;
            dko dkoVar2 = this.e;
            return this.f.hashCode() + ((hashCode + (dkoVar2 != null ? dkoVar2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Subtitle(text=" + this.a + ", maxLines=" + this.b + ", iconBefore=" + this.c + ", iconBeforeTint=" + this.d + ", iconAfter=" + this.e + ", iconAfterTint=" + this.f + ')';
        }
    }

    /* compiled from: VkTile.kt */
    public static final class e {
        public final tlo0 a;
        public final int b;
        public final tlo0 c;
        public final dko d;
        public final k1u0 e;
        public final dko f;
        public final k1u0 g;
        public final dko h;
        public final k1u0 i;

        public e(tlo0 tlo0Var, int i, tlo0.h hVar, gko gkoVar, gko gkoVar2, k1u0 k1u0Var, gko gkoVar3, int i2) {
            i = (i2 & 2) != 0 ? 1 : i;
            hVar = (i2 & 4) != 0 ? null : hVar;
            gkoVar = (i2 & 8) != 0 ? null : gkoVar;
            k1u0.b bVar = k1u0.b.a;
            gkoVar2 = (i2 & 32) != 0 ? null : gkoVar2;
            k1u0Var = (i2 & 64) != 0 ? bVar : k1u0Var;
            gkoVar3 = (i2 & 128) != 0 ? null : gkoVar3;
            this.a = tlo0Var;
            this.b = i;
            this.c = hVar;
            this.d = gkoVar;
            this.e = bVar;
            this.f = gkoVar2;
            this.g = k1u0Var;
            this.h = gkoVar3;
            this.i = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f) && epx.f(this.g, eVar.g) && epx.f(this.h, eVar.h) && epx.f(this.i, eVar.i);
        }

        public final int hashCode() {
            tlo0 tlo0Var = this.a;
            int a = shy.a(this.b, (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31, 31);
            tlo0 tlo0Var2 = this.c;
            int hashCode = (a + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31;
            dko dkoVar = this.d;
            int hashCode2 = (this.e.hashCode() + ((hashCode + (dkoVar == null ? 0 : dkoVar.hashCode())) * 31)) * 31;
            dko dkoVar2 = this.f;
            int hashCode3 = (this.g.hashCode() + ((hashCode2 + (dkoVar2 == null ? 0 : dkoVar2.hashCode())) * 31)) * 31;
            dko dkoVar3 = this.h;
            return this.i.hashCode() + ((hashCode3 + (dkoVar3 != null ? dkoVar3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Title(text=" + this.a + ", maxLines=" + this.b + ", meta=" + this.c + ", iconBefore=" + this.d + ", iconBeforeTint=" + this.e + ", icon1=" + this.f + ", icon1Tint=" + this.g + ", icon2=" + this.h + ", icon2Tint=" + this.i + ')';
        }
    }

    /* compiled from: VkTile.kt */
    public interface f extends h {

        /* compiled from: VkTile.kt */
        public static final class a implements f {
            public final com.vk.core.view.components.picture.c a;
            public final Size b;
            public final hdu0 c;
            public final List<VkAvatarBadge> d;
            public final int e;

            public a() {
                throw null;
            }

            public a(com.vk.core.view.components.picture.c cVar, Size size, hdu0 hdu0Var, List list, int i, int i2) {
                hdu0Var = (i2 & 8) != 0 ? null : hdu0Var;
                list = (i2 & 16) != 0 ? EmptyList.b : list;
                i = (i2 & 32) != 0 ? 0 : i;
                this.a = cVar;
                this.b = size;
                this.c = hdu0Var;
                this.d = list;
                this.e = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Size size = this.b;
                int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 961;
                hdu0 hdu0Var = this.c;
                return Integer.hashCode(this.e) + fw3.a((hashCode2 + (hdu0Var != null ? hdu0Var.hashCode() : 0)) * 31, 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Avatar(content=");
                sb.append(this.a);
                sb.append(", customSize=");
                sb.append(this.b);
                sb.append(", overlay=null, border=");
                sb.append(this.c);
                sb.append(", badges=");
                sb.append(this.d);
                sb.append(", maxHeight=");
                return vu5.b(sb, this.e, ')');
            }
        }

        /* compiled from: VkTile.kt */
        public static final class b implements f {
            public final com.vk.core.view.components.picture.c a;
            public final Size b;
            public final float c;
            public final VkPicture.CornerRadius d;
            public final int e;

            public b(com.vk.core.view.components.picture.c cVar, Size size, float f, VkPicture.CornerRadius cornerRadius, int i, int i2) {
                cornerRadius = (i2 & 8) != 0 ? VkPicture.CornerRadius.Large : cornerRadius;
                i = (i2 & 512) != 0 ? 0 : i;
                this.a = cVar;
                this.b = size;
                this.c = f;
                this.d = cornerRadius;
                this.e = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && Float.compare(this.c, bVar.c) == 0 && this.d == bVar.d && this.e == bVar.e;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Size size = this.b;
                return Integer.hashCode(this.e) + ((this.d.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.c, (hashCode + (size == null ? 0 : size.hashCode())) * 31, 31)) * 887503681);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Picture(content=");
                sb.append(this.a);
                sb.append(", customSize=");
                sb.append(this.b);
                sb.append(", aspectRatio=");
                sb.append(this.c);
                sb.append(", cornerRadius=");
                sb.append(this.d);
                sb.append(", overlay=null, topLeftBadge=null, bottomLeftBadge=null, topRightBadge=null, bottomRightBadge=null, maxHeight=");
                return vu5.b(sb, this.e, ')');
            }
        }
    }

    /* compiled from: VkTile.kt */
    public interface g {
        void a(ConstraintLayout constraintLayout, h hVar);

        View getView();
    }

    /* compiled from: VkTile.kt */
    public interface h {
    }

    /* compiled from: VkTile.kt */
    public static final /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAlignment.values().length];
            try {
                iArr[TextAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkTile(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final bsv0 getRemoveIcon() {
        return (bsv0) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final csv0 getSelectedIcon() {
        return (csv0) this.A.getValue();
    }

    private final void setAvatarVisualContent(f.a aVar) {
        View view;
        if (this.B instanceof com.vk.core.view.components.tile.b) {
            return;
        }
        setVisualContentController(new com.vk.core.view.components.tile.b(getContext(), aVar.b));
        g gVar = this.B;
        if (gVar == null || (view = gVar.getView()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.G = "1:1";
        view.setLayoutParams(bVar);
    }

    private final void setOvertitleTextAppearance(int i2) {
        this.n.setTextAppearance(i2);
    }

    private final void setPictureVisualContent(f.b bVar) {
        if (this.B instanceof com.vk.core.view.components.tile.d) {
            return;
        }
        setVisualContentController(new com.vk.core.view.components.tile.d(getContext(), bVar.b));
    }

    private final void setSecondaryTextAppearance(int i2) {
        this.v.setTextAppearance(i2);
        this.y.setTextAppearance(i2);
        this.q.setTextAppearance(i2);
    }

    private final void setTitleTextAppearance(int i2) {
        this.p.setTextAppearance(i2);
    }

    @Override // xsna.too0
    public final void Ng() {
        c();
    }

    public final void a(int i2, View view) {
        View view2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar == null) {
            return;
        }
        g gVar = this.B;
        int id = (gVar == null || (view2 = gVar.getView()) == null) ? 0 : view2.getId();
        int i3 = bVar.t;
        if (i3 == i2 || i3 == 0) {
            i3 = id;
        }
        bVar.t = i3;
        int i4 = bVar.v;
        if (i4 == i2 || i4 == 0) {
            i4 = id;
        }
        bVar.v = i4;
        int i5 = bVar.e;
        if (i5 == i2 || i5 == 0) {
            i5 = id;
        }
        bVar.e = i5;
        int i6 = bVar.h;
        if (i6 != i2 && i6 != 0) {
            id = i6;
        }
        bVar.h = id;
        view.setLayoutParams(bVar);
    }

    public final void b() {
        List<View> list;
        g gVar = this.B;
        View[] viewArr = {gVar != null ? gVar.getView() : null, getRemoveIcon(), getSelectedIcon()};
        ConstraintLayout constraintLayout = this.m;
        if (constraintLayout.getChildCount() > 0) {
            int i2 = 0 + 1;
            View childAt = constraintLayout.getChildAt(0);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 < constraintLayout.getChildCount()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(childAt);
                while (true) {
                    if (!(i2 < constraintLayout.getChildCount())) {
                        list = arrayList;
                        break;
                    }
                    int i3 = i2 + 1;
                    View childAt2 = constraintLayout.getChildAt(i2);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    arrayList.add(childAt2);
                    i2 = i3;
                }
            } else {
                list = Collections.singletonList(childAt);
            }
        } else {
            list = EmptyList.b;
        }
        for (View view : list) {
            if (!rl3.G(viewArr, view)) {
                constraintLayout.removeView(view);
            }
        }
    }

    public final void c() {
        int i2;
        int c2 = this.l.c(this);
        int b2 = this.l.b(this);
        Context context = getContext();
        int i3 = com.vk.core.view.components.tile.a.$EnumSwitchMapping$4[this.b.ordinal()];
        int i4 = 2;
        if (i3 == 1) {
            i2 = R.attr.vk_ui_typography_footnote;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.attr.vk_ui_typography_caption2;
        }
        int g2 = e3m.g(i2, context);
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size2_xs, getContext());
        int i5 = i.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i4 = 4;
        }
        d();
        setOvertitleTextAppearance(g2);
        setTitleTextAppearance(c2);
        setSecondaryTextAppearance(b2);
        int i6 = i4 == 4 ? 17 : 8388627;
        getContext();
        VkFadeText vkFadeText = this.n;
        vkFadeText.setFade(false);
        VkFadeText vkFadeText2 = this.p;
        vkFadeText2.setTextAlignment(i4);
        getContext();
        vkFadeText2.setFade(false);
        GapLinearLayout gapLinearLayout = this.o;
        gapLinearLayout.setGravity(i6);
        gapLinearLayout.setGap(e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext()));
        getContext();
        this.v.setFade(false);
        int a3 = e3m.a(R.dimen.vk_ui_spacing_size_s, getContext());
        GapLinearLayout gapLinearLayout2 = this.u;
        gapLinearLayout2.setGap(a3);
        getContext();
        VkFadeText vkFadeText3 = this.y;
        vkFadeText3.setFade(false);
        ViewGroup.LayoutParams layoutParams = vkFadeText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i6;
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, a2);
        vkFadeText.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = gapLinearLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.gravity = i6;
        gapLinearLayout.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = gapLinearLayout2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.gravity = i6;
        layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, a2, ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin);
        gapLinearLayout2.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = vkFadeText3.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.gravity = i6;
        layoutParams8.setMargins(((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin, a2, ((ViewGroup.MarginLayoutParams) layoutParams8).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin);
        vkFadeText3.setLayoutParams(layoutParams8);
    }

    public final void d() {
        int a2 = this.l.a(this);
        setPaddingRelative(a2, e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext()), a2, e3m.a(R.dimen.vk_ui_spacing_size_m, getContext()));
    }

    public final a getDecorator() {
        return this.l;
    }

    public final b getExtraSubtitle() {
        return this.j;
    }

    public final c getOvertitle() {
        return this.g;
    }

    public final d getSubtitle() {
        return this.i;
    }

    @Override // android.view.View, android.view.ViewParent
    public final TextAlignment getTextAlignment() {
        return this.b;
    }

    public final TextSize getTextSize() {
        return this.c;
    }

    public final e getTitle() {
        return this.h;
    }

    public final f getVisualContent() {
        return this.e;
    }

    public final h getVisualContentParams() {
        return this.k;
    }

    public final VisualContentType getVisualContentType() {
        return this.f;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        boolean z = View.MeasureSpec.getMode(i2) == 1073741824;
        ConstraintLayout constraintLayout = this.m;
        if (view == constraintLayout) {
            ((ConstraintLayout) view).getLayoutParams().width = z ? -1 : -2;
            super.measureChildWithMargins(view, i2, i3, i4, i5);
        } else if (z) {
            super.measureChildWithMargins(view, i2, i3, i4, i5);
        } else {
            super.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(constraintLayout.getMeasuredWidth(), Integer.MIN_VALUE), 0, i4, i5);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        getContext();
        int a2 = (!(this.e instanceof f.a) || View.MeasureSpec.getMode(i2) == 1073741824) ? 0 : e3m.a(R.dimen.vk_ui_spacing_size_xs, getContext());
        ConstraintLayout constraintLayout = this.m;
        constraintLayout.setPaddingRelative(a2, constraintLayout.getPaddingTop(), a2, constraintLayout.getPaddingBottom());
        super.onMeasure(i2, i3);
    }

    public final void setBottomPaddingPreset(BottomPaddingPreset bottomPaddingPreset) {
        d();
    }

    public final void setDecorator(a aVar) {
        this.l = aVar;
        c();
    }

    public final void setExtraSubtitle(b bVar) {
        tlo0 tlo0Var;
        this.j = bVar;
        CharSequence charSequence = null;
        int i2 = (bVar != null ? bVar.a : null) != null ? 0 : 8;
        VkFadeText vkFadeText = this.y;
        vkFadeText.setVisibility(i2);
        if (bVar != null && (tlo0Var = bVar.a) != null) {
            charSequence = tlo0Var.a(getContext());
        }
        vkFadeText.setText(charSequence);
    }

    public final void setOvertitle(c cVar) {
        this.g = cVar;
        CharSequence a2 = cVar != null ? tlo0.b.a(cVar.a, getContext()) : null;
        int i2 = myc0.f(a2) ? 0 : 8;
        VkFadeText vkFadeText = this.n;
        vkFadeText.setVisibility(i2);
        vkFadeText.setText(a2);
    }

    public final void setRemovable(boolean z) {
        if (this.d != z) {
            this.d = z;
            ConstraintLayout constraintLayout = this.m;
            if (!z) {
                constraintLayout.removeView(getRemoveIcon());
                return;
            }
            bsv0 removeIcon = getRemoveIcon();
            constraintLayout.addView(removeIcon);
            a(0, removeIcon);
        }
    }

    public final void setRemoveIconClickListener(View.OnClickListener onClickListener) {
        getRemoveIcon().setOnClickListener(onClickListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r7 = getSelectedIcon();
        r2.addView(r7);
        a(0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r2.removeView(getSelectedIcon());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelected(boolean z) {
        super.setSelected(z);
        int i2 = 0;
        while (true) {
            ConstraintLayout constraintLayout = this.m;
            boolean z2 = true;
            if (!(i2 < constraintLayout.getChildCount())) {
                z2 = false;
                break;
            }
            int i3 = i2 + 1;
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.equals(getSelectedIcon())) {
                break;
            } else {
                i2 = i3;
            }
        }
    }

    public final void setSubtitle(d dVar) {
        dko dkoVar;
        dko dkoVar2;
        tlo0 tlo0Var;
        this.i = dVar;
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_secondary);
        CharSequence a2 = (dVar == null || (tlo0Var = dVar.a) == null) ? null : tlo0Var.a(getContext());
        this.u.setVisibility(myc0.f(a2) ? 0 : 8);
        VkFadeText vkFadeText = this.v;
        vkFadeText.setText(a2);
        vkFadeText.setMaxTextLines(dVar != null ? dVar.b : 1);
        vkFadeText.setVisibility(myc0.f(a2) ? 0 : 8);
        int i2 = (dVar != null ? dVar.c : null) != null ? 0 : 8;
        ImageView imageView = this.w;
        imageView.setVisibility(i2);
        imageView.setImageDrawable((dVar == null || (dkoVar2 = dVar.c) == null) ? null : dkoVar2.a(getContext()));
        k1u0 k1u0Var = dVar != null ? dVar.d : null;
        getContext();
        gpo0.h(imageView, k1u0Var, valueOf);
        int i3 = (dVar != null ? dVar.e : null) != null ? 0 : 8;
        ImageView imageView2 = this.x;
        imageView2.setVisibility(i3);
        imageView2.setImageDrawable((dVar == null || (dkoVar = dVar.e) == null) ? null : dkoVar.a(getContext()));
        k1u0 k1u0Var2 = dVar != null ? dVar.f : null;
        getContext();
        gpo0.h(imageView2, k1u0Var2, valueOf);
    }

    public final void setTextAlignment(TextAlignment textAlignment) {
        this.b = textAlignment;
        c();
    }

    public final void setTextSize(TextSize textSize) {
        this.c = textSize;
        c();
    }

    public final void setTitle(e eVar) {
        dko dkoVar;
        dko dkoVar2;
        dko dkoVar3;
        tlo0 tlo0Var;
        tlo0 tlo0Var2;
        this.h = eVar;
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent);
        CharSequence a2 = (eVar == null || (tlo0Var2 = eVar.a) == null) ? null : tlo0Var2.a(getContext());
        VkFadeText vkFadeText = this.p;
        vkFadeText.setText(a2);
        vkFadeText.setMaxTextLines(eVar != null ? eVar.b : 1);
        CharSequence a3 = (eVar == null || (tlo0Var = eVar.c) == null) ? null : tlo0Var.a(getContext());
        int i2 = myc0.f(a3) ? 0 : 8;
        TextView textView = this.q;
        textView.setVisibility(i2);
        textView.setText(a3);
        int i3 = (eVar != null ? eVar.d : null) != null ? 0 : 8;
        ImageView imageView = this.r;
        imageView.setVisibility(i3);
        imageView.setImageDrawable((eVar == null || (dkoVar3 = eVar.d) == null) ? null : dkoVar3.a(getContext()));
        k1u0 k1u0Var = eVar != null ? eVar.e : null;
        getContext();
        gpo0.h(imageView, k1u0Var, valueOf);
        int i4 = (eVar != null ? eVar.f : null) != null ? 0 : 8;
        ImageView imageView2 = this.s;
        imageView2.setVisibility(i4);
        imageView2.setImageDrawable((eVar == null || (dkoVar2 = eVar.f) == null) ? null : dkoVar2.a(getContext()));
        k1u0 k1u0Var2 = eVar != null ? eVar.g : null;
        getContext();
        gpo0.h(imageView2, k1u0Var2, valueOf);
        int i5 = (eVar != null ? eVar.h : null) != null ? 0 : 8;
        ImageView imageView3 = this.t;
        imageView3.setVisibility(i5);
        imageView3.setImageDrawable((eVar == null || (dkoVar = eVar.h) == null) ? null : dkoVar.a(getContext()));
        k1u0 k1u0Var3 = eVar != null ? eVar.i : null;
        getContext();
        gpo0.h(imageView3, k1u0Var3, Integer.valueOf(R.attr.vk_ui_icon_secondary));
    }

    public final void setVisualAndTextGap(VisualAndTextGap visualAndTextGap) {
        f4m.q(e3m.a(R.dimen.vk_ui_spacing_size_s, getContext()), this.m);
    }

    public final void setVisualContent(f fVar) {
        this.e = fVar;
        if (fVar == null) {
            setVisualContentController(null);
        } else if (fVar instanceof f.b) {
            setPictureVisualContent((f.b) fVar);
        } else {
            if (!(fVar instanceof f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            setAvatarVisualContent((f.a) fVar);
        }
        g gVar = this.B;
        if (gVar != null) {
            gVar.a(this.m, fVar);
        }
        c();
    }

    public final void setVisualContentController(g gVar) {
        int i2;
        g gVar2 = this.B;
        ConstraintLayout constraintLayout = this.m;
        if (gVar2 != null) {
            constraintLayout.removeView(gVar2.getView());
            i2 = gVar2.getView().getId();
        } else {
            i2 = 0;
        }
        if (gVar != null) {
            View view = gVar.getView();
            if (view.getId() == -1) {
                view.setId(View.generateViewId());
            }
            constraintLayout.addView(view, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar != null) {
                bVar.t = 0;
                bVar.i = 0;
                bVar.v = 0;
                bVar.l = 0;
            }
            gVar.a(constraintLayout, this.k);
        }
        this.B = gVar;
        int i3 = 0;
        while (true) {
            if (!(i3 < constraintLayout.getChildCount())) {
                return;
            }
            int i4 = i3 + 1;
            View childAt = constraintLayout.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (!childAt.equals(gVar != null ? gVar.getView() : null)) {
                a(i2, childAt);
            }
            i3 = i4;
        }
    }

    public final void setVisualContentParams(h hVar) {
        this.k = hVar;
        g gVar = this.B;
        if (gVar != null) {
            gVar.a(this.m, hVar);
        }
    }

    public final void setVisualContentType(VisualContentType visualContentType) {
        this.f = visualContentType;
        c();
    }

    public VkTile(Context context, AttributeSet attributeSet, int i2) {
        super(context, (i2 & 2) != 0 ? null : attributeSet, 0);
        this.b = TextAlignment.Center;
        this.c = TextSize.Small;
        this.f = VisualContentType.Other;
        this.l = new a();
        VisualAndTextGap visualAndTextGap = VisualAndTextGap.Default;
        BottomPaddingPreset bottomPaddingPreset = BottomPaddingPreset.Default;
        this.m = (ConstraintLayout) LayoutInflater.from(context).inflate(R.layout.ds_internal_tile, (ViewGroup) this, true).findViewById(R.id.visualContentSlot);
        VkFadeText vkFadeText = (VkFadeText) findViewById(R.id.overtitle);
        this.n = vkFadeText;
        this.o = (GapLinearLayout) findViewById(R.id.titleWrapper);
        VkFadeText vkFadeText2 = (VkFadeText) findViewById(R.id.title);
        this.p = vkFadeText2;
        TextView textView = (TextView) findViewById(R.id.titleMeta);
        this.q = textView;
        this.r = (ImageView) findViewById(R.id.titleIconBefore);
        this.s = (ImageView) findViewById(R.id.titleIcon1);
        this.t = (ImageView) findViewById(R.id.titleIcon2);
        this.u = (GapLinearLayout) findViewById(R.id.subtitleWrapper);
        VkFadeText vkFadeText3 = (VkFadeText) findViewById(R.id.subtitle);
        this.v = vkFadeText3;
        this.w = (ImageView) findViewById(R.id.subtitleIconBefore);
        this.x = (ImageView) findViewById(R.id.subtitleIconAfter);
        VkFadeText vkFadeText4 = (VkFadeText) findViewById(R.id.extraSubtitle);
        this.y = vkFadeText4;
        nl1 nl1Var = new nl1(context, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z = msy.a(lazyThreadSafetyMode, nl1Var);
        this.A = msy.a(lazyThreadSafetyMode, new ol1(context));
        vkFadeText.setIncludeFontPadding(false);
        vkFadeText2.setIncludeFontPadding(false);
        vkFadeText2.setCustomCenterAlignmentEllipsize(true);
        textView.setIncludeFontPadding(false);
        vkFadeText3.setIncludeFontPadding(false);
        vkFadeText4.setIncludeFontPadding(false);
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(1);
        d();
    }
}
