package ru.ozon.app.android.storefront.stories.setContainer.presentation;

import Kk.C3532b;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonVoSet;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016\"\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/SetSwitch;", "", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;", "vo", "", "isSelected", "isTracked", "<init>", "(Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;", "getVo", "()Lru/ozon/app/android/storefront/stories/setContainer/data/CommonVoSet;", "Z", "()Z", "setSelected", "(Z)V", "setTracked", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SetSwitch {
    private boolean isSelected;
    private boolean isTracked;

    @NotNull
    private final CommonVoSet vo;

    public SetSwitch(@NotNull CommonVoSet vo, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.vo = vo;
        this.isSelected = z11;
        this.isTracked = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetSwitch)) {
            return false;
        }
        SetSwitch setSwitch = (SetSwitch) other;
        return Intrinsics.d(this.vo, setSwitch.vo) && this.isSelected == setSwitch.isSelected && this.isTracked == setSwitch.isTracked;
    }

    @NotNull
    public final CommonVoSet getVo() {
        return this.vo;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTracked) + C3532b.a(this.vo.hashCode() * 31, 31, this.isSelected);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    @NotNull
    public String toString() {
        CommonVoSet commonVoSet = this.vo;
        boolean z11 = this.isSelected;
        boolean z12 = this.isTracked;
        StringBuilder sb2 = new StringBuilder("SetSwitch(vo=");
        sb2.append(commonVoSet);
        sb2.append(", isSelected=");
        sb2.append(z11);
        sb2.append(", isTracked=");
        return a.a(")", sb2, z12);
    }

    public /* synthetic */ SetSwitch(CommonVoSet commonVoSet, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonVoSet, z11, (i11 & 4) != 0 ? false : z12);
    }
}
