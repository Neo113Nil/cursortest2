package ru.ozon.app.android.pdp.widgets.richContent.core;

import A00.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.pdp.widgets.richContent.di.RichContentWidgetComponent;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.list.RichContentImageListVoWrapper;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.list.RichContentImageListWidgetViewHolder;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R2\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R,\u0010-\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentImageListViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/richContent/di/RichContentWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentImageListVoWrapper;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentImageListVoWrapper;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentImageListVoWrapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentExpandStateChangedUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentImageListWidgetViewHolder;", "holderProducer", "getHolderProducer", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RichContentImageListViewMapper extends WidgetViewMapper2<RichContentWidgetComponent, RichContentDTO.Content.ListItemDTO, RichContentImageListVoWrapper> {
    private final int layout = R$layout.widget_rich_content_image_list_item;

    @NotNull
    private final List<Class<RichContentExpandStateChangedUpdateKey>> supportedUpdates = C7714v.a0(RichContentExpandStateChangedUpdateKey.class);

    @NotNull
    private final Function2<RichContentDTO.Content.ListItemDTO, d, List<RichContentImageListVoWrapper>> mapper = new RichContentImageListViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, RichContentImageListWidgetViewHolder> holderProducer = RichContentImageListViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        RichContentDTO.Content.ListItemDTO listItemDTO = state instanceof RichContentDTO.Content.ListItemDTO ? (RichContentDTO.Content.ListItemDTO) state : null;
        if (listItemDTO != null) {
            return RichContentMapperExtKt.isImageList(listItemDTO);
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, RichContentImageListWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<RichContentDTO.Content.ListItemDTO, d, List<RichContentImageListVoWrapper>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<RichContentExpandStateChangedUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<RichContentWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return RichContentWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public RichContentImageListVoWrapper handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull RichContentImageListVoWrapper oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Boolean isExpanded = RichContentUtilsKt.isExpanded(oldItem, update);
        if (isExpanded != null) {
            return RichContentImageListVoWrapper.copy$default(oldItem, null, isExpanded.booleanValue(), 0, null, 0L, 29, null);
        }
        return null;
    }
}
