package ru.ozon.app.android.product.common.wave;

import android.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/product/common/wave/WavePathBuilder;", "", "<init>", "()V", "wavePath", "Landroid/graphics/Path;", "getPath", "buildPath", "", "waveWidth", "", "height", "width", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WavePathBuilder {

    @NotNull
    private Path wavePath = new Path();

    public final void buildPath(float waveWidth, float height, float width) {
        Path path = new Path();
        float f7 = 2;
        float f11 = waveWidth / f7;
        float f12 = height / f7;
        path.moveTo(0.0f, f12);
        path.setFillType(Path.FillType.EVEN_ODD);
        boolean z11 = true;
        for (float f13 = 0.0f; f13 <= width; f13 += f11) {
            if (z11) {
                path.quadTo((f11 / f7) + f13, 0.0f, f13 + f11, f12);
            } else {
                path.quadTo((f11 / f7) + f13, height, f13 + f11, f12);
            }
            z11 = !z11;
        }
        path.lineTo(width, height);
        path.lineTo(0.0f, height);
        path.close();
        this.wavePath = path;
    }

    @NotNull
    /* renamed from: getPath, reason: from getter */
    public final Path getWavePath() {
        return this.wavePath;
    }
}
