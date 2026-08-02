package com.vk.friends.impl.friends.presentation.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.friends.api.presentation.FriendsListType;
import com.vk.friends.impl.friends.di.FriendsListComponent;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.bts;
import xsna.fpf0;
import xsna.hg6;
import xsna.i440;
import xsna.iah0;
import xsna.id6;
import xsna.jd6;
import xsna.m7m;
import xsna.msy;
import xsna.nqs;
import xsna.ris;
import xsna.s3q0;
import xsna.uth0;
import xsna.w1z;
import xsna.wzs;
import xsna.xb;
import xsna.xqs;
import xsna.z1h0;
import xsna.zf20;
import xsna.zps;

/* compiled from: PaginatedFriendsListFragment.kt */
/* loaded from: classes.dex */
public final class PaginatedFriendsListFragment extends AbsFriendsFragment<xqs, xb> {
    public static final /* synthetic */ int p0 = 0;
    public boolean n0;
    public final bpn0 m0 = new bpn0(new i440(this, 10));
    public final Object o0 = msy.a(LazyThreadSafetyMode.NONE, new zf20(this, 15));

    /* compiled from: PaginatedFriendsListFragment.kt */
    /* loaded from: classes15.dex */
    public static final class a extends AbsFriendsFragment.a {
    }

    /* compiled from: PaginatedFriendsListFragment.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<UserProfile, Integer, s3q0> {
        public b(xqs xqsVar) {
            super(2, xqsVar, xqs.class, "onProfileClick", "onProfileClick(Lcom/vk/dto/user/UserProfile;I)V", 0);
        }

        @Override // xsna.wzs
        public final s3q0 invoke(UserProfile userProfile, Integer num) {
            int intValue = num.intValue();
            ((xqs) this.receiver).c(userProfile, intValue);
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        to();
        ((uth0) this.o0.getValue()).getClass();
        return false;
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment
    public final xb no(hg6<nqs> hg6Var) {
        ris risVar = (ris) this.m0.getValue();
        xqs xqsVar = this.h0;
        if (xqsVar == null) {
            xqsVar = null;
        }
        return new zps(risVar, hg6Var, new b(xqsVar));
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || this.n0) {
            return;
        }
        tn();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        to();
        ((uth0) this.o0.getValue()).onDestroyView();
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        to();
        ((uth0) this.o0.getValue()).onPause();
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        to();
        ((uth0) this.o0.getValue()).onResume();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        to();
        ((uth0) this.o0.getValue()).a(new bts(view, 0));
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment
    public final xqs oo(AbsFriendsFragment absFriendsFragment, Bundle bundle) {
        FriendsListType friendsListType;
        String string;
        Bundle arguments = getArguments();
        UserId userId = arguments != null ? (UserId) arguments.getParcelable("user_id") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("list_type")) == null || (friendsListType = FriendsListType.valueOf(string)) == null) {
            friendsListType = FriendsListType.ALL;
        }
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("referrer") : null;
        Bundle arguments4 = getArguments();
        return new id6(new jd6(friendsListType, userId, string2, arguments4 != null ? arguments4.getBoolean("global_search_enabled") : false), absFriendsFragment, ((FriendsListComponent) m7m.d(this).a(fpf0.a(FriendsListComponent.class))).b9());
    }

    @Override // com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment
    public final int qo() {
        int i;
        RecyclerView po = po();
        int width = (po.getWidth() - po.getPaddingLeft()) - po.getPaddingRight();
        if (this.V >= 600) {
            i = iah0.a(this.U ? 160.0f : 270.0f);
        } else {
            i = width;
        }
        int i2 = width * i == 0 ? 1 : width / i;
        xqs xqsVar = this.h0;
        if (xqsVar == null) {
            xqsVar = null;
        }
        if (!xqsVar.a()) {
            int i3 = this.V > this.W ? 2 : 1;
            if (i2 > i3) {
                return i3;
            }
        }
        return i2;
    }

    public final boolean to() {
        z1h0 parentFragment = getParentFragment();
        if (!(parentFragment instanceof w1z)) {
            return false;
        }
        return false;
    }
}
