package ru.ozon.app.android.limb2.di.modules;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.user.UserStatusStorage;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$featureFlagsProvider$1$1$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ InterfaceC4008j<UserStatusStorage> $userStorage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Limb2PluginProvidersModule$provideOzonIdPluginProvider$1$featureFlagsProvider$1$1$1(InterfaceC4008j<? extends UserStatusStorage> interfaceC4008j) {
        super(0);
        this.$userStorage = interfaceC4008j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$userStorage.getValue().isAutoTestUser());
    }
}
