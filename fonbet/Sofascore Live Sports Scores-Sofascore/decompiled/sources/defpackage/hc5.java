package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.CloseGuard;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.facebook.internal.n;
import com.google.firebase.abt.component.AbtRegistrar;
import com.inmobi.media.Ah;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class hc5 implements ec3, ql6, n, h72, PurchasesUpdatedListener {
    public static final hc5 b = new hc5(0);
    public static final hc5 c = new hc5(1);
    public static final hc5 d = new hc5(2);
    public final /* synthetic */ int a;

    public /* synthetic */ hc5(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ CloseGuard b(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new ArrayIndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void i(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // defpackage.ql6
    public ll6[] createExtractors() {
        switch (this.a) {
            case 7:
                return new ll6[]{new e9()};
            case 8:
                return new ll6[]{new i9()};
            default:
                return new ll6[]{new il(0)};
        }
    }

    @Override // com.facebook.internal.n
    public void d(boolean z) {
        if (z) {
            m03 m03Var = m03.a;
            if (cw3.a.contains(m03.class)) {
                return;
            }
            try {
                m03.f.set(true);
                return;
            } catch (Throwable th) {
                cw3.a(m03.class, th);
                return;
            }
        }
        m03 m03Var2 = m03.a;
        if (cw3.a.contains(m03.class)) {
            return;
        }
        try {
            m03.f.set(false);
        } catch (Throwable th2) {
            cw3.a(m03.class, th2);
        }
    }

    @Override // defpackage.h72
    public i72 g(Bundle bundle) {
        gg[] ggVarArr;
        switch (this.a) {
            case 23:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList == null) {
                    ggVarArr = new gg[0];
                } else {
                    gg[] ggVarArr2 = new gg[parcelableArrayList.size()];
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        ggVarArr2[i] = (gg) gg.i.g((Bundle) parcelableArrayList.get(i));
                    }
                    ggVarArr = ggVarArr2;
                }
                return new jg(ggVarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), C.TIME_UNSET), bundle.getInt(Integer.toString(4, 36)));
            default:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i2 = bundle.getInt(Integer.toString(1, 36), -1);
                int i3 = bundle.getInt(Integer.toString(7, 36), -1);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                long j2 = bundle.getLong(Integer.toString(5, 36));
                boolean z = bundle.getBoolean(Integer.toString(6, 36));
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                Uri[] uriArr = parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new gg(j, i2, i3, iArr, uriArr, longArray, j2, z);
        }
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        z8 lambda$getComponents$0;
        lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(vngVar);
        return lambda$getComponents$0;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        switch (this.a) {
            case 26:
                Ah.b(billingResult, list);
                break;
            default:
                Ah.a(billingResult, list);
                break;
        }
    }

    public void w() {
    }
}
