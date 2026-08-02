package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b extends OutputStream {
    public abstract void write(long j, int i) throws IOException;

    public abstract void write(long j, byte[] bArr) throws IOException;

    public abstract void write(long j, byte[] bArr, int i, int i2) throws IOException;
}
