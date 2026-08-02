package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.autofill.AutofillManager;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.n;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.nativead.NativeVideoListener;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cqa implements oyb, w0c, o25, fb9, PAGRewardedAdInteractionListener, lrk, y78, hni, tec, yhi, qmk, sa, NativeVideoListener {
    public Object a;

    public cqa(int i) {
        switch (i) {
            case 1:
                this.a = new HashSet();
                break;
            case 4:
                this.a = new Bundle();
                break;
            case 6:
                this.a = new ltc(500L);
                break;
            case 15:
                this.a = new LinkedHashSet();
                break;
            case 25:
                this.a = new anf(4);
                break;
            default:
                this.a = new i1d(new bqa[16], 0);
                break;
        }
    }

    @Override // defpackage.lrk
    public int A(View view) {
        return ((n) this.a).getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((hrf) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.o25
    public float B() {
        return -((NestedScrollView) this.a).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.o25
    public void C() {
        ((NestedScrollView) this.a).d.abortAnimation();
    }

    public InputStream D() {
        InputStream inputStream = (InputStream) this.a;
        this.a = null;
        return inputStream;
    }

    public void E(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            u90.a(view, (AutofillManager) this.a, i, z);
        }
    }

    public void F(String str, String str2) {
        dh0 dh0Var = MediaMetadataCompat.d;
        if (!dh0Var.containsKey(str) || ((Integer) dh0Var.get(str)).intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, str2);
        } else {
            a70.p(lnb.o("The ", str, " key cannot be used to put a String"));
        }
    }

    public Type G(Type type) {
        type.getClass();
        if (type instanceof TypeVariable) {
            anf anfVar = (anf) this.a;
            TypeVariable typeVariable = (TypeVariable) type;
            return anfVar.e(typeVariable, new p5k(typeVariable, anfVar));
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return z6k.b(G(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(H(wildcardType.getLowerBounds()), H(wildcardType.getUpperBounds()), 2);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type ownerType = parameterizedType.getOwnerType();
        Type G = ownerType == null ? null : G(ownerType);
        Type G2 = G(parameterizedType.getRawType());
        Type[] H = H(parameterizedType.getActualTypeArguments());
        Class cls = (Class) G2;
        uea ueaVar = z6k.a;
        if (G == null) {
            return new b(n6k.a.a(cls), cls, H, 2);
        }
        z1a.q(cls, "Owner type for unenclosed %s", cls.getEnclosingClass() != null);
        return new b(G, cls, H, 2);
    }

    public Type[] H(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = G(typeArr[i]);
        }
        return typeArr2;
    }

    @Override // defpackage.w0c
    public void a(k55 k55Var) {
        r55.e((o0c) this.a, k55Var);
    }

    @Override // defpackage.qmk, defpackage.nmk
    public boolean b() {
        return false;
    }

    @Override // defpackage.yhi
    public Set c() {
        return ((zhi) wba.s((v8e) this.a)).c();
    }

    @Override // defpackage.nmk
    public long d(j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return ((ujg) this.a).d(j80Var, j80Var2, j80Var3);
    }

    @Override // defpackage.lrk
    public int e(View view) {
        return ((n) this.a).getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((hrf) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.lrk
    public int f() {
        return ((n) this.a).getPaddingTop();
    }

    @Override // defpackage.fb9
    public void g(vvk vvkVar) {
        dad dadVar = ((x4e) this.a).f;
        dadVar.getClass();
        g7h g7hVar = (g7h) dadVar.b;
        tvk tvkVar = vvkVar instanceof tvk ? (tvk) vvkVar : null;
        hl7 hl7Var = new hl7(vvkVar, 23);
        synchronized (((v9f) g7hVar.e)) {
            if (tvkVar != null) {
                try {
                    g7hVar.d = tvkVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hl7Var.invoke((eb9) g7hVar.b, (eb9) g7hVar.c);
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.hni
    public String h() {
        return ((kni) this.a).b;
    }

    @Override // defpackage.hni
    public void i(gni gniVar) {
        kni kniVar = (kni) this.a;
        int length = kniVar.d.length;
        for (int i = 1; i < length; i++) {
            int i2 = kniVar.d[i];
            if (i2 == 1) {
                gniVar.q(i, kniVar.e[i]);
            } else if (i2 == 2) {
                gniVar.J0(kniVar.f[i], i);
            } else if (i2 == 3) {
                String str = kniVar.g[i];
                str.getClass();
                gniVar.m0(i, str);
            } else if (i2 == 4) {
                byte[] bArr = kniVar.h[i];
                bArr.getClass();
                gniVar.r(i, bArr);
            } else if (i2 == 5) {
                gniVar.s(i);
            }
        }
    }

    @Override // defpackage.tec
    public void j(vec vecVar) {
        fkj fkjVar = (fkj) this.a;
        boolean o = fkjVar.m.a.o();
        Window.Callback callback = fkjVar.n;
        if (o) {
            callback.onPanelClosed(108, vecVar);
        } else if (callback.onPreparePanel(0, null, vecVar)) {
            callback.onMenuOpened(108, vecVar);
        }
    }

    @Override // defpackage.y78
    public float k(float f, float f2, long j) {
        long j2 = j / 1000000;
        q78 a = ((qh0) this.a).a(f2);
        long j3 = a.c;
        return (Math.signum(a.a) * a.b * t00.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // defpackage.sa
    public boolean n(View view) {
        ujg ujgVar = (ujg) this.a;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) ujgVar.e;
        if (viewPager2.r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.nmk
    public j80 o(j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return ((ujg) this.a).o(j80Var, j80Var2, j80Var3);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationRewardedAdCallback mediationRewardedAdCallback = ((a8e) this.a).d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        MediationRewardedAdCallback mediationRewardedAdCallback = ((a8e) this.a).d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        a8e a8eVar = (a8e) this.a;
        MediationRewardedAdCallback mediationRewardedAdCallback = a8eVar.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            a8eVar.d.reportAdImpression();
        }
    }

    @Override // defpackage.w0c
    public void onComplete() {
        ((o0c) this.a).a.onComplete();
    }

    @Override // defpackage.w0c
    public void onError(Throwable th) {
        ((o0c) this.a).a.onError(th);
    }

    @Override // defpackage.w0c
    public void onSuccess(Object obj) {
        ((o0c) this.a).a.onSuccess(obj);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        MediationRewardedAdCallback mediationRewardedAdCallback = ((a8e) this.a).d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onUserEarnedReward();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public void onUserEarnedRewardFail(int i, String str) {
        jaa.A(i, "Failed to reward user: " + str).toString();
    }

    @Override // com.vungle.ads.nativead.NativeVideoListener
    public void onVideoEnd() {
        ((xyk) this.a).t.onVideoComplete();
    }

    @Override // com.vungle.ads.nativead.NativeVideoListener
    public void onVideoMute() {
        ((xyk) this.a).t.onVideoMute();
    }

    @Override // com.vungle.ads.nativead.NativeVideoListener
    public void onVideoPause() {
        ((xyk) this.a).t.onVideoPause();
    }

    @Override // com.vungle.ads.nativead.NativeVideoListener
    public void onVideoPlay() {
        ((xyk) this.a).t.onVideoPlay();
    }

    @Override // com.vungle.ads.nativead.NativeVideoListener
    public void onVideoUnmute() {
        ((xyk) this.a).t.onVideoUnmute();
    }

    @Override // defpackage.tec
    public boolean p(vec vecVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.y78
    public float q() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.yhi
    public void r(String str, List list) {
        str.getClass();
        list.getClass();
        v8e v8eVar = (v8e) this.a;
        String e = xz2.e(str, false);
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(xz2.e(str2, true));
        }
        v8eVar.r(e, arrayList);
    }

    @Override // defpackage.lrk
    public int s() {
        n nVar = (n) this.a;
        return nVar.getHeight() - nVar.getPaddingBottom();
    }

    @Override // defpackage.y78
    public long t(float f) {
        return ((long) (Math.exp(((qh0) this.a).b(f) / (r78.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.nmk
    public j80 u(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return ((ujg) this.a).u(j, j80Var, j80Var2, j80Var3);
    }

    @Override // defpackage.o25
    public boolean v(float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        C();
        ((NestedScrollView) this.a).k((int) f);
        return true;
    }

    @Override // defpackage.y78
    public float w(float f, float f2) {
        double b = ((qh0) this.a).b(f2);
        double d = r78.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * r8.a * r8.b))) + f;
    }

    @Override // defpackage.lrk
    public View x(int i) {
        return ((n) this.a).getChildAt(i);
    }

    @Override // defpackage.y78
    public float y(long j, float f) {
        long j2 = j / 1000000;
        q78 a = ((qh0) this.a).a(f);
        long j3 = a.c;
        return (((Math.signum(a.a) * t00.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f;
    }

    @Override // defpackage.nmk
    public j80 z(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return ((ujg) this.a).z(j, j80Var, j80Var2, j80Var3);
    }

    public cqa(kx4 kx4Var) {
        float f = iyh.a;
        qh0 qh0Var = new qh0();
        qh0Var.a = f;
        float j = kx4Var.j();
        float f2 = r78.a;
        qh0Var.b = j * 386.0878f * 160.0f * 0.84f;
        this.a = qh0Var;
    }

    public /* synthetic */ cqa(Object obj) {
        this.a = obj;
    }

    public cqa(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    public cqa(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.a = bundle;
        hcc.O(bundle);
    }
}
