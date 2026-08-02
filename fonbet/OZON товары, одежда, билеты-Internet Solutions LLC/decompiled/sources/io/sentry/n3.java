package io.sentry;

import com.google.android.gms.wallet.WalletConstants;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes.dex */
public enum n3 implements InterfaceC7220x0 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(CounterView.COUNTER_MAX_DEFAULT),
    UNKNOWN(CounterView.COUNTER_MAX_DEFAULT),
    UNKNOWN_ERROR(CounterView.COUNTER_MAX_DEFAULT),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(WalletConstants.ERROR_CODE_INVALID_PARAMETERS),
    ALREADY_EXISTS(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(CounterView.COUNTER_MAX_DEFAULT),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements InterfaceC7174n0<n3> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final n3 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return n3.valueOf(interfaceC7131c1.nextString().toUpperCase(Locale.ROOT));
        }
    }

    n3(int i11) {
        this.minHttpStatusCode = i11;
        this.maxHttpStatusCode = i11;
    }

    public static n3 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static n3 fromHttpStatusCode(int i11) {
        for (n3 n3Var : values()) {
            if (n3Var.matches(i11)) {
                return n3Var;
            }
        }
        return null;
    }

    private boolean matches(int i11) {
        return i11 >= this.minHttpStatusCode && i11 <= this.maxHttpStatusCode;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.InterfaceC7220x0
    public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        ((C7212v0) interfaceC7135d1).p(apiName());
    }

    @NotNull
    public static n3 fromHttpStatusCode(Integer num, @NotNull n3 n3Var) {
        n3 fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : n3Var;
        return fromHttpStatusCode != null ? fromHttpStatusCode : n3Var;
    }

    n3(int i11, int i12) {
        this.minHttpStatusCode = i11;
        this.maxHttpStatusCode = i12;
    }
}
