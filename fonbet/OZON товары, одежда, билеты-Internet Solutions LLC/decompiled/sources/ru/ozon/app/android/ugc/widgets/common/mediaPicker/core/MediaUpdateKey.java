package ru.ozon.app.android.ugc.widgets.common.mediaPicker.core;

import A00.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaUpdateKey;", "LA00/a$J$a;", "", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "media", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getMedia", "()Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final List<MediaPickerVO.MediaVO> media;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaUpdateKey(@NotNull List<? extends MediaPickerVO.MediaVO> media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.media = media;
    }

    @NotNull
    public final List<MediaPickerVO.MediaVO> getMedia() {
        return this.media;
    }
}
