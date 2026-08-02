package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/AllowedPiiKt$Dsl;", "", "block", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "-initializeallowedPii", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "allowedPii", "copy", "(Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AllowedPiiKtKt {
    @NotNull
    /* renamed from: -initializeallowedPii, reason: not valid java name */
    public static final AllowedPiiOuterClass.AllowedPii m802initializeallowedPii(@NotNull Function1<? super AllowedPiiKt.Dsl, Unit> function1) {
        function1.getClass();
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.INSTANCE;
        AllowedPiiOuterClass.AllowedPii.Builder newBuilder = AllowedPiiOuterClass.AllowedPii.newBuilder();
        newBuilder.getClass();
        AllowedPiiKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final AllowedPiiOuterClass.AllowedPii copy(@NotNull AllowedPiiOuterClass.AllowedPii allowedPii, @NotNull Function1<? super AllowedPiiKt.Dsl, Unit> function1) {
        allowedPii.getClass();
        function1.getClass();
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.INSTANCE;
        AllowedPiiOuterClass.AllowedPii.Builder builder = allowedPii.toBuilder();
        builder.getClass();
        AllowedPiiKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }
}
