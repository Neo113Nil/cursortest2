package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes9.dex */
public final class zzcn extends zzbs {
    private volatile String zza;
    private Future<String> zzb;

    protected zzcn(zzbv zzbvVar) {
        super(zzbvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @VisibleForTesting
    public final String zzf() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context zza = zzq().zza();
            Preconditions.checkNotEmpty(lowerCase);
            Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        zzP("Storing clientId", lowerCase);
                        fileOutputStream = zza.openFileOutput("gaClientId", 0);
                        fileOutputStream.write(lowerCase.getBytes());
                        try {
                            fileOutputStream.close();
                            return lowerCase;
                        } catch (IOException e11) {
                            zzK("Failed to close clientId writing stream", e11);
                            return lowerCase;
                        }
                    } catch (FileNotFoundException e12) {
                        zzK("Error creating clientId file", e12);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                e = e13;
                                zzK("Failed to close clientId writing stream", e);
                                return "0";
                            }
                        }
                        return "0";
                    }
                } catch (IOException e14) {
                    zzK("Error writing to clientId file", e14);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e15) {
                            e = e15;
                            zzK("Failed to close clientId writing stream", e);
                            return "0";
                        }
                    }
                    return "0";
                }
            } finally {
            }
        } catch (Exception e16) {
            zzK("Error saving clientId file", e16);
            return "0";
        }
    }

    public final String zzb() {
        String str;
        zzW();
        synchronized (this) {
            try {
                if (this.zza == null) {
                    this.zzb = zzq().zzg(new zzcl(this));
                }
                Future<String> future = this.zzb;
                if (future != null) {
                    try {
                        this.zza = future.get();
                    } catch (InterruptedException e11) {
                        zzS("ClientId loading or generation was interrupted", e11);
                        this.zza = "0";
                    } catch (ExecutionException e12) {
                        zzK("Failed to load or generate client id", e12);
                        this.zza = "0";
                    }
                    if (this.zza == null) {
                        this.zza = "0";
                    }
                    zzP("Loaded clientId", this.zza);
                    this.zzb = null;
                }
                str = this.zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[Catch: IOException -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0034, blocks: (B:10:0x0030, B:25:0x004c, B:39:0x0077, B:35:0x0089), top: B:3:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077 A[Catch: IOException -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0034, blocks: (B:10:0x0030, B:25:0x004c, B:39:0x0077, B:35:0x0089), top: B:3:0x0012 }] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.IOException, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0089 -> B:11:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0075 -> B:13:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0077 -> B:11:0x008c). Please report as a decompilation issue!!! */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final String zzc() {
        FileInputStream fileInputStream;
        byte[] bArr;
        int read;
        String e11 = "gaClientId";
        Context zza = zzq().zza();
        Preconditions.checkNotMainThread("ClientId should be loaded from worker thread");
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        FileInputStream fileInputStream2 = null;
        try {
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
        }
        try {
            try {
                fileInputStream = zza.openFileInput("gaClientId");
            } catch (IOException e12) {
                e11 = e12;
                zzK("Failed to close client id reading stream", e11);
            }
            try {
                bArr = new byte[36];
                read = fileInputStream.read(bArr, 0, 36);
            } catch (FileNotFoundException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                    e11 = e11;
                }
                if (str != null) {
                }
            } catch (IOException e13) {
                e = e13;
                zzK("Error reading client id file, deleting it", e);
                zza.deleteFile(e11);
                if (fileInputStream != null) {
                    fileInputStream.close();
                    e11 = e11;
                }
                if (str != null) {
                }
            }
        } catch (FileNotFoundException unused2) {
            fileInputStream = null;
            if (fileInputStream != null) {
            }
            if (str != null) {
            }
        } catch (IOException e14) {
            e = e14;
            fileInputStream = null;
            zzK("Error reading client id file, deleting it", e);
            zza.deleteFile(e11);
            if (fileInputStream != null) {
            }
            if (str != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e15) {
                    zzK("Failed to close client id reading stream", e15);
                }
            }
            throw th;
        }
        if (fileInputStream.available() > 0) {
            zzR("clientId file seems corrupted, deleting it.");
            fileInputStream.close();
            zza.deleteFile("gaClientId");
            fileInputStream.close();
            e11 = e11;
        } else {
            if (read >= 14) {
                fileInputStream.close();
                String str2 = new String(bArr, 0, read);
                zzP("Read client id from disk", str2);
                try {
                    fileInputStream.close();
                    e11 = e11;
                } catch (IOException e16) {
                    zzK("Failed to close client id reading stream", e16);
                    e11 = e16;
                }
                str = str2;
                return str != null ? zzf() : str;
            }
            zzR("clientId file is empty, deleting it.");
            fileInputStream.close();
            zza.deleteFile("gaClientId");
            fileInputStream.close();
            e11 = e11;
        }
        if (str != null) {
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }

    final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().zzg(new zzcm(this));
        }
        return zzb();
    }
}
