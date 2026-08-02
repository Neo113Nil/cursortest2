package ru.ozon.app.android.account.locale.app.data;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/LocalizationVersion;", "", "cookieValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCookieValue", "()Ljava/lang/String;", "V1", "V2", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalizationVersion {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LocalizationVersion[] $VALUES;

    /* renamed from: V1, reason: collision with root package name */
    public static final LocalizationVersion f92085V1 = new LocalizationVersion("V1", 0, "1");

    /* renamed from: V2, reason: collision with root package name */
    public static final LocalizationVersion f92086V2 = new LocalizationVersion("V2", 1, "2");

    @NotNull
    private final String cookieValue;

    private static final /* synthetic */ LocalizationVersion[] $values() {
        return new LocalizationVersion[]{f92085V1, f92086V2};
    }

    static {
        LocalizationVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private LocalizationVersion(String str, int i11, String str2) {
        this.cookieValue = str2;
    }

    public static LocalizationVersion valueOf(String str) {
        return (LocalizationVersion) Enum.valueOf(LocalizationVersion.class, str);
    }

    public static LocalizationVersion[] values() {
        return (LocalizationVersion[]) $VALUES.clone();
    }

    @NotNull
    public final String getCookieValue() {
        return this.cookieValue;
    }
}
