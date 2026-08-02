package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.ctn;
import defpackage.g6n;
import defpackage.ih2;
import defpackage.wt3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjv extends zzcjs {
    public static final Set f = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat g = new DecimalFormat("#,###");
    public File d;
    public boolean e;

    /* JADX WARN: Code restructure failed: missing block: B:173:0x03cf, code lost:
    
        r1 = r32;
        r11 = r5;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03d5, code lost:
    
        r29.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03dd, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03df, code lost:
    
        r0 = r10.format(r2);
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r1).length());
        r4.append("Preloaded ");
        r4.append(r0);
        r4.append(" bytes from ");
        r4.append(r1);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x040f, code lost:
    
        r14.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0418, code lost:
    
        if (r15.isFile() == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x041a, code lost:
    
        r15.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0426, code lost:
    
        r15.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8 A[LOOP:0: B:3:0x0022->B:12:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0502  */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzcjs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(String str) {
        int i;
        File file;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        FileOutputStream fileOutputStream;
        String str7;
        FileOutputStream fileOutputStream2;
        FileChannel channel;
        ByteBuffer allocate;
        Clock zzk;
        long a;
        String str8;
        String str9;
        int i2;
        String str10;
        ?? r5;
        com.google.android.gms.ads.internal.util.zzbu zzbuVar;
        ReadableByteChannel readableByteChannel;
        int i3;
        String str11;
        ByteBuffer byteBuffer;
        int i4;
        boolean delete;
        zzcjv zzcjvVar = this;
        String str12 = " at ";
        if (zzcjvVar.d == null) {
            zzcjvVar.p(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file2 = zzcjvVar.d;
            if (file2 == null) {
                i = 0;
            } else {
                File[] listFiles = file2.listFiles();
                int length = listFiles.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = i5;
                    int i8 = length;
                    if (!listFiles[i5].getName().endsWith(".done")) {
                        i6++;
                    }
                    i5 = i7 + 1;
                    length = i8;
                }
                i = i6;
            }
            String str13 = str12;
            if (i > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y)).intValue()) {
                File file3 = zzcjvVar.d;
                if (file3 != null) {
                    File[] listFiles2 = file3.listFiles();
                    int length2 = listFiles2.length;
                    int i9 = 0;
                    long j = Long.MAX_VALUE;
                    File file4 = null;
                    while (i9 < length2) {
                        File file5 = listFiles2[i9];
                        int i10 = length2;
                        int i11 = i9;
                        if (!file5.getName().endsWith(".done")) {
                            long lastModified = file5.lastModified();
                            if (lastModified < j) {
                                j = lastModified;
                                file4 = file5;
                            }
                        }
                        i9 = i11 + 1;
                        length2 = i10;
                    }
                    if (file4 != null) {
                        delete = file4.delete();
                        File r = zzcjvVar.r(file4);
                        if (r.isFile()) {
                            delete = r.delete() & delete;
                        }
                        if (delete) {
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi("Unable to expire stream cache");
                            zzcjvVar.p(str, null, "expireFailed", null);
                            return false;
                        }
                        str12 = str13;
                    }
                }
                delete = false;
                if (delete) {
                }
            } else {
                String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
                File file6 = zzcjvVar.d;
                int i13 = zzgar.a;
                file = new File(new File(file6, zzg).getPath());
                File r2 = zzcjvVar.r(file);
                if (file.isFile() && r2.isFile()) {
                    int length3 = (int) file.length();
                    String valueOf = String.valueOf(str);
                    int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzd("Stream cache hit at ".concat(valueOf));
                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new g6n(zzcjvVar, str, file.getAbsolutePath(), length3, 1));
                    return true;
                }
                str2 = str;
                String valueOf2 = String.valueOf(zzcjvVar.d.getAbsolutePath());
                String valueOf3 = String.valueOf(str2);
                Set set = f;
                String concat = valueOf2.concat(valueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(concat)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 36);
                            sb.append("Stream cache already in progress at ");
                            sb.append(str2);
                            String sb2 = sb.toString();
                            int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi(sb2);
                            zzcjvVar.p(str2, file.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(concat);
                        try {
                            str4 = "error";
                            try {
                                HttpURLConnection e = new zzgbk().e(new ih2(str2, 6));
                                int responseCode = e.getResponseCode();
                                if (responseCode >= 400) {
                                    str3 = concat;
                                    try {
                                        String num = Integer.toString(responseCode);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(num).length() + 27);
                                        sb3.append("HTTP request failed. Code: ");
                                        sb3.append(num);
                                        str6 = sb3.toString();
                                        try {
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str2).length());
                                            sb4.append("HTTP status code ");
                                            sb4.append(responseCode);
                                            sb4.append(str13);
                                            sb4.append(str2);
                                            throw new IOException(sb4.toString());
                                        } catch (IOException | RuntimeException e2) {
                                            e = e2;
                                            str5 = "badUrl";
                                            fileOutputStream = null;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream.close();
                                            if (zzcjvVar.e) {
                                            }
                                            if (file.exists()) {
                                            }
                                            zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                            f.remove(str3);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e3) {
                                        e = e3;
                                        str5 = "badUrl";
                                        str6 = null;
                                        fileOutputStream = null;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream.close();
                                        if (zzcjvVar.e) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                        f.remove(str3);
                                        return false;
                                    }
                                }
                                try {
                                    ?? contentLength = e.getContentLength();
                                    if (contentLength < 0) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 55);
                                        sb5.append("Stream cache aborted, missing content-length header at ");
                                        sb5.append(str2);
                                        String sb6 = sb5.toString();
                                        int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzi(sb6);
                                        zzcjvVar.p(str2, file.getAbsolutePath(), "contentLengthMissing", null);
                                        set.remove(concat);
                                        return false;
                                    }
                                    DecimalFormat decimalFormat = g;
                                    String format = decimalFormat.format((long) contentLength);
                                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.z)).intValue();
                                    if (contentLength > intValue) {
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(format).length() + 33 + String.valueOf(str2).length());
                                        sb7.append("Content length ");
                                        sb7.append(format);
                                        sb7.append(" exceeds limit at ");
                                        sb7.append(str2);
                                        String sb8 = sb7.toString();
                                        int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzi(sb8);
                                        StringBuilder sb9 = new StringBuilder(String.valueOf(format).length() + 40);
                                        sb9.append("File too big for full file cache. Size: ");
                                        sb9.append(format);
                                        zzcjvVar.p(str2, file.getAbsolutePath(), "sizeExceeded", sb9.toString());
                                        set.remove(concat);
                                        return false;
                                    }
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(format).length() + 20 + String.valueOf(str2).length());
                                    sb10.append("Caching ");
                                    sb10.append(format);
                                    sb10.append(" bytes from ");
                                    sb10.append(str2);
                                    String sb11 = sb10.toString();
                                    int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzd(sb11);
                                    ReadableByteChannel newChannel = Channels.newChannel(e.getInputStream());
                                    FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                                    try {
                                        channel = fileOutputStream3.getChannel();
                                        allocate = ByteBuffer.allocate(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                                        zzk = com.google.android.gms.ads.internal.zzt.zzk();
                                        a = zzk.a();
                                        str8 = "File too big for full file cache. Size: ";
                                        str9 = concat;
                                    } catch (IOException | RuntimeException e4) {
                                        e = e4;
                                        str7 = concat;
                                    }
                                    try {
                                        com.google.android.gms.ads.internal.util.zzbu zzbuVar2 = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r0)).longValue());
                                        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q0)).longValue();
                                        i2 = 0;
                                        String str14 = contentLength;
                                        while (true) {
                                            int read = newChannel.read(allocate);
                                            if (read < 0) {
                                                break;
                                            }
                                            ?? r22 = i2 + read;
                                            try {
                                                try {
                                                    if (r22 > intValue) {
                                                        String str15 = str8;
                                                        String num2 = Integer.toString(r22);
                                                        StringBuilder sb12 = new StringBuilder(String.valueOf(num2).length() + 40);
                                                        sb12.append(str15);
                                                        sb12.append(num2);
                                                        sb12.toString();
                                                        throw new IOException("stream cache file size limit exceeded");
                                                    }
                                                    try {
                                                        allocate.flip();
                                                        String str16 = str14;
                                                        while (channel.write(allocate) > 0) {
                                                            str16 = str16;
                                                            str9 = str9;
                                                            zzcjvVar = this;
                                                            fileOutputStream3 = fileOutputStream3;
                                                        }
                                                        allocate.clear();
                                                        if (zzk.a() - a > 1000 * longValue) {
                                                            String l = Long.toString(longValue);
                                                            StringBuilder sb13 = new StringBuilder(String.valueOf(l).length() + 29);
                                                            sb13.append("Timeout exceeded. Limit: ");
                                                            sb13.append(l);
                                                            sb13.append(" sec");
                                                            sb13.toString();
                                                            throw new IOException("stream cache time limit exceeded");
                                                        }
                                                        if (zzcjvVar.e) {
                                                            throw new IOException("abort requested");
                                                        }
                                                        if (zzbuVar2.zza()) {
                                                            String absolutePath = file.getAbsolutePath();
                                                            readableByteChannel = newChannel;
                                                            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
                                                            zzbuVar = zzbuVar2;
                                                            String str17 = str16;
                                                            str7 = str9;
                                                            r5 = str17;
                                                            i3 = intValue;
                                                            fileOutputStream2 = fileOutputStream3;
                                                            str11 = str8;
                                                            byteBuffer = allocate;
                                                            i4 = r22;
                                                            str2 = str;
                                                            try {
                                                                ctn ctnVar = new ctn(zzcjvVar, str2, absolutePath, i4, r5);
                                                                str10 = str2;
                                                                try {
                                                                    try {
                                                                        handler.post(ctnVar);
                                                                    } catch (IOException e5) {
                                                                        e = e5;
                                                                        str2 = str10;
                                                                        zzcjvVar = this;
                                                                        str3 = str7;
                                                                        str5 = str4;
                                                                        fileOutputStream = fileOutputStream2;
                                                                        str6 = null;
                                                                        if (e instanceof RuntimeException) {
                                                                            com.google.android.gms.ads.internal.zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                                                        }
                                                                        try {
                                                                            fileOutputStream.close();
                                                                        } catch (IOException | NullPointerException unused) {
                                                                        }
                                                                        if (zzcjvVar.e) {
                                                                            String m = wt3.m("Preload failed for URL \"", str2, new StringBuilder(String.valueOf(str2).length() + 25), "\"");
                                                                            int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                            zzo.zzj(m, e);
                                                                        } else {
                                                                            String m2 = wt3.m("Preload aborted for URL \"", str2, new StringBuilder(String.valueOf(str2).length() + 26), "\"");
                                                                            int i20 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                            zzo.zzh(m2);
                                                                        }
                                                                        if (file.exists() && !file.delete()) {
                                                                            zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                                        }
                                                                        zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                                                        f.remove(str3);
                                                                        return false;
                                                                    }
                                                                } catch (RuntimeException e6) {
                                                                    e = e6;
                                                                    str2 = str10;
                                                                    zzcjvVar = this;
                                                                    str3 = str7;
                                                                    str5 = str4;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    str6 = null;
                                                                    if (e instanceof RuntimeException) {
                                                                    }
                                                                    fileOutputStream.close();
                                                                    if (zzcjvVar.e) {
                                                                    }
                                                                    if (file.exists()) {
                                                                        zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                                    }
                                                                    zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                                                    f.remove(str3);
                                                                    return false;
                                                                }
                                                            } catch (IOException e7) {
                                                                e = e7;
                                                                zzcjvVar = this;
                                                                str3 = str7;
                                                                str5 = str4;
                                                                fileOutputStream = fileOutputStream2;
                                                                str6 = null;
                                                                if (e instanceof RuntimeException) {
                                                                }
                                                                fileOutputStream.close();
                                                                if (zzcjvVar.e) {
                                                                }
                                                                if (file.exists()) {
                                                                }
                                                                zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                                                f.remove(str3);
                                                                return false;
                                                            } catch (RuntimeException e8) {
                                                                e = e8;
                                                                zzcjvVar = this;
                                                                str3 = str7;
                                                                str5 = str4;
                                                                fileOutputStream = fileOutputStream2;
                                                                str6 = null;
                                                                if (e instanceof RuntimeException) {
                                                                }
                                                                fileOutputStream.close();
                                                                if (zzcjvVar.e) {
                                                                }
                                                                if (file.exists()) {
                                                                }
                                                                zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                                                f.remove(str3);
                                                                return false;
                                                            }
                                                        } else {
                                                            String str18 = str16;
                                                            str7 = str9;
                                                            r5 = str18;
                                                            zzbuVar = zzbuVar2;
                                                            readableByteChannel = newChannel;
                                                            i3 = intValue;
                                                            fileOutputStream2 = fileOutputStream3;
                                                            str11 = str8;
                                                            byteBuffer = allocate;
                                                            i4 = r22;
                                                        }
                                                        String str19 = str7;
                                                        str14 = r5;
                                                        str9 = str19;
                                                        zzcjvVar = this;
                                                        i2 = i4;
                                                        allocate = byteBuffer;
                                                        newChannel = readableByteChannel;
                                                        zzbuVar2 = zzbuVar;
                                                        fileOutputStream3 = fileOutputStream2;
                                                        str8 = str11;
                                                        intValue = i3;
                                                    } catch (IOException e9) {
                                                        e = e9;
                                                        str10 = str;
                                                        str7 = str9;
                                                        fileOutputStream2 = fileOutputStream3;
                                                        str2 = str10;
                                                        zzcjvVar = this;
                                                        str3 = str7;
                                                        str5 = str4;
                                                        fileOutputStream = fileOutputStream2;
                                                        str6 = null;
                                                        if (e instanceof RuntimeException) {
                                                        }
                                                        fileOutputStream.close();
                                                        if (zzcjvVar.e) {
                                                        }
                                                        if (file.exists()) {
                                                        }
                                                        zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                                        f.remove(str3);
                                                        return false;
                                                    } catch (RuntimeException e10) {
                                                        e = e10;
                                                        str10 = str;
                                                        str7 = str9;
                                                        fileOutputStream2 = fileOutputStream3;
                                                        str2 = str10;
                                                        zzcjvVar = this;
                                                        str3 = str7;
                                                        str5 = str4;
                                                        fileOutputStream = fileOutputStream2;
                                                        str6 = null;
                                                        if (e instanceof RuntimeException) {
                                                        }
                                                        fileOutputStream.close();
                                                        if (zzcjvVar.e) {
                                                        }
                                                        if (file.exists()) {
                                                        }
                                                        zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                                        f.remove(str3);
                                                        return false;
                                                    }
                                                } catch (IOException | RuntimeException e11) {
                                                    e = e11;
                                                    str3 = str14;
                                                    fileOutputStream = fileOutputStream2;
                                                    str6 = null;
                                                    str5 = r22;
                                                    str2 = zzcjvVar;
                                                    zzcjvVar = this;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream.close();
                                                    if (zzcjvVar.e) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                                    f.remove(str3);
                                                    return false;
                                                }
                                            } catch (IOException | RuntimeException e12) {
                                                e = e12;
                                                str3 = str14;
                                                str6 = " sec";
                                                fileOutputStream = fileOutputStream2;
                                                str5 = r22;
                                                str2 = zzcjvVar;
                                                zzcjvVar = this;
                                                if (e instanceof RuntimeException) {
                                                }
                                                fileOutputStream.close();
                                                if (zzcjvVar.e) {
                                                }
                                                if (file.exists()) {
                                                }
                                                zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                                f.remove(str3);
                                                return false;
                                            }
                                        }
                                    } catch (IOException | RuntimeException e13) {
                                        e = e13;
                                        str2 = str;
                                        str7 = str9;
                                        fileOutputStream2 = fileOutputStream3;
                                        str3 = str7;
                                        str5 = str4;
                                        fileOutputStream = fileOutputStream2;
                                        str6 = null;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream.close();
                                        if (zzcjvVar.e) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                        f.remove(str3);
                                        return false;
                                    }
                                } catch (IOException | RuntimeException e14) {
                                    e = e14;
                                    str3 = concat;
                                    str5 = str4;
                                    str6 = null;
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (zzcjvVar.e) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
                                    f.remove(str3);
                                    return false;
                                }
                            } catch (IOException | RuntimeException e15) {
                                e = e15;
                                str3 = concat;
                            }
                        } catch (IOException | RuntimeException e16) {
                            e = e16;
                            str3 = concat;
                            str4 = "error";
                        }
                    } finally {
                    }
                }
            }
        }
        int i21 = i2;
        str2 = str10;
        zzcjvVar = this;
        try {
            com.google.android.gms.ads.internal.util.client.zzf.zza.post(new g6n(zzcjvVar, str2, file.getAbsolutePath(), i21, 1));
            f.remove(str7);
            return true;
        } catch (IOException e17) {
            e = e17;
            str3 = str7;
            str5 = str4;
            fileOutputStream = fileOutputStream2;
            str6 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream.close();
            if (zzcjvVar.e) {
            }
            if (file.exists()) {
            }
            zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
            f.remove(str3);
            return false;
        } catch (RuntimeException e18) {
            e = e18;
            str3 = str7;
            str5 = str4;
            fileOutputStream = fileOutputStream2;
            str6 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream.close();
            if (zzcjvVar.e) {
            }
            if (file.exists()) {
            }
            zzcjvVar.p(str2, file.getAbsolutePath(), str5, str6);
            f.remove(str3);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void o() {
        this.e = true;
    }

    public final File r(File file) {
        File file2 = this.d;
        String concat = String.valueOf(file.getName()).concat(".done");
        int i = zzgar.a;
        return new File(new File(file2, concat).getPath());
    }
}
