package com.vk.newsfeed.posting.action_button.presentation;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.b;
import com.vk.movika.sdk.base.model.e;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.ay;
import xsna.f4z;
import xsna.fpf0;
import xsna.gy;
import xsna.h7v;
import xsna.hy;
import xsna.km50;
import xsna.kx;
import xsna.ky;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.my;
import xsna.nf3;
import xsna.nw;
import xsna.oy;
import xsna.oz50;
import xsna.q1t;
import xsna.qcy;
import xsna.qy;
import xsna.r7;
import xsna.ud80;
import xsna.vk50;

/* compiled from: ActionButtonsFragment.kt */
/* loaded from: classes4.dex */
public final class ActionButtonsFragment extends MviImplFragment<ay, oy, nw> {
    public static final /* synthetic */ qcy<Object>[] U;
    public final f4z Q = new f4z();
    public final nf3 R = new nf3();
    public final Object S;
    public final Object T;

    /* compiled from: ActionButtonsFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ActionButtonsFragment.class, "contentView", "getContentView()Lcom/vk/newsfeed/posting/action_button/presentation/ActionButtonsContentView;", 0);
        fpf0.a.getClass();
        U = new qcy[]{mutablePropertyReference1Impl};
    }

    public ActionButtonsFragment() {
        b bVar = new b(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, bVar);
        this.T = msy.a(lazyThreadSafetyMode, new e(this, 1));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        kx kxVar = new kx(requireContext(), this);
        qcy<Object> qcyVar = U[0];
        nf3 nf3Var = this.R;
        nf3Var.c = kxVar;
        return new mk50.c(((kx) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((kx) this.R.getValue(this, U[0])).f((oy) ao50Var, new gy(1, this, ActionButtonsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ay) vk50Var).f.a(new r7(this, 1), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        getFeature().C(nw.c.b);
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object obj;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        int i = Build.VERSION.SDK_INT;
        List parcelableArrayList = i >= 33 ? bundle.getParcelableArrayList("available_actions", ActionButton.class) : bundle.getParcelableArrayList("available_actions");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        if (i >= 33) {
            parcelable4 = bundle.getParcelable("selected_action", ActionButton.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = bundle.getParcelable("selected_action");
            if (!(parcelable5 instanceof ActionButton)) {
                parcelable5 = null;
            }
            parcelable = (ActionButton) parcelable5;
        }
        ActionButton actionButton = (ActionButton) parcelable;
        if (i >= 33) {
            obj = bundle.getSerializable("target_screen_unique_id", UUID.class);
        } else {
            Object serializable = bundle.getSerializable("target_screen_unique_id");
            if (!(serializable instanceof UUID)) {
                serializable = null;
            }
            obj = (UUID) serializable;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        if (i >= 33) {
            parcelable3 = bundle.getParcelable("owner", WallOwner.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = bundle.getParcelable("owner");
            parcelable2 = (WallOwner) (parcelable6 instanceof WallOwner ? parcelable6 : null);
        }
        WallOwner wallOwner = (WallOwner) parcelable2;
        if (wallOwner == null) {
            wallOwner = new WallOwner(UserId.d);
            com.vk.metrics.eventtracking.b.a.a(new Exception("Owner is null"));
        }
        return new ay(new ky(new my.a(parcelableArrayList, actionButton, new hy(false)), new qy()), nw.b.b, this.Q, new q1t(), ((Posting2Component) m7m.d(this).mo408a(fpf0.a(Posting2Component.class))).C9(uuid.toString()), wallOwner, new ud80((h7v) this.T.getValue()));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ACTION_BUTTON_SELECTION;
    }
}
