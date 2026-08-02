package ru.ozon.app.android.video.player;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p3.InterfaceC8846f;
import p3.i;
import p3.z;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/video/player/CacheObserver;", "Lp3/z;", "<init>", "()V", "", "isNetwork", "", "onTransferStateChanged", "(Z)V", "Lp3/f;", "source", "Lp3/i;", "dataSpec", "onTransferInitializing", "(Lp3/f;Lp3/i;Z)V", "onTransferStart", "", "bytesTransferred", "onBytesTransferred", "(Lp3/f;Lp3/i;ZI)V", "onTransferEnd", "onVideoLoadingStarted", "onVideoLoadingFinished", "wasLastPlaybackChunkLoadedFromCache", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/video/player/CacheObserver$State;", "state", "Lru/ozon/app/android/video/player/CacheObserver$State;", "State", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheObserver implements z {

    @NotNull
    private State state = State.INITIAL;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/video/player/CacheObserver$State;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "LOADING_WAS_STARTED", "IS_LOADING_FROM_NETWORK", "IS_LOADING_FROM_CACHE", "WAS_LOADED_FROM_NETWORK", "WAS_LOADED_FROM_CACHE", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State INITIAL = new State("INITIAL", 0);
        public static final State LOADING_WAS_STARTED = new State("LOADING_WAS_STARTED", 1);
        public static final State IS_LOADING_FROM_NETWORK = new State("IS_LOADING_FROM_NETWORK", 2);
        public static final State IS_LOADING_FROM_CACHE = new State("IS_LOADING_FROM_CACHE", 3);
        public static final State WAS_LOADED_FROM_NETWORK = new State("WAS_LOADED_FROM_NETWORK", 4);
        public static final State WAS_LOADED_FROM_CACHE = new State("WAS_LOADED_FROM_CACHE", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{INITIAL, LOADING_WAS_STARTED, IS_LOADING_FROM_NETWORK, IS_LOADING_FROM_CACHE, WAS_LOADED_FROM_NETWORK, WAS_LOADED_FROM_CACHE};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.WAS_LOADED_FROM_NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.WAS_LOADED_FROM_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void onTransferStateChanged(boolean isNetwork) {
        State state = this.state;
        if (state == State.LOADING_WAS_STARTED || state == State.IS_LOADING_FROM_CACHE) {
            this.state = isNetwork ? State.IS_LOADING_FROM_NETWORK : State.IS_LOADING_FROM_CACHE;
        }
    }

    @Override // p3.z
    public void onBytesTransferred(@NotNull InterfaceC8846f source, @NotNull i dataSpec, boolean isNetwork, int bytesTransferred) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        onTransferStateChanged(isNetwork);
    }

    @Override // p3.z
    public void onTransferEnd(@NotNull InterfaceC8846f source, @NotNull i dataSpec, boolean isNetwork) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        onTransferStateChanged(isNetwork);
    }

    @Override // p3.z
    public void onTransferInitializing(@NotNull InterfaceC8846f source, @NotNull i dataSpec, boolean isNetwork) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        onTransferStateChanged(isNetwork);
    }

    @Override // p3.z
    public void onTransferStart(@NotNull InterfaceC8846f source, @NotNull i dataSpec, boolean isNetwork) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        onTransferStateChanged(isNetwork);
    }

    public final void onVideoLoadingFinished() {
        State state = this.state;
        if (state == State.INITIAL) {
            return;
        }
        this.state = state == State.IS_LOADING_FROM_NETWORK ? State.WAS_LOADED_FROM_NETWORK : State.WAS_LOADED_FROM_CACHE;
    }

    public final void onVideoLoadingStarted() {
        this.state = State.LOADING_WAS_STARTED;
    }

    public final Boolean wasLastPlaybackChunkLoadedFromCache() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i11 == 1) {
            return Boolean.FALSE;
        }
        if (i11 != 2) {
            return null;
        }
        return Boolean.TRUE;
    }
}
