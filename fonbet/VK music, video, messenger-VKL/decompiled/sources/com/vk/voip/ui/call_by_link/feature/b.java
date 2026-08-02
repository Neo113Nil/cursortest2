package com.vk.voip.ui.call_by_link.feature;

import com.vk.dto.common.id.UserId;
import com.vk.voip.media.mute.model.VoipMediaMuteOption;
import com.vk.voip.media.mute.model.VoipMediaMuteOptionState;
import com.vk.voip.ui.call_by_link.feature.VoipCallByLinkState;
import com.vk.voip.ui.call_by_link.feature.a;
import com.vk.voip.ui.call_by_link.feature.c;
import com.vk.voip.ui.call_by_link.feature.events.VoipCallByLinkNavigationEvent;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.cgw0;
import xsna.e43;
import xsna.ehm0;
import xsna.epx;
import xsna.f4z;
import xsna.fkq0;
import xsna.jsw0;
import xsna.kdw0;
import xsna.mdw0;
import xsna.nl;
import xsna.rsg0;
import xsna.s3q0;
import xsna.srw0;
import xsna.vg20;
import xsna.wk50;
import xsna.yfb;
import xsna.z7t0;

/* compiled from: VoipCallByLinkFeature.kt */
/* loaded from: classes7.dex */
public final class b extends wk50<VoipCallByLinkViewState, VoipCallByLinkState, com.vk.voip.ui.call_by_link.feature.a, c> {
    public final nl f;
    public final kdw0<mdw0> g;
    public final f4z<VoipCallByLinkNavigationEvent> h;

