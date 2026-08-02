package ru.ozon.app.android.pikazon.glide.loaders;

import We.G;
import android.graphics.BitmapFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "performanceListener", "Lru/ozon/app/android/pikazon/glide/loaders/PerformanceListener;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PikazonStreamFetcher$onResponse$action$1 extends AbstractC7737t implements Function1<PerformanceListener, Unit> {
    final /* synthetic */ BitmapFactory.Options $options;
    final /* synthetic */ G $request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PikazonStreamFetcher$onResponse$action$1(G g10, BitmapFactory.Options options) {
        super(1);
        this.$request = g10;
        this.$options = options;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PerformanceListener performanceListener) {
        invoke2(performanceListener);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PerformanceListener performanceListener) {
        Intrinsics.checkNotNullParameter(performanceListener, "performanceListener");
        String a11 = this.$request.j().toString();
        PikazonUrlUUID pikazonUrlUUID = (PikazonUrlUUID) this.$request.i(PikazonUrlUUID.class);
        String uuid = pikazonUrlUUID != null ? pikazonUrlUUID.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        BitmapFactory.Options options = this.$options;
        int i11 = options.outWidth;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = options.outHeight;
        performanceListener.onResponse(a11, uuid, i11, i12 >= 0 ? i12 : 0);
    }
}
