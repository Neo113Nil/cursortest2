package com.zoho.livechat.android.provider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;

/* loaded from: classes4.dex */
public class c extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public Context f44271a;

    public c(Context context) {
        super(context, "siq_mobilisten.db", (SQLiteDatabase.CursorFactory) null, 15);
        this.f44271a = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE SIQ_CONVERSATIONS (_id INTEGER PRIMARY KEY AUTOINCREMENT, CONVID TEXT, CHATID TEXT , RCHATID TEXT , VISITORID TEXT , VISITID TEXT , ATTENDER TEXT , TIME LONG not null, TIMER_START_TIME TEXT , TIMER_END_TIME TEXT , FEEDBACK TEXT , RATING INT , DEPTID TEXT, QUESTION TEXT, ATTENDER_IMGKEY TEXT, LASTMSG TEXT, ISBOTATTENDER INT, LMTIME TEXT, ATTENDER_ID TEXT, ATTENDER_EMAIL TEXT, DEPTNAME TEXT, DRAFT TEXT, SHOW_FEEDBACK INT, SHOW_CONTINUE_CHAT INT, UNREAD_COUNT INT, SHOW_QUEUE INT, QUEUEPOSITION INT, QUEUE_START_TIME TEXT, QUEUE_END_TIME TEXT, WAITING_TIMER_START_TIME TEXT, UNREAD_CHAT INT, LAST_INITIATED_TIME TEXT, SYNC_TIME TEXT, BOTTOM_SYNC_TIME TEXT, UN_SYNCED_TIME_LIST TEXT, END_TIME TEXT, MISSED_TIME TEXT, EXTRAS TEXT, MEDIA TEXT, TRIGGER_DATA TEXT, TYPE TEXT, IS_CALL_ENABLED_FOR_ATTENDER INT, STATUS_KEY TEXT, STATUS INT not null)");
        sQLiteDatabase.execSQL("CREATE TABLE SIQ_NOTIFICATIONS (_id INTEGER PRIMARY KEY AUTOINCREMENT, CHATID TEXT          , SENDER TEXT          , DNAME TEXT          , TIMEUID TEXT \t\t   , GROUPID TEXT \t\t   , TYPE INT  not null, MESSAGE TEXT  not null, NAVLNK TEXT          , IMGURL TEXT          , STIME LONG not null)");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x012e  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        String string;
        String string2;
        Cursor cursor;
        int i12;
        Cursor rawQuery;
        Cursor cursor2 = null;
        int i13 = 2;
        if (i10 == 2) {
            onCreate(sQLiteDatabase);
            SharedPreferences sharedPreferences = this.f44271a.getSharedPreferences("siq_session", 0);
            String string3 = sharedPreferences.getString("visid", "resend");
            String string4 = sharedPreferences.getString("chatid", "resend");
            if (!string3.equalsIgnoreCase("resend") && !string4.equalsIgnoreCase("resend")) {
                String string5 = sharedPreferences.getString("attenderid", "NA");
                if (string5.equalsIgnoreCase("NA")) {
                    System.setProperty("fetch_messages", "");
                    i13 = 1;
                    string = null;
                    string2 = null;
                } else {
                    string = sharedPreferences.getString("attname", null);
                    string2 = sharedPreferences.getString("attenderemail", null);
                }
                String string6 = sharedPreferences.getString("ques", "");
                try {
                    i12 = i13;
                    rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM ldchathistory WHERE CHATID = '" + string4 + "'", null);
                } catch (Exception e10) {
                    e = e10;
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
                try {
                    if (rawQuery.moveToFirst()) {
                        int i14 = rawQuery.getInt(rawQuery.getColumnIndex("VISID"));
                        long j10 = rawQuery.getLong(rawQuery.getColumnIndex("DOC"));
                        String string7 = rawQuery.getString(rawQuery.getColumnIndex("DEPTID"));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("CHATID", string4);
                        contentValues.put("VISITORID", string3);
                        contentValues.put("VISITID", Integer.valueOf(i14));
                        contentValues.put("TIME", Long.valueOf(j10));
                        contentValues.put("DEPTID", string7);
                        contentValues.put("QUESTION", string6);
                        contentValues.put("ISBOTATTENDER", Boolean.FALSE);
                        contentValues.put("STATUS", Integer.valueOf(i12));
                        if (string != null) {
                            contentValues.put("ATTENDER_ID", string5);
                            contentValues.put("ATTENDER", string);
                            contentValues.put("ATTENDER_EMAIL", string2);
                        }
                        long insert = sQLiteDatabase.insert("SIQ_CONVERSATIONS", null, contentValues);
                        if (insert > 0) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString("activechat_pkid", "" + insert);
                            edit.apply();
                        }
                    }
                    rawQuery.close();
                } catch (Exception e11) {
                    e = e11;
                    cursor = rawQuery;
                    try {
                        LiveChatUtil.log(e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ldchatmsg");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ldchathistory");
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ldchatpush");
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = rawQuery;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ldchatmsg");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ldchathistory");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ldchatpush");
            return;
        }
        switch (i10) {
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD DEPTNAME TEXT");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD DRAFT TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD SHOW_FEEDBACK TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD SHOW_CONTINUE_CHAT TEXT");
            case 5:
                try {
                    cursor2 = null;
                    try {
                        Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = 1", null);
                        try {
                            if (rawQuery2.moveToFirst()) {
                                while (!rawQuery2.isAfterLast()) {
                                    ContentValues contentValues2 = new ContentValues();
                                    contentValues2.put("STATUS", "0");
                                    sQLiteDatabase.insert("SIQ_CONVERSATIONS", null, contentValues2);
                                    rawQuery2.moveToNext();
                                }
                            }
                            Cursor rawQuery3 = sQLiteDatabase.rawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = 2", null);
                            if (rawQuery3.moveToFirst()) {
                                while (!rawQuery3.isAfterLast()) {
                                    ContentValues contentValues3 = new ContentValues();
                                    contentValues3.put("STATUS", "1");
                                    sQLiteDatabase.insert("SIQ_CONVERSATIONS", null, contentValues3);
                                    rawQuery3.moveToNext();
                                }
                            }
                            rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = 5", null);
                            if (rawQuery2.moveToFirst()) {
                                while (!rawQuery2.isAfterLast()) {
                                    String string8 = rawQuery2.getString(rawQuery2.getColumnIndex("CHATID"));
                                    ContentValues contentValues4 = new ContentValues();
                                    ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
                                    contentValues4.put("STATUS", "2");
                                    sQLiteDatabase.insert("SIQ_CONVERSATIONS", null, contentValues4);
                                    contentResolver.update(b.a.f44269a, contentValues4, "CHATID=?", new String[]{string8});
                                    rawQuery2.moveToNext();
                                }
                            }
                            Cursor rawQuery4 = sQLiteDatabase.rawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = 0", null);
                            try {
                                if (rawQuery4.moveToFirst()) {
                                    while (!rawQuery4.isAfterLast()) {
                                        ContentValues contentValues5 = new ContentValues();
                                        contentValues5.put("STATUS", "5");
                                        sQLiteDatabase.insert("SIQ_CONVERSATIONS", null, contentValues5);
                                        rawQuery4.moveToNext();
                                    }
                                }
                                Cursor rawQuery5 = sQLiteDatabase.rawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = 4", null);
                                if (rawQuery5.moveToFirst()) {
                                    while (!rawQuery5.isAfterLast()) {
                                        ContentValues contentValues6 = new ContentValues();
                                        contentValues6.put("STATUS", "7");
                                        sQLiteDatabase.insert("SIQ_CONVERSATIONS", null, contentValues6);
                                        rawQuery5.moveToNext();
                                    }
                                }
                                Cursor rawQuery6 = sQLiteDatabase.rawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = 6", null);
                                if (rawQuery6.moveToFirst()) {
                                    while (!rawQuery6.isAfterLast()) {
                                        ContentValues contentValues7 = new ContentValues();
                                        contentValues7.put("STATUS", "4");
                                        sQLiteDatabase.insert("SIQ_CONVERSATIONS", null, contentValues7);
                                        rawQuery6.moveToNext();
                                    }
                                }
                                cursor2 = null;
                                rawQuery4 = sQLiteDatabase.rawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE STATUS = 3", null);
                                if (rawQuery4.moveToFirst()) {
                                    while (!rawQuery4.isAfterLast()) {
                                        ContentValues contentValues8 = new ContentValues();
                                        contentValues8.put("STATUS", "6");
                                        cursor2 = null;
                                        sQLiteDatabase.insert("SIQ_CONVERSATIONS", null, contentValues8);
                                        rawQuery4.moveToNext();
                                    }
                                }
                                rawQuery4.close();
                            } catch (Exception e12) {
                                e = e12;
                                cursor2 = rawQuery4;
                                LiveChatUtil.log(e);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD RCHATID TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD UNREAD_COUNT INT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD TIMER_START_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD TIMER_END_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD FEEDBACK TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD RATING INT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD CONVID TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD SHOW_QUEUE INT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD QUEUEPOSITION INT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD QUEUE_START_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD QUEUE_END_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD WAITING_TIMER_START_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD UNREAD_CHAT INT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD SYNC_TIME TEXT");
                                sQLiteDatabase.execSQL("DELETE FROM SIQ_CONVERSATIONS");
                                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SIQ_MESSAGES");
                                sQLiteDatabase.execSQL("UPDATE SIQ_CONVERSATIONS SET SYNC_TIME= NULL");
                                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SIQ_ARTICLES");
                                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SIQ_ARTICLE_CATEGORY");
                                sQLiteDatabase.execSQL("UPDATE SIQ_CONVERSATIONS SET SYNC_TIME = NULL");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD END_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD LAST_INITIATED_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD BOTTOM_SYNC_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD UN_SYNCED_TIME_LIST TEXT");
                                sQLiteDatabase.execSQL("UPDATE SIQ_CONVERSATIONS SET SYNC_TIME = NULL");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD TYPE TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD MEDIA TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD IS_CALL_ENABLED_FOR_ATTENDER INT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD STATUS_KEY TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD MISSED_TIME TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD EXTRAS TEXT");
                                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD TRIGGER_DATA TEXT");
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                cursor2 = rawQuery4;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            cursor2 = rawQuery2;
                        } catch (Throwable th6) {
                            th = th6;
                            cursor2 = rawQuery2;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                    sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD RCHATID TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD UNREAD_COUNT INT");
                    sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD TIMER_START_TIME TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD TIMER_END_TIME TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD FEEDBACK TEXT");
                    sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD RATING INT");
                } catch (Throwable th7) {
                    th = th7;
                }
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD CONVID TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD SHOW_QUEUE INT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD QUEUEPOSITION INT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD QUEUE_START_TIME TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD QUEUE_END_TIME TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD WAITING_TIMER_START_TIME TEXT");
            case 7:
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD UNREAD_CHAT INT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD SYNC_TIME TEXT");
                sQLiteDatabase.execSQL("DELETE FROM SIQ_CONVERSATIONS");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SIQ_MESSAGES");
            case 9:
                sQLiteDatabase.execSQL("UPDATE SIQ_CONVERSATIONS SET SYNC_TIME= NULL");
            case 10:
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SIQ_ARTICLES");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SIQ_ARTICLE_CATEGORY");
                sQLiteDatabase.execSQL("UPDATE SIQ_CONVERSATIONS SET SYNC_TIME = NULL");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD END_TIME TEXT");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD LAST_INITIATED_TIME TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD BOTTOM_SYNC_TIME TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD UN_SYNCED_TIME_LIST TEXT");
                sQLiteDatabase.execSQL("UPDATE SIQ_CONVERSATIONS SET SYNC_TIME = NULL");
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD TYPE TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD MEDIA TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD IS_CALL_ENABLED_FOR_ATTENDER INT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD STATUS_KEY TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD MISSED_TIME TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD EXTRAS TEXT");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE SIQ_CONVERSATIONS ADD TRIGGER_DATA TEXT");
                return;
            default:
                return;
        }
    }
}
