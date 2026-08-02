package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TeammateSheetContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$TeammateSheetContentKt {
    public static final ComposableSingletons$TeammateSheetContentKt INSTANCE = new ComposableSingletons$TeammateSheetContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f172lambda1 = ComposableLambdaKt.composableLambdaInstance(-1445246988, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                List listOf = CollectionsKt.listOf(new Header.Expanded.Body(Header.Expanded.Style.H1, "Body 1", null));
                AvatarType avatarType = AvatarType.FACEPILE;
                Avatar build = new Avatar.Builder().withInitials(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                Avatar build2 = new Avatar.Builder().withInitials("B").build();
                Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                Avatar build3 = new Avatar.Builder().withInitials("C").build();
                Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
                TeammateSheetContentKt.TeammateSheetContent(null, null, new ExpandedTeamPresenceState("Title", listOf, avatarType, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(build, false), new AvatarWrapper(build2, false), new AvatarWrapper(build3, false)}), CollectionsKt.emptyList(), CollectionsKt.emptyList(), false), composer, 512, 3);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f173lambda2 = ComposableLambdaKt.composableLambdaInstance(914081689, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TeammateSheetContentKt.INSTANCE.m12209getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12209getLambda1$intercom_sdk_base_release() {
        return f172lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12210getLambda2$intercom_sdk_base_release() {
        return f173lambda2;
    }
}
