package ru.ozon.fintech.wallet.manager.domain.model;

import Xc.a;
import Xc.b;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/model/DefaultWallet;", "", "<init>", "(Ljava/lang/String;I)V", "GOOGLE_PAY", "SAMSUNG_PAY", "MIR_PAY", "NONE", "NFC_NOT_AVAILABLE", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultWallet {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DefaultWallet[] $VALUES;
    public static final DefaultWallet GOOGLE_PAY = new DefaultWallet("GOOGLE_PAY", 0);
    public static final DefaultWallet SAMSUNG_PAY = new DefaultWallet("SAMSUNG_PAY", 1);
    public static final DefaultWallet MIR_PAY = new DefaultWallet("MIR_PAY", 2);
    public static final DefaultWallet NONE = new DefaultWallet("NONE", 3);
    public static final DefaultWallet NFC_NOT_AVAILABLE = new DefaultWallet("NFC_NOT_AVAILABLE", 4);

    private static final /* synthetic */ DefaultWallet[] $values() {
        return new DefaultWallet[]{GOOGLE_PAY, SAMSUNG_PAY, MIR_PAY, NONE, NFC_NOT_AVAILABLE};
    }

    static {
        DefaultWallet[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DefaultWallet(String str, int i11) {
    }

    @NotNull
    public static a<DefaultWallet> getEntries() {
        return $ENTRIES;
    }

    public static DefaultWallet valueOf(String str) {
        return (DefaultWallet) Enum.valueOf(DefaultWallet.class, str);
    }

    public static DefaultWallet[] values() {
        return (DefaultWallet[]) $VALUES.clone();
    }
}
