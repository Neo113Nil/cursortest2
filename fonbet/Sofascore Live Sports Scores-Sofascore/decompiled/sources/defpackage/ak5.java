package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.AnimationBackground;
import androidx.window.extensions.embedding.DividerAttributes;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.reflection.Predicate2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ak5 {
    public static final String e;
    public final e3c a;
    public final xj5 b;
    public final yj5 c = new yj5(this);
    public final zj5 d = new zj5(this);

    static {
        duf.a.getOrCreateKotlinClass(ak5.class).getSimpleName();
        e = "ae-gen:";
        new Binder();
    }

    public ak5(e3c e3cVar) {
        this.a = e3cVar;
        this.b = new xj5(this, e3cVar);
    }

    public static lyh e(SplitAttributes splitAttributes) {
        kyh I;
        jyh jyhVar;
        splitAttributes.getClass();
        kyh kyhVar = kyh.c;
        ck5 ck5Var = dk5.a;
        ek5 ek5Var = ek5.b;
        fk5 fk5Var = new fk5(ck5Var, ek5Var, ek5Var, ek5Var);
        SplitAttributes.SplitType.RatioSplitType splitType = splitAttributes.getSplitType();
        splitType.getClass();
        if (splitType instanceof SplitAttributes.SplitType.HingeSplitType) {
            I = kyh.d;
        } else if (splitType instanceof SplitAttributes.SplitType.ExpandContainersSplitType) {
            I = kyh.c;
        } else {
            if (!(splitType instanceof SplitAttributes.SplitType.RatioSplitType)) {
                is8.c(splitType, "Unknown split type: ");
                return null;
            }
            I = bea.I(splitType.getRatio());
        }
        I.getClass();
        int layoutDirection = splitAttributes.getLayoutDirection();
        if (layoutDirection == 0) {
            jyhVar = jyh.d;
        } else if (layoutDirection == 1) {
            jyhVar = jyh.e;
        } else if (layoutDirection == 3) {
            jyhVar = jyh.c;
        } else if (layoutDirection == 4) {
            jyhVar = jyh.f;
        } else {
            if (layoutDirection != 5) {
                a70.p(ljg.j(layoutDirection, "Unknown layout direction: "));
                return null;
            }
            jyhVar = jyh.g;
        }
        int a = bl6.a();
        if (5 <= a && a < 7) {
            AnimationBackground animationBackground = splitAttributes.getAnimationBackground();
            animationBackground.getClass();
            fk5Var = new fk5(h(animationBackground), ek5Var, ek5Var, ek5Var);
        }
        if (bl6.a() >= 7) {
            AnimationBackground animationBackground2 = splitAttributes.getAnimationParams().getAnimationBackground();
            animationBackground2.getClass();
            fk5Var = new fk5(h(animationBackground2), i(splitAttributes.getAnimationParams().getOpenAnimationResId()), i(splitAttributes.getAnimationParams().getCloseAnimationResId()), i(splitAttributes.getAnimationParams().getChangeAnimationResId()));
        }
        return new lyh(I, jyhVar, fk5Var, bl6.a() >= 6 ? j(splitAttributes.getDividerAttributes()) : i65.c);
    }

    public static dk5 h(AnimationBackground animationBackground) {
        int a = bl6.a();
        if (a >= 5) {
            return animationBackground instanceof AnimationBackground.ColorBackground ? new bk5(((AnimationBackground.ColorBackground) animationBackground).getColor()) : dk5.a;
        }
        a70.m(dmi.k(5, a, "This API requires extension version ", ", but the device is on "));
        return null;
    }

    public static ek5 i(int i) {
        int a = bl6.a();
        if (a >= 7) {
            return i == 0 ? ek5.c : ek5.b;
        }
        a70.m(dmi.k(7, a, "This API requires extension version ", ", but the device is on "));
        return null;
    }

    public static i65 j(DividerAttributes dividerAttributes) {
        int a = bl6.a();
        if (a < 6) {
            a70.m(dmi.k(6, a, "This API requires extension version ", ", but the device is on "));
            return null;
        }
        if (dividerAttributes == null) {
            return i65.c;
        }
        int dividerType = dividerAttributes.getDividerType();
        if (dividerType == 1) {
            int widthDp = dividerAttributes.getWidthDp();
            if (widthDp != -1 && widthDp < 0) {
                ogj.h(ljg.j(widthDp, "widthDp must be greater than or equal to 0 or WIDTH_SYSTEM_DEFAULT. Got: "));
                return null;
            }
            int dividerColor = dividerAttributes.getDividerColor();
            if ((dividerColor >>> 24) == 255) {
                return new h65(widthDp, dividerColor);
            }
            ogj.h(bf3.i(dividerColor, new StringBuilder("Divider color must be opaque. Got: ")));
            return null;
        }
        if (dividerType == 2) {
            int widthDp2 = dividerAttributes.getWidthDp();
            if (widthDp2 != -1 && widthDp2 < 0) {
                ogj.h(ljg.j(widthDp2, "widthDp must be greater than or equal to 0 or WIDTH_SYSTEM_DEFAULT. Got: "));
                return null;
            }
            int dividerColor2 = dividerAttributes.getDividerColor();
            if ((dividerColor2 >>> 24) == 255) {
                return new g65(widthDp2, dividerColor2, (dividerAttributes.getPrimaryMinRatio() == -1.0f && dividerAttributes.getPrimaryMaxRatio() == -1.0f) ? f65.a : new e65(dividerAttributes.getPrimaryMinRatio(), dividerAttributes.getPrimaryMaxRatio()), bl6.a() >= 7 && dividerAttributes.isDraggingToFullscreenAllowed());
            }
            ogj.h(bf3.i(dividerColor2, new StringBuilder("Divider color must be opaque. Got: ")));
            return null;
        }
        dividerAttributes.toString();
        int widthDp3 = dividerAttributes.getWidthDp();
        if (widthDp3 != -1 && widthDp3 < 0) {
            ogj.h(ljg.j(widthDp3, "widthDp must be greater than or equal to 0 or WIDTH_SYSTEM_DEFAULT. Got: "));
            return null;
        }
        int dividerColor3 = dividerAttributes.getDividerColor();
        if ((dividerColor3 >>> 24) == 255) {
            return new h65(widthDp3, dividerColor3);
        }
        ogj.h(bf3.i(dividerColor3, new StringBuilder("Divider color must be opaque. Got: ")));
        return null;
    }

    public final nyh a(SplitInfo splitInfo) {
        int a = bl6.a();
        if (a == 1) {
            this.b.getClass();
            return xj5.d(splitInfo);
        }
        if (a == 2) {
            return this.c.a(splitInfo);
        }
        if (3 <= a && a < 5) {
            return this.d.a(splitInfo);
        }
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        primaryActivityStack.getClass();
        ve d = d(primaryActivityStack);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        secondaryActivityStack.getClass();
        ve d2 = d(secondaryActivityStack);
        SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
        splitAttributes.getClass();
        lyh e2 = e(splitAttributes);
        SplitInfo.Token splitInfoToken = splitInfo.getSplitInfoToken();
        splitInfoToken.getClass();
        return new nyh(d, d2, e2, null, splitInfoToken);
    }

    public final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((SplitInfo) it.next()));
        }
        return arrayList;
    }

    public final Set c(Context context, Set set) {
        Class<?> cls;
        context.getClass();
        set.getClass();
        try {
            cls = ((ClassLoader) this.a.b).loadClass("java.util.function.Predicate");
            cls.getClass();
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return rm5.a;
        }
        Set<lk5> set2 = set;
        ArrayList arrayList = new ArrayList(k13.r(set2, 10));
        for (lk5 lk5Var : set2) {
            if (!(lk5Var instanceof se)) {
                a70.p("Unsupported rule type");
                return null;
            }
            arrayList.add(g((se) lk5Var, cls));
        }
        return CollectionsKt.W0(arrayList);
    }

    public final ve d(ActivityStack activityStack) {
        activityStack.getClass();
        int a = bl6.a();
        if (1 <= a && a < 5) {
            this.b.getClass();
            return xj5.c(activityStack);
        }
        List activities = activityStack.getActivities();
        activities.getClass();
        return new ve(activities, activityStack.isEmpty(), activityStack.getActivityStackToken());
    }

    public final ArrayList f(List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d((ActivityStack) it.next()));
        }
        return arrayList;
    }

    public final ActivityRule g(final se seVar, Class cls) {
        if (bl6.a() < 2) {
            return this.b.b(seVar, cls);
        }
        final int i = 0;
        final int i2 = 1;
        ActivityRule.Builder shouldAlwaysExpand = new ActivityRule.Builder(new Predicate2() { // from class: wj5
            @Override // androidx.window.reflection.Predicate2
            public final boolean test(Object obj) {
                int i3 = i;
                se seVar2 = seVar;
                switch (i3) {
                    case 0:
                        Activity activity = (Activity) obj;
                        activity.getClass();
                        Set set = seVar2.a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                if (((gd) it.next()).a(activity)) {
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        Intent intent = (Intent) obj;
                        intent.getClass();
                        Set set2 = seVar2.a;
                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                            Iterator it2 = set2.iterator();
                            while (it2.hasNext()) {
                                if (((gd) it2.next()).b(intent)) {
                                    break;
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        }, new Predicate2() { // from class: wj5
            @Override // androidx.window.reflection.Predicate2
            public final boolean test(Object obj) {
                int i3 = i2;
                se seVar2 = seVar;
                switch (i3) {
                    case 0:
                        Activity activity = (Activity) obj;
                        activity.getClass();
                        Set set = seVar2.a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                if (((gd) it.next()).a(activity)) {
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        Intent intent = (Intent) obj;
                        intent.getClass();
                        Set set2 = seVar2.a;
                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                            Iterator it2 = set2.iterator();
                            while (it2.hasNext()) {
                                if (((gd) it2.next()).b(intent)) {
                                    break;
                                }
                            }
                        }
                        break;
                }
                return false;
            }
        }).setShouldAlwaysExpand(true);
        shouldAlwaysExpand.getClass();
        String a = seVar.a();
        if (a == null) {
            a = e + Integer.toHexString(seVar.hashCode());
        }
        shouldAlwaysExpand.setTag(a);
        ActivityRule build = shouldAlwaysExpand.build();
        build.getClass();
        return build;
    }
}
