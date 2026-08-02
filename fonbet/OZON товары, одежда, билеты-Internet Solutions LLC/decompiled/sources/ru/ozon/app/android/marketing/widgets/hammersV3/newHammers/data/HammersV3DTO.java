package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;", "products", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3BodyDTO;", "gradientHeader", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;", "<init>", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;Ljava/util/List;Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;)V", "getHeader", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;", "getProducts", "()Ljava/util/List;", "getGradientHeader", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;", "DtoFieldName", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3DTO {
    public static final int $stable = 8;
    private final HammersV3GradientHeaderDTO gradientHeader;
    private final HammersV3HeaderDTO header;

    @NotNull
    private final List<HammersV3BodyDTO> products;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3DTO$DtoFieldName;", "", "jsonName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsonName", "()Ljava/lang/String;", CommentV3DTO.HEADER_NAME, "GRADIENT_HEADER", "PRODUCTS", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DtoFieldName {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DtoFieldName[] $VALUES;

        @NotNull
        private final String jsonName;
        public static final DtoFieldName HEADER = new DtoFieldName(CommentV3DTO.HEADER_NAME, 0, CommentV3DTO.HEADER_FIELD_NAME);
        public static final DtoFieldName GRADIENT_HEADER = new DtoFieldName("GRADIENT_HEADER", 1, "gradientHeader");
        public static final DtoFieldName PRODUCTS = new DtoFieldName("PRODUCTS", 2, "products");

        private static final /* synthetic */ DtoFieldName[] $values() {
            return new DtoFieldName[]{HEADER, GRADIENT_HEADER, PRODUCTS};
        }

        static {
            DtoFieldName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DtoFieldName(String str, int i11, String str2) {
            this.jsonName = str2;
        }

        public static DtoFieldName valueOf(String str) {
            return (DtoFieldName) Enum.valueOf(DtoFieldName.class, str);
        }

        public static DtoFieldName[] values() {
            return (DtoFieldName[]) $VALUES.clone();
        }

        @NotNull
        public final String getJsonName() {
            return this.jsonName;
        }
    }

    public HammersV3DTO(HammersV3HeaderDTO hammersV3HeaderDTO, @NotNull List<HammersV3BodyDTO> products, HammersV3GradientHeaderDTO hammersV3GradientHeaderDTO) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.header = hammersV3HeaderDTO;
        this.products = products;
        this.gradientHeader = hammersV3GradientHeaderDTO;
    }

    public final HammersV3GradientHeaderDTO getGradientHeader() {
        return this.gradientHeader;
    }

    public final HammersV3HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<HammersV3BodyDTO> getProducts() {
        return this.products;
    }
}
