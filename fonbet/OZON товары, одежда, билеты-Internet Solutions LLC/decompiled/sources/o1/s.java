package o1;

import android.view.RenderNode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f77593a = new s();

    public final int a(@NotNull RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(@NotNull RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(@NotNull RenderNode renderNode, int i11) {
        renderNode.setAmbientShadowColor(i11);
    }

    public final void d(@NotNull RenderNode renderNode, int i11) {
        renderNode.setSpotShadowColor(i11);
    }
}
