package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* loaded from: classes13.dex */
public enum SessionVerbosity implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<SessionVerbosity> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<SessionVerbosity> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final SessionVerbosity findValueByNumber(int i) {
            if (i == 0) {
                return SessionVerbosity.SESSION_VERBOSITY_NONE;
            }
            if (i != 1) {
                return null;
            }
            return SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return (i != 0 ? i != 1 ? null : SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS : SessionVerbosity.SESSION_VERBOSITY_NONE) != null;
        }
    }

    SessionVerbosity(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }
}
