package v60;

import H30.q;
import U50.j;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.recordaudio.RecordAudioStartData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.settings.models.FeatureValue;
import t90.AbstractC9782b;

/* renamed from: v60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10264b implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    private final f f102442a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f102443b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f102444c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final V70.b f102445d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f102446e;

    public C10264b(f fVar, @NotNull Moshi moshi, @NotNull Q90.c featureToggles, @NotNull V70.b audioRecordInteractor, @NotNull InterfaceC6618a analyticInteractor) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(audioRecordInteractor, "audioRecordInteractor");
        Intrinsics.checkNotNullParameter(analyticInteractor, "analyticInteractor");
        this.f102442a = fVar;
        this.f102443b = moshi;
        this.f102444c = featureToggles;
        this.f102445d = audioRecordInteractor;
        this.f102446e = analyticInteractor;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "start";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        String issueId;
        NativeResult.Success success;
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        r parentFragmentActivity = (weakReference == null || (fintechWebView = weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        FeatureValue b11 = this.f102444c.q(S90.c.MOB_AUDIO_CONFIG).b();
        boolean z11 = false;
        if (parentFragmentActivity != null) {
            f fVar = this.f102442a;
            AbstractC9782b l11 = fVar != null ? fVar.l(parentFragmentActivity) : null;
            if ((l11 instanceof AbstractC9782b.a) || (l11 instanceof AbstractC9782b.c)) {
                z11 = true;
            }
        }
        V70.b bVar = this.f102445d;
        bVar.b();
        if (!b11.isEnabled() || !z11) {
            if (!b11.isEnabled()) {
                ((j) callback).invoke(new NativeResult.Error("Фичафлаг отключен", NativeResult.Error.a.IS_NOT_AVAILABLE));
                return;
            } else if (z11) {
                ((j) callback).invoke(new NativeResult.Error("Неизвестная ошибка", NativeResult.Error.a.IS_NOT_AVAILABLE));
                return;
            } else {
                ((j) callback).invoke(new NativeResult.Error("Выдайте разрешение на запись микрофона", NativeResult.Error.a.IS_NOT_AVAILABLE));
                return;
            }
        }
        RecordAudioStartData recordAudioStartData = (RecordAudioStartData) q.a(this.f102443b, parameterJson, RecordAudioStartData.class);
        if (recordAudioStartData == null || (issueId = recordAudioStartData.getIssueId()) == null) {
            ((j) callback).invoke(new NativeResult.Error("issueId не найден", NativeResult.Error.a.IS_NOT_AVAILABLE));
            return;
        }
        bVar.c(issueId);
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        ((j) callback).invoke(success);
    }
}
