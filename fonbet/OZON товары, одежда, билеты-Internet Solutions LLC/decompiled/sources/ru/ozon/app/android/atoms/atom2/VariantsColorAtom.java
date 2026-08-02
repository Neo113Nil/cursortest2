package ru.ozon.app.android.atoms.atom2;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import K00.b;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$string;
import ru.ozon.app.android.atoms.data.variants.VariantsColor;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;

@InterfaceC3999a
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011R*\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsColorAtom;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initRecyclerView", "()V", "initInvisibleItemsCountTv", "Lru/ozon/app/android/atoms/data/variants/VariantsColor;", "dto", "bindInvisibleItemsCount", "(Lru/ozon/app/android/atoms/data/variants/VariantsColor;)V", "applyConfig", "bind", "Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$Configuration;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "configuration", "Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$Configuration;", "getConfiguration", "()Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$Configuration;", "setConfiguration", "(Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$Configuration;)V", "smallMargin", "I", "Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter;", "adapter", "Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter;", "Landroid/widget/TextView;", "invisibleItemsCountTv", "Landroid/widget/TextView;", "Configuration", "VariantsColorAdapter", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VariantsColorAtom extends LinearLayout {

    @NotNull
    private final VariantsColorAdapter adapter;

    @NotNull
    private Configuration configuration;
    private TextView invisibleItemsCountTv;
    private final int smallMargin;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "circleRadius", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "getCircleRadius", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final int circleRadius;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;

        public Configuration() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.circleRadius == configuration.circleRadius;
        }

        public final int getCircleRadius() {
            return this.circleRadius;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingEnd() {
            return this.paddingEnd;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingStart() {
            return this.paddingStart;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public int getPaddingTop() {
            return this.paddingTop;
        }

        public int hashCode() {
            return Integer.hashCode(this.circleRadius) + C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31);
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingBottom(int i11) {
            this.paddingBottom = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingEnd(int i11) {
            this.paddingEnd = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingStart(int i11) {
            this.paddingStart = i11;
        }

        @Override // ru.ozon.uni.atoms.af.Atom.AtomConfiguration
        public void setPaddingTop(int i11) {
            this.paddingTop = i11;
        }

        @NotNull
        public String toString() {
            int i11 = this.paddingStart;
            int i12 = this.paddingEnd;
            int i13 = this.paddingTop;
            int i14 = this.paddingBottom;
            int i15 = this.circleRadius;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", circleRadius=", a11);
            return b.e(i15, ")", a11);
        }

        public Configuration(int i11, int i12, int i13, int i14, int i15) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.circleRadius = i15;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? 9 : i15);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 *2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001dR6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0016\u0010'\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter$VariantColorViewHolder;", "<init>", "()V", "Landroid/content/res/Resources;", "resources", "", "size", "", "getDensedCircleSize", "(Landroid/content/res/Resources;I)F", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter$VariantColorViewHolder;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter$VariantColorViewHolder;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "circleRadius", "I", "getCircleRadius", "setCircleRadius", "(I)V", "", "Lru/ozon/app/android/atoms/data/variants/VariantsColor$VariantColor;", "colors", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "setColors", "(Ljava/util/List;)V", "bitmapSize", "mainCircleSize", "circleSize", "borderSize", "Companion", "VariantColorViewHolder", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VariantsColorAdapter extends RecyclerView.g<VariantColorViewHolder> {

        @NotNull
        private static final Companion Companion = new Companion(null);
        private static final int TRANSPARENT_PATTERN = R$drawable.ic_tile_transparent_color;
        private int circleRadius = 9;

        @NotNull
        private List<VariantsColor.VariantColor> colors = K.f71697a;
        private int bitmapSize = 18;
        private int mainCircleSize = 17;
        private int circleSize = 11;
        private int borderSize = 1;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter$Companion;", "", "<init>", "()V", "TRANSPARENT_COLOR_CODE", "", "TRANSPARENT_PATTERN", "", "getTRANSPARENT_PATTERN", "()I", "MAIN_CIRCLE_SIZE_COEFFICIENT", "", "CIRCLE_SIZE_COEFFICIENT", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int getTRANSPARENT_PATTERN() {
                return VariantsColorAdapter.TRANSPARENT_PATTERN;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter$VariantColorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "view", "<init>", "(Lru/ozon/app/android/atoms/atom2/VariantsColorAtom$VariantsColorAdapter;Landroid/view/View;)V", "Lru/ozon/app/android/atoms/data/variants/VariantsColor$VariantColor;", "item", "Landroid/graphics/Bitmap;", "drawCircle", "(Lru/ozon/app/android/atoms/data/variants/VariantsColor$VariantColor;)Landroid/graphics/Bitmap;", "Landroid/content/res/Resources;", "resources", "bitmap", "", "circleSize", "", "drawTransparentCircle", "(Landroid/content/res/Resources;Landroid/graphics/Bitmap;F)V", "bind", "(Lru/ozon/app/android/atoms/data/variants/VariantsColor$VariantColor;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public final class VariantColorViewHolder extends RecyclerView.C {
            final /* synthetic */ VariantsColorAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VariantColorViewHolder(@NotNull VariantsColorAdapter variantsColorAdapter, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                this.this$0 = variantsColorAdapter;
            }

            private final Bitmap drawCircle(VariantsColor.VariantColor item) {
                int i11 = item.isActive() ? this.this$0.mainCircleSize : this.this$0.circleSize;
                VariantsColorAdapter variantsColorAdapter = this.this$0;
                Resources resources = this.itemView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                float densedCircleSize = variantsColorAdapter.getDensedCircleSize(resources, this.this$0.bitmapSize);
                VariantsColorAdapter variantsColorAdapter2 = this.this$0;
                Resources resources2 = this.itemView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                float densedCircleSize2 = variantsColorAdapter2.getDensedCircleSize(resources2, i11);
                Bitmap createBitmap = Bitmap.createBitmap(C6915b.c(densedCircleSize), C6915b.c(densedCircleSize), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                Paint paint2 = new Paint();
                VariantsColorAdapter variantsColorAdapter3 = this.this$0;
                boolean z11 = true;
                paint2.setAntiAlias(true);
                Resources resources3 = this.itemView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                paint2.setStrokeWidth(variantsColorAdapter3.getDensedCircleSize(resources3, variantsColorAdapter3.borderSize));
                paint2.setColor(androidx.core.content.a.getColor(this.itemView.getContext(), R$color.oz_gray_60));
                paint2.setStyle(Paint.Style.STROKE);
                if (item.getColors().contains("#fffdfa")) {
                    Resources resources4 = this.itemView.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                    drawTransparentCircle(resources4, createBitmap, densedCircleSize2);
                }
                this.itemView.setId(R$id.colorAspect);
                View view = this.itemView;
                if (!item.isActive() && this.this$0.getColors().size() != 1) {
                    z11 = false;
                }
                view.setSelected(z11);
                float f7 = 2;
                float f11 = densedCircleSize / f7;
                int size = item.getColors().size();
                for (int i12 = 0; i12 < size; i12++) {
                    if (!Intrinsics.d(item.getColors().get(i12), "#fffdfa")) {
                        StyleParser styleParser = StyleParser.INSTANCE;
                        Context context = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        paint.setColor(styleParser.parseColor(context, item.getColors().get(i12), R$color.oz_white_1));
                        float size2 = 360.0f / item.getColors().size();
                        RectF rectF = new RectF();
                        float f12 = densedCircleSize2 / f7;
                        float f13 = f11 - f12;
                        float f14 = f12 + f11;
                        rectF.set(f13, f13, f14, f14);
                        canvas.drawArc(rectF, i12 * size2, size2, true, paint);
                    }
                }
                canvas.drawCircle(f11, f11, densedCircleSize2 / f7, paint2);
                return createBitmap;
            }

            private final void drawTransparentCircle(Resources resources, Bitmap bitmap, float circleSize) {
                Canvas canvas = new Canvas(bitmap);
                float width = bitmap.getWidth() / 2.0f;
                Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                Paint paint = new Paint();
                paint.setColor(-1);
                paint.setAntiAlias(true);
                canvas.drawCircle(width, width, circleSize / 2, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(BitmapFactory.decodeResource(resources, VariantsColorAdapter.Companion.getTRANSPARENT_PATTERN()), rect, rect, paint);
            }

            public final void bind(@NotNull VariantsColor.VariantColor item) {
                Intrinsics.checkNotNullParameter(item, "item");
                View view = this.itemView;
                Intrinsics.g(view, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) view).setImageBitmap(drawCircle(item));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getDensedCircleSize(Resources resources, int size) {
            return size * resources.getDisplayMetrics().density;
        }

        @NotNull
        public final List<VariantsColor.VariantColor> getColors() {
            return this.colors;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: getItemCount */
        public int getCardsCount() {
            return this.colors.size();
        }

        public final void setCircleRadius(int i11) {
            this.circleRadius = i11;
            int i12 = i11 * 2;
            this.bitmapSize = i12;
            this.mainCircleSize = C6915b.b(i12 * 0.944d);
            this.circleSize = C6915b.b(this.bitmapSize * 0.611d);
        }

        public final void setColors(@NotNull List<VariantsColor.VariantColor> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.colors = value;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@NotNull VariantColorViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind(this.colors.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @NotNull
        public VariantColorViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Resources resources = parent.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            int c11 = C6915b.c(getDensedCircleSize(resources, this.bitmapSize));
            ImageView imageView = new ImageView(parent.getContext());
            imageView.setLayoutParams(new RecyclerView.p(c11, c11));
            return new VariantColorViewHolder(this, imageView);
        }
    }

    public /* synthetic */ VariantsColorAtom(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyConfig() {
        Configuration configuration = this.configuration;
        int paddingStart = configuration.getPaddingStart();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(paddingStart, context);
        int paddingTop = configuration.getPaddingTop();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = ResourceExtKt.toPx(paddingTop, context2);
        int paddingEnd = configuration.getPaddingEnd();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px3 = ResourceExtKt.toPx(paddingEnd, context3);
        int paddingBottom = configuration.getPaddingBottom();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        setPadding(px, px2, px3, ResourceExtKt.toPx(paddingBottom, context4));
        this.adapter.setCircleRadius(configuration.getCircleRadius());
    }

    private final void bindInvisibleItemsCount(VariantsColor dto) {
        int size = dto.getItems().size() - dto.getVisibleItemsCount();
        TextView textView = this.invisibleItemsCountTv;
        if (textView == null) {
            Intrinsics.n("invisibleItemsCountTv");
            throw null;
        }
        ViewExtKt.showOrGone(textView, Boolean.valueOf(size > 0));
        if (size > 0) {
            TextView textView2 = this.invisibleItemsCountTv;
            if (textView2 != null) {
                textView2.setText(StringProvider.getString(R$string.atoms_variants_color_plus_sign, Integer.valueOf(size)));
            } else {
                Intrinsics.n("invisibleItemsCountTv");
                throw null;
            }
        }
    }

    private final void initInvisibleItemsCountTv() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        appCompatTextView.setGravity(16);
        marginLayoutParams.setMarginStart(this.smallMargin);
        appCompatTextView.setLayoutParams(marginLayoutParams);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption_Gray60);
        addView(appCompatTextView);
        this.invisibleItemsCountTv = appCompatTextView;
    }

    private final void initRecyclerView() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        setGravity(16);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setAdapter(this.adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        addView(recyclerView);
    }

    public final void bind(@NotNull VariantsColor dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.adapter.setColors(C7714v.K0(dto.getItems(), dto.getVisibleItemsCount()));
        bindInvisibleItemsCount(dto);
    }

    public final void setConfiguration(@NotNull Configuration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.configuration = value;
        applyConfig();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariantsColorAtom(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.configuration = new Configuration(0, 0, 0, 0, 0, 31, null);
        this.smallMargin = ResourceExtKt.toPx(2, context);
        this.adapter = new VariantsColorAdapter();
        setOrientation(0);
        initRecyclerView();
        initInvisibleItemsCountTv();
        applyConfig();
    }
}
