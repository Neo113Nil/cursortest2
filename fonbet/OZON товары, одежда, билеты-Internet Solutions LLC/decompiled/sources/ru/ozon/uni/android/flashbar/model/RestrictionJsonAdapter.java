package ru.ozon.uni.android.flashbar.model;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/uni/android/flashbar/model/RestrictionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/android/flashbar/model/Restriction;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/android/flashbar/model/Restriction$ActionButton;", "nullableActionButtonAdapter", "Lru/ozon/uni/android/flashbar/model/Restriction$Action;", "nullableActionAdapter", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "nullableProgressAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "nullableAnyAtRestrictionActionButtonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RestrictionJsonAdapter extends JsonAdapter<Restriction> {
    public static final int $stable = 8;
    private volatile Constructor<Restriction> constructorRef;

    @NotNull
    private final JsonAdapter<Restriction.Action> nullableActionAdapter;

    @NotNull
    private final JsonAdapter<Restriction.ActionButton> nullableActionButtonAdapter;

    @NotNull
    private final JsonAdapter<Object> nullableAnyAtRestrictionActionButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Restriction.Progress> nullableProgressAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public RestrictionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "image", "imageTintColor", "type", "lifetime", "invalid", "action", "context", "progress", "trackingInfo", "actionButton");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "message");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Restriction.ActionButton> f12 = moshi.f(Restriction.ActionButton.class, m11, "actionButton");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableActionButtonAdapter = f12;
        JsonAdapter<Restriction.Action> f13 = moshi.f(Restriction.Action.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableActionAdapter = f13;
        JsonAdapter<Restriction.Progress> f14 = moshi.f(Restriction.Progress.class, m11, "progress");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableProgressAdapter = f14;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f15;
        JsonAdapter<Object> f16 = moshi.f(Object.class, e0.h(new RestrictionActionButton() { // from class: ru.ozon.uni.android.flashbar.model.RestrictionJsonAdapter$annotationImpl$ru_ozon_uni_android_flashbar_model_RestrictionActionButton$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return RestrictionActionButton.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof RestrictionActionButton;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.android.flashbar.model.RestrictionActionButton()";
            }
        }), "button");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableAnyAtRestrictionActionButtonAdapter = f16;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(Restriction)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Restriction fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Restriction.ActionButton actionButton = null;
        Restriction.Action action = null;
        String str7 = null;
        Restriction.Progress progress = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Object obj = null;
        while (reader.hasNext()) {
            String str8 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2;
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("message", "message", reader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    actionButton = this.nullableActionButtonAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    action = this.nullableActionAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    progress = this.nullableProgressAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
                case 11:
                    obj = this.nullableAnyAtRestrictionActionButtonAdapter.fromJson(reader);
                    i12 &= -2049;
                    break;
            }
            str = str8;
        }
        String str9 = str;
        reader.endObject();
        if (i12 == -4078) {
            if (str2 == null) {
                throw c.j("message", "message", reader);
            }
            if (str5 == null) {
                throw c.j("type", "type", reader);
            }
            String str10 = str7;
            Restriction.Action action2 = action;
            Restriction.ActionButton actionButton2 = actionButton;
            String str11 = str6;
            String str12 = str5;
            return new Restriction(str9, str2, str3, str4, str12, str11, actionButton2, action2, str10, progress, map, obj);
        }
        Constructor<Restriction> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = Restriction.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Restriction.ActionButton.class, Restriction.Action.class, String.class, Restriction.Progress.class, Map.class, Object.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<Restriction> constructor2 = constructor;
        if (str2 == null) {
            throw c.j("message", "message", reader);
        }
        if (str5 == null) {
            throw c.j("type", "type", reader);
        }
        Restriction newInstance = constructor2.newInstance(str9, str2, str3, str4, str5, str6, actionButton, action, str7, progress, map, obj, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Restriction value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("message");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMessage());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("imageTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getImageTintColor());
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("lifetime");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLifetime());
        writer.w("invalid");
        this.nullableActionButtonAdapter.mo44toJson(writer, (x) value_.getActionButton());
        writer.w("action");
        this.nullableActionAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getContext());
        writer.w("progress");
        this.nullableProgressAdapter.mo44toJson(writer, (x) value_.getProgress());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("actionButton");
        this.nullableAnyAtRestrictionActionButtonAdapter.mo44toJson(writer, (x) value_.getButton());
        writer.p();
    }
}
