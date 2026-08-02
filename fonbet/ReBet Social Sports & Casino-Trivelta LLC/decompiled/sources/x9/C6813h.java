package x9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.internal.InterfaceC3128f;
import com.google.android.gms.common.api.internal.InterfaceC3146o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.internal.auth.zzbe;

/* renamed from: x9.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6813h extends C3117a.AbstractC0488a {
    @Override // com.google.android.gms.common.api.C3117a.AbstractC0488a
    public final /* synthetic */ C3117a.f buildClient(Context context, Looper looper, C3180d c3180d, Object obj, InterfaceC3128f interfaceC3128f, InterfaceC3146o interfaceC3146o) {
        return new zzbe(context, looper, c3180d, (C6808c) obj, interfaceC3128f, interfaceC3146o);
    }
}
