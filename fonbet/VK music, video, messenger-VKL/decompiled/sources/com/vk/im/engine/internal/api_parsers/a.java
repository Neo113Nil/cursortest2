package com.vk.im.engine.internal.api_parsers;

import android.util.ArraySet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.internal.api_parsers.DialogFlag;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.c;
import com.vk.im.engine.models.lp_events.ReactionsLpEventSubType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.messages.MsgReactionImpl;
import com.vk.im.engine.models.typing.ComposingType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ayf;
import xsna.bam;
import xsna.bbm;
import xsna.c5g;
import xsna.c7p;
import xsna.chm;
import xsna.cyf;
import xsna.czr;
import xsna.d5q0;
import xsna.drm0;
import xsna.dyf;
import xsna.e900;
import xsna.ehm;
import xsna.eim;
import xsna.ekm;
import xsna.elq0;
import xsna.epx;
import xsna.f370;
import xsna.fxf;
import xsna.g2x0;
import xsna.g900;
import xsna.h900;
import xsna.hjm;
import xsna.hyr;
import xsna.hzr;
import xsna.i0s;
import xsna.i5q0;
import xsna.i9m;
import xsna.ixf;
import xsna.iyr;
import xsna.izr;
import xsna.j5g;
import xsna.j9m;
import xsna.j9x;
import xsna.jhm;
import xsna.jjm;
import xsna.k9x;
import xsna.kjm;
import xsna.kxf;
import xsna.l9m;
import xsna.lhg;
import xsna.mbw;
import xsna.mxf;
import xsna.n9m;
import xsna.nim;
import xsna.nye0;
import xsna.oxf;
import xsna.pn00;
import xsna.q0s;
import xsna.q8q0;
import xsna.qim;
import xsna.qjm;
import xsna.qlb0;
import xsna.qxf;
import xsna.s5f0;
import xsna.s6p;
import xsna.spm;
import xsna.swe0;
import xsna.sxf;
import xsna.t8m;
import xsna.tfm;
import xsna.u4q0;
import xsna.udm;
import xsna.umm;
import xsna.uxf;
import xsna.v28;
import xsna.v5p;
import xsna.whm;
import xsna.wjm;
import xsna.wri;
import xsna.wxf;
import xsna.wyr;
import xsna.xfm;
import xsna.xgm;
import xsna.xxf;
import xsna.yaj;
import xsna.ycm;
import xsna.yhm;
import xsna.ynp0;
import xsna.yup;
import xsna.z1s;
import xsna.z28;
import xsna.zgm;
import xsna.zik0;
import xsna.zim;

/* compiled from: LpEventParser.kt */
/* loaded from: classes2.dex */
public final class a {
    public final boolean a;

    /* compiled from: LpEventParser.kt */
    /* renamed from: com.vk.im.engine.internal.api_parsers.a$a, reason: collision with other inner class name */
    public static final class C1114a {
        public final ArrayList a;
        public final LinkedHashMap b;
        public final LinkedHashMap c;
        public final LinkedHashMap d;
        public final LinkedHashMap e;
        public final LinkedHashMap f;
        public final ArrayList g;

