package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di;

import Pc.a;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoButtonMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoFormMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\rJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/di/AddEdoComponentV2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonMapperV2;", "getAddEDOButtonMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonMapperV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormMapperV2;", "getAddEDOFormMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormMapperV2;", "LPc/a;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2Impl;", "getWidgetViewModelProvider", "()LPc/a;", "Factory", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AddEdoComponentV2 extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/di/AddEdoComponentV2$Factory;", "", "create", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/di/AddEdoComponentV2;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "statusEdoStateComponentApi", "Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/di/StatusEdoStateComponentApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface Factory {
        @NotNull
        AddEdoComponentV2 create(@NotNull NetworkComponentApi networkComponentApi, @NotNull StatusEdoStateComponentApi statusEdoStateComponentApi);
    }

    @NotNull
    AddEdoButtonMapperV2 getAddEDOButtonMapper();

    @NotNull
    AddEdoFormMapperV2 getAddEDOFormMapper();

    @NotNull
    a<AddEdoViewModelV2Impl> getWidgetViewModelProvider();
}
