package ai.verisoul.sdk;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lai/verisoul/sdk/VerisoulEnvironment;", "", EventKeys.VALUE_KEY, "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "Dev", "Prod", "Sandbox", "Lai/verisoul/sdk/VerisoulEnvironment$Dev;", "Lai/verisoul/sdk/VerisoulEnvironment$Prod;", "Lai/verisoul/sdk/VerisoulEnvironment$Sandbox;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class VerisoulEnvironment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lai/verisoul/sdk/VerisoulEnvironment$Companion;", "", "()V", "fromValue", "Lai/verisoul/sdk/VerisoulEnvironment;", EventKeys.VALUE_KEY, "", "getBaseUrl", "environment", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VerisoulEnvironment fromValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Dev dev = Dev.INSTANCE;
            if (Intrinsics.areEqual(value, dev.getValue())) {
                return dev;
            }
            Sandbox sandbox = Sandbox.INSTANCE;
            if (Intrinsics.areEqual(value, sandbox.getValue())) {
                return sandbox;
            }
            Prod prod = Prod.INSTANCE;
            if (Intrinsics.areEqual(value, prod.getValue())) {
                return prod;
            }
            throw new VerisoulException(VerisoulErrorCodes.INVALID_ENVIRONMENT, "Unknown environment: " + value, null, 4, null);
        }

        @NotNull
        public final String getBaseUrl(@NotNull VerisoulEnvironment environment) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            return "https://ingest." + environment.getValue() + ".verisoul.ai";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lai/verisoul/sdk/VerisoulEnvironment$Dev;", "Lai/verisoul/sdk/VerisoulEnvironment;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Dev extends VerisoulEnvironment {

        @NotNull
        public static final Dev INSTANCE = new Dev();

        private Dev() {
            super("dev", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lai/verisoul/sdk/VerisoulEnvironment$Prod;", "Lai/verisoul/sdk/VerisoulEnvironment;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Prod extends VerisoulEnvironment {

        @NotNull
        public static final Prod INSTANCE = new Prod();

        private Prod() {
            super("prod", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lai/verisoul/sdk/VerisoulEnvironment$Sandbox;", "Lai/verisoul/sdk/VerisoulEnvironment;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Sandbox extends VerisoulEnvironment {

        @NotNull
        public static final Sandbox INSTANCE = new Sandbox();

        private Sandbox() {
            super("sandbox", null);
        }
    }

    public /* synthetic */ VerisoulEnvironment(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    private VerisoulEnvironment(String str) {
        this.value = str;
    }
}
