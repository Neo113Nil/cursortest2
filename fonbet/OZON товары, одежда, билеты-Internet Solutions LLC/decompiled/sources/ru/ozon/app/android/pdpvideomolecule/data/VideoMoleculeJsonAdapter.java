package ru.ozon.app.android.pdpvideomolecule.data;

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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/data/VideoMoleculeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdpvideomolecule/data/VideoFormat;", "videoFormatAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoMoleculeJsonAdapter extends JsonAdapter<VideoMolecule> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<VideoMolecule> constructorRef;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<VideoFormat> videoFormatAdapter;

    public VideoMoleculeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("link", "format", "portraitRatio");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "link");
        this.videoFormatAdapter = moshi.f(VideoFormat.class, m11, "format");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "portraitRatio");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(VideoMolecule)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public VideoMolecule fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        String str = null;
        VideoFormat videoFormat = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("link", "link", reader);
                }
            } else if (v11 == 1) {
                videoFormat = this.videoFormatAdapter.fromJson(reader);
                if (videoFormat == null) {
                    throw c.q("format", "format", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("portraitRatio", "portraitRatio", reader);
                }
                i11 &= -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -7) {
            if (str == null) {
                throw c.j("link", "link", reader);
            }
            Intrinsics.g(videoFormat, "null cannot be cast to non-null type ru.ozon.app.android.pdpvideomolecule.data.VideoFormat");
            return new VideoMolecule(str, videoFormat, bool2.booleanValue(), null, 8, null);
        }
        Constructor<VideoMolecule> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = VideoMolecule.class.getDeclaredConstructor(String.class, VideoFormat.class, Boolean.TYPE, PlayerState.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("link", "link", reader);
        }
        VideoMolecule newInstance = constructor.newInstance(str, videoFormat, bool2, null, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, VideoMolecule value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("link");
        this.stringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("format");
        this.videoFormatAdapter.mo44toJson(writer, (x) value.getFormat());
        writer.w("portraitRatio");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getPortraitRatio()));
        writer.p();
    }
}
