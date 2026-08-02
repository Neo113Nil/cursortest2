package io.agora.base.internal.video;

import android.os.Handler;
import androidx.annotation.NonNull;
import io.agora.base.VideoFrame;

/* loaded from: classes2.dex */
public interface IHandlerReplaceable {
    VideoFrame.Buffer applyNewI420Handler(@NonNull Handler handler, @NonNull YuvConverter yuvConverter);

    Handler getToI420Handler();

    YuvConverter getYuvConverter();
}
