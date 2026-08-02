package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.net.HttpHeaders;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzcir extends zzcio {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcir(zzchb zzchbVar) {
        super(zzchbVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfyu.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String absolutePath = this.zzg.getAbsolutePath();
            String.valueOf(absolutePath);
            String valueOf = String.valueOf(absolutePath);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(valueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String absolutePath2 = this.zzg.getAbsolutePath();
        String.valueOf(absolutePath2);
        String valueOf2 = String.valueOf(absolutePath2);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(valueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        zzfyv zza = zzfyu.zza();
        File file2 = this.zzg;
        String name = file.getName();
        String.valueOf(name);
        return new File(zza.zza(file2, String.valueOf(name).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzl() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x03c0, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03c8, code lost:
    
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03ca, code lost:
    
        r0 = r10.format(r4);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r34).length());
        r5.append(r17);
        r5.append(r0);
        r5.append(" bytes from ");
        r5.append(r34);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03fc, code lost:
    
        r13.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0406, code lost:
    
        if (r7.isFile() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0408, code lost:
    
        r7.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0414, code lost:
    
        r7.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8 A[LOOP:0: B:3:0x0022->B:12:0x00c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0480  */
    @Override // com.google.android.gms.internal.ads.zzcio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(final String str) {
        int i;
        String concat;
        String str2;
        File file;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        String str6;
        String str7;
        int i2;
        int i3;
        ByteBuffer byteBuffer;
        com.google.android.gms.ads.internal.util.zzbu zzbuVar;
        ReadableByteChannel readableByteChannel;
        boolean delete;
        String str8 = "Preloaded ";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file2 = this.zzg;
            if (file2 == null) {
                i = 0;
            } else {
                File[] listFiles = file2.listFiles();
                int length = listFiles.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = i4;
                    int i7 = length;
                    if (!listFiles[i4].getName().endsWith(".done")) {
                        i5++;
                    }
                    i4 = i6 + 1;
                    length = i7;
                }
                i = i5;
            }
            String str9 = str8;
            if (i > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzu)).intValue()) {
                File file3 = this.zzg;
                if (file3 != null) {
                    File[] listFiles2 = file3.listFiles();
                    int length2 = listFiles2.length;
                    int i8 = 0;
                    long j = Long.MAX_VALUE;
                    File file4 = null;
                    while (i8 < length2) {
                        File file5 = listFiles2[i8];
                        int i9 = length2;
                        int i10 = i8;
                        if (!file5.getName().endsWith(".done")) {
                            long lastModified = file5.lastModified();
                            if (lastModified < j) {
                                j = lastModified;
                                file4 = file5;
                            }
                        }
                        i8 = i10 + 1;
                        length2 = i9;
                    }
                    if (file4 != null) {
                        delete = file4.delete();
                        File zza = zza(file4);
                        if (zza.isFile()) {
                            delete = zza.delete() & delete;
                        }
                        if (delete) {
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to expire stream cache");
                            zzq(str, null, "expireFailed", null);
                            return false;
                        }
                        str8 = str9;
                    }
                }
                delete = false;
                if (delete) {
                }
            } else {
                File file6 = new File(zzfyu.zza().zza(this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
                File zza2 = zza(file6);
                if (file6.isFile() && zza2.isFile()) {
                    int length3 = (int) file6.length();
                    String.valueOf(str);
                    String valueOf = String.valueOf(str);
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Stream cache hit at ".concat(valueOf));
                    zzo(str, file6.getAbsolutePath(), length3);
                    return true;
                }
                String absolutePath = this.zzg.getAbsolutePath();
                String.valueOf(absolutePath);
                String.valueOf(str);
                String valueOf2 = String.valueOf(absolutePath);
                String valueOf3 = String.valueOf(str);
                Set set = zze;
                concat = valueOf2.concat(valueOf3);
                synchronized (set) {
                    if (set.contains(concat)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
                        sb.append("Stream cache already in progress at ");
                        sb.append(str);
                        String sb2 = sb.toString();
                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        zzq(str, file6.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(concat);
                    try {
                        str2 = "error";
                        try {
                            try {
                                HttpURLConnection zzh = zzfzs.zza().zzh(new zzfzi() { // from class: com.google.android.gms.internal.ads.zzciq
                                    @Override // com.google.android.gms.internal.ads.zzfzi
                                    public final /* synthetic */ URLConnection zza() {
                                        int i14 = zzcir.zzd;
                                        com.google.android.gms.ads.internal.zzt.zzq();
                                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzao)).intValue();
                                        URL url = new URL(str);
                                        int i15 = 0;
                                        while (true) {
                                            i15++;
                                            if (i15 > 20) {
                                                throw new IOException("Too many redirects (20)");
                                            }
                                            int i16 = zzfzb.zzb;
                                            URLConnection openConnection = url.openConnection();
                                            openConnection.setConnectTimeout(intValue);
                                            openConnection.setReadTimeout(intValue);
                                            if (!(openConnection instanceof HttpURLConnection)) {
                                                throw new IOException("Invalid protocol.");
                                            }
                                            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                            zzlVar.zza(httpURLConnection, null);
                                            httpURLConnection.setInstanceFollowRedirects(false);
                                            int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                            zzlVar.zzc(httpURLConnection, httpUrlConnectionGetResponseCode);
                                            if (httpUrlConnectionGetResponseCode / 100 != 3) {
                                                return httpURLConnection;
                                            }
                                            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                                            if (headerField == null) {
                                                throw new IOException("Missing Location header in redirect");
                                            }
                                            URL url2 = new URL(url, headerField);
                                            String protocol = url2.getProtocol();
                                            if (protocol == null) {
                                                throw new IOException("Protocol is null");
                                            }
                                            if (!protocol.equals("http") && !protocol.equals("https")) {
                                                throw new IOException("Unsupported scheme: ".concat(protocol));
                                            }
                                            String concat2 = "Redirecting to ".concat(headerField);
                                            int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzd(concat2);
                                            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                            url = url2;
                                        }
                                    }
                                }, 265, -1);
                                if (zzh instanceof HttpURLConnection) {
                                    HttpURLConnection httpURLConnection = zzh;
                                    int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(zzh);
                                    if (httpUrlConnectionGetResponseCode >= 400) {
                                        try {
                                            String num = Integer.toString(httpUrlConnectionGetResponseCode);
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(num).length() + 27);
                                            sb3.append("HTTP request failed. Code: ");
                                            sb3.append(num);
                                            str4 = sb3.toString();
                                            try {
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(httpUrlConnectionGetResponseCode).length() + 21 + String.valueOf(str).length());
                                                sb4.append("HTTP status code ");
                                                sb4.append(httpUrlConnectionGetResponseCode);
                                                sb4.append(" at ");
                                                sb4.append(str);
                                                throw new IOException(sb4.toString());
                                            } catch (IOException | RuntimeException e) {
                                                e = e;
                                                str6 = "badUrl";
                                                file = file6;
                                                fileOutputStream = null;
                                                str5 = str6;
                                                if (e instanceof RuntimeException) {
                                                }
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException | NullPointerException unused) {
                                                }
                                                if (this.zzh) {
                                                }
                                                if (file.exists()) {
                                                }
                                                zzq(str, file.getAbsolutePath(), str5, str4);
                                                zze.remove(concat);
                                                return false;
                                            }
                                        } catch (IOException | RuntimeException e2) {
                                            e = e2;
                                            str3 = "badUrl";
                                            file = file6;
                                            str4 = null;
                                            str6 = str3;
                                            fileOutputStream = null;
                                            str5 = str6;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream.close();
                                            if (this.zzh) {
                                            }
                                            if (file.exists()) {
                                            }
                                            zzq(str, file.getAbsolutePath(), str5, str4);
                                            zze.remove(concat);
                                            return false;
                                        }
                                    }
                                }
                                int contentLength = zzh.getContentLength();
                                if (contentLength < 0) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 55);
                                    sb5.append("Stream cache aborted, missing content-length header at ");
                                    sb5.append(str);
                                    String sb6 = sb5.toString();
                                    int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb6);
                                    zzq(str, file6.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(concat);
                                    return false;
                                }
                                DecimalFormat decimalFormat = zzf;
                                String format = decimalFormat.format(contentLength);
                                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzv)).intValue();
                                if (contentLength > intValue) {
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(format).length() + 33 + String.valueOf(str).length());
                                    sb7.append("Content length ");
                                    sb7.append(format);
                                    sb7.append(" exceeds limit at ");
                                    sb7.append(str);
                                    String sb8 = sb7.toString();
                                    int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb8);
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(format).length() + 40);
                                    sb9.append("File too big for full file cache. Size: ");
                                    sb9.append(format);
                                    zzq(str, file6.getAbsolutePath(), "sizeExceeded", sb9.toString());
                                    set.remove(concat);
                                    return false;
                                }
                                StringBuilder sb10 = new StringBuilder(String.valueOf(format).length() + 20 + String.valueOf(str).length());
                                sb10.append("Caching ");
                                sb10.append(format);
                                sb10.append(" bytes from ");
                                sb10.append(str);
                                String sb11 = sb10.toString();
                                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb11);
                                ReadableByteChannel newChannel = Channels.newChannel(AdMobNetworkBridge.urlConnectionGetInputStream(zzh));
                                file = file6;
                                try {
                                    FileOutputStream fileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file);
                                    try {
                                        try {
                                            FileChannel channel = fileOutputStreamCtor.getChannel();
                                            ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
                                            long currentTimeMillis = zzk.currentTimeMillis();
                                            com.google.android.gms.ads.internal.util.zzbu zzbuVar2 = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzan)).longValue());
                                            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzam)).longValue();
                                            i2 = 0;
                                            while (true) {
                                                int read = newChannel.read(allocate);
                                                if (read < 0) {
                                                    break;
                                                }
                                                i2 += read;
                                                try {
                                                    try {
                                                        if (i2 > intValue) {
                                                            String num2 = Integer.toString(i2);
                                                            StringBuilder sb12 = new StringBuilder(String.valueOf(num2).length() + 40);
                                                            sb12.append("File too big for full file cache. Size: ");
                                                            sb12.append(num2);
                                                            sb12.toString();
                                                            throw new IOException("stream cache file size limit exceeded");
                                                        }
                                                        allocate.flip();
                                                        while (channel.write(allocate) > 0) {
                                                        }
                                                        allocate.clear();
                                                        if (zzk.currentTimeMillis() - currentTimeMillis > 1000 * longValue) {
                                                            String l = Long.toString(longValue);
                                                            StringBuilder sb13 = new StringBuilder(String.valueOf(l).length() + 29);
                                                            sb13.append("Timeout exceeded. Limit: ");
                                                            sb13.append(l);
                                                            sb13.append(" sec");
                                                            sb13.toString();
                                                            throw new IOException("stream cache time limit exceeded");
                                                        }
                                                        if (this.zzh) {
                                                            throw new IOException("abort requested");
                                                        }
                                                        if (zzbuVar2.zza()) {
                                                            zzbuVar = zzbuVar2;
                                                            byteBuffer = allocate;
                                                            i3 = contentLength;
                                                            readableByteChannel = newChannel;
                                                            com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcii(this, str, file.getAbsolutePath(), i2, i3, false));
                                                        } else {
                                                            i3 = contentLength;
                                                            byteBuffer = allocate;
                                                            zzbuVar = zzbuVar2;
                                                            readableByteChannel = newChannel;
                                                        }
                                                        contentLength = i3;
                                                        zzbuVar2 = zzbuVar;
                                                        allocate = byteBuffer;
                                                        newChannel = readableByteChannel;
                                                    } catch (IOException | RuntimeException e3) {
                                                        e = e3;
                                                        str4 = channel;
                                                        fileOutputStream = fileOutputStreamCtor;
                                                        str5 = intValue;
                                                        if (e instanceof RuntimeException) {
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.zzh) {
                                                        }
                                                        if (file.exists()) {
                                                        }
                                                        zzq(str, file.getAbsolutePath(), str5, str4);
                                                        zze.remove(concat);
                                                        return false;
                                                    }
                                                } catch (IOException | RuntimeException e4) {
                                                    e = e4;
                                                    fileOutputStream = fileOutputStreamCtor;
                                                    str7 = intValue;
                                                    str4 = null;
                                                    str5 = str7;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                    }
                                                    if (file.exists()) {
                                                    }
                                                    zzq(str, file.getAbsolutePath(), str5, str4);
                                                    zze.remove(concat);
                                                    return false;
                                                }
                                            }
                                        } catch (RuntimeException e5) {
                                            e = e5;
                                            fileOutputStream = fileOutputStreamCtor;
                                            str7 = str2;
                                            str4 = null;
                                            str5 = str7;
                                            if (e instanceof RuntimeException) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                            }
                                            fileOutputStream.close();
                                            if (this.zzh) {
                                                StringBuilder sb14 = new StringBuilder(String.valueOf(str).length() + 25);
                                                sb14.append("Preload failed for URL \"");
                                                sb14.append(str);
                                                sb14.append("\"");
                                                String sb15 = sb14.toString();
                                                int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzj(sb15, e);
                                            } else {
                                                StringBuilder sb16 = new StringBuilder(String.valueOf(str).length() + 26);
                                                sb16.append("Preload aborted for URL \"");
                                                sb16.append(str);
                                                sb16.append("\"");
                                                String sb17 = sb16.toString();
                                                int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzh(sb17);
                                            }
                                            if (file.exists() && !file.delete()) {
                                                String absolutePath2 = file.getAbsolutePath();
                                                String.valueOf(absolutePath2);
                                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(absolutePath2)));
                                            }
                                            zzq(str, file.getAbsolutePath(), str5, str4);
                                            zze.remove(concat);
                                            return false;
                                        }
                                    } catch (IOException e6) {
                                        e = e6;
                                        fileOutputStream = fileOutputStreamCtor;
                                        str7 = str2;
                                        str4 = null;
                                        str5 = str7;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream.close();
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                            String absolutePath22 = file.getAbsolutePath();
                                            String.valueOf(absolutePath22);
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(absolutePath22)));
                                        }
                                        zzq(str, file.getAbsolutePath(), str5, str4);
                                        zze.remove(concat);
                                        return false;
                                    }
                                } catch (IOException e7) {
                                    e = e7;
                                    str3 = str2;
                                    str4 = null;
                                    str6 = str3;
                                    fileOutputStream = null;
                                    str5 = str6;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str5, str4);
                                    zze.remove(concat);
                                    return false;
                                } catch (RuntimeException e8) {
                                    e = e8;
                                    str3 = str2;
                                    str4 = null;
                                    str6 = str3;
                                    fileOutputStream = null;
                                    str5 = str6;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str5, str4);
                                    zze.remove(concat);
                                    return false;
                                }
                            } catch (IOException | RuntimeException e9) {
                                e = e9;
                                file = file6;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            file = file6;
                            str3 = str2;
                            str4 = null;
                            str6 = str3;
                            fileOutputStream = null;
                            str5 = str6;
                            if (e instanceof RuntimeException) {
                            }
                            fileOutputStream.close();
                            if (this.zzh) {
                            }
                            if (file.exists()) {
                            }
                            zzq(str, file.getAbsolutePath(), str5, str4);
                            zze.remove(concat);
                            return false;
                        } catch (RuntimeException e11) {
                            e = e11;
                            file = file6;
                            str3 = str2;
                            str4 = null;
                            str6 = str3;
                            fileOutputStream = null;
                            str5 = str6;
                            if (e instanceof RuntimeException) {
                            }
                            fileOutputStream.close();
                            if (this.zzh) {
                            }
                            if (file.exists()) {
                            }
                            zzq(str, file.getAbsolutePath(), str5, str4);
                            zze.remove(concat);
                            return false;
                        }
                    } catch (IOException | RuntimeException e12) {
                        e = e12;
                        str2 = "error";
                    }
                }
            }
        }
        zzo(str, file.getAbsolutePath(), i2);
        zze.remove(concat);
        return true;
    }
}
