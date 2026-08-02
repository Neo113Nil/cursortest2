package com.vk.push.core.remote.config.omicron;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UpdateBehaviour {
    private static final /* synthetic */ UpdateBehaviour[] $VALUES;
    public static final UpdateBehaviour CACHE_ONLY;
    public static final UpdateBehaviour DEFAULT;
    public static final UpdateBehaviour WAIT_FOR_ACTUAL;

    static {
        UpdateBehaviour updateBehaviour = new UpdateBehaviour("WAIT_FOR_ACTUAL", 0);
        WAIT_FOR_ACTUAL = updateBehaviour;
        UpdateBehaviour updateBehaviour2 = new UpdateBehaviour("CACHE_ONLY", 1);
        CACHE_ONLY = updateBehaviour2;
        UpdateBehaviour updateBehaviour3 = new UpdateBehaviour("DEFAULT", 2);
        DEFAULT = updateBehaviour3;
        $VALUES = new UpdateBehaviour[]{updateBehaviour, updateBehaviour2, updateBehaviour3};
    }

    public UpdateBehaviour() {
        throw null;
    }

    public static UpdateBehaviour valueOf(String str) {
        return (UpdateBehaviour) Enum.valueOf(UpdateBehaviour.class, str);
    }

    public static UpdateBehaviour[] values() {
        return (UpdateBehaviour[]) $VALUES.clone();
    }
}
