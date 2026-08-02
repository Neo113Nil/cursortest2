package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.presentation;

import Bi.b;
import D3.h;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;", "model", "Lru/ozon/uni/atoms/af/AtomAction;", "modalAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;", "getModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;", "Lru/ozon/uni/atoms/af/AtomAction;", "getModalAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "AddToFavoritesCellModelVI", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AddToFavoritesCellVI implements c {

    @NotNull
    private final CellDTO cell;
    private final long id;
    private final AtomAction modalAction;

    @NotNull
    private final AddToFavoritesCellModelVI model;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u000e\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\r\u0010\u000eJ^\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\b\u0010 R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;", "", "", "sku", "", "addLink", "deleteLink", "", "isFavorite", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "addEvent", "deleteEvent", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLWZ/t;LWZ/t;)V", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLWZ/t;LWZ/t;)Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/presentation/AddToFavoritesCellVI$AddToFavoritesCellModelVI;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getSku", "()Ljava/lang/Long;", "Ljava/lang/String;", "getAddLink", "getDeleteLink", "Z", "()Z", "LWZ/t;", "getAddEvent", "()LWZ/t;", "getDeleteEvent", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToFavoritesCellModelVI {
        private final t addEvent;

        @NotNull
        private final String addLink;
        private final t deleteEvent;

        @NotNull
        private final String deleteLink;
        private final boolean isFavorite;
        private final Long sku;

        public AddToFavoritesCellModelVI(Long l11, @NotNull String addLink, @NotNull String deleteLink, boolean z11, t tVar, t tVar2) {
            Intrinsics.checkNotNullParameter(addLink, "addLink");
            Intrinsics.checkNotNullParameter(deleteLink, "deleteLink");
            this.sku = l11;
            this.addLink = addLink;
            this.deleteLink = deleteLink;
            this.isFavorite = z11;
            this.addEvent = tVar;
            this.deleteEvent = tVar2;
        }

        public static /* synthetic */ AddToFavoritesCellModelVI copy$default(AddToFavoritesCellModelVI addToFavoritesCellModelVI, Long l11, String str, String str2, boolean z11, t tVar, t tVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = addToFavoritesCellModelVI.sku;
            }
            if ((i11 & 2) != 0) {
                str = addToFavoritesCellModelVI.addLink;
            }
            if ((i11 & 4) != 0) {
                str2 = addToFavoritesCellModelVI.deleteLink;
            }
            if ((i11 & 8) != 0) {
                z11 = addToFavoritesCellModelVI.isFavorite;
            }
            if ((i11 & 16) != 0) {
                tVar = addToFavoritesCellModelVI.addEvent;
            }
            if ((i11 & 32) != 0) {
                tVar2 = addToFavoritesCellModelVI.deleteEvent;
            }
            t tVar3 = tVar;
            t tVar4 = tVar2;
            return addToFavoritesCellModelVI.copy(l11, str, str2, z11, tVar3, tVar4);
        }

        @NotNull
        public final AddToFavoritesCellModelVI copy(Long sku, @NotNull String addLink, @NotNull String deleteLink, boolean isFavorite, t addEvent, t deleteEvent) {
            Intrinsics.checkNotNullParameter(addLink, "addLink");
            Intrinsics.checkNotNullParameter(deleteLink, "deleteLink");
            return new AddToFavoritesCellModelVI(sku, addLink, deleteLink, isFavorite, addEvent, deleteEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddToFavoritesCellModelVI)) {
                return false;
            }
            AddToFavoritesCellModelVI addToFavoritesCellModelVI = (AddToFavoritesCellModelVI) other;
            return Intrinsics.d(this.sku, addToFavoritesCellModelVI.sku) && Intrinsics.d(this.addLink, addToFavoritesCellModelVI.addLink) && Intrinsics.d(this.deleteLink, addToFavoritesCellModelVI.deleteLink) && this.isFavorite == addToFavoritesCellModelVI.isFavorite && Intrinsics.d(this.addEvent, addToFavoritesCellModelVI.addEvent) && Intrinsics.d(this.deleteEvent, addToFavoritesCellModelVI.deleteEvent);
        }

        public final t getAddEvent() {
            return this.addEvent;
        }

        @NotNull
        public final String getAddLink() {
            return this.addLink;
        }

        public final t getDeleteEvent() {
            return this.deleteEvent;
        }

        @NotNull
        public final String getDeleteLink() {
            return this.deleteLink;
        }

        public final Long getSku() {
            return this.sku;
        }

        public int hashCode() {
            Long l11 = this.sku;
            int a11 = C3532b.a(g.a(g.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.addLink), 31, this.deleteLink), 31, this.isFavorite);
            t tVar = this.addEvent;
            int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.deleteEvent;
            return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        /* renamed from: isFavorite, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        @NotNull
        public String toString() {
            Long l11 = this.sku;
            String str = this.addLink;
            String str2 = this.deleteLink;
            boolean z11 = this.isFavorite;
            t tVar = this.addEvent;
            t tVar2 = this.deleteEvent;
            StringBuilder sb2 = new StringBuilder("AddToFavoritesCellModelVI(sku=");
            sb2.append(l11);
            sb2.append(", addLink=");
            sb2.append(str);
            sb2.append(", deleteLink=");
            C2880a.c(str2, ", isFavorite=", ", addEvent=", sb2, z11);
            sb2.append(tVar);
            sb2.append(", deleteEvent=");
            sb2.append(tVar2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public AddToFavoritesCellVI(long j11, @NotNull CellDTO cell, @NotNull AddToFavoritesCellModelVI model, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(model, "model");
        this.id = j11;
        this.cell = cell;
        this.model = model;
        this.modalAction = atomAction;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ AddToFavoritesCellVI copy$default(AddToFavoritesCellVI addToFavoritesCellVI, long j11, CellDTO cellDTO, AddToFavoritesCellModelVI addToFavoritesCellModelVI, AtomAction atomAction, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = addToFavoritesCellVI.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            cellDTO = addToFavoritesCellVI.cell;
        }
        CellDTO cellDTO2 = cellDTO;
        if ((i11 & 4) != 0) {
            addToFavoritesCellModelVI = addToFavoritesCellVI.model;
        }
        AddToFavoritesCellModelVI addToFavoritesCellModelVI2 = addToFavoritesCellModelVI;
        if ((i11 & 8) != 0) {
            atomAction = addToFavoritesCellVI.modalAction;
        }
        AtomAction atomAction2 = atomAction;
        if ((i11 & 16) != 0) {
            tVar = addToFavoritesCellVI.tokenizedEvent;
        }
        return addToFavoritesCellVI.copy(j12, cellDTO2, addToFavoritesCellModelVI2, atomAction2, tVar);
    }

    @NotNull
    public final AddToFavoritesCellVI copy(long id2, @NotNull CellDTO cell, @NotNull AddToFavoritesCellModelVI model, AtomAction modalAction, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(model, "model");
        return new AddToFavoritesCellVI(id2, cell, model, modalAction, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToFavoritesCellVI)) {
            return false;
        }
        AddToFavoritesCellVI addToFavoritesCellVI = (AddToFavoritesCellVI) other;
        return this.id == addToFavoritesCellVI.id && Intrinsics.d(this.cell, addToFavoritesCellVI.cell) && Intrinsics.d(this.model, addToFavoritesCellVI.model) && Intrinsics.d(this.modalAction, addToFavoritesCellVI.modalAction) && Intrinsics.d(this.tokenizedEvent, addToFavoritesCellVI.tokenizedEvent);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final AddToFavoritesCellModelVI getModel() {
        return this.model;
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
        int hashCode = (this.model.hashCode() + b.c(this.cell, Long.hashCode(this.id) * 31, 31)) * 31;
        AtomAction atomAction = this.modalAction;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        AddToFavoritesCellModelVI addToFavoritesCellModelVI = this.model;
        AtomAction atomAction = this.modalAction;
        t tVar = this.tokenizedEvent;
        StringBuilder e11 = h.e("AddToFavoritesCellVI(id=", j11, ", cell=", cellDTO);
        e11.append(", model=");
        e11.append(addToFavoritesCellModelVI);
        e11.append(", modalAction=");
        e11.append(atomAction);
        return a.b(e11, ", tokenizedEvent=", tVar, ")");
    }
}
