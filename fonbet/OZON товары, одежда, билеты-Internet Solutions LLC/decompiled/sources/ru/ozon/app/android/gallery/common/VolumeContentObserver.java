package ru.ozon.app.android.gallery.common;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R.\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00020\u001c*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/gallery/common/VolumeContentObserver;", "Landroid/database/ContentObserver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "registerContentObserver", "()V", "unregisterContentObserver", "", "deliverSelfNotifications", "()Z", "selfChange", "onChange", "(Z)V", "Landroid/content/Context;", "Lru/ozon/app/android/gallery/common/VolumeContentObserver$Listener;", AppMeasurementSdk.ConditionalUserProperty.VALUE, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lru/ozon/app/android/gallery/common/VolumeContentObserver$Listener;", "getListener", "()Lru/ozon/app/android/gallery/common/VolumeContentObserver$Listener;", "setListener", "(Lru/ozon/app/android/gallery/common/VolumeContentObserver$Listener;)V", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "", "prevVolume", "I", "getVolume", "(Landroid/media/AudioManager;)I", "volume", "Listener", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VolumeContentObserver extends ContentObserver {

    @NotNull
    private final AudioManager audioManager;

    @NotNull
    private final Context context;
    private Listener listener;
    private int prevVolume;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/gallery/common/VolumeContentObserver$Listener;", "", "onVolumeUp", "", "volume", "", "onVolumeDown", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onVolumeDown(int volume);

        void onVolumeUp(int volume);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VolumeContentObserver(@NotNull Context context) {
        super(new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("audio");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.audioManager = audioManager;
        this.prevVolume = getVolume(audioManager);
    }

    private final int getVolume(AudioManager audioManager) {
        return audioManager.getStreamVolume(3);
    }

    private final void registerContentObserver() {
        this.context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    private final void unregisterContentObserver() {
        this.context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) {
        Listener listener;
        int volume = getVolume(this.audioManager);
        int i11 = this.prevVolume;
        if (volume > i11) {
            Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onVolumeUp(volume);
            }
        } else if (volume < i11 && (listener = this.listener) != null) {
            listener.onVolumeDown(volume);
        }
        this.prevVolume = volume;
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
        if (listener == null) {
            unregisterContentObserver();
        } else {
            registerContentObserver();
        }
    }
}
