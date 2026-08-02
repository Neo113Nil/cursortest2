package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class roc extends b6 {
    public final eoc e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roc(View view, boolean z, Function1 function1) {
        super(view, z, function1);
        view.getClass();
        eoc a = eoc.a(view);
        this.e = a;
        this.f = a.h;
        this.g = a.c;
        this.h = a.d;
        this.i = a.g;
        this.j = a.f;
        this.k = a.e;
    }

    @Override // defpackage.b6
    public final krk d() {
        return this.e;
    }

    @Override // defpackage.b6
    public final ImageView e() {
        return this.h;
    }

    @Override // defpackage.b6
    public final TextView f() {
        return this.g;
    }

    @Override // defpackage.b6
    public final TextView g() {
        return this.k;
    }

    @Override // defpackage.b6
    public final TextView h() {
        return this.j;
    }

    @Override // defpackage.b6
    public final TextView i() {
        return this.i;
    }

    @Override // defpackage.b6
    public final TextView j() {
        return this.f;
    }
}
