package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;
import java.util.HashMap;

/* loaded from: classes3.dex */
class VideoCaptureFormat {
    static final String keyFPS = "fps";
    static final String keyFormat = "format";
    static final String keyHeight = "height";
    static final String keyWidth = "width";
    final int mFramerate;
    final int mHeight;
    final int mPixelFormat;
    final int mWidth;

    @CalledByNative
    public VideoCaptureFormat(int i10, int i11, int i12, int i13) {
        this.mWidth = i10;
        this.mHeight = i11;
        this.mFramerate = i12;
        this.mPixelFormat = i13;
    }

    public static VideoCaptureFormat fromString(String str) {
        if (str != null && str.startsWith("{")) {
            String[] split = str.substring(1, str.length() - 1).split(",");
            HashMap hashMap = new HashMap();
            try {
                for (String str2 : split) {
                    String[] split2 = str2.split("=");
                    hashMap.put(split2[0].trim(), Integer.valueOf(Integer.parseInt(split2[1].trim())));
                }
                return new VideoCaptureFormat(((Integer) hashMap.get("width")).intValue(), ((Integer) hashMap.get("height")).intValue(), ((Integer) hashMap.get(keyFPS)).intValue(), ((Integer) hashMap.get(keyFormat)).intValue());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    @CalledByNative
    public int getFramerate() {
        return this.mFramerate;
    }

    @CalledByNative
    public int getHeight() {
        return this.mHeight;
    }

    @CalledByNative
    public int getPixelFormat() {
        return this.mPixelFormat;
    }

    @CalledByNative
    public int getWidth() {
        return this.mWidth;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(this.mWidth));
        hashMap.put("height", Integer.valueOf(this.mHeight));
        hashMap.put(keyFPS, Integer.valueOf(this.mFramerate));
        hashMap.put(keyFormat, Integer.valueOf(this.mPixelFormat));
        return hashMap.toString();
    }
}
