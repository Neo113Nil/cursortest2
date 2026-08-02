package ru.ozon.app.android.common.disclaimer;

import Vg.d;
import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R6\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR<\u0010$\u001a$\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\"j\b\u0012\u0004\u0012\u00020\u0003`#0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a¨\u0006&"}, d2 = {"Lru/ozon/app/android/common/disclaimer/DisclaimerViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/common/disclaimer/DisclaimerDTO;", "Lru/ozon/app/android/common/disclaimer/DisclaimerVO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Landroid/content/Context;", "context", "<init>", "(LVg/d;Landroid/content/Context;)V", "", "stateId", "toVO", "(Lru/ozon/app/android/common/disclaimer/DisclaimerDTO;Ljava/lang/String;)Lru/ozon/app/android/common/disclaimer/DisclaimerVO;", "LVg/d;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "disclaimer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DisclaimerViewMapper extends WidgetViewMapper<DisclaimerDTO, DisclaimerVO> {

    @NotNull
    private final Context context;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Function2<View, ComposerReferences, k<DisclaimerVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<DisclaimerDTO, l20.d, List<DisclaimerVO>> mapper;

    public DisclaimerViewMapper(@NotNull d customActionHandlersStoreFactory, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.context = context;
        this.mapper = new DisclaimerViewMapper$mapper$1(this);
        this.layout = R$layout.widget_disclaimer_layout;
        this.holderProducer = new DisclaimerViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<DisclaimerVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DisclaimerDTO, l20.d, List<DisclaimerVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public final DisclaimerVO toVO(@NotNull DisclaimerDTO disclaimerDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(disclaimerDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new DisclaimerVO(stateId.hashCode(), disclaimerDTO.isRounded(), disclaimerDTO.getDisclaimer());
    }
}
