package ru.ozon.app.android.favorites.createshoppinglist.presentation;

import A00.a;
import Sc.o;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.favorites.createshoppinglist.data.CreateShoppingListDTO;
import ru.ozon.app.android.favorites.createshoppinglist.di.CreateShoppingListWidgetComponent;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListUpdate;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.vh.CreateShoppingListTitleViewHolder;
import ru.ozon.app.android.favorites.feature.R$layout;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/favorites/createshoppinglist/di/CreateShoppingListWidgetComponent;", "Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListDTO;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleVO;)Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/vh/CreateShoppingListTitleViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleMapper;", "getMapper", "()Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListTitleMapper;", "mapper", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateShoppingListTitleViewMapper extends WidgetViewMapper2<CreateShoppingListWidgetComponent, CreateShoppingListDTO, CreateShoppingListTitleVO> {
    private final int layout = R$layout.widget_create_shopping_list_title;

    @NotNull
    private final Function2<View, ComposerReferences, CreateShoppingListTitleViewHolder> holderProducer = new CreateShoppingListTitleViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(CreateShoppingListUpdate.Title.class, CreateShoppingListUpdate.Error.class);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, CreateShoppingListTitleViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CreateShoppingListWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CreateShoppingListWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CreateShoppingListTitleMapper getMapper() {
        return component().getCreateShoppingListTitleMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CreateShoppingListTitleVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CreateShoppingListTitleVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        CreateShoppingListUpdate createShoppingListUpdate = (CreateShoppingListUpdate) update;
        if (createShoppingListUpdate instanceof CreateShoppingListUpdate.Title) {
            CreateShoppingListUpdate.Title title = (CreateShoppingListUpdate.Title) update;
            return CreateShoppingListTitleVO.copy$default(oldItem, null, Long.valueOf(System.currentTimeMillis()), title.getText(), null, title.getText(), 0L, null, 96, null);
        }
        if (!(createShoppingListUpdate instanceof CreateShoppingListUpdate.Error)) {
            throw new o();
        }
        CreateShoppingListUpdate.Error error = (CreateShoppingListUpdate.Error) update;
        return CreateShoppingListTitleVO.copy$default(oldItem, error.getErrorDescription(), Long.valueOf(System.currentTimeMillis()), error.getListTitle(), null, error.getListTitle(), 0L, null, 104, null);
    }
}
