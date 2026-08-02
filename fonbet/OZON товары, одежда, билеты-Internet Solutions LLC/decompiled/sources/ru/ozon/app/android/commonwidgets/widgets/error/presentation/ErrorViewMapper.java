package ru.ozon.app.android.commonwidgets.widgets.error.presentation;

import DP.a;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.error.data.ErrorDTO;
import ru.ozon.app.android.commonwidgets.widgets.error.di.DaggerErrorWidgetComponent;
import ru.ozon.app.android.commonwidgets.widgets.error.di.ErrorWidgetComponent;
import ru.ozon.app.android.commonwidgets.widgets.error.presentation.ErrorVO;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.composer.RetainAnalyticsComponentApi;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0016j\b\u0012\u0004\u0012\u00020\u0002`\u00172\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001e¢\u0006\u0004\b\u001c\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/commonwidgets/widgets/error/di/ErrorWidgetComponent;", "Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO;", "Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorVO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorVO;", "Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO$V2TrackingInfo;", "Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorVO$V2TrackingInfo;", "(Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO$V2TrackingInfo;)Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorVO$V2TrackingInfo;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ErrorViewMapper extends OverlayWidgetScreenViewItemMapper2<ErrorWidgetComponent, ErrorDTO, ErrorVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ErrorWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerErrorWidgetComponent.factory().create((ComposerComponent) c7475g.getComponent(ComposerComponent.class), (RetainAnalyticsComponentApi) c7475g.getComponent(RetainAnalyticsComponentApi.class));
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ErrorVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ErrorOverlayViewHolder(container, component().getErrorAnalytics());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @NotNull
    public final ErrorVO toVO(@NotNull ErrorDTO errorDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(errorDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        String title = errorDTO.getTitle();
        String subtitle = errorDTO.getSubtitle();
        String errorId = errorDTO.getErrorId();
        String buttonTitle = errorDTO.getButtonTitle();
        String notificationTitle = errorDTO.getNotificationTitle();
        List<ButtonV3Atom.SmallButton> buttons = errorDTO.getButtons();
        ErrorDTO.V2TrackingInfo v2TrackingInfo = errorDTO.getV2TrackingInfo();
        return new ErrorVO(hashCode, title, subtitle, errorId, buttonTitle, notificationTitle, buttons, v2TrackingInfo != null ? toVO(v2TrackingInfo) : null);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ErrorWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ErrorWidgetComponent.class), new a(storage, 9));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ErrorVO> map(@NotNull ErrorDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d()));
    }

    @NotNull
    public final ErrorVO.V2TrackingInfo toVO(@NotNull ErrorDTO.V2TrackingInfo v2TrackingInfo) {
        Intrinsics.checkNotNullParameter(v2TrackingInfo, "<this>");
        return new ErrorVO.V2TrackingInfo(v2TrackingInfo.getErrorId(), v2TrackingInfo.getErrorCode());
    }
}
