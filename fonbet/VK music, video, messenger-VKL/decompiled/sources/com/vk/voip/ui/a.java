package com.vk.voip.ui;

import android.content.Context;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.VoipAudioManager;
import com.vk.voip.ui.notifications.incoming.e;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.ProximityTracker;
import xsna.bq00;
import xsna.c5g;
import xsna.cd10;
import xsna.e420;
import xsna.e43;
import xsna.epx;
import xsna.gzs;
import xsna.h7;
import xsna.j5g;
import xsna.l140;
import xsna.ml7;
import xsna.pd4;
import xsna.pew0;
import xsna.quz;
import xsna.rc9;
import xsna.rf;
import xsna.s6x;
import xsna.sc9;
import xsna.tx6;
import xsna.u99;
import xsna.vvr0;
import xsna.wx30;
import xsna.x0;
import xsna.xng;
import xsna.z99;
import xsna.zhy0;

/* compiled from: VoipAudioManager.kt */
/* loaded from: classes7.dex */
public final class a implements VoipAudioManager {
    public static final a a = new a();
    public static final EnumSet<VoipViewModelState> b = EnumSet.of(VoipViewModelState.InCall, VoipViewModelState.CallingPeer, VoipViewModelState.Connecting);
    public static final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public static final sc9 d;
    public static ProximityTracker e;
    public static VoipAudioManager.LoudspeakerMode f;
    public static boolean g;
    public static final f<pew0.a> h;

