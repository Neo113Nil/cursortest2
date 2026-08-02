package ru.ozon.android.messenger.framework.data.remote.models.items;

import Y9.c;
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
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO_ContextMenuItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO$ContextMenuItem;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO$ContextMenuItem;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO$ContextMenuItem;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "commonAtomLabelDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "commonAtomIconDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ContextMenuDTO_ContextMenuItemJsonAdapter extends JsonAdapter<ContextMenuDTO.ContextMenuItem> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> commonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO> commonAtomLabelDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public ContextMenuDTO_ContextMenuItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "icon", "action", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CommonAtomLabelDTO> f7 = moshi.f(CommonAtomLabelDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.commonAtomLabelDTOAdapter = f7;
        JsonAdapter<CommonAtomIconDTO> f11 = moshi.f(CommonAtomIconDTO.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.commonAtomIconDTOAdapter = f11;
        JsonAdapter<AtomActionDTO> f12 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.atomActionDTOAdapter = f12;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f13 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(52, "GeneratedJsonAdapter(ContextMenuDTO.ContextMenuItem)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ContextMenuDTO.ContextMenuItem fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CommonAtomLabelDTO commonAtomLabelDTO = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, MessengerTrackingInfo> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                commonAtomLabelDTO = this.commonAtomLabelDTOAdapter.fromJson(reader);
                if (commonAtomLabelDTO == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                commonAtomIconDTO = this.commonAtomIconDTOAdapter.fromJson(reader);
                if (commonAtomIconDTO == null) {
                    throw c.q("icon", "icon", reader);
                }
            } else if (v11 == 2) {
                atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                if (atomActionDTO == null) {
                    throw c.q("action", "action", reader);
                }
            } else if (v11 == 3) {
                map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (commonAtomLabelDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (commonAtomIconDTO == null) {
            throw c.j("icon", "icon", reader);
        }
        if (atomActionDTO != null) {
            return new ContextMenuDTO.ContextMenuItem(commonAtomLabelDTO, commonAtomIconDTO, atomActionDTO, map);
        }
        throw c.j("action", "action", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ContextMenuDTO.ContextMenuItem value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.commonAtomLabelDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("icon");
        this.commonAtomIconDTOAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
