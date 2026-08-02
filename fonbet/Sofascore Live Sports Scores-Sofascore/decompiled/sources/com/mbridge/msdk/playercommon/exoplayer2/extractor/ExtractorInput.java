package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface ExtractorInput {
    void advancePeekPosition(int i) throws IOException, InterruptedException;

    boolean advancePeekPosition(int i, boolean z) throws IOException, InterruptedException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException;

    boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException;

    int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException;

    void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException;

    boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable;

    int skip(int i) throws IOException, InterruptedException;

    void skipFully(int i) throws IOException, InterruptedException;

    boolean skipFully(int i, boolean z) throws IOException, InterruptedException;
}
