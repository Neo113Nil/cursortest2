package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto_CartButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CartButton$ButtonIcon;", "nullableButtonIconAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$AsyncFetchType;", "nullableAsyncFetchTypeAdapter", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$ButtonColors;", "nullableButtonColorsAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV4Dto_CartButtonJsonAdapter extends JsonAdapter<CartButtonV4Dto.CartButton> {
    public static final int $stable = 8;
    private volatile Constructor<CartButtonV4Dto.CartButton> constructorRef;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV4Dto.AsyncFetchType> nullableAsyncFetchTypeAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV4Dto.ButtonColors> nullableButtonColorsAdapter;

    @NotNull
    private final JsonAdapter<CartButtonV4Dto.CartButton.ButtonIcon> nullableButtonIconAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public CartButtonV4Dto_CartButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("button", "buttonIcon", "originalButtonText", "asyncFetchType", "priorityColors", "badge");
        M m11 = M.f71699a;
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "button");
        this.nullableButtonIconAdapter = moshi.f(CartButtonV4Dto.CartButton.ButtonIcon.class, m11, "buttonIcon");
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "originalButtonText");
        this.nullableAsyncFetchTypeAdapter = moshi.f(CartButtonV4Dto.AsyncFetchType.class, m11, "asyncFetchType");
        this.nullableButtonColorsAdapter = moshi.f(CartButtonV4Dto.ButtonColors.class, m11, "priorityColors");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(CartButtonV4Dto.CartButton)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CartButtonV4Dto.CartButton fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ButtonV3Atom.LargeButton largeButton = null;
        CartButtonV4Dto.CartButton.ButtonIcon buttonIcon = null;
        OzonSpannableString ozonSpannableString = null;
        CartButtonV4Dto.AsyncFetchType asyncFetchType = null;
        CartButtonV4Dto.ButtonColors buttonColors = null;
        BadgeDTO badgeDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 1:
                    buttonIcon = this.nullableButtonIconAdapter.fromJson(reader);
                    break;
                case 2:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("originalButtonText", "originalButtonText", reader);
                    }
                    i11 = -5;
                    break;
                case 3:
                    asyncFetchType = this.nullableAsyncFetchTypeAdapter.fromJson(reader);
                    break;
                case 4:
                    buttonColors = this.nullableButtonColorsAdapter.fromJson(reader);
                    break;
                case 5:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            CartButtonV4Dto.CartButton.ButtonIcon buttonIcon2 = buttonIcon;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            if (largeButton2 == null) {
                throw c.j("button", "button", reader);
            }
            Intrinsics.g(ozonSpannableString, "null cannot be cast to non-null type ru.ozon.uni.atoms.utils.OzonSpannableString");
            BadgeDTO badgeDTO2 = badgeDTO;
            return new CartButtonV4Dto.CartButton(largeButton2, buttonIcon2, ozonSpannableString, asyncFetchType, buttonColors, badgeDTO2);
        }
        CartButtonV4Dto.CartButton.ButtonIcon buttonIcon3 = buttonIcon;
        ButtonV3Atom.LargeButton largeButton3 = largeButton;
        Constructor<CartButtonV4Dto.CartButton> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CartButtonV4Dto.CartButton.class.getDeclaredConstructor(ButtonV3Atom.LargeButton.class, CartButtonV4Dto.CartButton.ButtonIcon.class, OzonSpannableString.class, CartButtonV4Dto.AsyncFetchType.class, CartButtonV4Dto.ButtonColors.class, BadgeDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<CartButtonV4Dto.CartButton> constructor2 = constructor;
        if (largeButton3 == null) {
            throw c.j("button", "button", reader);
        }
        CartButtonV4Dto.CartButton newInstance = constructor2.newInstance(largeButton3, buttonIcon3, ozonSpannableString, asyncFetchType, buttonColors, badgeDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CartButtonV4Dto.CartButton value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("buttonIcon");
        this.nullableButtonIconAdapter.mo44toJson(writer, (x) value.getButtonIcon());
        writer.w("originalButtonText");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getOriginalButtonText());
        writer.w("asyncFetchType");
        this.nullableAsyncFetchTypeAdapter.mo44toJson(writer, (x) value.getAsyncFetchType());
        writer.w("priorityColors");
        this.nullableButtonColorsAdapter.mo44toJson(writer, (x) value.getPriorityColors());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.p();
    }
}
