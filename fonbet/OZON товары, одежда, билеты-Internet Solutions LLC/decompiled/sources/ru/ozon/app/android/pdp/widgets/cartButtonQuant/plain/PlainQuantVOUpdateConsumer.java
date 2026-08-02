package ru.ozon.app.android.pdp.widgets.cartButtonQuant.plain;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonDeliveryUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonErrorUpdateKey;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVOUpdateConsumer;", "", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;", "", "asyncText", "updateWithAsyncText", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;Ljava/lang/CharSequence;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;", "updateWithRestoredOriginalText", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;", "LA00/a$J$a;", "update", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;)Lru/ozon/app/android/pdp/widgets/cartButtonQuant/plain/PlainQuantVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlainQuantVOUpdateConsumer {

    @NotNull
    public static final PlainQuantVOUpdateConsumer INSTANCE = new PlainQuantVOUpdateConsumer();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CartButtonQuantDto.AsyncFetchType.values().length];
            try {
                iArr[CartButtonQuantDto.AsyncFetchType.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartButtonQuantDto.AsyncFetchType.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PlainQuantVOUpdateConsumer() {
    }

    private final PlainQuantVO updateWithAsyncText(PlainQuantVO plainQuantVO, CharSequence charSequence) {
        OzonSpannableString orEmpty = OzonSpannableStringKt.orEmpty(charSequence != null ? OzonSpannableStringKt.toOzonSpannableString(charSequence) : null);
        CartButtonQuantDto.AsyncFetchType asyncFetchType = plainQuantVO.getAsyncFetchType();
        int i11 = asyncFetchType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[asyncFetchType.ordinal()];
        return PlainQuantVO.copy$default(plainQuantVO, 0L, i11 != 1 ? i11 != 2 ? plainQuantVO.getButton() : ButtonV3Atom.LargeButton.copy$default(plainQuantVO.getButton(), null, orEmpty, null, null, null, null, null, null, null, 509, null) : ButtonV3Atom.LargeButton.copy$default(plainQuantVO.getButton(), orEmpty, null, null, null, null, null, null, null, null, 510, null), null, null, null, false, null, 125, null);
    }

    private final PlainQuantVO updateWithRestoredOriginalText(PlainQuantVO plainQuantVO) {
        return plainQuantVO.getAsyncFetchType() != CartButtonQuantDto.AsyncFetchType.TITLE ? plainQuantVO : PlainQuantVO.copy$default(plainQuantVO, 0L, ButtonV3Atom.LargeButton.copy$default(plainQuantVO.getButton(), plainQuantVO.getOriginalButtonText(), null, null, null, null, null, null, null, null, 510, null), null, null, null, false, null, 125, null);
    }

    @NotNull
    public final PlainQuantVO invoke(@NotNull a.J.InterfaceC0007a update, @NotNull PlainQuantVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (!(update instanceof AsyncCartButtonDeliveryUpdateKey)) {
            return update instanceof AsyncCartButtonErrorUpdateKey ? updateWithRestoredOriginalText(oldVO) : oldVO;
        }
        AsyncCartButtonDeliveryUpdateKey.ButtonText firstButton = ((AsyncCartButtonDeliveryUpdateKey) update).getFirstButton();
        return updateWithAsyncText(oldVO, firstButton != null ? firstButton.getToCart() : null);
    }
}
