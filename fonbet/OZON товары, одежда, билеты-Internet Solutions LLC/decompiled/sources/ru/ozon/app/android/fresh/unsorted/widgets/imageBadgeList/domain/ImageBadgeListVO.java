package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.domain;

import Am.C2438a;
import B0.C2454a;
import B90.C2616s;
import Ek.a;
import G.g;
import Kk.C3532b;
import Ns.b;
import Pk0.f;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002,-B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "items", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "paddings", "LWZ/t;", "tokenizedEvent", "Landroid/os/Parcelable;", "scrollState", "<init>", "(JLjava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;LWZ/t;Landroid/os/Parcelable;)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;LWZ/t;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "ImageBadge", "PaddingsVO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageBadgeListVO implements c {
    private final long id;

    @NotNull
    private final List<ImageBadge> items;

    @NotNull
    private final PaddingsVO paddings;
    private final Parcelable scrollState;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$ImageBadge;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "hasSeparator", "hasTrailingIcon", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZLjava/lang/String;FLru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "getHasSeparator", "()Z", "getHasTrailingIcon", "Ljava/lang/String;", "getBackgroundColor", "F", "getCornerRadius", "()F", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageBadge {
        private final AtomAction action;
        private final String backgroundColor;
        private final float cornerRadius;
        private final boolean hasSeparator;
        private final boolean hasTrailingIcon;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final PaddingsVO paddings;

        @NotNull
        private final TextDTO text;
        private final t tokenizedEvent;

        public ImageBadge(@NotNull ImageDTO image, @NotNull TextDTO text, boolean z11, boolean z12, String str, float f7, @NotNull PaddingsVO paddings, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paddings, "paddings");
            this.image = image;
            this.text = text;
            this.hasSeparator = z11;
            this.hasTrailingIcon = z12;
            this.backgroundColor = str;
            this.cornerRadius = f7;
            this.paddings = paddings;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageBadge)) {
                return false;
            }
            ImageBadge imageBadge = (ImageBadge) other;
            return Intrinsics.d(this.image, imageBadge.image) && Intrinsics.d(this.text, imageBadge.text) && this.hasSeparator == imageBadge.hasSeparator && this.hasTrailingIcon == imageBadge.hasTrailingIcon && Intrinsics.d(this.backgroundColor, imageBadge.backgroundColor) && Float.compare(this.cornerRadius, imageBadge.cornerRadius) == 0 && Intrinsics.d(this.paddings, imageBadge.paddings) && Intrinsics.d(this.action, imageBadge.action) && Intrinsics.d(this.tokenizedEvent, imageBadge.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        public final boolean getHasTrailingIcon() {
            return this.hasTrailingIcon;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final PaddingsVO getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C3532b.a(C3532b.a(b.a(this.text, this.image.hashCode() * 31, 31), 31, this.hasSeparator), 31, this.hasTrailingIcon);
            String str = this.backgroundColor;
            int hashCode = (this.paddings.hashCode() + Pk0.b.a(this.cornerRadius, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.text;
            boolean z11 = this.hasSeparator;
            boolean z12 = this.hasTrailingIcon;
            String str = this.backgroundColor;
            float f7 = this.cornerRadius;
            PaddingsVO paddingsVO = this.paddings;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder d11 = C2616s.d("ImageBadge(image=", imageDTO, ", text=", textDTO, ", hasSeparator=");
            f.c(", hasTrailingIcon=", ", backgroundColor=", d11, z11, z12);
            d11.append(str);
            d11.append(", cornerRadius=");
            d11.append(f7);
            d11.append(", paddings=");
            d11.append(paddingsVO);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(", tokenizedEvent=");
            return Tl.b.d(d11, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO$PaddingsVO;", "", "", "top", "bottom", "left", "right", "between", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "getBetween", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int between;
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public PaddingsVO(int i11, int i12, int i13, int i14, int i15) {
            this.top = i11;
            this.bottom = i12;
            this.left = i13;
            this.right = i14;
            this.between = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.top == paddingsVO.top && this.bottom == paddingsVO.bottom && this.left == paddingsVO.left && this.right == paddingsVO.right && this.between == paddingsVO.between;
        }

        public final int getBetween() {
            return this.between;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.between) + C2454a.a(this.right, C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.top;
            int i12 = this.bottom;
            int i13 = this.left;
            int i14 = this.right;
            int i15 = this.between;
            StringBuilder a11 = C2438a.a("PaddingsVO(top=", i11, ", bottom=", ", left=", i12);
            a.f(i13, i14, ", right=", ", between=", a11);
            return K00.b.e(i15, ")", a11);
        }
    }

    public ImageBadgeListVO(long j11, @NotNull List<ImageBadge> items, @NotNull PaddingsVO paddings, t tVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.items = items;
        this.paddings = paddings;
        this.tokenizedEvent = tVar;
        this.scrollState = parcelable;
    }

    public static /* synthetic */ ImageBadgeListVO copy$default(ImageBadgeListVO imageBadgeListVO, long j11, List list, PaddingsVO paddingsVO, t tVar, Parcelable parcelable, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = imageBadgeListVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = imageBadgeListVO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            paddingsVO = imageBadgeListVO.paddings;
        }
        PaddingsVO paddingsVO2 = paddingsVO;
        if ((i11 & 8) != 0) {
            tVar = imageBadgeListVO.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i11 & 16) != 0) {
            parcelable = imageBadgeListVO.scrollState;
        }
        return imageBadgeListVO.copy(j12, list2, paddingsVO2, tVar2, parcelable);
    }

    @NotNull
    public final ImageBadgeListVO copy(long id2, @NotNull List<ImageBadge> items, @NotNull PaddingsVO paddings, t tokenizedEvent, Parcelable scrollState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new ImageBadgeListVO(id2, items, paddings, tokenizedEvent, scrollState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageBadgeListVO)) {
            return false;
        }
        ImageBadgeListVO imageBadgeListVO = (ImageBadgeListVO) other;
        return this.id == imageBadgeListVO.id && Intrinsics.d(this.items, imageBadgeListVO.items) && Intrinsics.d(this.paddings, imageBadgeListVO.paddings) && Intrinsics.d(this.tokenizedEvent, imageBadgeListVO.tokenizedEvent) && Intrinsics.d(this.scrollState, imageBadgeListVO.scrollState);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ImageBadge> getItems() {
        return this.items;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.paddings.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.items)) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Parcelable parcelable = this.scrollState;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ImageBadge> list = this.items;
        PaddingsVO paddingsVO = this.paddings;
        t tVar = this.tokenizedEvent;
        Parcelable parcelable = this.scrollState;
        StringBuilder b11 = Lh.b.b(j11, "ImageBadgeListVO(id=", ", items=", list);
        b11.append(", paddings=");
        b11.append(paddingsVO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", scrollState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ ImageBadgeListVO(long j11, List list, PaddingsVO paddingsVO, t tVar, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, paddingsVO, tVar, (i11 & 16) != 0 ? null : parcelable);
    }
}
