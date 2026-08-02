package xe;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final long f25459a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f25460b;

    /* renamed from: c, reason: collision with root package name */
    public long f25461c;

    public g(long j, Function1 onSafeCLick) {
        Intrinsics.checkNotNullParameter(onSafeCLick, "onSafeCLick");
        this.f25459a = j;
        this.f25460b = onSafeCLick;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.f25461c < this.f25459a) {
            return;
        }
        this.f25461c = SystemClock.elapsedRealtime();
        this.f25460b.invoke(view);
    }
}
