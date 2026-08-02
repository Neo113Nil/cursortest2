package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzbi extends zzbs {
    public static boolean zza;
    private AdvertisingIdClient.Info zzb;
    private final zzfo zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    zzbi(zzbv zzbvVar) {
        super(zzbvVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0163, code lost:
    
        if (r0 == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: all -> 0x001b, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0012, B:9:0x0032, B:12:0x003c, B:15:0x0165, B:16:0x0044, B:17:0x004e, B:34:0x0168, B:85:0x0178, B:87:0x0038, B:92:0x001f, B:94:0x0023, B:89:0x002c, B:95:0x0179, B:19:0x004f, B:64:0x0054, B:66:0x006c, B:69:0x0085, B:70:0x008e, B:72:0x0093, B:77:0x009d, B:22:0x00b1, B:27:0x00c2, B:29:0x00d0, B:30:0x00db, B:31:0x00df, B:35:0x00d5, B:36:0x00e2, B:38:0x00ec, B:39:0x00f6, B:40:0x00f1, B:41:0x00bc, B:42:0x00fc, B:44:0x010a, B:45:0x0115, B:47:0x011f, B:49:0x0121, B:51:0x0129, B:53:0x012b, B:55:0x0133, B:56:0x0145, B:58:0x0153, B:59:0x015e, B:60:0x0162, B:61:0x0158, B:62:0x010f, B:67:0x00ac), top: B:2:0x0001, inners: #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0038 A[Catch: all -> 0x001b, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0012, B:9:0x0032, B:12:0x003c, B:15:0x0165, B:16:0x0044, B:17:0x004e, B:34:0x0168, B:85:0x0178, B:87:0x0038, B:92:0x001f, B:94:0x0023, B:89:0x002c, B:95:0x0179, B:19:0x004f, B:64:0x0054, B:66:0x006c, B:69:0x0085, B:70:0x008e, B:72:0x0093, B:77:0x009d, B:22:0x00b1, B:27:0x00c2, B:29:0x00d0, B:30:0x00db, B:31:0x00df, B:35:0x00d5, B:36:0x00e2, B:38:0x00ec, B:39:0x00f6, B:40:0x00f1, B:41:0x00bc, B:42:0x00fc, B:44:0x010a, B:45:0x0115, B:47:0x011f, B:49:0x0121, B:51:0x0129, B:53:0x012b, B:55:0x0133, B:56:0x0145, B:58:0x0153, B:59:0x015e, B:60:0x0162, B:61:0x0158, B:62:0x010f, B:67:0x00ac), top: B:2:0x0001, inners: #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized AdvertisingIdClient.Info zzc() {
        AdvertisingIdClient.Info info;
        String id2;
        String str;
        IOException e11;
        FileInputStream openFileInput;
        byte[] bArr;
        int read;
        boolean zzf;
        if (this.zzc.zzc(1000L)) {
            this.zzc.zzb();
            String str2 = null;
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(zzo());
            } catch (IllegalStateException unused) {
                zzR("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
                info = null;
                AdvertisingIdClient.Info info2 = this.zzb;
                if (info == null) {
                }
                if (!TextUtils.isEmpty(id2)) {
                }
                this.zzb = info;
                return this.zzb;
            } catch (Exception e12) {
                if (!zza) {
                    zza = true;
                    zzS("Error getting advertiser id", e12);
                }
                info = null;
                AdvertisingIdClient.Info info22 = this.zzb;
                if (info == null) {
                }
                if (!TextUtils.isEmpty(id2)) {
                }
                this.zzb = info;
                return this.zzb;
            }
            AdvertisingIdClient.Info info222 = this.zzb;
            id2 = info == null ? null : info.getId();
            if (!TextUtils.isEmpty(id2)) {
                String zzb = zzv().zzb();
                synchronized (this.zzf) {
                    try {
                        if (!this.zze) {
                            try {
                                openFileInput = zzo().openFileInput("gaClientIdData");
                                bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
                                read = openFileInput.read(bArr, 0, UserVerificationMethods.USER_VERIFY_PATTERN);
                            } catch (FileNotFoundException unused2) {
                            } catch (IOException e13) {
                                str = null;
                                e11 = e13;
                            }
                            if (openFileInput.available() > 0) {
                                zzR("Hash file seems corrupted, deleting it.");
                                openFileInput.close();
                                zzo().deleteFile("gaClientIdData");
                            } else if (read <= 0) {
                                zzO("Hash file is empty.");
                                openFileInput.close();
                            } else {
                                str = new String(bArr, 0, read);
                                try {
                                    openFileInput.close();
                                } catch (FileNotFoundException unused3) {
                                } catch (IOException e14) {
                                    e11 = e14;
                                    zzS("Error reading Hash file, deleting it", e11);
                                    zzo().deleteFile("gaClientIdData");
                                }
                                str2 = str;
                            }
                            this.zzd = str2;
                            this.zze = true;
                        } else if (TextUtils.isEmpty(this.zzd)) {
                            if (info222 != null) {
                                str2 = info222.getId();
                            }
                            if (str2 == null) {
                                String valueOf = String.valueOf(id2);
                                String valueOf2 = String.valueOf(zzb);
                                zzf = zzf(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                            } else {
                                String valueOf3 = String.valueOf(zzb);
                                this.zzd = zze(valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2));
                            }
                        }
                        String valueOf4 = String.valueOf(id2);
                        String valueOf5 = String.valueOf(zzb);
                        String zze = zze(valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4));
                        if (TextUtils.isEmpty(zze)) {
                            zzJ("Failed to reset client id on adid change. Not using adid");
                            this.zzb = new AdvertisingIdClient.Info("", false);
                        } else if (!zze.equals(this.zzd)) {
                            if (!TextUtils.isEmpty(this.zzd)) {
                                zzO("Resetting the client id because Advertising Id changed.");
                                zzb = zzv().zze();
                                zzP("New client Id", zzb);
                            }
                            String valueOf6 = String.valueOf(id2);
                            String valueOf7 = String.valueOf(zzb);
                            zzf = zzf(valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6));
                        }
                    } finally {
                    }
                }
            }
            this.zzb = info;
        }
        return this.zzb;
    }

    private static String zze(String str) {
        MessageDigest zze = zzfs.zze("MD5");
        if (zze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) {
        try {
            String zze = zze(str);
            zzO("Storing hashed adid.");
            FileOutputStream openFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze.getBytes());
            openFileOutput.close();
            this.zzd = zze;
            return true;
        } catch (IOException e11) {
            zzK("Error creating hash file", e11);
            return false;
        }
    }

    public final String zza() {
        zzW();
        AdvertisingIdClient.Info zzc = zzc();
        String id2 = zzc != null ? zzc.getId() : null;
        if (TextUtils.isEmpty(id2)) {
            return null;
        }
        return id2;
    }

    public final boolean zzb() {
        zzW();
        AdvertisingIdClient.Info zzc = zzc();
        return (zzc == null || zzc.isLimitAdTrackingEnabled()) ? false : true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }
}
