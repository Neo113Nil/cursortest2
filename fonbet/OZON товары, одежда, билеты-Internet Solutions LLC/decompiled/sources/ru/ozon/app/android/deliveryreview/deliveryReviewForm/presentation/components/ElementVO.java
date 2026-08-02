package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components;

import B0.C2454a;
import B90.C2618u;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import Tl.b;
import Ve.C4636t5;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "", "<init>", "()V", "Atom", "Checkbox", "Radio", "Gallery", "Carousel", "Textarea", "Toggle", "UploadPhotos", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Atom;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Checkbox;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Gallery;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Radio;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Textarea;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Toggle;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$UploadPhotos;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ElementVO {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Atom;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Atom extends ElementVO {

        @NotNull
        private final AtomDTO atom;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Atom(@NotNull AtomDTO atom) {
            super(null);
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.atom = atom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Atom) && Intrinsics.d(this.atom, ((Atom) other).atom);
        }

        @NotNull
        public final AtomDTO getAtom() {
            return this.atom;
        }

        public int hashCode() {
            return this.atom.hashCode();
        }

        @NotNull
        public String toString() {
            return "Atom(atom=" + this.atom + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel$Item;", "list", "", "multiple", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getList", "()Ljava/util/List;", "Z", "getMultiple", "()Z", "Item", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Carousel extends ElementVO {

        @NotNull
        private final List<Item> list;
        private final boolean multiple;
        private final String title;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ<\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel$Item;", "", "", "id", "image", "text", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel$Item;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getImage", "getText", "Z", "()Z", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Item {

            @NotNull
            private final String id;
            private final String image;
            private final boolean isSelected;
            private final String text;

            public Item(@NotNull String id2, String str, String str2, boolean z11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
                this.image = str;
                this.text = str2;
                this.isSelected = z11;
            }

            public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = item.id;
                }
                if ((i11 & 2) != 0) {
                    str2 = item.image;
                }
                if ((i11 & 4) != 0) {
                    str3 = item.text;
                }
                if ((i11 & 8) != 0) {
                    z11 = item.isSelected;
                }
                return item.copy(str, str2, str3, z11);
            }

            @NotNull
            public final Item copy(@NotNull String id2, String image, String text, boolean isSelected) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new Item(id2, image, text, isSelected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return Intrinsics.d(this.id, item.id) && Intrinsics.d(this.image, item.image) && Intrinsics.d(this.text, item.text) && this.isSelected == item.isSelected;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public final String getImage() {
                return this.image;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.id.hashCode() * 31;
                String str = this.image;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.text;
                return Boolean.hashCode(this.isSelected) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.id;
                String str2 = this.image;
                String str3 = this.text;
                boolean z11 = this.isSelected;
                StringBuilder d11 = C3660k.d("Item(id=", str, ", image=", str2, ", text=");
                d11.append(str3);
                d11.append(", isSelected=");
                d11.append(z11);
                d11.append(")");
                return d11.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Carousel(String str, @NotNull List<Item> list, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.title = str;
            this.list = list;
            this.multiple = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, List list, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = carousel.title;
            }
            if ((i11 & 2) != 0) {
                list = carousel.list;
            }
            if ((i11 & 4) != 0) {
                z11 = carousel.multiple;
            }
            return carousel.copy(str, list, z11);
        }

        @NotNull
        public final Carousel copy(String title, @NotNull List<Item> list, boolean multiple) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new Carousel(title, list, multiple);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Carousel)) {
                return false;
            }
            Carousel carousel = (Carousel) other;
            return Intrinsics.d(this.title, carousel.title) && Intrinsics.d(this.list, carousel.list) && this.multiple == carousel.multiple;
        }

        @NotNull
        public final List<Item> getList() {
            return this.list;
        }

        public final boolean getMultiple() {
            return this.multiple;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            return Boolean.hashCode(this.multiple) + g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.list);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            List<Item> list = this.list;
            return a.a(")", b.f("Carousel(title=", str, ", list=", ", multiple=", list), this.multiple);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Checkbox;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "", "text", "", "isSelected", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "informers", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "copy", "(Ljava/lang/String;ZLjava/util/List;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Checkbox;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "()Z", "Ljava/util/List;", "getInformers", "()Ljava/util/List;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Checkbox extends ElementVO {
        private final List<TextDTO> informers;
        private final boolean isSelected;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Checkbox(@NotNull String text, boolean z11, List<TextDTO> list) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isSelected = z11;
            this.informers = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, String str, boolean z11, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = checkbox.text;
            }
            if ((i11 & 2) != 0) {
                z11 = checkbox.isSelected;
            }
            if ((i11 & 4) != 0) {
                list = checkbox.informers;
            }
            return checkbox.copy(str, z11, list);
        }

        @NotNull
        public final Checkbox copy(@NotNull String text, boolean isSelected, List<TextDTO> informers) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Checkbox(text, isSelected, informers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Checkbox)) {
                return false;
            }
            Checkbox checkbox = (Checkbox) other;
            return Intrinsics.d(this.text, checkbox.text) && this.isSelected == checkbox.isSelected && Intrinsics.d(this.informers, checkbox.informers);
        }

        public final List<TextDTO> getInformers() {
            return this.informers;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.text.hashCode() * 31, 31, this.isSelected);
            List<TextDTO> list = this.informers;
            return a11 + (list == null ? 0 : list.hashCode());
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.text;
            boolean z11 = this.isSelected;
            return C2618u.h(C4636t5.b("Checkbox(text=", str, ", isSelected=", ", informers=", z11), this.informers, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Gallery;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getAtom", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gallery extends ElementVO {

        @NotNull
        private final ButtonV3Atom.LargeBorderlessButton atom;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gallery(@NotNull ButtonV3Atom.LargeBorderlessButton atom) {
            super(null);
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.atom = atom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Gallery) && Intrinsics.d(this.atom, ((Gallery) other).atom);
        }

        @NotNull
        public final ButtonV3Atom.LargeBorderlessButton getAtom() {
            return this.atom;
        }

        public int hashCode() {
            return this.atom.hashCode();
        }

        @NotNull
        public String toString() {
            return "Gallery(atom=" + this.atom + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Radio;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "", "text", "", "isSelected", "<init>", "(Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Z)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Radio;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "()Z", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Radio extends ElementVO {
        private final boolean isSelected;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Radio(@NotNull String text, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isSelected = z11;
        }

        public static /* synthetic */ Radio copy$default(Radio radio, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = radio.text;
            }
            if ((i11 & 2) != 0) {
                z11 = radio.isSelected;
            }
            return radio.copy(str, z11);
        }

        @NotNull
        public final Radio copy(@NotNull String text, boolean isSelected) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Radio(text, isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Radio)) {
                return false;
            }
            Radio radio = (Radio) other;
            return Intrinsics.d(this.text, radio.text) && this.isSelected == radio.isSelected;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected) + (this.text.hashCode() * 31);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return Ak.b.f("Radio(text=", this.text, ", isSelected=", ")", this.isSelected);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ>\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Textarea;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "hint", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/text/TextDTO;", CommentV3DTO.HEADER_FIELD_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Textarea;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getHint", "getValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Textarea extends ElementVO {
        private final TextDTO header;

        @NotNull
        private final String hint;
        private final String title;
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Textarea(String str, @NotNull String hint, String str2, TextDTO textDTO) {
            super(null);
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.title = str;
            this.hint = hint;
            this.value = str2;
            this.header = textDTO;
        }

        public static /* synthetic */ Textarea copy$default(Textarea textarea, String str, String str2, String str3, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textarea.title;
            }
            if ((i11 & 2) != 0) {
                str2 = textarea.hint;
            }
            if ((i11 & 4) != 0) {
                str3 = textarea.value;
            }
            if ((i11 & 8) != 0) {
                textDTO = textarea.header;
            }
            return textarea.copy(str, str2, str3, textDTO);
        }

        @NotNull
        public final Textarea copy(String title, @NotNull String hint, String value, TextDTO header) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            return new Textarea(title, hint, value, header);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Textarea)) {
                return false;
            }
            Textarea textarea = (Textarea) other;
            return Intrinsics.d(this.title, textarea.title) && Intrinsics.d(this.hint, textarea.hint) && Intrinsics.d(this.value, textarea.value) && Intrinsics.d(this.header, textarea.header);
        }

        public final TextDTO getHeader() {
            return this.header;
        }

        @NotNull
        public final String getHint() {
            return this.hint;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.title;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.hint);
            String str2 = this.value;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TextDTO textDTO = this.header;
            return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.hint;
            String str3 = this.value;
            TextDTO textDTO = this.header;
            StringBuilder d11 = C3660k.d("Textarea(title=", str, ", hint=", str2, ", value=");
            d11.append(str3);
            d11.append(", header=");
            d11.append(textDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Toggle;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "", "text", "", "isSelected", "byUserSelected", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;)V", "copy", "(Ljava/lang/String;ZLjava/lang/Boolean;)Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Toggle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "()Z", "setSelected", "(Z)V", "Ljava/lang/Boolean;", "getByUserSelected", "()Ljava/lang/Boolean;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Toggle extends ElementVO {
        private final Boolean byUserSelected;
        private boolean isSelected;

        @NotNull
        private final String text;

        public /* synthetic */ Toggle(String str, boolean z11, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z11, (i11 & 4) != 0 ? null : bool);
        }

        public static /* synthetic */ Toggle copy$default(Toggle toggle, String str, boolean z11, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = toggle.text;
            }
            if ((i11 & 2) != 0) {
                z11 = toggle.isSelected;
            }
            if ((i11 & 4) != 0) {
                bool = toggle.byUserSelected;
            }
            return toggle.copy(str, z11, bool);
        }

        @NotNull
        public final Toggle copy(@NotNull String text, boolean isSelected, Boolean byUserSelected) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Toggle(text, isSelected, byUserSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) other;
            return Intrinsics.d(this.text, toggle.text) && this.isSelected == toggle.isSelected && Intrinsics.d(this.byUserSelected, toggle.byUserSelected);
        }

        public final Boolean getByUserSelected() {
            return this.byUserSelected;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.text.hashCode() * 31, 31, this.isSelected);
            Boolean bool = this.byUserSelected;
            return a11 + (bool == null ? 0 : bool.hashCode());
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final void setSelected(boolean z11) {
            this.isSelected = z11;
        }

        @NotNull
        public String toString() {
            String str = this.text;
            boolean z11 = this.isSelected;
            return D3.g.d(C4636t5.b("Toggle(text=", str, ", isSelected=", ", byUserSelected=", z11), this.byUserSelected, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Toggle(@NotNull String text, boolean z11, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isSelected = z11;
            this.byUserSelected = bool;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\rR*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$UploadPhotos;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "limit", "", "values", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getLimit", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadPhotos extends ElementVO {
        private final int limit;
        private final String title;
        private List<String> values;

        public UploadPhotos(String str, int i11, List<String> list) {
            super(null);
            this.title = str;
            this.limit = i11;
            this.values = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadPhotos)) {
                return false;
            }
            UploadPhotos uploadPhotos = (UploadPhotos) other;
            return Intrinsics.d(this.title, uploadPhotos.title) && this.limit == uploadPhotos.limit && Intrinsics.d(this.values, uploadPhotos.values);
        }

        public final int getLimit() {
            return this.limit;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            String str = this.title;
            int a11 = C2454a.a(this.limit, (str == null ? 0 : str.hashCode()) * 31, 31);
            List<String> list = this.values;
            return a11 + (list != null ? list.hashCode() : 0);
        }

        public final void setValues(List<String> list) {
            this.values = list;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            int i11 = this.limit;
            return C2618u.h(C3660k.c(i11, "UploadPhotos(title=", str, ", limit=", ", values="), this.values, ")");
        }
    }

    public /* synthetic */ ElementVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ElementVO() {
    }
}
