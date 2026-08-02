package io.intercom.android.sdk.m5.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HomeItem.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$HomeItemKt {
    public static final ComposableSingletons$HomeItemKt INSTANCE = new ComposableSingletons$HomeItemKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f101lambda1 = ComposableLambdaKt.composableLambdaInstance(887023412, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f102lambda2 = ComposableLambdaKt.composableLambdaInstance(-846171541, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HomeItemKt.HomeItem(null, Integer.valueOf(R.drawable.intercom_send_message_icon), null, null, Integer.valueOf(R.string.intercom_send_us_a_message), null, "Usual reply time is a few minutes", null, null, composer, 1572864, 429);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f103lambda3 = ComposableLambdaKt.composableLambdaInstance(-1955293658, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeItemKt.INSTANCE.m12066getLambda2$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f104lambda4 = ComposableLambdaKt.composableLambdaInstance(1484343804, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HomeItemKt.HomeItem(null, Integer.valueOf(R.drawable.intercom_messages_icon), null, null, null, "Messages", null, new HomeItemBadge.IndicatorWithCount(3), null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 349);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f105lambda5 = ComposableLambdaKt.composableLambdaInstance(565655585, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeItemKt.INSTANCE.m12068getLambda4$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f106lambda6 = ComposableLambdaKt.composableLambdaInstance(-1852008205, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HomeItemKt.HomeItem(null, Integer.valueOf(R.drawable.intercom_ticket_detail_icon), null, null, null, "Tickets", null, HomeItemBadge.IconWithIndicator.INSTANCE, null, composer, 12779520, 349);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f107lambda7 = ComposableLambdaKt.composableLambdaInstance(1166397998, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeItemKt.INSTANCE.m12070getLambda6$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f108lambda8 = ComposableLambdaKt.composableLambdaInstance(-1068101837, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                HomeItemKt.HomeItem(null, Integer.valueOf(R.drawable.intercom_ticket_detail_icon), null, null, null, "Tickets", null, HomeItemBadge.IconWithIndicator.INSTANCE, null, composer, 12779520, 349);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f109lambda9 = ComposableLambdaKt.composableLambdaInstance(835782680, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeItemKt.INSTANCE.m12072getLambda8$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12065getLambda1$intercom_sdk_base_release() {
        return f101lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12066getLambda2$intercom_sdk_base_release() {
        return f102lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12067getLambda3$intercom_sdk_base_release() {
        return f103lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12068getLambda4$intercom_sdk_base_release() {
        return f104lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12069getLambda5$intercom_sdk_base_release() {
        return f105lambda5;
    }

    /* renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12070getLambda6$intercom_sdk_base_release() {
        return f106lambda6;
    }

    /* renamed from: getLambda-7$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12071getLambda7$intercom_sdk_base_release() {
        return f107lambda7;
    }

    /* renamed from: getLambda-8$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12072getLambda8$intercom_sdk_base_release() {
        return f108lambda8;
    }

    /* renamed from: getLambda-9$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12073getLambda9$intercom_sdk_base_release() {
        return f109lambda9;
    }
}
