package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.MessageLite;
import java.util.List;

/* loaded from: classes10.dex */
public interface TombstoneProtos$HeapObjectOrBuilder extends A {
    long getAddress();

    TombstoneProtos$BacktraceFrame getAllocationBacktrace(int i11);

    int getAllocationBacktraceCount();

    List<TombstoneProtos$BacktraceFrame> getAllocationBacktraceList();

    long getAllocationTid();

    TombstoneProtos$BacktraceFrame getDeallocationBacktrace(int i11);

    int getDeallocationBacktraceCount();

    List<TombstoneProtos$BacktraceFrame> getDeallocationBacktraceList();

    long getDeallocationTid();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    long getSize();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
