package ru.ozon.app.android.search.widgets.history.search.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryMapper;
import ru.ozon.app.android.search.widgets.history.search.di.HistoryWidgetComponent;
import ru.ozon.app.android.search.widgets.history.search.presentation.updateKey.FiltersOnboardingLoaded;
import ru.ozon.app.android.search.widgets.history.search.presentation.updateKey.TagRemoved;
import ru.ozon.app.android.search.widgets.history.search.presentation.updateKey.TagsOpened;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001cj\b\u0012\u0004\u0012\u00020\u0002`\u001d2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/history/search/di/HistoryWidgetComponent;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryView;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper;", "mapper", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HistoryViewMapper extends WidgetViewMapper2<HistoryWidgetComponent, HistoryDTO, HistoryVO> {
    private final Void layout;

    @NotNull
    private final Function2<View, ComposerReferences, HistoryViewHolder> holderProducer = new HistoryViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(HistoryVO.class, TagRemoved.class, TagsOpened.class, FiltersOnboardingLoaded.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof HistoryDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, HistoryViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HistoryWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HistoryWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public HistoryView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new HistoryView(context, null, 0, 0, 14, null);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public HistoryMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull HistoryVO oldItem, @NotNull HistoryVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!Intrinsics.d(oldItem.getHistoryItems(), newItem.getHistoryItems())) {
            return "HistoryTagsPayloads";
        }
        if (!Intrinsics.d(oldItem.getOnboarding(), newItem.getOnboarding())) {
            return "HistoryFiltersOnboardingPayloads";
        }
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public HistoryVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HistoryVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HistoryVO) {
            HistoryVO historyVO = (HistoryVO) update;
            if (historyVO.getId() == oldItem.getId()) {
                return HistoryVO.copy$default(oldItem, historyVO.getId(), historyVO.getTitle(), historyVO.getDeleteButton(), historyVO.getHistoryItems(), oldItem.getAsyncData(), false, null, null, 224, null);
            }
        }
        if (update instanceof TagsOpened) {
            TagsOpened tagsOpened = (TagsOpened) update;
            if (tagsOpened.getId() == oldItem.getId()) {
                return HistoryVO.copy$default(oldItem, 0L, null, null, tagsOpened.getHistoryItems(), null, true, null, null, ModuleDescriptor.MODULE_VERSION, null);
            }
        }
        if (update instanceof TagRemoved) {
            TagRemoved tagRemoved = (TagRemoved) update;
            if (tagRemoved.getId() == oldItem.getId()) {
                return HistoryVO.copy$default(oldItem, 0L, null, null, tagRemoved.getHistoryItems(), null, false, null, null, 247, null);
            }
        }
        if (update instanceof FiltersOnboardingLoaded) {
            FiltersOnboardingLoaded filtersOnboardingLoaded = (FiltersOnboardingLoaded) update;
            if (filtersOnboardingLoaded.getId() == oldItem.getId()) {
                return HistoryVO.copy$default(oldItem, 0L, null, null, null, null, false, null, filtersOnboardingLoaded.getOnboarding(), 127, null);
            }
        }
        return oldItem;
    }
}
