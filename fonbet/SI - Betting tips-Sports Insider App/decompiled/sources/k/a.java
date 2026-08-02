package k;

import android.graphics.drawable.Animatable;
import androidx.vectordrawable.graphics.drawable.h;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends d5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18565a;

    /* renamed from: b, reason: collision with root package name */
    public final Animatable f18566b;

    public /* synthetic */ a(Animatable animatable, int i5) {
        this.f18565a = i5;
        this.f18566b = animatable;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void U() {
        switch (this.f18565a) {
            case 0:
                this.f18566b.start();
                break;
            default:
                ((h) this.f18566b).start();
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void V() {
        switch (this.f18565a) {
            case 0:
                this.f18566b.stop();
                break;
            default:
                ((h) this.f18566b).stop();
                break;
        }
    }
}
