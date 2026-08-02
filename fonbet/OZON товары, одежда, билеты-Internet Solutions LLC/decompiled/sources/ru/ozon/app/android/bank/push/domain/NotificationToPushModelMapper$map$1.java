package ru.ozon.app.android.bank.push.domain;

import android.app.PendingIntent;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import k90.AbstractC7611a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/core/app/l$d;", "invoke", "(Landroidx/core/app/l$d;)Landroidx/core/app/l$d;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class NotificationToPushModelMapper$map$1 extends AbstractC7737t implements Function1<l.d, l.d> {
    final /* synthetic */ PendingIntent $copyPendingIntent;
    final /* synthetic */ AbstractC7611a $notification;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationToPushModelMapper$map$1(AbstractC7611a abstractC7611a, PendingIntent pendingIntent) {
        super(1);
        this.$notification = abstractC7611a;
        this.$copyPendingIntent = pendingIntent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final l.d invoke(l.d extraConfiguration) {
        Intrinsics.checkNotNullParameter(extraConfiguration, "$this$extraConfiguration");
        extraConfiguration.f41967b.add(new l.a((IconCompat) null, ((AbstractC7611a.b) this.$notification).h(), this.$copyPendingIntent));
        Intrinsics.checkNotNullExpressionValue(extraConfiguration, "addAction(...)");
        return extraConfiguration;
    }
}
