package io.intercom.android.sdk.m5.bubble;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomBubbleActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/bubble/IntercomBubbleActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomBubbleActivity extends ComponentActivity {
    public static final int $stable = 0;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(947575690, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity$onCreate$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    final IntercomBubbleActivity intercomBubbleActivity = IntercomBubbleActivity.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-397450188, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.bubble.IntercomBubbleActivity$onCreate$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Intent intent = IntercomBubbleActivity.this.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                            IntercomRootNavHostKt.IntercomRootNavHost(intent, IntercomBubbleActivity.this, composer2, 8);
                        }
                    }, composer, 54), composer, 3072, 7);
                } else {
                    composer.skipToGroupEnd();
                }
            }
        }), 1, null);
    }
}