    /* compiled from: VoipCallByLinkFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.values().length];
            try {
                iArr[VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_ON_JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VoipCallByLinkState.Content.MediaSettingDialogState.Setting.values().length];
            try {
                iArr2[VoipCallByLinkState.Content.MediaSettingDialogState.Setting.MICROPHONES.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VoipCallByLinkState.Content.MediaSettingDialogState.Setting.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public b(d dVar, nl nlVar, kdw0<mdw0> kdw0Var) {
        super(a.e.b, dVar);
        this.f = nlVar;
        this.g = kdw0Var;
        this.h = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(VoipCallByLinkState voipCallByLinkState, com.vk.voip.ui.call_by_link.feature.a aVar) {
        VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones mediaMicrophones;
        VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo mediaVideo;
        VoipMediaMuteOptionState voipMediaMuteOptionState;
        VoipMediaMuteOptionState voipMediaMuteOptionState2;
        VoipCallByLinkState voipCallByLinkState2 = voipCallByLinkState;
        com.vk.voip.ui.call_by_link.feature.a aVar2 = aVar;
        if (aVar2 instanceof a.e) {
            if (!(voipCallByLinkState2 instanceof VoipCallByLinkState.Content)) {
                T(c.e.b.b);
                a7f0.a.f(this, rsg0.w0(yfb.x(((vg20) this.f.b).c())), new z7t0(this, 5), new ehm0(this, 17), 1);
            }
        } else if (aVar2 instanceof a.c) {
            a.c cVar = (a.c) aVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (cVar instanceof a.c.b) {
                    T(c.AbstractC2024c.b.b);
                } else if (cVar instanceof a.c.C2017a) {
                    T(c.AbstractC2024c.a.b);
                } else {
                    if (!(cVar instanceof a.c.C2018c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    T(c.AbstractC2024c.C2025c.b);
                }
                s3q0 s3q0Var = s3q0.a;
            }
        } else {
            UserId userId = null;
            Object obj = null;
            UserId userId2 = null;
            if (aVar2 instanceof a.b) {
                a.b bVar = (a.b) aVar2;
                if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                    if (bVar instanceof a.b.C2015a) {
                        T(c.b.a.b);
                    } else {
                        if (!(bVar instanceof a.b.C2016b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterator<T> it = ((VoipCallByLinkState.Content) voipCallByLinkState2).c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (fkq0.a(((cgw0) next).a).equals(fkq0.a(((a.b.C2016b) bVar).b))) {
                                obj = next;
                                break;
                            }
                        }
                        cgw0 cgw0Var = (cgw0) obj;
                        if (cgw0Var != null) {
                            T(new c.b.C2023b(cgw0Var));
                        }
                    }
                }
            } else if (aVar2 instanceof a.j) {
                if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                    if (((VoipCallByLinkState.Content) voipCallByLinkState2).e.a) {
                        T(c.i.a.b);
                    } else {
                        T(c.i.b.b);
                    }
                }
            } else if (aVar2 instanceof a.C2014a) {
                if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                    if (((VoipCallByLinkState.Content) voipCallByLinkState2).f.a) {
                        T(c.a.C2022a.b);
                    } else {
                        T(c.a.b.b);
                    }
                }
            } else if (aVar2 instanceof a.d) {
                if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                    if (((VoipCallByLinkState.Content) voipCallByLinkState2).g.a) {
                        T(c.d.a.b);
                    } else {
                        T(c.d.b.b);
                    }
                }
            } else if (aVar2 instanceof a.f) {
                if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (aVar2 instanceof a.h) {
                if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (aVar2 instanceof a.g) {
                a.g gVar = (a.g) aVar2;
                if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                    if (gVar instanceof a.g.f) {
                        T(c.g.e.b);
                    } else if (gVar instanceof a.g.C2020g) {
                        T(c.g.f.b);
                    } else if (gVar instanceof a.g.d) {
                        T(c.g.d.b);
                    } else if (gVar instanceof a.g.c) {
                        T(c.g.C2028c.b);
                    } else if (gVar instanceof a.g.C2019a) {
                        T(c.g.a.b);
                    } else if (gVar instanceof a.g.b) {
                        T(c.g.b.b);
                    } else {
                        if (!(gVar instanceof a.g.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        VoipCallByLinkState.Content.MediaSettingDialogState mediaSettingDialogState = ((VoipCallByLinkState.Content) voipCallByLinkState2).j;
                        if (!(mediaSettingDialogState instanceof VoipCallByLinkState.Content.MediaSettingDialogState.a)) {
                            if (!(mediaSettingDialogState instanceof VoipCallByLinkState.Content.MediaSettingDialogState.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            VoipCallByLinkState.Content.MediaSettingDialogState.b bVar2 = (VoipCallByLinkState.Content.MediaSettingDialogState.b) mediaSettingDialogState;
                            VoipCallByLinkState.Content.MediaSettingDialogState.Setting setting = bVar2.a;
                            VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption selectedOption = bVar2.b;
                            int i = a.$EnumSwitchMapping$1[setting.ordinal()];
                            if (i == 1) {
                                int i2 = a.$EnumSwitchMapping$0[selectedOption.ordinal()];
                                if (i2 == 1) {
                                    T(c.f.C2027c.b);
                                } else if (i2 == 2) {
                                    T(c.f.a.b);
                                } else {
                                    if (i2 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    T(c.f.b.b);
                                }
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i3 = a.$EnumSwitchMapping$0[selectedOption.ordinal()];
                                if (i3 == 1) {
                                    T(c.h.C2029c.b);
                                } else if (i3 == 2) {
                                    T(c.h.a.b);
                                } else {
                                    if (i3 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    T(c.h.b.b);
                                }
                            }
                        }
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                }
            } else if (aVar2 instanceof a.k) {
                if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                    if (((VoipCallByLinkState.Content) voipCallByLinkState2).k.b) {
                        T(c.j.a.b);
                    } else {
                        T(c.j.b.b);
                    }
                }
            } else {
                if (!(aVar2 instanceof a.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.i iVar = (a.i) aVar2;
                boolean z = iVar instanceof a.i.C2021a;
                f4z<VoipCallByLinkNavigationEvent> f4zVar = this.h;
                if (z) {
                    if (voipCallByLinkState2 instanceof VoipCallByLinkState.a) {
                        f4zVar.b(VoipCallByLinkNavigationEvent.b.a);
                        f4zVar.b(VoipCallByLinkNavigationEvent.a.a);
                        s3q0 s3q0Var3 = s3q0.a;
                    } else if (voipCallByLinkState2 instanceof VoipCallByLinkState.b) {
                        f4zVar.b(VoipCallByLinkNavigationEvent.b.a);
                        f4zVar.b(VoipCallByLinkNavigationEvent.a.a);
                        s3q0 s3q0Var4 = s3q0.a;
                    } else {
                        if (!(voipCallByLinkState2 instanceof VoipCallByLinkState.Content)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        VoipCallByLinkState.Content.c cVar2 = ((VoipCallByLinkState.Content) voipCallByLinkState2).b;
                        if (epx.f(cVar2, VoipCallByLinkState.Content.c.a.a)) {
                            f4zVar.b(VoipCallByLinkNavigationEvent.b.a);
                        } else {
                            if (!epx.f(cVar2, VoipCallByLinkState.Content.c.b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f4zVar.b(VoipCallByLinkNavigationEvent.b.a);
                            f4zVar.b(VoipCallByLinkNavigationEvent.a.a);
                        }
                        s3q0 s3q0Var5 = s3q0.a;
                    }
                } else if (iVar instanceof a.i.b) {
                    if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                        VoipCallByLinkState.Content.b bVar3 = ((VoipCallByLinkState.Content) voipCallByLinkState2).d;
                        if (!(bVar3 instanceof VoipCallByLinkState.Content.b.a)) {
                            if (!(bVar3 instanceof VoipCallByLinkState.Content.b.C2013b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            userId2 = ((VoipCallByLinkState.Content.b.C2013b) bVar3).a.a;
                        }
                        f4zVar.b(new VoipCallByLinkNavigationEvent.c(userId2));
                    }
                } else {
                    if (!(iVar instanceof a.i.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                        VoipCallByLinkState.Content content = (VoipCallByLinkState.Content) voipCallByLinkState2;
                        VoipCallByLinkState.Content.b bVar4 = content.d;
                        if (!(bVar4 instanceof VoipCallByLinkState.Content.b.a)) {
                            if (!(bVar4 instanceof VoipCallByLinkState.Content.b.C2013b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            userId = ((VoipCallByLinkState.Content.b.C2013b) bVar4).a.a;
                        }
                        UserId userId3 = userId;
                        VoipCallByLinkState.Content.f fVar = content.i;
                        VoipCallByLinkState.Content.e eVar = content.h;
                        boolean z2 = content.e.a;
                        boolean z3 = content.f.a;
                        boolean z4 = content.g.a;
                        if (eVar instanceof VoipCallByLinkState.Content.e.c) {
                            mediaMicrophones = VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones.ENABLED;
                        } else if (eVar instanceof VoipCallByLinkState.Content.e.a) {
                            mediaMicrophones = VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones.DISABLED_ON_JOIN;
                        } else {
                            if (!(eVar instanceof VoipCallByLinkState.Content.e.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            mediaMicrophones = VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones.DISABLED_PERMANENT;
                        }
                        VoipCallByLinkNavigationEvent.ToStartCall.MediaMicrophones mediaMicrophones2 = mediaMicrophones;
                        if (fVar instanceof VoipCallByLinkState.Content.f.c) {
                            mediaVideo = VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo.ENABLED;
                        } else if (fVar instanceof VoipCallByLinkState.Content.f.a) {
                            mediaVideo = VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo.DISABLED_ON_JOIN;
                        } else {
                            if (!(fVar instanceof VoipCallByLinkState.Content.f.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            mediaVideo = VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo.DISABLED_PERMANENT;
                        }
                        VoipCallByLinkNavigationEvent.ToStartCall.MediaVideo mediaVideo2 = mediaVideo;
                        VoipCallByLinkState.Content.h hVar = content.k;
                        f4zVar.b(new VoipCallByLinkNavigationEvent.ToStartCall(userId3, z2, z3, z4, mediaMicrophones2, mediaVideo2, hVar.a && hVar.b));
                        VoipMediaMuteOption voipMediaMuteOption = VoipMediaMuteOption.MICROPHONE;
                        if (epx.f(eVar, VoipCallByLinkState.Content.e.c.a)) {
                            voipMediaMuteOptionState = VoipMediaMuteOptionState.UNMUTED;
                        } else if (epx.f(eVar, VoipCallByLinkState.Content.e.a.a)) {
                            voipMediaMuteOptionState = VoipMediaMuteOptionState.UNMUTED_BUT_MUTED_ONCE;
                        } else {
                            if (!epx.f(eVar, VoipCallByLinkState.Content.e.b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            voipMediaMuteOptionState = VoipMediaMuteOptionState.MUTED_PERMANENT;
                        }
                        jsw0 jsw0Var = new jsw0(voipMediaMuteOption, voipMediaMuteOptionState);
                        VoipMediaMuteOption voipMediaMuteOption2 = VoipMediaMuteOption.CAMERA;
                        if (epx.f(fVar, VoipCallByLinkState.Content.f.c.a)) {
                            voipMediaMuteOptionState2 = VoipMediaMuteOptionState.UNMUTED;
                        } else if (epx.f(fVar, VoipCallByLinkState.Content.f.a.a)) {
                            voipMediaMuteOptionState2 = VoipMediaMuteOptionState.UNMUTED_BUT_MUTED_ONCE;
                        } else {
                            if (!epx.f(fVar, VoipCallByLinkState.Content.f.b.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            voipMediaMuteOptionState2 = VoipMediaMuteOptionState.MUTED_PERMANENT;
                        }
                        this.g.b(new srw0.b.C3687b("", srw0.d.a.a, e43.l(jsw0Var, new jsw0(voipMediaMuteOption2, voipMediaMuteOptionState2))));
                    }
                }
                s3q0 s3q0Var6 = s3q0.a;
            }
        }
        s3q0 s3q0Var7 = s3q0.a;
    }
}
