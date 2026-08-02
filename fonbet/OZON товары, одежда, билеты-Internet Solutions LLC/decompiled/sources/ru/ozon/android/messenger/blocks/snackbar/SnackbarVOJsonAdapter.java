package ru.ozon.android.messenger.blocks.snackbar;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R&\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020)0(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lru/ozon/android/messenger/blocks/snackbar/SnackbarVOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/snackbar/SnackbarVO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/snackbar/SnackbarVO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/snackbar/SnackbarVO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/framework/presentation/models/c;", "blockIdAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "", "nullableLongAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/android/messenger/blocks/snackbar/IconContainer;", "nullableIconContainerAdapter", "Lru/ozon/android/messenger/blocks/snackbar/TimerViewVO;", "nullableTimerViewVOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "mapOfStringMessengerTrackingInfoAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SnackbarVOJsonAdapter extends JsonAdapter<SnackbarVO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ru.ozon.android.messenger.framework.presentation.models.c> blockIdAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> mapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<IconContainer> nullableIconContainerAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TimerViewVO> nullableTimerViewVOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SnackbarVOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("blockId", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "ttl", "hideAction", "tapAction", "leftIcon", DynamicElementDTO.TIMER, "button", "rightIcon", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ru.ozon.android.messenger.framework.presentation.models.c> f7 = moshi.f(ru.ozon.android.messenger.framework.presentation.models.c.class, m11, "blockId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.blockIdAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "description");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<Long> f13 = moshi.f(Long.class, m11, "ttl");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableLongAdapter = f13;
        JsonAdapter<AtomActionDTO> f14 = moshi.f(AtomActionDTO.class, m11, "hideAction");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f14;
        JsonAdapter<IconContainer> f15 = moshi.f(IconContainer.class, m11, "leftIcon");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIconContainerAdapter = f15;
        JsonAdapter<TimerViewVO> f16 = moshi.f(TimerViewVO.class, m11, DynamicElementDTO.TIMER);
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableTimerViewVOAdapter = f16;
        JsonAdapter<ButtonV3Atom.SmallButton> f17 = moshi.f(ButtonV3Atom.SmallButton.class, m11, "button");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableSmallButtonAdapter = f17;
        JsonAdapter<Icon> f18 = moshi.f(Icon.class, m11, "rightIcon");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableIconAdapter = f18;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f19 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.mapOfStringMessengerTrackingInfoAdapter = f19;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(32, "GeneratedJsonAdapter(SnackbarVO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SnackbarVO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ru.ozon.android.messenger.framework.presentation.models.c cVar = null;
        String str = null;
        String str2 = null;
        Long l11 = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        IconContainer iconContainer = null;
        TimerViewVO timerViewVO = null;
        ButtonV3Atom.SmallButton smallButton = null;
        Icon icon = null;
        Map<String, MessengerTrackingInfo> map = null;
        while (reader.hasNext()) {
            ru.ozon.android.messenger.framework.presentation.models.c cVar2 = cVar;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    cVar = this.blockIdAdapter.fromJson(reader);
                    if (cVar == null) {
                        throw Y9.c.q("blockId", "blockId", reader);
                    }
                    continue;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    atomActionDTO2 = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    iconContainer = this.nullableIconContainerAdapter.fromJson(reader);
                    break;
                case 7:
                    timerViewVO = this.nullableTimerViewVOAdapter.fromJson(reader);
                    break;
                case 8:
                    smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
                    break;
                case 9:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 10:
                    map = this.mapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    if (map == null) {
                        throw Y9.c.q("trackingInfo", "trackingInfo", reader);
                    }
                    break;
            }
            cVar = cVar2;
        }
        ru.ozon.android.messenger.framework.presentation.models.c cVar3 = cVar;
        reader.endObject();
        if (cVar3 == null) {
            throw Y9.c.j("blockId", "blockId", reader);
        }
        if (str == null) {
            throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (map != null) {
            return new SnackbarVO(cVar3, str, str2, l11, atomActionDTO, atomActionDTO2, iconContainer, timerViewVO, smallButton, icon, map);
        }
        throw Y9.c.j("trackingInfo", "trackingInfo", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SnackbarVO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("blockId");
        this.blockIdAdapter.mo44toJson(writer, (x) value_.getBlockId());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("description");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDescription());
        writer.w("ttl");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getTtl());
        writer.w("hideAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getHideAction());
        writer.w("tapAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getTapAction());
        writer.w("leftIcon");
        this.nullableIconContainerAdapter.mo44toJson(writer, (x) value_.getLeftIcon());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerViewVOAdapter.mo44toJson(writer, (x) value_.getTimer());
        writer.w("button");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value_.getButton());
        writer.w("rightIcon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value_.getRightIcon());
        writer.w("trackingInfo");
        this.mapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
