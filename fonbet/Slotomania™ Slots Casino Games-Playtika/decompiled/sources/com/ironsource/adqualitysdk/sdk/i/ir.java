package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class ir {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2561 = false;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2562 = false;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2563 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2564;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2565;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final String[] f2566;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2567;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final d f2568;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final SQLiteDatabase f2569;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m8097() {
        f2562 = true;
        f2561 = true;
        f2565 = 202;
        f2567 = new char[]{320, 299, 310, 309, 303, 323, 234, 263, 265, 297, 317, 318, 313, 316, 278, 275, 277, 271, 269, 281, 287, 280, 286, 242, 243};
    }

    static {
        m8097();
        Object obj = null;
        f2566 = new String[]{m8098(null, Color.blue(0) + 127, null, "\u0086\u0085\u0084").intern(), m8098(null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), null, "\u0083\u0082\u0081").intern()};
        int i = f2563 + 71;
        f2564 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    public ir(Context context, String str) {
        d dVar = new d(context, str);
        this.f2568 = dVar;
        this.f2569 = dVar.getWritableDatabase();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m8100(String str, String str2) {
        int i = 2 % 2;
        ContentValues contentValues = new ContentValues();
        contentValues.put(m8098(null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, "\u0083\u0082\u0081").intern(), str2);
        if (this.f2569.update(m8098(null, Color.rgb(0, 0, 0) + 16777343, null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), contentValues, m8098(null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, "\u0089\u0087\u0088\u0087\u0086\u0085\u0084").intern(), new String[]{str}) == 0) {
            int i2 = f2563 + 99;
            f2564 = i2 % 128;
            int i3 = i2 % 2;
            contentValues.put(m8098(null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, null, "\u0086\u0085\u0084").intern(), str);
            this.f2569.replace(m8098(null, 127 - ExpandableListView.getPackedPositionGroup(0L), null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), null, contentValues);
            int i4 = f2563 + 53;
            f2564 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r14 != null) goto L19;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized String m8103(String str) {
        String string;
        int i = 2 % 2;
        int i2 = f2563 + 65;
        f2564 = i2 % 128;
        int i3 = i2 % 2;
        Cursor cursor = null;
        try {
            Cursor query = this.f2569.query(m8098(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), f2566, m8098(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u0089\u0087\u0088\u0087\u0086\u0085\u0084").intern(), new String[]{str}, null, null, null);
            if (query != null) {
                int i4 = f2564 + 81;
                f2563 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    if (query.moveToNext()) {
                        int i6 = f2564 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                        f2563 = i6 % 128;
                        if (i6 % 2 == 0) {
                            string = query.getString(query.getColumnIndexOrThrow(m8098(null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, null, "\u0083\u0082\u0081").intern()));
                            if (query != null) {
                                query.close();
                            }
                            return string;
                        }
                        string = query.getString(query.getColumnIndexOrThrow(m8098(null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, "\u0083\u0082\u0081").intern()));
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                        int i7 = f2564 + 63;
                        f2563 = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 2 % 2;
                        }
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m8101(String str) {
        int i = 2 % 2;
        int i2 = f2563 + 37;
        f2564 = i2 % 128;
        int i3 = i2 % 2;
        this.f2569.delete(m8098(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), m8098(null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, "\u0089\u0088\u0086\u0085\u0084").intern(), new String[]{str});
        int i4 = f2563 + 29;
        f2564 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0053, code lost:
    
        if (r20 <= 0) goto L14;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized HashMap<String, String> m8102(String str, int i) {
        String intern;
        String[] strArr;
        String str2;
        HashMap<String, String> hashMap;
        int i2 = 2 % 2;
        int i3 = f2563 + 21;
        f2564 = i3 % 128;
        Cursor cursor = null;
        try {
            if (i3 % 2 != 0) {
                String replace = str.replace(AbstractJsonLexerKt.UNICODE_ESC, '%');
                intern = m8098(null, 16777343 >> Color.rgb(1, 1, 0), null, "\u0089\u0087\u0092\u0091\u0090\u008f\u0087\u0086\u0085\u0084").intern();
                strArr = new String[1];
                strArr[1] = replace;
                if (i <= 0) {
                    str2 = null;
                }
                String num = Integer.toString(i);
                int i4 = f2564 + 15;
                f2563 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
                str2 = num;
            } else {
                String replace2 = str.replace(GMTDateParser.ANY, '%');
                intern = m8098(null, Color.rgb(0, 0, 0) + 16777343, null, "\u0089\u0087\u0092\u0091\u0090\u008f\u0087\u0086\u0085\u0084").intern();
                strArr = new String[]{replace2};
            }
            Cursor query = this.f2569.query(m8098(null, Color.alpha(0) + 127, null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), f2566, intern, strArr, null, null, null, str2);
            try {
                hashMap = new HashMap<>();
                while (query != null) {
                    if (!query.moveToNext()) {
                        break;
                    }
                    try {
                        hashMap.put(query.getString(query.getColumnIndexOrThrow(m8098(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0086\u0085\u0084").intern())), query.getString(query.getColumnIndexOrThrow(m8098(null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0083\u0082\u0081").intern())));
                        int i6 = 2 % 2;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th) {
                th = th;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                    int i7 = f2564 + 21;
                    f2563 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 2 % 2;
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return hashMap;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized int m8099(String str) {
        int i = 2 % 2;
        int i2 = f2564 + 3;
        f2563 = i2 % 128;
        int i3 = i2 % 2;
        Cursor cursor = null;
        try {
            cursor = this.f2569.query(m8098(null, Gravity.getAbsoluteGravity(0, 0) + 127, null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), new String[]{m8098(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u0099\u0083\u0082\u0081\u0098\u0097\u0096\u0095\u0094\u0093").intern()}, m8098(null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u0089\u0087\u0092\u0091\u0090\u008f\u0087\u0086\u0085\u0084").intern(), new String[]{str.replace(GMTDateParser.ANY, '%')}, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i4 = cursor.getInt(0);
                if (cursor != null) {
                    cursor.close();
                    int i5 = 2 % 2;
                }
                return i4;
            }
            if (cursor != null) {
                cursor.close();
                int i6 = f2564 + 61;
                f2563 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            }
            return 0;
        } finally {
        }
    }

    static class d extends SQLiteOpenHelper {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2570 = 1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f2571 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2572 = 0;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static long f2573 = -2323451121645030069L;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2574;

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = f2572 + 39;
            f2570 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        public d(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = f2570 + 97;
            f2572 = i2 % 128;
            if (i2 % 2 == 0) {
                if (!sQLiteDatabase.isReadOnly()) {
                    int i3 = f2570 + 73;
                    f2572 = i3 % 128;
                    int i4 = i3 % 2;
                    sQLiteDatabase.execSQL(m8104((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "畋\ud95d熃\udfc1", "\u1f47祆\ue07f㬤", "幹\udf7f叩갃࠼斷ꧪꦷ\udaea湐ᕇ᪼푣䙀\u0d98ਛ늉瑭諐吹ຣ", 2138654239 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                    int i5 = f2572 + 7;
                    f2570 = i5 % 128;
                    int i6 = i5 % 2;
                }
                sQLiteDatabase.execSQL(m8104((char) (4776 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "畋\ud95d熃\udfc1", "鐍\ue7fd\ua8c7\ud912", "錝旞喓Ο\ue0da텲\uef12\uef8c᠓饈鮔솽欇\ue1de瀹\ue058\ue495碥藈ꡏ勖䏸ㄯ뛨㫳ျ䴷\ud8f7♇㜅恲苄敗绣\ud8ec⤂䐄ᨿ\udc24ꍔ䄠Ꭸ㼈켮\ue4a2フ잸Ƈꢗ䮎渒瑨囱웷ꌐ帠성\udfa4誙喇פֿ黋짖̹썄㌈沋", View.MeasureSpec.makeMeasureSpec(0, 0) - 941097580).intern());
                int i7 = f2572 + 67;
                f2570 = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            sQLiteDatabase.isReadOnly();
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m8104(char c, String str, String str2, String str3, int i) {
            String str4;
            char[] cArr = str3;
            if (str3 != null) {
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str2;
            if (str2 != null) {
                cArr3 = str2.toCharArray();
            }
            char[] cArr4 = cArr3;
            char[] cArr5 = str;
            if (str != null) {
                cArr5 = str.toCharArray();
            }
            char[] cArr6 = cArr5;
            synchronized (f.f2042) {
                char[] cArr7 = (char[]) cArr4.clone();
                char[] cArr8 = (char[]) cArr6.clone();
                cArr7[0] = (char) (c ^ cArr7[0]);
                cArr8[2] = (char) (cArr8[2] + ((char) i));
                int length = cArr2.length;
                char[] cArr9 = new char[length];
                f.f2041 = 0;
                while (f.f2041 < length) {
                    int i2 = (f.f2041 + 2) % 4;
                    int i3 = (f.f2041 + 3) % 4;
                    f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                    cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                    cArr7[i3] = f.f2043;
                    cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2573) ^ f2574) ^ f2571);
                    f.f2041++;
                }
                str4 = new String(cArr9);
            }
            return str4;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8098(String str, int i, int[] iArr, String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (k.f2956) {
            char[] cArr3 = f2567;
            int i2 = f2565;
            if (f2561) {
                int length = bArr2.length;
                k.f2955 = length;
                char[] cArr4 = new char[length];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                    k.f2957++;
                }
                return new String(cArr4);
            }
            if (f2562) {
                int length2 = cArr2.length;
                k.f2955 = length2;
                char[] cArr5 = new char[length2];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                    k.f2957++;
                }
                return new String(cArr5);
            }
            int length3 = iArr.length;
            k.f2955 = length3;
            char[] cArr6 = new char[length3];
            k.f2957 = 0;
            while (k.f2957 < k.f2955) {
                cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                k.f2957++;
            }
            return new String(cArr6);
        }
    }
}
