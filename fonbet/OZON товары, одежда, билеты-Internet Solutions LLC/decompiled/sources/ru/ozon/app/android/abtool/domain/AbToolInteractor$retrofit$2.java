package ru.ozon.app.android.abtool.domain;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import retrofit2.Retrofit;
import ru.ozon.app.android.abtool.data.network.AbTestApi;
import ru.ozon.app.android.abtool.data.network.NewAbTestApi;
import ru.ozon.app.android.abtool.data.network.OldAbTestApi;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/abtool/data/network/AbTestApi;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/abtool/data/network/AbTestApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AbToolInteractor$retrofit$2 extends AbstractC7737t implements Function0<AbTestApi> {
    final /* synthetic */ boolean $isNewApiEnabled;
    final /* synthetic */ InterfaceC4008j<Retrofit> $retrofit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolInteractor$retrofit$2(InterfaceC4008j<Retrofit> interfaceC4008j, boolean z11) {
        super(0);
        this.$retrofit = interfaceC4008j;
        this.$isNewApiEnabled = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbTestApi invoke() {
        return (AbTestApi) this.$retrofit.getValue().create(this.$isNewApiEnabled ? NewAbTestApi.class : OldAbTestApi.class);
    }
}
