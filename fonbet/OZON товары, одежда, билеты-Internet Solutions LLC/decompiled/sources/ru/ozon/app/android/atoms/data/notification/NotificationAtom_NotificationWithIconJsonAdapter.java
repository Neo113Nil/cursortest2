package ru.ozon.app.android.atoms.data.notification;

import Ak.b;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.button.ButtonV3Atom;
import ru.ozon.app.android.atoms.data.notification.NotificationAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R(\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationAtom_NotificationWithIconJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/notification/NotificationAtom$NotificationWithIcon;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "nullablePositionAdapter", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationAtom_NotificationWithIconJsonAdapter extends JsonAdapter<NotificationAtom.NotificationWithIcon> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<NotificationAtom.Position> nullablePositionAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public NotificationAtom_NotificationWithIconJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("icon", "iconTintColor", "iconBackgroundColor", "seconds", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "position", "button", "showDisclosure", "action", "context", "trackingInfo", "testInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "iconTintColor");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "seconds");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<NotificationAtom.Position> f13 = moshi.f(NotificationAtom.Position.class, m11, "position");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullablePositionAdapter = f13;
        JsonAdapter<ButtonV3Atom.SmallButton> f14 = moshi.f(ButtonV3Atom.SmallButton.class, m11, "button");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableSmallButtonAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.class, m11, "showDisclosure");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableBooleanAdapter = f15;
        JsonAdapter<AtomActionDTO> f16 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f16;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f17;
        JsonAdapter<TestInfo> f18 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableTestInfoAdapter = f18;
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(NotificationAtom.NotificationWithIcon)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationAtom.NotificationWithIcon fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        NotificationAtom.Position position = null;
        ButtonV3Atom.SmallButton smallButton = null;
        Boolean bool = null;
        AtomActionDTO atomActionDTO = null;
        String str6 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            String str7 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    continue;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    position = this.nullablePositionAdapter.fromJson(reader);
                    break;
                case 7:
                    smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
                    break;
                case 8:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 10:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 12:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    break;
            }
            str = str7;
        }
        String str8 = str;
        reader.endObject();
        if (str8 == null) {
            throw c.j("icon", "icon", reader);
        }
        if (str4 != null) {
            return new NotificationAtom.NotificationWithIcon(str8, str2, str3, num, str4, str5, position, smallButton, bool, atomActionDTO, str6, map, testInfo);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationAtom.NotificationWithIcon value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.stringAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconTintColor());
        writer.w("iconBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconBackgroundColor());
        writer.w("seconds");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getSeconds());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("position");
        this.nullablePositionAdapter.mo44toJson(writer, (x) value_.getPosition());
        writer.w("button");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value_.getButton());
        writer.w("showDisclosure");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getShowDisclosure());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.p();
    }
}
