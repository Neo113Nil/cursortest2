package ru.ozon.app.android.session.userAdultModalMobileV2.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.ComposeAdultConfirmationViewHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/di/UserAdultConfirmationModuleV2;", "", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UserAdultConfirmationModuleV2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/di/UserAdultConfirmationModuleV2$Companion;", "", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "", "Ln20/i;", "provideComposeWidgets$session_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideComposeWidgets", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<i> provideComposeWidgets$session_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
            Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
            return e0.h(ComposeAdultConfirmationViewHolderKt.adultWidget(jsonDeserializer));
        }

        private Companion() {
        }
    }
}
