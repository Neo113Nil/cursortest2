package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.MessageLite;
import java.util.List;

/* loaded from: classes10.dex */
public interface TombstoneProtos$StackHistoryBufferOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    TombstoneProtos$StackHistoryBufferEntry getEntries(int i11);

    int getEntriesCount();

    List<TombstoneProtos$StackHistoryBufferEntry> getEntriesList();

    long getTid();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
