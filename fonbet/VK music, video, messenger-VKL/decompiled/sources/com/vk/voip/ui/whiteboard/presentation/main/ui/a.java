package com.vk.voip.ui.whiteboard.presentation.main.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.c;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import xsna.bwt0;
import xsna.c5g;
import xsna.f9t;
import xsna.ga40;
import xsna.ghu;
import xsna.glx0;
import xsna.gvw0;
import xsna.j5g;
import xsna.mnh0;
import xsna.po40;
import xsna.v6v;
import xsna.w7w0;
import xsna.xsw0;
import xsna.ylx0;
import xsna.z2v;

/* compiled from: WhiteboardView.kt */
/* loaded from: classes7.dex */
public final class a {
    public final FragmentManager a;
    public final xsw0 b;
    public final z2v c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final glx0 e;
    public final com.vk.voip.ui.hint.a f;
    public final Context g;
    public final View h;
    public final ImageView i;
    public final View j;
    public final PrimaryActionsView k;
    public final View l;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c0, code lost:
    
        if (r11 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(FragmentManager fragmentManager, View view, xsw0 xsw0Var, gvw0 gvw0Var, z2v z2vVar) {
        Set set;
        Set<ParticipantId> raisedHandIds;
        this.a = fragmentManager;
        this.b = xsw0Var;
        this.c = z2vVar;
        glx0 glx0Var = new glx0();
        this.e = glx0Var;
        this.g = view.getContext();
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.voip_whiteboard_content);
        this.h = view.findViewById(R.id.voip_whiteboard_progress_bar);
        this.i = (ImageView) view.findViewById(R.id.voip_whiteboard_back);
        this.j = view.findViewById(R.id.voip_whiteboard_expand);
        PrimaryActionsView primaryActionsView = (PrimaryActionsView) view.findViewById(R.id.voip_whiteboard_primary_actions);
        this.k = primaryActionsView;
        this.l = view.findViewById(R.id.voip_whiteboard_actions_background);
        VoipHintView voipHintView = (VoipHintView) view.findViewById(R.id.voip_hint_view);
        frameLayout.setKeepScreenOn(true);
        primaryActionsView.a(glx0Var, false);
        glx0Var.d(primaryActionsView);
        glx0Var.k = new ga40(this, 22);
        c cVar = c.b;
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        f9t f9tVar = new f9t(17);
        po40 po40Var = new po40();
        ghu a = v6v.a();
        ParticipantStatesManager participantStatesManager = OKVoipEngine.b.getParticipantStatesManager();
        if (participantStatesManager != null && (raisedHandIds = participantStatesManager.getRaisedHandIds()) != null) {
            Set<ParticipantId> set2 = raisedHandIds;
            ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(mnh0.E((ParticipantId) it.next()));
            }
            set = j5g.S0(arrayList);
        }
        set = EmptySet.b;
        Set set3 = set;
        c.b.getClass();
        this.f = new com.vk.voip.ui.hint.a(voipHintView, cVar, groupCallViewModel, f9tVar, po40Var, a, c.j0(), set3, gvw0Var);
        bwt0.i0(this.j, new w7w0(this, 7));
        bwt0.i0(this.i, new ylx0(this, 0));
    }
}
