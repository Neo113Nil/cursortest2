package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, o1 o1Var, long j, Object obj, Object obj2) {
        while (!q1.a(unsafe, o1Var, j, obj, obj2)) {
            if (unsafe.getObject(o1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
