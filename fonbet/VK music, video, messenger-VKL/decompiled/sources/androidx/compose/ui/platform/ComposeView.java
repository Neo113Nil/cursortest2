package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import kotlin.jvm.internal.Lambda;
import xsna.ne7;
import xsna.s3q0;
import xsna.td;
import xsna.wh50;
import xsna.wzs;
import xsna.zak0;

/* compiled from: ComposeView.android.kt */
/* loaded from: classes11.dex */
public final class ComposeView extends td {
    public static final /* synthetic */ int n = 0;
    public final wh50<wzs<androidx.compose.runtime.a, Integer, s3q0>> l;
    public boolean m;

    /* compiled from: ComposeView.android.kt */
    public static final class a extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            ComposeView.this.o(ne7.I(this.$$changed | 1), aVar);
            return s3q0.a;
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // xsna.td
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m;
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(420213850);
        if ((i & 6) == 0) {
            i2 = (M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(420213850, i2, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:619)");
            }
            wzs wzsVar = (wzs) ((zak0) this.l).getValue();
            if (wzsVar == null) {
                M.K(-1238823553);
            } else {
                M.K(98585282);
                wzsVar.invoke(M, 0);
            }
            M.j();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new a(i);
        }
    }

    public final void setContent(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        this.m = true;
        ((zak0) this.l).setValue(wzsVar);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            r();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.l = k.b(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
