package ru.ozon.app.android.ui.start;

import Lg0.c;
import Sc.InterfaceC4008j;
import Sc.k;
import androidx.lifecycle.w0;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ActivityInitializer;
import ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004*\u0001#\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR)\u0010\"\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00060\u00060\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/ui/start/HomePageViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ui/start/HomePageViewModel;", "LLg0/c;", "protectionAppDialog", "", "Lru/ozon/app/android/ui/start/launch/LauncherStateDialogProcessor;", "dialogProcessors", "Lru/ozon/app/android/ActivityInitializer;", "activityInitializer", "<init>", "(LLg0/c;Ljava/util/Set;Lru/ozon/app/android/ActivityInitializer;)V", "", "checkLaunchState", "()V", "onCleared", "LLg0/c;", "getProtectionAppDialog", "()LLg0/c;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/ui/start/LaunchDeeplink;", "launchStateLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getLaunchStateLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/LinkedList;", "processors$delegate", "LSc/j;", "getProcessors", "()Ljava/util/LinkedList;", "processors", "ru/ozon/app/android/ui/start/HomePageViewModelImpl$processTask$1", "processTask", "Lru/ozon/app/android/ui/start/HomePageViewModelImpl$processTask$1;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomePageViewModelImpl extends w0 implements HomePageViewModel {
    private final ExecutorService executor;

    @NotNull
    private final SingleLiveEvent<LaunchDeeplink> launchStateLiveData;

    @NotNull
    private final HomePageViewModelImpl$processTask$1 processTask;

    /* renamed from: processors$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j processors;

    @NotNull
    private final c protectionAppDialog;

    /* JADX WARN: Type inference failed for: r2v5, types: [ru.ozon.app.android.ui.start.HomePageViewModelImpl$processTask$1] */
    public HomePageViewModelImpl(@NotNull c protectionAppDialog, @NotNull Set<LauncherStateDialogProcessor> dialogProcessors, @NotNull ActivityInitializer activityInitializer) {
        Intrinsics.checkNotNullParameter(protectionAppDialog, "protectionAppDialog");
        Intrinsics.checkNotNullParameter(dialogProcessors, "dialogProcessors");
        Intrinsics.checkNotNullParameter(activityInitializer, "activityInitializer");
        this.protectionAppDialog = protectionAppDialog;
        this.launchStateLiveData = new SingleLiveEvent<>();
        this.executor = Executors.newSingleThreadExecutor();
        this.processors = k.b(new HomePageViewModelImpl$processors$2(dialogProcessors));
        this.processTask = new Runnable() { // from class: ru.ozon.app.android.ui.start.HomePageViewModelImpl$processTask$1
            @Override // java.lang.Runnable
            public void run() {
                LinkedList processors;
                ExecutorService executorService;
                processors = HomePageViewModelImpl.this.getProcessors();
                LauncherStateDialogProcessor launcherStateDialogProcessor = (LauncherStateDialogProcessor) processors.pollFirst();
                if (launcherStateDialogProcessor == null) {
                    return;
                }
                LaunchDeeplink start = launcherStateDialogProcessor.start();
                if (!Intrinsics.d(start, EmptyDeeplink.INSTANCE)) {
                    HomePageViewModelImpl.this.getLaunchStateLiveData().postValue(start);
                } else {
                    executorService = HomePageViewModelImpl.this.executor;
                    executorService.submit(this);
                }
            }
        };
        ActivityInitializer.DefaultImpls.startActivityInitializationSequence$default(activityInitializer, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkedList<LauncherStateDialogProcessor> getProcessors() {
        return (LinkedList) this.processors.getValue();
    }

    @Override // ru.ozon.app.android.ui.start.HomePageViewModel
    public void checkLaunchState() {
        this.executor.submit(this.processTask);
    }

    @Override // ru.ozon.app.android.ui.start.HomePageViewModel
    @NotNull
    public c getProtectionAppDialog() {
        return this.protectionAppDialog;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.executor.shutdown();
    }

    @Override // ru.ozon.app.android.ui.start.HomePageViewModel
    @NotNull
    public SingleLiveEvent<LaunchDeeplink> getLaunchStateLiveData() {
        return this.launchStateLiveData;
    }
}
