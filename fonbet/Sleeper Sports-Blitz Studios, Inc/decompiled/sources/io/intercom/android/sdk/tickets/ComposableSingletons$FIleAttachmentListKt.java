package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FIleAttachmentList.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$FIleAttachmentListKt {
    public static final ComposableSingletons$FIleAttachmentListKt INSTANCE = new ComposableSingletons$FIleAttachmentListKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f360lambda1 = ComposableLambdaKt.composableLambdaInstance(1721837306, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope FileAttachment, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(FileAttachment, "$this$FileAttachment");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_alert_circle, composer, 0), "Error Icon", SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13104getError0d7_KjU(), composer, 440, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f361lambda2 = ComposableLambdaKt.composableLambdaInstance(597838424, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$FIleAttachmentListKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                FIleAttachmentListKt.FileAttachmentList(null, CollectionsKt.listOf((Object[]) new Ticket.TicketAttribute.FilesAttribute.File[]{new Ticket.TicketAttribute.FilesAttribute.File("", "image.png", "https://www.google.com", FileType.IMAGE), new Ticket.TicketAttribute.FilesAttribute.File("", "video.mp4", "https://www.google.com", FileType.VIDEO), new Ticket.TicketAttribute.FilesAttribute.File("", "attachment.pdf", "https://www.google.com", FileType.ATTACHMENT)}), composer, 0, 1);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m12810getLambda1$intercom_sdk_base_release() {
        return f360lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12811getLambda2$intercom_sdk_base_release() {
        return f361lambda2;
    }
}
