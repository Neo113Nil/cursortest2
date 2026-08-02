package i1;

import android.net.Uri;

/* loaded from: classes.dex */
public interface l {
    static long b(l lVar) {
        return lVar.a("exo_len", -1L);
    }

    static Uri c(l lVar) {
        String d10 = lVar.d("exo_redir", null);
        if (d10 == null) {
            return null;
        }
        return Uri.parse(d10);
    }

    long a(String str, long j10);

    String d(String str, String str2);
}
