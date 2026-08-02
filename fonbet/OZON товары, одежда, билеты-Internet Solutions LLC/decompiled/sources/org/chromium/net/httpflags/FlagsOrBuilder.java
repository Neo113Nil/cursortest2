package org.chromium.net.httpflags;

import com.google.protobuf.A;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* loaded from: classes6.dex */
public interface FlagsOrBuilder extends A {
    boolean containsFlags(String str);

    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    Map<String, FlagValue> getFlags();

    int getFlagsCount();

    Map<String, FlagValue> getFlagsMap();

    FlagValue getFlagsOrDefault(String str, FlagValue flagValue);

    FlagValue getFlagsOrThrow(String str);

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
