package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import io.sentry.android.replay.viewhierarchy.b;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseKtx"})
/* loaded from: classes10.dex */
public final class g implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f67671a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f67672b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f67673c;

    static final class a extends AbstractC7737t implements Function0<Bitmap> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f67674b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Bitmap invoke() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
    }

    static final class b extends AbstractC7737t implements Function0<Paint> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f67675b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            return new Paint();
        }
    }

    static final class c extends AbstractC7737t implements Function1<io.sentry.android.replay.viewhierarchy.b, Boolean> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f67677c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f67678d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f67679e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Canvas f67680f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, Matrix matrix, ArrayList arrayList, Canvas canvas) {
            super(1);
            this.f67677c = bitmap;
            this.f67678d = matrix;
            this.f67679e = arrayList;
            this.f67680f = canvas;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.b bVar) {
            Pair pair;
            Integer h11;
            List list;
            io.sentry.android.replay.viewhierarchy.b node = bVar;
            Intrinsics.checkNotNullParameter(node, "node");
            if (node.c() && node.e() > 0 && node.b() > 0) {
                if (node.d() == null) {
                    return Boolean.FALSE;
                }
                boolean z11 = node instanceof b.c;
                g gVar = g.this;
                if (z11) {
                    pair = new Pair(C7714v.a0(node.d()), Integer.valueOf(g.c(gVar, this.f67677c, node.d(), this.f67678d)));
                } else if (node instanceof b.d) {
                    b.d dVar = (b.d) node;
                    m i11 = dVar.i();
                    int intValue = ((i11 == null || (h11 = i11.d()) == null) && (h11 = dVar.h()) == null) ? -16777216 : h11.intValue();
                    m i12 = dVar.i();
                    Rect globalRect = node.d();
                    int j11 = dVar.j();
                    int k11 = dVar.k();
                    Intrinsics.checkNotNullParameter(globalRect, "globalRect");
                    if (i12 == null) {
                        list = C7714v.a0(globalRect);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int f7 = i12.f();
                        for (int i13 = 0; i13 < f7; i13++) {
                            int b11 = (int) i12.b(i13, i12.c(i13));
                            int h12 = i12.h(i13);
                            int g10 = i12.g(i13);
                            int b12 = (int) i12.b(i13, (g10 - h12) + (h12 > 0 ? 1 : 0));
                            if (b12 == 0 && g10 > 0) {
                                b12 = ((int) i12.b(i13, g10 - 1)) + 1;
                            }
                            int a11 = i12.a(i13);
                            int e11 = i12.e(i13);
                            Rect rect = new Rect();
                            int i14 = globalRect.left + j11 + b11;
                            rect.left = i14;
                            rect.right = (b12 - b11) + i14;
                            int i15 = globalRect.top + k11 + a11;
                            rect.top = i15;
                            rect.bottom = (e11 - a11) + i15;
                            arrayList.add(rect);
                        }
                        list = arrayList;
                    }
                    pair = new Pair(list, Integer.valueOf(intValue));
                } else {
                    pair = new Pair(C7714v.a0(node.d()), -16777216);
                }
                List list2 = (List) pair.a();
                g.d(gVar).setColor(((Number) pair.b()).intValue());
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    this.f67680f.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, g.d(gVar));
                }
                this.f67679e.addAll(list2);
            }
            return Boolean.TRUE;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Canvas> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Canvas invoke() {
            return new Canvas(g.this.j());
        }
    }

    public g() {
        Sc.n nVar = Sc.n.NONE;
        this.f67671a = Sc.k.a(nVar, a.f67674b);
        this.f67672b = Sc.k.a(nVar, new d());
        this.f67673c = Sc.k.a(nVar, b.f67675b);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [Sc.j, java.lang.Object] */
    public static final int c(g gVar, Bitmap bitmap, Rect rect, Matrix matrix) {
        gVar.getClass();
        if (bitmap.isRecycled() || gVar.j().isRecycled()) {
            return -16777216;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        rectF.round(rect2);
        ((Canvas) gVar.f67672b.getValue()).drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return gVar.j().getPixel(0, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final Paint d(g gVar) {
        return (Paint) gVar.f67673c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f67671a.isInitialized() || j().isRecycled()) {
            return;
        }
        j().recycle();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final Bitmap j() {
        return (Bitmap) this.f67671a.getValue();
    }

    @NotNull
    public final List<Rect> k(@NotNull Bitmap bitmap, @NotNull io.sentry.android.replay.viewhierarchy.b viewHierarchy, Matrix matrix) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
        if (bitmap.isRecycled()) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        viewHierarchy.g(new c(bitmap, matrix, arrayList, canvas));
        return arrayList;
    }
}
