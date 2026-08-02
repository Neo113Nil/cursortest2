package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.presentation;

import Bi.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.data.TextBlockV2DTO;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.di.TextBlockV2Component;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/data/TextBlockV2DTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2VO;", "component", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/di/TextBlockV2Component;", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/di/TextBlockV2Component;)V", "mapper", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2Mapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2Mapper;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v2/presentation/TextBlockV2ViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "createView", "parent", "Landroid/view/ViewGroup;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextBlockV2ViewMapper extends WidgetViewMapper<TextBlockV2DTO, TextBlockV2VO> {

    @NotNull
    private final TextBlockV2Component component;

    @NotNull
    private final Function2<View, ComposerReferences, TextBlockV2ViewHolder> holderProducer;

    @NotNull
    private final TextBlockV2Mapper mapper;

    public TextBlockV2ViewMapper(@NotNull TextBlockV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = new TextBlockV2Mapper();
        this.holderProducer = new TextBlockV2ViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        a.d(-1, -2, textAtomV2View);
        return textAtomV2View;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TextBlockV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TextBlockV2DTO, d, List<TextBlockV2VO>> getMapper() {
        return this.mapper;
    }
}
