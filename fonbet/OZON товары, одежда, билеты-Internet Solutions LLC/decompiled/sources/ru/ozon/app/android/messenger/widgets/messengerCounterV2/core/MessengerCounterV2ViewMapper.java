package ru.ozon.app.android.messenger.widgets.messengerCounterV2.core;

import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.data.MessengerCounterV2DTO;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.di.MessengerCounterV2Component;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2VO;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2View;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2ViewHolder;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/core/MessengerCounterV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/di/MessengerCounterV2Component;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/data/MessengerCounterV2DTO;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/core/MessengerCounterV2Mapper;", "getMapper", "()Lru/ozon/app/android/messenger/widgets/messengerCounterV2/core/MessengerCounterV2Mapper;", "mapper", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerCounterV2ViewMapper extends WidgetViewMapper2<MessengerCounterV2Component, MessengerCounterV2DTO, MessengerCounterV2VO> {

    @NotNull
    private final Function2<View, ComposerReferences, MessengerCounterV2ViewHolder> holderProducer = new MessengerCounterV2ViewMapper$holderProducer$1(this);
    private final Void layout;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, MessengerCounterV2ViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<MessengerCounterV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return MessengerCounterV2Component.INSTANCE.createComponent(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public MessengerCounterV2View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return component().getViewFactory().create(parent);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public MessengerCounterV2Mapper getMapper() {
        return component().getMapper();
    }
}
