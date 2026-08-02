package com.vk.music.offline.impl.sync;

import android.database.Cursor;
import com.vk.dto.common.id.UserId;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookEntity;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookPersonEntity;
import com.vk.music.offline.impl.sync.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.bd3;
import xsna.br40;
import xsna.c5g;
import xsna.dq40;
import xsna.g5g;
import xsna.j5g;
import xsna.kq;
import xsna.o25;
import xsna.q830;
import xsna.s3q0;
import xsna.tr0;
import xsna.xqm0;

/* compiled from: MoosicAudioBooksMigrationHelper.kt */
/* loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Finally extract failed */
    public static void a(UserId userId, q830 q830Var, dq40 dq40Var, br40 br40Var, com.vk.music.pref.a aVar) {
        int i;
        if (q830Var == null) {
            aVar.i0(userId);
            return;
        }
        if (userId.b == 0 || !o25.a().a(userId) || (i = q830Var.b) == 0) {
            return;
        }
        Cursor rawQuery = q830Var.getReadableDatabase().rawQuery("         SELECT\n             DISTINCT L.parent\n         FROM AudioBookChapters T\nLEFT JOIN AudioBooksChaptersLinks L ON L.child = T._id\nWHERE T.downloadState = 2", new String[0]);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (rawQuery.moveToNext()) {
            try {
                linkedHashSet.add(Integer.valueOf(rawQuery.getInt(0)));
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
        rawQuery.close();
        ArrayList arrayList = new ArrayList();
        Iterator it = j5g.U0(linkedHashSet, 500, 500, true).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            String g = xqm0.g("\n              SELECT\n                B._id,\n                B.serverId,\n                B.title,\n\t\t\t\tB.annotation,\n\t\t\t\tB.minimumAge,\n\t\t\t\tB.duration,\n\t\t\t\tB.updatedAt,\n\t\t\t\tB.copyright,\n\t\t\t\tB.releaseDate,\n\t\t\t\tB.accessStatus,\n                B.flags,\n                (\n                    SELECT serverId\n                    FROM Photos\n                    WHERE _id = B.cover\n                    LIMIT 1\n                ) AS coverId\n            FROM AudioBooks B\n            WHERE B._id IN (" + j5g.g0(list, StringUtils.COMMA, null, null, 0, new tr0(28), 30) + ")           \n                ");
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                kq.d((Number) it2.next(), arrayList2);
            }
            rawQuery = q830Var.getReadableDatabase().rawQuery(g, (String[]) arrayList2.toArray(new String[0]));
            while (rawQuery.moveToNext()) {
                try {
                    arrayList.add(q830Var.i(rawQuery));
                } catch (Throwable th) {
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            rawQuery.close();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            VkMusicOldAudioBookEntity vkMusicOldAudioBookEntity = (VkMusicOldAudioBookEntity) it3.next();
            ArrayList arrayList3 = vkMusicOldAudioBookEntity.l;
            int i2 = vkMusicOldAudioBookEntity.b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                String str = ((com.vk.music.offline.api.model.moosic.a) obj).e.b;
                if (str != null ? bd3.d(str) : false) {
                    arrayList4.add(obj);
                }
            }
            if (!arrayList4.isEmpty()) {
                dq40Var.x(userId, i, vkMusicOldAudioBookEntity);
                dq40Var.Q(userId, i, i2, arrayList4);
            }
            new a.C1329a(String.valueOf(i2), arrayList4.size()).q();
        }
        aVar.i0(userId);
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            String str2 = ((VkMusicOldAudioBookEntity) it4.next()).h;
            if (str2 != null) {
                arrayList5.add(str2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            ArrayList arrayList7 = ((VkMusicOldAudioBookEntity) it5.next()).l;
            ArrayList arrayList8 = new ArrayList();
            Iterator it6 = arrayList7.iterator();
            while (it6.hasNext()) {
                String str3 = ((com.vk.music.offline.api.model.moosic.a) it6.next()).g;
                if (str3 != null) {
                    arrayList8.add(str3);
                }
            }
            g5g.y(arrayList8, arrayList6);
        }
        ArrayList u0 = j5g.u0(arrayList6, arrayList5);
        ArrayList arrayList9 = new ArrayList();
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            ArrayList arrayList10 = ((VkMusicOldAudioBookEntity) it7.next()).m;
            ArrayList arrayList11 = new ArrayList();
            Iterator it8 = arrayList10.iterator();
            while (it8.hasNext()) {
                String str4 = ((VkMusicOldAudioBookPersonEntity) it8.next()).d;
                if (str4 != null) {
                    arrayList11.add(str4);
                }
            }
            g5g.y(arrayList11, arrayList9);
        }
        br40Var.invoke(Integer.valueOf(i), userId, j5g.u0(arrayList9, u0));
    }
}
