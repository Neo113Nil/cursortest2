package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

/* loaded from: classes10.dex */
public interface TombstoneProtos$RegisterOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getName();

    ByteString getNameBytes();

    long getU64();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
