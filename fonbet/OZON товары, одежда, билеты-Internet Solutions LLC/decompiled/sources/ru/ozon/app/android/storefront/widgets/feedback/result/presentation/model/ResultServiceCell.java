package ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model;

import B6.b;
import B90.C2619v;
import Cm.e;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.ViewType;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "", "id", "", "viewType", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ViewType;", "<init>", "(ILru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ViewType;)V", "getId", "()I", "getViewType", "()Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/adapter/ViewType;", "ServiceCellText", "ServiceCellImage", "ImageBody", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell$ImageBody;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell$ServiceCellImage;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell$ServiceCellText;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ResultServiceCell {
    private final int id;

    @NotNull
    private final ViewType viewType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell$ImageBody;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "imageUrl", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/lang/String;", "getImageUrl", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageBody extends ResultServiceCell {
        public static final int $stable = TextAtom.$stable;
        private final int id;

        @NotNull
        private final String imageUrl;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageBody(int i11, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull String imageUrl) {
            super(i11, ViewType.SECTION_TYPE_FULL_BODY, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.id = i11;
            this.title = title;
            this.subtitle = subtitle;
            this.imageUrl = imageUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageBody)) {
                return false;
            }
            ImageBody imageBody = (ImageBody) other;
            return this.id == imageBody.id && Intrinsics.d(this.title, imageBody.title) && Intrinsics.d(this.subtitle, imageBody.subtitle) && Intrinsics.d(this.imageUrl, imageBody.imageUrl);
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultServiceCell
        public int getId() {
            return this.id;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.imageUrl.hashCode() + C2619v.b(C2619v.b(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle);
        }

        @NotNull
        public String toString() {
            return "ImageBody(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", imageUrl=" + this.imageUrl + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell$ServiceCellImage;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "", "id", "", "imageUrl", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(ILjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getImageUrl", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServiceCellImage extends ResultServiceCell {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final AtomAction action;
        private final int id;

        @NotNull
        private final String imageUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceCellImage(int i11, @NotNull String imageUrl, @NotNull AtomAction action) {
            super(i11, ViewType.SECTION_TYPE_SERVICE_IMAGE, null);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(action, "action");
            this.id = i11;
            this.imageUrl = imageUrl;
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceCellImage)) {
                return false;
            }
            ServiceCellImage serviceCellImage = (ServiceCellImage) other;
            return this.id == serviceCellImage.id && Intrinsics.d(this.imageUrl, serviceCellImage.imageUrl) && Intrinsics.d(this.action, serviceCellImage.action);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultServiceCell
        public int getId() {
            return this.id;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            return this.action.hashCode() + g.a(Integer.hashCode(this.id) * 31, 31, this.imageUrl);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            String str = this.imageUrl;
            return b.b(e.g(i11, "ServiceCellImage(id=", ", imageUrl=", str, ", action="), this.action, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell$ServiceCellText;", "Lru/ozon/app/android/storefront/widgets/feedback/result/presentation/model/ResultServiceCell;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServiceCellText extends ResultServiceCell {
        public static final int $stable = TextAtom.$stable;
        private final int id;

        @NotNull
        private final TextAtom text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceCellText(int i11, @NotNull TextAtom text) {
            super(i11, ViewType.SECTION_TYPE_TEXT, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceCellText)) {
                return false;
            }
            ServiceCellText serviceCellText = (ServiceCellText) other;
            return this.id == serviceCellText.id && Intrinsics.d(this.text, serviceCellText.text);
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.result.presentation.model.ResultServiceCell
        public int getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "ServiceCellText(id=" + this.id + ", text=" + this.text + ")";
        }
    }

    public /* synthetic */ ResultServiceCell(int i11, ViewType viewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, viewType);
    }

    public int getId() {
        return this.id;
    }

    @NotNull
    public ViewType getViewType() {
        return this.viewType;
    }

    private ResultServiceCell(int i11, ViewType viewType) {
        this.id = i11;
        this.viewType = viewType;
    }
}
