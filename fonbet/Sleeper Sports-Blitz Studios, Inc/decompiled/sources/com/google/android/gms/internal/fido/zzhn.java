package com.google.android.gms.internal.fido;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes7.dex */
public final class zzhn extends zzhp {
    private final String zza;

    zzhn(String str) {
        this.zza = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        int length2;
        zzhp zzhpVar = (zzhp) obj;
        if (zzd(BuiltinOptions.NonMaxSuppressionV5Options) != zzhpVar.zza()) {
            length = zzhpVar.zza();
            length2 = zzd(BuiltinOptions.NonMaxSuppressionV5Options);
        } else {
            String str = this.zza;
            String str2 = ((zzhn) zzhpVar).zza;
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            length = str2.length();
            length2 = str.length();
        }
        return length2 - length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zza.equals(((zzhn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzd(BuiltinOptions.NonMaxSuppressionV5Options)), this.zza});
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzd(BuiltinOptions.NonMaxSuppressionV5Options);
    }
}
