package defpackage;

import android.app.ApplicationExitInfo;
import android.os.Bundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class hg6 implements pdb, qdb, Continuation, OnFailureListener, OnSuccessListener, ec3, SuccessContinuation, ql6, kwj, h72 {
    public final /* synthetic */ int a;

    public /* synthetic */ hg6(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo b(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    @Override // defpackage.kwj
    public Object apply(Object obj) {
        return ((mde) obj).toByteArray();
    }

    @Override // defpackage.ql6
    public ll6[] createExtractors() {
        switch (this.a) {
            case 22:
                return new ll6[]{new a78()};
            default:
                return new ll6[]{new jd8()};
        }
    }

    @Override // defpackage.h72
    public i72 g(Bundle bundle) {
        sm8 sm8Var = sm8.G;
        pm8 pm8Var = new pm8();
        if (bundle != null) {
            ClassLoader classLoader = j72.class.getClassLoader();
            int i = lik.a;
            bundle.setClassLoader(classLoader);
        }
        String string = bundle.getString(Integer.toString(0, 36));
        String str = sm8Var.a;
        if (string == null) {
            string = str;
        }
        pm8Var.a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = sm8Var.b;
        if (string2 == null) {
            string2 = str2;
        }
        pm8Var.b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = sm8Var.c;
        if (string3 == null) {
            string3 = str3;
        }
        pm8Var.c = string3;
        pm8Var.d = bundle.getInt(Integer.toString(3, 36), sm8Var.d);
        pm8Var.e = bundle.getInt(Integer.toString(4, 36), sm8Var.e);
        pm8Var.f = bundle.getInt(Integer.toString(5, 36), sm8Var.f);
        pm8Var.g = bundle.getInt(Integer.toString(6, 36), sm8Var.g);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = sm8Var.i;
        if (string4 == null) {
            string4 = str4;
        }
        pm8Var.h = string4;
        Metadata metadata = (Metadata) bundle.getParcelable(Integer.toString(8, 36));
        Metadata metadata2 = sm8Var.j;
        if (metadata == null) {
            metadata = metadata2;
        }
        pm8Var.i = metadata;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = sm8Var.k;
        if (string5 == null) {
            string5 = str5;
        }
        pm8Var.j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = sm8Var.l;
        if (string6 == null) {
            string6 = str6;
        }
        pm8Var.k = string6;
        pm8Var.l = bundle.getInt(Integer.toString(11, 36), sm8Var.m);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i2, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i2++;
        }
        pm8Var.m = arrayList;
        pm8Var.n = (DrmInitData) bundle.getParcelable(Integer.toString(13, 36));
        pm8Var.o = bundle.getLong(Integer.toString(14, 36), sm8Var.p);
        pm8Var.p = bundle.getInt(Integer.toString(15, 36), sm8Var.q);
        pm8Var.q = bundle.getInt(Integer.toString(16, 36), sm8Var.r);
        pm8Var.r = bundle.getFloat(Integer.toString(17, 36), sm8Var.s);
        pm8Var.s = bundle.getInt(Integer.toString(18, 36), sm8Var.t);
        pm8Var.t = bundle.getFloat(Integer.toString(19, 36), sm8Var.u);
        pm8Var.u = bundle.getByteArray(Integer.toString(20, 36));
        pm8Var.v = bundle.getInt(Integer.toString(21, 36), sm8Var.w);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            pm8Var.w = new v13(bundle2.getInt(Integer.toString(0, 36), -1), bundle2.getInt(Integer.toString(1, 36), -1), bundle2.getInt(Integer.toString(2, 36), -1), bundle2.getByteArray(Integer.toString(3, 36)));
        }
        pm8Var.x = bundle.getInt(Integer.toString(23, 36), sm8Var.y);
        pm8Var.y = bundle.getInt(Integer.toString(24, 36), sm8Var.z);
        pm8Var.z = bundle.getInt(Integer.toString(25, 36), sm8Var.A);
        pm8Var.A = bundle.getInt(Integer.toString(26, 36), sm8Var.B);
        pm8Var.B = bundle.getInt(Integer.toString(27, 36), sm8Var.C);
        pm8Var.C = bundle.getInt(Integer.toString(28, 36), sm8Var.D);
        pm8Var.D = bundle.getInt(Integer.toString(29, 36), sm8Var.E);
        return new sm8(pm8Var);
    }

    @Override // defpackage.pdb
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((vke) obj).onSeekProcessed();
                break;
            case 1:
                ((wke) obj).onRenderedFirstFrame();
                break;
            default:
                ((vke) obj).onRenderedFirstFrame();
                break;
        }
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        l48 lambda$getComponents$0;
        y48 providesFirebasePerformance;
        o58 components$lambda$0;
        p58 components$lambda$1;
        switch (this.a) {
            case 14:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(vngVar);
                return lambda$getComponents$0;
            case 15:
                providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(vngVar);
                return providesFirebasePerformance;
            case 19:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(vngVar);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(vngVar);
                return components$lambda$1;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.a) {
            case 16:
                break;
            default:
                break;
        }
        return Tasks.forResult(null);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i;
        switch (this.a) {
            case 4:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
    }
}
