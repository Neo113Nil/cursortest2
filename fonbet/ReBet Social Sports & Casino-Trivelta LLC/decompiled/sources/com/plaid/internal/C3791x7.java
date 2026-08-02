package com.plaid.internal;

/* renamed from: com.plaid.internal.x7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3791x7 {
    public static String a(String str) {
        if (str == null || str.length() <= 32) {
            return str;
        }
        if (str.length() <= 30) {
            return str.substring(0, 32);
        }
        return str.substring(0, 30) + "..";
    }
}
