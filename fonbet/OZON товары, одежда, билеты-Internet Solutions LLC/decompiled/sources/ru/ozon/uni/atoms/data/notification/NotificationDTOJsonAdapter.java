package ru.ozon.uni.atoms.data.notification;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/uni/atoms/data/notification/NotificationDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$LeftContent;", "nullableLeftContentAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$RightContent;", "nullableRightContentAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "nullablePresetAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationDTOJsonAdapter extends JsonAdapter<NotificationDTO> {
    public static final int $stable = 8;
    private volatile Constructor<NotificationDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO.LeftContent> nullableLeftContentAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO.Preset> nullablePresetAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO.RightContent> nullableRightContentAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public NotificationDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "titleMaxLines", "subtitleMaxLines", "leftContent", "rightContent", "autoHideDelay", "common", "context", "preset");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "titleMaxLines");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<NotificationDTO.LeftContent> f13 = moshi.f(NotificationDTO.LeftContent.class, m11, "leftContent");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableLeftContentAdapter = f13;
        JsonAdapter<NotificationDTO.RightContent> f14 = moshi.f(NotificationDTO.RightContent.class, m11, "rightContent");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableRightContentAdapter = f14;
        JsonAdapter<CommonControlSettings> f15 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f15;
        JsonAdapter<NotificationDTO.Preset> f16 = moshi.f(NotificationDTO.Preset.class, m11, "preset");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullablePresetAdapter = f16;
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(NotificationDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        NotificationDTO.LeftContent leftContent = null;
        NotificationDTO.RightContent rightContent = null;
        Integer num3 = null;
        CommonControlSettings commonControlSettings = null;
        String str3 = null;
        NotificationDTO.Preset preset = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    leftContent = this.nullableLeftContentAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    rightContent = this.nullableRightContentAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    preset = this.nullablePresetAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -1023) {
            String str4 = str3;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            Integer num4 = num3;
            NotificationDTO.RightContent rightContent2 = rightContent;
            NotificationDTO.LeftContent leftContent2 = leftContent;
            Integer num5 = num2;
            Integer num6 = num;
            String str5 = str2;
            String str6 = str;
            if (str6 != null) {
                return new NotificationDTO(str6, str5, num6, num5, leftContent2, rightContent2, num4, commonControlSettings2, str4, preset);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        String str7 = str3;
        CommonControlSettings commonControlSettings3 = commonControlSettings;
        Integer num7 = num3;
        NotificationDTO.RightContent rightContent3 = rightContent;
        NotificationDTO.LeftContent leftContent3 = leftContent;
        Integer num8 = num2;
        Integer num9 = num;
        String str8 = str2;
        String str9 = str;
        Constructor<NotificationDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NotificationDTO.class.getDeclaredConstructor(String.class, String.class, Integer.class, Integer.class, NotificationDTO.LeftContent.class, NotificationDTO.RightContent.class, Integer.class, CommonControlSettings.class, String.class, NotificationDTO.Preset.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str9 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        NotificationDTO newInstance = constructor.newInstance(str9, str8, num9, num8, leftContent3, rightContent3, num7, commonControlSettings3, str7, preset, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("titleMaxLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getTitleMaxLines());
        writer.w("subtitleMaxLines");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getSubtitleMaxLines());
        writer.w("leftContent");
        this.nullableLeftContentAdapter.mo44toJson(writer, (x) value_.getLeftContent());
        writer.w("rightContent");
        this.nullableRightContentAdapter.mo44toJson(writer, (x) value_.getRightContent());
        writer.w("autoHideDelay");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getAutoHideDelay());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("preset");
        this.nullablePresetAdapter.mo44toJson(writer, (x) value_.getPreset());
        writer.p();
    }
}
