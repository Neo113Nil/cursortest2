package k5;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.telephony.TelephonyManager$CellInfoCallback;
import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: k5.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7582x extends C7490I {

    /* renamed from: e, reason: collision with root package name */
    private final Q2 f70876e;

    /* renamed from: k5.x$a */
    final class a extends TelephonyManager$CellInfoCallback {
        a() {
        }

        public final void onCellInfo(@NonNull List<CellInfo> list) {
        }
    }

    C7582x(@NonNull Context context, int i11, @NonNull Gc.g gVar, @NonNull M1 m12) {
        super(context, i11, gVar, m12);
        this.f70876e = new Q2();
    }

    @Override // k5.C7490I
    @NonNull
    protected final List<CellInfo> c(@NonNull TelephonyManager telephonyManager) {
        telephonyManager.requestCellInfoUpdate(this.f70876e, new a());
        return super.c(telephonyManager);
    }
}
