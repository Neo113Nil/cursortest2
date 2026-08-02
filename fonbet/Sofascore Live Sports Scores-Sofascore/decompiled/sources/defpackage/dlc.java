package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dlc extends b6 {
    public final z82 e;
    public final TextView f;
    public final ImageView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlc(View view, boolean z, Function1 function1) {
        super(view, z, function1);
        view.getClass();
        z82 d = z82.d(view);
        this.e = d;
        this.f = (TextView) d.d;
        this.g = (ImageView) d.e;
        this.h = (TextView) d.g;
        this.i = (TextView) d.c;
        this.j = (TextView) d.f;
    }

    @Override // defpackage.b6
    public final krk d() {
        return this.e;
    }

    @Override // defpackage.b6
    public final ImageView e() {
        return this.g;
    }

    @Override // defpackage.b6
    public final TextView f() {
        return this.f;
    }

    @Override // defpackage.b6
    public final TextView g() {
        return this.j;
    }

    @Override // defpackage.b6
    public final TextView h() {
        return this.i;
    }

    @Override // defpackage.b6
    public final TextView i() {
        return this.h;
    }

    @Override // defpackage.b6
    public final TextView j() {
        return null;
    }
}
