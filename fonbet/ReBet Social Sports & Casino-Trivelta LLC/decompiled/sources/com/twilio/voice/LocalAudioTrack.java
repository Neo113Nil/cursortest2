package com.twilio.voice;

import android.content.Context;
import androidx.annotation.NonNull;
import com.twilio.voice.AudioOptions;

/* loaded from: classes4.dex */
class LocalAudioTrack extends AudioTrack {
    private static final Logger logger = Logger.getLogger(LocalAudioTrack.class);
    private final MediaFactory mediaFactory;
    private long nativeLocalAudioTrackHandle;
    private final String trackId;

    public LocalAudioTrack(long j10, @NonNull String str, @NonNull String str2, boolean z10, Context context) {
        super(z10, str2);
        Preconditions.checkApplicationContext(context, "must create local audio track with application context");
        this.trackId = str;
        this.nativeLocalAudioTrackHandle = j10;
        this.mediaFactory = MediaFactory.instance(this, context);
    }

    public static LocalAudioTrack create(@NonNull Context context, boolean z10) {
        return create(context, z10, new AudioOptions.Builder().build(), null);
    }

    private native void nativeEnable(long j10, boolean z10);

    private native boolean nativeIsEnabled(long j10);

    private native void nativeRelease(long j10);

    public synchronized void enable(boolean z10) {
        try {
            if (isReleased()) {
                logger.e("Cannot enable a local audio track that has been removed");
            } else {
                nativeEnable(this.nativeLocalAudioTrackHandle, z10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.twilio.voice.AudioTrack, com.twilio.voice.Track
    public String getName() {
        return super.getName();
    }

    public synchronized long getNativeHandle() {
        return this.nativeLocalAudioTrackHandle;
    }

    public String getTrackId() {
        return this.trackId;
    }

    @Override // com.twilio.voice.AudioTrack, com.twilio.voice.Track
    public synchronized boolean isEnabled() {
        if (isReleased()) {
            logger.w("Local audio track is not enabled because it has been released");
            return false;
        }
        return nativeIsEnabled(this.nativeLocalAudioTrackHandle);
    }

    public boolean isReleased() {
        return this.nativeLocalAudioTrackHandle == 0;
    }

    public synchronized void release() {
        if (!isReleased()) {
            nativeRelease(this.nativeLocalAudioTrackHandle);
            this.nativeLocalAudioTrackHandle = 0L;
            this.mediaFactory.release(this);
        }
    }

    public static LocalAudioTrack create(@NonNull Context context, boolean z10, @NonNull AudioOptions audioOptions) {
        return create(context, z10, audioOptions, null);
    }

    public static LocalAudioTrack create(@NonNull Context context, boolean z10, String str) {
        return create(context, z10, new AudioOptions.Builder().build(), str);
    }

    public static LocalAudioTrack create(@NonNull Context context, boolean z10, @NonNull AudioOptions audioOptions, String str) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(audioOptions, "audioOptions must not be null.");
        Preconditions.checkState(Utils.permissionGranted(context, "android.permission.RECORD_AUDIO"), "RECORD_AUDIO permission must be granted to create audio track");
        Object obj = new Object();
        MediaFactory instance = MediaFactory.instance(obj, context.getApplicationContext());
        LocalAudioTrack createAudioTrack = instance.createAudioTrack(context.getApplicationContext(), z10, audioOptions, str);
        if (createAudioTrack == null) {
            logger.e("Failed to create local audio track");
        }
        instance.release(obj);
        return createAudioTrack;
    }
}
