package ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox;

import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.taglist.di.TagListComponent;
import ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3DTO;
import ru.ozon.app.android.common.ui.taglist.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R6\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0019j\u0002`\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R<\u0010)\u001a$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040'j\b\u0012\u0004\u0012\u00020\u0004`(0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001f¨\u0006+"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexboxTagListV3ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/common/taglist/di/TagListComponent;", "Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexboxTagListV3VO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexboxTagListV3VO;Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexboxTagListV3VO;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FlexboxTagListV3ViewMapper extends WidgetViewMapper2<TagListComponent, TagListV3DTO, FlexboxTagListV3VO> {

    @NotNull
    private final Function2<TagListV3DTO, d, List<FlexboxTagListV3VO>> mapper = FlexboxTagListV3ViewMapper$mapper$1.INSTANCE;
    private final Integer layout = Integer.valueOf(R$layout.flexbox_widget_tag_list);

    @NotNull
    private final Function2<View, ComposerReferences, k<FlexboxTagListV3VO>> holderProducer = new FlexboxTagListV3ViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !((state instanceof TagListV3DTO ? (TagListV3DTO) state : null) != null ? Intrinsics.d(r2.isSticky(), Boolean.TRUE) : false);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FlexboxTagListV3VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TagListV3DTO, d, List<FlexboxTagListV3VO>> getMapper() {
        return this.mapper;
    }

    public void getPayload(@NotNull FlexboxTagListV3VO oldItem, @NotNull FlexboxTagListV3VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TagListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TagListComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((FlexboxTagListV3VO) cVar, (FlexboxTagListV3VO) cVar2);
        return Unit.f71690a;
    }
}
