package ru.ozon.app.android.commonwidgets.widgets.textblock.presentation.main;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.textblock.models.TextBlockDTO;
import ru.ozon.app.android.commonwidgets.widgets.textblock.models.TextBlockMappersKt;
import ru.ozon.app.android.commonwidgets.widgets.textblock.models.TextBlockVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR6\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR<\u0010 \u001a$\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u001ej\b\u0012\u0004\u0012\u00020\u0003`\u001f0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/textblock/presentation/main/TextBlockViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockDTO;", "Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockVO;", "<init>", "()V", "", "stateId", "", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockDTO;Ljava/lang/String;)Ljava/util/List;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockVO;Lru/ozon/app/android/commonwidgets/widgets/textblock/models/TextBlockVO;)Ljava/lang/Object;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextBlockViewMapper extends WidgetViewMapper<TextBlockDTO, TextBlockVO> {

    @NotNull
    private final Function2<TextBlockDTO, d, List<TextBlockVO>> mapper = new TextBlockViewMapper$mapper$1(this);
    private final Integer layout = Integer.valueOf(R$layout.widget_text_block);

    @NotNull
    private final Function2<View, ComposerReferences, k<TextBlockVO>> holderProducer = TextBlockViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TextBlockVO> toVO(TextBlockDTO textBlockDTO, String str) {
        TextBlockVO mapToVO;
        List<TextBlockVO> list = null;
        if (Intrinsics.d(textBlockDTO.isSticky(), Boolean.TRUE)) {
            textBlockDTO = null;
        }
        if (textBlockDTO != null && (mapToVO = TextBlockMappersKt.mapToVO(textBlockDTO, str)) != null) {
            list = C7714v.a0(mapToVO);
        }
        return list == null ? K.f71697a : list;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TextBlockVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TextBlockDTO, d, List<TextBlockVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull TextBlockVO oldItem, @NotNull TextBlockVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Unit.f71690a;
    }
}
