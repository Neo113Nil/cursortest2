package ru.ozon.app.android.button.di;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.button.actions.BaseActionConfig;
import ru.ozon.app.android.button.core.ActionButtonMapper;
import ru.ozon.app.android.button.data.ActionButtonDTO;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR/\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00130\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ru/ozon/app/android/button/di/ActionButtonComponent$Companion$create$1", "Lru/ozon/app/android/button/di/ActionButtonComponent;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/button/core/ActionButtonMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/button/core/ActionButtonMapper;", "mapper", "", "", "Lru/ozon/app/android/button/actions/BaseActionConfig;", "Lru/ozon/app/android/button/data/ActionButtonDTO$ButtonsItem$Action;", "actions$delegate", "getActions", "()Ljava/util/Map;", "actions", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionButtonComponent$Companion$create$1 implements ActionButtonComponent {
    private final NavigationComponentApi navigationComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ActionButtonComponent$Companion$create$1$mapper$2.INSTANCE);

    /* renamed from: actions$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j actions = k.b(new ActionButtonComponent$Companion$create$1$actions$2(this));

    ActionButtonComponent$Companion$create$1(C7475g c7475g) {
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.button.di.ActionButtonComponent
    public Map<String, BaseActionConfig<? extends ActionButtonDTO.ButtonsItem.Action>> getActions() {
        return (Map) this.actions.getValue();
    }

    @Override // ru.ozon.app.android.button.di.ActionButtonComponent
    public ActionButtonMapper getMapper() {
        return (ActionButtonMapper) this.mapper.getValue();
    }
}
