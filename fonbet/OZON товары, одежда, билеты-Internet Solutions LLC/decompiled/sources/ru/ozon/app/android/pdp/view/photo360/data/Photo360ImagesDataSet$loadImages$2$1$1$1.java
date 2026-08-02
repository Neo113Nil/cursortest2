package ru.ozon.app.android.pdp.view.photo360.data;

import Sc.s;
import Wc.a;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.image.ImageSizeDownsampleStrategy;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "Lkotlin/Pair;", "", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Lxe/M;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet$loadImages$2$1$1$1", f = "Photo360ImagesDataSet.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class Photo360ImagesDataSet$loadImages$2$1$1$1 extends j implements Function2<M, d<? super Pair<? extends String, ? extends Drawable>>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ int $index;
    final /* synthetic */ Photo360ImagesDataSet $this_runCatching;
    final /* synthetic */ String $url;
    final /* synthetic */ List<String> $urls;
    final /* synthetic */ int $width;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ImagesDataSet$loadImages$2$1$1$1(String str, Photo360ImagesDataSet photo360ImagesDataSet, List<String> list, int i11, int i12, int i13, d<? super Photo360ImagesDataSet$loadImages$2$1$1$1> dVar) {
        super(2, dVar);
        this.$url = str;
        this.$this_runCatching = photo360ImagesDataSet;
        this.$urls = list;
        this.$index = i11;
        this.$width = i12;
        this.$height = i13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new Photo360ImagesDataSet$loadImages$2$1$1$1(this.$url, this.$this_runCatching, this.$urls, this.$index, this.$width, this.$height, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Pair<? extends String, ? extends Drawable>> dVar) {
        return invoke2(m11, (d<? super Pair<String, ? extends Drawable>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object loadImage;
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            String str2 = this.$url;
            Photo360ImagesDataSet photo360ImagesDataSet = this.$this_runCatching;
            List<String> list = this.$urls;
            int i12 = this.$index;
            ImageSize imageSize = new ImageSize(this.$width, this.$height, ImageSizeDownsampleStrategy.AT_LEAST);
            this.L$0 = str2;
            this.label = 1;
            loadImage = photo360ImagesDataSet.loadImage(list, i12, imageSize, this);
            if (loadImage == aVar) {
                return aVar;
            }
            str = str2;
            obj = loadImage;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            s.b(obj);
        }
        return new Pair(str, obj);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super Pair<String, ? extends Drawable>> dVar) {
        return ((Photo360ImagesDataSet$loadImages$2$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
