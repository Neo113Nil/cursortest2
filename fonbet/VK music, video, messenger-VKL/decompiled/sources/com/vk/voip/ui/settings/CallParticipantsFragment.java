package com.vk.voip.ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem$ChangeBackground$Background;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.t2;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.a2;
import xsna.a8;
import xsna.asp;
import xsna.asu0;
import xsna.az2;
import xsna.b33;
import xsna.bl;
import xsna.bo0;
import xsna.bwt0;
import xsna.c60;
import xsna.c79;
import xsna.c99;
import xsna.ca6;
import xsna.ca9;
import xsna.d79;
import xsna.d99;
import xsna.db;
import xsna.dhr0;
import xsna.e3m;
import xsna.e79;
import xsna.eow0;
import xsna.epx;
import xsna.euw0;
import xsna.f79;
import xsna.f89;
import xsna.fjw0;
import xsna.fpf0;
import xsna.g2v;
import xsna.g79;
import xsna.gdp;
import xsna.gko;
import xsna.h60;
import xsna.h79;
import xsna.h89;
import xsna.hg1;
import xsna.i89;
import xsna.ikv0;
import xsna.izs;
import xsna.j5g;
import xsna.j89;
import xsna.jjc;
import xsna.k89;
import xsna.kiu;
import xsna.kl6;
import xsna.l7;
import xsna.l7s;
import xsna.m33;
import xsna.m7;
import xsna.m7m;
import xsna.m99;
import xsna.mnh0;
import xsna.o1x0;
import xsna.p490;
import xsna.pp3;
import xsna.pt;
import xsna.q89;
import xsna.qa;
import xsna.qtw0;
import xsna.r7;
import xsna.r89;
import xsna.r99;
import xsna.rf1;
import xsna.s3q0;
import xsna.s99;
import xsna.sew0;
import xsna.sf1;
import xsna.tzp0;
import xsna.utj;
import xsna.v12;
import xsna.v19;
import xsna.v2x0;
import xsna.w59;
import xsna.whr0;
import xsna.wmw0;
import xsna.x7g;
import xsna.xaz;
import xsna.ysg0;
import xsna.z7;
import xsna.za;
import xsna.zrp;

/* compiled from: CallParticipantsFragment.kt */
/* loaded from: classes7.dex */
public final class CallParticipantsFragment extends FragmentImpl {
    public static final /* synthetic */ int W = 0;
    public v19 N;
    public ViewGroup O;
    public BottomSheetBehavior<ViewGroup> P;
    public m99 R;
    public com.vk.voip.ui.settings.participants_view.c S;
    public boolean U;
    public final p490 Q = r99.a.a();
    public final io.reactivex.rxjava3.disposables.b T = new io.reactivex.rxjava3.disposables.b();
    public final qa V = new qa(this, 4);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CallParticipantsFragment.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a LOWER_HANDS_FOR_ALL;
        public static final a MUTE_MICROPHONES_FOR_ALL;
        public static final a MUTE_MICROPHONES_FOR_ALL_EXCEPT_ADMINS;
        public static final a TURN_OFF_CAMERAS_FOR_ALL;
        public static final a TURN_OFF_CAMERAS_FOR_ALL_EXCEPT_ADMINS;

