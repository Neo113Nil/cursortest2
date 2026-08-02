package com.bytedance.sdk.component.adexpress.pcc.sf;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.pcc.gm.pcc;
import com.bytedance.sdk.component.utils.ye;
import com.ironsource.C4427z5;
import defpackage.dmi;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gm {
    public static boolean gm(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar2) {
        if (pccVar != null) {
            try {
                if (!TextUtils.isEmpty(pccVar.gm())) {
                    if (pccVar2 == null) {
                        return false;
                    }
                    String qf = pccVar.qf();
                    String qf2 = pccVar2.qf();
                    if ((!TextUtils.isEmpty(qf2) && !qf2.equals(qf)) || pcc(pccVar.gm(), pccVar2.gm())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc = pccVar.pcc();
                    Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc2 = pccVar2.pcc();
                    if (pcc.isEmpty()) {
                        return !pcc2.isEmpty();
                    }
                    if (pcc2.isEmpty()) {
                        return false;
                    }
                    return pcc(pcc, pcc2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public abstract File pcc();

    public List<pcc.C0043pcc> pcc(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc = pccVar.pcc();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<pcc.C0043pcc> arrayList3 = new ArrayList<>();
        if (pcc.size() == 0) {
            if (pccVar2 != null && pccVar2.pcc().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc2 = pccVar2.pcc();
                Iterator<String> it = pcc2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar3 = pcc2.get(it.next());
                    if (pccVar3 != null) {
                        arrayList.addAll(pccVar3.wh());
                    }
                }
            }
        } else if (pccVar2 != null && pccVar2.pcc().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> pcc3 = pccVar2.pcc();
            for (String str : pcc.keySet()) {
                com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar4 = pcc.get(str);
                com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar5 = pcc3.get(str);
                if (pccVar5 == null && pccVar4 != null) {
                    arrayList2.addAll(pccVar4.wh());
                } else if (pccVar4 == null && pccVar5 != null) {
                    arrayList.addAll(pccVar5.wh());
                } else if (pccVar4 != null) {
                    for (pcc.C0043pcc c0043pcc : pccVar4.wh()) {
                        if (c0043pcc != null && !pccVar5.wh().contains(c0043pcc) && c0043pcc.sf() != null && c0043pcc.pcc() != null) {
                            arrayList2.add(c0043pcc);
                        }
                    }
                    for (pcc.C0043pcc c0043pcc2 : pccVar5.wh()) {
                        if (c0043pcc2 != null && !pccVar4.wh().contains(c0043pcc2)) {
                            arrayList.add(c0043pcc2);
                        }
                    }
                }
            }
        } else if (pcc.size() != 0) {
            Iterator<String> it2 = pcc.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar6 = pcc.get(it2.next());
                if (pccVar6 != null) {
                    arrayList2.addAll(pccVar6.wh());
                }
            }
        }
        if (pcc(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public List<pcc.C0043pcc> sf(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<pcc.C0043pcc> arrayList3 = new ArrayList<>();
        if (pccVar2 == null || pccVar2.wh().isEmpty()) {
            arrayList2.addAll(pccVar.wh());
        } else if (pccVar.wh().isEmpty()) {
            arrayList.addAll(pccVar2.wh());
        } else {
            for (pcc.C0043pcc c0043pcc : pccVar.wh()) {
                if (!pccVar2.wh().contains(c0043pcc) && c0043pcc != null && c0043pcc.pcc() != null && c0043pcc.sf() != null) {
                    arrayList2.add(c0043pcc);
                }
            }
            for (pcc.C0043pcc c0043pcc2 : pccVar2.wh()) {
                if (!pccVar.wh().contains(c0043pcc2)) {
                    arrayList.add(c0043pcc2);
                }
            }
        }
        if (pcc(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public void gm(List<pcc.C0043pcc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<pcc.C0043pcc> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(pcc(), com.bytedance.sdk.component.utils.vj.pcc(it.next().pcc()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public void sf(List<pcc.C0043pcc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<pcc.C0043pcc> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(pcc(), com.bytedance.sdk.component.utils.vj.pcc(it.next().pcc()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static void sf(File file, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, String str) {
        if (pccVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (pccVar.wh() != null) {
            Iterator<pcc.C0043pcc> it = pccVar.wh().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.vj.pcc(it.next().pcc())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean pcc(Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar = map.get(it.next());
            if (pccVar != null && !pcc(pccVar.wh())) {
                return false;
            }
        }
        return true;
    }

    public boolean pcc(List<pcc.C0043pcc> list) {
        if (list == null || list.size() <= 0 || pcc() == null) {
            return false;
        }
        for (pcc.C0043pcc c0043pcc : list) {
            String pcc = com.bytedance.sdk.component.utils.vj.pcc(c0043pcc.pcc());
            if (TextUtils.isEmpty(pcc)) {
                return false;
            }
            File file = new File(pcc(), pcc);
            String pcc2 = com.bytedance.sdk.component.utils.vj.pcc(file);
            if (!file.exists() || !file.isFile() || c0043pcc.sf() == null || !c0043pcc.sf().equals(pcc2)) {
                return false;
            }
        }
        return true;
    }

    public boolean pcc(pcc.sf sfVar) {
        if (sfVar == null || pcc() == null) {
            return false;
        }
        List<Pair<String, String>> sf = sfVar.sf();
        if (sf == null || sf.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = sf.iterator();
        while (it.hasNext()) {
            File file = new File(pcc(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    private boolean pcc(List<pcc.C0043pcc> list, List<pcc.C0043pcc> list2) {
        for (pcc.C0043pcc c0043pcc : list) {
            String pcc = c0043pcc.pcc();
            String pcc2 = com.bytedance.sdk.component.utils.vj.pcc(pcc);
            File file = new File(pcc(), pcc2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.qf.sf.pcc wh = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().wh();
            wh.gm(pcc);
            wh.pcc(pcc().getAbsolutePath(), pcc2);
            com.bytedance.sdk.component.qf.sf vj = wh.vj();
            list2.add(c0043pcc);
            if (vj == null || !vj.wh() || vj.vj() == null || !vj.vj().exists()) {
                gm(list2);
                return false;
            }
        }
        return true;
    }

    public boolean pcc(String str) {
        File file = new File(pcc().getAbsoluteFile(), dmi.y(com.bytedance.sdk.component.utils.vj.pcc(str), ".zip"));
        com.bytedance.sdk.component.qf.sf.pcc wh = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().wh();
        wh.gm(str);
        wh.pcc(file.getParent(), file.getName());
        com.bytedance.sdk.component.qf.sf vj = wh.vj();
        if (vj.wh() && vj.vj() != null && vj.vj().exists()) {
            File vj2 = vj.vj();
            try {
                ye.pcc(vj2.getAbsolutePath(), file.getParent());
                if (!vj2.exists()) {
                    return true;
                }
                vj2.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void pcc(int i) {
        if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().oo() != null) {
            com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().oo().pcc(i);
        }
    }

    public static void pcc(File file, com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, String str) {
        FileOutputStream fileOutputStream;
        if (pccVar == null) {
            return;
        }
        String ork = pccVar.ork();
        if (TextUtils.isEmpty(ork)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
            } catch (Throwable unused) {
                fileOutputStream = null;
            }
            try {
                fileOutputStream.write(ork.getBytes(C4427z5.O));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                fileOutputStream.close();
            } catch (Throwable unused2) {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
        } catch (IOException unused3) {
        }
    }

    private static boolean pcc(Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> map, Map<String, com.bytedance.sdk.component.adexpress.pcc.gm.pcc> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar = map.get(str);
            if (pccVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar2 = map2.get(str);
            if (pccVar2 == null) {
                return false;
            }
            if (pcc(pccVar.gm(), pccVar2.gm())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean pcc(String str, String str2) {
        String[] split = str2.split("\\.");
        String[] split2 = str.split("\\.");
        int min = Math.min(split.length, split2.length);
        int i = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int length = split[i].length() - split2[i].length();
            if (length == 0) {
                int compareTo = split[i].compareTo(split2[i]);
                if (compareTo > 0) {
                    return true;
                }
                if (compareTo < 0) {
                    return false;
                }
                if (i == min - 1) {
                    return split.length > split2.length;
                }
                i++;
            } else if (length > 0) {
                return true;
            }
        }
    }

    public static boolean pcc(com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar, String str) {
        if (pccVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(pccVar.gm())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return pcc(pccVar.gm(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
