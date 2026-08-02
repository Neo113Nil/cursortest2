package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation;

import At.C2445a;
import a00.C4911f;
import a00.h;
import a00.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.session.databinding.WidgetExternalVerificationHandlerMobileBinding;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.ExternalVerificationDTO;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di.ExternalVerificationWidgetComponent;
import ru.ozon.app.android.web.webview.OzonWebView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationHandlerMobileViewMapperNoUi;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/di/ExternalVerificationWidgetComponent;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationDTO;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExternalVerificationHandlerMobileViewMapperNoUi extends OverlayWidgetScreenViewItemMapper2<ExternalVerificationWidgetComponent, ExternalVerificationDTO, ExternalVerificationVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExternalVerificationWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return new ExternalVerificationWidgetComponent(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ExternalVerificationVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(container.Z());
        WidgetExternalVerificationHandlerMobileBinding inflate = WidgetExternalVerificationHandlerMobileBinding.inflate(LayoutInflater.from(composerContainer.getContext()), composerContainer, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        OzonWebView constraintLayout = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        C4911f Q11 = container.Q();
        h a02 = container.a0();
        w0 w0Var = (w0) j.a(a02.a(), N.b(ExternalVerificationViewModel.class), new ExternalVerificationHandlerMobileViewMapperNoUi$createHolder$1(this)).getValue();
        Intrinsics.checkNotNullExpressionValue(w0Var, "viewModel(...)");
        return new ExternalVerificationHandlerMobileWidgetViewHolder(constraintLayout, composerContainer, (ExternalVerificationViewModel) w0Var, Q11, component().getOzonIdApi(), component().getOzonRouter(), container.M());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ExternalVerificationWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ExternalVerificationWidgetComponent.class), new C2445a(storage, 9));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ExternalVerificationVO> map(@NotNull ExternalVerificationDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
