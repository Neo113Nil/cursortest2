package com.vk.libvideo.design.view.swipe.layout;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.bottomsheet.internal.f;
import xsna.g4x;
import xsna.iah0;

/* compiled from: AbstractSwipeLayout.java */
/* loaded from: classes2.dex */
public abstract class a extends FrameLayout {
    public static final C1235a o = new C1235a(Float.class, "volume");
    public static final b p = new b(Float.class, "videoViewsAlpha");
    public static final c q = new c(Integer.class, "backgroundAlpha");
    public final Rect b;
    public e c;
    public View d;
    public Float e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float l;
    public boolean m;
    public final com.vk.core.ui.bottomsheet.internal.f n;

    /* compiled from: AbstractSwipeLayout.java */
    /* renamed from: com.vk.libvideo.design.view.swipe.layout.a$a, reason: collision with other inner class name */
    public class C1235a extends Property<a, Float> {
        @Override // android.util.Property
        public final Float get(a aVar) {
            return Float.valueOf(aVar.getVolume());
        }

        @Override // android.util.Property
        public final void set(a aVar, Float f) {
            aVar.setVolume(f.floatValue());
        }
    }

    /* compiled from: AbstractSwipeLayout.java */
    public class b extends Property<a, Float> {
        @Override // android.util.Property
        public final Float get(a aVar) {
            return Float.valueOf(aVar.getVideoViewsAlpha());
        }

        @Override // android.util.Property
        public final void set(a aVar, Float f) {
            aVar.setVideoViewsAlpha(f.floatValue());
        }
    }

    /* compiled from: AbstractSwipeLayout.java */
    public class c extends Property<a, Integer> {
        @Override // android.util.Property
        public final Integer get(a aVar) {
            return Integer.valueOf(aVar.getBackgroundAlpha());
        }

        @Override // android.util.Property
        public final void set(a aVar, Integer num) {
            aVar.setBackgroundAlpha(num.intValue());
        }
    }

    /* compiled from: AbstractSwipeLayout.java */
    public class d extends f.c {
        public int a;
        public int b;

