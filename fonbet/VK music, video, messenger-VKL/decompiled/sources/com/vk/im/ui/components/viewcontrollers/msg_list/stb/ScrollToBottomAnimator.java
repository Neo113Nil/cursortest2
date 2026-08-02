package com.vk.im.ui.components.viewcontrollers.msg_list.stb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.aj50;
import xsna.asp;
import xsna.bh10;
import xsna.bwt0;
import xsna.e43;
import xsna.epx;
import xsna.hyu;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.qny;
import xsna.s3q0;
import xsna.up;
import xsna.zrp;

/* compiled from: ScrollToBottomAnimator.kt */
/* loaded from: classes2.dex */
public final class ScrollToBottomAnimator {
    public static final DecelerateInterpolator d = new DecelerateInterpolator();
    public final ViewGroup a;
    public final List<Integer> b = e43.l(Integer.valueOf(R.id.scroll_to_reaction), Integer.valueOf(R.id.scroll_to_mention), Integer.valueOf(R.id.scroll_to_bottom));
    public final LinkedHashMap c = new LinkedHashMap();

    /* compiled from: ScrollToBottomAnimator.kt */
    public static final class Animation {
        public final Type a;
        public final float b;
        public final float c;
        public final ViewPropertyAnimator d;
        public final long e;
        public final izs<View, s3q0> f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ScrollToBottomAnimator.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type HIDE;
            public static final Type MOVE;
            public static final Type SHOW;

