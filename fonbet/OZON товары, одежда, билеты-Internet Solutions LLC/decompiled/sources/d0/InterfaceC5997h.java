package d0;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5997h extends AutoCloseable {
    @NonNull
    MediaCodec.BufferInfo H();

    boolean K();

    long T();

    long size();

    @NonNull
    ByteBuffer u();
}
