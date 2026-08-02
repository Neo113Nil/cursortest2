package ru.ozon.app.android.deliveryreview.deliveryReviewForm.data.request;

import An.C2439a;
import C.o0;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/request/SendDeliveryReviewFormRequest;", "", "rating", "", "components", "", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/request/SendDeliveryReviewFormRequest$Component;", "<init>", "(ILjava/util/List;)V", "getRating", "()I", "getComponents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Component", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SendDeliveryReviewFormRequest {

    @NotNull
    private final List<Component> components;
    private final int rating;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/request/SendDeliveryReviewFormRequest$Component;", "", "id", "", "values", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Carousel", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Component {

        @NotNull
        private final String id;

        @NotNull
        private final List<Object> values;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/data/request/SendDeliveryReviewFormRequest$Component$Carousel;", "", "id", "", "image", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImage", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Carousel {

            @NotNull
            private final String id;
            private final String image;
            private final String text;

            public Carousel(@NotNull String id2, String str, String str2) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
                this.image = str;
                this.text = str2;
            }

            public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = carousel.id;
                }
                if ((i11 & 2) != 0) {
                    str2 = carousel.image;
                }
                if ((i11 & 4) != 0) {
                    str3 = carousel.text;
                }
                return carousel.copy(str, str2, str3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component3, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            public final Carousel copy(@NotNull String id2, String image, String text) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new Carousel(id2, image, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Carousel)) {
                    return false;
                }
                Carousel carousel = (Carousel) other;
                return Intrinsics.d(this.id, carousel.id) && Intrinsics.d(this.image, carousel.image) && Intrinsics.d(this.text, carousel.text);
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
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.id;
                String str2 = this.image;
                return o0.c(C3660k.d("Carousel(id=", str, ", image=", str2, ", text="), this.text, ")");
            }
        }

        public Component(@NotNull String id2, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "bool", type = boolean.class), @ProtoOneOfSignature(name = "string", type = String.class), @ProtoOneOfSignature(name = "int", type = int.class), @ProtoOneOfSignature(name = "carousel", type = Carousel.class)}) @NotNull @ProtoOneOf List<? extends Object> values) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(values, "values");
            this.id = id2;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Component copy$default(Component component, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = component.id;
            }
            if ((i11 & 2) != 0) {
                list = component.values;
            }
            return component.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<Object> component2() {
            return this.values;
        }

        @NotNull
        public final Component copy(@NotNull String id2, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "bool", type = boolean.class), @ProtoOneOfSignature(name = "string", type = String.class), @ProtoOneOfSignature(name = "int", type = int.class), @ProtoOneOfSignature(name = "carousel", type = Carousel.class)}) @NotNull @ProtoOneOf List<? extends Object> values) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(values, "values");
            return new Component(id2, values);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Component)) {
                return false;
            }
            Component component = (Component) other;
            return Intrinsics.d(this.id, component.id) && Intrinsics.d(this.values, component.values);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<Object> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("Component(id=", this.id, ", values=", ")", this.values);
        }
    }

    public SendDeliveryReviewFormRequest(int i11, @NotNull List<Component> components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.rating = i11;
        this.components = components;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendDeliveryReviewFormRequest copy$default(SendDeliveryReviewFormRequest sendDeliveryReviewFormRequest, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = sendDeliveryReviewFormRequest.rating;
        }
        if ((i12 & 2) != 0) {
            list = sendDeliveryReviewFormRequest.components;
        }
        return sendDeliveryReviewFormRequest.copy(i11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    @NotNull
    public final List<Component> component2() {
        return this.components;
    }

    @NotNull
    public final SendDeliveryReviewFormRequest copy(int rating, @NotNull List<Component> components) {
        Intrinsics.checkNotNullParameter(components, "components");
        return new SendDeliveryReviewFormRequest(rating, components);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendDeliveryReviewFormRequest)) {
            return false;
        }
        SendDeliveryReviewFormRequest sendDeliveryReviewFormRequest = (SendDeliveryReviewFormRequest) other;
        return this.rating == sendDeliveryReviewFormRequest.rating && Intrinsics.d(this.components, sendDeliveryReviewFormRequest.components);
    }

    @NotNull
    public final List<Component> getComponents() {
        return this.components;
    }

    public final int getRating() {
        return this.rating;
    }

    public int hashCode() {
        return this.components.hashCode() + (Integer.hashCode(this.rating) * 31);
    }

    @NotNull
    public String toString() {
        return "SendDeliveryReviewFormRequest(rating=" + this.rating + ", components=" + this.components + ")";
    }
}
