package com.vk.profile.core.info_items;

import android.content.Context;
import android.widget.LinearLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.newsfeed.api.posting.community.PostingCountersModel;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$NavigationEvent;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.abh;
import xsna.bwt0;
import xsna.d0w;
import xsna.dc6;
import xsna.exj;
import xsna.f4m;
import xsna.ghc0;
import xsna.hhc0;
import xsna.jjc;
import xsna.ko00;
import xsna.m0i;
import xsna.msy;
import xsna.pgc0;
import xsna.qgc0;
import xsna.r4i;
import xsna.vh9;
import xsna.vif0;

/* compiled from: PostingCountersItem.kt */
/* loaded from: classes5.dex */
public final class a extends vif0<PostingCountersWithButtonItem> implements dc6 {
    public static final /* synthetic */ int x = 0;
    public final pgc0.d n;
    public final boolean o;
    public final VkButton p;
    public final VkButton q;
    public final boolean r;
    public final Object s;
    public final LinearLayout t;
    public final VkButton u;
    public final VkButton v;
    public PostingCountersModel w;

    /* compiled from: PostingCountersItem.kt */
    /* renamed from: com.vk.profile.core.info_items.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1640a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingCountersModel.ClickActionType.values().length];
            try {
                iArr[PostingCountersModel.ClickActionType.OPEN_POSTPONED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingCountersModel.ClickActionType.OPEN_DRAFTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingCountersModel.ClickActionType.OPEN_SUGGESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingCountersModel.ClickActionType.OPEN_UNPUBLISHED_MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(pgc0.d dVar, LinearLayout linearLayout, boolean z) {
        super(R.layout.layout_button_posting, linearLayout.getContext());
        this.n = dVar;
        this.o = z;
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.post_btn);
        this.p = vkButton;
        this.q = (VkButton) this.itemView.findViewById(R.id.unpublished_btn);
        ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
        comFeatures.getClass();
        this.r = b.A.a(comFeatures);
        this.s = msy.a(LazyThreadSafetyMode.NONE, new ko00(this, 22));
        this.t = (LinearLayout) this.itemView.findViewById(R.id.redesign_counters_container);
        this.u = (VkButton) this.itemView.findViewById(R.id.first_counter_button);
        this.v = (VkButton) this.itemView.findViewById(R.id.second_counter_button);
        q6();
        jjc.g(vkButton, new d0w(this, 16));
    }

    public static void x6(VkButton vkButton) {
        vkButton.setTextColorful(true);
        vkButton.setBackgroundColorful(true);
        vkButton.setIconColorful(true);
        vkButton.setTrailingIconColorful(true);
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(PostingCountersWithButtonItem postingCountersWithButtonItem) {
    }

    public final void q6() {
        VkButton.Mode mode = !this.o ? VkButton.Mode.Secondary : VkButton.Mode.Primary;
        VkButton vkButton = this.p;
        vkButton.setMode(mode);
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        vkButton.setAppearance(appearance);
        VkButton.Mode mode2 = vkButton.getMode();
        VkButton.Mode mode3 = VkButton.Mode.Secondary;
        boolean z = this.r;
        if (mode2 == mode3 && !z) {
            mode3 = VkButton.Mode.Tertiary;
        }
        if (!z) {
            VkButton vkButton2 = this.q;
            vkButton2.setMode(mode3);
            vkButton2.setAppearance(appearance);
            vkButton2.setCounterSize(VkCounter.Size.Small);
            return;
        }
        VkButton vkButton3 = this.u;
        vkButton3.setMode(mode3);
        VkCounter.Size size = VkCounter.Size.Small;
        vkButton3.setCounterSize(size);
        VkCounter.Mode mode4 = VkCounter.Mode.Tertiary;
        VkCounter.CounterAppearance.Appearance appearance2 = VkCounter.CounterAppearance.Appearance.Neutral;
        vkButton3.setCounterAttributesOverride(new exj(mode4, appearance2));
        VkButton vkButton4 = this.v;
        vkButton4.setMode(mode3);
        vkButton4.setCounterSize(size);
        vkButton4.setCounterAttributesOverride(new exj(mode4, appearance2));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void s6(PostingCountersModel postingCountersModel) {
        int i = 0;
        if (!this.r) {
            PostingCountersModel.a aVar = postingCountersModel.a;
            if (aVar == null) {
                return;
            }
            int i2 = aVar.b;
            boolean z = i2 > 0;
            VkButton vkButton = this.q;
            bwt0.p0(vkButton, z);
            vkButton.setText(aVar.a);
            vkButton.setCount(Integer.valueOf(i2));
            jjc.g(vkButton, new m0i(this, aVar, postingCountersModel, 4));
            return;
        }
        ComFeatures comFeatures = ComFeatures.COM_LEGO_BUTTONS_REDESIGN;
        comFeatures.getClass();
        boolean a = b.A.a(comFeatures);
        LinearLayout linearLayout = this.t;
        if (!a) {
            PostingCountersModel.a aVar2 = postingCountersModel.a;
            PostingCountersModel.b bVar = postingCountersModel.c;
            PostingCountersModel.a aVar3 = postingCountersModel.b;
            if (aVar2 != null || aVar3 != null) {
                if (aVar2 != null && aVar3 != null) {
                    i = ((Number) this.s.getValue()).intValue();
                }
                VkButton vkButton2 = this.u;
                f4m.r(i, vkButton2);
                VkButton vkButton3 = this.v;
                f4m.s(i, vkButton3);
                t6(vkButton2, postingCountersModel.a, bVar);
                t6(vkButton3, aVar3, bVar);
                bwt0.p0(linearLayout, true);
                return;
            }
        }
        bwt0.p0(linearLayout, false);
    }

    public final void t6(VkButton vkButton, PostingCountersModel.a aVar, PostingCountersModel.b bVar) {
        bwt0.p0(vkButton, aVar != null);
        vkButton.setText(aVar != null ? aVar.a : null);
        vkButton.setCount(aVar != null ? Integer.valueOf(aVar.b) : null);
        jjc.g(vkButton, new vh9(aVar, this, bVar, 12));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void v6(PostingCountersModel.ClickActionType clickActionType, PostingCountersModel.b bVar) {
        int i = C1640a.$EnumSwitchMapping$0[clickActionType.ordinal()];
        pgc0.d dVar = this.n;
        if (i == 1) {
            dVar.c();
            return;
        }
        if (i == 2) {
            dVar.b();
            return;
        }
        if (i == 3) {
            dVar.a();
            return;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        pgc0 pgc0Var = pgc0.this;
        Context b = pgc0Var.b();
        if (b == null) {
            return;
        }
        ghc0.f a = pgc0Var.f0(pgc0Var.c).a();
        PostingMetricsCreationEntryPoint a2 = hhc0.a(pgc0Var.r);
        a.getClass();
        a.c(MobileOfficialAppsConPostingStat$NavigationEvent.NavigationEventType.CLICK_TO_UNPUBLISHED, a2);
        ((abh) pgc0Var.C.getValue()).a(b, new r4i(new r4i.a(bVar.c, bVar.a, bVar.b), ((Boolean) pgc0Var.D.getValue()).booleanValue(), new qgc0(dVar)));
    }
}
