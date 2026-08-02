package X2;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class p {
    public static final h a(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "<this>");
        return new h(workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String, workSpec.getGeneration());
    }
}
