package com.vk.voip.ui.call_by_link.feature;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.voip.ui.call_by_link.feature.VoipCallByLinkState;
import com.vk.voip.ui.call_by_link.feature.c;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b25;
import xsna.dgw0;
import xsna.dm50;
import xsna.i9u0;
import xsna.o25;
import xsna.xfw0;

/* compiled from: VoipCallByLinkReducer.kt */
/* loaded from: classes7.dex */
public final class d extends dm50<VoipCallByLinkViewState, c, VoipCallByLinkState> {
    public final b25 d;
    public final xfw0 e;
    public final dgw0 f;

    public d(b25 b25Var) {
        super(VoipCallByLinkState.b.b);
        this.d = b25Var;
        this.e = new xfw0(b25Var);
        this.f = new dgw0();
    }

    @Override // xsna.dm50
    public final VoipCallByLinkState c(VoipCallByLinkState voipCallByLinkState, c cVar) {
        VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption selectedOption;
        VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption selectedOption2;
        VoipCallByLinkState voipCallByLinkState2 = voipCallByLinkState;
        c cVar2 = cVar;
        if (cVar2 instanceof c.e) {
            c.e eVar = (c.e) cVar2;
            if (eVar instanceof c.e.b) {
                return VoipCallByLinkState.b.b;
            }
            boolean z = eVar instanceof c.e.C2026c;
            if (!z && !(eVar instanceof c.e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            VoipCallByLinkState.Content.c.b bVar = VoipCallByLinkState.Content.c.b.a;
            List list = z ? ((c.e.C2026c) eVar).b : EmptyList.b;
            VoipCallByLinkState.Content.b.a aVar = VoipCallByLinkState.Content.b.a.a;
            VoipCallByLinkState.Content.g gVar = new VoipCallByLinkState.Content.g(false);
            b25 b25Var = this.d;
            VoipCallByLinkState.Content.a aVar2 = new VoipCallByLinkState.Content.a(!o25.b(b25Var));
            VoipCallByLinkState.Content.d dVar = new VoipCallByLinkState.Content.d(!o25.b(b25Var));
            VoipCallByLinkState.Content.e.c cVar3 = VoipCallByLinkState.Content.e.c.a;
            VoipCallByLinkState.Content.f.c cVar4 = VoipCallByLinkState.Content.f.c.a;
            VoipCallByLinkState.Content.MediaSettingDialogState.a aVar3 = VoipCallByLinkState.Content.MediaSettingDialogState.a.a;
            com.vk.voip.ui.c.b.getClass();
            return new VoipCallByLinkState.Content(bVar, list, aVar, gVar, aVar2, dVar, cVar3, cVar4, aVar3, new VoipCallByLinkState.Content.h(((Boolean) com.vk.voip.ui.c.k0().b.invoke()).booleanValue(), true));
        }
        if (cVar2 instanceof c.AbstractC2024c) {
            c.AbstractC2024c abstractC2024c = (c.AbstractC2024c) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (abstractC2024c instanceof c.AbstractC2024c.b) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, VoipCallByLinkState.Content.c.b.a, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                }
                if (abstractC2024c instanceof c.AbstractC2024c.a) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, VoipCallByLinkState.Content.c.a.a, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                }
                if (abstractC2024c instanceof c.AbstractC2024c.C2025c) {
                    return VoipCallByLinkState.a.b;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.b) {
            c.b bVar2 = (c.b) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (bVar2 instanceof c.b.a) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, VoipCallByLinkState.Content.b.a.a, null, null, null, null, null, null, null, 1019);
                }
                if (bVar2 instanceof c.b.C2023b) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, new VoipCallByLinkState.Content.b.C2013b(((c.b.C2023b) bVar2).b), null, null, null, null, null, null, null, 1019);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.i) {
            c.i iVar = (c.i) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (iVar instanceof c.i.a) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, new VoipCallByLinkState.Content.g(false), null, null, null, null, null, null, 1015);
                }
                if (iVar instanceof c.i.b) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, new VoipCallByLinkState.Content.g(true), null, null, null, null, null, null, 1015);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.a) {
            c.a aVar4 = (c.a) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (aVar4 instanceof c.a.C2022a) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, new VoipCallByLinkState.Content.a(false), null, null, null, null, null, 1007);
                }
                if (aVar4 instanceof c.a.b) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, new VoipCallByLinkState.Content.a(true), null, null, null, null, null, 1007);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.d) {
            c.d dVar2 = (c.d) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (dVar2 instanceof c.d.a) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, new VoipCallByLinkState.Content.d(false), null, null, null, null, 991);
                }
                if (dVar2 instanceof c.d.b) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, new VoipCallByLinkState.Content.d(true), null, null, null, null, 991);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.f) {
            c.f fVar = (c.f) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (fVar instanceof c.f.C2027c) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, null, VoipCallByLinkState.Content.e.c.a, null, null, null, 959);
                }
                if (fVar instanceof c.f.a) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, null, VoipCallByLinkState.Content.e.a.a, null, null, null, 959);
                }
                if (fVar instanceof c.f.b) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, null, VoipCallByLinkState.Content.e.b.a, null, null, null, 959);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.h) {
            c.h hVar = (c.h) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (hVar instanceof c.h.C2029c) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, null, null, VoipCallByLinkState.Content.f.c.a, null, null, 895);
                }
                if (hVar instanceof c.h.a) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, null, null, VoipCallByLinkState.Content.f.a.a, null, null, 895);
                }
                if (hVar instanceof c.h.b) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, null, null, VoipCallByLinkState.Content.f.b.a, null, null, 895);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (cVar2 instanceof c.g) {
            c.g gVar2 = (c.g) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (gVar2 instanceof c.g.e) {
                    VoipCallByLinkState.Content content = (VoipCallByLinkState.Content) voipCallByLinkState2;
                    VoipCallByLinkState.Content.MediaSettingDialogState.Setting setting = VoipCallByLinkState.Content.MediaSettingDialogState.Setting.MICROPHONES;
                    VoipCallByLinkState.Content.e eVar2 = content.h;
                    if (eVar2 instanceof VoipCallByLinkState.Content.e.c) {
                        selectedOption2 = VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.ENABLED;
                    } else if (eVar2 instanceof VoipCallByLinkState.Content.e.a) {
                        selectedOption2 = VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_ON_JOIN;
                    } else {
                        if (!(eVar2 instanceof VoipCallByLinkState.Content.e.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        selectedOption2 = VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_PERMANENT;
                    }
                    return VoipCallByLinkState.Content.a(content, null, null, null, null, null, null, null, new VoipCallByLinkState.Content.MediaSettingDialogState.b(setting, selectedOption2), null, 767);
                }
                if (gVar2 instanceof c.g.f) {
                    VoipCallByLinkState.Content content2 = (VoipCallByLinkState.Content) voipCallByLinkState2;
                    VoipCallByLinkState.Content.MediaSettingDialogState.Setting setting2 = VoipCallByLinkState.Content.MediaSettingDialogState.Setting.VIDEO;
                    VoipCallByLinkState.Content.f fVar2 = content2.i;
                    if (fVar2 instanceof VoipCallByLinkState.Content.f.c) {
                        selectedOption = VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.ENABLED;
                    } else if (fVar2 instanceof VoipCallByLinkState.Content.f.a) {
                        selectedOption = VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_ON_JOIN;
                    } else {
                        if (!(fVar2 instanceof VoipCallByLinkState.Content.f.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        selectedOption = VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_PERMANENT;
                    }
                    return VoipCallByLinkState.Content.a(content2, null, null, null, null, null, null, null, new VoipCallByLinkState.Content.MediaSettingDialogState.b(setting2, selectedOption), null, 767);
                }
                if (gVar2 instanceof c.g.d) {
                    return VoipCallByLinkState.Content.a((VoipCallByLinkState.Content) voipCallByLinkState2, null, null, null, null, null, null, null, VoipCallByLinkState.Content.MediaSettingDialogState.a.a, null, 767);
                }
                if (gVar2 instanceof c.g.C2028c) {
                    VoipCallByLinkState.Content content3 = (VoipCallByLinkState.Content) voipCallByLinkState2;
                    VoipCallByLinkState.Content.MediaSettingDialogState mediaSettingDialogState = content3.j;
                    if (!(mediaSettingDialogState instanceof VoipCallByLinkState.Content.MediaSettingDialogState.a)) {
                        if (!(mediaSettingDialogState instanceof VoipCallByLinkState.Content.MediaSettingDialogState.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mediaSettingDialogState = VoipCallByLinkState.Content.MediaSettingDialogState.b.a((VoipCallByLinkState.Content.MediaSettingDialogState.b) mediaSettingDialogState, VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.ENABLED);
                    }
                    return VoipCallByLinkState.Content.a(content3, null, null, null, null, null, null, null, mediaSettingDialogState, null, 767);
                }
                if (gVar2 instanceof c.g.a) {
                    VoipCallByLinkState.Content content4 = (VoipCallByLinkState.Content) voipCallByLinkState2;
                    VoipCallByLinkState.Content.MediaSettingDialogState mediaSettingDialogState2 = content4.j;
                    if (!(mediaSettingDialogState2 instanceof VoipCallByLinkState.Content.MediaSettingDialogState.a)) {
                        if (!(mediaSettingDialogState2 instanceof VoipCallByLinkState.Content.MediaSettingDialogState.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mediaSettingDialogState2 = VoipCallByLinkState.Content.MediaSettingDialogState.b.a((VoipCallByLinkState.Content.MediaSettingDialogState.b) mediaSettingDialogState2, VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_ON_JOIN);
                    }
                    return VoipCallByLinkState.Content.a(content4, null, null, null, null, null, null, null, mediaSettingDialogState2, null, 767);
                }
                if (!(gVar2 instanceof c.g.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                VoipCallByLinkState.Content content5 = (VoipCallByLinkState.Content) voipCallByLinkState2;
                VoipCallByLinkState.Content.MediaSettingDialogState mediaSettingDialogState3 = content5.j;
                if (!(mediaSettingDialogState3 instanceof VoipCallByLinkState.Content.MediaSettingDialogState.a)) {
                    if (!(mediaSettingDialogState3 instanceof VoipCallByLinkState.Content.MediaSettingDialogState.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mediaSettingDialogState3 = VoipCallByLinkState.Content.MediaSettingDialogState.b.a((VoipCallByLinkState.Content.MediaSettingDialogState.b) mediaSettingDialogState3, VoipCallByLinkState.Content.MediaSettingDialogState.SelectedOption.DISABLED_PERMANENT);
                }
                return VoipCallByLinkState.Content.a(content5, null, null, null, null, null, null, null, mediaSettingDialogState3, null, 767);
            }
        } else {
            if (!(cVar2 instanceof c.j)) {
                throw new NoWhenBranchMatchedException();
            }
            c.j jVar = (c.j) cVar2;
            if (voipCallByLinkState2 instanceof VoipCallByLinkState.Content) {
                if (jVar instanceof c.j.a) {
                    VoipCallByLinkState.Content content6 = (VoipCallByLinkState.Content) voipCallByLinkState2;
                    return VoipCallByLinkState.Content.a(content6, null, null, null, null, null, null, null, null, new VoipCallByLinkState.Content.h(content6.k.a, false), ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                }
                if (!(jVar instanceof c.j.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                VoipCallByLinkState.Content content7 = (VoipCallByLinkState.Content) voipCallByLinkState2;
                return VoipCallByLinkState.Content.a(content7, null, null, null, null, null, null, null, null, new VoipCallByLinkState.Content.h(content7.k.a, true), ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            }
        }
        return voipCallByLinkState2;
    }

    @Override // xsna.dm50
    public final VoipCallByLinkViewState d() {
        return new VoipCallByLinkViewState(e(new i9u0(this, 5)));
    }

    @Override // xsna.dm50
    public final void h(VoipCallByLinkState voipCallByLinkState, VoipCallByLinkViewState voipCallByLinkViewState) {
        f(voipCallByLinkViewState.a, voipCallByLinkState);
    }
}
