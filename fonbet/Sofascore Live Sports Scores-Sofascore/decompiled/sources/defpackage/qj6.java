package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qj6 extends hoi implements Function2 {
    public Object A;
    public final /* synthetic */ Object B;
    public Object C;
    public final /* synthetic */ int r = 1;
    public long s;
    public int t;
    public /* synthetic */ Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj6(db2 db2Var, fc2 fc2Var, Long l, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = db2Var;
        this.B = fc2Var;
        this.C = l;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                qj6 qj6Var = new qj6((lcd) obj2, (LinkedHashMap) this.y, (LinkedHashMap) this.z, rq3Var);
                qj6Var.u = obj;
                return qj6Var;
            default:
                qj6 qj6Var2 = new qj6((db2) this.A, (fc2) obj2, (Long) this.C, rq3Var);
                qj6Var2.u = obj;
                return qj6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((qj6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((qj6) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:183|184|(9:189|190|191|192|193|(1:195)|196|(1:198)|(2:200|(2:202|203)(2:204|(2:208|(6:214|(2:222|(1:230)(2:224|(1:229)(2:226|(1:228))))|231|(1:233)(1:343)|234|(2:236|237)(1:342))(2:212|213))))(1:346))|350|351|352|(8:354|191|192|193|(0)|196|(0)|(0)(0))|190|191|192|193|(0)|196|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03d5, code lost:
    
        if (((defpackage.j8f) r0).e.q(r28, r1) == r10) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03a2, code lost:
    
        if (((defpackage.j8f) r0).e.q(r28, r2) == r10) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0808, code lost:
    
        if (r0 != r1) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0387, code lost:
    
        if (r1 == r10) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x03b7, code lost:
    
        if (r1 == r10) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x052a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x052b, code lost:
    
        r2 = defpackage.w2g.b;
        r0 = new defpackage.u2g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02ec, code lost:
    
        r14 = r20;
        r11 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0238, code lost:
    
        if (r7 != r10) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e6 A[Catch: all -> 0x02e4, TRY_LEAVE, TryCatch #6 {all -> 0x02e4, blocks: (B:113:0x02e0, B:46:0x02e6), top: B:112:0x02e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029f A[Catch: all -> 0x0302, TRY_LEAVE, TryCatch #2 {all -> 0x0302, blocks: (B:78:0x0296, B:80:0x029f), top: B:77:0x0296 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0305  */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0242 -> B:46:0x01e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x02c1 -> B:38:0x02c7). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fsf fsfVar;
        long currentTimeMillis;
        Object R;
        fsf fsfVar2;
        ViewGroup viewGroup;
        lcd lcdVar;
        ku3 ku3Var;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Integer num;
        int i;
        Object R2;
        Iterable iterable;
        int height;
        int i2;
        int i3;
        int i4;
        int i5;
        Object u2gVar;
        long j;
        long currentTimeMillis2;
        Object u2gVar2;
        boolean z;
        Object obj2;
        Drawable background;
        boolean z2;
        long j2;
        k8f k8fVar;
        long j3;
        fc2 fc2Var;
        Object Q;
        yu3 yu3Var;
        yu3 yu3Var2;
        k8f k8fVar2;
        long j4;
        k8f k8fVar3;
        Object obj3;
        long j5;
        Object obj4;
        long j6;
        fc2 fc2Var2;
        yu3 yu3Var3;
        k8f k8fVar4;
        pa3 pa3Var;
        va2 va2Var;
        va2 va2Var2;
        fc2 fc2Var3;
        long j7;
        Object obj5;
        va2 va2Var3;
        k8f k8fVar5;
        fc2 fc2Var4;
        yu3 yu3Var4;
        long j8;
        pa3 pa3Var2;
        yu3 yu3Var5;
        long j9;
        k8f k8fVar6;
        aj9 aj9Var;
        aj9 aj9Var2;
        va2 va2Var4;
        aj9 aj9Var3;
        va2 va2Var5;
        gz2 gz2Var;
        boolean compareAndSwapObject;
        fc2 fc2Var5;
        yu3 yu3Var6;
        long j10;
        k8f k8fVar7;
        Object Q2;
        Object O;
        int i6 = this.r;
        Object obj6 = this.B;
        aj9 aj9Var4 = 0;
        aj9Var4 = 0;
        aj9Var4 = 0;
        switch (i6) {
            case 0:
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.y;
                lcd lcdVar2 = (lcd) obj6;
                lu3 lu3Var = lu3.a;
                int i7 = this.t;
                if (i7 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var2 = (ku3) this.u;
                    lcdVar2.setNeedsExposureUpdate$render_release(false);
                    fsfVar = new fsf();
                    fsfVar.a = lcdVar2;
                    if (lcdVar2.b && lcdVar2.getWidth() > 0 && lcdVar2.getHeight() > 0) {
                        LinkedHashMap linkedHashMap4 = (LinkedHashMap) this.z;
                        currentTimeMillis = System.currentTimeMillis();
                        ViewParent parent = ((ViewGroup) fsfVar.a).getParent();
                        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        hs4 hs4Var = z45.a;
                        r69 r69Var = rob.a;
                        ip1 ip1Var = new ip1(lcdVar2, aj9Var4, 13);
                        this.u = ku3Var2;
                        this.v = fsfVar;
                        this.w = linkedHashMap4;
                        this.x = linkedHashMap3;
                        this.A = lcdVar2;
                        this.C = viewGroup2;
                        this.s = currentTimeMillis;
                        this.t = 1;
                        R = xw3.R(r69Var, ip1Var, this);
                        if (R != lu3Var) {
                            fsfVar2 = fsfVar;
                            viewGroup = viewGroup2;
                            lcdVar = lcdVar2;
                            ku3Var = ku3Var2;
                            linkedHashMap = linkedHashMap4;
                            linkedHashMap2 = linkedHashMap3;
                        }
                        return lu3Var;
                    }
                    lcdVar2.getExposureRect$render_release().setEmpty();
                    num = new Integer(lcdVar2.getHeight() * lcdVar2.getWidth());
                    if (num.intValue() <= 0) {
                        num = null;
                    }
                    if (num == null) {
                        int intValue = num.intValue();
                        Rect exposureRect$render_release = lcdVar2.getExposureRect$render_release();
                        ViewGroup viewGroup3 = (ViewGroup) fsfVar.a;
                        Rect rect = new Rect();
                        exposureRect$render_release.getClass();
                        viewGroup3.getClass();
                        if (exposureRect$render_release.isEmpty()) {
                            height = 0;
                        } else {
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                                View view = (View) entry.getKey();
                                Rect rect2 = (Rect) entry.getValue();
                                if (view.isLaidOut()) {
                                    try {
                                        p2g p2gVar = w2g.b;
                                        viewGroup3.offsetDescendantRectToMyCoords(view, rect2);
                                        u2gVar = Unit.a;
                                    } catch (Throwable th) {
                                        p2g p2gVar2 = w2g.b;
                                        u2gVar = new u2g(th);
                                    }
                                    if (!(u2gVar instanceof u2g)) {
                                        linkedHashMap5.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            }
                            List<Rect> H0 = CollectionsKt.H0(linkedHashMap5.values(), new v66(1));
                            for (Rect rect3 : H0) {
                                rect3.getClass();
                                if (rect3.height() >= exposureRect$render_release.height()) {
                                    int i8 = rect3.left;
                                    int i9 = exposureRect$render_release.left;
                                    if (i8 <= i9 && (i5 = rect3.right) >= i9) {
                                        exposureRect$render_release.left = i5;
                                    }
                                    int i10 = rect3.right;
                                    int i11 = exposureRect$render_release.right;
                                    if (i10 >= i11 && (i4 = rect3.left) <= i11) {
                                        exposureRect$render_release.right = i4;
                                    }
                                }
                                if (rect3.width() >= exposureRect$render_release.width()) {
                                    int i12 = rect3.top;
                                    int i13 = exposureRect$render_release.top;
                                    if (i12 <= i13 && (i3 = rect3.bottom) >= i13) {
                                        exposureRect$render_release.top = i3;
                                    }
                                    int i14 = rect3.bottom;
                                    int i15 = exposureRect$render_release.bottom;
                                    if (i14 >= i15 && (i2 = rect3.top) <= i15) {
                                        exposureRect$render_release.bottom = i2;
                                    }
                                }
                            }
                            Iterator it = H0.iterator();
                            if (it.hasNext()) {
                                ArrayList arrayList = new ArrayList();
                                Object next = it.next();
                                while (it.hasNext()) {
                                    Object next2 = it.next();
                                    Rect rect4 = (Rect) next2;
                                    arrayList.add(Integer.valueOf((rect4.isEmpty() ? 0 : rect4.width() * rect4.height()) - ((!rect.setIntersect((Rect) next, rect4) || rect.isEmpty()) ? 0 : rect.width() * rect.height())));
                                    next = next2;
                                }
                                iterable = arrayList;
                            } else {
                                iterable = km5.a;
                            }
                            height = exposureRect$render_release.isEmpty() ? 0 : exposureRect$render_release.height() * exposureRect$render_release.width();
                            Iterator it2 = iterable.iterator();
                            while (it2.hasNext()) {
                                height -= ((Number) it2.next()).intValue();
                            }
                        }
                        i = (height * 100) / intValue;
                    } else {
                        i = 0;
                    }
                    Rect exposureRect$render_release2 = lcdVar2.getExposureRect$render_release();
                    this.u = null;
                    this.v = null;
                    this.w = null;
                    this.x = null;
                    this.A = null;
                    this.C = null;
                    this.t = 2;
                    hs4 hs4Var2 = z45.a;
                    R2 = xw3.R(rob.a, new z23(lcdVar2, linkedHashMap3, i, exposureRect$render_release2, (rq3) null, 4), this);
                    if (R2 != lu3.a) {
                        R2 = Unit.a;
                        break;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    currentTimeMillis = this.s;
                    viewGroup = (ViewGroup) this.C;
                    lcdVar = (lcd) this.A;
                    LinkedHashMap linkedHashMap6 = (LinkedHashMap) this.x;
                    LinkedHashMap linkedHashMap7 = (LinkedHashMap) this.w;
                    fsf fsfVar3 = (fsf) this.v;
                    ku3 ku3Var3 = (ku3) this.u;
                    y6a.M(obj);
                    fsfVar2 = fsfVar3;
                    ku3Var = ku3Var3;
                    linkedHashMap = linkedHashMap7;
                    linkedHashMap2 = linkedHashMap6;
                    R = obj;
                }
                if (!((Boolean) R).booleanValue()) {
                    viewGroup = null;
                }
                ViewGroup viewGroup4 = viewGroup;
                while (viewGroup4 != null && s9a.w(ku3Var)) {
                    linkedHashMap.clear();
                    if (viewGroup4.getVisibility() == 0 && viewGroup4.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        try {
                            p2g p2gVar3 = w2g.b;
                            viewGroup4.offsetDescendantRectToMyCoords((View) fsfVar2.a, lcdVar.getExposureRect$render_release());
                            u2gVar2 = Unit.a;
                        } catch (Throwable th2) {
                            p2g p2gVar4 = w2g.b;
                            u2gVar2 = new u2g(th2);
                        }
                        if (!(u2gVar2 instanceof u2g)) {
                            dsf dsfVar = new dsf();
                            int i16 = -1;
                            dsfVar.a = -1;
                            int childCount = viewGroup4.getChildCount() - 1;
                            while (true) {
                                if (i16 >= childCount) {
                                    j = currentTimeMillis;
                                    fsfVar2.a = viewGroup4;
                                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                        ViewGroup viewGroup5 = (ViewGroup) entry2.getKey();
                                        Rect rect5 = (Rect) entry2.getValue();
                                        boolean contains = rect5.contains(lcdVar.getExposureRect$render_release());
                                        if (!s9a.u(viewGroup5, rect5, linkedHashMap2, viewGroup4, lcdVar.getTmpRect$render_release()) || !contains) {
                                        }
                                    }
                                    ViewParent parent2 = ((ViewGroup) fsfVar2.a).getParent();
                                    viewGroup4 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                                    currentTimeMillis = j;
                                } else {
                                    View childAt = viewGroup4.getChildAt(childCount);
                                    if (childAt != null) {
                                        try {
                                            p2g p2gVar5 = w2g.b;
                                            WeakHashMap weakHashMap = bsk.a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            j = currentTimeMillis;
                                            break;
                                        }
                                        if (childAt.getZ() <= ((View) fsfVar2.a).getZ() && childCount <= dsfVar.a) {
                                            j = currentTimeMillis;
                                            z2 = false;
                                            Object u2gVar3 = Boolean.valueOf(z2);
                                            Boolean bool = Boolean.FALSE;
                                            z = u2gVar3 instanceof u2g;
                                            obj2 = u2gVar3;
                                            if (z) {
                                                obj2 = bool;
                                            }
                                            if (!((Boolean) obj2).booleanValue()) {
                                                childAt = null;
                                            }
                                            if (childAt != null) {
                                                continue;
                                            } else if (childAt.equals(fsfVar2.a)) {
                                                dsfVar.a = childCount;
                                            } else if (childAt.getVisibility() == 0 && childAt.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                if (!(childAt instanceof ViewGroup) || ((ViewGroup) childAt).getChildCount() <= 0) {
                                                    if (childAt.willNotDraw() && ((background = childAt.getBackground()) == null || !background.isVisible() || background.getAlpha() <= 0)) {
                                                        ad2 ad2Var = oc3.a;
                                                        Drawable foreground = childAt.getForeground();
                                                        if (foreground == null) {
                                                            continue;
                                                        } else if (!foreground.isVisible()) {
                                                            continue;
                                                        } else if (foreground.getAlpha() <= 0) {
                                                            continue;
                                                        }
                                                    }
                                                    Rect rect6 = (Rect) linkedHashMap2.get(childAt);
                                                    if (rect6 != null) {
                                                        rect6.set(lcdVar.getTmpRect$render_release());
                                                    } else {
                                                        rect6 = new Rect(lcdVar.getTmpRect$render_release());
                                                    }
                                                    linkedHashMap2.put(childAt, rect6);
                                                    if (lcdVar.getTmpRect$render_release().contains(lcdVar.getExposureRect$render_release())) {
                                                        fsfVar2.a = viewGroup4;
                                                    }
                                                } else {
                                                    linkedHashMap.put(childAt, new Rect(lcdVar.getTmpRect$render_release()));
                                                }
                                            }
                                        }
                                        Rect exposureRect$render_release3 = lcdVar.getExposureRect$render_release();
                                        j = currentTimeMillis;
                                        Rect tmpRect$render_release = lcdVar.getTmpRect$render_release();
                                        exposureRect$render_release3.getClass();
                                        tmpRect$render_release.getClass();
                                        childAt.getHitRect(tmpRect$render_release);
                                        Unit unit = Unit.a;
                                        if (tmpRect$render_release.intersect(exposureRect$render_release3)) {
                                            z2 = true;
                                            Object u2gVar32 = Boolean.valueOf(z2);
                                            Boolean bool2 = Boolean.FALSE;
                                            z = u2gVar32 instanceof u2g;
                                            obj2 = u2gVar32;
                                            if (z) {
                                            }
                                            if (!((Boolean) obj2).booleanValue()) {
                                            }
                                            if (childAt != null) {
                                            }
                                        }
                                        z2 = false;
                                        Object u2gVar322 = Boolean.valueOf(z2);
                                        Boolean bool22 = Boolean.FALSE;
                                        z = u2gVar322 instanceof u2g;
                                        obj2 = u2gVar322;
                                        if (z) {
                                        }
                                        if (!((Boolean) obj2).booleanValue()) {
                                        }
                                        if (childAt != null) {
                                        }
                                    } else {
                                        j = currentTimeMillis;
                                    }
                                    childCount--;
                                    currentTimeMillis = j;
                                    i16 = -1;
                                }
                            }
                            currentTimeMillis2 = System.currentTimeMillis() - j;
                            if (currentTimeMillis2 > 100) {
                                cjb.b("Tree walk took " + currentTimeMillis2 + " ms");
                            }
                            fsfVar = fsfVar2;
                            num = new Integer(lcdVar2.getHeight() * lcdVar2.getWidth());
                            if (num.intValue() <= 0) {
                            }
                            if (num == null) {
                            }
                            Rect exposureRect$render_release22 = lcdVar2.getExposureRect$render_release();
                            this.u = null;
                            this.v = null;
                            this.w = null;
                            this.x = null;
                            this.A = null;
                            this.C = null;
                            this.t = 2;
                            hs4 hs4Var22 = z45.a;
                            R2 = xw3.R(rob.a, new z23(lcdVar2, linkedHashMap3, i, exposureRect$render_release22, (rq3) null, 4), this);
                            if (R2 != lu3.a) {
                            }
                        }
                    }
                    j = currentTimeMillis;
                    linkedHashMap2.clear();
                    lcdVar.getExposureRect$render_release().setEmpty();
                    currentTimeMillis2 = System.currentTimeMillis() - j;
                    if (currentTimeMillis2 > 100) {
                    }
                    fsfVar = fsfVar2;
                    num = new Integer(lcdVar2.getHeight() * lcdVar2.getWidth());
                    if (num.intValue() <= 0) {
                    }
                    if (num == null) {
                    }
                    Rect exposureRect$render_release222 = lcdVar2.getExposureRect$render_release();
                    this.u = null;
                    this.v = null;
                    this.w = null;
                    this.x = null;
                    this.A = null;
                    this.C = null;
                    this.t = 2;
                    hs4 hs4Var222 = z45.a;
                    R2 = xw3.R(rob.a, new z23(lcdVar2, linkedHashMap3, i, exposureRect$render_release222, (rq3) null, 4), this);
                    if (R2 != lu3.a) {
                    }
                }
                j = currentTimeMillis;
                currentTimeMillis2 = System.currentTimeMillis() - j;
                if (currentTimeMillis2 > 100) {
                }
                fsfVar = fsfVar2;
                num = new Integer(lcdVar2.getHeight() * lcdVar2.getWidth());
                if (num.intValue() <= 0) {
                }
                if (num == null) {
                }
                Rect exposureRect$render_release2222 = lcdVar2.getExposureRect$render_release();
                this.u = null;
                this.v = null;
                this.w = null;
                this.x = null;
                this.A = null;
                this.C = null;
                this.t = 2;
                hs4 hs4Var2222 = z45.a;
                R2 = xw3.R(rob.a, new z23(lcdVar2, linkedHashMap3, i, exposureRect$render_release2222, (rq3) null, 4), this);
                if (R2 != lu3.a) {
                }
                break;
            default:
                fc2 fc2Var6 = (fc2) obj6;
                Long l = (Long) this.C;
                lu3 lu3Var2 = lu3.a;
                int i17 = 6;
                int i18 = 9;
                switch (this.t) {
                    case 0:
                        j2 = 0;
                        y6a.M(obj);
                        k8fVar = (k8f) this.u;
                        yu3 yu3Var7 = new yu3((db2) this.A);
                        yu3Var7.d();
                        j3 = yu3Var7.e;
                        int length = jzc.b.a.length;
                        byte[] bArr = fc2Var6.a;
                        int length2 = bArr.length;
                        fc2Var = length == length2 ? fc2.c : new fc2(bArr, length, length2);
                        j8c j8cVar = new j8c(fc2Var, yu3Var7, (rq3) aj9Var4, i18);
                        jc2 jc2Var = kc2.a;
                        g gVar = g.a;
                        k8fVar.getClass();
                        gVar.getClass();
                        va2 va2Var6 = new va2();
                        xw3.L(k8fVar, gVar, null, new u1(j8cVar, va2Var6, (rq3) aj9Var4, i17), 2).n(new ic2(va2Var6, 0));
                        this.u = k8fVar;
                        this.v = yu3Var7;
                        this.w = fc2Var;
                        this.s = j3;
                        this.t = 1;
                        Q = l6g.Q(va2Var6, this);
                        if (Q != lu3Var2) {
                            yu3Var = yu3Var7;
                            if (o1j.D((bwh) Q) <= j2) {
                                fzc fzcVar = new fzc();
                                this.u = k8fVar;
                                this.v = yu3Var;
                                this.w = fc2Var;
                                this.s = j3;
                                this.t = 2;
                                if (((j8f) k8fVar).e.q(this, fzcVar) != lu3Var2) {
                                    yu3Var2 = yu3Var;
                                    k8fVar2 = k8fVar;
                                    j4 = j3;
                                    j3 = j4;
                                    k8fVar = k8fVar2;
                                    if (yu3Var2.h()) {
                                        fc2 fc2Var7 = jzc.b;
                                        this.u = k8fVar;
                                        this.v = yu3Var2;
                                        this.w = fc2Var;
                                        this.x = null;
                                        this.y = null;
                                        this.z = null;
                                        this.s = j3;
                                        this.t = 3;
                                        obj3 = l6g.U(yu3Var2, fc2Var7, this);
                                        if (obj3 != lu3Var2) {
                                            k8fVar3 = k8fVar;
                                            if (((Boolean) obj3).booleanValue()) {
                                                fc2 fc2Var8 = jzc.a;
                                                this.u = k8fVar3;
                                                this.v = yu3Var2;
                                                this.w = fc2Var;
                                                this.s = j3;
                                                this.t = 4;
                                                if (l6g.U(yu3Var2, fc2Var8, this) != lu3Var2) {
                                                    j5 = j3;
                                                    this.u = k8fVar3;
                                                    this.v = yu3Var2;
                                                    this.w = fc2Var;
                                                    this.s = j5;
                                                    this.t = 5;
                                                    obj4 = l6g.U(yu3Var2, fc2Var, this);
                                                    break;
                                                }
                                            } else {
                                                k8fVar5 = k8fVar3;
                                                fc2Var4 = jzc.a;
                                                this.u = k8fVar5;
                                                this.v = yu3Var2;
                                                this.w = null;
                                                this.x = null;
                                                this.y = null;
                                                this.z = null;
                                                this.s = j3;
                                                this.t = 9;
                                                if (l6g.U(yu3Var2, fc2Var4, this) != lu3Var2) {
                                                    yu3Var4 = yu3Var2;
                                                    j8 = j3;
                                                    fc2Var5 = jzc.a;
                                                    this.u = k8fVar5;
                                                    this.v = yu3Var4;
                                                    this.s = j8;
                                                    this.t = 10;
                                                    if (l6g.U(yu3Var4, fc2Var5, this) != lu3Var2) {
                                                        k8f k8fVar8 = k8fVar5;
                                                        yu3Var6 = yu3Var4;
                                                        j10 = j8;
                                                        k8fVar7 = k8fVar8;
                                                        if (l == null) {
                                                            yu3Var6.d();
                                                            long longValue = l.longValue() - (yu3Var6.e - j10);
                                                            if (longValue > 2147483647L) {
                                                                is8.e("Failed to parse multipart: prologue is too long");
                                                                return null;
                                                            }
                                                            if (longValue > j2) {
                                                                this.u = k8fVar7;
                                                                this.v = null;
                                                                this.t = 11;
                                                                O = l6g.O(yu3Var6, (int) longValue, this);
                                                                break;
                                                            }
                                                            return Unit.a;
                                                        }
                                                        this.u = k8fVar7;
                                                        this.v = null;
                                                        this.t = 13;
                                                        Q2 = l6g.Q(yu3Var6, this);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        k8fVar5 = k8fVar;
                                        fc2Var4 = jzc.a;
                                        this.u = k8fVar5;
                                        this.v = yu3Var2;
                                        this.w = null;
                                        this.x = null;
                                        this.y = null;
                                        this.z = null;
                                        this.s = j3;
                                        this.t = 9;
                                        if (l6g.U(yu3Var2, fc2Var4, this) != lu3Var2) {
                                        }
                                    }
                                }
                            } else {
                                yu3Var2 = yu3Var;
                                if (yu3Var2.h()) {
                                }
                            }
                        }
                        return lu3Var2;
                    case 1:
                        j2 = 0;
                        long j11 = this.s;
                        fc2Var = (fc2) this.w;
                        yu3Var = (yu3) this.v;
                        k8f k8fVar9 = (k8f) this.u;
                        y6a.M(obj);
                        j3 = j11;
                        k8fVar = k8fVar9;
                        Q = obj;
                        if (o1j.D((bwh) Q) <= j2) {
                        }
                        break;
                    case 2:
                        j2 = 0;
                        j4 = this.s;
                        fc2Var = (fc2) this.w;
                        yu3Var2 = (yu3) this.v;
                        k8fVar2 = (k8f) this.u;
                        y6a.M(obj);
                        j3 = j4;
                        k8fVar = k8fVar2;
                        if (yu3Var2.h()) {
                        }
                        break;
                    case 3:
                        j2 = 0;
                        long j12 = this.s;
                        fc2Var = (fc2) this.w;
                        yu3Var2 = (yu3) this.v;
                        k8fVar3 = (k8f) this.u;
                        y6a.M(obj);
                        j3 = j12;
                        obj3 = obj;
                        if (((Boolean) obj3).booleanValue()) {
                        }
                        break;
                    case 4:
                        j2 = 0;
                        j5 = this.s;
                        fc2Var = (fc2) this.w;
                        yu3Var2 = (yu3) this.v;
                        k8fVar3 = (k8f) this.u;
                        y6a.M(obj);
                        this.u = k8fVar3;
                        this.v = yu3Var2;
                        this.w = fc2Var;
                        this.s = j5;
                        this.t = 5;
                        obj4 = l6g.U(yu3Var2, fc2Var, this);
                        break;
                    case 5:
                        j2 = 0;
                        j5 = this.s;
                        fc2Var = (fc2) this.w;
                        yu3Var2 = (yu3) this.v;
                        k8fVar3 = (k8f) this.u;
                        y6a.M(obj);
                        obj4 = obj;
                        j3 = j5;
                        k8fVar = k8fVar3;
                        if (!((Boolean) obj4).booleanValue()) {
                            va2 va2Var7 = new va2();
                            qa3 c = qx9.c();
                            fzc fzcVar2 = new fzc();
                            this.u = k8fVar;
                            this.v = yu3Var2;
                            this.w = fc2Var;
                            this.x = va2Var7;
                            this.y = c;
                            this.s = j3;
                            this.t = i17;
                            if (((j8f) k8fVar).e.q(this, fzcVar2) != lu3Var2) {
                                yu3Var3 = yu3Var2;
                                pa3Var = c;
                                fc2Var2 = fc2Var;
                                va2Var = va2Var7;
                                k8fVar4 = k8fVar;
                                j6 = j3;
                                try {
                                    this.u = k8fVar4;
                                    this.v = yu3Var3;
                                    this.w = fc2Var2;
                                    this.x = va2Var;
                                    this.y = pa3Var;
                                    this.s = j6;
                                    this.t = 7;
                                    obj5 = jzc.c(yu3Var3, this);
                                } catch (Throwable th4) {
                                    th = th4;
                                    va2Var2 = va2Var;
                                }
                                if (obj5 != lu3Var2) {
                                    try {
                                        try {
                                            j7 = j6;
                                            va2Var3 = va2Var;
                                            fc2Var3 = fc2Var2;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            va2Var2 = va2Var3;
                                        }
                                        yu3Var5 = yu3Var3;
                                        j9 = j7;
                                        k8fVar6 = k8fVar4;
                                        pa3Var2 = pa3Var;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        aj9Var2 = aj9Var;
                                    }
                                    aj9Var = (aj9) obj5;
                                    if (((qa3) pa3Var2).V(aj9Var)) {
                                        aj9Var2 = aj9Var;
                                        aj9Var2.d();
                                        throw new CancellationException("Multipart processing has been cancelled");
                                    }
                                    try {
                                        this.u = k8fVar6;
                                        this.v = yu3Var5;
                                        this.w = fc2Var3;
                                        this.x = va2Var3;
                                        this.y = pa3Var2;
                                        this.z = aj9Var;
                                        this.s = j9;
                                        this.t = 8;
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                    fc2 fc2Var9 = fc2Var3;
                                    aj9Var2 = aj9Var;
                                    if (jzc.b(fc2Var6, yu3Var5, va2Var3, aj9Var2, 65536L, this) != lu3Var2) {
                                        yu3Var2 = yu3Var5;
                                        va2Var4 = va2Var3;
                                        aj9Var3 = aj9Var2;
                                        fc2Var = fc2Var9;
                                        k8fVar = k8fVar6;
                                        try {
                                            va2Var4.j();
                                            gz2Var = c6o.b;
                                            while (true) {
                                                Unsafe unsafe = rh0.a;
                                                long j13 = va2.f;
                                                compareAndSwapObject = unsafe.compareAndSwapObject(va2Var4, j13, (Object) null, gz2Var);
                                                va2Var5 = va2Var4;
                                                long j14 = j9;
                                                if (compareAndSwapObject) {
                                                    try {
                                                        va2Var5.i(null);
                                                        break;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                    }
                                                } else if (unsafe.getObjectVolatile(va2Var5, j13) != null) {
                                                    break;
                                                } else {
                                                    j9 = j14;
                                                    va2Var4 = va2Var5;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            va2Var5 = va2Var4;
                                        }
                                        aj9Var4 = aj9Var3;
                                        va2Var2 = va2Var5;
                                        pa3Var = pa3Var2;
                                        if (((qa3) pa3Var).j0(th) && aj9Var4 != 0) {
                                            aj9Var4.d();
                                        }
                                        kc2.a(va2Var2, th);
                                        throw th;
                                    }
                                    th = th7;
                                    va2Var2 = va2Var3;
                                    aj9Var4 = aj9Var2;
                                    pa3Var = pa3Var2;
                                    if (((qa3) pa3Var).j0(th)) {
                                        aj9Var4.d();
                                    }
                                    kc2.a(va2Var2, th);
                                    throw th;
                                }
                            }
                            return lu3Var2;
                        }
                        if (yu3Var2.h()) {
                        }
                        break;
                    case 6:
                        j2 = 0;
                        j6 = this.s;
                        pa3 pa3Var3 = (pa3) this.y;
                        va2 va2Var8 = (va2) this.x;
                        fc2Var2 = (fc2) this.w;
                        yu3Var3 = (yu3) this.v;
                        k8fVar4 = (k8f) this.u;
                        y6a.M(obj);
                        pa3Var = pa3Var3;
                        va2Var = va2Var8;
                        this.u = k8fVar4;
                        this.v = yu3Var3;
                        this.w = fc2Var2;
                        this.x = va2Var;
                        this.y = pa3Var;
                        this.s = j6;
                        this.t = 7;
                        obj5 = jzc.c(yu3Var3, this);
                        if (obj5 != lu3Var2) {
                        }
                        return lu3Var2;
                    case 7:
                        j2 = 0;
                        long j15 = this.s;
                        pa3Var = (pa3) this.y;
                        va2Var2 = (va2) this.x;
                        fc2Var3 = (fc2) this.w;
                        yu3Var3 = (yu3) this.v;
                        k8fVar4 = (k8f) this.u;
                        try {
                            y6a.M(obj);
                            j7 = j15;
                            obj5 = obj;
                            va2Var3 = va2Var2;
                            yu3Var5 = yu3Var3;
                            j9 = j7;
                            k8fVar6 = k8fVar4;
                            pa3Var2 = pa3Var;
                            aj9Var = (aj9) obj5;
                            if (((qa3) pa3Var2).V(aj9Var)) {
                            }
                            th = th7;
                            va2Var2 = va2Var3;
                            aj9Var4 = aj9Var2;
                        } catch (Throwable th10) {
                            th = th10;
                        }
                        pa3Var = pa3Var2;
                        if (((qa3) pa3Var).j0(th)) {
                        }
                        kc2.a(va2Var2, th);
                        throw th;
                    case 8:
                        long j16 = this.s;
                        aj9 aj9Var5 = (aj9) this.z;
                        pa3Var = (pa3) this.y;
                        va2Var2 = (va2) this.x;
                        fc2 fc2Var10 = (fc2) this.w;
                        j2 = 0;
                        yu3 yu3Var8 = (yu3) this.v;
                        k8f k8fVar10 = (k8f) this.u;
                        try {
                            y6a.M(obj);
                            pa3Var2 = pa3Var;
                            yu3Var2 = yu3Var8;
                            j9 = j16;
                            k8fVar = k8fVar10;
                            aj9Var3 = aj9Var5;
                            va2Var4 = va2Var2;
                            fc2Var = fc2Var10;
                            va2Var4.j();
                            gz2Var = c6o.b;
                            while (true) {
                                Unsafe unsafe2 = rh0.a;
                                long j132 = va2.f;
                                compareAndSwapObject = unsafe2.compareAndSwapObject(va2Var4, j132, (Object) null, gz2Var);
                                va2Var5 = va2Var4;
                                long j142 = j9;
                                if (compareAndSwapObject) {
                                }
                                j9 = j142;
                                va2Var4 = va2Var5;
                            }
                            aj9Var4 = aj9Var3;
                            va2Var2 = va2Var5;
                        } catch (Throwable th11) {
                            th = th11;
                            aj9Var4 = aj9Var5;
                        }
                        pa3Var = pa3Var2;
                        if (((qa3) pa3Var).j0(th)) {
                        }
                        kc2.a(va2Var2, th);
                        throw th;
                    case 9:
                        j8 = this.s;
                        yu3Var4 = (yu3) this.v;
                        k8fVar5 = (k8f) this.u;
                        y6a.M(obj);
                        j2 = 0;
                        fc2Var5 = jzc.a;
                        this.u = k8fVar5;
                        this.v = yu3Var4;
                        this.s = j8;
                        this.t = 10;
                        if (l6g.U(yu3Var4, fc2Var5, this) != lu3Var2) {
                        }
                        return lu3Var2;
                    case 10:
                        long j17 = this.s;
                        yu3 yu3Var9 = (yu3) this.v;
                        k8f k8fVar11 = (k8f) this.u;
                        y6a.M(obj);
                        yu3Var6 = yu3Var9;
                        j10 = j17;
                        k8fVar7 = k8fVar11;
                        j2 = 0;
                        if (l == null) {
                        }
                        return lu3Var2;
                    case 11:
                        k8fVar7 = (k8f) this.u;
                        y6a.M(obj);
                        O = obj;
                        ((bwh) O).getClass();
                        fzc fzcVar3 = new fzc();
                        this.u = null;
                        this.t = 12;
                        break;
                    case 12:
                    case 14:
                        y6a.M(obj);
                        return Unit.a;
                    case 13:
                        k8fVar7 = (k8f) this.u;
                        y6a.M(obj);
                        Q2 = obj;
                        if (!((bwh) Q2).w()) {
                            fzc fzcVar4 = new fzc();
                            this.u = null;
                            this.t = 14;
                            break;
                        }
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj6(lcd lcdVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, rq3 rq3Var) {
        super(2, rq3Var);
        this.B = lcdVar;
        this.y = linkedHashMap;
        this.z = linkedHashMap2;
    }
}
