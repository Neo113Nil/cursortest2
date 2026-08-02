package com.vk.richcontent.impl;

import com.vk.core.files.a;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* compiled from: TemporalContentRepository.kt */
/* loaded from: classes5.dex */
public final class TemporalContentRepository {

    /* compiled from: TemporalContentRepository.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CopyWithResultListener.CopyState.values().length];
            try {
                iArr[CopyWithResultListener.CopyState.NOT_COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyWithResultListener.CopyState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: TemporalContentRepository.kt */
    public static final class CopyWithResultListener implements a.b.InterfaceC0765a {
        public CopyState a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TemporalContentRepository.kt */
        public static final class CopyState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ CopyState[] $VALUES;
            public static final CopyState COMPLETED;
            public static final CopyState FAILED;
            public static final CopyState NOT_COMPLETED;

            static {
                CopyState copyState = new CopyState("NOT_COMPLETED", 0);
                NOT_COMPLETED = copyState;
                CopyState copyState2 = new CopyState("COMPLETED", 1);
                COMPLETED = copyState2;
                CopyState copyState3 = new CopyState(SignalingProtocol.HUNGUP_REASON_FAILED, 2);
                FAILED = copyState3;
                CopyState[] copyStateArr = {copyState, copyState2, copyState3};
                $VALUES = copyStateArr;
                $ENTRIES = new asp(copyStateArr);
            }

            public CopyState() {
                throw null;
            }

            public static CopyState valueOf(String str) {
                return (CopyState) Enum.valueOf(CopyState.class, str);
            }

            public static CopyState[] values() {
                return (CopyState[]) $VALUES.clone();
            }
        }

        @Override // com.vk.core.files.a.b.InterfaceC0765a
        public final void onComplete() {
            this.a = CopyState.COMPLETED;
        }

        @Override // com.vk.core.files.a.b.InterfaceC0765a
        public final void onError(Throwable th) {
            this.a = CopyState.FAILED;
        }

        @Override // com.vk.core.files.a.b.InterfaceC0765a
        public final void onStart() {
        }
    }
}
