package com.zoho.livechat.android.utils;

import java.util.Hashtable;

/* renamed from: com.zoho.livechat.android.utils.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3935d {

    /* renamed from: a, reason: collision with root package name */
    public static Hashtable f44520a = new Hashtable();

    /* renamed from: b, reason: collision with root package name */
    public static Hashtable f44521b = new Hashtable();

    /* renamed from: com.zoho.livechat.android.utils.d$a */
    public interface a {
        void a(int i10, boolean z10);
    }

    public static a a(String str) {
        return (a) f44520a.get(str);
    }

    public static int b(String str) {
        if (f44521b.containsKey(str)) {
            return ((Integer) f44521b.get(str)).intValue();
        }
        return -1;
    }

    public static void c(String str, a aVar) {
        if (aVar != null) {
            f44520a.put(str, aVar);
        }
    }

    public static void d(String str, int i10) {
        if (str != null) {
            f44521b.put(str, Integer.valueOf(i10));
        }
    }
}
