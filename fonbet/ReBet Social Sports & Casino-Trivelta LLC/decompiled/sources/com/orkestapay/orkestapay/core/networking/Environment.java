package com.orkestapay.orkestapay.core.networking;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/Environment;", "", EventKeys.URL, "", "checkoutUrl", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCheckoutUrl$Orkestapay_release", "()Ljava/lang/String;", "getUrl$Orkestapay_release", "PRODUCTION", "SANDBOX", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Environment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    public static final Environment PRODUCTION = new Environment("PRODUCTION", 0, "https://api.orkestapay.com", "https://checkout.orkestapay.com");
    public static final Environment SANDBOX = new Environment("SANDBOX", 1, "https://api.sand.orkestapay.com", "https://checkout.sand.orkestapay.com");

    @NotNull
    private final String checkoutUrl;

    @NotNull
    private final String url;

    private static final /* synthetic */ Environment[] $values() {
        return new Environment[]{PRODUCTION, SANDBOX};
    }

    static {
        Environment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Environment(String str, int i10, String str2, String str3) {
        this.url = str2;
        this.checkoutUrl = str3;
    }

    @NotNull
    public static EnumEntries<Environment> getEntries() {
        return $ENTRIES;
    }

    public static Environment valueOf(String str) {
        return (Environment) Enum.valueOf(Environment.class, str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }

    @NotNull
    /* renamed from: getCheckoutUrl$Orkestapay_release, reason: from getter */
    public final String getCheckoutUrl() {
        return this.checkoutUrl;
    }

    @NotNull
    /* renamed from: getUrl$Orkestapay_release, reason: from getter */
    public final String getUrl() {
        return this.url;
    }
}
