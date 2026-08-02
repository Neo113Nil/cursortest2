package ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.core;

import Vg.d;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import j10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.data.CurtainNavBarDTO;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u000ej\u0002`\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/core/CurtainNavBarViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarVO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(LVg/d;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "", "handleRemove", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Z", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "LVg/d;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/core/CurtainNavBarMapper;", "mapper", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/core/CurtainNavBarMapper;", "getMapper", "()Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/core/CurtainNavBarMapper;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarViewHolder;", "holder", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/presentation/CurtainNavBarViewHolder;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainNavBarViewMapper extends SingleNoUiViewMapper<CurtainNavBarDTO, CurtainNavBarVO> {

    @NotNull
    private final d customActionHandlersStoreFactory;
    private CurtainNavBarViewHolder holder;

    @NotNull
    private final CurtainNavBarMapper mapper;

    public CurtainNavBarViewMapper(@NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.mapper = new CurtainNavBarMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        CurtainNavBarViewHolder curtainNavBarViewHolder = this.holder;
        if (curtainNavBarViewHolder != null) {
            c d11 = viewObject.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarVO");
            k.bindItem$default(curtainNavBarViewHolder, (CurtainNavBarVO) d11, viewObject.c(), null, 4, null);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(composerRootView);
        if (composerAppbar != null) {
            CurtainNavBarViewHolder curtainNavBarViewHolder = new CurtainNavBarViewHolder(ViewGroupExtKt.inflate(composerAppbar, R$layout.widget_curtain_nav_bar), references, references.getTokenizedAnalytics(), this.customActionHandlersStoreFactory);
            composerAppbar.addView(curtainNavBarViewHolder.itemView);
            this.holder = curtainNavBarViewHolder;
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public boolean handleRemove(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        View view;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        CurtainNavBarViewHolder curtainNavBarViewHolder = this.holder;
        Boolean bool = null;
        this.holder = null;
        AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(composerRootView);
        if (composerAppbar == null) {
            return false;
        }
        if (curtainNavBarViewHolder != null && (view = curtainNavBarViewHolder.itemView) != null) {
            composerAppbar.removeViewAt(composerAppbar.indexOfChild(view));
            bool = Boolean.TRUE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public CurtainNavBarMapper getMapper() {
        return this.mapper;
    }
}
