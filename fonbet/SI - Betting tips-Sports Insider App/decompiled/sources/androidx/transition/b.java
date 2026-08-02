package androidx.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2678a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i5) {
        super(cls, str);
        this.f2678a = i5;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2678a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(p0.f2736a.s((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2678a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f2685a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f2686b = round;
                int i5 = eVar.f2690f + 1;
                eVar.f2690f = i5;
                if (i5 == eVar.f2691g) {
                    p0.a(eVar.f2689e, eVar.f2685a, round, eVar.f2687c, eVar.f2688d);
                    eVar.f2690f = 0;
                    eVar.f2691g = 0;
                    break;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f2687c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f2688d = round2;
                int i10 = eVar2.f2691g + 1;
                eVar2.f2691g = i10;
                if (eVar2.f2690f == i10) {
                    p0.a(eVar2.f2689e, eVar2.f2685a, eVar2.f2686b, eVar2.f2687c, round2);
                    eVar2.f2690f = 0;
                    eVar2.f2691g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                p0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                p0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                p0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                p0.f2736a.z((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
