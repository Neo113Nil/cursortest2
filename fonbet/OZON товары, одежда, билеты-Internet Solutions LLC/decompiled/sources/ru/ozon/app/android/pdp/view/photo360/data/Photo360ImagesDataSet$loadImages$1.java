package ru.ozon.app.android.pdp.view.photo360.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet", f = "Photo360ImagesDataSet.kt", l = {DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "loadImages")
/* loaded from: classes13.dex */
final class Photo360ImagesDataSet$loadImages$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Photo360ImagesDataSet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ImagesDataSet$loadImages$1(Photo360ImagesDataSet photo360ImagesDataSet, d<? super Photo360ImagesDataSet$loadImages$1> dVar) {
        super(dVar);
        this.this$0 = photo360ImagesDataSet;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.loadImages(0, 0, null, this);
    }
}
