package ru.ozon.app.android.util.screenshottracker;

import U7.d;
import android.os.Environment;
import android.os.FileObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/util/screenshottracker/ScreenshotTrackerOldImpl;", "Lru/ozon/app/android/util/screenshottracker/ScreenshotTracker;", "onScreenshotDetected", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "directories", "", "", "fileObservers", "Landroid/os/FileObserver;", "start", "stop", "CreateFileObserver", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenshotTrackerOldImpl implements ScreenshotTracker {

    @NotNull
    private final List<String> directories;
    private List<? extends FileObserver> fileObservers;

    @NotNull
    private final Function0<Unit> onScreenshotDetected;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/util/screenshottracker/ScreenshotTrackerOldImpl$CreateFileObserver;", "Landroid/os/FileObserver;", "callback", "Lkotlin/Function0;", "", "path", "", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "onEvent", "event", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class CreateFileObserver extends FileObserver {

        @NotNull
        private final Function0<Unit> callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateFileObserver(@NotNull Function0<Unit> callback, @NotNull String path) {
            super(path);
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(path, "path");
            this.callback = callback;
        }

        @Override // android.os.FileObserver
        public void onEvent(int event, String path) {
            if (event == 256) {
                this.callback.invoke();
            }
        }
    }

    public ScreenshotTrackerOldImpl(@NotNull Function0<Unit> onScreenshotDetected) {
        Intrinsics.checkNotNullParameter(onScreenshotDetected, "onScreenshotDetected");
        this.onScreenshotDetected = onScreenshotDetected;
        this.directories = C7714v.b0(d.e(Environment.getExternalStorageDirectory().getPath(), "/Pictures/Screenshots"), d.e(Environment.getExternalStorageDirectory().getPath(), "/DCIM/Screenshots"));
    }

    @Override // ru.ozon.app.android.util.screenshottracker.ScreenshotTracker
    public void start() {
        List<String> list = this.directories;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CreateFileObserver createFileObserver = new CreateFileObserver(this.onScreenshotDetected, (String) it.next());
            createFileObserver.startWatching();
            arrayList.add(createFileObserver);
        }
        this.fileObservers = arrayList;
    }

    @Override // ru.ozon.app.android.util.screenshottracker.ScreenshotTracker
    public void stop() {
        List<? extends FileObserver> list = this.fileObservers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((FileObserver) it.next()).stopWatching();
            }
        }
        this.fileObservers = null;
    }
}
