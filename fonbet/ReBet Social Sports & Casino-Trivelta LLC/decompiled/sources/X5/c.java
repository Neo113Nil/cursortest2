package X5;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.M0;
import Ph.P;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import y5.C6854a;
import z5.AbstractC6930a;

/* loaded from: classes2.dex */
public final class c implements X5.d {

    /* renamed from: a, reason: collision with root package name */
    public final X5.a f13561a = new X5.a(0, 0, 3, null);

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f13562n;

        /* renamed from: o, reason: collision with root package name */
        public Object f13563o;

        /* renamed from: p, reason: collision with root package name */
        public Object f13564p;

        /* renamed from: q, reason: collision with root package name */
        public Object f13565q;

        /* renamed from: r, reason: collision with root package name */
        public Object f13566r;

        /* renamed from: s, reason: collision with root package name */
        public Object f13567s;

        /* renamed from: t, reason: collision with root package name */
        public int f13568t;

        /* renamed from: u, reason: collision with root package name */
        public int f13569u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f13570v;

        /* renamed from: x, reason: collision with root package name */
        public int f13572x;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13570v = obj;
            this.f13572x |= Integer.MIN_VALUE;
            return c.this.w0(null, null, 0, 0, this);
        }
    }

    public static final class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation f13573a;

        public b(Continuation continuation) {
            this.f13573a = continuation;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int i10) {
            this.f13573a.resumeWith(Result.m147constructorimpl(Integer.valueOf(i10)));
        }
    }

    /* renamed from: X5.c$c, reason: collision with other inner class name */
    public static final class C0279c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f13574n;

        /* renamed from: o, reason: collision with root package name */
        public Object f13575o;

        /* renamed from: p, reason: collision with root package name */
        public Object f13576p;

        /* renamed from: q, reason: collision with root package name */
        public Object f13577q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f13578r;

        /* renamed from: t, reason: collision with root package name */
        public int f13580t;

        public C0279c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13578r = obj;
            this.f13580t |= Integer.MIN_VALUE;
            return c.this.r1(null, null, null, this);
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f13581n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Canvas f13582o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C6854a f13583p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ View f13584q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Canvas canvas, C6854a c6854a, View view, Continuation continuation) {
            super(2, continuation);
            this.f13582o = canvas;
            this.f13583p = c6854a;
            this.f13584q = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f13582o, this.f13583p, this.f13584q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f13581n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Canvas canvas = this.f13582o;
            float a10 = this.f13583p.a();
            float b10 = this.f13583p.b();
            View view = this.f13584q;
            int save = canvas.save();
            canvas.translate(a10, b10);
            try {
                view.draw(canvas);
            } finally {
                try {
                    canvas.restoreToCount(save);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                }
            }
            canvas.restoreToCount(save);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f13585n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Canvas f13587p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ View f13588q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Size f13589r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Canvas canvas, View view, Size size, Continuation continuation) {
            super(2, continuation);
            this.f13587p = canvas;
            this.f13588q = view;
            this.f13589r = size;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new e(this.f13587p, this.f13588q, this.f13589r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f13585n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = c.this;
                Canvas canvas = this.f13587p;
                View view = this.f13588q;
                int width = this.f13589r.getWidth();
                int height = this.f13589r.getHeight();
                this.f13585n = 1;
                if (cVar.w0(canvas, view, width, height, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ List B(c cVar, View view, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return cVar.r(view, list);
    }

    public static /* synthetic */ Rect U(c cVar, View view, Rect rect, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = new Rect();
        }
        return cVar.J(view, rect);
    }

    public static final boolean z0(SurfaceView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getWidth() > 0 && it.getHeight() > 0 && it.isShown();
    }

    public final Object A0(SurfaceView surfaceView, Bitmap bitmap, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            PixelCopy.request(surfaceView, bitmap, new b(safeContinuation), new Handler(Looper.getMainLooper()));
        } catch (Throwable unused) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m147constructorimpl(Boxing.boxInt(1)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final Rect J(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        rect.set(i10, iArr[1], view.getWidth() + i10, iArr[1] + view.getHeight());
        return rect;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f13561a.b();
    }

    public final List r(View view, List list) {
        if (view instanceof SurfaceView) {
            list.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                r(childAt, list);
            }
        }
        return list;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(1:(5:12|13|14|15|16)(2:19|20))(1:21))(6:32|(1:34)(1:44)|(2:36|(1:38)(1:42))(1:43)|39|(1:41)|27)|22|23|24|25))|46|6|7|8|(0)(0)|22|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010b, code lost:
    
        if (Ph.AbstractC1455i.g(r0, r13, r8) != r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010f, code lost:
    
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0111, code lost:
    
        E5.b.f3006a.a("PixelCopy patch failed for " + r3.getClass().getSimpleName() + ": " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x003b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    @Override // X5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r1(View view, Canvas canvas, Size size, Continuation continuation) {
        C0279c c0279c;
        ?? r32;
        Canvas canvas2;
        View view2;
        c cVar;
        Canvas canvas3;
        Size size2;
        if (continuation instanceof C0279c) {
            c0279c = (C0279c) continuation;
            int i10 = c0279c.f13580t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0279c.f13580t = i10 - Integer.MIN_VALUE;
                C0279c c0279c2 = c0279c;
                Object obj = c0279c2.f13578r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r32 = c0279c2.f13580t;
                if (r32 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Window f10 = AbstractC6930a.f(view);
                    WindowManager.LayoutParams attributes = f10 != null ? f10.getAttributes() : null;
                    if (attributes != null) {
                        float f11 = attributes.dimAmount;
                        if (f11 > 0.0f) {
                            Paint paint = new Paint();
                            paint.setColor(-16777216);
                            paint.setAlpha((int) (f11 * 255));
                            paint.setStyle(Paint.Style.FILL);
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, 0.0f, size.getWidth(), size.getHeight(), paint);
                        } else {
                            canvas2 = canvas;
                        }
                    } else {
                        canvas2 = canvas;
                        E5.b.f3006a.a("Window attributes are null for view: " + view.getClass().getSimpleName() + ", skipping dim drawing");
                    }
                    C6854a j10 = AbstractC6930a.j(view);
                    M0 c10 = C1452g0.c();
                    d dVar = new d(canvas2, j10, view, null);
                    c0279c2.f13574n = this;
                    c0279c2.f13575o = view;
                    c0279c2.f13576p = canvas2;
                    c0279c2.f13577q = size;
                    c0279c2.f13580t = 1;
                    if (AbstractC1455i.g(c10, dVar, c0279c2) != coroutine_suspended) {
                        view2 = view;
                        cVar = this;
                        canvas3 = canvas2;
                        size2 = size;
                    }
                    return coroutine_suspended;
                }
                if (r32 != 1) {
                    if (r32 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    View view3 = (View) c0279c2.f13574n;
                    ResultKt.throwOnFailure(obj);
                    r32 = view3;
                    return Unit.INSTANCE;
                }
                Size size3 = (Size) c0279c2.f13577q;
                Canvas canvas4 = (Canvas) c0279c2.f13576p;
                View view4 = (View) c0279c2.f13575o;
                c cVar2 = (c) c0279c2.f13574n;
                ResultKt.throwOnFailure(obj);
                size2 = size3;
                canvas3 = canvas4;
                view2 = view4;
                cVar = cVar2;
                M0 c11 = C1452g0.c();
                e eVar = cVar.new e(canvas3, view2, size2, null);
                View view5 = view2;
                c0279c2.f13574n = view5;
                c0279c2.f13575o = null;
                c0279c2.f13576p = null;
                c0279c2.f13577q = null;
                c0279c2.f13580t = 2;
                r32 = view5;
            }
        }
        c0279c = new C0279c(continuation);
        C0279c c0279c22 = c0279c;
        Object obj2 = c0279c22.f13578r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r32 = c0279c22.f13580t;
        if (r32 != 0) {
        }
        M0 c112 = C1452g0.c();
        e eVar2 = cVar.new e(canvas3, view2, size2, null);
        View view52 = view2;
        c0279c22.f13574n = view52;
        c0279c22.f13575o = null;
        c0279c22.f13576p = null;
        c0279c22.f13577q = null;
        c0279c22.f13580t = 2;
        r32 = view52;
    }

    @Override // X5.d
    public boolean u0(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0108 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:11:0x0047, B:13:0x0100, B:15:0x0108, B:17:0x013f, B:19:0x0147), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00fd -> B:13:0x0100). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x015e -> B:21:0x0152). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w0(Canvas canvas, View view, int i10, int i11, Continuation continuation) {
        a aVar;
        int i12;
        int i13;
        Iterator it;
        c cVar;
        a aVar2;
        Canvas canvas2;
        int i14;
        Bitmap a10;
        Rect rect;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i15 = aVar.f13572x;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                aVar.f13572x = i15 - Integer.MIN_VALUE;
                Object obj = aVar.f13570v;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i12 = aVar.f13572x;
                int i16 = 1;
                Rect rect2 = null;
                int i17 = 0;
                if (i12 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (Build.VERSION.SDK_INT < 26) {
                        return Unit.INSTANCE;
                    }
                    List list = SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(B(this, view, null, 1, null)), new Function1() { // from class: X5.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            boolean z02;
                            z02 = c.z0((SurfaceView) obj2);
                            return Boolean.valueOf(z02);
                        }
                    }));
                    if (list.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    i13 = i11;
                    it = list.iterator();
                    cVar = this;
                    aVar2 = aVar;
                    canvas2 = canvas;
                    i14 = i10;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = aVar.f13569u;
                    int i18 = aVar.f13568t;
                    Bitmap bitmap = (Bitmap) aVar.f13567s;
                    Rect rect3 = (Rect) aVar.f13566r;
                    Rect U10 = (Rect) aVar.f13565q;
                    it = (Iterator) aVar.f13564p;
                    Canvas canvas3 = (Canvas) aVar.f13563o;
                    cVar = (c) aVar.f13562n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar2 = aVar;
                        i14 = i18;
                        if (((Number) obj).intValue() == 0) {
                            Rect rect4 = new Rect(RangesKt.coerceAtLeast(rect3.left - U10.left, i17), RangesKt.coerceAtLeast(rect3.top - U10.top, i17), RangesKt.coerceAtMost(rect3.right - U10.left, bitmap.getWidth()), RangesKt.coerceAtMost(rect3.bottom - U10.top, bitmap.getHeight()));
                            if (rect4.width() > 0 && rect4.height() > 0) {
                                rect = null;
                                canvas3.drawBitmap(bitmap, rect4, rect3, (Paint) null);
                                cVar.f13561a.c(bitmap);
                                rect2 = rect;
                                canvas2 = canvas3;
                                i16 = 1;
                                i17 = 0;
                                if (!it.hasNext()) {
                                    SurfaceView surfaceView = (SurfaceView) it.next();
                                    U10 = U(cVar, surfaceView, rect2, i16, rect2);
                                    rect3 = new Rect(RangesKt.coerceIn(U10.left, i17, i14), RangesKt.coerceIn(U10.top, i17, i13), RangesKt.coerceIn(U10.right, i17, i14), RangesKt.coerceIn(U10.bottom, i17, i13));
                                    if (rect3.width() <= 0 || rect3.height() <= 0 || (a10 = cVar.f13561a.a(surfaceView.getWidth(), surfaceView.getHeight())) == null) {
                                        rect2 = null;
                                        i16 = 1;
                                        i17 = 0;
                                        if (!it.hasNext()) {
                                            return Unit.INSTANCE;
                                        }
                                    } else {
                                        try {
                                            aVar2.f13562n = cVar;
                                            aVar2.f13563o = canvas2;
                                            aVar2.f13564p = it;
                                            aVar2.f13565q = U10;
                                            aVar2.f13566r = rect3;
                                            aVar2.f13567s = a10;
                                            aVar2.f13568t = i14;
                                            aVar2.f13569u = i13;
                                            aVar2.f13572x = 1;
                                            Object A02 = cVar.A0(surfaceView, a10, aVar2);
                                            if (A02 == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            canvas3 = canvas2;
                                            obj = A02;
                                            bitmap = a10;
                                            if (((Number) obj).intValue() == 0) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bitmap = a10;
                                            cVar.f13561a.c(bitmap);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                        rect = null;
                        cVar.f13561a.c(bitmap);
                        rect2 = rect;
                        canvas2 = canvas3;
                        i16 = 1;
                        i17 = 0;
                        if (!it.hasNext()) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cVar.f13561a.c(bitmap);
                        throw th;
                    }
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f13570v;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i12 = aVar.f13572x;
        int i162 = 1;
        Rect rect22 = null;
        int i172 = 0;
        if (i12 != 0) {
        }
    }
}
