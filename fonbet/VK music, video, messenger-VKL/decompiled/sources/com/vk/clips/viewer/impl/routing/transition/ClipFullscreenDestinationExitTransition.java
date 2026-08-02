package com.vk.clips.viewer.impl.routing.transition;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.vk.clips.viewer.impl.routing.transition.a;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import xsna.io2;
import xsna.qj2;
import xsna.rzc;

/* compiled from: ClipFullscreenDestinationExitTransition.kt */
/* loaded from: classes17.dex */
public final class ClipFullscreenDestinationExitTransition implements TransitionAnimation {
    public static final Parcelable.Creator<ClipFullscreenDestinationExitTransition> CREATOR = new a();

    /* compiled from: ClipFullscreenDestinationExitTransition.kt */
    public static final class a implements Parcelable.Creator<ClipFullscreenDestinationExitTransition> {
        @Override // android.os.Parcelable.Creator
        public final ClipFullscreenDestinationExitTransition createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ClipFullscreenDestinationExitTransition();
        }

        @Override // android.os.Parcelable.Creator
        public final ClipFullscreenDestinationExitTransition[] newArray(int i) {
            return new ClipFullscreenDestinationExitTransition[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.internal.transition.TransitionAnimation
    public final void X4(androidx.fragment.app.a aVar, qj2 qj2Var) {
        Fragment fragment;
        a.C0714a c0714a;
        aVar.r = true;
        qj2.c cVar = qj2Var instanceof qj2.c ? (qj2.c) qj2Var : null;
        if (cVar == null || (fragment = cVar.a) == 0 || !(fragment instanceof rzc)) {
            return;
        }
        View view = fragment.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.setTransitionGroup(true);
        }
        if (!aVar.c.isEmpty()) {
            com.vk.clips.viewer.impl.routing.transition.a Uh = ((rzc) fragment).Uh();
            if (Uh != null) {
                io2 io2Var = Uh.a.a;
                io2Var.J();
                io2Var.C();
                return;
            }
            return;
        }
        rzc rzcVar = (rzc) fragment;
        com.vk.clips.viewer.impl.routing.transition.a Uh2 = rzcVar.Uh();
        if (Uh2 == null || (c0714a = Uh2.b) == null || !c0714a.c || Uh2.a.a.t0().isEmpty()) {
            fragment.setExitTransition(new c(fragment, rzcVar));
        } else {
            fragment.setExitTransition(new b(fragment, rzcVar));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // com.vk.core.fragments.internal.transition.TransitionAnimation
    public final void s3(qj2 qj2Var) {
    }
}
