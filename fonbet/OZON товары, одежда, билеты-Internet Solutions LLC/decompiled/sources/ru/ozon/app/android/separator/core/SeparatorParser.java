package ru.ozon.app.android.separator.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004:\u0001\u0012B\u001d\b\u0007\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/separator/core/SeparatorParser;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Companion", "separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeparatorParser implements Function2<String, String, SeparatorDTO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final JsonParser jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/separator/core/SeparatorParser$Companion;", "", "<init>", "()V", "ERROR_MESSAGE", "", "separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SeparatorParser(@NotNull JsonParser jsonDeserializer, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.jsonDeserializer = jsonDeserializer;
        this.featureChecker = featureChecker;
    }

    @Override // kotlin.jvm.functions.Function2
    public SeparatorDTO invoke(String params, String state) {
        Integer height;
        SeparatorDTO separatorDTO = state != null ? (SeparatorDTO) this.jsonDeserializer.fromJson(state, SeparatorDTO.class) : null;
        if (separatorDTO != null && (height = separatorDTO.getHeight()) != null && height.intValue() == 0) {
            throw new IllegalStateException("height must not be null or 0");
        }
        if (!this.featureChecker.isEnabled(SeparatorHeightIsOptionalFlag.INSTANCE)) {
            if ((separatorDTO != null ? separatorDTO.getHeight() : null) == null) {
                throw new IllegalStateException("height must not be null or 0");
            }
        }
        return separatorDTO;
    }
}
