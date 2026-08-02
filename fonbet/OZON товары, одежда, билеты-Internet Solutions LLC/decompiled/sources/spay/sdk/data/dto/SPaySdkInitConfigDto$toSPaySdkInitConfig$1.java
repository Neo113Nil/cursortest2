package spay.sdk.data.dto;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.InitializationResult;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lspay/sdk/api/InitializationResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SPaySdkInitConfigDto$toSPaySdkInitConfig$1 extends AbstractC7737t implements Function1<InitializationResult, Unit> {
    public static final SPaySdkInitConfigDto$toSPaySdkInitConfig$1 INSTANCE = new SPaySdkInitConfigDto$toSPaySdkInitConfig$1();

    public SPaySdkInitConfigDto$toSPaySdkInitConfig$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InitializationResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InitializationResult initializationResult) {
        invoke2(initializationResult);
        return Unit.f71690a;
    }
}
