package ru.ozon.android.messenger.blocks.notification;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.databinding.MBlockNotificationBinding;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function1<Bitmap, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f85915b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MBlockNotificationBinding f85916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, MBlockNotificationBinding mBlockNotificationBinding) {
        super(1);
        this.f85915b = hVar;
        this.f85916c = mBlockNotificationBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
        h.f(this.f85915b, bitmap2);
        this.f85916c.imageIv.setImageBitmap(bitmap2);
        return Unit.f71690a;
    }
}
