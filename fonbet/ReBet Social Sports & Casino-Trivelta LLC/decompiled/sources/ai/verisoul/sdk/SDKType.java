package ai.verisoul.sdk;

import com.facebook.react.common.ReactConstants;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lai/verisoul/sdk/SDKType;", "", EventKeys.VALUE_KEY, "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Flutter", "Native", ReactConstants.TAG, "Lai/verisoul/sdk/SDKType$Flutter;", "Lai/verisoul/sdk/SDKType$Native;", "Lai/verisoul/sdk/SDKType$ReactNative;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SDKType {

    @NotNull
    private final String value;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lai/verisoul/sdk/SDKType$Flutter;", "Lai/verisoul/sdk/SDKType;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Flutter extends SDKType {

        @NotNull
        public static final Flutter INSTANCE = new Flutter();

        private Flutter() {
            super("flutter", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lai/verisoul/sdk/SDKType$Native;", "Lai/verisoul/sdk/SDKType;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Native extends SDKType {

        @NotNull
        public static final Native INSTANCE = new Native();

        private Native() {
            super("native", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lai/verisoul/sdk/SDKType$ReactNative;", "Lai/verisoul/sdk/SDKType;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReactNative extends SDKType {

        @NotNull
        public static final ReactNative INSTANCE = new ReactNative();

        private ReactNative() {
            super("react-native", null);
        }
    }

    public /* synthetic */ SDKType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    private SDKType(String str) {
        this.value = str;
    }
}
