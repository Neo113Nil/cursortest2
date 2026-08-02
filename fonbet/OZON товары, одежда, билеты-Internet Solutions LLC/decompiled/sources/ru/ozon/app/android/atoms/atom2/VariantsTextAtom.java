package ru.ozon.app.android.atoms.atom2;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$drawable;
import ru.ozon.app.android.atoms.atom2.VariantsTextAtom;
import ru.ozon.app.android.atoms.data.variants.VariantsText;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.TestInfo;

@InterfaceC3999a
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u001f !\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsTextAtom;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "applyConfig", "()V", "Lru/ozon/app/android/atoms/data/variants/VariantsText;", "dto", "bind", "(Lru/ozon/app/android/atoms/data/variants/VariantsText;)V", "Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$Configuration;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "configuration", "Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$Configuration;", "getConfiguration", "()Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$Configuration;", "setConfiguration", "(Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$Configuration;)V", "Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$VariantsTextAdapter;", "adapter", "Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$VariantsTextAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Configuration", "VariantsTextAdapter", "VariantsTextDiffCallback", "SpaceItemDecoration", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VariantsTextAtom extends FrameLayout {

    @NotNull
    private final VariantsTextAdapter adapter;

    @NotNull
    private Configuration configuration;

    @NotNull
    private final RecyclerView recyclerView;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$Configuration;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "spaceBetween", "", "isScrollable", "<init>", "(IIIIIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "setPaddingStart", "(I)V", "getPaddingEnd", "setPaddingEnd", "getPaddingTop", "setPaddingTop", "getPaddingBottom", "setPaddingBottom", "getSpaceBetween", "Z", "()Z", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configuration implements Atom.AtomConfiguration {
        private final boolean isScrollable;
        private int paddingBottom;
        private int paddingEnd;
        private int paddingStart;
        private int paddingTop;
        private final int spaceBetween;

        public Configuration() {
            this(0, 0, 0, 0, 0, false, 63, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.paddingStart == configuration.paddingStart && this.paddingEnd == configuration.paddingEnd && this.paddingTop == configuration.paddingTop && this.paddingBottom == configuration.paddingBottom && this.spaceBetween == configuration.spaceBetween && this.isScrollable == configuration.isScrollable;
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

        public final int getSpaceBetween() {
            return this.spaceBetween;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isScrollable) + C2454a.a(this.spaceBetween, C2454a.a(this.paddingBottom, C2454a.a(this.paddingTop, C2454a.a(this.paddingEnd, Integer.hashCode(this.paddingStart) * 31, 31), 31), 31), 31);
        }

        /* renamed from: isScrollable, reason: from getter */
        public final boolean getIsScrollable() {
            return this.isScrollable;
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
            int i15 = this.spaceBetween;
            boolean z11 = this.isScrollable;
            StringBuilder a11 = C2438a.a("Configuration(paddingStart=", i11, ", paddingEnd=", ", paddingTop=", i12);
            a.f(i13, i14, ", paddingBottom=", ", spaceBetween=", a11);
            a11.append(i15);
            a11.append(", isScrollable=");
            a11.append(z11);
            a11.append(")");
            return a11.toString();
        }

        public Configuration(int i11, int i12, int i13, int i14, int i15, boolean z11) {
            this.paddingStart = i11;
            this.paddingEnd = i12;
            this.paddingTop = i13;
            this.paddingBottom = i14;
            this.spaceBetween = i15;
            this.isScrollable = z11;
        }

        public /* synthetic */ Configuration(int i11, int i12, int i13, int i14, int i15, boolean z11, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? 8 : i15, (i16 & 32) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$SpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "space", "<init>", "(I)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "getSpace", "()I", "setSpace", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SpaceItemDecoration extends RecyclerView.n {
        private int space;

        public SpaceItemDecoration(int i11) {
            this.space = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
            int intValue = valueOf.intValue();
            if (intValue < 0 || intValue >= state.b()) {
                valueOf = null;
            }
            if (valueOf != null) {
                outRect.right = this.space;
            }
        }

        public final void setSpace(int i11) {
            this.space = i11;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$VariantsTextAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/atoms/data/variants/VariantsText$VariantText;", "Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$VariantsTextAdapter$VariantTextViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$VariantsTextAdapter$VariantTextViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$VariantsTextAdapter$VariantTextViewHolder;I)V", "VariantTextViewHolder", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VariantsTextAdapter extends t<VariantsText.VariantText, VariantTextViewHolder> {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$VariantsTextAdapter$VariantTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "", "Landroid/widget/TextView;", "containerView", "<init>", "(Landroid/widget/TextView;)V", "Lru/ozon/app/android/atoms/data/variants/VariantsText$VariantText;", "item", "", "bind", "(Lru/ozon/app/android/atoms/data/variants/VariantsText$VariantText;)V", "Landroid/widget/TextView;", "getContainerView", "()Landroid/widget/TextView;", "", "horizontalPadding", "I", "verticalPadding", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VariantTextViewHolder extends RecyclerView.C {

            @NotNull
            private final TextView containerView;
            private final int horizontalPadding;
            private final int verticalPadding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VariantTextViewHolder(@NotNull TextView containerView) {
                super(containerView);
                Intrinsics.checkNotNullParameter(containerView, "containerView");
                this.containerView = containerView;
                Context context = getContainerView().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.horizontalPadding = ResourceExtKt.toPx(4, context);
                Context context2 = getContainerView().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                this.verticalPadding = ResourceExtKt.toPx(2, context2);
            }

            public final void bind(@NotNull VariantsText.VariantText item) {
                Intrinsics.checkNotNullParameter(item, "item");
                TextView containerView = getContainerView();
                containerView.setText(item.getTitle());
                int i11 = item.isSelected() ? R$drawable.variant_text : 0;
                int i12 = item.isSelected() ? R$style.TextStyle_Caption_Bold : R$style.TextStyle_Caption;
                int i13 = item.isSelected() ? this.horizontalPadding : 0;
                containerView.setBackgroundResource(i11);
                containerView.setTextAppearance(i12);
                int i14 = this.verticalPadding;
                containerView.setPadding(i13, i14, i13, i14);
                TestInfo testInfo = item.getTestInfo();
                containerView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
            }

            @NotNull
            public TextView getContainerView() {
                return this.containerView;
            }
        }

        public VariantsTextAdapter() {
            super(new VariantsTextDiffCallback());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void onBindViewHolder(@NotNull VariantTextViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            VariantsText.VariantText item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            holder.bind(item);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @NotNull
        public VariantTextViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new VariantTextViewHolder(new AppCompatTextView(parent.getContext()));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/atoms/atom2/VariantsTextAtom$VariantsTextDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/atoms/data/variants/VariantsText$VariantText;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/atoms/data/variants/VariantsText$VariantText;Lru/ozon/app/android/atoms/data/variants/VariantsText$VariantText;)Z", "areContentsTheSame", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VariantsTextDiffCallback extends i.d<VariantsText.VariantText> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull VariantsText.VariantText oldItem, @NotNull VariantsText.VariantText newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull VariantsText.VariantText oldItem, @NotNull VariantsText.VariantText newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }
    }

    public /* synthetic */ VariantsTextAtom(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyConfig() {
        final Configuration configuration = this.configuration;
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
        this.recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: Ql.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean applyConfig$lambda$2$lambda$1;
                applyConfig$lambda$2$lambda$1 = VariantsTextAtom.applyConfig$lambda$2$lambda$1(VariantsTextAtom.Configuration.this, view, motionEvent);
                return applyConfig$lambda$2$lambda$1;
            }
        });
        RecyclerView recyclerView = this.recyclerView;
        int spaceBetween = this.configuration.getSpaceBetween();
        Context context5 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int px4 = ResourceExtKt.toPx(spaceBetween, context5);
        SpaceItemDecoration spaceItemDecoration = null;
        if (recyclerView.getItemDecorationCount() > 0) {
            RecyclerView.n itemDecorationAt = recyclerView.getItemDecorationAt(0);
            spaceItemDecoration = (SpaceItemDecoration) (itemDecorationAt instanceof SpaceItemDecoration ? itemDecorationAt : null);
        }
        if (spaceItemDecoration == null) {
            recyclerView.addItemDecoration(new SpaceItemDecoration(px4));
        } else {
            spaceItemDecoration.setSpace(px4);
            recyclerView.invalidateItemDecorations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyConfig$lambda$2$lambda$1(Configuration configuration, View view, MotionEvent motionEvent) {
        return !configuration.getIsScrollable();
    }

    public final void bind(@NotNull VariantsText dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.adapter.submitList(dto.getItems());
    }

    public final void setConfiguration(@NotNull Configuration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.configuration = value;
        applyConfig();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariantsTextAtom(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.configuration = new Configuration(0, 0, 0, 0, 0, false, 63, null);
        VariantsTextAdapter variantsTextAdapter = new VariantsTextAdapter();
        this.adapter = variantsTextAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setAdapter(variantsTextAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setFadingEdgeLength(ResourceExtKt.toPx(12, context));
        recyclerView.setHorizontalFadingEdgeEnabled(true);
        addView(recyclerView);
        this.recyclerView = recyclerView;
        applyConfig();
    }
}
