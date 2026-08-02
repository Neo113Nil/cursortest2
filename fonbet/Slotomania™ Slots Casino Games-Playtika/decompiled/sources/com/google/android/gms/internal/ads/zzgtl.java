package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgtl {
    private final zzgtk zza;

    private zzgtl(zzgtk zzgtkVar) {
        int i = zzgsj.zzb;
        this.zza = zzgtkVar;
    }

    public static zzgtl zza(final zzgsk zzgskVar) {
        return new zzgtl(new zzgtk() { // from class: com.google.android.gms.internal.ads.zzgti
            @Override // com.google.android.gms.internal.ads.zzgtk
            public final /* synthetic */ Iterator zza(zzgtl zzgtlVar, CharSequence charSequence) {
                return new zzgtc(zzgtlVar, charSequence, zzgsk.this);
            }
        });
    }

    public static zzgtl zzb(Pattern pattern) {
        final zzgsp zzgspVar = new zzgsp(pattern);
        zzgsw.zzf(!((zzgso) zzgspVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzgspVar);
        return new zzgtl(new zzgtk() { // from class: com.google.android.gms.internal.ads.zzgtg
            @Override // com.google.android.gms.internal.ads.zzgtk
            public final /* synthetic */ Iterator zza(zzgtl zzgtlVar, CharSequence charSequence) {
                return new zzgtd(zzgtlVar, charSequence, zzgsm.this.zza(charSequence));
            }
        });
    }

    public static zzgtl zzc(int i) {
        final int i2 = Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
        return new zzgtl(new zzgtk(i2) { // from class: com.google.android.gms.internal.ads.zzgth
            @Override // com.google.android.gms.internal.ads.zzgtk
            public final /* synthetic */ Iterator zza(zzgtl zzgtlVar, CharSequence charSequence) {
                return new zzgte(zzgtlVar, charSequence, Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzgtf(this, charSequence);
    }

    public final List zze(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzf.hasNext()) {
            arrayList.add((String) zzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
