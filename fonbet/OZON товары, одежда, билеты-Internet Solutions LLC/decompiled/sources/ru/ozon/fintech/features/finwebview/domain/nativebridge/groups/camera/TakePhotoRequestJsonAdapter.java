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

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/TakePhotoRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/TakePhotoRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/TakePhotoRequest;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/TakePhotoRequest;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "booleanAdapter", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/CameraTipsOptions;", "nullableCameraTipsOptionsAdapter", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/camera/VideoOptions;", "nullableVideoOptionsAdapter", "nullableStringAdapter", "", "nullableListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TakePhotoRequestJsonAdapter extends JsonAdapter<TakePhotoRequest> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TakePhotoRequest> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CameraTipsOptions> nullableCameraTipsOptionsAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<VideoOptions> nullableVideoOptionsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TakePhotoRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("show_frame", "show_qr_frame", "photo_confirm_title", "photo_salt", "qr_action", "qr_detect_autoclose", "scanner_type", "preview_camera_title", "is_back", "tips_options", "video", "reg_frame", "phone_number_regex", "barcode_formats", "qr_button_text", "round_face_frame_enabled", "public_key");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f7 = moshi.f(Boolean.class, m11, "isNeedFrame");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableBooleanAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "confirmTitle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.TYPE, m11, "isBack");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.booleanAdapter = f12;
        JsonAdapter<CameraTipsOptions> f13 = moshi.f(CameraTipsOptions.class, m11, "tipsOptions");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableCameraTipsOptionsAdapter = f13;
        JsonAdapter<VideoOptions> f14 = moshi.f(VideoOptions.class, m11, "videoOptions");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableVideoOptionsAdapter = f14;
        JsonAdapter<String> f15 = moshi.f(String.class, m11, "phoneNumberRegex");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableStringAdapter = f15;
        JsonAdapter<List<String>> f16 = moshi.f(D.e(List.class, String.class), m11, "barcodeFormats");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableListOfStringAdapter = f16;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(TakePhotoRequest)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TakePhotoRequest fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i12 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        String str2 = null;
        String str3 = null;
        CameraTipsOptions cameraTipsOptions = null;
        VideoOptions videoOptions = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool6 = null;
        String str6 = null;
        List<String> list = null;
        String str7 = null;
        Boolean bool7 = null;
        String str8 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    bool4 = this.nullableBooleanAdapter.fromJson(reader);
                    continue;
                case 1:
                    bool5 = this.nullableBooleanAdapter.fromJson(reader);
                    continue;
                case 2:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("confirmTitle", "photo_confirm_title", reader);
                    }
                    continue;
                case 3:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("certificate", "photo_salt", reader);
                    }
                    continue;
                case 4:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("qrAction", "qr_action", reader);
                    }
                    i12 &= -17;
                    continue;
                case 5:
                    bool6 = this.nullableBooleanAdapter.fromJson(reader);
                    continue;
                case 6:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("scannerType", "scanner_type", reader);
                    }
                    i12 &= -65;
                    continue;
                case 7:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("previewCameraTitle", "preview_camera_title", reader);
                    }
                    i12 &= -129;
                    continue;
                case 8:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isBack", "is_back", reader);
                    }
                    i12 &= -257;
                    continue;
                case 9:
                    cameraTipsOptions = this.nullableCameraTipsOptionsAdapter.fromJson(reader);
                    i12 &= -513;
                    continue;
                case 10:
                    videoOptions = this.nullableVideoOptionsAdapter.fromJson(reader);
                    i12 &= -1025;
                    continue;
                case 11:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isRegFrame", "reg_frame", reader);
                    }
                    i12 &= -2049;
                    continue;
                case 12:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -4097;
                    continue;
                case 13:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    i12 &= -8193;
                    continue;
                case 14:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -16385;
                    continue;
                case 15:
                    bool7 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 = -32769;
                    break;
                case 16:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -65537;
                    break;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 == -131025) {
            if (str4 == null) {
                throw c.j("confirmTitle", "photo_confirm_title", reader);
            }
            if (str5 == null) {
                throw c.j("certificate", "photo_salt", reader);
            }
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
            return new TakePhotoRequest(bool4, bool5, str4, str5, str, bool6, str2, str3, bool2.booleanValue(), cameraTipsOptions, videoOptions, bool3.booleanValue(), str6, list, str7, bool7, str8);
        }
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        Constructor<TakePhotoRequest> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = TakePhotoRequest.class.getDeclaredConstructor(Boolean.class, Boolean.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, cls2, CameraTipsOptions.class, VideoOptions.class, cls2, String.class, List.class, String.class, Boolean.class, String.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str4 == null) {
            throw c.j("confirmTitle", "photo_confirm_title", reader);
        }
        if (str5 == null) {
            throw c.j("certificate", "photo_salt", reader);
        }
        TakePhotoRequest newInstance = constructor.newInstance(bool4, bool5, str4, str5, str9, bool6, str10, str11, bool2, cameraTipsOptions, videoOptions, bool3, str6, list, str7, bool7, str8, Integer.valueOf(i12), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TakePhotoRequest value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("show_frame");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isNeedFrame());
        writer.w("show_qr_frame");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isNeedQrFrame());
        writer.w("photo_confirm_title");
        this.stringAdapter.mo44toJson(writer, (x) value_.getConfirmTitle());
        writer.w("photo_salt");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCertificate());
        writer.w("qr_action");
        this.stringAdapter.mo44toJson(writer, (x) value_.getQrAction());
        writer.w("qr_detect_autoclose");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getQrADetectAutoClose());
        writer.w("scanner_type");
        this.stringAdapter.mo44toJson(writer, (x) value_.getScannerType());
        writer.w("preview_camera_title");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPreviewCameraTitle());
        writer.w("is_back");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isBack()));
        writer.w("tips_options");
        this.nullableCameraTipsOptionsAdapter.mo44toJson(writer, (x) value_.getTipsOptions());
        writer.w("video");
        this.nullableVideoOptionsAdapter.mo44toJson(writer, (x) value_.getVideoOptions());
        writer.w("reg_frame");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isRegFrame()));
        writer.w("phone_number_regex");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPhoneNumberRegex());
        writer.w("barcode_formats");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getBarcodeFormats());
        writer.w("qr_button_text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getQrButtonText());
        writer.w("round_face_frame_enabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getRoundFaceFrameEnabled());
        writer.w("public_key");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPublicKey());
        writer.p();
    }
}
