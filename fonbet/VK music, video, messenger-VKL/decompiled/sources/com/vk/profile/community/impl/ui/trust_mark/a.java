package com.vk.profile.community.impl.ui.trust_mark;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.actions.c;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import kotlin.LazyThreadSafetyMode;
import xsna.a470;
import xsna.cpo;
import xsna.dne;
import xsna.dw20;
import xsna.iah0;
import xsna.iz0;
import xsna.izs;
import xsna.jmu0;
import xsna.jrh;
import xsna.kmu0;
import xsna.krh;
import xsna.msy;
import xsna.myh;
import xsna.rl3;
import xsna.urh;

/* compiled from: CommunityTrustMarksBottomSheet.kt */
/* loaded from: classes5.dex */
public final class a extends jmu0 {
    public static final /* synthetic */ int p1 = 0;
    public CommunityTrustMarksArgs h1;
    public UserId i1;
    public c.b j1;
    public final Object k1;
    public final Object l1;
    public final Object m1;
    public final Object n1;
    public final Object o1;

    /* compiled from: CommunityTrustMarksBottomSheet.kt */
    /* renamed from: com.vk.profile.community.impl.ui.trust_mark.a$a, reason: collision with other inner class name */
    public static final class C1628a extends kmu0 {
        public final ExtendedCommunityProfile h;
        public final c.b i;
        public final CommunityTrustMarksArgs j;

        public C1628a(Context context, ExtendedCommunityProfile extendedCommunityProfile, c.b bVar, CommunityTrustMarksArgs communityTrustMarksArgs, urh urhVar) {
            super(context, urhVar);
            this.h = extendedCommunityProfile;
            this.i = bVar;
            this.j = communityTrustMarksArgs;
            if (rl3.I(new CommunityTrustMarksArgs.ActionButton[]{communityTrustMarksArgs.f, communityTrustMarksArgs.g, communityTrustMarksArgs.h}).isEmpty()) {
                c(new cpo(false, 0, 7));
            } else {
                c(new a470());
            }
            B(iah0.b(12.0f), true, false);
            F0(true);
            w();
            a();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a();
            aVar.h1 = this.j;
            aVar.i1 = this.h.a.c;
            aVar.j1 = this.i;
            return aVar;
        }
    }

    /* compiled from: CommunityTrustMarksBottomSheet.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommunityTrustMarksArgs.TrustMarkData.Type.values().length];
            try {
                iArr[CommunityTrustMarksArgs.TrustMarkData.Type.DELIVERY_SELF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityTrustMarksArgs.TrustMarkData.Type.DELIVERY_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityTrustMarksArgs.TrustMarkData.Type.PAYMENT_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityTrustMarksArgs.TrustMarkData.Type.REFUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommunityTrustMarksArgs.TrustMarkData.Type.DOCS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommunityTrustMarksArgs.ActionButton.Type.values().length];
            try {
                iArr2[CommunityTrustMarksArgs.ActionButton.Type.GOODS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CommunityTrustMarksArgs.ActionButton.Type.SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CommunityTrustMarksArgs.ActionButton.Type.YCLIENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public a() {
        jrh jrhVar = new jrh(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k1 = msy.a(lazyThreadSafetyMode, jrhVar);
        this.l1 = msy.a(lazyThreadSafetyMode, new myh(this, 1));
        this.m1 = msy.a(lazyThreadSafetyMode, new dne(this, 11));
        this.n1 = msy.a(lazyThreadSafetyMode, new krh(this, 3));
        this.o1 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.presenter.b(this, 26));
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-544847162);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-544847162, 8, -1, "com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksBottomSheet.ThemedContent (CommunityTrustMarksBottomSheet.kt:58)");
        }
        CommunityTrustMarksArgs communityTrustMarksArgs = this.h1;
        if (communityTrustMarksArgs == null) {
            aVar.K(-860298712);
        } else {
            aVar.K(-860298711);
            boolean y = aVar.y(this);
            Object x = aVar.x();
            if (y || x == a.C0011a.a) {
                x = new iz0(this, 19);
                aVar.R(x);
            }
            e.c(communityTrustMarksArgs, (izs) x, aVar, 0);
        }
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
