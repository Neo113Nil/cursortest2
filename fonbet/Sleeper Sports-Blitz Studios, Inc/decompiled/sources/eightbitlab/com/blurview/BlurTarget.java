package eightbitlab.com.blurview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes8.dex */
public class BlurTarget extends FrameLayout {
    static final boolean canUseHardwareRendering;
    RenderNode renderNode;

    static {
        canUseHardwareRendering = Build.VERSION.SDK_INT >= 31;
    }

    public BlurTarget(Context context) {
        super(context);
        if (canUseHardwareRendering) {
            this.renderNode = ComponentDialog$$ExternalSyntheticApiModelOutline0.m("BlurViewHost node");
        }
    }

    public BlurTarget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (canUseHardwareRendering) {
            this.renderNode = ComponentDialog$$ExternalSyntheticApiModelOutline0.m("BlurViewHost node");
        }
    }

    public BlurTarget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (canUseHardwareRendering) {
            this.renderNode = ComponentDialog$$ExternalSyntheticApiModelOutline0.m("BlurViewHost node");
        }
    }

    public BlurTarget(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (canUseHardwareRendering) {
            this.renderNode = ComponentDialog$$ExternalSyntheticApiModelOutline0.m("BlurViewHost node");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        RecordingCanvas beginRecording;
        if (canUseHardwareRendering && canvas.isHardwareAccelerated()) {
            this.renderNode.setPosition(0, 0, getWidth(), getHeight());
            beginRecording = this.renderNode.beginRecording();
            super.dispatchDraw(beginRecording);
            this.renderNode.endRecording();
            canvas.drawRenderNode(this.renderNode);
            return;
        }
        super.dispatchDraw(canvas);
    }
}
