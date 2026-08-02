package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.Composer;
import androidx.exifinterface.media.ExifInterface;
import io.ably.lib.transport.Defaults;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuickReplies.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$QuickRepliesKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$QuickRepliesKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$QuickRepliesKt$lambda1$1 INSTANCE = new ComposableSingletons$QuickRepliesKt$lambda1$1();

    ComposableSingletons$QuickRepliesKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            QuickRepliesKt.QuickReplies(CollectionsKt.listOf((Object[]) new QuickReply[]{new QuickReply("1", "Option 1"), new QuickReply(ExifInterface.GPS_MEASUREMENT_2D, "Option 2"), new QuickReply(ExifInterface.GPS_MEASUREMENT_3D, "Option 3"), new QuickReply(Defaults.ABLY_PROTOCOL_VERSION, "Option 4"), new QuickReply("5", "Option 5")}), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$QuickRepliesKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$QuickRepliesKt$lambda1$1.invoke$lambda$0((QuickReply) obj);
                    return invoke$lambda$0;
                }
            }, null, composer, 48, 4);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(QuickReply it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
