package ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel;

import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class VideoMoleculeTimeBar$outerCornersClippingPath$2 extends C7735q implements Function0<Path> {
    VideoMoleculeTimeBar$outerCornersClippingPath$2(Object obj) {
        super(0, obj, VideoMoleculeTimeBar.class, "getClippingPath", "getClippingPath()Landroid/graphics/Path;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Path invoke() {
        Path clippingPath;
        clippingPath = ((VideoMoleculeTimeBar) this.receiver).getClippingPath();
        return clippingPath;
    }
}
