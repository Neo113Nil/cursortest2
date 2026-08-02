package ru.ozon.app.android.storefront.data.tiles.blur;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "", "sharedContentKey", "", "blurPlaceholderImage", "blurType", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO$BlurType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO$BlurType;)V", "getSharedContentKey", "()Ljava/lang/String;", "getBlurPlaceholderImage", "getBlurType", "()Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO$BlurType;", "BlurType", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlurMoleculeDTO {
    private final String blurPlaceholderImage;
    private final BlurType blurType;
    private final String sharedContentKey;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO$BlurType;", "", "<init>", "(Ljava/lang/String;I)V", "ADULT", "ALWAYS", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class BlurType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BlurType[] $VALUES;
        public static final BlurType ADULT = new BlurType("ADULT", 0);
        public static final BlurType ALWAYS = new BlurType("ALWAYS", 1);

        private static final /* synthetic */ BlurType[] $values() {
            return new BlurType[]{ADULT, ALWAYS};
        }

        static {
            BlurType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BlurType(String str, int i11) {
        }

        @NotNull
        public static a<BlurType> getEntries() {
            return $ENTRIES;
        }

        public static BlurType valueOf(String str) {
            return (BlurType) Enum.valueOf(BlurType.class, str);
        }

        public static BlurType[] values() {
            return (BlurType[]) $VALUES.clone();
        }
    }

    public BlurMoleculeDTO(String str, String str2, BlurType blurType) {
        this.sharedContentKey = str;
        this.blurPlaceholderImage = str2;
        this.blurType = blurType;
    }

    public final String getBlurPlaceholderImage() {
        return this.blurPlaceholderImage;
    }

    public final BlurType getBlurType() {
        return this.blurType;
    }

    public final String getSharedContentKey() {
        return this.sharedContentKey;
    }
}
