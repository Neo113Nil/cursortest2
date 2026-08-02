package ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation;

import De.s;
import androidx.lifecycle.V;
import h20.InterfaceC6786a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data.FeedbackCurtainApi;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data.FeedbackEvent;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/data/FeedbackCurtainApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/data/FeedbackCurtainApi;)V", "", "onCleared", "()V", "", "text", "", "params", "sendTextWithParams", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/data/FeedbackCurtainApi;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/data/FeedbackEvent;", "events", "Landroidx/lifecycle/V;", "getEvents", "()Landroidx/lifecycle/V;", "Lxe/M;", "scope", "Lxe/M;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeedbackCurtainViewModel implements InterfaceC6786a {

    @NotNull
    private final FeedbackCurtainApi api;

    @NotNull
    private final V<FeedbackEvent> events;

    @NotNull
    private M scope;
    public static final int $stable = 8;

    public FeedbackCurtainViewModel(@NotNull FeedbackCurtainApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.events = new V<>();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(s.f6650a.plus(X0.b()));
    }

    @NotNull
    public final V<FeedbackEvent> getEvents() {
        return this.events;
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        N.c(this.scope, null);
    }

    public final void sendTextWithParams(@NotNull String text, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(params, "params");
        params.put("text", text);
        C10727i.c(this.scope, null, null, new FeedbackCurtainViewModel$sendTextWithParams$1(this, params, null), 3);
    }
}
