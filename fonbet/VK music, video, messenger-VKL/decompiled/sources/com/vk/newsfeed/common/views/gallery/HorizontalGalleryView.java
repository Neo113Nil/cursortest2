package com.vk.newsfeed.common.views.gallery;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.o0;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.List;
import kotlin.Pair;
import xsna.ai5;
import xsna.am;
import xsna.anw;
import xsna.bwt0;
import xsna.cn70;
import xsna.d5r;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.gp10;
import xsna.iah0;
import xsna.ilp;
import xsna.n8g;
import xsna.ni5;
import xsna.pdv;
import xsna.r74;
import xsna.rdv;
import xsna.ro2;
import xsna.s6o;
import xsna.s980;
import xsna.sni;
import xsna.tr;
import xsna.u11;
import xsna.u1c0;
import xsna.vmw;
import xsna.y9t0;
import xsna.yuj;

/* compiled from: HorizontalGalleryView.kt */
/* loaded from: classes4.dex */
public final class HorizontalGalleryView extends ViewGroup {
    public static final /* synthetic */ int E = 0;
    public i A;
    public yuj B;
    public final Rect C;
    public final Rect D;
    public final AppCompatTextView b;
    public final RecyclerView c;
    public final e d;
    public final b e;
    public o0 f;
    public final a g;
    public final pdv h;
    public int i;
    public float j;
    public int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public View p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public Integer u;
    public final SparseIntArray v;
    public final GestureDetector w;
    public final GestureDetector x;
    public g y;
    public h z;

    /* compiled from: HorizontalGalleryView.kt */
    public final class a implements ai5 {
        public a() {
        }

        @Override // xsna.ai5
        public final y9t0 Eh(int i) {
            u1c0 u1c0Var = (u1c0) HorizontalGalleryView.this.h.c.c(i);
            if (u1c0Var == null) {
                return null;
            }
            return new y9t0(u1c0Var.a(), new ni5(u1c0Var.l, null, u1c0Var.e(), 10));
        }

        @Override // xsna.dkf0
        public final int getAdapterOffset() {
            return 0;
        }

        @Override // xsna.dkf0
        public final int getItemCount() {
            return HorizontalGalleryView.this.h.getItemCount();
        }

        @Override // xsna.dkf0
        public final RecyclerView getRecyclerView() {
            return HorizontalGalleryView.this.c;
        }

