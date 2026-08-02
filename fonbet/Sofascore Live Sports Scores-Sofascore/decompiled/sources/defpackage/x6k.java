package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwl;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzhmp;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.internal.cast.zzc;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.football.PESMFootballGoalmapView;
import com.sofascore.results.manager.details.view.ManagerHistoryChartGraph;
import com.sofascore.results.view.header.TeamLogoView;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class x6k implements dgb, nu, mu, xj6, et9, tti, rt8, rpg, OnCompleteListener, RemoteCall, MediationAdLoadCallback, zzfkw, zzfpi, who {
    public static final r5a e;
    public static final r5a f;
    public static final r5a g;
    public static x6k h;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        long j = C.TIME_UNSET;
        e = new r5a(j, 0, false);
        f = new r5a(j, 2, 0 == true ? 1 : 0);
        g = new r5a(j, 3, 0 == true ? 1 : 0);
    }

    public x6k(mo0[] mo0VarArr) {
        this.a = 6;
        ehh ehhVar = new ehh();
        ehhVar.m = 0;
        ehhVar.o = 0;
        ehhVar.p = 0;
        byte[] bArr = nik.b;
        ehhVar.n = bArr;
        ehhVar.q = bArr;
        xvh xvhVar = new xvh();
        xvhVar.b = 1.0f;
        xvhVar.c = 1.0f;
        ho0 ho0Var = ho0.e;
        xvhVar.d = ho0Var;
        xvhVar.e = ho0Var;
        xvhVar.f = ho0Var;
        xvhVar.g = ho0Var;
        ByteBuffer byteBuffer = mo0.a;
        xvhVar.j = byteBuffer;
        xvhVar.k = byteBuffer;
        mo0[] mo0VarArr2 = new mo0[mo0VarArr.length + 2];
        this.b = mo0VarArr2;
        System.arraycopy(mo0VarArr, 0, mo0VarArr2, 0, mo0VarArr.length);
        this.c = ehhVar;
        this.d = xvhVar;
        mo0VarArr2[mo0VarArr.length] = ehhVar;
        mo0VarArr2[mo0VarArr.length + 1] = xvhVar;
    }

    public static void C(x6k x6kVar, vmo vmoVar) {
        x6k x6kVar2 = vmoVar.a;
        long[] jArr = (long[]) x6kVar.b;
        long[] jArr2 = (long[]) x6kVar2.b;
        long[] jArr3 = vmoVar.b;
        zzhmp.e(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) x6kVar.c;
        long[] jArr5 = (long[]) x6kVar2.c;
        long[] jArr6 = (long[]) x6kVar2.d;
        zzhmp.e(jArr4, jArr5, jArr6);
        zzhmp.e((long[]) x6kVar.d, jArr6, jArr3);
    }

    public static gq5 b(ot9 ot9Var, Throwable th) {
        Drawable b;
        if (th instanceof qid) {
            ot9Var.getClass();
            ds4 ds4Var = ot9Var.x;
            ds4Var.getClass();
            ds4 ds4Var2 = j.a;
            Drawable drawable = ot9Var.v;
            Integer num = ot9Var.u;
            ds4Var.getClass();
            b = j.b(ot9Var, drawable, num);
        } else {
            Drawable drawable2 = ot9Var.v;
            Integer num2 = ot9Var.u;
            ot9Var.x.getClass();
            b = j.b(ot9Var, drawable2, num2);
        }
        return new gq5(b, ot9Var, th);
    }

    public static boolean k(ot9 ot9Var, Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            if (!ot9Var.j) {
                return false;
            }
            sti stiVar = ot9Var.c;
            if (stiVar instanceof ku9) {
                ImageView imageView = ((ku9) stiVar).b;
                if (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.tti
    public void A(nr9 nr9Var) {
        switch (this.a) {
            case 11:
                ida idaVar = (ida) this.d;
                Bitmap O = rfo.O(nr9Var);
                tda tdaVar = (tda) this.c;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(O, tdaVar.c, tdaVar.b, true);
                createScaledBitmap.getClass();
                idaVar.invoke(createScaledBitmap);
                tdaVar.invalidateSelf();
                break;
            case 12:
                ((fsf) this.d).a = oyn.P(rfo.O(nr9Var), ((ManagerHistoryChartGraph) this.c).h);
                break;
            default:
                Function1 function1 = (Function1) this.d;
                TeamLogoView teamLogoView = (TeamLogoView) this.c;
                Resources resources = teamLogoView.getContext().getResources();
                resources.getClass();
                function1.invoke(rfo.t(nr9Var, resources));
                teamLogoView.invalidate();
                break;
        }
    }

    public c0l B() {
        zzioe.b(Context.class, (Context) this.d);
        return new c0l((uun) this.b, (Context) this.d, (String) this.c);
    }

    @Override // defpackage.tti
    public void D(nr9 nr9Var) {
        int i = this.a;
    }

    public byte[] E() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.d;
        zzhmp.f(jArr4, jArr14);
        zzhmp.f(jArr13, jArr4);
        zzhmp.f(jArr12, jArr13);
        zzhmp.e(jArr5, jArr12, jArr14);
        zzhmp.e(jArr6, jArr5, jArr4);
        zzhmp.f(jArr12, jArr6);
        zzhmp.e(jArr7, jArr12, jArr5);
        zzhmp.f(jArr12, jArr7);
        zzhmp.f(jArr13, jArr12);
        zzhmp.f(jArr12, jArr13);
        zzhmp.f(jArr13, jArr12);
        zzhmp.f(jArr12, jArr13);
        zzhmp.e(jArr8, jArr12, jArr7);
        zzhmp.f(jArr12, jArr8);
        zzhmp.f(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            zzhmp.f(jArr12, jArr13);
            zzhmp.f(jArr13, jArr12);
        }
        zzhmp.e(jArr9, jArr13, jArr8);
        zzhmp.f(jArr12, jArr9);
        zzhmp.f(jArr13, jArr12);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            zzhmp.f(jArr12, jArr13);
            zzhmp.f(jArr13, jArr12);
        }
        zzhmp.e(jArr12, jArr13, jArr9);
        zzhmp.f(jArr13, jArr12);
        zzhmp.f(jArr12, jArr13);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            zzhmp.f(jArr13, jArr12);
            zzhmp.f(jArr12, jArr13);
        }
        zzhmp.e(jArr10, jArr12, jArr8);
        zzhmp.f(jArr12, jArr10);
        zzhmp.f(jArr13, jArr12);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            zzhmp.f(jArr12, jArr13);
            zzhmp.f(jArr13, jArr12);
        }
        zzhmp.e(jArr11, jArr13, jArr10);
        zzhmp.f(jArr13, jArr11);
        zzhmp.f(jArr12, jArr13);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            zzhmp.f(jArr13, jArr12);
            zzhmp.f(jArr12, jArr13);
        }
        zzhmp.e(jArr13, jArr12, jArr11);
        zzhmp.f(jArr12, jArr13);
        zzhmp.f(jArr13, jArr12);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            zzhmp.f(jArr12, jArr13);
            zzhmp.f(jArr13, jArr12);
        }
        zzhmp.e(jArr12, jArr13, jArr10);
        zzhmp.f(jArr13, jArr12);
        zzhmp.f(jArr12, jArr13);
        zzhmp.f(jArr13, jArr12);
        zzhmp.f(jArr12, jArr13);
        zzhmp.f(jArr13, jArr12);
        zzhmp.e(jArr, jArr13, jArr6);
        zzhmp.e(jArr2, (long[]) this.b, jArr);
        zzhmp.e(jArr3, (long[]) this.c, jArr);
        byte[] h2 = zzhmp.h(jArr3);
        h2[31] = (byte) (h2[31] ^ ((zzhmp.h(jArr2)[0] & 1) << 7));
        return h2;
    }

    public /* bridge */ /* synthetic */ x6k F(Context context) {
        context.getClass();
        this.d = context;
        return this;
    }

    public void a() {
        xfb xfbVar = (xfb) this.c;
        xfbVar.getClass();
        xfbVar.a(false);
    }

    public boolean c() {
        return ((IOException) this.d) != null;
    }

    @Override // defpackage.who
    public void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((zzpg) this.d).z(true, i, th, bArr, (String) this.c, (ArrayList) this.b, map);
    }

    @Override // defpackage.et9
    public Bitmap e(BitmapFactory.Options options) {
        return q9.c(new gf6(ha2.c((ByteBuffer) this.b)), options, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                GenericDeclaration genericDeclaration = (GenericDeclaration) this.b;
                String str = (String) this.c;
                if (!v6k.a) {
                    if (obj instanceof TypeVariable) {
                        TypeVariable typeVariable = (TypeVariable) obj;
                        if (!str.equals(typeVariable.getName()) || !genericDeclaration.equals(typeVariable.getGenericDeclaration())) {
                        }
                    }
                    return false;
                }
                if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof y6k)) {
                    x6k x6kVar = ((y6k) Proxy.getInvocationHandler(obj)).a;
                    if (str.equals((String) x6kVar.c) && genericDeclaration.equals((GenericDeclaration) x6kVar.b) && ((vvf) this.d).equals((vvf) x6kVar.d)) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.et9
    public boolean f() {
        ArrayList arrayList = (ArrayList) this.c;
        ByteBuffer c = ha2.c((ByteBuffer) this.b);
        kn4 kn4Var = (kn4) this.d;
        if (c != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    if (((ds9) arrayList.get(i)).a(c, kn4Var)) {
                        return true;
                    }
                } finally {
                }
            }
        }
        return false;
    }

    @Override // defpackage.xj6
    public int getHeight() {
        int i = ((ExtendedFloatingActionButton) this.d).i0;
        return i == -1 ? ((fp4) this.b).getHeight() : (i == 0 || i == -2) ? ((ExtendedFloatingActionButton) ((t9d) this.c).a).getMeasuredHeight() : i;
    }

    @Override // defpackage.xj6
    public ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.d;
        int i = extendedFloatingActionButton.h0;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.i0;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    @Override // defpackage.xj6
    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.d).b0;
    }

    @Override // defpackage.xj6
    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.d).a0;
    }

    @Override // defpackage.xj6
    public int getWidth() {
        int i = ((ExtendedFloatingActionButton) this.d).h0;
        return i == -1 ? ((fp4) this.b).getWidth() : (i == 0 || i == -2) ? ((t9d) this.c).getWidth() : i;
    }

    @Override // defpackage.et9
    public int h() {
        ArrayList arrayList = (ArrayList) this.c;
        ByteBuffer c = ha2.c((ByteBuffer) this.b);
        kn4 kn4Var = (kn4) this.d;
        if (c != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int c2 = ((ds9) arrayList.get(i)).c(c, kn4Var);
                    if (c2 != -1) {
                        return c2;
                    }
                } finally {
                }
            }
        }
        return -1;
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                return ((String) this.c).hashCode() ^ ((GenericDeclaration) this.b).hashCode();
            default:
                return super.hashCode();
        }
    }

    public boolean i() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.c) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.c = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.b).readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
        }
        return true;
    }

    @Override // defpackage.mu
    public void j(Bundle bundle) {
        synchronized (this.c) {
            Objects.toString(bundle);
            this.d = new CountDownLatch(1);
            ((hpo) this.b).j(bundle);
            try {
                ((CountDownLatch) this.d).await(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
            this.d = null;
        }
    }

    public boolean l() {
        return ((xfb) this.c) != null;
    }

    @Override // defpackage.nu
    public void m(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // defpackage.dgb
    public void maybeThrowError() {
        IOException iOException = (IOException) this.d;
        if (iOException != null) {
            throw iOException;
        }
        xfb xfbVar = (xfb) this.c;
        if (xfbVar != null) {
            int i = xfbVar.a;
            IOException iOException2 = xfbVar.e;
            if (iOException2 != null && xfbVar.f > i) {
                throw iOException2;
            }
        }
    }

    public String o() {
        if (!i()) {
            yhk.d();
            return null;
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        Rpc rpc = (Rpc) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        fhh fhhVar = rpc.a;
        synchronized (fhhVar) {
            fhhVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            String canonicalName = ((Adapter) this.c).getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            zzo.zzd(sb.toString());
            zzbwa zzbwaVar = (zzbwa) this.b;
            zzbwaVar.S(adError.zza());
            zzbwaVar.A4(adError.getCode(), adError.getMessage());
            zzbwaVar.f(adError.getCode());
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
    }

    @Override // defpackage.rt8
    /* renamed from: onSuccess, reason: collision with other method in class */
    public void mo914onSuccess(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = (ViewGroup) this.c;
        View view2 = (View) this.b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            a70.r("The media route button placeholder missing layout params.");
            return;
        }
        view.setId(R.id.exo_media_route_button_placeholder);
        view.setLayoutParams(layoutParams);
        int indexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeView(view2);
        viewGroup.addView(view, indexOfChild);
        view.setVisibility(0);
        ((one) this.d).a.h(view, true);
    }

    @Override // defpackage.et9
    public ImageHeaderParser$ImageType p() {
        return ktm.A((ArrayList) this.c, ha2.c((ByteBuffer) this.b));
    }

    @Override // defpackage.tti
    public void t(nr9 nr9Var) {
        Bitmap O;
        Bitmap O2;
        Object obj = null;
        switch (this.a) {
            case 11:
                tda tdaVar = (tda) this.c;
                if (nr9Var != null && (O = rfo.O(nr9Var)) != null) {
                    ida idaVar = (ida) this.b;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(O, tdaVar.c, tdaVar.b, true);
                    createScaledBitmap.getClass();
                    idaVar.invoke(createScaledBitmap);
                    tdaVar.invalidateSelf();
                    break;
                }
                break;
            case 12:
                fsf fsfVar = (fsf) this.b;
                if (nr9Var != null && (O2 = rfo.O(nr9Var)) != null) {
                    obj = oyn.P(O2, ((ManagerHistoryChartGraph) this.c).h);
                }
                fsfVar.a = obj;
                break;
            default:
                TeamLogoView teamLogoView = (TeamLogoView) this.c;
                Function1 function1 = (Function1) this.b;
                if (nr9Var != null) {
                    Resources resources = teamLogoView.getContext().getResources();
                    resources.getClass();
                    obj = rfo.t(nr9Var, resources);
                }
                function1.invoke(obj);
                teamLogoView.invalidate();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.c;
            case 14:
                String str = (String) this.d;
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.b;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzbm zzbmVar = (zzbm) this.b;
        String str = (String) this.c;
        LaunchOptions launchOptions = (LaunchOptions) this.d;
        zzy zzyVar = (zzy) anyClient;
        zzbmVar.m();
        zzah zzahVar = (zzah) zzyVar.getService();
        zzyVar.getContext();
        ApiMetadata a = zzff.a();
        Parcel J = zzahVar.J();
        J.writeString(str);
        zzc.b(J, launchOptions);
        zzc.b(J, a);
        zzahVar.l2(J, 13);
        synchronized (zzbmVar.s) {
            try {
                if (zzbmVar.p != null) {
                    zzbmVar.o(2477);
                }
                zzbmVar.p = taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v(Activity activity, hal halVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.d;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            if (halVar.equals((hal) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((ngh) ((by9) this.b).a).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                mgh mghVar = (mgh) it.next();
                if (mghVar.a.equals(activity)) {
                    mghVar.d = halVar;
                    mghVar.b.execute(new ecg(5, mghVar, halVar));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public xvd w(ot9 ot9Var, jjh jjhVar) {
        Bitmap.Config config;
        Bitmap.Config config2 = ((ot9Var.f.isEmpty() || ph0.v(l.a, ot9Var.e)) && ((config = ot9Var.e) != Bitmap.Config.HARDWARE || (k(ot9Var, config) && ((c79) this.d).f(jjhVar)))) ? ot9Var.e : Bitmap.Config.ARGB_8888;
        int i = ((rqi) this.c).d ? ot9Var.B : 4;
        s02 s02Var = jjhVar.a;
        w25 w25Var = w25.j;
        return new xvd(ot9Var.a, config2, jjhVar, (s02Var.equals(w25Var) || jjhVar.b.equals(w25Var)) ? 2 : ot9Var.C, j.a(ot9Var), ot9Var.k && ot9Var.f.isEmpty() && config2 != Bitmap.Config.ALPHA_8, ot9Var.h, ot9Var.i, ot9Var.r, ot9Var.z, ot9Var.A, i);
    }

    public void x(agb agbVar) {
        irb irbVar = (irb) this.b;
        xfb xfbVar = (xfb) this.c;
        if (xfbVar != null) {
            xfbVar.a(true);
        }
        if (agbVar != null) {
            irbVar.execute(new b8(agbVar, 23));
        }
        ((sw9) irbVar.c).accept(irbVar.b);
    }

    public void y(yfb yfbVar, vfb vfbVar, int i) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.d = null;
        xfb xfbVar = new xfb(this, myLooper, yfbVar, vfbVar, i, SystemClock.elapsedRealtime());
        z1a.E(((xfb) this.c) == null);
        this.c = xfbVar;
        xfbVar.b();
    }

    public void z() {
        x0d x0dVar = (x0d) this.b;
        String str = (String) this.c;
        List list = (List) x0dVar.k(str);
        if (list != null) {
            list.remove((Function0) this.d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        x0dVar.m(str, list);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Object zza(Object obj) {
        zzele zzeleVar = (zzele) this.b;
        zzu zzuVar = (zzu) this.d;
        String str = (String) this.c;
        zzeleVar.getClass();
        zzeleVar.b.execute(new lv4((SQLiteDatabase) obj, str, zzuVar, false, 26));
        return null;
    }

    @Override // defpackage.et9
    public void g() {
    }

    private final void q(nr9 nr9Var) {
    }

    private final void r(nr9 nr9Var) {
    }

    private final void s(nr9 nr9Var) {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* synthetic */ Object onSuccess(Object obj) {
        zzbwa zzbwaVar = (zzbwa) this.b;
        try {
            ((zzbwv) this.d).j = (MediationInterscrollerAd) obj;
            zzbwaVar.zzj();
        } catch (RemoteException e2) {
            zzo.zzg("", e2);
        }
        return new zzbwl(zzbwaVar);
    }

    public /* synthetic */ x6k(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ x6k(zzele zzeleVar, zzu zzuVar, String str) {
        this.a = 27;
        this.b = zzeleVar;
        this.d = zzuVar;
        this.c = str;
    }

    public /* synthetic */ x6k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ x6k(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public x6k(zzpg zzpgVar, String str, ArrayList arrayList) {
        this.a = 29;
        this.c = str;
        this.b = arrayList;
        this.d = zzpgVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x6k(vmo vmoVar) {
        this(28);
        this.a = 28;
        C(this, vmoVar);
    }

    public x6k(x6k x6kVar) {
        this.a = 28;
        this.b = Arrays.copyOf((long[]) x6kVar.b, 10);
        this.c = Arrays.copyOf((long[]) x6kVar.c, 10);
        this.d = Arrays.copyOf((long[]) x6kVar.d, 10);
    }

    public x6k(bpf bpfVar, rqi rqiVar, zid zidVar) {
        Object kpgVar;
        this.a = 17;
        this.b = bpfVar;
        this.c = rqiVar;
        int i = 5;
        if (f.a) {
            kpgVar = new r0a(false, i);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 26;
            if (i2 != 26 && i2 != 27) {
                kpgVar = new r0a(true, i);
            } else {
                kpgVar = new kpg(i3);
            }
        }
        this.d = kpgVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x6k(int i) {
        this(28, new long[10], new long[10], new long[10]);
        this.a = i;
        switch (i) {
            case 28:
                break;
            default:
                this.b = v8a.o();
                this.c = v8a.o();
                this.d = v8a.o();
                break;
        }
    }

    public x6k(hpo hpoVar) {
        this.a = 3;
        this.c = new Object();
        this.b = hpoVar;
    }

    public x6k(Context context, LocationManager locationManager) {
        this.a = 21;
        this.d = new yli();
        this.b = context;
        this.c = locationManager;
    }

    public /* synthetic */ x6k(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x6k(String str) {
        this(new irb(Executors.newSingleThreadExecutor(new rh3(r5, 2)), new sw9(18), 2), 1);
        this.a = 1;
        String concat = "ExoPlayer:Loader:".concat(str);
        String str2 = nik.a;
    }

    public x6k(PESMFootballGoalmapView pESMFootballGoalmapView, Point2D point2D, Point2D point2D2) {
        this.a = 15;
        point2D.getClass();
        this.b = point2D;
        this.c = point2D2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new p6(6, pESMFootballGoalmapView, this));
        this.d = ofFloat;
    }

    public x6k(by9 by9Var) {
        this.a = 19;
        this.b = by9Var;
        this.c = new ReentrantLock();
        this.d = new WeakHashMap();
    }

    public x6k(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        this.a = 0;
        z6k.a(typeArr, "bound for type variable");
        genericDeclaration.getClass();
        this.b = genericDeclaration;
        str.getClass();
        this.c = str;
        this.d = hv9.w(typeArr);
    }

    public x6k(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = 9;
        this.d = arrayDeque;
        this.b = bufferedReader;
    }

    @Override // defpackage.rt8
    public void onFailure(Throwable th) {
        ((View) this.b).setVisibility(8);
    }
}
