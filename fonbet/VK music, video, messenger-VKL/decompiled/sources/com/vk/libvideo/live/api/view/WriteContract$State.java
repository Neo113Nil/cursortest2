package com.vk.libvideo.live.api.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class WriteContract$State {
    private static final /* synthetic */ WriteContract$State[] $VALUES;
    public static final WriteContract$State CLIPS;
    public static final WriteContract$State FULL;
    public static final WriteContract$State NO_COMMENTS;
    public static final WriteContract$State STREAMING;

    static {
        WriteContract$State writeContract$State = new WriteContract$State("FULL", 0);
        FULL = writeContract$State;
        WriteContract$State writeContract$State2 = new WriteContract$State("NO_COMMENTS", 1);
        NO_COMMENTS = writeContract$State2;
        WriteContract$State writeContract$State3 = new WriteContract$State("STREAMING", 2);
        STREAMING = writeContract$State3;
        WriteContract$State writeContract$State4 = new WriteContract$State("CLIPS", 3);
        CLIPS = writeContract$State4;
        $VALUES = new WriteContract$State[]{writeContract$State, writeContract$State2, writeContract$State3, writeContract$State4};
    }

    public WriteContract$State() {
        throw null;
    }

    public static WriteContract$State valueOf(String str) {
        return (WriteContract$State) Enum.valueOf(WriteContract$State.class, str);
    }

    public static WriteContract$State[] values() {
        return (WriteContract$State[]) $VALUES.clone();
    }
}
