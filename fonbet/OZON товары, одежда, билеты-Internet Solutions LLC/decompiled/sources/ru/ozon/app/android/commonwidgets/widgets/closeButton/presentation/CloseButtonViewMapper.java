package ru.ozon.app.android.commonwidgets.widgets.closeButton.presentation;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.data.CloseButtonDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R<\u0010\u001b\u001a$\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0019j\b\u0012\u0004\u0012\u00020\u0003`\u001a0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/closeButton/presentation/CloseButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/CloseButtonDTO;", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/presentation/CloseButtonVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/CloseButtonDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/closeButton/presentation/CloseButtonVO;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseButtonViewMapper extends WidgetViewMapper<CloseButtonDTO, CloseButtonVO> {

    @NotNull
    private final Function2<CloseButtonDTO, d, List<CloseButtonVO>> mapper = new CloseButtonViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_close_button_layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<CloseButtonVO>> holderProducer = CloseButtonViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CloseButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CloseButtonDTO, d, List<CloseButtonVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public final CloseButtonVO toVO(@NotNull CloseButtonDTO closeButtonDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(closeButtonDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new CloseButtonVO(stateId.hashCode(), closeButtonDTO.getButton(), closeButtonDTO.getDialog());
    }
}
