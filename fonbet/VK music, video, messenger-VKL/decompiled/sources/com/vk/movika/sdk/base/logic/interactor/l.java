package com.vk.movika.sdk.base.logic.interactor;

import android.content.Context;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.confirmaccount.impl.di.ConfirmAccountComponentImpl;
import com.vk.im.engine.internal.storage.structure.Table;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.musc.kidsmode.impl.di.MusicKidsModeComponentImpl;
import com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.text.Regex;
import xsna.a3j;
import xsna.abg0;
import xsna.abx;
import xsna.bbv0;
import xsna.bpn0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.e6c;
import xsna.es;
import xsna.fx80;
import xsna.fxc0;
import xsna.gzs;
import xsna.hhd0;
import xsna.icm;
import xsna.ida;
import xsna.iyk0;
import xsna.j5g;
import xsna.miy;
import xsna.nfj;
import xsna.ny80;
import xsna.o3a0;
import xsna.pxo0;
import xsna.qc00;
import xsna.qcy;
import xsna.qee;
import xsna.r9a;
import xsna.re3;
import xsna.rl3;
import xsna.rli0;
import xsna.s290;
import xsna.s3q0;
import xsna.u6g0;
import xsna.uki0;
import xsna.v5r0;
import xsna.ysg0;
import xsna.znk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ l(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new r();
            case 1:
                return s3q0.a;
            case 2:
                hhd0 hhd0Var = znk0.o;
                return new v5r0(((u6g0) (hhd0Var != null ? hhd0Var : null).b).a());
            case 3:
                return new re3();
            case 4:
                return s3q0.a;
            case 5:
                return new ny80();
            case 6:
                return new pxo0(300L);
            case 7:
                return Calendar.getInstance();
            case 8:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                ysg0.b.a(e6c.a.a);
                return s3q0.a;
            case 9:
                return new es();
            case 10:
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                return new qee();
            case 12:
                Object obj = ClipsOwnerSwipeFragment.k0;
                ComFeatures comFeatures = ComFeatures.COM_PROFILE_FROM_CLIPS_SWIPE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 13:
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                qcy<Object>[] qcyVarArr2 = ConfirmAccountComponentImpl.c;
                return new a3j();
            case 16:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return rl3.y0(new ContactsViews[]{ContactsViews.CONTACTS, ContactsViews.RECENT_USERS, ContactsViews.EMPTY});
            case 17:
                return Long.valueOf(System.currentTimeMillis());
            case 18:
                Regex regex = new Regex("\\s");
                List<String> h = Table.DIALOG_WEIGHT.h();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it = h.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((String) j5g.Y(regex.j(0, (String) it.next())));
                }
                return rli0.r((uki0) icm.b.getValue(), null, new nfj(linkedHashSet, 6), 31);
            case 19:
                Context context = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.paddingXS, context != null ? context : null));
            case 20:
                Path path = new Path();
                path.moveTo(-197.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.rCubicTo(14.28182f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 85.07782f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 135.54689f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.rCubicTo(54.26191f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.42461f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 168.24332f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.rCubicTo(144.72154f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 316.40982f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 316.40982f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return path;
            case 21:
                iyk0 iyk0Var = abx.a;
                return Boolean.TRUE;
            case 22:
                return new Regex("/im/channels(?:/(-\\d+))?/?");
            case 23:
                abg0 abg0Var = dhr0.t;
                return e43.l(new ListFriendsIconDrawable.a(abg0Var.c(R.attr.im_friends_list_start_color_1), abg0Var.c(R.attr.im_friends_list_end_color_1)), new ListFriendsIconDrawable.a(abg0Var.c(R.attr.im_friends_list_start_color_2), abg0Var.c(R.attr.im_friends_list_end_color_2)), new ListFriendsIconDrawable.a(abg0Var.c(R.attr.im_friends_list_start_color_3), abg0Var.c(R.attr.im_friends_list_end_color_3)), new ListFriendsIconDrawable.a(abg0Var.c(R.attr.im_friends_list_start_color_4), abg0Var.c(R.attr.im_friends_list_end_color_4)), new ListFriendsIconDrawable.a(abg0Var.c(R.attr.im_friends_list_start_color_5), abg0Var.c(R.attr.im_friends_list_end_color_5)), new ListFriendsIconDrawable.a(abg0Var.c(R.attr.im_friends_list_start_color_6), abg0Var.c(R.attr.im_friends_list_end_color_6)));
            case 24:
                return new o3a0();
            case 25:
                return Boolean.valueOf(fxc0.B().J().X1());
            case 26:
                return new r9a(new bpn0(new qc00(1)), new ida[0]);
            case 27:
                qcy<Object>[] qcyVarArr3 = MusicKidsModeComponentImpl.f;
                return new miy();
            case 28:
                return new fx80();
            default:
                return new s290();
        }
    }
}
