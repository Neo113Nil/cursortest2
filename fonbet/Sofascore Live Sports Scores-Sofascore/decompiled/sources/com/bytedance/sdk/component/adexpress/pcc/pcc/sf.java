package com.bytedance.sdk.component.adexpress.pcc.pcc;

import android.content.ContentValues;
import android.database.Cursor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface sf {
    int pcc(String str, ContentValues contentValues, String str2, String[] strArr);

    int pcc(String str, String str2, String[] strArr);

    Cursor pcc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    void pcc(String str, ContentValues contentValues);
}
