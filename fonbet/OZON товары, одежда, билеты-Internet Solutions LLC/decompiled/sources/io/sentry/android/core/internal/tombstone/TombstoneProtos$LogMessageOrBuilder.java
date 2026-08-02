package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

/* loaded from: classes10.dex */
public interface TombstoneProtos$LogMessageOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getMessage();

    ByteString getMessageBytes();

    int getPid();

    int getPriority();

    String getTag();

    ByteString getTagBytes();

    int getTid();

    String getTimestamp();

    ByteString getTimestampBytes();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
