package com.vk.movika.sdk.base.flow.binding;

import com.vk.debug.ui.dev.DebugDevHintsFragment;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.dto.user.UserProfile;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.superapp.api.dto.restore.VkRestoreConfirmInstantResult;
import defpackage.b0;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.functions.m;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import xsna.djt;
import xsna.e420;
import xsna.eh4;
import xsna.g5b;
import xsna.hbe;
import xsna.k9;
import xsna.md8;
import xsna.pb00;
import xsna.pf8;
import xsna.ppu;
import xsna.rd8;
import xsna.wr0;
import xsna.xxd0;
import xsna.zhd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements PlaybackStateListener, m, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, ParticipantsUpdater.MeChanger {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                return (io.reactivex.rxjava3.core.e) ((eh4) obj2).invoke(obj);
            case 3:
                return (t) ((b0) obj2).invoke(obj);
            case 4:
            case 6:
            case 7:
            case 10:
            case 15:
            case 17:
            case 24:
            case 25:
            case 27:
            default:
                return (OrderPaymentParameters) ((pf8) obj2).invoke(obj);
            case 5:
                return (xxd0) ((k9) obj2).invoke(obj);
            case 8:
                return (t) ((wr0) obj2).invoke(obj);
            case 9:
                return (t) ((k9) obj2).invoke(obj);
            case 11:
                return (com.vk.channels.impl.channel_screen.footer.e) ((k9) obj2).invoke(obj);
            case 12:
                return (Pair) ((g5b) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((b0) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.b0) ((g5b) obj2).invoke(obj);
            case 16:
                int i2 = DebugDevHintsFragment.W;
                return (String) ((wr0) obj2).invoke(obj);
            case 18:
                return (Boolean) ((wr0) obj2).invoke(obj);
            case 19:
                return (VkRestoreConfirmInstantResult) ((djt) obj2).invoke(obj);
            case 20:
                return (t) ((ppu) obj2).invoke(obj);
            case 21:
                return (List) ((e420) obj2).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.b0) ((pb00) obj2).invoke(obj);
            case 23:
                return (Integer) ((e420) obj2).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.b0) ((hbe) obj2).invoke(obj);
            case 28:
                return (UserProfile) ((e420) obj2).invoke(obj);
        }
    }

    @Override // com.vk.movika.sdk.player.base.listener.PlaybackStateListener
    public void i(PlaybackStateListener.PlaybackState playbackState) {
        zhd0 zhd0Var = (zhd0) this.c;
        if (h.a(playbackState, zhd0Var) || com.vk.movika.sdk.utils.f.b.b - 2 > 0) {
            return;
        }
        com.vk.movika.sdk.utils.c.a(zhd0Var, null);
        Objects.toString(playbackState);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 1:
                break;
            case 4:
                ((wr0) this.c).invoke(obj);
                break;
            case 7:
                break;
            case 10:
                break;
            case 17:
                ((com.vk.music.fragment.impl.model.a) this.c).getClass();
                break;
            case 24:
                break;
        }
        return ((Boolean) ((e420) this.c).invoke(obj)).booleanValue();
    }

    @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MeChanger
    public void updateMyExternalId(ParticipantId participantId) {
        ((ConversationParticipant) this.c).setExternalId(participantId);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (rd8.a) ((md8) this.c).invoke(obj, obj2);
    }
}
