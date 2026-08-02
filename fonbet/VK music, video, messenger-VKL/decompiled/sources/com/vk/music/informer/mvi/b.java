package com.vk.music.informer.mvi;

import com.unity3d.services.UnityAdsConstants;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import com.vk.music.player.api.BottomPlayerAppearance;
import xsna.alb0;
import xsna.eet;
import xsna.fau0;
import xsna.izs;
import xsna.q630;
import xsna.q750;
import xsna.s200;

/* compiled from: MusicPlayerInformerContentView.kt */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: MusicPlayerInformerContentView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomPlayerAppearance.values().length];
            try {
                iArr[BottomPlayerAppearance.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomPlayerAppearance.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(izs izsVar, BottomPlayerAppearance bottomPlayerAppearance, MusicPlayerInformerViewState.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(-459696494);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.o(bottomPlayerAppearance.ordinal()) ? 32 : 16) | (M.J(aVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-459696494, i2, -1, "com.vk.music.informer.mvi.InformerContainer (MusicPlayerInformerContentView.kt:97)");
            }
            int i3 = a.$EnumSwitchMapping$0[bottomPlayerAppearance.ordinal()];
            q630.a aVar3 = q630.a.a;
            if (i3 == 1) {
                M.K(1832755450);
                fau0.b(izsVar, aVar, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, ((i2 >> 3) & 112) | (i2 & 14));
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(613308364, M);
                }
                M.K(613316573);
                q750.a(izsVar, aVar, M, (i2 & 14) | ((i2 >> 3) & 112) | 384);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new eet(izsVar, bottomPlayerAppearance, aVar, q630Var2, i);
        }
    }
}
