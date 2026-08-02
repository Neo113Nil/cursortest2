package ru.ozon.app.android.video.download;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\nR?\u0010\u0013\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u0010j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0011`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/video/download/DownloadListenersStorage;", "", "<init>", "()V", "", "videoUrl", "Lru/ozon/app/android/video/download/DownloadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Ljava/lang/String;Lru/ozon/app/android/video/download/DownloadListener;)V", "Lkotlin/Function1;", "notifyAction", "notifyAndRemoveListeners", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "removeListener", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "listeners", "Ljava/util/HashMap;", "getListeners", "()Ljava/util/HashMap;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DownloadListenersStorage {

    @NotNull
    private final HashMap<String, List<DownloadListener>> listeners = new HashMap<>();

    public final void addListener(@NotNull String videoUrl, @NotNull DownloadListener listener) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listeners.containsKey(videoUrl)) {
            ((List) U.e(this.listeners, videoUrl)).add(listener);
        } else {
            this.listeners.put(videoUrl, C7714v.m0(listener));
        }
    }

    @NotNull
    public final HashMap<String, List<DownloadListener>> getListeners() {
        return this.listeners;
    }

    public final void notifyAndRemoveListeners(@NotNull String videoUrl, @NotNull Function1<? super DownloadListener, Unit> notifyAction) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(notifyAction, "notifyAction");
        if (this.listeners.containsKey(videoUrl)) {
            Iterator it = ((List) U.e(this.listeners, videoUrl)).iterator();
            while (it.hasNext()) {
                notifyAction.invoke(it.next());
                it.remove();
            }
        }
    }

    public final void removeListener(@NotNull String videoUrl, @NotNull DownloadListener listener) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listeners.containsKey(videoUrl)) {
            ((List) U.e(this.listeners, videoUrl)).remove(listener);
        }
    }
}
