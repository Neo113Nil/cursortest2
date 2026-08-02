package com.vk.clips.viewer.impl.routing.transition;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.internal.transition.TransitionAnimation;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.fav;
import xsna.pzc;
import xsna.qj2;
import xsna.qzc;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ClipFullscreenSourceHoldTransition.kt */
/* loaded from: classes17.dex */
public final class ClipFullscreenSourceHoldTransition implements TransitionAnimation {
    public static final Parcelable.Creator<ClipFullscreenSourceHoldTransition> CREATOR = new a();
    public final b b;
    public boolean c;

    /* compiled from: ClipFullscreenSourceHoldTransition.kt */
    public static final class a implements Parcelable.Creator<ClipFullscreenSourceHoldTransition> {
        @Override // android.os.Parcelable.Creator
        public final ClipFullscreenSourceHoldTransition createFromParcel(Parcel parcel) {
            return new ClipFullscreenSourceHoldTransition(b.valueOf(parcel.readString()), null);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipFullscreenSourceHoldTransition[] newArray(int i) {
            return new ClipFullscreenSourceHoldTransition[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipFullscreenSourceHoldTransition.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ENTER;
        public static final b EXIT;

        static {
            b bVar = new b("EXIT", 0);
            EXIT = bVar;
            b bVar2 = new b("ENTER", 1);
            ENTER = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipFullscreenSourceHoldTransition.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.EXIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.ENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClipFullscreenSourceHoldTransition(b bVar, zcl zclVar) {
        this.b = bVar;
    }

    @Override // com.vk.core.fragments.internal.transition.TransitionAnimation
    public final void X4(androidx.fragment.app.a aVar, qj2 qj2Var) {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2;
        aVar.r = true;
        int i = c.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            qj2.e eVar = qj2Var instanceof qj2.e ? (qj2.e) qj2Var : null;
            if (eVar == null || (fragment = eVar.a) == null) {
                return;
            }
            View view = fragment.getView();
            viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                this.c = viewGroup.isTransitionGroup();
                viewGroup.setTransitionGroup(true);
            }
            fav favVar = new fav();
            favVar.addListener(new pzc(fragment));
            fragment.setExitTransition(favVar);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        qj2.d dVar = qj2Var instanceof qj2.d ? (qj2.d) qj2Var : null;
        if (dVar == null || (fragment2 = dVar.a) == null) {
            return;
        }
        View view2 = fragment2.getView();
        viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup != null) {
            this.c = viewGroup.isTransitionGroup();
            viewGroup.setTransitionGroup(true);
        }
        fav favVar2 = new fav();
        favVar2.addListener(new qzc(fragment2));
        fragment2.setEnterTransition(favVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.core.fragments.internal.transition.TransitionAnimation
    public final void s3(qj2 qj2Var) {
        Fragment fragment;
        Fragment fragment2;
        qj2.d dVar = qj2Var instanceof qj2.d ? (qj2.d) qj2Var : null;
        if (dVar != null && (fragment2 = dVar.a) != null) {
            View view = fragment2.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.setTransitionGroup(this.c);
                this.c = false;
            }
        }
        qj2.e eVar = qj2Var instanceof qj2.e ? (qj2.e) qj2Var : null;
        if (eVar == null || (fragment = eVar.a) == null) {
            return;
        }
        View view2 = fragment.getView();
        ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setTransitionGroup(this.c);
        this.c = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
    }
}
