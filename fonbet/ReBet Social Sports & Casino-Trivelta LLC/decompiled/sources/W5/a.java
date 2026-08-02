package W5;

import A5.E;
import A5.H;
import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.P;
import U5.a;
import Wh.g;
import a6.C1921a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import com.plaid.internal.EnumC3631g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import u5.C6523d;
import y5.C6854a;
import z5.AbstractC6930a;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Wh.a f12986a = g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public c f12987b;

    /* renamed from: W5.a$a, reason: collision with other inner class name */
    public static final class C0269a extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ C1921a f12988A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ U5.a f12989B;

        /* renamed from: n, reason: collision with root package name */
        public Object f12990n;

        /* renamed from: o, reason: collision with root package name */
        public Object f12991o;

        /* renamed from: p, reason: collision with root package name */
        public Object f12992p;

        /* renamed from: q, reason: collision with root package name */
        public Object f12993q;

        /* renamed from: r, reason: collision with root package name */
        public Object f12994r;

        /* renamed from: s, reason: collision with root package name */
        public Object f12995s;

        /* renamed from: t, reason: collision with root package name */
        public int f12996t;

        /* renamed from: u, reason: collision with root package name */
        public int f12997u;

        /* renamed from: v, reason: collision with root package name */
        public long f12998v;

        /* renamed from: w, reason: collision with root package name */
        public int f12999w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Context f13000x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ a f13001y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ List f13002z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0269a(Context context, a aVar, List list, C1921a c1921a, U5.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f13000x = context;
            this.f13001y = aVar;
            this.f13002z = list;
            this.f12988A = c1921a;
            this.f12989B = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0269a(this.f13000x, this.f13001y, this.f13002z, this.f12988A, this.f12989B, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0269a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x01e4, code lost:
        
            r7.f12987b = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01ec A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01ed A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:9:0x0032, B:38:0x01e7, B:42:0x01ed, B:46:0x01f1, B:47:0x01f4, B:51:0x004b, B:52:0x0103, B:54:0x0109, B:55:0x0116, B:60:0x0065, B:66:0x00c4, B:68:0x00ca, B:71:0x00fe, B:87:0x00b7, B:11:0x017b, B:13:0x0182, B:15:0x0188, B:18:0x018f, B:21:0x01bd, B:24:0x01c8, B:27:0x01d4, B:36:0x01e4), top: B:2:0x000b, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0109 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:9:0x0032, B:38:0x01e7, B:42:0x01ed, B:46:0x01f1, B:47:0x01f4, B:51:0x004b, B:52:0x0103, B:54:0x0109, B:55:0x0116, B:60:0x0065, B:66:0x00c4, B:68:0x00ca, B:71:0x00fe, B:87:0x00b7, B:11:0x017b, B:13:0x0182, B:15:0x0188, B:18:0x018f, B:21:0x01bd, B:24:0x01c8, B:27:0x01d4, B:36:0x01e4), top: B:2:0x000b, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00ca A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:9:0x0032, B:38:0x01e7, B:42:0x01ed, B:46:0x01f1, B:47:0x01f4, B:51:0x004b, B:52:0x0103, B:54:0x0109, B:55:0x0116, B:60:0x0065, B:66:0x00c4, B:68:0x00ca, B:71:0x00fe, B:87:0x00b7, B:11:0x017b, B:13:0x0182, B:15:0x0188, B:18:0x018f, B:21:0x01bd, B:24:0x01c8, B:27:0x01d4, B:36:0x01e4), top: B:2:0x000b, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00fe A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #2 {all -> 0x0037, blocks: (B:9:0x0032, B:38:0x01e7, B:42:0x01ed, B:46:0x01f1, B:47:0x01f4, B:51:0x004b, B:52:0x0103, B:54:0x0109, B:55:0x0116, B:60:0x0065, B:66:0x00c4, B:68:0x00ca, B:71:0x00fe, B:87:0x00b7, B:11:0x017b, B:13:0x0182, B:15:0x0188, B:18:0x018f, B:21:0x01bd, B:24:0x01c8, B:27:0x01d4, B:36:0x01e4), top: B:2:0x000b, inners: #1 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x00e6 -> B:62:0x006a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            Iterator it;
            Canvas canvas;
            Size size;
            U5.a aVar;
            Wh.a aVar2;
            int i10;
            Wh.a aVar3;
            long j10;
            byte[] bArr;
            b bVar;
            c cVar;
            int i11;
            a aVar4;
            c cVar2;
            boolean z10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f12999w;
            try {
                if (i12 == 0) {
                    ResultKt.throwOnFailure(obj);
                    List h10 = AbstractC6930a.h(C6523d.f66138a.j());
                    if (h10.isEmpty()) {
                        E5.b.f3006a.a("No views to capture");
                        return null;
                    }
                    DisplayMetrics displayMetrics = this.f13000x.getResources().getDisplayMetrics();
                    Size size2 = new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
                    if (size2.getWidth() == 0 || size2.getHeight() == 0) {
                        E5.b.f3006a.a("Calculated dimensions are zero. Skipping bitmap creation.");
                        return null;
                    }
                    try {
                        bitmap = Bitmap.createBitmap(size2.getWidth(), size2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        it = h10.iterator();
                        canvas = canvas2;
                        size = size2;
                        if (it.hasNext()) {
                        }
                    } catch (Throwable th2) {
                        E5.b.f3006a.c("Error creating bitmap", th2);
                        return null;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j10 = this.f12998v;
                            i10 = this.f12997u;
                            i11 = this.f12996t;
                            aVar4 = (a) this.f12995s;
                            aVar3 = (Wh.a) this.f12994r;
                            cVar = (c) this.f12993q;
                            bArr = (byte[]) this.f12992p;
                            bVar = (b) this.f12991o;
                            bitmap = (Bitmap) this.f12990n;
                            ResultKt.throwOnFailure(obj);
                            try {
                                cVar2 = aVar4.f12987b;
                                z10 = false;
                                if (cVar2 != null && cVar2.d() == i11 && cVar2.b() == i10) {
                                    z10 = ((Long.bitCount(j10 ^ cVar2.a()) > bVar.c() ? 1 : 0) + ((e.d(cVar2.c(), bArr) > bVar.f() ? 1 : (e.d(cVar2.c(), bArr) == bVar.f() ? 0 : -1)) < 0 ? 1 : 0)) + ((e.a(cVar2.c(), bArr, bVar.i(), bVar.h(), bVar.g()) > bVar.a() ? 1 : (e.a(cVar2.c(), bArr, bVar.i(), bVar.h(), bVar.g()) == bVar.a() ? 0 : -1)) >= 0 ? 1 : 0) < bVar.e();
                                }
                                aVar3.g(null);
                                if (z10) {
                                    return bitmap;
                                }
                                bitmap.recycle();
                                return null;
                            } catch (Throwable th3) {
                                aVar3.g(null);
                                throw th3;
                            }
                        }
                        canvas = (Canvas) this.f12991o;
                        bitmap = (Bitmap) this.f12990n;
                        ResultKt.throwOnFailure(obj);
                        aVar = this.f12989B;
                        if (aVar instanceof a.d) {
                            this.f13001y.f(canvas, ((a.d) aVar).c(), 75.0f);
                        }
                        b bVar2 = new b(0, 0, 0, 0, 0.0d, 0, 0, 0.0d, 0, 511, null);
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        byte[] c10 = e.c(bitmap, bVar2.i());
                        long b10 = e.b(bitmap, bVar2.d(), bVar2.b());
                        c cVar3 = new c(width, height, b10, c10);
                        aVar2 = this.f13001y.f12986a;
                        a aVar5 = this.f13001y;
                        this.f12990n = bitmap;
                        this.f12991o = bVar2;
                        this.f12992p = c10;
                        this.f12993q = cVar3;
                        this.f12994r = aVar2;
                        this.f12995s = aVar5;
                        this.f12996t = width;
                        this.f12997u = height;
                        this.f12998v = b10;
                        this.f12999w = 3;
                        if (aVar2.f(null, this) != coroutine_suspended) {
                            i10 = height;
                            aVar3 = aVar2;
                            j10 = b10;
                            bArr = c10;
                            bVar = bVar2;
                            cVar = cVar3;
                            i11 = width;
                            aVar4 = aVar5;
                            cVar2 = aVar4.f12987b;
                            z10 = false;
                            if (cVar2 != null) {
                                z10 = ((Long.bitCount(j10 ^ cVar2.a()) > bVar.c() ? 1 : 0) + ((e.d(cVar2.c(), bArr) > bVar.f() ? 1 : (e.d(cVar2.c(), bArr) == bVar.f() ? 0 : -1)) < 0 ? 1 : 0)) + ((e.a(cVar2.c(), bArr, bVar.i(), bVar.h(), bVar.g()) > bVar.a() ? 1 : (e.a(cVar2.c(), bArr, bVar.i(), bVar.h(), bVar.g()) == bVar.a() ? 0 : -1)) >= 0 ? 1 : 0) < bVar.e();
                            }
                            aVar3.g(null);
                            if (z10) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    View view = (View) this.f12994r;
                    it = (Iterator) this.f12993q;
                    Canvas canvas3 = (Canvas) this.f12992p;
                    bitmap = (Bitmap) this.f12991o;
                    Size size3 = (Size) this.f12990n;
                    ResultKt.throwOnFailure(obj);
                    Size size4 = size3;
                    Canvas canvas4 = canvas3;
                    Bitmap bitmap2 = bitmap;
                    try {
                        a.h(this.f13001y, canvas4, AbstractC6930a.i(view), null, 2, null);
                        canvas = canvas4;
                        size = size4;
                        bitmap = bitmap2;
                        if (it.hasNext()) {
                            View view2 = (View) it.next();
                            X5.e eVar = X5.e.f13590a;
                            this.f12990n = size;
                            this.f12991o = bitmap;
                            this.f12992p = canvas;
                            this.f12993q = it;
                            this.f12994r = view2;
                            this.f12999w = 1;
                            if (eVar.r(view2, canvas, size, this) != coroutine_suspended) {
                                size4 = size;
                                canvas4 = canvas;
                                view = view2;
                                Bitmap bitmap22 = bitmap;
                                a.h(this.f13001y, canvas4, AbstractC6930a.i(view), null, 2, null);
                                canvas = canvas4;
                                size = size4;
                                bitmap = bitmap22;
                                if (it.hasNext()) {
                                    H5.a.f4799a.b();
                                    aVar = this.f12989B;
                                    if (aVar instanceof a.d) {
                                    }
                                    b bVar22 = new b(0, 0, 0, 0, 0.0d, 0, 0, 0.0d, 0, 511, null);
                                    int width2 = bitmap.getWidth();
                                    int height2 = bitmap.getHeight();
                                    byte[] c102 = e.c(bitmap, bVar22.i());
                                    long b102 = e.b(bitmap, bVar22.d(), bVar22.b());
                                    c cVar32 = new c(width2, height2, b102, c102);
                                    aVar2 = this.f13001y.f12986a;
                                    a aVar52 = this.f13001y;
                                    this.f12990n = bitmap;
                                    this.f12991o = bVar22;
                                    this.f12992p = c102;
                                    this.f12993q = cVar32;
                                    this.f12994r = aVar2;
                                    this.f12995s = aVar52;
                                    this.f12996t = width2;
                                    this.f12997u = height2;
                                    this.f12998v = b102;
                                    this.f12999w = 3;
                                    if (aVar2.f(null, this) != coroutine_suspended) {
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bitmap = bitmap22;
                        E5.b.f3006a.c("Error drawing views", th);
                        bitmap.recycle();
                        return null;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                E5.b.f3006a.c("Error drawing views", th);
                bitmap.recycle();
                return null;
            }
        }
    }

    public static /* synthetic */ void h(a aVar, Canvas canvas, y5.d dVar, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = new LinkedHashSet();
        }
        aVar.g(canvas, dVar, set);
    }

    @Override // W5.d
    public Object a(Context context, C1921a c1921a, U5.a aVar, List list, Continuation continuation) {
        return AbstractC1455i.g(C1452g0.a(), new C0269a(context, this, list, c1921a, aVar, null), continuation);
    }

    public final void f(Canvas canvas, C6854a c6854a, float f10) {
        float a10 = c6854a.a();
        float b10 = c6854a.b();
        float f11 = 0.15f * f10;
        float f12 = f10 - f11;
        float f13 = f12 - f11;
        float f14 = f13 - f11;
        int argb = Color.argb(255, 90, EnumC3631g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
        Paint paint = new Paint();
        paint.setColor(argb);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        canvas.drawCircle(a10, b10, f10, paint);
        canvas.drawCircle(a10, b10, f12, paint2);
        canvas.drawCircle(a10, b10, f13, paint);
        canvas.drawCircle(a10, b10, f14, paint2);
        canvas.drawCircle(a10, b10, f14 - f11, paint);
    }

    public final void g(Canvas canvas, y5.d dVar, Set set) {
        if (set.add(dVar)) {
            Paint paint = new Paint();
            paint.setColor(-16777216);
            paint.setStyle(Paint.Style.FILL);
            if (dVar instanceof H) {
                Rect rect = new Rect();
                H h10 = (H) dVar;
                if (h10.f(rect) && h10.k()) {
                    canvas.drawRect(rect, paint);
                }
            }
            if (dVar instanceof E) {
                Iterator it = ((E) dVar).l().iterator();
                while (it.hasNext()) {
                    g(canvas, (y5.d) it.next(), set);
                }
            }
        }
    }
}
