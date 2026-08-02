package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class SrcInfo {
    private int bitrateInKbps;
    private String name;

    public SrcInfo() {
    }

    @CalledByNative
    public int getBitrateInKbps() {
        return this.bitrateInKbps;
    }

    @CalledByNative
    public String getName() {
        return this.name;
    }

    public void setBitrateInKbps(int i10) {
        this.bitrateInKbps = i10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "SrcInfo{bitrateInKbps=" + this.bitrateInKbps + ", name=" + this.name + '}';
    }

    @CalledByNative
    public SrcInfo(int i10, String str) {
        this.bitrateInKbps = i10;
        this.name = str;
    }
}
