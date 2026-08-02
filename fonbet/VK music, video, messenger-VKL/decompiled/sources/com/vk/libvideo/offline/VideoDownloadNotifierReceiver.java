package com.vk.libvideo.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import xsna.fxc0;

/* compiled from: VideoDownloadNotifierReceiver.kt */
/* loaded from: classes3.dex */
public final class VideoDownloadNotifierReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        Bundle extras = intent.getExtras();
        VideoFile videoFile = extras != null ? (VideoFile) extras.getParcelable("videoFile") : null;
        if (action.equals(VideoDownloadNotifierReceiver$Companion$Actions.ACTION_CLICK.getTitle())) {
            fxc0.B().Y().D(context, true);
            return;
        }
        if (action.equals(VideoDownloadNotifierReceiver$Companion$Actions.ACTION_PAUSE.getTitle())) {
            if (videoFile != null) {
                fxc0.B().s().n(videoFile, VideoScreenMode.INVISIBLE);
            }
        } else if (action.equals(VideoDownloadNotifierReceiver$Companion$Actions.ACTION_CANCEL.getTitle())) {
            if (videoFile != null) {
                fxc0.B().s().F(videoFile, VideoScreenMode.INVISIBLE);
            }
        } else {
            if (!action.equals(VideoDownloadNotifierReceiver$Companion$Actions.ACTION_RESUME.getTitle()) || videoFile == null) {
                return;
            }
            fxc0.B().s().d(videoFile, VideoScreenMode.INVISIBLE);
        }
    }
}
