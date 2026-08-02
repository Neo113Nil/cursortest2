package ru.ozon.app.android.common.taglist.taglistv2.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.common.taglist.TagListViewType;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/taglist/taglistv2/data/TagListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "listOfTagAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/taglist/TagListViewType;", "nullableTagListViewTypeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagListDTOJsonAdapter extends JsonAdapter<TagListDTO> {
    private volatile Constructor<TagListDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<TagV3Atom.TagAtom>> listOfTagAtomAdapter;

    @NotNull
    private final JsonAdapter<TagListViewType> nullableTagListViewTypeAdapter;

    @NotNull
    private final n.a options;

    public TagListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("tags", "view");
        b e11 = D.e(List.class, TagV3Atom.TagAtom.class);
        M m11 = M.f71699a;
        this.listOfTagAtomAdapter = moshi.f(e11, m11, "tags");
        this.nullableTagListViewTypeAdapter = moshi.f(TagListViewType.class, m11, "view");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(32, "GeneratedJsonAdapter(TagListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TagListDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<TagV3Atom.TagAtom> list = null;
        TagListViewType tagListViewType = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfTagAtomAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("tags", "tags", reader);
                }
            } else if (v11 == 1) {
                tagListViewType = this.nullableTagListViewTypeAdapter.fromJson(reader);
                i11 = -3;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            if (list != null) {
                return new TagListDTO(list, tagListViewType);
            }
            throw c.j("tags", "tags", reader);
        }
        Constructor<TagListDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TagListDTO.class.getDeclaredConstructor(List.class, TagListViewType.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("tags", "tags", reader);
        }
        TagListDTO newInstance = constructor.newInstance(list, tagListViewType, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TagListDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("tags");
        this.listOfTagAtomAdapter.mo44toJson(writer, (x) value.getTags());
        writer.w("view");
        this.nullableTagListViewTypeAdapter.mo44toJson(writer, (x) value.getView());
        writer.p();
    }
}
