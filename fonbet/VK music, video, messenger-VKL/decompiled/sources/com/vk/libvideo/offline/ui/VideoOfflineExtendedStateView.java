package com.vk.libvideo.offline.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fxc0;
import xsna.msy;
import xsna.prq0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: VideoOfflineExtendedStateView.kt */
/* loaded from: classes3.dex */
public final class VideoOfflineExtendedStateView extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public State b;
    public final Object c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoOfflineExtendedStateView.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Downloading;
        public static final State Error;
        public static final State NetworkAwaiting;
        public static final State Paused;
        public static final State Queued;
        public static final State WiFiAwaiting;

        static {
            State state = new State("NetworkAwaiting", 0);
            NetworkAwaiting = state;
            State state2 = new State("WiFiAwaiting", 1);
            WiFiAwaiting = state2;
            State state3 = new State("Queued", 2);
            Queued = state3;
            State state4 = new State("Downloading", 3);
            Downloading = state4;
            State state5 = new State("Paused", 4);
            Paused = state5;
            State state6 = new State("Error", 5);
            Error = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoOfflineExtendedStateView.kt */
    public interface a {

        /* compiled from: VideoOfflineExtendedStateView.kt */
        /* renamed from: com.vk.libvideo.offline.ui.VideoOfflineExtendedStateView$a$a, reason: collision with other inner class name */
        public static final class C1243a implements a {
            public static final C1243a a = new C1243a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1243a);
            }

            public final int hashCode() {
                return -736461526;
            }

            public final String toString() {
                return "Gone";
            }
        }

        /* compiled from: VideoOfflineExtendedStateView.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2036749135;
            }

            public final String toString() {
                return "VisibleAnimatedImage";
            }
        }

        /* compiled from: VideoOfflineExtendedStateView.kt */
        public static final class c implements a {
            public final int a;
            public final int b;

            public c(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VisibleImage(icon=");
                sb.append(this.a);
                sb.append(", color=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: VideoOfflineExtendedStateView.kt */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateTextViewContent(text=");
            sb.append(this.a);
            sb.append(", color=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: VideoOfflineExtendedStateView.kt */
    public static final class c {
        public final ImageView a;
        public final LottieAnimationView b;
        public final TextView c;

        public c(View view) {
            this.a = (ImageView) view.findViewById(R.id.download_common_state_view);
            this.b = (LottieAnimationView) view.findViewById(R.id.animationView);
            this.c = (TextView) view.findViewById(R.id.downloading_state_text_view);
        }
    }

    /* compiled from: VideoOfflineExtendedStateView.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.NetworkAwaiting.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.WiFiAwaiting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.Queued.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[State.Downloading.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[State.Paused.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[State.Error.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoOfflineExtendedStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = State.Queued;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new prq0(this, 14));
        LayoutInflater.from(context).inflate(R.layout.video_downloading_state_view, (ViewGroup) this, true);
        setOrientation(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final c getViewBinding() {
        return (c) this.c.getValue();
    }

    public final void a(b bVar, a aVar) {
        TextView textView = getViewBinding().c;
        textView.setText(bVar.a);
        textView.setTextColor(e3m.f(bVar.b, textView.getContext()));
        if (epx.f(aVar, a.C1243a.a)) {
            f4m.j(getViewBinding().a);
            f4m.j(getViewBinding().b);
            getViewBinding().b.l0();
            return;
        }
        if (!(aVar instanceof a.c)) {
            if (!epx.f(aVar, a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f4m.j(getViewBinding().a);
            getViewBinding().b.m0();
            getViewBinding().b.setVisibility(0);
            return;
        }
        getViewBinding().a.setVisibility(0);
        f4m.j(getViewBinding().b);
        getViewBinding().b.l0();
        a.c cVar = (a.c) aVar;
        getViewBinding().a.setImageResource(cVar.a);
        getViewBinding().a.setImageTintList(ColorStateList.valueOf(e3m.f(cVar.b, getContext())));
    }

    public final State getState() {
        return this.b;
    }

    public final void setState(State state) {
        this.b = state;
        switch (d.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                a(new b(R.string.video_download_state_network_awaiting, R.attr.vk_ui_text_accent), new a.c(R.drawable.vk_icon_wifi_slash_outline_16, R.attr.vk_ui_icon_accent));
                return;
            case 2:
                a(new b(R.string.video_download_state_wifi_awaiting, R.attr.vk_ui_text_accent), new a.c(R.drawable.vk_icon_wifi_outline_16, R.attr.vk_ui_icon_accent));
                return;
            case 3:
                a(new b(R.string.video_download_state_queued, R.attr.vk_ui_text_accent), new a.c(R.drawable.vk_icon_download_dashed_outline_16, R.attr.vk_ui_icon_accent));
                return;
            case 4:
                a(new b(R.string.video_download_state_in_progress, R.attr.vk_ui_text_accent), fxc0.B().J().p0() ? a.b.a : new a.c(R.drawable.vk_icon_download_outline_16, R.attr.vk_ui_text_accent));
                return;
            case 5:
                a(new b(R.string.video_download_state_paused, R.attr.vk_ui_text_accent), new a.c(R.drawable.vk_icon_pause_16, R.attr.vk_ui_text_accent));
                return;
            case 6:
                a(new b(R.string.video_download_state_error, R.attr.vk_ui_text_negative), a.C1243a.a);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
