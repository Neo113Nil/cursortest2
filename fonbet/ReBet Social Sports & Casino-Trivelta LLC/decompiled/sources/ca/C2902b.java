package ca;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C3180d;
import da.C4048a;

/* renamed from: ca.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2902b extends C3117a.AbstractC0488a {
    @Override // com.google.android.gms.common.api.C3117a.AbstractC0488a
    public final /* bridge */ /* synthetic */ C3117a.f buildClient(Context context, Looper looper, C3180d c3180d, Object obj, f.b bVar, f.c cVar) {
        return new C4048a(context, looper, true, c3180d, C4048a.g(c3180d), bVar, cVar);
    }
}
