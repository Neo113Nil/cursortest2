package com.vk.voip.ui.members;

import android.util.LruCache;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.calls.dto.CallsCustomNameForCallDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullMemberStatusDto;
import com.vk.api.generated.messages.dto.MessagesAnonymDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messages.dto.MessagesGetCallParticipantsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetJoinLinkResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.profiles.VoipFriendStatus;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.mixed.i;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.m;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.internal.operators.single.y;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a1w;
import xsna.arm0;
import xsna.asp;
import xsna.asu0;
import xsna.b630;
import xsna.be50;
import xsna.brm0;
import xsna.c5g;
import xsna.cd9;
import xsna.cwm;
import xsna.d8t0;
import xsna.dd9;
import xsna.dz2;
import xsna.erm0;
import xsna.eu2;
import xsna.fch;
import xsna.fnw0;
import xsna.fxj0;
import xsna.g89;
import xsna.gnw0;
import xsna.gwd0;
import xsna.gzs;
import xsna.h7t0;
import xsna.hnw0;
import xsna.id9;
import xsna.iq40;
import xsna.iqt;
import xsna.izs;
import xsna.j5g;
import xsna.jgp;
import xsna.k6c0;
import xsna.kwg0;
import xsna.m4s;
import xsna.mdm0;
import xsna.nt8;
import xsna.oan0;
import xsna.on00;
import xsna.pd9;
import xsna.pft0;
import xsna.pn00;
import xsna.prl0;
import xsna.q1w;
import xsna.qu50;
import xsna.r1r0;
import xsna.rew0;
import xsna.s8;
import xsna.sew0;
import xsna.sg20;
import xsna.u1r0;
import xsna.uni;
import xsna.upj;
import xsna.uw4;
import xsna.uxb0;
import xsna.vg20;
import xsna.vgs0;
import xsna.vqf0;
import xsna.vx2;
import xsna.whr0;
import xsna.xdw0;
import xsna.xx40;
import xsna.yfb;
import xsna.yhq0;
import xsna.z59;
import xsna.zdw0;
import xsna.zrp;

/* compiled from: VoipDataProvider.kt */
/* loaded from: classes7.dex */
public final class VoipDataProvider {
    public static final long p = TimeUnit.SECONDS.toMillis(10);
    public static final /* synthetic */ int q = 0;
    public final com.vk.voip.b a;
    public final a b;
    public final c c;
    public final b d;
    public final com.vk.voip.ui.members.a e;
    public final hnw0 f;
    public final long g;
    public final io.reactivex.rxjava3.disposables.c h;
    public final ReentrantLock i;
    public final f<whr0> j;
    public final w k;
    public List<whr0> l;
    public final ShouldPutUsersToInviteIntoCache m;
    public final HashMap<String, whr0> n;
    public final LinkedHashMap o;

    /* compiled from: VoipDataProvider.kt */
    public static final class ShouldPutUsersToInviteIntoCache {
        public volatile boolean a;
        public volatile boolean b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VoipDataProvider.kt */
        public static final class UsersForInviteCachedFrom {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ UsersForInviteCachedFrom[] $VALUES;
            public static final UsersForInviteCachedFrom Friends;
            public static final UsersForInviteCachedFrom UsersOfGroup;

            static {
                UsersForInviteCachedFrom usersForInviteCachedFrom = new UsersForInviteCachedFrom("Friends", 0);
                Friends = usersForInviteCachedFrom;
                UsersForInviteCachedFrom usersForInviteCachedFrom2 = new UsersForInviteCachedFrom("UsersOfGroup", 1);
                UsersOfGroup = usersForInviteCachedFrom2;
                UsersForInviteCachedFrom[] usersForInviteCachedFromArr = {usersForInviteCachedFrom, usersForInviteCachedFrom2};
                $VALUES = usersForInviteCachedFromArr;
                $ENTRIES = new asp(usersForInviteCachedFromArr);
            }

            public UsersForInviteCachedFrom() {
                throw null;
            }

            public static UsersForInviteCachedFrom valueOf(String str) {
                return (UsersForInviteCachedFrom) Enum.valueOf(UsersForInviteCachedFrom.class, str);
            }