        public d() {
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int a(int i, @NonNull View view) {
            a aVar = a.this;
            if (!aVar.m) {
                return view.getLeft();
            }
            int paddingLeft = aVar.getPaddingLeft() - view.getRight();
            return Math.max(0, Math.min(Math.max(i, paddingLeft), aVar.getRight()));
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int b(int i, @NonNull View view) {
            a aVar = a.this;
            if (aVar.m) {
                return view.getTop();
            }
            int paddingTop = aVar.getPaddingTop() - view.getHeight();
            return Math.min(Math.max(i, paddingTop), aVar.getHeight());
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int c() {
            return a.this.getWidth();
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final int d() {
            return a.this.getHeight();
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void e(int i) {
            a aVar = a.this;
            aVar.m = true;
            aVar.n.b(i, aVar.d);
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void f() {
            a aVar = a.this;
            e eVar = aVar.c;
            if (eVar != null) {
                eVar.Lg();
            }
            View view = aVar.d;
            if (view instanceof ViewGroup) {
                aVar.g = (view.canScrollVertically(-1) || aVar.d.canScrollVertically(1)) && ((ViewGroup) aVar.d).getChildCount() > 1;
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void h(@NonNull View view, int i, int i2, int i3, int i4) {
            e eVar;
            a aVar = a.this;
            float abs = 1.0f - (Math.abs(0.5f - ((i2 + view.getHeight()) / (view.getHeight() + aVar.getHeight()))) * 2.0f);
            this.b = i4;
            this.a = i3;
            if (i2 != 0 && aVar.g && aVar.h == 0) {
                aVar.h = i2 > 0 ? 1 : -1;
            }
            if (!aVar.m) {
                i = i2;
            }
            float min = 1.0f - (Math.min(Math.abs(i), 150.0f) / 150.0f);
            Float f = aVar.e;
            if (f != null && aVar.f) {
                min = Math.min(f.floatValue(), min);
            }
            Float valueOf = Float.valueOf(min);
            aVar.e = valueOf;
            aVar.setVideoViewsAlpha(valueOf.floatValue());
            aVar.setBackgroundAlpha((int) (255.0f * abs));
            aVar.setVolume(1.0f - (aVar.m ? Math.min(1.0f, ((Math.abs(i) / aVar.getWidth()) * 3.0f) / 2.0f) : Math.min(1.0f, (Math.min(Math.abs(i), aVar.getHeight() / 2.0f) / aVar.getHeight()) * 3.0f)));
            if (abs == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !aVar.f && (eVar = aVar.c) != null) {
                eVar.Yb();
            }
            aVar.invalidate();
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final void i(@NonNull View view, float f, float f2) {
            float top;
            int height;
            a aVar = a.this;
            com.vk.core.ui.bottomsheet.internal.f fVar = aVar.n;
            if (aVar.m) {
                top = view.getLeft();
                height = aVar.getRight();
            } else {
                top = view.getTop() + (view.getHeight() >> 1);
                height = aVar.getHeight();
            }
            float f3 = top / height;
            aVar.f = false;
            aVar.e = null;
            if (aVar.g) {
                View view2 = aVar.d;
                if (view2 instanceof RecyclerView) {
                    ((RecyclerView) view2).getScrollState();
                }
            }
            if (!aVar.m) {
                float abs = Math.abs(f2) / (fVar.m - fVar.n);
                if ((Math.abs(this.b) >= aVar.i && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && abs > 0.2f && f3 > 0.5f) || (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 > 0.75f)) {
                    e eVar = aVar.c;
                    if (eVar != null) {
                        eVar.W6();
                    } else {
                        fVar.q(view.getLeft(), aVar.getHeight());
                    }
                } else if ((Math.abs(this.b) < aVar.i || f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || abs <= 0.4f) && (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 >= 0.25f)) {
                    fVar.q(view.getLeft(), (aVar.getHeight() - view.getHeight()) >> 1);
                } else {
                    e eVar2 = aVar.c;
                    if (eVar2 != null) {
                        eVar2.W6();
                    } else {
                        fVar.q(view.getLeft(), -view.getHeight());
                    }
                }
            } else if ((f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(this.a) < aVar.i) && (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 <= 0.45f)) {
                fVar.q(aVar.getLeft(), view.getTop());
            } else {
                e eVar3 = aVar.c;
                if (eVar3 != null) {
                    eVar3.W6();
                } else {
                    fVar.q(aVar.getLeft(), view.getTop());
                }
            }
            e eVar4 = aVar.c;
            if (eVar4 != null) {
                eVar4.fm();
            }
            aVar.h = 0;
            aVar.g = false;
            aVar.m = false;
            this.a = 0;
            this.b = 0;
            aVar.invalidate();
        }

        @Override // com.vk.core.ui.bottomsheet.internal.f.c
        public final boolean j(@NonNull View view, int i) {
            return a.this.d(view);
        }
    }

    /* compiled from: AbstractSwipeLayout.java */
    /* loaded from: classes.dex */
    public interface e {
        void Lg();

        boolean Sj();

        void W6();

        boolean Wh();

        void Yb();

        void fm();

        float getVolume();

        boolean h6();

        void setVolume(float f);
    }

    /* compiled from: AbstractSwipeLayout.java */
    public interface f {
        boolean a();

        boolean b();
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abstract void a(View view, g4x g4xVar);

    public abstract void b(View view, g4x g4xVar);

    public final void c() {
        this.n.p = 1;
    }

    public abstract boolean d(View view);

    public abstract int getBackgroundAlpha();

    public Rect getSystemWindowInsets() {
        return this.b;
    }

    public abstract float getVideoViewsAlpha();

    public abstract float getVolume();

    public abstract void setBackgroundAlpha(int i);

    public void setDragStartTouchSlop(int i) {
        this.j = i;
    }

    public void setMinVelocity(float f2) {
        this.n.n = iah0.a(f2);
    }

    public abstract void setNavigationCallback(e eVar);

    public void setTouchSlop(int i) {
        this.i = i;
    }

    public abstract void setVideoViewsAlpha(float f2);

    public abstract void setVolume(float f2);

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new Rect();
        com.vk.core.ui.bottomsheet.internal.f fVar = new com.vk.core.ui.bottomsheet.internal.f(getContext(), this, new d());
        fVar.b = (int) (4.0f * fVar.b);
        this.n = fVar;
        this.i = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
    }
}
