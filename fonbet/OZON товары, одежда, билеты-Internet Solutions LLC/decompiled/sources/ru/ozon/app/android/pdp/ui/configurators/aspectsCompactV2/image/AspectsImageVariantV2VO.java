package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.image;

import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$VariantV2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0001 BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\b\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\t\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$VariantV2;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "refreshDeeplink", "", "isSelected", "isAvailable", "isEnabled", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant;", "imageVariant", "isApparel", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZZZLWZ/t;Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant;Z)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Ljava/lang/String;", "getRefreshDeeplink", "()Ljava/lang/String;", "Z", "()Z", "()Ljava/lang/Boolean;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant;", "getImageVariant", "()Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant;", "ImageVariant", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsImageVariantV2VO implements AspectsCompactVO$VariantV2 {

    @NotNull
    private final ImageVariant imageVariant;
    private final boolean isApparel;
    private final boolean isAvailable;
    private final boolean isEnabled;
    private final boolean isSelected;

    @NotNull
    private final String refreshDeeplink;

    @NotNull
    private final OzonSpannableString title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant;", "", "<init>", "()V", "Image", "Color", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant$Color;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant$Image;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ImageVariant {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant$Color;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant;", "colors", "", "", "<init>", "(Ljava/util/List;)V", "getColors", "()Ljava/util/List;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Color extends ImageVariant {

            @NotNull
            private final List<Integer> colors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Color(@NotNull List<Integer> colors) {
                super(null);
                Intrinsics.checkNotNullParameter(colors, "colors");
                this.colors = colors;
            }

            @NotNull
            public final List<Integer> getColors() {
                return this.colors;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant$Image;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/image/AspectsImageVariantV2VO$ImageVariant;", "imageUrl", "", "<init>", "(Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Image extends ImageVariant {

            @NotNull
            private final String imageUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull String imageUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                this.imageUrl = imageUrl;
            }

            @NotNull
            public final String getImageUrl() {
                return this.imageUrl;
            }
        }

        public /* synthetic */ ImageVariant(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ImageVariant() {
        }
    }

    public AspectsImageVariantV2VO(@NotNull OzonSpannableString title, @NotNull String refreshDeeplink, boolean z11, boolean z12, boolean z13, t tVar, @NotNull ImageVariant imageVariant, boolean z14) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
        Intrinsics.checkNotNullParameter(imageVariant, "imageVariant");
        this.title = title;
        this.refreshDeeplink = refreshDeeplink;
        this.isSelected = z11;
        this.isAvailable = z12;
        this.isEnabled = z13;
        this.tokenizedEvent = tVar;
        this.imageVariant = imageVariant;
        this.isApparel = z14;
    }

    @NotNull
    public final ImageVariant getImageVariant() {
        return this.imageVariant;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    @NotNull
    public String getRefreshDeeplink() {
        return this.refreshDeeplink;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    @NotNull
    public OzonSpannableString getTitle() {
        return this.title;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    /* renamed from: isApparel, reason: from getter */
    public final boolean getIsApparel() {
        return this.isApparel;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    /* renamed from: isAvailable, reason: from getter */
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public Boolean isEnabled() {
        return Boolean.valueOf(this.isEnabled);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant
    /* renamed from: isSelected, reason: from getter */
    public boolean getIsSelected() {
        return this.isSelected;
    }

    public /* synthetic */ AspectsImageVariantV2VO(OzonSpannableString ozonSpannableString, String str, boolean z11, boolean z12, boolean z13, t tVar, ImageVariant imageVariant, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new OzonSpannableString() : ozonSpannableString, str, z11, z12, z13, tVar, imageVariant, z14);
    }
}
