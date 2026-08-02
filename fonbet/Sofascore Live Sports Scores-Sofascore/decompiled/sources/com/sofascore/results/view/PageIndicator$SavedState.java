package com.sofascore.results.view;

import android.os.Parcel;
import android.view.View;
import defpackage.b5e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/sofascore/results/view/PageIndicator$SavedState", "Landroid/view/View$BaseSavedState;", "CREATOR", "b5e", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PageIndicator$SavedState extends View.BaseSavedState {

    @NotNull
    public static final b5e CREATOR = new b5e();
    public int a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }
}
