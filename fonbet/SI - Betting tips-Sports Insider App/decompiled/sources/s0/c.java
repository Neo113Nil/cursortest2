package s0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22599a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final g f22600b;

    /* renamed from: c, reason: collision with root package name */
    public g0.d f22601c;

    /* renamed from: d, reason: collision with root package name */
    public g0.d f22602d;

    /* renamed from: e, reason: collision with root package name */
    public int f22603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22604f;

    public c(g gVar, ArrayList arrayList) {
        g0.d dVar = g0.d.f9675e;
        this.f22601c = dVar;
        this.f22602d = dVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = gVar.f22613b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            g0.d dVar2 = gVar.f22614c;
            g0.d dVar3 = gVar.f22615d;
            this.f22601c = dVar2;
            this.f22602d = dVar3;
            c();
            b(gVar.f22616e);
        }
        this.f22600b = gVar;
    }

    public final void a(List list, boolean z5) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            a aVar = (a) list.get(i5);
            aVar.getClass();
            if (true == z5) {
                c cVar = aVar.f22586e;
                if (cVar != null) {
                    throw new IllegalStateException(aVar + " is already controlled by " + cVar);
                }
                aVar.f22586e = this;
                this.f22599a.add(aVar);
            }
        }
    }

    public final void b(int i5) {
        ArrayList arrayList = this.f22599a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (!aVar.f22588g) {
                ColorDrawable colorDrawable = aVar.f22587f;
                if (aVar.f22589h != i5) {
                    aVar.f22589h = i5;
                    colorDrawable.setColor(i5);
                    b bVar = aVar.f22583b;
                    bVar.f22594e = colorDrawable;
                    io.sentry.util.network.b bVar2 = bVar.f22598i;
                    if (bVar2 != null) {
                        ((View) bVar2.f17177c).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i5;
        g0.d c2;
        ArrayList arrayList = this.f22599a;
        g0.d dVar = g0.d.f9675e;
        g0.d dVar2 = dVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            g0.d dVar3 = this.f22601c;
            g0.d dVar4 = this.f22602d;
            aVar.f22584c = dVar3;
            b bVar = aVar.f22583b;
            aVar.f22585d = dVar4;
            if (!bVar.f22592c.equals(dVar2)) {
                bVar.f22592c = dVar2;
                io.sentry.util.network.b bVar2 = bVar.f22598i;
                if (bVar2 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar2.f17176b;
                    layoutParams.leftMargin = dVar2.f9676a;
                    layoutParams.topMargin = dVar2.f9677b;
                    layoutParams.rightMargin = dVar2.f9678c;
                    layoutParams.bottomMargin = dVar2.f9679d;
                    ((View) bVar2.f17177c).setLayoutParams(layoutParams);
                }
            }
            int i10 = aVar.f22582a;
            if (i10 == 1) {
                i5 = aVar.f22584c.f9676a;
                int i11 = aVar.f22585d.f9676a;
                if (bVar.f22590a != i11) {
                    bVar.f22590a = i11;
                    io.sentry.util.network.b bVar3 = bVar.f22598i;
                    if (bVar3 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bVar3.f17176b;
                        layoutParams2.width = i11;
                        ((View) bVar3.f17177c).setLayoutParams(layoutParams2);
                    }
                }
                c2 = g0.d.c(i5, 0, 0, 0);
            } else if (i10 == 2) {
                i5 = aVar.f22584c.f9677b;
                int i12 = aVar.f22585d.f9677b;
                if (bVar.f22591b != i12) {
                    bVar.f22591b = i12;
                    io.sentry.util.network.b bVar4 = bVar.f22598i;
                    if (bVar4 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) bVar4.f17176b;
                        layoutParams3.height = i12;
                        ((View) bVar4.f17177c).setLayoutParams(layoutParams3);
                    }
                }
                c2 = g0.d.c(0, i5, 0, 0);
            } else if (i10 == 4) {
                i5 = aVar.f22584c.f9678c;
                int i13 = aVar.f22585d.f9678c;
                if (bVar.f22590a != i13) {
                    bVar.f22590a = i13;
                    io.sentry.util.network.b bVar5 = bVar.f22598i;
                    if (bVar5 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) bVar5.f17176b;
                        layoutParams4.width = i13;
                        ((View) bVar5.f17177c).setLayoutParams(layoutParams4);
                    }
                }
                c2 = g0.d.c(0, 0, i5, 0);
            } else if (i10 != 8) {
                c2 = dVar;
                i5 = 0;
            } else {
                i5 = aVar.f22584c.f9679d;
                int i14 = aVar.f22585d.f9679d;
                if (bVar.f22591b != i14) {
                    bVar.f22591b = i14;
                    io.sentry.util.network.b bVar6 = bVar.f22598i;
                    if (bVar6 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) bVar6.f17176b;
                        layoutParams5.height = i14;
                        ((View) bVar6.f17177c).setLayoutParams(layoutParams5);
                    }
                }
                c2 = g0.d.c(0, 0, 0, i5);
            }
            boolean z5 = i5 > 0;
            if (bVar.f22593d != z5) {
                bVar.f22593d = z5;
                io.sentry.util.network.b bVar7 = bVar.f22598i;
                if (bVar7 != null) {
                    ((View) bVar7.f17177c).setVisibility(z5 ? 0 : 4);
                }
            }
            float f6 = 0.0f;
            aVar.a(i5 > 0 ? 1.0f : 0.0f);
            if (i5 > 0) {
                f6 = 1.0f;
            }
            aVar.b(f6);
            dVar2 = g0.d.a(dVar2, c2);
        }
    }
}
