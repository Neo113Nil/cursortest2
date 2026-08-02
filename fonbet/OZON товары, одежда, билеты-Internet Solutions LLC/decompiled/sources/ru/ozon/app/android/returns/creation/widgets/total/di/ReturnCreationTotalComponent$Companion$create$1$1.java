package ru.ozon.app.android.returns.creation.widgets.total.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewMapper.ReturnCreationTotalMapper;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0010\u001a\u00060\u000bj\u0002`\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/total/di/ReturnCreationTotalComponent$Companion$create$1$1", "Lru/ozon/app/android/returns/creation/widgets/total/di/ReturnCreationTotalComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewMapper/ReturnCreationTotalMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewMapper/ReturnCreationTotalMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersFactory$delegate", "getCustomActionHandlersFactory", "()LVg/d;", "customActionHandlersFactory", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationTotalComponent$Companion$create$1$1 implements ReturnCreationTotalComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersFactory;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;

    ReturnCreationTotalComponent$Companion$create$1$1(Context context) {
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) dependencyStorage.b(CustomActionHandlersComponentApi.class);
        this.mapper = k.b(ReturnCreationTotalComponent$Companion$create$1$1$mapper$2.INSTANCE);
        this.customActionHandlersFactory = k.b(new ReturnCreationTotalComponent$Companion$create$1$1$customActionHandlersFactory$2(this));
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.total.di.ReturnCreationTotalComponent
    public d getCustomActionHandlersFactory() {
        return (d) this.customActionHandlersFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.total.di.ReturnCreationTotalComponent
    public ReturnCreationTotalMapper getMapper() {
        return (ReturnCreationTotalMapper) this.mapper.getValue();
    }
}
