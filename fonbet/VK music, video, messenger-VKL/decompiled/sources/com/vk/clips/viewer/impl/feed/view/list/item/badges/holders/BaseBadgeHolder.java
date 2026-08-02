package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Size;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.design.view.component.badge.a;
import com.vk.clips.design.view.component.badge.b;
import com.vk.clips.design.view.component.badge.c;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.picture.VkImage;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.b8g;
import xsna.cn70;
import xsna.cut0;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.epx;
import xsna.gzs;
import xsna.ho8;
import xsna.izs;
import xsna.jjc;
import xsna.krv0;
import xsna.l7s;
import xsna.mhl;
import xsna.mih0;
import xsna.n9;
import xsna.rzt0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.u11;
import xsna.vfz;
import xsna.vu5;
import xsna.wzs;
import xsna.x7g;
import xsna.yy5;
import xsna.zrp;

/* compiled from: BaseBadgeHolder.kt */
/* loaded from: classes17.dex */
public abstract class BaseBadgeHolder<T extends mih0> extends vfz<T> {
    public static final /* synthetic */ int o = 0;
    public final ClipBadge l;
    public yy5 m;
    public Runnable n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseBadgeHolder.kt */
    public static final class BadgeSide {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeSide[] $VALUES;
        public static final BadgeSide LEFT;
        public static final BadgeSide RIGHT;

        static {
            BadgeSide badgeSide = new BadgeSide("LEFT", 0);
            LEFT = badgeSide;
            BadgeSide badgeSide2 = new BadgeSide("RIGHT", 1);
            RIGHT = badgeSide2;
            BadgeSide[] badgeSideArr = {badgeSide, badgeSide2};
            $VALUES = badgeSideArr;
            $ENTRIES = new asp(badgeSideArr);
        }

        public BadgeSide() {
            throw null;
        }

        public static BadgeSide valueOf(String str) {
            return (BadgeSide) Enum.valueOf(BadgeSide.class, str);
        }

        public static BadgeSide[] values() {
            return (BadgeSide[]) $VALUES.clone();
        }
    }

    /* compiled from: BaseBadgeHolder.kt */
    public interface a extends rzt0 {

        /* compiled from: BaseBadgeHolder.kt */
        /* renamed from: com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder$a$a, reason: collision with other inner class name */
        public static final class C0709a implements a {
            public final int a;
            public final int b;

