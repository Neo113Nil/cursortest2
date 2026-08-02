package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.sofascore.model.mvvm.model.Event;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class v11 extends p8 {
    public final View c;
    public final String d;
    public final ed e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v11(View view, View view2, String str) {
        super(view);
        view.getClass();
        view2.getClass();
        str.getClass();
        this.c = view2;
        this.d = str;
        this.e = ed.a(view);
        this.f = -1;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        this.f = i;
        if (Intrinsics.c(this.d, "buzzer_feed")) {
            e(obj);
        } else {
            f(obj);
        }
        d(obj);
    }

    public abstract void d(Object obj);

    public abstract void e(Object obj);

    public abstract void f(Object obj);

    public abstract void g(Context context, Object obj);

    public final void h(Context context, Object obj) {
        context.getClass();
        if (!(obj instanceof APIBuzzerTile)) {
            if (!(obj instanceof o82)) {
                g(context, obj);
                return;
            } else {
                nv.r(context, "SHOW_MORE", null, this.d, this.f + 1, null, null, null);
                g(context, obj);
                return;
            }
        }
        APIBuzzerTile aPIBuzzerTile = (APIBuzzerTile) obj;
        j82 j82Var = (j82) CollectionsKt.a0(aPIBuzzerTile.getAction(), j82.b);
        String str = null;
        String name = j82Var != null ? j82Var.name() : null;
        Integer z = yso.z(aPIBuzzerTile);
        int i = this.f + 1;
        String reason = aPIBuzzerTile.getReason();
        Event event = aPIBuzzerTile.getEvent();
        if (event != null && !Intrinsics.c(aPIBuzzerTile.getReason(), BuzzerConfigResponseKt.SURPRISE_EVENT_RESULT)) {
            str = event.getStatus().getType();
        }
        nv.r(context, name, z, this.d, i, reason, str, Integer.valueOf(aPIBuzzerTile.getId()));
        int parseInt = Integer.parseInt(iii.H(6, "260720003"));
        Integer androidMinVersion = aPIBuzzerTile.getAndroidMinVersion();
        int intValue = androidMinVersion != null ? androidMinVersion.intValue() : 0;
        if (!y82.d.contains(Integer.valueOf(aPIBuzzerTile.getAction())) || parseInt < intValue) {
            bea.G(context, "https://play.google.com/store/apps/details?id=com.sofascore.results");
        } else {
            g(context, obj);
        }
    }
}
