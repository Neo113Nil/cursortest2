package ru.ozon.tracker.sendEvent;

import Jb.e;
import Pc.a;
import Qj0.u0;
import com.squareup.moshi.Moshi;
import fi0.s;
import ru.ozon.android.hardwareinfo.BuildInfoManager;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;

/* loaded from: classes7.dex */
public final class EventMapper_Factory implements e<EventMapper> {
    private final a<s> attrsManagerProvider;
    private final a<BuildInfoManager> buildInfoManagerProvider;
    private final a<DeviceInfoManager> deviceInfoManagerProvider;
    private final a<Moshi> moshiProvider;
    private final a<u0> userDataControllerProvider;

    public EventMapper_Factory(a<Moshi> aVar, a<s> aVar2, a<DeviceInfoManager> aVar3, a<BuildInfoManager> aVar4, a<u0> aVar5) {
        this.moshiProvider = aVar;
        this.attrsManagerProvider = aVar2;
        this.deviceInfoManagerProvider = aVar3;
        this.buildInfoManagerProvider = aVar4;
        this.userDataControllerProvider = aVar5;
    }

    public static EventMapper_Factory create(a<Moshi> aVar, a<s> aVar2, a<DeviceInfoManager> aVar3, a<BuildInfoManager> aVar4, a<u0> aVar5) {
        return new EventMapper_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static EventMapper newInstance(Moshi moshi, s sVar, DeviceInfoManager deviceInfoManager, BuildInfoManager buildInfoManager, u0 u0Var) {
        return new EventMapper(moshi, sVar, deviceInfoManager, buildInfoManager, u0Var);
    }

    @Override // Pc.a
    public EventMapper get() {
        return newInstance(this.moshiProvider.get(), this.attrsManagerProvider.get(), this.deviceInfoManagerProvider.get(), this.buildInfoManagerProvider.get(), this.userDataControllerProvider.get());
    }
}
