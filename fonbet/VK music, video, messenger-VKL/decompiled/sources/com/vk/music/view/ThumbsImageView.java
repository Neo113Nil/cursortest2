package com.vk.music.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.GenericDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.dto.music.Thumb;
import com.vk.log.L;
import com.vk.music.R$styleable;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a8j0;
import xsna.ae;
import xsna.asu0;
import xsna.b780;
import xsna.bpn0;
import xsna.c5g;
import xsna.cqj0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.ep;
import xsna.epx;
import xsna.f5h0;
import xsna.fc6;
import xsna.fp;
import xsna.fpf0;
import xsna.gpw;
import xsna.gzs;
import xsna.hpf0;
import xsna.hta0;
import xsna.ic6;
import xsna.iez;
import xsna.j5g;
import xsna.kgw;
import xsna.kr6;
import xsna.lhs;
import xsna.lpa0;
import xsna.m33;
import xsna.mjw;
import xsna.mk6;
import xsna.n220;
import xsna.njt;
import xsna.o360;
import xsna.ojt;
import xsna.pjt;
import xsna.ppj0;
import xsna.qcy;
import xsna.qvf;
import xsna.rhs;
import xsna.sjo;
import xsna.sqf0;
import xsna.svf;
import xsna.too0;
import xsna.uvf;
import xsna.wqo0;
import xsna.ww8;
import xsna.xvf;
import xsna.yhn0;
import xsna.zso0;
import xsna.zuk;

/* compiled from: ThumbsImageView.kt */
/* loaded from: classes3.dex */
public final class ThumbsImageView extends GenericDraweeView implements too0, kgw {
    public static final Uri D = Uri.parse("");
    public static final ColorDrawable E = new ColorDrawable(0);
    public float A;
    public gzs<Boolean> B;
    public final ArrayList<String> C;
    public final ArrayList i;
    public List<Thumb> j;
    public boolean k;
    public int l;
    public mk6 m;
    public ThumbsImageView n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final boolean s;
    public Drawable t;
    public final RoundedCornersDrawable u;
    public b780 v;
    public boolean w;
    public int x;
    public int y;
    public float z;

    /* compiled from: ThumbsImageView.kt */
    public static final class a extends ae<uvf<svf>> {
        public static final b m = new b();
        public static final wqo0 n = new wqo0(new a8j0(5));
        public static final wqo0 o = new wqo0(new sqf0(7));
        public static final wqo0 p = new wqo0(new kr6(28));
        public final int h;
        public final b780 i;
        public final Paint j = new Paint(6);
        public final ae k;
        public final ppj0 l;

        /* compiled from: ThumbsImageView.kt */
        /* renamed from: com.vk.music.view.ThumbsImageView$a$a, reason: collision with other inner class name */
        public static final class C1358a extends ic6<List<? extends uvf<svf>>> {
            public final /* synthetic */ n220<ww8, svf> b;

            public C1358a(n220<ww8, svf> n220Var) {
                this.b = n220Var;
            }

            @Override // xsna.ic6, xsna.vvk
            public final void a() {
                a aVar = a.this;
                b780 b780Var = aVar.i;
                if (b780Var != null) {
                    b780Var.onCancel(aVar.l.a);
                }
            }

            @Override // xsna.ic6
            public final void e(zuk<List<? extends uvf<svf>>> zukVar) {
                a aVar = a.this;
                b780 b780Var = aVar.i;
                if (b780Var != null) {
                    b780Var.b(aVar.l.a, zukVar.b());
                }
                aVar.j(null, false, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
            @Override // xsna.ic6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void f(zuk<List<? extends uvf<svf>>> zukVar) {
                uvf<svf> uvfVar;
                b780 b780Var;
                a aVar = a.this;
                ppj0 ppj0Var = aVar.l;
                List<? extends uvf<svf>> result = zukVar.getResult();
                if (result != null && !result.isEmpty()) {
                    if (result.size() == 1) {
                        uvfVar = result.get(0);
                    } else {
                        hta0 g = rhs.c().g();
                        try {
                            int i = aVar.h;
                            g.getClass();
                            uvf<Bitmap> c = g.c(i, i, Bitmap.Config.ARGB_8888);
                            try {
                                aVar.m(result, new Canvas(c.r()));
                                uvfVar = uvf.v(xvf.B2(c, gpw.d, 0, 0));
                            } finally {
                                c.close();
                            }
                        } catch (Exception unused) {
                        }
                    }
                    uvf<svf> c2 = uvfVar == null ? this.b.c(ppj0Var, uvfVar) : null;
                    svf r = c2 == null ? c2.r() : null;
                    b780Var = aVar.i;
                    if (b780Var != null) {
                        b780Var.t(r != null ? r.getWidth() : 0, r != null ? r.getHeight() : 0, ppj0Var.a);
                    }
                    aVar.j(c2, true, null);
                }
                uvfVar = null;
                if (uvfVar == null) {
                }
                if (c2 == null) {
                }
                b780Var = aVar.i;
                if (b780Var != null) {
                }
                aVar.j(c2, true, null);
            }
        }

