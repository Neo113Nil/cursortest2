package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioProfile;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.sofascore.results.main.start.StartActivity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ilg implements klg, wn3, Continuation, xd, h72, fdj {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ AudioProfile b(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ void c() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void d(int i, Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + i + obj + obj2);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new wng(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* synthetic */ void l(int i, String str) {
        throw new IOException(str + i);
    }

    public w2h a(yih yihVar) {
        v2h T;
        v2h v2hVar;
        v2h v2hVar2;
        switch (this.a) {
            case 8:
                zz0 zz0Var = (zz0) yihVar.d;
                return new w2h(zz0Var.d(zz0Var.b), zz0Var.d(zz0Var.c), yihVar.l() == z14.a);
            case 9:
                zz0 zz0Var2 = (zz0) yihVar.d;
                return hda.v(new w2h(zz0Var2.d(zz0Var2.b), zz0Var2.d(zz0Var2.c), yihVar.l() == z14.a), yihVar);
            case 10:
                return hda.n(yihVar, dti.g);
            case 11:
                return hda.n(yihVar, kpg.f);
            default:
                w2h w2hVar = (w2h) yihVar.c;
                zz0 zz0Var3 = (zz0) yihVar.d;
                if (w2hVar == null) {
                    return hda.n(yihVar, dti.g);
                }
                v2h v2hVar3 = w2hVar.b;
                v2h v2hVar4 = w2hVar.a;
                if (yihVar.b) {
                    T = hda.T(yihVar, zz0Var3, v2hVar4);
                    v2hVar2 = v2hVar3;
                    v2hVar3 = v2hVar4;
                    v2hVar = T;
                } else {
                    T = hda.T(yihVar, zz0Var3, v2hVar3);
                    v2hVar = v2hVar4;
                    v2hVar2 = T;
                }
                if (Intrinsics.c(T, v2hVar3)) {
                    return w2hVar;
                }
                if (yihVar.l() != z14.a && (yihVar.l() != z14.c || v2hVar.b <= v2hVar2.b)) {
                    r0 = false;
                }
                return hda.v(new w2h(v2hVar, v2hVar2, r0), yihVar);
        }
    }

    @Override // defpackage.wn3
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((dpg) obj).b.getClass();
                break;
            default:
                ((epg) obj).b.release();
                break;
        }
    }

    @Override // defpackage.klg
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                hcc a = jv0.a();
                a.Y(rawQuery.getString(1));
                a.d = m7f.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a.c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a.H());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // defpackage.h72
    public i72 g(Bundle bundle) {
        qx9.r(bundle.getInt(Integer.toString(0, 36), -1) == 2);
        int i = bundle.getInt(Integer.toString(1, 36), 5);
        float f = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f == -1.0f ? new sbi(i) : new sbi(i, f);
    }

    public boolean m() {
        switch (this.a) {
            case 20:
                return false;
            default:
                int i = StartActivity.q;
                return true;
        }
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            ps0 ps0Var = (ps0) task.getResult();
            String str = ps0Var.b;
            File file = ps0Var.c;
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
            z = true;
        } else {
            task.getException();
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ ilg(int i) {
        this.a = i;
    }
}
