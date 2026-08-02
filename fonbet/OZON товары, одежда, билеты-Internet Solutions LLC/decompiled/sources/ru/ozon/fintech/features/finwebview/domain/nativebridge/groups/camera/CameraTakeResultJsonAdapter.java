package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera;

import Ak.b;
import Y9.c;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTakeResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTakeResult;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTakeResult;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTakeResult;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableListOfStringAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraTakeResultJsonAdapter extends JsonAdapter<CameraTakeResult> {
    private volatile Constructor<CameraTakeResult> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CameraTakeResultJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("photo_base64", "photo_hmac_base64", "qr_result", "qr_base64", "phone_numbers", "bank_card_number", "video_file_key", "qr_button_clicked");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "photoBase64");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "qrValue");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<List<String>> f12 = moshi.f(D.e(List.class, String.class), m11, "phoneNumbers");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfStringAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "qrButtonClicked");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(CameraTakeResult)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CameraTakeResult fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List<String> list = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("photoBase64", "photo_base64", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("photoHash", "photo_hmac_base64", reader);
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
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    i12 &= -17;
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -253) {
            Boolean bool2 = bool;
            String str7 = str6;
            String str8 = str5;
            List<String> list2 = list;
            String str9 = str4;
            String str10 = str3;
            String str11 = str2;
            String str12 = str;
            if (str12 == null) {
                throw c.j("photoBase64", "photo_base64", reader);
            }
            if (str11 != null) {
                return new CameraTakeResult(str12, str11, str10, str9, list2, str8, str7, bool2);
            }
            throw c.j("photoHash", "photo_hmac_base64", reader);
        }
        Boolean bool3 = bool;
        String str13 = str6;
        String str14 = str5;
        List<String> list3 = list;
        String str15 = str4;
        String str16 = str3;
        String str17 = str2;
        String str18 = str;
        Constructor<CameraTakeResult> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = CameraTakeResult.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, List.class, String.class, String.class, Boolean.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<CameraTakeResult> constructor2 = constructor;
        if (str18 == null) {
            throw c.j("photoBase64", "photo_base64", reader);
        }
        if (str17 == null) {
            throw c.j("photoHash", "photo_hmac_base64", reader);
        }
        CameraTakeResult newInstance = constructor2.newInstance(str18, str17, str16, str15, list3, str14, str13, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CameraTakeResult value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("photo_base64");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPhotoBase64());
        writer.w("photo_hmac_base64");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPhotoHash());
        writer.w("qr_result");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getQrValue());
        writer.w("qr_base64");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getQrRawData());
        writer.w("phone_numbers");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getPhoneNumbers());
        writer.w("bank_card_number");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBankCardNumber());
        writer.w("video_file_key");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getVideoFileKey());
        writer.w("qr_button_clicked");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getQrButtonClicked());
        writer.p();
    }
}
