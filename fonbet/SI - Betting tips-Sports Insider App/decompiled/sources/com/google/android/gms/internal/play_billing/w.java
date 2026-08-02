package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class w implements Comparable, Serializable {
    public abstract int a(w wVar);

    public abstract void b(StringBuilder sb2);

    public abstract void c(StringBuilder sb2);

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            try {
                if (a((w) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
