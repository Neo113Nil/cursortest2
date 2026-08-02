package ru.ozon.app.android.travel.molecules.dto.railwayServices;

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
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/railwayServices/RailwayServicesDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "listOfIconAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallIconButtonAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RailwayServicesDTOJsonAdapter extends JsonAdapter<RailwayServicesDTO> {
    private volatile Constructor<RailwayServicesDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<Icon>> listOfIconAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> smallIconButtonAdapter;

    public RailwayServicesDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icons", "infoButton");
        b e11 = D.e(List.class, Icon.class);
        M m11 = M.f71699a;
        this.listOfIconAdapter = moshi.f(e11, m11, "icons");
        this.smallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "infoButton");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(40, "GeneratedJsonAdapter(RailwayServicesDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RailwayServicesDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<Icon> list = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfIconAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("icons", "icons", reader);
                }
                i11 = -2;
            } else if (v11 == 1 && (smallIconButton = this.smallIconButtonAdapter.fromJson(reader)) == null) {
                throw c.q("infoButton", "infoButton", reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.button.Icon>");
            if (smallIconButton != null) {
                return new RailwayServicesDTO(list, smallIconButton);
            }
            throw c.j("infoButton", "infoButton", reader);
        }
        Constructor<RailwayServicesDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RailwayServicesDTO.class.getDeclaredConstructor(List.class, ButtonV3Atom.SmallIconButton.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (smallIconButton == null) {
            throw c.j("infoButton", "infoButton", reader);
        }
        RailwayServicesDTO newInstance = constructor.newInstance(list, smallIconButton, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RailwayServicesDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icons");
        this.listOfIconAdapter.mo44toJson(writer, (x) value.getIcons());
        writer.w("infoButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getInfoButton());
        writer.p();
    }
}
