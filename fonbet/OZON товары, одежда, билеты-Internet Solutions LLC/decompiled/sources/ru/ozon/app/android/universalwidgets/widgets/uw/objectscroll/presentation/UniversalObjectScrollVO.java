package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation;

import B0.A0;
import B0.C2454a;
import Bl.b;
import De.C2859b;
import G.g;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00017Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b\u0006\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0007\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u00101R\"\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u00101R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isTopRounded", "isBottomRounded", "", "backgroundColor", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "items", "Landroid/os/Parcelable;", "recyclerState", "", "maxHeight", "imageHeight", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JZZLjava/lang/String;Ljava/util/List;Landroid/os/Parcelable;IILWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Landroid/os/Parcelable;", "getRecyclerState", "()Landroid/os/Parcelable;", "setRecyclerState", "(Landroid/os/Parcelable;)V", "I", "getMaxHeight", "setMaxHeight", "(I)V", "getImageHeight", "setImageHeight", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ObjectScrollNewItemVO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UniversalObjectScrollVO implements c {
    private final String backgroundColor;
    private final long id;
    private int imageHeight;
    private final boolean isBottomRounded;
    private final boolean isTopRounded;

    @NotNull
    private final List<ObjectScrollNewItemVO> items;
    private int maxHeight;
    private Parcelable recyclerState;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010 R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010 \"\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\u000e\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/UniversalObjectScrollVO$ObjectScrollNewItemVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "shouldBlur", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "blurPlaceholderImage", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "isAdditionalInsetsNeeded", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(ZZLru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getShouldBlur", "setShouldBlur", "(Z)V", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getBlurPlaceholderImage", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ObjectScrollNewItemVO implements AdultVO {
        private final AtomAction action;
        private final BadgeDTO badge;
        private final String blurPlaceholderImage;

        @NotNull
        private final ImageDTO image;
        private final boolean isAdditionalInsetsNeeded;
        private final boolean isAdult;
        private boolean shouldBlur;
        private final TextDTO subtitle;
        private final TextDTO title;
        private final t tokenizedEvent;

        public ObjectScrollNewItemVO(boolean z11, boolean z12, @NotNull ImageDTO image, TextDTO textDTO, TextDTO textDTO2, String str, BadgeDTO badgeDTO, boolean z13, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.isAdult = z11;
            this.shouldBlur = z12;
            this.image = image;
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.blurPlaceholderImage = str;
            this.badge = badgeDTO;
            this.isAdditionalInsetsNeeded = z13;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObjectScrollNewItemVO)) {
                return false;
            }
            ObjectScrollNewItemVO objectScrollNewItemVO = (ObjectScrollNewItemVO) other;
            return this.isAdult == objectScrollNewItemVO.isAdult && this.shouldBlur == objectScrollNewItemVO.shouldBlur && Intrinsics.d(this.image, objectScrollNewItemVO.image) && Intrinsics.d(this.title, objectScrollNewItemVO.title) && Intrinsics.d(this.subtitle, objectScrollNewItemVO.subtitle) && Intrinsics.d(this.blurPlaceholderImage, objectScrollNewItemVO.blurPlaceholderImage) && Intrinsics.d(this.badge, objectScrollNewItemVO.badge) && this.isAdditionalInsetsNeeded == objectScrollNewItemVO.isAdditionalInsetsNeeded && Intrinsics.d(this.action, objectScrollNewItemVO.action) && Intrinsics.d(this.tokenizedEvent, objectScrollNewItemVO.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final String getBlurPlaceholderImage() {
            return this.blurPlaceholderImage;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int b11 = a.b(this.image, C3532b.a(Boolean.hashCode(this.isAdult) * 31, 31, this.shouldBlur), 31);
            TextDTO textDTO = this.title;
            int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            String str = this.blurPlaceholderImage;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int a11 = C3532b.a((hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.isAdditionalInsetsNeeded);
            AtomAction atomAction = this.action;
            int hashCode4 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isAdditionalInsetsNeeded, reason: from getter */
        public final boolean getIsAdditionalInsetsNeeded() {
            return this.isAdditionalInsetsNeeded;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult, reason: from getter */
        public boolean getIsAdult() {
            return this.isAdult;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.shouldBlur = z11;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isAdult;
            boolean z12 = this.shouldBlur;
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.blurPlaceholderImage;
            BadgeDTO badgeDTO = this.badge;
            boolean z13 = this.isAdditionalInsetsNeeded;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder d11 = Lh.a.d("ObjectScrollNewItemVO(isAdult=", ", shouldBlur=", ", image=", z11, z12);
            d11.append(imageDTO);
            d11.append(", title=");
            d11.append(textDTO);
            d11.append(", subtitle=");
            d11.append(textDTO2);
            d11.append(", blurPlaceholderImage=");
            d11.append(str);
            d11.append(", badge=");
            d11.append(badgeDTO);
            d11.append(", isAdditionalInsetsNeeded=");
            d11.append(z13);
            d11.append(", action=");
            return C2859b.e(tVar, ", tokenizedEvent=", ")", d11, atomAction);
        }
    }

    public UniversalObjectScrollVO(long j11, boolean z11, boolean z12, String str, @NotNull List<ObjectScrollNewItemVO> items, Parcelable parcelable, int i11, int i12, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.isTopRounded = z11;
        this.isBottomRounded = z12;
        this.backgroundColor = str;
        this.items = items;
        this.recyclerState = parcelable;
        this.maxHeight = i11;
        this.imageHeight = i12;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalObjectScrollVO)) {
            return false;
        }
        UniversalObjectScrollVO universalObjectScrollVO = (UniversalObjectScrollVO) other;
        return this.id == universalObjectScrollVO.id && this.isTopRounded == universalObjectScrollVO.isTopRounded && this.isBottomRounded == universalObjectScrollVO.isBottomRounded && Intrinsics.d(this.backgroundColor, universalObjectScrollVO.backgroundColor) && Intrinsics.d(this.items, universalObjectScrollVO.items) && Intrinsics.d(this.recyclerState, universalObjectScrollVO.recyclerState) && this.maxHeight == universalObjectScrollVO.maxHeight && this.imageHeight == universalObjectScrollVO.imageHeight && Intrinsics.d(this.tokenizedEvent, universalObjectScrollVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    @NotNull
    public final List<ObjectScrollNewItemVO> getItems() {
        return this.items;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final Parcelable getRecyclerState() {
        return this.recyclerState;
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
        int a11 = C3532b.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isTopRounded), 31, this.isBottomRounded);
        String str = this.backgroundColor;
        int b11 = g.b((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        Parcelable parcelable = this.recyclerState;
        int a12 = C2454a.a(this.imageHeight, C2454a.a(this.maxHeight, (b11 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31);
        t tVar = this.tokenizedEvent;
        return a12 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isBottomRounded, reason: from getter */
    public final boolean getIsBottomRounded() {
        return this.isBottomRounded;
    }

    /* renamed from: isTopRounded, reason: from getter */
    public final boolean getIsTopRounded() {
        return this.isTopRounded;
    }

    public final void setImageHeight(int i11) {
        this.imageHeight = i11;
    }

    public final void setMaxHeight(int i11) {
        this.maxHeight = i11;
    }

    public final void setRecyclerState(Parcelable parcelable) {
        this.recyclerState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isTopRounded;
        boolean z12 = this.isBottomRounded;
        String str = this.backgroundColor;
        List<ObjectScrollNewItemVO> list = this.items;
        Parcelable parcelable = this.recyclerState;
        int i11 = this.maxHeight;
        int i12 = this.imageHeight;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = b.c(j11, "UniversalObjectScrollVO(id=", ", isTopRounded=", z11);
        c11.append(", isBottomRounded=");
        c11.append(z12);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(", items=");
        c11.append(list);
        c11.append(", recyclerState=");
        c11.append(parcelable);
        A0.c(i11, i12, ", maxHeight=", ", imageHeight=", c11);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UniversalObjectScrollVO(long r14, boolean r16, boolean r17, java.lang.String r18, java.util.List r19, android.os.Parcelable r20, int r21, int r22, WZ.t r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 0
            r9 = r1
            goto Lb
        L9:
            r9 = r20
        Lb:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L12
            r10 = r2
            goto L14
        L12:
            r10 = r21
        L14:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L26
            r11 = r2
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r12 = r23
            r2 = r13
            goto L34
        L26:
            r11 = r22
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r12 = r23
        L34:
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.UniversalObjectScrollVO.<init>(long, boolean, boolean, java.lang.String, java.util.List, android.os.Parcelable, int, int, WZ.t, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
