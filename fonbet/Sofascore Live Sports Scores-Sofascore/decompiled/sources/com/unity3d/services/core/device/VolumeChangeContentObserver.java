package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/device/VolumeChangeContentObserver;", "Lcom/unity3d/services/core/device/VolumeChange;", "<init>", "()V", "contentObserver", "Landroid/database/ContentObserver;", "listeners", "", "Lcom/unity3d/services/core/device/VolumeChangeListener;", "startObserving", "", "stopObserving", "registerListener", "volumeChangeListener", "unregisterListener", "clearAllListeners", "triggerListeners", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VolumeChangeContentObserver implements VolumeChange {

    @Nullable
    private ContentObserver contentObserver;

    @NotNull
    private List<VolumeChangeListener> listeners = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void triggerListeners() {
        for (VolumeChangeListener volumeChangeListener : this.listeners) {
            volumeChangeListener.onVolumeChanged(Device.getStreamVolume(volumeChangeListener.getStreamType()));
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void clearAllListeners() {
        this.listeners.clear();
        stopObserving();
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void registerListener(@NotNull VolumeChangeListener volumeChangeListener) {
        volumeChangeListener.getClass();
        if (!this.listeners.contains(volumeChangeListener)) {
            startObserving();
            this.listeners.add(volumeChangeListener);
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void startObserving() {
        ContentResolver contentResolver;
        if (this.contentObserver != null) {
            return;
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        this.contentObserver = new ContentObserver(handler) { // from class: com.unity3d.services.core.device.VolumeChangeContentObserver$startObserving$1
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return false;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange, Uri uri) {
                VolumeChangeContentObserver.this.triggerListeners();
            }
        };
        Context applicationContext = ClientProperties.getApplicationContext();
        if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
            Uri uri = Settings.System.CONTENT_URI;
            ContentObserver contentObserver = this.contentObserver;
            contentObserver.getClass();
            contentResolver.registerContentObserver(uri, true, contentObserver);
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void stopObserving() {
        ContentResolver contentResolver;
        try {
            if (this.contentObserver == null) {
                return;
            }
            Context applicationContext = ClientProperties.getApplicationContext();
            if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
                ContentObserver contentObserver = this.contentObserver;
                contentObserver.getClass();
                contentResolver.unregisterContentObserver(contentObserver);
            }
            this.contentObserver = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void unregisterListener(@NotNull VolumeChangeListener volumeChangeListener) {
        volumeChangeListener.getClass();
        this.listeners.remove(volumeChangeListener);
        if (this.listeners.isEmpty()) {
            stopObserving();
        }
    }
}
