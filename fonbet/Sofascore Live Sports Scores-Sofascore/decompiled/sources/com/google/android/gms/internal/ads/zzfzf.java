package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import defpackage.wt3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfzf {
    public static boolean a(zzbei zzbeiVar) {
        int ordinal = zzbeiVar.ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzbei b(Context context, zzfyi zzfyiVar) {
        zzbei zzbeiVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        boolean exists = file.exists();
        zzbei zzbeiVar2 = zzbei.X86;
        zzbei zzbeiVar3 = zzbei.ARM7;
        zzbei zzbeiVar4 = zzbei.X86_64;
        zzbei zzbeiVar5 = zzbei.ARM64;
        zzbei zzbeiVar6 = zzbei.RISCV64;
        zzbei zzbeiVar7 = zzbei.UNKNOWN;
        zzbei zzbeiVar8 = zzbei.UNSUPPORTED;
        if (!exists) {
            if (zzfyiVar != null) {
                zzfyiVar.d(5017, "No lib/");
                zzbeiVar = zzbeiVar7;
                if (zzbeiVar != zzbeiVar7) {
                    HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                    String property = System.getProperty("os.arch");
                    if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                        try {
                            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                            if (strArr != null && strArr.length > 0) {
                                property = strArr[0];
                            }
                        } catch (IllegalAccessException e) {
                            if (zzfyiVar != null) {
                                zzfyiVar.c(2024, 0L, e);
                            }
                        } catch (NoSuchFieldException e2) {
                            if (zzfyiVar != null) {
                                zzfyiVar.c(2024, 0L, e2);
                            }
                        }
                        property = Build.CPU_ABI;
                        if (property == null) {
                            property = Build.CPU_ABI2;
                        }
                    }
                    if (TextUtils.isEmpty(property)) {
                        c(null, "Empty dev arch", zzfyiVar);
                    } else if (!property.equalsIgnoreCase("i686") && !property.equalsIgnoreCase("x86")) {
                        if (property.equalsIgnoreCase("x86_64")) {
                            zzbeiVar2 = zzbeiVar4;
                        } else if (property.equalsIgnoreCase("arm64-v8a")) {
                            zzbeiVar2 = zzbeiVar5;
                        } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                            zzbeiVar2 = zzbeiVar3;
                        } else if (property.equalsIgnoreCase("riscv64")) {
                            zzbeiVar2 = zzbeiVar6;
                        } else {
                            c(null, property, zzfyiVar);
                        }
                    }
                    zzbeiVar2 = zzbeiVar8;
                } else {
                    zzbeiVar2 = zzbeiVar;
                }
                if (zzfyiVar != null) {
                    zzfyiVar.d(5018, zzbeiVar2.name());
                }
                return zzbeiVar2;
            }
            zzfyiVar = null;
            zzbeiVar = zzbeiVar7;
            if (zzbeiVar != zzbeiVar7) {
            }
            if (zzfyiVar != null) {
            }
            return zzbeiVar2;
        }
        File[] listFiles = file.listFiles(new zzhau(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            if (zzfyiVar != null) {
                zzfyiVar.d(5017, "No .so");
                zzbeiVar = zzbeiVar7;
                if (zzbeiVar != zzbeiVar7) {
                }
                if (zzfyiVar != null) {
                }
                return zzbeiVar2;
            }
            zzfyiVar = null;
            zzbeiVar = zzbeiVar7;
            if (zzbeiVar != zzbeiVar7) {
            }
            if (zzfyiVar != null) {
            }
            return zzbeiVar2;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            try {
                bArr = new byte[20];
            } finally {
            }
        } catch (IOException e3) {
            c(null, e3.toString(), zzfyiVar);
        }
        if (fileInputStream.read(bArr) == 20) {
            byte[] bArr2 = {0, 0};
            if (bArr[5] != 2) {
                bArr2[0] = bArr[19];
                bArr2[1] = bArr[18];
                short s = ByteBuffer.wrap(bArr2).getShort();
                if (s == 3) {
                    zzbeiVar = zzbeiVar2;
                } else if (s == 40) {
                    zzbeiVar = zzbeiVar3;
                } else if (s == 62) {
                    zzbeiVar = zzbeiVar4;
                } else if (s == 183) {
                    zzbeiVar = zzbeiVar5;
                } else if (s != 243) {
                    c(bArr, null, zzfyiVar);
                    zzbeiVar = zzbeiVar8;
                } else {
                    zzbeiVar = zzbeiVar6;
                }
                fileInputStream.close();
                if (zzbeiVar != zzbeiVar7) {
                }
                if (zzfyiVar != null) {
                }
                return zzbeiVar2;
            }
            c(bArr, null, zzfyiVar);
        }
        fileInputStream.close();
        zzbeiVar = zzbeiVar8;
        if (zzbeiVar != zzbeiVar7) {
        }
        if (zzfyiVar != null) {
        }
        return zzbeiVar2;
    }

    public static final void c(byte[] bArr, String str, zzfyi zzfyiVar) {
        if (zzfyiVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            wt3.A("dbg:", str, sb, ";");
        }
        zzfyiVar.d(4007, sb.toString());
    }
}
