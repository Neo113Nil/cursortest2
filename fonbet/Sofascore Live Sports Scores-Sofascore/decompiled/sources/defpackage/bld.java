package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bld extends o8 {
    public final mqi d;
    public boolean e;
    public Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bld(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = ypa.b(new xxb(this, 17));
        this.f = new ivc(27);
        getBinding().b.setClipToOutline(true);
    }

    @NotNull
    public final cld getBinding() {
        return (cld) this.d.getValue();
    }

    @NotNull
    public final Function0<Unit> getCallback() {
        return this.f;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.odds_button;
    }

    public final void setCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f = function0;
    }
}
