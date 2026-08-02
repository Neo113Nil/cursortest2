package com.vk.music.offline.impl.sync;

import android.database.Cursor;
import android.os.Trace;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.music.offline.impl.sync.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.a6v0;
import xsna.b6v0;
import xsna.c5g;
import xsna.cr40;
import xsna.dq40;
import xsna.drm0;
import xsna.j5g;
import xsna.kq;
import xsna.myc0;
import xsna.ndp0;
import xsna.o25;
import xsna.q830;
import xsna.ro;
import xsna.s3q0;
import xsna.tr0;
import xsna.xqm0;

/* compiled from: MoosicPodcastsMigrationHelper.kt */
/* loaded from: classes3.dex */
public final class c {
    public static void a(UserId userId, q830 q830Var, dq40 dq40Var, cr40 cr40Var, com.vk.music.pref.a aVar) {
        int i;
        char c;
        int i2;
        char c2;
        q830 q830Var2 = q830Var;
        if (q830Var2 == null) {
            aVar.A(userId);
            return;
        }
        if (userId.b == 0 || !o25.a().a(userId) || (i = q830Var2.b) == 0) {
            return;
        }
        int i3 = 0;
        Cursor rawQuery = q830Var2.getReadableDatabase().rawQuery("         SELECT\n             DISTINCT L.parent\n         FROM PodcastEpisodes T\nLEFT JOIN PodcastEpisodesLinks L ON L.child = T._id\nWHERE T.downloadState = 2", new String[0]);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (rawQuery.moveToNext()) {
            try {
                linkedHashSet.add(Integer.valueOf(rawQuery.getInt(0)));
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                    ro.e(rawQuery, th);
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
        rawQuery.close();
        if (linkedHashSet.isEmpty()) {
            aVar.A(userId);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        Iterator it = j5g.U0(linkedHashSet, 500, 500, true).iterator();
        while (true) {
            c = '\n';
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            List list = (List) it.next();
            String g = xqm0.g("\n              SELECT\n                P._id,\n                P.serverId,\n                P.title,\n\t\t\t\tP.subtitle,\n\t\t\t\tP.flags,\n                (\n                    SELECT serverId\n                    FROM Photos\n                    WHERE _id = P.cover\n                    LIMIT 1\n                ) AS coverId\n            FROM Podcasts P\n            WHERE P._id IN (" + j5g.g0(list, StringUtils.COMMA, null, null, 0, new tr0(28), 30) + ")           \n                ");
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                kq.d((Number) it2.next(), arrayList2);
            }
            Cursor rawQuery2 = q830Var2.getReadableDatabase().rawQuery(g, (String[]) arrayList2.toArray(new String[0]));
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                if (rawQuery2.moveToFirst()) {
                    while (!rawQuery2.isAfterLast()) {
                        if (myc0.f(rawQuery2.getString(1))) {
                            arrayList.add(new a6v0(rawQuery2.getInt(0), rawQuery2.getString(1), rawQuery2.getInt(4), rawQuery2.getString(2), rawQuery2.getString(3), rawQuery2.getString(5)));
                        }
                        rawQuery2.moveToNext();
                    }
                }
                try {
                    rawQuery2.close();
                } finally {
                }
            } catch (Throwable th2) {
                rawQuery2.close();
                throw th2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            a6v0 a6v0Var = (a6v0) it3.next();
            String str = (String) j5g.a0(drm0.c0(a6v0Var.b, new String[]{BundleUtil.UNDERLINE_TAG}, i3, 6));
            if (str == null) {
                c2 = c;
            } else {
                Cursor rawQuery3 = q830Var2.getReadableDatabase().rawQuery("         SELECT\n             T._id,\n             T.serverId,\n             T.description,\n             T.path,\n             T.encryptionIV,\n             T.encryptionKeyAlias,\n             T.size,\n             T.name,\n             T.artistName,\n             T.duration,\n             T.publishDate,\n             T.flags,\n             T.listenProgress,\n             T.listenState,\n             (\n                 SELECT serverId\n                 FROM Photos\n                 WHERE _id = T.cover\n                 LIMIT 1\n             ) AS coverId\n         FROM PodcastEpisodes T\n         LEFT JOIN PodcastEpisodesLinks L ON L.child = T._id\nWHERE L.parent = ? AND T.downloadState = 2\n         ORDER BY T.addedAt                     ", new String[]{String.valueOf(a6v0Var.a)});
                ArrayList arrayList4 = new ArrayList();
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    if (rawQuery3.moveToFirst()) {
                        while (!rawQuery3.isAfterLast()) {
                            String string = rawQuery3.getString(14);
                            if (myc0.f(rawQuery3.getString(i4))) {
                                arrayList4.add(new b6v0(rawQuery3.getInt(i3), rawQuery3.getString(i2), rawQuery3.getString(i4), new EncryptedFileInfo(rawQuery3.getString(3), rawQuery3.getBlob(4), rawQuery3.getString(5)), rawQuery3.getLong(6), string, rawQuery3.getString(7), rawQuery3.getString(8), rawQuery3.getLong(9), rawQuery3.getLong(10), rawQuery3.getInt(11), rawQuery3.getInt(12), rawQuery3.getInt(13)));
                            }
                            rawQuery3.moveToNext();
                            i3 = 0;
                            i4 = 1;
                            i2 = 2;
                        }
                    }
                    c2 = '\n';
                    try {
                        rawQuery3.close();
                        Trace.endSection();
                        if (!arrayList4.isEmpty()) {
                            dq40Var.G(userId, i, a6v0Var);
                            dq40Var.t(i, userId, str, arrayList4);
                            String str2 = a6v0Var.f;
                            if (str2 != null) {
                                arrayList3.add(str2);
                            }
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                String str3 = ((b6v0) it4.next()).f;
                                if (str3 != null) {
                                    arrayList5.add(str3);
                                }
                            }
                            arrayList3.addAll(arrayList5);
                            new a.o(a6v0Var.b, arrayList4.size()).q();
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    rawQuery3.close();
                    throw th3;
                }
            }
            q830Var2 = q830Var;
            c = c2;
            i3 = 0;
            i4 = 1;
            i2 = 2;
        }
        cr40Var.invoke(Integer.valueOf(i), userId, arrayList3);
        aVar.A(userId);
    }
}
