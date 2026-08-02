package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import A00.a;
import DV.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.recipientWidget.data.RecipientDTO;
import ru.ozon.app.android.account.orders.recipientWidget.data.RecipientMapper;
import ru.ozon.app.android.account.orders.recipientWidget.di.RecipientComponent;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.update.ChangeRecipientPayload$SaveButton;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.update.SaveRecipientButtonEnabledUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/recipientWidget/di/RecipientComponent;", "Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientDTO;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;)Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/update/SaveRecipientButtonEnabledUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/recipientWidget/data/RecipientMapper;", "mapper", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RecipientViewMapper extends WidgetViewMapper2<RecipientComponent, RecipientDTO, RecipientVO> {
    private final int layout = R$layout.widget_recipient;

    @NotNull
    private final Function2<View, ComposerReferences, RecipientViewHolder> holderProducer = new RecipientViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<SaveRecipientButtonEnabledUpdateKey>> supportedUpdates = C7714v.a0(SaveRecipientButtonEnabledUpdateKey.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecipientComponent widgetComponent$lambda$0(C7475g c7475g) {
        return RecipientComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, RecipientViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SaveRecipientButtonEnabledUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<RecipientComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(RecipientComponent.class), new a(storage, 6));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public RecipientMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull RecipientVO oldItem, @NotNull RecipientVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (Intrinsics.d(oldItem.getSaveButton().isDisabled(), newItem.getSaveButton().isDisabled())) {
            return null;
        }
        return new ChangeRecipientPayload$SaveButton(newItem.getSaveButton());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public RecipientVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull RecipientVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SaveRecipientButtonEnabledUpdateKey) {
            if (Intrinsics.d(oldItem.getSaveButton().isDisabled(), Boolean.valueOf(((SaveRecipientButtonEnabledUpdateKey) update).getEnabled()))) {
                return RecipientVO.copy$default(oldItem, 0L, null, null, null, null, ButtonV3DTO.copy$default(oldItem.getSaveButton(), null, null, null, null, null, null, Boolean.valueOf(!r3.getEnabled()), null, null, null, null, null, null, null, null, null, null, 131007, null), 31, null);
            }
        }
        return (RecipientVO) super.handleUpdate(update, (a.J.InterfaceC0007a) oldItem);
    }
}
