package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.google.android.material.button.MaterialButton;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.media.L4;
import com.inmobi.media.Lo;
import com.ironsource.N9;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView;
import com.sofascore.results.event.overs.view.OverBallsContainerView;
import com.sofascore.results.mma.postMatchVoting.MmaPostMatchVotingMotionViewDetails;
import com.sofascore.results.profile.LoginScreenActivity;
import com.unity3d.ironsourceads.InitListener;
import java.io.ByteArrayInputStream;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class yp8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yp8(String str, wvk wvkVar) {
        this.a = 0;
        this.b = wvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String X;
        TelephonyManager telephonyManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                throw ((wvk) obj);
            case 1:
                ((yz8) obj).m();
                return;
            case 2:
                ((j0l) obj).s();
                return;
            case 3:
                InMobiAudio.a((InMobiAudio) obj);
                return;
            case 4:
                L4.a((L4) obj);
                return;
            case 5:
                LevelPlayNativeAd.a((LevelPlayNativeAd) obj);
                return;
            case 6:
                yda ydaVar = (yda) obj;
                if (ydaVar != null) {
                    ydaVar.e(null);
                    return;
                }
                return;
            case 7:
                geb gebVar = (geb) obj;
                int i2 = geb.q;
                gebVar.l();
                gebVar.t();
                return;
            case 8:
                Lo.a((Lo) obj);
                return;
            case 9:
                int i3 = LoginScreenActivity.M;
                ((LoginScreenActivity) obj).M().d.fullScroll(130);
                return;
            case 10:
                vik.b((ByteArrayInputStream) obj);
                return;
            case 11:
                gmb gmbVar = (gmb) obj;
                Semaphore semaphore = gmbVar.M;
                tg3 tg3Var = gmbVar.o;
                if (tg3Var == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    tg3Var.r(gmbVar.b.a());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
            case 12:
                ((qmb) obj).c();
                return;
            case 13:
                int[] iArr = MaterialButton.N;
                ((MaterialButton) obj).q();
                return;
            case 14:
                ((v9c) obj).n = -1;
                return;
            case 15:
                ((mbc) obj).a();
                return;
            case 16:
                ((lrc) obj).j();
                return;
            case 17:
                ConstraintLayout constraintLayout = (ConstraintLayout) ((eqc) obj).d.b;
                constraintLayout.getClass();
                constraintLayout.setVisibility(0);
                return;
            case 18:
                MmaPostMatchVotingMotionViewDetails mmaPostMatchVotingMotionViewDetails = (MmaPostMatchVotingMotionViewDetails) obj;
                int i4 = MmaPostMatchVotingMotionViewDetails.p;
                mmaPostMatchVotingMotionViewDetails.getBinding().g.setAlpha(1.0f);
                mmaPostMatchVotingMotionViewDetails.getBinding().m.setAlpha(1.0f);
                mmaPostMatchVotingMotionViewDetails.getBinding().h.setAlpha(1.0f);
                mmaPostMatchVotingMotionViewDetails.getBinding().n.setAlpha(1.0f);
                mmaPostMatchVotingMotionViewDetails.getBinding().q.setVisibility(8);
                mmaPostMatchVotingMotionViewDetails.getBinding().r.setVisibility(8);
                mmaPostMatchVotingMotionViewDetails.getBinding().k.setVisibility(8);
                ImageView imageView = mmaPostMatchVotingMotionViewDetails.getBinding().l;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var = (tl3) layoutParams;
                Context context = mmaPostMatchVotingMotionViewDetails.getContext();
                context.getClass();
                ((ViewGroup.MarginLayoutParams) tl3Var).height = ao2.s(8, context);
                imageView.setLayoutParams(tl3Var);
                return;
            case 19:
                ((MoreOfferContainerView) obj).a();
                return;
            case 20:
                N9.a((InitListener) obj);
                return;
            case 21:
                lbd lbdVar = (lbd) obj;
                rn4 rn4Var = (rn4) lbdVar.a.get();
                if (rn4Var != null) {
                    int f = lbdVar.c.f();
                    tn4 tn4Var = rn4Var.a;
                    synchronized (tn4Var) {
                        int i5 = tn4Var.n;
                        if (i5 == 0 || tn4Var.e) {
                            if (i5 != f || tn4Var.o == null) {
                                tn4Var.n = f;
                                if (f != 1 && f != 0 && f != 8) {
                                    if (tn4Var.o == null) {
                                        Context context2 = tn4Var.a;
                                        String str = nik.a;
                                        if (context2 != null && (telephonyManager = (TelephonyManager) context2.getSystemService("phone")) != null) {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                                X = rz8.X(networkCountryIso);
                                                tn4Var.o = X;
                                            }
                                        }
                                        X = rz8.X(Locale.getDefault().getCountry());
                                        tn4Var.o = X;
                                    }
                                    tn4Var.l = tn4Var.a(f);
                                    tn4Var.d.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    tn4Var.b(tn4Var.g > 0 ? (int) (elapsedRealtime - tn4Var.h) : 0, tn4Var.i, tn4Var.l);
                                    tn4Var.h = elapsedRealtime;
                                    tn4Var.i = 0L;
                                    tn4Var.k = 0L;
                                    tn4Var.j = 0L;
                                    flh flhVar = tn4Var.f;
                                    flhVar.b.clear();
                                    flhVar.c = -1;
                                    flhVar.d = 0;
                                    flhVar.e = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 22:
                ((ncd) obj).a();
                return;
            case 23:
                OverBallsContainerView.setupContainerParams$lambda$0((OverBallsContainerView) obj);
                return;
            case 24:
                p03 p03Var = (p03) obj;
                p03Var.getClass();
                Context context3 = (Context) p03Var.b;
                if (context3 == null) {
                    Intrinsics.i("context");
                    throw null;
                }
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context3.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                SharedPreferences.Editor i6 = dmi.i(sharedPreferences, "PREF_SWIPE_ANIMATION_SHOWN", true);
                Unit unit = Unit.a;
                i6.apply();
                return;
            case 25:
                ((fge) obj).y();
                return;
            case 26:
                ((qke) obj).m--;
                return;
            case 27:
                ((one) obj).s();
                return;
            case 28:
                ((PlayerView) obj).invalidate();
                return;
            default:
                ((HorizontalScrollView) ((pye) obj).d.k).fullScroll(66);
                return;
        }
    }

    public /* synthetic */ yp8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
