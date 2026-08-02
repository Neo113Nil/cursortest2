package com.zoho.livechat.android.utils;

import java.util.ArrayList;
import okhttp3.HttpUrl;

/* renamed from: com.zoho.livechat.android.utils.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3948q {

    /* renamed from: b, reason: collision with root package name */
    public static C3948q f44566b;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f44567a = new ArrayList();

    public static C3948q b() {
        if (f44566b == null) {
            f44566b = new C3948q();
        }
        return f44566b;
    }

    public void a(String str, String str2, HttpUrl.Builder builder, String str3, long j10) {
        if (c(str2)) {
            return;
        }
        this.f44567a.add(str2);
        new C3947p(str, str2, builder, str3, j10).start();
    }

    public boolean c(String str) {
        return this.f44567a.contains(str);
    }

    public boolean d(String str) {
        return !this.f44567a.contains(str);
    }

    public void e(String str) {
        this.f44567a.remove(str);
    }
}
