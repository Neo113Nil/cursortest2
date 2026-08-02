package io.intercom.android.sdk.overlay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeCompatibilityUtil.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"isLegacyActivity", "", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "hideForLegacyActivity", "addAvatarIconToCompose", "", "lastAdmin", "Lio/intercom/android/sdk/models/Participant;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposeCompatibilityUtilKt {
    public static final boolean isLegacyActivity(ComposeView composeView) {
        if (composeView == null) {
            return true;
        }
        try {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(composeView);
            boolean z = (lifecycleOwner != null ? lifecycleOwner.getLifecycleRegistry() : null) == null;
            if (z) {
                Injector.get().getMetricTracker().receivedInAppOnLegacyActivity();
            }
            return z;
        } catch (Exception unused) {
            Injector.get().getMetricTracker().receivedInAppOnLegacyActivity();
            return true;
        }
    }

    public static final boolean hideForLegacyActivity(ComposeView composeView) {
        if (!isLegacyActivity(composeView)) {
            return false;
        }
        if (composeView == null) {
            return true;
        }
        composeView.setVisibility(8);
        return true;
    }

    public static final void addAvatarIconToCompose(ComposeView composeView, final Participant lastAdmin, final AppConfig appConfig) {
        Intrinsics.checkNotNullParameter(lastAdmin, "lastAdmin");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        if (composeView == null || isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(421691537, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    AppConfig appConfig2 = AppConfig.this;
                    final Participant participant = lastAdmin;
                    ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig2, ComposableLambdaKt.rememberComposableLambda(2111948784, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt$addAvatarIconToCompose$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                Avatar avatar = Participant.this.getAvatar();
                                Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                                Boolean isBot = Participant.this.isBot();
                                Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
                                AvatarIconKt.m12134AvatarIconRd90Nhg(null, new AvatarWrapper(avatar, isBot.booleanValue()), null, false, 0L, null, composer2, 64, 61);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composer, 54), composer, 56);
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }
}
