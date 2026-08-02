package defpackage;

import android.graphics.Point;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.b;
import com.adsbynimbus.google.GoogleAuctionData;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.tasks.OnFailureListener;
import com.sofascore.model.firebase.AdType;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w01 implements OnPaidEventListener, OnFailureListener, cu4 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w01(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // defpackage.cu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vvf c(int i, osj osjVar, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        Point point;
        int i6;
        int i7;
        osj osjVar2 = osjVar;
        wt4 wt4Var = (wt4) this.a;
        String str = (String) this.b;
        int[] iArr2 = (int[]) this.c;
        Point point2 = (Point) this.d;
        int i8 = iArr2[i];
        int i9 = point2 != null ? point2.x : wt4Var.e;
        int i10 = point2 != null ? point2.y : wt4Var.f;
        boolean z = wt4Var.h;
        if (i9 == Integer.MAX_VALUE || i10 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < osjVar2.a; i12++) {
                b bVar = osjVar2.d[i12];
                int i13 = bVar.v;
                int i14 = bVar.w;
                if (i13 > 0 && i14 > 0) {
                    if (z) {
                        if ((i13 > i14) != (i9 > i10)) {
                            i5 = i10;
                            i4 = i9;
                            int i15 = i13 * i4;
                            int i16 = i14 * i5;
                            point = i15 < i16 ? new Point(i5, nik.g(i16, i13)) : new Point(nik.g(i15, i14), i4);
                            i6 = bVar.v;
                            i7 = i6 * i14;
                            if (i6 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i7 < i11) {
                                i11 = i7;
                            }
                        }
                    }
                    i4 = i10;
                    i5 = i9;
                    int i152 = i13 * i4;
                    int i162 = i14 * i5;
                    if (i152 < i162) {
                    }
                    i6 = bVar.v;
                    i7 = i6 * i14;
                    if (i6 >= ((int) (point.x * 0.98f))) {
                        i11 = i7;
                    }
                }
            }
            i2 = i11;
        }
        zu9 s = hv9.s();
        int i17 = 0;
        while (i17 < osjVar2.a) {
            b bVar2 = osjVar2.d[i17];
            int i18 = bVar2.v;
            int i19 = (i18 == -1 || (i3 = bVar2.w) == -1) ? -1 : i18 * i3;
            s.c(new gu4(i, osjVar2, i17, wt4Var, iArr[i17], str, i8, i2 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i2)));
            i17++;
            osjVar2 = osjVar;
        }
        return s.g();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2((CredentialProviderPlayServicesImpl) this.a, (CancellationSignal) this.b, (Executor) this.c, (oy3) this.d, exc);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        u11 u11Var = (u11) this.a;
        AdType.Banner banner = (AdType.Banner) this.b;
        AdManagerAdView adManagerAdView = (AdManagerAdView) this.c;
        GoogleAuctionData googleAuctionData = (GoogleAuctionData) this.d;
        adValue.getClass();
        FragmentActivity fragmentActivity = u11Var.b;
        String str = u11Var.C;
        ru ruVar = ru.GOOGLE;
        String adUnitId = adManagerAdView.getAdUnitId();
        adUnitId.getClass();
        nv.m(fragmentActivity, str, banner, ruVar, adUnitId, adValue, null);
        if (googleAuctionData != null) {
            googleAuctionData.onPaidEvent(adValue);
        }
    }
}
