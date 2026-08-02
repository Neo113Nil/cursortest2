package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;

/* compiled from: VideoDao.java */
/* loaded from: classes13.dex */
public class m extends a<Campaign> {
    private static m a;

    private m(f fVar) {
        super(fVar);
    }

    public static synchronized m a(f fVar) {
        m mVar;
        synchronized (m.class) {
            try {
                if (a == null) {
                    a = new m(fVar);
                }
                mVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #7 {all -> 0x007d, blocks: (B:23:0x001a, B:25:0x0020, B:27:0x0025, B:29:0x002b, B:34:0x00a5, B:36:0x00a9), top: B:22:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized com.mbridge.msdk.foundation.entity.m b(String str) {
        Exception e;
        Cursor cursor;
        Exception e2;
        com.mbridge.msdk.foundation.entity.m mVar;
        Cursor cursor2 = null;
        r1 = null;
        com.mbridge.msdk.foundation.entity.m mVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            cursor = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
            if (cursor != null) {
                try {
                    try {
                        if (cursor.getCount() > 0) {
                            mVar = new com.mbridge.msdk.foundation.entity.m();
                            while (cursor.moveToNext()) {
                                try {
                                    mVar.b(cursor.getString(cursor.getColumnIndex("video_url")));
                                    mVar.a(cursor.getInt(cursor.getColumnIndex("video_state")));
                                    mVar.b(cursor.getLong(cursor.getColumnIndex("pregeress_size")));
                                    mVar.b(cursor.getInt(cursor.getColumnIndex("total_size")));
                                    mVar.a(cursor.getString(cursor.getColumnIndex("video_path")));
                                    mVar.a(cursor.getLong(cursor.getColumnIndex("video_download_start")) * 1000);
                                } catch (Exception e3) {
                                    e2 = e3;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("VideoDao", e2.getLocalizedMessage());
                                    }
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception e4) {
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("VideoDao", e4.getLocalizedMessage());
                                            }
                                        }
                                    }
                                    mVar2 = mVar;
                                    return mVar2;
                                }
                            }
                            mVar2 = mVar;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        e2 = e;
                        mVar = null;
                        if (MBridgeConstans.DEBUG) {
                        }
                        if (cursor != null) {
                        }
                        mVar2 = mVar;
                        return mVar2;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        try {
                            cursor2.close();
                        } catch (Exception e6) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("VideoDao", e6.getLocalizedMessage());
                            }
                        }
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e7) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e7.getLocalizedMessage());
                    }
                }
            }
        } catch (Exception e8) {
            e = e8;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        return mVar2;
    }

    public synchronized void a(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("video", "video_url = ? ", strArr);
    }

    public synchronized void a(String str, long j) {
        if (j == 0) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j / 1000));
            if (a(str, "")) {
                getWritableDatabase().update("video", contentValues, "video_url = ? ", new String[]{str});
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e.getLocalizedMessage());
            }
        }
    }

    public synchronized long a(CampaignEx campaignEx, long j, String str, int i) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("unitid", campaignEx.getCampaignUnitId());
                contentValues.put("id", campaignEx.getId());
                contentValues.put("package_name", campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put("video_url", campaignEx.getVideoUrlEncode());
                contentValues.put("total_size", Long.valueOf(j));
                contentValues.put("video_state", Integer.valueOf(i));
                contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
                contentValues.put("ad_bid_token", campaignEx.getBidToken());
                if (!TextUtils.isEmpty(str)) {
                    contentValues.put("video_path", str);
                }
                if (a(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                    return 0L;
                }
                return getWritableDatabase().insert("video", null, contentValues);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("VideoDao", e.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r0 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r0 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized com.mbridge.msdk.foundation.entity.m b(String str, String str2) {
        com.mbridge.msdk.foundation.entity.m mVar;
        Cursor cursor = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        mVar = new com.mbridge.msdk.foundation.entity.m();
        try {
            try {
                cursor = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
                if (cursor != null && cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        mVar.b(cursor.getString(cursor.getColumnIndex("video_url")));
                        mVar.a(cursor.getInt(cursor.getColumnIndex("video_state")));
                        mVar.b(cursor.getLong(cursor.getColumnIndex("pregeress_size")));
                        mVar.b(cursor.getInt(cursor.getColumnIndex("total_size")));
                        mVar.a(cursor.getString(cursor.getColumnIndex("video_path")));
                        mVar.a(cursor.getLong(cursor.getColumnIndex("video_download_start")) * 1000);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("VideoDao", e.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused) {
                }
            }
            throw th;
        }
        return mVar;
    }

    public synchronized boolean a(String str, String str2) {
        String[] strArr;
        String str3;
        try {
            if (TextUtils.isEmpty(str2)) {
                str3 = "SELECT id FROM video WHERE video_url = ? ";
                strArr = new String[]{str};
            } else {
                strArr = new String[]{str, str2};
                str3 = "SELECT id FROM video WHERE video_url = ? AND id = ? ";
            }
            Cursor rawQuery = getReadableDatabase().rawQuery(str3, strArr);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                try {
                    rawQuery.close();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e.getLocalizedMessage());
                    }
                }
                return true;
            }
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("VideoDao", e2.getLocalizedMessage());
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public synchronized long a(String str, long j, int i, long j2) {
        int i2 = -1;
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("pregeress_size", Long.valueOf(j));
        contentValues.put("video_state", Integer.valueOf(i));
        contentValues.put("total_size", Long.valueOf(j2));
        if (a(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                i2 = getWritableDatabase().update("video", contentValues, "video_url = ? ", strArr);
            }
        }
        return i2;
    }
}
