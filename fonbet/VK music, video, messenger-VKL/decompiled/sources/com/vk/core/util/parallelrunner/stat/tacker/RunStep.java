package com.vk.core.util.parallelrunner.stat.tacker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RunStep.kt */
/* loaded from: classes.dex */
public final class RunStep {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RunStep[] $VALUES;
    public static final RunStep After;
    public static final RunStep AfterColdStart;
    public static final RunStep Before;
    public static final RunStep Parallel;
    private final String value;

    static {
        RunStep runStep = new RunStep("Before", 0, "before");
        Before = runStep;
        RunStep runStep2 = new RunStep("After", 1, "after");
        After = runStep2;
        RunStep runStep3 = new RunStep("Parallel", 2, "parallel");
        Parallel = runStep3;
        RunStep runStep4 = new RunStep("AfterColdStart", 3, "after_cold_start");
        AfterColdStart = runStep4;
        RunStep[] runStepArr = {runStep, runStep2, runStep3, runStep4};
        $VALUES = runStepArr;
        $ENTRIES = new asp(runStepArr);
    }

    public RunStep(String str, int i, String str2) {
        this.value = str2;
    }

    public static RunStep valueOf(String str) {
        return (RunStep) Enum.valueOf(RunStep.class, str);
    }

    public static RunStep[] values() {
        return (RunStep[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
