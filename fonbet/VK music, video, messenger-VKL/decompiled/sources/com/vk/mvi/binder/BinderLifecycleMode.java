package com.vk.mvi.binder;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.gzs;
import xsna.s3q0;
import xsna.v37;
import xsna.zrp;

/* compiled from: BinderLifecycleMode.kt */
/* loaded from: classes3.dex */
public interface BinderLifecycleMode {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BinderLifecycleMode.kt */
    public static final class BindState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BindState[] $VALUES;
        public static final BindState ACTIVE;
        public static final BindState DESTROYED;
        public static final BindState STOPPED;

        static {
            BindState bindState = new BindState(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = bindState;
            BindState bindState2 = new BindState("STOPPED", 1);
            STOPPED = bindState2;
            BindState bindState3 = new BindState("DESTROYED", 2);
            DESTROYED = bindState3;
            BindState[] bindStateArr = {bindState, bindState2, bindState3};
            $VALUES = bindStateArr;
            $ENTRIES = new asp(bindStateArr);
        }

        public BindState() {
            throw null;
        }

        public static BindState valueOf(String str) {
            return (BindState) Enum.valueOf(BindState.class, str);
        }

        public static BindState[] values() {
            return (BindState[]) $VALUES.clone();
        }
    }

    /* compiled from: BinderLifecycleMode.kt */
    public interface a {
        void a(BindState bindState);
    }

    void a(gzs<s3q0> gzsVar);

    void b(v37 v37Var);
}