        public C1114a(int i) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            ArrayList arrayList2 = new ArrayList();
            this.a = arrayList;
            this.b = linkedHashMap;
            this.c = linkedHashMap2;
            this.d = linkedHashMap3;
            this.e = linkedHashMap4;
            this.f = linkedHashMap5;
            this.g = arrayList2;
        }
    }

    /* compiled from: LpEventParser.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogFlag.values().length];
            try {
                iArr[DialogFlag.PUSH_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogFlag.MARKED_AS_UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogFlag.ARCHIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(c cVar) {
        cVar.getClass();
        this.a = false;
    }

    public static void a(C1114a c1114a) {
        LinkedHashMap linkedHashMap = c1114a.b;
        ArrayList arrayList = c1114a.a;
        LinkedHashMap linkedHashMap2 = c1114a.f;
        LinkedHashMap linkedHashMap3 = c1114a.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap.values());
        LinkedHashMap linkedHashMap4 = c1114a.c;
        int size = linkedHashMap4.size();
        LinkedHashMap linkedHashMap5 = c1114a.d;
        ArrayList arrayList3 = new ArrayList(linkedHashMap5.size() + size);
        for (Map.Entry entry : linkedHashMap4.entrySet()) {
            Peer peer = (Peer) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            Integer num = (Integer) linkedHashMap5.get(peer);
            Integer num2 = (Integer) linkedHashMap3.get(peer);
            if (num == null) {
                arrayList3.add(new wjm(peer, Integer.valueOf(intValue), null, num2));
            } else {
                arrayList3.add(new wjm(peer, Integer.valueOf(intValue), num, num2));
                linkedHashMap5.remove(peer);
            }
        }
        for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
            Peer peer2 = (Peer) entry2.getKey();
            int intValue2 = ((Number) entry2.getValue()).intValue();
            arrayList3.add(new wjm(peer2, null, Integer.valueOf(intValue2), (Integer) linkedHashMap3.get(peer2)));
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            arrayList4.add(new xxf(((Number) entry3.getValue()).intValue(), (Peer) entry3.getKey()));
        }
        c1114a.g.addAll(j5g.u0(arrayList, j5g.u0(arrayList4, j5g.u0(arrayList3, arrayList2))));
        arrayList.clear();
        linkedHashMap.clear();
        linkedHashMap4.clear();
        linkedHashMap5.clear();
        linkedHashMap3.clear();
        linkedHashMap2.clear();
    }

    public static Peer b(JSONArray jSONArray, int i) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.b(jSONArray.getLong(i));
    }

    public static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    public static void d(C1114a c1114a, JSONArray jSONArray) {
        Peer b2 = b(jSONArray, 1);
        int i = jSONArray.getInt(2);
        LinkedHashMap linkedHashMap = c1114a.f;
        Integer num = (Integer) linkedHashMap.get(b2);
        linkedHashMap.put(b2, Integer.valueOf(Math.max(num != null ? num.intValue() : i, i)));
    }

    public static void e(C1114a c1114a, JSONArray jSONArray, ComposingType composingType) {
        Peer b2 = b(jSONArray, 1);
        JSONArray jSONArray2 = jSONArray.getJSONArray(2);
        ArraySet arraySet = new ArraySet();
        int length = jSONArray2.length();
        for (int i = 0; i < length; i++) {
            long j = jSONArray2.getLong(i);
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arraySet.add(Peer.a.b(j));
        }
        c1114a.a.add(new wri(b2, arraySet, jSONArray.getInt(3), jSONArray.getInt(4), composingType));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void f(C1114a c1114a, JSONArray jSONArray, Peer peer, long j) {
        e900 e900Var;
        JSONObject jSONObject;
        String string;
        z28 bVar;
        z28 cVar;
        ReactionsLpEventSubType reactionsLpEventSubType;
        s5f0 s5f0Var;
        e900 zimVar;
        e900 zimVar2;
        e900 udmVar;
        Msg msg;
        Integer num;
        Integer num2;
        boolean z;
        int i;
        Msg msg2;
        boolean z2;
        boolean z3;
        Integer num3;
        Peer peer2;
        int i2;
        boolean z4;
        LinkedHashMap linkedHashMap = c1114a.d;
        ArrayList arrayList = c1114a.a;
        int i3 = jSONArray.getInt(0);
        int i4 = 2;
        boolean z5 = true;
        if (i3 == 20) {
            c1114a.c.put(b(jSONArray, 1), Integer.valueOf(jSONArray.getInt(2)));
            return;
        }
        if (i3 == 21) {
            linkedHashMap.put(b(jSONArray, 1), Integer.valueOf(jSONArray.getInt(2)));
            int optInt = jSONArray.optInt(4);
            if (optInt > 0) {
                c1114a.e.put(b(jSONArray, 1), Integer.valueOf(optInt));
                return;
            }
            return;
        }
        if (i3 == 80) {
            arrayList.add(new d5q0(jSONArray.getInt(1), jSONArray.getInt(2), jSONArray.getInt(3) > 0, jSONArray.getInt(4), jSONArray.getInt(7), jSONArray.getInt(8), jSONArray.getInt(9)));
            return;
        }
        if (i3 == 81) {
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList.add(new elq0(Peer.a.b(-jSONArray.getLong(1))));
            return;
        }
        if (i3 == 90) {
            if (jSONArray.getInt(0) != 90) {
                throw new IllegalStateException(("Invalid data has been passed: '" + jSONArray + '\'').toString());
            }
            int i5 = jSONArray.getInt(1);
            if (i5 == 0) {
                e900Var = yaj.c.a;
            } else if (i5 == 1) {
                e900Var = yaj.b.a;
            } else if (i5 == 2) {
                Serializer.c<Peer> cVar3 = Peer.CREATOR;
                e900Var = new yaj.a(Peer.a.b(jSONArray.getLong(2)));
            } else {
                if (i5 != 3) {
                    throw new IllegalArgumentException("Unsupported contacts event type " + jSONArray.getInt(1));
                }
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                e900Var = new yaj.d(Peer.a.b(jSONArray.getLong(2)));
            }
            arrayList.add(e900Var);
            return;
        }
        if (i3 == 91) {
            Object obj = jSONArray.get(1);
            Serializer.c<Peer> cVar5 = Peer.CREATOR;
            arrayList.add(new umm(epx.f(obj, 1) ? new umm.a.b(jSONArray.getLong(4)) : epx.f(obj, 2) ? umm.a.C3809a.a : epx.f(obj, 3) ? umm.a.c.a : umm.a.c.a, Peer.a.b(jSONArray.getLong(2)), Peer.a.b(jSONArray.getLong(3))));
            return;
        }
        if (i3 == 118) {
            jSONArray.getJSONObject(1).getString("event_type");
            arrayList.add(new v5p());
            return;
        }
        if (i3 == 119) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(1);
            Serializer.c<Peer> cVar6 = Peer.CREATOR;
            Peer b2 = Peer.a.b(jSONObject2.getLong("owner_id"));
            Peer b3 = Peer.a.b(jSONObject2.getLong("peer_id"));
            String string2 = jSONObject2.getString("event_id");
            if (jSONObject2.has("action") && (string = (jSONObject = jSONObject2.getJSONObject("action")).getString("type")) != null) {
                switch (string.hashCode()) {
                    case -504325460:
                        if (string.equals("open_app")) {
                            bVar = new z28.b(jSONObject.getInt("app_id"), jSONObject.has("owner_id") ? Peer.a.b(jSONObject.getLong("owner_id")) : null, jSONObject.getString("hash"));
                            break;
                        }
                        break;
                    case 435214860:
                        if (string.equals("open_modal_view")) {
                            if (mbw.a.a()) {
                                cVar = new z28.c(jSONObject.getString("link"));
                                bVar = cVar;
                                break;
                            } else {
                                bVar = new z28.a(jSONObject.getString("link"), jSONObject.has("payload") ? jSONObject.getString("payload") : null);
                                break;
                            }
                        }
                        break;
                    case 1546100943:
                        if (string.equals("open_link")) {
                            bVar = new z28.a(jSONObject.getString("link"), jSONObject.has("payload") ? jSONObject.getString("payload") : null);
                            break;
                        }
                        break;
                    case 2012826631:
                        if (string.equals("show_snackbar")) {
                            cVar = new z28.d(jSONObject.getString("text"));
                            bVar = cVar;
                            break;
                        }
                        break;
                }
                arrayList.add(new v28(b3, b2, string2, bVar));
                return;
            }
            bVar = null;
            arrayList.add(new v28(b3, b2, string2, bVar));
            return;
        }
        if (i3 == 121) {
            long j2 = jSONArray.getLong(1);
            if (j2 != 0) {
                throw new IllegalArgumentException(qlb0.a(j2, "Invalid type ", " for lp event EduScheduleLpEvent"));
            }
            long j3 = jSONArray.getLong(2);
            Serializer.c<Peer> cVar7 = Peer.CREATOR;
            arrayList.add(new c7p(Peer.a.b(j3)));
            return;
        }
        if (i3 == 122) {
            long j4 = jSONArray.getLong(2);
            Serializer.c<Peer> cVar8 = Peer.CREATOR;
            Peer b4 = Peer.a.b(j4);
            arrayList.add(new s6p(b4));
            arrayList.add(new c7p(b4));
            return;
        }
        if (i3 == 601) {
            ReactionsLpEventSubType.a aVar = ReactionsLpEventSubType.Companion;
            int i6 = jSONArray.getInt(1);
            aVar.getClass();
            ReactionsLpEventSubType[] values = ReactionsLpEventSubType.values();
            int length = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    reactionsLpEventSubType = null;
                    break;
                }
                reactionsLpEventSubType = values[i7];
                if (reactionsLpEventSubType.h() == i6) {
                    break;
                } else {
                    i7++;
                }
            }
            if (reactionsLpEventSubType == null) {
                s5f0Var = null;
            } else {
                long j5 = jSONArray.getLong(2);
                int i8 = jSONArray.getInt(3);
                ReactionsLpEventSubType reactionsLpEventSubType2 = ReactionsLpEventSubType.I_ADDED_REACTION;
                Integer valueOf = reactionsLpEventSubType == reactionsLpEventSubType2 ? Integer.valueOf(jSONArray.getInt(4)) : null;
                boolean z6 = reactionsLpEventSubType == reactionsLpEventSubType2 || reactionsLpEventSubType == ReactionsLpEventSubType.I_DELETED_REACTION;
                int i9 = reactionsLpEventSubType == reactionsLpEventSubType2 ? 5 : 4;
                int i10 = jSONArray.getInt(i9);
                int i11 = i9 + 1;
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < i10; i12++) {
                    int i13 = jSONArray.getInt(i11);
                    int i14 = i11 + 1;
                    int i15 = jSONArray.getInt(i14);
                    int i16 = jSONArray.getInt(i11 + 2);
                    int i17 = jSONArray.getInt(i11 + 3);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i18 = 0; i18 < i17; i18++) {
                        arrayList3.add(Long.valueOf(jSONArray.getLong(i11 + 4 + i18)));
                    }
                    Pair pair = new Pair(Integer.valueOf(i14 + i13), new MsgReactionImpl(i15, arrayList3, i16));
                    i11 = ((Number) pair.d()).intValue();
                    arrayList2.add((MsgReaction) pair.g());
                }
                s5f0Var = new s5f0(reactionsLpEventSubType, j5, i8, valueOf, z6, arrayList2);
            }
            if (s5f0Var != null) {
                arrayList.add(s5f0Var);
                return;
            }
            return;
        }
        if (i3 == 602) {
            long j6 = jSONArray.getLong(1);
            int i19 = jSONArray.getInt(2);
            ArrayList arrayList4 = new ArrayList();
            int i20 = i19 + 3;
            for (int i21 = 3; i21 < i20; i21++) {
                arrayList4.add(Integer.valueOf(jSONArray.getInt(i21)));
            }
            arrayList.add(new i5q0(j6, arrayList4));
            return;
        }
        if (i3 == 10013) {
            arrayList.add(new kxf(jSONArray.getInt(2), b(jSONArray, 1), jSONArray.optInt(3, 1) > 0));
            return;
        }
        if (i3 == 10014) {
            arrayList.add(new ayf(jSONArray.getInt(2), b(jSONArray, 1)));
            return;
        }
        if (i3 == 1) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(lhg.a(i3, "Got unhandled LpEvent with id = ")));
            return;
        }
        if (i3 == 10) {
            Peer b5 = b(jSONArray, 1);
            int i22 = jSONArray.getInt(2);
            arrayList.add(new qjm(i22, b5, false));
            DialogFlag.Companion.getClass();
            Iterator it = DialogFlag.a.a(i22).iterator();
            while (it.hasNext()) {
                int i23 = b.$EnumSwitchMapping$0[((DialogFlag) it.next()).ordinal()];
                if (i23 == 1) {
                    zimVar = new zim(b5);
                } else if (i23 == 2) {
                    zimVar = new xgm(b5, false);
                } else {
                    if (i23 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zimVar = new bam(b5, false);
                }
                arrayList.add(zimVar);
            }
            return;
        }
        if (i3 == 12) {
            Peer b6 = b(jSONArray, 1);
            int i24 = jSONArray.getInt(2);
            arrayList.add(new qjm(i24, b6, true));
            DialogFlag.Companion.getClass();
            Iterator it2 = DialogFlag.a.a(i24).iterator();
            while (it2.hasNext()) {
                int i25 = b.$EnumSwitchMapping$0[((DialogFlag) it2.next()).ordinal()];
                if (i25 == 1) {
                    zimVar2 = new zim(b6);
                } else if (i25 == 2) {
                    zimVar2 = new xgm(b6, true);
                } else {
                    if (i25 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zimVar2 = new bam(b6, true);
                }
                arrayList.add(zimVar2);
            }
            return;
        }
        if (i3 == 50) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(1);
            int optInt2 = jSONObject3.optInt("error");
            boolean z7 = optInt2 != 0;
            Serializer.c<Peer> cVar9 = Peer.CREATOR;
            Peer b7 = Peer.a.b(jSONObject3.optLong("peer_id"));
            int optInt3 = jSONObject3.optInt("cmid");
            if (z7) {
                arrayList.add(new ynp0.a(optInt3, optInt2, b7));
                return;
            }
            List c0 = drm0.c0(jSONObject3.optString("language"), new String[]{"-"}, 0, 6);
            Pair pair2 = new Pair(c0.get(0), c0.get(1));
            String str = (String) pair2.i();
            String str2 = (String) pair2.j();
            String str3 = h900.a;
            arrayList.add(new ynp0.b(b7, optInt3, h900.a(jSONObject3.optString("translation")), str, str2));
            return;
        }
        if (i3 == 52) {
            Peer b8 = b(jSONArray, 2);
            Peer b9 = b(jSONArray, 3);
            int i26 = jSONArray.getInt(1);
            int i27 = jSONArray.getInt(3);
            a(c1114a);
            switch (i26) {
                case 0:
                    udmVar = new udm(b8);
                    break;
                case 1:
                    udmVar = new udm(b8);
                    break;
                case 2:
                    udmVar = new udm(b8);
                    break;
                case 3:
                    udmVar = new l9m(b8, b9);
                    break;
                case 4:
                    udmVar = new udm(b8);
                    break;
                case 5:
                    if (i27 == 0) {
                        udmVar = new qim(b8);
                        break;
                    } else {
                        udmVar = new nim(i27, b8);
                        break;
                    }
                case 6:
                    udmVar = new zgm(b8, b9);
                    break;
                case 7:
                    udmVar = new ehm(b8, b9);
                    break;
                case 8:
                    udmVar = new ehm(b8, b9);
                    break;
                case 9:
                    udmVar = new n9m(b8, b9);
                    break;
                case 10:
                    udmVar = new tfm(b8);
                    break;
                case 11:
                    udmVar = new bbm(b8);
                    break;
                case 12:
                    if (i27 != 0) {
                        if (i27 != 1) {
                            if (i27 != 2) {
                                if (i27 != 3) {
                                    udmVar = new yhm(b8, MsgRequestStatus.NONE);
                                    break;
                                } else {
                                    udmVar = new yhm(b8, MsgRequestStatus.PENDING);
                                    break;
                                }
                            } else {
                                udmVar = new yhm(b8, MsgRequestStatus.REJECTED);
                                break;
                            }
                        } else {
                            udmVar = new yhm(b8, MsgRequestStatus.ACCEPTED);
                            break;
                        }
                    } else {
                        udmVar = new yhm(b8, MsgRequestStatus.DELETED);
                        break;
                    }
                case 13:
                    udmVar = new whm(b9, b8);
                    break;
                case 14:
                    udmVar = new udm(b8);
                    break;
                case 15:
                    udmVar = new jjm(b8, b9);
                    break;
                case 16:
                    udmVar = new hjm(b8, b9);
                    break;
                case 17:
                    udmVar = new t8m(b8, b9);
                    break;
                case 18:
                    udmVar = new i9m(b8, b9);
                    break;
                case 19:
                case 20:
                case 21:
                case 24:
                case 25:
                case 29:
                case 30:
                case 31:
                case 34:
                default:
                    udmVar = new udm(b8);
                    break;
                case 22:
                    udmVar = new xfm(b8, i27 != 0);
                    break;
                case 23:
                    udmVar = new ekm(b8);
                    break;
                case 26:
                    udmVar = new j9m(i27, b8);
                    break;
                case 27:
                    udmVar = new ycm(i27, b8);
                    break;
                case 28:
                    udmVar = new kjm(i27, b8);
                    break;
                case 32:
                    if (this.a) {
                        udmVar = new chm(b8, b9);
                        break;
                    } else {
                        udmVar = new udm(b8);
                        break;
                    }
                case 33:
                    udmVar = new eim(b8, b9);
                    break;
                case 35:
                    udmVar = new jhm(b8);
                    break;
            }
            arrayList.add(udmVar);
            return;
        }
        if (i3 == 115) {
            arrayList.add(new g2x0(jSONArray.getJSONObject(1)));
            return;
        }
        if (i3 == 701) {
            arrayList.add(new kxf(jSONArray.getInt(2), b(jSONArray, 1), true));
            return;
        }
        if (i3 == 100000) {
            arrayList.add(q8q0.a);
            return;
        }
        if (i3 == 10018) {
            int i28 = jSONArray.getInt(1);
            Peer b10 = b(jSONArray, 3);
            if (jSONArray.length() > 5) {
                int i29 = jSONArray.getInt(2);
                long j7 = jSONArray.getLong(3);
                long j8 = jSONArray.getLong(4);
                String optString = jSONArray.optString(5, "");
                JSONObject jSONObject4 = jSONArray.getJSONObject(6);
                JSONObject jSONObject5 = jSONArray.getJSONObject(7);
                Msg d = g900.d(new nye0(j7, jSONArray.getInt(9), i29, j8, optString, jSONObject4, jSONObject5, jSONArray.getInt(8), i28, jSONArray.getLong(10)), peer);
                String optString2 = jSONObject5.optString("reply", "{}");
                Integer x = f370.x(new JSONObject(optString2 != null ? optString2 : "{}"), "conversation_message_id");
                num2 = f370.x(jSONObject4, "linked_cmid");
                num = x;
                msg = d;
            } else {
                msg = null;
                num = null;
                num2 = null;
            }
            arrayList.add(new dyf(b10, i28, msg, num, num2));
            return;
        }
        if (i3 == 10019) {
            arrayList.add(new sxf(jSONArray.getInt(1), b(jSONArray, 2)));
            return;
        }
        switch (i3) {
            case 501:
                arrayList.add(new hyr(jSONArray.getInt(1), jSONArray.getString(2), jSONArray.optInt(4, 0)));
                return;
            case 502:
                arrayList.add(new iyr(jSONArray.getInt(1)));
                return;
            case 503:
                arrayList.add(new czr(jSONArray.getInt(1), jSONArray.getString(2)));
                return;
            case ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED /* 504 */:
                int i30 = jSONArray.getInt(1);
                ArrayList arrayList5 = new ArrayList();
                int length2 = jSONArray.length();
                while (i4 < length2) {
                    Serializer.c<Peer> cVar10 = Peer.CREATOR;
                    arrayList5.add(Peer.a.b(jSONArray.getLong(i4)));
                    i4++;
                }
                arrayList.add(new izr(i30, arrayList5));
                return;
            case 505:
                int i31 = jSONArray.getInt(1);
                ArrayList arrayList6 = new ArrayList();
                int length3 = jSONArray.length();
                while (i4 < length3) {
                    Serializer.c<Peer> cVar11 = Peer.CREATOR;
                    arrayList6.add(Peer.a.b(jSONArray.getLong(i4)));
                    i4++;
                }
                arrayList.add(new hzr(i31, arrayList6));
                return;
            case IronSourceError.ERROR_CODE_INVALID_KEY_VALUE /* 506 */:
                k9x q = swe0.q(1, jSONArray.length());
                ArrayList arrayList7 = new ArrayList(c5g.u(q, 10));
                j9x it3 = q.iterator();
                while (it3.d) {
                    arrayList7.add(Integer.valueOf(jSONArray.getInt(it3.nextInt())));
                }
                arrayList.add(new z1s(arrayList7));
                return;
            case 507:
                ArrayList arrayList8 = new ArrayList();
                int length4 = jSONArray.length();
                for (int i32 = 1; i32 < length4; i32++) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i32);
                    int i33 = jSONArray2.getInt(0);
                    int i34 = jSONArray2.getInt(1);
                    int i35 = jSONArray2.getInt(2);
                    arrayList8.add(new spm(i33, i35, i34 - i35));
                }
                arrayList.add(new q0s(arrayList8));
                return;
            case IronSourceError.ERROR_CODE_INIT_FAILED /* 508 */:
                arrayList.add(new wyr(jSONArray.getInt(1)));
                return;
            case IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW /* 509 */:
                arrayList.add(new i0s(jSONArray.getInt(1), jSONArray.getInt(2)));
                return;
            default:
                switch (i3) {
                    case 63:
                        e(c1114a, jSONArray, ComposingType.TEXT);
                        return;
                    case 64:
                        e(c1114a, jSONArray, ComposingType.AUDIO);
                        return;
                    case 65:
                        e(c1114a, jSONArray, ComposingType.PHOTO);
                        return;
                    case 66:
                        e(c1114a, jSONArray, ComposingType.VIDEO);
                        return;
                    case 67:
                        e(c1114a, jSONArray, ComposingType.FILE);
                        return;
                    case 68:
                        e(c1114a, jSONArray, ComposingType.VIDEO_MSG);
                        return;
                    default:
                        switch (i3) {
                            case 10001:
                                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException(lhg.a(i3, "Got unhandled LpEvent with id = ")));
                                return;
                            case 10002:
                                Peer b11 = b(jSONArray, 3);
                                int i36 = jSONArray.getInt(1);
                                int i37 = jSONArray.getInt(2);
                                if (c(i37, 8)) {
                                    arrayList.add(new qxf(i36, b11, true));
                                }
                                if (c(i37, 64)) {
                                    arrayList.add(new cyf(i36, b11, true));
                                }
                                if (c(i37, 128)) {
                                    arrayList.add(new ixf(i36, b11, true));
                                }
                                if (c(i37, 65536)) {
                                    arrayList.add(new oxf(i36, b11, true));
                                }
                                if (c(i37, 131072)) {
                                    arrayList.add(new ixf(i36, b11, true));
                                }
                                if (c(i37, 4096)) {
                                    arrayList.add(new uxf(i36, b11, true));
                                    return;
                                }
                                break;
                            case yup.PERMISSION_NOT_DECLARED /* 10003 */:
                                Peer b12 = b(jSONArray, 3);
                                int i38 = jSONArray.getInt(1);
                                int i39 = jSONArray.getInt(2);
                                if (c(i39, 8)) {
                                    z = false;
                                    arrayList.add(new qxf(i38, b12, false));
                                } else {
                                    z = false;
                                }
                                if (c(i39, 64)) {
                                    arrayList.add(new cyf(i38, b12, z));
                                }
                                if (c(i39, 128)) {
                                    arrayList.add(new ixf(i38, b12, z));
                                }
                                if (c(i39, 65536)) {
                                    arrayList.add(new oxf(i38, b12, z));
                                }
                                if (c(i39, 4096)) {
                                    arrayList.add(new uxf(i38, b12, z));
                                    return;
                                }
                                break;
                            case yup.INVALID_PERMISSION_RATIONALE_DECLARATION /* 10004 */:
                                int i40 = jSONArray.getInt(1);
                                int i41 = jSONArray.getInt(2);
                                int i42 = jSONArray.getInt(3);
                                Peer b13 = b(jSONArray, 4);
                                if (!epx.f(b13, peer) && !c(i41, 2)) {
                                    z5 = false;
                                }
                                int optInt4 = jSONArray.optInt(5);
                                if (jSONArray.length() > 6) {
                                    long j9 = b13.b;
                                    long j10 = jSONArray.getLong(5);
                                    String optString3 = jSONArray.optString(6, "");
                                    JSONObject jSONObject6 = jSONArray.getJSONObject(7);
                                    JSONObject jSONObject7 = jSONArray.getJSONObject(8);
                                    nye0 nye0Var = new nye0(j9, jSONArray.getInt(10), i41, j10, optString3, jSONObject6, jSONObject7, jSONArray.getInt(9), i40, jSONArray.getLong(11));
                                    i = i40;
                                    String optString4 = jSONObject7.optString("reply", "{}");
                                    num3 = f370.x(new JSONObject(optString4 != null ? optString4 : "{}"), "conversation_message_id");
                                    z3 = g900.b(i41, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                                    z2 = g900.c(nye0Var, peer);
                                    msg2 = g900.d(nye0Var, peer);
                                    if (msg2 != null) {
                                        msg2.e = j;
                                    }
                                    if (msg2 != null) {
                                        msg2.A = MessageSource.NEW_MESSAGE_FROM_LP;
                                    }
                                } else {
                                    i = i40;
                                    msg2 = null;
                                    z2 = false;
                                    z3 = false;
                                    num3 = null;
                                }
                                LinkedHashMap linkedHashMap2 = c1114a.b;
                                if (linkedHashMap2.get(b13) == null) {
                                    SparseArray sparseArray = new SparseArray();
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    sparseArray.put(i, msg2);
                                    u4q0 u4q0Var = zik0.a;
                                    sparseBooleanArray.put(i, z3);
                                    sparseBooleanArray2.put(i, z2);
                                    if (num3 != null) {
                                        sparseIntArray.put(i, num3.intValue());
                                    }
                                    fxf fxfVar = new fxf(b13, sparseArray, sparseIntArray, sparseBooleanArray, sparseBooleanArray2, null, Integer.valueOf(optInt4), 32);
                                    peer2 = b13;
                                    linkedHashMap2.put(peer2, fxfVar);
                                } else {
                                    peer2 = b13;
                                    fxf fxfVar2 = (fxf) pn00.h(peer2, linkedHashMap2);
                                    fxfVar2.b.put(i, msg2);
                                    SparseBooleanArray sparseBooleanArray3 = fxfVar2.d;
                                    u4q0 u4q0Var2 = zik0.a;
                                    sparseBooleanArray3.put(i, z3);
                                    fxfVar2.e.put(i, z2);
                                    if (num3 != null) {
                                        fxfVar2.c.put(i, num3.intValue());
                                    }
                                }
                                linkedHashMap.put(peer2, Integer.valueOf(i42));
                                if (!z5) {
                                    LinkedHashMap linkedHashMap3 = c1114a.f;
                                    Integer num4 = (Integer) linkedHashMap3.get(peer2);
                                    linkedHashMap3.put(peer2, Integer.valueOf(Math.max(num4 != null ? num4.intValue() : i, i)));
                                    return;
                                }
                                break;
                            case yup.INVALID_UID /* 10005 */:
                                Msg msg3 = null;
                                int i43 = jSONArray.getInt(1);
                                int i44 = jSONArray.getInt(2);
                                long j11 = jSONArray.getLong(3);
                                if (jSONArray.length() > 5) {
                                    nye0 nye0Var2 = new nye0(j11, jSONArray.getInt(9), i44, jSONArray.getLong(4), jSONArray.optString(5, ""), jSONArray.getJSONObject(6), jSONArray.getJSONObject(7), jSONArray.getInt(8), i43, jSONArray.getLong(10));
                                    j11 = j11;
                                    i2 = i43;
                                    boolean c = g900.c(nye0Var2, peer);
                                    Msg d2 = g900.d(nye0Var2, peer);
                                    z4 = c;
                                    msg3 = d2;
                                } else {
                                    i2 = i43;
                                    z4 = false;
                                }
                                if (msg3 != null) {
                                    msg3.e = j;
                                }
                                if (msg3 != null) {
                                    msg3.A = MessageSource.EDIT_MESSAGE_FROM_LP;
                                }
                                Serializer.c<Peer> cVar12 = Peer.CREATOR;
                                arrayList.add(new mxf(Peer.a.b(j11), i2, msg3, z4));
                                return;
                            case yup.DATABASE_ERROR /* 10006 */:
                                Peer b14 = b(jSONArray, 1);
                                if (epx.f(b14, peer)) {
                                    d(c1114a, jSONArray);
                                    return;
                                }
                                int i45 = jSONArray.getInt(2);
                                int optInt5 = jSONArray.optInt(3, -1);
                                arrayList.add(new wxf(b14, i45, optInt5 >= 0 ? Integer.valueOf(optInt5) : null));
                                return;
                            case yup.INTERNAL_ERROR /* 10007 */:
                                d(c1114a, jSONArray);
                                return;
                        }
                        return;
                }
        }
    }
}
