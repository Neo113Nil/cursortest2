package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.MessageLite;

/* loaded from: classes10.dex */
public interface TombstoneProtos$StackHistoryBufferEntryOrBuilder extends A {
    TombstoneProtos$BacktraceFrame getAddr();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    long getFp();

    long getTag();

    boolean hasAddr();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
