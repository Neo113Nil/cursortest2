package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import Am.C2438a;
import B0.C2454a;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;", "", "offsetX", "", "finalTab", "wasSelectedTabChanged", "", "<init>", "(IIZ)V", "getOffsetX", "()I", "getFinalTab", "getWasSelectedTabChanged", "()Z", "Idle", "OrdinaryScrolling", "TransformScrolling", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState$Idle;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState$OrdinaryScrolling;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState$TransformScrolling;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CatalogTabsScrollState {
    private final int finalTab;
    private final int offsetX;
    private final boolean wasSelectedTabChanged;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState$Idle;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Idle extends CatalogTabsScrollState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        /* JADX WARN: Multi-variable type inference failed */
        private Idle() {
            super(0, -1, 0 == true ? 1 : 0, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Idle);
        }

        public int hashCode() {
            return -1433555416;
        }

        @NotNull
        public String toString() {
            return "Idle";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState$OrdinaryScrolling;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;", "", "offset", "destinationTab", "", "selectedTabChanged", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getOffset", "getDestinationTab", "Z", "getSelectedTabChanged", "()Z", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrdinaryScrolling extends CatalogTabsScrollState {
        private final int destinationTab;
        private final int offset;
        private final boolean selectedTabChanged;

        public OrdinaryScrolling(int i11, int i12, boolean z11) {
            super(i11, i12, z11, null);
            this.offset = i11;
            this.destinationTab = i12;
            this.selectedTabChanged = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrdinaryScrolling)) {
                return false;
            }
            OrdinaryScrolling ordinaryScrolling = (OrdinaryScrolling) other;
            return this.offset == ordinaryScrolling.offset && this.destinationTab == ordinaryScrolling.destinationTab && this.selectedTabChanged == ordinaryScrolling.selectedTabChanged;
        }

        public final int getDestinationTab() {
            return this.destinationTab;
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return Boolean.hashCode(this.selectedTabChanged) + C2454a.a(this.destinationTab, Integer.hashCode(this.offset) * 31, 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.offset;
            int i12 = this.destinationTab;
            return a.a(")", C2438a.a("OrdinaryScrolling(offset=", i11, ", destinationTab=", ", selectedTabChanged=", i12), this.selectedTabChanged);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState$TransformScrolling;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;", "", "offset", "destinationTab", "", "selectedTabChanged", "<init>", "(IIZ)V", "copy", "(IIZ)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState$TransformScrolling;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getOffset", "getDestinationTab", "Z", "getSelectedTabChanged", "()Z", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TransformScrolling extends CatalogTabsScrollState {
        private final int destinationTab;
        private final int offset;
        private final boolean selectedTabChanged;

        public TransformScrolling(int i11, int i12, boolean z11) {
            super(i11, i12, z11, null);
            this.offset = i11;
            this.destinationTab = i12;
            this.selectedTabChanged = z11;
        }

        public static /* synthetic */ TransformScrolling copy$default(TransformScrolling transformScrolling, int i11, int i12, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = transformScrolling.offset;
            }
            if ((i13 & 2) != 0) {
                i12 = transformScrolling.destinationTab;
            }
            if ((i13 & 4) != 0) {
                z11 = transformScrolling.selectedTabChanged;
            }
            return transformScrolling.copy(i11, i12, z11);
        }

        @NotNull
        public final TransformScrolling copy(int offset, int destinationTab, boolean selectedTabChanged) {
            return new TransformScrolling(offset, destinationTab, selectedTabChanged);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransformScrolling)) {
                return false;
            }
            TransformScrolling transformScrolling = (TransformScrolling) other;
            return this.offset == transformScrolling.offset && this.destinationTab == transformScrolling.destinationTab && this.selectedTabChanged == transformScrolling.selectedTabChanged;
        }

        public final int getDestinationTab() {
            return this.destinationTab;
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return Boolean.hashCode(this.selectedTabChanged) + C2454a.a(this.destinationTab, Integer.hashCode(this.offset) * 31, 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.offset;
            int i12 = this.destinationTab;
            return a.a(")", C2438a.a("TransformScrolling(offset=", i11, ", destinationTab=", ", selectedTabChanged=", i12), this.selectedTabChanged);
        }
    }

    public /* synthetic */ CatalogTabsScrollState(int i11, int i12, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, z11);
    }

    public final int getFinalTab() {
        return this.finalTab;
    }

    public final int getOffsetX() {
        return this.offsetX;
    }

    public final boolean getWasSelectedTabChanged() {
        return this.wasSelectedTabChanged;
    }

    private CatalogTabsScrollState(int i11, int i12, boolean z11) {
        this.offsetX = i11;
        this.finalTab = i12;
        this.wasSelectedTabChanged = z11;
    }
}
