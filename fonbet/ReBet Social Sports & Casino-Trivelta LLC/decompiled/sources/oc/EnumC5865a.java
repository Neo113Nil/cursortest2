package oc;

import android.net.NetworkInfo;

/* renamed from: oc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC5865a {
    CG_2G("2g"),
    CG_3G("3g"),
    CG_4G("4g"),
    CG_5G("5g");


    /* renamed from: a, reason: collision with root package name */
    public final String f59594a;

    EnumC5865a(String str) {
        this.f59594a = str;
    }

    public static EnumC5865a b(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            return CG_5G;
        }
        switch (subtype) {
        }
        return null;
    }
}
