package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* loaded from: classes13.dex */
public enum ApplicationProcessState implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final Internal.EnumLiteMap<ApplicationProcessState> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<ApplicationProcessState> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final ApplicationProcessState findValueByNumber(int i) {
            if (i == 0) {
                return ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
            }
            if (i == 1) {
                return ApplicationProcessState.FOREGROUND;
            }
            if (i == 2) {
                return ApplicationProcessState.BACKGROUND;
            }
            if (i != 3) {
                return null;
            }
            return ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : ApplicationProcessState.FOREGROUND_BACKGROUND : ApplicationProcessState.BACKGROUND : ApplicationProcessState.FOREGROUND : ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN) != null;
        }
    }

    ApplicationProcessState(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }
}
