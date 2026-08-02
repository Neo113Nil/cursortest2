package io.agora.rtc2;

/* loaded from: classes3.dex */
public class RecorderStreamInfo {
    public String channelId;
    public int recorderStreamType;
    public int uid;

    public RecorderStreamInfo() {
        this.uid = 0;
        this.channelId = null;
        this.recorderStreamType = 0;
    }

    public String toString() {
        return "channelId=" + this.channelId;
    }

    public RecorderStreamInfo(String str, int i10, int i11) {
        this.uid = i10;
        this.channelId = str;
        this.recorderStreamType = i11;
    }
}
