package com.henninghall.date_picker;

import com.henninghall.date_picker.models.Variant;

/* loaded from: classes8.dex */
public class HourDisplayBugWorkaround {
    private final State state;

    public HourDisplayBugWorkaround(State state) {
        this.state = state;
    }

    private boolean shouldApply(String str) {
        return this.state.getVariant() == Variant.nativeAndroid && str.length() == 1;
    }

    private String adjust(String str) {
        return " " + str + " ";
    }

    public String adjustValueIfNecessary(String str) {
        return !shouldApply(str) ? str : adjust(str);
    }
}
