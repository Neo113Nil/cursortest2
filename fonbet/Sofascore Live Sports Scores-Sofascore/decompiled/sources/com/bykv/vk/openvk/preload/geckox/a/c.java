package com.bykv.vk.openvk.preload.geckox.a;

import com.bykv.vk.openvk.preload.geckox.utils.f;
import defpackage.fc6;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c {
    private static List<File> a(File[] fileArr) {
        long j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j2 = -1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                a(file2);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (parseLong > j2) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j2 = parseLong;
                                a(file2);
                            }
                        }
                        file = file2;
                        j2 = parseLong;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file3 = (File) it.next();
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                a(file3);
            } else {
                try {
                    j = Long.parseLong(name2.substring(0, indexOf));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    j = -1;
                }
                if (j <= j2) {
                    a(file3);
                }
            }
        }
        return arrayList2;
    }

    public static boolean b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = File.separator;
            sb.append(str2);
            sb.append("update.lock");
            com.bykv.vk.openvk.preload.geckox.f.a a = com.bykv.vk.openvk.preload.geckox.f.a.a(sb.toString());
            if (a == null) {
                return true;
            }
            try {
                com.bykv.vk.openvk.preload.geckox.f.b a2 = com.bykv.vk.openvk.preload.geckox.f.b.a(str + str2 + "select.lock");
                try {
                    com.bykv.vk.openvk.preload.geckox.utils.b.c(new File(str));
                } catch (Throwable unused) {
                }
                a2.a();
                return true;
            } finally {
                a.a();
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: all -> 0x004d, LOOP:0: B:21:0x005d->B:23:0x0063, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:8:0x0030, B:10:0x0040, B:12:0x0043, B:15:0x0048, B:17:0x0052, B:20:0x0059, B:21:0x005d, B:23:0x0063), top: B:7:0x0030, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void c(String str) throws Exception {
        List<File> list;
        Iterator<File> it;
        StringBuilder q = fc6.q(str);
        String str2 = File.separator;
        q.append(str2);
        q.append("update.lock");
        com.bykv.vk.openvk.preload.geckox.f.a a = com.bykv.vk.openvk.preload.geckox.f.a.a(q.toString());
        if (a != null) {
            try {
                com.bykv.vk.openvk.preload.geckox.f.b a2 = com.bykv.vk.openvk.preload.geckox.f.b.a(str + str2 + "select.lock");
                try {
                    File[] listFiles = new File(str).listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.2
                        @Override // java.io.FileFilter
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (listFiles != null && listFiles.length != 0 && listFiles.length != 1) {
                        list = a(listFiles);
                        if (list != null && !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                com.bykv.vk.openvk.preload.geckox.f.c.c(it.next().getAbsolutePath() + File.separator + "using.lock");
                            }
                            a2.a();
                        }
                    }
                    list = null;
                    if (list != null) {
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        a2.a();
                    }
                } finally {
                    a2.a();
                }
            } finally {
                a.a();
            }
        }
    }

    public static void a(final String str) {
        f.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    c.c(str);
                } catch (Throwable th) {
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException("delete old channel version failed，path：" + str, th));
                }
            }
        });
    }

    private static void a(final File file) {
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.utils.b.a(file);
            }
        });
    }
}
