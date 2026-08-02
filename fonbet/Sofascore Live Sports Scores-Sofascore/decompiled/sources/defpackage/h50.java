package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h50 extends xka implements Function0 {
    public final /* synthetic */ Context i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ a k;
    public final /* synthetic */ spg l;
    public final /* synthetic */ int m;
    public final /* synthetic */ View n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(Context context, Function1 function1, a aVar, spg spgVar, int i, View view) {
        super(0);
        this.i = context;
        this.j = function1;
        this.k = aVar;
        this.l = spgVar;
        this.m = i;
        this.n = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KeyEvent.Callback callback = this.n;
        callback.getClass();
        return new rsk(this.i, this.j, this.k, this.l, this.m, (ryd) callback).getLayoutNode();
    }
}