            public static UsersForInviteCachedFrom[] values() {
                return (UsersForInviteCachedFrom[]) $VALUES.clone();
            }
        }

        /* compiled from: VoipDataProvider.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UsersForInviteCachedFrom.values().length];
                try {
                    iArr[UsersForInviteCachedFrom.Friends.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UsersForInviteCachedFrom.UsersOfGroup.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    /* compiled from: VoipDataProvider.kt */
    public static final class a {
        public final gwd0 a;
        public final s8 b;
        public final gzs<Boolean> c;
        public final vqf0 d;
        public final eu2 e;

        public a(gwd0 gwd0Var, s8 s8Var, gzs gzsVar, vqf0 vqf0Var, eu2 eu2Var) {
            this.a = gwd0Var;
            this.b = s8Var;
            this.c = gzsVar;
            this.d = vqf0Var;
            this.e = eu2Var;
        }
    }

    /* compiled from: VoipDataProvider.kt */
    public static final class b {
        public final w a;
        public final w b;

        public b() {
            asu0.a.getClass();
            w i = asu0.i();
            w b = io.reactivex.rxjava3.android.schedulers.a.b();
            this.a = i;
            this.b = b;
        }
    }

    /* compiled from: VoipDataProvider.kt */
    public static final class c {
        public final cd9 a;
        public final nt8 b;
        public final upj c;
        public final iqt d;
        public final Lazy<rew0> e;

        public c(cd9 cd9Var, nt8 nt8Var, iqt iqtVar, Lazy lazy) {
            upj upjVar = new upj();
            this.a = cd9Var;
            this.b = nt8Var;
            this.c = upjVar;
            this.d = iqtVar;
            this.e = lazy;
        }
    }

