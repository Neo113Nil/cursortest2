package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

/* loaded from: classes10.dex */
public interface TombstoneProtos$BacktraceFrameOrBuilder extends A {
    String getBuildId();

    ByteString getBuildIdBytes();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    long getFileMapOffset();

    String getFileName();

    ByteString getFileNameBytes();

    String getFunctionName();

    ByteString getFunctionNameBytes();

    long getFunctionOffset();

    long getPc();

    long getRelPc();

    long getSp();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
