package ru.ozon.app.android.pdp.widgets.galleryFullView.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryFullView.data.GalleryFullViewDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO_GalleryItem_Photo360JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Photo360;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Photo360;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Photo360;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "smallButtonAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewDTO_GalleryItem_Photo360JsonAdapter extends JsonAdapter<GalleryFullViewDTO.GalleryItem.Photo360> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> smallButtonAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public GalleryFullViewDTO_GalleryItem_Photo360JsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("previewUrl", "button", "backgroundColor", "miniIcon", "templateLink", "placeholderValue");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "previewUrl");
        this.smallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "button");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "miniIcon");
    }

    @NotNull
    public String toString() {
        return b.c(61, "GeneratedJsonAdapter(GalleryFullViewDTO.GalleryItem.Photo360)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GalleryFullViewDTO.GalleryItem.Photo360 fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        ButtonV3Atom.SmallButton smallButton = null;
        String str2 = null;
        Icon icon = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("previewUrl", "previewUrl", reader);
                    }
                    break;
                case 1:
                    smallButton = this.smallButtonAdapter.fromJson(reader);
                    if (smallButton == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("previewUrl", "previewUrl", reader);
        }
        if (smallButton != null) {
            return new GalleryFullViewDTO.GalleryItem.Photo360(str, smallButton, str2, icon, str3, str4);
        }
        throw c.j("button", "button", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GalleryFullViewDTO.GalleryItem.Photo360 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("previewUrl");
        this.stringAdapter.mo44toJson(writer, (x) value.getPreviewUrl());
        writer.w("button");
        this.smallButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("miniIcon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getMiniIcon());
        writer.w("templateLink");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTemplateLink());
        writer.w("placeholderValue");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPlaceholderValue());
        writer.p();
    }
}
