package ru.ozon.app.android.video.player.soundservice.soundContentObserver;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver;", "Landroid/database/ContentObserver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "registerContentObserver", "()V", "", "deliverSelfNotifications", "()Z", "selfChange", "onChange", "(Z)V", "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver$Listener;)V", "Landroid/content/Context;", "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserverDelegate;", "observerDelegate", "Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserverDelegate;", "Listener", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SoundContentObserver extends ContentObserver {

    @NotNull
    private final Context context;

    @NotNull
    private final SoundContentObserverDelegate observerDelegate;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/video/player/soundservice/soundContentObserver/SoundContentObserver$Listener;", "", "onUnmute", "", "onMute", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onMute();

        void onUnmute();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundContentObserver(@NotNull Context context) {
        super(new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.observerDelegate = new AsyncSoundContentObserverDelegate(context);
        registerContentObserver();
    }

    private final void registerContentObserver() {
        this.context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void addListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.observerDelegate.addListener(listener);
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) {
        this.observerDelegate.handleOnVolumeChange();
    }
}
