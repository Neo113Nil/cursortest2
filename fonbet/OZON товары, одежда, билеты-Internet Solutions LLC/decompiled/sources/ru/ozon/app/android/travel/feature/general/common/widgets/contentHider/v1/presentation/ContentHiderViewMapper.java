package ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.data.ContentHiderDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.di.ContentHiderComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.view.ContentHiderView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/presentation/ContentHiderViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/data/ContentHiderDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/presentation/ContentHiderVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/di/ContentHiderComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/di/ContentHiderComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/presentation/ContentHiderDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "state", "Ll20/d;", "info", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/data/ContentHiderDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/di/ContentHiderComponent;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentHiderViewMapper extends g<ContentHiderDTO, ContentHiderVI> {

    @NotNull
    private final ContentHiderComponent component;

    public ContentHiderViewMapper(@NotNull ContentHiderComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<ContentHiderVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ContentHiderWidgetViewHolder((ContentHiderView) view);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContentHiderView contentHiderView = new ContentHiderView(context);
        contentHiderView.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        return contentHiderView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<ContentHiderDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ContentHiderDecoration());
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ContentHiderVI> map(@NotNull ContentHiderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getContentHiderMapper().invoke(state, info);
    }
}
