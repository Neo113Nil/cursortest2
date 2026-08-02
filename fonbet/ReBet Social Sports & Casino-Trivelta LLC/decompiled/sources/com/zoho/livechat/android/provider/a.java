package com.zoho.livechat.android.provider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.gson.k;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.List;
import ne.j;
import zf.C6966g;

/* loaded from: classes4.dex */
public enum a {
    INSTANCE;

    public static /* synthetic */ void a(String str) {
        if (ZohoLiveChat.getApplicationManager() != null) {
            ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("TIMER_START_TIME", (Integer) 0);
            contentValues.put("TIMER_END_TIME", (Integer) 0);
            contentResolver.update(b.a.f44269a, contentValues, "CHATID=?", new String[]{str});
        }
    }

    public int delete(ContentResolver contentResolver, Uri uri, String str, String[] strArr) {
        int delete = contentResolver.delete(uri, str, strArr);
        contentResolver.notifyChange(uri, null);
        return delete;
    }

    public void deleteConversation(ContentResolver contentResolver, String str, String str2, boolean z10, boolean z11) {
        if (str2 == null || str2.isEmpty()) {
            Cursor executeRawQuery = INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE VISITORID = ?", new String[]{str});
            if (executeRawQuery.moveToFirst()) {
                str2 = executeRawQuery.getString(executeRawQuery.getColumnIndex("CHATID"));
            }
            executeRawQuery.close();
        }
        a aVar = INSTANCE;
        Uri uri = b.a.f44269a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VISITORID");
        sb2.append(str == null ? " IS NULL " : " =? ");
        sb2.append(z11 ? "AND" : "OR");
        sb2.append(" ");
        sb2.append("CHATID");
        sb2.append(" =?");
        aVar.delete(contentResolver, uri, sb2.toString(), str == null ? new String[]{str2} : new String[]{str, str2});
        if (z10) {
            C6966g.x(str2, str);
        }
    }

    public void endChatTimerAsync(final String str) {
        LiveChatUtil.submitTaskToExecutorServiceSafely(new Runnable() { // from class: Wf.a
            @Override // java.lang.Runnable
            public final void run() {
                com.zoho.livechat.android.provider.a.a(str);
            }
        });
    }

