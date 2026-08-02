package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.facebook.appevents.i;
import com.facebook.appevents.j;
import com.facebook.appevents.l;
import com.facebook.b;
import com.facebook.internal.a0;
import com.facebook.k0;
import com.facebook.w;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.main.MainActivity;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f8h implements ec3, e8g, lx2, lnh, w1g, zzqp, zzyh, fn5, q92, pjd, w9e, bt8, g8a {
    public static final f8h b = new f8h(0);
    public static final long[] c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};
    public static final /* synthetic */ f8h d = new f8h(1);
    public static final f8h e = new f8h(3);
    public static final f8h f = new f8h(4);
    public static final f8h g = new f8h(5);
    public static final f8h h = new f8h(6);
    public static final f8h i = new f8h(7);
    public static final f8h j = new f8h(8);
    public static final f8h k = new f8h(9);
    public static final f8h l = new f8h(10);
    public static final f8h m = new f8h(11);
    public static final f8h n = new f8h(12);
    public static final f8h o = new f8h(13);
    public static final f8h p = new f8h(14);
    public final /* synthetic */ int a;

    public /* synthetic */ f8h(int i2) {
        this.a = i2;
    }

    public static hzd i(Event event, Player player, Team team, int i2, Double d2, int i3) {
        Double d3 = (i3 & 16) != 0 ? null : d2;
        boolean z = (i3 & 64) == 0;
        event.getClass();
        player.getClass();
        team.getClass();
        return j(event, a.c(new xoe(player, z ? event : null, d3, player.getPosition(), team, i2, null)), player.getId(), false, null, null, 48);
    }

    public static hzd j(Event event, List list, int i2, boolean z, mzd mzdVar, wj1 wj1Var, int i3) {
        boolean z2 = (i3 & 8) != 0 ? false : z;
        mzd mzdVar2 = (i3 & 16) != 0 ? null : mzdVar;
        wj1 wj1Var2 = (i3 & 32) != 0 ? null : wj1Var;
        event.getClass();
        list.getClass();
        Integer num = null;
        Integer valueOf = Integer.valueOf(event.getId());
        Season season = event.getSeason();
        if (season != null) {
            num = Integer.valueOf(season.getId());
        }
        Integer num2 = num;
        String s = ok3.s(event);
        String type = event.getStatus().getType();
        UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
        return new hzd(valueOf, num2, list, s, z2, false, i2, type, uniqueTournament != null ? uniqueTournament.getId() : 0, event.getHasXg(), event.getStartTimestamp(), mzdVar2, wj1Var2);
    }

    public static qf4 k(c6h c6hVar, e3c e3cVar, List list, ku3 ku3Var, Function0 function0, int i2) {
        rq3 rq3Var = null;
        vu3 vu3Var = e3cVar;
        if ((i2 & 2) != 0) {
            vu3Var = null;
        }
        if ((i2 & 4) != 0) {
            list = km5.a;
        }
        if ((i2 & 8) != 0) {
            hs4 hs4Var = z45.a;
            ku3Var = s9a.c(hq4.c.plus(tz9.o()));
        }
        c6hVar.getClass();
        list.getClass();
        ku3Var.getClass();
        l18 l18Var = new l18(c6hVar, new gl7(11), function0);
        vu3 vu3Var2 = vu3Var;
        if (vu3Var == null) {
            vu3Var2 = new hjg();
        }
        return new qf4(l18Var, a.c(new ce4(list, rq3Var, 0)), vu3Var2, ku3Var);
    }

    public static u02 q() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 30 ? v02.a : i2 >= 29 ? a99.b : i2 >= 28 ? ug5.a : rik.c;
    }

    public static Intent s(Context context, Bundle bundle) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public static Bundle t(et5 et5Var, View view, View view2) {
        Bundle bundle = new Bundle();
        if (et5Var != null) {
            List<i8e> unmodifiableList = Collections.unmodifiableList(et5Var.c);
            unmodifiableList.getClass();
            for (i8e i8eVar : unmodifiableList) {
                String str = i8eVar.b;
                ArrayList arrayList = i8eVar.c;
                String str2 = i8eVar.a;
                if (str != null && str.length() > 0) {
                    bundle.putString(str2, i8eVar.b);
                } else if (arrayList.size() > 0) {
                    Iterator it = (Intrinsics.c(i8eVar.d, "relative") ? pco.B(view2, arrayList, 0, -1, view2.getClass().getSimpleName()) : pco.B(view, arrayList, 0, -1, view.getClass().getSimpleName())).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            n03 n03Var = (n03) it.next();
                            if (n03Var.a() != null) {
                                String j2 = xsk.j(n03Var.a());
                                if (j2.length() > 0) {
                                    bundle.putString(str2, j2);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static final void u(Context context, String str, String str2) {
        Set set = cw3.a;
        if (set.contains(f8h.class)) {
            return;
        }
        try {
            context.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            l lVar = new l(str, str2);
            w wVar = w.a;
            if (k0.c()) {
                lVar.d(bundle, "fb_mobile_activate_app");
            }
            if (j.q() == 2 || set.contains(lVar)) {
                return;
            }
            try {
                i.c(1);
            } catch (Throwable th) {
                cw3.a(lVar, th);
            }
        } catch (Throwable th2) {
            cw3.a(f8h.class, th2);
        }
    }

    public static final void w(String str, jy0 jy0Var, String str2) {
        Set set = cw3.a;
        if (set.contains(f8h.class) || jy0Var == null) {
            return;
        }
        try {
            Long l2 = (Long) jy0Var.e;
            if (l2 == null) {
                l2 = 0L;
            }
            long longValue = l2.longValue();
            f8h f8hVar = b;
            if (longValue < 0) {
                f8hVar.v();
                longValue = 0;
            }
            Long l3 = (Long) jy0Var.b;
            Long l4 = (Long) jy0Var.c;
            long longValue2 = l4 == null ? 0L : l4.longValue() - l3.longValue();
            if (longValue2 < 0) {
                f8hVar.v();
                longValue2 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", jy0Var.a);
            Locale locale = Locale.ROOT;
            int i2 = 0;
            if (!set.contains(f8h.class)) {
                int i3 = 0;
                while (true) {
                    try {
                        long[] jArr = c;
                        if (i3 >= 19 || jArr[i3] >= longValue) {
                            break;
                        } else {
                            i3++;
                        }
                    } catch (Throwable th) {
                        cw3.a(f8h.class, th);
                    }
                }
                i2 = i3;
            }
            bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
            n6g n6gVar = (n6g) jy0Var.f;
            bundle.putString("fb_mobile_launch_source", n6gVar != null ? n6gVar.toString() : "Unclassified");
            Long l5 = (Long) jy0Var.c;
            bundle.putLong("_logTime", (l5 != null ? l5.longValue() : 0L) / 1000);
            l lVar = new l(str, str2);
            double d2 = longValue2 / 1000.0d;
            w wVar = w.a;
            if (!k0.c() || cw3.a.contains(lVar)) {
                return;
            }
            try {
                l.f(lVar, "fb_mobile_deactivate_app", Double.valueOf(d2), bundle, false, md.b());
            } catch (Throwable th2) {
                cw3.a(lVar, th2);
            }
        } catch (Throwable th3) {
            cw3.a(f8h.class, th3);
        }
    }

    public static void y(Context context, Bundle bundle, boolean z) {
        context.getClass();
        Intent s = s(context, bundle);
        if (z) {
            s.addFlags(268468224);
        }
        context.startActivity(s);
    }

    public static /* synthetic */ void z(Context context, Bundle bundle, int i2) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        y(context, bundle, false);
    }

    @Override // defpackage.lnh
    public int a(int i2, int i3, int i4, int i5) {
        return (((i2 - i4) - i5) / 2) - (i3 / 2);
    }

    @Override // defpackage.e8g
    public xtc b(int i2, av8 av8Var) {
        av8Var.d0(7899871);
        av8Var.s(false);
        return utc.a;
    }

    @Override // defpackage.q92
    public Class c() {
        return ByteBuffer.class;
    }

    @Override // defpackage.oic
    public byte[] d(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w9e
    public Object e(Uri uri, ue4 ue4Var) {
        return Long.valueOf(nik.W(new BufferedReader(new InputStreamReader(ue4Var)).readLine()));
    }

    @Override // defpackage.fn5
    public void f(in5 in5Var) {
        int i2;
        String str = in5Var.d;
        int i3 = in5Var.a;
        int length = str.length();
        if (i3 < length) {
            char charAt = str.charAt(i3);
            i2 = 0;
            while (n4o.J(charAt) && i3 < length) {
                i2++;
                i3++;
                if (i3 < length) {
                    charAt = str.charAt(i3);
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 >= 2) {
            char charAt2 = str.charAt(in5Var.a);
            char charAt3 = str.charAt(in5Var.a + 1);
            if (n4o.J(charAt2) && n4o.J(charAt3)) {
                in5Var.e((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
                in5Var.a += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
        }
        char a = in5Var.a();
        int M = n4o.M(in5Var.a, 0, str);
        if (M == 0) {
            if (!n4o.K(a)) {
                in5Var.e((char) (a + 1));
                in5Var.a++;
                return;
            } else {
                in5Var.e((char) 235);
                in5Var.e((char) (a - 127));
                in5Var.a++;
                return;
            }
        }
        if (M == 1) {
            in5Var.e((char) 230);
            in5Var.b = 1;
            return;
        }
        if (M == 2) {
            in5Var.e((char) 239);
            in5Var.b = 2;
            return;
        }
        if (M == 3) {
            in5Var.e((char) 238);
            in5Var.b = 3;
        } else if (M == 4) {
            in5Var.e((char) 240);
            in5Var.b = 4;
        } else if (M != 5) {
            a70.r("Illegal mode: ".concat(String.valueOf(M)));
        } else {
            in5Var.e((char) 231);
            in5Var.b = 5;
        }
    }

    @Override // defpackage.q92
    public Object g(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lx2
    public void h(vh9 vh9Var, hoi hoiVar) {
        vh9Var.e.f(rj9.l, new ul((ct8) hoiVar, null, 1));
    }

    @Override // defpackage.ec3
    public Object l(vng vngVar) {
        Object h2 = vngVar.h(new oif(iy1.class, Executor.class));
        h2.getClass();
        return fz8.P((Executor) h2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006e -> B:10:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(FileOutputStream fileOutputStream, sq3 sq3Var) {
        kyc kycVar;
        int i2;
        long j2;
        kyc kycVar2;
        if (sq3Var instanceof kyc) {
            kycVar = (kyc) sq3Var;
            int i3 = kycVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kycVar.v = i3 - Integer.MIN_VALUE;
                Object obj = kycVar.t;
                lu3 lu3Var = lu3.a;
                i2 = kycVar.v;
                if (i2 == 0) {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = kycVar.s;
                    fileOutputStream = kycVar.r;
                    y6a.M(obj);
                    kycVar2 = kycVar;
                    j2 *= 2;
                    if (j2 <= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                        FileLock lock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                        lock.getClass();
                        return lock;
                    }
                    try {
                    } catch (IOException e2) {
                        String message = e2.getMessage();
                        if (message == null || !StringsKt.J(message, "Resource deadlock would occur", false)) {
                            throw e2;
                        }
                        kycVar2.r = fileOutputStream;
                        kycVar2.s = j2;
                        kycVar2.v = 1;
                        if (n4o.y(j2, kycVar2) == lu3Var) {
                            return lu3Var;
                        }
                    }
                    FileLock lock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                    lock2.getClass();
                    return lock2;
                }
                y6a.M(obj);
                j2 = 10;
                kycVar2 = kycVar;
                if (j2 <= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                }
            }
        }
        kycVar = new kyc(this, sq3Var);
        Object obj2 = kycVar.t;
        lu3 lu3Var2 = lu3.a;
        i2 = kycVar.v;
        if (i2 == 0) {
        }
    }

    @Override // defpackage.pjd
    public Object n() {
        return new LinkedHashMap();
    }

    @Override // defpackage.oic
    public Object p(byte[] bArr) {
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, h8a.a)));
        }
        return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #2 {all -> 0x0031, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002d, B:15:0x0033, B:17:0x0045, B:26:0x0042, B:31:0x0012, B:28:0x000e, B:23:0x003e, B:11:0x0029), top: B:2:0x0001, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized p03 r() {
        p03 p03Var;
        p03 p03Var2;
        try {
            p03Var = null;
            if (!cw3.a.contains(p03.class)) {
                try {
                    p03Var2 = p03.h;
                } catch (Throwable th) {
                    cw3.a(p03.class, th);
                }
                if (p03Var2 == null) {
                    p03 p03Var3 = new p03(0);
                    if (!cw3.a.contains(p03.class)) {
                        try {
                            p03.h = p03Var3;
                        } catch (Throwable th2) {
                            cw3.a(p03.class, th2);
                        }
                    }
                }
                if (!cw3.a.contains(p03.class)) {
                    try {
                        p03Var = p03.h;
                    } catch (Throwable th3) {
                        cw3.a(p03.class, th3);
                    }
                }
                p03Var.getClass();
            }
            p03Var2 = null;
            if (p03Var2 == null) {
            }
            if (!cw3.a.contains(p03.class)) {
            }
            p03Var.getClass();
        } catch (Throwable th4) {
            throw th4;
        }
        return p03Var;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "coil.request.NullRequestData";
            case 7:
                return "Center";
            case 24:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    public void v() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            b bVar = a0.a;
            synchronized (w.b) {
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ria x(KeyEvent keyEvent) {
        ria riaVar;
        ria riaVar2;
        ria riaVar3;
        int H = z1a.H(keyEvent);
        ria riaVar4 = null;
        if (H == 9) {
            long b2 = d2a.b(keyEvent.getKeyCode());
            if (qia.a(b2, qia.f)) {
                riaVar = ria.SELECT_LINE_LEFT;
            } else if (qia.a(b2, qia.g)) {
                riaVar = ria.SELECT_LINE_RIGHT;
            } else if (qia.a(b2, qia.d)) {
                riaVar = ria.SELECT_HOME;
            } else {
                if (qia.a(b2, qia.e)) {
                    riaVar = ria.SELECT_END;
                }
                riaVar = null;
            }
        } else {
            if (H == 1) {
                long b3 = d2a.b(keyEvent.getKeyCode());
                if (qia.a(b3, qia.f)) {
                    riaVar = ria.LINE_LEFT;
                } else if (qia.a(b3, qia.g)) {
                    riaVar = ria.LINE_RIGHT;
                } else if (qia.a(b3, qia.d)) {
                    riaVar = ria.HOME;
                } else if (qia.a(b3, qia.e)) {
                    riaVar = ria.END;
                } else if (qia.a(b3, qia.s)) {
                    riaVar = ria.DELETE_FROM_LINE_START;
                }
            }
            riaVar = null;
        }
        if (riaVar != null) {
            return riaVar;
        }
        int H2 = z1a.H(keyEvent);
        long b4 = d2a.b(keyEvent.getKeyCode());
        if (qia.a(b4, qia.s)) {
            if (H2 == 0 || H2 == 8 || H2 == 12) {
                riaVar2 = ria.DELETE_PREV_CHAR;
            } else {
                if (H2 == 2 || H2 == 10) {
                    riaVar2 = ria.DELETE_PREV_WORD;
                }
                riaVar2 = null;
            }
            if (riaVar2 != null) {
                return riaVar2;
            }
            int H3 = z1a.H(keyEvent);
            if (H3 == 10) {
                long b5 = d2a.b(keyEvent.getKeyCode());
                if (qia.a(b5, qia.f) || qia.a(b5, qia.H)) {
                    riaVar3 = ria.SELECT_LEFT_WORD;
                } else if (qia.a(b5, qia.g) || qia.a(b5, qia.I)) {
                    riaVar3 = ria.SELECT_RIGHT_WORD;
                } else if (qia.a(b5, qia.d) || qia.a(b5, qia.F)) {
                    riaVar3 = ria.SELECT_PREV_PARAGRAPH;
                } else {
                    if (qia.a(b5, qia.e) || qia.a(b5, qia.G)) {
                        riaVar3 = ria.SELECT_NEXT_PARAGRAPH;
                    }
                    riaVar3 = null;
                }
                if (riaVar3 != null) {
                    return riaVar3;
                }
                Object obj = zia.a.b;
                int H4 = z1a.H(keyEvent);
                if (H4 == 10) {
                    if (qia.a(d2a.b(keyEvent.getKeyCode()), qia.o)) {
                        riaVar4 = ria.REDO;
                    }
                } else if (H4 == 2) {
                    long b6 = d2a.b(keyEvent.getKeyCode());
                    if (qia.a(b6, qia.j) || qia.a(b6, qia.x) || qia.a(b6, qia.N)) {
                        riaVar4 = ria.COPY;
                    } else if (qia.a(b6, qia.l)) {
                        riaVar4 = ria.PASTE;
                    } else if (qia.a(b6, qia.m)) {
                        riaVar4 = ria.CUT;
                    } else if (qia.a(b6, qia.i)) {
                        riaVar4 = ria.SELECT_ALL;
                    } else if (qia.a(b6, qia.n)) {
                        riaVar4 = ria.REDO;
                    } else if (qia.a(b6, qia.o)) {
                        riaVar4 = ria.UNDO;
                    }
                } else if (H4 == 8) {
                    long b7 = d2a.b(keyEvent.getKeyCode());
                    if (qia.a(b7, qia.f) || qia.a(b7, qia.H)) {
                        riaVar4 = ria.SELECT_LEFT_CHAR;
                    } else if (qia.a(b7, qia.g) || qia.a(b7, qia.I)) {
                        riaVar4 = ria.SELECT_RIGHT_CHAR;
                    } else if (qia.a(b7, qia.d) || qia.a(b7, qia.F)) {
                        riaVar4 = ria.SELECT_UP;
                    } else if (qia.a(b7, qia.e) || qia.a(b7, qia.G)) {
                        riaVar4 = ria.SELECT_DOWN;
                    } else if (qia.a(b7, qia.C) || qia.a(b7, qia.L)) {
                        riaVar4 = ria.SELECT_PAGE_UP;
                    } else if (qia.a(b7, qia.D) || qia.a(b7, qia.M)) {
                        riaVar4 = ria.SELECT_PAGE_DOWN;
                    } else if (qia.a(b7, qia.v) || qia.a(b7, qia.J)) {
                        riaVar4 = ria.SELECT_LINE_START;
                    } else if (qia.a(b7, qia.w) || qia.a(b7, qia.K)) {
                        riaVar4 = ria.SELECT_LINE_END;
                    } else if (qia.a(b7, qia.x) || qia.a(b7, qia.N)) {
                        riaVar4 = ria.PASTE;
                    }
                } else if (H4 == 0) {
                    long b8 = d2a.b(keyEvent.getKeyCode());
                    if (qia.a(b8, qia.f) || qia.a(b8, qia.H)) {
                        riaVar4 = ria.LEFT_CHAR;
                    } else if (qia.a(b8, qia.g) || qia.a(b8, qia.I)) {
                        riaVar4 = ria.RIGHT_CHAR;
                    } else if (qia.a(b8, qia.d) || qia.a(b8, qia.F)) {
                        riaVar4 = ria.UP;
                    } else if (qia.a(b8, qia.e) || qia.a(b8, qia.G)) {
                        riaVar4 = ria.DOWN;
                    } else if (qia.a(b8, qia.h)) {
                        riaVar4 = ria.CENTER;
                    } else if (qia.a(b8, qia.C) || qia.a(b8, qia.L)) {
                        riaVar4 = ria.PAGE_UP;
                    } else if (qia.a(b8, qia.D) || qia.a(b8, qia.M)) {
                        riaVar4 = ria.PAGE_DOWN;
                    } else if (qia.a(b8, qia.v) || qia.a(b8, qia.J)) {
                        riaVar4 = ria.LINE_START;
                    } else if (qia.a(b8, qia.w) || qia.a(b8, qia.K)) {
                        riaVar4 = ria.LINE_END;
                    } else if (qia.a(b8, qia.r) || qia.a(b8, qia.E)) {
                        riaVar4 = ria.NEW_LINE;
                    } else if (qia.a(b8, qia.s)) {
                        riaVar4 = ria.DELETE_PREV_CHAR;
                    } else if (qia.a(b8, qia.t)) {
                        riaVar4 = ria.DELETE_NEXT_CHAR;
                    } else if (qia.a(b8, qia.A)) {
                        riaVar4 = ria.PASTE;
                    } else if (qia.a(b8, qia.y)) {
                        riaVar4 = ria.CUT;
                    } else if (qia.a(b8, qia.z)) {
                        riaVar4 = ria.COPY;
                    } else if (qia.a(b8, qia.p)) {
                        riaVar4 = ria.TAB;
                    }
                }
                return riaVar4;
            }
            if (H3 == 2) {
                long b9 = d2a.b(keyEvent.getKeyCode());
                if (qia.a(b9, qia.f) || qia.a(b9, qia.H)) {
                    riaVar3 = ria.LEFT_WORD;
                } else if (qia.a(b9, qia.g) || qia.a(b9, qia.I)) {
                    riaVar3 = ria.RIGHT_WORD;
                } else if (qia.a(b9, qia.d) || qia.a(b9, qia.F)) {
                    riaVar3 = ria.PREV_PARAGRAPH;
                } else if (qia.a(b9, qia.e) || qia.a(b9, qia.G)) {
                    riaVar3 = ria.NEXT_PARAGRAPH;
                } else if (qia.a(b9, qia.k)) {
                    riaVar3 = ria.DELETE_PREV_CHAR;
                } else if (qia.a(b9, qia.t)) {
                    riaVar3 = ria.DELETE_NEXT_WORD;
                } else {
                    if (qia.a(b9, qia.B)) {
                        riaVar3 = ria.DESELECT;
                    }
                    riaVar3 = null;
                }
                if (riaVar3 != null) {
                }
            } else if (H3 == 8) {
                long b10 = d2a.b(keyEvent.getKeyCode());
                if (qia.a(b10, qia.v) || qia.a(b10, qia.J)) {
                    riaVar3 = ria.SELECT_LINE_START;
                } else {
                    if (qia.a(b10, qia.w) || qia.a(b10, qia.K)) {
                        riaVar3 = ria.SELECT_LINE_END;
                    }
                    riaVar3 = null;
                }
                if (riaVar3 != null) {
                }
            } else {
                if (H3 == 1 && qia.a(d2a.b(keyEvent.getKeyCode()), qia.t)) {
                    riaVar3 = ria.DELETE_TO_LINE_END;
                    if (riaVar3 != null) {
                    }
                }
                riaVar3 = null;
                if (riaVar3 != null) {
                }
            }
        } else {
            if ((qia.a(b4, qia.r) || qia.a(b4, qia.E)) && (H2 == 0 || H2 == 8 || H2 == 2 || H2 == 10)) {
                riaVar2 = ria.NEW_LINE;
                if (riaVar2 != null) {
                }
            }
            riaVar2 = null;
            if (riaVar2 != null) {
            }
        }
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        return obj;
    }

    @Override // defpackage.w1g
    public e1g o(e1g e1gVar, uvd uvdVar) {
        return e1gVar;
    }
}
