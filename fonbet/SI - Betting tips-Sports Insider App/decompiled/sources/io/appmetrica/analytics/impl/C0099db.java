package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099db {
    public static final A9 a(C0099db c0099db, J9 j92, JSONObject jSONObject) {
        int i5;
        c0099db.getClass();
        A9 a92 = new A9();
        switch (j92) {
            case UNKNOWN:
                i5 = 0;
                break;
            case APPSFLYER:
                i5 = 1;
                break;
            case ADJUST:
                i5 = 2;
                break;
            case KOCHAVA:
                i5 = 3;
                break;
            case TENJIN:
                i5 = 4;
                break;
            case AIRBRIDGE:
                i5 = 5;
                break;
            case SINGULAR:
                i5 = 6;
                break;
            default:
                throw new gf.m();
        }
        a92.f11982a = i5;
        a92.f11983b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return a92;
    }
}
