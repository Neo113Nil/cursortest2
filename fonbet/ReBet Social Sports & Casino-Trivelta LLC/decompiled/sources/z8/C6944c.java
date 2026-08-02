package z8;

import android.content.Context;
import com.facebook.soloader.C;
import com.facebook.soloader.C3111c;
import com.facebook.soloader.C3114f;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;
import java.io.File;
import java.util.ArrayList;

/* renamed from: z8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6944c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f68631a;

    public C6944c(Context context) {
        this.f68631a = context;
    }

    @Override // z8.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.f68631a.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            p.b("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = eArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            E e10 = eArr[i10];
            if (e10 instanceof C3111c) {
                C3111c c3111c = (C3111c) e10;
                try {
                    for (G.c cVar : c3111c.o()) {
                        if (!new File(file, cVar.f31563a).exists()) {
                            arrayList.add(cVar.f31563a);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        p.b("SoLoader", "No libraries missing from " + file);
                        return false;
                    }
                    p.b("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                    c3111c.e(0);
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/app failure ", e11);
                    return false;
                }
            } else {
                i10++;
            }
        }
        for (E e12 : eArr) {
            if ((e12 instanceof C3114f) && !(e12 instanceof C3111c)) {
                ((C3114f) e12).h();
            }
        }
        p.b("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }
}
