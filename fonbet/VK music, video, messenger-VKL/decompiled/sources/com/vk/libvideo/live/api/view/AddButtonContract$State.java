package com.vk.libvideo.live.api.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AddButtonContract$State {
    private static final /* synthetic */ AddButtonContract$State[] $VALUES;
    public static final AddButtonContract$State ADDED_USER;
    public static final AddButtonContract$State ADD_USER;
    public static final AddButtonContract$State FOLLOWED_GROUP;
    public static final AddButtonContract$State FOLLOW_GROUP;

    static {
        AddButtonContract$State addButtonContract$State = new AddButtonContract$State("ADD_USER", 0);
        ADD_USER = addButtonContract$State;
        AddButtonContract$State addButtonContract$State2 = new AddButtonContract$State("ADDED_USER", 1);
        ADDED_USER = addButtonContract$State2;
        AddButtonContract$State addButtonContract$State3 = new AddButtonContract$State("FOLLOW_GROUP", 2);
        FOLLOW_GROUP = addButtonContract$State3;
        AddButtonContract$State addButtonContract$State4 = new AddButtonContract$State("FOLLOWED_GROUP", 3);
        FOLLOWED_GROUP = addButtonContract$State4;
        $VALUES = new AddButtonContract$State[]{addButtonContract$State, addButtonContract$State2, addButtonContract$State3, addButtonContract$State4};
    }

    public AddButtonContract$State() {
        throw null;
    }

    public static AddButtonContract$State valueOf(String str) {
        return (AddButtonContract$State) Enum.valueOf(AddButtonContract$State.class, str);
    }

    public static AddButtonContract$State[] values() {
        return (AddButtonContract$State[]) $VALUES.clone();
    }

    public final Boolean h() {
        return Boolean.valueOf(this == ADDED_USER || this == FOLLOWED_GROUP);
    }
}
