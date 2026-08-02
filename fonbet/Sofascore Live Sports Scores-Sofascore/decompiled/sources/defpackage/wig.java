package defpackage;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wig extends LinearLayout {
    public Function0 a;
    public Function0 b;

    @Nullable
    public final Function0<Unit> getSendFeedbackButtonClickedHandler() {
        return this.a;
    }

    @Nullable
    public final Function0<Unit> getWhyThisAdButtonClickedHandler() {
        return this.b;
    }

    public final void setSendFeedbackButtonClickedHandler(@Nullable Function0<Unit> function0) {
        this.a = function0;
    }

    public final void setWhyThisAdButtonClickedHandler(@Nullable Function0<Unit> function0) {
        this.b = function0;
    }
}
