package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.socialHeader;

import B0.A0;
import B0.C2454a;
import Bi.b;
import D3.h;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SubListPositioned;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\u0016R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SocialHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SubListPositioned;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "subscribe", "subscribed", "", "isSubscribed", "", "subListIndex", "subListSize", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZII)V", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZII)Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SocialHeaderVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribe", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribed", "Z", "()Z", "I", "getSubListIndex", "getSubListSize", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SocialHeaderVO implements c, SubListPositioned {
    public static final int $stable = CellDTO.$stable;
    private final long id;
    private final boolean isSubscribed;
    private final int subListIndex;
    private final int subListSize;

    @NotNull
    private final CellDTO subscribe;

    @NotNull
    private final CellDTO subscribed;

    public SocialHeaderVO(long j11, @NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean z11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(subscribed, "subscribed");
        this.id = j11;
        this.subscribe = subscribe;
        this.subscribed = subscribed;
        this.isSubscribed = z11;
        this.subListIndex = i11;
        this.subListSize = i12;
    }

    public static /* synthetic */ SocialHeaderVO copy$default(SocialHeaderVO socialHeaderVO, long j11, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = socialHeaderVO.id;
        }
        long j12 = j11;
        if ((i13 & 2) != 0) {
            cellDTO = socialHeaderVO.subscribe;
        }
        CellDTO cellDTO3 = cellDTO;
        if ((i13 & 4) != 0) {
            cellDTO2 = socialHeaderVO.subscribed;
        }
        CellDTO cellDTO4 = cellDTO2;
        if ((i13 & 8) != 0) {
            z11 = socialHeaderVO.isSubscribed;
        }
        boolean z12 = z11;
        if ((i13 & 16) != 0) {
            i11 = socialHeaderVO.subListIndex;
        }
        int i14 = i11;
        if ((i13 & 32) != 0) {
            i12 = socialHeaderVO.subListSize;
        }
        return socialHeaderVO.copy(j12, cellDTO3, cellDTO4, z12, i14, i12);
    }

    @NotNull
    public final SocialHeaderVO copy(long id2, @NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean isSubscribed, int subListIndex, int subListSize) {
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(subscribed, "subscribed");
        return new SocialHeaderVO(id2, subscribe, subscribed, isSubscribed, subListIndex, subListSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialHeaderVO)) {
            return false;
        }
        SocialHeaderVO socialHeaderVO = (SocialHeaderVO) other;
        return this.id == socialHeaderVO.id && Intrinsics.d(this.subscribe, socialHeaderVO.subscribe) && Intrinsics.d(this.subscribed, socialHeaderVO.subscribed) && this.isSubscribed == socialHeaderVO.isSubscribed && this.subListIndex == socialHeaderVO.subListIndex && this.subListSize == socialHeaderVO.subListSize;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SubListPositioned
    public int getSubListIndex() {
        return this.subListIndex;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SubListPositioned
    public int getSubListSize() {
        return this.subListSize;
    }

    @NotNull
    public final CellDTO getSubscribe() {
        return this.subscribe;
    }

    @NotNull
    public final CellDTO getSubscribed() {
        return this.subscribed;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Integer.hashCode(this.subListSize) + C2454a.a(this.subListIndex, C3532b.a(b.c(this.subscribed, b.c(this.subscribe, Long.hashCode(this.id) * 31, 31), 31), 31, this.isSubscribed), 31);
    }

    /* renamed from: isSubscribed, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.subscribe;
        CellDTO cellDTO2 = this.subscribed;
        boolean z11 = this.isSubscribed;
        int i11 = this.subListIndex;
        int i12 = this.subListSize;
        StringBuilder e11 = h.e("SocialHeaderVO(id=", j11, ", subscribe=", cellDTO);
        e11.append(", subscribed=");
        e11.append(cellDTO2);
        e11.append(", isSubscribed=");
        e11.append(z11);
        A0.c(i11, i12, ", subListIndex=", ", subListSize=", e11);
        e11.append(")");
        return e11.toString();
    }

    public /* synthetic */ SocialHeaderVO(long j11, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, cellDTO, cellDTO2, z11, (i13 & 16) != 0 ? -1 : i11, (i13 & 32) != 0 ? -1 : i12);
    }
}
