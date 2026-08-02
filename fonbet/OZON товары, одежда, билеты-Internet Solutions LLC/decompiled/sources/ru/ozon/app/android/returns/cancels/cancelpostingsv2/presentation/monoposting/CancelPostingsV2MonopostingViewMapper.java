package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting;

import AM.a;
import android.view.View;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.returns.cancels.R$layout;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.core.mappers.CancelPostingsV2MonopostingMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.data.MonopostingModel;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.di.CancelPostingsV2Component;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/CancelPostingsV2MonopostingViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/di/CancelPostingsV2Component;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/MonopostingModel;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/MonopostingVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/core/mappers/CancelPostingsV2MonopostingMapper;", "mapper", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/core/mappers/CancelPostingsV2MonopostingMapper;", "getMapper", "()Lru/ozon/app/android/returns/cancels/cancelpostingsv2/core/mappers/CancelPostingsV2MonopostingMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/monoposting/CancelPostingsV2MonopostingViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CancelPostingsV2MonopostingViewMapper extends WidgetViewMapper2<CancelPostingsV2Component, MonopostingModel, MonopostingVO> {

    @NotNull
    private final CancelPostingsV2MonopostingMapper mapper = new CancelPostingsV2MonopostingMapper();
    private final int layout = R$layout.widget_cancel_postings_v2_monoposting;

    @NotNull
    private final Function2<View, ComposerReferences, CancelPostingsV2MonopostingViewHolder> holderProducer = new CancelPostingsV2MonopostingViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final CancelPostingsV2Component widgetComponent$lambda$0(C7475g c7475g) {
        return CancelPostingsV2Component.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof MonopostingModel;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, CancelPostingsV2MonopostingViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CancelPostingsV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(CancelPostingsV2Component.class), new a(storage, 1));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CancelPostingsV2MonopostingMapper getMapper() {
        return this.mapper;
    }
}
