package com.vk.movika.sdk.base.hooks;

import android.app.Activity;
import android.view.View;
import androidx.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.hints.Hint;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.lists.AbstractPaginatedView;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.superapp.core.api.models.VkGender;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.actionlinks.views.fragments.wall.AddGridView;
import com.yandex.div.core.view2.divs.tabs.DivTabsAdapter;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;
import xsna.b06;
import xsna.b0l0;
import xsna.bms;
import xsna.by1;
import xsna.c63;
import xsna.d06;
import xsna.enj;
import xsna.fwt;
import xsna.g8e0;
import xsna.gzs;
import xsna.hda;
import xsna.he7;
import xsna.iah0;
import xsna.ihz;
import xsna.lp1;
import xsna.nj;
import xsna.pj1;
import xsna.qih0;
import xsna.rza;
import xsna.sd4;
import xsna.sza;
import xsna.t9;
import xsna.ttf;
import xsna.u06;
import xsna.x50;
import xsna.ycb;
import xsna.yve;
import xsna.z5a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements PlaybackStateListener, AbstractPaginatedView.g, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.l, a0, io.reactivex.rxjava3.functions.k, io.reactivex.rxjava3.functions.m, StoryViewerRouter.a, ExternalIdsResolver.ExtraResolver, Preference.c, ihz.a, BaseDivTabbedCardUi.Input {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 4:
                return (byte[]) ((com.vk.movika.sdk.base.logic.interactor.f) this.c).invoke(obj);
            case 5:
                return (u06) ((he7) this.c).invoke(obj);
            case 6:
                return (PrivacySetting) ((t9) this.c).invoke(obj);
            case 7:
            case 9:
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            default:
                return (b0) ((z5a) this.c).invoke(obj);
            case 8:
                return (hda) ((z5a) this.c).invoke(obj);
            case 10:
                return (qih0) ((t9) this.c).invoke(obj);
            case 11:
                return (Boolean) ((pj1) this.c).invoke(obj);
            case 14:
                return (ttf.j.a) ((x50) this.c).invoke(obj);
            case 15:
                return (List) ((lp1) this.c).invoke(obj);
            case 21:
                return new Pair((List) this.c, Boolean.FALSE);
            case 23:
                return (b0l0) ((nj) this.c).invoke(obj);
            case 24:
                return (List) ((yve) this.c).invoke(obj);
            case 25:
                return (hda) ((bms.c) this.c).invoke(obj);
            case 26:
                return (Boolean) ((sd4) this.c).invoke(obj);
            case 27:
                return (VkGender) ((nj) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.k
    public Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        sza.b bVar = (sza.b) obj;
        sza.a aVar = (sza.a) obj2;
        ImBgSyncState imBgSyncState = (ImBgSyncState) obj3;
        Boolean bool = (Boolean) obj4;
        sza.d dVar = (sza.d) obj5;
        Integer num = (Integer) obj7;
        ((rza) this.c).b.getClass();
        if (((ycb) obj6) instanceof ycb.c) {
            bVar = sza.b.a.a;
        }
        return new sza.c(bVar, aVar, imBgSyncState, bool.booleanValue(), dVar, num.intValue());
    }

    @Override // com.vk.lists.AbstractPaginatedView.g
    public int c(int i) {
        View view = (View) this.c;
        int i2 = AddGridView.S;
        int width = view.getWidth() / iah0.a(180);
        if (width == 0) {
            return 1;
        }
        return width;
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input
    public List getTabs() {
        List applyPatch$lambda$4;
        applyPatch$lambda$4 = DivTabsAdapter.applyPatch$lambda$4((ArrayList) this.c);
        return applyPatch$lambda$4;
    }

    @Override // com.vk.movika.sdk.player.base.listener.PlaybackStateListener
    public void i(PlaybackStateListener.PlaybackState playbackState) {
        q qVar = (q) this.c;
        if (playbackState == PlaybackStateListener.PlaybackState.READY) {
            qVar.a(true);
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        String str = (String) this.c;
        by1 by1Var = (by1) obj;
        by1Var.getClass();
        by1Var.h(str);
    }

    @Override // com.vk.story.viewer.api.StoryViewerRouter.a
    public View k(String str) {
        return ((d.j.r0.n) this.c).c.get();
    }

    @Override // ru.ok.android.externcalls.sdk.id.ExternalIdsResolver.ExtraResolver
    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return ((MultiEventListener) this.c).onExternalByInternalResolution(conversationParticipant);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(y yVar) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 7:
                CallsThreadUtilsKt.executeOnIoThread$lambda$0((gzs) obj, yVar);
                break;
            default:
                Hint hint = (Hint) obj;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                MainActivity mainActivity = b instanceof MainActivity ? (MainActivity) b : null;
                if (mainActivity == null) {
                    final fwt fwtVar = new fwt(yVar, hint);
                    c63.a(fwtVar);
                    yVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.awt
                        @Override // io.reactivex.rxjava3.functions.e
                        public final void cancel() {
                            c63 c63Var2 = c63.a;
                            c63.c(fwt.this);
                        }
                    });
                    break;
                } else {
                    yVar.onSuccess(new g8e0(hint, new WeakReference(mainActivity)));
                    break;
                }
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((yve) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ k(by1.a aVar, String str, long j, long j2) {
        this.b = 20;
        this.c = str;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (d06.a) ((b06) this.c).invoke(obj, obj2);
    }
}
