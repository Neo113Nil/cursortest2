package com.mbridge.msdk.foundation.download.resource.stream;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface DownloadFileOutputStream {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j) throws IOException, IllegalAccessException;

    void setLength(long j) throws IOException, IllegalAccessException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
