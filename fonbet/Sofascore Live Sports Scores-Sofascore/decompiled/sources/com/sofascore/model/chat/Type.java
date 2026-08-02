package com.sofascore.model.chat;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sofascore/model/chat/Type;", "", "name", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "HELLO", "MESSAGE", "ERROR", "MESSAGES", "REMOVE", "UPDATE", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Type {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;
    public static final Type HELLO = new Type("HELLO", 0, "hello");
    public static final Type MESSAGE = new Type("MESSAGE", 1, PglCryptUtils.KEY_MESSAGE);
    public static final Type ERROR = new Type("ERROR", 2, "error");
    public static final Type MESSAGES = new Type("MESSAGES", 3, "messages");
    public static final Type REMOVE = new Type("REMOVE", 4, "remove");
    public static final Type UPDATE = new Type("UPDATE", 5, "update");

    private static final /* synthetic */ Type[] $values() {
        return new Type[]{HELLO, MESSAGE, ERROR, MESSAGES, REMOVE, UPDATE};
    }

    static {
        Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private Type(String str, int i, String str2) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }
}
