package com.vk.im.engine.internal.longpoll.response_handler;

import com.vk.im.engine.internal.longpoll.response_handler.a;
import com.vk.im.engine.models.LongPollType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LongPollUpdate.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: LongPollUpdate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LongPollType.values().length];
            try {
                iArr[LongPollType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongPollType.CHANNELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.vk.im.engine.internal.longpoll.response_handler.a a(LongPollType longPollType) {
        int i = a.$EnumSwitchMapping$0[longPollType.ordinal()];
        if (i == 1) {
            return a.c.a;
        }
        if (i == 2) {
            return a.C1117a.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
