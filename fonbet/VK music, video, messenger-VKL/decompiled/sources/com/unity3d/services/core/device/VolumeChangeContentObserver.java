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

/* compiled from: VolumeChangeContentObserver.kt */
/* loaded from: classes14.dex */
public final class VolumeChangeContentObserver implements VolumeChange {
    private ContentObserver contentObserver;
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
    public synchronized void registerListener(VolumeChangeListener volumeChangeListener) {
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
            public void onChange(boolean z, Uri uri) {
                VolumeChangeContentObserver.this.triggerListeners();
            }
        };
        Context applicationContext = ClientProperties.getApplicationContext();
        if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
            contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, this.contentObserver);
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
                contentResolver.unregisterContentObserver(this.contentObserver);
            }
            this.contentObserver = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void unregisterListener(VolumeChangeListener volumeChangeListener) {
        this.listeners.remove(volumeChangeListener);
        if (this.listeners.isEmpty()) {
            stopObserving();
        }
    }
}
