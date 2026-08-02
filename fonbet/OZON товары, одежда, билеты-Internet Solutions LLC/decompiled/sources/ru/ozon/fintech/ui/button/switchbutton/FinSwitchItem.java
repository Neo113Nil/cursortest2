package ru.ozon.fintech.ui.button.switchbutton;

import B0.C2454a;
import Ef0.c;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem;", "", "<init>", "()V", "View", "State", "Size", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinSwitchItem {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$Size;", "", "heightInDp", "", "<init>", "(Ljava/lang/String;IF)V", "getHeightInDp", "()F", "BIG", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size BIG = new Size("BIG", 0, 56.0f);
        private final float heightInDp;

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{BIG};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11, float f7) {
            this.heightInDp = f7;
        }

        @NotNull
        public static a<Size> getEntries() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }

        public final float getHeightInDp() {
            return this.heightInDp;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$View;", "", "bindState", "", "state", "Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$State;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface View {
        void bindState(@NotNull State state);
    }

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\b\b\u0003\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0098\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0019J\u0010\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b0\u0010$J\u001a\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b\t\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010$R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b@\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bC\u0010'R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010*R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010,¨\u0006H"}, d2 = {"Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lru/ozon/fintech/ui/button/switchbutton/FinVariant;", "first", "second", "", "enabled", "isFirstSelected", "Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$Size;", "size", "", "background", "btnBackground", "selectedTextColor", "textColor", "", "elevation", "Lkotlin/Function1;", "", "onSelectionChanged", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/ui/button/switchbutton/FinVariant;Lru/ozon/fintech/ui/button/switchbutton/FinVariant;ZZLru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$Size;IILjava/lang/Integer;Ljava/lang/Integer;FLkotlin/jvm/functions/Function1;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()Lru/ozon/fintech/ui/button/switchbutton/FinVariant;", "component3", "component4", "()Z", "component5", "component6", "()Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$Size;", "component7", "()I", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "()F", "component12", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/lang/String;Lru/ozon/fintech/ui/button/switchbutton/FinVariant;Lru/ozon/fintech/ui/button/switchbutton/FinVariant;ZZLru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$Size;IILjava/lang/Integer;Ljava/lang/Integer;FLkotlin/jvm/functions/Function1;)Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$State;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/fintech/ui/button/switchbutton/FinVariant;", "getFirst", "getSecond", "Z", "getEnabled", "Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$Size;", "getSize", "I", "getBackground", "getBtnBackground", "Ljava/lang/Integer;", "getSelectedTextColor", "getTextColor", "F", "getElevation", "Lkotlin/jvm/functions/Function1;", "getOnSelectionChanged", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State implements RecyclerItem {
        private final int background;
        private final int btnBackground;
        private final float elevation;
        private final boolean enabled;

        @NotNull
        private final FinVariant first;

        @NotNull
        private final String id;
        private final boolean isFirstSelected;

        @NotNull
        private final Function1<FinVariant, Unit> onSelectionChanged;

        @NotNull
        private final FinVariant second;
        private final Integer selectedTextColor;

        @NotNull
        private final Size size;
        private final Integer textColor;

        /* JADX WARN: Multi-variable type inference failed */
        public State(@NotNull String id2, @NotNull FinVariant first, @NotNull FinVariant second, boolean z11, boolean z12, @NotNull Size size, int i11, int i12, Integer num, Integer num2, float f7, @NotNull Function1<? super FinVariant, Unit> onSelectionChanged) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
            this.id = id2;
            this.first = first;
            this.second = second;
            this.enabled = z11;
            this.isFirstSelected = z12;
            this.size = size;
            this.background = i11;
            this.btnBackground = i12;
            this.selectedTextColor = num;
            this.textColor = num2;
            this.elevation = f7;
            this.onSelectionChanged = onSelectionChanged;
        }

        public static /* synthetic */ State copy$default(State state, String str, FinVariant finVariant, FinVariant finVariant2, boolean z11, boolean z12, Size size, int i11, int i12, Integer num, Integer num2, float f7, Function1 function1, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = state.id;
            }
            if ((i13 & 2) != 0) {
                finVariant = state.first;
            }
            if ((i13 & 4) != 0) {
                finVariant2 = state.second;
            }
            if ((i13 & 8) != 0) {
                z11 = state.enabled;
            }
            if ((i13 & 16) != 0) {
                z12 = state.isFirstSelected;
            }
            if ((i13 & 32) != 0) {
                size = state.size;
            }
            if ((i13 & 64) != 0) {
                i11 = state.background;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i12 = state.btnBackground;
            }
            if ((i13 & 256) != 0) {
                num = state.selectedTextColor;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                num2 = state.textColor;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                f7 = state.elevation;
            }
            if ((i13 & 2048) != 0) {
                function1 = state.onSelectionChanged;
            }
            float f11 = f7;
            Function1 function12 = function1;
            Integer num3 = num;
            Integer num4 = num2;
            int i14 = i11;
            int i15 = i12;
            boolean z13 = z12;
            Size size2 = size;
            return state.copy(str, finVariant, finVariant2, z11, z13, size2, i14, i15, num3, num4, f11, function12);
        }

        @Override // com.detmir.recycli.adapters.RecyclerItem
        public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
            return RecyclerItem.a.a(this, recyclerItem);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final Integer getTextColor() {
            return this.textColor;
        }

        /* renamed from: component11, reason: from getter */
        public final float getElevation() {
            return this.elevation;
        }

        @NotNull
        public final Function1<FinVariant, Unit> component12() {
            return this.onSelectionChanged;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final FinVariant getFirst() {
            return this.first;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final FinVariant getSecond() {
            return this.second;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFirstSelected() {
            return this.isFirstSelected;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        /* renamed from: component7, reason: from getter */
        public final int getBackground() {
            return this.background;
        }

        /* renamed from: component8, reason: from getter */
        public final int getBtnBackground() {
            return this.btnBackground;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getSelectedTextColor() {
            return this.selectedTextColor;
        }

        @NotNull
        public final State copy(@NotNull String id2, @NotNull FinVariant first, @NotNull FinVariant second, boolean enabled, boolean isFirstSelected, @NotNull Size size, int background, int btnBackground, Integer selectedTextColor, Integer textColor, float elevation, @NotNull Function1<? super FinVariant, Unit> onSelectionChanged) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
            return new State(id2, first, second, enabled, isFirstSelected, size, background, btnBackground, selectedTextColor, textColor, elevation, onSelectionChanged);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.d(this.id, state.id) && Intrinsics.d(this.first, state.first) && Intrinsics.d(this.second, state.second) && this.enabled == state.enabled && this.isFirstSelected == state.isFirstSelected && this.size == state.size && this.background == state.background && this.btnBackground == state.btnBackground && Intrinsics.d(this.selectedTextColor, state.selectedTextColor) && Intrinsics.d(this.textColor, state.textColor) && Float.compare(this.elevation, state.elevation) == 0 && Intrinsics.d(this.onSelectionChanged, state.onSelectionChanged);
        }

        public final int getBackground() {
            return this.background;
        }

        public final int getBtnBackground() {
            return this.btnBackground;
        }

        public final float getElevation() {
            return this.elevation;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final FinVariant getFirst() {
            return this.first;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Function1<FinVariant, Unit> getOnSelectionChanged() {
            return this.onSelectionChanged;
        }

        @NotNull
        public final FinVariant getSecond() {
            return this.second;
        }

        public final Integer getSelectedTextColor() {
            return this.selectedTextColor;
        }

        @NotNull
        public final Size getSize() {
            return this.size;
        }

        public final Integer getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.btnBackground, C2454a.a(this.background, (this.size.hashCode() + C3532b.a(C3532b.a((this.second.hashCode() + ((this.first.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.enabled), 31, this.isFirstSelected)) * 31, 31), 31);
            Integer num = this.selectedTextColor;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.textColor;
            return this.onSelectionChanged.hashCode() + Pk0.b.a(this.elevation, (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
        }

        public final boolean isFirstSelected() {
            return this.isFirstSelected;
        }

        @Override // com.detmir.recycli.adapters.RecyclerItem
        @NotNull
        public String provideId() {
            return this.id;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            FinVariant finVariant = this.first;
            FinVariant finVariant2 = this.second;
            boolean z11 = this.enabled;
            boolean z12 = this.isFirstSelected;
            Size size = this.size;
            int i11 = this.background;
            int i12 = this.btnBackground;
            Integer num = this.selectedTextColor;
            Integer num2 = this.textColor;
            float f7 = this.elevation;
            Function1<FinVariant, Unit> function1 = this.onSelectionChanged;
            StringBuilder sb2 = new StringBuilder("State(id=");
            sb2.append(str);
            sb2.append(", first=");
            sb2.append(finVariant);
            sb2.append(", second=");
            sb2.append(finVariant2);
            sb2.append(", enabled=");
            sb2.append(z11);
            sb2.append(", isFirstSelected=");
            sb2.append(z12);
            sb2.append(", size=");
            sb2.append(size);
            sb2.append(", background=");
            Ek.a.f(i11, i12, ", btnBackground=", ", selectedTextColor=", sb2);
            c.e(sb2, num, ", textColor=", num2, ", elevation=");
            sb2.append(f7);
            sb2.append(", onSelectionChanged=");
            sb2.append(function1);
            sb2.append(")");
            return sb2.toString();
        }

        @Override // com.detmir.recycli.adapters.RecyclerItem
        public Class<? extends Object> withView() {
            return null;
        }

        public /* synthetic */ State(String str, FinVariant finVariant, FinVariant finVariant2, boolean z11, boolean z12, Size size, int i11, int i12, Integer num, Integer num2, float f7, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, finVariant, finVariant2, z11, z12, size, (i13 & 64) != 0 ? R.drawable.background_switch_view : i11, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? R.drawable.background_switch_button_foreground : i12, (i13 & 256) != 0 ? null : num, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0.0f : f7, function1);
        }
    }
}
