package com.linecorp.apng.decoder;

import android.graphics.Bitmap;
import com.linecorp.apng.decoder.Apng;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: ApngDecoderJni.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0087 J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0087 J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0087 J\u0019\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0087 ¨\u0006\u0014"}, d2 = {"Lcom/linecorp/apng/decoder/ApngDecoderJni;", "", "<init>", "()V", "decode", "", "inputStream", "Ljava/io/InputStream;", "result", "Lcom/linecorp/apng/decoder/Apng$DecodeResult;", "isApng", "", "recycle", "id", "draw", "", "index", "bitmap", "Landroid/graphics/Bitmap;", "copy", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApngDecoderJni {
    public static final ApngDecoderJni INSTANCE = new ApngDecoderJni();

    @JvmStatic
    public static final native int copy(int id, Apng.DecodeResult result);

    @JvmStatic
    public static final native int decode(InputStream inputStream, Apng.DecodeResult result);

    @JvmStatic
    public static final native void draw(int id, int index, Bitmap bitmap);

    @JvmStatic
    public static final native boolean isApng(InputStream inputStream);

    @JvmStatic
    public static final native int recycle(int id);

    private ApngDecoderJni() {
    }

    static {
        System.loadLibrary("apng-drawable");
    }
}
