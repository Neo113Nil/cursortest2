package ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.presentation;

import Dv.C2882a;
import O7.h;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import com.google.android.material.card.MaterialCardView;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.fresh.geo.R$id;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.data.GeotrackingBottomButtonDTO;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.di.GeotrackingBottomButtonComponent;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.UniColors;
import y7.k;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/presentation/GeotrackingBottomButtonOverlapMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/di/GeotrackingBottomButtonComponent;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/data/GeotrackingBottomButtonDTO;", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/presentation/GeotrackingBottomButtonVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/data/GeotrackingBottomButtonDTO;Ljava/lang/String;)Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/presentation/GeotrackingBottomButtonVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/data/GeotrackingBottomButtonDTO;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeotrackingBottomButtonOverlapMapper extends OverlayWidgetScreenViewItemMapper2<GeotrackingBottomButtonComponent, GeotrackingBottomButtonDTO, GeotrackingBottomButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float CORNER_RADIUS = UiExtKt.toPxF(16);
    private static final int MARGIN_VERTICAL = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingBottomButton/presentation/GeotrackingBottomButtonOverlapMapper$Companion;", "", "<init>", "()V", "CARD_ELEVATION", "", "CORNER_RADIUS", "MARGIN_VERTICAL", "", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$3(i iVar, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MaterialCardView materialCardView = new MaterialCardView(iVar.Z().getContext());
        materialCardView.setId(R$id.geoBottomButtonCardId);
        materialCardView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        materialCardView.setElevation(0.0f);
        k.a aVar = new k.a();
        float f7 = CORNER_RADIUS;
        aVar.p(f7);
        aVar.t(f7);
        materialCardView.setShapeAppearanceModel(aVar.a());
        Context context = iVar.Z().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        materialCardView.setCardBackgroundColor(ResourceExtKt.color(context, UniColors.LAYER_FLOOR_1.getResId()));
        Context context2 = materialCardView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
        buttonV3View.setId(R$id.geoBottomButtonId);
        buttonV3View.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i11 = MARGIN_VERTICAL;
        layoutParams.setMargins(i11, i11, i11, i11);
        buttonV3View.setLayoutParams(layoutParams);
        materialCardView.addView(buttonV3View);
        return materialCardView;
    }

    private final GeotrackingBottomButtonVO toVO(GeotrackingBottomButtonDTO geotrackingBottomButtonDTO, String str) {
        long hashCode = str.hashCode();
        ButtonV3DTO button = geotrackingBottomButtonDTO.getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = geotrackingBottomButtonDTO.getButton().getTrackingInfo();
        return new GeotrackingBottomButtonVO(hashCode, button, trackingInfo != null ? h.k(trackingInfo, Long.valueOf(hashCode)) : null);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<GeotrackingBottomButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new GeotrackingBottomButtonWidgetHolder(component().getTokenizedAnalytics(), component().getCustomActionHandlersStoreFactory(), container, new C2882a(container, 0));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<GeotrackingBottomButtonComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return GeotrackingBottomButtonComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<GeotrackingBottomButtonVO> map(@NotNull GeotrackingBottomButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d()));
    }
}
