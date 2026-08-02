package ru.ozon.app.android.bank.widgets.bankAccountStatus.data;

import Ak.b;
import Fj.c;
import N3.C3660k;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.proto.OneOfSignature;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/bank/widgets/bankAccountStatus/data/BankAccountStatusDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/bank/widgets/bankAccountStatus/data/BankAccountStatusDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/bank/widgets/bankAccountStatus/data/BankAccountStatusDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/bank/widgets/bankAccountStatus/data/BankAccountStatusDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "socialTextAtomDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableAtomDTOAtProtoOneOfAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankAccountStatusDTOJsonAdapter extends JsonAdapter<BankAccountStatusDTO> {
    private volatile Constructor<BankAccountStatusDTO> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomDTO> nullableAtomDTOAtProtoOneOfAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<SocialTextAtomDTO> socialTextAtomDTOAdapter;

    public BankAccountStatusDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("titleTextAtom", "subTitleTextAtom", "smallButton", "action", "trackingInfo", "descriptionTextAtom", "backgroundColor", "widgetBackground", "atom");
        M m11 = M.f71699a;
        this.socialTextAtomDTOAdapter = moshi.f(SocialTextAtomDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subTitle");
        this.nullableSmallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "button");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        final d b11 = N.b(TextAtom.class);
        final String str = "textAtom";
        final String str2 = "";
        OneOfSignature oneOfSignature = new OneOfSignature(str, str2, b11) { // from class: ru.ozon.app.android.bank.widgets.bankAccountStatus.data.BankAccountStatusDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str;
                this.fieldName = str2;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature2 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature2.name()) && Intrinsics.d(fieldName(), oneOfSignature2.fieldName()) && N.b(type()).equals(N.b(oneOfSignature2.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str3 = this.name;
                String str4 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str3, ", fieldName=", str4, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b12 = N.b(Badge.class);
        final String str3 = "badge";
        final OneOfSignature[] oneOfSignatureArr = {oneOfSignature, new OneOfSignature(str3, str2, b12) { // from class: ru.ozon.app.android.bank.widgets.bankAccountStatus.data.BankAccountStatusDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_OneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str3, "name");
                Intrinsics.checkNotNullParameter(str2, "fieldName");
                Intrinsics.checkNotNullParameter(b12, "type");
                this.name = str3;
                this.fieldName = str2;
                this.type = C6345a.b(b12);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return OneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof OneOfSignature)) {
                    return false;
                }
                OneOfSignature oneOfSignature2 = (OneOfSignature) obj;
                return Intrinsics.d(name(), oneOfSignature2.name()) && Intrinsics.d(fieldName(), oneOfSignature2.fieldName()) && N.b(type()).equals(N.b(oneOfSignature2.type()));
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str32 = this.name;
                String str4 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.app.android.atoms.proto.OneOfSignature(name=", str32, ", fieldName=", str4, ", type="), this.type, ")");
            }

            @Override // ru.ozon.app.android.atoms.proto.OneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        final String str4 = "type";
        this.nullableAtomDTOAtProtoOneOfAdapter = moshi.f(AtomDTO.class, e0.h(new ProtoOneOf(str4, oneOfSignatureArr) { // from class: ru.ozon.app.android.bank.widgets.bankAccountStatus.data.BankAccountStatusDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_proto_ProtoOneOf$0
            private final /* synthetic */ String label;
            private final /* synthetic */ OneOfSignature[] signatures;

            {
                Intrinsics.checkNotNullParameter(str4, "label");
                Intrinsics.checkNotNullParameter(oneOfSignatureArr, "signatures");
                this.label = str4;
                this.signatures = oneOfSignatureArr;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOf)) {
                    return false;
                }
                ProtoOneOf protoOneOf = (ProtoOneOf) obj;
                return Intrinsics.d(label(), protoOneOf.label()) && Arrays.equals(signatures(), protoOneOf.signatures());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.label.hashCode() ^ 161479436) + (Arrays.hashCode(this.signatures) ^ 453631685);
            }

            @Override // ru.ozon.app.android.atoms.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // ru.ozon.app.android.atoms.proto.ProtoOneOf
            public final /* synthetic */ OneOfSignature[] signatures() {
                return this.signatures;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return e.a("@ru.ozon.app.android.atoms.proto.ProtoOneOf(label=", this.label, ", signatures=", Arrays.toString(this.signatures), ")");
            }
        }), "atom");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(BankAccountStatusDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BankAccountStatusDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        SocialTextAtomDTO socialTextAtomDTO = null;
        TextAtom textAtom = null;
        ButtonV3Atom.SmallButton smallButton = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TextAtom textAtom2 = null;
        String str = null;
        String str2 = null;
        AtomDTO atomDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    socialTextAtomDTO = this.socialTextAtomDTOAdapter.fromJson(reader);
                    if (socialTextAtomDTO == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, "titleTextAtom", reader);
                    }
                    break;
                case 1:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    atomDTO = this.nullableAtomDTOAtProtoOneOfAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -511) {
            AtomDTO atomDTO2 = atomDTO;
            String str3 = str2;
            String str4 = str;
            TextAtom textAtom3 = textAtom2;
            Map<String, TokenizedTrackingInfo> map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            ButtonV3Atom.SmallButton smallButton2 = smallButton;
            TextAtom textAtom4 = textAtom;
            SocialTextAtomDTO socialTextAtomDTO2 = socialTextAtomDTO;
            if (socialTextAtomDTO2 != null) {
                return new BankAccountStatusDTO(socialTextAtomDTO2, textAtom4, smallButton2, atomActionDTO2, map2, textAtom3, str4, str3, atomDTO2);
            }
            throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, "titleTextAtom", reader);
        }
        AtomDTO atomDTO3 = atomDTO;
        String str5 = str2;
        String str6 = str;
        TextAtom textAtom5 = textAtom2;
        Map<String, TokenizedTrackingInfo> map3 = map;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        ButtonV3Atom.SmallButton smallButton3 = smallButton;
        TextAtom textAtom6 = textAtom;
        SocialTextAtomDTO socialTextAtomDTO3 = socialTextAtomDTO;
        Constructor<BankAccountStatusDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BankAccountStatusDTO.class.getDeclaredConstructor(SocialTextAtomDTO.class, TextAtom.class, ButtonV3Atom.SmallButton.class, AtomActionDTO.class, Map.class, TextAtom.class, String.class, String.class, AtomDTO.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (socialTextAtomDTO3 == null) {
            throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, "titleTextAtom", reader);
        }
        BankAccountStatusDTO newInstance = constructor.newInstance(socialTextAtomDTO3, textAtom6, smallButton3, atomActionDTO3, map3, textAtom5, str6, str5, atomDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BankAccountStatusDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("titleTextAtom");
        this.socialTextAtomDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subTitleTextAtom");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubTitle());
        writer.w("smallButton");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("descriptionTextAtom");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("widgetBackground");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getWidgetBackground());
        writer.w("atom");
        this.nullableAtomDTOAtProtoOneOfAdapter.mo44toJson(writer, (x) value.getAtom());
        writer.p();
    }
}
