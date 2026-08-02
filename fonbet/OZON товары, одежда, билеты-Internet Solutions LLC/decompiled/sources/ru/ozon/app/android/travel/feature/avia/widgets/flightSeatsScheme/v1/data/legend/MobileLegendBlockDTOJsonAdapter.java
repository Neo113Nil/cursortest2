package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend.MobileLegendBlockDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/badge/Badge;", "badgeAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "iconAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/legend/MobileLegendBlockDTO$SeatTypeDTO;", "listOfSeatTypeDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MobileLegendBlockDTOJsonAdapter extends JsonAdapter<MobileLegendBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Badge> badgeAdapter;
    private volatile Constructor<MobileLegendBlockDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Icon> iconAdapter;

    @NotNull
    private final JsonAdapter<List<MobileLegendBlockDTO.SeatTypeDTO>> listOfSeatTypeDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public MobileLegendBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "badge", "selectionIcon", "openLegendDetailsAction", "seatTypes");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.badgeAdapter = moshi.f(Badge.class, m11, "badge");
        this.iconAdapter = moshi.f(Icon.class, m11, "selectionIcon");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "openLegendDetailsAction");
        this.listOfSeatTypeDTOAdapter = moshi.f(D.e(List.class, MobileLegendBlockDTO.SeatTypeDTO.class), m11, "seatTypes");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(MobileLegendBlockDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MobileLegendBlockDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        Badge badge = null;
        Icon icon = null;
        AtomActionDTO atomActionDTO = null;
        List<MobileLegendBlockDTO.SeatTypeDTO> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                badge = this.badgeAdapter.fromJson(reader);
                if (badge == null) {
                    throw c.q("badge", "badge", reader);
                }
            } else if (v11 == 2) {
                icon = this.iconAdapter.fromJson(reader);
                if (icon == null) {
                    throw c.q("selectionIcon", "selectionIcon", reader);
                }
            } else if (v11 == 3) {
                atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                if (atomActionDTO == null) {
                    throw c.q("openLegendDetailsAction", "openLegendDetailsAction", reader);
                }
            } else if (v11 == 4) {
                list = this.listOfSeatTypeDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("seatTypes", "seatTypes", reader);
                }
                i11 = -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Icon icon2 = icon;
            Badge badge2 = badge;
            TextAtom textAtom2 = textAtom;
            if (textAtom2 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (badge2 == null) {
                throw c.j("badge", "badge", reader);
            }
            if (icon2 == null) {
                throw c.j("selectionIcon", "selectionIcon", reader);
            }
            if (atomActionDTO2 == null) {
                throw c.j("openLegendDetailsAction", "openLegendDetailsAction", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.legend.MobileLegendBlockDTO.SeatTypeDTO>");
            return new MobileLegendBlockDTO(textAtom2, badge2, icon2, atomActionDTO2, list);
        }
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        Icon icon3 = icon;
        Badge badge3 = badge;
        TextAtom textAtom3 = textAtom;
        Constructor<MobileLegendBlockDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MobileLegendBlockDTO.class.getDeclaredConstructor(TextAtom.class, Badge.class, Icon.class, AtomActionDTO.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<MobileLegendBlockDTO> constructor2 = constructor;
        if (textAtom3 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (badge3 == null) {
            throw c.j("badge", "badge", reader);
        }
        if (icon3 == null) {
            throw c.j("selectionIcon", "selectionIcon", reader);
        }
        if (atomActionDTO3 == null) {
            throw c.j("openLegendDetailsAction", "openLegendDetailsAction", reader);
        }
        MobileLegendBlockDTO newInstance = constructor2.newInstance(textAtom3, badge3, icon3, atomActionDTO3, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MobileLegendBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("badge");
        this.badgeAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("selectionIcon");
        this.iconAdapter.mo44toJson(writer, (x) value.getSelectionIcon());
        writer.w("openLegendDetailsAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getOpenLegendDetailsAction());
        writer.w("seatTypes");
        this.listOfSeatTypeDTOAdapter.mo44toJson(writer, (x) value.getSeatTypes());
        writer.p();
    }
}
