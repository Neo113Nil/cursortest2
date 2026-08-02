package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryDump;

/* loaded from: classes10.dex */
public interface TombstoneProtos$MemoryDumpOrBuilder extends A {
    TombstoneProtos$ArmMTEMetadata getArmMteMetadata();

    long getBeginAddress();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getMappingName();

    ByteString getMappingNameBytes();

    ByteString getMemory();

    TombstoneProtos$MemoryDump.a getMetadataCase();

    String getRegisterName();

    ByteString getRegisterNameBytes();

    boolean hasArmMteMetadata();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
