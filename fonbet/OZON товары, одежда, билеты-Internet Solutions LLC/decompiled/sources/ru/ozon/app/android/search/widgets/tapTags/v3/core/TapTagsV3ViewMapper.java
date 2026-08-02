package ru.ozon.app.android.search.widgets.tapTags.v3.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3VO;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3View;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewHolder;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0016j\b\u0012\u0004\u0012\u00020\u0002`\u00172\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/tapTags/v3/di/TapTagsV3WidgetComponent;", "Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3DTO;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "widgetStickyConfig", "Ljava/lang/String;", "getWidgetStickyConfig-H4O2Is4", "()Ljava/lang/String;", "Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3Mapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/tapTags/v3/core/TapTagsV3Mapper;", "mapper", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapTagsV3ViewMapper extends WidgetViewMapper2<TapTagsV3WidgetComponent, TapTagsV3DTO, TapTagsV3VO> {

    @NotNull
    private final Function2<View, ComposerReferences, TapTagsV3ViewHolder> holderProducer = new TapTagsV3ViewMapper$holderProducer$1(this);

    @NotNull
    private final String widgetStickyConfig;

    public TapTagsV3ViewMapper() {
        Intrinsics.checkNotNullParameter("TAP_TAGS_V3_STICKY", "tag");
        this.widgetStickyConfig = "TAP_TAGS_V3_STICKY";
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        List<TagButtonDTO> items;
        if (!(state instanceof TapTagsV3DTO)) {
            return false;
        }
        TapTagsV3DTO tapTagsV3DTO = (TapTagsV3DTO) state;
        return tapTagsV3DTO.getSearchText().length() > 0 || ((items = tapTagsV3DTO.getItems()) != null && (items.isEmpty() ^ true));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        super.constructLayout(container, viewItem);
        ComposerViewExtensionKt.composerRecyclerView(container.Z()).setItemAnimator(null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TapTagsV3ViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: getWidgetStickyConfig-H4O2Is4, reason: not valid java name and from getter */
    public String getWidgetStickyConfig() {
        return this.widgetStickyConfig;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TapTagsV3WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TapTagsV3WidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TapTagsV3View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new TapTagsV3View(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public TapTagsV3Mapper getMapper() {
        return component().getMapper();
    }
}
