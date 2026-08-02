package Y5;

import L5.ScreenshotContext;
import Z5.h;
import a6.C1921a;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes2.dex */
public final class a implements Y5.b {

    /* renamed from: a, reason: collision with root package name */
    public final V5.b f14068a;

    /* renamed from: b, reason: collision with root package name */
    public final h f14069b;

    /* renamed from: Y5.a$a, reason: collision with other inner class name */
    public static final class C0288a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f14070n;

        /* renamed from: o, reason: collision with root package name */
        public Object f14071o;

        /* renamed from: p, reason: collision with root package name */
        public Object f14072p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f14073q;

        /* renamed from: s, reason: collision with root package name */
        public int f14075s;

        public C0288a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14073q = obj;
            this.f14075s |= Integer.MIN_VALUE;
            return a.this.a(null, null, null, this);
        }
    }

    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f14076n;

        /* renamed from: p, reason: collision with root package name */
        public int f14078p;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14076n = obj;
            this.f14078p |= Integer.MIN_VALUE;
            return a.this.c(null, null, this);
        }
    }

    public a(V5.b fileStorageManager, h frameUploadService) {
        Intrinsics.checkNotNullParameter(fileStorageManager, "fileStorageManager");
        Intrinsics.checkNotNullParameter(frameUploadService, "frameUploadService");
        this.f14068a = fileStorageManager;
        this.f14069b = frameUploadService;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(9:5|6|7|(1:(1:(5:11|12|13|14|15)(2:17|18))(2:19|20))(3:26|27|(2:29|25)(1:30))|21|(1:23)|13|14|15))|7|(0)(0)|21|(0)|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if (r9.c(r11, r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0034, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        E5.b.f3006a.c("Failed to save frame", r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[Catch: all -> 0x0031, Exception -> 0x0034, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:12:0x002c, B:20:0x004c, B:21:0x00a4, B:23:0x00a8, B:27:0x0084), top: B:7:0x0022, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // Y5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Bitmap bitmap, C1921a c1921a, ScreenshotContext screenshotContext, Continuation continuation) {
        C0288a c0288a;
        int i10;
        a aVar;
        File file;
        try {
            if (continuation instanceof C0288a) {
                c0288a = (C0288a) continuation;
                int i11 = c0288a.f14075s;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0288a.f14075s = i11 - Integer.MIN_VALUE;
                    Object obj = c0288a.f14073q;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0288a.f14075s;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        float coerceAtLeast = RangesKt.coerceAtLeast(c1921a.c(), 0.1f);
                        bitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, (int) Math.rint(bitmap.getWidth() * coerceAtLeast)), Math.max(1, (int) Math.rint(bitmap.getHeight() * coerceAtLeast)), true);
                        int coerceIn = RangesKt.coerceIn((int) (c1921a.b() * 100), 0, 100);
                        V5.b bVar = this.f14068a;
                        c0288a.f14070n = this;
                        c0288a.f14071o = screenshotContext;
                        c0288a.f14072p = bitmap;
                        c0288a.f14075s = 1;
                        obj = bVar.a(bitmap, coerceIn, c0288a);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bitmap = (Bitmap) c0288a.f14070n;
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        bitmap = (Bitmap) c0288a.f14072p;
                        screenshotContext = (ScreenshotContext) c0288a.f14071o;
                        aVar = (a) c0288a.f14070n;
                        ResultKt.throwOnFailure(obj);
                    }
                    file = (File) obj;
                    if (file != null) {
                        c0288a.f14070n = bitmap;
                        c0288a.f14071o = null;
                        c0288a.f14072p = null;
                        c0288a.f14075s = 2;
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i10 != 0) {
            }
            file = (File) obj;
            if (file != null) {
            }
            return Unit.INSTANCE;
        } finally {
            bitmap.recycle();
        }
        c0288a = new C0288a(continuation);
        Object obj2 = c0288a.f14073q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0288a.f14075s;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|8|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        E5.b.f3006a.c("Failed to upload frame", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(File file, ScreenshotContext screenshotContext, Continuation continuation) {
        b bVar;
        int i10;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f14078p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f14078p = i11 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f14076n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar2.f14078p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    h hVar = this.f14069b;
                    String screenshotId = screenshotContext.getScreenshotId();
                    int page = screenshotContext.getPage();
                    int screenshotIndex = screenshotContext.getScreenshotIndex();
                    long timestamp = screenshotContext.getTimestamp();
                    bVar2.f14078p = 1;
                    if (hVar.a(file, screenshotId, page, screenshotIndex, timestamp, bVar2) == coroutine_suspended) {
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
        bVar = new b(continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.f14076n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar22.f14078p;
        if (i10 != 0) {
        }
        return Unit.INSTANCE;
    }
}
