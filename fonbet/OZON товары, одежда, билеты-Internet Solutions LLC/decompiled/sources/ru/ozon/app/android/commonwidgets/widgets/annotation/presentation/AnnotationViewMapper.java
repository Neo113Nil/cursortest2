package ru.ozon.app.android.commonwidgets.widgets.annotation.presentation;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.annotation.data.AnnotationDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R6\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR<\u0010\"\u001a$\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030 j\b\u0012\u0004\u0012\u00020\u0003`!0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTO;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnnotationViewMapper extends WidgetViewMapper<AnnotationDTO, AnnotationVO> {

    @NotNull
    private final Context context;

    @NotNull
    private final CreateFavoritesListDelegate createFavoritesListDelegate;

    @NotNull
    private final Function2<View, ComposerReferences, k<AnnotationVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<AnnotationDTO, d, List<AnnotationVO>> mapper;

    public AnnotationViewMapper(@NotNull Context context, @NotNull CreateFavoritesListDelegate createFavoritesListDelegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(createFavoritesListDelegate, "createFavoritesListDelegate");
        this.context = context;
        this.createFavoritesListDelegate = createFavoritesListDelegate;
        this.mapper = new AnnotationViewMapper$mapper$1(this);
        this.layout = R$layout.widget_annotation_layout;
        this.holderProducer = new AnnotationViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof AnnotationDTO) && !((AnnotationDTO) state).isSticky();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AnnotationVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AnnotationDTO, d, List<AnnotationVO>> getMapper() {
        return this.mapper;
    }
}
