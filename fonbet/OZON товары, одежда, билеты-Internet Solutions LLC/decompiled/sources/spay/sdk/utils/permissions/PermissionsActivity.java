package spay.sdk.utils.permissions;

import B0.C2454a;
import Ve.Bi;
import Ve.C4792yj;
import Ve.Ld;
import Ve.Pe;
import Ve.Te;
import Ve.Ul;
import Ve.Ur;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.g;
import androidx.core.app.b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lspay/sdk/utils/permissions/PermissionsActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PermissionsActivity extends g {

    /* renamed from: a, reason: collision with root package name */
    public Te f98856a;

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            this.f98856a = c4792yj.f32584a.c();
        }
        super.onCreate(bundle);
        Intrinsics.checkNotNullParameter(this, "<this>");
        b.e(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 13);
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] other, int[] grantResults) {
        Intrinsics.checkNotNullParameter(other, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, other, grantResults);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Te te2 = this.f98856a;
        if (te2 != null) {
            te2.b(new Bi(Ld.SC_PERMISSIONS, Ur.MERCHANT_VIEW, Pe.SC, null, null, null, null, 120));
        }
        Intrinsics.checkNotNullParameter(grantResults, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(grantResults.length, other.length);
        ArrayList arrayList3 = new ArrayList(min);
        for (int i12 = 0; i12 < min; i12++) {
            int i13 = grantResults[i12];
            arrayList3.add(new Pair(Integer.valueOf(i13), other[i12]));
        }
        for (Map.Entry entry : U.s(arrayList3).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (intValue == -1) {
                Intent intent = new Intent("action_permissions_denied");
                intent.setPackage(getApplicationContext().getPackageName());
                sendBroadcast(intent);
                arrayList2.add(entry.getValue());
            } else if (intValue == 0) {
                Intent intent2 = new Intent("action_permissions_granted");
                intent2.setPackage(getApplicationContext().getPackageName());
                sendBroadcast(intent2);
                arrayList.add(entry.getValue());
            }
        }
        if (this.f98856a != null) {
            if (!arrayList.isEmpty()) {
                Te te3 = this.f98856a;
                if (te3 == null) {
                    Intrinsics.n("metricFacade");
                    throw null;
                }
                te3.b(new Bi(Ld.SC_GOOD_PERMISSIONS, Ur.MERCHANT_VIEW, Pe.SC, C2454a.b("Granted", arrayList.toString()), null, null, null, 112));
            }
            if (!arrayList2.isEmpty()) {
                Te te4 = this.f98856a;
                if (te4 == null) {
                    Intrinsics.n("metricFacade");
                    throw null;
                }
                te4.b(new Bi(Ld.SC_FAIL_PERMISSIONS, Ur.MERCHANT_VIEW, Pe.SC, C2454a.b("Denied", arrayList2.toString()), null, null, null, 112));
            }
        }
        finish();
    }
}
