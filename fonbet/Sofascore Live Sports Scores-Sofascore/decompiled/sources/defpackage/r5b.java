package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r5b implements nje {
    public final View a;
    public final f4a b;
    public q5b e;
    public tbj f;
    public hsk g;
    public Rect l;
    public final l5b m;
    public Function1 c = new isa(24);
    public Function1 d = new isa(25);
    public wcj h = new wcj(4, pej.b, "");
    public qu9 i = qu9.g;
    public final ArrayList j = new ArrayList();
    public final joa k = ypa.a(ysa.c, new sr8(this, 25));

    public r5b(View view, g10 g10Var, f4a f4aVar) {
        this.a = view;
        this.b = f4aVar;
        this.m = new l5b(g10Var, f4aVar);
    }

    @Override // defpackage.nje
    public final InputConnection a(EditorInfo editorInfo) {
        wcj wcjVar = this.h;
        pd0.L(editorInfo, wcjVar.a.b, wcjVar.b, this.i);
        m5b m5bVar = n5b.a;
        if (cl5.d()) {
            cl5.a().i(editorInfo);
        }
        mqf mqfVar = new mqf(this.h, new bka(this, 1), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(mqfVar));
        return mqfVar;
    }
}
