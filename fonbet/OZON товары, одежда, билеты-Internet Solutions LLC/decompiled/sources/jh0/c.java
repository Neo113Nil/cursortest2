package jh0;

import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ljh0/c;", "", "<init>", "(Ljava/lang/String;I)V", "APPLICATION_LAUNCH", "TOKEN_CHANGED_BY_PROVIDER", "LOGIN", "LOGOUT", "NOTIFICATIONS_STATE_CHANGED", "NOTIFICATIONS_STATE_CHANGED_BACKGROUND", "NOTIFICATIONS_STATE_CHANGED_BACKGROUND_UI", "NOT_CHANGED", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c APPLICATION_LAUNCH = new c("APPLICATION_LAUNCH", 0);
    public static final c TOKEN_CHANGED_BY_PROVIDER = new c("TOKEN_CHANGED_BY_PROVIDER", 1);
    public static final c LOGIN = new c("LOGIN", 2);
    public static final c LOGOUT = new c("LOGOUT", 3);
    public static final c NOTIFICATIONS_STATE_CHANGED = new c("NOTIFICATIONS_STATE_CHANGED", 4);
    public static final c NOTIFICATIONS_STATE_CHANGED_BACKGROUND = new c("NOTIFICATIONS_STATE_CHANGED_BACKGROUND", 5);
    public static final c NOTIFICATIONS_STATE_CHANGED_BACKGROUND_UI = new c("NOTIFICATIONS_STATE_CHANGED_BACKGROUND_UI", 6);
    public static final c NOT_CHANGED = new c("NOT_CHANGED", 7);

    private static final /* synthetic */ c[] $values() {
        return new c[]{APPLICATION_LAUNCH, TOKEN_CHANGED_BY_PROVIDER, LOGIN, LOGOUT, NOTIFICATIONS_STATE_CHANGED, NOTIFICATIONS_STATE_CHANGED_BACKGROUND, NOTIFICATIONS_STATE_CHANGED_BACKGROUND_UI, NOT_CHANGED};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private c(String str, int i11) {
    }

    @NotNull
    public static Xc.a<c> getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
