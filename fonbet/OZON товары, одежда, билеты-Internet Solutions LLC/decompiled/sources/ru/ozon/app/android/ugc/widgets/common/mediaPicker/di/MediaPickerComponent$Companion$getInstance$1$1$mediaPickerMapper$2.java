package ru.ozon.app.android.ugc.widgets.common.mediaPicker.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/core/MediaPickerMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MediaPickerComponent$Companion$getInstance$1$1$mediaPickerMapper$2 extends AbstractC7737t implements Function0<MediaPickerMapper> {
    final /* synthetic */ MediaPickerComponent$Companion$getInstance$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaPickerComponent$Companion$getInstance$1$1$mediaPickerMapper$2(MediaPickerComponent$Companion$getInstance$1$1 mediaPickerComponent$Companion$getInstance$1$1) {
        super(0);
        this.this$0 = mediaPickerComponent$Companion$getInstance$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MediaPickerMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        return new MediaPickerMapper(contextComponentDependencies.getContext(), this.this$0.getReviewFormRepository());
    }
}
