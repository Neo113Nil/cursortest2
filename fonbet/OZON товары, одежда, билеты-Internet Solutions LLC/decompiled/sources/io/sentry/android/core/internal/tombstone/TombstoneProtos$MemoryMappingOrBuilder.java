package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

/* loaded from: classes10.dex */
public interface TombstoneProtos$MemoryMappingOrBuilder extends A {
    long getBeginAddress();

    String getBuildId();

    ByteString getBuildIdBytes();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    long getEndAddress();

    boolean getExecute();

    long getLoadBias();

    String getMappingName();

    ByteString getMappingNameBytes();

    long getOffset();

    boolean getRead();

    boolean getWrite();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
