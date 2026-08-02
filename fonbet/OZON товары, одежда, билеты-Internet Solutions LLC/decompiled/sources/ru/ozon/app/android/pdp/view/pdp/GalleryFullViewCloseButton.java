package ru.ozon.app.android.pdp.view.pdp;

import A00.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/view/pdp/GalleryFullViewCloseButton;", "LA00/a$J$a;", "", "isShow", "LWZ/t;", "tokenizedEvent", "isClose", "<init>", "(ZLWZ/t;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryFullViewCloseButton implements a.J.InterfaceC0007a {
    private final boolean isClose;
    private final boolean isShow;
    private final t tokenizedEvent;

    public GalleryFullViewCloseButton(boolean z11, t tVar, boolean z12) {
        this.isShow = z11;
        this.tokenizedEvent = tVar;
        this.isClose = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryFullViewCloseButton)) {
            return false;
        }
        GalleryFullViewCloseButton galleryFullViewCloseButton = (GalleryFullViewCloseButton) other;
        return this.isShow == galleryFullViewCloseButton.isShow && Intrinsics.d(this.tokenizedEvent, galleryFullViewCloseButton.tokenizedEvent) && this.isClose == galleryFullViewCloseButton.isClose;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isShow) * 31;
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.isClose) + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    /* renamed from: isClose, reason: from getter */
    public final boolean getIsClose() {
        return this.isClose;
    }

    /* renamed from: isShow, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isShow;
        t tVar = this.tokenizedEvent;
        boolean z12 = this.isClose;
        StringBuilder sb2 = new StringBuilder("GalleryFullViewCloseButton(isShow=");
        sb2.append(z11);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", isClose=");
        return Pk0.a.a(")", sb2, z12);
    }

    public /* synthetic */ GalleryFullViewCloseButton(boolean z11, t tVar, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, tVar, (i11 & 4) != 0 ? false : z12);
    }
}
