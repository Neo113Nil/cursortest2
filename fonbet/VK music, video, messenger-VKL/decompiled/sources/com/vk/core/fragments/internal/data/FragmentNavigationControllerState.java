package com.vk.core.fragments.internal.data;

import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.exceptions.StackSerializationException;
import com.vk.core.fragments.internal.stack.FStackGroup;
import com.vk.core.serialize.Serializer;
import com.vk.metrics.eventtracking.b;
import java.util.LinkedList;
import java.util.List;
import xsna.j5g;
import xsna.za3;

/* compiled from: FragmentNavigationControllerState.kt */
/* loaded from: classes.dex */
public final class FragmentNavigationControllerState extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<FragmentNavigationControllerState> CREATOR = new a();
    public final LinkedList<LaunchForResultInfo> b;
    public final FStackGroup c;
    public FragmentEntry d;
    public final int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FragmentNavigationControllerState> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FragmentNavigationControllerState a(Serializer serializer) {
            return new FragmentNavigationControllerState(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FragmentNavigationControllerState[i];
        }
    }

    public FragmentNavigationControllerState(List<FragmentEntry> list, boolean z, boolean z2) {
        this.b = new LinkedList<>();
        this.c = new FStackGroup(list, z, z2);
        this.d = null;
        BuildInfo.Client client = BuildInfo.a;
        this.e = BuildInfo.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        FStackGroup fStackGroup = this.c;
        try {
            serializer.W(this.b);
            serializer.i0(fStackGroup);
            serializer.i0(this.d);
            serializer.S(this.e);
        } catch (StackOverflowError e) {
            b.a.a(new StackSerializationException(j5g.g0(fStackGroup.b, null, "{", "}", 0, new za3(2), 25), e));
            throw e;
        }
    }

    public FragmentNavigationControllerState(Serializer serializer) {
        this.b = new LinkedList<>(serializer.l(FragmentEntry.class.getClassLoader()));
        this.c = (FStackGroup) serializer.G(FStackGroup.class.getClassLoader());
        this.d = (FragmentEntry) serializer.G(FragmentEntry.class.getClassLoader());
        this.e = serializer.u();
    }
}