            public C0709a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public static C0709a a(C0709a c0709a, int i) {
                int i2 = c0709a.a;
                c0709a.getClass();
                return new C0709a(i2, i);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0709a)) {
                    return false;
                }
                C0709a c0709a = (C0709a) obj;
                return this.a == c0709a.a && this.b == c0709a.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Icon(iconRes=");
                sb.append(this.a);
                sb.append(", iconTint=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: BaseBadgeHolder.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Picture(url="), this.a, ')');
            }
        }
    }

    /* compiled from: BaseBadgeHolder.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeSide.values().length];
            try {
                iArr[BadgeSide.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeSide.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BaseBadgeHolder.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Context, VkImage> {
        final /* synthetic */ izs<VkImage, s3q0> $setupImageView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(izs<? super VkImage, s3q0> izsVar) {
            super(1, epx.a.class, "createImageView", "setupImageContent$createImageView(Lkotlin/jvm/functions/Function1;Landroid/content/Context;)Lcom/vk/core/view/components/picture/VkImage;", 0);
            this.$setupImageView = izsVar;
        }

        @Override // xsna.izs
        public final VkImage invoke(Context context) {
            izs<VkImage, s3q0> izsVar = this.$setupImageView;
            int i = BaseBadgeHolder.o;
            VkImage vkImage = new VkImage(context, null, 6, 0);
            izsVar.invoke(vkImage);
            return vkImage;
        }
    }

    /* compiled from: BaseBadgeHolder.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<VkImage, Object, s3q0> {
        final /* synthetic */ wzs<VkImage, a, s3q0> $imageUpdate;
        final /* synthetic */ izs<a, Rect> $insetsProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(izs izsVar, wzs wzsVar) {
            super(2, epx.a.class, "updateImageView", "setupImageContent$updateImageView(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/vk/core/view/components/picture/VkImage;Ljava/lang/Object;)V", 0);
            this.$imageUpdate = wzsVar;
            this.$insetsProvider = izsVar;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(VkImage vkImage, Object obj) {
            BaseBadgeHolder.h6(this.$imageUpdate, this.$insetsProvider, vkImage, obj);
            return s3q0.a;
        }
    }

    /* compiled from: BaseBadgeHolder.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Context, VkImage> {
        final /* synthetic */ izs<VkImage, s3q0> $setupImageView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(izs<? super VkImage, s3q0> izsVar) {
            super(1, epx.a.class, "createImageView", "setupImageContent$createImageView(Lkotlin/jvm/functions/Function1;Landroid/content/Context;)Lcom/vk/core/view/components/picture/VkImage;", 0);
            this.$setupImageView = izsVar;
        }

        @Override // xsna.izs
        public final VkImage invoke(Context context) {
            izs<VkImage, s3q0> izsVar = this.$setupImageView;
            int i = BaseBadgeHolder.o;
            VkImage vkImage = new VkImage(context, null, 6, 0);
            izsVar.invoke(vkImage);
            return vkImage;
        }
    }

    /* compiled from: BaseBadgeHolder.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements wzs<VkImage, Object, s3q0> {
        final /* synthetic */ wzs<VkImage, a, s3q0> $imageUpdate;
        final /* synthetic */ izs<a, Rect> $insetsProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(izs izsVar, wzs wzsVar) {
            super(2, epx.a.class, "updateImageView", "setupImageContent$updateImageView(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/vk/core/view/components/picture/VkImage;Ljava/lang/Object;)V", 0);
            this.$imageUpdate = wzsVar;
            this.$insetsProvider = izsVar;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(VkImage vkImage, Object obj) {
            BaseBadgeHolder.h6(this.$imageUpdate, this.$insetsProvider, vkImage, obj);
            return s3q0.a;
        }
    }

    public BaseBadgeHolder(ViewGroup viewGroup) {
        super(new ClipBadge(viewGroup.getContext(), null, 6));
        this.l = (ClipBadge) this.itemView;
    }

    public static final void h6(wzs wzsVar, izs izsVar, VkImage vkImage, Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar == null) {
            return;
        }
        vkImage.clear();
        vkImage.setBackgroundImage(null);
        vkImage.setImageDrawable(null);
        if (!(aVar instanceof a.b)) {
            if (!(aVar instanceof a.C0709a)) {
                throw new NoWhenBranchMatchedException();
            }
            wzsVar.invoke(vkImage, aVar);
            Rect rect = (Rect) izsVar.invoke(aVar);
            a.C0709a c0709a = (a.C0709a) aVar;
            vkImage.setImageDrawable(new InsetDrawable((Drawable) dhr0.t.b(c0709a.a, c0709a.b), rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        wzsVar.invoke(vkImage, aVar);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(cn70.b(8));
        Context context = vkImage.getContext();
        e3m.a aVar2 = e3m.a;
        gradientDrawable.setColor(context.getColor(R.color.vk_white_alpha20));
        vkImage.setPlaceholderImage(gradientDrawable);
        vkImage.o0(((a.b) aVar).a, null);
    }

    public static void j6(ClipBadge clipBadge, mih0 mih0Var) {
        clipBadge.setEnabled(mih0Var.c());
    }

    public static void l6(ClipBadge clipBadge, BadgeSide badgeSide, Size size, gzs gzsVar) {
        Object obj;
        a aVar = (a) gzsVar.invoke();
        if (aVar != null) {
            int i = b.$EnumSwitchMapping$0[badgeSide.ordinal()];
            if (i == 1) {
                obj = new a.C0568a(size, aVar);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = new c.a.C0569a(size, aVar);
            }
        } else {
            obj = null;
        }
        int i2 = b.$EnumSwitchMapping$0[badgeSide.ordinal()];
        if (i2 == 1) {
            clipBadge.setLeft((com.vk.clips.design.view.component.badge.a) obj);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            clipBadge.setRightExtra((c.a) obj);
        }
    }

    public static void m6(ClipBadge clipBadge, CharSequence charSequence, Integer num) {
        b.a aVar = null;
        if (charSequence != null) {
            if (drm0.N(charSequence)) {
                charSequence = null;
            }
            if (charSequence != null) {
                aVar = new b.a(u11.f(tlo0.Companion, charSequence), new x7g(R.attr.vk_ui_text_contrast), num != null ? num.intValue() : Integer.MAX_VALUE, new tlo0.h(charSequence));
            }
        }
        clipBadge.setMiddle(aVar);
    }

    public static void o6(ClipBadge clipBadge, CharSequence charSequence) {
        clipBadge.setRightMain(charSequence != null ? new c.b.a(new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a(u11.f(tlo0.Companion, charSequence), new x7g(R.attr.vk_ui_text_contrast), new a.C0710a(new Size(cn70.b(1), cn70.b(12)), new x7g(R.attr.vk_ui_background_contrast_secondary_alpha)))) : null);
    }

    public static void q6(ClipBadge clipBadge, mih0 mih0Var) {
        ClipBadge.a aVar;
        mih0.o a2 = mih0Var.a();
        if (a2 != null) {
            cut0 cut0Var = ClipBadge.a.c.c.b;
            if (a2 instanceof mih0.o.a) {
                ArrayList arrayList = ((mih0.o.a) a2).a;
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                aVar = new ClipBadge.a.C0567a(arrayList, cut0Var);
            } else if (a2 instanceof mih0.o.c) {
                aVar = new ClipBadge.a.c(((mih0.o.c) a2).a, cut0Var);
            } else {
                if (!(a2 instanceof mih0.o.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context = clipBadge.getContext();
                TypedValue typedValue = krv0.a;
                Integer valueOf = krv0.b != null ? Integer.valueOf(dhr0.u().c) : null;
                l7s l7sVar = valueOf != null ? new l7s(context, valueOf.intValue()) : null;
                aVar = new ClipBadge.a.b(((mih0.o.b) a2).a, new x7g(R.attr.vk_ui_overlay_primary), new b8g(l7sVar != null ? e3m.f(R.attr.vk_ui_background_accent_themed, l7sVar) : -1));
            }
        } else {
            aVar = ClipBadge.a.c.c;
        }
        clipBadge.setAppearance(aVar);
    }

    public static void s6(ClipBadge clipBadge, mih0 mih0Var) {
        boolean f2 = mih0Var.f();
        Triple triple = f2 ? new Triple(Integer.valueOf(R.attr.vk_ui_text_contrast_themed), Integer.valueOf(R.attr.vk_ui_icon_primary_invariably), Integer.valueOf(R.attr.vk_ui_background_contrast)) : new Triple(Integer.valueOf(R.attr.vk_ui_text_contrast), Integer.valueOf(R.attr.vk_ui_icon_contrast), Integer.valueOf(R.attr.vk_ui_background_contrast_secondary_alpha));
        int intValue = ((Number) triple.d()).intValue();
        int intValue2 = ((Number) triple.g()).intValue();
        clipBadge.setAppearance(f2 ? new ClipBadge.a.c(new x7g(((Number) triple.h()).intValue()), new x7g(R.attr.vk_ui_transparent_active)) : ClipBadge.a.c.c);
        com.vk.clips.design.view.component.badge.a left = clipBadge.getLeft();
        if (left instanceof a.C0568a) {
            a.C0568a c0568a = (a.C0568a) left;
            rzt0 rzt0Var = c0568a.b;
            if (rzt0Var instanceof a.C0709a) {
                rzt0Var = a.C0709a.a((a.C0709a) rzt0Var, intValue2);
            }
            left = new a.C0568a(c0568a.a, rzt0Var);
        }
        clipBadge.setLeft(left);
        com.vk.clips.design.view.component.badge.b middle = clipBadge.getMiddle();
        if (middle instanceof b.a) {
            b.a aVar = (b.a) middle;
            middle = new b.a(aVar.a, new x7g(intValue), aVar.c, aVar.d);
        }
        clipBadge.setMiddle(middle);
        c.b rightMain = clipBadge.getRightMain();
        if (rightMain instanceof c.b.C0570b) {
            ((c.b.C0570b) rightMain).getClass();
            throw null;
        }
        clipBadge.setRightMain(rightMain);
        c.a rightExtra = clipBadge.getRightExtra();
        if (rightExtra instanceof c.a.C0569a) {
            c.a.C0569a c0569a = (c.a.C0569a) rightExtra;
            rzt0 rzt0Var2 = c0569a.a;
            if (rzt0Var2 instanceof a.C0709a) {
                rzt0Var2 = a.C0709a.a((a.C0709a) rzt0Var2, intValue2);
            } else if (rzt0Var2 instanceof com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a) {
                com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a aVar2 = (com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a) rzt0Var2;
                x7g x7gVar = new x7g(intValue);
                a.C0710a c0710a = new a.C0710a(aVar2.c.a, new x7g(intValue2));
                tlo0.h hVar = aVar2.a;
                aVar2.getClass();
                rzt0Var2 = new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a(hVar, x7gVar, c0710a);
            }
            rightExtra = new c.a.C0569a(c0569a.b, rzt0Var2);
        }
        clipBadge.setRightExtra(rightExtra);
    }

    @Override // xsna.vfz
    public void a6() {
        this.l.removeCallbacks(this.n);
        this.n = null;
    }

    public final void i6(ClipBadge clipBadge, mih0 mih0Var) {
        clipBadge.setClickable(mih0Var.b());
        clipBadge.setFocusable(mih0Var.b());
        jjc.g(clipBadge, mih0Var.b() ? new n9(3, this, mih0Var) : null);
    }

    public final void t6(BadgeSide badgeSide, izs<? super a, Rect> izsVar, izs<? super VkImage, s3q0> izsVar2, wzs<? super VkImage, ? super a, s3q0> wzsVar) {
        int i = b.$EnumSwitchMapping$0[badgeSide.ordinal()];
        ClipBadge clipBadge = this.l;
        if (i == 1) {
            c cVar = new c(izsVar2);
            d dVar = new d(izsVar, wzsVar);
            VKReplacerView a2 = clipBadge.a();
            mhl.a aVar = new mhl.a(new mhl(cVar, dVar), a2.getContext());
            clipBadge.f = aVar;
            s3q0 s3q0Var = s3q0.a;
            a2.a(aVar.getView());
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        e eVar = new e(izsVar2);
        f fVar = new f(izsVar, wzsVar);
        VKReplacerView b2 = clipBadge.b();
        mhl.a aVar2 = new mhl.a(new mhl(eVar, fVar), b2.getContext());
        clipBadge.h = aVar2;
        s3q0 s3q0Var2 = s3q0.a;
        b2.a(aVar2.getView());
    }
}
