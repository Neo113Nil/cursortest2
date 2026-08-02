package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation;

import H3.c;
import HY.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction;", "", "<init>", "()V", "CloseFlow", "ShowCells", "ProcessChangeFilter", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction$CloseFlow;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction$ProcessChangeFilter;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction$ShowCells;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CurrentStepAction {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction$CloseFlow;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction;", "<init>", "()V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CloseFlow extends CurrentStepAction {

        @NotNull
        public static final CloseFlow INSTANCE = new CloseFlow();

        private CloseFlow() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction$ProcessChangeFilter;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction;", "", "", "", "postParams", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getPostParams", "()Ljava/util/Map;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProcessChangeFilter extends CurrentStepAction {

        @NotNull
        private final Map<String, Object> postParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProcessChangeFilter(@NotNull Map<String, ? extends Object> postParams) {
            super(null);
            Intrinsics.checkNotNullParameter(postParams, "postParams");
            this.postParams = postParams;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProcessChangeFilter) && Intrinsics.d(this.postParams, ((ProcessChangeFilter) other).postParams);
        }

        @NotNull
        public final Map<String, Object> getPostParams() {
            return this.postParams;
        }

        public int hashCode() {
            return this.postParams.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("ProcessChangeFilter(postParams=", ")", this.postParams);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction$ShowCells;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/CurrentStepAction;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "cells", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowCells extends CurrentStepAction {

        @NotNull
        private final List<AtomDTO> cells;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowCells(@NotNull List<? extends AtomDTO> cells) {
            super(null);
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.cells = cells;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowCells) && Intrinsics.d(this.cells, ((ShowCells) other).cells);
        }

        @NotNull
        public final List<AtomDTO> getCells() {
            return this.cells;
        }

        public int hashCode() {
            return this.cells.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("ShowCells(cells=", ")", this.cells);
        }
    }

    public /* synthetic */ CurrentStepAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CurrentStepAction() {
    }
}
