package com.google.android.gms.internal.fido;

import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes7.dex */
public final class zzhh extends zzhp {
    private final boolean zza;

    zzhh(boolean z) {
        this.zza = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zzd(MessagePack.Code.NEGFIXINT_PREFIX) != zzhpVar.zza()) {
            return zzd(MessagePack.Code.NEGFIXINT_PREFIX) - zzhpVar.zza();
        }
        return (true != this.zza ? 20 : 21) - (true == ((zzhh) zzhpVar).zza ? 21 : 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zza == ((zzhh) obj).zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzd(MessagePack.Code.NEGFIXINT_PREFIX)), Boolean.valueOf(this.zza)});
    }

    public final String toString() {
        return Boolean.toString(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd(MessagePack.Code.NEGFIXINT_PREFIX);
    }
}
