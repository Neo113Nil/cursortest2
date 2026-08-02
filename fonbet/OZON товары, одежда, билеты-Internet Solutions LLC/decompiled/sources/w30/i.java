package w30;

import Ae.O0;
import Ae.x0;
import B90.C2618u;
import L1.E;
import Ve.Gp;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.telephony.TelephonyManager$CellInfoCallback;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f103510a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final v30.b f103511b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f103512c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f103513d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<a> f103514e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f103515a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<b> f103516b;

        public a(long j11, @NotNull List<b> cellData) {
            Intrinsics.checkNotNullParameter(cellData, "cellData");
            this.f103515a = j11;
            this.f103516b = cellData;
        }

        @NotNull
        public final List<b> a() {
            return this.f103516b;
        }

        public final long b() {
            return this.f103515a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f103515a == aVar.f103515a && Intrinsics.d(this.f103516b, aVar.f103516b);
        }

        public final int hashCode() {
            return this.f103516b.hashCode() + (Long.hashCode(this.f103515a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActualCellsInfo(timestamp=");
            sb2.append(this.f103515a);
            sb2.append(", cellData=");
            return C2618u.h(sb2, this.f103516b, ")");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f103517a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f103518b;

        /* renamed from: c, reason: collision with root package name */
        private final String f103519c;

        /* renamed from: d, reason: collision with root package name */
        private final String f103520d;

        /* renamed from: e, reason: collision with root package name */
        private final Integer f103521e;

        /* renamed from: f, reason: collision with root package name */
        private final Integer f103522f;

        /* renamed from: g, reason: collision with root package name */
        private final String f103523g;

        /* renamed from: h, reason: collision with root package name */
        private final Integer f103524h;

        /* renamed from: i, reason: collision with root package name */
        private final long f103525i;

        public b(String type, Integer num, String str, String str2, Integer num2, Integer num3, String str3, Integer num4, long j11, int i11) {
            str2 = (i11 & 8) != 0 ? null : str2;
            num2 = (i11 & 16) != 0 ? null : num2;
            num3 = (i11 & 32) != 0 ? null : num3;
            str3 = (i11 & 64) != 0 ? null : str3;
            num4 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num4;
            Intrinsics.checkNotNullParameter(type, "type");
            this.f103517a = type;
            this.f103518b = num;
            this.f103519c = str;
            this.f103520d = str2;
            this.f103521e = num2;
            this.f103522f = num3;
            this.f103523g = str3;
            this.f103524h = num4;
            this.f103525i = j11;
        }

        public final Integer a() {
            return this.f103518b;
        }

        public final String b() {
            return this.f103523g;
        }

        public final Integer c() {
            return this.f103521e;
        }

        public final Integer d() {
            return this.f103522f;
        }

        public final String e() {
            return this.f103519c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f103517a, bVar.f103517a) && Intrinsics.d(this.f103518b, bVar.f103518b) && Intrinsics.d(this.f103519c, bVar.f103519c) && Intrinsics.d(this.f103520d, bVar.f103520d) && Intrinsics.d(this.f103521e, bVar.f103521e) && Intrinsics.d(this.f103522f, bVar.f103522f) && Intrinsics.d(this.f103523g, bVar.f103523g) && Intrinsics.d(this.f103524h, bVar.f103524h) && this.f103525i == bVar.f103525i;
        }

        public final Integer f() {
            return this.f103524h;
        }

        public final String g() {
            return this.f103520d;
        }

        public final long h() {
            return this.f103525i;
        }

        public final int hashCode() {
            int hashCode = this.f103517a.hashCode() * 31;
            Integer num = this.f103518b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f103519c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f103520d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.f103521e;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f103522f;
            int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str3 = this.f103523g;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num4 = this.f103524h;
            return Long.hashCode(this.f103525i) + ((hashCode7 + (num4 != null ? num4.hashCode() : 0)) * 31);
        }

        @NotNull
        public final String i() {
            return this.f103517a;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CellData(type=");
            sb2.append(this.f103517a);
            sb2.append(", baseId=");
            sb2.append(this.f103518b);
            sb2.append(", networkId=");
            sb2.append(this.f103519c);
            sb2.append(", tac=");
            sb2.append(this.f103520d);
            sb2.append(", lat=");
            sb2.append(this.f103521e);
            sb2.append(", lon=");
            sb2.append(this.f103522f);
            sb2.append(", lac=");
            sb2.append(this.f103523g);
            sb2.append(", pci=");
            sb2.append(this.f103524h);
            sb2.append(", ts=");
            return P4.f.a(this.f103525i, ")", sb2);
        }
    }

    public static final class c extends TelephonyManager$CellInfoCallback {
        c() {
        }

        public final void onCellInfo(List<CellInfo> cellInfo) {
            List<CellInfo> allCellInfo;
            Intrinsics.checkNotNullParameter(cellInfo, "cellInfo");
            try {
                i.d(i.this, cellInfo);
                TelephonyManager c11 = i.c(i.this);
                if (c11 == null || (allCellInfo = c11.getAllCellInfo()) == null) {
                    return;
                }
                i.d(i.this, allCellInfo);
            } catch (Error e11) {
                L80.a.c("CellInfoProvider", "TelephonyManager.CellInfoCallback", e11);
            } catch (Exception e12) {
                L80.a.c("CellInfoProvider", "TelephonyManager.CellInfoCallback", e12);
            }
        }
    }

    public i(@NotNull Context context, @NotNull v30.b checkPermissions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(checkPermissions, "checkPermissions");
        this.f103510a = context;
        this.f103511b = checkPermissions;
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f103512c = Sc.k.a(nVar, new C90.a(this, 2));
        this.f103513d = Sc.k.a(nVar, new g());
        this.f103514e = O0.a(null);
    }

    public static TelephonyManager a(i iVar) {
        try {
            Object systemService = iVar.f103510a.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                return (TelephonyManager) systemService;
            }
            return null;
        } catch (Exception unused) {
            L80.a.a("CellInfoProvider", "Error while get TelephonyManager");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b b(i iVar, int i11, CellInfo cell) {
        b bVar;
        String mccString;
        String mncString;
        long timestampMillis;
        long timestampMillis2;
        String mccString2;
        String mncString2;
        long timestampMillis3;
        String mccString3;
        String mncString3;
        long timestampMillis4;
        CellIdentityTdscdma cellIdentity;
        int cid;
        String mccString4;
        String mncString4;
        int lac;
        long timestampMillis5;
        long timestampMillis6;
        Intrinsics.checkNotNullParameter(cell, "cell");
        iVar.getClass();
        if (i11 >= 29) {
            if (iV.a.c(cell)) {
                timestampMillis6 = androidx.core.content.pm.c.a(cell).getTimestampMillis();
                bVar = new b("5G", null, null, null, null, null, null, null, timestampMillis6, 248);
            } else if (U30.b.c(cell)) {
                cellIdentity = E.b(cell).getCellIdentity();
                Intrinsics.checkNotNullExpressionValue(cellIdentity, "getCellIdentity(...)");
                cid = cellIdentity.getCid();
                Integer g10 = g(cid);
                mccString4 = cellIdentity.getMccString();
                mncString4 = cellIdentity.getMncString();
                String c11 = G.g.c(mccString4, "-", mncString4);
                lac = cellIdentity.getLac();
                String valueOf = lac == Integer.MAX_VALUE ? null : String.valueOf(lac);
                timestampMillis5 = E.b(cell).getTimestampMillis();
                bVar = new b("TDSCDMA", g10, c11, null, null, null, valueOf, null, timestampMillis5, 184);
            }
            if (!(cell instanceof CellInfoGsm)) {
                CellInfoGsm cellInfoGsm = (CellInfoGsm) cell;
                CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                Intrinsics.checkNotNullExpressionValue(cellIdentity2, "getCellIdentity(...)");
                mccString3 = cellIdentity2.getMccString();
                mncString3 = cellIdentity2.getMncString();
                String c12 = G.g.c(mccString3, "-", mncString3);
                Integer g11 = g(cellIdentity2.getCid());
                int lac2 = cellIdentity2.getLac();
                String valueOf2 = lac2 != Integer.MAX_VALUE ? String.valueOf(lac2) : null;
                timestampMillis4 = cellInfoGsm.getTimestampMillis();
                return new b("GSM", g11, c12, null, null, null, valueOf2, null, timestampMillis4, 184);
            }
            if (cell instanceof CellInfoLte) {
                CellInfoLte cellInfoLte = (CellInfoLte) cell;
                CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                Intrinsics.checkNotNullExpressionValue(cellIdentity3, "getCellIdentity(...)");
                mccString2 = cellIdentity3.getMccString();
                mncString2 = cellIdentity3.getMncString();
                String c13 = G.g.c(mccString2, "-", mncString2);
                Integer g12 = g(cellIdentity3.getCi());
                int tac = cellIdentity3.getTac();
                String valueOf3 = tac != Integer.MAX_VALUE ? String.valueOf(tac) : null;
                Integer g13 = g(cellIdentity3.getPci());
                timestampMillis3 = cellInfoLte.getTimestampMillis();
                return new b("LTE", g12, c13, valueOf3, null, null, null, g13, timestampMillis3, 112);
            }
            if (cell instanceof CellInfoCdma) {
                CellInfoCdma cellInfoCdma = (CellInfoCdma) cell;
                CellIdentityCdma cellIdentity4 = cellInfoCdma.getCellIdentity();
                Intrinsics.checkNotNullExpressionValue(cellIdentity4, "getCellIdentity(...)");
                int networkId = cellIdentity4.getNetworkId();
                String valueOf4 = networkId != Integer.MAX_VALUE ? String.valueOf(networkId) : null;
                Integer g14 = g(cellIdentity4.getBasestationId());
                Integer g15 = g(cellIdentity4.getLatitude());
                Integer g16 = g(cellIdentity4.getLongitude());
                timestampMillis2 = cellInfoCdma.getTimestampMillis();
                return new b("CDMA", g14, valueOf4, null, g15, g16, null, null, timestampMillis2, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
            }
            if (cell instanceof CellInfoWcdma) {
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cell;
                CellIdentityWcdma cellIdentity5 = cellInfoWcdma.getCellIdentity();
                Intrinsics.checkNotNullExpressionValue(cellIdentity5, "getCellIdentity(...)");
                Integer g17 = g(cellIdentity5.getCid());
                mccString = cellIdentity5.getMccString();
                mncString = cellIdentity5.getMncString();
                String c14 = G.g.c(mccString, "-", mncString);
                int lac3 = cellIdentity5.getLac();
                String valueOf5 = lac3 != Integer.MAX_VALUE ? String.valueOf(lac3) : null;
                timestampMillis = cellInfoWcdma.getTimestampMillis();
                bVar = new b("WCDMA", g17, c14, null, null, null, valueOf5, null, timestampMillis, 184);
            }
            return bVar;
        }
        bVar = null;
        if (!(cell instanceof CellInfoGsm)) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final TelephonyManager c(i iVar) {
        return (TelephonyManager) iVar.f103512c.getValue();
    }

    public static final void d(final i iVar, List list) {
        a aVar;
        iVar.getClass();
        final int i11 = Build.VERSION.SDK_INT;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((CellInfo) obj).isRegistered()) {
                arrayList.add(obj);
            }
        }
        List C11 = kotlin.sequences.l.C(kotlin.sequences.l.w(kotlin.sequences.l.B(C7714v.w(C7714v.I0(new Gp(1), arrayList)), 2), new Function1() { // from class: w30.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return i.b(i.this, i11, (CellInfo) obj2);
            }
        }));
        x0<a> x0Var = iVar.f103514e;
        if (C11.isEmpty()) {
            aVar = null;
        } else {
            long h11 = ((b) C7714v.K(C11)).h();
            aVar = x0Var.getValue();
            if (aVar == null || aVar.b() <= h11) {
                aVar = new a(h11, C11);
                L80.a.a("CellInfoProvider", "apply to cellsDataState.value new value: " + aVar);
            }
        }
        x0Var.setValue(aVar);
    }

    private static Integer g(int i11) {
        if (i11 == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i11);
    }

    @NotNull
    public final x0<a> e() {
        return this.f103514e;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [Sc.j, java.lang.Object] */
    @SuppressLint({"MissingPermission"})
    public final void f(@NotNull androidx.fragment.app.r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.f103511b.a(activity) || Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.f103512c.getValue();
            if (telephonyManager != null) {
                telephonyManager.requestCellInfoUpdate((ExecutorService) this.f103513d.getValue(), new c());
            }
        } catch (Exception e11) {
            L80.a.c("CellInfoProvider", "TelephonyManager.requestCellInfoUpdate", e11);
        }
    }
}
