package com.vk.music.fragment.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.LruCache;
import com.unity3d.ads.BuildConfig;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.fragment.impl.PlaylistsFragment;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.a630;
import xsna.b5z;
import xsna.e43;
import xsna.epx;
import xsna.ey50;
import xsna.h1;
import xsna.ho8;
import xsna.i940;
import xsna.k940;
import xsna.l940;
import xsna.ldl;
import xsna.msy;
import xsna.mzp0;
import xsna.p90;
import xsna.pd4;
import xsna.rzp0;
import xsna.tmz;
import xsna.v53;
import xsna.ver0;
import xsna.ww50;
import xsna.xk30;
import xsna.xrj;
import xsna.xsb;
import xsna.yfb;

/* compiled from: MusicAddTrackToPlaylistLauncherImpl.kt */
/* loaded from: classes3.dex */
public final class MusicAddTrackToPlaylistLauncherImpl implements i940 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final Object c;
    public final Object d;
    public final LinkedHashMap e;
    public final l940 f;
    public final Object g;

    /* compiled from: MusicAddTrackToPlaylistLauncherImpl.kt */
    public static final class RequestKey implements Parcelable {
        public static final Parcelable.Creator<RequestKey> CREATOR = new a();
        public final String b;

        /* compiled from: MusicAddTrackToPlaylistLauncherImpl.kt */
        public static final class a implements Parcelable.Creator<RequestKey> {
            @Override // android.os.Parcelable.Creator
            public final RequestKey createFromParcel(Parcel parcel) {
                return new RequestKey(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RequestKey[] newArray(int i) {
                return new RequestKey[i];
            }
        }

        public RequestKey(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestKey) && epx.f(this.b, ((RequestKey) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("RequestKey(id="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }

        public RequestKey(Activity activity) {
            this(activity.getClass().getName());
        }
    }

    /* compiled from: MusicAddTrackToPlaylistLauncherImpl.kt */
    public final class a {
    }

    /* compiled from: MusicAddTrackToPlaylistLauncherImpl.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: MusicAddTrackToPlaylistLauncherImpl.kt */
    public static final class c extends b5z {
        public final /* synthetic */ Activity e;

        public c(Activity activity) {
            this.e = activity;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            if (r1 == null) goto L16;
         */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.b5z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(String str, int i, int i2, Intent intent) {
            RequestKey requestKey;
            Bundle extras;
            Parcelable parcelable;
            Object parcelable2;
            Parcelable parcelable3;
            Object parcelableExtra;
            if (i != 1092) {
                return;
            }
            Activity activity = this.e;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("MusicAddTrackToPlaylistLauncher.request_key", RequestKey.class);
                    parcelable3 = (Parcelable) parcelableExtra;
                } else {
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("MusicAddTrackToPlaylistLauncher.request_key");
                    if (!(parcelableExtra2 instanceof RequestKey)) {
                        parcelableExtra2 = null;
                    }
                    parcelable3 = (RequestKey) parcelableExtra2;
                }
                requestKey = (RequestKey) parcelable3;
            }
            requestKey = new RequestKey(activity);
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{activity.getClass().getSimpleName() + " resultCode=" + i2 + " requestKey=" + requestKey});
            }
            MusicAddTrackToPlaylistLauncherImpl musicAddTrackToPlaylistLauncherImpl = MusicAddTrackToPlaylistLauncherImpl.this;
            i940.b bVar = (i940.b) musicAddTrackToPlaylistLauncherImpl.b.remove(requestKey);
            if (bVar == null) {
                return;
            }
            MusicTrack musicTrack = bVar.b;
            if (i2 != -1 || intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = extras.getParcelable("result", Playlist.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable4 = extras.getParcelable("result");
                parcelable = (Playlist) (parcelable4 instanceof Playlist ? parcelable4 : null);
            }
            Playlist playlist = (Playlist) parcelable;
            if (playlist == null) {
                return;
            }
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"adding '" + musicTrack + "' to " + playlist + "..."});
            }
            int i3 = 3;
            ver0.a(new a0(((a630) musicAddTrackToPlaylistLauncherImpl.g.getValue()).F(musicTrack, playlist, bVar.c).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new xsb(playlist, i3)).subscribe(new xk30(new v53(musicAddTrackToPlaylistLauncherImpl, activity, bVar), i3), new tmz(new h1(23, musicAddTrackToPlaylistLauncherImpl, activity), 4)));
        }
    }

    public MusicAddTrackToPlaylistLauncherImpl(Application application) {
        ldl ldlVar = new ldl(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, ldlVar);
        this.d = msy.a(lazyThreadSafetyMode, new xrj(this, 22));
        this.e = new LinkedHashMap();
        this.f = new l940();
        k940 k940Var = new k940(this);
        this.g = msy.a(lazyThreadSafetyMode, new pd4(21));
        application.registerActivityLifecycleCallbacks(k940Var);
    }

    @Override // xsna.i940
    public final void a(Activity activity, i940.c cVar) {
        LinkedHashMap linkedHashMap = this.e;
        if (cVar == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"remove from ".concat(activity.getClass().getSimpleName())});
            }
            linkedHashMap.remove(activity);
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{"to ".concat(activity.getClass().getSimpleName())});
        }
        linkedHashMap.put(activity, new WeakReference(cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i940
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i940.a b(Activity activity, i940.b bVar) {
        ww50<?> Y;
        FragmentImpl u;
        boolean z;
        Intent intent;
        Parcelable parcelable;
        RequestKey requestKey;
        Object parcelableExtra;
        if (p90.e(activity)) {
            return i940.a.C3041a.a;
        }
        if (!this.a.containsKey(activity)) {
            c(activity);
        }
        b bVar2 = (b) this.c.getValue();
        bVar2.getClass();
        MusicTrack musicTrack = bVar.b;
        MusicAddTrackToPlaylistLauncherImpl musicAddTrackToPlaylistLauncherImpl = MusicAddTrackToPlaylistLauncherImpl.this;
        LinkedHashMap linkedHashMap = musicAddTrackToPlaylistLauncherImpl.b;
        Pair pair = (Pair) musicAddTrackToPlaylistLauncherImpl.a.get(activity);
        if (pair == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"activity " + activity.getClass().getSimpleName() + " wasn't registered to handle result"});
            }
            return i940.a.C3041a.a;
        }
        LifecycleHandler lifecycleHandler = (LifecycleHandler) pair.d();
        b5z b5zVar = (b5z) pair.g();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null && (u = Y.u()) != null) {
            if (u instanceof PlaylistsFragment) {
                Bundle arguments = ((PlaylistsFragment) u).getArguments();
                if (arguments == null ? false : arguments.containsKey("attachedMusicTracks")) {
                    z = true;
                    if (z && (intent = activity.getIntent()) != null) {
                        if (Build.VERSION.SDK_INT < 33) {
                            parcelableExtra = intent.getParcelableExtra("MusicAddTrackToPlaylistLauncher.src_request_key", RequestKey.class);
                            parcelable = (Parcelable) parcelableExtra;
                        } else {
                            Parcelable parcelableExtra2 = intent.getParcelableExtra("MusicAddTrackToPlaylistLauncher.src_request_key");
                            if (!(parcelableExtra2 instanceof RequestKey)) {
                                parcelableExtra2 = null;
                            }
                            parcelable = (RequestKey) parcelableExtra2;
                        }
                        requestKey = (RequestKey) parcelable;
                        if (requestKey != null) {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l2, L.LogType.d, new Object[]{"Playlist choose fragment already displayed: no need to navigate deeper"});
                            }
                            linkedHashMap.put(requestKey, bVar);
                            return new i940.a.b(false);
                        }
                    }
                }
            }
            z = false;
            if (z) {
                if (Build.VERSION.SDK_INT < 33) {
                }
                requestKey = (RequestKey) parcelable;
                if (requestKey != null) {
                }
            }
        }
        L l3 = L.a;
        l3.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l3, L.LogType.d, new Object[]{"playlist chooser for '" + musicTrack + "': srcActivity=" + activity.getClass().getSimpleName()});
        }
        linkedHashMap.put(new RequestKey(activity), bVar);
        String valueOf = String.valueOf(b5zVar.b);
        long j = bVar.a;
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        Pair c2 = rzp0.c(UiMeasuringScreen.MUSIC_PLAYLIST, null, false, 62);
        UUID uuid = (UUID) c2.d();
        ((mzp0) c2.g()).init();
        Bundle a2 = yfb.a();
        rzp0.f(a2, uuid);
        PlaylistsFragment.a aVar = new PlaylistsFragment.a(PlaylistsFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putAll(a2);
        bundle.putLong("screenOpenedFromPlaylistPid", j);
        bundle.putParcelableArrayList("attachedMusicTracks", e43.a(musicTrack));
        bundle.putBoolean("select", true);
        Intent n = aVar.n(activity);
        n.putExtra("MusicAddTrackToPlaylistLauncher.src_request_key", new RequestKey(activity));
        lifecycleHandler.g(1092, valueOf, n);
        return new i940.a.b(true);
    }

    public final void c(Activity activity) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{activity.getClass().getSimpleName()});
        }
        LifecycleHandler c2 = LifecycleHandler.c(activity);
        c cVar = new c(activity);
        c2.a(cVar);
        this.a.put(activity, new Pair(c2, cVar));
    }

    public final i940.c d(Activity activity) {
        WeakReference weakReference = (WeakReference) this.e.get(activity);
        i940.c cVar = weakReference != null ? (i940.c) weakReference.get() : null;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.d;
            StringBuilder sb = new StringBuilder();
            sb.append(cVar != null ? "custom" : BuildConfig.FLAVOR);
            sb.append(" for ");
            sb.append(activity.getClass().getSimpleName());
            L.u(l, logType, new Object[]{sb.toString()});
        }
        return cVar == null ? this.f : cVar;
    }
}
