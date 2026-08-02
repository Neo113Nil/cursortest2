package com.vk.im.engine.internal.storage.delegates.dialogs;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.video.VideoOwner;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import org.json.JSONObject;
import xsna.ak70;
import xsna.e0w;
import xsna.eqd;
import xsna.gkx0;
import xsna.gou;
import xsna.hg1;
import xsna.hou;
import xsna.hpm;
import xsna.ikv0;
import xsna.izs;
import xsna.lmm;
import xsna.rdi;
import xsna.rsg0;
import xsna.s3q0;
import xsna.tts;
import xsna.ucm;
import xsna.vjm;
import xsna.znx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Lazy lazy;
        int i;
        ucm ucmVar;
        com.vk.im.engine.models.dialogs.b bVar;
        ucm ucmVar2;
        Collection x7;
        a aVar = this;
        switch (aVar.b) {
            case 0:
                String str = (String) aVar.d;
                hpm hpmVar = (hpm) aVar.e;
                Collection<com.vk.im.engine.models.dialogs.b> collection = (Collection) aVar.f;
                e0w e0wVar = (e0w) obj;
                e0wVar.execSQL("DELETE FROM dialog_pinned_msg_attaches WHERE dialog_id IN(" + str + ')');
                ucm.a.Companion.getClass();
                lazy = ucm.a.rawStatement$delegate;
                SQLiteStatement compileStatement = e0wVar.compileStatement((String) lazy.getValue());
                SQLiteStatement g = e0wVar.g("\n            REPLACE INTO dialog_pinned_msg_attaches(dialog_id,attach_local_id,content_type,content_id,content_owner_id)\n            VALUES (?,?,?,?,?)\n            ");
                SQLiteStatement g2 = e0wVar.g("REPLACE INTO dialog_weight(x_dialog_id, x_folder_id, x_sort_id_server, x_sort_id_local, x_weight) VALUES (?, ?, ?, ?, ?)");
                SQLiteStatement compileStatement2 = e0wVar.compileStatement("UPDATE dialog_weight SET x_sort_id_server = ?, x_sort_id_local = ?, x_weight = ? WHERE x_folder_id != ? AND x_dialog_id = ?");
                for (com.vk.im.engine.models.dialogs.b bVar2 : collection) {
                    int i2 = aVar.c;
                    ucm ucmVar3 = ucm.a;
                    if (i2 == -1) {
                        ucmVar3.c(compileStatement, bVar2);
                        i = 1;
                        ucmVar2 = ucmVar3;
                    } else {
                        com.vk.im.engine.models.dialogs.b c = hpmVar.c(bVar2.b);
                        if (c != null) {
                            i = 1;
                            ucmVar = ucmVar3;
                            bVar = com.vk.im.engine.models.dialogs.b.a(bVar2, c.d, c.e, c.f, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -29, 2097151);
                        } else {
                            i = 1;
                            ucmVar = ucmVar3;
                            g2.bindLong(1, bVar2.b);
                            g2.bindLong(2, -1);
                            g2.bindLong(3, bVar2.d.a());
                            vjm vjmVar = bVar2.e;
                            rdi.l(g2, 4, vjmVar != null ? Long.valueOf(vjmVar.a()) : null);
                            g2.bindLong(5, bVar2.f.b);
                            g2.executeInsert();
                            bVar = bVar2;
                        }
                        ucmVar2 = ucmVar;
                        ucmVar2.c(compileStatement, bVar);
                    }
                    compileStatement.executeInsert();
                    long j = bVar2.b;
                    gkx0 gkx0Var = bVar2.f;
                    vjm vjmVar2 = bVar2.e;
                    vjm vjmVar3 = bVar2.d;
                    g2.bindLong(i, j);
                    SQLiteStatement sQLiteStatement = compileStatement;
                    g2.bindLong(2, i2);
                    g2.bindLong(3, vjmVar3.a());
                    rdi.l(g2, 4, vjmVar2 != null ? Long.valueOf(vjmVar2.a()) : null);
                    g2.bindLong(5, gkx0Var.b);
                    g2.executeInsert();
                    if (i2 == -1) {
                        compileStatement2.bindLong(1, vjmVar3.c);
                        rdi.k(compileStatement2, 2, vjmVar2 != null ? Integer.valueOf(vjmVar2.c) : null);
                        compileStatement2.bindLong(3, lmm.a(gkx0Var).b);
                        compileStatement2.bindLong(4, -1);
                        compileStatement2.bindLong(5, j);
                        compileStatement2.executeInsert();
                    }
                    PinnedMsg pinnedMsg = bVar2.t;
                    if (pinnedMsg != null && (x7 = pinnedMsg.x7()) != null) {
                        Iterator it = x7.iterator();
                        while (it.hasNext()) {
                            ucmVar2.a(g, j, (Attach) it.next());
                            g.executeInsert();
                        }
                    }
                    aVar = this;
                    compileStatement = sQLiteStatement;
                }
                compileStatement.close();
                g.close();
                g2.close();
                compileStatement2.close();
                return s3q0.a;
            case 1:
                hou houVar = (hou) aVar.d;
                JSONObject jSONObject = (JSONObject) aVar.e;
                NotificationItem notificationItem = (NotificationItem) aVar.f;
                ((ikv0) obj).a();
                int size = houVar.n.size();
                String optString = jSONObject.optString("query");
                ak70 ak70Var = new ak70("notifications.restore");
                ak70Var.K("query", optString);
                c subscribe = hg1.m(rsg0.y0(ak70Var, null, null, 3), houVar.k.get(), 0L, false, 62).subscribe(new znx0(new gou(houVar, size, aVar.c, notificationItem), 1), new tts(new eqd(houVar, 24), 4));
                io.reactivex.rxjava3.disposables.b bVar3 = houVar.j;
                if (bVar3 != null) {
                    bVar3.b(subscribe);
                }
                return s3q0.a;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) aVar.d;
                com.vk.libvideo.upload.impl.b bVar4 = (com.vk.libvideo.upload.impl.b) aVar.e;
                UserId userId = (UserId) aVar.f;
                VideoOwner videoOwner = (VideoOwner) obj;
                int i3 = atomicInteger.get();
                if ((!videoOwner.f.Q0() && !videoOwner.f.isEmpty()) || i3 >= 5) {
                    return q.T(videoOwner.f);
                }
                atomicInteger.incrementAndGet();
                return io.reactivex.rxjava3.core.a.r(3000L, TimeUnit.MILLISECONDS).d(bVar4.m(aVar.c, userId));
        }
    }
}
