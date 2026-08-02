package com.vk.clips.interests.impl.ui;

import xsna.asp;
import xsna.pkn0;
import xsna.zrp;

/* compiled from: FlyAnimationConsumer.kt */
/* loaded from: classes16.dex */
public interface FlyAnimationConsumer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlyAnimationConsumer.kt */
    public static final class FlyCandidatesAmount {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FlyCandidatesAmount[] $VALUES;
        public static final FlyCandidatesAmount FEW;
        public static final FlyCandidatesAmount NORMAL;

        static {
            FlyCandidatesAmount flyCandidatesAmount = new FlyCandidatesAmount("FEW", 0);
            FEW = flyCandidatesAmount;
            FlyCandidatesAmount flyCandidatesAmount2 = new FlyCandidatesAmount("NORMAL", 1);
            NORMAL = flyCandidatesAmount2;
            FlyCandidatesAmount[] flyCandidatesAmountArr = {flyCandidatesAmount, flyCandidatesAmount2};
            $VALUES = flyCandidatesAmountArr;
            $ENTRIES = new asp(flyCandidatesAmountArr);
        }

        public FlyCandidatesAmount() {
            throw null;
        }

        public static FlyCandidatesAmount valueOf(String str) {
            return (FlyCandidatesAmount) Enum.valueOf(FlyCandidatesAmount.class, str);
        }

        public static FlyCandidatesAmount[] values() {
            return (FlyCandidatesAmount[]) $VALUES.clone();
        }
    }

    void a();

    void b(pkn0 pkn0Var, FlyCandidatesAmount flyCandidatesAmount);

    void c();
}
