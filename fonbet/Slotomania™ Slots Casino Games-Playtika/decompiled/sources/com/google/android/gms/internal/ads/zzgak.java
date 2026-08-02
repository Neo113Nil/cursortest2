package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgak implements Serializer {
    public static final zzgak zza = new zzgak();
    private static final zzgah zzb;

    static {
        zzgah zzd = zzgah.zzd();
        Intrinsics.checkNotNullExpressionValue(zzd, "getDefaultInstance(...)");
        zzb = zzd;
    }

    private zzgak() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) {
        try {
            zzgah zzc = zzgah.zzc(inputStream);
            Intrinsics.checkNotNull(zzc);
            return zzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) {
        ((zzgah) obj).zzaO(outputStream);
        return Unit.INSTANCE;
    }
}
