package ru.ozon.app.android.checkoutcomposer.total;

import e10.AbstractC6252b;
import j20.C7244b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.checkoutcomposer.total.models.TotalDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/TotalConfig;", "Le10/b;", "Lru/ozon/app/android/composer/widgets/base/config/list/ListConfig;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "deserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lj20/b;", "state", "", "", "parse", "(Lj20/b;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TotalConfig extends AbstractC6252b {

    @NotNull
    private final JsonParser deserializer;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final List<String> VERTICALS = C7714v.b0("checkoutFacade", "cart");

    @NotNull
    private static final long[] SUPPORTED_VERSIONS = {2};

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/TotalConfig$Companion;", "", "<init>", "()V", "CART_VERTICAL", "", "VERTICALS", "", "getVERTICALS", "()Ljava/util/List;", "COMPONENT", "SUPPORTED_VERSIONS", "", "getSUPPORTED_VERSIONS", "()[J", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final long[] getSUPPORTED_VERSIONS() {
            return TotalConfig.SUPPORTED_VERSIONS;
        }

        @NotNull
        public final List<String> getVERTICALS() {
            return TotalConfig.VERTICALS;
        }

        private Companion() {
        }
    }

    public TotalConfig(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.deserializer = deserializer;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public List<? extends Object> parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TotalDTO totalDTO = (TotalDTO) this.deserializer.fromJson(state.b(), TotalDTO.class);
        Object[] elements = {totalDTO.getSticky(), totalDTO.getProgressBar(), totalDTO};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.B(elements);
    }
}
