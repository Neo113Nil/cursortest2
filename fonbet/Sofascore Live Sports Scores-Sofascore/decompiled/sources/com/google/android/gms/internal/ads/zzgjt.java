package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgjt extends zzgka {
    public final Context f;

    public zzgjt(zzaya zzayaVar, zzgiw zzgiwVar, Context context, zzgrh zzgrhVar) {
        super("H0YdM17mgrrozxD0WVa3M40/jGgbp6xsWEqC8q+HAngxqz5clYs9XrZGt0ruoMVC", "vTRbdp+bvCvcqmoB2mkwDXNuKnz+mZ0QzFSaQEl2hgg=", zzayaVar, zzgiwVar, zzgrhVar.a(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        this.f = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void a(Method method, zzaya zzayaVar) {
        Object[] objArr = (Object[]) method.invoke("", this.f);
        objArr.getClass();
        synchronized (zzayaVar) {
            long longValue = ((Long) objArr[0]).longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).K0(longValue);
            long longValue2 = ((Long) objArr[1]).longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).d0(longValue2);
        }
    }
}
