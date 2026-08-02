package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: PullRefreshIndicatorTransform.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pullRefreshIndicatorTransform", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "scale", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshIndicatorTransformKt {
    public static /* synthetic */ Modifier pullRefreshIndicatorTransform$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pullRefreshIndicatorTransform(modifier, pullRefreshState, z);
    }

    public static final Modifier pullRefreshIndicatorTransform(Modifier modifier, final PullRefreshState pullRefreshState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(modifier, new Function1() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit pullRefreshIndicatorTransform$lambda$1;
                pullRefreshIndicatorTransform$lambda$1 = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform$lambda$1((ContentDrawScope) obj);
                return pullRefreshIndicatorTransform$lambda$1;
            }
        }), new Function1() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit pullRefreshIndicatorTransform$lambda$2;
                pullRefreshIndicatorTransform$lambda$2 = PullRefreshIndicatorTransformKt.pullRefreshIndicatorTransform$lambda$2(PullRefreshState.this, z, (GraphicsLayerScope) obj);
                return pullRefreshIndicatorTransform$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullRefreshIndicatorTransform$lambda$1(ContentDrawScope contentDrawScope) {
        int m6028getIntersectrtfAjoo = ClipOp.INSTANCE.m6028getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo6539getSizeNHjbRc = drawContext.mo6539getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6542clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m6028getIntersectrtfAjoo);
            contentDrawScope.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo6540setSizeuvyYCjk(mo6539getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo6540setSizeuvyYCjk(mo6539getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pullRefreshIndicatorTransform$lambda$2(PullRefreshState pullRefreshState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setTranslationY(pullRefreshState.getPosition$material() - Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)));
        if (z && !pullRefreshState.getRefreshing$material()) {
            float transform = EasingKt.getLinearOutSlowInEasing().transform(pullRefreshState.getPosition$material() / pullRefreshState.getThreshold$material());
            if (transform < 0.0f) {
                transform = 0.0f;
            }
            if (transform > 1.0f) {
                transform = 1.0f;
            }
            graphicsLayerScope.setScaleX(transform);
            graphicsLayerScope.setScaleY(transform);
        }
        return Unit.INSTANCE;
    }
}
