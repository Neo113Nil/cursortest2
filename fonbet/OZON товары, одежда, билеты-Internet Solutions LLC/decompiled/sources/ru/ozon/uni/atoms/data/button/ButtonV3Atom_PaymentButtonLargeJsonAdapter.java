package ru.ozon.uni.atoms.data.button;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom_PaymentButtonLargeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge$PaymentButtonLargeStyle;", "nullablePaymentButtonLargeStyleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonV3Atom_PaymentButtonLargeJsonAdapter extends JsonAdapter<ButtonV3Atom.PaymentButtonLarge> {
    public static final int $stable = 8;
    private volatile Constructor<ButtonV3Atom.PaymentButtonLarge> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle> nullablePaymentButtonLargeStyleAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public ButtonV3Atom_PaymentButtonLargeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("theme", "style", "action", "text", "testInfo", "context", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle> f7 = moshi.f(ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullablePaymentButtonLargeStyleAdapter = f7;
        JsonAdapter<AtomActionDTO> f11 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f11;
        JsonAdapter<OzonSpannableString> f12 = moshi.f(OzonSpannableString.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f12;
        JsonAdapter<TestInfo> f13 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableTestInfoAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "context");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(53, "GeneratedJsonAdapter(ButtonV3Atom.PaymentButtonLarge)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonV3Atom.PaymentButtonLarge fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle paymentButtonLargeStyle = null;
        ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle paymentButtonLargeStyle2 = null;
        AtomActionDTO atomActionDTO = null;
        OzonSpannableString ozonSpannableString = null;
        TestInfo testInfo = null;
        String str = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    paymentButtonLargeStyle = this.nullablePaymentButtonLargeStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    paymentButtonLargeStyle2 = this.nullablePaymentButtonLargeStyleAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -127) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            String str2 = str;
            TestInfo testInfo2 = testInfo;
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            return new ButtonV3Atom.PaymentButtonLarge(paymentButtonLargeStyle, paymentButtonLargeStyle2, atomActionDTO, ozonSpannableString2, testInfo2, str2, map2);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        String str3 = str;
        TestInfo testInfo3 = testInfo;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle paymentButtonLargeStyle3 = paymentButtonLargeStyle2;
        ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle paymentButtonLargeStyle4 = paymentButtonLargeStyle;
        Constructor<ButtonV3Atom.PaymentButtonLarge> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ButtonV3Atom.PaymentButtonLarge.class.getDeclaredConstructor(ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.class, ButtonV3Atom.PaymentButtonLarge.PaymentButtonLargeStyle.class, AtomActionDTO.class, OzonSpannableString.class, TestInfo.class, String.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        ButtonV3Atom.PaymentButtonLarge newInstance = constructor.newInstance(paymentButtonLargeStyle4, paymentButtonLargeStyle3, atomActionDTO2, ozonSpannableString3, testInfo3, str3, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonV3Atom.PaymentButtonLarge value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("theme");
        this.nullablePaymentButtonLargeStyleAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("style");
        this.nullablePaymentButtonLargeStyleAdapter.mo44toJson(writer, (x) value_.getStyle());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("text");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
