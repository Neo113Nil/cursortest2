package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0711 extends SQLiteOpenHelper {
    public C0711(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(StringFog.decrypt("2IC6FVc7nS3noJ47fRTiIO2rxh1U\n", "iNL7Uhp6vUs=\n"));
        }
        sQLiteDatabase.execSQL(StringFog.decrypt("8zBny7PUcYTxIG7Px9gX8P4tdqqiyRiD5DEC4ZHOIqTfEEeijPQo8OQnet7HwQOZ/SNw08faFImc\nQlTri7EFleg2Cw==\n", "sGIiiueRUdA=\n"));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
