package ru.ozon.app.android.sellerproducts.sellerProducts.decorators;

import B0.C2454a;
import Ek.a;
import K00.b;
import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002@ABG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\u0004\u0018\u00010\u001e*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J;\u0010,\u001a\u00020+*\u00020$2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020\u001e*\u00020.2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J/\u00107\u001a\u00020+2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J'\u0010:\u001a\u00020+2\u0006\u00109\u001a\u00020$2\u0006\u00104\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0016\u0010\b\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010=R\u0016\u0010\n\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010>\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "targetProductType", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Horizontal;", "topConfig", "bottomConfig", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Vertical;", "startConfig", "endConfig", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Horizontal;Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Horizontal;Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Vertical;Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Vertical;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/view/View;", "childView", "", "getCurrentPosition", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Ljava/lang/Integer;", "getItemsCount", "(Landroidx/recyclerview/widget/RecyclerView;)Ljava/lang/Integer;", "Lm10/l;", "getAdapter", "(Landroidx/recyclerview/widget/RecyclerView;)Lm10/l;", "position", "adapter", "getItemType", "(ILm10/l;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig;", "", "prevItemHasTheSameType", "nextItemHasTheSameType", "filterByCondition", "(Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig;ZZ)Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig;", "Landroid/graphics/Canvas;", "left", "top", "right", "bottom", "Landroid/graphics/Paint;", "paint", "", "drawRect", "(Landroid/graphics/Canvas;IIIILandroid/graphics/Paint;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig;", "toInternalConfig", "(Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig;Landroid/content/Context;)Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig;", "Landroid/graphics/Rect;", "outRect", "view", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "c", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig;", "bounds", "Landroid/graphics/Rect;", "DecorationConfig", "InternalDecorationConfig", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductItemDecoration extends RecyclerView.n {
    private final InternalDecorationConfig bottomConfig;

    @NotNull
    private final Rect bounds;
    private final InternalDecorationConfig endConfig;
    private final InternalDecorationConfig startConfig;

    @NotNull
    private final ProductVO.Type targetProductType;
    private final InternalDecorationConfig topConfig;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B3\b\u0004\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig;", "", "", "colorAttr", "Lkotlin/Function2;", "", "additionalCondition", "<init>", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;)V", "Ljava/lang/Integer;", "getColorAttr", "()Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function2;", "getAdditionalCondition", "()Lkotlin/jvm/functions/Function2;", "Horizontal", "Vertical", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Horizontal;", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Vertical;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DecorationConfig {
        private final Function2<Boolean, Boolean, Boolean> additionalCondition;
        private final Integer colorAttr;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001b\u0010\u0010R.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Horizontal;", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig;", "", "height", "colorAttr", "startMargin", "endMargin", "Lkotlin/Function2;", "", "additionalCondition", "<init>", "(ILjava/lang/Integer;IILkotlin/jvm/functions/Function2;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "Ljava/lang/Integer;", "getColorAttr", "()Ljava/lang/Integer;", "getStartMargin", "getEndMargin", "Lkotlin/jvm/functions/Function2;", "getAdditionalCondition", "()Lkotlin/jvm/functions/Function2;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Horizontal extends DecorationConfig {
            private final Function2<Boolean, Boolean, Boolean> additionalCondition;
            private final Integer colorAttr;
            private final int endMargin;
            private final int height;
            private final int startMargin;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ Horizontal(int i11, Integer num, int i12, int i13, Function2 function2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, num, i12, r6, r7);
                Function2 function22;
                int i15;
                i12 = (i14 & 4) != 0 ? 0 : i12;
                if ((i14 & 8) != 0) {
                    function22 = function2;
                    i15 = 0;
                } else {
                    function22 = function2;
                    i15 = i13;
                }
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Horizontal)) {
                    return false;
                }
                Horizontal horizontal = (Horizontal) other;
                return this.height == horizontal.height && Intrinsics.d(this.colorAttr, horizontal.colorAttr) && this.startMargin == horizontal.startMargin && this.endMargin == horizontal.endMargin && Intrinsics.d(this.additionalCondition, horizontal.additionalCondition);
            }

            public Function2<Boolean, Boolean, Boolean> getAdditionalCondition() {
                return this.additionalCondition;
            }

            @Override // ru.ozon.app.android.sellerproducts.sellerProducts.decorators.ProductItemDecoration.DecorationConfig
            public Integer getColorAttr() {
                return this.colorAttr;
            }

            public final int getEndMargin() {
                return this.endMargin;
            }

            public final int getHeight() {
                return this.height;
            }

            public final int getStartMargin() {
                return this.startMargin;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.height) * 31;
                Integer num = this.colorAttr;
                int a11 = C2454a.a(this.endMargin, C2454a.a(this.startMargin, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
                Function2<Boolean, Boolean, Boolean> function2 = this.additionalCondition;
                return a11 + (function2 != null ? function2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.height;
                Integer num = this.colorAttr;
                int i12 = this.startMargin;
                int i13 = this.endMargin;
                Function2<Boolean, Boolean, Boolean> function2 = this.additionalCondition;
                StringBuilder sb2 = new StringBuilder("Horizontal(height=");
                sb2.append(i11);
                sb2.append(", colorAttr=");
                sb2.append(num);
                sb2.append(", startMargin=");
                a.f(i12, i13, ", endMargin=", ", additionalCondition=", sb2);
                sb2.append(function2);
                sb2.append(")");
                return sb2.toString();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Horizontal(int i11, Integer num, int i12, int i13, Function2<? super Boolean, ? super Boolean, Boolean> function2) {
                super(num, function2, null);
                this.height = i11;
                this.colorAttr = num;
                this.startMargin = i12;
                this.endMargin = i13;
                this.additionalCondition = function2;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0007R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0007R.\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig$Vertical;", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$DecorationConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "width", "I", "getWidth", "colorAttr", "Ljava/lang/Integer;", "getColorAttr", "()Ljava/lang/Integer;", "topMargin", "getTopMargin", "bottomMargin", "getBottomMargin", "Lkotlin/Function2;", "additionalCondition", "Lkotlin/jvm/functions/Function2;", "getAdditionalCondition", "()Lkotlin/jvm/functions/Function2;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Vertical extends DecorationConfig {
            private final Function2<Boolean, Boolean, Boolean> additionalCondition;
            private final int bottomMargin;
            private final Integer colorAttr;
            private final int topMargin;
            private final int width;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Vertical)) {
                    return false;
                }
                Vertical vertical = (Vertical) other;
                return this.width == vertical.width && Intrinsics.d(this.colorAttr, vertical.colorAttr) && this.topMargin == vertical.topMargin && this.bottomMargin == vertical.bottomMargin && Intrinsics.d(this.additionalCondition, vertical.additionalCondition);
            }

            public Function2<Boolean, Boolean, Boolean> getAdditionalCondition() {
                return this.additionalCondition;
            }

            public final int getBottomMargin() {
                return this.bottomMargin;
            }

            @Override // ru.ozon.app.android.sellerproducts.sellerProducts.decorators.ProductItemDecoration.DecorationConfig
            public Integer getColorAttr() {
                return this.colorAttr;
            }

            public final int getTopMargin() {
                return this.topMargin;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.width) * 31;
                Integer num = this.colorAttr;
                int a11 = C2454a.a(this.bottomMargin, C2454a.a(this.topMargin, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
                Function2<Boolean, Boolean, Boolean> function2 = this.additionalCondition;
                return a11 + (function2 != null ? function2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.width;
                Integer num = this.colorAttr;
                int i12 = this.topMargin;
                int i13 = this.bottomMargin;
                Function2<Boolean, Boolean, Boolean> function2 = this.additionalCondition;
                StringBuilder sb2 = new StringBuilder("Vertical(width=");
                sb2.append(i11);
                sb2.append(", colorAttr=");
                sb2.append(num);
                sb2.append(", topMargin=");
                a.f(i12, i13, ", bottomMargin=", ", additionalCondition=", sb2);
                sb2.append(function2);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public /* synthetic */ DecorationConfig(Integer num, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, function2);
        }

        public abstract Integer getColorAttr();

        /* JADX WARN: Multi-variable type inference failed */
        private DecorationConfig(Integer num, Function2<? super Boolean, ? super Boolean, Boolean> function2) {
            this.colorAttr = num;
            this.additionalCondition = function2;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B1\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig;", "", "Landroid/graphics/Paint;", "paint", "Lkotlin/Function2;", "", "additionalCondition", "<init>", "(Landroid/graphics/Paint;Lkotlin/jvm/functions/Function2;)V", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Lkotlin/jvm/functions/Function2;", "getAdditionalCondition", "()Lkotlin/jvm/functions/Function2;", "Horizontal", "Vertical", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig$Horizontal;", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig$Vertical;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class InternalDecorationConfig {
        private final Function2<Boolean, Boolean, Boolean> additionalCondition;
        private final Paint paint;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig$Horizontal;", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig;", "Landroid/graphics/Paint;", "paint", "Lkotlin/Function2;", "", "additionalCondition", "", "height", "startMargin", "endMargin", "<init>", "(Landroid/graphics/Paint;Lkotlin/jvm/functions/Function2;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Lkotlin/jvm/functions/Function2;", "getAdditionalCondition", "()Lkotlin/jvm/functions/Function2;", "I", "getHeight", "getStartMargin", "getEndMargin", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Horizontal extends InternalDecorationConfig {
            private final Function2<Boolean, Boolean, Boolean> additionalCondition;
            private final int endMargin;
            private final int height;
            private final Paint paint;
            private final int startMargin;

            /* JADX WARN: Multi-variable type inference failed */
            public Horizontal(Paint paint, Function2<? super Boolean, ? super Boolean, Boolean> function2, int i11, int i12, int i13) {
                super(paint, function2, null);
                this.paint = paint;
                this.additionalCondition = function2;
                this.height = i11;
                this.startMargin = i12;
                this.endMargin = i13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Horizontal)) {
                    return false;
                }
                Horizontal horizontal = (Horizontal) other;
                return Intrinsics.d(this.paint, horizontal.paint) && Intrinsics.d(this.additionalCondition, horizontal.additionalCondition) && this.height == horizontal.height && this.startMargin == horizontal.startMargin && this.endMargin == horizontal.endMargin;
            }

            @Override // ru.ozon.app.android.sellerproducts.sellerProducts.decorators.ProductItemDecoration.InternalDecorationConfig
            public Function2<Boolean, Boolean, Boolean> getAdditionalCondition() {
                return this.additionalCondition;
            }

            public final int getEndMargin() {
                return this.endMargin;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // ru.ozon.app.android.sellerproducts.sellerProducts.decorators.ProductItemDecoration.InternalDecorationConfig
            public Paint getPaint() {
                return this.paint;
            }

            public final int getStartMargin() {
                return this.startMargin;
            }

            public int hashCode() {
                Paint paint = this.paint;
                int hashCode = (paint == null ? 0 : paint.hashCode()) * 31;
                Function2<Boolean, Boolean, Boolean> function2 = this.additionalCondition;
                return Integer.hashCode(this.endMargin) + C2454a.a(this.startMargin, C2454a.a(this.height, (hashCode + (function2 != null ? function2.hashCode() : 0)) * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                Paint paint = this.paint;
                Function2<Boolean, Boolean, Boolean> function2 = this.additionalCondition;
                int i11 = this.height;
                int i12 = this.startMargin;
                int i13 = this.endMargin;
                StringBuilder sb2 = new StringBuilder("Horizontal(paint=");
                sb2.append(paint);
                sb2.append(", additionalCondition=");
                sb2.append(function2);
                sb2.append(", height=");
                a.f(i11, i12, ", startMargin=", ", endMargin=", sb2);
                return b.e(i13, ")", sb2);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig$Vertical;", "Lru/ozon/app/android/sellerproducts/sellerProducts/decorators/ProductItemDecoration$InternalDecorationConfig;", "Landroid/graphics/Paint;", "paint", "Lkotlin/Function2;", "", "additionalCondition", "", "width", "topMargin", "bottomMargin", "<init>", "(Landroid/graphics/Paint;Lkotlin/jvm/functions/Function2;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Lkotlin/jvm/functions/Function2;", "getAdditionalCondition", "()Lkotlin/jvm/functions/Function2;", "I", "getWidth", "getTopMargin", "getBottomMargin", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Vertical extends InternalDecorationConfig {
            private final Function2<Boolean, Boolean, Boolean> additionalCondition;
            private final int bottomMargin;
            private final Paint paint;
            private final int topMargin;
            private final int width;

            /* JADX WARN: Multi-variable type inference failed */
            public Vertical(Paint paint, Function2<? super Boolean, ? super Boolean, Boolean> function2, int i11, int i12, int i13) {
                super(paint, function2, null);
                this.paint = paint;
                this.additionalCondition = function2;
                this.width = i11;
                this.topMargin = i12;
                this.bottomMargin = i13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Vertical)) {
                    return false;
                }
                Vertical vertical = (Vertical) other;
                return Intrinsics.d(this.paint, vertical.paint) && Intrinsics.d(this.additionalCondition, vertical.additionalCondition) && this.width == vertical.width && this.topMargin == vertical.topMargin && this.bottomMargin == vertical.bottomMargin;
            }

            @Override // ru.ozon.app.android.sellerproducts.sellerProducts.decorators.ProductItemDecoration.InternalDecorationConfig
            public Function2<Boolean, Boolean, Boolean> getAdditionalCondition() {
                return this.additionalCondition;
            }

            public final int getBottomMargin() {
                return this.bottomMargin;
            }

            @Override // ru.ozon.app.android.sellerproducts.sellerProducts.decorators.ProductItemDecoration.InternalDecorationConfig
            public Paint getPaint() {
                return this.paint;
            }

            public final int getTopMargin() {
                return this.topMargin;
            }

            public final int getWidth() {
                return this.width;
            }

            public int hashCode() {
                Paint paint = this.paint;
                int hashCode = (paint == null ? 0 : paint.hashCode()) * 31;
                Function2<Boolean, Boolean, Boolean> function2 = this.additionalCondition;
                return Integer.hashCode(this.bottomMargin) + C2454a.a(this.topMargin, C2454a.a(this.width, (hashCode + (function2 != null ? function2.hashCode() : 0)) * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                Paint paint = this.paint;
                Function2<Boolean, Boolean, Boolean> function2 = this.additionalCondition;
                int i11 = this.width;
                int i12 = this.topMargin;
                int i13 = this.bottomMargin;
                StringBuilder sb2 = new StringBuilder("Vertical(paint=");
                sb2.append(paint);
                sb2.append(", additionalCondition=");
                sb2.append(function2);
                sb2.append(", width=");
                a.f(i11, i12, ", topMargin=", ", bottomMargin=", sb2);
                return b.e(i13, ")", sb2);
            }
        }

        public /* synthetic */ InternalDecorationConfig(Paint paint, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(paint, function2);
        }

        public abstract Function2<Boolean, Boolean, Boolean> getAdditionalCondition();

        public abstract Paint getPaint();

        /* JADX WARN: Multi-variable type inference failed */
        private InternalDecorationConfig(Paint paint, Function2<? super Boolean, ? super Boolean, Boolean> function2) {
            this.paint = paint;
            this.additionalCondition = function2;
        }
    }

    public /* synthetic */ ProductItemDecoration(Context context, ProductVO.Type type, DecorationConfig.Horizontal horizontal, DecorationConfig.Horizontal horizontal2, DecorationConfig.Vertical vertical, DecorationConfig.Vertical vertical2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, type, (i11 & 4) != 0 ? null : horizontal, (i11 & 8) != 0 ? null : horizontal2, (i11 & 16) != 0 ? null : vertical, (i11 & 32) != 0 ? null : vertical2);
    }

    private final void drawRect(Canvas canvas, int i11, int i12, int i13, int i14, Paint paint) {
        canvas.drawRect(i11, i12, i13, i14, paint);
    }

    private final InternalDecorationConfig filterByCondition(InternalDecorationConfig internalDecorationConfig, boolean z11, boolean z12) {
        Function2<Boolean, Boolean, Boolean> additionalCondition = internalDecorationConfig.getAdditionalCondition();
        if (additionalCondition == null || additionalCondition.invoke(Boolean.valueOf(z11), Boolean.valueOf(z12)).booleanValue()) {
            return internalDecorationConfig;
        }
        return null;
    }

    private final l getAdapter(RecyclerView recyclerView) {
        Object adapter = recyclerView.getAdapter();
        if (adapter instanceof l) {
            return (l) adapter;
        }
        return null;
    }

    private final Integer getCurrentPosition(RecyclerView recyclerView, View childView) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(childView);
        if (childAdapterPosition != -1) {
            return Integer.valueOf(childAdapterPosition);
        }
        return null;
    }

    private final ProductVO.Type getItemType(int position, l adapter) {
        c b11 = adapter.b(position);
        ProductVO productVO = b11 instanceof ProductVO ? (ProductVO) b11 : null;
        if (productVO != null) {
            return productVO.getType();
        }
        return null;
    }

    private final Integer getItemsCount(RecyclerView recyclerView) {
        RecyclerView.g adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return Integer.valueOf(adapter.getShimmersCount());
        }
        return null;
    }

    private final InternalDecorationConfig toInternalConfig(DecorationConfig decorationConfig, Context context) {
        Paint paint;
        Integer colorAttr = decorationConfig.getColorAttr();
        if (colorAttr != null) {
            int intValue = colorAttr.intValue();
            paint = new Paint();
            paint.setColor(ThemeExtKt.themeColor(context, intValue));
        } else {
            paint = null;
        }
        Paint paint2 = paint;
        if (decorationConfig instanceof DecorationConfig.Horizontal) {
            DecorationConfig.Horizontal horizontal = (DecorationConfig.Horizontal) decorationConfig;
            return new InternalDecorationConfig.Horizontal(paint2, horizontal.getAdditionalCondition(), ResourceExtKt.toPx(horizontal.getHeight()), ResourceExtKt.toPx(horizontal.getStartMargin()), ResourceExtKt.toPx(horizontal.getEndMargin()));
        }
        if (!(decorationConfig instanceof DecorationConfig.Vertical)) {
            throw new o();
        }
        DecorationConfig.Vertical vertical = (DecorationConfig.Vertical) decorationConfig;
        return new InternalDecorationConfig.Vertical(paint2, vertical.getAdditionalCondition(), ResourceExtKt.toPx(vertical.getWidth()), ResourceExtKt.toPx(vertical.getTopMargin()), ResourceExtKt.toPx(vertical.getBottomMargin()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Integer currentPosition = getCurrentPosition(parent, view);
        if (currentPosition != null) {
            int intValue = currentPosition.intValue();
            Integer itemsCount = getItemsCount(parent);
            if (itemsCount != null) {
                int intValue2 = itemsCount.intValue();
                l adapter = getAdapter(parent);
                if (adapter != null && getItemType(intValue, adapter) == this.targetProductType) {
                    boolean z11 = false;
                    boolean z12 = intValue != 0 && getItemType(intValue + (-1), adapter) == this.targetProductType;
                    int i11 = intValue + 1;
                    if (i11 < intValue2 && getItemType(i11, adapter) == this.targetProductType) {
                        z11 = true;
                    }
                    InternalDecorationConfig internalDecorationConfig = this.topConfig;
                    if (internalDecorationConfig != null && filterByCondition(internalDecorationConfig, z12, z11) != null) {
                        outRect.top = ((InternalDecorationConfig.Horizontal) internalDecorationConfig).getHeight();
                    }
                    InternalDecorationConfig internalDecorationConfig2 = this.bottomConfig;
                    if (internalDecorationConfig2 != null && filterByCondition(internalDecorationConfig2, z12, z11) != null) {
                        outRect.bottom = ((InternalDecorationConfig.Horizontal) internalDecorationConfig2).getHeight();
                    }
                    InternalDecorationConfig internalDecorationConfig3 = this.startConfig;
                    if (internalDecorationConfig3 != null && filterByCondition(internalDecorationConfig3, z12, z11) != null) {
                        outRect.left = ((InternalDecorationConfig.Vertical) internalDecorationConfig3).getWidth();
                    }
                    InternalDecorationConfig internalDecorationConfig4 = this.endConfig;
                    if (internalDecorationConfig4 == null || filterByCondition(internalDecorationConfig4, z12, z11) == null) {
                        return;
                    }
                    outRect.right = ((InternalDecorationConfig.Vertical) internalDecorationConfig4).getWidth();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Integer itemsCount;
        RecyclerView.C findViewHolderForAdapterPosition;
        View view;
        InternalDecorationConfig filterByCondition;
        Paint paint;
        InternalDecorationConfig filterByCondition2;
        Paint paint2;
        InternalDecorationConfig filterByCondition3;
        Paint paint3;
        InternalDecorationConfig filterByCondition4;
        Paint paint4;
        ProductItemDecoration productItemDecoration = this;
        Canvas c12 = c11;
        Intrinsics.checkNotNullParameter(c12, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        l adapter = productItemDecoration.getAdapter(parent);
        if (adapter == null || (itemsCount = productItemDecoration.getItemsCount(parent)) == null) {
            return;
        }
        int intValue = itemsCount.intValue();
        int i11 = 0;
        while (i11 < intValue) {
            if (productItemDecoration.getItemType(i11, adapter) == productItemDecoration.targetProductType && (findViewHolderForAdapterPosition = parent.findViewHolderForAdapterPosition(i11)) != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                boolean z11 = i11 != 0 && productItemDecoration.getItemType(i11 + (-1), adapter) == productItemDecoration.targetProductType;
                int i12 = i11 + 1;
                boolean z12 = i12 < intValue && productItemDecoration.getItemType(i12, adapter) == productItemDecoration.targetProductType;
                parent.getDecoratedBoundsWithMargins(view, productItemDecoration.bounds);
                InternalDecorationConfig internalDecorationConfig = productItemDecoration.topConfig;
                if (internalDecorationConfig != null && (filterByCondition4 = productItemDecoration.filterByCondition(internalDecorationConfig, z11, z12)) != null && (paint4 = filterByCondition4.getPaint()) != null) {
                    InternalDecorationConfig.Horizontal horizontal = (InternalDecorationConfig.Horizontal) internalDecorationConfig;
                    int startMargin = horizontal.getStartMargin() + productItemDecoration.bounds.left;
                    Rect rect = productItemDecoration.bounds;
                    productItemDecoration.drawRect(c12, startMargin, rect.top, rect.right - horizontal.getEndMargin(), horizontal.getHeight() + productItemDecoration.bounds.top, paint4);
                }
                InternalDecorationConfig internalDecorationConfig2 = productItemDecoration.bottomConfig;
                if (internalDecorationConfig2 != null && (filterByCondition3 = productItemDecoration.filterByCondition(internalDecorationConfig2, z11, z12)) != null && (paint3 = filterByCondition3.getPaint()) != null) {
                    InternalDecorationConfig.Horizontal horizontal2 = (InternalDecorationConfig.Horizontal) internalDecorationConfig2;
                    productItemDecoration.drawRect(c11, productItemDecoration.bounds.left + horizontal2.getStartMargin(), productItemDecoration.bounds.bottom - horizontal2.getHeight(), productItemDecoration.bounds.right - horizontal2.getEndMargin(), productItemDecoration.bounds.bottom, paint3);
                }
                InternalDecorationConfig internalDecorationConfig3 = productItemDecoration.startConfig;
                if (internalDecorationConfig3 != null && (filterByCondition2 = productItemDecoration.filterByCondition(internalDecorationConfig3, z11, z12)) != null && (paint2 = filterByCondition2.getPaint()) != null) {
                    Rect rect2 = productItemDecoration.bounds;
                    InternalDecorationConfig.Vertical vertical = (InternalDecorationConfig.Vertical) internalDecorationConfig3;
                    productItemDecoration.drawRect(c11, rect2.left, vertical.getTopMargin() + rect2.top, vertical.getWidth() + productItemDecoration.bounds.left, productItemDecoration.bounds.bottom - vertical.getBottomMargin(), paint2);
                }
                InternalDecorationConfig internalDecorationConfig4 = productItemDecoration.endConfig;
                if (internalDecorationConfig4 != null && (filterByCondition = productItemDecoration.filterByCondition(internalDecorationConfig4, z11, z12)) != null && (paint = filterByCondition.getPaint()) != null) {
                    InternalDecorationConfig.Vertical vertical2 = (InternalDecorationConfig.Vertical) internalDecorationConfig4;
                    int width = productItemDecoration.bounds.right - vertical2.getWidth();
                    int topMargin = productItemDecoration.bounds.top + vertical2.getTopMargin();
                    Rect rect3 = productItemDecoration.bounds;
                    productItemDecoration.drawRect(c11, width, topMargin, rect3.right, rect3.bottom - vertical2.getBottomMargin(), paint);
                }
            }
            i11++;
            productItemDecoration = this;
            c12 = c11;
        }
    }

    public ProductItemDecoration(@NotNull Context context, @NotNull ProductVO.Type targetProductType, DecorationConfig.Horizontal horizontal, DecorationConfig.Horizontal horizontal2, DecorationConfig.Vertical vertical, DecorationConfig.Vertical vertical2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetProductType, "targetProductType");
        this.targetProductType = targetProductType;
        this.topConfig = horizontal != null ? toInternalConfig(horizontal, context) : null;
        this.bottomConfig = horizontal2 != null ? toInternalConfig(horizontal2, context) : null;
        this.startConfig = vertical != null ? toInternalConfig(vertical, context) : null;
        this.endConfig = vertical2 != null ? toInternalConfig(vertical2, context) : null;
        this.bounds = new Rect();
    }
}
