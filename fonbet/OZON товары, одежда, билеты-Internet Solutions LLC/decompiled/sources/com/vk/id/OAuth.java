package com.vk.id;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/OAuth;", "", "serverName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerName$vkid_release", "()Ljava/lang/String;", "VK", "MAIL", DiscountCodeResponse.RESULT_OK, "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuth {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ OAuth[] $VALUES;

    @NotNull
    private final String serverName;
    public static final OAuth VK = new OAuth("VK", 0, "vkid");
    public static final OAuth MAIL = new OAuth("MAIL", 1, "mail_ru");
    public static final OAuth OK = new OAuth(DiscountCodeResponse.RESULT_OK, 2, "ok_ru");

    private static final /* synthetic */ OAuth[] $values() {
        return new OAuth[]{VK, MAIL, OK};
    }

    static {
        OAuth[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private OAuth(String str, int i11, String str2) {
        this.serverName = str2;
    }

    @NotNull
    public static Xc.a<OAuth> getEntries() {
        return $ENTRIES;
    }

    public static OAuth valueOf(String str) {
        return (OAuth) Enum.valueOf(OAuth.class, str);
    }

    public static OAuth[] values() {
        return (OAuth[]) $VALUES.clone();
    }

    @NotNull
    /* renamed from: getServerName$vkid_release, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }
}
