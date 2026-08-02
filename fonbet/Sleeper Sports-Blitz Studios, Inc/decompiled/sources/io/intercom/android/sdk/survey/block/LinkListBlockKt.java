package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.henninghall.date_picker.props.TextColorProp;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkListBlock.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LinkListBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "block", "Lio/intercom/android/sdk/blocks/lib/models/Block;", TextColorProp.name, "Landroidx/compose/ui/graphics/Color;", "conversationId", "", "LinkListBlock-cf5BqRc", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/blocks/lib/models/Block;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LinkListBlockKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkListBlock_cf5BqRc$lambda$0(Modifier modifier, Block block, long j, String conversationId, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(conversationId, "$conversationId");
        m12671LinkListBlockcf5BqRc(modifier, block, j, conversationId, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: LinkListBlock-cf5BqRc, reason: not valid java name */
    public static final void m12671LinkListBlockcf5BqRc(Modifier modifier, final Block block, final long j, final String conversationId, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Composer startRestartGroup = composer.startRestartGroup(-1519911583);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        IntercomCardKt.IntercomCard(modifier2, IntercomCardStyle.INSTANCE.m12917conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, startRestartGroup, IntercomCardStyle.$stable << 15, 31), ComposableLambdaKt.rememberComposableLambda(-46303019, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.LinkListBlockKt$LinkListBlock$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope IntercomCard, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    BlockViewKt.m12659RenderLegacyBlockssW7UJKQ(Block.this, j, null, conversationId, composer2, 8, 4);
                } else {
                    composer2.skipToGroupEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, (i & 14) | 384 | (IntercomCardStyle.Style.$stable << 3), 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.block.LinkListBlockKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LinkListBlock_cf5BqRc$lambda$0;
                    LinkListBlock_cf5BqRc$lambda$0 = LinkListBlockKt.LinkListBlock_cf5BqRc$lambda$0(Modifier.this, block, j, conversationId, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return LinkListBlock_cf5BqRc$lambda$0;
                }
            });
        }
    }
}
