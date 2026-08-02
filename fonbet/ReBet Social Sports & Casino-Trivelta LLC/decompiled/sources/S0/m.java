package S0;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class m extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f10530a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f10530a = fragment;
    }

    public final Fragment a() {
        return this.f10530a;
    }
}
