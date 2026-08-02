package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.data.ReportAbuseFormDTO;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonVO;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModelImpl;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\rj\u0002`\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/core/ReportAbuseFormButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/di/ReportAbuseFormComponent;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormButtonViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/data/ReportAbuseFormDTO;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormButtonVO;", "<init>", "()V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormButtonViewHolder;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormButtonViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/core/ReportAbuseFormButtonMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/core/ReportAbuseFormButtonMapper;", "mapper", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReportAbuseFormButtonViewMapper extends BottomContainerViewMapper2<ReportAbuseFormComponent, ReportAbuseFormButtonViewHolder, ReportAbuseFormDTO, ReportAbuseFormButtonVO> {
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public /* bridge */ /* synthetic */ ReportAbuseFormButtonViewHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReportAbuseFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReportAbuseFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void bind(@NotNull ReportAbuseFormButtonViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        ReportAbuseFormButtonVO reportAbuseFormButtonVO = d11 instanceof ReportAbuseFormButtonVO ? (ReportAbuseFormButtonVO) d11 : null;
        if (reportAbuseFormButtonVO == null) {
            return;
        }
        k.bindItem$default(holder, reportAbuseFormButtonVO, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    @NotNull
    public ReportAbuseFormButtonViewHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Context context = composerInflater.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        Dimens dimens = Dimens.INSTANCE;
        frameLayout.setPadding(dimens.getDP_16(), dimens.getDP_8(), dimens.getDP_16(), dimens.getDP_16());
        ButtonView buttonView = new ButtonView(context, null, 0, 0, 14, null);
        buttonView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(buttonView);
        w0 a11 = new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormButtonViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ReportAbuseFormViewModelImpl reportAbuseFormViewModelImpl = ((ReportAbuseFormComponent) ReportAbuseFormButtonViewMapper.this.component()).getViewModel().get();
                Intrinsics.g(reportAbuseFormViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return reportAbuseFormViewModelImpl;
            }
        }).a(ReportAbuseFormViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new ReportAbuseFormButtonViewHolder(frameLayout, (ReportAbuseFormViewModelImpl) a11, ((ReportAbuseFormComponent) component()).getTokenizedAnalytics(), references, ((ReportAbuseFormComponent) component()).getHandlersInhibitor(), ((ReportAbuseFormComponent) component()).getCustomActionHandlersStoreFactory());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public ReportAbuseFormButtonMapper getMapper() {
        return ((ReportAbuseFormComponent) component()).buttonMapper();
    }
}
