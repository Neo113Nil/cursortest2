package com.vk.profile.community.suggestions.impl.ui.suggestions;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.profile.community.suggestions.api.model.SuggestionType;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.bih;
import xsna.f4z;
import xsna.fpf0;
import xsna.g2i;
import xsna.gd60;
import xsna.gm50;
import xsna.izs;
import xsna.kf1;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.oz50;
import xsna.rj1;
import xsna.s3q0;
import xsna.v6;
import xsna.vk50;
import xsna.wvw;
import xsna.wzh;
import xsna.wzs;
import xsna.xn50;
import xsna.zqh;
import xsna.zqu;

/* compiled from: CommunitySuggestionsFragment.kt */
/* loaded from: classes5.dex */
public final class CommunitySuggestionsFragment extends MviImplFragment<com.vk.profile.community.suggestions.impl.ui.suggestions.b, CommunitySuggestionsViewState, com.vk.profile.community.suggestions.impl.ui.suggestions.a> {
    public static final /* synthetic */ int X = 0;
    public g Q;
    public com.vk.profile.community.suggestions.impl.ui.suggestions.c R;
    public String S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    /* compiled from: CommunitySuggestionsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CommunitySuggestionsFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuggestionType.values().length];
            try {
                iArr[SuggestionType.SIMILAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunitySuggestionsFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<UserId, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(UserId userId, Integer num) {
            int intValue = num.intValue();
            CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) this.receiver;
            int i = CommunitySuggestionsFragment.X;
            communitySuggestionsFragment.getClass();
            xn50.a.c(communitySuggestionsFragment, new a.h(userId, intValue));
            return s3q0.a;
        }
    }

    /* compiled from: CommunitySuggestionsFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<UserId, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(UserId userId, Integer num) {
            int intValue = num.intValue();
            CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) this.receiver;
            int i = CommunitySuggestionsFragment.X;
            communitySuggestionsFragment.getClass();
            xn50.a.c(communitySuggestionsFragment, new a.h(userId, intValue));
            return s3q0.a;
        }
    }

    /* compiled from: CommunitySuggestionsFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<com.vk.profile.community.suggestions.impl.ui.suggestions.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.profile.community.suggestions.impl.ui.suggestions.a aVar) {
            CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) this.receiver;
            communitySuggestionsFragment.getClass();
            xn50.a.c(communitySuggestionsFragment, aVar);
            return s3q0.a;
        }
    }

    public CommunitySuggestionsFragment() {
        v6 v6Var = new v6(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, v6Var);
        this.U = msy.a(lazyThreadSafetyMode, new bih(this, 3));
        this.V = msy.a(lazyThreadSafetyMode, new rj1(this, 29));
        this.W = msy.a(lazyThreadSafetyMode, new wzh(this, 2));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        g gVar = new g(requireContext(), getViewLifecycleOwner(), new e(1, this, CommunitySuggestionsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.Q = gVar;
        return new mk50.c(gVar.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        CommunitySuggestionsViewState communitySuggestionsViewState = (CommunitySuggestionsViewState) ao50Var;
        g gVar = this.Q;
        if (gVar == null) {
            gVar = null;
        }
        gVar.getClass();
        gm50.a.b(gVar, communitySuggestionsViewState.a, new zqh(gVar, 1));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((f4z) ((com.vk.profile.community.suggestions.impl.ui.suggestions.b) vk50Var).f.b).a(new kf1(this, 27), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g gVar = this.Q;
        if (gVar == null) {
            gVar = null;
        }
        g.a(gVar.h);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable4 = bundle.getParcelable("SUGGESTIONS_TYPE", SuggestionType.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = bundle.getParcelable("SUGGESTIONS_TYPE");
            if (!(parcelable5 instanceof SuggestionType)) {
                parcelable5 = null;
            }
            parcelable = (SuggestionType) parcelable5;
        }
        SuggestionType suggestionType = (SuggestionType) parcelable;
        if (suggestionType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        zqu zquVar = new zqu();
        if (b.$EnumSwitchMapping$0[suggestionType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        g2i g2iVar = new g2i(zquVar, bundle.getString("REF"));
        wvw t = ((InfoBridgeComponent) m7m.d(this).a(fpf0.a(InfoBridgeComponent.class))).t();
        gd60 Ad = ((NewsFeedBridgeComponent) m7m.d(this).a(fpf0.a(NewsFeedBridgeComponent.class))).Ad();
        this.S = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_SUGGESTED_LIST);
        this.R = new com.vk.profile.community.suggestions.impl.ui.suggestions.c(this, Ad);
        if (i >= 33) {
            parcelable3 = bundle.getParcelable(CommonConstant.RETKEY.USERID, UserId.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = bundle.getParcelable(CommonConstant.RETKEY.USERID);
            parcelable2 = (UserId) (parcelable6 instanceof UserId ? parcelable6 : null);
        }
        if (parcelable2 == null) {
            throw new IllegalArgumentException("Group Id is required");
        }
        UserId userId = (UserId) parcelable2;
        int i2 = bundle.getInt("ADMIN_LEVEL");
        String string = bundle.getString(NativeAdContent.ViewTag.AD_TITLE);
        if (string == null) {
            string = "";
        }
        return new com.vk.profile.community.suggestions.impl.ui.suggestions.b(userId, i2, g2iVar, t, Ad, string);
    }
}
