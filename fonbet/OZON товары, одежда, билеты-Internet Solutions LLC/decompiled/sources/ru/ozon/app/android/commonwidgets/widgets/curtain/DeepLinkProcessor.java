package ru.ozon.app.android.commonwidgets.widgets.curtain;

import Sc.InterfaceC4008j;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/DeepLinkProcessor;", "", "<init>", "()V", "processDeepLink", "", "deeplinkString", "Companion", "commonwidgets_prodGoogleAllVendorsRelease", "isStoryLink", "", "isExpressLink", "isFashionLink", "isAuthLink", "isModalx", "isMorkovskGameapp"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeepLinkProcessor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/DeepLinkProcessor$Companion;", "", "<init>", "()V", "MORKOVSK_GAMEAPP", "", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static final boolean processDeepLink$lambda$0(InterfaceC4008j<Boolean> interfaceC4008j) {
        return interfaceC4008j.getValue().booleanValue();
    }

    private static final boolean processDeepLink$lambda$1(InterfaceC4008j<Boolean> interfaceC4008j) {
        return interfaceC4008j.getValue().booleanValue();
    }

    private static final boolean processDeepLink$lambda$2(InterfaceC4008j<Boolean> interfaceC4008j) {
        return interfaceC4008j.getValue().booleanValue();
    }

    private static final boolean processDeepLink$lambda$3(InterfaceC4008j<Boolean> interfaceC4008j) {
        return interfaceC4008j.getValue().booleanValue();
    }

    private static final boolean processDeepLink$lambda$4(InterfaceC4008j<Boolean> interfaceC4008j) {
        return interfaceC4008j.getValue().booleanValue();
    }

    private static final boolean processDeepLink$lambda$5(InterfaceC4008j<Boolean> interfaceC4008j) {
        return interfaceC4008j.getValue().booleanValue();
    }

    @NotNull
    public final String processDeepLink(@NotNull String deeplinkString) {
        Intrinsics.checkNotNullParameter(deeplinkString, "deeplinkString");
        Uri parse = Uri.parse(deeplinkString);
        InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new DeepLinkProcessor$processDeepLink$isStoryLink$2(parse));
        return (processDeepLink$lambda$3(LazyUtilsKt.unsafeLazy(new DeepLinkProcessor$processDeepLink$isAuthLink$2(parse))) || processDeepLink$lambda$1(LazyUtilsKt.unsafeLazy(new DeepLinkProcessor$processDeepLink$isExpressLink$2(parse))) || processDeepLink$lambda$0(unsafeLazy) || processDeepLink$lambda$4(LazyUtilsKt.unsafeLazy(new DeepLinkProcessor$processDeepLink$isModalx$2(parse))) || processDeepLink$lambda$2(LazyUtilsKt.unsafeLazy(new DeepLinkProcessor$processDeepLink$isFashionLink$2(parse))) || processDeepLink$lambda$5(LazyUtilsKt.unsafeLazy(new DeepLinkProcessor$processDeepLink$isMorkovskGameapp$2(parse)))) ? deeplinkString : "";
    }
}
