package ru.ozon.app.android.checkoutcomposer.common.formbuilder.data;

import Ak.b;
import An.C2439a;
import B0.C2454a;
import B90.C2618u;
import B90.C2619v;
import C.o0;
import De.C2859b;
import G.g;
import H3.c;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import T7.P;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO;", "", "rows", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row;", "rowSize", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;ILjava/util/Map;)V", "getRows", "()Ljava/util/List;", "getRowSize", "()I", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Row", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FormBuilderDTO {
    private final int rowSize;

    @NotNull
    private final List<Row> rows;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row;", "", "blocks", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block;", "<init>", "(Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Block", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Row {

        @NotNull
        private final List<Block> blocks;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J<\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block;", "", "elements", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "blockSize", "", "rows", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "getBlockSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRows", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block;", "equals", "", "other", "hashCode", "toString", "", "BlockRow", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Block {
            private final Integer blockSize;
            private final List<AtomDTO> elements;

            @NotNull
            private final List<BlockRow> rows;

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow;", "", "fields", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field;", "<init>", "(Ljava/util/List;)V", "getFields", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Field", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class BlockRow {

                @NotNull
                private final List<Field> fields;

                public BlockRow(@NotNull List<Field> fields) {
                    Intrinsics.checkNotNullParameter(fields, "fields");
                    this.fields = fields;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ BlockRow copy$default(BlockRow blockRow, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        list = blockRow.fields;
                    }
                    return blockRow.copy(list);
                }

                @NotNull
                public final List<Field> component1() {
                    return this.fields;
                }

                @NotNull
                public final BlockRow copy(@NotNull List<Field> fields) {
                    Intrinsics.checkNotNullParameter(fields, "fields");
                    return new BlockRow(fields);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof BlockRow) && Intrinsics.d(this.fields, ((BlockRow) other).fields);
                }

                @NotNull
                public final List<Field> getFields() {
                    return this.fields;
                }

                public int hashCode() {
                    return this.fields.hashCode();
                }

                @NotNull
                public String toString() {
                    return c.a("BlockRow(fields=", ")", this.fields);
                }

                @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001:\u0005JKLMNB\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001bHÆ\u0003J·\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0013\u0010F\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0005HÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006O"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field;", "", "fieldType", "", "fieldSize", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "label", "text", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isEnabled", "", "searchOptions", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;", "selectOptions", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions;", "textOptions", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$TextOptions;", "actionOptions", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ActionOptions;", "error", "elements", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "chipsWithField", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$TextOptions;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ActionOptions;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getFieldType", "()Ljava/lang/String;", "getFieldSize", "()I", "getName", "getLabel", "getText", "getValue", "()Z", "getSearchOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;", "getSelectOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions;", "getTextOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$TextOptions;", "getActionOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ActionOptions;", "getError", "getElements", "()Ljava/util/List;", "getChipsWithField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "TextOptions", "SearchOptions", "SelectOptions", "ActionOptions", "ChipsWithField", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                @j(generateAdapter = true)
                public static final /* data */ class Field {
                    private final ActionOptions actionOptions;
                    private final ChipsWithField chipsWithField;
                    private final List<AtomDTO> elements;
                    private final String error;
                    private final int fieldSize;

                    @NotNull
                    private final String fieldType;
                    private final boolean isEnabled;

                    @NotNull
                    private final String label;

                    @NotNull
                    private final String name;
                    private final OnBoardingDTO onboarding;
                    private final SearchOptions searchOptions;
                    private final SelectOptions selectOptions;
                    private final String text;
                    private final TextOptions textOptions;

                    @NotNull
                    private final String value;

                    @j(generateAdapter = true)
                    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ActionOptions;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final /* data */ class ActionOptions {

                        @NotNull
                        private final AtomActionDTO action;

                        public ActionOptions(@NotNull AtomActionDTO action) {
                            Intrinsics.checkNotNullParameter(action, "action");
                            this.action = action;
                        }

                        public static /* synthetic */ ActionOptions copy$default(ActionOptions actionOptions, AtomActionDTO atomActionDTO, int i11, Object obj) {
                            if ((i11 & 1) != 0) {
                                atomActionDTO = actionOptions.action;
                            }
                            return actionOptions.copy(atomActionDTO);
                        }

                        @NotNull
                        /* renamed from: component1, reason: from getter */
                        public final AtomActionDTO getAction() {
                            return this.action;
                        }

                        @NotNull
                        public final ActionOptions copy(@NotNull AtomActionDTO action) {
                            Intrinsics.checkNotNullParameter(action, "action");
                            return new ActionOptions(action);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof ActionOptions) && Intrinsics.d(this.action, ((ActionOptions) other).action);
                        }

                        @NotNull
                        public final AtomActionDTO getAction() {
                            return this.action;
                        }

                        public int hashCode() {
                            return this.action.hashCode();
                        }

                        @NotNull
                        public String toString() {
                            return C2859b.f("ActionOptions(action=", ")", this.action);
                        }
                    }

                    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField;", "", "chipsMobile", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField$ChipItemMobile;", "textField", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField$TextField;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField$TextField;)V", "getChipsMobile", "()Ljava/util/List;", "getTextField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField$TextField;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ChipItemMobile", "TextField", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    @j(generateAdapter = true)
                    public static final /* data */ class ChipsWithField {
                        private final List<ChipItemMobile> chipsMobile;
                        private final TextField textField;

                        @j(generateAdapter = true)
                        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField$ChipItemMobile;", "", "hasTextField", "", "tagButton", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "<init>", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "getHasTextField", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField$ChipItemMobile;", "equals", "other", "hashCode", "", "toString", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        public static final /* data */ class ChipItemMobile {
                            private final Boolean hasTextField;

                            @NotNull
                            private final TagButtonDTO tagButton;

                            public ChipItemMobile(Boolean bool, @NotNull TagButtonDTO tagButton) {
                                Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                                this.hasTextField = bool;
                                this.tagButton = tagButton;
                            }

                            public static /* synthetic */ ChipItemMobile copy$default(ChipItemMobile chipItemMobile, Boolean bool, TagButtonDTO tagButtonDTO, int i11, Object obj) {
                                if ((i11 & 1) != 0) {
                                    bool = chipItemMobile.hasTextField;
                                }
                                if ((i11 & 2) != 0) {
                                    tagButtonDTO = chipItemMobile.tagButton;
                                }
                                return chipItemMobile.copy(bool, tagButtonDTO);
                            }

                            /* renamed from: component1, reason: from getter */
                            public final Boolean getHasTextField() {
                                return this.hasTextField;
                            }

                            @NotNull
                            /* renamed from: component2, reason: from getter */
                            public final TagButtonDTO getTagButton() {
                                return this.tagButton;
                            }

                            @NotNull
                            public final ChipItemMobile copy(Boolean hasTextField, @NotNull TagButtonDTO tagButton) {
                                Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                                return new ChipItemMobile(hasTextField, tagButton);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof ChipItemMobile)) {
                                    return false;
                                }
                                ChipItemMobile chipItemMobile = (ChipItemMobile) other;
                                return Intrinsics.d(this.hasTextField, chipItemMobile.hasTextField) && Intrinsics.d(this.tagButton, chipItemMobile.tagButton);
                            }

                            public final Boolean getHasTextField() {
                                return this.hasTextField;
                            }

                            @NotNull
                            public final TagButtonDTO getTagButton() {
                                return this.tagButton;
                            }

                            public int hashCode() {
                                Boolean bool = this.hasTextField;
                                return this.tagButton.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
                            }

                            @NotNull
                            public String toString() {
                                return "ChipItemMobile(hasTextField=" + this.hasTextField + ", tagButton=" + this.tagButton + ")";
                            }
                        }

                        @j(generateAdapter = true)
                        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$ChipsWithField$TextField;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getPlaceholder", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        public static final /* data */ class TextField {
                            private final String placeholder;
                            private final String value;

                            public TextField(String str, String str2) {
                                this.value = str;
                                this.placeholder = str2;
                            }

                            public static /* synthetic */ TextField copy$default(TextField textField, String str, String str2, int i11, Object obj) {
                                if ((i11 & 1) != 0) {
                                    str = textField.value;
                                }
                                if ((i11 & 2) != 0) {
                                    str2 = textField.placeholder;
                                }
                                return textField.copy(str, str2);
                            }

                            /* renamed from: component1, reason: from getter */
                            public final String getValue() {
                                return this.value;
                            }

                            /* renamed from: component2, reason: from getter */
                            public final String getPlaceholder() {
                                return this.placeholder;
                            }

                            @NotNull
                            public final TextField copy(String value, String placeholder) {
                                return new TextField(value, placeholder);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof TextField)) {
                                    return false;
                                }
                                TextField textField = (TextField) other;
                                return Intrinsics.d(this.value, textField.value) && Intrinsics.d(this.placeholder, textField.placeholder);
                            }

                            public final String getPlaceholder() {
                                return this.placeholder;
                            }

                            public final String getValue() {
                                return this.value;
                            }

                            public int hashCode() {
                                String str = this.value;
                                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                                String str2 = this.placeholder;
                                return hashCode + (str2 != null ? str2.hashCode() : 0);
                            }

                            @NotNull
                            public String toString() {
                                return e.a("TextField(value=", this.value, ", placeholder=", this.placeholder, ")");
                            }
                        }

                        public ChipsWithField(List<ChipItemMobile> list, TextField textField) {
                            this.chipsMobile = list;
                            this.textField = textField;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static /* synthetic */ ChipsWithField copy$default(ChipsWithField chipsWithField, List list, TextField textField, int i11, Object obj) {
                            if ((i11 & 1) != 0) {
                                list = chipsWithField.chipsMobile;
                            }
                            if ((i11 & 2) != 0) {
                                textField = chipsWithField.textField;
                            }
                            return chipsWithField.copy(list, textField);
                        }

                        public final List<ChipItemMobile> component1() {
                            return this.chipsMobile;
                        }

                        /* renamed from: component2, reason: from getter */
                        public final TextField getTextField() {
                            return this.textField;
                        }

                        @NotNull
                        public final ChipsWithField copy(List<ChipItemMobile> chipsMobile, TextField textField) {
                            return new ChipsWithField(chipsMobile, textField);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof ChipsWithField)) {
                                return false;
                            }
                            ChipsWithField chipsWithField = (ChipsWithField) other;
                            return Intrinsics.d(this.chipsMobile, chipsWithField.chipsMobile) && Intrinsics.d(this.textField, chipsWithField.textField);
                        }

                        public final List<ChipItemMobile> getChipsMobile() {
                            return this.chipsMobile;
                        }

                        public final TextField getTextField() {
                            return this.textField;
                        }

                        public int hashCode() {
                            List<ChipItemMobile> list = this.chipsMobile;
                            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                            TextField textField = this.textField;
                            return hashCode + (textField != null ? textField.hashCode() : 0);
                        }

                        @NotNull
                        public String toString() {
                            return "ChipsWithField(chipsMobile=" + this.chipsMobile + ", textField=" + this.textField + ")";
                        }
                    }

                    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions;", "", "link", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "threshold", "", "boundingBox", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;", "states", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States;)V", "getLink", "()Ljava/lang/String;", "getTitle", "getThreshold", "()I", "getBoundingBox", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;", "getStates", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "States", "BoundingBox", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    @j(generateAdapter = true)
                    public static final /* data */ class SearchOptions {
                        private final BoundingBox boundingBox;

                        @NotNull
                        private final String link;
                        private final States states;
                        private final int threshold;
                        private final String title;

                        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox;", "", "rightTop", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox$GeoCoordinate;", "leftBottom", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox$GeoCoordinate;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox$GeoCoordinate;)V", "getRightTop", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox$GeoCoordinate;", "getLeftBottom", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GeoCoordinate", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        @j(generateAdapter = true)
                        public static final /* data */ class BoundingBox {

                            @NotNull
                            private final GeoCoordinate leftBottom;

                            @NotNull
                            private final GeoCoordinate rightTop;

                            @j(generateAdapter = true)
                            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$BoundingBox$GeoCoordinate;", "", "latitude", "", "longitude", "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                            public static final /* data */ class GeoCoordinate {
                                private final double latitude;
                                private final double longitude;

                                public GeoCoordinate(double d11, double d12) {
                                    this.latitude = d11;
                                    this.longitude = d12;
                                }

                                public static /* synthetic */ GeoCoordinate copy$default(GeoCoordinate geoCoordinate, double d11, double d12, int i11, Object obj) {
                                    if ((i11 & 1) != 0) {
                                        d11 = geoCoordinate.latitude;
                                    }
                                    if ((i11 & 2) != 0) {
                                        d12 = geoCoordinate.longitude;
                                    }
                                    return geoCoordinate.copy(d11, d12);
                                }

                                /* renamed from: component1, reason: from getter */
                                public final double getLatitude() {
                                    return this.latitude;
                                }

                                /* renamed from: component2, reason: from getter */
                                public final double getLongitude() {
                                    return this.longitude;
                                }

                                @NotNull
                                public final GeoCoordinate copy(double latitude, double longitude) {
                                    return new GeoCoordinate(latitude, longitude);
                                }

                                public boolean equals(Object other) {
                                    if (this == other) {
                                        return true;
                                    }
                                    if (!(other instanceof GeoCoordinate)) {
                                        return false;
                                    }
                                    GeoCoordinate geoCoordinate = (GeoCoordinate) other;
                                    return Double.compare(this.latitude, geoCoordinate.latitude) == 0 && Double.compare(this.longitude, geoCoordinate.longitude) == 0;
                                }

                                public final double getLatitude() {
                                    return this.latitude;
                                }

                                public final double getLongitude() {
                                    return this.longitude;
                                }

                                public int hashCode() {
                                    return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
                                }

                                @NotNull
                                public String toString() {
                                    double d11 = this.latitude;
                                    return C2619v.c(Cm.e.e(d11, "GeoCoordinate(latitude=", ", longitude="), this.longitude, ")");
                                }
                            }

                            public BoundingBox(@NotNull GeoCoordinate rightTop, @NotNull GeoCoordinate leftBottom) {
                                Intrinsics.checkNotNullParameter(rightTop, "rightTop");
                                Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
                                this.rightTop = rightTop;
                                this.leftBottom = leftBottom;
                            }

                            public static /* synthetic */ BoundingBox copy$default(BoundingBox boundingBox, GeoCoordinate geoCoordinate, GeoCoordinate geoCoordinate2, int i11, Object obj) {
                                if ((i11 & 1) != 0) {
                                    geoCoordinate = boundingBox.rightTop;
                                }
                                if ((i11 & 2) != 0) {
                                    geoCoordinate2 = boundingBox.leftBottom;
                                }
                                return boundingBox.copy(geoCoordinate, geoCoordinate2);
                            }

                            @NotNull
                            /* renamed from: component1, reason: from getter */
                            public final GeoCoordinate getRightTop() {
                                return this.rightTop;
                            }

                            @NotNull
                            /* renamed from: component2, reason: from getter */
                            public final GeoCoordinate getLeftBottom() {
                                return this.leftBottom;
                            }

                            @NotNull
                            public final BoundingBox copy(@NotNull GeoCoordinate rightTop, @NotNull GeoCoordinate leftBottom) {
                                Intrinsics.checkNotNullParameter(rightTop, "rightTop");
                                Intrinsics.checkNotNullParameter(leftBottom, "leftBottom");
                                return new BoundingBox(rightTop, leftBottom);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof BoundingBox)) {
                                    return false;
                                }
                                BoundingBox boundingBox = (BoundingBox) other;
                                return Intrinsics.d(this.rightTop, boundingBox.rightTop) && Intrinsics.d(this.leftBottom, boundingBox.leftBottom);
                            }

                            @NotNull
                            public final GeoCoordinate getLeftBottom() {
                                return this.leftBottom;
                            }

                            @NotNull
                            public final GeoCoordinate getRightTop() {
                                return this.rightTop;
                            }

                            public int hashCode() {
                                return this.leftBottom.hashCode() + (this.rightTop.hashCode() * 31);
                            }

                            @NotNull
                            public String toString() {
                                return "BoundingBox(rightTop=" + this.rightTop + ", leftBottom=" + this.leftBottom + ")";
                            }
                        }

                        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States;", "", "empty", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States$StubState;", "unavailableAddress", "initial", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States$StubState;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States$StubState;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States$StubState;)V", "getEmpty", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States$StubState;", "getUnavailableAddress", "getInitial", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "StubState", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        @j(generateAdapter = true)
                        public static final /* data */ class States {
                            private final StubState empty;
                            private final StubState initial;
                            private final StubState unavailableAddress;

                            @j(generateAdapter = true)
                            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SearchOptions$States$StubState;", "", "annotations", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Ljava/util/List;)V", "getAnnotations", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                            public static final /* data */ class StubState {

                                @NotNull
                                private final List<AtomDTO> annotations;

                                /* JADX WARN: Multi-variable type inference failed */
                                public StubState(@NotNull List<? extends AtomDTO> annotations) {
                                    Intrinsics.checkNotNullParameter(annotations, "annotations");
                                    this.annotations = annotations;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                public static /* synthetic */ StubState copy$default(StubState stubState, List list, int i11, Object obj) {
                                    if ((i11 & 1) != 0) {
                                        list = stubState.annotations;
                                    }
                                    return stubState.copy(list);
                                }

                                @NotNull
                                public final List<AtomDTO> component1() {
                                    return this.annotations;
                                }

                                @NotNull
                                public final StubState copy(@NotNull List<? extends AtomDTO> annotations) {
                                    Intrinsics.checkNotNullParameter(annotations, "annotations");
                                    return new StubState(annotations);
                                }

                                public boolean equals(Object other) {
                                    if (this == other) {
                                        return true;
                                    }
                                    return (other instanceof StubState) && Intrinsics.d(this.annotations, ((StubState) other).annotations);
                                }

                                @NotNull
                                public final List<AtomDTO> getAnnotations() {
                                    return this.annotations;
                                }

                                public int hashCode() {
                                    return this.annotations.hashCode();
                                }

                                @NotNull
                                public String toString() {
                                    return c.a("StubState(annotations=", ")", this.annotations);
                                }
                            }

                            public States(StubState stubState, StubState stubState2, StubState stubState3) {
                                this.empty = stubState;
                                this.unavailableAddress = stubState2;
                                this.initial = stubState3;
                            }

                            public static /* synthetic */ States copy$default(States states, StubState stubState, StubState stubState2, StubState stubState3, int i11, Object obj) {
                                if ((i11 & 1) != 0) {
                                    stubState = states.empty;
                                }
                                if ((i11 & 2) != 0) {
                                    stubState2 = states.unavailableAddress;
                                }
                                if ((i11 & 4) != 0) {
                                    stubState3 = states.initial;
                                }
                                return states.copy(stubState, stubState2, stubState3);
                            }

                            /* renamed from: component1, reason: from getter */
                            public final StubState getEmpty() {
                                return this.empty;
                            }

                            /* renamed from: component2, reason: from getter */
                            public final StubState getUnavailableAddress() {
                                return this.unavailableAddress;
                            }

                            /* renamed from: component3, reason: from getter */
                            public final StubState getInitial() {
                                return this.initial;
                            }

                            @NotNull
                            public final States copy(StubState empty, StubState unavailableAddress, StubState initial) {
                                return new States(empty, unavailableAddress, initial);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof States)) {
                                    return false;
                                }
                                States states = (States) other;
                                return Intrinsics.d(this.empty, states.empty) && Intrinsics.d(this.unavailableAddress, states.unavailableAddress) && Intrinsics.d(this.initial, states.initial);
                            }

                            public final StubState getEmpty() {
                                return this.empty;
                            }

                            public final StubState getInitial() {
                                return this.initial;
                            }

                            public final StubState getUnavailableAddress() {
                                return this.unavailableAddress;
                            }

                            public int hashCode() {
                                StubState stubState = this.empty;
                                int hashCode = (stubState == null ? 0 : stubState.hashCode()) * 31;
                                StubState stubState2 = this.unavailableAddress;
                                int hashCode2 = (hashCode + (stubState2 == null ? 0 : stubState2.hashCode())) * 31;
                                StubState stubState3 = this.initial;
                                return hashCode2 + (stubState3 != null ? stubState3.hashCode() : 0);
                            }

                            @NotNull
                            public String toString() {
                                return "States(empty=" + this.empty + ", unavailableAddress=" + this.unavailableAddress + ", initial=" + this.initial + ")";
                            }
                        }

                        public SearchOptions(@NotNull String link, String str, int i11, BoundingBox boundingBox, States states) {
                            Intrinsics.checkNotNullParameter(link, "link");
                            this.link = link;
                            this.title = str;
                            this.threshold = i11;
                            this.boundingBox = boundingBox;
                            this.states = states;
                        }

                        public static /* synthetic */ SearchOptions copy$default(SearchOptions searchOptions, String str, String str2, int i11, BoundingBox boundingBox, States states, int i12, Object obj) {
                            if ((i12 & 1) != 0) {
                                str = searchOptions.link;
                            }
                            if ((i12 & 2) != 0) {
                                str2 = searchOptions.title;
                            }
                            if ((i12 & 4) != 0) {
                                i11 = searchOptions.threshold;
                            }
                            if ((i12 & 8) != 0) {
                                boundingBox = searchOptions.boundingBox;
                            }
                            if ((i12 & 16) != 0) {
                                states = searchOptions.states;
                            }
                            States states2 = states;
                            int i13 = i11;
                            return searchOptions.copy(str, str2, i13, boundingBox, states2);
                        }

                        @NotNull
                        /* renamed from: component1, reason: from getter */
                        public final String getLink() {
                            return this.link;
                        }

                        /* renamed from: component2, reason: from getter */
                        public final String getTitle() {
                            return this.title;
                        }

                        /* renamed from: component3, reason: from getter */
                        public final int getThreshold() {
                            return this.threshold;
                        }

                        /* renamed from: component4, reason: from getter */
                        public final BoundingBox getBoundingBox() {
                            return this.boundingBox;
                        }

                        /* renamed from: component5, reason: from getter */
                        public final States getStates() {
                            return this.states;
                        }

                        @NotNull
                        public final SearchOptions copy(@NotNull String link, String title, int threshold, BoundingBox boundingBox, States states) {
                            Intrinsics.checkNotNullParameter(link, "link");
                            return new SearchOptions(link, title, threshold, boundingBox, states);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof SearchOptions)) {
                                return false;
                            }
                            SearchOptions searchOptions = (SearchOptions) other;
                            return Intrinsics.d(this.link, searchOptions.link) && Intrinsics.d(this.title, searchOptions.title) && this.threshold == searchOptions.threshold && Intrinsics.d(this.boundingBox, searchOptions.boundingBox) && Intrinsics.d(this.states, searchOptions.states);
                        }

                        public final BoundingBox getBoundingBox() {
                            return this.boundingBox;
                        }

                        @NotNull
                        public final String getLink() {
                            return this.link;
                        }

                        public final States getStates() {
                            return this.states;
                        }

                        public final int getThreshold() {
                            return this.threshold;
                        }

                        public final String getTitle() {
                            return this.title;
                        }

                        public int hashCode() {
                            int hashCode = this.link.hashCode() * 31;
                            String str = this.title;
                            int a11 = C2454a.a(this.threshold, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                            BoundingBox boundingBox = this.boundingBox;
                            int hashCode2 = (a11 + (boundingBox == null ? 0 : boundingBox.hashCode())) * 31;
                            States states = this.states;
                            return hashCode2 + (states != null ? states.hashCode() : 0);
                        }

                        @NotNull
                        public String toString() {
                            String str = this.link;
                            String str2 = this.title;
                            int i11 = this.threshold;
                            BoundingBox boundingBox = this.boundingBox;
                            States states = this.states;
                            StringBuilder d11 = C3660k.d("SearchOptions(link=", str, ", title=", str2, ", threshold=");
                            d11.append(i11);
                            d11.append(", boundingBox=");
                            d11.append(boundingBox);
                            d11.append(", states=");
                            d11.append(states);
                            d11.append(")");
                            return d11.toString();
                        }
                    }

                    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "options", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions$Option;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Option", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    @j(generateAdapter = true)
                    public static final /* data */ class SelectOptions {

                        @NotNull
                        private final List<Option> options;

                        @NotNull
                        private final String title;

                        @j(generateAdapter = true)
                        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$SelectOptions$Option;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "deepLink", "subText", "subTextColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getDeepLink", "getSubText", "getSubTextColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                        public static final /* data */ class Option {
                            private final String deepLink;
                            private final String subText;
                            private final String subTextColor;

                            @NotNull
                            private final OzonSpannableString text;

                            @NotNull
                            private final String value;

                            public Option(@NotNull String value, @NotNull OzonSpannableString text, String str, String str2, String str3) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                Intrinsics.checkNotNullParameter(text, "text");
                                this.value = value;
                                this.text = text;
                                this.deepLink = str;
                                this.subText = str2;
                                this.subTextColor = str3;
                            }

                            public static /* synthetic */ Option copy$default(Option option, String str, OzonSpannableString ozonSpannableString, String str2, String str3, String str4, int i11, Object obj) {
                                if ((i11 & 1) != 0) {
                                    str = option.value;
                                }
                                if ((i11 & 2) != 0) {
                                    ozonSpannableString = option.text;
                                }
                                if ((i11 & 4) != 0) {
                                    str2 = option.deepLink;
                                }
                                if ((i11 & 8) != 0) {
                                    str3 = option.subText;
                                }
                                if ((i11 & 16) != 0) {
                                    str4 = option.subTextColor;
                                }
                                String str5 = str4;
                                String str6 = str2;
                                return option.copy(str, ozonSpannableString, str6, str3, str5);
                            }

                            @NotNull
                            /* renamed from: component1, reason: from getter */
                            public final String getValue() {
                                return this.value;
                            }

                            @NotNull
                            /* renamed from: component2, reason: from getter */
                            public final OzonSpannableString getText() {
                                return this.text;
                            }

                            /* renamed from: component3, reason: from getter */
                            public final String getDeepLink() {
                                return this.deepLink;
                            }

                            /* renamed from: component4, reason: from getter */
                            public final String getSubText() {
                                return this.subText;
                            }

                            /* renamed from: component5, reason: from getter */
                            public final String getSubTextColor() {
                                return this.subTextColor;
                            }

                            @NotNull
                            public final Option copy(@NotNull String value, @NotNull OzonSpannableString text, String deepLink, String subText, String subTextColor) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                Intrinsics.checkNotNullParameter(text, "text");
                                return new Option(value, text, deepLink, subText, subTextColor);
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                if (!(other instanceof Option)) {
                                    return false;
                                }
                                Option option = (Option) other;
                                return Intrinsics.d(this.value, option.value) && Intrinsics.d(this.text, option.text) && Intrinsics.d(this.deepLink, option.deepLink) && Intrinsics.d(this.subText, option.subText) && Intrinsics.d(this.subTextColor, option.subTextColor);
                            }

                            public final String getDeepLink() {
                                return this.deepLink;
                            }

                            public final String getSubText() {
                                return this.subText;
                            }

                            public final String getSubTextColor() {
                                return this.subTextColor;
                            }

                            @NotNull
                            public final OzonSpannableString getText() {
                                return this.text;
                            }

                            @NotNull
                            public final String getValue() {
                                return this.value;
                            }

                            public int hashCode() {
                                int c11 = P.c(this.text, this.value.hashCode() * 31, 31);
                                String str = this.deepLink;
                                int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
                                String str2 = this.subText;
                                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                                String str3 = this.subTextColor;
                                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                            }

                            @NotNull
                            public String toString() {
                                String str = this.value;
                                OzonSpannableString ozonSpannableString = this.text;
                                String str2 = this.deepLink;
                                String str3 = this.subText;
                                String str4 = this.subTextColor;
                                StringBuilder sb2 = new StringBuilder("Option(value=");
                                sb2.append(str);
                                sb2.append(", text=");
                                sb2.append((Object) ozonSpannableString);
                                sb2.append(", deepLink=");
                                a.h(sb2, str2, ", subText=", str3, ", subTextColor=");
                                return o0.c(sb2, str4, ")");
                            }
                        }

                        public SelectOptions(@NotNull String title, @NotNull List<Option> options) {
                            Intrinsics.checkNotNullParameter(title, "title");
                            Intrinsics.checkNotNullParameter(options, "options");
                            this.title = title;
                            this.options = options;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static /* synthetic */ SelectOptions copy$default(SelectOptions selectOptions, String str, List list, int i11, Object obj) {
                            if ((i11 & 1) != 0) {
                                str = selectOptions.title;
                            }
                            if ((i11 & 2) != 0) {
                                list = selectOptions.options;
                            }
                            return selectOptions.copy(str, list);
                        }

                        @NotNull
                        /* renamed from: component1, reason: from getter */
                        public final String getTitle() {
                            return this.title;
                        }

                        @NotNull
                        public final List<Option> component2() {
                            return this.options;
                        }

                        @NotNull
                        public final SelectOptions copy(@NotNull String title, @NotNull List<Option> options) {
                            Intrinsics.checkNotNullParameter(title, "title");
                            Intrinsics.checkNotNullParameter(options, "options");
                            return new SelectOptions(title, options);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof SelectOptions)) {
                                return false;
                            }
                            SelectOptions selectOptions = (SelectOptions) other;
                            return Intrinsics.d(this.title, selectOptions.title) && Intrinsics.d(this.options, selectOptions.options);
                        }

                        @NotNull
                        public final List<Option> getOptions() {
                            return this.options;
                        }

                        @NotNull
                        public final String getTitle() {
                            return this.title;
                        }

                        public int hashCode() {
                            return this.options.hashCode() + (this.title.hashCode() * 31);
                        }

                        @NotNull
                        public String toString() {
                            return C2439a.a("SelectOptions(title=", this.title, ", options=", ")", this.options);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public Field(@NotNull String fieldType, int i11, @NotNull String name, @NotNull String label, String str, @NotNull String value, boolean z11, SearchOptions searchOptions, SelectOptions selectOptions, TextOptions textOptions, ActionOptions actionOptions, String str2, List<? extends AtomDTO> list, ChipsWithField chipsWithField, OnBoardingDTO onBoardingDTO) {
                        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(label, "label");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.fieldType = fieldType;
                        this.fieldSize = i11;
                        this.name = name;
                        this.label = label;
                        this.text = str;
                        this.value = value;
                        this.isEnabled = z11;
                        this.searchOptions = searchOptions;
                        this.selectOptions = selectOptions;
                        this.textOptions = textOptions;
                        this.actionOptions = actionOptions;
                        this.error = str2;
                        this.elements = list;
                        this.chipsWithField = chipsWithField;
                        this.onboarding = onBoardingDTO;
                    }

                    @NotNull
                    /* renamed from: component1, reason: from getter */
                    public final String getFieldType() {
                        return this.fieldType;
                    }

                    /* renamed from: component10, reason: from getter */
                    public final TextOptions getTextOptions() {
                        return this.textOptions;
                    }

                    /* renamed from: component11, reason: from getter */
                    public final ActionOptions getActionOptions() {
                        return this.actionOptions;
                    }

                    /* renamed from: component12, reason: from getter */
                    public final String getError() {
                        return this.error;
                    }

                    public final List<AtomDTO> component13() {
                        return this.elements;
                    }

                    /* renamed from: component14, reason: from getter */
                    public final ChipsWithField getChipsWithField() {
                        return this.chipsWithField;
                    }

                    /* renamed from: component15, reason: from getter */
                    public final OnBoardingDTO getOnboarding() {
                        return this.onboarding;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final int getFieldSize() {
                        return this.fieldSize;
                    }

                    @NotNull
                    /* renamed from: component3, reason: from getter */
                    public final String getName() {
                        return this.name;
                    }

                    @NotNull
                    /* renamed from: component4, reason: from getter */
                    public final String getLabel() {
                        return this.label;
                    }

                    /* renamed from: component5, reason: from getter */
                    public final String getText() {
                        return this.text;
                    }

                    @NotNull
                    /* renamed from: component6, reason: from getter */
                    public final String getValue() {
                        return this.value;
                    }

                    /* renamed from: component7, reason: from getter */
                    public final boolean getIsEnabled() {
                        return this.isEnabled;
                    }

                    /* renamed from: component8, reason: from getter */
                    public final SearchOptions getSearchOptions() {
                        return this.searchOptions;
                    }

                    /* renamed from: component9, reason: from getter */
                    public final SelectOptions getSelectOptions() {
                        return this.selectOptions;
                    }

                    @NotNull
                    public final Field copy(@NotNull String fieldType, int fieldSize, @NotNull String name, @NotNull String label, String text, @NotNull String value, boolean isEnabled, SearchOptions searchOptions, SelectOptions selectOptions, TextOptions textOptions, ActionOptions actionOptions, String error, List<? extends AtomDTO> elements, ChipsWithField chipsWithField, OnBoardingDTO onboarding) {
                        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(label, "label");
                        Intrinsics.checkNotNullParameter(value, "value");
                        return new Field(fieldType, fieldSize, name, label, text, value, isEnabled, searchOptions, selectOptions, textOptions, actionOptions, error, elements, chipsWithField, onboarding);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Field)) {
                            return false;
                        }
                        Field field = (Field) other;
                        return Intrinsics.d(this.fieldType, field.fieldType) && this.fieldSize == field.fieldSize && Intrinsics.d(this.name, field.name) && Intrinsics.d(this.label, field.label) && Intrinsics.d(this.text, field.text) && Intrinsics.d(this.value, field.value) && this.isEnabled == field.isEnabled && Intrinsics.d(this.searchOptions, field.searchOptions) && Intrinsics.d(this.selectOptions, field.selectOptions) && Intrinsics.d(this.textOptions, field.textOptions) && Intrinsics.d(this.actionOptions, field.actionOptions) && Intrinsics.d(this.error, field.error) && Intrinsics.d(this.elements, field.elements) && Intrinsics.d(this.chipsWithField, field.chipsWithField) && Intrinsics.d(this.onboarding, field.onboarding);
                    }

                    public final ActionOptions getActionOptions() {
                        return this.actionOptions;
                    }

                    public final ChipsWithField getChipsWithField() {
                        return this.chipsWithField;
                    }

                    public final List<AtomDTO> getElements() {
                        return this.elements;
                    }

                    public final String getError() {
                        return this.error;
                    }

                    public final int getFieldSize() {
                        return this.fieldSize;
                    }

                    @NotNull
                    public final String getFieldType() {
                        return this.fieldType;
                    }

                    @NotNull
                    public final String getLabel() {
                        return this.label;
                    }

                    @NotNull
                    public final String getName() {
                        return this.name;
                    }

                    public final OnBoardingDTO getOnboarding() {
                        return this.onboarding;
                    }

                    public final SearchOptions getSearchOptions() {
                        return this.searchOptions;
                    }

                    public final SelectOptions getSelectOptions() {
                        return this.selectOptions;
                    }

                    public final String getText() {
                        return this.text;
                    }

                    public final TextOptions getTextOptions() {
                        return this.textOptions;
                    }

                    @NotNull
                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        int a11 = g.a(g.a(C2454a.a(this.fieldSize, this.fieldType.hashCode() * 31, 31), 31, this.name), 31, this.label);
                        String str = this.text;
                        int a12 = C3532b.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.value), 31, this.isEnabled);
                        SearchOptions searchOptions = this.searchOptions;
                        int hashCode = (a12 + (searchOptions == null ? 0 : searchOptions.hashCode())) * 31;
                        SelectOptions selectOptions = this.selectOptions;
                        int hashCode2 = (hashCode + (selectOptions == null ? 0 : selectOptions.hashCode())) * 31;
                        TextOptions textOptions = this.textOptions;
                        int hashCode3 = (hashCode2 + (textOptions == null ? 0 : textOptions.hashCode())) * 31;
                        ActionOptions actionOptions = this.actionOptions;
                        int hashCode4 = (hashCode3 + (actionOptions == null ? 0 : actionOptions.hashCode())) * 31;
                        String str2 = this.error;
                        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        List<AtomDTO> list = this.elements;
                        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
                        ChipsWithField chipsWithField = this.chipsWithField;
                        int hashCode7 = (hashCode6 + (chipsWithField == null ? 0 : chipsWithField.hashCode())) * 31;
                        OnBoardingDTO onBoardingDTO = this.onboarding;
                        return hashCode7 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
                    }

                    public final boolean isEnabled() {
                        return this.isEnabled;
                    }

                    @NotNull
                    public String toString() {
                        String str = this.fieldType;
                        int i11 = this.fieldSize;
                        String str2 = this.name;
                        String str3 = this.label;
                        String str4 = this.text;
                        String str5 = this.value;
                        boolean z11 = this.isEnabled;
                        SearchOptions searchOptions = this.searchOptions;
                        SelectOptions selectOptions = this.selectOptions;
                        TextOptions textOptions = this.textOptions;
                        ActionOptions actionOptions = this.actionOptions;
                        String str6 = this.error;
                        List<AtomDTO> list = this.elements;
                        ChipsWithField chipsWithField = this.chipsWithField;
                        OnBoardingDTO onBoardingDTO = this.onboarding;
                        StringBuilder c11 = C3660k.c(i11, "Field(fieldType=", str, ", fieldSize=", ", name=");
                        a.h(c11, str2, ", label=", str3, ", text=");
                        a.h(c11, str4, ", value=", str5, ", isEnabled=");
                        c11.append(z11);
                        c11.append(", searchOptions=");
                        c11.append(searchOptions);
                        c11.append(", selectOptions=");
                        c11.append(selectOptions);
                        c11.append(", textOptions=");
                        c11.append(textOptions);
                        c11.append(", actionOptions=");
                        c11.append(actionOptions);
                        c11.append(", error=");
                        c11.append(str6);
                        c11.append(", elements=");
                        c11.append(list);
                        c11.append(", chipsWithField=");
                        c11.append(chipsWithField);
                        c11.append(", onboarding=");
                        c11.append(onBoardingDTO);
                        c11.append(")");
                        return c11.toString();
                    }

                    @j(generateAdapter = true)
                    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/data/FormBuilderDTO$Row$Block$BlockRow$Field$TextOptions;", "", "inputType", "", "isMultiline", "", "<init>", "(Ljava/lang/String;Z)V", "getInputType", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                    public static final /* data */ class TextOptions {

                        @NotNull
                        private final String inputType;
                        private final boolean isMultiline;

                        public TextOptions(@NotNull String inputType, boolean z11) {
                            Intrinsics.checkNotNullParameter(inputType, "inputType");
                            this.inputType = inputType;
                            this.isMultiline = z11;
                        }

                        public static /* synthetic */ TextOptions copy$default(TextOptions textOptions, String str, boolean z11, int i11, Object obj) {
                            if ((i11 & 1) != 0) {
                                str = textOptions.inputType;
                            }
                            if ((i11 & 2) != 0) {
                                z11 = textOptions.isMultiline;
                            }
                            return textOptions.copy(str, z11);
                        }

                        @NotNull
                        /* renamed from: component1, reason: from getter */
                        public final String getInputType() {
                            return this.inputType;
                        }

                        /* renamed from: component2, reason: from getter */
                        public final boolean getIsMultiline() {
                            return this.isMultiline;
                        }

                        @NotNull
                        public final TextOptions copy(@NotNull String inputType, boolean isMultiline) {
                            Intrinsics.checkNotNullParameter(inputType, "inputType");
                            return new TextOptions(inputType, isMultiline);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof TextOptions)) {
                                return false;
                            }
                            TextOptions textOptions = (TextOptions) other;
                            return Intrinsics.d(this.inputType, textOptions.inputType) && this.isMultiline == textOptions.isMultiline;
                        }

                        @NotNull
                        public final String getInputType() {
                            return this.inputType;
                        }

                        public int hashCode() {
                            return Boolean.hashCode(this.isMultiline) + (this.inputType.hashCode() * 31);
                        }

                        public final boolean isMultiline() {
                            return this.isMultiline;
                        }

                        @NotNull
                        public String toString() {
                            return b.f("TextOptions(inputType=", this.inputType, ", isMultiline=", ")", this.isMultiline);
                        }

                        public /* synthetic */ TextOptions(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                            this(str, (i11 & 2) != 0 ? false : z11);
                        }
                    }

                    public /* synthetic */ Field(String str, int i11, String str2, String str3, String str4, String str5, boolean z11, SearchOptions searchOptions, SelectOptions selectOptions, TextOptions textOptions, ActionOptions actionOptions, String str6, List list, ChipsWithField chipsWithField, OnBoardingDTO onBoardingDTO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, i11, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? "" : str3, str4, (i12 & 32) != 0 ? "" : str5, (i12 & 64) != 0 ? true : z11, searchOptions, selectOptions, textOptions, actionOptions, str6, list, chipsWithField, onBoardingDTO);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Block(List<? extends AtomDTO> list, Integer num, @NotNull List<BlockRow> rows) {
                Intrinsics.checkNotNullParameter(rows, "rows");
                this.elements = list;
                this.blockSize = num;
                this.rows = rows;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Block copy$default(Block block, List list, Integer num, List list2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = block.elements;
                }
                if ((i11 & 2) != 0) {
                    num = block.blockSize;
                }
                if ((i11 & 4) != 0) {
                    list2 = block.rows;
                }
                return block.copy(list, num, list2);
            }

            public final List<AtomDTO> component1() {
                return this.elements;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getBlockSize() {
                return this.blockSize;
            }

            @NotNull
            public final List<BlockRow> component3() {
                return this.rows;
            }

            @NotNull
            public final Block copy(List<? extends AtomDTO> elements, Integer blockSize, @NotNull List<BlockRow> rows) {
                Intrinsics.checkNotNullParameter(rows, "rows");
                return new Block(elements, blockSize, rows);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Block)) {
                    return false;
                }
                Block block = (Block) other;
                return Intrinsics.d(this.elements, block.elements) && Intrinsics.d(this.blockSize, block.blockSize) && Intrinsics.d(this.rows, block.rows);
            }

            public final Integer getBlockSize() {
                return this.blockSize;
            }

            public final List<AtomDTO> getElements() {
                return this.elements;
            }

            @NotNull
            public final List<BlockRow> getRows() {
                return this.rows;
            }

            public int hashCode() {
                List<AtomDTO> list = this.elements;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.blockSize;
                return this.rows.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                List<AtomDTO> list = this.elements;
                Integer num = this.blockSize;
                List<BlockRow> list2 = this.rows;
                StringBuilder sb2 = new StringBuilder("Block(elements=");
                sb2.append(list);
                sb2.append(", blockSize=");
                sb2.append(num);
                sb2.append(", rows=");
                return C2618u.h(sb2, list2, ")");
            }
        }

        public Row(@NotNull List<Block> blocks) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            this.blocks = blocks;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Row copy$default(Row row, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = row.blocks;
            }
            return row.copy(list);
        }

        @NotNull
        public final List<Block> component1() {
            return this.blocks;
        }

        @NotNull
        public final Row copy(@NotNull List<Block> blocks) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            return new Row(blocks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Row) && Intrinsics.d(this.blocks, ((Row) other).blocks);
        }

        @NotNull
        public final List<Block> getBlocks() {
            return this.blocks;
        }

        public int hashCode() {
            return this.blocks.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Row(blocks=", ")", this.blocks);
        }
    }

    public FormBuilderDTO(@NotNull List<Row> rows, int i11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
        this.rowSize = i11;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormBuilderDTO copy$default(FormBuilderDTO formBuilderDTO, List list, int i11, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = formBuilderDTO.rows;
        }
        if ((i12 & 2) != 0) {
            i11 = formBuilderDTO.rowSize;
        }
        if ((i12 & 4) != 0) {
            map = formBuilderDTO.trackingInfo;
        }
        return formBuilderDTO.copy(list, i11, map);
    }

    @NotNull
    public final List<Row> component1() {
        return this.rows;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRowSize() {
        return this.rowSize;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final FormBuilderDTO copy(@NotNull List<Row> rows, int rowSize, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new FormBuilderDTO(rows, rowSize, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormBuilderDTO)) {
            return false;
        }
        FormBuilderDTO formBuilderDTO = (FormBuilderDTO) other;
        return Intrinsics.d(this.rows, formBuilderDTO.rows) && this.rowSize == formBuilderDTO.rowSize && Intrinsics.d(this.trackingInfo, formBuilderDTO.trackingInfo);
    }

    public final int getRowSize() {
        return this.rowSize;
    }

    @NotNull
    public final List<Row> getRows() {
        return this.rows;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.rowSize, this.rows.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        List<Row> list = this.rows;
        int i11 = this.rowSize;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FormBuilderDTO(rows=");
        sb2.append(list);
        sb2.append(", rowSize=");
        sb2.append(i11);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ FormBuilderDTO(List list, int i11, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i12 & 2) != 0 ? 12 : i11, map);
    }
}
