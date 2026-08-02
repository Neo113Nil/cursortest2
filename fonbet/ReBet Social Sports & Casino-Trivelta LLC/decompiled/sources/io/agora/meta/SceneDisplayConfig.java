package io.agora.meta;

import io.agora.base.internal.CalledByNative;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class SceneDisplayConfig {
    public byte[] extraInfo;
    public int height;
    public int width;

    public SceneDisplayConfig() {
        this.width = 0;
        this.height = 0;
        this.extraInfo = null;
    }

    @CalledByNative
    public byte[] getExtraInfo() {
        return this.extraInfo;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "SceneDisplayConfig{width=" + this.width + ", height=" + this.height + ", extraInfo=" + Arrays.toString(this.extraInfo) + '}';
    }

    @CalledByNative
    public SceneDisplayConfig(int i10, int i11, byte[] bArr) {
        this.width = i10;
        this.height = i11;
        this.extraInfo = bArr;
    }
}
