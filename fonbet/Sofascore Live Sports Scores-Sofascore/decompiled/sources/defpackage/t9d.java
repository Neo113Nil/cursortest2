package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.ViewGroup;
import android.view.Window;
import com.adsbynimbus.google.NimbusRewardCallback;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerHandlerEventType;
import com.blaze.gam.banner.BlazeGAMBannerAdsAdData;
import com.blaze.gam.banner.BlazeGAMBannerAdsDelegate;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.sofascore.results.ReleaseApp;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t9d implements rgj, yc8, xfc, BlazeGAMBannerAdsDelegate, lli, nnd, sm6, xj6, NimbusRewardCallback {
    public static final String[] b = {"_data"};
    public static final wkf c = new wkf(6);
    public Object a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r6 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[LOOP:1: B:14:0x0042->B:15:0x0044, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t9d(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        int length2 = fArr.length - 1;
        gg0[][] gg0VarArr = new gg0[length2][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length2) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            i7 = 4;
                            if (i6 != 4) {
                                i7 = 5;
                                if (i6 != 5) {
                                    i = i4;
                                    float[] fArr3 = fArr2[i5];
                                    int i8 = i5 + 1;
                                    float[] fArr4 = fArr2[i8];
                                    float f = fArr[i5];
                                    float f2 = fArr[i8];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    gg0[] gg0VarArr2 = new gg0[length];
                                    i2 = 0;
                                    while (i2 < length) {
                                        int i9 = i2 * 2;
                                        gg0[] gg0VarArr3 = gg0VarArr2;
                                        int i10 = i2;
                                        int i11 = i9 + 1;
                                        gg0VarArr3[i10] = new gg0(i, f, f2, fArr3[i9], fArr3[i11], fArr4[i9], fArr4[i11]);
                                        i2 = i10 + 1;
                                        gg0VarArr2 = gg0VarArr3;
                                    }
                                    gg0VarArr[i5] = gg0VarArr2;
                                    i5 = i8;
                                    i4 = i;
                                }
                            }
                        }
                    }
                    i3 = 2;
                    i = i3;
                    float[] fArr32 = fArr2[i5];
                    int i82 = i5 + 1;
                    float[] fArr42 = fArr2[i82];
                    float f3 = fArr[i5];
                    float f22 = fArr[i82];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    gg0[] gg0VarArr22 = new gg0[length];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    gg0VarArr[i5] = gg0VarArr22;
                    i5 = i82;
                    i4 = i;
                }
                i3 = 1;
                i = i3;
                float[] fArr322 = fArr2[i5];
                int i822 = i5 + 1;
                float[] fArr422 = fArr2[i822];
                float f32 = fArr[i5];
                float f222 = fArr[i822];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                gg0[] gg0VarArr222 = new gg0[length];
                i2 = 0;
                while (i2 < length) {
                }
                gg0VarArr[i5] = gg0VarArr222;
                i5 = i822;
                i4 = i;
            }
            i = i7;
            float[] fArr3222 = fArr2[i5];
            int i8222 = i5 + 1;
            float[] fArr4222 = fArr2[i8222];
            float f322 = fArr[i5];
            float f2222 = fArr[i8222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            gg0[] gg0VarArr2222 = new gg0[length];
            i2 = 0;
            while (i2 < length) {
            }
            gg0VarArr[i5] = gg0VarArr2222;
            i5 = i8222;
            i4 = i;
        }
        this.a = gg0VarArr;
    }

    public static String a(String str, x08 x08Var, boolean z) {
        String str2 = x08Var.a;
        if (z) {
            str2 = ".temp".concat(str2);
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return lnb.o("lottie_cache_", replaceAll, str2);
    }

    @Override // defpackage.xfc
    public void b(vec vecVar, boolean z) {
        tb0 tb0Var;
        ub0 ub0Var = (ub0) this.a;
        vec k = vecVar.k();
        int i = 0;
        boolean z2 = k != vecVar;
        if (z2) {
            vecVar = k;
        }
        tb0[] tb0VarArr = ub0Var.L;
        int length = tb0VarArr != null ? tb0VarArr.length : 0;
        while (true) {
            if (i < length) {
                tb0Var = tb0VarArr[i];
                if (tb0Var != null && tb0Var.h == vecVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                tb0Var = null;
                break;
            }
        }
        if (tb0Var != null) {
            if (!z2) {
                ub0Var.w(tb0Var, z);
            } else {
                ub0Var.u(tb0Var.a, tb0Var, k);
                ub0Var.w(tb0Var, true);
            }
        }
    }

    @Override // defpackage.sm6
    public Object c() {
        b10 b10Var = (b10) this.a;
        return new tl4((ggf) b10Var.c, (sx2) b10Var.d);
    }

    @Override // defpackage.yc8
    public void d(vb8 vb8Var) {
        ou ouVar = (ou) this.a;
        iu iuVar = ouVar.a;
        j0l j0lVar = new j0l(25, false);
        j0lVar.b = vb8Var;
        ouVar.c = iuVar.f("fiam", j0lVar);
    }

    public mc4 e() {
        int i = 1;
        return new mc4(new it7(16), new w00((ReleaseApp) this.a, i), new hpo(12), new ug5(), new ccd(), new bka(15), new n2f(i));
    }

    public File f(String str) {
        File file = new File(j(), a(str, x08.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(j(), a(str, x08.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(j(), a(str, x08.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public void g(ng2 ng2Var, Thread thread, Throwable th) {
        jw3 jw3Var = (jw3) this.a;
        synchronized (jw3Var) {
            Objects.toString(th);
            thread.getName();
            u6h.O();
            try {
                sik.a(((xx3) jw3Var.e.b).h(new hw3(jw3Var, System.currentTimeMillis(), th, thread, ng2Var)));
            } catch (TimeoutException | Exception unused) {
            }
        }
    }

    @Override // defpackage.lli
    public List getCues(long j) {
        return j >= 0 ? (List) this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.lli
    public long getEventTime(int i) {
        z1a.s(i == 0);
        return 0L;
    }

    @Override // defpackage.lli
    public int getEventTimeCount() {
        return 1;
    }

    @Override // defpackage.xj6
    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.a).getMeasuredHeight();
    }

    @Override // defpackage.xj6
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // defpackage.lli
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.xj6
    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.a).b0;
    }

    @Override // defpackage.xj6
    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.a).a0;
    }

    @Override // defpackage.xj6
    public int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.a;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.a0 + extendedFloatingActionButton.b0;
    }

    @Override // defpackage.rgj
    public Cursor h(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.a).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.nnd
    public int i(int i) {
        vk4 vk4Var = (vk4) this.a;
        if (i <= vk4Var.a - 1) {
            return i;
        }
        if (i <= vk4Var.b - 1) {
            return i - 1;
        }
        int i2 = vk4Var.c;
        return i <= i2 + 1 ? i - 2 : i2;
    }

    public File j() {
        File file = new File(((yf0) this.a).a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // defpackage.xfc
    public boolean k(vec vecVar) {
        Window.Callback callback;
        ub0 ub0Var = (ub0) this.a;
        if (vecVar != vecVar.k() || !ub0Var.F || (callback = ub0Var.l.getCallback()) == null || ub0Var.Q) {
            return true;
        }
        callback.onMenuOpened(108, vecVar);
        return true;
    }

    public ric l(nl6 nl6Var, vq9 vq9Var, int i) {
        j9e j9eVar = (j9e) this.a;
        int i2 = 0;
        ric ricVar = null;
        loop0: while (true) {
            int i3 = 0;
            do {
                int i4 = i3 % 10;
                int i5 = i4 + 10;
                if (i4 == 0 && i3 != 0) {
                    byte[] bArr = j9eVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i6 = i3 == 0 ? 10 : 1;
                try {
                    nl6Var.peekFully(j9eVar.a, i5 - i6, i6);
                    j9eVar.N(i4);
                    j9eVar.M(i5);
                    if (j9eVar.a() < 3) {
                        is8.j(", limit=", "position=", j9eVar.b, j9eVar.c);
                        return null;
                    }
                    int D = j9eVar.D();
                    int i7 = j9eVar.b - 3;
                    j9eVar.b = i7;
                    if (D != 4801587) {
                        if (f5p.z(j9eVar.i()) != -1) {
                            break loop0;
                        }
                        if (i3 == 0) {
                            j9eVar.c(20);
                        }
                        i3++;
                    } else {
                        j9eVar.O(6);
                        int z = j9eVar.z();
                        int i8 = z + 10;
                        if (ricVar == null) {
                            byte[] bArr2 = new byte[i8];
                            System.arraycopy(j9eVar.a, i7, bArr2, 0, 10);
                            nl6Var.peekFully(bArr2, 10, z);
                            ricVar = new xq9(vq9Var).K(i8, bArr2);
                        } else {
                            nl6Var.advancePeekPosition(z);
                        }
                        i2 += i8;
                    }
                } catch (EOFException unused) {
                }
            } while (i3 <= i);
        }
        nl6Var.resetPeekPosition();
        nl6Var.advancePeekPosition(i2);
        return ricVar;
    }

    public void m(int i, Object obj, wsg wsgVar) {
        h03 h03Var = (h03) this.a;
        h03Var.B(i, 3);
        wsgVar.i((s5) obj, h03Var.a);
        h03Var.B(i, 4);
    }

    public File n(String str, InputStream inputStream, x08 x08Var) {
        File file = new File(j(), a(str, x08Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // com.adsbynimbus.google.NimbusRewardCallback
    public void onAdClicked() {
        t4g t4gVar = ((g19) this.a).f;
        if (t4gVar != null) {
            t4gVar.onAdClicked();
        }
    }

    @Override // com.adsbynimbus.google.NimbusRewardCallback
    public void onAdClosed() {
        t4g t4gVar = ((g19) this.a).f;
        if (t4gVar != null) {
            t4gVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.adsbynimbus.google.NimbusRewardCallback
    public void onAdImpression() {
        t4g t4gVar = ((g19) this.a).f;
        if (t4gVar != null) {
            t4gVar.onAdImpression();
        }
    }

    @Override // com.adsbynimbus.google.NimbusRewardCallback
    public void onAdPresented() {
        t4g t4gVar = ((g19) this.a).f;
        if (t4gVar != null) {
            t4gVar.onAdShowedFullScreenContent();
        }
    }

    @Override // com.adsbynimbus.google.NimbusRewardCallback
    public void onError(qcd qcdVar) {
        qcdVar.getClass();
        t4g t4gVar = ((g19) this.a).f;
        if (t4gVar != null) {
            String message = qcdVar.getMessage();
            if (message == null) {
                message = "no error message";
            }
            t4gVar.onAdFailedToShowFullScreenContent(new AdError(-1, message, "nimbus"));
        }
    }

    @Override // com.blaze.gam.banner.BlazeGAMBannerAdsDelegate
    public void onGAMBannerAdsAdError(String str, BlazeGAMBannerAdsAdData blazeGAMBannerAdsAdData) {
        str.getClass();
        blazeGAMBannerAdsAdData.getClass();
    }

    @Override // com.blaze.gam.banner.BlazeGAMBannerAdsDelegate
    public void onGAMBannerAdsAdEvent(BlazeGAMBannerHandlerEventType blazeGAMBannerHandlerEventType, BlazeGAMBannerAdsAdData blazeGAMBannerAdsAdData) {
        ia0 ia0Var = (ia0) this.a;
        blazeGAMBannerHandlerEventType.getClass();
        blazeGAMBannerAdsAdData.getClass();
        int i = tz0.a[blazeGAMBannerHandlerEventType.ordinal()];
        if (i == 1) {
            nv.E0(ia0Var, mv.BANNER);
        } else {
            if (i != 2) {
                return;
            }
            nv.D0(ia0Var, mv.BANNER);
        }
    }

    @Override // com.adsbynimbus.google.NimbusRewardCallback
    public void onUserEarnedReward(RewardItem rewardItem) {
        rewardItem.getClass();
        t4g t4gVar = ((g19) this.a).f;
        if (t4gVar != null) {
            t4gVar.a(new c19(rewardItem));
        }
    }

    @Override // defpackage.nnd
    public int v(int i) {
        vk4 vk4Var = (vk4) this.a;
        if (i < vk4Var.a) {
            return i;
        }
        if (i < vk4Var.b) {
            return i + 1;
        }
        int i2 = vk4Var.c;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    public t9d(int i) {
        switch (i) {
            case 7:
                this.a = new AtomicReference(null);
                break;
            case 22:
                this.a = null;
                break;
            case 26:
                this.a = new j9e(10);
                break;
            case 28:
                this.a = new HashMap();
                new HashMap();
                break;
            default:
                int i2 = j8n.a;
                this.a = new e3c(new ycn[]{it7.r, c}, 23);
                break;
        }
    }

    public /* synthetic */ t9d(Object obj) {
        this.a = obj;
    }

    public t9d(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        cui cuiVar = cui.l;
        cuiVar.getClass();
        this.a = new wi5(cuiVar, j, timeUnit);
    }
}
