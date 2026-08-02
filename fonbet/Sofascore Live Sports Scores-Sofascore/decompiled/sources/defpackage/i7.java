package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class i7 extends o8 {
    public final esk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(Context context) {
        super(context, null, 0);
        context.getClass();
        esk a = esk.a(getRoot());
        this.d = a;
        a.b.setContent(new tc3(-262175276, new h7(this, 0), true));
    }

    @NotNull
    public final esk getBinding() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_compose_view;
    }

    public abstract void j(int i, of3 of3Var);
}
