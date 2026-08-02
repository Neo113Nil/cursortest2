package ru.ozon.fintech.wallet.manager.domain.mpay;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000eB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/mpay/MirPayWalletException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lru/ozon/fintech/wallet/manager/domain/mpay/MirPayWalletException$a;", "type", "", "message", "", "cause", "<init>", "(Lru/ozon/fintech/wallet/manager/domain/mpay/MirPayWalletException$a;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lru/ozon/fintech/wallet/manager/domain/mpay/MirPayWalletException$a;", "getType", "()Lru/ozon/fintech/wallet/manager/domain/mpay/MirPayWalletException$a;", "a", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MirPayWalletException extends Exception {

    @NotNull
    private final a type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CARD_NOT_FOUND;
        public static final a MIR_PAY_CARD_EXPIRED;
        public static final a MIR_PAY_INTERNAL_ERROR;
        public static final a MIR_PAY_NOT_SUPPORTED_CARD;
        public static final a MIR_PAY_REJECTED_BY_ISSUER;
        public static final a MIR_PAY_UPDATE_REQUIRED;
        public static final a NO_CONNECTION;
        public static final a SDK_NEED_UPDATE;

        static {
            a aVar = new a("NO_CONNECTION", 0);
            NO_CONNECTION = aVar;
            a aVar2 = new a("SDK_NEED_UPDATE", 1);
            SDK_NEED_UPDATE = aVar2;
            a aVar3 = new a("CARD_NOT_FOUND", 2);
            CARD_NOT_FOUND = aVar3;
            a aVar4 = new a("MIR_PAY_UPDATE_REQUIRED", 3);
            MIR_PAY_UPDATE_REQUIRED = aVar4;
            a aVar5 = new a("MIR_PAY_CARD_EXPIRED", 4);
            MIR_PAY_CARD_EXPIRED = aVar5;
            a aVar6 = new a("MIR_PAY_INTERNAL_ERROR", 5);
            MIR_PAY_INTERNAL_ERROR = aVar6;
            a aVar7 = new a("MIR_PAY_REJECTED_BY_ISSUER", 6);
            MIR_PAY_REJECTED_BY_ISSUER = aVar7;
            a aVar8 = new a("MIR_PAY_NOT_SUPPORTED_CARD", 7);
            MIR_PAY_NOT_SUPPORTED_CARD = aVar8;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MirPayWalletException(@NotNull a type) {
        this(type, null, null, 6, null);
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @NotNull
    public final a getType() {
        return this.type;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MirPayWalletException(@NotNull a type, String str) {
        this(type, str, null, 4, null);
        Intrinsics.checkNotNullParameter(type, "type");
    }

    public /* synthetic */ MirPayWalletException(a aVar, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MirPayWalletException(@NotNull a type, String str, Throwable th2) {
        super(str, th2);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }
}
