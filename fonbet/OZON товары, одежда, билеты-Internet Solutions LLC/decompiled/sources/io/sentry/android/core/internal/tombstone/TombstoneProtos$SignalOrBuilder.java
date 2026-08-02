package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

/* loaded from: classes10.dex */
public interface TombstoneProtos$SignalOrBuilder extends A {
    int getCode();

    String getCodeName();

    ByteString getCodeNameBytes();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    long getFaultAddress();

    TombstoneProtos$MemoryDump getFaultAdjacentMetadata();

    boolean getHasFaultAddress();

    boolean getHasSender();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    int getSenderPid();

    int getSenderUid();

    boolean hasFaultAdjacentMetadata();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
