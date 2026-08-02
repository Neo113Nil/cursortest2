package com.vk.catalog.mvi.block.music.impl.ui;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.gl.tf.Tensorflow;
import xsna.alb0;
import xsna.b0e;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.hr80;
import xsna.ir;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.kbe;
import xsna.l5g;
import xsna.lg90;
import xsna.mku0;
import xsna.n34;
import xsna.ojc;
import xsna.pzu0;
import xsna.q630;
import xsna.qer0;
import xsna.qri;
import xsna.qzu0;
import xsna.rte0;
import xsna.sg50;
import xsna.sy90;
import xsna.txj0;
import xsna.uog0;
import xsna.vog0;
import xsna.wzs;

/* compiled from: PlayPauseButton.kt */
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: PlayPauseButton.kt */
    /* renamed from: com.vk.catalog.mvi.block.music.impl.ui.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0456a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayingState.values().length];
            try {
                iArr[PlayingState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayingState.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayingState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayingState.BUFFERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final PlayPauseButtonState playPauseButtonState, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final q630 q630Var2;
        f s;
        int i3;
        lg90 d1;
        PlayingState playingState = playPauseButtonState.a;
        PlayPauseButtonState.Size size = playPauseButtonState.b;
        androidx.compose.runtime.a M = aVar.M(-304319371);
        int i4 = (M.J(playPauseButtonState) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i4 & 1, (i4 & 19) == 18)) {
                M.h();
            } else {
                q630.a aVar2 = q630.a.a;
                q630 q630Var3 = i5 != 0 ? aVar2 : q630Var2;
                if (b.d()) {
                    b.f(-304319371, i4, -1, "com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButton (PlayPauseButton.kt:30)");
                }
                PlayingState playingState2 = PlayingState.PLAYING;
                String N = d370.N(playingState == playingState2 ? R.string.music_talkback_play : R.string.music_talkback_pause, 0, M);
                boolean J = M.J(N);
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (J || x == obj) {
                    x = new b0e(N, 1);
                    M.R(x);
                }
                q630 b = com.vk.core.compose.component.semantics.b.b(q630Var3, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3));
                uog0 uog0Var = vog0.a;
                q630 m = hr80.m(txj0.q(rte0.d(b, uog0Var), size.i()), l5g.d, uog0Var);
                kbe kbeVar = playPauseButtonState.a().c;
                Object x2 = M.x();
                if (x2 == obj) {
                    x2 = ir.h(M);
                }
                sg50 sg50Var = (sg50) x2;
                int i6 = i4 & 14;
                if (b.d()) {
                    b.f(1953244401, i6, -1, "com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState.<get-rippleRadius> (PlayPauseButton.kt:101)");
                }
                float h = size.h() / 2;
                if (b.d()) {
                    b.e();
                }
                q630 b2 = ojc.b(m, sg50Var, qer0.a(h, 4, 0L, false), false, null, kbeVar, 28);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, b2);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                int i7 = C0456a.$EnumSwitchMapping$0[playingState.ordinal()];
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    M = M;
                    M.K(1652169601);
                    if (b.d()) {
                        b.f(905879777, i6, -1, "com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState.<get-iconSize> (PlayPauseButton.kt:108)");
                    }
                    int i8 = PlayPauseButtonState.a.$EnumSwitchMapping$0[size.ordinal()];
                    if (i8 == 1) {
                        i3 = 24;
                    } else {
                        if (i8 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 32;
                    }
                    float f = i3;
                    if (b.d()) {
                        b.e();
                    }
                    q630 q = txj0.q(aVar2, f);
                    if (playingState == playingState2) {
                        M.K(1652297352);
                        if (b.d()) {
                            b.f(1800986304, i6, -1, "com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState.<get-pauseIcon> (PlayPauseButton.kt:98)");
                        }
                        qzu0.a.getClass();
                        d1 = qzu0.V0(M);
                        if (b.d()) {
                            b.e();
                        }
                        M.j();
                    } else {
                        M.K(1652365769);
                        if (b.d()) {
                            b.f(561834910, i6, -1, "com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState.<get-playIcon> (PlayPauseButton.kt:94)");
                        }
                        qzu0.a.getClass();
                        d1 = qzu0.d1(M);
                        if (b.d()) {
                            b.e();
                        }
                        M.j();
                    }
                    pzu0.b(d1, null, q, l5g.b, M, 3128, 0);
                    M.j();
                } else {
                    if (i7 != 4) {
                        throw alb0.c(-500896963, M);
                    }
                    M.K(1652591573);
                    if (b.d()) {
                        b.f(-1426168375, i6, -1, "com.vk.catalog.mvi.block.music.impl.ui.PlayPauseButtonState.<get-progressSize> (PlayPauseButton.kt:104)");
                    }
                    float h2 = size.h() / 2;
                    if (b.d()) {
                        b.e();
                    }
                    M = M;
                    mku0.a(2, Tensorflow.FRAME_WIDTH, 8, l5g.b, M, txj0.q(aVar2, h2));
                    M.j();
                }
                M.G();
                if (b.d()) {
                    b.e();
                }
                q630Var2 = q630Var3;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.gva0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int I = ne7.I(i | 1);
                        com.vk.catalog.mvi.block.music.impl.ui.a.a(PlayPauseButtonState.this, q630Var2, (androidx.compose.runtime.a) obj2, I, i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i4 & 1, (i4 & 19) == 18)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