    public Cursor executeQuery(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return ZohoLDContentProvider.b().getReadableDatabase().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor executeRawQuery(String str) {
        return ZohoLDContentProvider.b().getReadableDatabase().rawQuery(str, null);
    }

    public void insertPushNotification(@NonNull ContentResolver contentResolver, String str, String str2, String str3, b.EnumC0639b enumC0639b, String str4, String str5, String str6, String str7, String str8, Long l10) {
        insertPushNotification(contentResolver, str, str2, str3, enumC0639b, str4, str5, str6, str7, str8, l10, false, false);
    }

    public void syncConversation(SalesIQChat salesIQChat) {
        syncConversation(salesIQChat, false);
    }

    public void insertPushNotification(@NonNull ContentResolver contentResolver, String str, String str2, String str3, b.EnumC0639b enumC0639b, String str4, String str5, String str6, String str7, String str8, Long l10, boolean z10, boolean z11) {
        Exception exc;
        Throwable th2;
        Cursor executeRawQuery;
        Uri uri = b.c.f44270a;
        ContentValues contentValues = new ContentValues();
        if (str != null) {
            contentValues.put("CHATID", str);
        }
        if (str2 != null) {
            contentValues.put("SENDER", str2);
        }
        if (str3 != null) {
            contentValues.put("DNAME", str3);
        }
        if (l10 != null && !z10 && !z11) {
            contentValues.put("STIME", l10);
        }
        if (str4 != null) {
            contentValues.put("GROUPID", str4);
        }
        if (str5 != null) {
            contentValues.put("TIMEUID", str5);
        }
        contentValues.put("TYPE", Integer.valueOf(enumC0639b.ordinal()));
        if (str6 != null) {
            k kVar = new k();
            kVar.p("message", str6);
            kVar.n("is_deleted", Boolean.valueOf(z11));
            contentValues.put("MESSAGE", Yd.a.j().u(kVar));
        }
        if (str7 != null) {
            contentValues.put("NAVLNK", str7);
        }
        if (str8 != null) {
            contentValues.put("MESSAGE", str8);
        }
        Cursor cursor = null;
        try {
            try {
                executeRawQuery = INSTANCE.executeRawQuery("SELECT * FROM SIQ_NOTIFICATIONS WHERE CHATID = ? AND (TIMEUID = ? OR STIME = ?)", new String[]{str, str5, String.valueOf(l10)});
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Exception e10) {
            exc = e10;
        }
        try {
            if (executeRawQuery.getCount() > 0) {
                contentResolver.update(uri, contentValues, "CHATID =? AND TIMEUID = ? OR STIME = ?", new String[]{str, str5, String.valueOf(l10)});
            } else {
                contentResolver.insert(uri, contentValues);
            }
            contentResolver.notifyChange(uri, null);
            executeRawQuery.close();
        } catch (Exception e11) {
            exc = e11;
            cursor = executeRawQuery;
            LiveChatUtil.log(exc);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursor = executeRawQuery;
            if (cursor == null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
    }

    public void syncConversation(SalesIQChat salesIQChat, boolean z10) {
        synchronized (this) {
            syncConversation(salesIQChat, z10, true);
        }
    }

    public Cursor executeRawQuery(String str, String[] strArr) {
        return ZohoLDContentProvider.b().getReadableDatabase().rawQuery(str, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0318 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0011, B:8:0x0017, B:10:0x0021, B:12:0x002d, B:14:0x003c, B:16:0x0047, B:17:0x004c, B:19:0x0052, B:20:0x0057, B:22:0x005e, B:23:0x0067, B:25:0x006d, B:26:0x0076, B:28:0x007c, B:29:0x0081, B:31:0x0087, B:32:0x008c, B:34:0x00b5, B:35:0x00ba, B:37:0x00c0, B:38:0x00c5, B:40:0x00cb, B:41:0x00d0, B:43:0x00de, B:44:0x00e3, B:46:0x00ed, B:47:0x00f6, B:49:0x00fe, B:50:0x0107, B:52:0x0110, B:53:0x011e, B:55:0x0129, B:56:0x0137, B:58:0x0142, B:59:0x014b, B:61:0x0151, B:62:0x015c, B:64:0x0162, B:65:0x0173, B:67:0x0182, B:68:0x018f, B:70:0x0195, B:71:0x019a, B:73:0x01a0, B:74:0x01a5, B:76:0x01ab, B:77:0x01b0, B:79:0x01b6, B:80:0x01bf, B:82:0x01c5, B:83:0x01ce, B:85:0x01d4, B:86:0x01dd, B:88:0x01e3, B:89:0x01ee, B:91:0x01f4, B:92:0x01ff, B:95:0x0265, B:129:0x0277, B:97:0x0286, B:99:0x02ba, B:101:0x02c0, B:103:0x02cc, B:105:0x02d2, B:107:0x02e9, B:108:0x0312, B:110:0x0318, B:112:0x0320, B:114:0x0326, B:116:0x032d, B:120:0x033a, B:122:0x0350, B:123:0x02de, B:125:0x02ff, B:126:0x0309, B:134:0x028b, B:137:0x028f, B:142:0x02a1, B:139:0x02b0, B:147:0x02b5, B:149:0x01fa, B:150:0x01e9, B:153:0x0353), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0350 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0011, B:8:0x0017, B:10:0x0021, B:12:0x002d, B:14:0x003c, B:16:0x0047, B:17:0x004c, B:19:0x0052, B:20:0x0057, B:22:0x005e, B:23:0x0067, B:25:0x006d, B:26:0x0076, B:28:0x007c, B:29:0x0081, B:31:0x0087, B:32:0x008c, B:34:0x00b5, B:35:0x00ba, B:37:0x00c0, B:38:0x00c5, B:40:0x00cb, B:41:0x00d0, B:43:0x00de, B:44:0x00e3, B:46:0x00ed, B:47:0x00f6, B:49:0x00fe, B:50:0x0107, B:52:0x0110, B:53:0x011e, B:55:0x0129, B:56:0x0137, B:58:0x0142, B:59:0x014b, B:61:0x0151, B:62:0x015c, B:64:0x0162, B:65:0x0173, B:67:0x0182, B:68:0x018f, B:70:0x0195, B:71:0x019a, B:73:0x01a0, B:74:0x01a5, B:76:0x01ab, B:77:0x01b0, B:79:0x01b6, B:80:0x01bf, B:82:0x01c5, B:83:0x01ce, B:85:0x01d4, B:86:0x01dd, B:88:0x01e3, B:89:0x01ee, B:91:0x01f4, B:92:0x01ff, B:95:0x0265, B:129:0x0277, B:97:0x0286, B:99:0x02ba, B:101:0x02c0, B:103:0x02cc, B:105:0x02d2, B:107:0x02e9, B:108:0x0312, B:110:0x0318, B:112:0x0320, B:114:0x0326, B:116:0x032d, B:120:0x033a, B:122:0x0350, B:123:0x02de, B:125:0x02ff, B:126:0x0309, B:134:0x028b, B:137:0x028f, B:142:0x02a1, B:139:0x02b0, B:147:0x02b5, B:149:0x01fa, B:150:0x01e9, B:153:0x0353), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ba A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0011, B:8:0x0017, B:10:0x0021, B:12:0x002d, B:14:0x003c, B:16:0x0047, B:17:0x004c, B:19:0x0052, B:20:0x0057, B:22:0x005e, B:23:0x0067, B:25:0x006d, B:26:0x0076, B:28:0x007c, B:29:0x0081, B:31:0x0087, B:32:0x008c, B:34:0x00b5, B:35:0x00ba, B:37:0x00c0, B:38:0x00c5, B:40:0x00cb, B:41:0x00d0, B:43:0x00de, B:44:0x00e3, B:46:0x00ed, B:47:0x00f6, B:49:0x00fe, B:50:0x0107, B:52:0x0110, B:53:0x011e, B:55:0x0129, B:56:0x0137, B:58:0x0142, B:59:0x014b, B:61:0x0151, B:62:0x015c, B:64:0x0162, B:65:0x0173, B:67:0x0182, B:68:0x018f, B:70:0x0195, B:71:0x019a, B:73:0x01a0, B:74:0x01a5, B:76:0x01ab, B:77:0x01b0, B:79:0x01b6, B:80:0x01bf, B:82:0x01c5, B:83:0x01ce, B:85:0x01d4, B:86:0x01dd, B:88:0x01e3, B:89:0x01ee, B:91:0x01f4, B:92:0x01ff, B:95:0x0265, B:129:0x0277, B:97:0x0286, B:99:0x02ba, B:101:0x02c0, B:103:0x02cc, B:105:0x02d2, B:107:0x02e9, B:108:0x0312, B:110:0x0318, B:112:0x0320, B:114:0x0326, B:116:0x032d, B:120:0x033a, B:122:0x0350, B:123:0x02de, B:125:0x02ff, B:126:0x0309, B:134:0x028b, B:137:0x028f, B:142:0x02a1, B:139:0x02b0, B:147:0x02b5, B:149:0x01fa, B:150:0x01e9, B:153:0x0353), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void syncConversation(SalesIQChat salesIQChat, boolean z10, boolean z11) {
        boolean z12 = false;
        synchronized (this) {
            try {
                if (ZohoLiveChat.getApplicationManager() != null && MobilistenInitProvider.k() != null && MobilistenInitProvider.k().getContentResolver() != null) {
                    ContentResolver contentResolver = MobilistenInitProvider.k().getContentResolver();
                    Uri uri = b.a.f44269a;
                    if (salesIQChat != null) {
                        ContentValues contentValues = new ContentValues();
                        String chid = salesIQChat.getChid();
                        String convID = salesIQChat.getConvID();
                        if (chid != null) {
                            contentValues.put("CHATID", chid);
                        }
                        if (convID != null) {
                            contentValues.put("CONVID", convID);
                        }
                        String rchatid = salesIQChat.getRchatid();
                        if (rchatid != null) {
                            contentValues.put("RCHATID", rchatid);
                        }
                        int unreadCount = salesIQChat.getUnreadCount();
                        if (unreadCount != -1) {
                            contentValues.put("UNREAD_COUNT", Integer.valueOf(unreadCount));
                        }
                        int rating = salesIQChat.getRating();
                        if (rating != 0) {
                            contentValues.put("RATING", Integer.valueOf(rating));
                        }
                        String feedback = salesIQChat.getFeedback();
                        if (feedback != null) {
                            contentValues.put("FEEDBACK", feedback);
                        }
                        String visitorid = salesIQChat.getVisitorid();
                        if (visitorid != null) {
                            contentValues.put("VISITORID", visitorid);
                        }
                        contentValues.put("TIME", Long.valueOf(salesIQChat.getTime()));
                        contentValues.put("STATUS", Integer.valueOf(salesIQChat.getStatus()));
                        contentValues.put("STATUS_KEY", salesIQChat.getStatusKey());
                        String attenderName = salesIQChat.getAttenderName();
                        if (attenderName != null) {
                            contentValues.put("ATTENDER", attenderName);
                        }
                        String question = salesIQChat.getQuestion();
                        if (question != null) {
                            contentValues.put("QUESTION", question);
                        }
                        String attenderImgkey = salesIQChat.getAttenderImgkey();
                        if (attenderImgkey != null) {
                            contentValues.put("ATTENDER_IMGKEY", attenderImgkey);
                        }
                        String v10 = Yd.a.j().v(salesIQChat.getLastMessage());
                        if (v10 != null) {
                            contentValues.put("LASTMSG", v10);
                        }
                        long lastmsgtime = salesIQChat.getLastmsgtime();
                        long j10 = 0;
                        if (lastmsgtime > 0) {
                            contentValues.put("LMTIME", Long.valueOf(lastmsgtime));
                        }
                        long chatEndTime = salesIQChat.getChatEndTime();
                        if (chatEndTime > 0) {
                            contentValues.put("END_TIME", Long.valueOf(chatEndTime));
                        }
                        contentValues.put("EXTRAS", salesIQChat.getExtras() != null ? Yd.a.j().v(salesIQChat.getExtras()) : null);
                        contentValues.put("TRIGGER_DATA", salesIQChat.getTriggerData() != null ? Yd.a.j().v(salesIQChat.getTriggerData()) : null);
                        long missedTime = salesIQChat.getMissedTime();
                        if (missedTime > 0) {
                            contentValues.put("MISSED_TIME", Long.valueOf(missedTime));
                        }
                        if (salesIQChat.getType() != null) {
                            contentValues.put("TYPE", salesIQChat.getType().value);
                        }
                        if (salesIQChat.getMedia() != null) {
                            contentValues.put("MEDIA", Yd.a.j().v(salesIQChat.getMedia()));
                        }
                        contentValues.put("IS_CALL_ENABLED_FOR_ATTENDER", Boolean.valueOf(salesIQChat.isCallEnabledForAttender()));
                        if (z10) {
                            contentValues.put("ISBOTATTENDER", Integer.valueOf(salesIQChat.isBotAttender() ? 1 : 0));
                        }
                        String visitid = salesIQChat.getVisitid();
                        if (visitid != null) {
                            contentValues.put("VISITID", visitid);
                        }
                        String deptid = salesIQChat.getDeptid();
                        if (deptid != null) {
                            contentValues.put("DEPTID", deptid);
                        }
                        String departmentName = salesIQChat.getDepartmentName();
                        if (departmentName != null) {
                            contentValues.put("DEPTNAME", departmentName);
                        }
                        if (salesIQChat.getAttenderid() != null) {
                            contentValues.put("ATTENDER_ID", salesIQChat.getAttenderid());
                        }
                        if (salesIQChat.getAttenderEmail() != null) {
                            contentValues.put("ATTENDER_EMAIL", salesIQChat.getAttenderEmail());
                        }
                        if (salesIQChat.getDraft() != null) {
                            contentValues.put("DRAFT", salesIQChat.getDraft());
                        }
                        if (salesIQChat.canShowContinueChat()) {
                            contentValues.put("SHOW_CONTINUE_CHAT", (Integer) 1);
                        } else {
                            contentValues.put("SHOW_CONTINUE_CHAT", (Integer) 0);
                        }
                        if (salesIQChat.canShowQueue()) {
                            contentValues.put("SHOW_QUEUE", (Integer) 1);
                        } else {
                            contentValues.put("SHOW_QUEUE", (Integer) 0);
                        }
                        contentValues.put("LAST_INITIATED_TIME", salesIQChat.getChatLastInitiatedTime());
                        contentValues.put("QUEUE_START_TIME", Long.valueOf(salesIQChat.getQueueStartTime()));
                        contentValues.put("QUEUE_END_TIME", Long.valueOf(salesIQChat.getQueueEndTime()));
                        contentValues.put("QUEUEPOSITION", Integer.valueOf(salesIQChat.getQueuePosition()));
                        contentValues.put("WAITING_TIMER_START_TIME", Long.valueOf(salesIQChat.getWaitingTimerStartTime()));
                        contentValues.put("UNREAD_CHAT", Boolean.valueOf(salesIQChat.isUnreadChatAvailable()));
                        contentValues.put("TIMER_START_TIME", Long.valueOf(salesIQChat.getTimerStartTime()));
                        contentValues.put("TIMER_END_TIME", Integer.valueOf(salesIQChat.getTimerEndTime()));
                        if (convID != null) {
                            try {
                                Cursor executeRawQuery = INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CONVID = ?", new String[]{convID});
                                if (executeRawQuery.moveToFirst()) {
                                    try {
                                        j10 = executeRawQuery.getLong(executeRawQuery.getColumnIndexOrThrow("_id"));
                                        z12 = true;
                                    } catch (Exception e10) {
                                        e = e10;
                                        z12 = true;
                                        LiveChatUtil.log(e);
                                        if (!z12) {
                                        }
                                        if (salesIQChat.getType() != null) {
                                        }
                                        if (z11) {
                                        }
                                    }
                                }
                                executeRawQuery.close();
                            } catch (Exception e11) {
                                e = e11;
                            }
                        } else {
                            try {
                                Cursor executeRawQuery2 = INSTANCE.executeRawQuery("SELECT * FROM SIQ_CONVERSATIONS WHERE CHATID = ?", new String[]{chid});
                                if (executeRawQuery2.moveToFirst()) {
                                    try {
                                        j10 = executeRawQuery2.getLong(executeRawQuery2.getColumnIndexOrThrow("_id"));
                                        z12 = true;
                                    } catch (Exception e12) {
                                        e = e12;
                                        z12 = true;
                                        LiveChatUtil.log(e);
                                        if (!z12) {
                                        }
                                        if (salesIQChat.getType() != null) {
                                            LiveChatUtil.setActiveChatPKID("" + j10);
                                        }
                                        if (z11) {
                                        }
                                    }
                                }
                                executeRawQuery2.close();
                            } catch (Exception e13) {
                                e = e13;
                            }
                        }
                        if (!z12) {
                            if (salesIQChat.isTopSyncCompleted() || "temp_chid".equals(salesIQChat.getChid()) || salesIQChat.isTriggeredChat() || "proactive_chid".equals(salesIQChat.getChid())) {
                                contentValues.put("SYNC_TIME", (Long) (-2L));
                            }
                            List<String> pathSegments = contentResolver.insert(uri, contentValues).getPathSegments();
                            contentResolver.notifyChange(uri, null);
                            j10 = LiveChatUtil.getLong(pathSegments.get(1));
                        } else if (convID != null) {
                            contentResolver.update(uri, contentValues, "CONVID=?", new String[]{convID});
                        } else {
                            contentResolver.update(uri, contentValues, "CHATID=?", new String[]{chid});
                        }
                        if (salesIQChat.getType() != null && salesIQChat.getType() == SalesIQChat.c.Chat && salesIQChat.getStatus() > 0 && salesIQChat.getStatus() != 4 && salesIQChat.getStatus() != 3 && j10 != -1) {
                            LiveChatUtil.setActiveChatPKID("" + j10);
                        }
                        if (z11) {
                            j.q0();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
