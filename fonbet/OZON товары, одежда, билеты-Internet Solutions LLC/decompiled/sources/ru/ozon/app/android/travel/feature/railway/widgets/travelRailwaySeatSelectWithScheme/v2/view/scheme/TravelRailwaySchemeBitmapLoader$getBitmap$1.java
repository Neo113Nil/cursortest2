package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySchemeBitmapLoader$getBitmap$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ String $bitmapLink;
    final /* synthetic */ Function1<Bitmap, Unit> $callback;
    final /* synthetic */ Function1<Bitmap, Bitmap> $mutateExt;
    final /* synthetic */ TravelRailwaySchemeBitmapLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelRailwaySchemeBitmapLoader$getBitmap$1(Function1<? super Bitmap, Bitmap> function1, TravelRailwaySchemeBitmapLoader travelRailwaySchemeBitmapLoader, String str, Function1<? super Bitmap, Unit> function12) {
        super(1);
        this.$mutateExt = function1;
        this.this$0 = travelRailwaySchemeBitmapLoader;
        this.$bitmapLink = str;
        this.$callback = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        TravelRailwaySchemeBitmapLruCache travelRailwaySchemeBitmapLruCache;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap invoke = this.$mutateExt.invoke(bitmap);
        travelRailwaySchemeBitmapLruCache = this.this$0.bitmapCache;
        travelRailwaySchemeBitmapLruCache.set(this.$bitmapLink, invoke);
        Function1<Bitmap, Unit> function1 = this.$callback;
        if (function1 != null) {
            function1.invoke(invoke);
        }
    }
}