    /* compiled from: VoipDataProvider.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Collection<? extends String>, q<Map<String, ? extends whr0>>> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final q<Map<String, ? extends whr0>> invoke(Collection<? extends String> collection) {
            List list;
            t iVar;
            Collection<? extends String> collection2 = collection;
            VoipDataProvider voipDataProvider = (VoipDataProvider) this.receiver;
            int i = VoipDataProvider.q;
            Map<String, whr0> e = voipDataProvider.e(collection2);
            LinkedHashSet E0 = j5g.E0(collection2, e.keySet());
            t T = e.isEmpty() ? g0.b : q.T(e);
            if (E0.isEmpty()) {
                iVar = g0.b;
            } else {
                List O0 = j5g.O0(E0);
                if (O0.size() <= 100) {
                    list = Collections.singletonList(O0);
                } else {
                    List subList = O0.subList(0, 100);
                    ArrayList U0 = j5g.U0(O0.subList(100, O0.size()), 500, 500, true);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(subList);
                    arrayList.addAll(U0);
                    list = arrayList;
                }
                m1 a0 = q.O(list).a0(voipDataProvider.k);
                b630 b630Var = new b630(new mdm0(voipDataProvider, 29), 24);
                io.reactivex.rxjava3.internal.functions.b.a(2, "bufferSize");
                iVar = new i(a0, b630Var, ErrorMode.END);
            }
            return q.q(T, iVar);
        }
    }

    public VoipDataProvider() {
        throw null;
    }

    public VoipDataProvider(String str, com.vk.voip.b bVar, a aVar, c cVar) {
        b bVar2 = new b();
        a1w a1wVar = q1w.a;
        com.vk.voip.ui.members.a aVar2 = new com.vk.voip.ui.members.a(a1wVar == null ? null : a1wVar, aVar.e);
        hnw0 hnw0Var = new hnw0(new yhq0(aVar.c), new g89(bVar, aVar.e), str, new d8t0(cVar, 12));
        long j = p;
        this.a = bVar;
        this.b = aVar;
        this.c = cVar;
        this.d = bVar2;
        this.e = aVar2;
        this.f = hnw0Var;
        this.g = j;
        this.h = EmptyDisposable.INSTANCE;
        this.i = new ReentrantLock(true);
        this.j = new f<>();
        this.k = asu0.a.A(1, "voip:app-binding:load-call-members");
        id9 id9Var = new id9(new pd9(cVar.e.getValue()), cVar.a, bVar2.b, new fnw0(this, 0));
        this.h.dispose();
        io.reactivex.rxjava3.subjects.d<dd9.a> dVar = id9Var.e;
        dVar.getClass();
        this.h = new i0(new z0(dVar).a0(bVar2.b), new xx40(new oan0(12), 21)).subscribe(new be50(new vgs0(this, 12), 28), kwg0.b());
        ShouldPutUsersToInviteIntoCache shouldPutUsersToInviteIntoCache = new ShouldPutUsersToInviteIntoCache();
        shouldPutUsersToInviteIntoCache.a = true;
        shouldPutUsersToInviteIntoCache.b = true;
        this.m = shouldPutUsersToInviteIntoCache;
        this.n = new HashMap<>();
        this.o = new LinkedHashMap();
    }

    public final whr0 a(String str) {
        return c(Collections.singletonList(str)).get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0582  */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map b(LinkedHashSet linkedHashSet) {
        Set R0;
        String str;
        Iterator it;
        xdw0 xdw0Var;
        ?? r6;
        EmptyList<whr0> emptyList;
        ?? r9;
        fch fchVar;
        sew0 cVar;
        sew0 b2;
        Iterator it2;
        whr0 whr0Var;
        sew0.b a2;
        sew0 d2;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto;
        xdw0 xdw0Var2;
        MessagesGetCallParticipantsResponseDto messagesGetCallParticipantsResponseDto;
        ArrayList arrayList;
        z59 z59Var;
        sew0.b a3;
        Object obj;
        Map map;
        String str2;
        synchronized (this) {
            m();
            R0 = j5g.R0(linkedHashSet);
            R0.removeAll(this.o.keySet());
        }
        if (R0.isEmpty()) {
            return jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = true;
        Iterator it3 = j5g.U0(R0, 500, 500, true).iterator();
        while (it3.hasNext()) {
            List list = (List) it3.next();
            a aVar = this.b;
            if (list.isEmpty()) {
                map = jgp.b;
                it = it3;
            } else {
                gwd0 gwd0Var = aVar.a;
                CallId callId = com.vk.voip.ui.c.T0;
                if (callId.c) {
                    throw new IllegalStateException("No active call");
                }
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator it4 = list2.iterator();
                while (true) {
                    boolean z2 = false;
                    if (it4.hasNext()) {
                        String str3 = (String) it4.next();
                        if (this.a.s(str3) && !brm0.B(str3, "-", false)) {
                            z2 = z;
                        }
                        if (z2 == z) {
                            str3 = "-".concat(str3);
                        } else if (z2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList2.add(str3);
                    } else {
                        xdw0 xdw0Var3 = (xdw0) aVar.d.invoke();
                        cwm cwmVar = xdw0Var3 != null ? new cwm(xdw0Var3.g, xdw0Var3.b) : null;
                        hnw0 hnw0Var = this.f;
                        vg20 vg20Var = hnw0Var.g;
                        String str4 = callId.b;
                        EmptyList<whr0> emptyList2 = EmptyList.b;
                        dz2 x = yfb.x(sg20.e(vg20Var, str4, j5g.O0(arrayList2), emptyList2, hnw0.j, cwmVar != null ? (String) cwmVar.b : null, (cwmVar == null || (str2 = (String) cwmVar.c) == null) ? null : arm0.n(str2), 72));
                        if (cwmVar != null) {
                            x.h = z;
                            x.d = z;
                        }
                        x.q = 0;
                        x.c = z;
                        zdw0.a(x, hnw0Var.d);
                        vx2.a.getClass();
                        MessagesGetCallParticipantsResponseDto messagesGetCallParticipantsResponseDto2 = (MessagesGetCallParticipantsResponseDto) x.f(vx2.b());
                        g89 g89Var = hnw0Var.b;
                        eu2 eu2Var = g89Var.b;
                        str = "";
                        if (messagesGetCallParticipantsResponseDto2 == null) {
                            fchVar = new fch(jgp.b, str);
                            it = it3;
                            xdw0Var = xdw0Var3;
                        } else {
                            List<UsersUserFullDto> g = messagesGetCallParticipantsResponseDto2.g();
                            if (g != null) {
                                List<UsersUserFullDto> list3 = g;
                                ?? arrayList3 = new ArrayList(c5g.u(list3, 10));
                                for (UsersUserFullDto usersUserFullDto : list3) {
                                    eu2 eu2Var2 = eu2Var;
                                    String valueOf = String.valueOf(usersUserFullDto.s1().b);
                                    String D0 = usersUserFullDto.D0();
                                    String str5 = D0 == null ? "" : D0;
                                    String N0 = usersUserFullDto.N0();
                                    String str6 = N0 == null ? str5 : N0;
                                    String K0 = usersUserFullDto.K0();
                                    String str7 = K0 == null ? str5 : K0;
                                    String x1 = usersUserFullDto.x1();
                                    String str8 = x1 == null ? "" : x1;
                                    String M = usersUserFullDto.M();
                                    String str9 = M == null ? "" : M;
                                    String m2 = usersUserFullDto.m2();
                                    if (m2 == null && (m2 = usersUserFullDto.l2()) == null) {
                                        m2 = usersUserFullDto.y2();
                                    }
                                    BaseSexDto L2 = usersUserFullDto.L2();
                                    if (L2 == null) {
                                        L2 = BaseSexDto.UNKNOWN;
                                    }
                                    Iterator it5 = it3;
                                    boolean z3 = usersUserFullDto.R2() == BaseBoolIntDto.YES;
                                    FriendsFriendStatusStatusDto V0 = usersUserFullDto.V0();
                                    Boolean o = usersUserFullDto.o();
                                    boolean booleanValue = o != null ? o.booleanValue() : false;
                                    List<CallsCustomNameForCallDto> a0 = usersUserFullDto.a0();
                                    if (a0 != null) {
                                        List<CallsCustomNameForCallDto> list4 = a0;
                                        friendsFriendStatusStatusDto = V0;
                                        xdw0Var2 = xdw0Var3;
                                        messagesGetCallParticipantsResponseDto = messagesGetCallParticipantsResponseDto2;
                                        arrayList = new ArrayList(c5g.u(list4, 10));
                                        for (Iterator it6 = list4.iterator(); it6.hasNext(); it6 = it6) {
                                            CallsCustomNameForCallDto callsCustomNameForCallDto = (CallsCustomNameForCallDto) it6.next();
                                            arrayList.add(new z59(new CallId(callsCustomNameForCallDto.d()), callsCustomNameForCallDto.e()));
                                        }
                                    } else {
                                        friendsFriendStatusStatusDto = V0;
                                        xdw0Var2 = xdw0Var3;
                                        messagesGetCallParticipantsResponseDto = messagesGetCallParticipantsResponseDto2;
                                        arrayList = null;
                                    }
                                    if (arrayList != null) {
                                        Iterator it7 = arrayList.iterator();
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it7.next();
                                            if (((z59) obj).a.equals(g89Var.a.b())) {
                                                break;
                                            }
                                        }
                                        z59Var = (z59) obj;
                                    } else {
                                        z59Var = null;
                                    }
                                    Boolean h3 = usersUserFullDto.h3();
                                    boolean booleanValue2 = h3 != null ? h3.booleanValue() : false;
                                    String r2 = usersUserFullDto.r2();
                                    if (r2 == null || r2.length() <= 0) {
                                        LruCache<String, fxj0> lruCache = sew0.a;
                                        String i2 = usersUserFullDto.i2();
                                        if (i2 == null) {
                                            i2 = "";
                                        }
                                        a3 = sew0.a.a(i2, m2, booleanValue2);
                                    } else {
                                        LruCache<String, fxj0> lruCache2 = sew0.a;
                                        String r22 = usersUserFullDto.r2();
                                        if (r22 == null) {
                                            r22 = "";
                                        }
                                        a3 = sew0.a.b(r22, booleanValue2, true);
                                    }
                                    sew0.b bVar = a3;
                                    boolean z4 = L2 == BaseSexDto.FEMALE;
                                    int i = friendsFriendStatusStatusDto != null ? friendsFriendStatusStatusDto.i() : 0;
                                    VoipFriendStatus voipFriendStatus = i != 1 ? i != 2 ? i != 3 ? VoipFriendStatus.NOT_FRIENDS : VoipFriendStatus.FRIENDS : VoipFriendStatus.INCOME_FRIENDSHIP_REQUEST : VoipFriendStatus.FOLLOWING;
                                    com.vk.voip.ui.c.b.getClass();
                                    arrayList3.add(new whr0(valueOf, bVar, z4, z3, false, booleanValue, voipFriendStatus, str5, str8, str6, str7, str9, ((Boolean) com.vk.voip.ui.c.s0.g.invoke()).booleanValue(), false, null, false, z59Var != null ? z59Var.b : null, null, 147456));
                                    eu2Var = eu2Var2;
                                    it3 = it5;
                                    xdw0Var3 = xdw0Var2;
                                    messagesGetCallParticipantsResponseDto2 = messagesGetCallParticipantsResponseDto;
                                }
                                emptyList2 = arrayList3;
                            }
                            it = it3;
                            xdw0Var = xdw0Var3;
                            MessagesGetCallParticipantsResponseDto messagesGetCallParticipantsResponseDto3 = messagesGetCallParticipantsResponseDto2;
                            eu2 eu2Var3 = eu2Var;
                            List<MessagesAnonymDto> d3 = messagesGetCallParticipantsResponseDto3.d();
                            char c2 = ':';
                            if (d3 != null) {
                                List<MessagesAnonymDto> list5 = d3;
                                r6 = new ArrayList(c5g.u(list5, 10));
                                for (MessagesAnonymDto messagesAnonymDto : list5) {
                                    String valueOf2 = String.valueOf(messagesAnonymDto.getId());
                                    String d4 = messagesAnonymDto.d();
                                    if (((Boolean) eu2Var3.invoke()).booleanValue()) {
                                        LruCache<String, fxj0> lruCache3 = sew0.a;
                                        d2 = new sew0.c(d4, m4s.G(d4 + ':' + valueOf2));
                                    } else {
                                        String g2 = messagesAnonymDto.g();
                                        if (g2 == null || g2.length() <= 0) {
                                            String e = messagesAnonymDto.e();
                                            if (e == null || e.length() <= 0) {
                                                LruCache<String, fxj0> lruCache4 = sew0.a;
                                                d2 = sew0.a.d(m4s.G(d4 + ':' + valueOf2), false, messagesAnonymDto.f(), false, d4);
                                            } else {
                                                LruCache<String, fxj0> lruCache5 = sew0.a;
                                                d2 = sew0.a.d(m4s.G(d4 + ':' + valueOf2), false, messagesAnonymDto.e(), true, d4);
                                            }
                                        } else {
                                            LruCache<String, fxj0> lruCache6 = sew0.a;
                                            d2 = sew0.a.d(m4s.G(d4 + ':' + valueOf2), false, messagesAnonymDto.g(), true, d4);
                                        }
                                    }
                                    r6.add(new whr0(valueOf2, d2, false, false, true, false, VoipFriendStatus.NOT_FRIENDS, d4, "", d4, d4, "", false, false, null, false, null, null, 253952));
                                }
                            } else {
                                r6 = EmptyList.b;
                            }
                            List<GroupsGroupFullDto> f = messagesGetCallParticipantsResponseDto3.f();
                            if (f != null) {
                                List<GroupsGroupFullDto> list6 = f;
                                ?? arrayList4 = new ArrayList(c5g.u(list6, 10));
                                for (GroupsGroupFullDto groupsGroupFullDto : list6) {
                                    String str10 = "-" + groupsGroupFullDto.P0();
                                    String V1 = groupsGroupFullDto.V1();
                                    if (V1 == null || V1.length() <= 0) {
                                        LruCache<String, fxj0> lruCache7 = sew0.a;
                                        String D1 = groupsGroupFullDto.D1();
                                        if (D1 == null) {
                                            D1 = "";
                                        }
                                        String N1 = groupsGroupFullDto.N1();
                                        if (N1 == null && (N1 = groupsGroupFullDto.L1()) == null) {
                                            N1 = groupsGroupFullDto.W1();
                                        }
                                        Boolean N3 = groupsGroupFullDto.N3();
                                        a2 = sew0.a.a(D1, N1, N3 != null ? N3.booleanValue() : false);
                                    } else {
                                        LruCache<String, fxj0> lruCache8 = sew0.a;
                                        String V12 = groupsGroupFullDto.V1();
                                        if (V12 == null) {
                                            V12 = "";
                                        }
                                        Boolean N32 = groupsGroupFullDto.N3();
                                        a2 = sew0.a.b(V12, N32 != null ? N32.booleanValue() : false, true);
                                    }
                                    sew0.b bVar2 = a2;
                                    String y1 = groupsGroupFullDto.y1();
                                    String str11 = y1 == null ? "" : y1;
                                    boolean z5 = groupsGroupFullDto.O2() == BaseBoolIntDto.YES;
                                    VoipFriendStatus voipFriendStatus2 = VoipFriendStatus.NOT_FRIENDS;
                                    GroupsGroupFullMemberStatusDto n1 = groupsGroupFullDto.n1();
                                    int i3 = n1 == null ? -1 : g89.a.$EnumSwitchMapping$0[n1.ordinal()];
                                    arrayList4.add(new whr0(str10, bVar2, false, z5, false, false, voipFriendStatus2, str11, "", "", "", "", false, true, null, i3 == 1 || i3 == 2, null, null, 212992));
                                }
                                emptyList = arrayList4;
                            } else {
                                emptyList = EmptyList.b;
                            }
                            List<MessagesContactDto> e2 = messagesGetCallParticipantsResponseDto3.e();
                            if (e2 != null) {
                                r9 = new ArrayList();
                                Iterator it8 = e2.iterator();
                                while (it8.hasNext()) {
                                    MessagesContactDto messagesContactDto = (MessagesContactDto) it8.next();
                                    String g3 = messagesContactDto.g();
                                    String d5 = messagesContactDto.d();
                                    if (d5 == null) {
                                        it2 = it8;
                                        whr0Var = null;
                                    } else {
                                        String i4 = messagesContactDto.i();
                                        Character y0 = erm0.y0(g3);
                                        String valueOf3 = String.valueOf(y0 != null ? y0.charValue() : erm0.A0(String.valueOf(messagesContactDto.getId())));
                                        if (((Boolean) eu2Var3.invoke()).booleanValue()) {
                                            LruCache<String, fxj0> lruCache9 = sew0.a;
                                            b2 = new sew0.c(g3, m4s.G(g3 + c2 + d5));
                                        } else if (i4 == null || i4.length() == 0) {
                                            LruCache<String, fxj0> lruCache10 = sew0.a;
                                            cVar = new sew0.c(valueOf3, m4s.G(g3 + c2 + d5));
                                            UserId userId = messagesContactDto.getUserId();
                                            it2 = it8;
                                            whr0.a aVar2 = new whr0.a(userId == null ? String.valueOf(userId.b) : null);
                                            VoipFriendStatus voipFriendStatus3 = VoipFriendStatus.NOT_FRIENDS;
                                            Boolean e3 = messagesContactDto.e();
                                            whr0Var = new whr0(d5, cVar, false, false, false, e3 == null ? e3.booleanValue() : true, voipFriendStatus3, g3, "", "", "", g3, true, false, aVar2, false, null, null, 229376);
                                        } else {
                                            LruCache<String, fxj0> lruCache11 = sew0.a;
                                            b2 = sew0.a.b(i4, false, false);
                                        }
                                        cVar = b2;
                                        UserId userId2 = messagesContactDto.getUserId();
                                        it2 = it8;
                                        whr0.a aVar22 = new whr0.a(userId2 == null ? String.valueOf(userId2.b) : null);
                                        VoipFriendStatus voipFriendStatus32 = VoipFriendStatus.NOT_FRIENDS;
                                        Boolean e32 = messagesContactDto.e();
                                        whr0Var = new whr0(d5, cVar, false, false, false, e32 == null ? e32.booleanValue() : true, voipFriendStatus32, g3, "", "", "", g3, true, false, aVar22, false, null, null, 229376);
                                    }
                                    if (whr0Var != null) {
                                        r9.add(whr0Var);
                                    }
                                    it8 = it2;
                                    c2 = ':';
                                }
                            } else {
                                r9 = EmptyList.b;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (whr0 whr0Var2 : emptyList) {
                                linkedHashMap2.put(whr0Var2.a, whr0Var2);
                            }
                            for (whr0 whr0Var3 : emptyList2) {
                                linkedHashMap2.put(whr0Var3.a, whr0Var3);
                            }
                            for (whr0 whr0Var4 : (Iterable) r6) {
                                linkedHashMap2.put(whr0Var4.a, whr0Var4);
                            }
                            for (whr0 whr0Var5 : (Iterable) r9) {
                                linkedHashMap2.put(whr0Var5.a, whr0Var5);
                            }
                            String i5 = messagesGetCallParticipantsResponseDto3.i();
                            fchVar = new fch(linkedHashMap2, i5 != null ? i5 : "");
                        }
                        if (xdw0Var != null) {
                            aVar.b.invoke((String) fchVar.c);
                        }
                        ?? r3 = fchVar.b;
                        Map linkedHashMap3 = new LinkedHashMap(on00.e(r3.size()));
                        for (Map.Entry entry : r3.entrySet()) {
                            linkedHashMap3.put((String) entry.getKey(), entry.getValue());
                        }
                        String valueOf4 = String.valueOf(this.c.e.getValue().f().b);
                        if (list.contains(valueOf4) && !linkedHashMap3.containsKey(valueOf4)) {
                            L.G("messages.getCallParticipants didn't return result for own user id");
                            whr0 f2 = f(valueOf4, false);
                            if (f2 != null) {
                                Map linkedHashMap4 = new LinkedHashMap(linkedHashMap3);
                                linkedHashMap4.put(valueOf4, f2);
                                map = linkedHashMap4;
                            }
                        }
                        map = linkedHashMap3;
                    }
                }
            }
            linkedHashMap.putAll(map);
            it3 = it;
            z = true;
        }
        Set keySet = linkedHashMap.keySet();
        synchronized (this) {
            this.c.c.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList5 = new ArrayList(R0);
            arrayList5.removeAll(keySet);
            Iterator it9 = arrayList5.iterator();
            while (it9.hasNext()) {
                String str12 = (String) it9.next();
                if (!this.o.containsKey(str12)) {
                    this.o.put(str12, Long.valueOf(currentTimeMillis));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, whr0> c(Collection<String> collection) {
        Map map = jgp.b;
        ReentrantLock reentrantLock = this.i;
        if (collection.isEmpty()) {
            return map;
        }
        Map<String, whr0> e = e(collection);
        if (!j5g.E0(collection, e.keySet()).isEmpty()) {
            reentrantLock.lockInterruptibly();
            try {
                e = e(collection);
                LinkedHashSet E0 = j5g.E0(collection, e.keySet());
                if (!E0.isEmpty()) {
                    map = b(E0);
                    synchronized (this) {
                        this.n.putAll(map);
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return pn00.n(e, map);
    }

    public final String d(boolean z) {
        hnw0 hnw0Var = this.f;
        gwd0 gwd0Var = this.b.a;
        dz2 x = yfb.x(sg20.f(hnw0Var.g, com.vk.voip.ui.c.T0.b, z ? Boolean.TRUE : null, null, 4));
        x.q = 0;
        x.n = false;
        zdw0.a(x, hnw0Var.d);
        vx2.a.getClass();
        return ((MessagesGetJoinLinkResponseDto) x.f(vx2.b())).d();
    }

    public final synchronized Map<String, whr0> e(Collection<String> collection) {
        if (collection.isEmpty()) {
            return jgp.b;
        }
        HashMap hashMap = (HashMap) this.n.clone();
        hashMap.keySet().retainAll(j5g.S0(collection));
        return hashMap;
    }

    public final whr0 f(String str, boolean z) {
        return g(Collections.singletonList(str), z).get(str);
    }

    public final Map<String, whr0> g(Collection<String> collection, boolean z) {
        Map e;
        Map map = jgp.b;
        if (collection.isEmpty()) {
            return map;
        }
        if (z) {
            e = map;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            e = e(collection);
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.removeAll(e.keySet());
        if (!arrayList.isEmpty()) {
            hnw0 hnw0Var = this.f;
            u1r0 u1r0Var = hnw0Var.f;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new UserId(Long.parseLong((String) it.next())));
            }
            dz2 x = yfb.x(r1r0.a.b(u1r0Var, arrayList2, hnw0.i, null, null, 58));
            x.q = 0;
            x.n = false;
            zdw0.a(x, hnw0Var.d);
            vx2.a.getClass();
            ArrayList a2 = hnw0Var.a.a((List) x.f(vx2.b()));
            int e2 = on00.e(c5g.u(a2, 10));
            if (e2 < 16) {
                e2 = 16;
            }
            Map linkedHashMap = new LinkedHashMap(e2);
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                linkedHashMap.put(((whr0) next).a, next);
            }
            map = linkedHashMap;
        }
        synchronized (this) {
            this.n.putAll(map);
        }
        return pn00.n(e, map);
    }

    public final y h(Collection collection) {
        return new m(i(collection), new gnw0(), new qu50(new uni(7), 22)).m(this.d.b).l(new pft0(new h7t0(3)));
    }

    public final q<Map<String, whr0>> i(Collection<String> collection) {
        c cVar = this.c;
        return cVar.d.c() ? q.T(pn00.n(cVar.d.a(collection), e(collection))) : new io.reactivex.rxjava3.internal.operators.mixed.q(x.k(collection).m(this.d.a), new uxb0(new d(1, this, VoipDataProvider.class, "loadCallMembersGraduallyObservable", "loadCallMembersGraduallyObservable(Ljava/util/Collection;)Lio/reactivex/rxjava3/core/Observable;", 0), 19));
    }

    public final r j(Collection collection) {
        return new r(new v(new iq40(collection, 3)), new k6c0(new uw4(1, this, VoipDataProvider.class, "loadCallMembersInfo", "loadCallMembersInfo(Ljava/util/Collection;)Lio/reactivex/rxjava3/core/Single;", 0, 16), 13));
    }

    public final synchronized void k(List<whr0> list, ShouldPutUsersToInviteIntoCache.UsersForInviteCachedFrom usersForInviteCachedFrom) {
        boolean z;
        try {
            this.l = list;
            ShouldPutUsersToInviteIntoCache shouldPutUsersToInviteIntoCache = this.m;
            shouldPutUsersToInviteIntoCache.getClass();
            int i = ShouldPutUsersToInviteIntoCache.a.$EnumSwitchMapping$0[usersForInviteCachedFrom.ordinal()];
            if (i == 1) {
                z = shouldPutUsersToInviteIntoCache.a;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = shouldPutUsersToInviteIntoCache.b;
            }
            if (z) {
                for (whr0 whr0Var : list) {
                    whr0 whr0Var2 = this.n.get(whr0Var.a);
                    if (whr0Var2 != null) {
                        this.n.put(whr0Var.a, whr0.a(whr0Var, whr0Var2.q, 196607));
                    } else {
                        this.n.put(whr0Var.a, whr0Var);
                    }
                }
                ShouldPutUsersToInviteIntoCache shouldPutUsersToInviteIntoCache2 = this.m;
                shouldPutUsersToInviteIntoCache2.getClass();
                int i2 = ShouldPutUsersToInviteIntoCache.a.$EnumSwitchMapping$0[usersForInviteCachedFrom.ordinal()];
                if (i2 == 1) {
                    shouldPutUsersToInviteIntoCache2.a = false;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    shouldPutUsersToInviteIntoCache2.b = false;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void l(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.n.remove((String) it.next());
        }
    }

    public final synchronized void m() {
        try {
            this.c.c.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.o.entrySet()) {
                String str = (String) entry.getKey();
                if (((Number) entry.getValue()).longValue() + this.g < currentTimeMillis) {
                    arrayList.add(str);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.o.remove((String) it.next());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n() {
        this.l = null;
        ShouldPutUsersToInviteIntoCache shouldPutUsersToInviteIntoCache = this.m;
        shouldPutUsersToInviteIntoCache.a = true;
        shouldPutUsersToInviteIntoCache.a = true;
        this.n.clear();
        this.o.clear();
    }

    public final b0 o(String str) {
        v vVar = new v(new prl0(1, this, str));
        asu0 asu0Var = asu0.a;
        return vVar.q(asu0Var.c()).m(asu0Var.d());
    }
}
