package ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.core;

import T00.a;
import WZ.t;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.data.WelcomeScreenDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.di.WelcomeScreenComponent;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.presentation.WelcomeScreenVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.presentation.WelcomeScreenViewHolder;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0016j\b\u0012\u0004\u0012\u00020\u0002`\u00172\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/core/WelcomeScreenViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/di/WelcomeScreenComponent;", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/data/WelcomeScreenDTO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/presentation/WelcomeScreenVO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/data/WelcomeScreenDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WelcomeScreenViewMapper extends OverlayWidgetScreenViewItemMapper2<WelcomeScreenComponent, WelcomeScreenDTO, WelcomeScreenVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r
    @NotNull
    public AbstractC6065b<WelcomeScreenVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new WelcomeScreenViewHolder(container, component().getMorkovskOnboardingDelegate(), component().getComposerNavigator());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<WelcomeScreenComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return WelcomeScreenComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<WelcomeScreenVO> map(@NotNull WelcomeScreenDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        a b11 = info.b();
        String c11 = b11 != null ? b11.c() : null;
        boolean shouldShowWelcomeScreen = component().getMorkovskOnboardingDelegate().provideMorokvskOnboarding().shouldShowWelcomeScreen();
        boolean z11 = false;
        boolean queryParamValueFromPageInfo = c11 != null ? UtilKt.getQueryParamValueFromPageInfo(c11, "forceShow") : false;
        boolean mustSkipOnboarding = state.getMustSkipOnboarding();
        long hashCode = info.d().hashCode();
        WelcomeScreenVO.ScreenInfo screenInfo = new WelcomeScreenVO.ScreenInfo(state.getWithoutWelcomeBonus().getImage(), state.getWithoutWelcomeBonus().getTitle(), state.getWithoutWelcomeBonus().getSubtitle(), state.getWithoutWelcomeBonus().getButton());
        WelcomeScreenVO.ScreenInfo screenInfo2 = state.getWithWelcomeBonus() != null ? new WelcomeScreenVO.ScreenInfo(state.getWithWelcomeBonus().getImage(), state.getWithWelcomeBonus().getTitle(), state.getWithWelcomeBonus().getSubtitle(), state.getWithWelcomeBonus().getButton()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        if ((shouldShowWelcomeScreen || queryParamValueFromPageInfo) && !mustSkipOnboarding) {
            z11 = true;
        }
        return C7714v.a0(new WelcomeScreenVO(hashCode, z11, screenInfo, screenInfo2, mapToTokenizedEvent$default));
    }
}
