package com.zoho.livechat.android.utils;

import Ph.C0;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import rd.C6218a;

/* loaded from: classes4.dex */
public class Q {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f44448i = false;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f44449j = false;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f44450k = false;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f44451l = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f44466a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44467b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44468c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44469d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44470e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f44471f = null;

    /* renamed from: g, reason: collision with root package name */
    public CopyOnWriteArrayList f44472g = new CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public CopyOnWriteArrayList f44473h = new CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static Hashtable f44452m = new Hashtable();

    /* renamed from: n, reason: collision with root package name */
    public static Hashtable f44453n = new Hashtable();

    /* renamed from: o, reason: collision with root package name */
    public static ArrayList f44454o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public static boolean f44455p = false;

    /* renamed from: q, reason: collision with root package name */
    public static Uri f44456q = null;

    /* renamed from: r, reason: collision with root package name */
    public static Uri f44457r = null;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f44458s = false;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f44459t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f44460u = false;

    /* renamed from: v, reason: collision with root package name */
    public static String f44461v = null;

    /* renamed from: w, reason: collision with root package name */
    public static String f44462w = null;

    /* renamed from: x, reason: collision with root package name */
    public static String f44463x = null;

    /* renamed from: y, reason: collision with root package name */
    public static Boolean f44464y = null;

    /* renamed from: z, reason: collision with root package name */
    public static final ArrayList f44465z = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    public static String f44442A = null;

    /* renamed from: B, reason: collision with root package name */
    public static List f44443B = Collections.EMPTY_LIST;

    /* renamed from: C, reason: collision with root package name */
    public static HashMap f44444C = new HashMap();

    /* renamed from: D, reason: collision with root package name */
    public static String f44445D = null;

    /* renamed from: E, reason: collision with root package name */
    public static boolean f44446E = false;

    /* renamed from: F, reason: collision with root package name */
    public static Q f44447F = new Q();

    public static boolean B() {
        return f44446E;
    }

    public static void C(String str) {
        f44452m.remove(str);
    }

    public static void D(Hashtable hashtable) {
        f44465z.remove(hashtable);
    }

    public static void E(boolean z10) {
        f44448i = z10;
    }

    public static void F(Boolean bool) {
        f44464y = bool;
    }

    public static void G(boolean z10, boolean z11) {
        if (C6218a.M() != null) {
            f44458s = z10;
            if (z11) {
                SharedPreferences.Editor edit = C6218a.M().edit();
                edit.putBoolean("showLaucher", z10);
                edit.apply();
            }
            f44447F.f44466a = !z10;
            ne.j.q0();
        }
    }

    public static void H(boolean z10) {
        f44449j = z10;
    }

    public static void I(boolean z10) {
        f44446E = z10;
    }

    public static void K(String str) {
    }

    public static void L(String str) {
        f44442A = str;
    }

    public static void M(String str) {
        f44463x = str;
    }

    public static void N(String str) {
        f44461v = str;
    }

    public static void O(String str) {
        f44462w = str;
    }

    public static void P(boolean z10) {
        f44450k = z10;
    }

    public static void a(String str, ArrayList arrayList) {
        f44453n.put(str, arrayList);
    }

    public static void b(Hashtable hashtable) {
        f44465z.add(hashtable);
    }

    public static void c(ArrayList arrayList) {
        f44454o = arrayList;
    }

    public static void d(boolean z10) {
        f44459t = z10;
    }

    public static void e(boolean z10) {
        f44451l = z10;
    }

    public static void f(String str) {
        f44452m.put(str, Boolean.TRUE);
    }

    public static boolean g() {
        return f44459t;
    }

    public static boolean h() {
        return f44451l;
    }

    public static boolean i() {
        return f44450k;
    }

    public static void j() {
        Iterator it = f44444C.entrySet().iterator();
        while (it.hasNext()) {
            ((C0) ((Map.Entry) it.next()).getValue()).cancel((CancellationException) null);
        }
        f44444C.clear();
    }

    public static void k(String str) {
        for (Map.Entry entry : f44444C.entrySet()) {
            String[] split = ((String) entry.getKey()).split("_");
            String str2 = split.length > 0 ? split[0] : null;
            LiveChatUtil.log("CancelJob " + split + " " + str2 + " " + str);
            if (str.equals(str2)) {
                ((C0) entry.getValue()).cancel((CancellationException) null);
                LiveChatUtil.log("JobCancel cancelled");
            }
        }
        f44444C.clear();
    }

    public static void l() {
        f44447F = new Q();
        f44448i = false;
    }

    public static void m() {
        f44464y = null;
        f44445D = null;
        f44461v = null;
        LiveChatUtil.setFormContextCompleted();
    }

    public static void n() {
        f44442A = null;
    }

    public static boolean o() {
        return f44460u;
    }

    public static boolean p() {
        return f44458s;
    }

    public static String q() {
        return f44442A;
    }

    public static ArrayList r() {
        return f44465z;
    }

    public static ArrayList s() {
        return f44454o;
    }

    public static String t() {
        return f44463x;
    }

    public static String u() {
        return f44461v;
    }

    public static String v() {
        return f44462w;
    }

    public static boolean w() {
        return f44448i;
    }

    public static Boolean x() {
        return f44464y;
    }

    public static boolean y() {
        return f44449j;
    }

    public static boolean z() {
        return f44455p;
    }

    public boolean A() {
        return this.f44466a;
    }

    public void J(boolean z10) {
        this.f44466a = z10;
    }
}
