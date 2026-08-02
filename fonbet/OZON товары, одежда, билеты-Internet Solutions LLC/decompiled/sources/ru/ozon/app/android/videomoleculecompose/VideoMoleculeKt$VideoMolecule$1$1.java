package ru.ozon.app.android.videomoleculecompose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.videomoleculecompose.util.VideoMoleculeTimeFormatter;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class VideoMoleculeKt$VideoMolecule$1$1 extends C7735q implements Function1<Long, String> {
    VideoMoleculeKt$VideoMolecule$1$1(Object obj) {
        super(1, obj, VideoMoleculeTimeFormatter.class, "format", "format(J)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Long l11) {
        return invoke(l11.longValue());
    }

    public final String invoke(long j11) {
        return ((VideoMoleculeTimeFormatter) this.receiver).format(j11);
    }
}
