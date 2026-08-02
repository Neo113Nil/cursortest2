package ru.ozon.android.messenger.blocks.chat.common;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/common/PreviewVOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chat/common/PreviewVO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/chat/common/PreviewVO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/chat/common/PreviewVO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "listOfIconAdapter", "Lorg/joda/time/DateTime;", "dateTimeAdapter", "Lru/ozon/android/messenger/framework/presentation/models/z;", "sendMessageStatusAdapter", "Lru/ozon/android/messenger/blocks/chat/common/f;", "nullableChatStatusAdapter", "", "booleanAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PreviewVOJsonAdapter extends JsonAdapter<PreviewVO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAdapter;

    @NotNull
    private final JsonAdapter<List<Icon>> listOfIconAdapter;

    @NotNull
    private final JsonAdapter<f> nullableChatStatusAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<z> sendMessageStatusAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public PreviewVOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("text", "images", "date", "status", "chatStatus", "isDraft");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "text");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<List<Icon>> f11 = moshi.f(D.e(List.class, Icon.class), m11, "images");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfIconAdapter = f11;
        JsonAdapter<DateTime> f12 = moshi.f(DateTime.class, m11, "date");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.dateTimeAdapter = f12;
        JsonAdapter<z> f13 = moshi.f(z.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.sendMessageStatusAdapter = f13;
        JsonAdapter<f> f14 = moshi.f(f.class, m11, "chatStatus");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableChatStatusAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.TYPE, m11, "isDraft");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.booleanAdapter = f15;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(31, "GeneratedJsonAdapter(PreviewVO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PreviewVO fromJson(@NotNull com.squareup.moshi.n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        List<Icon> list = null;
        DateTime dateTime = null;
        z zVar = null;
        f fVar = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("text", "text", reader);
                    }
                    break;
                case 1:
                    list = this.listOfIconAdapter.fromJson(reader);
                    if (list == null) {
                        throw Y9.c.q("images", "images", reader);
                    }
                    break;
                case 2:
                    dateTime = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime == null) {
                        throw Y9.c.q("date", "date", reader);
                    }
                    break;
                case 3:
                    zVar = this.sendMessageStatusAdapter.fromJson(reader);
                    if (zVar == null) {
                        throw Y9.c.q("status", "status", reader);
                    }
                    break;
                case 4:
                    fVar = this.nullableChatStatusAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw Y9.c.q("isDraft", "isDraft", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw Y9.c.j("text", "text", reader);
        }
        if (list == null) {
            throw Y9.c.j("images", "images", reader);
        }
        if (dateTime == null) {
            throw Y9.c.j("date", "date", reader);
        }
        if (zVar == null) {
            throw Y9.c.j("status", "status", reader);
        }
        if (bool != null) {
            return new PreviewVO(str, list, dateTime, zVar, fVar, bool.booleanValue());
        }
        throw Y9.c.j("isDraft", "isDraft", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PreviewVO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.stringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("images");
        this.listOfIconAdapter.mo44toJson(writer, (x) value_.getImages());
        writer.w("date");
        this.dateTimeAdapter.mo44toJson(writer, (x) value_.getDate());
        writer.w("status");
        this.sendMessageStatusAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("chatStatus");
        this.nullableChatStatusAdapter.mo44toJson(writer, (x) value_.getChatStatus());
        writer.w("isDraft");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isDraft()));
        writer.p();
    }
}
