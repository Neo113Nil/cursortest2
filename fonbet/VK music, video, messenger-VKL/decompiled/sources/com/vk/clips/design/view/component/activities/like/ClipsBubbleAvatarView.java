package com.vk.clips.design.view.component.activities.like;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.awt0;
import xsna.dgn;
import xsna.e3m;
import xsna.epx;
import xsna.iah0;
import xsna.s3q0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ClipsBubbleAvatarView.kt */
/* loaded from: classes16.dex */
public final class ClipsBubbleAvatarView extends FrameLayout {
    public static final float k = iah0.b(0.5f);
    public static final int l = iah0.a(24);
    public static final int m = iah0.a(16);
    public static final int n = iah0.a(20);
    public static final int o = iah0.a(18);
    public static final int p = iah0.a(9);
    public static final int q = iah0.a(7);
    public static final int r = iah0.a(35);
    public static final int s = iah0.a(22);
    public static final int t = iah0.a(28);
    public static final int u = iah0.a(29);
    public static final int v = iah0.a(17);
    public static final int w = iah0.a(34);
    public static final int x = iah0.a(5);
    public b b;
    public a c;
    public Size d;
    public final VkAvatar e;
    public final VkAvatar f;
    public final VkAvatar g;
    public final VkCounter h;
    public final Paint i;
    public final RectF j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsBubbleAvatarView.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SMALL;
        private final int side;

        static {
            Size size = new Size(iah0.a(56));
            SMALL = size;
            Size[] sizeArr = {size};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size(int i) {
            this.side = i;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }

        public final int h() {
            return this.side;
        }
    }

    /* compiled from: ClipsBubbleAvatarView.kt */
    public interface a {

