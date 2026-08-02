package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class UploadPhotosVH$delegate$1 extends C7735q implements Function1<List<? extends String>, Unit> {
    UploadPhotosVH$delegate$1(Object obj) {
        super(1, obj, UploadPhotosVH.class, "onUpdatePhotos", "onUpdatePhotos(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
        invoke2((List<String>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<String> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((UploadPhotosVH) this.receiver).onUpdatePhotos(p02);
    }
}
