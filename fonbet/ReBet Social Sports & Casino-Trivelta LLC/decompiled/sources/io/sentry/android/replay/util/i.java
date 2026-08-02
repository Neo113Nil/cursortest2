package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import io.sentry.android.replay.viewhierarchy.c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class i implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f51769d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f51770e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f51771a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f51772b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f51773c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f51774d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f51775d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Bitmap f51777e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Matrix f51778f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f51779g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Canvas f51780h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bitmap bitmap, Matrix matrix, List list, Canvas canvas) {
            super(1);
            this.f51777e = bitmap;
            this.f51778f = matrix;
            this.f51779g = list;
            this.f51780h = canvas;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.c node) {
            Pair pair;
            Integer j10;
            Intrinsics.checkNotNullParameter(node, "node");
            if (node.c() && node.e() > 0 && node.b() > 0) {
                if (node.d() == null) {
                    return Boolean.FALSE;
                }
                if (node instanceof c.C0762c) {
                    pair = TuplesKt.to(CollectionsKt.listOf(node.d()), Integer.valueOf(i.this.r(this.f51777e, node.d(), this.f51778f)));
                } else {
                    if (node instanceof c.e) {
                        c.e eVar = (c.e) node;
                        q k10 = eVar.k();
                        pair = TuplesKt.to(r.d(eVar.k(), node.d(), eVar.l(), eVar.m()), Integer.valueOf(((k10 == null || (j10 = k10.d()) == null) && (j10 = eVar.j()) == null) ? -16777216 : j10.intValue()));
                    } else {
                        pair = TuplesKt.to(CollectionsKt.listOf(node.d()), -16777216);
                    }
                }
                List list = (List) pair.component1();
                i.this.B().setColor(((Number) pair.component2()).intValue());
                Canvas canvas = this.f51780h;
                i iVar = i.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, iVar.B());
                }
                this.f51779g.addAll(list);
            }
            return Boolean.TRUE;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Canvas invoke() {
            return new Canvas(i.this.J());
        }
    }

    public i() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f51771a = LazyKt.lazy(lazyThreadSafetyMode, (Function0) b.f51774d);
        this.f51772b = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new e());
        this.f51773c = LazyKt.lazy(lazyThreadSafetyMode, (Function0) c.f51775d);
    }

    public final Paint B() {
        return (Paint) this.f51773c.getValue();
    }

    public final Bitmap J() {
        return (Bitmap) this.f51771a.getValue();
    }

    public final Canvas U() {
        return (Canvas) this.f51772b.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f51771a.isInitialized() || J().isRecycled()) {
            return;
        }
        J().recycle();
    }

    public final int r(Bitmap bitmap, Rect rect, Matrix matrix) {
        if (bitmap.isRecycled() || J().isRecycled()) {
            return -16777216;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        rectF.round(rect2);
        U().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return J().getPixel(0, 0);
    }

    public final List w0(Bitmap bitmap, io.sentry.android.replay.viewhierarchy.c viewHierarchy, Matrix matrix) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
        if (bitmap.isRecycled()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        viewHierarchy.i(new d(bitmap, matrix, arrayList, canvas));
        return arrayList;
    }
}