    /* compiled from: VoipAudioManager.kt */
    /* renamed from: com.vk.voip.ui.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2008a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoipViewModelState.values().length];
            try {
                iArr[VoipViewModelState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipViewModelState.AboutToCallPeer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipViewModelState.CallingPeer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoipViewModelState.RecordingAudioMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoipViewModelState.ReceivingCallFromPeer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoipViewModelState.Connecting.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VoipViewModelState.InCall.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VoipViewModelState.FinishedTransient.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VoipViewModelState.DeclinedTransient.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VoipAudioManager.LoudspeakerMode.values().length];
            try {
                iArr2[VoipAudioManager.LoudspeakerMode.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VoipAudioManager.LoudspeakerMode.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VoipAudioManager.LoudspeakerMode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        c.b.getClass();
        c.p.getClass();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        d = new sc9(new sc9.a(context, new x0(27), new quz(10), new pd4(28)));
        f = VoipAudioManager.LoudspeakerMode.DEFAULT;
        h = new f<>();
    }

    public static z99 d() {
        c.b.getClass();
        return ((u99) c.q0.getValue()).a;
    }

    public static boolean e() {
        CallsAudioManager callsAudioManager = d.b;
        if (callsAudioManager != null) {
            return callsAudioManager.isHeadsetConnected();
        }
        return false;
    }

    public static void f() {
        CallsAudioManager callsAudioManager = d.b;
        if (callsAudioManager != null) {
            callsAudioManager.notifyBluetoothPermissionGranted();
        }
    }

    public static void g() {
        L.p("OKVoipAudioManager", "playConnectedAudio");
        z99 d2 = d();
        z99.a(d2, d2.b.d(), null, 12);
    }

    public static void j() {
        L.p("OKVoipAudioManager", "shutdown");
        sc9 sc9Var = d;
        CallsAudioManager callsAudioManager = sc9Var.b;
        if (callsAudioManager != null) {
            CallsAudioManager.changeStateAsync$default(callsAudioManager, CallsAudioManager.State.IDLE, null, new rf(8), 2, null);
            sc9Var.b = null;
        }
        d().d();
        L.p("OKVoipAudioManager", "cancelAudioManagerMethodCalls");
        c.e();
    }

    public static void k() {
        L.p("OKVoipAudioManager", "silentRinging");
        wx30 wx30Var = new wx30(3);
        L.p("OKVoipAudioManager", "doWithHeadsetCheck");
        sc9 sc9Var = d;
        c.b(io.reactivex.rxjava3.kotlin.c.e(x.B(AdaptersKt.hasWiredHeadsetSingle(sc9Var.a()), AdaptersKt.hasBluetoothHeadsetSingle(sc9Var.a()), new h7(new rc9((byte) 0, 0), 5)), new l140(3), new bq00(wx30Var, 17)));
    }

    @Override // com.vk.voip.ui.VoipAudioManager
    public final void a() {
        L.p("OKVoipAudioManager", "enableSpeakerByVideo");
        CallsAudioManager callsAudioManager = d.b;
        if (callsAudioManager != null) {
            CallsAudioManager.setSpeakerEnabledAsync$default(callsAudioManager, true, true, null, null, 12, null);
        }
    }

    @Override // xsna.pew0.b
    public final f b() {
        return h;
    }

    public final void c(boolean z) {
        List<CallsAudioDeviceInfo> list;
        L.p("OKVoipAudioManager", zhy0.a("enableLoudspeaker: enabled=", z));
        CallsAudioManager callsAudioManager = d.b;
        if (callsAudioManager == null) {
            return;
        }
        if (z) {
            CallsAudioManager.setAudioDeviceTypeAsync$default(callsAudioManager, CallsAudioManager.AudioDeviceType.SPEAKER_PHONE, null, null, 6, null);
            return;
        }
        if (callsAudioManager == null || (list = callsAudioManager.getAvailableAudioDevices()) == null) {
            list = EmptyList.b;
        }
        List<CallsAudioDeviceInfo> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallsAudioDeviceInfo) it.next()).getDeviceType());
        }
        if (epx.f(j5g.S0(arrayList), sc9.c)) {
            CallsAudioManager.setAudioDeviceTypeAsync$default(callsAudioManager, CallsAudioManager.AudioDeviceType.EARPIECE, null, null, 6, null);
        } else {
            CallsAudioManager.setSpeakerEnabledAsync$default(callsAudioManager, false, false, null, null, 14, null);
        }
    }

    public final void h(VoipViewModelState voipViewModelState, VoipViewModelState voipViewModelState2, final boolean z) {
        L.p("OKVoipAudioManager", "respondToVoipCallStateChanged: newState=" + voipViewModelState.name() + ", oldState=" + voipViewModelState2.name() + ", hasRungOnRemoteSide=" + z);
        vvr0.g();
        int i = C2008a.$EnumSwitchMapping$0[voipViewModelState.ordinal()];
        io.reactivex.rxjava3.disposables.b bVar = c;
        sc9 sc9Var = d;
        switch (i) {
            case 1:
                if (voipViewModelState2 != VoipViewModelState.Idle) {
                    j();
                    break;
                }
                break;
            case 2:
                sc9Var.a();
                break;
            case 3:
                L.p("OKVoipAudioManager", zhy0.a("calling: hasRungOnRemoteSide=", z));
                bVar.b(io.reactivex.rxjava3.kotlin.c.d(AdaptersKt.changeStateCompletable(sc9Var.a(), CallsAudioManager.State.DIALING), new gzs() { // from class: xsna.ho70
                    @Override // xsna.gzs
                    public final Object invoke() {
                        com.vk.voip.ui.a.a.getClass();
                        StringBuilder sb = new StringBuilder("playCalling: hasRungOnRemoteSide=");
                        boolean z2 = z;
                        sb.append(z2);
                        sb.append(", isOnlyMeInConversation=");
                        com.vk.voip.ui.c.b.getClass();
                        OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
                        sb.append(oKVoipEngine.H());
                        L.p("OKVoipAudioManager", sb.toString());
                        if (oKVoipEngine.H()) {
                            com.vk.voip.ui.a.d().d();
                        } else {
                            z99 d2 = com.vk.voip.ui.a.d();
                            t99 t99Var = d2.b;
                            z99.a(d2, z2 ? t99Var.e() : t99Var.b(), null, 14);
                        }
                        return s3q0.a;
                    }
                }, new e420(6)));
                break;
            case 4:
                j();
                break;
            case 5:
                sc9Var.a();
                c cVar = c.b;
                cVar.getClass();
                cVar.getClass();
                com.vk.voip.ui.notifications.incoming.b bVar2 = (com.vk.voip.ui.notifications.incoming.b) c.v0.getValue();
                if (!bVar2.m && ((bVar2.b() instanceof e.b) || bVar2.k.b() || Settings.canDrawOverlays(bVar2.a))) {
                    L.p("OKVoipAudioManager", "incoming");
                    d().d();
                    bVar.b(io.reactivex.rxjava3.kotlin.c.d(AdaptersKt.changeStateCompletable(sc9Var.a(), CallsAudioManager.State.RINGING), new xng(0, this, a.class, "playIncoming", "playIncoming()V", 0, 2), new s6x(15)));
                    break;
                }
                break;
            case 6:
                if (voipViewModelState2 == VoipViewModelState.InCall) {
                    z99 d2 = d();
                    z99.a(d2, d2.b.b(), null, 14);
                    break;
                }
                break;
            case 7:
                L.p("OKVoipAudioManager", AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED);
                bVar.b(io.reactivex.rxjava3.kotlin.c.d(AdaptersKt.changeStateCompletable(sc9Var.a(), CallsAudioManager.State.CONVERSATION), new tx6(0, this, a.class, "playConnected", "playConnected()V", 0, 2), new cd10(4)));
                break;
            case 8:
            case 9:
                if (sc9Var.b != null) {
                    if (!b.contains(voipViewModelState2)) {
                        j();
                        break;
                    } else {
                        L.p("OKVoipAudioManager", "cancelAudioManagerMethodCalls");
                        bVar.e();
                        z99 d3 = d();
                        z99.a(d3, d3.b.c(), new ml7(19), 4);
                        break;
                    }
                }
                break;
        }
    }

    public final void i(VoipAudioManager.LoudspeakerMode loudspeakerMode) {
        L.p("OKVoipAudioManager", "setLoudspeakerMode: mode=" + loudspeakerMode.name());
        f = loudspeakerMode;
        g = false;
    }
}
