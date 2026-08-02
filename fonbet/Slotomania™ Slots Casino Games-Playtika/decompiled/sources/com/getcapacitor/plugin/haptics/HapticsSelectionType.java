package com.getcapacitor.plugin.haptics;

/* loaded from: classes8.dex */
public class HapticsSelectionType implements HapticsVibrationType {
    private static final long[] timings = {0, 100};
    private static final int[] amplitudes = {0, 100};
    private static final long[] oldSDKPattern = {0, 70};

    @Override // com.getcapacitor.plugin.haptics.HapticsVibrationType
    public long[] getTimings() {
        return timings;
    }

    @Override // com.getcapacitor.plugin.haptics.HapticsVibrationType
    public int[] getAmplitudes() {
        return amplitudes;
    }

    @Override // com.getcapacitor.plugin.haptics.HapticsVibrationType
    public long[] getOldSDKPattern() {
        return oldSDKPattern;
    }
}
