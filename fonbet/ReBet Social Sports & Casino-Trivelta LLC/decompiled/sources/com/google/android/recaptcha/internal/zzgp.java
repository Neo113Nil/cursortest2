package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzgp implements zzgx {

    @NotNull
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) {
        String joinToString$default;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            joinToString$default = ArraysKt.joinToString$default((int[]) zza2, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, Charsets.UTF_8);
            } else if (zza2 instanceof long[]) {
                joinToString$default = ArraysKt.joinToString$default((long[]) zza2, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (zza2 instanceof short[]) {
                joinToString$default = ArraysKt.joinToString$default((short[]) zza2, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (zza2 instanceof float[]) {
                joinToString$default = ArraysKt.joinToString$default((float[]) zza2, (CharSequence) ",", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (zza2 instanceof double[]) {
                joinToString$default = ArraysKt.joinToString$default((double[]) zza2, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                joinToString$default = ArraysKt.joinToString$default((Object[]) zza2, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                joinToString$default = CollectionsKt.joinToString$default((Iterable) zza2, ",", "[", "]", 0, null, null, 56, null);
            }
            joinToString$default = str;
        }
        zzgdVar.zzc().zze(i10, joinToString$default);
    }
}
