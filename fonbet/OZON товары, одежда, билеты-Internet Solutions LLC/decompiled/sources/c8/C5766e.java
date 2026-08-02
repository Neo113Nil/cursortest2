package c8;

import S7.q;
import android.net.Uri;
import b8.j;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.z;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import u3.InterfaceC9928b;

/* renamed from: c8.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5766e implements z.a, r.a {
    public static void a(String str, String str2, String str3, StringBuilder sb2, boolean z11) {
        sb2.append(z11);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static boolean c(Uri uri, String str, int i11, String str2) {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, str);
        return Intrinsics.d(C7714v.Q(i11, pathSegments), str2);
    }

    @Override // com.google.crypto.tink.internal.z.a
    public G b(q qVar) {
        return C5767f.a((j) qVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
