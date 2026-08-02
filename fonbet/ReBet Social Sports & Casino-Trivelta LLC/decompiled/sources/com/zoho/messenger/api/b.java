package com.zoho.messenger.api;

import dg.C4073a;
import gg.C4379a;
import java.util.Hashtable;
import wg.C6754i;
import xg.AbstractC6824a;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Hashtable f44591a = new Hashtable();

    public static void a(String str) {
        if (str == null || !f44591a.containsKey(str)) {
            return;
        }
        ((C4379a) f44591a.get(str)).v();
    }

    public static void b(String str, String str2, AbstractC6824a abstractC6824a, ug.e eVar, C4073a c4073a, Hashtable hashtable) {
        if (str != null) {
            d(str).w(null, str, abstractC6824a, str2, eVar, c4073a, false, hashtable);
        }
    }

    public static void c(String str) {
        if (str == null || !f44591a.containsKey(str)) {
            return;
        }
        ((C4379a) f44591a.get(str)).x();
    }

    public static C4379a d(String str) {
        if (str == null) {
            return null;
        }
        if (f44591a.containsKey(str)) {
            return (C4379a) f44591a.get(str);
        }
        C4379a c4379a = new C4379a();
        f44591a.put(str, c4379a);
        return c4379a;
    }

    public static C4379a e(String str) {
        if (str == null) {
            return null;
        }
        return (C4379a) f44591a.get(str);
    }

    public static void f(String str) {
        if (str == null || !f44591a.containsKey(str)) {
            return;
        }
        ((C4379a) f44591a.get(str)).y();
    }

    public static boolean g(String str) {
        if (str == null || !f44591a.containsKey(str)) {
            return false;
        }
        return ((C4379a) f44591a.get(str)).z();
    }

    public static boolean h(String str) {
        if (str == null || !f44591a.containsKey(str)) {
            return false;
        }
        return ((C4379a) f44591a.get(str)).A();
    }

    public static void i(String str, C6754i c6754i) {
        if (str == null || !f44591a.containsKey(str)) {
            return;
        }
        ((C4379a) f44591a.get(str)).C(c6754i);
    }

    public static void j(String str) {
        if (str == null || !f44591a.containsKey(str)) {
            return;
        }
        ((C4379a) f44591a.get(str)).G();
    }

    public static void k(String str, fg.b bVar) {
        if (str != null) {
            d(str).E(bVar);
        }
    }
}
