package l1;

import android.graphics.RenderEffect;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    private RenderEffect f72295a;

    @NotNull
    public final RenderEffect a() {
        RenderEffect renderEffect = this.f72295a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect b11 = b();
        this.f72295a = b11;
        return b11;
    }

    @NotNull
    protected abstract RenderEffect b();
}
