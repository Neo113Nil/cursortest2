package ru.ozon.app.android.storefront.stories.setOfPreviews;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.SetOfPreviewsDTO;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.SetOfPreviewsVO;
import ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.SetOfPreviewsVH;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/SetOfPreviewsViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsDTO;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/SetOfPreviewsVO;", "<init>", "()V", "mapper", "Lru/ozon/app/android/storefront/stories/setOfPreviews/SetOfPreviewsMapper;", "getMapper", "()Lru/ozon/app/android/storefront/stories/setOfPreviews/SetOfPreviewsMapper;", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/SetOfPreviewsVH;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "getPayload", "", "oldItem", "newItem", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetOfPreviewsViewMapper extends WidgetViewMapper<SetOfPreviewsDTO, SetOfPreviewsVO> {

    @NotNull
    private final SetOfPreviewsMapper mapper = new SetOfPreviewsMapper();
    private final int layout = R$layout.widget_set_of_previews;

    @NotNull
    private final Function2<View, ComposerReferences, SetOfPreviewsVH> holderProducer = SetOfPreviewsViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SetOfPreviewsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    public void getPayload(@NotNull SetOfPreviewsVO oldItem, @NotNull SetOfPreviewsVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SetOfPreviewsDTO, d, List<SetOfPreviewsVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((SetOfPreviewsVO) cVar, (SetOfPreviewsVO) cVar2);
        return Unit.f71690a;
    }
}
