package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgze {
    public static final FileOutputStream zza(File file, zzgwj zzgwjVar, zzgyv zzgyvVar) throws IOException {
        return new FileOutputStream(file, zzgwjVar.contains(zzgzd.APPEND));
    }
}