        /* compiled from: ThumbsImageView.kt */
        public static final class b {
            public static final /* synthetic */ qcy<Object>[] a;

            static {
                PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(b.class, "srcRect", "getSrcRect()Landroid/graphics/Rect;", 0);
                hpf0 hpf0Var = fpf0.a;
                a = new qcy[]{propertyReference1Impl, fp.c(0, b.class, "dstRect", "getDstRect()Landroid/graphics/Rect;", hpf0Var), ep.a(0, b.class, "stringBuilder", "getStringBuilder()Ljava/lang/StringBuilder;", hpf0Var)};
            }
        }

        public a(List<? extends Uri> list, int i, b780 b780Var) {
            this.h = i;
            this.i = b780Var;
            m.getClass();
            qcy<Object> qcyVar = b.a[2];
            wqo0 wqo0Var = p;
            wqo0Var.getClass();
            StringBuilder sb = (StringBuilder) wqo0Var.get();
            sb.setLength(0);
            sb.append("thumbs://");
            sb.append("music");
            sb.append("?");
            List<? extends Uri> list2 = list;
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                sb.append("thumb_hash_" + i2);
                sb.append("=");
                sb.append(((Uri) obj).hashCode());
                sb.append("&");
                i2 = i3;
            }
            sb.append("size");
            sb.append("=");
            sb.append(i);
            String sb2 = sb.toString();
            ppj0 ppj0Var = new ppj0(sb2);
            this.l = ppj0Var;
            n220<ww8, svf> n220Var = rhs.b().f;
            uvf<svf> uvfVar = n220Var.get(ppj0Var);
            b780 b780Var2 = this.i;
            if (b780Var2 != null) {
                b780Var2.g(sb2);
            }
            if (uvfVar != null && uvfVar.s()) {
                cqj0 cqj0Var = new cqj0();
                cqj0Var.l(uvfVar);
                this.k = cqj0Var;
                uvf<svf> result = getResult();
                svf r = result != null ? result.r() : null;
                b780 b780Var3 = this.i;
                if (b780Var3 != null) {
                    b780Var3.t(r != null ? r.getWidth() : 0, r != null ? r.getHeight() : 0, sb2);
                }
                j(uvfVar, true, null);
                return;
            }
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(rhs.b().a(ImageRequest.a((Uri) it.next()), null, ImageRequest.RequestLevel.FULL_FETCH, null, null));
            }
            zuk[] zukVarArr = (zuk[]) arrayList.toArray(new zuk[0]);
            iez l = iez.l((zuk[]) Arrays.copyOf(zukVarArr, zukVarArr.length));
            C1358a c1358a = new C1358a(n220Var);
            asu0.a.getClass();
            l.d(c1358a, asu0.n());
            this.k = l;
        }

        @Override // xsna.ae, xsna.zuk
        public final boolean close() {
            return super.close() && this.k.close();
        }

