package com.bytedance.sdk.component.qf.gm;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static final gm pcc = new gm();
    private final Object sf = new Object();
    private volatile List<String> gm = new ArrayList();
    private final ConcurrentHashMap<String, Integer> oo = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Long> vj = new ConcurrentHashMap<>();
    private volatile boolean wh = false;
    private volatile int qf = 10;
    private volatile long kj = 1800000;

    private gm() {
    }

    private boolean sf(List<String> list, String str) {
        if (!list.contains(str)) {
            list.add(str);
            return true;
        }
        if (((String) mz1.g(1, list)).equals(str)) {
            return false;
        }
        list.remove(str);
        list.add(str);
        return true;
    }

    public void pcc(String str, String str2, boolean z) {
        if ((z || com.bytedance.sdk.component.qf.pcc.qf()) && this.wh && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String pcc2 = pcc(str);
            String pcc3 = pcc(str2);
            if (pcc2 == null || pcc3 == null) {
                return;
            }
            boolean equals = str.equals(str2);
            synchronized (this.sf) {
                try {
                    ArrayList arrayList = new ArrayList(this.gm);
                    boolean z2 = false;
                    if (equals) {
                        if (z) {
                            this.oo.remove(pcc3);
                            this.vj.remove(pcc3);
                            z2 = pcc(arrayList, pcc3);
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            Long l = this.vj.get(pcc3);
                            if (l == null || currentTimeMillis >= l.longValue()) {
                                Integer num = this.oo.get(pcc3);
                                int intValue = (num == null ? 0 : num.intValue()) + 1;
                                this.oo.put(pcc3, Integer.valueOf(intValue));
                                if (intValue >= this.qf) {
                                    this.vj.put(pcc3, Long.valueOf(currentTimeMillis + this.kj));
                                    z2 = sf(arrayList, pcc3);
                                    this.oo.remove(pcc3);
                                }
                            } else {
                                z2 = sf(arrayList, pcc3);
                            }
                        }
                    } else if (z) {
                        Long l2 = this.vj.get(pcc3);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (l2 != null && l2.longValue() > currentTimeMillis2) {
                            z2 = pcc(arrayList, pcc2);
                        }
                    } else {
                        z2 = sf(arrayList, pcc2);
                    }
                    if (z2) {
                        while (arrayList.size() > 15) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                        this.gm = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private List<String> sf(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public void pcc(vj vjVar) {
        if (this.wh == vjVar.pcc && this.qf == vjVar.sf && this.kj == vjVar.gm) {
            return;
        }
        this.wh = vjVar.pcc;
        this.qf = vjVar.sf;
        this.kj = vjVar.gm;
        String.format("Config updated: enable=%b, K=%d, Cooldown=%dms", Boolean.valueOf(this.wh), Integer.valueOf(this.qf), Long.valueOf(this.kj));
    }

    private String pcc(String str) {
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String path = parse.getPath();
            if (host != null && path != null) {
                if (path.isEmpty()) {
                    path = "/";
                }
                return host.concat(path);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private String pcc(String str, String str2, List<String> list) {
        if (str.equals(pcc(str2))) {
            return str2;
        }
        for (String str3 : list) {
            if (str.equals(pcc(str3))) {
                return str3;
            }
        }
        return null;
    }

    public List<String> pcc(String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (!this.wh) {
                return sf(str, list);
            }
            String pcc2 = pcc(str);
            if (pcc2 == null) {
                return sf(str, list);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<String> list2 = this.gm;
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                String pcc3 = pcc(it.next(), str, list);
                if (pcc3 != null && !arrayList.contains(pcc3)) {
                    arrayList.add(pcc3);
                }
            }
            for (String str2 : list) {
                if (!list2.contains(pcc(str2)) && !arrayList.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                arrayList.addAll(1, arrayList2);
            } else if (arrayList.isEmpty() && !arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
            linkedHashSet.add(str);
            linkedHashSet.addAll(list);
            ArrayList arrayList3 = new ArrayList(linkedHashSet);
            Long l = this.vj.get(pcc2);
            long currentTimeMillis = System.currentTimeMillis();
            if ((l == null || currentTimeMillis >= l.longValue()) && arrayList3.remove(str)) {
                arrayList3.add(0, str);
            }
            arrayList3.toString();
            return arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(str);
        return arrayList4;
    }

    public static gm pcc() {
        return pcc;
    }

    private boolean pcc(List<String> list, String str) {
        if (!list.isEmpty() && list.get(0).equals(str)) {
            return false;
        }
        list.remove(str);
        list.add(0, str);
        return true;
    }
}
