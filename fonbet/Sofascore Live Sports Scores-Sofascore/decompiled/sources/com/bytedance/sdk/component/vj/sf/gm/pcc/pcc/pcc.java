package com.bytedance.sdk.component.vj.sf.gm.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ork;
import com.bytedance.sdk.component.utils.qf;
import defpackage.dmi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private int pcc;
    private File sf;

    private pcc(int i, File file) {
        this.pcc = i;
        this.sf = file;
    }

    private File gm(String str) {
        return new File(this.sf, dmi.y(str, ".temp"));
    }

    private static void oo(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private List<File> sf(File file) {
        List<File> pcc = pcc(file);
        if (pcc == null || pcc.isEmpty()) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        for (File file2 : pcc) {
            hashMap.put(file2, Long.valueOf(file2.lastModified()));
        }
        Collections.sort(pcc, new Comparator<File>() { // from class: com.bytedance.sdk.component.vj.sf.gm.pcc.pcc.pcc.1
            @Override // java.util.Comparator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public int compare(File file3, File file4) {
                if (file3 == null && file4 == null) {
                    return 0;
                }
                if (file3 == null) {
                    return 1;
                }
                if (file4 == null) {
                    return -1;
                }
                return Long.compare(((Long) hashMap.get(file4)).longValue(), ((Long) hashMap.get(file3)).longValue());
            }
        });
        return pcc;
    }

    public synchronized boolean pcc(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (this.pcc > 0 && str != null && bArr != null) {
            File gm = gm(str);
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(gm);
            } catch (FileNotFoundException unused) {
            } catch (Throwable unused2) {
            }
            try {
                fileOutputStream.write(bArr);
                if (gm.exists()) {
                    pcc(gm, sf(str), true);
                }
                ork.pcc(fileOutputStream);
                List<File> pcc = pcc(this.sf);
                if (pcc != null) {
                    int size = pcc.size();
                    int i = this.pcc;
                    if (size > i) {
                        pcc((int) (i * 0.7d));
                    }
                }
                return true;
            } catch (FileNotFoundException unused3) {
                fileOutputStream2 = fileOutputStream;
                try {
                    File file = this.sf;
                    if (file != null) {
                        file.mkdirs();
                    }
                    ork.pcc(fileOutputStream2);
                    List<File> pcc2 = pcc(this.sf);
                    if (pcc2 != null) {
                        int size2 = pcc2.size();
                        int i2 = this.pcc;
                        if (size2 > i2) {
                            pcc((int) (i2 * 0.7d));
                        }
                    }
                    return false;
                } finally {
                    ork.pcc(fileOutputStream2);
                    List<File> pcc3 = pcc(this.sf);
                    if (pcc3 != null) {
                        int size3 = pcc3.size();
                        int i3 = this.pcc;
                        if (size3 > i3) {
                            pcc((int) (i3 * 0.7d));
                        }
                    }
                }
            } catch (Throwable unused4) {
                fileOutputStream2 = fileOutputStream;
                return false;
            }
        }
        return false;
    }

    private void gm(File file) {
        if (file == null) {
            return;
        }
        try {
            qf.sf(file);
        } catch (Throwable unused) {
        }
    }

    private File sf(String str) {
        return new File(this.sf, str);
    }

    public synchronized InputStream pcc(String str) {
        FileInputStream fileInputStream;
        if (this.pcc <= 0) {
            return null;
        }
        File sf = sf(str);
        try {
            try {
                fileInputStream = new FileInputStream(sf);
            } catch (Throwable unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            fileInputStream = null;
        }
        try {
            gm(sf);
            return fileInputStream;
        } catch (FileNotFoundException unused3) {
            ork.pcc(fileInputStream);
            return null;
        }
    }

    public static pcc pcc(int i, File file) {
        try {
            pcc pccVar = new pcc(i, file);
            if (file != null) {
                file.mkdirs();
            }
            return pccVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private List<File> pcc(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                    List<File> asList = Arrays.asList(listFiles);
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : asList) {
                        if (file2 != null && file2.isFile() && !TextUtils.isEmpty(file2.getName()) && !file2.getName().endsWith(".temp")) {
                            arrayList.add(file2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public synchronized void pcc(int i) {
        try {
            if (i > this.pcc) {
                return;
            }
            List<File> sf = sf(this.sf);
            if (sf != null && sf.size() > i) {
                while (i < sf.size()) {
                    File file = sf.get(i);
                    if (file != null && file.exists()) {
                        file.delete();
                    }
                    i++;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void pcc(File file, File file2, boolean z) throws IOException {
        if (z) {
            oo(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
