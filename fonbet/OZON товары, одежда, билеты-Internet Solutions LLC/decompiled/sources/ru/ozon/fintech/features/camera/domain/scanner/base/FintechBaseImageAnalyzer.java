package ru.ozon.fintech.features.camera.domain.scanner.base;

import Ae.E0;
import Ae.w0;
import De.C2862e;
import Sc.s;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.h;
import androidx.camera.core.p;
import androidx.camera.view.PreviewView;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.domain.scanner.ImageAnalyzerUtilsKt;
import ru.ozon.fintech.features.camera.domain.scanner.MobScannerConfig;
import ru.ozon.fintech.features.camera.scanners.api.CameraScanner;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerSource;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerType;
import ru.ozon.fintech.features.camera.scanners.api.DetectedData;
import xe.B0;
import xe.C10727i;
import xe.C10745r0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;
import ze.k;
import ze.w;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0001LB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0>8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H0F8$X¤\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lru/ozon/fintech/features/camera/domain/scanner/base/FintechBaseImageAnalyzer;", "Landroidx/camera/core/h$a;", "LR30/a;", "appCoroutineScopes", "Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "mobScannerConfig", "<init>", "(LR30/a;Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;)V", "Landroidx/camera/core/p;", "imageProxy", "", "checkForAutoFocus", "(Landroidx/camera/core/p;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "cameraScannerSource", "makeScan", "(Landroid/graphics/Bitmap;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;)V", "analyze", "manualFromBitmap", "(Landroid/graphics/Bitmap;)V", "shutdown", "()V", "warmUp", "LR30/a;", "Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "getMobScannerConfig", "()Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "Lxe/J;", "handler", "Lxe/J;", "Lze/h;", "Lru/ozon/fintech/features/camera/domain/scanner/base/FintechBaseImageAnalyzer$BitmapItem;", "imageQueueChannel", "Lze/h;", "", "lastProcessed", "J", "Lxe/M;", "analyzerScope", "Lxe/M;", "getAnalyzerScope", "()Lxe/M;", "Landroidx/camera/view/PreviewView;", "preview", "Landroidx/camera/view/PreviewView;", "getPreview", "()Landroidx/camera/view/PreviewView;", "setPreview", "(Landroidx/camera/view/PreviewView;)V", "Landroid/graphics/Rect;", "boxRect", "Landroid/graphics/Rect;", "getBoxRect", "()Landroid/graphics/Rect;", "setBoxRect", "(Landroid/graphics/Rect;)V", "LAe/w0;", "Lru/ozon/fintech/features/camera/scanners/api/DetectedData;", "detectedDataFlow", "LAe/w0;", "getDetectedDataFlow", "()LAe/w0;", "needAutoFocusFlow", "getNeedAutoFocusFlow", "", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerType;", "Lru/ozon/fintech/features/camera/scanners/api/CameraScanner;", "getScanners", "()Ljava/util/Map;", "scanners", "BitmapItem", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FintechBaseImageAnalyzer implements h.a {

    @NotNull
    private final M analyzerScope;

    @NotNull
    private final R30.a appCoroutineScopes;
    private Rect boxRect;

    @NotNull
    private final w0<DetectedData> detectedDataFlow;
    private final ExecutorService executor;

    @NotNull
    private final J handler;

    @NotNull
    private final ze.h<BitmapItem> imageQueueChannel;
    private long lastProcessed;

    @NotNull
    private final MobScannerConfig mobScannerConfig;

    @NotNull
    private final w0<Unit> needAutoFocusFlow;
    private PreviewView preview;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer$1", f = "FintechBaseImageAnalyzer.kt", l = {188}, m = "invokeSuspend")
    /* renamed from: ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return FintechBaseImageAnalyzer.this.new AnonymousClass1(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #1 {all -> 0x001b, blocks: (B:6:0x0017, B:7:0x0049, B:9:0x0051, B:10:0x003a, B:14:0x0068, B:21:0x0035), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:6:0x0017, B:7:0x0049, B:9:0x0051, B:10:0x003a, B:14:0x0068, B:21:0x0035), top: B:2:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0046 -> B:7:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            w wVar;
            ze.j it;
            FintechBaseImageAnalyzer fintechBaseImageAnalyzer;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    L80.a.a("SCAN_FLOW", "analyzerScope.launch");
                    wVar = FintechBaseImageAnalyzer.this.imageQueueChannel;
                    FintechBaseImageAnalyzer fintechBaseImageAnalyzer2 = FintechBaseImageAnalyzer.this;
                    it = wVar.iterator();
                    fintechBaseImageAnalyzer = fintechBaseImageAnalyzer2;
                    this.L$0 = fintechBaseImageAnalyzer;
                    this.L$1 = wVar;
                    this.L$2 = it;
                    this.label = 1;
                    obj = it.b(this);
                    if (obj == aVar) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (ze.j) this.L$2;
                    wVar = (w) this.L$1;
                    fintechBaseImageAnalyzer = (FintechBaseImageAnalyzer) this.L$0;
                    s.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        BitmapItem bitmapItem = (BitmapItem) it.next();
                        L80.a.a("SCAN_FLOW", "consumeEach: new item from imageQueueChannel");
                        fintechBaseImageAnalyzer.makeScan(bitmapItem.getBitmap(), bitmapItem.getCameraScannerSource());
                        this.L$0 = fintechBaseImageAnalyzer;
                        this.L$1 = wVar;
                        this.L$2 = it;
                        this.label = 1;
                        obj = it.b(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Unit unit = Unit.f71690a;
                            wVar.j(null);
                            return Unit.f71690a;
                        }
                    }
                }
            } finally {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/camera/domain/scanner/base/FintechBaseImageAnalyzer$BitmapItem;", "", "bitmap", "Landroid/graphics/Bitmap;", "cameraScannerSource", "Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "<init>", "(Landroid/graphics/Bitmap;Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getCameraScannerSource", "()Lru/ozon/fintech/features/camera/scanners/api/CameraScannerSource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class BitmapItem {

        @NotNull
        private final Bitmap bitmap;

        @NotNull
        private final CameraScannerSource cameraScannerSource;

        public BitmapItem(@NotNull Bitmap bitmap, @NotNull CameraScannerSource cameraScannerSource) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(cameraScannerSource, "cameraScannerSource");
            this.bitmap = bitmap;
            this.cameraScannerSource = cameraScannerSource;
        }

        public static /* synthetic */ BitmapItem copy$default(BitmapItem bitmapItem, Bitmap bitmap, CameraScannerSource cameraScannerSource, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bitmap = bitmapItem.bitmap;
            }
            if ((i11 & 2) != 0) {
                cameraScannerSource = bitmapItem.cameraScannerSource;
            }
            return bitmapItem.copy(bitmap, cameraScannerSource);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CameraScannerSource getCameraScannerSource() {
            return this.cameraScannerSource;
        }

        @NotNull
        public final BitmapItem copy(@NotNull Bitmap bitmap, @NotNull CameraScannerSource cameraScannerSource) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(cameraScannerSource, "cameraScannerSource");
            return new BitmapItem(bitmap, cameraScannerSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BitmapItem)) {
                return false;
            }
            BitmapItem bitmapItem = (BitmapItem) other;
            return Intrinsics.d(this.bitmap, bitmapItem.bitmap) && this.cameraScannerSource == bitmapItem.cameraScannerSource;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final CameraScannerSource getCameraScannerSource() {
            return this.cameraScannerSource;
        }

        public int hashCode() {
            return this.cameraScannerSource.hashCode() + (this.bitmap.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "BitmapItem(bitmap=" + this.bitmap + ", cameraScannerSource=" + this.cameraScannerSource + ")";
        }
    }

    public FintechBaseImageAnalyzer(@NotNull R30.a appCoroutineScopes, @NotNull MobScannerConfig mobScannerConfig) {
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(mobScannerConfig, "mobScannerConfig");
        this.appCoroutineScopes = appCoroutineScopes;
        this.mobScannerConfig = mobScannerConfig;
        ExecutorService executor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ru.ozon.fintech.features.camera.domain.scanner.base.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread executor$lambda$0;
                executor$lambda$0 = FintechBaseImageAnalyzer.executor$lambda$0(FintechBaseImageAnalyzer.this, runnable);
                return executor$lambda$0;
            }
        });
        this.executor = executor;
        FintechBaseImageAnalyzer$special$$inlined$CoroutineExceptionHandler$1 fintechBaseImageAnalyzer$special$$inlined$CoroutineExceptionHandler$1 = new FintechBaseImageAnalyzer$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.handler = fintechBaseImageAnalyzer$special$$inlined$CoroutineExceptionHandler$1;
        this.imageQueueChannel = k.a(1, 4, EnumC11113a.DROP_OLDEST);
        B0 b11 = X0.b();
        Intrinsics.checkNotNullExpressionValue(executor, "executor");
        C2862e a11 = N.a(CoroutineContext.Element.a.d(new C10745r0(executor), (H0) b11).plus(fintechBaseImageAnalyzer$special$$inlined$CoroutineExceptionHandler$1));
        this.analyzerScope = a11;
        EnumC11113a enumC11113a = EnumC11113a.DROP_LATEST;
        this.detectedDataFlow = E0.a(0, 1, enumC11113a);
        this.needAutoFocusFlow = E0.a(0, 1, enumC11113a);
        C10727i.c(a11, null, null, new AnonymousClass1(null), 3);
    }

    private final void checkForAutoFocus(p imageProxy) {
        ByteBuffer imageByteBuffer;
        if (this.mobScannerConfig.getSharpnessThreshold() <= 0 || (imageByteBuffer = ImageAnalyzerUtilsKt.getImageByteBuffer(imageProxy)) == null) {
            return;
        }
        C10727i.c(this.appCoroutineScopes.a(), null, null, new FintechBaseImageAnalyzer$checkForAutoFocus$1$1(imageByteBuffer, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread executor$lambda$0(FintechBaseImageAnalyzer fintechBaseImageAnalyzer, Runnable runnable) {
        return new Thread(runnable, "FintechBaseImageAnalyzerThread-".concat(fintechBaseImageAnalyzer.getClass().getSimpleName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, ru.ozon.fintech.features.camera.scanners.api.DetectedData] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, java.lang.Object, ru.ozon.fintech.features.camera.scanners.api.DetectedData] */
    public final void makeScan(Bitmap bitmap, CameraScannerSource cameraScannerSource) {
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        m11.f71787a = DetectedData.INSTANCE.empty(cameraScannerSource, null);
        for (Map.Entry<CameraScannerType, CameraScanner> entry : getScanners().entrySet()) {
            CameraScannerType key = entry.getKey();
            CameraScanner value = entry.getValue();
            L80.a.a("SCAN_FLOW", "try scan with " + key);
            if (!((DetectedData) m11.f71787a).hasData()) {
                try {
                    ?? process = value.process(bitmap, cameraScannerSource, 0);
                    L80.a.a("SCAN_FLOW", "scan result for " + key + " is " + ((Object) process));
                    m11.f71787a = process;
                } catch (Exception e11) {
                    L80.a.b("SCAN_FLOW", "error process scanning e=" + e11);
                }
            }
        }
        this.detectedDataFlow.tryEmit(m11.f71787a);
    }

    @Override // androidx.camera.core.h.a
    public void analyze(@NotNull p imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        L80.a.a("SCAN_FLOW", "imageProxy=" + imageProxy.getWidth() + " " + imageProxy.getHeight());
        if (System.currentTimeMillis() - this.lastProcessed > this.mobScannerConfig.getScannerQueueDebounce()) {
            this.lastProcessed = System.currentTimeMillis();
            Bitmap B02 = imageProxy.B0();
            Intrinsics.checkNotNullExpressionValue(B02, "toBitmap(...)");
            Bitmap normalizeBitmapRotation = ImageAnalyzerUtilsKt.normalizeBitmapRotation(B02, imageProxy);
            Bitmap cropBoxBitmap = ImageAnalyzerUtilsKt.cropBoxBitmap(this.preview, this.boxRect, normalizeBitmapRotation);
            if (cropBoxBitmap != null) {
                normalizeBitmapRotation = cropBoxBitmap;
            }
            checkForAutoFocus(imageProxy);
            this.imageQueueChannel.b(new BitmapItem(normalizeBitmapRotation, CameraScannerSource.CAMERA));
        }
        imageProxy.close();
    }

    @NotNull
    protected final M getAnalyzerScope() {
        return this.analyzerScope;
    }

    public final Rect getBoxRect() {
        return this.boxRect;
    }

    @Override // androidx.camera.core.h.a
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return null;
    }

    @NotNull
    public final w0<DetectedData> getDetectedDataFlow() {
        return this.detectedDataFlow;
    }

    @NotNull
    protected final MobScannerConfig getMobScannerConfig() {
        return this.mobScannerConfig;
    }

    @NotNull
    public final w0<Unit> getNeedAutoFocusFlow() {
        return this.needAutoFocusFlow;
    }

    public final PreviewView getPreview() {
        return this.preview;
    }

    @NotNull
    protected abstract Map<CameraScannerType, CameraScanner> getScanners();

    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return 0;
    }

    public final void manualFromBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.imageQueueChannel.b(new BitmapItem(bitmap, CameraScannerSource.MANUAL));
    }

    public final void setBoxRect(Rect rect) {
        this.boxRect = rect;
    }

    public final void setPreview(PreviewView previewView) {
        this.preview = previewView;
    }

    public final void shutdown() {
        L80.a.a("SCAN_FLOW", "shutdown");
        N.c(this.analyzerScope, null);
        this.imageQueueChannel.l(null);
        this.executor.shutdown();
        for (Map.Entry<CameraScannerType, CameraScanner> entry : getScanners().entrySet()) {
            entry.getKey();
            entry.getValue().shutdown();
        }
    }

    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
    }

    public final void warmUp() {
        L80.a.a("SCAN_FLOW", "warmUp");
        for (Map.Entry<CameraScannerType, CameraScanner> entry : getScanners().entrySet()) {
            entry.getKey();
            entry.getValue().warmUp();
        }
    }
}
