package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Jc {
    public abstract void a(int i5);

    public final synchronized void a(Context context) {
        try {
            int b10 = b();
            int libraryApiLevel = AppMetrica.getLibraryApiLevel();
            if (b10 != libraryApiLevel) {
                if (b10 < libraryApiLevel) {
                    SparseArray c2 = c();
                    while (true) {
                        b10++;
                        if (b10 > libraryApiLevel) {
                            break;
                        }
                        Ic ic2 = (Ic) c2.get(b10);
                        if (ic2 != null) {
                            ic2.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
