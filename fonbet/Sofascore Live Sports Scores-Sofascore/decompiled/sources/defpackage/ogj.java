package defpackage;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.firebase.datatransport.TransportRegistrar;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.results.profile.UserProfileActivity;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ogj implements h72, kwj, hyj, ec3, ql6, xd {
    public static final ogj b = new ogj(9);
    public static final ogj c = new ogj(10);
    public static final ogj d = new ogj(11);
    public static final ogj e = new ogj(12);
    public static final ogj f = new ogj(13);
    public final /* synthetic */ int a;

    public static /* synthetic */ void b() {
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void f(long j, String str) {
        throw new IllegalArgumentException(str + j);
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void j(Object obj, String str, int i, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2 + ')').toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new Exception(str);
    }

    public static /* synthetic */ void m(String str) {
        throw new NoSuchElementException(str);
    }

    @Override // defpackage.kwj
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.ql6
    public ll6[] createExtractors() {
        djj djjVar = new djj(0L);
        av9 av9Var = hv9.b;
        return new ll6[]{new z1k(1, 1, xli.A7, djjVar, new mu4(0, vvf.e))};
    }

    @Override // defpackage.h72
    public i72 g(Bundle bundle) {
        vvf A;
        vvf A2;
        vvf A3;
        switch (this.a) {
            case 0:
                qx9.r(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new pgj(bundle.getBoolean(Integer.toString(2, 36), false)) : new pgj();
            case 1:
            default:
                Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
                bundle2.getClass();
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    av9 av9Var = hv9.b;
                    A3 = vvf.e;
                } else {
                    A3 = j72.A(sm8.H, parcelableArrayList);
                }
                nsj nsjVar = new nsj(bundle2.getString(Integer.toString(1, 36), ""), (sm8[]) A3.toArray(new sm8[0]));
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i = nsjVar.a;
                int[] iArr = new int[i];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
                boolean[] zArr = new boolean[i];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new ruj(nsjVar, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
            case 2:
                int i2 = bundle.getInt(Integer.toString(0, 36), 0);
                long j = bundle.getLong(Integer.toString(1, 36), C.TIME_UNSET);
                long j2 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle3 = bundle.getBundle(Integer.toString(4, 36));
                jg jgVar = bundle3 != null ? (jg) jg.h.g(bundle3) : jg.f;
                hij hijVar = new hij();
                hijVar.h(null, null, i2, j, j2, jgVar, z);
                return hijVar;
            case 3:
                Bundle bundle4 = bundle.getBundle(Integer.toString(1, 36));
                f6c f6cVar = bundle4 != null ? (f6c) f6c.g.g(bundle4) : null;
                long j3 = bundle.getLong(Integer.toString(2, 36), C.TIME_UNSET);
                long j4 = bundle.getLong(Integer.toString(3, 36), C.TIME_UNSET);
                long j5 = bundle.getLong(Integer.toString(4, 36), C.TIME_UNSET);
                boolean z2 = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z3 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle5 = bundle.getBundle(Integer.toString(7, 36));
                t5c t5cVar = bundle5 != null ? new t5c(bundle5.getLong(Integer.toString(0, 36), C.TIME_UNSET), bundle5.getLong(Integer.toString(1, 36), C.TIME_UNSET), bundle5.getLong(Integer.toString(2, 36), C.TIME_UNSET), bundle5.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle5.getFloat(Integer.toString(4, 36), -3.4028235E38f)) : null;
                boolean z4 = bundle.getBoolean(Integer.toString(8, 36), false);
                long j6 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j7 = bundle.getLong(Integer.toString(10, 36), C.TIME_UNSET);
                int i3 = bundle.getInt(Integer.toString(11, 36), 0);
                int i4 = bundle.getInt(Integer.toString(12, 36), 0);
                long j8 = bundle.getLong(Integer.toString(13, 36), 0L);
                jij jijVar = new jij();
                jijVar.b(jij.q, f6cVar, j3, j4, j5, z2, z3, t5cVar, j6, j7, i3, i4, j8);
                jijVar.j = z4;
                return jijVar;
            case 4:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList2 == null) {
                    av9 av9Var2 = hv9.b;
                    A = vvf.e;
                } else {
                    A = j72.A(sm8.H, parcelableArrayList2);
                }
                return new nsj(bundle.getString(Integer.toString(1, 36), ""), (sm8[]) A.toArray(new sm8[0]));
            case 5:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                return parcelableArrayList3 == null ? new psj(new nsj[0]) : new psj((nsj[]) j72.A(nsj.f, parcelableArrayList3).toArray(new nsj[0]));
            case 6:
                Bundle bundle6 = bundle.getBundle(Integer.toString(0, 36));
                bundle6.getClass();
                ArrayList parcelableArrayList4 = bundle6.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList4 == null) {
                    av9 av9Var3 = hv9.b;
                    A2 = vvf.e;
                } else {
                    A2 = j72.A(sm8.H, parcelableArrayList4);
                }
                nsj nsjVar2 = new nsj(bundle6.getString(Integer.toString(1, 36), ""), (sm8[]) A2.toArray(new sm8[0]));
                int[] intArray2 = bundle.getIntArray(Integer.toString(1, 36));
                intArray2.getClass();
                return new ysj(nsjVar2, jaa.r(intArray2));
        }
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        wxj lambda$getComponents$0;
        wxj lambda$getComponents$1;
        wxj lambda$getComponents$2;
        switch (this.a) {
            case 16:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(vngVar);
                return lambda$getComponents$0;
            case 17:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(vngVar);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(vngVar);
                return lambda$getComponents$2;
        }
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        int i = UserProfileActivity.S;
        ((ActivityResult) obj).getClass();
    }

    public /* synthetic */ ogj(int i) {
        this.a = i;
    }

    @Override // defpackage.hyj
    public void a(Exception exc) {
    }
}
