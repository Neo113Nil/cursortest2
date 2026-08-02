package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Cause;

/* loaded from: classes10.dex */
public interface TombstoneProtos$CauseOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    TombstoneProtos$Cause.a getDetailsCase();

    String getHumanReadable();

    ByteString getHumanReadableBytes();

    TombstoneProtos$MemoryError getMemoryError();

    boolean hasMemoryError();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
