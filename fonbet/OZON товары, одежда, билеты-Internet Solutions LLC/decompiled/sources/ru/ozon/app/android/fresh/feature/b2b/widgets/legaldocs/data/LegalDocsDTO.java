package ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.data;

import Ak.C2436a;
import B90.C2619v;
import Bl.b;
import C.o0;
import G.g;
import J.d;
import J0.C3349u1;
import N3.C3660k;
import Nh.a;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO;", "", "totalOrders", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "groups", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO;", "emptyState", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$EmptyStateDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$EmptyStateDTO;)V", "getTotalOrders", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getGroups", "()Ljava/util/List;", "getEmptyState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$EmptyStateDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OrderGroupsDTO", "EmptyStateDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LegalDocsDTO {
    public static final int $stable = 8;
    private final EmptyStateDTO emptyState;
    private final List<OrderGroupsDTO> groups;
    private final TextAtom totalOrders;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$EmptyStateDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "message", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getImage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyStateDTO {
        public static final int $stable = 0;

        @NotNull
        private final String image;

        @NotNull
        private final String message;

        @NotNull
        private final String title;

        public EmptyStateDTO(@NotNull String title, @NotNull String message, @NotNull String image) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = title;
            this.message = message;
            this.image = image;
        }

        public static /* synthetic */ EmptyStateDTO copy$default(EmptyStateDTO emptyStateDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = emptyStateDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = emptyStateDTO.message;
            }
            if ((i11 & 4) != 0) {
                str3 = emptyStateDTO.image;
            }
            return emptyStateDTO.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final EmptyStateDTO copy(@NotNull String title, @NotNull String message, @NotNull String image) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(image, "image");
            return new EmptyStateDTO(title, message, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyStateDTO)) {
                return false;
            }
            EmptyStateDTO emptyStateDTO = (EmptyStateDTO) other;
            return Intrinsics.d(this.title, emptyStateDTO.title) && Intrinsics.d(this.message, emptyStateDTO.message) && Intrinsics.d(this.image, emptyStateDTO.image);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.image.hashCode() + g.a(this.title.hashCode() * 31, 31, this.message);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.message;
            return o0.c(C3660k.d("EmptyStateDTO(title=", str, ", message=", str2, ", image="), this.image, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "orders", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO$OrderDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getOrders", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "OrderDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class OrderGroupsDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<OrderDTO> orders;
        private final TextAtom title;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO$OrderDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "date", "price", "downloadButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "status", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO$OrderDTO$StatusDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO$OrderDTO$StatusDTO;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "getPrice", "getDownloadButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getStatus", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO$OrderDTO$StatusDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "StatusDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class OrderDTO {
            public static final int $stable = 8;

            @NotNull
            private final TextAtom date;

            @NotNull
            private final ButtonV3Atom.SmallIconButton downloadButton;

            @NotNull
            private final String id;

            @NotNull
            private final TextAtom price;
            private final StatusDTO status;

            @NotNull
            private final TextAtom title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/data/LegalDocsDTO$OrderGroupsDTO$OrderDTO$StatusDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "stateIcon", "", "stateDescription", "stateTintColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getStateIcon", "()Ljava/lang/String;", "getStateDescription", "getStateTintColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class StatusDTO {
                public static final int $stable = 8;
                private final AtomActionDTO action;

                @NotNull
                private final String stateDescription;

                @NotNull
                private final String stateIcon;

                @NotNull
                private final String stateTintColor;

                @NotNull
                private final TextAtom title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public StatusDTO(@NotNull TextAtom title, @NotNull String stateIcon, @NotNull String stateDescription, @NotNull String stateTintColor, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(stateIcon, "stateIcon");
                    Intrinsics.checkNotNullParameter(stateDescription, "stateDescription");
                    Intrinsics.checkNotNullParameter(stateTintColor, "stateTintColor");
                    this.title = title;
                    this.stateIcon = stateIcon;
                    this.stateDescription = stateDescription;
                    this.stateTintColor = stateTintColor;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ StatusDTO copy$default(StatusDTO statusDTO, TextAtom textAtom, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textAtom = statusDTO.title;
                    }
                    if ((i11 & 2) != 0) {
                        str = statusDTO.stateIcon;
                    }
                    if ((i11 & 4) != 0) {
                        str2 = statusDTO.stateDescription;
                    }
                    if ((i11 & 8) != 0) {
                        str3 = statusDTO.stateTintColor;
                    }
                    if ((i11 & 16) != 0) {
                        atomActionDTO = statusDTO.action;
                    }
                    if ((i11 & 32) != 0) {
                        map = statusDTO.trackingInfo;
                    }
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    Map map2 = map;
                    return statusDTO.copy(textAtom, str, str2, str3, atomActionDTO2, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextAtom getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getStateIcon() {
                    return this.stateIcon;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final String getStateDescription() {
                    return this.stateDescription;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final String getStateTintColor() {
                    return this.stateTintColor;
                }

                /* renamed from: component5, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component6() {
                    return this.trackingInfo;
                }

                @NotNull
                public final StatusDTO copy(@NotNull TextAtom title, @NotNull String stateIcon, @NotNull String stateDescription, @NotNull String stateTintColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(stateIcon, "stateIcon");
                    Intrinsics.checkNotNullParameter(stateDescription, "stateDescription");
                    Intrinsics.checkNotNullParameter(stateTintColor, "stateTintColor");
                    return new StatusDTO(title, stateIcon, stateDescription, stateTintColor, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof StatusDTO)) {
                        return false;
                    }
                    StatusDTO statusDTO = (StatusDTO) other;
                    return Intrinsics.d(this.title, statusDTO.title) && Intrinsics.d(this.stateIcon, statusDTO.stateIcon) && Intrinsics.d(this.stateDescription, statusDTO.stateDescription) && Intrinsics.d(this.stateTintColor, statusDTO.stateTintColor) && Intrinsics.d(this.action, statusDTO.action) && Intrinsics.d(this.trackingInfo, statusDTO.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                @NotNull
                public final String getStateDescription() {
                    return this.stateDescription;
                }

                @NotNull
                public final String getStateIcon() {
                    return this.stateIcon;
                }

                @NotNull
                public final String getStateTintColor() {
                    return this.stateTintColor;
                }

                @NotNull
                public final TextAtom getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int a11 = g.a(g.a(g.a(this.title.hashCode() * 31, 31, this.stateIcon), 31, this.stateDescription), 31, this.stateTintColor);
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    TextAtom textAtom = this.title;
                    String str = this.stateIcon;
                    String str2 = this.stateDescription;
                    String str3 = this.stateTintColor;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder d11 = b.d("StatusDTO(title=", ", stateIcon=", str, ", stateDescription=", textAtom);
                    a.h(d11, str2, ", stateTintColor=", str3, ", action=");
                    return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
                }
            }

            public OrderDTO(@NotNull String id2, @NotNull TextAtom title, @NotNull TextAtom date, @NotNull TextAtom price, @NotNull ButtonV3Atom.SmallIconButton downloadButton, StatusDTO statusDTO) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(downloadButton, "downloadButton");
                this.id = id2;
                this.title = title;
                this.date = date;
                this.price = price;
                this.downloadButton = downloadButton;
                this.status = statusDTO;
            }

            public static /* synthetic */ OrderDTO copy$default(OrderDTO orderDTO, String str, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, ButtonV3Atom.SmallIconButton smallIconButton, StatusDTO statusDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = orderDTO.id;
                }
                if ((i11 & 2) != 0) {
                    textAtom = orderDTO.title;
                }
                if ((i11 & 4) != 0) {
                    textAtom2 = orderDTO.date;
                }
                if ((i11 & 8) != 0) {
                    textAtom3 = orderDTO.price;
                }
                if ((i11 & 16) != 0) {
                    smallIconButton = orderDTO.downloadButton;
                }
                if ((i11 & 32) != 0) {
                    statusDTO = orderDTO.status;
                }
                ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
                StatusDTO statusDTO2 = statusDTO;
                return orderDTO.copy(str, textAtom, textAtom2, textAtom3, smallIconButton2, statusDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextAtom getDate() {
                return this.date;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final TextAtom getPrice() {
                return this.price;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final ButtonV3Atom.SmallIconButton getDownloadButton() {
                return this.downloadButton;
            }

            /* renamed from: component6, reason: from getter */
            public final StatusDTO getStatus() {
                return this.status;
            }

            @NotNull
            public final OrderDTO copy(@NotNull String id2, @NotNull TextAtom title, @NotNull TextAtom date, @NotNull TextAtom price, @NotNull ButtonV3Atom.SmallIconButton downloadButton, StatusDTO status) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(downloadButton, "downloadButton");
                return new OrderDTO(id2, title, date, price, downloadButton, status);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderDTO)) {
                    return false;
                }
                OrderDTO orderDTO = (OrderDTO) other;
                return Intrinsics.d(this.id, orderDTO.id) && Intrinsics.d(this.title, orderDTO.title) && Intrinsics.d(this.date, orderDTO.date) && Intrinsics.d(this.price, orderDTO.price) && Intrinsics.d(this.downloadButton, orderDTO.downloadButton) && Intrinsics.d(this.status, orderDTO.status);
            }

            @NotNull
            public final TextAtom getDate() {
                return this.date;
            }

            @NotNull
            public final ButtonV3Atom.SmallIconButton getDownloadButton() {
                return this.downloadButton;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final TextAtom getPrice() {
                return this.price;
            }

            public final StatusDTO getStatus() {
                return this.status;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int d11 = C3349u1.d(this.downloadButton, C2619v.b(C2619v.b(C2619v.b(this.id.hashCode() * 31, 31, this.title), 31, this.date), 31, this.price), 31);
                StatusDTO statusDTO = this.status;
                return d11 + (statusDTO == null ? 0 : statusDTO.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.id;
                TextAtom textAtom = this.title;
                TextAtom textAtom2 = this.date;
                TextAtom textAtom3 = this.price;
                ButtonV3Atom.SmallIconButton smallIconButton = this.downloadButton;
                StatusDTO statusDTO = this.status;
                StringBuilder d11 = C2436a.d("OrderDTO(id=", str, ", title=", ", date=", textAtom);
                C4636t5.c(", price=", ", downloadButton=", d11, textAtom2, textAtom3);
                d11.append(smallIconButton);
                d11.append(", status=");
                d11.append(statusDTO);
                d11.append(")");
                return d11.toString();
            }
        }

        public OrderGroupsDTO(TextAtom textAtom, @NotNull List<OrderDTO> orders) {
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.title = textAtom;
            this.orders = orders;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OrderGroupsDTO copy$default(OrderGroupsDTO orderGroupsDTO, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = orderGroupsDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = orderGroupsDTO.orders;
            }
            return orderGroupsDTO.copy(textAtom, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final List<OrderDTO> component2() {
            return this.orders;
        }

        @NotNull
        public final OrderGroupsDTO copy(TextAtom title, @NotNull List<OrderDTO> orders) {
            Intrinsics.checkNotNullParameter(orders, "orders");
            return new OrderGroupsDTO(title, orders);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderGroupsDTO)) {
                return false;
            }
            OrderGroupsDTO orderGroupsDTO = (OrderGroupsDTO) other;
            return Intrinsics.d(this.title, orderGroupsDTO.title) && Intrinsics.d(this.orders, orderGroupsDTO.orders);
        }

        @NotNull
        public final List<OrderDTO> getOrders() {
            return this.orders;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            return this.orders.hashCode() + ((textAtom == null ? 0 : textAtom.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return d.c("OrderGroupsDTO(title=", this.title, ", orders=", this.orders, ")");
        }
    }

    public LegalDocsDTO(TextAtom textAtom, List<OrderGroupsDTO> list, EmptyStateDTO emptyStateDTO) {
        this.totalOrders = textAtom;
        this.groups = list;
        this.emptyState = emptyStateDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegalDocsDTO copy$default(LegalDocsDTO legalDocsDTO, TextAtom textAtom, List list, EmptyStateDTO emptyStateDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = legalDocsDTO.totalOrders;
        }
        if ((i11 & 2) != 0) {
            list = legalDocsDTO.groups;
        }
        if ((i11 & 4) != 0) {
            emptyStateDTO = legalDocsDTO.emptyState;
        }
        return legalDocsDTO.copy(textAtom, list, emptyStateDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTotalOrders() {
        return this.totalOrders;
    }

    public final List<OrderGroupsDTO> component2() {
        return this.groups;
    }

    /* renamed from: component3, reason: from getter */
    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    @NotNull
    public final LegalDocsDTO copy(TextAtom totalOrders, List<OrderGroupsDTO> groups, EmptyStateDTO emptyState) {
        return new LegalDocsDTO(totalOrders, groups, emptyState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDocsDTO)) {
            return false;
        }
        LegalDocsDTO legalDocsDTO = (LegalDocsDTO) other;
        return Intrinsics.d(this.totalOrders, legalDocsDTO.totalOrders) && Intrinsics.d(this.groups, legalDocsDTO.groups) && Intrinsics.d(this.emptyState, legalDocsDTO.emptyState);
    }

    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    public final List<OrderGroupsDTO> getGroups() {
        return this.groups;
    }

    public final TextAtom getTotalOrders() {
        return this.totalOrders;
    }

    public int hashCode() {
        TextAtom textAtom = this.totalOrders;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        List<OrderGroupsDTO> list = this.groups;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        EmptyStateDTO emptyStateDTO = this.emptyState;
        return hashCode2 + (emptyStateDTO != null ? emptyStateDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LegalDocsDTO(totalOrders=" + this.totalOrders + ", groups=" + this.groups + ", emptyState=" + this.emptyState + ")";
    }
}
