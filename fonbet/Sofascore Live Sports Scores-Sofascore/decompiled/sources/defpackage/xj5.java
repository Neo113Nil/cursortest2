package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.SplitInfo;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xj5 {
    public final e3c a;

    public xj5(ak5 ak5Var, e3c e3cVar) {
        this.a = e3cVar;
    }

    public static lyh a(SplitInfo splitInfo) {
        splitInfo.getClass();
        kyh kyhVar = kyh.c;
        ck5 ck5Var = dk5.a;
        ek5 ek5Var = ek5.b;
        fk5 fk5Var = new fk5(ck5Var, ek5Var, ek5Var, ek5Var);
        float splitRatio = splitInfo.getSplitRatio();
        kyh kyhVar2 = kyh.c;
        if (splitRatio != kyhVar2.b) {
            kyhVar2 = bea.I(splitRatio);
        }
        return new lyh(kyhVar2, jyh.c, fk5Var, i65.c);
    }

    public static ve c(ActivityStack activityStack) {
        activityStack.getClass();
        List activities = activityStack.getActivities();
        activities.getClass();
        return new ve(activities, activityStack.isEmpty(), null);
    }

    public static nyh d(SplitInfo splitInfo) {
        splitInfo.getClass();
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        primaryActivityStack.getClass();
        ve c = c(primaryActivityStack);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        secondaryActivityStack.getClass();
        return new nyh(c, c(secondaryActivityStack), a(splitInfo), null, null);
    }

    public final ActivityRule b(se seVar, Class cls) {
        Constructor constructor = ActivityRule.Builder.class.getConstructor(cls, cls);
        Set set = seVar.a;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(Activity.class);
        ph4 ph4Var = new ph4(2, set);
        e3c e3cVar = this.a;
        ActivityRule build = ((ActivityRule.Builder) constructor.newInstance(e3cVar.k(orCreateKotlinClass, ph4Var), e3cVar.k(fufVar.getOrCreateKotlinClass(Intent.class), new ph4(1, set)))).setShouldAlwaysExpand(true).build();
        build.getClass();
        return build;
    }
}
