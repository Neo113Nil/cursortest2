package f2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.fragment.app.r;
import eg.g0;
import io.sentry.android.replay.capture.g;
import io.sentry.android.replay.capture.i;
import io.sentry.android.replay.capture.o;
import io.sentry.android.replay.util.l;
import io.sentry.android.replay.viewhierarchy.d;
import io.sentry.android.replay.viewhierarchy.e;
import io.sentry.android.replay.viewhierarchy.f;
import io.sentry.b1;
import io.sentry.i1;
import io.sentry.okhttp.c;
import io.sentry.rrweb.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u.h;
import u.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9319g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i5, Object obj, Object obj2) {
        super(1);
        this.f9317e = i5;
        this.f9318f = obj;
        this.f9319g = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [gf.i, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        Integer num;
        List list;
        switch (this.f9317e) {
            case 0:
                Throwable th2 = (Throwable) obj;
                h hVar = (h) this.f9318f;
                if (th2 == null) {
                    hVar.a(((g0) this.f9319g).B());
                } else if (th2 instanceof CancellationException) {
                    hVar.f24001d = true;
                    k kVar = hVar.f23999b;
                    if (kVar != null && kVar.f24004b.cancel(true)) {
                        hVar.f23998a = null;
                        hVar.f23999b = null;
                        hVar.f24000c = null;
                    }
                } else {
                    hVar.b(th2);
                }
                return Unit.f19194a;
            case 1:
                io.sentry.android.replay.capture.k segment = (io.sentry.android.replay.capture.k) obj;
                Intrinsics.checkNotNullParameter(segment, "segment");
                g gVar = (g) this.f9318f;
                ArrayList arrayList = gVar.f16006v;
                b1 b1Var = gVar.f16003s;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                i iVar = (i) (arrayList.isEmpty() ? null : arrayList.remove(0));
                while (iVar != null) {
                    i.a(iVar, b1Var);
                    Intrinsics.checkNotNullParameter(arrayList, "<this>");
                    iVar = (i) (arrayList.isEmpty() ? null : arrayList.remove(0));
                    Thread.sleep(100L);
                }
                if (segment instanceof i) {
                    i iVar2 = (i) segment;
                    i.a(iVar2, b1Var);
                    r rVar = (r) this.f9319g;
                    Date date = iVar2.f16007a.f16324u;
                    Intrinsics.checkNotNullExpressionValue(date, "getTimestamp(...)");
                    rVar.invoke(date);
                }
                return Unit.f19194a;
            case 2:
                b event = (b) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.f17005b >= ((Date) this.f9318f).getTime()) {
                    ((ArrayList) this.f9319g).add(event);
                }
                return Unit.f19194a;
            case 3:
                io.sentry.android.replay.capture.k segment2 = (io.sentry.android.replay.capture.k) obj;
                o oVar = (o) this.f9318f;
                Intrinsics.checkNotNullParameter(segment2, "segment");
                if (segment2 instanceof i) {
                    i.a((i) segment2, oVar.f16017s);
                }
                oVar.l(-1);
                io.sentry.config.a.g((File) this.f9319g);
                return Unit.f19194a;
            case 4:
                f node = (f) obj;
                io.sentry.android.replay.screenshot.g gVar2 = (io.sentry.android.replay.screenshot.g) this.f9318f;
                ?? r32 = gVar2.f16104k;
                ?? r42 = gVar2.f16100f;
                Intrinsics.checkNotNullParameter(node, "node");
                boolean z5 = node.f16165d;
                Rect globalRect = node.f16166e;
                if (z5 && node.f16162a > 0 && node.f16163b > 0) {
                    if (globalRect == null) {
                        return Boolean.FALSE;
                    }
                    int i5 = 0;
                    int i10 = 1;
                    if (node instanceof d) {
                        List c2 = t.c(globalRect);
                        Bitmap bitmap = gVar2.f16101g;
                        if (!gVar2.f16106m.get() && !bitmap.isRecycled() && !((Bitmap) r42.getValue()).isRecycled()) {
                            Rect rect = new Rect(globalRect);
                            RectF rectF = new RectF(rect);
                            ((Matrix) gVar2.f16103i.getValue()).mapRect(rectF);
                            rectF.round(rect);
                            ((Canvas) gVar2.f16102h.getValue()).drawBitmap(bitmap, rect, new Rect(0, 0, 1, 1), (Paint) null);
                            r9 = ((Bitmap) r42.getValue()).getPixel(0, 0);
                        }
                        pair = new Pair(c2, Integer.valueOf(r9));
                    } else if (node instanceof e) {
                        e eVar = (e) node;
                        l lVar = eVar.f16159g;
                        r9 = ((lVar == null || (num = lVar.p()) == null) && (num = eVar.f16160h) == null) ? -16777216 : num.intValue();
                        int i11 = eVar.f16161i;
                        int i12 = eVar.j;
                        Intrinsics.checkNotNullParameter(globalRect, "globalRect");
                        if (lVar == null) {
                            list = t.c(globalRect);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int n9 = lVar.n();
                            int i13 = 0;
                            while (i13 < n9) {
                                int h10 = (int) lVar.h(i13, lVar.m(i13));
                                int s8 = lVar.s(i13);
                                int q = lVar.q(i13);
                                int h11 = (int) lVar.h(i13, (q - s8) + (s8 > 0 ? i10 : i5));
                                if (h11 == 0 && q > 0) {
                                    h11 = ((int) lVar.h(i13, q - 1)) + i10;
                                }
                                int g10 = lVar.g(i13);
                                int l6 = lVar.l(i13);
                                Rect rect2 = new Rect();
                                int i14 = globalRect.left + i11 + h10;
                                rect2.left = i14;
                                rect2.right = (h11 - h10) + i14;
                                int i15 = globalRect.top + i12 + g10;
                                rect2.top = i15;
                                rect2.bottom = (l6 - g10) + i15;
                                arrayList2.add(rect2);
                                i13++;
                                i5 = 0;
                                i10 = 1;
                            }
                            list = arrayList2;
                        }
                        pair = new Pair(list, Integer.valueOf(r9));
                    } else {
                        pair = new Pair(t.c(globalRect), -16777216);
                    }
                    List list2 = (List) pair.f19192a;
                    ((Paint) r32.getValue()).setColor(((Number) pair.f19193b).intValue());
                    Canvas canvas = (Canvas) this.f9319g;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) r32.getValue());
                    }
                    gVar2.f16096b.getReplayController().getClass();
                }
                return Boolean.TRUE;
            default:
                i1 it2 = (i1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                it2.m((String) this.f9318f, "domain_name");
                List list3 = (List) this.f9319g;
                if (!list3.isEmpty()) {
                    it2.m(CollectionsKt.J(list3, null, null, null, c.f16700f, 31), "dns_addresses");
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(io.sentry.android.replay.screenshot.g gVar, ArrayList arrayList, Canvas canvas) {
        super(1);
        this.f9317e = 4;
        this.f9318f = gVar;
        this.f9319g = canvas;
    }
}
