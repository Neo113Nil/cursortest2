package io.agora.rtc2.video;

import io.agora.base.AlphaStitchMode;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes3.dex */
public class AgoraVideoFrame {
    public static final int BUFFER_TYPE_ARRAY = 2;
    public static final int BUFFER_TYPE_BUFFER = 1;
    public static final int BUFFER_TYPE_NONE = -1;
    public static final int BUFFER_TYPE_TEXTURE = 3;
    public static final int FORMAT_BGRA = 2;
    public static final int FORMAT_I420 = 1;
    public static final int FORMAT_I422 = 16;
    public static final int FORMAT_NONE = -1;
    public static final int FORMAT_NV21 = 3;
    public static final int FORMAT_RGBA = 4;
    public static final int FORMAT_TEXTURE_2D = 10;
    public static final int FORMAT_TEXTURE_OES = 11;
    public int format = 10;
    public long timeStamp = 0;
    public int stride = 0;
    public int height = 0;
    public int textureID = 0;
    public boolean syncMode = true;
    public float[] transform = null;
    public EGLContext eglContext10 = null;
    public android.opengl.EGLContext eglContext14 = null;
    public byte[] buf = null;
    public int cropLeft = 0;
    public int cropTop = 0;
    public int cropRight = 0;
    public int cropBottom = 0;
    public int rotation = 0;
    public AlphaStitchMode alphaStitchMode = AlphaStitchMode.ALPHA_NO_STITCH;

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AgoraVideoFrame{format=");
        sb2.append(this.format);
        sb2.append(", timeStamp=");
        sb2.append(this.timeStamp);
        sb2.append(", stride=");
        sb2.append(this.stride);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", textureID=");
        sb2.append(this.textureID);
        sb2.append(", buf.length=");
        byte[] bArr = this.buf;
        sb2.append(bArr != null ? bArr.length : 0);
        sb2.append(", cropLeft=");
        sb2.append(this.cropLeft);
        sb2.append(", cropTop=");
        sb2.append(this.cropTop);
        sb2.append(", cropRight=");
        sb2.append(this.cropRight);
        sb2.append(", cropBottom=");
        sb2.append(this.cropBottom);
        sb2.append(", rotation=");
        sb2.append(this.rotation);
        sb2.append(", alphaStitchMode=");
        sb2.append(this.alphaStitchMode);
        sb2.append('}');
        return sb2.toString();
    }
}
