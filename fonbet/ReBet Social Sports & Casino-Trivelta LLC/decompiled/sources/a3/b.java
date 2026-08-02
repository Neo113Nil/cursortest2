package a3;

import Q2.AbstractC1508t;
import X2.e;
import X2.i;
import X2.p;
import X2.q;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15042a;

    static {
        String i10 = AbstractC1508t.i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f15042a = i10;
    }

    public static final String c(WorkSpec workSpec, String str, Integer num, String str2) {
        return '\n' + workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String + "\t " + workSpec.workerClassName + "\t " + num + "\t " + workSpec.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    public static final String d(i iVar, q qVar, e eVar, List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            SystemIdInfo a10 = eVar.a(p.a(workSpec));
            sb2.append(c(workSpec, CollectionsKt.joinToString$default(iVar.b(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String), ",", null, null, 0, null, null, 62, null), a10 != null ? Integer.valueOf(a10.systemId) : null, CollectionsKt.joinToString$default(qVar.a(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String), ",", null, null, 0, null, null, 62, null)));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
