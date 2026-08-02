package L7;

import K7.InterfaceC1369j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.Intrinsics;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: g, reason: collision with root package name */
    public final f f7082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC1369j bitmapPool, InterfaceC6775d decodeBuffers, f platformDecoderOptions) {
        super(bitmapPool, decodeBuffers, platformDecoderOptions);
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        this.f7082g = platformDecoderOptions;
    }

    @Override // L7.b
    public int d(int i10, int i11, BitmapFactory.Options options) {
        Bitmap.Config config;
        Intrinsics.checkNotNullParameter(options, "options");
        config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return BitmapUtil.getSizeInByteForBitmap(i10, i11, config);
    }
}
