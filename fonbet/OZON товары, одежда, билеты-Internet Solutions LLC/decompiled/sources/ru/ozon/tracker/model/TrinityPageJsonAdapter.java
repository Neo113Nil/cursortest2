package ru.ozon.tracker.model;

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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/tracker/model/TrinityPageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/TrinityPage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/TrinityPage;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/TrinityPage;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "", "nullableLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrinityPageJsonAdapter extends JsonAdapter<TrinityPage> {
    private volatile Constructor<TrinityPage> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public TrinityPageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("current", "previous", "currentUrl", "referralUrl", "nextUrl", "pageViewId", "previousPageViewId", "composerPageType", "categoryId", "tagId", "sku", "highlightId", "sellerId", "brandId");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "current");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.class, m11, "categoryId");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIntAdapter = f11;
        JsonAdapter<Long> f12 = moshi.f(Long.class, m11, "tagId");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLongAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(TrinityPage)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TrinityPage fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num = null;
        Long l11 = null;
        Long l12 = null;
        Long l13 = null;
        Long l14 = null;
        Long l15 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    l13 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    l14 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    l15 = this.nullableLongAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -16384) {
            Integer num2 = num;
            String str9 = str8;
            String str10 = str7;
            String str11 = str6;
            String str12 = str5;
            String str13 = str4;
            return new TrinityPage(str, str2, str3, str13, str12, str11, str10, str9, num2, l11, l12, l13, l14, l15);
        }
        Integer num3 = num;
        String str14 = str8;
        String str15 = str7;
        String str16 = str6;
        String str17 = str5;
        String str18 = str4;
        String str19 = str3;
        String str20 = str2;
        String str21 = str;
        Constructor<TrinityPage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TrinityPage.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Long.class, Long.class, Long.class, Long.class, Long.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TrinityPage newInstance = constructor.newInstance(str21, str20, str19, str18, str17, str16, str15, str14, num3, l11, l12, l13, l14, l15, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TrinityPage value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("current");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCurrent());
        writer.w("previous");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPrevious());
        writer.w("currentUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCurrentUrl());
        writer.w("referralUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getReferralUrl());
        writer.w("nextUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getNextUrl());
        writer.w("pageViewId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPageViewId());
        writer.w("previousPageViewId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPreviousPageViewId());
        writer.w("composerPageType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getComposerPageType());
        writer.w("categoryId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getCategoryId());
        writer.w("tagId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getTagId());
        writer.w("sku");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getSku());
        writer.w("highlightId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getHighlightId());
        writer.w("sellerId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getSellerId());
        writer.w("brandId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getBrandId());
        writer.p();
    }
}
