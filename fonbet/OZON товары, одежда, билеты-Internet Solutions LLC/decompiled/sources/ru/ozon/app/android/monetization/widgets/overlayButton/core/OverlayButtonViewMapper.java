package ru.ozon.app.android.monetization.widgets.overlayButton.core;

import GU.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.monetization.flags.OverlayButtonComposeFlag;
import ru.ozon.app.android.monetization.widgets.overlayButton.data.OverlayButtonDTO;
import ru.ozon.app.android.monetization.widgets.overlayButton.di.OverlayButtonComponent;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonVO;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonViewGroup;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonViewHolder;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/core/OverlayButtonViewMapper;", "Lc20/r;", "Lru/ozon/app/android/monetization/widgets/overlayButton/data/OverlayButtonDTO;", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "Lru/ozon/app/android/monetization/widgets/overlayButton/di/OverlayButtonComponent;", "component", "<init>", "(Lru/ozon/app/android/monetization/widgets/overlayButton/di/OverlayButtonComponent;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/monetization/widgets/overlayButton/data/OverlayButtonDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/monetization/widgets/overlayButton/di/OverlayButtonComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OverlayButtonViewMapper extends r<OverlayButtonDTO, OverlayButtonVO> {

    @NotNull
    private final OverlayButtonComponent component;

    @NotNull
    private final r.a viewType;

    public OverlayButtonViewMapper(@NotNull OverlayButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(OverlayButtonViewGroup overlayButtonViewGroup, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return overlayButtonViewGroup;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (this.component.getFeatureChecker().isEnabled(OverlayButtonComposeFlag.INSTANCE)) {
            return false;
        }
        OverlayButtonDTO overlayButtonDTO = state instanceof OverlayButtonDTO ? (OverlayButtonDTO) state : null;
        if (overlayButtonDTO == null) {
            return false;
        }
        Object content = overlayButtonDTO.getContent();
        return (content instanceof ButtonV3DTO) || (content instanceof OverlayButtonDTO.DoubleButton);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<OverlayButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        OverlayButtonViewGroup overlayButtonViewGroup = new OverlayButtonViewGroup(L11, null, 0, 6, null);
        return new OverlayButtonViewHolder(overlayButtonViewGroup, container, new a(overlayButtonViewGroup, 1));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<OverlayButtonVO> map(@NotNull OverlayButtonDTO state, @NotNull d info) {
        OverlayButtonVO.ButtonWrapper doubleButton;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        Object content = state.getContent();
        if (content instanceof ButtonV3DTO) {
            doubleButton = new OverlayButtonVO.ButtonWrapper.SingleButton((ButtonV3DTO) content);
        } else {
            if (!(content instanceof OverlayButtonDTO.DoubleButton)) {
                return K.f71697a;
            }
            OverlayButtonDTO.DoubleButton doubleButton2 = (OverlayButtonDTO.DoubleButton) content;
            doubleButton = new OverlayButtonVO.ButtonWrapper.DoubleButton(doubleButton2.getFirstButton(), doubleButton2.getSecondButton());
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new OverlayButtonVO(hashCode, doubleButton, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTestInfo()));
    }
}
