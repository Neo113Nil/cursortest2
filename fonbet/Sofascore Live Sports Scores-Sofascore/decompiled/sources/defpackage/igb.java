package defpackage;

import com.google.android.gms.auth.api.signin.internal.zbc;
import java.io.PrintWriter;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class igb extends egb {
    public final u6b a;
    public final hgb b;

    public igb(u6b u6bVar, stk stkVar) {
        this.a = u6bVar;
        stkVar.getClass();
        jy3 jy3Var = jy3.b;
        jy3Var.getClass();
        g7h g7hVar = new g7h(stkVar, hgb.d, jy3Var);
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(hgb.class);
        orCreateKotlinClass.getClass();
        String t = kik.t(orCreateKotlinClass);
        if (t != null) {
            this.b = (hgb) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t), orCreateKotlinClass);
        } else {
            a70.p("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final void b(String str, PrintWriter printWriter) {
        hgb hgbVar = this.b;
        if (hgbVar.b.e() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < hgbVar.b.e(); i++) {
                fgb fgbVar = (fgb) hgbVar.b.f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(hgbVar.b.c(i));
                printWriter.print(": ");
                printWriter.println(fgbVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(fgbVar.l);
                zbc zbcVar = fgbVar.l;
                String concat = str2.concat("  ");
                zbcVar.getClass();
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(zbcVar.a);
                if (zbcVar.c || zbcVar.f) {
                    printWriter.print(concat);
                    printWriter.print("mStarted=");
                    printWriter.print(zbcVar.c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(zbcVar.f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (zbcVar.d || zbcVar.e) {
                    printWriter.print(concat);
                    printWriter.print("mAbandoned=");
                    printWriter.print(zbcVar.d);
                    printWriter.print(" mReset=");
                    printWriter.println(zbcVar.e);
                }
                if (zbcVar.h != null) {
                    printWriter.print(concat);
                    printWriter.print("mTask=");
                    printWriter.print(zbcVar.h);
                    printWriter.print(" waiting=");
                    zbcVar.h.getClass();
                    printWriter.println(false);
                }
                if (zbcVar.i != null) {
                    printWriter.print(concat);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(zbcVar.i);
                    printWriter.print(" waiting=");
                    zbcVar.i.getClass();
                    printWriter.println(false);
                }
                if (fgbVar.n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(fgbVar.n);
                    ggb ggbVar = fgbVar.n;
                    String concat2 = str2.concat("  ");
                    ggbVar.getClass();
                    printWriter.print(concat2);
                    printWriter.print("mDeliveredData=");
                    printWriter.println(ggbVar.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                zbc zbcVar2 = fgbVar.l;
                Object d = fgbVar.d();
                zbcVar2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (d == null) {
                    sb.append("null");
                } else {
                    Class<?> cls = d.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(fgbVar.c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
