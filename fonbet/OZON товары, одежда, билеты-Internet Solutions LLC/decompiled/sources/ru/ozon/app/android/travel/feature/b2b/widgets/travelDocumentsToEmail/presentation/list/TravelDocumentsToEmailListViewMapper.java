package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list;

import android.content.Context;
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
import ru.ozon.app.android.travel.feature.b2b.R$layout;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data.TravelDocumentsToEmailDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.di.TravelDocumentsToEmailComponent;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00162\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R0\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060&j\u0002`'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/di/TravelDocumentsToEmailComponent;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelDocumentsToEmailListViewMapper extends WidgetViewMapper2<TravelDocumentsToEmailComponent, TravelDocumentsToEmailDTO, TravelDocumentsToEmailListVO> {
    private final int layout = R$layout.widget_travel_documents_to_email_list;

    @NotNull
    private final Function2<View, ComposerReferences, TravelDocumentsToEmailListWidgetViewHolder> holderProducer = new TravelDocumentsToEmailListViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TravelDocumentsToEmailDTO) && ((TravelDocumentsToEmailDTO) state).getReceiveEmailToggle().isSelected();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<TravelDocumentsToEmailListDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new TravelDocumentsToEmailListDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TravelDocumentsToEmailListWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelDocumentsToEmailDTO, d, List<TravelDocumentsToEmailListVO>> getMapper() {
        return component().getListMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelDocumentsToEmailComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelDocumentsToEmailComponent.INSTANCE.create(storage);
    }
}
