package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    public static int i = 1;
    public static int j = 0;
    public static int k = 3;
    public static int l = 2;
    private CopyOnWriteArrayList<CampaignEx> a;
    private String b;
    private int c = 21;
    private int d = j;
    private ArrayList<String> e = new ArrayList<>();
    private List<String> f = new ArrayList();
    private List<String> g = new ArrayList();
    private List<String> h = new ArrayList();

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b(String str) {
        try {
            List<String> list = this.g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void c(String str) {
        try {
            List<String> list = this.f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String d() {
        List<String> list = this.g;
        return list == null ? "" : list.toString();
    }

    public String e() {
        return this.b;
    }

    public String f() {
        List<String> list = this.f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.d;
    }

    public void d(String str) {
        this.b = str;
    }

    public String a() {
        ArrayList<String> arrayList = this.e;
        if (arrayList == null) {
            return "";
        }
        return arrayList.toString();
    }

    public String b() {
        List<String> list = this.h;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.a;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.a = copyOnWriteArrayList;
    }

    public void a(int i2) {
        this.d = i2;
    }
}
