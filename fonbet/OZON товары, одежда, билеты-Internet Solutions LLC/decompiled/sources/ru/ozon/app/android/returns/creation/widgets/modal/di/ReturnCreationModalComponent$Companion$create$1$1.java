package ru.ozon.app.android.returns.creation.widgets.modal.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.returns.creation.widgets.modal.presentation.viewMapper.ReturnCreationModalMapper;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0010\u001a\u00060\u000bj\u0002`\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/modal/di/ReturnCreationModalComponent$Companion$create$1$1", "Lru/ozon/app/android/returns/creation/widgets/modal/di/ReturnCreationModalComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewMapper/ReturnCreationModalMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewMapper/ReturnCreationModalMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationModalComponent$Companion$create$1$1 implements ReturnCreationModalComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;

    ReturnCreationModalComponent$Companion$create$1$1(Context context) {
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) dependencyStorage.b(CustomActionHandlersComponentApi.class);
        this.mapper = k.b(ReturnCreationModalComponent$Companion$create$1$1$mapper$2.INSTANCE);
        this.customActionHandlersStoreFactory = k.b(new ReturnCreationModalComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.modal.di.ReturnCreationModalComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.modal.di.ReturnCreationModalComponent
    public ReturnCreationModalMapper getMapper() {
        return (ReturnCreationModalMapper) this.mapper.getValue();
    }
}
