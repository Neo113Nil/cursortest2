package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oq8 implements wwj {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public oq8(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.wwj
    public final void e(xwj xwjVar) {
        xwjVar.A(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.wwj
    public final void f(xwj xwjVar) {
        xwjVar.A(this);
        xwjVar.a(this);
    }

    @Override // defpackage.wwj
    public final void a() {
    }

    @Override // defpackage.wwj
    public final void c() {
    }

    @Override // defpackage.wwj
    public final void d(xwj xwjVar) {
    }
}
