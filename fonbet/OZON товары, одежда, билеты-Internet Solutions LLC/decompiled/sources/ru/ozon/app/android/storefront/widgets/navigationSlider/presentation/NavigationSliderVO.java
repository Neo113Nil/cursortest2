package ru.ozon.app.android.storefront.widgets.navigationSlider.presentation;

import B0.A0;
import B0.C2454a;
import G.g;
import Kk.C3532b;
import Lh.b;
import N3.C3660k;
import Nh.a;
import Pk0.f;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.storefront.widgets.navigationSlider.presentation.NavigationSliderWidgetViewHolder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000223Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jx\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "blocks", "", "showAsSlider", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "rows", "columns", "currentPage", "height", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationSliderSizeInfo;", "sizeInfo", "<init>", "(JLjava/util/List;ZLjava/lang/String;IIIILru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationSliderSizeInfo;)V", "copy", "(JLjava/util/List;ZLjava/lang/String;IIIILru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationSliderSizeInfo;)Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBlocks", "()Ljava/util/List;", "Z", "getShowAsSlider", "()Z", "Ljava/lang/String;", "getTitle", "I", "getRows", "getColumns", "getCurrentPage", "getHeight", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationSliderSizeInfo;", "getSizeInfo", "()Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationSliderSizeInfo;", "NavigationSliderSizeInfo", "NavigationItem", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavigationSliderVO implements c {

    @NotNull
    private final List<List<NavigationItem>> blocks;
    private final int columns;
    private final int currentPage;
    private final int height;
    private final long id;
    private final int rows;
    private final boolean showAsSlider;

    @NotNull
    private final NavigationSliderSizeInfo sizeInfo;
    private final String title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationSliderSizeInfo;", "", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "categoryData", "", "minHeight", "<init>", "(Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "getCategoryData", "()Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderWidgetViewHolder$CategoryData;", "I", "getMinHeight", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigationSliderSizeInfo {

        @NotNull
        private final NavigationSliderWidgetViewHolder.CategoryData categoryData;
        private final int minHeight;

        public NavigationSliderSizeInfo(@NotNull NavigationSliderWidgetViewHolder.CategoryData categoryData, int i11) {
            Intrinsics.checkNotNullParameter(categoryData, "categoryData");
            this.categoryData = categoryData;
            this.minHeight = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationSliderSizeInfo)) {
                return false;
            }
            NavigationSliderSizeInfo navigationSliderSizeInfo = (NavigationSliderSizeInfo) other;
            return Intrinsics.d(this.categoryData, navigationSliderSizeInfo.categoryData) && this.minHeight == navigationSliderSizeInfo.minHeight;
        }

        @NotNull
        public final NavigationSliderWidgetViewHolder.CategoryData getCategoryData() {
            return this.categoryData;
        }

        public final int getMinHeight() {
            return this.minHeight;
        }

        public int hashCode() {
            return Integer.hashCode(this.minHeight) + (this.categoryData.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "NavigationSliderSizeInfo(categoryData=" + this.categoryData + ", minHeight=" + this.minHeight + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationSliderVO(long j11, @NotNull List<? extends List<NavigationItem>> blocks, boolean z11, String str, int i11, int i12, int i13, int i14, @NotNull NavigationSliderSizeInfo sizeInfo) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        this.id = j11;
        this.blocks = blocks;
        this.showAsSlider = z11;
        this.title = str;
        this.rows = i11;
        this.columns = i12;
        this.currentPage = i13;
        this.height = i14;
        this.sizeInfo = sizeInfo;
    }

    public static /* synthetic */ NavigationSliderVO copy$default(NavigationSliderVO navigationSliderVO, long j11, List list, boolean z11, String str, int i11, int i12, int i13, int i14, NavigationSliderSizeInfo navigationSliderSizeInfo, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j11 = navigationSliderVO.id;
        }
        long j12 = j11;
        if ((i15 & 2) != 0) {
            list = navigationSliderVO.blocks;
        }
        List list2 = list;
        if ((i15 & 4) != 0) {
            z11 = navigationSliderVO.showAsSlider;
        }
        return navigationSliderVO.copy(j12, list2, z11, (i15 & 8) != 0 ? navigationSliderVO.title : str, (i15 & 16) != 0 ? navigationSliderVO.rows : i11, (i15 & 32) != 0 ? navigationSliderVO.columns : i12, (i15 & 64) != 0 ? navigationSliderVO.currentPage : i13, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationSliderVO.height : i14, (i15 & 256) != 0 ? navigationSliderVO.sizeInfo : navigationSliderSizeInfo);
    }

    @NotNull
    public final NavigationSliderVO copy(long id2, @NotNull List<? extends List<NavigationItem>> blocks, boolean showAsSlider, String title, int rows, int columns, int currentPage, int height, @NotNull NavigationSliderSizeInfo sizeInfo) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        return new NavigationSliderVO(id2, blocks, showAsSlider, title, rows, columns, currentPage, height, sizeInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSliderVO)) {
            return false;
        }
        NavigationSliderVO navigationSliderVO = (NavigationSliderVO) other;
        return this.id == navigationSliderVO.id && Intrinsics.d(this.blocks, navigationSliderVO.blocks) && this.showAsSlider == navigationSliderVO.showAsSlider && Intrinsics.d(this.title, navigationSliderVO.title) && this.rows == navigationSliderVO.rows && this.columns == navigationSliderVO.columns && this.currentPage == navigationSliderVO.currentPage && this.height == navigationSliderVO.height && Intrinsics.d(this.sizeInfo, navigationSliderVO.sizeInfo);
    }

    @NotNull
    public final List<List<NavigationItem>> getBlocks() {
        return this.blocks;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowAsSlider() {
        return this.showAsSlider;
    }

    @NotNull
    public final NavigationSliderSizeInfo getSizeInfo() {
        return this.sizeInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.blocks), 31, this.showAsSlider);
        String str = this.title;
        return this.sizeInfo.hashCode() + C2454a.a(this.height, C2454a.a(this.currentPage, C2454a.a(this.columns, C2454a.a(this.rows, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<List<NavigationItem>> list = this.blocks;
        boolean z11 = this.showAsSlider;
        String str = this.title;
        int i11 = this.rows;
        int i12 = this.columns;
        int i13 = this.currentPage;
        int i14 = this.height;
        NavigationSliderSizeInfo navigationSliderSizeInfo = this.sizeInfo;
        StringBuilder b11 = b.b(j11, "NavigationSliderVO(id=", ", blocks=", list);
        b11.append(", showAsSlider=");
        b11.append(z11);
        b11.append(", title=");
        b11.append(str);
        A0.c(i11, i12, ", rows=", ", columns=", b11);
        A0.c(i13, i14, ", currentPage=", ", height=", b11);
        b11.append(", sizeInfo=");
        b11.append(navigationSliderSizeInfo);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jt\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u0016R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "image", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "backgroundImage", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "maxLines", "", "textSize", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIFLWZ/t;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIFLWZ/t;)Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO$NavigationItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getDeeplink", "getTitle", "getBackgroundImage", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "I", "getMaxLines", "F", "getTextSize", "()F", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigationItem implements AdultVO {
        private final String backgroundImage;

        @NotNull
        private final String deeplink;

        @NotNull
        private final String image;
        private final boolean isAdult;
        private final int maxLines;
        private boolean shouldBlur;
        private final float textSize;

        @NotNull
        private final String title;
        private final t tokenizedEvent;

        public NavigationItem(@NotNull String image, @NotNull String deeplink, @NotNull String title, String str, boolean z11, boolean z12, int i11, float f7, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.deeplink = deeplink;
            this.title = title;
            this.backgroundImage = str;
            this.shouldBlur = z11;
            this.isAdult = z12;
            this.maxLines = i11;
            this.textSize = f7;
            this.tokenizedEvent = tVar;
        }

        public static /* synthetic */ NavigationItem copy$default(NavigationItem navigationItem, String str, String str2, String str3, String str4, boolean z11, boolean z12, int i11, float f7, t tVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = navigationItem.image;
            }
            if ((i12 & 2) != 0) {
                str2 = navigationItem.deeplink;
            }
            if ((i12 & 4) != 0) {
                str3 = navigationItem.title;
            }
            if ((i12 & 8) != 0) {
                str4 = navigationItem.backgroundImage;
            }
            if ((i12 & 16) != 0) {
                z11 = navigationItem.shouldBlur;
            }
            if ((i12 & 32) != 0) {
                z12 = navigationItem.isAdult;
            }
            if ((i12 & 64) != 0) {
                i11 = navigationItem.maxLines;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                f7 = navigationItem.textSize;
            }
            if ((i12 & 256) != 0) {
                tVar = navigationItem.tokenizedEvent;
            }
            float f11 = f7;
            t tVar2 = tVar;
            boolean z13 = z12;
            int i13 = i11;
            boolean z14 = z11;
            String str5 = str3;
            return navigationItem.copy(str, str2, str5, str4, z14, z13, i13, f11, tVar2);
        }

        @NotNull
        public final NavigationItem copy(@NotNull String image, @NotNull String deeplink, @NotNull String title, String backgroundImage, boolean shouldBlur, boolean isAdult, int maxLines, float textSize, t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(title, "title");
            return new NavigationItem(image, deeplink, title, backgroundImage, shouldBlur, isAdult, maxLines, textSize, tokenizedEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationItem)) {
                return false;
            }
            NavigationItem navigationItem = (NavigationItem) other;
            return Intrinsics.d(this.image, navigationItem.image) && Intrinsics.d(this.deeplink, navigationItem.deeplink) && Intrinsics.d(this.title, navigationItem.title) && Intrinsics.d(this.backgroundImage, navigationItem.backgroundImage) && this.shouldBlur == navigationItem.shouldBlur && this.isAdult == navigationItem.isAdult && this.maxLines == navigationItem.maxLines && Float.compare(this.textSize, navigationItem.textSize) == 0 && Intrinsics.d(this.tokenizedEvent, navigationItem.tokenizedEvent);
        }

        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        public final float getTextSize() {
            return this.textSize;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.image.hashCode() * 31, 31, this.deeplink), 31, this.title);
            String str = this.backgroundImage;
            int a12 = Pk0.b.a(this.textSize, C2454a.a(this.maxLines, C3532b.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.shouldBlur), 31, this.isAdult), 31), 31);
            t tVar = this.tokenizedEvent;
            return a12 + (tVar != null ? tVar.hashCode() : 0);
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
            String str = this.image;
            String str2 = this.deeplink;
            String str3 = this.title;
            String str4 = this.backgroundImage;
            boolean z11 = this.shouldBlur;
            boolean z12 = this.isAdult;
            int i11 = this.maxLines;
            float f7 = this.textSize;
            t tVar = this.tokenizedEvent;
            StringBuilder d11 = C3660k.d("NavigationItem(image=", str, ", deeplink=", str2, ", title=");
            a.h(d11, str3, ", backgroundImage=", str4, ", shouldBlur=");
            f.c(", isAdult=", ", maxLines=", d11, z11, z12);
            d11.append(i11);
            d11.append(", textSize=");
            d11.append(f7);
            d11.append(", tokenizedEvent=");
            return Tl.b.d(d11, tVar, ")");
        }

        public /* synthetic */ NavigationItem(String str, String str2, String str3, String str4, boolean z11, boolean z12, int i11, float f7, t tVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, z11, (i12 & 32) != 0 ? z11 : z12, i11, f7, tVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ NavigationSliderVO(long j11, List list, boolean z11, String str, int i11, int i12, int i13, int i14, NavigationSliderSizeInfo navigationSliderSizeInfo, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, z11, str, i11, i12, i13, r11, r12);
        NavigationSliderSizeInfo navigationSliderSizeInfo2;
        int i16;
        i13 = (i15 & 64) != 0 ? 0 : i13;
        if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            navigationSliderSizeInfo2 = navigationSliderSizeInfo;
            i16 = 0;
        } else {
            navigationSliderSizeInfo2 = navigationSliderSizeInfo;
            i16 = i14;
        }
    }
}
