package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class U1 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0544v2 f12955a;

    public U1() {
        this(new C0544v2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 fromModel(@NonNull T1 t12) {
        X1 x12 = new X1();
        x12.f13139a = new W1[t12.f12896a.size()];
        int i5 = 0;
        int i10 = 0;
        for (PermissionState permissionState : t12.f12896a) {
            W1[] w1Arr = x12.f13139a;
            W1 w12 = new W1();
            w12.f13076a = permissionState.name;
            w12.f13077b = permissionState.granted;
            w1Arr[i10] = w12;
            i10++;
        }
        C0594x2 c0594x2 = t12.f12897b;
        if (c0594x2 != null) {
            x12.f13140b = this.f12955a.fromModel(c0594x2);
        }
        x12.f13141c = new String[t12.f12898c.size()];
        Iterator it = t12.f12898c.iterator();
        while (it.hasNext()) {
            x12.f13141c[i5] = (String) it.next();
            i5++;
        }
        return x12;
    }

    public U1(C0544v2 c0544v2) {
        this.f12955a = c0544v2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T1 toModel(@NonNull X1 x12) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i10 = 0;
        while (true) {
            W1[] w1Arr = x12.f13139a;
            if (i10 >= w1Arr.length) {
                break;
            }
            W1 w12 = w1Arr[i10];
            arrayList.add(new PermissionState(w12.f13076a, w12.f13077b));
            i10++;
        }
        V1 v12 = x12.f13140b;
        C0594x2 model = v12 != null ? this.f12955a.toModel(v12) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = x12.f13141c;
            if (i5 < strArr.length) {
                arrayList2.add(strArr[i5]);
                i5++;
            } else {
                return new T1(arrayList, model, arrayList2);
            }
        }
    }
}
