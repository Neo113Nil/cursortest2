package com.vk.clips.design.view.camera.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.atn0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.iyn0;
import xsna.jyn0;
import xsna.l7s;
import xsna.n8g;
import xsna.oyt;
import xsna.rl3;
import xsna.vqo;

/* compiled from: TabsRecycler.kt */
/* loaded from: classes.dex */
public final class TabsRecycler extends RecyclerView implements vqo {
    public final atn0 b;
    public final float c;
    public final float d;
    public final float e;
    public final Paint f;
    public final RectF g;
    public TextView h;
    public TextView i;
    public float j;
    public int k;
    public int l;
    public e m;
    public boolean n;
    public boolean o;
    public final ArrayList p;
    public d q;
    public final LinearLayoutManager r;
    public final LinkedList s;
    public a t;
    public Map<Integer, TextView> u;

    /* compiled from: TabsRecycler.kt */
    /* loaded from: classes16.dex */
    public interface a {
        boolean a(String str);

        void b(String str);
    }

    /* compiled from: TabsRecycler.kt */
    public interface b {
        void b(int i, boolean z);

        void e(float f, int i, int i2);
    }

    /* compiled from: TabsRecycler.kt */
    public final class c extends RecyclerView.Adapter<RecyclerView.e0> {

        /* compiled from: TabsRecycler.kt */
        /* loaded from: classes16.dex */
        public static final class a extends RecyclerView.e0 {
            public a(TextView textView) {
                super(textView);
            }
        }

        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return TabsRecycler.this.getItems().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            int i2;
            a hintsDelegate;
            TextView textView = (TextView) e0Var.itemView;
            TabsRecycler tabsRecycler = TabsRecycler.this;
            StoryCameraMode storyCameraMode = tabsRecycler.getItems().get(i);
            Context context = e0Var.itemView.getContext();
            switch (jyn0.$EnumSwitchMapping$0[tabsRecycler.getItems().get(i).ordinal()]) {
                case 1:
                    i2 = R.string.clips_mode;
                    break;
                case 2:
                    i2 = R.string.camera_ui_live;
                    break;
                case 3:
                    i2 = R.string.camera_ui_stories;
                    break;
                case 4:
                    i2 = R.string.camera_ui_pingpong;
                    break;
                case 5:
                    i2 = R.string.camera_ui_reverse;
                    break;
                case 6:
                    i2 = R.string.camera_ui_photo;
                    break;
                case 7:
                    i2 = R.string.camera_ui_video;
                    break;
                case 8:
                    i2 = R.string.camera_ui_story_video;
                    break;
                case 9:
                    i2 = R.string.camera_ui_qr_scanner;
                    break;
                case 10:
                    i2 = R.string.camera_ui_vmoji_create;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            textView.setText(context.getString(i2));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, (storyCameraMode == StoryCameraMode.CLIPS && (hintsDelegate = tabsRecycler.getHintsDelegate()) != null && hintsDelegate.a(HintId.INFO_CLIPS_CAMERA_MODE.getId())) ? R.drawable.clip_tab_dot : 0, 0);
            tabsRecycler.getViewsTabs().put(Integer.valueOf(i), textView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            TabsRecycler tabsRecycler = TabsRecycler.this;
            TextView textView = (TextView) ((LayoutInflater) tabsRecycler.getContext().getSystemService("layout_inflater")).inflate(R.layout.create_camera_tab_item, viewGroup, false);
            textView.setOnClickListener(new oyt(tabsRecycler, 9));
            return new a(textView);
        }
    }

    /* compiled from: TabsRecycler.kt */
    public interface d {
        boolean a(MotionEvent motionEvent);
    }

    /* compiled from: TabsRecycler.kt */
    /* loaded from: classes16.dex */
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ int c;

        public e(int i) {
            this.c = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            TabsRecycler tabsRecycler = TabsRecycler.this;
            RecyclerView.o layoutManager = tabsRecycler.getLayoutManager();
            if ((layoutManager != null ? layoutManager.getChildCount() : 0) <= 0 || tabsRecycler.getWidth() == 0) {
                return;
            }
            tabsRecycler.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Map<Integer, TextView> viewsTabs = tabsRecycler.getViewsTabs();
            int i = this.c;
            TextView textView = viewsTabs.get(Integer.valueOf(i));
            if (textView != null) {
                TabsRecycler.e(textView, 1.0f);
            }
            tabsRecycler.d(i, false);
            tabsRecycler.setInited(true);
            tabsRecycler.m = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabsRecycler(Context context, AttributeSet attributeSet) {
        super(new l7s(r0, dhr0.u().c), attributeSet, 0);
        dhr0 dhr0Var = dhr0.a;
        dhr0Var.getClass();
        l7s l7sVar = new l7s(context, dhr0.u().c);
        dhr0Var.getClass();
        atn0 atn0Var = new atn0();
        this.b = atn0Var;
        this.c = cn70.c(32);
        this.d = cn70.c(6);
        this.e = cn70.c(10);
        this.g = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 200.0f, getHeight());
        this.n = true;
        ArrayList arrayList = new ArrayList();
        this.p = arrayList;
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.r = linearLayoutManager;
        this.s = new LinkedList();
        setClipToPadding(false);
        setClipChildren(false);
        setScrollingTouchSlop(1);
        setOverScrollMode(2);
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(e3m.f(R.attr.vk_ui_background_secondary_alpha, getContext()));
        setLayoutManager(linearLayoutManager);
        atn0Var.attachToRecyclerView(this);
        setOnFlingListener(new iyn0(this));
        setAdapter(new c());
        addOnScrollListener(new com.vk.clips.design.view.camera.widgets.a(this));
        arrayList.add(new com.vk.clips.design.view.camera.widgets.b(this));
        this.u = new LinkedHashMap();
    }

