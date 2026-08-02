package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityNotificationProvider", f = "ClickLiveActivityNotificationProvider.kt", l = {92}, m = "setImage")
/* loaded from: classes12.dex */
final class ClickLiveActivityNotificationProvider$setImage$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClickLiveActivityNotificationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickLiveActivityNotificationProvider$setImage$1(ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider, d<? super ClickLiveActivityNotificationProvider$setImage$1> dVar) {
        super(dVar);
        this.this$0 = clickLiveActivityNotificationProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object image;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        image = this.this$0.setImage(null, this);
        return image;
    }
}
