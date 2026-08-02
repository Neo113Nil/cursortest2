package k5;

import L1.C3546j;
import android.os.Build;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: k5.z2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7593z2 implements InterfaceC7496b0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f70896a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70897b;

    /* renamed from: c, reason: collision with root package name */
    private final int f70898c;

    /* renamed from: d, reason: collision with root package name */
    private final String f70899d;

    /* renamed from: e, reason: collision with root package name */
    private final String f70900e;

    /* renamed from: f, reason: collision with root package name */
    private final long f70901f;

    /* renamed from: g, reason: collision with root package name */
    private final L0 f70902g;

    /* renamed from: h, reason: collision with root package name */
    private final int f70903h;

    /* renamed from: i, reason: collision with root package name */
    private final int f70904i;

    private C7593z2(@NonNull String str, long j11, int i11, String str2, String str3, long j12, @NonNull L0 l02, int i12, int i13) {
        this.f70896a = str;
        this.f70897b = j11;
        this.f70898c = i11;
        this.f70899d = str2;
        this.f70900e = str3;
        this.f70901f = j12;
        this.f70902g = l02;
        this.f70903h = i12;
        this.f70904i = i13;
    }

    private static int a(int i11) {
        if (i11 < -150 || i11 > -1) {
            return 0;
        }
        return i11;
    }

    static InterfaceC7496b0 b(@NonNull CellInfo cellInfo, long j11, long j12) {
        CellIdentityTdscdma cellIdentity;
        int cid;
        int lac;
        int i11;
        CellSignalStrengthTdscdma cellSignalStrength;
        String mccString;
        String mncString;
        CellIdentity cellIdentity2;
        long nci;
        int tac;
        CellSignalStrength cellSignalStrength2;
        String mccString2;
        String mncString2;
        String valueOf;
        String valueOf2;
        String mncString3;
        String valueOf3;
        String valueOf4;
        String mncString4;
        String valueOf5;
        String valueOf6;
        String mncString5;
        int cellConnectionStatus;
        long millis = j12 - (j11 - TimeUnit.NANOSECONDS.toMillis(cellInfo.getTimeStamp()));
        L0 l02 = L0.f16default;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            cellConnectionStatus = cellInfo.getCellConnectionStatus();
            if (cellConnectionStatus == 1) {
                l02 = L0.f19transient;
            } else if (cellConnectionStatus == 2) {
                l02 = L0.f18final;
            } else if (cellInfo.isRegistered()) {
                l02 = L0.f19transient;
            }
        } else if (cellInfo.isRegistered()) {
            l02 = L0.f19transient;
        }
        L0 l03 = l02;
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity3 = cellInfoGsm.getCellIdentity();
            Objects.requireNonNull(cellIdentity3);
            int cid2 = cellIdentity3.getCid();
            int i13 = cid2 != Integer.MAX_VALUE ? cid2 & 65535 : -1;
            int lac2 = cellIdentity3.getLac();
            i11 = lac2 != Integer.MAX_VALUE ? lac2 & 65535 : -1;
            if (i12 >= 28) {
                valueOf5 = cellIdentity3.getMccString();
                mncString5 = cellIdentity3.getMncString();
                valueOf6 = mncString5;
            } else {
                int mcc = cellIdentity3.getMcc();
                valueOf5 = mcc != Integer.MAX_VALUE ? String.valueOf(Integer.valueOf(mcc)) : null;
                int mnc = cellIdentity3.getMnc();
                valueOf6 = mnc != Integer.MAX_VALUE ? String.valueOf(Integer.valueOf(mnc)) : null;
            }
            CellSignalStrengthGsm cellSignalStrength3 = cellInfoGsm.getCellSignalStrength();
            return new C7593z2("GSM", i13, i11, valueOf5, valueOf6, millis, l03, cellSignalStrength3.getLevel(), a(cellSignalStrength3.getDbm()));
        }
        if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
            Objects.requireNonNull(cellIdentity4);
            int ci = cellIdentity4.getCi();
            int i14 = ci != Integer.MAX_VALUE ? 268435455 & ci : -1;
            int tac2 = cellIdentity4.getTac();
            i11 = tac2 != Integer.MAX_VALUE ? tac2 & 65535 : -1;
            if (i12 >= 28) {
                valueOf3 = cellIdentity4.getMccString();
                mncString4 = cellIdentity4.getMncString();
                valueOf4 = mncString4;
            } else {
                int mcc2 = cellIdentity4.getMcc();
                valueOf3 = mcc2 != Integer.MAX_VALUE ? String.valueOf(Integer.valueOf(mcc2)) : null;
                int mnc2 = cellIdentity4.getMnc();
                valueOf4 = mnc2 != Integer.MAX_VALUE ? String.valueOf(Integer.valueOf(mnc2)) : null;
            }
            CellSignalStrengthLte cellSignalStrength4 = cellInfoLte.getCellSignalStrength();
            return new C7593z2("LTE", i14, i11, valueOf3, valueOf4, millis, l03, cellSignalStrength4.getLevel(), a(cellSignalStrength4.getDbm()));
        }
        if (cellInfo instanceof CellInfoCdma) {
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            CellIdentityCdma cellIdentity5 = cellInfoCdma.getCellIdentity();
            Objects.requireNonNull(cellIdentity5);
            int basestationId = cellIdentity5.getBasestationId();
            int i15 = basestationId != Integer.MAX_VALUE ? basestationId & 65535 : -1;
            int networkId = cellIdentity5.getNetworkId();
            i11 = networkId != Integer.MAX_VALUE ? networkId & 65535 : -1;
            int systemId = cellIdentity5.getSystemId();
            String valueOf7 = systemId != Integer.MAX_VALUE ? String.valueOf(Integer.valueOf(systemId)) : null;
            CellSignalStrengthCdma cellSignalStrength5 = cellInfoCdma.getCellSignalStrength();
            return new C7593z2("CDMA", i15, i11, valueOf7, null, millis, l03, cellSignalStrength5.getLevel(), a(cellSignalStrength5.getDbm()));
        }
        if (cellInfo instanceof CellInfoWcdma) {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            CellIdentityWcdma cellIdentity6 = cellInfoWcdma.getCellIdentity();
            Objects.requireNonNull(cellIdentity6);
            int cid3 = cellIdentity6.getCid();
            int i16 = cid3 != Integer.MAX_VALUE ? 268435455 & cid3 : -1;
            int lac3 = cellIdentity6.getLac();
            i11 = lac3 != Integer.MAX_VALUE ? lac3 & 65535 : -1;
            if (i12 >= 28) {
                valueOf = cellIdentity6.getMccString();
                mncString3 = cellIdentity6.getMncString();
                valueOf2 = mncString3;
            } else {
                int mcc3 = cellIdentity6.getMcc();
                valueOf = mcc3 != Integer.MAX_VALUE ? String.valueOf(Integer.valueOf(mcc3)) : null;
                int mnc3 = cellIdentity6.getMnc();
                valueOf2 = mnc3 != Integer.MAX_VALUE ? String.valueOf(Integer.valueOf(mnc3)) : null;
            }
            CellSignalStrengthWcdma cellSignalStrength6 = cellInfoWcdma.getCellSignalStrength();
            return new C7593z2("UMTS", i16, i11, valueOf, valueOf2, millis, l03, cellSignalStrength6.getLevel(), a(cellSignalStrength6.getDbm()));
        }
        if (i12 >= 29) {
            if (iV.a.c(cellInfo)) {
                CellInfoNr a11 = androidx.core.content.pm.c.a(cellInfo);
                cellIdentity2 = a11.getCellIdentity();
                CellIdentityNr b11 = C3546j.b(cellIdentity2);
                Objects.requireNonNull(b11);
                nci = b11.getNci();
                long j13 = nci != Long.MAX_VALUE ? nci & 68719476735L : -1L;
                tac = b11.getTac();
                i11 = tac != Integer.MAX_VALUE ? tac & 16777215 : -1;
                cellSignalStrength2 = a11.getCellSignalStrength();
                mccString2 = b11.getMccString();
                mncString2 = b11.getMncString();
                return new C7593z2("NR", j13, i11, mccString2, mncString2, millis, l03, cellSignalStrength2.getLevel(), a(cellSignalStrength2.getDbm()));
            }
            if (U30.b.c(cellInfo)) {
                CellInfoTdscdma b12 = L1.E.b(cellInfo);
                cellIdentity = b12.getCellIdentity();
                Objects.requireNonNull(cellIdentity);
                cid = cellIdentity.getCid();
                int i17 = cid != Integer.MAX_VALUE ? cid & 268435455 : -1;
                lac = cellIdentity.getLac();
                i11 = lac != Integer.MAX_VALUE ? lac & 65535 : -1;
                cellSignalStrength = b12.getCellSignalStrength();
                mccString = cellIdentity.getMccString();
                mncString = cellIdentity.getMncString();
                return new C7593z2("TD-SCDMA", i17, i11, mccString, mncString, millis, l03, cellSignalStrength.getLevel(), a(cellSignalStrength.getDbm()));
            }
        }
        return null;
    }

    @Override // k5.InterfaceC7496b0
    @NonNull
    public final String c() {
        return this.f70896a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7593z2.class == obj.getClass()) {
            C7593z2 c7593z2 = (C7593z2) obj;
            if (this.f70897b == c7593z2.f70897b && this.f70898c == c7593z2.f70898c && this.f70896a.equals(c7593z2.f70896a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f70896a, Long.valueOf(this.f70897b), Integer.valueOf(this.f70898c));
    }

    @Override // k5.InterfaceC7496b0
    public final int k() {
        return this.f70903h;
    }

    @Override // k5.InterfaceC7496b0
    public final long o() {
        return this.f70897b;
    }

    @Override // k5.InterfaceC7496b0
    public final int q() {
        return this.f70904i;
    }

    @Override // k5.InterfaceC7496b0
    public final String r() {
        return this.f70899d;
    }

    @Override // k5.InterfaceC7496b0
    public final long t() {
        return this.f70901f;
    }

    @Override // k5.InterfaceC7496b0
    @NonNull
    public final L0 w() {
        return this.f70902g;
    }

    @Override // k5.InterfaceC7496b0
    public final int x() {
        return this.f70898c;
    }

    @Override // k5.InterfaceC7496b0
    public final String z() {
        return this.f70900e;
    }
}
