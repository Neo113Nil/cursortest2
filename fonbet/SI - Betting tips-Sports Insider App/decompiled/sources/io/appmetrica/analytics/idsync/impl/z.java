package io.appmetrica.analytics.idsync.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ String a(int i5) {
        if (i5 == 1) {
            return "none";
        }
        if (i5 == 2) {
            return "success";
        }
        if (i5 == 3) {
            return "incompatible_precondition";
        }
        if (i5 == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "FAILURE" : "INCOMPATIBLE_PRECONDITION" : "SUCCESS" : "NONE";
    }
}