        public final void l(int i, int i2, int i3, int i4, Rect rect, Rect rect2) {
            int i5 = this.h;
            int i6 = i5 / 2;
            if (2 == i2) {
                if (i == 0) {
                    rect2.set(0, 0, i6, i5);
                    int i7 = i3 / 4;
                    rect.set(i7, 0, i7 * 3, i4);
                    return;
                } else {
                    rect2.set(i6, 0, i5, i5);
                    int i8 = i3 / 4;
                    rect.set(i8, 0, i8 * 3, i4);
                    return;
                }
            }
            if (3 == i2) {
                if (i == 0) {
                    rect2.set(0, 0, i6, i5);
                    int i9 = i3 / 4;
                    rect.set(i9, 0, i9 * 3, i4);
                    return;
                } else if (i != 1) {
                    rect2.set(i6, i6, i5, i5);
                    rect.set(0, 0, i3, i4);
                    return;
                } else {
                    rect2.set(i6, 0, i5, i6);
                    rect.set(0, 0, i3, i4);
                    return;
                }
            }
            if (4 == i2) {
                if (i == 0) {
                    rect2.set(0, 0, i6, i6);
                    rect.set(0, 0, i3, i4);
                } else if (i == 1) {
                    rect2.set(i6, 0, i5, i6);
                    rect.set(0, 0, i3, i4);
                } else if (i != 2) {
                    rect2.set(i6, i6, i5, i5);
                    rect.set(0, 0, i3, i4);
                } else {
                    rect2.set(0, i6, i6, i5);
                    rect.set(0, 0, i3, i4);
                }
            }
        }

