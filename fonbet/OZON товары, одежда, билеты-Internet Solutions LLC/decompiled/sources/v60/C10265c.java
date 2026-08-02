package v60;

import U50.j;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: v60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10265c implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final V70.b f102447a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f102448b;

    public C10265c(@NotNull V70.b audioRecordInteractor, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(audioRecordInteractor, "audioRecordInteractor");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f102447a = audioRecordInteractor;
        this.f102448b = analyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "finish";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f102447a.a();
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        ((j) callback).invoke(success);
    }
}
