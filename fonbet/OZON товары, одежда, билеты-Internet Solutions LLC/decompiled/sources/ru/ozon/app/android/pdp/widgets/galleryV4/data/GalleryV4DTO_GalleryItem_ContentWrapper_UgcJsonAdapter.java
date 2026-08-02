package ru.ozon.app.android.pdp.widgets.galleryV4.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV4.data.GalleryV4DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO_GalleryItem_ContentWrapper_UgcJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem$ContentWrapper$Ugc;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem$ContentWrapper$Ugc;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4DTO$GalleryItem$ContentWrapper$Ugc;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "iconAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4DTO_GalleryItem_ContentWrapper_UgcJsonAdapter extends JsonAdapter<GalleryV4DTO.GalleryItem.ContentWrapper.Ugc> {
    public static final int $stable = 8;
    private volatile Constructor<GalleryV4DTO.GalleryItem.ContentWrapper.Ugc> constructorRef;

    @NotNull
    private final JsonAdapter<Icon> iconAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public GalleryV4DTO_GalleryItem_ContentWrapper_UgcJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("previewUrl", "previewIcon", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleIcon", "subtitle", "backgroundColor");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "previewUrl");
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "previewIcon");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.iconAdapter = moshi.f(Icon.class, m11, "titleIcon");
    }

    @NotNull
    public String toString() {
        return b.c(65, "GeneratedJsonAdapter(GalleryV4DTO.GalleryItem.ContentWrapper.Ugc)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GalleryV4DTO.GalleryItem.ContentWrapper.Ugc fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        Icon icon = null;
        TextAtom textAtom = null;
        Icon icon2 = null;
        TextAtom textAtom2 = null;
        String str2 = null;
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
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 2:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    icon2 = this.iconAdapter.fromJson(reader);
                    if (icon2 == null) {
                        throw c.q("titleIcon", "titleIcon", reader);
                    }
                    break;
                case 4:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    break;
                case 5:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            TextAtom textAtom3 = textAtom2;
            Icon icon3 = icon2;
            TextAtom textAtom4 = textAtom;
            Icon icon4 = icon;
            String str3 = str;
            if (str3 == null) {
                throw c.j("previewUrl", "previewUrl", reader);
            }
            if (textAtom4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (icon3 == null) {
                throw c.j("titleIcon", "titleIcon", reader);
            }
            if (textAtom3 == null) {
                throw c.j("subtitle", "subtitle", reader);
            }
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            return new GalleryV4DTO.GalleryItem.ContentWrapper.Ugc(str3, icon4, textAtom4, icon3, textAtom3, str2);
        }
        TextAtom textAtom5 = textAtom2;
        Icon icon5 = icon2;
        TextAtom textAtom6 = textAtom;
        Icon icon6 = icon;
        String str4 = str;
        Constructor<GalleryV4DTO.GalleryItem.ContentWrapper.Ugc> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GalleryV4DTO.GalleryItem.ContentWrapper.Ugc.class.getDeclaredConstructor(String.class, Icon.class, TextAtom.class, Icon.class, TextAtom.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<GalleryV4DTO.GalleryItem.ContentWrapper.Ugc> constructor2 = constructor;
        if (str4 == null) {
            throw c.j("previewUrl", "previewUrl", reader);
        }
        if (textAtom6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (icon5 == null) {
            throw c.j("titleIcon", "titleIcon", reader);
        }
        if (textAtom5 == null) {
            throw c.j("subtitle", "subtitle", reader);
        }
        GalleryV4DTO.GalleryItem.ContentWrapper.Ugc newInstance = constructor2.newInstance(str4, icon6, textAtom6, icon5, textAtom5, str2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GalleryV4DTO.GalleryItem.ContentWrapper.Ugc value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("previewUrl");
        this.stringAdapter.mo44toJson(writer, (x) value.getPreviewUrl());
        writer.w("previewIcon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getPreviewIcon());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("titleIcon");
        this.iconAdapter.mo44toJson(writer, (x) value.getTitleIcon());
        writer.w("subtitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
