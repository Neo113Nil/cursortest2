package ru.ozon.app.android.storefront.widgets.playvideo.data.models;

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
import ru.ozon.app.android.storefront.core.socialAtoms.iconButton.SocialIconButtonDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.container.SocialProductListDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContent;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoContent;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "socialIconButtonDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelDTO;", "nullableRightPanelDTOAdapter", "Lru/ozon/app/android/storefront/widgets/playvideo/data/models/PlayVideoTitle;", "nullablePlayVideoTitleAdapter", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/container/SocialProductListDTO;", "nullableSocialProductListDTOAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayVideoContentJsonAdapter extends JsonAdapter<PlayVideoContent> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<PlayVideoTitle> nullablePlayVideoTitleAdapter;

    @NotNull
    private final JsonAdapter<RightPanelDTO> nullableRightPanelDTOAdapter;

    @NotNull
    private final JsonAdapter<SocialProductListDTO> nullableSocialProductListDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<SocialIconButtonDTO> socialIconButtonDTOAdapter;

    public PlayVideoContentJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("closeButton", "rightPanel", SelectionItemFormDTO.TITLE_FIELD_NAME, "productList");
        M m11 = M.f71699a;
        this.socialIconButtonDTOAdapter = moshi.f(SocialIconButtonDTO.class, m11, "closeButton");
        this.nullableRightPanelDTOAdapter = moshi.f(RightPanelDTO.class, m11, "rightPanel");
        this.nullablePlayVideoTitleAdapter = moshi.f(PlayVideoTitle.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableSocialProductListDTOAdapter = moshi.f(SocialProductListDTO.class, m11, "productList");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(PlayVideoContent)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PlayVideoContent fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        SocialIconButtonDTO socialIconButtonDTO = null;
        RightPanelDTO rightPanelDTO = null;
        PlayVideoTitle playVideoTitle = null;
        SocialProductListDTO socialProductListDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                socialIconButtonDTO = this.socialIconButtonDTOAdapter.fromJson(reader);
                if (socialIconButtonDTO == null) {
                    throw c.q("closeButton", "closeButton", reader);
                }
            } else if (v11 == 1) {
                rightPanelDTO = this.nullableRightPanelDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                playVideoTitle = this.nullablePlayVideoTitleAdapter.fromJson(reader);
            } else if (v11 == 3) {
                socialProductListDTO = this.nullableSocialProductListDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (socialIconButtonDTO != null) {
            return new PlayVideoContent(socialIconButtonDTO, rightPanelDTO, playVideoTitle, socialProductListDTO);
        }
        throw c.j("closeButton", "closeButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PlayVideoContent value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("closeButton");
        this.socialIconButtonDTOAdapter.mo44toJson(writer, (x) value.getCloseButton());
        writer.w("rightPanel");
        this.nullableRightPanelDTOAdapter.mo44toJson(writer, (x) value.getRightPanel());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullablePlayVideoTitleAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("productList");
        this.nullableSocialProductListDTOAdapter.mo44toJson(writer, (x) value.getProductList());
        writer.p();
    }
}
