package ru.ozon.app.android.videomolecule.presentation.viewholder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.videomolecule.presentation.viewholder.orientation.manual.ManualMoleculeOrientationDelegate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isActive", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoMoleculeViewHolder$1$6 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ VideoMoleculeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoMoleculeViewHolder$1$6(VideoMoleculeViewHolder videoMoleculeViewHolder) {
        super(1);
        this.this$0 = videoMoleculeViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ManualMoleculeOrientationDelegate manualMoleculeOrientationDelegate;
        ManualMoleculeOrientationDelegate manualMoleculeOrientationDelegate2;
        if (z11) {
            manualMoleculeOrientationDelegate2 = this.this$0.orientationDelegate;
            manualMoleculeOrientationDelegate2.forceChangeOrientation(0);
        } else {
            manualMoleculeOrientationDelegate = this.this$0.orientationDelegate;
            manualMoleculeOrientationDelegate.forceChangeOrientation(1);
        }
    }
}
