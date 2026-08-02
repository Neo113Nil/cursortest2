package ru.ozon.app.android.ui.widgets.textWidget.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.OrderedListCellDTO;
import ru.ozon.uni.atoms.data.cell.UnorderedListCellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ui/widgets/textWidget/data/TextWidgetDTO;", "", "atoms", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "backgroundColor", "", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/util/Map;)V", "getAtoms", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightPadding", "getTrackingInfo", "()Ljava/util/Map;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextWidgetDTO {

    @NotNull
    private final List<AtomDTO> atoms;
    private final String backgroundColor;
    private final CommonCellSettings.LayoutPadding leftPadding;
    private final CommonCellSettings.LayoutPadding rightPadding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public TextWidgetDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "expandableText", type = ExpandableTextDTO.class), @ProtoOneOfSignature(name = "orderedListCell", type = OrderedListCellDTO.class), @ProtoOneOfSignature(name = "unorderedListCell", type = UnorderedListCellDTO.class), @ProtoOneOfSignature(name = "image", type = ImageDTO.class), @ProtoOneOfSignature(name = "imageFixed", type = ImageFixedDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> atoms, String str, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(atoms, "atoms");
        this.atoms = atoms;
        this.backgroundColor = str;
        this.leftPadding = layoutPadding;
        this.rightPadding = layoutPadding2;
        this.trackingInfo = map;
    }

    @NotNull
    public final List<AtomDTO> getAtoms() {
        return this.atoms;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public /* synthetic */ TextWidgetDTO(List list, String str, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 16) != 0 ? null : map);
    }
}
