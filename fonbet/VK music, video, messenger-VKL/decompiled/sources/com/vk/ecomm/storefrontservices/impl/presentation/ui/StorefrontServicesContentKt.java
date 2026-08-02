package com.vk.ecomm.storefrontservices.impl.presentation.ui;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.gl.tf.Tensorflow;
import xsna.bap;
import xsna.bbk0;
import xsna.dge0;
import xsna.e3;
import xsna.fnj;
import xsna.gzs;
import xsna.hr80;
import xsna.iah0;
import xsna.ir1;
import xsna.izs;
import xsna.kai;
import xsna.kol0;
import xsna.ksr;
import xsna.mtk0;
import xsna.nsi0;
import xsna.px;
import xsna.q630;
import xsna.rg50;
import xsna.rrv0;
import xsna.s3q0;
import xsna.txj0;
import xsna.wml0;
import xsna.wzs;
import xsna.x550;
import xsna.xol0;
import xsna.xvy;
import xsna.ylu0;
import xsna.yol0;
import xsna.yzs;
import xsna.zol0;
import xsna.zvy;

/* compiled from: StorefrontServicesContent.kt */
/* loaded from: classes18.dex */
public final class StorefrontServicesContentKt {
    public static final void a(final izs<? super wml0, s3q0> izsVar, final zol0.a.d dVar, a aVar, int i) {
        a aVar2;
        ir1 ir1Var;
        rg50 rg50Var;
        LoadingState loadingState = dVar.c;
        a M = aVar.M(-594016305);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(dVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-594016305, i2, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContent (StorefrontServicesContent.kt:29)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            final boolean d = fnj.d(context);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = i.a(0);
                M.R(x);
            }
            rg50 rg50Var2 = (rg50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = bbk0.b(new x550(rg50Var2, 25));
                M.R(x2);
            }
            final mtk0 mtk0Var = (mtk0) x2;
            int i3 = i2 & 14;
            int i4 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (b.d()) {
                b.f(778399252, i4, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.rememberLazyStateWithPagination (StorefrontServicesUtils.kt:30)");
            }
            M.K(717380214);
            final xvy a = zvy.a(0, 3, M);
            nsi0 nsi0Var = dVar.b;
            yol0.a(a, izsVar, ((nsi0Var != null && nsi0Var.b) || ((ir1Var = dVar.a) != null && ir1Var.e)) && (loadingState != LoadingState.Page), M, (i4 << 3) & 7280);
            M.j();
            if (b.d()) {
                b.e();
            }
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = i.a(0);
                M.R(x3);
            }
            final rg50 rg50Var3 = (rg50) x3;
            if (b.d()) {
                b.f(-579879675, 54, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.rememberNestedScrollConnection (StorefrontServicesUtils.kt:93)");
            }
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = new xol0(rg50Var2, rg50Var3);
                M.R(x4);
            }
            final xol0 xol0Var = (xol0) x4;
            if (b.d()) {
                b.e();
            }
            ksr ksrVar = (ksr) M.r(kol0.a);
            boolean y = M.y(ksrVar) | M.J(a);
            Object x5 = M.x();
            if (y || x5 == obj) {
                x5 = new StorefrontServicesContentKt$StorefrontServicesContent$1$1(ksrVar, a, null);
                M.R(x5);
            }
            bap.g(ksrVar, (wzs) x5, M, 0);
            boolean z = loadingState == LoadingState.Refresh;
            boolean z2 = i3 == 4;
            Object x6 = M.x();
            if (z2 || x6 == obj) {
                x6 = new px(izsVar, 5);
                M.R(x6);
            }
            gzs gzsVar = (gzs) x6;
            q630 d2 = txj0.d(q630.a.a, 1.0f);
            if (b.d()) {
                rg50Var = rg50Var2;
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                rg50Var = rg50Var2;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            final rg50 rg50Var4 = rg50Var;
            aVar2 = M;
            dge0.a(z, gzsVar, hr80.m(d2, ylu0Var.getBackground().a, e.a), null, null, kai.c(-212081859, new yzs() { // from class: xsna.hnl0
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    qa8 qa8Var = (qa8) obj2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(qa8Var) ? 4 : 2;
                    }
                    int i5 = intValue;
                    if (aVar3.t(i5 & 1, (i5 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-212081859, i5, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContent.<anonymous> (StorefrontServicesContent.kt:53)");
                        }
                        q630 t = n34.t(txj0.d(ahn.E(q630.a.a, "storefront_content_services_list"), 1.0f), xol0Var, null);
                        u890 n = ((Boolean) mtk0Var.getValue()).booleanValue() ? s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 52, 7) : s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7);
                        final zol0.a.d dVar2 = dVar;
                        boolean J = aVar3.J(dVar2);
                        final izs izsVar2 = izsVar;
                        boolean J2 = J | aVar3.J(izsVar2);
                        final boolean z3 = d;
                        boolean l = J2 | aVar3.l(z3);
                        final xvy xvyVar = a;
                        boolean J3 = l | aVar3.J(xvyVar);
                        Object x7 = aVar3.x();
                        if (J3 || x7 == a.C0011a.a) {
                            x7 = new izs() { // from class: xsna.inl0
                                @Override // xsna.izs
                                public final Object invoke(Object obj5) {
                                    boolean z4;
                                    nvy nvyVar = (nvy) obj5;
                                    zol0.a.d dVar3 = zol0.a.d.this;
                                    ir1 ir1Var2 = dVar3.a;
                                    izs izsVar3 = izsVar2;
                                    boolean z5 = z3;
                                    if (ir1Var2 != null) {
                                        co1.c(nvyVar, ir1Var2, izsVar3, z5);
                                    }
                                    nsi0 nsi0Var2 = dVar3.b;
                                    if (nsi0Var2 != null) {
                                        List list = nsi0Var2.a;
                                        boolean z6 = false;
                                        if (nsi0Var2.c && dVar3.f) {
                                            z4 = false;
                                            z6 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (dVar3.a != null) {
                                            z4 = true;
                                        }
                                        csi0.e(nvyVar, new wow(list), z5, z4, z6, xvyVar, izsVar3);
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar3.R(x7);
                        }
                        lqy.a(t, xvyVar, n, null, null, null, false, null, (izs) x7, aVar3, 0, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                        if (dVar2.e && dVar2.d) {
                            aVar3.K(-232556021);
                            doi0.b(qa8Var, rg50Var4, rg50Var3, izsVar2, aVar3, (i5 & 14) | Tensorflow.FRAME_WIDTH);
                        } else {
                            aVar3.K(-236227227);
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 196608, 24);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new e3(izsVar, dVar, i);
        }
    }
}
