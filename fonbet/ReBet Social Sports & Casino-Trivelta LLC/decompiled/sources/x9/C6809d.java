package x9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.internal.p000authapi.zbd;

/* renamed from: x9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6809d extends C3117a.AbstractC0488a {
    @Override // com.google.android.gms.common.api.C3117a.AbstractC0488a
    public final /* synthetic */ C3117a.f buildClient(Context context, Looper looper, C3180d c3180d, Object obj, f.b bVar, f.c cVar) {
        return new zbd(context, looper, c3180d, (C6812g) obj, bVar, cVar);
    }
}
