package io.radar.sdk.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Flushable.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lio/radar/sdk/util/Flushable;", ExifInterface.GPS_DIRECTION_TRUE, "", "get", "", "onFlush", "", "success", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Flushable<T> {
    List<T> get();

    void onFlush(boolean success);
}