    public static void e(TextView textView, float f) {
        textView.setTextColor(n8g.d(f, e3m.f(R.attr.vk_ui_text_secondary, textView.getContext()), e3m.f(R.attr.vk_ui_text_primary, textView.getContext())));
        Drawable drawable = (Drawable) rl3.S(2, textView.getCompoundDrawables());
        if (drawable != null) {
            drawable.setBounds(0, 0, an10.b((1.0f - f) * drawable.getIntrinsicWidth()), drawable.getIntrinsicHeight());
        }
        textView.setCompoundDrawables(null, null, drawable, null);
    }

    public final void a(boolean z) {
        float f;
        TextView textView;
        float width = getWidth() / 2.0f;
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            TextView textView2 = this.u.get(Integer.valueOf(i));
            if (textView2 != null) {
                if (width <= textView2.getX() + textView2.getWidth() && width >= textView2.getX()) {
                    this.h = textView2;
                    this.k = i;
                }
                if (!textView2.equals(this.h) && !textView2.equals(this.i)) {
                    e(textView2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
        }
        this.i = null;
        this.l = -1;
        this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TextView textView3 = this.h;
        if (textView3 != null) {
            f = (textView3.getWidth() / 2.0f) + textView3.getX();
            if (f > width) {
                int i2 = this.k - 1;
                if (i2 >= 0) {
                    this.l = i2;
                    this.i = this.u.get(Integer.valueOf(i2));
                }
            } else if (this.k + 1 < this.u.size()) {
                int i3 = this.k + 1;
                this.l = i3;
                this.i = this.u.get(Integer.valueOf(i3));
            }
        } else {
            f = 0.0f;
        }
        float width2 = ((this.h != null ? r7.getWidth() : 0) / 2.0f) + ((this.i != null ? r6.getWidth() : 0) / 2.0f);
        if (this.i != null) {
            this.j = (width - f) / width2;
        } else {
            if (this.h != null) {
                this.j = (width - f) / r1.getWidth();
            }
        }
        if (z) {
            this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f2 = this.j;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView = this.i) != null) {
            int i4 = this.k;
            TextView textView4 = this.h;
            this.h = textView;
            this.i = textView4;
            this.k = this.l;
            this.l = i4;
            this.j = f2 + 1;
        }
        TextView textView5 = this.h;
        if (textView5 != null) {
            if (this.i != null) {
                e(textView5, 1.0f - Math.abs(this.j));
            } else {
                e(textView5, 1.0f);
            }
        }
        TextView textView6 = this.i;
        if (textView6 != null) {
            e(textView6, Math.abs(this.j));
        }
    }

    public final void c(int i, List list) {
        LinkedList linkedList = this.s;
        linkedList.clear();
        linkedList.addAll(list);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        e eVar = this.m;
        if (eVar != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(eVar);
            this.m = null;
        }
        this.m = new e(i);
        getViewTreeObserver().addOnGlobalLayoutListener(this.m);
    }

    public final void d(int i, boolean z) {
        RecyclerView.o layoutManager;
        View childAt;
        atn0 atn0Var = this.b;
        RecyclerView recyclerView = atn0Var.c;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (childAt = layoutManager.getChildAt(i)) != null) {
            atn0Var.c.scrollBy(atn0Var.calculateDistanceToFinalSnap(layoutManager, childAt)[0], 0);
        }
        a(true);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(this.k, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d dVar = this.q;
        if ((dVar != null ? dVar.a(motionEvent) : false) || !this.n || motionEvent.getPointerCount() > 1) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final d getButtonTouchDelegate() {
        return this.q;
    }

    public final a getHintsDelegate() {
        return this.t;
    }

    public final boolean getInited() {
        return this.o;
    }

    public final List<StoryCameraMode> getItems() {
        return this.s;
    }

    public final LinearLayoutManager getLm() {
        return this.r;
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return getWidth() / 2;
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return getWidth() / 2;
    }

    public final List<b> getScrollListners() {
        return this.p;
    }

    public final boolean getScrollable() {
        return this.n;
    }

    public final atn0 getTabSnapHelper$ui_release() {
        return this.b;
    }

    public final Map<Integer, TextView> getViewsTabs() {
        return this.u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextView textView = this.h;
        if (textView != null) {
            TextView textView2 = this.i;
            RectF rectF = this.g;
            if (textView2 != null) {
                int abs = ((int) ((Math.abs(this.j) * (textView2.getWidth() - this.h.getWidth())) + this.h.getWidth())) / 2;
                rectF.left = (getWidth() / 2) - abs;
                rectF.right = (getWidth() / 2) + abs;
            } else {
                int width = textView.getWidth();
                int i = width / 2;
                float f = width;
                rectF.left = ((getWidth() / 2) - i) - (this.j * f);
                rectF.right = ((getWidth() / 2) + i) - (f * this.j);
            }
            float height = getHeight() - this.c;
            float f2 = this.d;
            rectF.top = height - f2;
            rectF.bottom = getHeight() - f2;
            float f3 = this.e;
            canvas.drawRoundRect(rectF, f3, f3, this.f);
        }
    }

    public final void setButtonTouchDelegate(d dVar) {
        this.q = dVar;
    }

    public final void setHintsDelegate(a aVar) {
        this.t = aVar;
    }

    public final void setInited(boolean z) {
        this.o = z;
    }

    public final void setScrollable(boolean z) {
        this.n = z;
    }

    public final void setViewsTabs(Map<Integer, TextView> map) {
        this.u = map;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollBy(int i, int i2) {
        this.b.h(0);
    }
}
