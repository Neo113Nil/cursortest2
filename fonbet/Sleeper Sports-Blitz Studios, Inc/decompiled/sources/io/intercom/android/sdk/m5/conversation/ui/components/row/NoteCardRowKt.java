package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoteCardRow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"NoteCardRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "part", "Lio/intercom/android/sdk/models/Part;", "companyName", "", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/models/Part;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "NoteCardRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NoteCardRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoteCardRow$lambda$0(Modifier modifier, Part part, String companyName, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(part, "$part");
        Intrinsics.checkNotNullParameter(companyName, "$companyName");
        NoteCardRow(modifier, part, companyName, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoteCardRowPreview$lambda$1(int i, Composer composer, int i2) {
        NoteCardRowPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NoteCardRow(Modifier modifier, final Part part, final String companyName, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Composer startRestartGroup = composer.startRestartGroup(-746207954);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        IntercomCardKt.IntercomCard(PaddingKt.m1158paddingVpY3zN4(modifier2, Dp.m8798constructorimpl(14), Dp.m8798constructorimpl(12)), IntercomCardStyle.INSTANCE.m12917conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, startRestartGroup, IntercomCardStyle.$stable << 15, 31), ComposableLambdaKt.rememberComposableLambda(2124316578, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt$NoteCardRow$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope IntercomCard, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    List<Block> blocks = Part.this.getBlocks();
                    Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
                    String forename = Part.this.getParticipant().getForename();
                    Intrinsics.checkNotNullExpressionValue(forename, "getForename(...)");
                    String str = companyName;
                    Avatar avatar = Part.this.getParticipant().getAvatar();
                    Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                    Boolean isBot = Part.this.getParticipant().isBot();
                    Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
                    PostCardRowKt.m12388PostContentFHprtrg(blocks, forename, str, new AvatarWrapper(avatar, isBot.booleanValue()), ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13089getAction0d7_KjU()), PaddingKt.m1157padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(16)), composer2, 200712, 0);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, (IntercomCardStyle.Style.$stable << 3) | 384, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NoteCardRow$lambda$0;
                    NoteCardRow$lambda$0 = NoteCardRowKt.NoteCardRow$lambda$0(Modifier.this, part, companyName, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return NoteCardRow$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void NoteCardRowPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1220886807);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NoteCardRowKt.INSTANCE.m12354getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NoteCardRowPreview$lambda$1;
                    NoteCardRowPreview$lambda$1 = NoteCardRowKt.NoteCardRowPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return NoteCardRowPreview$lambda$1;
                }
            });
        }
    }
}
