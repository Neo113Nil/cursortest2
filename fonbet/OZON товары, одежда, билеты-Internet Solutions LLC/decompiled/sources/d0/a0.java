package d0;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class a0 extends Q implements Y {

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public static final Z f60873c = new Z();

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodecInfo.VideoCapabilities f60874b;

    a0(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws U {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f60859a.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f60874b = videoCapabilities;
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> a(int i11) {
        try {
            return this.f60874b.getSupportedWidthsFor(i11);
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException(th2);
        }
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> c() {
        return this.f60874b.getBitrateRange();
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> d(int i11) {
        try {
            return this.f60874b.getSupportedHeightsFor(i11);
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException(th2);
        }
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> e() {
        return this.f60874b.getSupportedWidths();
    }

    @Override // d0.Y
    @NonNull
    public final Range<Integer> f() {
        return this.f60874b.getSupportedHeights();
    }

    @Override // d0.Y
    public final boolean g() {
        return true;
    }

    @Override // d0.Y
    public final int h() {
        return this.f60874b.getHeightAlignment();
    }

    @Override // d0.Y
    public final boolean i(int i11, int i12) {
        return this.f60874b.isSizeSupported(i11, i12);
    }

    @Override // d0.Y
    public final int j() {
        return this.f60874b.getWidthAlignment();
    }
}
