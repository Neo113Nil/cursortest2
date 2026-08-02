package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fxe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerTransfersActivity b;

    public /* synthetic */ fxe(PlayerTransfersActivity playerTransfersActivity, int i) {
        this.a = i;
        this.b = playerTransfersActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        int i = this.a;
        PlayerTransfersActivity playerTransfersActivity = this.b;
        switch (i) {
            case 0:
                int i2 = PlayerTransfersActivity.R;
                View inflate = playerTransfersActivity.getLayoutInflater().inflate(R.layout.activity_transfers, (ViewGroup) null, false);
                int i3 = R.id.ad_banner_view;
                AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate);
                if (adBannerView != null) {
                    i3 = R.id.no_internet_view;
                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate);
                    if (viewStub != null) {
                        i3 = R.id.recycler_infinite;
                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_infinite, inflate);
                        if (recyclerView != null) {
                            i3 = R.id.toolbar;
                            View B = nq8.B(R.id.toolbar, inflate);
                            if (B != null) {
                                z3f.b(B);
                                return new ye((LinearLayout) inflate, adBannerView, viewStub, recyclerView);
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 1:
                int i4 = PlayerTransfersActivity.R;
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = playerTransfersActivity.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                pvj pvjVar = pvj.b;
                String string2 = sharedPreferences.getString("PREF_SORT_TYPE", "-transferDate");
                string2.getClass();
                pvj pvjVar2 = pvj.c;
                if (StringsKt.J(string2, "transferFee", false)) {
                    return new ovj(c.v(string2, "-", false), pvjVar2);
                }
                return StringsKt.J(string2, "userCount", false) ? new ovj(c.v(string2, "-", false), pvj.b) : new ovj(c.v(string2, "-", false), pvj.d);
            case 2:
                int i5 = PlayerTransfersActivity.R;
                kp5<pvj> kp5Var = pvj.f;
                ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
                for (pvj pvjVar3 : kp5Var) {
                    String name = pvjVar3.name();
                    int ordinal = pvjVar3.ordinal();
                    if (ordinal == 0) {
                        string = playerTransfersActivity.getString(R.string.player_followers);
                    } else if (ordinal == 1) {
                        string = playerTransfersActivity.getString(R.string.transfer_fee);
                    } else {
                        if (ordinal != 2) {
                            zzl.b();
                            return null;
                        }
                        string = playerTransfersActivity.getString(R.string.date);
                    }
                    string.getClass();
                    arrayList.add(new vt2(name, string, false, null, Intrinsics.c(pvjVar3.name(), ((ovj) playerTransfersActivity.K.getValue()).b.name()) ? new tc3(114113725, new g31(playerTransfersActivity, 5), true) : null, null, null, 236));
                }
                return arrayList;
            case 3:
                int i6 = PlayerTransfersActivity.R;
                return new rvj(playerTransfersActivity, false);
            case 4:
                int i7 = PlayerTransfersActivity.R;
                return new dvj(playerTransfersActivity, new kr9(playerTransfersActivity, 20));
            case 5:
                int i8 = PlayerTransfersActivity.R;
                TypeHeaderView typeHeaderView = new TypeHeaderView(playerTransfersActivity, null, 6);
                g5k g5kVar = new g5k(typeHeaderView);
                List list = (List) playerTransfersActivity.L.getValue();
                list.getClass();
                g5kVar.b = list;
                g5kVar.c = ((ovj) playerTransfersActivity.K.getValue()).b.name();
                g5kVar.l = true;
                g5kVar.m = new ur1(playerTransfersActivity, 18);
                g5kVar.b();
                return typeHeaderView;
            case 6:
                int i9 = PlayerTransfersActivity.R;
                View inflate2 = playerTransfersActivity.getLayoutInflater().inflate(R.layout.footer_row_loading, (ViewGroup) playerTransfersActivity.N().d, false);
                if (((CircularProgressIndicator) nq8.B(R.id.expand_progress, inflate2)) != null) {
                    return new am8((LinearLayout) inflate2);
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.expand_progress)));
                return null;
            case 7:
                int i10 = PlayerTransfersActivity.R;
                View inflate3 = playerTransfersActivity.getLayoutInflater().inflate(R.layout.no_transfers_view, (ViewGroup) playerTransfersActivity.N().d, false);
                if (inflate3 != null) {
                    return new jdd((GraphicLarge) inflate3);
                }
                yhk.s("rootView");
                return null;
            default:
                int i11 = PlayerTransfersActivity.R;
                ((jdd) playerTransfersActivity.Q.getValue()).a.setVisibility(8);
                ((am8) playerTransfersActivity.P.getValue()).a.setVisibility(0);
                return Unit.a;
        }
    }
}