            static {
                Type type = new Type("SHOW", 0);
                SHOW = type;
                Type type2 = new Type("HIDE", 1);
                HIDE = type2;
                Type type3 = new Type("MOVE", 2);
                MOVE = type3;
                Type[] typeArr = {type, type2, type3};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Animation(Type type, float f, float f2, ViewPropertyAnimator viewPropertyAnimator, long j, izs<? super View, s3q0> izsVar) {
            this.a = type;
            this.b = f;
            this.c = f2;
            this.d = viewPropertyAnimator;
            this.e = j;
            this.f = izsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Animation)) {
                return false;
            }
            Animation animation = (Animation) obj;
            return this.a == animation.a && Float.compare(this.b, animation.b) == 0 && Float.compare(this.c, animation.c) == 0 && epx.f(this.d, animation.d) && this.e == animation.e && epx.f(this.f, animation.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + bh10.a((this.d.hashCode() + b.a(this.c, b.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Animation(type=");
            sb.append(this.a);
            sb.append(", targetY=");
            sb.append(this.b);
            sb.append(", targetAlpha=");
            sb.append(this.c);
            sb.append(", anim=");
            sb.append(this.d);
            sb.append(", recordTime=");
            sb.append(this.e);
            sb.append(", onFinish=");
            return up.c(sb, this.f, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScrollToBottomAnimator.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HIDE;
        public static final a SHOW;

        static {
            a aVar = new a("SHOW", 0);
            SHOW = aVar;
            a aVar2 = new a("HIDE", 1);
            HIDE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public ScrollToBottomAnimator(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static /* synthetic */ void b(ScrollToBottomAnimator scrollToBottomAnimator, View view, Animation.Type type, long j, float f, float f2, aj50 aj50Var, int i) {
        scrollToBottomAnimator.a(view, type, j, f, f2, 300L, (i & 32) != 0 ? new hyu(18) : aj50Var);
    }

    public static float f(View view) {
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight > 0) {
            return measuredHeight;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public final void a(View view, Animation.Type type, long j, float f, float f2, long j2, izs<? super View, s3q0> izsVar) {
        ViewPropertyAnimator translationZ = view.animate().setStartDelay(j).setInterpolator(d).setDuration(j2).withEndAction(new qny(this, view, izsVar)).alpha(f).translationY(f2).translationZ(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        translationZ.start();
        this.c.put(Integer.valueOf(view.getId()), new Animation(type, f2, f, translationZ, System.currentTimeMillis(), izsVar));
    }

    public final void c(ScrollToBottomView scrollToBottomView) {
        boolean i = i(scrollToBottomView, Animation.Type.SHOW);
        boolean i2 = i(scrollToBottomView, Animation.Type.HIDE);
        d(scrollToBottomView);
        if (i2) {
            d(scrollToBottomView);
            scrollToBottomView.setVisibility(0);
            scrollToBottomView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i) {
            g(scrollToBottomView);
        }
    }

    public final void d(View view) {
        Integer valueOf = Integer.valueOf(view.getId());
        LinkedHashMap linkedHashMap = this.c;
        Animation animation = (Animation) linkedHashMap.get(valueOf);
        if (animation != null) {
            animation.d.cancel();
        }
        linkedHashMap.remove(Integer.valueOf(view.getId()));
    }

    public final List<Integer> e(View view) {
        Integer valueOf = Integer.valueOf(view.getId());
        List<Integer> list = this.b;
        int indexOf = list.indexOf(valueOf);
        if (indexOf >= 0) {
            return j5g.y0(j5g.H0(list, indexOf));
        }
        throw new IllegalStateException(("View " + view + " not expected").toString());
    }

    public final void g(View view) {
        d(view);
        view.setVisibility(8);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final boolean h(View view) {
        return this.c.containsKey(Integer.valueOf(view.getId()));
    }

    public final boolean i(View view, Animation.Type type) {
        Animation.Type type2;
        Animation animation = (Animation) this.c.get(Integer.valueOf(view.getId()));
        return (animation == null || (type2 = animation.a) == null || type2 != type) ? false : true;
    }

    public final void j(a aVar, int i, View view, long j) {
        Pair pair;
        View findViewById = this.a.findViewById(i);
        if (findViewById == null || findViewById.equals(view) || i(findViewById, Animation.Type.HIDE) || !bwt0.K(findViewById)) {
            return;
        }
        a aVar2 = a.SHOW;
        LinkedHashMap linkedHashMap = this.c;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (aVar == aVar2) {
            pair = new Pair(Float.valueOf(f(findViewById) + findViewById.getTranslationY()), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        } else {
            if (i(findViewById, Animation.Type.MOVE)) {
                f = ((Animation) linkedHashMap.get(Integer.valueOf(findViewById.getId()))).b - findViewById.getTranslationY();
            }
            pair = new Pair(Float.valueOf(findViewById.getTranslationY()), Float.valueOf(f(view) + findViewById.getTranslationY() + f));
        }
        float floatValue = ((Number) pair.d()).floatValue();
        float floatValue2 = ((Number) pair.g()).floatValue();
        Animation animation = (Animation) linkedHashMap.get(Integer.valueOf(findViewById.getId()));
        if (animation != null) {
            long startDelay = animation.d.getStartDelay() - (System.currentTimeMillis() - animation.e);
            j = startDelay < 0 ? 0L : startDelay;
        }
        long j2 = j;
        if (h(findViewById)) {
            d(findViewById);
        }
        findViewById.setTranslationY(floatValue);
        findViewById.setTranslationZ(1.0f);
        b(this, findViewById, Animation.Type.MOVE, j2, 1.0f, floatValue2, null, 48);
    }

    public final void k(ScrollToBottomView scrollToBottomView, boolean z) {
        Animation.Type type = Animation.Type.SHOW;
        if (i(scrollToBottomView, type) || bwt0.K(scrollToBottomView)) {
            return;
        }
        long j = (h(scrollToBottomView) || !z) ? 0L : 200L;
        float translationY = h(scrollToBottomView) ? scrollToBottomView.getTranslationY() : (f(scrollToBottomView) + iah0.a(16)) * 0.75f;
        d(scrollToBottomView);
        scrollToBottomView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        scrollToBottomView.setVisibility(0);
        scrollToBottomView.setTranslationY(translationY);
        b(this, scrollToBottomView, type, j, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 48);
        Iterator<T> it = e(scrollToBottomView).iterator();
        while (it.hasNext()) {
            long j2 = j;
            j(a.SHOW, ((Number) it.next()).intValue(), scrollToBottomView, j2);
            j = j2;
        }
    }
}
