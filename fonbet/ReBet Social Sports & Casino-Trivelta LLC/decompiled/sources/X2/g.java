package X2;

import androidx.work.impl.model.SystemIdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {
    public static final SystemIdInfo a(h generationalId, int i10) {
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.b(), generationalId.a(), i10);
    }
}
