package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import java.util.List;

/* loaded from: classes10.dex */
public interface TombstoneProtos$LogBufferOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    TombstoneProtos$LogMessage getLogs(int i11);

    int getLogsCount();

    List<TombstoneProtos$LogMessage> getLogsList();

    String getName();

    ByteString getNameBytes();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
