package com.vk.id.auth;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/id/auth/Prompt;", "", "<init>", "(Ljava/lang/String;I)V", "BLANK", "LOGIN", "CONSENT", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Prompt {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Prompt[] $VALUES;
    public static final Prompt BLANK = new Prompt("BLANK", 0);
    public static final Prompt LOGIN = new Prompt("LOGIN", 1);
    public static final Prompt CONSENT = new Prompt("CONSENT", 2);

    private static final /* synthetic */ Prompt[] $values() {
        return new Prompt[]{BLANK, LOGIN, CONSENT};
    }

    static {
        Prompt[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Prompt(String str, int i11) {
    }

    public static Prompt valueOf(String str) {
        return (Prompt) Enum.valueOf(Prompt.class, str);
    }

    public static Prompt[] values() {
        return (Prompt[]) $VALUES.clone();
    }
}
