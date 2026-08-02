package ru.ozon.app.android.atoms.data.notification;

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
import ru.ozon.app.android.atoms.data.AtomActionDTO;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.data.button.ButtonV3Atom;
import ru.ozon.app.android.atoms.data.notification.NotificationAtom;
import ru.ozon.app.android.atoms.data.timer.TimerAtom;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/atoms/data/notification/NotificationAtom_NotificationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Notification;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Notification;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Notification;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/timer/TimerAtom;", "nullableTimerAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "stringAdapter", "nullableStringAdapter", "Lru/ozon/app/android/atoms/data/notification/NotificationAtom$Position;", "nullablePositionAdapter", "Lru/ozon/app/android/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NotificationAtom_NotificationJsonAdapter extends JsonAdapter<NotificationAtom.Notification> {
    public static final int $stable = 8;
    private volatile Constructor<NotificationAtom.Notification> constructorRef;

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
    private final JsonAdapter<TimerAtom> nullableTimerAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public NotificationAtom_NotificationJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(DynamicElementDTO.TIMER, "seconds", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "position", "button", "showDisclosure", "action", "context", "trackingInfo", "testInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TimerAtom> f7 = moshi.f(TimerAtom.class, m11, DynamicElementDTO.TIMER);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableTimerAtomAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.class, m11, "seconds");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIntAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<NotificationAtom.Position> f14 = moshi.f(NotificationAtom.Position.class, m11, "position");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullablePositionAdapter = f14;
        JsonAdapter<ButtonV3Atom.SmallButton> f15 = moshi.f(ButtonV3Atom.SmallButton.class, m11, "button");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableSmallButtonAdapter = f15;
        JsonAdapter<Boolean> f16 = moshi.f(Boolean.class, m11, "showDisclosure");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableBooleanAdapter = f16;
        JsonAdapter<AtomActionDTO> f17 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f17;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f18 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f18;
        JsonAdapter<TestInfo> f19 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableTestInfoAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(NotificationAtom.Notification)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationAtom.Notification fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TimerAtom timerAtom = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        NotificationAtom.Position position = null;
        ButtonV3Atom.SmallButton smallButton = null;
        Boolean bool = null;
        AtomActionDTO atomActionDTO = null;
        String str3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    timerAtom = this.nullableTimerAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    position = this.nullablePositionAdapter.fromJson(reader);
                    break;
                case 5:
                    smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
                    break;
                case 6:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -1793) {
            String str4 = str3;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Boolean bool2 = bool;
            ButtonV3Atom.SmallButton smallButton2 = smallButton;
            NotificationAtom.Position position2 = position;
            String str5 = str2;
            String str6 = str;
            Integer num2 = num;
            TimerAtom timerAtom2 = timerAtom;
            if (str6 != null) {
                return new NotificationAtom.Notification(timerAtom2, num2, str6, str5, position2, smallButton2, bool2, atomActionDTO2, str4, map, testInfo);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        String str7 = str3;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        Boolean bool3 = bool;
        ButtonV3Atom.SmallButton smallButton3 = smallButton;
        NotificationAtom.Position position3 = position;
        String str8 = str2;
        String str9 = str;
        Integer num3 = num;
        TimerAtom timerAtom3 = timerAtom;
        Constructor<NotificationAtom.Notification> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = NotificationAtom.Notification.class.getDeclaredConstructor(TimerAtom.class, Integer.class, String.class, String.class, NotificationAtom.Position.class, ButtonV3Atom.SmallButton.class, Boolean.class, AtomActionDTO.class, String.class, Map.class, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<NotificationAtom.Notification> constructor2 = constructor;
        if (str9 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        NotificationAtom.Notification newInstance = constructor2.newInstance(timerAtom3, num3, str9, str8, position3, smallButton3, bool3, atomActionDTO3, str7, map, testInfo, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationAtom.Notification value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerAtomAdapter.mo44toJson(writer, (x) value_.getTimer());
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
