package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation;

import Ev.C2973a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.data.UserLegalEntitiesDTOV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.di.UserLegalEntitiesComponentV2;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR2\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R,\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/UserLegalEntitiesViewMapperV2;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/di/UserLegalEntitiesComponentV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2;)Ljava/lang/Object;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "getMapper", "mapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserLegalEntitiesViewMapperV2 extends WidgetViewMapper2<UserLegalEntitiesComponentV2, UserLegalEntitiesDTOV2, LegalsItemVOV2> {
    private final int layout = R$layout.widget_user_legal_entities_v2_layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<LegalsItemVOV2>> holderProducer = new UserLegalEntitiesViewMapperV2$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserLegalEntitiesComponentV2 widgetComponent$lambda$0(C7475g c7475g) {
        return UserLegalEntitiesComponentV2.INSTANCE.createComponent(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new UserLegalEntitiesItemDecorationV2());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<LegalsItemVOV2>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<UserLegalEntitiesDTOV2, d, List<LegalsItemVOV2>> getMapper() {
        return component().getUserLegalEntitiesMapperV2();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<UserLegalEntitiesComponentV2> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(UserLegalEntitiesComponentV2.class), new C2973a(storage, 14));
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull LegalsItemVOV2 oldItem, @NotNull LegalsItemVOV2 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(UserLegalEntitiesV2Payload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getActionButton(), newItem.getActionButton())) {
            arrayList.add(UserLegalEntitiesV2Payload.REMOVE);
        }
        if (!Intrinsics.d(oldItem.getPayprops(), newItem.getPayprops())) {
            arrayList.add(UserLegalEntitiesV2Payload.PAYPROPS);
        }
        if (!Intrinsics.d(oldItem.getAddress(), newItem.getAddress())) {
            arrayList.add(UserLegalEntitiesV2Payload.ADDRESS);
        }
        if (!Intrinsics.d(oldItem.getCompanyId(), newItem.getCompanyId())) {
            arrayList.add(UserLegalEntitiesV2Payload.COMPANYID);
        }
        if (!Intrinsics.d(oldItem.getBottomControl(), newItem.getBottomControl())) {
            arrayList.add(UserLegalEntitiesV2Payload.CELLBUTTON);
        }
        return arrayList;
    }
}
