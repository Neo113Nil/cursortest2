package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.vo;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Tl.b;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001(B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u000b\u0010\"R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO$NavigationItemV3;", "items", "", "backgroundColor", "", "isCompactStyle", "Landroid/os/Parcelable;", "recyclerState", "<init>", "(JLjava/util/List;Ljava/lang/String;ZLandroid/os/Parcelable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Z", "()Z", "Landroid/os/Parcelable;", "getRecyclerState", "()Landroid/os/Parcelable;", "setRecyclerState", "(Landroid/os/Parcelable;)V", "NavigationItemV3", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavigationSliderV3VO implements c {
    private final String backgroundColor;
    private final long id;
    private final boolean isCompactStyle;

    @NotNull
    private final List<NavigationItemV3> items;
    private Parcelable recyclerState;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/vo/NavigationSliderV3VO$NavigationItemV3;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "itemWidth", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;ILru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "I", "getItemWidth", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigationItemV3 {
        private final AtomAction action;

        @NotNull
        private final ImageDTO image;
        private final int itemWidth;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public NavigationItemV3(@NotNull TextDTO title, @NotNull ImageDTO image, int i11, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = title;
            this.image = image;
            this.itemWidth = i11;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationItemV3)) {
                return false;
            }
            NavigationItemV3 navigationItemV3 = (NavigationItemV3) other;
            return Intrinsics.d(this.title, navigationItemV3.title) && Intrinsics.d(this.image, navigationItemV3.image) && this.itemWidth == navigationItemV3.itemWidth && Intrinsics.d(this.action, navigationItemV3.action) && Intrinsics.d(this.tokenizedEvent, navigationItemV3.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final int getItemWidth() {
            return this.itemWidth;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.itemWidth, a.b(this.image, this.title.hashCode() * 31, 31), 31);
            AtomAction atomAction = this.action;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            ImageDTO imageDTO = this.image;
            int i11 = this.itemWidth;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("NavigationItemV3(title=");
            sb2.append(textDTO);
            sb2.append(", image=");
            sb2.append(imageDTO);
            sb2.append(", itemWidth=");
            sb2.append(i11);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    public NavigationSliderV3VO(long j11, @NotNull List<NavigationItemV3> items, String str, boolean z11, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.backgroundColor = str;
        this.isCompactStyle = z11;
        this.recyclerState = parcelable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSliderV3VO)) {
            return false;
        }
        NavigationSliderV3VO navigationSliderV3VO = (NavigationSliderV3VO) other;
        return this.id == navigationSliderV3VO.id && Intrinsics.d(this.items, navigationSliderV3VO.items) && Intrinsics.d(this.backgroundColor, navigationSliderV3VO.backgroundColor) && this.isCompactStyle == navigationSliderV3VO.isCompactStyle && Intrinsics.d(this.recyclerState, navigationSliderV3VO.recyclerState);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<NavigationItemV3> getItems() {
        return this.items;
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
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.items);
        String str = this.backgroundColor;
        int a11 = C3532b.a((b11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCompactStyle);
        Parcelable parcelable = this.recyclerState;
        return a11 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    /* renamed from: isCompactStyle, reason: from getter */
    public final boolean getIsCompactStyle() {
        return this.isCompactStyle;
    }

    public final void setRecyclerState(Parcelable parcelable) {
        this.recyclerState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<NavigationItemV3> list = this.items;
        String str = this.backgroundColor;
        boolean z11 = this.isCompactStyle;
        Parcelable parcelable = this.recyclerState;
        StringBuilder b11 = Lh.b.b(j11, "NavigationSliderV3VO(id=", ", items=", list);
        D40.a.g(", backgroundColor=", str, ", isCompactStyle=", b11, z11);
        b11.append(", recyclerState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ NavigationSliderV3VO(long j11, List list, String str, boolean z11, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, str, z11, (i11 & 16) != 0 ? null : parcelable);
    }
}
