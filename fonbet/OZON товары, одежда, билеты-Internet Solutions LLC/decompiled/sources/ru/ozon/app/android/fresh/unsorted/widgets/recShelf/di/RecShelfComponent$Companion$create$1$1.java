package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.data.RecShelfApi;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/recShelf/di/RecShelfComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/di/RecShelfComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/RecShelfViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecShelfComponent$Companion$create$1$1 implements RecShelfComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(RecShelfComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<RecShelfViewModel> viewModelProvider;

    RecShelfComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new NI.a(c7475g, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecShelfViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        Object create = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getRetrofit().create(RecShelfApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new RecShelfViewModel((RecShelfApi) create);
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di.RecShelfComponent
    public d getCustomActionHandlersFactory() {
        return ((CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di.RecShelfComponent
    public RecShelfMapper getMapper() {
        return (RecShelfMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di.RecShelfComponent
    public a<RecShelfViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