        @Override // xsna.ai5
        public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
            return VideoAutoPlayDelayType.FEED;
        }
    }

    /* compiled from: HorizontalGalleryView.kt */
    public static final class b extends RecyclerView.n {
        public int b;
        public rdv c;

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            this.c.b(this.b, rect);
        }
    }

    /* compiled from: HorizontalGalleryView.kt */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: HorizontalGalleryView.kt */
    public final class d implements anw {
        public final float[] a;

        public d() {
            float[] fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = cn70.a() * 8.0f;
            }
            this.a = fArr;
        }

        @Override // xsna.anw
        public final String a(int i) {
            HorizontalGalleryView horizontalGalleryView = HorizontalGalleryView.this;
            Object c = horizontalGalleryView.h.c.c(horizontalGalleryView.v.get(i));
            r74 r74Var = c instanceof r74 ? (r74) c : null;
            Attachment attachment = r74Var != null ? r74Var.q : null;
            DocumentAttachment documentAttachment = attachment instanceof DocumentAttachment ? (DocumentAttachment) attachment : null;
            if (documentAttachment != null) {
                return documentAttachment.f;
            }
            return null;
        }

        @Override // xsna.anw
        public final float[] b() {
            return this.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        
            if (r1 != true) goto L13;
         */
        @Override // xsna.anw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final View c(int i) {
            boolean z;
            View childAt;
            boolean z2;
            HorizontalGalleryView horizontalGalleryView = HorizontalGalleryView.this;
            int i2 = horizontalGalleryView.v.get(i);
            u1c0 u1c0Var = (u1c0) horizontalGalleryView.h.c.c(i2);
            if (u1c0Var != null) {
                if (u1c0Var instanceof r74) {
                    Attachment attachment = ((r74) u1c0Var).q;
                    if (attachment instanceof PhotoAttachment) {
                        z2 = ((PhotoAttachment) attachment).l.Hb();
                        z = true;
                    }
                }
                z2 = false;
                z = true;
            }
            z = false;
            if (z) {
                return null;
            }
            View findViewByPosition = horizontalGalleryView.d.findViewByPosition(i2);
            return (!(findViewByPosition instanceof ViewGroup) || (childAt = ((ViewGroup) findViewByPosition).getChildAt(0)) == null) ? findViewByPosition : childAt;
        }

        @Override // xsna.anw
        public final Rect d(int i) {
            HorizontalGalleryView horizontalGalleryView = HorizontalGalleryView.this;
            Object findViewHolderForAdapterPosition = horizontalGalleryView.c.findViewHolderForAdapterPosition(horizontalGalleryView.v.get(i));
            if (findViewHolderForAdapterPosition instanceof vmw) {
                return ((vmw) findViewHolderForAdapterPosition).F2();
            }
            return null;
        }

        @Override // xsna.anw
        public final void e(int i) {
            HorizontalGalleryView horizontalGalleryView = HorizontalGalleryView.this;
            int i2 = horizontalGalleryView.v.get(i);
            pdv pdvVar = horizontalGalleryView.h;
            if (pdvVar.getItemCount() <= 0 || horizontalGalleryView.d(horizontalGalleryView.getSnapHelper()) % pdvVar.getItemCount() == i2) {
                return;
            }
            horizontalGalleryView.setCurrentItem(i2);
        }

        @Override // xsna.anw
        public final Integer f() {
            return HorizontalGalleryView.this.u;
        }

        @Override // xsna.anw
        public final Rect g() {
            return bwt0.F(HorizontalGalleryView.this.c);
        }

        @Override // xsna.anw
        public final void h(ImageViewer.c<AttachmentWithMedia> cVar) {
            i iVar = HorizontalGalleryView.this.A;
            if (iVar != null) {
                iVar.N(cVar);
            }
        }
    }

    /* compiled from: HorizontalGalleryView.kt */
    public static final class f extends ViewGroup.LayoutParams {
        public int a;

        public f(int i, int i2) {
            super(i, i2);
            this.a = 8388659;
        }
    }

    /* compiled from: HorizontalGalleryView.kt */
    public interface g {
        void C0(int i);
    }

    /* compiled from: HorizontalGalleryView.kt */
    public interface h {
        void A(int i);

        void l(int i);
    }

    /* compiled from: HorizontalGalleryView.kt */
    public interface i {
        void N(ImageViewer.c<AttachmentWithMedia> cVar);
    }

    /* compiled from: HorizontalGalleryView.kt */
    public final class j extends RecyclerView.t {
        public j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            h hVar;
            super.onScrollStateChanged(recyclerView, i);
            HorizontalGalleryView horizontalGalleryView = HorizontalGalleryView.this;
            int d = horizontalGalleryView.d(horizontalGalleryView.getSnapHelper());
            if (i != 0 || d == -1 || (hVar = horizontalGalleryView.z) == null) {
                return;
            }
            hVar.l(d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            HorizontalGalleryView horizontalGalleryView = HorizontalGalleryView.this;
            int d = horizontalGalleryView.d(horizontalGalleryView.getSnapHelper());
            if (horizontalGalleryView.o == d || d == -1) {
                return;
            }
            horizontalGalleryView.f(d);
            h hVar = horizontalGalleryView.z;
            if (hVar != null) {
                hVar.A(d);
            }
        }
    }

    /* compiled from: HorizontalGalleryView.kt */
    public static final class k extends GestureDetector.SimpleOnGestureListener {
        public final int b;

        public k(Context context) {
            this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float abs = Math.abs(f2);
            return abs > Math.abs(f) && abs > ((float) this.b);
        }
    }

    public HorizontalGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(new ContextThemeWrapper(context, R.style.VkUiTypography_Paragraph));
        this.b = appCompatTextView;
        this.c = new RecyclerView(context);
        this.d = new e(context);
        sni sniVar = new sni(18);
        b bVar = new b();
        bVar.b = 0;
        bVar.c = sniVar;
        this.e = bVar;
        this.f = new g0();
        this.g = new a();
        this.h = new pdv(null);
        this.m = Integer.MAX_VALUE;
        this.n = 1.0f;
        this.o = -1;
        this.q = true;
        this.s = true;
        this.v = new SparseIntArray(10);
        this.w = new GestureDetector(context, new c());
        this.x = new GestureDetector(context, new k(context));
        this.C = new Rect();
        this.D = new Rect();
        new DecelerateInterpolator();
        appCompatTextView.setId(R.id.gallery_label);
        Pair pair = new Pair(Float.valueOf(cn70.a() * 18.0f), Integer.valueOf(R.color.vk_gray_800));
        float floatValue = ((Number) pair.d()).floatValue();
        int intValue = ((Number) pair.g()).intValue();
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = floatValue;
        }
        e3m.a aVar = e3m.a;
        int l = n8g.l(context.getColor(intValue), 179);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(l);
        this.b.setBackground(shapeDrawable);
        this.b.setTextColor(-1);
        this.b.setPadding(cn70.b(8), cn70.b(3), cn70.b(8), cn70.b(3));
        com.vk.typography.b.k(this.b, FontFamily.MEDIUM, Float.valueOf(12.0f), 4);
        this.b.setIncludeFontPadding(false);
        this.b.setVisibility(e() ? 8 : 0);
        this.c.setId(R.id.carousel);
        this.c.setLayoutManager(this.d);
        this.c.setAdapter(this.h);
        this.c.setClipChildren(false);
        this.c.setClipToPadding(false);
        this.c.addItemDecoration(this.e);
        this.c.addOnScrollListener(new j());
        this.c.setNestedScrollingEnabled(false);
        getSnapHelper().attachToRecyclerView(this.c);
        this.h.j = new d();
        addView(this.c, new f(-1, -1));
        addView(this.b);
    }

    private final int getItemCount() {
        Integer num = this.u;
        return num != null ? num.intValue() : this.h.getItemCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 getSnapHelper() {
        return this.f;
    }

    public final void b(List<? extends r74> list, boolean z) {
        SparseIntArray sparseIntArray = this.v;
        int size = z ? 0 : sparseIntArray.size();
        if (z) {
            sparseIntArray.clear();
        }
        int size2 = list.size();
        int i2 = size;
        for (int i3 = 0; i3 < size2; i3++) {
            Attachment attachment = list.get(i3).q;
            if (((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) || ((attachment instanceof DocumentAttachment) && ((DocumentAttachment) attachment).Ib())) {
                sparseIntArray.append(i2, size + i3);
                i2++;
            }
        }
    }

    public final void c() {
        boolean e2 = e();
        this.b.setVisibility((!this.q || e2) ? 8 : 0);
        o0 snapHelper = getSnapHelper();
        RecyclerView recyclerView = !e2 ? this.c : null;
        if (recyclerView == null) {
            snapHelper.attachToRecyclerView(null);
        } else {
            post(new ro2(1, snapHelper, recyclerView));
        }
    }

    public final int d(o0 o0Var) {
        boolean e2 = e();
        e eVar = this.d;
        if (e2) {
            int w = eVar.w();
            if (w != getItemCount() - 1) {
                w = eVar.s();
            }
            if (w != -1) {
                return w;
            }
        }
        View findSnapView = o0Var.findSnapView(eVar);
        if (findSnapView == null) {
            return -1;
        }
        return eVar.getPosition(findSnapView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int childAdapterPosition;
        int[] calculateDistanceToFinalSnap;
        if (e() || !this.w.onTouchEvent(motionEvent)) {
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            RecyclerView recyclerView = this.c;
            View findChildViewUnder = recyclerView.findChildViewUnder(x, y);
            z = (findChildViewUnder == null || findChildViewUnder == getSnapHelper().findSnapView(recyclerView.getLayoutManager())) ? false : true;
            if (z && findChildViewUnder != null) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.dispatchTouchEvent(obtain);
                obtain.recycle();
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(findChildViewUnder)) != -1 && childAdapterPosition != d(getSnapHelper()) && (calculateDistanceToFinalSnap = getSnapHelper().calculateDistanceToFinalSnap(layoutManager, findChildViewUnder)) != null) {
                    int i2 = calculateDistanceToFinalSnap[0];
                    int i3 = calculateDistanceToFinalSnap[1];
                    if (i2 != 0 || i3 != 0) {
                        recyclerView.smoothScrollBy(i2, i3);
                    }
                }
            }
        }
        return z || super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        return getContext().getResources().getConfiguration().orientation == 2;
    }

    public final void f(int i2) {
        i iVar;
        this.o = i2;
        int itemCount = getItemCount();
        AppCompatTextView appCompatTextView = this.b;
        appCompatTextView.animate().cancel();
        appCompatTextView.setAlpha(1.0f);
        appCompatTextView.setText(getContext().getString(R.string.feed_gallery_counter_light, Integer.valueOf((i2 % itemCount) + 1), Integer.valueOf(itemCount)));
        if (this.r) {
            appCompatTextView.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(120L).setStartDelay(4000L).start();
        }
        View findSnapView = getSnapHelper().findSnapView(this.d);
        View view = this.p;
        if (view != findSnapView) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    viewGroup.getChildAt(i3).setActivated(false);
                }
            }
            ViewGroup viewGroup2 = findSnapView instanceof ViewGroup ? (ViewGroup) findSnapView : null;
            if (viewGroup2 != null) {
                int childCount2 = viewGroup2.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    viewGroup2.getChildAt(i4).setActivated(true);
                }
            }
            View view2 = this.p;
            if (view2 != null) {
                view2.setTag(R.id.carousel_active_item_tag, Boolean.FALSE);
            }
            if (findSnapView != null) {
                findSnapView.setTag(R.id.carousel_active_item_tag, Boolean.TRUE);
            }
            this.p = findSnapView;
        }
        g gVar = this.y;
        if (gVar != null) {
            gVar.C0(i2);
        }
        if (i2 < this.h.getItemCount() - 2 || (iVar = this.A) == null) {
            return;
        }
        iVar.N(null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        f fVar = new f(getContext(), attributeSet);
        fVar.a = 8388659;
        return fVar;
    }

    public final ai5 getAutoPlayProvider() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.b.animate().cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        boolean onTouchEvent = this.x.onTouchEvent(motionEvent);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!onTouchEvent);
        }
        if (!onTouchEvent) {
            setShouldHideLabel(true);
            if (!onInterceptTouchEvent && !e() && motionEvent.getActionMasked() == 1) {
                return !this.w.onTouchEvent(motionEvent);
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i4 - i2) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i5 - i3) - getPaddingBottom();
        int layoutDirection = getLayoutDirection();
        RecyclerView recyclerView = this.c;
        recyclerView.layout(paddingLeft, paddingTop, paddingRight, paddingBottom);
        Rect rect = this.C;
        rect.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView.getVisibility() != 8) {
            int measuredWidth = appCompatTextView.getMeasuredWidth();
            int measuredHeight = appCompatTextView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            f fVar = layoutParams instanceof f ? (f) layoutParams : null;
            int i6 = fVar != null ? fVar.a : 8388659;
            rect.top += this.l;
            rect.left = recyclerView.getPaddingLeft() + this.k + rect.left;
            rect.right -= recyclerView.getPaddingRight() + this.k;
            Rect rect2 = this.C;
            rect2.bottom -= this.l;
            Gravity.apply(i6, measuredWidth, measuredHeight, rect2, this.D, layoutDirection);
            Rect rect3 = this.D;
            appCompatTextView.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int a2 = gp10.a(i2, getSuggestedMinimumWidth(), View.MeasureSpec.getSize(i2), getPaddingRight() + getPaddingLeft());
        int i4 = this.m;
        RecyclerView recyclerView = this.c;
        int b2 = (int) u11.b(1.0f, this.j, Math.min(i4, (a2 - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()), 0.5f);
        int size = View.MeasureSpec.getSize(i2);
        int i5 = (int) ((b2 / this.n) + 0.5f);
        this.d.s = b2;
        recyclerView.measure(tr.a(size, 1073741823, 0, 1073741824), tr.a(i5, 1073741823, 0, 1073741824));
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView.getVisibility() != 8) {
            appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(size - this.k, 1073741823)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(i5 - this.l, 1073741823)), Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, i5);
    }

    public final void setAttachmentClickListener(s980 s980Var) {
        this.h.k = s980Var;
    }

    public final void setCanHideLabel(boolean z) {
        this.s = z;
    }

    public final void setContentHorizontalPaddings(int i2) {
        this.c.setPadding(i2, 0, i2, 0);
    }

    public final void setCornersDecoration(yuj yujVar) {
        boolean f2 = epx.f(this.B, yujVar);
        RecyclerView recyclerView = this.c;
        if (!f2) {
            yuj yujVar2 = this.B;
            if (yujVar2 != null) {
                recyclerView.removeItemDecoration(yujVar2);
            }
            if (yujVar != null) {
                recyclerView.addItemDecoration(yujVar);
            }
            this.B = yujVar;
        }
        if (yujVar != null) {
            if (yujVar.h != dhr0.M()) {
                yujVar.Ng();
                recyclerView.invalidateItemDecorations();
            }
        }
    }

    public final void setCurrentItem(int i2) {
        int min;
        if (i2 < 0 || i2 >= this.h.getItemCount()) {
            return;
        }
        RecyclerView recyclerView = this.c;
        recyclerView.stopScroll();
        int width = recyclerView.getWidth();
        if (width == 0) {
            min = (-this.i) / 2;
        } else {
            int paddingRight = width - (recyclerView.getPaddingRight() + recyclerView.getPaddingLeft());
            min = ((paddingRight - Math.min(this.m, paddingRight)) - this.i) / 2;
        }
        this.d.K(i2, min);
        f(i2);
    }

    public final void setDoubleLikeHelper(s6o s6oVar) {
        this.h.m = s6oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.ilp] */
    public final void setIsEndless(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        pdv pdvVar = this.h;
        if (z) {
            pdvVar = new ilp(pdvVar);
        }
        this.c.setAdapter(pdvVar);
    }

    public final void setItemTeasing(float f2) {
        if (this.j == f2) {
            return;
        }
        this.j = f2;
        requestLayout();
        invalidate();
    }

    public final void setItemsGap(int i2) {
        if (this.i != i2) {
            this.i = i2;
            this.e.b = i2;
            requestLayout();
            invalidate();
        }
    }

    public final void setItemsGapStrategy(rdv rdvVar) {
        b bVar = this.e;
        if (bVar.c != rdvVar) {
            bVar.c = rdvVar;
            this.c.invalidateItemDecorations();
        }
    }

    public final void setLabelBackground(Drawable drawable) {
        this.b.setBackground(drawable);
    }

    public final void setLabelGravity(int i2) {
        AppCompatTextView appCompatTextView = this.b;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        f fVar = layoutParams instanceof f ? (f) layoutParams : null;
        if (fVar == null || fVar.a == i2) {
            return;
        }
        fVar.a = i2;
        appCompatTextView.requestLayout();
    }

    public final void setLabelMarginEnd(int i2) {
        if (this.k != i2) {
            this.k = i2;
            requestLayout();
        }
    }

    public final void setLabelMarginTop(int i2) {
        if (this.l != i2) {
            this.l = i2;
            requestLayout();
        }
    }

    public final void setLabelVisible(boolean z) {
        this.q = z;
        this.b.setVisibility(z && !e() ? 0 : 8);
    }

    public final void setMaxHeight(int i2) {
        if (this.m != i2) {
            this.m = i2;
            requestLayout();
            invalidate();
        }
    }

    public final void setOnPageChangedListener(g gVar) {
        this.y = gVar;
    }

    public final void setOnScrollStateChangeListener(h hVar) {
        this.z = hVar;
    }

    public final void setPaginationDelegate(i iVar) {
        this.A = iVar;
    }

    public final void setPinController(FeedGoodsPhotoHolder.a aVar) {
        this.h.n = aVar;
    }

    public final void setPrefetchMediaEnabled(boolean z) {
        e eVar = this.d;
        boolean z2 = eVar.t;
        eVar.t = z;
        if (z != z2) {
            this.c.requestLayout();
        }
    }

    public final void setRatio(float f2) {
        if (this.n == f2) {
            return;
        }
        this.n = f2;
        requestLayout();
    }

    public final void setShouldHideLabel(boolean z) {
        this.r = z && this.s;
    }

    public final void setSnapHelper(o0 o0Var) {
        o0 o0Var2 = this.f;
        if (o0Var != o0Var2) {
            o0Var2.attachToRecyclerView(null);
            this.f = o0Var;
            o0Var.attachToRecyclerView(this.c);
        }
    }

    public final void setTotalCount(Integer num) {
        this.u = num;
    }

    public final void setViewPool(RecyclerView.u uVar) {
        this.c.setRecycledViewPool(uVar);
    }

    public final void setViewPools(d5r d5rVar) {
        this.h.h = d5rVar;
    }

    /* compiled from: HorizontalGalleryView.kt */
    public static final class e extends LinearLayoutManager {
        public final Rect r;
        public int s;
        public boolean t;

        public e(Context context) {
            super(0, false);
            this.r = new Rect();
        }

        public static boolean P(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean checkLayoutParams(RecyclerView.p pVar) {
            return pVar != null && ((ViewGroup.MarginLayoutParams) pVar).width == -1 && ((ViewGroup.MarginLayoutParams) pVar).height == -1;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final RecyclerView.p generateDefaultLayoutParams() {
            RecyclerView.p generateDefaultLayoutParams = super.generateDefaultLayoutParams();
            ((ViewGroup.MarginLayoutParams) generateDefaultLayoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) generateDefaultLayoutParams).height = -1;
            return generateDefaultLayoutParams;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
            RecyclerView.p generateLayoutParams = super.generateLayoutParams(context, attributeSet);
            ((ViewGroup.MarginLayoutParams) generateLayoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) generateLayoutParams).height = -1;
            return generateLayoutParams;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void measureChildWithMargins(View view, int i, int i2) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            calculateItemDecorationsForChild(view, this.r);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.s, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824);
            if (!view.isLayoutRequested() && isMeasurementCacheEnabled() && P(view.getWidth(), makeMeasureSpec, ((ViewGroup.MarginLayoutParams) pVar).width) && P(view.getHeight(), makeMeasureSpec2, ((ViewGroup.MarginLayoutParams) pVar).height)) {
                return;
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void o(RecyclerView.a0 a0Var, int[] iArr) {
            super.o(a0Var, iArr);
            iArr[1] = iArr[1] + (this.t ? iah0.f().widthPixels : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.v vVar, RecyclerView.a0 a0Var, am amVar) {
            super.onInitializeAccessibilityNodeInfo(vVar, a0Var, amVar);
            boolean z = true;
            boolean z2 = x() < getItemCount() - 1;
            boolean z3 = v() > 0;
            if (!z2) {
                amVar.i(am.a.i);
            }
            if (!z3) {
                amVar.i(am.a.j);
            }
            if (!z2 && !z3) {
                z = false;
            }
            amVar.y(z);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            RecyclerView.p generateLayoutParams = super.generateLayoutParams(layoutParams);
            ((ViewGroup.MarginLayoutParams) generateLayoutParams).width = -1;
            ((ViewGroup.MarginLayoutParams) generateLayoutParams).height = -1;
            return generateLayoutParams;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        if (layoutParams instanceof f) {
            f fVar = (f) layoutParams;
            f fVar2 = new f(fVar);
            fVar2.a = 8388659;
            fVar2.a = fVar.a;
            return fVar2;
        }
        f fVar3 = new f(layoutParams);
        fVar3.a = 8388659;
        return fVar3;
    }
}
