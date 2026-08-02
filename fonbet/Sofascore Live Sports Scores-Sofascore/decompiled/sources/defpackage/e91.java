package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e91 extends o8 {
    public Function0 d;

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.sofa_compose_view;
    }

    @Nullable
    public final Function0<Unit> getOnDismiss() {
        return this.d;
    }

    public final void setOnDismiss(@Nullable Function0<Unit> function0) {
        this.d = function0;
    }
}
