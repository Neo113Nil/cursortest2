package t;

import C.C2698s;
import C.P;
import android.content.Context;
import androidx.camera.core.impl.F;
import java.util.Set;
import v.B0;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C9711b implements F.a {
    @Override // androidx.camera.core.impl.F.a
    public final B0 a(Context context, Object obj, Set set) {
        try {
            return new B0(context, obj, set);
        } catch (C2698s e11) {
            throw new P(e11);
        }
    }
}
