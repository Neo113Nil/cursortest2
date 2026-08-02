package ru.ozon.app.android.commonwidgets.widgets.annotation.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.annotation.data.AnnotationDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\n2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00140\u001cj\u0002`\u001d2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R6\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060/j\u0002`0\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003010.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTO;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;)V", "Landroid/view/ViewGroup;", "container", "findMap", "(Landroid/view/ViewGroup;)Landroid/view/ViewGroup;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "removeView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "Landroid/content/Context;", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "Landroid/view/View;", "view", "Landroid/view/View;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationWidgetViewHolder;", "holder", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationWidgetViewHolder;", "", "ANNOTATION_MARGIN_VERTICAL", "I", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnnotationNoUiViewMapper extends SingleNoUiViewMapper<AnnotationDTO, AnnotationVO> {
    private final int ANNOTATION_MARGIN_VERTICAL;

    @NotNull
    private final Context context;

    @NotNull
    private final CreateFavoritesListDelegate createFavoritesListDelegate;
    private AnnotationWidgetViewHolder holder;

    @NotNull
    private final Function2<AnnotationDTO, d, List<AnnotationVO>> mapper;
    private View view;

    public AnnotationNoUiViewMapper(@NotNull Context context, @NotNull CreateFavoritesListDelegate createFavoritesListDelegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(createFavoritesListDelegate, "createFavoritesListDelegate");
        this.context = context;
        this.createFavoritesListDelegate = createFavoritesListDelegate;
        this.ANNOTATION_MARGIN_VERTICAL = ResourceExtKt.toPx(8);
        this.mapper = new AnnotationNoUiViewMapper$mapper$1(this);
    }

    private final ViewGroup findMap(ViewGroup container) {
        ViewGroup findParent = ViewExtKt.findParent(ComposerViewExtensionKt.composerContainer(container), AnnotationNoUiViewMapper$findMap$1.INSTANCE);
        if (findParent != null) {
            return (LinearLayout) ((LinearLayout) findParent).findViewById(R$id.addressEditMapDetailsBottomSheetStickyLinearContainer);
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        View findViewById;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        AnnotationVO annotationVO = (AnnotationVO) viewObject.e();
        if (annotationVO == null) {
            return;
        }
        AnnotationWidgetViewHolder annotationWidgetViewHolder = this.holder;
        if (annotationWidgetViewHolder != null) {
            annotationWidgetViewHolder.bind(annotationVO);
        }
        View view = this.view;
        if (view == null || (findViewById = view.findViewById(ru.ozon.app.android.commonwidgets.R$id.cardCv)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.ANNOTATION_MARGIN_VERTICAL;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i11, marginLayoutParams.rightMargin, i11);
        findViewById.setLayoutParams(marginLayoutParams);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof AnnotationDTO) && ((AnnotationDTO) state).isSticky();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        View inflate = ViewGroupExtKt.inflate(composerRootView, R$layout.widget_annotation_layout);
        ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(composerRootView);
        ViewGroup findMap = findMap(composerContainer);
        if (findMap != null) {
            findMap.addView(inflate, 0);
        } else {
            ComposerViewExtensionKt.composerBottomContainer(composerContainer).addView(inflate);
        }
        this.holder = new AnnotationWidgetViewHolder(inflate, references, this.createFavoritesListDelegate);
        this.view = inflate;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<AnnotationDTO, d, List<AnnotationVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void removeView(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        super.removeView(composerRootView, references, viewObject);
        ViewGroup composerContainer = ComposerViewExtensionKt.composerContainer(composerRootView);
        ViewGroup findMap = findMap(composerContainer);
        if (findMap != null) {
            findMap.removeView(this.view);
        } else {
            ComposerViewExtensionKt.composerBottomContainer(composerContainer).removeView(this.view);
        }
        this.view = null;
        this.holder = null;
    }
}
