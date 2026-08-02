package com.vk.im.engine.internal.sync.longpoll;

import com.vk.im.engine.models.LongPollType;
import java.util.Collections;
import java.util.Set;
import xsna.asp;
import xsna.rl3;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongPollStateComposingPolicy.kt */
/* loaded from: classes2.dex */
public final class LongPollStateComposingPolicy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LongPollStateComposingPolicy[] $VALUES;
    public static final LongPollStateComposingPolicy ALL;
    public static final LongPollStateComposingPolicy MESSAGES_AND_CHANNELS;
    public static final LongPollStateComposingPolicy MESSAGES_ONLY;
    private final Set<LongPollType> composingTypes;

    static {
        LongPollType longPollType = LongPollType.MESSAGES;
        LongPollStateComposingPolicy longPollStateComposingPolicy = new LongPollStateComposingPolicy(0, "MESSAGES_ONLY", Collections.singleton(longPollType));
        MESSAGES_ONLY = longPollStateComposingPolicy;
        LongPollType longPollType2 = LongPollType.CHANNELS;
        LongPollStateComposingPolicy longPollStateComposingPolicy2 = new LongPollStateComposingPolicy(1, "MESSAGES_AND_CHANNELS", rl3.y0(new LongPollType[]{longPollType, longPollType2}));
        MESSAGES_AND_CHANNELS = longPollStateComposingPolicy2;
        LongPollStateComposingPolicy longPollStateComposingPolicy3 = new LongPollStateComposingPolicy(2, "ALL", rl3.y0(new LongPollType[]{longPollType, longPollType2}));
        ALL = longPollStateComposingPolicy3;
        LongPollStateComposingPolicy[] longPollStateComposingPolicyArr = {longPollStateComposingPolicy, longPollStateComposingPolicy2, longPollStateComposingPolicy3};
        $VALUES = longPollStateComposingPolicyArr;
        $ENTRIES = new asp(longPollStateComposingPolicyArr);
    }

    public LongPollStateComposingPolicy(int i, String str, Set set) {
        this.composingTypes = set;
    }

    public static LongPollStateComposingPolicy valueOf(String str) {
        return (LongPollStateComposingPolicy) Enum.valueOf(LongPollStateComposingPolicy.class, str);
    }

    public static LongPollStateComposingPolicy[] values() {
        return (LongPollStateComposingPolicy[]) $VALUES.clone();
    }

    public final Set<LongPollType> h() {
        return this.composingTypes;
    }
}
