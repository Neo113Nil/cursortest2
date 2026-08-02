package ru.ozon.fintech.features.camera.scanners.service;

import H30.v;
import Sc.InterfaceC4008j;
import Sc.n;
import Sc.s;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.IBinder;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrAnalyzer;
import ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrResultCallback;
import ru.ozon.fintech.features.camera.scanners.salute.SaluteInteractor;
import ru.ozon.fintech.features.camera.scanners.service.SaluteQrService;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.C10745r0;
import xe.H0;
import xe.J;
import xe.L0;
import xe.M;
import xe.N;
import xe.X0;
import ze.EnumC11113a;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0001$\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/service/SaluteQrService;", "Landroid/app/Service;", "<init>", "()V", "", "shutdown", "Lru/ozon/fintech/features/camera/scanners/service/SaluteQrService$Task;", "task", "process", "(Lru/ozon/fintech/features/camera/scanners/service/SaluteQrService$Task;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onCreate", "onDestroy", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "Lxe/J;", "handler", "Lxe/J;", "Lxe/M;", "analyzerScope", "Lxe/M;", "Lze/h;", "taskChannel", "Lze/h;", "Lru/ozon/fintech/features/camera/scanners/salute/SaluteInteractor;", "saluteInteractor$delegate", "LSc/j;", "getSaluteInteractor", "()Lru/ozon/fintech/features/camera/scanners/salute/SaluteInteractor;", "saluteInteractor", "ru/ozon/fintech/features/camera/scanners/service/SaluteQrService$binder$1", "binder", "Lru/ozon/fintech/features/camera/scanners/service/SaluteQrService$binder$1;", "Companion", "Task", "camera-scanners-salute_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaluteQrService extends Service {

    @NotNull
    private static final String TAG = "SALUTE_SERVICE";

    @NotNull
    private final M analyzerScope;

    @NotNull
    private final SaluteQrService$binder$1 binder;
    private final ExecutorService executor;

    @NotNull
    private final J handler;

    /* renamed from: saluteInteractor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j saluteInteractor;

    @NotNull
    private final h<Task> taskChannel;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/service/SaluteQrService$Task;", "", "path", "", "callback", "Lru/ozon/fintech/features/camera/scanners/ipc/ISaluteQrResultCallback;", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/camera/scanners/ipc/ISaluteQrResultCallback;)V", "getPath", "()Ljava/lang/String;", "getCallback", "()Lru/ozon/fintech/features/camera/scanners/ipc/ISaluteQrResultCallback;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "camera-scanners-salute_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class Task {

        @NotNull
        private final ISaluteQrResultCallback callback;

        @NotNull
        private final String path;

        public Task(@NotNull String path, @NotNull ISaluteQrResultCallback callback) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.path = path;
            this.callback = callback;
        }

        public static /* synthetic */ Task copy$default(Task task, String str, ISaluteQrResultCallback iSaluteQrResultCallback, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = task.path;
            }
            if ((i11 & 2) != 0) {
                iSaluteQrResultCallback = task.callback;
            }
            return task.copy(str, iSaluteQrResultCallback);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ISaluteQrResultCallback getCallback() {
            return this.callback;
        }

        @NotNull
        public final Task copy(@NotNull String path, @NotNull ISaluteQrResultCallback callback) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new Task(path, callback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Task)) {
                return false;
            }
            Task task = (Task) other;
            return Intrinsics.d(this.path, task.path) && Intrinsics.d(this.callback, task.callback);
        }

        @NotNull
        public final ISaluteQrResultCallback getCallback() {
            return this.callback;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.callback.hashCode() + (this.path.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Task(path=" + this.path + ", callback=" + this.callback + ")";
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [ru.ozon.fintech.features.camera.scanners.service.SaluteQrService$binder$1] */
    public SaluteQrService() {
        ExecutorService executor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ru.ozon.fintech.features.camera.scanners.service.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread executor$lambda$0;
                executor$lambda$0 = SaluteQrService.executor$lambda$0(SaluteQrService.this, runnable);
                return executor$lambda$0;
            }
        });
        this.executor = executor;
        SaluteQrService$special$$inlined$CoroutineExceptionHandler$1 saluteQrService$special$$inlined$CoroutineExceptionHandler$1 = new SaluteQrService$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.handler = saluteQrService$special$$inlined$CoroutineExceptionHandler$1;
        B0 b11 = X0.b();
        Intrinsics.checkNotNullExpressionValue(executor, "executor");
        this.analyzerScope = N.a(CoroutineContext.Element.a.d(new C10745r0(executor), (H0) b11).plus(saluteQrService$special$$inlined$CoroutineExceptionHandler$1));
        this.taskChannel = k.a(1, 4, EnumC11113a.DROP_OLDEST);
        this.saluteInteractor = Sc.k.a(n.PUBLICATION, new v(1));
        this.binder = new ISaluteQrAnalyzer.Stub() { // from class: ru.ozon.fintech.features.camera.scanners.service.SaluteQrService$binder$1
            @Override // ru.ozon.fintech.features.camera.scanners.ipc.ISaluteQrAnalyzer
            public void analyze(String imagePath, Bundle params, ISaluteQrResultCallback callback) {
                h hVar;
                if (imagePath == null || callback == null) {
                    return;
                }
                hVar = SaluteQrService.this.taskChannel;
                hVar.b(new SaluteQrService.Task(imagePath, callback));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread executor$lambda$0(SaluteQrService saluteQrService, Runnable runnable) {
        return new Thread(runnable, "FintechSaluteQrServiceThread-".concat(saluteQrService.getClass().getSimpleName()));
    }

    private final SaluteInteractor getSaluteInteractor() {
        return (SaluteInteractor) this.saluteInteractor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(2:(1:(1:(1:12)(2:16|17))(1:18))(1:20)|19)(3:21|22|(2:24|(2:26|(2:28|29))(2:30|(2:32|29)))(2:33|34))|13|14))|38|6|7|(0)(0)|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0041, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        L80.a.c(ru.ozon.fintech.features.camera.scanners.service.SaluteQrService.TAG, "process try/catch", r10);
        r10 = xe.C10720e0.f105451a;
        r10 = De.s.f6650a;
        r2 = new ru.ozon.fintech.features.camera.scanners.service.SaluteQrService$process$4(r9, null);
        r0.L$0 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (xe.C10727i.f(r10, r2, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object process(Task task, d<? super Unit> dVar) {
        SaluteQrService$process$1 saluteQrService$process$1;
        int i11;
        if (dVar instanceof SaluteQrService$process$1) {
            saluteQrService$process$1 = (SaluteQrService$process$1) dVar;
            int i12 = saluteQrService$process$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                saluteQrService$process$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = saluteQrService$process$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = saluteQrService$process$1.label;
                if (i11 == 0) {
                    if (i11 == 1) {
                    } else if (i11 == 2) {
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    s.b(obj);
                } else {
                    s.b(obj);
                    L80.a.a(TAG, "process new Task");
                    Bitmap decodeFile = BitmapFactory.decodeFile(task.getPath());
                    if (decodeFile == null) {
                        throw new IllegalStateException("Decode failed");
                    }
                    SaluteInteractor.ScanResult analyze = getSaluteInteractor().analyze(decodeFile);
                    if (analyze != null) {
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 l02 = De.s.f6650a;
                        SaluteQrService$process$2 saluteQrService$process$2 = new SaluteQrService$process$2(task, analyze, null);
                        saluteQrService$process$1.L$0 = task;
                        saluteQrService$process$1.label = 1;
                        if (C10727i.f(l02, saluteQrService$process$2, saluteQrService$process$1) == aVar) {
                            return aVar;
                        }
                    } else {
                        C10720e0 c10720e02 = C10720e0.f105451a;
                        L0 l03 = De.s.f6650a;
                        SaluteQrService$process$3 saluteQrService$process$3 = new SaluteQrService$process$3(task, null);
                        saluteQrService$process$1.L$0 = task;
                        saluteQrService$process$1.label = 2;
                        if (C10727i.f(l03, saluteQrService$process$3, saluteQrService$process$1) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.f71690a;
            }
        }
        saluteQrService$process$1 = new SaluteQrService$process$1(this, dVar);
        Object obj2 = saluteQrService$process$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = saluteQrService$process$1.label;
        if (i11 == 0) {
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaluteInteractor saluteInteractor_delegate$lambda$2() {
        return new SaluteInteractor();
    }

    private final void shutdown() {
        N.c(this.analyzerScope, null);
        this.executor.shutdown();
        this.taskChannel.l(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        L80.a.a(TAG, "onBind");
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        L80.a.a(TAG, "onCreate");
        C10727i.c(this.analyzerScope, null, null, new SaluteQrService$onCreate$1(this, null), 3);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        L80.a.a(TAG, "onDestroy");
        shutdown();
    }
}
