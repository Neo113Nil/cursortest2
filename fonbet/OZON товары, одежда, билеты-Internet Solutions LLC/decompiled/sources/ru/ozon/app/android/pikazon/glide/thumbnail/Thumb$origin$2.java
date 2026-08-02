package ru.ozon.app.android.pikazon.glide.thumbnail;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class Thumb$origin$2 extends AbstractC7737t implements Function0<PikazonUrl> {
    final /* synthetic */ Thumb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Thumb$origin$2(Thumb thumb) {
        super(0);
        this.this$0 = thumb;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PikazonUrl invoke() {
        return new PikazonUrl(this.this$0.getUrl(), this.this$0.getUuid());
    }
}
