package ru.ozon.app.android.cabinet.scanItIntro.presentation;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.R$layout;
import ru.ozon.app.android.cabinet.scanItIntro.data.ScanItIntroDTO;
import ru.ozon.app.android.cabinet.scanItIntro.data.ScanItIntroMapper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0014\u001a\u00060\rj\u0002`\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroDTO;", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroVO;", "Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroMapper;", "mapper", "<init>", "(Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroMapper;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "handleRemove", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Z", "Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroMapper;", "getMapper", "()Lru/ozon/app/android/cabinet/scanItIntro/data/ScanItIntroMapper;", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroViewHolder;", "holder", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroViewHolder;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScanItIntroViewMapper extends SingleNoUiViewMapper<ScanItIntroDTO, ScanItIntroVO> {
    private ScanItIntroViewHolder holder;

    @NotNull
    private final ScanItIntroMapper mapper;

    public ScanItIntroViewMapper(@NotNull ScanItIntroMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        ScanItIntroViewHolder scanItIntroViewHolder = this.holder;
        if (scanItIntroViewHolder != null) {
            c d11 = viewObject.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.cabinet.scanItIntro.presentation.ScanItIntroVO");
            k.bindItem$default(scanItIntroViewHolder, (ScanItIntroVO) d11, viewObject.c(), null, 4, null);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        ScanItIntroViewHolder scanItIntroViewHolder = new ScanItIntroViewHolder(ViewGroupExtKt.inflate(composerRootView, R$layout.widget_scan_it_intro), references);
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(composerRootView);
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.addView(scanItIntroViewHolder.itemView);
        }
        this.holder = scanItIntroViewHolder;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public boolean handleRemove(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        LinearLayout composerTopContainer = ComposerViewExtensionKt.composerTopContainer(composerRootView);
        ScanItIntroViewHolder scanItIntroViewHolder = this.holder;
        composerTopContainer.removeView(scanItIntroViewHolder != null ? scanItIntroViewHolder.getContainerView() : null);
        return true;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public ScanItIntroMapper getMapper() {
        return this.mapper;
    }
}
