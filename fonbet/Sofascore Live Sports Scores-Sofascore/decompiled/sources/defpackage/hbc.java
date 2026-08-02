package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hbc {
    public final /* synthetic */ int a = 1;
    public List b;
    public boolean c;

    public hbc(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            this.b = Collections.EMPTY_LIST;
        } else {
            this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.c = z;
    }

    public static hbc a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new mac(bundle2) : null);
            }
        }
        return new hbc(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.b;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        mac macVar = (mac) list.get(i);
                        if (macVar != null && macVar.e()) {
                            i++;
                        }
                    }
                }
                return wt3.p(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hbc() {
    }
}
