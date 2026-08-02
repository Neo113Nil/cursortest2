package com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.TitleViewState;
import com.vkontakte.android.R;
import xsna.alb0;
import xsna.bap;
import xsna.d370;
import xsna.f8s;
import xsna.fqd;
import xsna.fuh0;
import xsna.g8s;
import xsna.gzs;
import xsna.ir;
import xsna.izs;
import xsna.nvu0;
import xsna.or;
import xsna.p21;
import xsna.prd0;
import xsna.q630;
import xsna.qq0;
import xsna.s2x;
import xsna.sa30;
import xsna.sg50;
import xsna.szo0;
import xsna.tho0;
import xsna.u2x;
import xsna.vr9;
import xsna.wh50;
import xsna.wzs;
import xsna.zq;

/* compiled from: Title.kt */
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: Title.kt */
    /* renamed from: com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2002a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TitleViewState.ErrorType.values().length];
            try {
                iArr[TitleViewState.ErrorType.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TitleViewState.ErrorType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(TitleViewState titleViewState, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        vr9 vr9Var;
        int i2;
        int i3;
        int i4;
        String str = titleViewState.a;
        TitleViewState.ErrorType errorType = titleViewState.b;
        androidx.compose.runtime.a M = aVar.M(2067192748);
        int i5 = i | (M.J(titleViewState) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (b.d()) {
                b.f(2067192748, i5, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.Title (Title.kt:28)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            wh50 j = sa30.j(sg50Var, M, 6);
            Boolean bool = (Boolean) j.getValue();
            bool.booleanValue();
            int i6 = i5 & 112;
            boolean J = (i6 == 32) | M.J(j);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new szo0(null, izsVar, j);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = or.a(str, 0L, 6, M);
            }
            wh50 wh50Var = (wh50) x3;
            Object a = tho0.a((tho0) wh50Var.getValue(), str);
            boolean J2 = M.J(a);
            Object x4 = M.x();
            if (J2 || x4 == obj) {
                x4 = new fqd(15, a, wh50Var);
                M.R(x4);
            }
            bap.i((gzs) x4, M, 0);
            Object N = d370.N(R.string.setting_name_placeholder_talkback, 0, M);
            tho0 tho0Var = (tho0) wh50Var.getValue();
            boolean J3 = (i6 == 32) | M.J(a);
            Object x5 = M.x();
            if (J3 || x5 == obj) {
                x5 = new p21(a, izsVar, wh50Var, 3);
                M.R(x5);
            }
            izs izsVar2 = (izs) x5;
            String N2 = d370.N(R.string.setting_name_placeholder, 0, M);
            boolean J4 = M.J(a) | M.J(N);
            Object x6 = M.x();
            if (J4 || x6 == obj) {
                x6 = new prd0(5, a, N);
                M.R(x6);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, izsVar2, N2, 0L, 0L, null, null, sg50Var, null, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), M, 0, 196614, 15352), errorType != null ? InputSelect$State.Error : InputSelect$State.Default, false, null, M, 24576, 12);
            if (errorType != null) {
                M.K(-1795001095);
                int i7 = C2002a.$EnumSwitchMapping$0[errorType.ordinal()];
                if (i7 == 1) {
                    i2 = 0;
                    i3 = -1794889743;
                    i4 = R.string.setting_name_error_too_short;
                } else {
                    if (i7 != 2) {
                        throw alb0.c(-1997564378, M);
                    }
                    i3 = -1794735022;
                    i4 = R.string.setting_name_error_too_long;
                    i2 = 0;
                }
                String a3 = zq.a(M, i3, i4, M, i2);
                FormField$Style formField$Style = FormField$Style.Error;
                Object x7 = M.x();
                if (x7 == obj) {
                    x7 = new fuh0(5);
                    M.R(x7);
                }
                vr9Var = f8s.a.a(a3, formField$Style, com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3), M, 3120, 0);
                M.j();
            } else {
                M.K(-1794412870);
                M.j();
                vr9Var = null;
            }
            aVar2 = M;
            nvu0.a(a2, q630Var, null, null, vr9Var, aVar2, (i5 >> 3) & 112, 12);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new qq0(i, 9, titleViewState, izsVar, q630Var);
        }
    }
}
