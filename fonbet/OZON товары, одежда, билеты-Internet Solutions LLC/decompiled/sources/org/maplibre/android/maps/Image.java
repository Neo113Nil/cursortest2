package org.maplibre.android.maps;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes10.dex */
public class Image {
    private final byte[] buffer;
    private final float[] content;
    private final int height;
    private final String name;
    private final float pixelRatio;
    private final boolean sdf;
    private final float[] stretchX;
    private final float[] stretchY;
    private final int width;

    public Image(byte[] bArr, float f7, String str, int i11, int i12, boolean z11) {
        this(bArr, f7, str, i11, i12, z11, null, null, null);
    }

    public Image(byte[] bArr, float f7, String str, int i11, int i12, boolean z11, float[] fArr, float[] fArr2, float[] fArr3) {
        this.buffer = bArr;
        this.pixelRatio = f7;
        this.name = str;
        this.width = i11;
        this.height = i12;
        this.sdf = z11;
        this.content = fArr3;
        this.stretchX = fArr;
        this.stretchY = fArr2;
    }
}
