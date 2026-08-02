package coil.util;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import com.braze.managers.x$$ExternalSyntheticApiModelOutline0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0004H\u0080\b¢\u0006\u0002\u0010\u0005\u001a&\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a6\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001\u001a#\u0010\u0011\u001a\u00020\u000b*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0080\b\u001a#\u0010\u0017\u001a\u00020\u000b*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0080\b\u001a\u0014\u0010\u0018\u001a\u00020\u000b*\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¨\u0006\u001a"}, d2 = {JWKParameterNames.PUBLIC_KEY_USE, ExifInterface.GPS_DIRECTION_TRUE, "Landroid/media/MediaMetadataRetriever;", "block", "Lkotlin/Function1;", "(Landroid/media/MediaMetadataRetriever;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getFrameAtTime", "Landroid/graphics/Bitmap;", "timeUs", "", "option", "", AnalyticsConstantsKt.KEY_CONFIG, "Landroid/graphics/Bitmap$Config;", "getScaledFrameAtTime", "dstWidth", "dstHeight", "widthPx", "Lcoil/size/Size;", "scale", "Lcoil/size/Scale;", "original", "Lkotlin/Function0;", "heightPx", "toPx", "Lcoil/size/Dimension;", "coil-video_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: coil.util.-VideoUtils, reason: invalid class name */
/* loaded from: classes4.dex */
public final class VideoUtils {

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: coil.util.-VideoUtils$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> T use(MediaMetadataRetriever mediaMetadataRetriever, Function1<? super MediaMetadataRetriever, ? extends T> function1) {
        try {
            T invoke = function1.invoke(mediaMetadataRetriever);
            if (Build.VERSION.SDK_INT >= 29) {
                UByte$$ExternalSyntheticBackport0.m13543m((Object) mediaMetadataRetriever);
            } else {
                mediaMetadataRetriever.release();
            }
            return invoke;
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 29) {
                UByte$$ExternalSyntheticBackport0.m13543m((Object) mediaMetadataRetriever);
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    public static final Bitmap getFrameAtTime(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, Bitmap.Config config) {
        Bitmap frameAtTime;
        if (Build.VERSION.SDK_INT >= 30) {
            MediaMetadataRetriever.BitmapParams m10319m = x$$ExternalSyntheticApiModelOutline0.m10319m();
            m10319m.setPreferredConfig(config);
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, i, m10319m);
            return frameAtTime;
        }
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    public static final Bitmap getScaledFrameAtTime(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, Bitmap.Config config) {
        Bitmap scaledFrameAtTime;
        Bitmap scaledFrameAtTime2;
        if (Build.VERSION.SDK_INT >= 30) {
            MediaMetadataRetriever.BitmapParams m10319m = x$$ExternalSyntheticApiModelOutline0.m10319m();
            m10319m.setPreferredConfig(config);
            scaledFrameAtTime2 = mediaMetadataRetriever.getScaledFrameAtTime(j, i, i2, i3, m10319m);
            return scaledFrameAtTime2;
        }
        scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i, i2, i3);
        return scaledFrameAtTime;
    }

    public static final int widthPx(Size size, Scale scale, Function0<Integer> function0) {
        return Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getWidth(), scale);
    }

    public static final int heightPx(Size size, Scale scale, Function0<Integer> function0) {
        return Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getHeight(), scale);
    }

    public static final int toPx(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).px;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
