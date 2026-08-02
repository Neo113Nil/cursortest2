package ru.ozon.app.android.geo.map.clusterization;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJB\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\n\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/PinMetadata;", "", "", "id", "", "defaultStateCacheHash", "selectedStateCacheHash", "Lru/ozon/app/android/geo/map/clusterization/CurrentPinState;", "state", "", "isMergedPin", "<init>", "(Ljava/lang/String;IILru/ozon/app/android/geo/map/clusterization/CurrentPinState;Z)V", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;IILru/ozon/app/android/geo/map/clusterization/CurrentPinState;Z)Lru/ozon/app/android/geo/map/clusterization/PinMetadata;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "I", "getDefaultStateCacheHash", "getSelectedStateCacheHash", "Lru/ozon/app/android/geo/map/clusterization/CurrentPinState;", "getState", "()Lru/ozon/app/android/geo/map/clusterization/CurrentPinState;", "Z", "()Z", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PinMetadata {
    private final int defaultStateCacheHash;

    @NotNull
    private final String id;
    private final boolean isMergedPin;
    private final int selectedStateCacheHash;

    @NotNull
    private final CurrentPinState state;

    public PinMetadata() {
        this(null, 0, 0, null, false, 31, null);
    }

    public static /* synthetic */ PinMetadata copy$default(PinMetadata pinMetadata, String str, int i11, int i12, CurrentPinState currentPinState, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pinMetadata.id;
        }
        if ((i13 & 2) != 0) {
            i11 = pinMetadata.defaultStateCacheHash;
        }
        if ((i13 & 4) != 0) {
            i12 = pinMetadata.selectedStateCacheHash;
        }
        if ((i13 & 8) != 0) {
            currentPinState = pinMetadata.state;
        }
        if ((i13 & 16) != 0) {
            z11 = pinMetadata.isMergedPin;
        }
        boolean z12 = z11;
        int i14 = i12;
        return pinMetadata.copy(str, i11, i14, currentPinState, z12);
    }

    @NotNull
    public final PinMetadata copy(@NotNull String id2, int defaultStateCacheHash, int selectedStateCacheHash, @NotNull CurrentPinState state, boolean isMergedPin) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        return new PinMetadata(id2, defaultStateCacheHash, selectedStateCacheHash, state, isMergedPin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinMetadata)) {
            return false;
        }
        PinMetadata pinMetadata = (PinMetadata) other;
        return Intrinsics.d(this.id, pinMetadata.id) && this.defaultStateCacheHash == pinMetadata.defaultStateCacheHash && this.selectedStateCacheHash == pinMetadata.selectedStateCacheHash && this.state == pinMetadata.state && this.isMergedPin == pinMetadata.isMergedPin;
    }

    public final int getDefaultStateCacheHash() {
        return this.defaultStateCacheHash;
    }

    public final int getSelectedStateCacheHash() {
        return this.selectedStateCacheHash;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isMergedPin) + ((this.state.hashCode() + C2454a.a(this.selectedStateCacheHash, C2454a.a(this.defaultStateCacheHash, this.id.hashCode() * 31, 31), 31)) * 31);
    }

    /* renamed from: isMergedPin, reason: from getter */
    public final boolean getIsMergedPin() {
        return this.isMergedPin;
    }

    @NotNull
    /* renamed from: toString, reason: from getter */
    public String getId() {
        return this.id;
    }

    public PinMetadata(@NotNull String id2, int i11, int i12, @NotNull CurrentPinState state, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id2;
        this.defaultStateCacheHash = i11;
        this.selectedStateCacheHash = i12;
        this.state = state;
        this.isMergedPin = z11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PinMetadata(java.lang.String r2, int r3, int r4, ru.ozon.app.android.geo.map.clusterization.CurrentPinState r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = "placemark"
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            ru.ozon.app.android.geo.map.clusterization.CurrentPinState r5 = ru.ozon.app.android.geo.map.clusterization.CurrentPinState.DEFAULT
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.geo.map.clusterization.PinMetadata.<init>(java.lang.String, int, int, ru.ozon.app.android.geo.map.clusterization.CurrentPinState, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
