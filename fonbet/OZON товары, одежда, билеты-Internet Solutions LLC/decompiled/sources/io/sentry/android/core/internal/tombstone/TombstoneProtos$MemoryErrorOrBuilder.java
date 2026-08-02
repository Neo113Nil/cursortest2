package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.MessageLite;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$MemoryError;

/* loaded from: classes10.dex */
public interface TombstoneProtos$MemoryErrorOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    TombstoneProtos$HeapObject getHeap();

    TombstoneProtos$MemoryError.a getLocationCase();

    TombstoneProtos$MemoryError.Tool getTool();

    int getToolValue();

    TombstoneProtos$MemoryError.Type getType();

    int getTypeValue();

    boolean hasHeap();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
