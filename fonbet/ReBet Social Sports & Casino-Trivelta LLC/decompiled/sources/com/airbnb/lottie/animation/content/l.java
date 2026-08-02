package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.model.content.j;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: d, reason: collision with root package name */
    public final String f28612d;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.j f28614f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f28609a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f28610b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f28611c = new Path();

    /* renamed from: e, reason: collision with root package name */
    public final List f28613e = new ArrayList();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode;

        static {
            int[] iArr = new int[j.a.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(com.airbnb.lottie.model.content.j jVar) {
        this.f28612d = jVar.c();
        this.f28614f = jVar;
    }

    public final void a() {
        for (int i10 = 0; i10 < this.f28613e.size(); i10++) {
            this.f28611c.addPath(((m) this.f28613e.get(i10)).l());
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
        for (int i10 = 0; i10 < this.f28613e.size(); i10++) {
            ((m) this.f28613e.get(i10)).b(list, list2);
        }
    }

    public final void e(Path.Op op) {
        this.f28610b.reset();
        this.f28609a.reset();
        for (int size = this.f28613e.size() - 1; size >= 1; size--) {
            m mVar = (m) this.f28613e.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List m10 = dVar.m();
                for (int size2 = m10.size() - 1; size2 >= 0; size2--) {
                    Path l10 = ((m) m10.get(size2)).l();
                    l10.transform(dVar.n());
                    this.f28610b.addPath(l10);
                }
            } else {
                this.f28610b.addPath(mVar.l());
            }
        }
        m mVar2 = (m) this.f28613e.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List m11 = dVar2.m();
            for (int i10 = 0; i10 < m11.size(); i10++) {
                Path l11 = ((m) m11.get(i10)).l();
                l11.transform(dVar2.n());
                this.f28609a.addPath(l11);
            }
        } else {
            this.f28609a.set(mVar2.l());
        }
        this.f28611c.op(this.f28609a, this.f28610b, op);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void g(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof m) {
                this.f28613e.add((m) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.m
    public Path l() {
        this.f28611c.reset();
        if (this.f28614f.d()) {
            return this.f28611c;
        }
        int i10 = a.$SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode[this.f28614f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            e(Path.Op.UNION);
        } else if (i10 == 3) {
            e(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            e(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            e(Path.Op.XOR);
        }
        return this.f28611c;
    }
}
