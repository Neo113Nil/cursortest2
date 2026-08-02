package com.vk.libvideo.impl.di;

import com.vk.core.preference.Preference;
import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.j5g;
import xsna.nwy;
import xsna.pqm0;
import xsna.pwj0;
import xsna.qcy;
import xsna.xqf0;

/* compiled from: VideoPlaylistReversionComponentImpl.kt */
/* loaded from: classes14.dex */
public final class VideoPlaylistReversionComponentImpl implements VideoPlaylistReversionComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new xqf0(10));

    /* compiled from: VideoPlaylistReversionComponentImpl.kt */
    public static final class a implements c8m<VideoPlaylistReversionComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoPlaylistReversionComponentImpl();
        }
    }

    /* compiled from: VideoPlaylistReversionComponentImpl.kt */
    public static final class b {
        public static final /* synthetic */ qcy<Object>[] b;
        public final pqm0 a = new pqm0("REVERSED_PLAYLISTS", "REVERSED_PLAYLISTS");

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(b.class, "reversedPlaylists", "getReversedPlaylists()Ljava/util/Set;", 0);
            fpf0.a.getClass();
            b = new qcy[]{mutablePropertyReference1Impl};
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoPlaylistReversionComponentImpl.class, "reversedPlaylists", "getReversedPlaylists()Lcom/vk/libvideo/impl/di/VideoPlaylistReversionComponentImpl$ReversedPlaylistsWrapper;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    public static String Df(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(' ');
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b Ef() {
        qcy<Object> qcyVar = b[0];
        return (b) this.a.c();
    }

    @Override // com.vk.libvideo.api.di.VideoPlaylistReversionComponent
    public final boolean L0(int i, long j) {
        b Ef = Ef();
        String Df = Df(i, j);
        pqm0 pqm0Var = Ef.a;
        qcy<Object> qcyVar = b.b[0];
        String str = (String) pqm0Var.b;
        String str2 = (String) pqm0Var.c;
        Preference preference = Preference.a;
        return Preference.u(EmptySet.b, str, str2).contains(Df);
    }

    @Override // com.vk.libvideo.api.di.VideoPlaylistReversionComponent
    public final void M2(int i, long j, boolean z) {
        String Df = Df(i, j);
        if (z) {
            pqm0 pqm0Var = Ef().a;
            String str = (String) pqm0Var.c;
            String str2 = (String) pqm0Var.b;
            qcy<Object>[] qcyVarArr = b.b;
            qcy<Object> qcyVar = qcyVarArr[0];
            Preference preference = Preference.a;
            Set R0 = j5g.R0(Preference.u(EmptySet.b, str2, str));
            R0.add(Df);
            qcy<Object> qcyVar2 = qcyVarArr[0];
            Preference.K(R0, str2, str);
            return;
        }
        pqm0 pqm0Var2 = Ef().a;
        String str3 = (String) pqm0Var2.c;
        String str4 = (String) pqm0Var2.b;
        qcy<Object>[] qcyVarArr2 = b.b;
        qcy<Object> qcyVar3 = qcyVarArr2[0];
        Preference preference2 = Preference.a;
        Set R02 = j5g.R0(Preference.u(EmptySet.b, str4, str3));
        R02.remove(Df);
        qcy<Object> qcyVar4 = qcyVarArr2[0];
        Preference.K(R02, str4, str3);
    }

    @Override // com.vk.libvideo.api.di.VideoPlaylistReversionComponent
    public final void X3(int i, long j) {
        String Df = Df(i, j);
        pqm0 pqm0Var = Ef().a;
        qcy<Object>[] qcyVarArr = b.b;
        qcy<Object> qcyVar = qcyVarArr[0];
        String str = (String) pqm0Var.b;
        String str2 = (String) pqm0Var.c;
        Preference preference = Preference.a;
        EmptySet emptySet = EmptySet.b;
        if (Preference.u(emptySet, str, str2).contains(Df)) {
            pqm0 pqm0Var2 = Ef().a;
            String str3 = (String) pqm0Var2.c;
            String str4 = (String) pqm0Var2.b;
            qcy<Object> qcyVar2 = qcyVarArr[0];
            Set R0 = j5g.R0(Preference.u(emptySet, str4, str3));
            R0.remove(Df);
            qcy<Object> qcyVar3 = qcyVarArr[0];
            Preference.K(R0, str4, str3);
            return;
        }
        pqm0 pqm0Var3 = Ef().a;
        String str5 = (String) pqm0Var3.c;
        String str6 = (String) pqm0Var3.b;
        qcy<Object> qcyVar4 = qcyVarArr[0];
        Set R02 = j5g.R0(Preference.u(emptySet, str6, str5));
        R02.add(Df);
        qcy<Object> qcyVar5 = qcyVarArr[0];
        Preference.K(R02, str6, str5);
    }
}
