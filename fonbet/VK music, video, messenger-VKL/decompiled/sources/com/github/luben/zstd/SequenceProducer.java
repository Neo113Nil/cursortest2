package com.github.luben.zstd;

/* loaded from: classes12.dex */
public interface SequenceProducer {
    long createState();

    void freeState(long j);

    long getFunctionPointer();
}
