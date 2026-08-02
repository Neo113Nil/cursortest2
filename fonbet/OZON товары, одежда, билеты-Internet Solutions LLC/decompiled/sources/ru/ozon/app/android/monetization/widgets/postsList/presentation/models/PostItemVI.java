package ru.ozon.app.android.monetization.widgets.postsList.presentation.models;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item;", "itemDto", "<init>", "(JLru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item;", "getItemDto", "()Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item;", "Item", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PostItemVI implements c {
    private final long id;

    @NotNull
    private final Item itemDto;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item;", "", "TextItem", "CellItem", "Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item$CellItem;", "Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item$TextItem;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Item {

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item$CellItem;", "Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "constructor-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getValue", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CellItem implements Item {

            @NotNull
            private final CellDTO value;

            private /* synthetic */ CellItem(CellDTO cellDTO) {
                this.value = cellDTO;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ CellItem m829boximpl(CellDTO cellDTO) {
                return new CellItem(cellDTO);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static CellDTO m830constructorimpl(@NotNull CellDTO value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m831equalsimpl(CellDTO cellDTO, Object obj) {
                return (obj instanceof CellItem) && Intrinsics.d(cellDTO, ((CellItem) obj).getValue());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m832hashCodeimpl(CellDTO cellDTO) {
                return cellDTO.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m833toStringimpl(CellDTO cellDTO) {
                return "CellItem(value=" + cellDTO + ")";
            }

            public boolean equals(Object obj) {
                return m831equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m832hashCodeimpl(this.value);
            }

            public String toString() {
                return m833toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ CellDTO getValue() {
                return this.value;
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item$TextItem;", "Lru/ozon/app/android/monetization/widgets/postsList/presentation/models/PostItemVI$Item;", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "constructor-impl", "(Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/uni/atoms/data/text/TextDTO;", "", "toString-impl", "(Lru/ozon/uni/atoms/data/text/TextDTO;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/text/TextDTO;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;)Z", "equals", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getValue", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TextItem implements Item {

            @NotNull
            private final TextDTO value;

            private /* synthetic */ TextItem(TextDTO textDTO) {
                this.value = textDTO;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ TextItem m835boximpl(TextDTO textDTO) {
                return new TextItem(textDTO);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static TextDTO m836constructorimpl(@NotNull TextDTO value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m837equalsimpl(TextDTO textDTO, Object obj) {
                return (obj instanceof TextItem) && Intrinsics.d(textDTO, ((TextItem) obj).getValue());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m838hashCodeimpl(TextDTO textDTO) {
                return textDTO.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m839toStringimpl(TextDTO textDTO) {
                return "TextItem(value=" + textDTO + ")";
            }

            public boolean equals(Object obj) {
                return m837equalsimpl(this.value, obj);
            }

            public int hashCode() {
                return m838hashCodeimpl(this.value);
            }

            public String toString() {
                return m839toStringimpl(this.value);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ TextDTO getValue() {
                return this.value;
            }
        }
    }

    public PostItemVI(long j11, @NotNull Item itemDto) {
        Intrinsics.checkNotNullParameter(itemDto, "itemDto");
        this.id = j11;
        this.itemDto = itemDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostItemVI)) {
            return false;
        }
        PostItemVI postItemVI = (PostItemVI) other;
        return this.id == postItemVI.id && Intrinsics.d(this.itemDto, postItemVI.itemDto);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Item getItemDto() {
        return this.itemDto;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.itemDto.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "PostItemVI(id=" + this.id + ", itemDto=" + this.itemDto + ")";
    }
}
