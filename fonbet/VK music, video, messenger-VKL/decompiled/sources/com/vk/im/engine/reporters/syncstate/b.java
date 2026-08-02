package com.vk.im.engine.reporters.syncstate;

import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ImSyncStateStatReporter.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: ImSyncStateStatReporter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImBgSyncState.values().length];
            try {
                iArr[ImBgSyncState.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImBgSyncState.REFRESHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImBgSyncState.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImBgSyncState.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImBgSyncState.CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImSyncStateStatReporter.State a(ImBgSyncState imBgSyncState) {
        int i = a.$EnumSwitchMapping$0[imBgSyncState.ordinal()];
        if (i == 1 || i == 2) {
            return ImSyncStateStatReporter.State.ABSENT;
        }
        if (i == 3) {
            return ImSyncStateStatReporter.State.NETWORKING;
        }
        if (i == 4) {
            return ImSyncStateStatReporter.State.UPDATING;
        }
        if (i == 5) {
            return ImSyncStateStatReporter.State.AVAILABLE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
