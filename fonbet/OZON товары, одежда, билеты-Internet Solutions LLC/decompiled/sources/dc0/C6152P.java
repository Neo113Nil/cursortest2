package dc0;

import Sc.InterfaceC4008j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;

/* renamed from: dc0.P, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6152P {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f61518a;

    /* renamed from: dc0.P$a */
    public static final class a extends zb0.e {

        /* renamed from: a, reason: collision with root package name */
        private final String f61519a;

        /* renamed from: b, reason: collision with root package name */
        private final String f61520b;

        a(Map.Entry<String, String> entry) {
            this.f61519a = entry.getKey();
            this.f61520b = entry.getValue();
        }

        @Override // zb0.e
        public final String getName() {
            return this.f61519a;
        }

        @Override // zb0.e
        public final String getValue() {
            return this.f61520b;
        }
    }

    public C6152P(@NotNull InterfaceC4008j<yc0.c> headersProvider, @NotNull DeviceInfoManager deviceInfoManager, @NotNull InterfaceC4008j<Ub0.c> localization) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        Intrinsics.checkNotNullParameter(deviceInfoManager, "deviceInfoManager");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Map n11 = U.n(headersProvider.getValue().d(), new Pair("x-o3-os-version", deviceInfoManager.getOsVersion()));
        localization.getValue().getClass();
        Map n12 = U.n(n11, new Pair("x-o3-sys-languages", Ub0.c.c()));
        ArrayList arrayList = new ArrayList(n12.size());
        Iterator it = n12.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = new a((Map.Entry) it.next());
            aVar.getAttributes().g(false);
            aVar.getAttributes().f();
            aVar.getAttributes().e();
            arrayList.add(aVar);
        }
        this.f61518a = arrayList;
    }

    @NotNull
    public final ArrayList a() {
        return this.f61518a;
    }
}
