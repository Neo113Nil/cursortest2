package com.google.android.gms.internal.ads;

import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzgab {
    public static Object zza(String str, String str2, zzgaa... zzgaaVarArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return Class.forName(str).getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
    }
}
