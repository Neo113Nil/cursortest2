package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ned extends xka implements Function2 {
    public static final ned A;
    public static final ned B;
    public static final ned C;
    public static final ned D;
    public static final ned E;
    public static final ned F;
    public static final ned G;
    public static final ned H;
    public static final ned I;
    public static final ned J;
    public static final ned K;
    public static final ned L;
    public static final ned M;
    public static final ned j;
    public static final ned k;
    public static final ned l;
    public static final ned m;
    public static final ned n;
    public static final ned o;
    public static final ned p;
    public static final ned q;
    public static final ned r;
    public static final ned s;
    public static final ned t;
    public static final ned u;
    public static final ned v;
    public static final ned w;
    public static final ned x;
    public static final ned y;
    public static final ned z;
    public final /* synthetic */ int i;

    static {
        int i = 2;
        j = new ned(i, 0);
        k = new ned(i, 1);
        l = new ned(i, 2);
        m = new ned(i, 3);
        n = new ned(i, 4);
        o = new ned(i, 5);
        p = new ned(i, 6);
        q = new ned(i, 7);
        r = new ned(i, 8);
        s = new ned(i, 9);
        t = new ned(i, 10);
        u = new ned(i, 11);
        v = new ned(i, 12);
        w = new ned(i, 13);
        x = new ned(i, 14);
        y = new ned(i, 15);
        z = new ned(i, 16);
        A = new ned(i, 17);
        B = new ned(i, 18);
        C = new ned(i, 19);
        D = new ned(i, 20);
        E = new ned(i, 21);
        F = new ned(i, 22);
        G = new ned(i, 23);
        H = new ned(i, 24);
        I = new ned(i, 25);
        J = new ned(i, 26);
        K = new ned(i, 27);
        L = new ned(i, 28);
        M = new ned(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ned(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        dt8 dt8Var;
        switch (this.i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                if (((uy8) obj2) instanceof ic) {
                    intValue++;
                }
                return Integer.valueOf(intValue);
            case 1:
                ((uk5) obj).d = (vy8) obj2;
                return Unit.a;
            case 2:
                ((uk5) obj).f = ((go) obj2).a;
                return Unit.a;
            case 3:
                ((uk5) obj).e = ((eo) obj2).a;
                return Unit.a;
            case 4:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = km5.a;
                }
                return CollectionsKt.w0(list, collection);
            case 5:
                return (uz) obj;
            case 6:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 7:
                return (vp3) obj;
            case 8:
                return (r00) obj;
            case 9:
                return (Unit) obj;
            case 10:
                return (Unit) obj;
            case 11:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 12:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 13:
                return (Unit) obj;
            case 14:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 15:
                u5g u5gVar = (u5g) obj;
                int i = ((u5g) obj2).a;
                return u5gVar;
            case 16:
                return (uah) obj;
            case 17:
                return (String) obj;
            case 18:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 19:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 20:
                return (String) obj;
            case 21:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 22:
                m9 m9Var = (m9) obj;
                m9 m9Var2 = (m9) obj2;
                if (m9Var == null || (str = m9Var.a) == null) {
                    str = m9Var2.a;
                }
                if (m9Var == null || (dt8Var = m9Var.b) == null) {
                    dt8Var = m9Var2.b;
                }
                return new m9(str, dt8Var);
            case 23:
                return obj == null ? obj2 : obj;
            case 24:
                s3h s3hVar = (s3h) obj2;
                Object valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                l3h l3hVar = ((s3h) obj).d;
                a4h a4hVar = w3h.u;
                Object g = l3hVar.a.g(a4hVar);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = s3hVar.d.a.g(a4hVar);
                if (g2 != null) {
                    valueOf = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
            case 25:
                ((vk5) obj).d = ((s75) obj2).a;
                return Unit.a;
            case 26:
                ((vk5) obj).e = (ekh) obj2;
                return Unit.a;
            case 27:
                ((wk5) obj).a = (vy8) obj2;
                return Unit.a;
            case 28:
                ((xk5) obj).a = (String) obj2;
                return Unit.a;
            default:
                ((xk5) obj).d = (vy8) obj2;
                return Unit.a;
        }
    }
}