        static {
            a aVar = new a("MUTE_MICROPHONES_FOR_ALL", 0);
            MUTE_MICROPHONES_FOR_ALL = aVar;
            a aVar2 = new a("MUTE_MICROPHONES_FOR_ALL_EXCEPT_ADMINS", 1);
            MUTE_MICROPHONES_FOR_ALL_EXCEPT_ADMINS = aVar2;
            a aVar3 = new a("TURN_OFF_CAMERAS_FOR_ALL", 2);
            TURN_OFF_CAMERAS_FOR_ALL = aVar3;
            a aVar4 = new a("TURN_OFF_CAMERAS_FOR_ALL_EXCEPT_ADMINS", 3);
            TURN_OFF_CAMERAS_FOR_ALL_EXCEPT_ADMINS = aVar4;
            a aVar5 = new a("LOWER_HANDS_FOR_ALL", 4);
            LOWER_HANDS_FOR_ALL = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: CallParticipantsFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MUTE_MICROPHONES_FOR_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.MUTE_MICROPHONES_FOR_ALL_EXCEPT_ADMINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.TURN_OFF_CAMERAS_FOR_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.TURN_OFF_CAMERAS_FOR_ALL_EXCEPT_ADMINS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.LOWER_HANDS_FOR_ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CallParticipantsFragment.kt */
    public static final class c extends b33 {
        public c(Context context) {
            super(context, R.style.CallSettingsTheme);
        }

        @Override // xsna.y8i, android.app.Dialog
        public final void onBackPressed() {
            m99 m99Var = CallParticipantsFragment.this.R;
            if (m99Var == null) {
                super.onBackPressed();
            } else {
                m99Var.b(c99.x.a);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    /* compiled from: CallParticipantsFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<s99, CallParticipantsViewModel> {
        /* JADX WARN: Code restructure failed: missing block: B:168:0x0241, code lost:
        
            if (com.vk.voip.ui.c.q0() == false) goto L101;
         */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x0264  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x026f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0447  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x02ff  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x031c  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x038d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0474  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x03f7  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0486  */
        /* JADX WARN: Removed duplicated region for block: B:244:0x0423  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x0435  */
        /* JADX WARN: Removed duplicated region for block: B:252:0x03dd  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x048c  */
        /* JADX WARN: Removed duplicated region for block: B:263:0x0379  */
        /* JADX WARN: Removed duplicated region for block: B:264:0x031f  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x030c  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0497  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x04ac  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0488  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0477  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x044a  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CallParticipantsViewModel invoke(s99 s99Var) {
            String str;
            Set<String> set;
            boolean z;
            Set<String> set2;
            int i;
            CallParticipantsViewModel.b c2084b;
            boolean H0;
            Set<String> set3;
            ca9.c cVar;
            Set<String> set4;
            i89 i89Var;
            boolean z2;
            Set<String> set5;
            boolean z3;
            com.vk.voip.b bVar;
            String str2;
            CallSettingsItem.CallParticipant callParticipant;
            Iterator it;
            Map<String, whr0> map;
            CallParticipantsViewModel.b aVar;
            xaz xazVar;
            CallParticipantsViewModel.c aVar2;
            CallParticipantsViewModel.c cVar2;
            bo0 bo0Var;
            CallParticipantsViewModel.a aVar3;
            CallParticipantsViewModel.BottomControlState bottomControlState;
            Set<CallMemberId> set6;
            whr0 whr0Var;
            s99 s99Var2 = s99Var;
            i89 i89Var2 = (i89) this.receiver;
            i89Var2.getClass();
            String str3 = s99Var2.a;
            ca9 ca9Var = s99Var2.c;
            boolean z4 = ca9Var instanceof ca9.c;
            ca9.c cVar3 = z4 ? (ca9.c) ca9Var : null;
            boolean z5 = (cVar3 == null || (whr0Var = cVar3.m.get(cVar3.b.b)) == null) ? false : whr0Var.n;
            Integer valueOf = (cVar3 == null || (set6 = cVar3.d) == null) ? null : Integer.valueOf(set6.size());
            int size = s99Var2.b.size();
            String str4 = s99Var2.a;
            if (ca9Var instanceof ca9.b) {
                aVar = CallParticipantsViewModel.b.c.a;
            } else if (ca9Var instanceof ca9.d) {
                aVar = CallParticipantsViewModel.b.c.a;
            } else {
                if (!(ca9Var instanceof ca9.a)) {
                    if (!z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ca9.c cVar4 = (ca9.c) ca9Var;
                    ArrayList arrayList = new ArrayList();
                    boolean z6 = str3 != null;
                    Set<String> set7 = s99Var2.b;
                    if (i89Var2.a.isMeCreatorOrAdmin() && !z6) {
                        arrayList.add(CallSettingsItem.a.a);
                    }
                    arrayList.add(new CallSettingsItem.h(str3, z6));
                    if (!z6) {
                        Map<String, whr0> map2 = cVar4.m;
                        Collection<CallMemberId> collection = cVar4.k;
                        if (!collection.isEmpty()) {
                            str = str3;
                            arrayList.add(new CallSettingsItem.FillSpace(CallSettingsItem.FillSpace.Height.DP_8, CallSettingsItem$ChangeBackground$Background.TOP_CORNER));
                            arrayList.add(new CallSettingsItem.TitleHeader(CallSettingsItem.TitleHeader.Title.WAITING_ROOM, null, Integer.valueOf(collection.size()), null, CallSettingsItem$ChangeBackground$Background.RECTANGLE, 10));
                            Iterator it2 = collection.iterator();
                            while (it2.hasNext()) {
                                CallMemberId callMemberId = (CallMemberId) it2.next();
                                whr0 whr0Var2 = map2.get(callMemberId.b);
                                if (whr0Var2 != null) {
                                    it = it2;
                                    sew0 sew0Var = whr0Var2.b;
                                    map = map2;
                                    gdp gdpVar = i89Var2.b;
                                    String str5 = whr0Var2.q;
                                    if (str5 == null) {
                                        str5 = whr0Var2.e();
                                    }
                                    gdpVar.getClass();
                                    arrayList.add(new CallSettingsItem.i(callMemberId, sew0Var, gdp.a(str5), CallSettingsItem$ChangeBackground$Background.RECTANGLE));
                                } else {
                                    it = it2;
                                    map = map2;
                                }
                                it2 = it;
                                map2 = map;
                            }
                            arrayList.add(new CallSettingsItem.FillSpace(CallSettingsItem.FillSpace.Height.DP_8, CallSettingsItem$ChangeBackground$Background.BOTTOM_CORNER));
                            com.vk.voip.b bVar2 = i89Var2.c.a;
                            List<CallMemberId> list = cVar4.e;
                            Set<String> set8 = cVar4.h;
                            set = cVar4.g;
                            List<CallMemberId> list2 = list;
                            boolean z7 = list.size() >= 1000;
                            ArrayList arrayList2 = new ArrayList();
                            for (CallMemberId callMemberId2 : list2) {
                                i89 i89Var3 = i89Var2;
                                Set<String> set9 = set7;
                                boolean z8 = z6;
                                whr0 whr0Var3 = cVar4.m.get(callMemberId2.b);
                                if (whr0Var3 == null) {
                                    bVar = bVar2;
                                    set5 = set8;
                                    callParticipant = null;
                                } else {
                                    CallSettingsItem.CallParticipant.b bVar3 = bVar2.isGroupCall() ? cVar4.C.contains(callMemberId2) ? CallSettingsItem.CallParticipant.b.C2087b.a : cVar4.D.contains(callMemberId2) ? CallSettingsItem.CallParticipant.b.a.a : CallSettingsItem.CallParticipant.b.c.a : CallSettingsItem.CallParticipant.b.c.a;
                                    boolean f = epx.f(cVar4.b, callMemberId2);
                                    CallSettingsItem.CallParticipant.a aVar4 = bVar2.isGroupCall() ? callMemberId2.equals(cVar4.E) ? CallSettingsItem.CallParticipant.a.C2086a.a : callMemberId2.equals(cVar4.F) ? CallSettingsItem.CallParticipant.a.b.a : CallSettingsItem.CallParticipant.a.c.a : CallSettingsItem.CallParticipant.a.c.a;
                                    boolean contains = cVar4.s.contains(callMemberId2);
                                    Map<CallMemberId, MediaOptionState> map3 = cVar4.u;
                                    set5 = set8;
                                    MediaOptionState mediaOptionState = MediaOptionState.UNMUTED;
                                    CallSettingsItem.CallParticipant.CameraState cameraState = contains ? CallSettingsItem.CallParticipant.CameraState.ON : c79.a(map3.getOrDefault(callMemberId2, mediaOptionState)) ? CallSettingsItem.CallParticipant.CameraState.MUTE : CallSettingsItem.CallParticipant.CameraState.OFF;
                                    CallSettingsItem.CallParticipant.MicrophoneState microphoneState = (cVar4.o.contains(callMemberId2) && z7) ? CallSettingsItem.CallParticipant.MicrophoneState.TALKING : cVar4.r.contains(callMemberId2) ? CallSettingsItem.CallParticipant.MicrophoneState.ON : c79.a(cVar4.t.getOrDefault(callMemberId2, mediaOptionState)) ? CallSettingsItem.CallParticipant.MicrophoneState.MUTE : CallSettingsItem.CallParticipant.MicrophoneState.OFF;
                                    boolean contains2 = cVar4.n.contains(callMemberId2);
                                    boolean z9 = whr0Var3.p;
                                    if (!bVar2.isMeCreatorOrAdmin() && !z9) {
                                        if (!f && !bVar2.s(callMemberId2.b)) {
                                            com.vk.voip.ui.c.b.getClass();
                                        }
                                        z3 = false;
                                        sew0 sew0Var2 = whr0Var3.b;
                                        bVar = bVar2;
                                        str2 = whr0Var3.q;
                                        if (str2 == null) {
                                            str2 = whr0Var3.e();
                                        }
                                        CharSequence a = gdp.a(str2);
                                        boolean contains3 = cVar4.p.contains(callMemberId2);
                                        ParticipantStatesManager participantStatesManager = bVar.getParticipantStatesManager();
                                        callParticipant = new CallSettingsItem.CallParticipant(callMemberId2, sew0Var2, bVar3, a, f, aVar4, contains3, participantStatesManager == null ? participantStatesManager.getHandRaiseTime(mnh0.H(callMemberId2)) : 0L, cVar4.q.contains(callMemberId2), cameraState, microphoneState, (contains2 || f) ? false : true, z3);
                                    }
                                    z3 = true;
                                    sew0 sew0Var22 = whr0Var3.b;
                                    bVar = bVar2;
                                    str2 = whr0Var3.q;
                                    if (str2 == null) {
                                    }
                                    CharSequence a2 = gdp.a(str2);
                                    boolean contains32 = cVar4.p.contains(callMemberId2);
                                    ParticipantStatesManager participantStatesManager2 = bVar.getParticipantStatesManager();
                                    callParticipant = new CallSettingsItem.CallParticipant(callMemberId2, sew0Var22, bVar3, a2, f, aVar4, contains32, participantStatesManager2 == null ? participantStatesManager2.getHandRaiseTime(mnh0.H(callMemberId2)) : 0L, cVar4.q.contains(callMemberId2), cameraState, microphoneState, (contains2 || f) ? false : true, z3);
                                }
                                if (callParticipant != null) {
                                    arrayList2.add(callParticipant);
                                }
                                set7 = set9;
                                i89Var2 = i89Var3;
                                z6 = z8;
                                set8 = set5;
                                bVar2 = bVar;
                            }
                            i89 i89Var4 = i89Var2;
                            Set<String> set10 = set7;
                            z = z6;
                            set2 = set8;
                            arrayList.addAll(j5g.D0(new h79(new g79(new f79(new d79(new e79(new v12(1)))))), arrayList2));
                            if ((cVar4.M instanceof SessionRoomId.MainCall) && !z5) {
                                H0 = com.vk.contacts.d.a.H0();
                                set3 = set;
                                if (set3.isEmpty() || !set2.isEmpty() || (H0 && !cVar4.i.isEmpty())) {
                                    if (z) {
                                        arrayList.add(new CallSettingsItem.g(CallSettingsItem$ChangeBackground$Background.TOP_CORNER));
                                    } else {
                                        arrayList.add(new CallSettingsItem.FillSpace(CallSettingsItem.FillSpace.Height.DP_8, CallSettingsItem$ChangeBackground$Background.DEFAULT));
                                    }
                                    CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background = CallSettingsItem$ChangeBackground$Background.RECTANGLE;
                                    arrayList.add(new CallSettingsItem.d(!z ? CallSettingsItem$ChangeBackground$Background.DEFAULT : callSettingsItem$ChangeBackground$Background));
                                    Map<String, whr0> map4 = cVar4.m;
                                    if (set3.isEmpty()) {
                                        arrayList.add(new CallSettingsItem.FillSpace(CallSettingsItem.FillSpace.Height.DP_8, z ? CallSettingsItem$ChangeBackground$Background.DEFAULT : callSettingsItem$ChangeBackground$Background));
                                        arrayList.add(new CallSettingsItem.TitleHeader(CallSettingsItem.TitleHeader.Title.CHAT_MEMBERS, null, Integer.valueOf(set.size()), z ? null : new CallSettingsItem.TitleHeader.a.C2088a(set), z ? CallSettingsItem$ChangeBackground$Background.DEFAULT : callSettingsItem$ChangeBackground$Background, 2));
                                        cVar = cVar4;
                                        set4 = set10;
                                        z2 = z;
                                        i = 1;
                                        i89Var = i89Var4;
                                        i89Var.a(set, arrayList, map4, set4, z2);
                                    } else {
                                        cVar = cVar4;
                                        set4 = set10;
                                        i89Var = i89Var4;
                                        z2 = z;
                                        i = 1;
                                    }
                                    boolean z10 = cVar.x;
                                    if (set2.isEmpty()) {
                                        arrayList.add(new CallSettingsItem.TitleHeader(cVar.j ? CallSettingsItem.TitleHeader.Title.FRIENDS : CallSettingsItem.TitleHeader.Title.SUBSCRIBERS, cVar.N ? null : CallSettingsItem.TitleHeader.Subtitle.SHOW_LAST_MESSAGES, null, null, z2 ? CallSettingsItem$ChangeBackground$Background.DEFAULT : callSettingsItem$ChangeBackground$Background, 12));
                                        if (!com.vk.contacts.d.a.H0() && z10) {
                                            arrayList.add(new CallSettingsItem.c(z2 ? CallSettingsItem$ChangeBackground$Background.DEFAULT : callSettingsItem$ChangeBackground$Background));
                                        }
                                        i89Var.a(cVar.h, arrayList, cVar.m, set4, z2);
                                    } else if (!com.vk.contacts.d.a.H0() && z10) {
                                        arrayList.add(new CallSettingsItem.c(z2 ? CallSettingsItem$ChangeBackground$Background.DEFAULT : callSettingsItem$ChangeBackground$Background));
                                    }
                                    if (H0) {
                                        Map<String, whr0> map5 = cVar.m;
                                        Set<String> set11 = cVar.i;
                                        if (!set11.isEmpty()) {
                                            CallSettingsItem.TitleHeader.Title title = CallSettingsItem.TitleHeader.Title.CONTACTS;
                                            CallSettingsItem.TitleHeader.Subtitle subtitle = CallSettingsItem.TitleHeader.Subtitle.CONTACT_BOOK;
                                            if (z2) {
                                                callSettingsItem$ChangeBackground$Background = CallSettingsItem$ChangeBackground$Background.DEFAULT;
                                            }
                                            arrayList.add(new CallSettingsItem.TitleHeader(title, subtitle, null, null, callSettingsItem$ChangeBackground$Background, 12));
                                            i89Var.a(set11, arrayList, map5, set4, z2);
                                        }
                                    }
                                    if (!z2) {
                                        arrayList.add(new CallSettingsItem.FillSpace(CallSettingsItem.FillSpace.Height.DP_8, CallSettingsItem$ChangeBackground$Background.BOTTOM_CORNER));
                                    }
                                    if (arrayList.isEmpty()) {
                                        arrayList.add(CallSettingsItem.e.a);
                                    }
                                    c2084b = new CallParticipantsViewModel.b.C2084b(arrayList);
                                    xazVar = s99Var2.d;
                                    if (xazVar instanceof xaz.c) {
                                        cVar2 = CallParticipantsViewModel.c.C2085c.a;
                                    } else if (xazVar instanceof xaz.b) {
                                        cVar2 = CallParticipantsViewModel.c.b.a;
                                    } else {
                                        if (xazVar instanceof xaz.d) {
                                            aVar2 = new CallParticipantsViewModel.c.d(((xaz.d) xazVar).b);
                                        } else {
                                            if (!(xazVar instanceof xaz.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar2 = new CallParticipantsViewModel.c.a(((xaz.a) xazVar).a);
                                        }
                                        cVar2 = aVar2;
                                    }
                                    bo0Var = s99Var2.g;
                                    if (bo0Var instanceof bo0.a) {
                                        aVar3 = CallParticipantsViewModel.a.C2083a.a;
                                    } else if (bo0Var instanceof bo0.b) {
                                        aVar3 = CallParticipantsViewModel.a.b.a;
                                    } else {
                                        if (!(bo0Var instanceof bo0.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar3 = CallParticipantsViewModel.a.c.a;
                                    }
                                    int i2 = str != null ? i : 0;
                                    int i3 = (valueOf != null && valueOf.intValue() == i) ? i : 0;
                                    if (z5) {
                                        int i4 = size > 0 ? i : 0;
                                        bottomControlState = valueOf == null ? CallParticipantsViewModel.BottomControlState.HIDE : i2 != 0 ? i4 != 0 ? CallParticipantsViewModel.BottomControlState.ADD_BUTTON_ENABLED_SINGLE : CallParticipantsViewModel.BottomControlState.HIDE : i3 != 0 ? i4 != 0 ? CallParticipantsViewModel.BottomControlState.ADD_BUTTON_ENABLED : CallParticipantsViewModel.BottomControlState.ADD_BUTTON_DISABLED : i3 == 0 ? i4 != 0 ? CallParticipantsViewModel.BottomControlState.ADD_BUTTON_ENABLED : CallParticipantsViewModel.BottomControlState.HIDE : CallParticipantsViewModel.BottomControlState.HIDE;
                                    } else {
                                        bottomControlState = valueOf == null ? CallParticipantsViewModel.BottomControlState.HIDE : (i3 == 0 || i2 != 0) ? CallParticipantsViewModel.BottomControlState.HIDE : CallParticipantsViewModel.BottomControlState.SHARE_BUTTON_SINGLE;
                                    }
                                    return new CallParticipantsViewModel(valueOf, str4, size, c2084b, cVar2, aVar3, bottomControlState);
                                }
                            }
                            i = 1;
                            if (arrayList.isEmpty()) {
                            }
                            c2084b = new CallParticipantsViewModel.b.C2084b(arrayList);
                            xazVar = s99Var2.d;
                            if (xazVar instanceof xaz.c) {
                            }
                            bo0Var = s99Var2.g;
                            if (bo0Var instanceof bo0.a) {
                            }
                            if (str != null) {
                            }
                            if (valueOf != null) {
                                if (z5) {
                                }
                                return new CallParticipantsViewModel(valueOf, str4, size, c2084b, cVar2, aVar3, bottomControlState);
                            }
                            if (z5) {
                            }
                            return new CallParticipantsViewModel(valueOf, str4, size, c2084b, cVar2, aVar3, bottomControlState);
                        }
                    }
                    str = str3;
                    com.vk.voip.b bVar22 = i89Var2.c.a;
                    List<CallMemberId> list3 = cVar4.e;
                    Set<String> set82 = cVar4.h;
                    set = cVar4.g;
                    List<CallMemberId> list22 = list3;
                    boolean z72 = list3.size() >= 1000;
                    ArrayList arrayList22 = new ArrayList();
                    while (r10.hasNext()) {
                    }
                    i89 i89Var42 = i89Var2;
                    Set<String> set102 = set7;
                    z = z6;
                    set2 = set82;
                    arrayList.addAll(j5g.D0(new h79(new g79(new f79(new d79(new e79(new v12(1)))))), arrayList22));
                    if (cVar4.M instanceof SessionRoomId.MainCall) {
                        H0 = com.vk.contacts.d.a.H0();
                        set3 = set;
                        if (set3.isEmpty()) {
                        }
                        if (z) {
                        }
                        CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background2 = CallSettingsItem$ChangeBackground$Background.RECTANGLE;
                        arrayList.add(new CallSettingsItem.d(!z ? CallSettingsItem$ChangeBackground$Background.DEFAULT : callSettingsItem$ChangeBackground$Background2));
                        Map<String, whr0> map42 = cVar4.m;
                        if (set3.isEmpty()) {
                        }
                        boolean z102 = cVar.x;
                        if (set2.isEmpty()) {
                        }
                        if (H0) {
                        }
                        if (!z2) {
                        }
                        if (arrayList.isEmpty()) {
                        }
                        c2084b = new CallParticipantsViewModel.b.C2084b(arrayList);
                        xazVar = s99Var2.d;
                        if (xazVar instanceof xaz.c) {
                        }
                        bo0Var = s99Var2.g;
                        if (bo0Var instanceof bo0.a) {
                        }
                        if (str != null) {
                        }
                        if (valueOf != null) {
                        }
                        if (z5) {
                        }
                        return new CallParticipantsViewModel(valueOf, str4, size, c2084b, cVar2, aVar3, bottomControlState);
                    }
                    i = 1;
                    if (arrayList.isEmpty()) {
                    }
                    c2084b = new CallParticipantsViewModel.b.C2084b(arrayList);
                    xazVar = s99Var2.d;
                    if (xazVar instanceof xaz.c) {
                    }
                    bo0Var = s99Var2.g;
                    if (bo0Var instanceof bo0.a) {
                    }
                    if (str != null) {
                    }
                    if (valueOf != null) {
                    }
                    if (z5) {
                    }
                    return new CallParticipantsViewModel(valueOf, str4, size, c2084b, cVar2, aVar3, bottomControlState);
                }
                aVar = new CallParticipantsViewModel.b.a(((ca9.a) ca9Var).a);
            }
            str = str3;
            c2084b = aVar;
            i = 1;
            xazVar = s99Var2.d;
            if (xazVar instanceof xaz.c) {
            }
            bo0Var = s99Var2.g;
            if (bo0Var instanceof bo0.a) {
            }
            if (str != null) {
            }
            if (valueOf != null) {
            }
            if (z5) {
            }
            return new CallParticipantsViewModel(valueOf, str4, size, c2084b, cVar2, aVar3, bottomControlState);
        }
    }

    /* compiled from: CallParticipantsFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<d99, q89> {
        @Override // xsna.izs
        public final q89 invoke(d99 d99Var) {
            d99 d99Var2 = d99Var;
            ((h89) this.receiver).getClass();
            if (d99Var2 instanceof d99.l) {
                return new q89.l(((d99.l) d99Var2).a);
            }
            if (d99Var2 instanceof d99.m) {
                return new q89.m(((d99.m) d99Var2).a);
            }
            if (d99Var2 instanceof d99.k) {
                return q89.k.a;
            }
            if (d99Var2 instanceof d99.f) {
                return new q89.f(((d99.f) d99Var2).a);
            }
            if (d99Var2 instanceof d99.g) {
                return q89.g.a;
            }
            if (d99Var2 instanceof d99.b) {
                d99.b bVar = (d99.b) d99Var2;
                bVar.getClass();
                return new q89.b(bVar.a);
            }
            if (d99Var2 instanceof d99.d) {
                return q89.d.a;
            }
            if (d99Var2 instanceof d99.c) {
                return q89.c.a;
            }
            if (d99Var2 instanceof d99.i) {
                return q89.i.a;
            }
            if (d99Var2 instanceof d99.j) {
                return new q89.j(((d99.j) d99Var2).a);
            }
            if (d99Var2 instanceof d99.h) {
                return new q89.h(((d99.h) d99Var2).a);
            }
            if (d99Var2 instanceof d99.a) {
                return q89.a.a;
            }
            if (d99Var2 instanceof d99.e) {
                return new q89.e(((d99.e) d99Var2).a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CallParticipantsFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<q89, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(q89 q89Var) {
            Dialog dialog;
            Window window;
            q89 q89Var2 = q89Var;
            CallParticipantsFragment callParticipantsFragment = (CallParticipantsFragment) this.receiver;
            int i = CallParticipantsFragment.W;
            callParticipantsFragment.getClass();
            if (q89Var2 instanceof q89.l) {
                if (((q89.l) q89Var2).a) {
                    callParticipantsFragment.eo(a.MUTE_MICROPHONES_FOR_ALL_EXCEPT_ADMINS);
                } else {
                    callParticipantsFragment.eo(a.MUTE_MICROPHONES_FOR_ALL);
                }
            } else if (q89Var2 instanceof q89.m) {
                if (((q89.m) q89Var2).a) {
                    callParticipantsFragment.eo(a.TURN_OFF_CAMERAS_FOR_ALL_EXCEPT_ADMINS);
                } else {
                    callParticipantsFragment.eo(a.TURN_OFF_CAMERAS_FOR_ALL);
                }
            } else if (q89Var2 instanceof q89.k) {
                callParticipantsFragment.eo(a.LOWER_HANDS_FOR_ALL);
            } else if (q89Var2 instanceof q89.f) {
                CallMemberId callMemberId = ((q89.f) q89Var2).a;
                int i2 = qtw0.l1;
                new qtw0.a(callParticipantsFragment.requireContext(), callMemberId).I0("VoipParticipantSettingsBottomSheet");
            } else if (q89Var2 instanceof q89.g) {
                a2 a2Var = new a2();
                dhr0.a.getClass();
                a2Var.w(dhr0.u().c);
                a2Var.k(callParticipantsFragment.mo2getContext());
            } else {
                if (q89Var2 instanceof q89.b) {
                    q89.b bVar = (q89.b) q89Var2;
                    Context mo2getContext = callParticipantsFragment.mo2getContext();
                    if (mo2getContext != null && (dialog = callParticipantsFragment.s) != null && (window = dialog.getWindow()) != null) {
                        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
                        bVar.getClass();
                        groupCallViewModel.getClass();
                        kiu b = GroupCallViewModel.b(null);
                        if (b != null) {
                            String string = mo2getContext.getString(bVar.a ? R.string.voip_watch_together_allowed_for_user : R.string.voip_watch_together_forbidden_for_user, b.g);
                            l7s u = bwt0.u(mo2getContext);
                            int i3 = utj.s;
                            int i4 = utj.s;
                            int i5 = utj.t;
                            int i6 = utj.u;
                            int i7 = utj.v;
                            FloatingViewGesturesHelper.SwipeDirection swipeDirection = FloatingViewGesturesHelper.SwipeDirection.VerticalBottom;
                            float f = utj.x;
                            e3m.a aVar = e3m.a;
                            utj utjVar = new utj(u, new utj.k(string, null, false), new utj.i(false, false, true), new utj.f(i4, i4, i5, i5, i6, i7), new utj.j(null, null), new utj.h(null, null), new utj.e(null, null, null), new utj.b(m33.a(R.drawable.vk_icon_logo_vk_video_28, u), Integer.valueOf(callParticipantsFragment.requireContext().getColor(R.color.vk_white)), null), new utj.c(null, null), new utj.d(swipeDirection, 3, 4000L, 0.7f, new utj.g(), null, false, f));
                            utjVar.p = null;
                            utjVar.f(window);
                        }
                    }
                } else if (q89Var2 instanceof q89.d) {
                    int i8 = wmw0.i1;
                    new wmw0.a(callParticipantsFragment.requireContext(), tzp0.a(null, 3)).I0("VoipConfirmAddUsersToCallModalDialog");
                } else if (q89Var2 instanceof q89.c) {
                    m99 m99Var = callParticipantsFragment.R;
                    s99 j = m99Var != null ? m99Var.j() : null;
                    Object obj = j != null ? j.c : null;
                    ca9.c cVar = obj instanceof ca9.c ? (ca9.c) obj : null;
                    boolean z = cVar != null ? cVar.B : false;
                    int i9 = euw0.f1;
                    new euw0.a(callParticipantsFragment.requireContext(), z).H0(callParticipantsFragment.getChildFragmentManager(), "VoipParticipantsAddUserOptionsModalDialog");
                } else if (q89Var2 instanceof q89.i) {
                    if (callParticipantsFragment.getParentFragmentManager().H("LinkFragment") == null) {
                        new LinkFragment().Td(callParticipantsFragment.getParentFragmentManager(), "LinkFragment");
                        callParticipantsFragment.tn();
                    }
                } else if (q89Var2 instanceof q89.j) {
                    CallId callId = ((q89.j) q89Var2).a;
                    Context requireContext = callParticipantsFragment.requireContext();
                    dhr0.a.getClass();
                    new o1x0.a(callId, null, new l7s(requireContext, dhr0.u().c), 10).I0("VoipShareLinkPagerModalDialog");
                } else if (q89Var2 instanceof q89.h) {
                    String str = ((q89.h) q89Var2).a;
                    int i10 = w59.k1;
                    new w59.a(callParticipantsFragment.requireContext(), str).I0("CallMediaRequestDialog");
                } else if (q89Var2 instanceof q89.a) {
                    callParticipantsFragment.tn();
                } else {
                    if (!(q89Var2 instanceof q89.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str2 = ((q89.e) q89Var2).a;
                    int i11 = eow0.f1;
                    new eow0.a(callParticipantsFragment.requireContext(), str2).I0("VoipFinishCallForAllModalDialog");
                }
            }
            return s3q0.a;
        }
    }

    public final void eo(a aVar) {
        int i;
        int i2 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i2 == 1) {
            i = R.string.voip_call_mute_microphones_for_all;
        } else if (i2 == 2) {
            i = R.string.voip_call_mute_microphones_for_all_except_admins;
        } else if (i2 == 3) {
            i = R.string.voip_call_turn_off_cameras_for_all;
        } else if (i2 == 4) {
            i = R.string.voip_call_turn_off_cameras_for_all_except_admins;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.voip_call_hands_lower_for_all;
        }
        ikv0.a aVar2 = new ikv0.a(requireContext());
        aVar2.l = 80;
        aVar2.t = new ikv0.c.C3058c(new gko(R.drawable.vk_icon_check_circle_outline_28), new x7g(R.attr.vk_ui_icon_positive), (Size) null, 12);
        aVar2.u = new ikv0.d(new ikv0.d.c(getString(i)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar2.o((ViewGroup) requireView().findViewById(R.id.call_participants_layout));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            tn();
        }
        getChildFragmentManager().l0("result_participant_add_user_options", this, this.V);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        dhr0.a.getClass();
        return LayoutInflater.from(new l7s(requireContext, dhr0.u().c)).inflate(R.layout.voip_participants, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        v19 v19Var = this.N;
        if (v19Var != null) {
            v19Var.c.e();
        }
        this.T.dispose();
        m99 m99Var = this.R;
        if (m99Var != null) {
            m99Var.b(c99.g.a);
        }
        this.R = null;
        this.Q.w();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.O = null;
        this.P = null;
        com.vk.voip.ui.settings.participants_view.c cVar = this.S;
        if (cVar != null) {
            cVar.p.a();
            cVar.s.dispose();
            cVar.u.removeCallbacks(cVar.v);
            f89 f89Var = cVar.d.e;
            io.reactivex.rxjava3.disposables.c cVar2 = f89Var.c;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            f89Var.c = null;
        }
        this.S = null;
        this.T.e();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m99 v = this.Q.v();
        v.b(c99.n.a);
        v.b(new c99.m0(false));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        Context requireContext = requireContext();
        dhr0 dhr0Var = dhr0.a;
        dhr0Var.getClass();
        l7s l7sVar = new l7s(requireContext, dhr0.u().c);
        v19 v19Var = new v19(g2v.c(), kn());
        this.N = v19Var;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.bottom_sheet);
        dhr0Var.getClass();
        viewGroup2.setBackgroundTintList(e3m.c(R.attr.vk_ui_background_content, dhr0.s()));
        this.O = viewGroup2;
        this.P = BottomSheetBehavior.L(viewGroup2);
        jjc.g(viewGroup, new za(this, 13));
        m99 v = this.Q.v();
        v.b(c99.n.a);
        this.R = v;
        com.vk.voip.ui.c.b.getClass();
        v2x0 v2x0Var = com.vk.voip.ui.c.r0;
        if (v2x0Var == null) {
            v2x0Var = null;
        }
        com.vk.voip.ui.settings.participants_view.c cVar = new com.vk.voip.ui.settings.participants_view.c(viewGroup, l7sVar, v2x0Var.c());
        this.S = cVar;
        io.reactivex.rxjava3.disposables.c subscribe = cVar.r.subscribe(new kl6(new az2(this, v19Var, new r89(), v), 1));
        io.reactivex.rxjava3.disposables.b bVar = this.T;
        bVar.b(subscribe);
        i89 i89Var = new i89(OKVoipEngine.b, v19Var);
        io.reactivex.rxjava3.subjects.d<s99> dVar = v.f;
        t2 w0 = dVar.w0(300L, TimeUnit.MILLISECONDS);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        bVar.b(w0.a0(asu0.i()).U(new l7(new d(1, i89Var, i89.class, "transform", "transform(Lcom/vk/voip/ui/settings/feature/CallSettingsState;)Lcom/vk/voip/ui/settings/participants_view/CallParticipantsViewModel;", 0), 6)).a0(asu0Var.d()).subscribe(new pp3(new m7(this, 17), 3)));
        bVar.b(new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, new rf1(new j89(0), 7)).a0(asu0Var.d()).subscribe(new c60(new sf1(this, 11), 5)));
        int i = 8;
        bVar.b(v.g.U(new bl(new e(1, new h89(), h89.class, "transform", "transform(Lcom/vk/voip/ui/settings/feature/CallSettingsEvent;)Lcom/vk/voip/ui/settings/participants_view/CallParticipantsViewAction;", 0), i)).a0(asu0Var.d()).subscribe(new com.vk.im.ui.components.dialogs_list.b(new f(1, this, CallParticipantsFragment.class, "onViewAction", "onViewAction(Lcom/vk/voip/ui/settings/participants_view/CallParticipantsViewAction;)V", 0), i)));
        bVar.b(new i0(ysg0.b.a.b0(fjw0.class).U(new ca6(new db(15), 1)), new z7(new pt(11), 9)).a0(asu0Var.d()).subscribe(new h60(new a8(this, 12), 5)));
        hg1.a(io.reactivex.rxjava3.kotlin.c.f(3, v.a(), null, null, new r7(((VoipAnalyticsInternalComponent) m7m.d(this).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df(), 16)), this);
        this.O.addView(this.S.h);
        k89 k89Var = new k89(this);
        this.P.U(0.8f);
        this.P.X(6);
        this.P.D(k89Var);
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        c cVar = new c(requireContext());
        Window window = cVar.getWindow();
        if (window != null) {
            window.addFlags(524288);
        }
        return cVar;
    }
}
