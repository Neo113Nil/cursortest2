package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

/* loaded from: classes10.dex */
public interface TombstoneProtos$FDOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    int getFd();

    String getOwner();

    ByteString getOwnerBytes();

    String getPath();

    ByteString getPathBytes();

    long getTag();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