        public final void m(List list, Canvas canvas) {
            int min = Math.min(list.size(), 4);
            for (int i = 0; i < min; i++) {
                uvf uvfVar = (uvf) list.get(i);
                try {
                    Object r = uvfVar.r();
                    qvf qvfVar = r instanceof qvf ? (qvf) r : null;
                    if (qvfVar == null) {
                        uvfVar.close();
                    } else {
                        Bitmap W3 = qvfVar.W3();
                        m.getClass();
                        wqo0 wqo0Var = n;
                        qcy<Object>[] qcyVarArr = b.a;
                        qcy<Object> qcyVar = qcyVarArr[0];
                        wqo0Var.getClass();
                        Rect rect = (Rect) wqo0Var.get();
                        wqo0 wqo0Var2 = o;
                        qcy<Object> qcyVar2 = qcyVarArr[1];
                        wqo0Var2.getClass();
                        l(i, min, W3.getWidth(), W3.getHeight(), rect, (Rect) wqo0Var2.get());
                        qcy<Object> qcyVar3 = qcyVarArr[0];
                        wqo0Var.getClass();
                        Rect rect2 = (Rect) wqo0Var.get();
                        qcy<Object> qcyVar4 = qcyVarArr[1];
                        wqo0Var2.getClass();
                        canvas.drawBitmap(W3, rect2, (Rect) wqo0Var2.get(), this.j);
                        uvfVar.close();
                    }
                } catch (Throwable th) {
                    uvf.q(uvfVar);
                    throw th;
                }
            }
        }
    }

    /* compiled from: ThumbsImageView.kt */
    public static final class b extends fc6<mjw> {
        public b() {
        }

        @Override // xsna.fc6, xsna.kqj
        public final void b(String str, Throwable th) {
            ThumbsImageView thumbsImageView = ThumbsImageView.this;
            b780 b780Var = thumbsImageView.v;
            if (b780Var != null) {
                b780Var.b(str, th);
            }
            if (thumbsImageView.t != null) {
                thumbsImageView.getHierarchy().s(thumbsImageView.t, f5h0.g.a);
            } else {
                thumbsImageView.getHierarchy().p(null, 1);
            }
        }

        @Override // xsna.fc6, xsna.kqj
        public final void d(String str) {
            b780 b780Var = ThumbsImageView.this.v;
            if (b780Var != null) {
                b780Var.onCancel(str);
            }
        }

        @Override // xsna.fc6, xsna.kqj
        public final void e(String str, Object obj, Animatable animatable) {
            mjw mjwVar = (mjw) obj;
            b780 b780Var = ThumbsImageView.this.v;
            if (b780Var != null) {
                b780Var.t(mjwVar != null ? mjwVar.getWidth() : 0, mjwVar != null ? mjwVar.getHeight() : 0, str);
            }
        }

        @Override // xsna.fc6, xsna.kqj
        public final void f(Object obj, String str) {
            b780 b780Var = ThumbsImageView.this.v;
            if (b780Var != null) {
                b780Var.g(str);
            }
        }
    }

    /* compiled from: ThumbsImageView.kt */
    public static final class c extends ViewOutlineProvider {
        public final /* synthetic */ float a;

        public c(float f) {
            this.a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
        }
    }

    public ThumbsImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static a d(ArrayList arrayList, ThumbsImageView thumbsImageView) {
        return new a(arrayList, thumbsImageView.getViewSize(), thumbsImageView.v);
    }

    public static final ColorDrawable getTransparentDrawable() {
        return E;
    }

    private final int getViewSize() {
        ThumbsImageView thumbsImageView = this.n;
        return thumbsImageView != null ? thumbsImageView.getViewSize() : this.l;
    }

    @Override // xsna.too0
    public final void Ng() {
        setEmptyPlaceholder(this.t);
        int i = this.q;
        if (i != 0) {
            setBackgroundAttrRes(i);
            return;
        }
        int i2 = this.r;
        if (i2 != 0) {
            setBackground(i2);
        }
    }

    @Override // com.facebook.drawee.view.GenericDraweeView
    public final void c(Context context, AttributeSet attributeSet) {
        if (lhs.d()) {
            lhs.a("GenericDraweeView#inflateHierarchy");
        }
        ojt d = pjt.d(context, attributeSet);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        d.o = e43.l(colorDrawable, colorDrawable);
        setAspectRatio(d.c);
        setHierarchy(d.a());
        if (lhs.d()) {
            lhs.b();
        }
    }

    public final void e(List<Thumb> list) {
        List<Thumb> list2 = this.j;
        if (list2 != null && list != null && list2.size() == list.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<Thumb> list3 = this.j;
                if (epx.f(list3 != null ? list3.get(i) : null, list.get(i))) {
                }
            }
            return;
        }
        this.j = list;
        if (getViewSize() < 0) {
            return;
        }
        f(list);
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    public final void f(List<Thumb> list) {
        Uri uri;
        Uri Cb;
        List<Thumb> list2 = list;
        if ((list2 == null || list2.isEmpty()) && this.t != null) {
            getHierarchy().s(this.t, f5h0.g.a);
        } else {
            getHierarchy().p(null, 1);
        }
        ArrayList arrayList = this.i;
        if (epx.f(arrayList, list)) {
            return;
        }
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        lpa0 e = rhs.e();
        e.d();
        e.l = getController();
        e.c = null;
        e.g = null;
        ArrayList<String> arrayList2 = this.C;
        arrayList2.clear();
        gzs<Boolean> gzsVar = this.B;
        boolean booleanValue = gzsVar != null ? gzsVar.invoke().booleanValue() : false;
        if (list == null) {
            e.c = null;
        } else if (list.isEmpty()) {
            e.c = null;
        } else {
            int size = list.size();
            Uri uri2 = D;
            if (size == 1) {
                Thumb thumb = (Thumb) j5g.Y(list);
                if (thumb != null && (Cb = thumb.Cb(getViewSize(), booleanValue)) != null) {
                    uri2 = Cb;
                }
                ImageRequestBuilder h = ImageRequestBuilder.h(uri2);
                h.g = ImageRequest.CacheChoice.SMALL;
                h.k = this.m;
                e.c = h.a();
                e.h = new zso0(this);
                arrayList2.add(uri2.toString());
            } else {
                List<Thumb> H0 = j5g.H0(list, 4);
                final ArrayList arrayList3 = new ArrayList(c5g.u(H0, 10));
                for (Thumb thumb2 : H0) {
                    if (thumb2 == null || (uri = thumb2.Cb(getViewSize(), booleanValue)) == null) {
                        uri = uri2;
                    }
                    arrayList3.add(uri);
                }
                e.g = new yhn0() { // from class: xsna.yso0
                    @Override // xsna.yhn0
                    public final Object get() {
                        return ThumbsImageView.d(arrayList3, this);
                    }
                };
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((Uri) it.next()).toString());
                }
                arrayList2.addAll(arrayList4);
            }
        }
        e.h = new b();
        setController(e.b());
    }

    public final void g(float f, float f2, float f3, float f4) {
        float[] fArr = {f, f, f2, f2, f4, f4, f3, f3};
        this.u.i(fArr);
        njt hierarchy = getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        if (roundingParams.c == null) {
            roundingParams.c = new float[8];
        }
        System.arraycopy(fArr, 0, roundingParams.c, 0, 8);
        roundingParams.i = true;
        boolean z = this.s;
        if (z) {
            roundingParams.d(this.z);
        }
        roundingParams.h = z;
        hierarchy.u(roundingParams);
    }

    public final int getBorderLineColor() {
        return this.x;
    }

    public final int getBorderLineColorAttr() {
        return this.y;
    }

    public final float getBorderLineWidth() {
        return this.z;
    }

    public final boolean getHasBorderLine() {
        return this.w;
    }

    public final gzs<Boolean> getIgnoreTrafficSaverPredicate() {
        return this.B;
    }

    public final float getRadiusCorner() {
        return this.A;
    }

    public final void h(int i) {
        this.o = R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary;
        this.p = 0;
        setEmptyPlaceholder(i);
    }

    public final void i() {
        int i;
        if (this.w) {
            if (this.y != 0) {
                i = e3m.f(this.y, getContext());
            } else {
                i = this.x;
            }
            this.u.a(this.z, i);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<String> arrayList = this.C;
        if (arrayList.isEmpty()) {
            return;
        }
        bpn0 bpn0Var = o360.e;
        o360.a.a().i(arrayList);
        arrayList.clear();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.k) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i3 = layoutParams != null ? layoutParams.width : 0;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            this.l = Math.min(i3, layoutParams2 != null ? layoutParams2.height : 0);
            setMeasuredDimension(getViewSize(), getViewSize());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.k) {
            return;
        }
        this.l = Math.max(getMeasuredWidth(), getMeasuredHeight());
        f(this.j);
    }

    @Override // android.view.View
    public final void requestLayout() {
        super.requestLayout();
        this.l = -1;
    }

    public final void setBackgorundColorRes(int i) {
        setBackground(getContext().getColor(i));
    }

    public final void setBackground(int i) {
        if (this.r != i) {
            this.r = i;
            getHierarchy().p(i != 0 ? new ColorDrawable(i) : null, 0);
        }
    }

    public final void setBackgroundAttrRes(int i) {
        if (i == 0) {
            return;
        }
        getHierarchy().p(e3m.e(i, getContext()), 0);
    }

    public final void setBackgroundImageAttr(int i) {
        this.q = i;
        invalidate();
    }

    public final void setBorderLineColor(int i) {
        this.x = i;
        i();
    }

    public final void setBorderLineColorAttr(int i) {
        this.y = i;
        if (i != 0) {
            i();
        }
    }

    public final void setBorderLineWidth(float f) {
        this.z = f;
        i();
    }

    public final void setColorTint(int i) {
        this.o = 0;
        this.p = i;
        setEmptyPlaceholder(this.t);
    }

    public final void setCornerRadius(float f) {
        g(f, f, f, f);
    }

    public final void setDependsOn(ThumbsImageView thumbsImageView) {
        this.n = thumbsImageView;
    }

    public final void setEmptyColor(int i) {
        this.o = 0;
        this.p = 0;
        setEmptyPlaceholder(new ColorDrawable(i));
    }

    public final void setEmptyPlaceholder(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (this.o != 0) {
            sjo.b(drawable, e3m.f(this.o, getContext()), PorterDuff.Mode.SRC_IN);
        } else {
            int i = this.p;
            if (i != 0) {
                sjo.b(drawable, i, PorterDuff.Mode.SRC_IN);
            }
        }
        this.t = drawable;
        if (getHierarchy().e.a(1) != null) {
            getHierarchy().s(this.t, f5h0.g.a);
        }
    }

    public final void setEmptyTintAttr(int i) {
        this.o = i;
        this.p = 0;
        setEmptyPlaceholder(this.t);
    }

    public final void setHasBorderLine(boolean z) {
        this.w = z;
        i();
    }

    public final void setIgnoreTrafficSaverPredicate(gzs<Boolean> gzsVar) {
        this.B = gzsVar;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        int i = layoutParams2 != null ? layoutParams2.width : 0;
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        this.l = Math.min(i, layoutParams3 != null ? layoutParams3.height : 0);
        this.k = getViewSize() > 0;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    public final void setLocalRes(int i) {
        this.i.clear();
        this.j = null;
        getHierarchy().p(null, 1);
        lpa0 e = rhs.e();
        e.d();
        e.l = getController();
        ImageRequestBuilder g = ImageRequestBuilder.g(i);
        g.g = ImageRequest.CacheChoice.SMALL;
        e.c = g.a();
        setController(e.b());
    }

    @Override // xsna.kgw
    public void setOnLoadCallback(b780 b780Var) {
        this.v = b780Var;
    }

    public final void setOutlineProvider(float f) {
        setOutlineProvider(new c(f));
    }

    public final void setOverlayImage(Drawable drawable) {
        getHierarchy().r(drawable, 1);
    }

    public final void setPostProcessorForSingle(mk6 mk6Var) {
        this.m = mk6Var;
    }

    public final void setRadiusCorner(float f) {
        this.A = f;
        setOutlineProvider(f);
        RoundedCornersDrawable roundedCornersDrawable = this.u;
        roundedCornersDrawable.j(f);
        i();
        njt hierarchy = getHierarchy();
        RoundingParams b2 = RoundingParams.b(f);
        b2.i = true;
        boolean z = this.s;
        if (z) {
            b2.d(this.z);
        }
        b2.h = z;
        hierarchy.u(b2);
        getHierarchy().r(roundedCornersDrawable, 0);
    }

    public final void setThumb(Thumb thumb) {
        e(thumb != null ? Collections.singletonList(thumb) : null);
    }

    public final void setThumbs(List<Thumb> list) {
        e(list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083 A[Catch: all -> 0x0077, Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:8:0x003e, B:10:0x006e, B:14:0x007c, B:16:0x0083, B:17:0x009e), top: B:7:0x003e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ThumbsImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        boolean z;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.i = new ArrayList(4);
        RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(E);
        roundedCornersDrawable.e(true);
        this.u = roundedCornersDrawable;
        this.w = true;
        e3m.a aVar = e3m.a;
        this.x = context.getColor(R.color.vk_black_alpha8);
        this.z = 1.0f;
        this.C = new ArrayList<>();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            try {
                try {
                    this.o = dhr0.A("tiv_empty_tint", attributeSet);
                    this.p = obtainStyledAttributes.getColor(4, 0);
                    this.q = dhr0.A("tiv_background_image", attributeSet);
                    this.r = obtainStyledAttributes.getColor(0, 0);
                    this.t = obtainStyledAttributes.getDrawable(3);
                    this.s = obtainStyledAttributes.getBoolean(7, false);
                } catch (Exception e) {
                    L.i(e);
                }
                if (!obtainStyledAttributes.hasValue(1) && !obtainStyledAttributes.hasValue(2)) {
                    z = false;
                    setHasBorderLine(z);
                    if (this.w) {
                        setBorderLineColorAttr(dhr0.A("tiv_border_color", attributeSet));
                        setBorderLineColor(obtainStyledAttributes.getColor(1, this.x));
                        setBorderLineWidth(obtainStyledAttributes.getDimension(2, this.z));
                    }
                    setRadiusCorner(obtainStyledAttributes.getDimensionPixelSize(24, 0));
                    obtainStyledAttributes.recycle();
                }
                z = true;
                setHasBorderLine(z);
                if (this.w) {
                }
                setRadiusCorner(obtainStyledAttributes.getDimensionPixelSize(24, 0));
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        setEmptyPlaceholder(this.t);
        int i3 = this.q;
        if (i3 != 0) {
            setBackgroundAttrRes(i3);
        } else {
            int i4 = this.r;
            if (i4 != 0) {
                setBackground(i4);
            }
        }
        getHierarchy().q(getHierarchy().e.m / 2);
    }

    public final void setEmptyPlaceholder(int i) {
        Drawable a2 = m33.a(i, getContext());
        if (a2 != null) {
            setEmptyPlaceholder(a2);
        }
    }
}
