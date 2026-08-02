package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation;

import A00.a;
import Bs.C2670a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data.AddLegalAddressMobileDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.di.AddLegalAddressMobileComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR2\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R,\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010#¨\u0006-"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/di/AddLegalAddressMobileComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/AddLegalAddressMobileDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "newItem", "", "getPayload", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;)Ljava/lang/Object;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddLegalAddressMobileViewMapper extends WidgetViewMapper2<AddLegalAddressMobileComponent, AddLegalAddressMobileDTO, AddLegalAddressMobileVO> {
    private final int layout = R$layout.widget_add_legal_address_mobile;

    @NotNull
    private final Function2<View, ComposerReferences, k<AddLegalAddressMobileVO>> holderProducer = new AddLegalAddressMobileViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(AddLegalQueryUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddLegalAddressMobileComponent widgetComponent$lambda$0(C7475g c7475g) {
        return AddLegalAddressMobileComponent.INSTANCE.createComponent(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AddLegalAddressMobileVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddLegalAddressMobileDTO, d, List<AddLegalAddressMobileVO>> getMapper() {
        return component().getAddLegalAddressMobileMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AddLegalAddressMobileComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(AddLegalAddressMobileComponent.class), new C2670a(storage, 6));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull AddLegalAddressMobileVO oldItem, @NotNull AddLegalAddressMobileVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AddLegalAddressMobileVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddLegalAddressMobileVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof AddLegalQueryUpdate)) {
            return null;
        }
        AddLegalQueryUpdate addLegalQueryUpdate = (AddLegalQueryUpdate) update;
        if (addLegalQueryUpdate.getId() != oldItem.getId()) {
            return null;
        }
        return AddLegalAddressMobileVO.copy$default(oldItem, 0L, addLegalQueryUpdate.getQuery(), null, null, null, null, 61, null);
    }
}
