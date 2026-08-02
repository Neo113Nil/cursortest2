package x9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C3180d;
import java.util.Collections;
import java.util.List;

/* renamed from: x9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6810e extends C3117a.AbstractC0488a {
    @Override // com.google.android.gms.common.api.C3117a.AbstractC0488a
    public final /* synthetic */ C3117a.f buildClient(Context context, Looper looper, C3180d c3180d, Object obj, f.b bVar, f.c cVar) {
        return new zbe(context, looper, c3180d, (GoogleSignInOptions) obj, bVar, cVar);
    }

    @Override // com.google.android.gms.common.api.C3117a.e
    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.EMPTY_LIST : googleSignInOptions.getScopes();
    }
}
