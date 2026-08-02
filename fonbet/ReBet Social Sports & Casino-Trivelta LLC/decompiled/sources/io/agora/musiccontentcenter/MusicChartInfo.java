package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class MusicChartInfo {
    public String name;
    public int type;

    public MusicChartInfo() {
    }

    @CalledByNative
    public String getName() {
        return this.name;
    }

    @CalledByNative
    public int getType() {
        return this.type;
    }

    public String toString() {
        return "MusicChartInfo{name='" + this.name + "', type=" + this.type + '}';
    }

    @CalledByNative
    public MusicChartInfo(String str, int i10) {
        this.name = str;
        this.type = i10;
    }
}