        /* compiled from: ClipsBubbleAvatarView.kt */
        /* renamed from: com.vk.clips.design.view.component.activities.like.ClipsBubbleAvatarView$a$a, reason: collision with other inner class name */
        public static final class C0564a implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0564a)) {
                    return false;
                }
                ((C0564a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Custom(background=null, border=null)";
            }
        }

        /* compiled from: ClipsBubbleAvatarView.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 342842800;
            }

            public final String toString() {
                return "Primary";
            }
        }
    }

    /* compiled from: ClipsBubbleAvatarView.kt */
    public interface b {

        /* compiled from: ClipsBubbleAvatarView.kt */
        public static final class a implements b {
            public final c.d a;
            public final c.d b;
            public final c c;

            public a(c.d dVar, c.d dVar2, c.d dVar3) {
                this.a = dVar;
                this.b = dVar2;
                this.c = dVar3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
                c cVar = this.c;
                return hashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public final String toString() {
                return "Avatars(primary=" + this.a + ", secondary=" + this.b + ", tertiary=" + this.c + ')';
            }
        }

        /* compiled from: ClipsBubbleAvatarView.kt */
        /* renamed from: com.vk.clips.design.view.component.activities.like.ClipsBubbleAvatarView$b$b, reason: collision with other inner class name */
        public static final class C0565b implements b {
            public final c.d a;
            public final c.d b;
            public final int c;

            public C0565b(c.d dVar, c.d dVar2, int i) {
                this.a = dVar;
                this.b = dVar2;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0565b)) {
                    return false;
                }
                C0565b c0565b = (C0565b) obj;
                return this.a.equals(c0565b.a) && this.b.equals(c0565b.b) && this.c == c0565b.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AvatarsWithCounter(primary=");
                sb.append(this.a);
                sb.append(", secondary=");
                sb.append(this.b);
                sb.append(", count=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    public ClipsBubbleAvatarView(Context context) {
        super(context, null, 0);
        this.c = a.b.a;
        this.d = Size.SMALL;
        VkAvatar c = c(R.id.clip_bubble_first_inner_avatar, l);
        this.e = c;
        int i = m;
        VkAvatar c2 = c(R.id.clip_bubble_second_inner_avatar, i);
        this.f = c2;
        VkAvatar c3 = c(R.id.clip_bubble_third_inner_avatar, i);
        this.g = c3;
        VkCounter vkCounter = new VkCounter(getContext(), null);
        vkCounter.setId(R.id.clip_bubble_avatar_counter);
        int i2 = o;
        vkCounter.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        vkCounter.setAppearance(new VkCounter.CounterAppearance.a(R.attr.vk_ui_background_contrast_secondary_alpha, R.attr.vk_ui_text_contrast));
        this.h = vkCounter;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.i = paint;
        this.j = new RectF();
        addView(c);
        addView(c2);
        addView(c3);
        addView(vkCounter);
        a(this.c);
        b(this.b);
    }

    public static void d(int i, int i2, View view) {
        dgn.b(view, i2, i, i2, view.getMeasuredWidth() + i);
    }

    public final void a(a aVar) {
        if (aVar instanceof a.b) {
            this.i.setColor(e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, getContext()));
        } else {
            if (!(aVar instanceof a.C0564a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((a.C0564a) aVar).getClass();
            getContext();
            throw null;
        }
    }

    public final void b(b bVar) {
        boolean z = false;
        boolean z2 = bVar != null;
        VkAvatar vkAvatar = this.e;
        awt0.v(vkAvatar, z2);
        boolean z3 = bVar != null;
        VkAvatar vkAvatar2 = this.f;
        awt0.v(vkAvatar2, z3);
        s3q0 s3q0Var = s3q0.a;
        if (bVar != null) {
            Integer valueOf = Integer.valueOf(m);
            if (!(bVar instanceof b.a) || ((b.a) bVar).c == null) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : n;
            vkAvatar2.setLayoutParams(new ViewGroup.LayoutParams(intValue, intValue));
        }
        boolean z4 = bVar instanceof b.a;
        if (z4 && ((b.a) bVar).c != null) {
            z = true;
        }
        VkAvatar vkAvatar3 = this.g;
        awt0.v(vkAvatar3, z);
        boolean z5 = bVar instanceof b.C0565b;
        VkCounter vkCounter = this.h;
        awt0.v(vkCounter, z5);
        if (z4) {
            b.a aVar = (b.a) bVar;
            vkAvatar.setContent(aVar.a);
            vkAvatar2.setContent(aVar.b);
            vkAvatar3.setContent(aVar.c);
            return;
        }
        if (z5) {
            b.C0565b c0565b = (b.C0565b) bVar;
            vkAvatar.setContent(c0565b.a);
            vkAvatar2.setContent(c0565b.b);
            vkCounter.setCounterWithoutAnimation(c0565b.c);
        }
    }

    public final VkAvatar c(int i, int i2) {
        VkAvatar vkAvatar = new VkAvatar(getContext(), null, 6, 0);
        vkAvatar.setId(i);
        vkAvatar.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        vkAvatar.y0(k, e3m.f(R.attr.vk_ui_image_border_alpha, vkAvatar.getContext()));
        return vkAvatar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawOval(this.j, this.i);
        super.dispatchDraw(canvas);
    }

    public final a getAppearance() {
        return this.c;
    }

    public final b getContent() {
        return this.b;
    }

    public final Size getSize() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b bVar = this.b;
        b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
        boolean z2 = (aVar != null ? aVar.c : null) != null;
        Integer valueOf = Integer.valueOf(x);
        VkCounter vkCounter = this.h;
        int measuredWidth = vkCounter.getMeasuredWidth();
        int i5 = v;
        int i6 = measuredWidth + i5;
        int i7 = r;
        Integer num = i6 > i7 ? valueOf : null;
        int intValue = num != null ? num.intValue() : 0;
        d(p, q, this.e);
        if (!z2) {
            i7 = t;
        }
        d(i7, z2 ? s - intValue : u, this.f);
        int i8 = w;
        d(i5, i8, this.g);
        d(i5, i8, vkCounter);
        this.j.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int h = this.d.h();
        setMeasuredDimension(h, h);
        int i3 = 0;
        while (true) {
            if (!(i3 < getChildCount())) {
                return;
            }
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
            i3 = i4;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
    }

    public final void setAppearance(a aVar) {
        if (epx.f(this.c, aVar)) {
            return;
        }
        this.c = aVar;
        a(aVar);
    }

    public final void setContent(b bVar) {
        if (epx.f(this.b, bVar)) {
            return;
        }
        this.b = bVar;
        b(bVar);
        invalidate();
    }

    public final void setSize(Size size) {
        if (this.d == size) {
            return;
        }
        this.d = size;
        requestLayout();
    }
}
