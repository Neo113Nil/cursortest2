package com.vk.music.informer.mvi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.vk.common.links.LaunchContext;
import com.vk.music.di.StickyPlayerComponent;
import com.vk.music.informer.mvi.e;
import com.vk.music.informer.mvi.g;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.mvi.MviLazyViewContainer;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a2a;
import xsna.ao50;
import xsna.c550;
import xsna.drg;
import xsna.fju;
import xsna.km50;
import xsna.ln20;
import xsna.maz;
import xsna.mk50;
import xsna.msy;
import xsna.nwy;
import xsna.ny40;
import xsna.oel0;
import xsna.qcy;
import xsna.qdz;
import xsna.qww;
import xsna.s3q0;
import xsna.s6y;
import xsna.vk50;

/* compiled from: MusicPlayerInformerMviView.kt */
/* loaded from: classes3.dex */
public final class f extends MviLazyViewContainer<d, MusicPlayerInformerViewState, e> {
    public final Object g;
    public final Object h;
    public final Object i;
    public final j j;
    public com.vk.music.informer.mvi.a k;

    /* compiled from: MusicPlayerInformerMviView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParentBottomSheetState.values().length];
            try {
                iArr[ParentBottomSheetState.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParentBottomSheetState.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ParentBottomSheetState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(Context context) {
        super(context);
        ln20 ln20Var = new ln20(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, ln20Var);
        this.h = msy.a(lazyThreadSafetyMode, new drg(this, 29));
        this.i = msy.a(lazyThreadSafetyMode, new s6y(this, 12));
        this.j = new j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final qdz getLinksBridge() {
        return (qdz) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PlayerUIComponent getPlayerUiComponent() {
        return (PlayerUIComponent) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final StickyPlayerComponent getStickyPlayerComponent() {
        return (StickyPlayerComponent) this.h.getValue();
    }

    public static s3q0 k(f fVar, g gVar) {
        if (!(gVar instanceof g.a)) {
            throw new NoWhenBranchMatchedException();
        }
        g.a aVar = (g.a) gVar;
        if (aVar.a.length() != 0) {
            maz.c(fVar.getLinksBridge().e(), fVar.getContext(), aVar.a, LaunchContext.A, null, null, 24);
        }
        return s3q0.a;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        com.vk.music.informer.mvi.a aVar = new com.vk.music.informer.mvi.a(getViewOwner(), getContext(), getPlayerUiComponent().Ra().a);
        this.k = aVar;
        return new mk50.c(aVar.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        MusicPlayerInformerViewState musicPlayerInformerViewState = (MusicPlayerInformerViewState) ao50Var;
        com.vk.music.informer.mvi.a aVar = this.k;
        if (aVar != null) {
            aVar.f(musicPlayerInformerViewState, new a2a(1, this, f.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 10));
        }
    }

    @Override // com.vk.mvi.MviLazyViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((d) vk50Var).j.a(new fju(this, 12), getViewOwner());
    }

    public final void l(ParentBottomSheetState parentBottomSheetState) {
        int i;
        ComposeView composeView;
        int i2 = a.$EnumSwitchMapping$0[parentBottomSheetState.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = 0;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        com.vk.music.informer.mvi.a aVar = this.k;
        if (aVar != null && (composeView = aVar.d) != null) {
            composeView.setVisibility(i);
        }
        getFeature().C(new e.d(parentBottomSheetState == ParentBottomSheetState.COLLAPSED));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        e.b bVar = e.b.b;
        nwy nwyVar = getStickyPlayerComponent().a;
        qcy<Object>[] qcyVarArr = StickyPlayerComponent.c;
        qcy<Object> qcyVar = qcyVarArr[0];
        oel0 oel0Var = (oel0) nwyVar.c();
        c550 Ne = getPlayerUiComponent().Ne();
        qww O6 = getPlayerUiComponent().O6();
        nwy nwyVar2 = getStickyPlayerComponent().b;
        qcy<Object> qcyVar2 = qcyVarArr[1];
        return new d(bVar, this.j, oel0Var, Ne, O6, (ny40) nwyVar2.c());
    }
}
