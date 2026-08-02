package com.vk.music.ui.subscription;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.data.Subscription;
import com.vk.movika.sdk.base.flow.binding.j;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.f0;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.NetError;
import xsna.at8;
import xsna.bap;
import xsna.bhu0;
import xsna.c6;
import xsna.cp8;
import xsna.fz7;
import xsna.g6;
import xsna.gzs;
import xsna.izs;
import xsna.k840;
import xsna.kai;
import xsna.kgn;
import xsna.m2e0;
import xsna.mh4;
import xsna.q630;
import xsna.qr8;
import xsna.rk6;
import xsna.ryw;
import xsna.s3q0;
import xsna.se0;
import xsna.txj0;
import xsna.u890;
import xsna.wh50;
import xsna.x76;
import xsna.ys8;
import xsna.zs8;

/* compiled from: BuyMusicSubscriptionComposeButton.kt */
/* loaded from: classes3.dex */
public final class BuyMusicSubscriptionComposeButtonKt {

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ ys8 a;

        public a(ys8 ys8Var) {
            this.a = ys8Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.release();
        }
    }

    /* compiled from: Effects.kt */
    public static final class b implements kgn {
        public final /* synthetic */ Context a;
        public final /* synthetic */ BuyMusicSubscriptionComposeButtonKt$NetworkStatusListener$1$1$receiver$1 b;

        public b(Context context, BuyMusicSubscriptionComposeButtonKt$NetworkStatusListener$1$1$receiver$1 buyMusicSubscriptionComposeButtonKt$NetworkStatusListener$1$1$receiver$1) {
            this.a = context;
            this.b = buyMusicSubscriptionComposeButtonKt$NetworkStatusListener$1$1$receiver$1;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.unregisterReceiver(this.b);
        }
    }

    /* compiled from: BuyMusicSubscriptionComposeButton.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionContext.values().length];
            try {
                iArr[SubscriptionContext.Paywall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionContext.Screen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, qr8 qr8Var, rk6 rk6Var, ys8 ys8Var, SubscriptionContext subscriptionContext, izs<? super Subscription, s3q0> izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        qr8 qr8Var2;
        int i4;
        int i5;
        rk6 rk6Var2;
        int i6;
        ys8 ys8Var2;
        int i7;
        int i8;
        int i9;
        q630 q630Var3;
        qr8 qr8Var3;
        rk6 rk6Var3;
        ys8 ys8Var3;
        SubscriptionContext subscriptionContext2;
        f s;
        q630 q630Var4;
        qr8 qr8Var4;
        SubscriptionContext subscriptionContext3;
        int i10;
        int i11;
        gzs gzsVar;
        q630 j;
        q630 q630Var5;
        a.C0011a.C0012a c0012a;
        SubscriptionContext subscriptionContext4;
        int i12;
        boolean z;
        q630 j2;
        androidx.compose.runtime.a M = aVar.M(1356858434);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            qr8Var2 = qr8Var;
            if (M.J(qr8Var2)) {
                i4 = 32;
                int i14 = i3 | i4;
                i5 = i2 & 4;
                if (i5 == 0) {
                    i6 = i14 | 384;
                    rk6Var2 = rk6Var;
                } else {
                    rk6Var2 = rk6Var;
                    i6 = i14 | (M.J(rk6Var2) ? 256 : 128);
                }
                if ((i2 & 8) != 0) {
                    ys8Var2 = ys8Var;
                    if (M.y(ys8Var2)) {
                        i7 = 2048;
                        int i15 = i6 | i7;
                        i8 = i2 & 16;
                        if (i8 != 0) {
                            i15 |= 24576;
                        } else if ((i & 24576) == 0) {
                            i15 |= M.o(subscriptionContext == null ? -1 : subscriptionContext.ordinal()) ? 16384 : 8192;
                        }
                        i9 = i15 | (M.y(izsVar) ? 131072 : 65536);
                        if (M.t(i9 & 1, (74899 & i9) != 74898)) {
                            M.V();
                            int i16 = i & 1;
                            a.C0011a.C0012a c0012a2 = a.C0011a.a;
                            if (i16 == 0 || M.i()) {
                                q630Var4 = i13 != 0 ? q630.a.a : q630Var2;
                                if ((i2 & 2) != 0) {
                                    Object x = M.x();
                                    if (x == c0012a2) {
                                        x = k.b("");
                                        M.R(x);
                                    }
                                    wh50 wh50Var = (wh50) x;
                                    Object x2 = M.x();
                                    if (x2 == c0012a2) {
                                        x2 = k.b("");
                                        M.R(x2);
                                    }
                                    wh50 wh50Var2 = (wh50) x2;
                                    Object x3 = M.x();
                                    if (x3 == c0012a2) {
                                        x3 = k.b(Boolean.FALSE);
                                        M.R(x3);
                                    }
                                    wh50 wh50Var3 = (wh50) x3;
                                    Object x4 = M.x();
                                    if (x4 == c0012a2) {
                                        x4 = k.b(Boolean.TRUE);
                                        M.R(x4);
                                    }
                                    wh50 wh50Var4 = (wh50) x4;
                                    Object x5 = M.x();
                                    if (x5 == c0012a2) {
                                        x5 = k.b(Boolean.FALSE);
                                        M.R(x5);
                                    }
                                    wh50 wh50Var5 = (wh50) x5;
                                    Object x6 = M.x();
                                    if (x6 == c0012a2) {
                                        x6 = k.b(Boolean.TRUE);
                                        M.R(x6);
                                    }
                                    qr8Var4 = new qr8(wh50Var, wh50Var2, wh50Var3, wh50Var4, wh50Var5, (wh50) x6);
                                    i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                } else {
                                    qr8Var4 = qr8Var2;
                                }
                                if (i5 != 0) {
                                    Object x7 = M.x();
                                    if (x7 == c0012a2) {
                                        x7 = new rk6();
                                        M.R(x7);
                                    }
                                    rk6Var2 = (rk6) x7;
                                }
                                if ((i2 & 8) != 0) {
                                    Object x8 = M.x();
                                    if (x8 == c0012a2) {
                                        ryw rywVar = k840.a.b;
                                        if (rywVar == null) {
                                            rywVar = null;
                                        }
                                        x8 = (ys8) rywVar.invoke(Boolean.FALSE);
                                        M.R(x8);
                                    }
                                    i9 &= -7169;
                                    ys8Var2 = (ys8) x8;
                                }
                                subscriptionContext3 = i8 != 0 ? SubscriptionContext.Paywall : subscriptionContext;
                                i10 = i9;
                                rk6Var3 = rk6Var2;
                                ys8Var3 = ys8Var2;
                                qr8Var2 = qr8Var4;
                            } else {
                                M.h();
                                if ((i2 & 2) != 0) {
                                    i9 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                                }
                                if ((i2 & 8) != 0) {
                                    i9 &= -7169;
                                }
                                subscriptionContext3 = subscriptionContext;
                                q630Var4 = q630Var2;
                                i10 = i9;
                                rk6Var3 = rk6Var2;
                                ys8Var3 = ys8Var2;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1356858434, i10, -1, "com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButton (BuyMusicSubscriptionComposeButton.kt:66)");
                            }
                            int i17 = (i10 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-265823983, i17, -1, "com.vk.music.ui.subscription.rememberPriceListener (BuyMusicSubscriptionComposeButton.kt:274)");
                            }
                            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                            Object x9 = M.x();
                            if (x9 == c0012a2) {
                                x9 = new at8(rk6Var3, qr8Var2, context);
                                M.R(x9);
                            }
                            at8 at8Var = (at8) x9;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            boolean y = M.y(ys8Var3) | M.y(at8Var);
                            Object x10 = M.x();
                            if (y || x10 == c0012a2) {
                                x10 = new f0(6, ys8Var3, at8Var);
                                M.R(x10);
                            }
                            b((gzs) x10, M, 0);
                            wh50<Boolean> wh50Var6 = qr8Var2.f;
                            wh50<Boolean> wh50Var7 = qr8Var2.e;
                            if (wh50Var6.getValue().booleanValue()) {
                                M.K(-2061604575);
                                int[] iArr = c.$EnumSwitchMapping$0;
                                int i18 = iArr[subscriptionContext3.ordinal()];
                                if (i18 != 1) {
                                    i12 = 2;
                                    if (i18 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z = false;
                                } else {
                                    i12 = 2;
                                    z = true;
                                }
                                int i19 = iArr[subscriptionContext3.ordinal()];
                                if (i19 == 1) {
                                    j2 = txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 44, 1, q630Var4);
                                } else {
                                    if (i19 != i12) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j2 = q630Var4;
                                }
                                ButtonSize buttonSize = ButtonSize.Large;
                                ButtonStyle buttonStyle = ButtonStyle.Primary;
                                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                                i11 = i10;
                                m2e0 a2 = cp8.c.a.a(null, null, null, M, 24576, 15);
                                Object x11 = M.x();
                                if (x11 == c0012a2) {
                                    x11 = new se0(3);
                                    M.R(x11);
                                }
                                q630 q630Var6 = j2;
                                c0012a = c0012a2;
                                bhu0.d((gzs) x11, buttonStyle, buttonAppearance, q630Var6, buttonSize, null, null, a2, z, null, M, 25014, 3424);
                                M = M;
                                M.j();
                                q630Var5 = q630Var4;
                                subscriptionContext4 = subscriptionContext3;
                            } else {
                                i11 = i10;
                                SubscriptionContext subscriptionContext5 = subscriptionContext3;
                                M.K(-2060958535);
                                if (wh50Var7.getValue().booleanValue()) {
                                    M.K(-2060946631);
                                    boolean y2 = M.y(ys8Var3) | ((i11 & 458752) == 131072);
                                    Object x12 = M.x();
                                    if (y2 || x12 == c0012a2) {
                                        x12 = new j(3, ys8Var3, izsVar);
                                        M.R(x12);
                                    }
                                    gzsVar = (gzs) x12;
                                    M.j();
                                } else {
                                    M.K(-2060871394);
                                    Object x13 = M.x();
                                    if (x13 == c0012a2) {
                                        x13 = new c6(3);
                                        M.R(x13);
                                    }
                                    gzsVar = (gzs) x13;
                                    M.j();
                                }
                                int[] iArr2 = c.$EnumSwitchMapping$0;
                                int i20 = iArr2[subscriptionContext5.ordinal()];
                                if (i20 == 1) {
                                    j = txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 44, 1, q630Var4);
                                } else {
                                    if (i20 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j = q630Var4;
                                }
                                ButtonSize buttonSize2 = ButtonSize.Large;
                                ButtonStyle buttonStyle2 = ButtonStyle.Primary;
                                ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                                q630Var5 = q630Var4;
                                q630 q630Var7 = j;
                                float f = (float) 3.5d;
                                float f2 = 12;
                                gzs gzsVar2 = gzsVar;
                                u890 u890Var = new u890(f2, f, f2, f);
                                int i21 = iArr2[subscriptionContext5.ordinal()];
                                boolean z2 = true;
                                if (i21 != 1) {
                                    if (i21 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z2 = wh50Var7.getValue().booleanValue();
                                }
                                c0012a = c0012a2;
                                subscriptionContext4 = subscriptionContext5;
                                bhu0.c(gzsVar2, buttonSize2, buttonStyle2, buttonAppearance2, q630Var7, null, u890Var, z2, null, null, null, false, kai.c(-6402503, new fz7(1, subscriptionContext5, qr8Var2), M), M, X2.b.f, 384, 3872);
                                M = M;
                                M.j();
                            }
                            boolean y3 = M.y(ys8Var3) | M.y(at8Var);
                            Object x14 = M.x();
                            if (y3 || x14 == c0012a) {
                                x14 = new mh4(4, ys8Var3, at8Var);
                                M.R(x14);
                            }
                            bap.c(ys8Var3, (izs) x14, M, (i11 >> 9) & 14);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            qr8Var3 = qr8Var2;
                            subscriptionContext2 = subscriptionContext4;
                            q630Var3 = q630Var5;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            qr8Var3 = qr8Var2;
                            rk6Var3 = rk6Var2;
                            ys8Var3 = ys8Var2;
                            subscriptionContext2 = subscriptionContext;
                        }
                        s = M.s();
                        if (s != null) {
                            s.d = new zs8(q630Var3, qr8Var3, rk6Var3, ys8Var3, subscriptionContext2, izsVar, i, i2);
                            return;
                        }
                        return;
                    }
                } else {
                    ys8Var2 = ys8Var;
                }
                i7 = 1024;
                int i152 = i6 | i7;
                i8 = i2 & 16;
                if (i8 != 0) {
                }
                i9 = i152 | (M.y(izsVar) ? 131072 : 65536);
                if (M.t(i9 & 1, (74899 & i9) != 74898)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
        } else {
            qr8Var2 = qr8Var;
        }
        i4 = 16;
        int i142 = i3 | i4;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        i7 = 1024;
        int i1522 = i6 | i7;
        i8 = i2 & 16;
        if (i8 != 0) {
        }
        i9 = i1522 | (M.y(izsVar) ? 131072 : 65536);
        if (M.t(i9 & 1, (74899 & i9) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void b(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1416239212);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1416239212, i2, -1, "com.vk.music.ui.subscription.NetworkStatusListener (BuyMusicSubscriptionComposeButton.kt:288)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            s3q0 s3q0Var = s3q0.a;
            boolean y = M.y(context) | ((i2 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new g6(2, context, gzsVar);
                M.R(x);
            }
            bap.c(s3q0Var, (izs) x, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new x76(gzsVar, i, 1);
        }
    }
}
