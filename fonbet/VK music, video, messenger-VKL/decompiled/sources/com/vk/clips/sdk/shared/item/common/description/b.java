package com.vk.clips.sdk.shared.item.common.description;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketAdHeaderClickConfig;
import com.vk.movika.sdk.base.observable.o;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cjh0;
import xsna.d3m;
import xsna.drm0;
import xsna.f4m;
import xsna.i2m;
import xsna.msy;
import xsna.nh3;
import xsna.pcg;
import xsna.r2m;
import xsna.sv0;
import xsna.tlo0;
import xsna.uv0;
import xsna.wpg;
import xsna.x7g;

/* compiled from: DescriptionRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class b {
    public final ClipDescription a;
    public final View b;
    public final r2m c;
    public final ClipsMarketAdHeaderClickConfig d;
    public final i2m e;
    public DescriptionViewState.b f;
    public DescriptionViewState g;
    public final Object h;
    public final Object i;

    /* compiled from: DescriptionRenderDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DescriptionViewState.ExpansionState.values().length];
            try {
                iArr[DescriptionViewState.ExpansionState.STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DescriptionViewState.ExpansionState.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DescriptionViewState.ExpansionState.COLLAPSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(ClipDescription clipDescription, View view, r2m r2mVar, cjh0 cjh0Var, ClipsMarketAdHeaderClickConfig clipsMarketAdHeaderClickConfig) {
        this.a = clipDescription;
        this.b = view;
        this.c = r2mVar;
        this.d = clipsMarketAdHeaderClickConfig;
        this.e = cjh0Var.a(new pcg(this, 12), new wpg(this, 7), new o(this, 27));
        sv0 sv0Var = new sv0(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, sv0Var);
        this.i = msy.a(lazyThreadSafetyMode, new uv0(10));
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(DescriptionViewState descriptionViewState) {
        Pair pair;
        x7g x7gVar;
        ClipDescription clipDescription = this.a;
        ClipsMarketAdHeaderClickConfig clipsMarketAdHeaderClickConfig = this.d;
        if (clipsMarketAdHeaderClickConfig != null && clipsMarketAdHeaderClickConfig.b == ClipsMarketAdHeaderClickConfig.HeaderType.HIDDEN && clipsMarketAdHeaderClickConfig.a) {
            if (clipDescription.getVisibility() == 0) {
                f4m.j(clipDescription);
                d3m.e(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            }
            return;
        }
        if (descriptionViewState.equals(this.g)) {
            return;
        }
        if (descriptionViewState instanceof DescriptionViewState.b) {
            DescriptionViewState.b bVar = (DescriptionViewState.b) descriptionViewState;
            clipDescription.setVisibility(0);
            DescriptionViewState.ExpansionState expansionState = bVar.c;
            DescriptionViewState.ExpansionState expansionState2 = DescriptionViewState.ExpansionState.EXPANDED;
            if (expansionState == expansionState2) {
                d3m.c(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                d3m.e(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
            if (!bVar.equals(this.f)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bVar.a);
                int i = a.$EnumSwitchMapping$0[expansionState.ordinal()];
                if (i == 1) {
                    pair = new Pair(null, null);
                } else if (i == 2) {
                    pair = new Pair((String) this.i.getValue(), c.a.a);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair((String) this.h.getValue(), c.b.a);
                }
                CharSequence charSequence = (CharSequence) pair.d();
                c cVar = (c) pair.g();
                nh3 nh3Var = cVar != null ? new nh3(10, this, cVar) : null;
                i2m i2mVar = this.e;
                if (charSequence != null && drm0.F(spannableStringBuilder, charSequence)) {
                    i2mVar.b(clipDescription.getContext(), spannableStringBuilder, charSequence, nh3Var);
                }
                i2mVar.a(clipDescription.getContext(), spannableStringBuilder);
                ClipDescription.a config = clipDescription.getConfig();
                tlo0.Companion.getClass();
                tlo0.h hVar = new tlo0.h(spannableStringBuilder);
                x7gVar = new x7g(R.attr.vk_ui_text_contrast);
                tlo0.h hVar2 = new tlo0.h(bVar.b);
                boolean z = expansionState == expansionState2;
                config.getClass();
                clipDescription.setConfig(new ClipDescription.a(hVar, x7gVar, hVar2, nh3Var, z));
                this.f = bVar;
            }
        } else {
            if (!(descriptionViewState instanceof DescriptionViewState.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(clipDescription);
            d3m.e(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        this.g = descriptionViewState;
    }
}
