package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation;

import Ae.B0;
import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.data.TotalPriceWithButtonV2Mapper;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2Mapper;", "mapper", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2Mapper;)V", "", "onStart", "()V", "", "timeLeftInMillis", "onTimerTick", "(J)V", "onFinish", "", "isVisible", "onVisibilityChanged", "(Z)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/data/TotalPriceWithButtonV2Mapper;", "LAe/x0;", "", "_formattedTimeFlow", "LAe/x0;", "LAe/M0;", "formattedTimeFlow", "LAe/M0;", "getFormattedTimeFlow", "()LAe/M0;", "_finishTimeFlow", "LAe/B0;", "finishTimeFlow", "LAe/B0;", "getFinishTimeFlow", "()LAe/B0;", "_animatedFlow", "animatedFlow", "getAnimatedFlow", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2ViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _animatedFlow;

    @NotNull
    private final x0<Boolean> _finishTimeFlow;

    @NotNull
    private final x0<CharSequence> _formattedTimeFlow;

    @NotNull
    private final M0<Boolean> animatedFlow;

    @NotNull
    private final B0<Boolean> finishTimeFlow;

    @NotNull
    private final M0<CharSequence> formattedTimeFlow;

    @NotNull
    private final TotalPriceWithButtonV2Mapper mapper;

    public TotalPriceWithButtonV2ViewModel(@NotNull TotalPriceWithButtonV2Mapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
        x0<CharSequence> a11 = O0.a(new OzonSpannableString());
        this._formattedTimeFlow = a11;
        this.formattedTimeFlow = C2399j.b(a11);
        Boolean bool = Boolean.FALSE;
        x0<Boolean> a12 = O0.a(bool);
        this._finishTimeFlow = a12;
        this.finishTimeFlow = C2399j.b(a12);
        x0<Boolean> a13 = O0.a(bool);
        this._animatedFlow = a13;
        this.animatedFlow = C2399j.b(a13);
    }

    @NotNull
    public final M0<Boolean> getAnimatedFlow() {
        return this.animatedFlow;
    }

    @NotNull
    public final B0<Boolean> getFinishTimeFlow() {
        return this.finishTimeFlow;
    }

    @NotNull
    public final M0<CharSequence> getFormattedTimeFlow() {
        return this.formattedTimeFlow;
    }

    public final void onFinish() {
        this._finishTimeFlow.tryEmit(Boolean.TRUE);
    }

    public final void onStart() {
        this._finishTimeFlow.tryEmit(Boolean.FALSE);
    }

    public final void onTimerTick(long timeLeftInMillis) {
        this._formattedTimeFlow.setValue(this.mapper.getTimerTextHelper().format(TimeUnit.MILLISECONDS.toSeconds(timeLeftInMillis)));
    }

    public final void onVisibilityChanged(boolean isVisible) {
        this._animatedFlow.setValue(Boolean.valueOf(isVisible));
    }
}
