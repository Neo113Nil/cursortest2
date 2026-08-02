package io.intercom.android.sdk.post;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostActivityV2.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class PostActivityV2$onCreate$1$1$3$1$1 implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ Part $part;
    final /* synthetic */ PostActivityV2 this$0;

    PostActivityV2$onCreate$1$1$3$1$1(Part part, PostActivityV2 postActivityV2) {
        this.$part = part;
        this.this$0 = postActivityV2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope BottomBarContent, Composer composer, int i) {
        boolean isComposerVisible;
        Intrinsics.checkNotNullParameter(BottomBarContent, "$this$BottomBarContent");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ReactionReply.isNull(this.$part.getReactionReply())) {
                isComposerVisible = this.this$0.isComposerVisible();
                if (isComposerVisible) {
                    composer.startReplaceGroup(1851864191);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    final PostActivityV2 postActivityV2 = this.this$0;
                    Modifier m623clickableoSLSa3U$default = ClickableKt.m623clickableoSLSa3U$default(companion, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$3$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2;
                            invoke$lambda$2 = PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$2(PostActivityV2.this);
                            return invoke$lambda$2;
                        }
                    }, 15, null);
                    String string = this.this$0.getString(R.string.intercom_reply_to_conversation);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    TextKt.m3901TextNvy7gAk(string, m623clickableoSLSa3U$default, ColorKt.Color(4288585374L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04(), composer, 384, 0, 131064);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    final PostActivityV2 postActivityV22 = this.this$0;
                    Modifier m623clickableoSLSa3U$default2 = ClickableKt.m623clickableoSLSa3U$default(companion2, false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$3$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$3;
                            invoke$lambda$3 = PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$3(PostActivityV2.this);
                            return invoke$lambda$3;
                        }
                    }, 15, null);
                    String string2 = this.this$0.getString(R.string.intercom_send);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    TextKt.m3901TextNvy7gAk(string2, m623clickableoSLSa3U$default2, ColorKt.Color(4288585374L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04(), composer, 384, 0, 131064);
                    composer.endReplaceGroup();
                    return;
                }
                composer.startReplaceGroup(1852828291);
                composer.endReplaceGroup();
                return;
            }
            composer.startReplaceGroup(1850071740);
            final Part part = this.$part;
            final PostActivityV2 postActivityV23 = this.this$0;
            AndroidView_androidKt.AndroidView(new Function1() { // from class: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$3$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ReactionInputView invoke$lambda$1;
                    invoke$lambda$1 = PostActivityV2$onCreate$1$1$3$1$1.invoke$lambda$1(Part.this, postActivityV23, (Context) obj);
                    return invoke$lambda$1;
                }
            }, null, null, composer, 0, 6);
            composer.endReplaceGroup();
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$1(Part part, PostActivityV2 this$0, Context it) {
        String conversationId;
        Injector injector;
        Injector injector2;
        Intrinsics.checkNotNullParameter(part, "$part");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ReactionInputView reactionInputView = new ReactionInputView(it, null);
        reactionInputView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        MetricTracker.ReactionLocation reactionLocation = MetricTracker.ReactionLocation.IN_APP;
        String id = part.getId();
        conversationId = this$0.getConversationId();
        injector = this$0.getInjector();
        Api api = injector.getApi();
        injector2 = this$0.getInjector();
        reactionInputView.setUpReactions(part.getReactionReply(), true, new ConversationReactionListener(reactionLocation, id, conversationId, api, injector2.getMetricTracker()));
        return reactionInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(PostActivityV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openConversation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(PostActivityV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.openConversation();
        return Unit.INSTANCE;
    }
}
