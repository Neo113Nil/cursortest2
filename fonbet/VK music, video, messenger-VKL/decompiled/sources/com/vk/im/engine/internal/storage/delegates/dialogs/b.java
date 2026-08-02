package com.vk.im.engine.internal.storage.delegates.dialogs;

import android.database.Cursor;
import android.os.Trace;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.storage.delegates.dialogs.DialogWeightDb;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.d;
import com.vk.im.engine.models.messages.DraftMsg;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.arm;
import xsna.c5g;
import xsna.dhl0;
import xsna.epx;
import xsna.fl3;
import xsna.g53;
import xsna.gkx0;
import xsna.go9;
import xsna.h5s;
import xsna.icm;
import xsna.j5g;
import xsna.jw5;
import xsna.kb0;
import xsna.lhg;
import xsna.mtx0;
import xsna.ndp0;
import xsna.nrm;
import xsna.ozk0;
import xsna.pum;
import xsna.qb;
import xsna.sgl0;
import xsna.tgl0;
import xsna.tj0;
import xsna.tw4;
import xsna.uw4;
import xsna.vjm;
import xsna.wh1;
import xsna.whe;
import xsna.xa9;
import xsna.y8;

/* compiled from: DialogsHistoryStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class b implements mtx0 {
    public final tgl0 b;
    public final DialogWeightDb c;
    public final kb0 d;
    public final dhl0<d, Integer> e;
    public final dhl0<nrm, Pair<Integer, DialogsFilter>> f;

    /* compiled from: DialogsHistoryStorageManagerImpl.kt */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public Integer b;
        public Boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
    }

    /* compiled from: DialogsHistoryStorageManagerImpl.kt */
    /* renamed from: com.vk.im.engine.internal.storage.delegates.dialogs.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1119b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsFilter.REQUESTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogsFilter.UNREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DialogsFilter.CHATS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DialogsFilter.ARCHIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(tgl0 tgl0Var, DialogWeightDb dialogWeightDb, kb0 kb0Var) {
        this.b = tgl0Var;
        this.c = dialogWeightDb;
        this.d = kb0Var;
        int i = 0;
        int i2 = 1;
        this.e = new dhl0<>(DialogsCounters.Type.h().size(), tgl0Var.c(d.class), new qb(22), new xa9(i2, this, b.class, "getCountFromDb", "getCountFromDb(Ljava/util/Collection;)Ljava/util/Map;", i, 4), new whe(i2, this, b.class, "putCountToDb", "putCountToDb(Ljava/util/Collection;)V", i, 3), tgl0Var.I0());
        int i3 = 0;
        int i4 = 1;
        this.f = new dhl0<>(DialogsFilter.h().size(), tgl0Var.c(nrm.class), new wh1(this), new tw4(i4, this, b.class, "getMetaFromDb", "getMetaFromDb(Ljava/util/Collection;)Ljava/util/Map;", i3, 7), new uw4(i4, this, b.class, "putMetaToDb", "putMetaToDb(Ljava/util/Collection;)V", i3, 8), tgl0Var.I0());
    }

    public static Pair e(pum pumVar) {
        if (pumVar instanceof pum.a) {
            return new Pair(-1, ((pum.a) pumVar).a);
        }
        if (!(pumVar instanceof pum.b)) {
            throw new NoWhenBranchMatchedException();
        }
        pum.b bVar = (pum.b) pumVar;
        return new Pair(Integer.valueOf(bVar.a), bVar.b);
    }

    public static nrm j(Cursor cursor) {
        pum bVar;
        int A = fl3.A(cursor, "folder_id");
        int A2 = fl3.A(cursor, "filter_id");
        if (A == -1) {
            DialogsFilter.Companion.getClass();
            bVar = new pum.a(DialogsFilter.a.a(A2));
        } else {
            DialogsFilter.Companion.getClass();
            bVar = new pum.b(A, DialogsFilter.a.a(A2));
        }
        return new nrm(bVar, new vjm(fl3.C(cursor, "oldest_sort_id")), fl3.x(cursor, "fully_fetched"), fl3.A(cursor, "phase_id"));
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.e.c();
        this.f.c();
    }

    public final void a(int i) {
        Iterator<E> it = DialogsFilter.h().iterator();
        while (it.hasNext()) {
            Pair pair = new Pair(Integer.valueOf(i), (DialogsFilter) it.next());
            dhl0<nrm, Pair<Integer, DialogsFilter>> dhl0Var = this.f;
            dhl0Var.f.u(new ozk0(1, dhl0Var, pair));
        }
        this.b.b().execSQL("DELETE FROM dialogs_history_meta WHERE folder_id = ?", new Integer[]{Integer.valueOf(i)});
    }

    public final d b(DialogsCounters.Type type) {
        return this.e.d(Integer.valueOf(type.i()));
    }

    public final ArrayList c(gkx0 gkx0Var, pum pumVar, Direction direction, gkx0 gkx0Var2, int i) {
        return d("x_weight", pumVar, ((gkx0) jw5.w(gkx0Var, gkx0Var2)).b, ((gkx0) jw5.v(gkx0Var, gkx0Var2)).b, direction, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r11.a == (-1)) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a7 A[Catch: all -> 0x02e0, LOOP:1: B:82:0x02a7->B:88:0x02e2, LOOP_START, TryCatch #0 {all -> 0x02e0, blocks: (B:80:0x02a1, B:82:0x02a7, B:84:0x02ad, B:86:0x02dc, B:88:0x02e2), top: B:79:0x02a1, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(String str, pum pumVar, long j, long j2, Direction direction, int i) {
        DialogsFilter dialogsFilter;
        boolean z;
        int i2;
        String str2;
        String str3;
        String sb;
        String concat;
        boolean z2;
        Cursor d;
        sgl0 sgl0Var = this.c.a;
        boolean z3 = pumVar instanceof pum.a;
        if (z3) {
            dialogsFilter = ((pum.a) pumVar).a;
        } else {
            if (!(pumVar instanceof pum.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dialogsFilter = ((pum.b) pumVar).b;
        }
        a aVar = new a();
        ArrayList arrayList = aVar.a;
        arrayList.clear();
        arrayList.add(MsgRequestStatus.NONE);
        arrayList.add(MsgRequestStatus.ACCEPTED);
        try {
            try {
                if (!z3) {
                    pum.b bVar = pumVar instanceof pum.b ? (pum.b) pumVar : null;
                    if (bVar != null) {
                    }
                    switch (C1119b.$EnumSwitchMapping$0[dialogsFilter.ordinal()]) {
                        case 1:
                            if (z3) {
                                aVar.c = Boolean.FALSE;
                                break;
                            }
                            break;
                        case 2:
                            arrayList.clear();
                            arrayList.add(MsgRequestStatus.PENDING);
                            break;
                        case 3:
                            aVar.f = true;
                            if (z3) {
                                aVar.c = Boolean.FALSE;
                                break;
                            }
                            break;
                        case 4:
                            aVar.b = 1;
                            break;
                        case 5:
                            aVar.c = Boolean.FALSE;
                            aVar.e = true;
                            break;
                        case 6:
                            aVar.c = Boolean.TRUE;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    aVar.d = ((Boolean) this.d.invoke()).booleanValue();
                    StringBuilder sb2 = new StringBuilder();
                    if (!arrayList.isEmpty() || aVar.d) {
                        z = z3;
                        i2 = 0;
                        str2 = " = ";
                        str3 = " AND ";
                    } else {
                        if (sb2.length() > 0) {
                            sb2.append(" AND ");
                        }
                        sb2.append("msg_request_status_desired");
                        if (arrayList.size() > 1) {
                            str3 = " AND ";
                            z = z3;
                            i2 = 0;
                            str2 = " = ";
                            j5g.f0(arrayList, sb2, null, " IN (", ")", new g53(15), 50);
                        } else {
                            z = z3;
                            i2 = 0;
                            str2 = " = ";
                            str3 = " AND ";
                            sb2.append(str2);
                            sb2.append(((MsgRequestStatus) arrayList.get(0)).j());
                        }
                    }
                    if (aVar.b != null) {
                        if (sb2.length() > 0) {
                            sb2.append(str3);
                        }
                        sb2.append("type = ");
                        sb2.append(aVar.b);
                    }
                    if (aVar.c != null) {
                        if (sb2.length() > 0) {
                            sb2.append(str3);
                        }
                        sb2.append("is_archived = ");
                        sb2.append(epx.f(aVar.c, Boolean.TRUE) ? 1 : 0);
                    }
                    if (aVar.f) {
                        if (sb2.length() > 0) {
                            sb2.append(str3);
                        }
                        sb2.append("(\nCASE WHEN read_till_in_msg_cnv_id >= read_till_in_msg_cnv_id_local\n     THEN count_unread > 0\n     ELSE count_unread_local > 0\nEND\nOR\nCASE WHEN marked_as_unread_local IS NULL\n     THEN marked_as_unread_server = 1\n     ELSE marked_as_unread_local = 1\nEND\n)");
                    }
                    if (aVar.e) {
                        if (sb2.length() > 0) {
                            sb2.append(str3);
                        }
                        sb2.append("id>2000000000");
                    }
                    sb = sb2.toString();
                    if (sb.length() <= 0) {
                        sb = null;
                    }
                    concat = sb == null ? "AND ".concat(sb) : null;
                    String str4 = "";
                    if (concat == null) {
                        concat = "";
                    }
                    String str5 = direction != Direction.BEFORE ? "DESC" : "ASC";
                    String a2 = i >= 0 ? "" : lhg.a(i, "LIMIT ");
                    z2 = pumVar instanceof pum.b;
                    tgl0 tgl0Var = this.b;
                    if (!z2) {
                        LinkedHashSet c = tgl0Var.I0().b().c().c(((pum.b) pumVar).a);
                        ArrayList arrayList2 = new ArrayList(c5g.u(c, 10));
                        Iterator it = c.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Long.valueOf(((Peer) it.next()).b));
                        }
                        str4 = go9.b("AND id IN ", j5g.g0(arrayList2, null, "(", ")", 0, new y8(17), 25));
                    } else if (!z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StringBuilder sb3 = new StringBuilder("\n            SELECT id, type, ");
                    sb3.append(DialogWeightDb.Column.SORT_ID_SERVER.getKey());
                    sb3.append(" as sort_id_server, ");
                    sb3.append(DialogWeightDb.Column.WEIGHT.getKey());
                    sb3.append(" as weight, last_msg_cnv_id, phase_id, draft_msg\n            FROM dialogs\n            INNER JOIN ");
                    sb3.append(sgl0Var.a);
                    sb3.append(" ON dialogs.id = ");
                    sb3.append(sgl0Var.a);
                    sb3.append(JwtParser.SEPARATOR_CHAR);
                    sb3.append(DialogWeightDb.Column.DIALOG_ID.getKey());
                    sb3.append("\n            WHERE ");
                    sb3.append(str);
                    sb3.append(" BETWEEN ");
                    sb3.append(j);
                    tj0.d(sb3, str3, j2, "\n                ");
                    sb3.append(concat);
                    sb3.append(' ');
                    sb3.append(str4);
                    sb3.append(" \n                AND ");
                    sb3.append(sgl0Var.a);
                    sb3.append(JwtParser.SEPARATOR_CHAR);
                    sb3.append(DialogWeightDb.Column.FOLDER_ID.getKey());
                    sb3.append(str2);
                    pum.b bVar2 = !z2 ? (pum.b) pumVar : null;
                    sb3.append(bVar2 == null ? bVar2.a : -1);
                    sb3.append("\n            ORDER BY ");
                    sb3.append(str);
                    sb3.append(' ');
                    d = tgl0Var.b().d(h5s.d(sb3, str5, "\n            ", a2, "\n            "), null);
                    ArrayList arrayList3 = new ArrayList(d.getCount());
                    Trace.beginSection(ndp0.f("Cursor.forEach"));
                    if (d.moveToFirst()) {
                        while (!d.isAfterLast()) {
                            long j3 = d.getLong(i2);
                            int i3 = d.getInt(1);
                            vjm vjmVar = new vjm(d.getLong(2));
                            gkx0 gkx0Var = new gkx0(d.getLong(3));
                            int i4 = d.getInt(4);
                            int i5 = d.getInt(5);
                            DraftMsg b = icm.b(d);
                            if (b == null) {
                                b = DraftMsg.h;
                            }
                            arrayList3.add(new arm(j3, i3, vjmVar, gkx0Var, i4, i5, b));
                            d.moveToNext();
                        }
                    }
                    d.close();
                    return arrayList3;
                }
                if (d.moveToFirst()) {
                }
                d.close();
                return arrayList3;
            } catch (Throwable th) {
                d.close();
                throw th;
            }
        } finally {
            Trace.endSection();
        }
        aVar.b = 0;
        switch (C1119b.$EnumSwitchMapping$0[dialogsFilter.ordinal()]) {
        }
        aVar.d = ((Boolean) this.d.invoke()).booleanValue();
        StringBuilder sb22 = new StringBuilder();
        if (arrayList.isEmpty()) {
        }
        z = z3;
        i2 = 0;
        str2 = " = ";
        str3 = " AND ";
        if (aVar.b != null) {
        }
        if (aVar.c != null) {
        }
        if (aVar.f) {
        }
        if (aVar.e) {
        }
        sb = sb22.toString();
        if (sb.length() <= 0) {
        }
        if (sb == null) {
        }
        String str42 = "";
        if (concat == null) {
        }
        if (direction != Direction.BEFORE) {
        }
        if (i >= 0) {
        }
        z2 = pumVar instanceof pum.b;
        tgl0 tgl0Var2 = this.b;
        if (!z2) {
        }
        StringBuilder sb32 = new StringBuilder("\n            SELECT id, type, ");
        sb32.append(DialogWeightDb.Column.SORT_ID_SERVER.getKey());
        sb32.append(" as sort_id_server, ");
        sb32.append(DialogWeightDb.Column.WEIGHT.getKey());
        sb32.append(" as weight, last_msg_cnv_id, phase_id, draft_msg\n            FROM dialogs\n            INNER JOIN ");
        sb32.append(sgl0Var.a);
        sb32.append(" ON dialogs.id = ");
        sb32.append(sgl0Var.a);
        sb32.append(JwtParser.SEPARATOR_CHAR);
        sb32.append(DialogWeightDb.Column.DIALOG_ID.getKey());
        sb32.append("\n            WHERE ");
        sb32.append(str);
        sb32.append(" BETWEEN ");
        sb32.append(j);
        tj0.d(sb32, str3, j2, "\n                ");
        sb32.append(concat);
        sb32.append(' ');
        sb32.append(str42);
        sb32.append(" \n                AND ");
        sb32.append(sgl0Var.a);
        sb32.append(JwtParser.SEPARATOR_CHAR);
        sb32.append(DialogWeightDb.Column.FOLDER_ID.getKey());
        sb32.append(str2);
        if (!z2) {
        }
        sb32.append(bVar2 == null ? bVar2.a : -1);
        sb32.append("\n            ORDER BY ");
        sb32.append(str);
        sb32.append(' ');
        d = tgl0Var2.b().d(h5s.d(sb32, str5, "\n            ", a2, "\n            "), null);
        ArrayList arrayList32 = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
    }

    public final nrm f(pum pumVar) {
        return this.f.d(e(pumVar));
    }

    public final void g(d dVar) {
        this.e.f(Collections.singletonList(dVar));
    }

    public final void h(Collection<d> collection) {
        this.e.f(collection);
    }

    public final void i(Collection<nrm> collection) {
        this.f.f(collection);
    }
}
