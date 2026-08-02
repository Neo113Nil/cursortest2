package defpackage;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.internal.auth.zzfa;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.core.fid.Constants;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.ranges.IntRange;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class j0l implements WebMessageListenerBoundaryInterface, ij2, z4h, pjd, SuccessContinuation, OnCompleteListener, dgb, ne4, gu, kt8, y4h {
    public static final zv8 c = new zv8(1);
    public static final omf d = new omf(4);
    public static final w5o e = new w5o(1);
    public final /* synthetic */ int a;
    public Object b;

    public j0l(int i) {
        mao maoVar;
        xgc xgcVar;
        this.a = i;
        switch (i) {
            case 2:
                this.b = v8a.o();
                break;
            case 3:
                try {
                    maoVar = (mao) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    maoVar = e;
                }
                d9o d9oVar = new d9o(w5o.b, maoVar);
                Charset charset = zzfa.a;
                this.b = d9oVar;
                break;
            case 4:
                this.b = new ea(this);
                break;
            case 10:
                this.b = new i1d(new to3[16], 0);
                break;
            case 11:
                this.b = new LinkedHashMap();
                break;
            case 20:
                this.b = new ti9(0);
                break;
            case 21:
                this.b = new ConcurrentHashMap(16);
                break;
            default:
                hff hffVar = hff.c;
                try {
                    xgcVar = (xgc) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused2) {
                    xgcVar = c;
                }
                xgc[] xgcVarArr = {zv8.b, xgcVar};
                etb etbVar = new etb();
                etbVar.a = xgcVarArr;
                Charset charset2 = u7a.a;
                this.b = etbVar;
                break;
        }
    }

    @Override // defpackage.kt8
    public Object apply(Object obj) {
        return (je) this.b;
    }

    @Override // defpackage.y4h
    public void b(a5h a5hVar) {
        qc9 qc9Var = (qc9) this.b;
        qc9Var.q.b(qc9Var);
    }

    @Override // defpackage.z4h
    public boolean continueLoading(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z2;
            }
            z = false;
            for (z4h z4hVar : (z4h[]) this.b) {
                long nextLoadPositionUs2 = z4hVar.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= z4hVar.continueLoading(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.ne4
    public qe4 createDataSource() {
        return new xp4((ti9) this.b);
    }

    public void f(ou2 ou2Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = ou2Var.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(ou2Var.e[0]), ou2Var);
    }

    @Override // defpackage.z4h
    public long getBufferedPositionUs() {
        long j = Long.MAX_VALUE;
        for (z4h z4hVar : (z4h[]) this.b) {
            long bufferedPositionUs = z4hVar.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.z4h
    public long getNextLoadPositionUs() {
        long j = Long.MAX_VALUE;
        for (z4h z4hVar : (z4h[]) this.b) {
            long nextLoadPositionUs = z4hVar.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // defpackage.gu
    public void h(int i, Bundle bundle) {
        if (i == 2) {
            ((vb8) this.b).g(bundle.getString("events"));
        }
    }

    @Override // defpackage.z4h
    public boolean isLoading() {
        for (z4h z4hVar : (z4h[]) this.b) {
            if (z4hVar.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ij2
    public void j(Typeface typeface) {
        b13 b13Var = (b13) this.b;
        if (b13Var.z(typeface)) {
            b13Var.l(false);
        }
    }

    public void k(CancellationException cancellationException) {
        i1d i1dVar = (i1d) this.b;
        int i = i1dVar.c;
        kj2[] kj2VarArr = new kj2[i];
        for (int i2 = 0; i2 < i; i2++) {
            kj2VarArr[i2] = ((to3) i1dVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            kj2VarArr[i3].a(cancellationException);
        }
        if (i1dVar.c == 0) {
            return;
        }
        u3a.c("uncancelled requests present");
    }

    public da l(int i) {
        return null;
    }

    public long m() {
        int i = r13.j;
        long readLong = ((Parcel) this.b).readLong();
        long j = 63 & readLong;
        if (j >= 16) {
            readLong = (readLong & (-64)) | (j + 1);
        }
        d8k d8kVar = e8k.b;
        return readLong;
    }

    @Override // defpackage.dgb
    public void maybeThrowError() {
        id4 id4Var = (id4) this.b;
        id4Var.A.maybeThrowError();
        IOException iOException = id4Var.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // defpackage.pjd
    public Object n() {
        switch (this.a) {
            case 14:
                Class cls = (Class) this.b;
                try {
                    return nck.a.a(cls);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
                }
            default:
                Constructor constructor = (Constructor) this.b;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e3) {
                    vha vhaVar = iuf.a;
                    vp2.e("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
                    return null;
                } catch (InstantiationException e4) {
                    yhk.o("Failed to invoke constructor '", iuf.b(constructor), "' with no args", e4);
                    return null;
                } catch (InvocationTargetException e5) {
                    vp2.e("Failed to invoke constructor '" + iuf.b(constructor) + "' with no args", e5.getCause());
                    return null;
                }
        }
    }

    public long o() {
        Parcel parcel = (Parcel) this.b;
        byte readByte = parcel.readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return mfj.a(j, 0L) ? lfj.c : v8a.E(j, parcel.readFloat());
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        task.getClass();
        boolean isSuccessful = task.isSuccessful();
        oog oogVar = (oog) this.b;
        if (isSuccessful) {
            p2g p2gVar = w2g.b;
            oogVar.resumeWith(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            exception = new CancellationException();
        }
        p2g p2gVar2 = w2g.b;
        oogVar.resumeWith(new u2g(exception));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        i0l i0lVar;
        i0l i0lVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) s02.E(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        d4a[] d4aVarArr = new d4a[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            d4a d4aVar = new d4a(24);
            d4aVar.b = (WebMessagePortBoundaryInterface) s02.E(WebMessagePortBoundaryInterface.class, invocationHandler3);
            d4aVarArr[i] = d4aVar;
        }
        if (y0l.d.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) s02.E(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                i0lVar = new i0l(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    i0lVar2 = null;
                    if (i0lVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) s02.E(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((u0l) this.b).onPostMessage(webView, i0lVar2, uri, z, (nda) jsReplyProxyBoundaryInterface.getOrCreatePeer(new ji2(jsReplyProxyBoundaryInterface, 6)));
                        return;
                    }
                    return;
                }
                i0lVar = new i0l(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            i0lVar = new i0l(webMessageBoundaryInterface.getData());
        }
        i0lVar2 = i0lVar;
        if (i0lVar2 == null) {
        }
    }

    public da p(int i) {
        return null;
    }

    public ou2 q() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ou2 ou2Var : ((LinkedHashMap) this.b).values()) {
            arrayList.add(ou2Var.b);
            arrayList2.add(ou2Var.c);
            arrayList3.add(ou2Var.d);
            arrayList4.add(ou2Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        z1a.p(j, j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int");
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new ou2(iArr3, jaa.x((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), jaa.x((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), jaa.x((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public void r(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((n71) this.b).b(0);
    }

    @Override // defpackage.z4h
    public void reevaluateBuffer(long j) {
        for (z4h z4hVar : (z4h[]) this.b) {
            z4hVar.reevaluateBuffer(j);
        }
    }

    public void s() {
        qc9 qc9Var = (qc9) this.b;
        int i = qc9Var.r - 1;
        qc9Var.r = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (pd9 pd9Var : qc9Var.t) {
            pd9Var.h();
            i2 += pd9Var.I.a;
        }
        osj[] osjVarArr = new osj[i2];
        int i3 = 0;
        for (pd9 pd9Var2 : qc9Var.t) {
            pd9Var2.h();
            int i4 = pd9Var2.I.a;
            int i5 = 0;
            while (i5 < i4) {
                pd9Var2.h();
                osjVarArr[i3] = pd9Var2.I.a(i5);
                i5++;
                i3++;
            }
        }
        qc9Var.s = new qsj(osjVarArr);
        qc9Var.q.d(qc9Var);
    }

    public boolean t(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        bah bahVar = (bah) obj;
        z41 z41Var = (z41) this.b;
        if (bahVar == null) {
            return Tasks.forResult(null);
        }
        jw3 jw3Var = (jw3) z41Var.c;
        dw3 dw3Var = jw3.r;
        jw3Var.g();
        jw3Var.m.h(null, (xx3) jw3Var.e.b);
        jw3Var.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public void u() {
        i1d i1dVar = (i1d) this.b;
        IntRange j = llf.j(0, i1dVar.c);
        int i = j.a;
        int i2 = j.b;
        if (i <= i2) {
            while (true) {
                lj2 lj2Var = ((to3) i1dVar.a[i]).b;
                Unit unit = Unit.a;
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i1dVar.n();
    }

    public void i(int i, da daVar, String str, Bundle bundle) {
    }

    public /* synthetic */ j0l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public j0l(boolean z) {
        this.a = 7;
        this.b = new AtomicBoolean(z);
    }

    public /* synthetic */ j0l(int i, boolean z) {
        this.a = i;
    }

    public j0l(TextView textView) {
        this.a = 23;
        this.b = new tl5(textView);
    }

    public j0l(String str) {
        this.a = 19;
        Parcel obtain = Parcel.obtain();
        this.b = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }
}
