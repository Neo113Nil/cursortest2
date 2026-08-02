package com.vk.dialogslist.impl;

import android.os.Bundle;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dialogslist.api.list.DialogsListConfigToken;
import com.vk.im.business.notifications.api.BusinessNotificationComponent;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.a1w;
import xsna.bpn0;
import xsna.dhr0;
import xsna.dsm;
import xsna.e43;
import xsna.etm;
import xsna.fpf0;
import xsna.fx5;
import xsna.g2v;
import xsna.i7o0;
import xsna.kj50;
import xsna.ksm;
import xsna.kub;
import xsna.lpj;
import xsna.m3g;
import xsna.m7m;
import xsna.maj;
import xsna.msy;
import xsna.mxv;
import xsna.o25;
import xsna.pvh;
import xsna.qfj;
import xsna.qhh0;
import xsna.rub;
import xsna.sbg;
import xsna.too0;
import xsna.y1z;
import xsna.yj50;
import xsna.ytm;
import xsna.zdw;

/* compiled from: DialogsFragment.kt */
/* loaded from: classes18.dex */
public final class DialogsFragment extends MultiComponentFragment implements qhh0, etm, too0 {
    public static final /* synthetic */ int c0 = 0;
    public final bpn0 U;
    public final Object V;
    public final Object W;
    public final bpn0 X;
    public final mxv Y;
    public int Z;
    public Integer a0;
    public final b b0;

    /* compiled from: DialogsFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FolderType.values().length];
            try {
                iArr[FolderType.BUSINESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FolderType.PERSONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DialogsFragment.kt */
    public static final class b extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public DialogsFragment() {
        super(R.layout.fragment_dialogs);
        this.U = new bpn0(new maj(this, 3));
        sbg sbgVar = new sbg(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.V = msy.a(lazyThreadSafetyMode, sbgVar);
        this.W = msy.a(lazyThreadSafetyMode, new m3g(this, 11));
        this.X = new bpn0(new qfj(this, 2));
        this.Y = g2v.c();
        this.b0 = new b();
    }

    @Override // xsna.etm
    public final void Dh() {
        ho(ytm.v.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.b0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        this.b0.b();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        DialogsListConfigToken dialogsListConfigToken = (DialogsListConfigToken) this.U.getValue();
        bpn0 bpn0Var = this.X;
        a1w a1wVar = (a1w) bpn0Var.getValue();
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdw zdwVar2 = zdwVar;
        Object obj = fx5.a;
        dsm dsmVar = new dsm(this, dialogsListConfigToken, ((BusinessNotificationComponent) m7m.d(this).mo408a(fpf0.a(BusinessNotificationComponent.class))).i4(), new ksm(a1wVar, this.Y, zdwVar2, fx5.a(kn()), o25.a()), (FolderType) this.V.getValue());
        dsmVar.l(new pvh(this, 1));
        return e43.l(new kub(this, (a1w) bpn0Var.getValue(), this.Y), dsmVar);
    }

    @Override // com.vk.im.mvicomponent.MultiComponentFragment
    public final List jo(kj50 kj50Var) {
        if (!(kj50Var instanceof ytm.a0)) {
            return kj50Var instanceof ytm.g ? Collections.singletonList(rub.a.b) : EmptyList.b;
        }
        ytm.a0 a0Var = (ytm.a0) kj50Var;
        return Collections.singletonList(new rub.c(a0Var.b, a0Var.c));
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Z = 0;
        this.a0 = null;
    }

    @Override // xsna.qhh0
    public final boolean s() {
        ho(ytm.b0.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        int i = a.$EnumSwitchMapping$0[((FolderType) this.V.getValue()).ordinal()];
        if (i == 1) {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_BUSINESS_LIST;
        } else if (i != 2) {
            DialogsListConfigToken dialogsListConfigToken = (DialogsListConfigToken) this.U.getValue();
            mobileOfficialAppsCoreNavStat$EventScreen = (dialogsListConfigToken == null || dialogsListConfigToken.getId() != -1) ? MobileOfficialAppsCoreNavStat$EventScreen.IM_CUSTOM_LIST : MobileOfficialAppsCoreNavStat$EventScreen.IM;
        } else {
            mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_PERSONAL_LIST;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }
}
