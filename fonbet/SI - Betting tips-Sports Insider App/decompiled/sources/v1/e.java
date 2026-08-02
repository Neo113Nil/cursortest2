package v1;

import androidx.lifecycle.c1;
import androidx.lifecycle.e0;
import androidx.lifecycle.o1;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.messaging.x;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24388a;

    /* renamed from: b, reason: collision with root package name */
    public final d f24389b;

    public e(e0 e0Var, o1 store) {
        this.f24388a = e0Var;
        Intrinsics.checkNotNullParameter(store, "store");
        c1 factory = d.f24385d;
        Intrinsics.checkNotNullParameter(factory, "factory");
        t1.a defaultCreationExtras = t1.a.f23739b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x xVar = new x(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(d.class, "modelClass");
        Intrinsics.checkNotNullParameter(d.class, "<this>");
        ag.c modelClass = Reflection.getOrCreateKotlinClass(d.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String r5 = d5.r(modelClass);
        if (r5 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f24389b = (d) xVar.x(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5));
    }

    public final void b(String str, PrintWriter printWriter) {
        d dVar = this.f24389b;
        if (dVar.f24386b.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i5 = 0; i5 < dVar.f24386b.g(); i5++) {
                b bVar = (b) dVar.f24386b.h(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(dVar.f24386b.e(i5));
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(bVar.f24380l);
                x5.c cVar = bVar.f24380l;
                String str3 = str2 + "  ";
                cVar.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(cVar.f25395a);
                if (cVar.f25396b || cVar.f25399e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(cVar.f25396b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(cVar.f25399e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (cVar.f25397c || cVar.f25398d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(cVar.f25397c);
                    printWriter.print(" mReset=");
                    printWriter.println(cVar.f25398d);
                }
                if (cVar.f25401g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(cVar.f25401g);
                    printWriter.print(" waiting=");
                    cVar.f25401g.getClass();
                    printWriter.println(false);
                }
                if (cVar.f25402h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(cVar.f25402h);
                    printWriter.print(" waiting=");
                    cVar.f25402h.getClass();
                    printWriter.println(false);
                }
                if (bVar.f24382n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(bVar.f24382n);
                    c cVar2 = bVar.f24382n;
                    cVar2.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(cVar2.f24384b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                x5.c cVar3 = bVar.f24380l;
                Object d10 = bVar.d();
                cVar3.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                if (d10 == null) {
                    sb2.append("null");
                } else {
                    Class<?> cls = d10.getClass();
                    sb2.append(cls.getSimpleName());
                    sb2.append("{");
                    sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb2.append("}");
                }
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(bVar.f2212c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f24388a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
