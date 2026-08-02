package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

/* loaded from: classes10.dex */
public interface TombstoneProtos$CrashDetailOrBuilder extends A {
    ByteString getData();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    ByteString getName();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
